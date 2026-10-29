package org.chromium.net;

import android.content.Context;
import android.net.http.HttpEngine;
import android.os.ext.SdkExtensions;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p000.C1077qn;
import p000.c75;
import p000.m36;
import p000.nr0;
import p000.nt5;
import p000.rw5;
import p000.tn5;
import p000.zi4;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class CronetProvider {
    static final int EMBEDDED_CRONET_PROVIDER_SCORE = 5;
    static final int FALLBACK_CRONET_PROVIDER_SCORE = 1;
    private static final String GMS_CORE_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.GmsCoreCronetProvider";
    private static final String HTTPENGINE_PROVIDER_CLASS = "org.chromium.net.impl.HttpEngineNativeProvider";
    private static final String JAVA_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.JavaCronetProvider";
    private static final String NATIVE_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.NativeCronetProvider";
    static final int NOT_PREFERRED_HTTP_ENGINE_PROVIDER_SCORE = 2;
    private static final String PLAY_SERVICES_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.PlayServicesCronetProvider";
    static final int PLAY_SERVICES_CRONET_PROVIDER_SCORE = 3;
    static final int PREFERRED_HTTP_ENGINE_PROVIDER_SCORE = 4;
    static final String PREFERRED_MINIMUM_HTTPENGINE_VERSION_HTTP_FLAG_NAME = "Cronet_PreferredMinimumHttpEngineVersion";
    public static final String PROVIDER_NAME_APP_PACKAGED = "App-Packaged-Cronet-Provider";
    public static final String PROVIDER_NAME_FALLBACK = "Fallback-Cronet-Provider";
    public static final String PROVIDER_NAME_HTTPENGINE_NATIVE = "HttpEngine-Native-Provider";
    static final int RESOURCES_CRONET_PROVIDER_SCORE = 6;
    private static final String RES_KEY_CRONET_IMPL_CLASS = "CronetProviderClassName";
    private static final String TAG = "CronetProvider";
    protected final Context mContext;

    public CronetProvider(Context context) {
        if (context != null) {
            this.mContext = context;
        } else {
            C1077qn.m9987m("Context must not be null");
            throw null;
        }
    }

    private static boolean addCronetProviderFromResourceFile(Context context, nr0 nr0Var, Set<m36> set) {
        String string;
        int identifier = context.getResources().getIdentifier(RES_KEY_CRONET_IMPL_CLASS, "string", context.getPackageName());
        if (identifier == 0 || (string = context.getString(identifier)) == null || string.equals(PLAY_SERVICES_CRONET_PROVIDER_CLASS) || string.equals(GMS_CORE_CRONET_PROVIDER_CLASS) || string.equals(JAVA_CRONET_PROVIDER_CLASS) || string.equals(NATIVE_CRONET_PROVIDER_CLASS) || string.equals(HTTPENGINE_PROVIDER_CLASS)) {
            return false;
        }
        if (addCronetProviderImplByClassName(context, string, 6, nr0Var, set, true)) {
            return true;
        }
        Log.e("cn_".concat(String.valueOf(TAG)), zi4.m13621u("Unable to instantiate Cronet implementation class ", string, " that is listed as in the app string resource file under CronetProviderClassName key"));
        return true;
    }

    private static boolean addCronetProviderImplByClassName(Context context, String str, int i, nr0 nr0Var, Set<m36> set, boolean z) {
        try {
            Constructor constructor = context.getClassLoader().loadClass(str).asSubclass(CronetProvider.class).getConstructor(Context.class);
            m36 m36Var = new m36();
            m36Var.f24624a = (CronetProvider) constructor.newInstance(context);
            m36Var.f24625b = i;
            m36Var.f24626c = nr0Var;
            set.add(m36Var);
            return true;
        } catch (ClassNotFoundException e) {
            logReflectiveOperationException(str, z, e);
            return false;
        } catch (IllegalAccessException e2) {
            logReflectiveOperationException(str, z, e2);
            return false;
        } catch (InstantiationException e3) {
            logReflectiveOperationException(str, z, e3);
            return false;
        } catch (NoSuchMethodException e4) {
            logReflectiveOperationException(str, z, e4);
            return false;
        } catch (InvocationTargetException e5) {
            logReflectiveOperationException(str, z, e5);
            return false;
        }
    }

    private static int calculateHttpEngineNativeProviderScore(Context context) {
        return calculateHttpEngineNativeProviderScoreInternal(context, null);
    }

    public static int calculateHttpEngineNativeProviderScoreInternal(Context context, String str) {
        if (SdkExtensions.getExtensionVersion(31) < 7) {
            return Integer.MIN_VALUE;
        }
        tn5 tn5Var = (tn5) Collections.unmodifiableMap(nt5.m8845a(context).f35372a).get(PREFERRED_MINIMUM_HTTPENGINE_VERSION_HTTP_FLAG_NAME);
        String strM11071b = tn5Var == null ? "133.0.6876.3" : tn5Var.m11071b();
        if (str == null) {
            str = HttpEngine.getVersionString();
        }
        return compareVersions(str, strM11071b) >= 0 ? 4 : 2;
    }

    public static int compareVersions(String str, String str2) {
        if (str == null || str2 == null) {
            C1077qn.m9987m("The input values cannot be null");
            return 0;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        if (strArrSplit.length != strArrSplit2.length) {
            C1077qn.m9987m(c75.m3879k("Version strings must have an equal number of segments for comparison: ", str, " vs ", str2));
            return 0;
        }
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                int i2 = Integer.parseInt(strArrSplit[i]);
                int i3 = Integer.parseInt(strArrSplit2[i]);
                if (i2 != i3) {
                    return Integer.compare(i2, i3);
                }
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(c75.m3879k("Unable to convert version segments into integers: ", strArrSplit[i], " & ", strArrSplit2[i]), e);
            }
        }
        return 0;
    }

    public static List<m36> getAllProviderInfos(Context context) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        addCronetProviderFromResourceFile(context, nr0.CRONET_SOURCE_UNSPECIFIED, linkedHashSet);
        nr0 nr0Var = nr0.CRONET_SOURCE_PLAY_SERVICES;
        addCronetProviderImplByClassName(context, PLAY_SERVICES_CRONET_PROVIDER_CLASS, 3, nr0Var, linkedHashSet, false);
        addCronetProviderImplByClassName(context, GMS_CORE_CRONET_PROVIDER_CLASS, 3, nr0Var, linkedHashSet, false);
        addCronetProviderImplByClassName(context, NATIVE_CRONET_PROVIDER_CLASS, 5, nr0.CRONET_SOURCE_STATICALLY_LINKED, linkedHashSet, false);
        addCronetProviderImplByClassName(context, HTTPENGINE_PROVIDER_CLASS, calculateHttpEngineNativeProviderScore(context), nr0.CRONET_SOURCE_PLATFORM, linkedHashSet, false);
        addCronetProviderImplByClassName(context, JAVA_CRONET_PROVIDER_CLASS, 1, nr0.CRONET_SOURCE_FALLBACK, linkedHashSet, false);
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public static List<CronetProvider> getAllProviders(Context context) {
        ArrayList arrayList = new ArrayList();
        Iterator<m36> it = getAllProviderInfos(context).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f24624a);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void logReflectiveOperationException(String str, boolean z, Exception exc) {
        if (z) {
            Log.e("cn_".concat(String.valueOf(TAG)), "Unable to load provider class: ".concat(String.valueOf(str)), exc);
        } else {
            String str2 = TAG;
            if (Log.isLoggable(str2, 3)) {
                rw5.m10480b(str2, "Tried to load %s provider class but it wasn't included in the app classpath", str);
            }
        }
    }

    public abstract CronetEngine.Builder createBuilder();

    public abstract String getName();

    public abstract String getVersion();

    public abstract boolean isEnabled();

    public String toString() {
        String name = getClass().getName();
        String name2 = getName();
        String version = getVersion();
        boolean zIsEnabled = isEnabled();
        StringBuilder sbM13625y = zi4.m13625y("[class=", name, ", name=", name2, ", version=");
        sbM13625y.append(version);
        sbM13625y.append(", enabled=");
        sbM13625y.append(zIsEnabled);
        sbM13625y.append(']');
        return sbM13625y.toString();
    }
}
