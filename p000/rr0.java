package p000;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class rr0 {

    /* JADX INFO: renamed from: a */
    public static final qt1 f29544a = qt1.f28785b;

    /* JADX INFO: renamed from: b */
    public static final Object f29545b = new Object();

    /* JADX INFO: renamed from: c */
    public static e51 f29546c = null;

    /* JADX INFO: renamed from: d */
    public static String f29547d = "0";

    /* JADX INFO: renamed from: a */
    public static void m10414a(Context context) {
        e51 e51Var;
        Object obj = f29545b;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    e51Var = f29546c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (e51Var != null) {
            return;
        }
        y42.m12855b0(context, "Context must not be null");
        ClassLoader classLoader = rr0.class.getClassLoader();
        y42.m12854a0(classLoader);
        try {
            classLoader.loadClass("org.chromium.net.CronetEngine");
            int apiLevel = ApiVersion.getApiLevel();
            qt1 qt1Var = f29544a;
            qt1Var.getClass();
            yt1.m13235a(context);
            try {
                e51 e51VarM4927c = e51.m4927c(context, e51.f17692b, "com.google.android.gms.cronet_dynamite");
                try {
                    Class<?> clsLoadClass = e51VarM4927c.f17706a.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                    if (clsLoadClass.getClassLoader() == rr0.class.getClassLoader()) {
                        Log.e("rr0", "ImplVersion class is missing from Cronet module.");
                        throw new wt1();
                    }
                    Method method = clsLoadClass.getMethod("getApiLevel", null);
                    Method method2 = clsLoadClass.getMethod("getCronetVersion", null);
                    Integer num = (Integer) method.invoke(null, null);
                    y42.m12854a0(num);
                    int iIntValue = num.intValue();
                    String str = (String) method2.invoke(null, null);
                    y42.m12854a0(str);
                    f29547d = str;
                    if (apiLevel <= iIntValue) {
                        f29546c = e51VarM4927c;
                        return;
                    }
                    if (qt1Var.mo9664a(context, 2, "cr") == null) {
                        Log.e("rr0", "Unable to fetch error resolution intent");
                        throw new wt1();
                    }
                    String str2 = f29547d;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 174);
                    sb.append("Google Play Services update is required. The API Level of the client is ");
                    sb.append(apiLevel);
                    sb.append(". The API Level of the implementation is ");
                    sb.append(iIntValue);
                    sb.append(". The Cronet implementation version is ");
                    sb.append(str2);
                    throw new xt1(sb.toString());
                } catch (Exception e) {
                    Log.e("rr0", "Unable to read Cronet version from the Cronet module ", e);
                    throw ((wt1) new wt1().initCause(e));
                }
            } catch (a51 e2) {
                Log.e("rr0", "Unable to load Cronet module", e2);
                throw ((wt1) new wt1().initCause(e2));
            }
        } catch (ClassNotFoundException e3) {
            Log.e("rr0", "Cronet API is not available. Have you included all required dependencies?");
            throw ((wt1) new wt1().initCause(e3));
        }
    }
}
