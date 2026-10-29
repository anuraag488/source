package p000;

import ads_mobile_sdk.C0310ra;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: pn */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1040pn implements InterfaceC1262vn, le4, l23, n60, gx0, gg0, xm0, InterfaceC1355y4, nt3, cg4, ye4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f27753a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f27754b;

    public /* synthetic */ C1040pn(byte b) {
        this.f27753a = b;
    }

    @Override // p000.ye4
    /* JADX INFO: renamed from: a */
    public ze4 mo9571a(xe4 xe4Var) {
        Context context = (Context) this.f27754b;
        String str = xe4Var.f34207b;
        hf0 hf0Var = xe4Var.f34208c;
        if (str == null || str.length() == 0) {
            C1077qn.m9987m("Must set a non-null database name to a configuration that uses the no backup directory.");
            return null;
        }
        zo1 zo1Var = new zo1();
        zo1Var.f36213a = context;
        zo1Var.f36214b = str;
        zo1Var.f36215c = hf0Var;
        zo1Var.f36216d = true;
        zo1Var.f36217e = true;
        C1053q c1053q = new C1053q((byte) 28);
        c1053q.f28113b = zo1Var;
        VarHandle.storeStoreFence();
        zo1Var.f36218f = new dg4(c1053q);
        VarHandle.storeStoreFence();
        return zo1Var;
    }

    @Override // p000.nt3
    public Object apply(Object obj) {
        HashMap map = (HashMap) this.f27754b;
        Cursor cursor = (Cursor) obj;
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j), hashSet);
            }
            String string = cursor.getString(1);
            String string2 = cursor.getString(2);
            ot3 ot3Var = new ot3();
            ot3Var.f27090a = string;
            ot3Var.f27091b = string2;
            VarHandle.storeStoreFence();
            hashSet.add(ot3Var);
        }
        return null;
    }

    @Override // p000.InterfaceC1355y4
    /* JADX INFO: renamed from: b */
    public void mo7271b(Object obj) {
        yp1 yp1Var = (yp1) this.f27754b;
        ep3 ep3Var = new ep3();
        ep3Var.f18355a = (C1318x4) obj;
        VarHandle.storeStoreFence();
        yp1Var.invoke(ep3Var);
    }

    @Override // p000.gx0
    /* JADX INFO: renamed from: c */
    public void mo6188c(bi3 bi3Var) {
        byte b = this.f27753a;
        Object obj = this.f27754b;
        switch (b) {
            case 7:
                sp0 sp0Var = (sp0) obj;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                }
                sp0Var.f30458b.set((sp0) bi3Var.get());
                break;
            default:
                tp0 tp0Var = (tp0) obj;
                C1283w7 c1283w7 = ((vm3) ((ah1) bi3Var.get())).m11935a().f33364i;
                ((Set) c1283w7.f33126b).add(tp0Var);
                nr6 nr6VarM11571b = ((uj0) c1283w7.f33127c).m11571b();
                Executor executor = (Executor) c1283w7.f33129e;
                ck0 ck0Var = new ck0((byte) 5);
                ck0Var.f16074b = c1283w7;
                ck0Var.f16075c = nr6VarM11571b;
                ck0Var.f16076d = tp0Var;
                VarHandle.storeStoreFence();
                nr6VarM11571b.m8820d(executor, ck0Var);
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", null);
                }
                break;
        }
    }

    @Override // p000.cg4
    /* JADX INFO: renamed from: d */
    public Object mo4024d() {
        byte b = this.f27753a;
        Object obj = this.f27754b;
        switch (b) {
            case 18:
                pt3 pt3Var = (pt3) ((wo5) obj).f33574i;
                SQLiteDatabase sQLiteDatabaseM9671a = pt3Var.m9671a();
                sQLiteDatabaseM9671a.beginTransaction();
                try {
                    sQLiteDatabaseM9671a.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseM9671a.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + pt3Var.f27973b.mo5609j()).execute();
                    sQLiteDatabaseM9671a.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseM9671a.endTransaction();
                }
            default:
                C1283w7 c1283w7 = (C1283w7) obj;
                Iterator it = ((Iterable) ((pt3) c1283w7.f33128d).m9672e(new ds3((byte) 11))).iterator();
                while (it.hasNext()) {
                    ((jp0) c1283w7.f33129e).m7224N((C0588dv) it.next(), 1, false);
                }
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0639  */
    @Override // p000.gg0
    /* JADX INFO: renamed from: e */
    public Object mo3007e(C0602e8 c0602e8) {
        String string;
        Boolean boolValueOf;
        q02 q02Var;
        Throwable th;
        ig1 ig1Var;
        nr6 nr6Var;
        nr6 nr6VarM8827k;
        boolean z;
        NetworkInfo activeNetworkInfo;
        Resources resources;
        c44 c44VarM13166d;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        ig1 ig1Var2 = ig1.f21399w;
        CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.f27754b;
        int i = CrashlyticsRegistrar.f16307d;
        ig1 ig1Var3 = ig1.f21399w;
        long jCurrentTimeMillis = System.currentTimeMillis();
        hg1 hg1Var = (hg1) c0602e8.mo4017a(hg1.class);
        sg1 sg1Var = (sg1) c0602e8.mo4017a(sg1.class);
        z53 z53VarM4952o = c0602e8.m4952o(sp0.class);
        z53 z53VarM4952o2 = c0602e8.m4952o(InterfaceC0828ka.class);
        z53 z53VarM4952o3 = c0602e8.m4952o(ah1.class);
        ExecutorService executorService = (ExecutorService) c0602e8.mo4023g(crashlyticsRegistrar.f16308a);
        ExecutorService executorService2 = (ExecutorService) c0602e8.mo4023g(crashlyticsRegistrar.f16309b);
        Executor executor = (ExecutorService) c0602e8.mo4023g(crashlyticsRegistrar.f16310c);
        hg1Var.m6388a();
        Context context = hg1Var.f20545a;
        String packageName = context.getPackageName();
        ig1Var3.m6800o("Initializing Firebase Crashlytics 19.4.4 for " + packageName);
        jp0 jp0Var = new jp0((byte) 1, false);
        jp0Var.f22481b = new yq0(executorService);
        jp0Var.f22482c = new yq0(executorService);
        y62.m12936B(null);
        jp0Var.f22483d = new yq0(executorService2);
        VarHandle.storeStoreFence();
        if1 if1Var = new if1();
        String str = ((C0958nt) ia5.f21227r.m6715h(context)).f26072a;
        if1Var.f21324a = str;
        File filesDir = context.getFilesDir();
        if1Var.f21325b = filesDir;
        if (str.isEmpty()) {
            string = ".com.google.firebase.crashlytics.files.v1";
        } else {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            sb.append(str.length() > 40 ? se0.m10711Z(str) : str.replaceAll("[^a-zA-Z0-9.]", "_"));
            string = sb.toString();
        }
        File file = new File(filesDir, string);
        if1.m6783d(file);
        if1Var.f21326c = file;
        File file2 = new File(file, "open-sessions");
        if1.m6783d(file2);
        if1Var.f21327d = file2;
        File file3 = new File(file, "reports");
        if1.m6783d(file3);
        if1Var.f21328e = file3;
        File file4 = new File(file, "priority-reports");
        if1.m6783d(file4);
        if1Var.f21329f = file4;
        File file5 = new File(file, "native-reports");
        if1.m6783d(file5);
        if1Var.f21330g = file5;
        VarHandle.storeStoreFence();
        bt0 bt0Var = new bt0();
        bt0Var.f15566c = new Object();
        bt0Var.f15567d = new li4();
        bt0Var.f15564a = false;
        bt0Var.f15568e = new li4();
        hg1Var.m6388a();
        Context context2 = hg1Var.f20545a;
        bt0Var.f15565b = hg1Var;
        SharedPreferences sharedPreferences = context2.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            bt0Var.f15564a = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                PackageManager packageManager = context2.getPackageManager();
                boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context2.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e);
            }
            if (boolValueOf2 == null) {
                bt0Var.f15564a = false;
                boolValueOf3 = null;
            } else {
                bt0Var.f15564a = true;
                boolValueOf3 = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
            boolValueOf = boolValueOf3;
        }
        bt0Var.f15569f = boolValueOf;
        synchronized (bt0Var.f15566c) {
            try {
                if (bt0Var.m3668a()) {
                    ((li4) bt0Var.f15567d).m7990c(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        VarHandle.storeStoreFence();
        q02 q02Var2 = new q02();
        if (packageName == null) {
            C1077qn.m9987m("appIdentifier must not be null");
            return null;
        }
        q02Var2.f28121b = context;
        q02Var2.f28122c = packageName;
        q02Var2.f28123d = sg1Var;
        q02Var2.f28124e = bt0Var;
        q02Var2.f28120a = new C0973o7((byte) 12);
        VarHandle.storeStoreFence();
        sp0 sp0Var = new sp0();
        sp0Var.f30458b = new AtomicReference(null);
        sp0Var.f30457a = z53VarM4952o;
        C1040pn c1040pn = new C1040pn((byte) 7);
        c1040pn.f27754b = sp0Var;
        VarHandle.storeStoreFence();
        z53VarM4952o.m13340a(c1040pn);
        VarHandle.storeStoreFence();
        yz0 yz0Var = new yz0();
        r50 r50Var = new r50((byte) 21);
        C0939na c0939na = new C0939na();
        c0939na.f25592b = yz0Var;
        c0939na.f25593c = new ArrayList();
        c0939na.f25591a = r50Var;
        C0902ma c0902ma = new C0902ma();
        c0902ma.f24777a = c0939na;
        VarHandle.storeStoreFence();
        z53VarM4952o2.m13340a(c0902ma);
        VarHandle.storeStoreFence();
        kp0 kp0Var = new kp0();
        kp0Var.f23307a = bt0Var;
        jp0 jp0Var2 = new jp0((byte) 0, (boolean) (0 == true ? 1 : 0));
        jp0Var2.f22482c = null;
        jp0Var2.f22483d = null;
        jp0Var2.f22481b = if1Var;
        VarHandle.storeStoreFence();
        kp0Var.f23308b = jp0Var2;
        VarHandle.storeStoreFence();
        o34 o34Var = o34.f26315a;
        lh1 lh1Var = lh1.f24030a;
        jh1 jh1VarM7967a = lh1.m7967a(o34Var);
        if (jh1VarM7967a.f22271b != null) {
            Log.d("SessionsDependencies", "Subscriber " + o34Var + " already registered.");
        } else {
            jh1VarM7967a.f22271b = kp0Var;
            Log.d("SessionsDependencies", "Subscriber " + o34Var + " registered.");
            jh1VarM7967a.f22270a.m6193g(null);
        }
        wd3 wd3Var = new wd3((byte) 3);
        wd3Var.f33259b = z53VarM4952o3;
        VarHandle.storeStoreFence();
        C0902ma c0902ma2 = new C0902ma();
        c0902ma2.f24777a = c0939na;
        VarHandle.storeStoreFence();
        C0902ma c0902ma3 = new C0902ma();
        c0902ma3.f24777a = c0939na;
        VarHandle.storeStoreFence();
        rp0 rp0Var = new rp0();
        rp0Var.f29496b = bt0Var;
        hg1Var.m6388a();
        rp0Var.f29495a = hg1Var.f20545a;
        rp0Var.f29502h = q02Var2;
        rp0Var.f29507m = sp0Var;
        rp0Var.f29504j = c0902ma2;
        rp0Var.f29505k = c0902ma3;
        rp0Var.f29503i = if1Var;
        rp0Var.f29506l = kp0Var;
        rp0Var.f29508n = wd3Var;
        rp0Var.f29509o = jp0Var;
        rp0Var.f29498d = System.currentTimeMillis();
        nh3 nh3Var = new nh3((byte) 25, false);
        nh3Var.f25810b = new AtomicInteger();
        nh3Var.f25811c = new AtomicInteger();
        VarHandle.storeStoreFence();
        rp0Var.f29497c = nh3Var;
        VarHandle.storeStoreFence();
        hg1Var.m6388a();
        String str2 = hg1Var.f20547c.f31843b;
        int iM10690C = se0.m10690C(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iM10690C == 0) {
            iM10690C = se0.m10690C(context, "com.crashlytics.android.build_id", "string");
        }
        String string2 = iM10690C != 0 ? context.getResources().getString(iM10690C) : null;
        ArrayList arrayList = new ArrayList();
        int iM10690C2 = se0.m10690C(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iM10690C3 = se0.m10690C(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iM10690C4 = se0.m10690C(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (iM10690C2 == 0 || iM10690C3 == 0 || iM10690C4 == 0) {
            q02Var = q02Var2;
            th = null;
            ig1Var3.m6798m(String.format("Could not find resources: %d %d %d", Integer.valueOf(iM10690C2), Integer.valueOf(iM10690C3), Integer.valueOf(iM10690C4)), null);
        } else {
            String[] stringArray = context.getResources().getStringArray(iM10690C2);
            String[] stringArray2 = context.getResources().getStringArray(iM10690C3);
            String[] stringArray3 = context.getResources().getStringArray(iM10690C4);
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                int i2 = 0;
                while (i2 < stringArray3.length) {
                    String str3 = stringArray[i2];
                    String str4 = stringArray2[i2];
                    q02 q02Var3 = q02Var2;
                    String str5 = stringArray3[i2];
                    p40 p40Var = new p40();
                    p40Var.f27347a = str3;
                    p40Var.f27348b = str4;
                    p40Var.f27349c = str5;
                    VarHandle.storeStoreFence();
                    arrayList.add(p40Var);
                    i2++;
                    q02Var2 = q02Var3;
                }
                q02Var = q02Var2;
                th = null;
            } else {
                q02Var = q02Var2;
                th = null;
                ig1Var3.m6798m(String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)), null);
            }
        }
        String strM13620t = zi4.m13620t("Mapping file ID is: ", string2);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strM13620t, th);
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            p40 p40Var2 = (p40) obj;
            String str6 = p40Var2.f27347a;
            String str7 = p40Var2.f27348b;
            String str8 = p40Var2.f27349c;
            StringBuilder sbM13625y = zi4.m13625y("Build id for ", str6, " on ", str7, ": ");
            sbM13625y.append(str8);
            String string3 = sbM13625y.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", string3, null);
            }
        }
        byte b = 11;
        z32 z32Var = new z32(b);
        z32Var.f35738b = context;
        z32Var.f35739c = null;
        VarHandle.storeStoreFence();
        q02 q02Var4 = q02Var;
        try {
            C1372yl c1372ylM13157c = C1372yl.m13157c(context, q02Var4, str2, string2, arrayList, z32Var);
            String str9 = "Installer package name is: " + ((String) c1372ylM13157c.f35306c);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str9, null);
            }
            String str10 = (String) c1372ylM13157c.f35308e;
            String str11 = (String) c1372ylM13157c.f35309f;
            String strM9696d = q02Var4.m9696d();
            q50 q50Var = new q50((byte) 20);
            wd3 wd3Var2 = new wd3((byte) 9);
            wd3Var2.f33259b = q50Var;
            VarHandle.storeStoreFence();
            ar3 ar3Var = new ar3(b);
            ar3Var.f14813b = new File((File) if1Var.f21326c, "com.crashlytics.settings.json");
            VarHandle.storeStoreFence();
            Locale locale = Locale.US;
            String strM13621u = zi4.m13621u("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str2, "/settings");
            C0973o7 c0973o7 = new C0973o7((byte) 11);
            c0973o7.f26402b = strM13621u;
            VarHandle.storeStoreFence();
            String str12 = Build.MANUFACTURER;
            String str13 = q02.f28119h;
            String str14 = str12.replaceAll(str13, "") + "/" + Build.MODEL.replaceAll(str13, "");
            String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str13, "");
            String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str13, "");
            int iM10690C5 = se0.m10690C(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
            if (iM10690C5 == 0) {
                iM10690C5 = se0.m10690C(context, "com.crashlytics.android.build_id", "string");
            }
            String[] strArr = {iM10690C5 != 0 ? context.getResources().getString(iM10690C5) : null, str2, str11, str10};
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (i4 < 4) {
                String str15 = strArr[i4];
                if (str15 != null) {
                    arrayList2.add(str15.replace("-", "").toLowerCase(Locale.US));
                }
                i4++;
                bt0Var = bt0Var;
            }
            bt0 bt0Var2 = bt0Var;
            Collections.sort(arrayList2);
            StringBuilder sb2 = new StringBuilder();
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                sb2.append((String) arrayList2.get(i5));
            }
            String string4 = sb2.toString();
            String strM10711Z = string4.length() > 0 ? se0.m10711Z(string4) : null;
            byte bM4360e = d55.m4360e(strM9696d != null ? 4 : 1);
            j44 j44Var = new j44();
            j44Var.f22005a = str2;
            j44Var.f22006b = str14;
            j44Var.f22007c = strReplaceAll;
            j44Var.f22008d = strReplaceAll2;
            j44Var.f22009e = q02Var4;
            j44Var.f22010f = strM10711Z;
            j44Var.f22011g = str11;
            j44Var.f22012h = str10;
            j44Var.f22013i = bM4360e;
            VarHandle.storeStoreFence();
            C1372yl c1372yl = new C1372yl();
            AtomicReference atomicReference = new AtomicReference();
            c1372yl.f35310g = atomicReference;
            AtomicReference atomicReference2 = new AtomicReference(new li4());
            c1372yl.f35311h = atomicReference2;
            c1372yl.f35304a = context;
            c1372yl.f35305b = j44Var;
            c1372yl.f35307d = q50Var;
            c1372yl.f35306c = wd3Var2;
            c1372yl.f35308e = ar3Var;
            c1372yl.f35309f = c0973o7;
            atomicReference.set(f70.m5597s(q50Var));
            VarHandle.storeStoreFence();
            if (!context.getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(strM10711Z) || (c44VarM13166d = c1372yl.m13166d(1)) == null) {
                c44 c44VarM13166d2 = c1372yl.m13166d(3);
                if (c44VarM13166d2 != null) {
                    atomicReference.set(c44VarM13166d2);
                    ((li4) atomicReference2.get()).m7990c(c44VarM13166d2);
                }
                nr6 nr6Var2 = ((li4) bt0Var2.f15568e).f24059a;
                synchronized (bt0Var2.f15566c) {
                    nr6Var = ((li4) bt0Var2.f15567d).f24059a;
                }
                nr6 nr6VarM7367A = k43.m7367A(nr6Var2, nr6Var);
                Executor executor2 = (yq0) jp0Var.f22481b;
                yg3 yg3Var = new yg3((byte) 4);
                yg3Var.f35216c = c1372yl;
                yg3Var.f35215b = jp0Var;
                VarHandle.storeStoreFence();
                nr6VarM8827k = nr6VarM7367A.m8827k(executor2, yg3Var);
            } else {
                atomicReference.set(c44VarM13166d);
                ((li4) atomicReference2.get()).m7990c(c44VarM13166d);
                nr6VarM8827k = y62.m12936B(null);
            }
            nr6VarM8827k.m8819c(executor, new wb1((byte) 9));
            jp0 jp0Var3 = rp0Var.f29509o;
            if1 if1Var2 = rp0Var.f29503i;
            Context context3 = rp0Var.f29495a;
            if (context3 == null || (resources = context3.getResources()) == null) {
                z = true;
            } else {
                int iM10690C6 = se0.m10690C(context3, "com.crashlytics.RequireBuildId", "bool");
                if (iM10690C6 > 0) {
                    z = resources.getBoolean(iM10690C6);
                } else {
                    int iM10690C7 = se0.m10690C(context3, "com.crashlytics.RequireBuildId", "string");
                    if (iM10690C7 > 0) {
                        z = Boolean.parseBoolean(context3.getString(iM10690C7));
                    } else {
                        z = true;
                    }
                }
            }
            String str16 = (String) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x063e: CHECK_CAST (r8v14 'str16' java.lang.String) = (java.lang.String) (wrap java.lang.Object:0x063c: IGET (r27v0 ?? I:??[OBJECT, ARRAY]) A[WRAPPED] (LINE:1597) yl.b java.lang.Object) in method: pn.e(e8):java.lang.Object, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 2144
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C1040pn.mo3007e(e8):java.lang.Object");
        }

        @Override // p000.n60
        /* JADX INFO: renamed from: f */
        public Object mo4036f(m60 m60Var) {
            byte b = this.f27753a;
            Object obj = this.f27754b;
            switch (b) {
                case 6:
                    ix0 ix0Var = (ix0) obj;
                    ix0Var.mo4972C(new l20(m60Var, ix0Var, (byte) 1));
                    return "Deferred.asListenableFuture";
                default:
                    m60Var.m8199b(((vi4) ((ar3) obj).f14813b).m11900a());
                    return "evaluateJavascript Future";
            }
        }

        @Override // p000.l23
        /* JADX INFO: renamed from: g */
        public Object mo7823g() {
            byte b = this.f27753a;
            Object obj = this.f27754b;
            switch (b) {
                case 4:
                    Constructor constructor = (Constructor) obj;
                    try {
                        return constructor.newInstance(null);
                    } catch (IllegalAccessException e) {
                        c20 c20Var = vl3.f32723a;
                        xy4.m12785n("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                        return null;
                    } catch (InstantiationException e2) {
                        throw new RuntimeException("Failed to invoke constructor '" + vl3.m11926b(constructor) + "' with no args", e2);
                    } catch (InvocationTargetException e3) {
                        xy4.m12785n("Failed to invoke constructor '" + vl3.m11926b(constructor) + "' with no args", e3.getCause());
                        return null;
                    }
                default:
                    Class cls = (Class) obj;
                    try {
                        return xu4.f34631a.mo11164a(cls);
                    } catch (Exception e4) {
                        throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e4);
                    }
            }
        }

        @Override // p000.xm0
        /* JADX INFO: renamed from: h */
        public Object mo3681h(nr6 nr6Var) {
            byte b = this.f27753a;
            Object obj = this.f27754b;
            switch (b) {
                case 9:
                    ((Runnable) obj).run();
                    return y62.m12936B(null);
                case 10:
                    return (nr6) ((lp0) obj).call();
                default:
                    ((CountDownLatch) obj).countDown();
                    return null;
            }
        }

        /* JADX INFO: renamed from: i */
        public l70 m9572i(jp0 jp0Var) throws IOException {
            m70 m70Var = (m70) this.f27754b;
            m70Var.getClass();
            URL url = (URL) jp0Var.f22481b;
            if (Log.isLoggable("TRuntime.CctTransportBackend", 4)) {
                Log.i("TRuntime.CctTransportBackend", String.format("Making request to: %s", url));
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(m70Var.f24703g);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
            String str = (String) jp0Var.f22482c;
            if (str != null) {
                httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
            }
            try {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                    try {
                        m70Var.f24697a.m12085i((C0623es) jp0Var.f22483d, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                        gZIPOutputStream.close();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        Integer numValueOf = Integer.valueOf(responseCode);
                        if (Log.isLoggable("TRuntime.CctTransportBackend", 4)) {
                            Log.i("TRuntime.CctTransportBackend", String.format("Status Code: %d", numValueOf));
                        }
                        se0.m10736q("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                        se0.m10736q("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                        if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                            return new l70(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                        }
                        if (responseCode != 200) {
                            return new l70(responseCode, null, 0L);
                        }
                        InputStream inputStream = httpURLConnection.getInputStream();
                        try {
                            InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                            try {
                                l70 l70Var = new l70(responseCode, null, C0922mu.m8399a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f25214a);
                                if (gZIPInputStream != null) {
                                    gZIPInputStream.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                return l70Var;
                            } catch (Throwable th) {
                                if (gZIPInputStream != null) {
                                    try {
                                        gZIPInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                    }
                    throw th7;
                }
            } catch (ConnectException | UnknownHostException e) {
                se0.m10739t("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                return new l70(500, null, 0L);
            } catch (IOException | k81 e2) {
                se0.m10739t("CctTransportBackend", "Couldn't encode request, returning with 400", e2);
                return new l70(400, null, 0L);
            }
        }

        @Override // p000.InterfaceC1262vn
        /* JADX INFO: renamed from: j */
        public int mo5865j(int i, df2 df2Var) {
            return ((C0779iz) this.f27754b).m6970a(0, i, df2Var);
        }

        /* JADX INFO: renamed from: k */
        public void m9573k() {
            mq1 mq1Var = (mq1) this.f27754b;
            synchronized (k94.f23012c) {
                k94.f23017h = hb0.m6309U0(k94.f23017h, mq1Var);
            }
        }

        /* JADX INFO: renamed from: l */
        public Object m9574l(Object obj, ic2 ic2Var) {
            ql3 ql3Var = (ql3) this.f27754b;
            xh3 xh3Var = (xh3) ql3Var.f28555a;
            if (xh3Var != null) {
                return xh3Var;
            }
            C1053q c1053q = new C1053q((byte) 18);
            c1053q.f28113b = ic2Var;
            VarHandle.storeStoreFence();
            nc4 nc4Var = new nc4(c1053q);
            ql3Var.f28555a = nc4Var;
            return nc4Var;
        }

        /* JADX INFO: renamed from: m */
        public void m9575m(sz4 sz4Var) {
            byte b = this.f27753a;
            Object obj = this.f27754b;
            switch (b) {
                case 20:
                    Handler handler = new Handler(Looper.getMainLooper());
                    RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 23);
                    runnableC1285w9.f33164b = (C0310ra) obj;
                    runnableC1285w9.f33165c = sz4Var;
                    VarHandle.storeStoreFence();
                    handler.post(runnableC1285w9);
                    break;
                default:
                    Handler handler2 = new Handler(Looper.getMainLooper());
                    RunnableC1285w9 runnableC1285w10 = new RunnableC1285w9((byte) 24);
                    runnableC1285w10.f33164b = (C1040pn) obj;
                    runnableC1285w10.f33165c = sz4Var;
                    VarHandle.storeStoreFence();
                    handler2.post(runnableC1285w10);
                    break;
            }
        }

        @Override // p000.le4
        /* JADX INFO: renamed from: n */
        public nr6 mo3146n(Object obj) {
            return y62.m12936B((zj0) this.f27754b);
        }
    }
