package p000;

import ads_mobile_sdk.td0;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z32 implements bl0, ia0, InterfaceC0961nw, zk3, ce4, he4, ai3, w53, qd4 {

    /* JADX INFO: renamed from: d */
    public static final f70 f35736d = new f70(12);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35737a;

    /* JADX INFO: renamed from: b */
    public Object f35738b;

    /* JADX INFO: renamed from: c */
    public Object f35739c;

    public z32() {
        this.f35737a = (byte) 13;
        z32 z32Var = b61.f15103b;
        jp0 jp0Var = (jp0) z32Var.f35738b;
        jp0 jp0Var2 = new jp0(false);
        jp0Var2.f22481b = Arrays.copyOf((long[]) jp0Var.f22481b, 10);
        jp0Var2.f22482c = Arrays.copyOf((long[]) jp0Var.f22482c, 10);
        jp0Var2.f22483d = Arrays.copyOf((long[]) jp0Var.f22483d, 10);
        VarHandle.storeStoreFence();
        this.f35738b = jp0Var2;
        this.f35739c = Arrays.copyOf((long[]) z32Var.f35739c, 10);
    }

    /* JADX INFO: renamed from: D */
    public static z32 m13299D(lk2 lk2Var) {
        oy4 oy4VarMo2976c = ((py4) lk2Var).mo2976c();
        z32 z32Var = new z32((byte) 19);
        z32Var.f35738b = lk2Var;
        js1 js1Var = new js1(oy4VarMo2976c, nm2.f25944c);
        r90 r90VarM10361a = rl3.m10361a(nm2.class);
        C1283w7 c1283w7 = (C1283w7) js1Var.f22555a;
        String strM10248a = r90VarM10361a.m10248a();
        if (strM10248a == null) {
            C1077qn.m9987m("Local and anonymous classes can not be ViewModels");
            return null;
        }
        z32Var.f35739c = (nm2) c1283w7.m12122I(r90VarM10361a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM10248a));
        VarHandle.storeStoreFence();
        return z32Var;
    }

    /* JADX INFO: renamed from: E */
    public static String m13300E(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveInfoResolveActivity != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = (String) obj;
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static void m13301r(Context context, String str, ms0 ms0Var) {
        ms0Var.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        context.bindService(intent, ms0Var, 33);
    }

    /* JADX INFO: renamed from: t */
    public static String m13302t(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#r8-abstract-class";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [mt2] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [mt2] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [uw2] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [uw2] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX INFO: renamed from: w */
    public static void m13303w(wf2 wf2Var) {
        if (wf2Var.f33309Q > 0) {
            if (wf2Var.f33300H.f14471d == sf2.f30230e && !wf2Var.m12290q() && !wf2Var.m12291r() && !wf2Var.f33310R && wf2Var.m12257K()) {
                mt2 mt2Var = (mt2) wf2Var.f33299G.f25610g;
                if ((mt2Var.f25198d & 256) != 0) {
                    while (mt2Var != null) {
                        if ((mt2Var.f25197c & 256) != 0) {
                            ?? M10644P = mt2Var;
                            ?? uw2Var = 0;
                            while (M10644P != 0) {
                                if (M10644P instanceof ns1) {
                                    ns1 ns1Var = (ns1) M10644P;
                                    ns1Var.mo43B(sc6.m10650V(ns1Var, 256));
                                } else if ((M10644P.f25197c & 256) != 0 && (M10644P instanceof qx0)) {
                                    mt2 mt2Var2 = ((qx0) M10644P).f28863p;
                                    int i = 0;
                                    M10644P = M10644P;
                                    uw2Var = uw2Var;
                                    while (mt2Var2 != null) {
                                        if ((mt2Var2.f25197c & 256) != 0) {
                                            i++;
                                            if (i == 1) {
                                                uw2Var = uw2Var;
                                                M10644P = mt2Var2;
                                            } else {
                                                if (uw2Var == 0) {
                                                    uw2Var = new uw2(new mt2[16]);
                                                }
                                                if (M10644P != 0) {
                                                    uw2Var.m11663b(M10644P);
                                                    M10644P = 0;
                                                }
                                                uw2Var.m11663b(mt2Var2);
                                            }
                                        }
                                        mt2Var2 = mt2Var2.f25200f;
                                        M10644P = M10644P;
                                        uw2Var = uw2Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                M10644P = sc6.m10644P(uw2Var);
                            }
                        }
                        if ((mt2Var.f25198d & 256) == 0) {
                            break;
                        } else {
                            mt2Var = mt2Var.f25200f;
                        }
                    }
                }
            }
            wf2Var.f33308P = false;
            uw2 uw2VarM12248A = wf2Var.m12248A();
            Object[] objArr = uw2VarM12248A.f32211a;
            int i2 = uw2VarM12248A.f32213c;
            for (int i3 = 0; i3 < i2; i3++) {
                m13303w((wf2) objArr[i3]);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static ea1 m13304y(b12 b12Var, Throwable th) {
        Drawable drawable;
        if (th instanceof d23) {
            b12Var.getClass();
            nw0 nw0Var = b12Var.f15021z;
            drawable = nw0Var.f26139l;
            nw0 nw0Var2 = AbstractC0632f.f18620a;
            if (drawable == null) {
                drawable = nw0Var.f26138k;
            }
        } else {
            drawable = b12Var.f15021z.f26138k;
            nw0 nw0Var3 = AbstractC0632f.f18620a;
        }
        ea1 ea1Var = new ea1();
        ea1Var.f17922a = drawable;
        ea1Var.f17923b = b12Var;
        ea1Var.f17924c = th;
        VarHandle.storeStoreFence();
        return ea1Var;
    }

    /* JADX INFO: renamed from: A */
    public ClipboardManager m13305A() {
        ClipboardManager clipboardManager = (ClipboardManager) this.f35739c;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        ClipboardManager clipboardManager2 = (ClipboardManager) ((Context) this.f35738b).getSystemService("clipboard");
        this.f35739c = clipboardManager2;
        return clipboardManager2;
    }

    /* JADX INFO: renamed from: B */
    public File m13306B() {
        if (((File) this.f35738b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f35738b) == null) {
                        String str = "PersistedInstallation." + ((hg1) this.f35739c).m6390d() + ".json";
                        hg1 hg1Var = (hg1) this.f35739c;
                        hg1Var.m6388a();
                        File file = new File(hg1Var.f20545a.getNoBackupFilesDir(), str);
                        this.f35738b = file;
                        if (file.exists()) {
                            return (File) this.f35738b;
                        }
                        hg1 hg1Var2 = (hg1) this.f35739c;
                        hg1Var2.m6388a();
                        File file2 = new File(hg1Var2.f20545a.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.f35738b)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.f35738b;
    }

    /* JADX INFO: renamed from: C */
    public InputMethodManager m13307C() {
        return (InputMethodManager) ((pg2) this.f35739c).getValue();
    }

    /* JADX INFO: renamed from: F */
    public AutofillManager m13308F() {
        AutofillManager autofillManager = (AutofillManager) this.f35739c;
        if (autofillManager != null) {
            return autofillManager;
        }
        AutofillManager autofillManager2 = (AutofillManager) ((Context) this.f35738b).getSystemService(AutofillManager.class);
        if (autofillManager2 != null) {
            this.f35739c = autofillManager2;
            return autofillManager2;
        }
        C1077qn.m9989o("Could not locate AutofillManager from context");
        return null;
    }

    /* JADX INFO: renamed from: G */
    public nh3 m13309G() {
        nh3 nh3Var = (nh3) this.f35739c;
        if (nh3Var == null) {
            nh3Var = new nh3((byte) 10, false);
            Context context = (Context) this.f35738b;
            int iM10690C = se0.m10690C(context, "com.google.firebase.crashlytics.unity_version", "string");
            if (iM10690C != 0) {
                nh3Var.f25810b = "Unity";
                String string = context.getResources().getString(iM10690C);
                nh3Var.f25811c = string;
                ig1.f21399w.m6801p("Unity Editor version is: " + string);
            } else if (context.getAssets() == null) {
                nh3Var.f25810b = null;
                nh3Var.f25811c = null;
            } else {
                try {
                    InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    nh3Var.f25810b = "Flutter";
                    nh3Var.f25811c = null;
                    ig1.f21399w.m6801p("Development platform is: Flutter");
                } catch (IOException unused) {
                    nh3Var.f25810b = null;
                    nh3Var.f25811c = null;
                }
            }
            VarHandle.storeStoreFence();
            this.f35739c = nh3Var;
        }
        return nh3Var;
    }

    /* JADX INFO: renamed from: H */
    public void m13310H(C1084qu c1084qu) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c1084qu.f28794a);
            jSONObject.put("Status", d55.m4376u(c1084qu.f28795b));
            jSONObject.put("AuthToken", c1084qu.f28796c);
            jSONObject.put("RefreshToken", c1084qu.f28797d);
            jSONObject.put("TokenCreationEpochInSecs", c1084qu.f28799f);
            jSONObject.put("ExpiresInSecs", c1084qu.f28798e);
            jSONObject.put("FisError", c1084qu.f28800g);
            hg1 hg1Var = (hg1) this.f35739c;
            hg1Var.m6388a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", hg1Var.f20545a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(m13306B())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: I */
    public jp0 m13311I(td0 td0Var) {
        lz1 lz1Var = (lz1) this.f35738b;
        is0 is0Var = new is0(td0Var);
        try {
            if (!((jz1) lz1Var).m7345E(is0Var)) {
                return null;
            }
            ComponentName componentName = (ComponentName) this.f35739c;
            jp0 jp0Var = new jp0((byte) 15, false);
            jp0Var.f22481b = new Object();
            jp0Var.f22482c = is0Var;
            jp0Var.f22483d = componentName;
            VarHandle.storeStoreFence();
            return jp0Var;
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: J */
    public void m13312J(View view, int i, boolean z) {
        m13308F().notifyViewVisibilityChanged(view, i, z);
    }

    /* JADX INFO: renamed from: K */
    public void m13313K(int i, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            InterfaceC1027pa interfaceC1027pa = "clx".equals(bundle2.getString("_o")) ? (s00) this.f35738b : (ar3) this.f35739c;
            if (interfaceC1027pa == null) {
                return;
            }
            interfaceC1027pa.mo3140h(string, bundle2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX INFO: renamed from: L */
    public b63 m13314L(b12 b12Var, g74 g74Var) {
        List list = b12Var.f15001f;
        Bitmap.Config config = b12Var.f14999d;
        if (list.isEmpty() || AbstractC0990oo.m9195P(config, AbstractC0707h.f20231a)) {
            Bitmap.Config config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                if (config != config2 || b12Var.f15006k) {
                    ((h50) this.f35739c).getClass();
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
            }
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        qs5 qs5Var = g74Var.f19640a;
        pz0 pz0Var = pz0.f28103l;
        return new b63(b12Var.f14996a, config, null, g74Var, (qs5Var.equals(pz0Var) || g74Var.f19641b.equals(pz0Var)) ? qv3.f28833b : b12Var.f15018w, AbstractC0632f.m5437a(b12Var), b12Var.f15007l && b12Var.f15001f.isEmpty() && config != Bitmap.Config.ALPHA_8, b12Var.f15008m, null, b12Var.f15003h, b12Var.f15004i, b12Var.f15019x, b12Var.f15009n, b12Var.f15010o, b12Var.f15011p);
    }

    /* JADX INFO: renamed from: M */
    public C1084qu m13315M() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(m13306B());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = C1084qu.f28793h;
        C1047pu c1047pu = new C1047pu();
        c1047pu.f27987f = 0L;
        byte b = (byte) (c1047pu.f27989h | 2);
        c1047pu.f27983b = 1;
        c1047pu.f27986e = 0L;
        c1047pu.f27989h = (byte) (b | 1);
        c1047pu.f27982a = strOptString;
        int i3 = d55.m4378w(5)[iOptInt];
        if (i3 == 0) {
            xy4.m12782k("Null registrationStatus");
            return null;
        }
        c1047pu.f27983b = i3;
        c1047pu.f27984c = strOptString2;
        c1047pu.f27985d = strOptString3;
        c1047pu.f27987f = jOptLong;
        byte b2 = (byte) (c1047pu.f27989h | 2);
        c1047pu.f27986e = jOptLong2;
        c1047pu.f27989h = (byte) (b2 | 1);
        c1047pu.f27988g = strOptString4;
        return c1047pu.m9676a();
    }

    /* JADX INFO: renamed from: N */
    public void m13316N(String str) {
        ((we1) this.f35739c).mo3000c();
        this.f35739c = f35736d;
        if (str == null) {
            return;
        }
        File fileM6788c = ((if1) this.f35738b).m6788c(str, "userlog");
        aj3 aj3Var = new aj3();
        aj3Var.f14540a = fileM6788c;
        VarHandle.storeStoreFence();
        this.f35739c = aj3Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: O */
    public b63 m13317O(b63 b63Var) {
        boolean z;
        boolean z2;
        Bitmap.Config config = b63Var.f15110b;
        a60 a60Var = b63Var.f15123o;
        if (config == Bitmap.Config.HARDWARE) {
            ((h50) this.f35739c).getClass();
        }
        if (b63Var.f15123o.f127a) {
            fg4 fg4Var = (fg4) this.f35738b;
            synchronized (fg4Var) {
                fg4Var.m5706a();
                z2 = fg4Var.f18968e;
            }
            if (z2) {
                z = false;
            } else {
                a60Var = a60.DISABLED;
                z = true;
            }
        } else {
            z = false;
        }
        return z ? new b63(b63Var.f15109a, config, b63Var.f15111c, b63Var.f15112d, b63Var.f15113e, b63Var.f15114f, b63Var.f15115g, b63Var.f15116h, b63Var.f15117i, b63Var.f15118j, b63Var.f15119k, b63Var.f15120l, b63Var.f15121m, b63Var.f15122n, a60Var) : b63Var;
    }

    /* JADX INFO: renamed from: P */
    public void m13318P(uu2 uu2Var) {
        lw2 lw2Var = (lw2) this.f35738b;
        Object objM8132g = ((lw2) this.f35739c).m8132g(uu2Var);
        if (objM8132g != null) {
            byte b = 19;
            if (!(objM8132g instanceof cw2)) {
                b71 b71Var = new b71(b);
                b71Var.f15141b = uu2Var;
                VarHandle.storeStoreFence();
                ev2.m5406c(lw2Var, (su2) objM8132g, b71Var);
                return;
            }
            cw2 cw2Var = (cw2) objM8132g;
            Object[] objArr = cw2Var.f16532a;
            int i = cw2Var.f16533b;
            for (int i2 = 0; i2 < i; i2++) {
                su2 su2Var = (su2) objArr[i2];
                b71 b71Var2 = new b71(b);
                b71Var2.f15141b = uu2Var;
                VarHandle.storeStoreFence();
                ev2.m5406c(lw2Var, su2Var, b71Var2);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m13319Q(C1264vp c1264vp) {
        HashMap map = (HashMap) this.f35739c;
        if (map == null) {
            map = new HashMap();
            this.f35739c = map;
        }
        map.put(qh3.class, c1264vp);
    }

    @Override // p000.qd4
    /* JADX INFO: renamed from: a */
    public void mo7270a(gs2 gs2Var, Bitmap bitmap, Map map) {
        int i;
        int iM10743x = se0.m10743x(bitmap);
        uk3 uk3Var = (uk3) this.f35739c;
        synchronized (uk3Var.f15480c) {
            i = uk3Var.f15478a;
        }
        uk3 uk3Var2 = (uk3) this.f35739c;
        if (iM10743x > i) {
            uk3Var2.m3650e(gs2Var);
            ((hf0) this.f35738b).m6384r(gs2Var, bitmap, map, iM10743x);
            return;
        }
        tk3 tk3Var = new tk3();
        tk3Var.f31211a = bitmap;
        tk3Var.f31212b = map;
        tk3Var.f31213c = iM10743x;
        VarHandle.storeStoreFence();
        uk3Var2.m3649d(gs2Var, tk3Var);
    }

    @Override // p000.ce4
    public de4 apply() {
        return ((jg2) this.f35738b).m7093f(this.f35739c);
    }

    @Override // p000.he4
    /* JADX INFO: renamed from: b */
    public void mo5959b(ge4 ge4Var) {
        yv2 yv2Var = (yv2) this.f35739c;
        yv2Var.m13257a();
        dw2 dw2Var = (dw2) ge4Var.f19758b;
        Object[] objArr = dw2Var.f17456b;
        long[] jArr = dw2Var.f17457c;
        int i = dw2Var.f17459e;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objM7970b = ((lh2) this.f35738b).m7970b(obj);
            int iM13260d = yv2Var.m13260d(objM7970b);
            int i3 = iM13260d >= 0 ? yv2Var.f35549c[iM13260d] : 0;
            if (i3 == 7) {
                ge4Var.remove(obj);
            } else {
                yv2Var.m13263g(i3 + 1, objM7970b);
            }
            i = i2;
        }
    }

    @Override // p000.InterfaceC0961nw
    /* JADX INFO: renamed from: c */
    public Object mo8865c(of4 of4Var) {
        Object objInvoke = ((mq1) this.f35738b).invoke(new C1049pw((C1197tw) this.f35739c, null, (byte) 0), of4Var);
        return objInvoke == ap0.f14763a ? objInvoke : ju4.f22634a;
    }

    @Override // p000.w53
    /* JADX INFO: renamed from: d */
    public List mo12110d(Integer num) {
        List listMo12110d = ((w53) this.f35738b).mo12110d(null);
        p84 p84Var = (p84) this.f35739c;
        int i = p84Var.f27454v;
        return i < 0 ? listMo12110d : hb0.m6310V0(ev0.m5341P(p84Var, num, i, Integer.valueOf(p84Var.m9395F(p84Var.f27434b, i))), listMo12110d);
    }

    @Override // p000.InterfaceC0961nw
    /* JADX INFO: renamed from: e */
    public Object mo8866e(of4 of4Var) {
        Object objInvoke = ((mq1) this.f35738b).invoke(new C1049pw((C1197tw) this.f35739c, null, (byte) 1), of4Var);
        return objInvoke == ap0.f14763a ? objInvoke : ju4.f22634a;
    }

    @Override // p000.zk3
    /* JADX INFO: renamed from: f */
    public m72 mo13320f(yk3 yk3Var, Object obj) {
        m72 m72VarMo13320f;
        zi0 zi0Var = (zi0) this.f35738b;
        if (zi0Var == null) {
            zi0Var = null;
        }
        if (zi0Var == null || (m72VarMo13320f = zi0Var.mo13320f(yk3Var, obj)) == null) {
            m72VarMo13320f = m72.f24705a;
        }
        if (m72VarMo13320f != m72.f24705a) {
            return m72VarMo13320f;
        }
        uu2 uu2Var = (uu2) this.f35739c;
        uu2Var.f32184f = hb0.m6311W0(uu2Var.f32184f, new l73(yk3Var, obj));
        return m72.f24706b;
    }

    @Override // p000.ai3
    public Object get() {
        Context context = (Context) ((w42) this.f35738b).f33090b;
        jp0 jp0Var = (jp0) ((js1) this.f35739c).get();
        nh3 nh3Var = new nh3((byte) 21, false);
        nh3Var.f25811c = null;
        nh3Var.f25810b = context;
        VarHandle.storeStoreFence();
        vs2 vs2Var = new vs2();
        vs2Var.f32832c = new HashMap();
        vs2Var.f32830a = nh3Var;
        vs2Var.f32831b = jp0Var;
        VarHandle.storeStoreFence();
        return vs2Var;
    }

    @Override // p000.qd4
    /* JADX INFO: renamed from: h */
    public hs2 mo7274h(gs2 gs2Var) {
        tk3 tk3Var = (tk3) ((uk3) this.f35739c).m3648c(gs2Var);
        if (tk3Var != null) {
            return new hs2(tk3Var.f31211a, tk3Var.f31212b);
        }
        return null;
    }

    @Override // p000.w53
    /* JADX INFO: renamed from: i */
    public boolean mo12111i() {
        return ((w53) this.f35738b).mo12111i();
    }

    @Override // p000.qd4
    /* JADX INFO: renamed from: j */
    public void mo7276j(int i) {
        int i2;
        if (i >= 40) {
            ((uk3) this.f35739c).m3653h(-1);
            return;
        }
        if (10 > i || i >= 20) {
            return;
        }
        uk3 uk3Var = (uk3) this.f35739c;
        synchronized (uk3Var.f15480c) {
            i2 = uk3Var.f15481d;
        }
        uk3Var.m3653h(i2 / 2);
    }

    @Override // p000.bl0
    /* JADX INFO: renamed from: l */
    public void mo3614l(C0641f8 c0641f8) {
        xn2 xn2Var = (xn2) this.f35738b;
        if (xn2Var != null) {
            String strM12721a = xn2Var.m12721a();
            k44 k44Var = k44.f22883b;
            if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                xn2Var.m12722b(k44Var, strM12721a, zi4.m13620t("consent info update failed ", c0641f8.f18827b), null);
            }
        }
        ((b70) this.f35739c).resumeWith(Boolean.FALSE);
    }

    @Override // p000.ce4
    /* JADX INFO: renamed from: m */
    public boolean mo3992m() {
        return true;
    }

    @Override // p000.he4
    /* JADX INFO: renamed from: n */
    public boolean mo5965n(Object obj, Object obj2) {
        lh2 lh2Var = (lh2) this.f35738b;
        return z62.m13387o(lh2Var.m7970b(obj), lh2Var.m7970b(obj2));
    }

    @Override // p000.ce4
    /* JADX INFO: renamed from: o */
    public boolean mo3993o(C1163sz c1163sz) {
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m13323p(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.f35738b).add(c75.m3881m(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    /* JADX INFO: renamed from: q */
    public void m13324q(Object obj, float f) {
        ArrayList arrayList = (ArrayList) this.f35738b;
        arrayList.add(obj);
        if (((float[]) this.f35739c).length < arrayList.size()) {
            this.f35739c = Arrays.copyOf((float[]) this.f35739c, arrayList.size() + 2);
        }
        ((float[]) this.f35739c)[arrayList.size() - 1] = f;
    }

    /* JADX INFO: renamed from: s */
    public pe1 m13325s() {
        return new pe1((String) this.f35738b, ((HashMap) this.f35739c) == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap((HashMap) this.f35739c)));
    }

    public String toString() {
        int iLastIndexOf;
        switch (this.f35737a) {
            case 7:
                return ((Map) this.f35738b).toString();
            case 19:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                lk2 lk2Var = (lk2) this.f35738b;
                if (lk2Var == null) {
                    sb.append("null");
                } else {
                    String simpleName = lk2Var.getClass().getSimpleName();
                    if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = lk2Var.getClass().getName()).lastIndexOf(46)) > 0) {
                        simpleName = simpleName.substring(iLastIndexOf + 1);
                    }
                    sb.append(simpleName);
                    sb.append('{');
                    sb.append(Integer.toHexString(System.identityHashCode(lk2Var)));
                }
                sb.append("}}");
                return sb.toString();
            case 21:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f35738b);
                sb2.append('{');
                nh3 nh3Var = (nh3) ((nh3) this.f35739c).f25811c;
                String str = "";
                while (nh3Var != null) {
                    Object obj = nh3Var.f25810b;
                    sb2.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    nh3Var = (nh3) nh3Var.f25811c;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 23:
                StringBuilder sb3 = new StringBuilder(100);
                sb3.append(this.f35739c.getClass().getSimpleName());
                sb3.append('{');
                ArrayList arrayList = (ArrayList) this.f35738b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    sb3.append((String) arrayList.get(i));
                    if (i < size - 1) {
                        sb3.append(", ");
                    }
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m13326u() {
        String str = (String) this.f35738b;
        try {
            if1 if1Var = (if1) this.f35739c;
            if1Var.getClass();
            new File((File) if1Var.f21326c, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public void m13327v() {
        Object[] objArr;
        uw2 uw2Var = (uw2) this.f35738b;
        Arrays.sort(uw2Var.f32211a, 0, uw2Var.f32213c, vl1.f32717d);
        int i = uw2Var.f32213c;
        wf2[] wf2VarArr = (wf2[]) this.f35739c;
        if (wf2VarArr == null || wf2VarArr.length < i) {
            objArr = wf2VarArr;
            objArr = new wf2[Math.max(16, i)];
        }
        objArr = wf2VarArr;
        this.f35739c = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = uw2Var.f32211a[i2];
        }
        uw2Var.m11668g();
        while (true) {
            i--;
            if (-1 >= i) {
                this.f35739c = objArr;
                return;
            }
            wf2 wf2Var = objArr[i];
            if (wf2Var.f33308P) {
                m13303w(wf2Var);
            }
            objArr[i] = 0;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m13328x(String str, PrintWriter printWriter) {
        ra4 ra4Var = ((nm2) this.f35739c).f25945b;
        if (ra4Var.f29121c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (ra4Var.f29121c <= 0) {
                return;
            }
            if (ra4Var.m10257d(0) != null) {
                xy4.m12778e();
                return;
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(ra4Var.m10255b(0));
            printWriter.print(": ");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x011a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0122  */
    /* JADX WARN: Code duplicated, block: B:59:0x012a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0132  */
    /* JADX WARN: Code duplicated, block: B:62:0x013a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0142  */
    /* JADX WARN: Code duplicated, block: B:65:0x014a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0152  */
    /* JADX INFO: renamed from: z */
    public l23 m13329z(cs4 cs4Var, boolean z) {
        sl0 sl0Var;
        String str;
        l23 l23Var;
        rl0 rl0Var;
        Type type = cs4Var.f16430b;
        Class cls = cs4Var.f16429a;
        Map map = (Map) this.f35738b;
        C1077qn c1077qn = null;
        if (map.get(type) != null) {
            xy4.m12778e();
            return null;
        }
        if (map.get(cls) != null) {
            xy4.m12778e();
            return null;
        }
        byte b = 1;
        byte b2 = 0;
        if (EnumSet.class.isAssignableFrom(cls)) {
            sl0Var = new sl0(b2);
            sl0Var.f30365b = type;
            VarHandle.storeStoreFence();
        } else if (cls == EnumMap.class) {
            sl0Var = new sl0(b);
            sl0Var.f30365b = type;
            VarHandle.storeStoreFence();
        } else {
            sl0Var = null;
        }
        if (sl0Var != null) {
            return sl0Var;
        }
        AbstractC1356y5.m12930x((List) this.f35739c);
        if (Modifier.isAbstract(cls.getModifiers())) {
            l23Var = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                c20 c20Var = vl3.f32723a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e) {
                    str = "Failed making constructor '" + vl3.m11926b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + vl3.m11929e(e);
                }
                if (str != null) {
                    rl0Var = new rl0(b2);
                    rl0Var.f29389b = str;
                    VarHandle.storeStoreFence();
                } else {
                    C1040pn c1040pn = new C1040pn((byte) 4);
                    c1040pn.f27754b = declaredConstructor;
                    VarHandle.storeStoreFence();
                    l23Var = c1040pn;
                }
            } catch (NoSuchMethodException unused) {
                l23Var = null;
            }
        }
        if (l23Var != null) {
            l23Var = rl0Var;
            return l23Var;
        }
        l23Var = rl0Var;
        if (Collection.class.isAssignableFrom(cls)) {
            if (cls.isAssignableFrom(ArrayList.class)) {
                c1077qn = new C1077qn((byte) 26);
            } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
                c1077qn = new C1077qn((byte) 27);
            } else if (cls.isAssignableFrom(TreeSet.class)) {
                c1077qn = new C1077qn((byte) 28);
            } else if (cls.isAssignableFrom(ArrayDeque.class)) {
                c1077qn = new C1077qn((byte) 29);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (cls.isAssignableFrom(pl2.class)) {
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    if (actualTypeArguments.length == 0 || qs5.m10080E(actualTypeArguments[0]) != String.class) {
                        if (cls.isAssignableFrom(LinkedHashMap.class)) {
                            c1077qn = new C1077qn((byte) 22);
                        } else if (cls.isAssignableFrom(TreeMap.class)) {
                            c1077qn = new C1077qn((byte) 23);
                        } else if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
                            c1077qn = new C1077qn((byte) 24);
                        } else if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
                            c1077qn = new C1077qn((byte) 25);
                        }
                    }
                }
                c1077qn = new C1077qn((byte) 21);
            } else if (cls.isAssignableFrom(LinkedHashMap.class)) {
                c1077qn = new C1077qn((byte) 22);
            } else if (cls.isAssignableFrom(TreeMap.class)) {
                c1077qn = new C1077qn((byte) 23);
            } else if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
                c1077qn = new C1077qn((byte) 24);
            } else if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
                c1077qn = new C1077qn((byte) 25);
            }
        }
        if (c1077qn != null) {
            return c1077qn;
        }
        String strM13302t = m13302t(cls);
        if (strM13302t != null) {
            rl0 rl0Var2 = new rl0(b);
            rl0Var2.f29389b = strM13302t;
            VarHandle.storeStoreFence();
            return rl0Var2;
        }
        if (z) {
            C1040pn c1040pn2 = new C1040pn((byte) 5);
            c1040pn2.f27754b = cls;
            VarHandle.storeStoreFence();
            return c1040pn2;
        }
        String str2 = "Unable to create instance of " + cls + "; Register an InstanceCreator or a TypeAdapter for this type.";
        rl0 rl0Var3 = new rl0((byte) 2);
        rl0Var3.f29389b = str2;
        VarHandle.storeStoreFence();
        return rl0Var3;
    }

    public /* synthetic */ z32(Object obj, Object obj2, byte b) {
        this.f35737a = b;
        this.f35738b = obj;
        this.f35739c = obj2;
    }

    public z32(if1 if1Var) {
        this.f35737a = (byte) 1;
        this.f35738b = if1Var;
        this.f35739c = f35736d;
    }

    public /* synthetic */ z32(byte b) {
        this.f35737a = b;
    }

    @Override // p000.zk3
    /* JADX INFO: renamed from: k */
    public void mo13322k(Object obj) {
    }

    @Override // p000.ce4, p000.d70
    public void cancel() {
    }

    @Override // p000.zk3
    /* JADX INFO: renamed from: g */
    public void mo13321g() {
    }
}
