package p000;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import internal.p002J.AbstractC0768N;
import java.lang.invoke.VarHandle;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.impl.CronetUrlRequestContext;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class oz5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f27248a;

    /* JADX INFO: renamed from: b */
    public Object f27249b;

    /* JADX INFO: renamed from: c */
    public Object f27250c;

    public /* synthetic */ oz5(i16 i16Var, j16 j16Var) {
        this.f27248a = (byte) 16;
        this.f27249b = i16Var;
        this.f27250c = j16Var;
    }

    /* JADX INFO: renamed from: a */
    private final void m9342a() {
        cw5 cw5Var = ((yv5) this.f27249b).f35554a;
        int i = 0;
        cw5Var.f16546g = 0;
        cw5Var.f16551l = (IInterface) cw5Var.f16548i.mo3009g((IBinder) this.f27250c);
        Log.i("ServiceConnMgrImpl", "notifyOnConnected");
        for (wp5 wp5Var : cw5Var.f16544e) {
            wp5Var.getClass();
            Log.i("HsdpClientImpl", "HSDP bound service connected");
            Handler handlerM4221e = wp5Var.f33584b.m4221e();
            gn5 gn5Var = new gn5((byte) 1);
            gn5Var.f19983b = wp5Var;
            VarHandle.storeStoreFence();
            handlerM4221e.post(gn5Var);
        }
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "linkToDeath");
        }
        try {
            IInterface iInterface = cw5Var.f16551l;
            if (iInterface == null) {
                throw null;
            }
            iInterface.asBinder().linkToDeath(cw5Var.f16549j, 0);
            cw5Var.f16545f = false;
            synchronized (cw5Var.f16543d) {
                try {
                    ArrayList arrayList = cw5Var.f16543d;
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((Runnable) obj).run();
                    }
                    cw5Var.f16543d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (RemoteException e) {
            Log.e("ServiceConnMgrImpl", "linkToDeath failed", e);
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m9343b() {
        CronetUrlRequestContext cronetUrlRequestContext = (CronetUrlRequestContext) this.f27250c;
        synchronized (cronetUrlRequestContext.f27018a) {
            ry5.m10503a("CronetUrlRequestContext#CronetUrlRequestContext initializing request context");
            try {
                AbstractC0768N.M6Dz0nZ5(cronetUrlRequestContext.f27022e, cronetUrlRequestContext);
                Trace.endSection();
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        dp2 dp2Var = (dp2) this.f27249b;
        if (dp2Var != null) {
            mr0 mr0Var = (mr0) dp2Var.f17256c;
            int iUptimeMillis = (int) (SystemClock.uptimeMillis() - dp2Var.f17254a);
            synchronized (mr0Var) {
                mr0Var.f25165c = iUptimeMillis;
                mr0 mr0Var2 = (mr0) dp2Var.f17256c;
                if (mr0Var2.f25164b >= 0 && mr0Var2.f25165c >= 0) {
                    ((dt0) dp2Var.f17255b).mo4110J(mr0Var2);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0338  */
    /* JADX WARN: Code duplicated, block: B:105:0x033e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0349  */
    /* JADX WARN: Code duplicated, block: B:109:0x0353  */
    /* JADX WARN: Code duplicated, block: B:112:0x0367 A[EDGE_INSN: B:112:0x0367->B:113:0x0369 BREAK  A[LOOP:1: B:107:0x034d->B:312:?]] */
    /* JADX WARN: Code duplicated, block: B:114:0x036b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0372  */
    /* JADX WARN: Code duplicated, block: B:118:0x0396  */
    /* JADX WARN: Code duplicated, block: B:120:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:121:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:124:0x0405  */
    /* JADX WARN: Code duplicated, block: B:127:0x0442  */
    /* JADX WARN: Code duplicated, block: B:128:0x0444  */
    /* JADX WARN: Code duplicated, block: B:131:0x0449  */
    /* JADX WARN: Code duplicated, block: B:134:0x0455 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x0457  */
    /* JADX WARN: Code duplicated, block: B:136:0x0458 A[PHI: r13
  0x0458: PHI (r13v20 boolean) = (r13v15 boolean), (r13v14 boolean) binds: [B:135:0x0457, B:132:0x0452] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:138:0x048e  */
    /* JADX WARN: Code duplicated, block: B:139:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:142:0x04ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:147:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:148:0x0501 A[PHI: r28 r29
  0x0501: PHI (r28v2 dn6) = (r28v0 dn6), (r28v3 dn6) binds: [B:146:0x04ec, B:144:0x04d1] A[DONT_GENERATE, DONT_INLINE]
  0x0501: PHI (r29v2 long) = (r29v0 long), (r29v3 long) binds: [B:146:0x04ec, B:144:0x04d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:150:0x050f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x0531  */
    /* JADX WARN: Code duplicated, block: B:162:0x0539  */
    /* JADX WARN: Code duplicated, block: B:165:0x0562  */
    /* JADX WARN: Code duplicated, block: B:168:0x0572  */
    /* JADX WARN: Code duplicated, block: B:171:0x0591  */
    /* JADX WARN: Code duplicated, block: B:173:0x059f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:177:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:179:0x05c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:187:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:192:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:194:0x0602  */
    /* JADX WARN: Code duplicated, block: B:196:0x0620  */
    /* JADX WARN: Code duplicated, block: B:200:0x0654  */
    /* JADX WARN: Code duplicated, block: B:201:0x0666  */
    /* JADX WARN: Code duplicated, block: B:204:0x0673  */
    /* JADX WARN: Code duplicated, block: B:209:0x068c  */
    /* JADX WARN: Code duplicated, block: B:211:0x0692  */
    /* JADX WARN: Code duplicated, block: B:213:0x069c  */
    /* JADX WARN: Code duplicated, block: B:214:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:217:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:220:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:224:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:227:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:230:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:231:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:233:0x070a  */
    /* JADX WARN: Code duplicated, block: B:235:0x072a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:246:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:248:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:251:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:260:0x0812  */
    /* JADX WARN: Code duplicated, block: B:262:0x081a  */
    /* JADX WARN: Code duplicated, block: B:263:0x081c  */
    /* JADX WARN: Code duplicated, block: B:265:0x0824  */
    /* JADX WARN: Code duplicated, block: B:269:0x0831  */
    /* JADX WARN: Code duplicated, block: B:273:0x0866  */
    /* JADX WARN: Code duplicated, block: B:275:0x0871  */
    /* JADX WARN: Code duplicated, block: B:277:0x089d  */
    /* JADX WARN: Code duplicated, block: B:280:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:284:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:303:0x0310 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x05ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:309:? A[LOOP:0: B:185:0x05df->B:309:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x0367 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x01ed A[Catch: NameNotFoundException -> 0x020a, TryCatch #0 {NameNotFoundException -> 0x020a, blocks: (B:39:0x01e2, B:41:0x01ed, B:43:0x01f9), top: B:293:0x01e2 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x01f9 A[Catch: NameNotFoundException -> 0x020a, TRY_LEAVE, TryCatch #0 {NameNotFoundException -> 0x020a, blocks: (B:39:0x01e2, B:41:0x01ed, B:43:0x01f9), top: B:293:0x01e2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:54:0x0236  */
    /* JADX WARN: Code duplicated, block: B:56:0x0239  */
    /* JADX WARN: Code duplicated, block: B:58:0x023c  */
    /* JADX WARN: Code duplicated, block: B:60:0x023f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0242  */
    /* JADX WARN: Code duplicated, block: B:64:0x0245  */
    /* JADX WARN: Code duplicated, block: B:66:0x0249  */
    /* JADX WARN: Code duplicated, block: B:67:0x025e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0269  */
    /* JADX WARN: Code duplicated, block: B:69:0x0274  */
    /* JADX WARN: Code duplicated, block: B:70:0x027f  */
    /* JADX WARN: Code duplicated, block: B:71:0x028a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0295  */
    /* JADX WARN: Code duplicated, block: B:73:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:77:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:78:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:81:0x02be A[Catch: IllegalStateException -> 0x02ce, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x02ce, blocks: (B:75:0x02ac, B:79:0x02ba, B:81:0x02be), top: B:297:0x02ac }] */
    /* JADX WARN: Code duplicated, block: B:87:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:92:0x0306  */
    /* JADX WARN: Code duplicated, block: B:96:0x0320  */
    /* JADX WARN: Code duplicated, block: B:97:0x0322 A[Catch: NotFoundException -> 0x0327, TRY_LEAVE, TryCatch #5 {NotFoundException -> 0x0327, blocks: (B:94:0x0310, B:97:0x0322), top: B:303:0x0310 }] */
    /* JADX INFO: renamed from: c */
    private final void m9344c() {
        String str;
        e66 e66Var;
        d76 d76Var;
        String string;
        int i;
        String str2;
        PackageInfo packageInfo;
        CharSequence applicationLabel;
        int iM9024g;
        oa6 oa6Var;
        Bundle bundleM9226F;
        Integer numValueOf;
        String[] stringArray;
        List listAsList;
        zg6 zg6Var;
        d76 d76Var2;
        x66 x66Var;
        x66 x66Var2;
        x66 x66Var3;
        x66 x66Var4;
        String strM4936A;
        long j;
        mg6 mg6Var;
        int iM13552z;
        boolean zM9225E;
        boolean z;
        x66 x66Var5;
        C1126rz c1126rz;
        xc6 xc6VarM10556B;
        rc6 rc6VarM9230J;
        rc6 rc6VarM9230J2;
        rc6 rc6Var;
        vc6 vc6Var;
        dn6 dn6Var;
        long j2;
        xc6 xc6Var;
        oa6 oa6Var2;
        rc6 rc6VarM9230J3;
        rc6 rc6VarM9230J4;
        Bundle bundle;
        mr5 mr5VarM8387c;
        Iterator it;
        Boolean boolM9227G;
        n86 n86Var;
        long j3;
        y86 y86Var;
        dn6 dn6Var2;
        C1126rz c1126rz2;
        d76 d76Var3;
        boolean zM9018a;
        SharedPreferences sharedPreferences;
        boolean zContains;
        boolean zIsEmpty;
        long jMax;
        nd6 nd6Var;
        x66 x66Var6;
        Context context;
        boolean z2;
        Iterator it2;
        String str3;
        dn6 dn6Var3;
        String strM6958a;
        oa6 oa6Var3 = (oa6) this.f27250c;
        AtomicInteger atomicInteger = oa6Var3.f26507C;
        jd6 jd6Var = (jd6) this.f27249b;
        ea6 ea6Var = oa6Var3.f26515g;
        d76 d76Var4 = oa6Var3.f26514f;
        s86 s86Var = oa6Var3.f26513e;
        dn6 dn6Var4 = oa6Var3.f26517i;
        ia5 ia5Var = oa6Var3.f26519k;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        op5 op5Var = oa6Var3.f26512d;
        ((oa6) op5Var.f36084a).getClass();
        yr5 yr5Var = new yr5();
        yr5Var.f36084a = oa6Var3;
        byte b = 1;
        oa6Var3.f26505A++;
        yr5Var.m7956x();
        oa6Var3.f26527s = yr5Var;
        mz5 mz5Var = jd6Var.f22188d;
        long j4 = mz5Var == null ? 0L : mz5Var.f25347d;
        long j5 = jd6Var.f22187c;
        e66 e66Var2 = new e66(oa6Var3);
        e66Var2.f17848N = 0L;
        e66Var2.f17849O = null;
        e66Var2.f17856m = j5;
        e66Var2.f17857n = j4;
        VarHandle.storeStoreFence();
        e66Var2.m9742v();
        oa6Var3.f26528t = e66Var2;
        m66 m66Var = new m66(oa6Var3);
        m66Var.f24695g = new wq5(m66Var, ((oa6) m66Var.f36084a).f26509a);
        VarHandle.storeStoreFence();
        m66Var.m9742v();
        oa6Var3.f26525q = m66Var;
        oj6 oj6Var = new oj6(oa6Var3);
        oj6Var.f26794m = new ArrayList();
        oj6Var.f26793l = new al6(ia5Var);
        jj6 jj6Var = new jj6();
        jj6Var.f22344c = oj6Var;
        VarHandle.storeStoreFence();
        oj6Var.f26788g = jj6Var;
        oj6Var.f26791j = new ji6(oj6Var, oa6Var3, (byte) 0);
        oj6Var.f26795n = new ji6(oj6Var, oa6Var3, b);
        VarHandle.storeStoreFence();
        oj6Var.m9742v();
        oa6Var3.f26526r = oj6Var;
        boolean z3 = dn6Var4.f23955f;
        oa6 oa6Var4 = (oa6) dn6Var4.f36084a;
        if (z3) {
            C1077qn.m9989o("Can't initialize twice");
            return;
        }
        dn6Var4.mo5038t();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                d76 d76Var5 = ((oa6) dn6Var4.f36084a).f26514f;
                oa6.m9016l(d76Var5);
                d76Var5.f16838m.m12504a("Utils falling back to Random for random id");
            }
        }
        dn6Var4.f17224h.set(jNextLong);
        oa6Var4.f26507C.incrementAndGet();
        dn6Var4.f23955f = true;
        if (s86Var.f23955f) {
            C1077qn.m9989o("Can't initialize twice");
            return;
        }
        SharedPreferences sharedPreferences2 = ((oa6) s86Var.f36084a).f26509a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        s86Var.f29985g = sharedPreferences2;
        boolean z4 = sharedPreferences2.getBoolean("has_been_opened", false);
        s86Var.f29977P = z4;
        if (!z4) {
            SharedPreferences.Editor editorEdit = s86Var.f29985g.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        long jMax2 = Math.max(0L, ((Long) e56.f17778d.m4379a(null)).longValue());
        p86 p86Var = new p86();
        p86Var.f27462e = s86Var;
        y42.m12851X("health_monitor");
        y42.m12849V(jMax2 > 0);
        p86Var.f27459b = "health_monitor:start";
        p86Var.f27460c = "health_monitor:count";
        p86Var.f27461d = "health_monitor:value";
        p86Var.f27458a = jMax2;
        VarHandle.storeStoreFence();
        s86Var.f29987i = p86Var;
        ((oa6) s86Var.f36084a).f26507C.incrementAndGet();
        s86Var.f23955f = true;
        e66 e66Var3 = oa6Var3.f26528t;
        if (e66Var3.f28230f) {
            C1077qn.m9989o("Can't initialize twice");
            return;
        }
        oa6 oa6Var5 = (oa6) e66Var3.f36084a;
        d76 d76Var6 = oa6Var5.f26514f;
        d76 d76Var7 = oa6Var5.f26514f;
        oa6.m9016l(d76Var6);
        d76Var6.f16831L.m12506c("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(e66Var3.f17857n), Long.valueOf(e66Var3.f17856m));
        Context context2 = oa6Var5.f26509a;
        String packageName = context2.getPackageName();
        PackageManager packageManager = context2.getPackageManager();
        String str4 = "";
        String str5 = "Unknown";
        String installerPackageName = "unknown";
        try {
            if (packageManager != null) {
                str = "Can't initialize twice";
                e66Var = e66Var2;
                d76Var = d76Var4;
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    oa6.m9016l(d76Var7);
                    d76Var7.f16835j.m12505b(d76.m4401y(packageName), "Error retrieving app installer package name. appId");
                }
                String str6 = installerPackageName;
                try {
                    if (str6 != null) {
                        if ("com.android.vending".equals(str6)) {
                            installerPackageName = "";
                        }
                        packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                        if (packageInfo != null) {
                            applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (TextUtils.isEmpty(applicationLabel)) {
                                string = "Unknown";
                            } else {
                                string = applicationLabel.toString();
                            }
                            try {
                                str2 = packageInfo.versionName;
                                try {
                                    i = packageInfo.versionCode;
                                } catch (PackageManager.NameNotFoundException unused2) {
                                    str5 = str2;
                                    oa6.m9016l(d76Var7);
                                    d76Var7.f16835j.m12506c("Error retrieving package info. appId, appName", d76.m4401y(packageName), string);
                                    i = Integer.MIN_VALUE;
                                    str2 = str5;
                                }
                            } catch (PackageManager.NameNotFoundException unused3) {
                            }
                        }
                        String str7 = installerPackageName;
                        e66Var3.f17850g = packageName;
                        e66Var3.f17853j = str7;
                        e66Var3.f17851h = str2;
                        e66Var3.f17852i = i;
                        e66Var3.f17854k = string;
                        e66Var3.f17855l = 0L;
                        iM9024g = oa6Var5.m9024g();
                        if (iM9024g == 0) {
                            oa6.m9016l(d76Var7);
                            d76Var7.f16831L.m12504a("App measurement collection enabled");
                        } else if (iM9024g == 1) {
                            oa6.m9016l(d76Var7);
                            d76Var7.f16841p.m12504a("App measurement deactivated via the manifest");
                        } else if (iM9024g == 3) {
                            oa6.m9016l(d76Var7);
                            d76Var7.f16841p.m12504a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        } else if (iM9024g == 4) {
                            oa6.m9016l(d76Var7);
                            d76Var7.f16841p.m12504a("App measurement disabled via the manifest");
                        } else if (iM9024g == 6) {
                            oa6.m9016l(d76Var7);
                            d76Var7.f16840o.m12504a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        } else if (iM9024g == 7) {
                            oa6.m9016l(d76Var7);
                            d76Var7.f16841p.m12504a("App measurement disabled via the global data collection setting");
                        } else if (iM9024g != 8) {
                            oa6.m9016l(d76Var7);
                            d76Var7.f16841p.m12504a("App measurement disabled");
                            oa6.m9016l(d76Var7);
                            d76Var7.f16836k.m12504a("Invalid scion state in identity");
                        } else {
                            oa6.m9016l(d76Var7);
                            d76Var7.f16841p.m12504a("App measurement disabled due to denied storage consent");
                        }
                        e66Var3.f17846L = "";
                        strM6958a = iw5.m6958a(context2, oa6Var5.f26524p);
                        if (!TextUtils.isEmpty(strM6958a)) {
                            str4 = strM6958a;
                        }
                        e66Var3.f17846L = str4;
                        if (iM9024g == 0) {
                            oa6.m9016l(d76Var7);
                            d76Var7.f16831L.m12506c("App measurement enabled for app package, google app id", e66Var3.f17850g, e66Var3.f17846L);
                        }
                        e66Var3.f17858o = null;
                        op5 op5Var2 = oa6Var5.f26512d;
                        oa6Var = (oa6) op5Var2.f36084a;
                        y42.m12851X("analytics.safelisted_events");
                        bundleM9226F = op5Var2.m9226F();
                        if (bundleM9226F != null) {
                            if (bundleM9226F.containsKey("analytics.safelisted_events")) {
                                numValueOf = Integer.valueOf(bundleM9226F.getInt("analytics.safelisted_events"));
                            }
                            if (numValueOf != null) {
                                try {
                                    stringArray = oa6Var.f26509a.getResources().getStringArray(numValueOf.intValue());
                                    if (stringArray == null) {
                                        listAsList = null;
                                    } else {
                                        listAsList = Arrays.asList(stringArray);
                                    }
                                } catch (Resources.NotFoundException e) {
                                    d76 d76Var8 = oa6Var.f26514f;
                                    oa6.m9016l(d76Var8);
                                    d76Var8.f16835j.m12505b(e, "Failed to load string array from metadata: resource not found");
                                }
                            } else {
                                listAsList = null;
                            }
                            if (listAsList != null) {
                                e66Var3.f17858o = listAsList;
                                break;
                            }
                            if (listAsList.isEmpty()) {
                                it2 = listAsList.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        e66Var3.f17858o = listAsList;
                                        break;
                                    } else {
                                        str3 = (String) it2.next();
                                        dn6Var3 = oa6Var5.f26517i;
                                        oa6.m9014j(dn6Var3);
                                    }
                                } while (dn6Var3.m4618w0("safelisted event", str3));
                            } else {
                                oa6.m9016l(d76Var7);
                                d76Var7.f16840o.m12504a("Safelisted event list is empty. Ignoring");
                            }
                            if (packageManager != null) {
                                e66Var3.f17860q = y42.m12872u0(context2) ? 1 : 0;
                            } else {
                                e66Var3.f17860q = 0;
                            }
                            ((oa6) e66Var3.f36084a).f26507C.incrementAndGet();
                            e66Var3.f28230f = true;
                            zg6Var = new zg6();
                            zg6Var.f36084a = oa6Var3;
                            oa6Var3.f26505A++;
                            zg6Var.m9742v();
                            oa6Var3.f26529u = zg6Var;
                            if (!zg6Var.f28230f) {
                                C1077qn.m9989o(str);
                                return;
                            }
                            zg6Var.f36078g = (JobScheduler) ((oa6) zg6Var.f36084a).f26509a.getSystemService("jobscheduler");
                            atomicInteger.incrementAndGet();
                            zg6Var.f28230f = true;
                            oa6.m9016l(d76Var);
                            d76Var2 = d76Var;
                            x66Var = d76Var2.f16842q;
                            x66Var2 = d76Var2.f16841p;
                            x66Var3 = d76Var2.f16831L;
                            x66Var4 = d76Var2.f16835j;
                            op5Var.m9235z();
                            x66Var2.m12505b(130000L, "App measurement initialized, version");
                            oa6.m9016l(d76Var2);
                            x66Var2.m12504a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                            strM4936A = e66Var.m4936A();
                            if (dn6Var4.m4596U(strM4936A, op5Var.f26943g)) {
                                oa6.m9016l(d76Var2);
                                x66Var2.m12504a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                            } else {
                                oa6.m9016l(d76Var2);
                                x66Var2.m12504a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM4936A)));
                            }
                            oa6.m9016l(d76Var2);
                            x66Var.m12504a("Debug-level message logging enabled");
                            if (oa6Var3.f26505A != atomicInteger.get()) {
                                oa6.m9016l(d76Var2);
                                x66Var4.m12506c("Not all components initialized", Integer.valueOf(oa6Var3.f26505A), Integer.valueOf(atomicInteger.get()));
                            }
                            oa6Var3.f26530v = true;
                            j = oa6Var3.f26508D;
                            mg6Var = oa6Var3.f26521m;
                            oa6.m9016l(ea6Var);
                            ea6Var.mo5038t();
                            oa6.m9013i(oa6Var3.f26529u);
                            iM13552z = oa6Var3.f26529u.m13552z();
                            ho6.m6466a();
                            zM9225E = op5Var.m9225E(null, e56.f17750Q0);
                            if (iM13552z == 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (zM9225E) {
                                dn6Var4.mo5038t();
                                if (dn6Var4.m4594P() == 1) {
                                    dn6Var4.mo5038t();
                                    IntentFilter intentFilter = new IntentFilter();
                                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    z2 = z;
                                    o30 o30Var = new o30((byte) 1);
                                    o30Var.f26313b = oa6Var4;
                                    VarHandle.storeStoreFence();
                                    x66Var5 = x66Var2;
                                    kx5.m7721m0(oa6Var4.f26509a, o30Var, intentFilter, null);
                                    d76 d76Var9 = oa6Var4.f26514f;
                                    oa6.m9016l(d76Var9);
                                    d76Var9.f16842q.m12504a("Registered app receiver");
                                    if (z2) {
                                        oa6.m9013i(oa6Var3.f26529u);
                                        oa6Var3.f26529u.m13551y(((Long) e56.f17721C.m4379a(null)).longValue());
                                    }
                                } else if (z) {
                                    z = true;
                                    dn6Var4.mo5038t();
                                    IntentFilter intentFilter2 = new IntentFilter();
                                    intentFilter2.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter2.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    z2 = z;
                                    o30 o30Var2 = new o30((byte) 1);
                                    o30Var2.f26313b = oa6Var4;
                                    VarHandle.storeStoreFence();
                                    x66Var5 = x66Var2;
                                    kx5.m7721m0(oa6Var4.f26509a, o30Var2, intentFilter2, null);
                                    d76 d76Var10 = oa6Var4.f26514f;
                                    oa6.m9016l(d76Var10);
                                    d76Var10.f16842q.m12504a("Registered app receiver");
                                    if (z2) {
                                        oa6.m9013i(oa6Var3.f26529u);
                                        oa6Var3.f26529u.m13551y(((Long) e56.f17721C.m4379a(null)).longValue());
                                    }
                                } else {
                                    x66Var5 = x66Var2;
                                }
                            } else if (z) {
                                z = true;
                                dn6Var4.mo5038t();
                                IntentFilter intentFilter3 = new IntentFilter();
                                intentFilter3.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter3.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z2 = z;
                                o30 o30Var3 = new o30((byte) 1);
                                o30Var3.f26313b = oa6Var4;
                                VarHandle.storeStoreFence();
                                x66Var5 = x66Var2;
                                kx5.m7721m0(oa6Var4.f26509a, o30Var3, intentFilter3, null);
                                d76 d76Var11 = oa6Var4.f26514f;
                                oa6.m9016l(d76Var11);
                                d76Var11.f16842q.m12504a("Registered app receiver");
                                if (z2) {
                                    oa6.m9013i(oa6Var3.f26529u);
                                    oa6Var3.f26529u.m13551y(((Long) e56.f17721C.m4379a(null)).longValue());
                                }
                            } else {
                                x66Var5 = x66Var2;
                            }
                            c1126rz = s86Var.f29989k;
                            xc6VarM10556B = s86Var.m10556B();
                            int i2 = xc6VarM10556B.f34161b;
                            rc6VarM9230J = op5Var.m9230J("google_analytics_default_allow_ad_storage", false);
                            rc6VarM9230J2 = op5Var.m9230J("google_analytics_default_allow_analytics_storage", false);
                            rc6Var = rc6.UNINITIALIZED;
                            vc6Var = vc6.ANALYTICS_STORAGE;
                            if (rc6VarM9230J == rc6Var || rc6VarM9230J2 != rc6Var) {
                                dn6Var = dn6Var4;
                                j2 = j;
                                if (xc6.m12657l(-10, s86Var.m10560y().getInt("consent_source", 100))) {
                                    EnumMap enumMap = new EnumMap(vc6.class);
                                    enumMap.put(vc6.AD_STORAGE, rc6VarM9230J);
                                    enumMap.put(vc6Var, rc6VarM9230J2);
                                    xc6Var = new xc6(enumMap, -10);
                                }
                                if (xc6Var != null) {
                                    oa6.m9015k(mg6Var);
                                    mg6Var.m8316Q(xc6Var, true);
                                } else {
                                    xc6Var = xc6VarM10556B;
                                }
                                oa6.m9015k(mg6Var);
                                oa6Var2 = (oa6) mg6Var.f36084a;
                                mg6Var.m8320y(xc6Var);
                                s86Var.mo5038t();
                                int i3 = mr5.m8386b(s86Var.m10560y().getString("dma_consent_settings", null)).f25171a;
                                rc6VarM9230J3 = op5Var.m9230J("google_analytics_default_allow_ad_personalization_signals", true);
                                if (rc6VarM9230J3 != rc6Var) {
                                    oa6.m9016l(d76Var2);
                                    x66Var3.m12505b(rc6VarM9230J3, "Default ad personalization consent from Manifest");
                                }
                                rc6VarM9230J4 = op5Var.m9230J("google_analytics_default_allow_ad_user_data", true);
                                if (rc6VarM9230J4 == rc6Var && xc6.m12657l(-10, i3)) {
                                    oa6.m9015k(mg6Var);
                                    EnumMap enumMap2 = new EnumMap(vc6.class);
                                    enumMap2.put(vc6.AD_USER_DATA, rc6VarM9230J4);
                                    mg6Var.m8315P(new mr5(enumMap2, -10, (Boolean) null, (String) null), true);
                                } else if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B()) && (i3 == 0 || i3 == 30)) {
                                    oa6.m9015k(mg6Var);
                                    mg6Var.m8315P(new mr5((Boolean) null, -10, (Boolean) null, (String) null), true);
                                } else if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B()) && mz5Var != null && (bundle = mz5Var.f25350g) != null && xc6.m12657l(30, i3)) {
                                    mr5VarM8387c = mr5.m8387c(30, bundle);
                                    it = mr5VarM8387c.f25175e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((rc6) it.next()) != rc6Var) {
                                            oa6.m9015k(mg6Var);
                                            mg6Var.m8315P(mr5VarM8387c, true);
                                            break;
                                        }
                                    }
                                }
                                boolM9227G = op5Var.m9227G("google_analytics_tcf_data_enabled");
                                if (boolM9227G != null || boolM9227G.booleanValue()) {
                                    oa6.m9016l(d76Var2);
                                    x66Var.m12504a("TCF client enabled.");
                                    oa6.m9015k(mg6Var);
                                    mg6Var.mo5038t();
                                    d76 d76Var12 = oa6Var2.f26514f;
                                    oa6.m9016l(d76Var12);
                                    d76Var12.f16842q.m12504a("Register tcfPrefChangeListener.");
                                    if (mg6Var.f24895S == null) {
                                        mg6Var.f24896T = new nd6(mg6Var, oa6Var2, (byte) 2);
                                        fg6 fg6Var = new fg6();
                                        fg6Var.f18970a = mg6Var;
                                        VarHandle.storeStoreFence();
                                        mg6Var.f24895S = fg6Var;
                                    }
                                    s86 s86Var2 = oa6Var2.f26513e;
                                    oa6.m9014j(s86Var2);
                                    s86Var2.m10561z().registerOnSharedPreferenceChangeListener(mg6Var.f24895S);
                                    oa6.m9015k(mg6Var);
                                    mg6Var.m8300A();
                                }
                                n86Var = s86Var.f29988j;
                                if (n86Var.m8623a() == 0) {
                                    oa6.m9016l(d76Var2);
                                    x66Var3.m12505b(Long.valueOf(j2), "Persisting first open");
                                    j3 = j2;
                                    n86Var.m8624b(j3);
                                } else {
                                    j3 = j2;
                                }
                                oa6.m9015k(mg6Var);
                                y86Var = mg6Var.f24892P;
                                if (y86Var.m13052d() && y86Var.m13051c()) {
                                    s86 s86Var3 = y86Var.f35029b.f26513e;
                                    oa6.m9014j(s86Var3);
                                    s86Var3.f29982U.m10507d(null);
                                }
                                if (oa6Var3.m9025h()) {
                                    dn6Var2 = dn6Var;
                                    if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                                        c1126rz2 = c1126rz;
                                    } else {
                                        String strM4937B = oa6Var3.m9029p().m4937B();
                                        s86Var.mo5038t();
                                        String string2 = s86Var.m10560y().getString("gmp_app_id", null);
                                        zIsEmpty = TextUtils.isEmpty(strM4937B);
                                        boolean zIsEmpty2 = TextUtils.isEmpty(string2);
                                        if (!zIsEmpty || zIsEmpty2) {
                                            c1126rz2 = c1126rz;
                                        } else {
                                            y42.m12854a0(strM4937B);
                                            if (strM4937B.equals(string2)) {
                                                c1126rz2 = c1126rz;
                                            } else {
                                                oa6.m9016l(d76Var2);
                                                x66Var5.m12504a("Rechecking which service to use due to a GMP App Id change");
                                                s86Var.mo5038t();
                                                s86Var.mo5038t();
                                                Boolean boolValueOf = s86Var.m10560y().contains("measurement_enabled") ? Boolean.valueOf(s86Var.m10560y().getBoolean("measurement_enabled", true)) : null;
                                                SharedPreferences.Editor editorEdit2 = s86Var.m10560y().edit();
                                                editorEdit2.clear();
                                                editorEdit2.apply();
                                                if (boolValueOf != null) {
                                                    s86Var.mo5038t();
                                                    SharedPreferences.Editor editorEdit3 = s86Var.m10560y().edit();
                                                    editorEdit3.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                                    editorEdit3.apply();
                                                }
                                                oa6Var3.m9026m().m8204y();
                                                oa6Var3.f26526r.m9134C();
                                                oa6Var3.f26526r.m9132A();
                                                n86Var.m8624b(j3);
                                                c1126rz2 = c1126rz;
                                                c1126rz2.m10507d(null);
                                            }
                                        }
                                        String strM4937B2 = oa6Var3.m9029p().m4937B();
                                        s86Var.mo5038t();
                                        SharedPreferences.Editor editorEdit4 = s86Var.m10560y().edit();
                                        editorEdit4.putString("gmp_app_id", strM4937B2);
                                        editorEdit4.apply();
                                    }
                                    if (!s86Var.m10556B().m12660i(vc6Var)) {
                                        c1126rz2.m10507d(null);
                                    }
                                    oa6.m9015k(mg6Var);
                                    mg6Var.f24902k.set(c1126rz2.m10506c());
                                    try {
                                        oa6Var4.f26509a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                    } catch (ClassNotFoundException unused4) {
                                        C1126rz c1126rz3 = s86Var.f29981T;
                                        if (!TextUtils.isEmpty(c1126rz3.m10506c())) {
                                            oa6.m9016l(d76Var2);
                                            d76Var3 = d76Var2;
                                            d76Var3.f16838m.m12504a("Remote config removed with active feature rollouts");
                                            c1126rz3.m10507d(null);
                                        }
                                        if (!TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                                            zM9018a = oa6Var3.m9018a();
                                            sharedPreferences = s86Var.f29985g;
                                            if (sharedPreferences == null) {
                                                zContains = false;
                                            } else {
                                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                                            }
                                            if (!zContains) {
                                                s86Var.m10558D(!zM9018a);
                                            }
                                            if (zM9018a) {
                                                oa6.m9015k(mg6Var);
                                                mg6Var.m8307H();
                                            }
                                            vk6 vk6Var = oa6Var3.f26516h;
                                            oa6.m9015k(vk6Var);
                                            vk6Var.f32708i.mo3680f();
                                            oa6Var3.m9027n().m9147y(new AtomicReference());
                                            oa6Var3.m9027n().m9148z(s86Var.f29984W.m10190a());
                                        }
                                        ho6.m6466a();
                                        if (op5Var.m9225E(null, e56.f17750Q0)) {
                                            dn6Var2.mo5038t();
                                            if (dn6Var2.m4594P() == 1) {
                                                jMax = Math.max(500L, ((((long) ((Integer) e56.f17826x0.m4379a(null)).intValue()) * 1000) + ((long) new Random().nextInt(5000))) - SystemClock.elapsedRealtime());
                                                if (jMax > 500) {
                                                    oa6.m9016l(d76Var3);
                                                    x66Var3.m12505b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                }
                                                oa6.m9015k(mg6Var);
                                                mg6Var.mo5038t();
                                                nd6Var = mg6Var.f24907p;
                                                if (nd6Var == null) {
                                                    nd6Var = new nd6(mg6Var, oa6Var2, (byte) 0);
                                                    mg6Var.f24907p = nd6Var;
                                                }
                                                nd6Var.m6923b(jMax);
                                            }
                                        }
                                        s86Var.f29974M.m6281b(true);
                                    }
                                    d76Var3 = d76Var2;
                                    if (!TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                                        zM9018a = oa6Var3.m9018a();
                                        sharedPreferences = s86Var.f29985g;
                                        if (sharedPreferences == null) {
                                            zContains = false;
                                        } else {
                                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
                                        if (!zContains && !op5Var.m9228H()) {
                                            s86Var.m10558D(!zM9018a);
                                        }
                                        if (zM9018a) {
                                            oa6.m9015k(mg6Var);
                                            mg6Var.m8307H();
                                        }
                                        vk6 vk6Var2 = oa6Var3.f26516h;
                                        oa6.m9015k(vk6Var2);
                                        vk6Var2.f32708i.mo3680f();
                                        oa6Var3.m9027n().m9147y(new AtomicReference());
                                        oa6Var3.m9027n().m9148z(s86Var.f29984W.m10190a());
                                    }
                                } else {
                                    if (oa6Var3.m9018a()) {
                                        dn6Var2 = dn6Var;
                                        if (dn6Var2.m4595R("android.permission.INTERNET")) {
                                            x66Var6 = x66Var4;
                                        } else {
                                            oa6.m9016l(d76Var2);
                                            x66Var6 = x66Var4;
                                            x66Var6.m12504a("App is missing INTERNET permission");
                                        }
                                        if (!dn6Var2.m4595R("android.permission.ACCESS_NETWORK_STATE")) {
                                            oa6.m9016l(d76Var2);
                                            x66Var6.m12504a("App is missing ACCESS_NETWORK_STATE permission");
                                        }
                                        context = oa6Var3.f26509a;
                                        if (!r35.m10189a(context).m12999c() && !op5Var.m9233x()) {
                                            if (!dn6.m4573k0(context)) {
                                                oa6.m9016l(d76Var2);
                                                x66Var6.m12504a("AppMeasurementReceiver not registered/enabled");
                                            }
                                            if (!dn6.m4567N(context)) {
                                                oa6.m9016l(d76Var2);
                                                x66Var6.m12504a("AppMeasurementService not registered/enabled");
                                            }
                                        }
                                        oa6.m9016l(d76Var2);
                                        x66Var6.m12504a("Uploading is not possible. App measurement disabled");
                                    } else {
                                        dn6Var2 = dn6Var;
                                    }
                                    d76Var3 = d76Var2;
                                }
                                ho6.m6466a();
                                if (op5Var.m9225E(null, e56.f17750Q0)) {
                                    dn6Var2.mo5038t();
                                    if (dn6Var2.m4594P() == 1) {
                                        jMax = Math.max(500L, ((((long) ((Integer) e56.f17826x0.m4379a(null)).intValue()) * 1000) + ((long) new Random().nextInt(5000))) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            oa6.m9016l(d76Var3);
                                            x66Var3.m12505b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        oa6.m9015k(mg6Var);
                                        mg6Var.mo5038t();
                                        nd6Var = mg6Var.f24907p;
                                        if (nd6Var == null) {
                                            nd6Var = new nd6(mg6Var, oa6Var2, (byte) 0);
                                            mg6Var.f24907p = nd6Var;
                                        }
                                        nd6Var.m6923b(jMax);
                                    }
                                }
                                s86Var.f29974M.m6281b(true);
                            }
                            dn6Var = dn6Var4;
                            j2 = j;
                            if (!TextUtils.isEmpty(oa6Var3.m9029p().m4937B()) && (i2 == 0 || i2 == 30 || i2 == 10 || i2 == 40)) {
                                oa6.m9015k(mg6Var);
                                mg6Var.m8316Q(new xc6(-10), false);
                            }
                            xc6Var = null;
                            if (xc6Var != null) {
                                oa6.m9015k(mg6Var);
                                mg6Var.m8316Q(xc6Var, true);
                            } else {
                                xc6Var = xc6VarM10556B;
                            }
                            oa6.m9015k(mg6Var);
                            oa6Var2 = (oa6) mg6Var.f36084a;
                            mg6Var.m8320y(xc6Var);
                            s86Var.mo5038t();
                            int i4 = mr5.m8386b(s86Var.m10560y().getString("dma_consent_settings", null)).f25171a;
                            rc6VarM9230J3 = op5Var.m9230J("google_analytics_default_allow_ad_personalization_signals", true);
                            if (rc6VarM9230J3 != rc6Var) {
                                oa6.m9016l(d76Var2);
                                x66Var3.m12505b(rc6VarM9230J3, "Default ad personalization consent from Manifest");
                            }
                            rc6VarM9230J4 = op5Var.m9230J("google_analytics_default_allow_ad_user_data", true);
                            if (rc6VarM9230J4 == rc6Var) {
                                if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                                    if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                                        mr5VarM8387c = mr5.m8387c(30, bundle);
                                        it = mr5VarM8387c.f25175e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((rc6) it.next()) != rc6Var) {
                                                oa6.m9015k(mg6Var);
                                                mg6Var.m8315P(mr5VarM8387c, true);
                                                break;
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                                    mr5VarM8387c = mr5.m8387c(30, bundle);
                                    it = mr5VarM8387c.f25175e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((rc6) it.next()) != rc6Var) {
                                            oa6.m9015k(mg6Var);
                                            mg6Var.m8315P(mr5VarM8387c, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                                if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                                    mr5VarM8387c = mr5.m8387c(30, bundle);
                                    it = mr5VarM8387c.f25175e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((rc6) it.next()) != rc6Var) {
                                            oa6.m9015k(mg6Var);
                                            mg6Var.m8315P(mr5VarM8387c, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                                mr5VarM8387c = mr5.m8387c(30, bundle);
                                it = mr5VarM8387c.f25175e.values().iterator();
                                while (it.hasNext()) {
                                    if (((rc6) it.next()) != rc6Var) {
                                        oa6.m9015k(mg6Var);
                                        mg6Var.m8315P(mr5VarM8387c, true);
                                        break;
                                    }
                                }
                            }
                            boolM9227G = op5Var.m9227G("google_analytics_tcf_data_enabled");
                            if (boolM9227G != null) {
                                oa6.m9016l(d76Var2);
                                x66Var.m12504a("TCF client enabled.");
                                oa6.m9015k(mg6Var);
                                mg6Var.mo5038t();
                                d76 d76Var13 = oa6Var2.f26514f;
                                oa6.m9016l(d76Var13);
                                d76Var13.f16842q.m12504a("Register tcfPrefChangeListener.");
                                if (mg6Var.f24895S == null) {
                                    mg6Var.f24896T = new nd6(mg6Var, oa6Var2, (byte) 2);
                                    fg6 fg6Var2 = new fg6();
                                    fg6Var2.f18970a = mg6Var;
                                    VarHandle.storeStoreFence();
                                    mg6Var.f24895S = fg6Var2;
                                }
                                s86 s86Var4 = oa6Var2.f26513e;
                                oa6.m9014j(s86Var4);
                                s86Var4.m10561z().registerOnSharedPreferenceChangeListener(mg6Var.f24895S);
                                oa6.m9015k(mg6Var);
                                mg6Var.m8300A();
                            } else {
                                oa6.m9016l(d76Var2);
                                x66Var.m12504a("TCF client enabled.");
                                oa6.m9015k(mg6Var);
                                mg6Var.mo5038t();
                                d76 d76Var14 = oa6Var2.f26514f;
                                oa6.m9016l(d76Var14);
                                d76Var14.f16842q.m12504a("Register tcfPrefChangeListener.");
                                if (mg6Var.f24895S == null) {
                                    mg6Var.f24896T = new nd6(mg6Var, oa6Var2, (byte) 2);
                                    fg6 fg6Var3 = new fg6();
                                    fg6Var3.f18970a = mg6Var;
                                    VarHandle.storeStoreFence();
                                    mg6Var.f24895S = fg6Var3;
                                }
                                s86 s86Var5 = oa6Var2.f26513e;
                                oa6.m9014j(s86Var5);
                                s86Var5.m10561z().registerOnSharedPreferenceChangeListener(mg6Var.f24895S);
                                oa6.m9015k(mg6Var);
                                mg6Var.m8300A();
                            }
                            n86Var = s86Var.f29988j;
                            if (n86Var.m8623a() == 0) {
                                oa6.m9016l(d76Var2);
                                x66Var3.m12505b(Long.valueOf(j2), "Persisting first open");
                                j3 = j2;
                                n86Var.m8624b(j3);
                            } else {
                                j3 = j2;
                            }
                            oa6.m9015k(mg6Var);
                            y86Var = mg6Var.f24892P;
                            if (y86Var.m13052d()) {
                                s86 s86Var6 = y86Var.f35029b.f26513e;
                                oa6.m9014j(s86Var6);
                                s86Var6.f29982U.m10507d(null);
                            }
                            if (oa6Var3.m9025h()) {
                                if (oa6Var3.m9018a()) {
                                    dn6Var2 = dn6Var;
                                    if (dn6Var2.m4595R("android.permission.INTERNET")) {
                                        oa6.m9016l(d76Var2);
                                        x66Var6 = x66Var4;
                                        x66Var6.m12504a("App is missing INTERNET permission");
                                    } else {
                                        x66Var6 = x66Var4;
                                    }
                                    if (!dn6Var2.m4595R("android.permission.ACCESS_NETWORK_STATE")) {
                                        oa6.m9016l(d76Var2);
                                        x66Var6.m12504a("App is missing ACCESS_NETWORK_STATE permission");
                                    }
                                    context = oa6Var3.f26509a;
                                    if (!r35.m10189a(context).m12999c()) {
                                        if (!dn6.m4573k0(context)) {
                                            oa6.m9016l(d76Var2);
                                            x66Var6.m12504a("AppMeasurementReceiver not registered/enabled");
                                        }
                                        if (!dn6.m4567N(context)) {
                                            oa6.m9016l(d76Var2);
                                            x66Var6.m12504a("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    oa6.m9016l(d76Var2);
                                    x66Var6.m12504a("Uploading is not possible. App measurement disabled");
                                } else {
                                    dn6Var2 = dn6Var;
                                }
                                d76Var3 = d76Var2;
                            } else {
                                dn6Var2 = dn6Var;
                                if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                                    String strM4937B3 = oa6Var3.m9029p().m4937B();
                                    s86Var.mo5038t();
                                    String string3 = s86Var.m10560y().getString("gmp_app_id", null);
                                    zIsEmpty = TextUtils.isEmpty(strM4937B3);
                                    boolean zIsEmpty3 = TextUtils.isEmpty(string3);
                                    if (zIsEmpty) {
                                        c1126rz2 = c1126rz;
                                    } else {
                                        c1126rz2 = c1126rz;
                                    }
                                    String strM4937B4 = oa6Var3.m9029p().m4937B();
                                    s86Var.mo5038t();
                                    SharedPreferences.Editor editorEdit5 = s86Var.m10560y().edit();
                                    editorEdit5.putString("gmp_app_id", strM4937B4);
                                    editorEdit5.apply();
                                } else {
                                    c1126rz2 = c1126rz;
                                }
                                if (!s86Var.m10556B().m12660i(vc6Var)) {
                                    c1126rz2.m10507d(null);
                                }
                                oa6.m9015k(mg6Var);
                                mg6Var.f24902k.set(c1126rz2.m10506c());
                                oa6Var4.f26509a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                d76Var3 = d76Var2;
                                if (!TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                                    zM9018a = oa6Var3.m9018a();
                                    sharedPreferences = s86Var.f29985g;
                                    if (sharedPreferences == null) {
                                        zContains = false;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        s86Var.m10558D(!zM9018a);
                                    }
                                    if (zM9018a) {
                                        oa6.m9015k(mg6Var);
                                        mg6Var.m8307H();
                                    }
                                    vk6 vk6Var3 = oa6Var3.f26516h;
                                    oa6.m9015k(vk6Var3);
                                    vk6Var3.f32708i.mo3680f();
                                    oa6Var3.m9027n().m9147y(new AtomicReference());
                                    oa6Var3.m9027n().m9148z(s86Var.f29984W.m10190a());
                                }
                            }
                            ho6.m6466a();
                            if (op5Var.m9225E(null, e56.f17750Q0)) {
                                dn6Var2.mo5038t();
                                if (dn6Var2.m4594P() == 1) {
                                    jMax = Math.max(500L, ((((long) ((Integer) e56.f17826x0.m4379a(null)).intValue()) * 1000) + ((long) new Random().nextInt(5000))) - SystemClock.elapsedRealtime());
                                    if (jMax > 500) {
                                        oa6.m9016l(d76Var3);
                                        x66Var3.m12505b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                    }
                                    oa6.m9015k(mg6Var);
                                    mg6Var.mo5038t();
                                    nd6Var = mg6Var.f24907p;
                                    if (nd6Var == null) {
                                        nd6Var = new nd6(mg6Var, oa6Var2, (byte) 0);
                                        mg6Var.f24907p = nd6Var;
                                    }
                                    nd6Var.m6923b(jMax);
                                }
                            }
                            s86Var.f29974M.m6281b(true);
                        }
                        d76 d76Var15 = oa6Var.f26514f;
                        oa6.m9016l(d76Var15);
                        d76Var15.f16835j.m12504a("Failed to load metadata: Metadata bundle is null");
                        numValueOf = null;
                        if (numValueOf != null) {
                            stringArray = oa6Var.f26509a.getResources().getStringArray(numValueOf.intValue());
                            if (stringArray == null) {
                                listAsList = null;
                            } else {
                                listAsList = Arrays.asList(stringArray);
                            }
                        } else {
                            listAsList = null;
                        }
                        if (listAsList != null) {
                            e66Var3.f17858o = listAsList;
                            break;
                        }
                        if (listAsList.isEmpty()) {
                            it2 = listAsList.iterator();
                            do {
                                if (it2.hasNext()) {
                                    e66Var3.f17858o = listAsList;
                                    break;
                                } else {
                                    str3 = (String) it2.next();
                                    dn6Var3 = oa6Var5.f26517i;
                                    oa6.m9014j(dn6Var3);
                                }
                            } while (dn6Var3.m4618w0("safelisted event", str3));
                        } else {
                            oa6.m9016l(d76Var7);
                            d76Var7.f16840o.m12504a("Safelisted event list is empty. Ignoring");
                        }
                        if (packageManager != null) {
                            e66Var3.f17860q = y42.m12872u0(context2) ? 1 : 0;
                        } else {
                            e66Var3.f17860q = 0;
                        }
                        ((oa6) e66Var3.f36084a).f26507C.incrementAndGet();
                        e66Var3.f28230f = true;
                        zg6Var = new zg6();
                        zg6Var.f36084a = oa6Var3;
                        oa6Var3.f26505A++;
                        zg6Var.m9742v();
                        oa6Var3.f26529u = zg6Var;
                        if (!zg6Var.f28230f) {
                            C1077qn.m9989o(str);
                            return;
                        }
                        zg6Var.f36078g = (JobScheduler) ((oa6) zg6Var.f36084a).f26509a.getSystemService("jobscheduler");
                        atomicInteger.incrementAndGet();
                        zg6Var.f28230f = true;
                        oa6.m9016l(d76Var);
                        d76Var2 = d76Var;
                        x66Var = d76Var2.f16842q;
                        x66Var2 = d76Var2.f16841p;
                        x66Var3 = d76Var2.f16831L;
                        x66Var4 = d76Var2.f16835j;
                        op5Var.m9235z();
                        x66Var2.m12505b(130000L, "App measurement initialized, version");
                        oa6.m9016l(d76Var2);
                        x66Var2.m12504a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                        strM4936A = e66Var.m4936A();
                        if (dn6Var4.m4596U(strM4936A, op5Var.f26943g)) {
                            oa6.m9016l(d76Var2);
                            x66Var2.m12504a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                        } else {
                            oa6.m9016l(d76Var2);
                            x66Var2.m12504a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM4936A)));
                        }
                        oa6.m9016l(d76Var2);
                        x66Var.m12504a("Debug-level message logging enabled");
                        if (oa6Var3.f26505A != atomicInteger.get()) {
                            oa6.m9016l(d76Var2);
                            x66Var4.m12506c("Not all components initialized", Integer.valueOf(oa6Var3.f26505A), Integer.valueOf(atomicInteger.get()));
                        }
                        oa6Var3.f26530v = true;
                        j = oa6Var3.f26508D;
                        mg6Var = oa6Var3.f26521m;
                        oa6.m9016l(ea6Var);
                        ea6Var.mo5038t();
                        oa6.m9013i(oa6Var3.f26529u);
                        iM13552z = oa6Var3.f26529u.m13552z();
                        ho6.m6466a();
                        zM9225E = op5Var.m9225E(null, e56.f17750Q0);
                        if (iM13552z == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (zM9225E) {
                            dn6Var4.mo5038t();
                            if (dn6Var4.m4594P() == 1) {
                                dn6Var4.mo5038t();
                                IntentFilter intentFilter4 = new IntentFilter();
                                intentFilter4.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter4.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z2 = z;
                                o30 o30Var4 = new o30((byte) 1);
                                o30Var4.f26313b = oa6Var4;
                                VarHandle.storeStoreFence();
                                x66Var5 = x66Var2;
                                kx5.m7721m0(oa6Var4.f26509a, o30Var4, intentFilter4, null);
                                d76 d76Var16 = oa6Var4.f26514f;
                                oa6.m9016l(d76Var16);
                                d76Var16.f16842q.m12504a("Registered app receiver");
                                if (z2) {
                                    oa6.m9013i(oa6Var3.f26529u);
                                    oa6Var3.f26529u.m13551y(((Long) e56.f17721C.m4379a(null)).longValue());
                                }
                            } else if (z) {
                                z = true;
                                dn6Var4.mo5038t();
                                IntentFilter intentFilter5 = new IntentFilter();
                                intentFilter5.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter5.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z2 = z;
                                o30 o30Var5 = new o30((byte) 1);
                                o30Var5.f26313b = oa6Var4;
                                VarHandle.storeStoreFence();
                                x66Var5 = x66Var2;
                                kx5.m7721m0(oa6Var4.f26509a, o30Var5, intentFilter5, null);
                                d76 d76Var17 = oa6Var4.f26514f;
                                oa6.m9016l(d76Var17);
                                d76Var17.f16842q.m12504a("Registered app receiver");
                                if (z2) {
                                    oa6.m9013i(oa6Var3.f26529u);
                                    oa6Var3.f26529u.m13551y(((Long) e56.f17721C.m4379a(null)).longValue());
                                }
                            } else {
                                x66Var5 = x66Var2;
                            }
                        } else if (z) {
                            z = true;
                            dn6Var4.mo5038t();
                            IntentFilter intentFilter6 = new IntentFilter();
                            intentFilter6.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter6.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z2 = z;
                            o30 o30Var6 = new o30((byte) 1);
                            o30Var6.f26313b = oa6Var4;
                            VarHandle.storeStoreFence();
                            x66Var5 = x66Var2;
                            kx5.m7721m0(oa6Var4.f26509a, o30Var6, intentFilter6, null);
                            d76 d76Var18 = oa6Var4.f26514f;
                            oa6.m9016l(d76Var18);
                            d76Var18.f16842q.m12504a("Registered app receiver");
                            if (z2) {
                                oa6.m9013i(oa6Var3.f26529u);
                                oa6Var3.f26529u.m13551y(((Long) e56.f17721C.m4379a(null)).longValue());
                            }
                        } else {
                            x66Var5 = x66Var2;
                        }
                        c1126rz = s86Var.f29989k;
                        xc6VarM10556B = s86Var.m10556B();
                        int i5 = xc6VarM10556B.f34161b;
                        rc6VarM9230J = op5Var.m9230J("google_analytics_default_allow_ad_storage", false);
                        rc6VarM9230J2 = op5Var.m9230J("google_analytics_default_allow_analytics_storage", false);
                        rc6Var = rc6.UNINITIALIZED;
                        vc6Var = vc6.ANALYTICS_STORAGE;
                        if (rc6VarM9230J == rc6Var) {
                            dn6Var = dn6Var4;
                            j2 = j;
                            if (xc6.m12657l(-10, s86Var.m10560y().getInt("consent_source", 100))) {
                                EnumMap enumMap3 = new EnumMap(vc6.class);
                                enumMap3.put(vc6.AD_STORAGE, rc6VarM9230J);
                                enumMap3.put(vc6Var, rc6VarM9230J2);
                                xc6Var = new xc6(enumMap3, -10);
                            } else {
                                if (!TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                                    oa6.m9015k(mg6Var);
                                    mg6Var.m8316Q(new xc6(-10), false);
                                }
                                xc6Var = null;
                            }
                        } else {
                            dn6Var = dn6Var4;
                            j2 = j;
                            if (xc6.m12657l(-10, s86Var.m10560y().getInt("consent_source", 100))) {
                                EnumMap enumMap4 = new EnumMap(vc6.class);
                                enumMap4.put(vc6.AD_STORAGE, rc6VarM9230J);
                                enumMap4.put(vc6Var, rc6VarM9230J2);
                                xc6Var = new xc6(enumMap4, -10);
                            } else {
                                if (!TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                                    oa6.m9015k(mg6Var);
                                    mg6Var.m8316Q(new xc6(-10), false);
                                }
                                xc6Var = null;
                            }
                        }
                        if (xc6Var != null) {
                            oa6.m9015k(mg6Var);
                            mg6Var.m8316Q(xc6Var, true);
                        } else {
                            xc6Var = xc6VarM10556B;
                        }
                        oa6.m9015k(mg6Var);
                        oa6Var2 = (oa6) mg6Var.f36084a;
                        mg6Var.m8320y(xc6Var);
                        s86Var.mo5038t();
                        int i6 = mr5.m8386b(s86Var.m10560y().getString("dma_consent_settings", null)).f25171a;
                        rc6VarM9230J3 = op5Var.m9230J("google_analytics_default_allow_ad_personalization_signals", true);
                        if (rc6VarM9230J3 != rc6Var) {
                            oa6.m9016l(d76Var2);
                            x66Var3.m12505b(rc6VarM9230J3, "Default ad personalization consent from Manifest");
                        }
                        rc6VarM9230J4 = op5Var.m9230J("google_analytics_default_allow_ad_user_data", true);
                        if (rc6VarM9230J4 == rc6Var) {
                            if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                                if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                                    mr5VarM8387c = mr5.m8387c(30, bundle);
                                    it = mr5VarM8387c.f25175e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((rc6) it.next()) != rc6Var) {
                                            oa6.m9015k(mg6Var);
                                            mg6Var.m8315P(mr5VarM8387c, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                                mr5VarM8387c = mr5.m8387c(30, bundle);
                                it = mr5VarM8387c.f25175e.values().iterator();
                                while (it.hasNext()) {
                                    if (((rc6) it.next()) != rc6Var) {
                                        oa6.m9015k(mg6Var);
                                        mg6Var.m8315P(mr5VarM8387c, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                            if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                                mr5VarM8387c = mr5.m8387c(30, bundle);
                                it = mr5VarM8387c.f25175e.values().iterator();
                                while (it.hasNext()) {
                                    if (((rc6) it.next()) != rc6Var) {
                                        oa6.m9015k(mg6Var);
                                        mg6Var.m8315P(mr5VarM8387c, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                            mr5VarM8387c = mr5.m8387c(30, bundle);
                            it = mr5VarM8387c.f25175e.values().iterator();
                            while (it.hasNext()) {
                                if (((rc6) it.next()) != rc6Var) {
                                    oa6.m9015k(mg6Var);
                                    mg6Var.m8315P(mr5VarM8387c, true);
                                    break;
                                }
                            }
                        }
                        boolM9227G = op5Var.m9227G("google_analytics_tcf_data_enabled");
                        if (boolM9227G != null) {
                            oa6.m9016l(d76Var2);
                            x66Var.m12504a("TCF client enabled.");
                            oa6.m9015k(mg6Var);
                            mg6Var.mo5038t();
                            d76 d76Var19 = oa6Var2.f26514f;
                            oa6.m9016l(d76Var19);
                            d76Var19.f16842q.m12504a("Register tcfPrefChangeListener.");
                            if (mg6Var.f24895S == null) {
                                mg6Var.f24896T = new nd6(mg6Var, oa6Var2, (byte) 2);
                                fg6 fg6Var4 = new fg6();
                                fg6Var4.f18970a = mg6Var;
                                VarHandle.storeStoreFence();
                                mg6Var.f24895S = fg6Var4;
                            }
                            s86 s86Var7 = oa6Var2.f26513e;
                            oa6.m9014j(s86Var7);
                            s86Var7.m10561z().registerOnSharedPreferenceChangeListener(mg6Var.f24895S);
                            oa6.m9015k(mg6Var);
                            mg6Var.m8300A();
                        } else {
                            oa6.m9016l(d76Var2);
                            x66Var.m12504a("TCF client enabled.");
                            oa6.m9015k(mg6Var);
                            mg6Var.mo5038t();
                            d76 d76Var110 = oa6Var2.f26514f;
                            oa6.m9016l(d76Var110);
                            d76Var110.f16842q.m12504a("Register tcfPrefChangeListener.");
                            if (mg6Var.f24895S == null) {
                                mg6Var.f24896T = new nd6(mg6Var, oa6Var2, (byte) 2);
                                fg6 fg6Var5 = new fg6();
                                fg6Var5.f18970a = mg6Var;
                                VarHandle.storeStoreFence();
                                mg6Var.f24895S = fg6Var5;
                            }
                            s86 s86Var8 = oa6Var2.f26513e;
                            oa6.m9014j(s86Var8);
                            s86Var8.m10561z().registerOnSharedPreferenceChangeListener(mg6Var.f24895S);
                            oa6.m9015k(mg6Var);
                            mg6Var.m8300A();
                        }
                        n86Var = s86Var.f29988j;
                        if (n86Var.m8623a() == 0) {
                            oa6.m9016l(d76Var2);
                            x66Var3.m12505b(Long.valueOf(j2), "Persisting first open");
                            j3 = j2;
                            n86Var.m8624b(j3);
                        } else {
                            j3 = j2;
                        }
                        oa6.m9015k(mg6Var);
                        y86Var = mg6Var.f24892P;
                        if (y86Var.m13052d()) {
                            s86 s86Var9 = y86Var.f35029b.f26513e;
                            oa6.m9014j(s86Var9);
                            s86Var9.f29982U.m10507d(null);
                        }
                        if (oa6Var3.m9025h()) {
                            if (oa6Var3.m9018a()) {
                                dn6Var2 = dn6Var;
                                if (dn6Var2.m4595R("android.permission.INTERNET")) {
                                    oa6.m9016l(d76Var2);
                                    x66Var6 = x66Var4;
                                    x66Var6.m12504a("App is missing INTERNET permission");
                                } else {
                                    x66Var6 = x66Var4;
                                }
                                if (!dn6Var2.m4595R("android.permission.ACCESS_NETWORK_STATE")) {
                                    oa6.m9016l(d76Var2);
                                    x66Var6.m12504a("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                context = oa6Var3.f26509a;
                                if (!r35.m10189a(context).m12999c()) {
                                    if (!dn6.m4573k0(context)) {
                                        oa6.m9016l(d76Var2);
                                        x66Var6.m12504a("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!dn6.m4567N(context)) {
                                        oa6.m9016l(d76Var2);
                                        x66Var6.m12504a("AppMeasurementService not registered/enabled");
                                    }
                                }
                                oa6.m9016l(d76Var2);
                                x66Var6.m12504a("Uploading is not possible. App measurement disabled");
                            } else {
                                dn6Var2 = dn6Var;
                            }
                            d76Var3 = d76Var2;
                        } else {
                            dn6Var2 = dn6Var;
                            if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                                String strM4937B5 = oa6Var3.m9029p().m4937B();
                                s86Var.mo5038t();
                                String string4 = s86Var.m10560y().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strM4937B5);
                                boolean zIsEmpty4 = TextUtils.isEmpty(string4);
                                if (zIsEmpty) {
                                    c1126rz2 = c1126rz;
                                } else {
                                    c1126rz2 = c1126rz;
                                }
                                String strM4937B6 = oa6Var3.m9029p().m4937B();
                                s86Var.mo5038t();
                                SharedPreferences.Editor editorEdit6 = s86Var.m10560y().edit();
                                editorEdit6.putString("gmp_app_id", strM4937B6);
                                editorEdit6.apply();
                            } else {
                                c1126rz2 = c1126rz;
                            }
                            if (!s86Var.m10556B().m12660i(vc6Var)) {
                                c1126rz2.m10507d(null);
                            }
                            oa6.m9015k(mg6Var);
                            mg6Var.f24902k.set(c1126rz2.m10506c());
                            oa6Var4.f26509a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            d76Var3 = d76Var2;
                            if (!TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                                zM9018a = oa6Var3.m9018a();
                                sharedPreferences = s86Var.f29985g;
                                if (sharedPreferences == null) {
                                    zContains = false;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains) {
                                    s86Var.m10558D(!zM9018a);
                                }
                                if (zM9018a) {
                                    oa6.m9015k(mg6Var);
                                    mg6Var.m8307H();
                                }
                                vk6 vk6Var4 = oa6Var3.f26516h;
                                oa6.m9015k(vk6Var4);
                                vk6Var4.f32708i.mo3680f();
                                oa6Var3.m9027n().m9147y(new AtomicReference());
                                oa6Var3.m9027n().m9148z(s86Var.f29984W.m10190a());
                            }
                        }
                        ho6.m6466a();
                        if (op5Var.m9225E(null, e56.f17750Q0)) {
                            dn6Var2.mo5038t();
                            if (dn6Var2.m4594P() == 1) {
                                jMax = Math.max(500L, ((((long) ((Integer) e56.f17826x0.m4379a(null)).intValue()) * 1000) + ((long) new Random().nextInt(5000))) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    oa6.m9016l(d76Var3);
                                    x66Var3.m12505b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                oa6.m9015k(mg6Var);
                                mg6Var.mo5038t();
                                nd6Var = mg6Var.f24907p;
                                if (nd6Var == null) {
                                    nd6Var = new nd6(mg6Var, oa6Var2, (byte) 0);
                                    mg6Var.f24907p = nd6Var;
                                }
                                nd6Var.m6923b(jMax);
                            }
                        }
                        s86Var.f29974M.m6281b(true);
                    }
                    str6 = "manual_install";
                    packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                    if (packageInfo != null) {
                        applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        if (TextUtils.isEmpty(applicationLabel)) {
                            string = applicationLabel.toString();
                        } else {
                            string = "Unknown";
                        }
                        str2 = packageInfo.versionName;
                        i = packageInfo.versionCode;
                    }
                } catch (PackageManager.NameNotFoundException unused5) {
                    string = "Unknown";
                }
                installerPackageName = str6;
                String str8 = installerPackageName;
                e66Var3.f17850g = packageName;
                e66Var3.f17853j = str8;
                e66Var3.f17851h = str2;
                e66Var3.f17852i = i;
                e66Var3.f17854k = string;
                e66Var3.f17855l = 0L;
                iM9024g = oa6Var5.m9024g();
                if (iM9024g == 0) {
                    oa6.m9016l(d76Var7);
                    d76Var7.f16831L.m12504a("App measurement collection enabled");
                } else if (iM9024g == 1) {
                    oa6.m9016l(d76Var7);
                    d76Var7.f16841p.m12504a("App measurement deactivated via the manifest");
                } else if (iM9024g == 3) {
                    oa6.m9016l(d76Var7);
                    d76Var7.f16841p.m12504a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iM9024g == 4) {
                    oa6.m9016l(d76Var7);
                    d76Var7.f16841p.m12504a("App measurement disabled via the manifest");
                } else if (iM9024g == 6) {
                    oa6.m9016l(d76Var7);
                    d76Var7.f16840o.m12504a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iM9024g == 7) {
                    oa6.m9016l(d76Var7);
                    d76Var7.f16841p.m12504a("App measurement disabled via the global data collection setting");
                } else if (iM9024g != 8) {
                    oa6.m9016l(d76Var7);
                    d76Var7.f16841p.m12504a("App measurement disabled");
                    oa6.m9016l(d76Var7);
                    d76Var7.f16836k.m12504a("Invalid scion state in identity");
                } else {
                    oa6.m9016l(d76Var7);
                    d76Var7.f16841p.m12504a("App measurement disabled due to denied storage consent");
                }
                e66Var3.f17846L = "";
                strM6958a = iw5.m6958a(context2, oa6Var5.f26524p);
                if (!TextUtils.isEmpty(strM6958a)) {
                    str4 = strM6958a;
                }
                e66Var3.f17846L = str4;
                if (iM9024g == 0) {
                    oa6.m9016l(d76Var7);
                    d76Var7.f16831L.m12506c("App measurement enabled for app package, google app id", e66Var3.f17850g, e66Var3.f17846L);
                }
                e66Var3.f17858o = null;
                op5 op5Var3 = oa6Var5.f26512d;
                oa6Var = (oa6) op5Var3.f36084a;
                y42.m12851X("analytics.safelisted_events");
                bundleM9226F = op5Var3.m9226F();
                if (bundleM9226F != null) {
                    if (bundleM9226F.containsKey("analytics.safelisted_events")) {
                        numValueOf = Integer.valueOf(bundleM9226F.getInt("analytics.safelisted_events"));
                    }
                    if (numValueOf != null) {
                        stringArray = oa6Var.f26509a.getResources().getStringArray(numValueOf.intValue());
                        if (stringArray == null) {
                            listAsList = null;
                        } else {
                            listAsList = Arrays.asList(stringArray);
                        }
                    } else {
                        listAsList = null;
                    }
                    if (listAsList != null) {
                        e66Var3.f17858o = listAsList;
                        break;
                    }
                    if (listAsList.isEmpty()) {
                        it2 = listAsList.iterator();
                        do {
                            if (it2.hasNext()) {
                                e66Var3.f17858o = listAsList;
                                break;
                            } else {
                                str3 = (String) it2.next();
                                dn6Var3 = oa6Var5.f26517i;
                                oa6.m9014j(dn6Var3);
                            }
                        } while (dn6Var3.m4618w0("safelisted event", str3));
                    } else {
                        oa6.m9016l(d76Var7);
                        d76Var7.f16840o.m12504a("Safelisted event list is empty. Ignoring");
                    }
                    if (packageManager != null) {
                        e66Var3.f17860q = y42.m12872u0(context2) ? 1 : 0;
                    } else {
                        e66Var3.f17860q = 0;
                    }
                    ((oa6) e66Var3.f36084a).f26507C.incrementAndGet();
                    e66Var3.f28230f = true;
                    zg6Var = new zg6();
                    zg6Var.f36084a = oa6Var3;
                    oa6Var3.f26505A++;
                    zg6Var.m9742v();
                    oa6Var3.f26529u = zg6Var;
                    if (!zg6Var.f28230f) {
                        C1077qn.m9989o(str);
                        return;
                    }
                    zg6Var.f36078g = (JobScheduler) ((oa6) zg6Var.f36084a).f26509a.getSystemService("jobscheduler");
                    atomicInteger.incrementAndGet();
                    zg6Var.f28230f = true;
                    oa6.m9016l(d76Var);
                    d76Var2 = d76Var;
                    x66Var = d76Var2.f16842q;
                    x66Var2 = d76Var2.f16841p;
                    x66Var3 = d76Var2.f16831L;
                    x66Var4 = d76Var2.f16835j;
                    op5Var.m9235z();
                    x66Var2.m12505b(130000L, "App measurement initialized, version");
                    oa6.m9016l(d76Var2);
                    x66Var2.m12504a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                    strM4936A = e66Var.m4936A();
                    if (dn6Var4.m4596U(strM4936A, op5Var.f26943g)) {
                        oa6.m9016l(d76Var2);
                        x66Var2.m12504a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        oa6.m9016l(d76Var2);
                        x66Var2.m12504a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM4936A)));
                    }
                    oa6.m9016l(d76Var2);
                    x66Var.m12504a("Debug-level message logging enabled");
                    if (oa6Var3.f26505A != atomicInteger.get()) {
                        oa6.m9016l(d76Var2);
                        x66Var4.m12506c("Not all components initialized", Integer.valueOf(oa6Var3.f26505A), Integer.valueOf(atomicInteger.get()));
                    }
                    oa6Var3.f26530v = true;
                    j = oa6Var3.f26508D;
                    mg6Var = oa6Var3.f26521m;
                    oa6.m9016l(ea6Var);
                    ea6Var.mo5038t();
                    oa6.m9013i(oa6Var3.f26529u);
                    iM13552z = oa6Var3.f26529u.m13552z();
                    ho6.m6466a();
                    zM9225E = op5Var.m9225E(null, e56.f17750Q0);
                    if (iM13552z == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (zM9225E) {
                        dn6Var4.mo5038t();
                        if (dn6Var4.m4594P() == 1) {
                            dn6Var4.mo5038t();
                            IntentFilter intentFilter7 = new IntentFilter();
                            intentFilter7.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter7.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z2 = z;
                            o30 o30Var7 = new o30((byte) 1);
                            o30Var7.f26313b = oa6Var4;
                            VarHandle.storeStoreFence();
                            x66Var5 = x66Var2;
                            kx5.m7721m0(oa6Var4.f26509a, o30Var7, intentFilter7, null);
                            d76 d76Var111 = oa6Var4.f26514f;
                            oa6.m9016l(d76Var111);
                            d76Var111.f16842q.m12504a("Registered app receiver");
                            if (z2) {
                                oa6.m9013i(oa6Var3.f26529u);
                                oa6Var3.f26529u.m13551y(((Long) e56.f17721C.m4379a(null)).longValue());
                            }
                        } else if (z) {
                            z = true;
                            dn6Var4.mo5038t();
                            IntentFilter intentFilter8 = new IntentFilter();
                            intentFilter8.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter8.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z2 = z;
                            o30 o30Var8 = new o30((byte) 1);
                            o30Var8.f26313b = oa6Var4;
                            VarHandle.storeStoreFence();
                            x66Var5 = x66Var2;
                            kx5.m7721m0(oa6Var4.f26509a, o30Var8, intentFilter8, null);
                            d76 d76Var112 = oa6Var4.f26514f;
                            oa6.m9016l(d76Var112);
                            d76Var112.f16842q.m12504a("Registered app receiver");
                            if (z2) {
                                oa6.m9013i(oa6Var3.f26529u);
                                oa6Var3.f26529u.m13551y(((Long) e56.f17721C.m4379a(null)).longValue());
                            }
                        } else {
                            x66Var5 = x66Var2;
                        }
                    } else if (z) {
                        z = true;
                        dn6Var4.mo5038t();
                        IntentFilter intentFilter9 = new IntentFilter();
                        intentFilter9.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter9.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z2 = z;
                        o30 o30Var9 = new o30((byte) 1);
                        o30Var9.f26313b = oa6Var4;
                        VarHandle.storeStoreFence();
                        x66Var5 = x66Var2;
                        kx5.m7721m0(oa6Var4.f26509a, o30Var9, intentFilter9, null);
                        d76 d76Var113 = oa6Var4.f26514f;
                        oa6.m9016l(d76Var113);
                        d76Var113.f16842q.m12504a("Registered app receiver");
                        if (z2) {
                            oa6.m9013i(oa6Var3.f26529u);
                            oa6Var3.f26529u.m13551y(((Long) e56.f17721C.m4379a(null)).longValue());
                        }
                    } else {
                        x66Var5 = x66Var2;
                    }
                    c1126rz = s86Var.f29989k;
                    xc6VarM10556B = s86Var.m10556B();
                    int i7 = xc6VarM10556B.f34161b;
                    rc6VarM9230J = op5Var.m9230J("google_analytics_default_allow_ad_storage", false);
                    rc6VarM9230J2 = op5Var.m9230J("google_analytics_default_allow_analytics_storage", false);
                    rc6Var = rc6.UNINITIALIZED;
                    vc6Var = vc6.ANALYTICS_STORAGE;
                    if (rc6VarM9230J == rc6Var) {
                        dn6Var = dn6Var4;
                        j2 = j;
                        if (xc6.m12657l(-10, s86Var.m10560y().getInt("consent_source", 100))) {
                            EnumMap enumMap5 = new EnumMap(vc6.class);
                            enumMap5.put(vc6.AD_STORAGE, rc6VarM9230J);
                            enumMap5.put(vc6Var, rc6VarM9230J2);
                            xc6Var = new xc6(enumMap5, -10);
                        } else {
                            if (!TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                                oa6.m9015k(mg6Var);
                                mg6Var.m8316Q(new xc6(-10), false);
                            }
                            xc6Var = null;
                        }
                    } else {
                        dn6Var = dn6Var4;
                        j2 = j;
                        if (xc6.m12657l(-10, s86Var.m10560y().getInt("consent_source", 100))) {
                            EnumMap enumMap6 = new EnumMap(vc6.class);
                            enumMap6.put(vc6.AD_STORAGE, rc6VarM9230J);
                            enumMap6.put(vc6Var, rc6VarM9230J2);
                            xc6Var = new xc6(enumMap6, -10);
                        } else {
                            if (!TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                                oa6.m9015k(mg6Var);
                                mg6Var.m8316Q(new xc6(-10), false);
                            }
                            xc6Var = null;
                        }
                    }
                    if (xc6Var != null) {
                        oa6.m9015k(mg6Var);
                        mg6Var.m8316Q(xc6Var, true);
                    } else {
                        xc6Var = xc6VarM10556B;
                    }
                    oa6.m9015k(mg6Var);
                    oa6Var2 = (oa6) mg6Var.f36084a;
                    mg6Var.m8320y(xc6Var);
                    s86Var.mo5038t();
                    int i8 = mr5.m8386b(s86Var.m10560y().getString("dma_consent_settings", null)).f25171a;
                    rc6VarM9230J3 = op5Var.m9230J("google_analytics_default_allow_ad_personalization_signals", true);
                    if (rc6VarM9230J3 != rc6Var) {
                        oa6.m9016l(d76Var2);
                        x66Var3.m12505b(rc6VarM9230J3, "Default ad personalization consent from Manifest");
                    }
                    rc6VarM9230J4 = op5Var.m9230J("google_analytics_default_allow_ad_user_data", true);
                    if (rc6VarM9230J4 == rc6Var) {
                        if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                            if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                                mr5VarM8387c = mr5.m8387c(30, bundle);
                                it = mr5VarM8387c.f25175e.values().iterator();
                                while (it.hasNext()) {
                                    if (((rc6) it.next()) != rc6Var) {
                                        oa6.m9015k(mg6Var);
                                        mg6Var.m8315P(mr5VarM8387c, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                            mr5VarM8387c = mr5.m8387c(30, bundle);
                            it = mr5VarM8387c.f25175e.values().iterator();
                            while (it.hasNext()) {
                                if (((rc6) it.next()) != rc6Var) {
                                    oa6.m9015k(mg6Var);
                                    mg6Var.m8315P(mr5VarM8387c, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                        if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                            mr5VarM8387c = mr5.m8387c(30, bundle);
                            it = mr5VarM8387c.f25175e.values().iterator();
                            while (it.hasNext()) {
                                if (((rc6) it.next()) != rc6Var) {
                                    oa6.m9015k(mg6Var);
                                    mg6Var.m8315P(mr5VarM8387c, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                        mr5VarM8387c = mr5.m8387c(30, bundle);
                        it = mr5VarM8387c.f25175e.values().iterator();
                        while (it.hasNext()) {
                            if (((rc6) it.next()) != rc6Var) {
                                oa6.m9015k(mg6Var);
                                mg6Var.m8315P(mr5VarM8387c, true);
                                break;
                            }
                        }
                    }
                    boolM9227G = op5Var.m9227G("google_analytics_tcf_data_enabled");
                    if (boolM9227G != null) {
                        oa6.m9016l(d76Var2);
                        x66Var.m12504a("TCF client enabled.");
                        oa6.m9015k(mg6Var);
                        mg6Var.mo5038t();
                        d76 d76Var114 = oa6Var2.f26514f;
                        oa6.m9016l(d76Var114);
                        d76Var114.f16842q.m12504a("Register tcfPrefChangeListener.");
                        if (mg6Var.f24895S == null) {
                            mg6Var.f24896T = new nd6(mg6Var, oa6Var2, (byte) 2);
                            fg6 fg6Var6 = new fg6();
                            fg6Var6.f18970a = mg6Var;
                            VarHandle.storeStoreFence();
                            mg6Var.f24895S = fg6Var6;
                        }
                        s86 s86Var10 = oa6Var2.f26513e;
                        oa6.m9014j(s86Var10);
                        s86Var10.m10561z().registerOnSharedPreferenceChangeListener(mg6Var.f24895S);
                        oa6.m9015k(mg6Var);
                        mg6Var.m8300A();
                    } else {
                        oa6.m9016l(d76Var2);
                        x66Var.m12504a("TCF client enabled.");
                        oa6.m9015k(mg6Var);
                        mg6Var.mo5038t();
                        d76 d76Var115 = oa6Var2.f26514f;
                        oa6.m9016l(d76Var115);
                        d76Var115.f16842q.m12504a("Register tcfPrefChangeListener.");
                        if (mg6Var.f24895S == null) {
                            mg6Var.f24896T = new nd6(mg6Var, oa6Var2, (byte) 2);
                            fg6 fg6Var7 = new fg6();
                            fg6Var7.f18970a = mg6Var;
                            VarHandle.storeStoreFence();
                            mg6Var.f24895S = fg6Var7;
                        }
                        s86 s86Var11 = oa6Var2.f26513e;
                        oa6.m9014j(s86Var11);
                        s86Var11.m10561z().registerOnSharedPreferenceChangeListener(mg6Var.f24895S);
                        oa6.m9015k(mg6Var);
                        mg6Var.m8300A();
                    }
                    n86Var = s86Var.f29988j;
                    if (n86Var.m8623a() == 0) {
                        oa6.m9016l(d76Var2);
                        x66Var3.m12505b(Long.valueOf(j2), "Persisting first open");
                        j3 = j2;
                        n86Var.m8624b(j3);
                    } else {
                        j3 = j2;
                    }
                    oa6.m9015k(mg6Var);
                    y86Var = mg6Var.f24892P;
                    if (y86Var.m13052d()) {
                        s86 s86Var12 = y86Var.f35029b.f26513e;
                        oa6.m9014j(s86Var12);
                        s86Var12.f29982U.m10507d(null);
                    }
                    if (oa6Var3.m9025h()) {
                        if (oa6Var3.m9018a()) {
                            dn6Var2 = dn6Var;
                            if (dn6Var2.m4595R("android.permission.INTERNET")) {
                                oa6.m9016l(d76Var2);
                                x66Var6 = x66Var4;
                                x66Var6.m12504a("App is missing INTERNET permission");
                            } else {
                                x66Var6 = x66Var4;
                            }
                            if (!dn6Var2.m4595R("android.permission.ACCESS_NETWORK_STATE")) {
                                oa6.m9016l(d76Var2);
                                x66Var6.m12504a("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            context = oa6Var3.f26509a;
                            if (!r35.m10189a(context).m12999c()) {
                                if (!dn6.m4573k0(context)) {
                                    oa6.m9016l(d76Var2);
                                    x66Var6.m12504a("AppMeasurementReceiver not registered/enabled");
                                }
                                if (!dn6.m4567N(context)) {
                                    oa6.m9016l(d76Var2);
                                    x66Var6.m12504a("AppMeasurementService not registered/enabled");
                                }
                            }
                            oa6.m9016l(d76Var2);
                            x66Var6.m12504a("Uploading is not possible. App measurement disabled");
                        } else {
                            dn6Var2 = dn6Var;
                        }
                        d76Var3 = d76Var2;
                    } else {
                        dn6Var2 = dn6Var;
                        if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                            String strM4937B7 = oa6Var3.m9029p().m4937B();
                            s86Var.mo5038t();
                            String string5 = s86Var.m10560y().getString("gmp_app_id", null);
                            zIsEmpty = TextUtils.isEmpty(strM4937B7);
                            boolean zIsEmpty5 = TextUtils.isEmpty(string5);
                            if (zIsEmpty) {
                                c1126rz2 = c1126rz;
                            } else {
                                c1126rz2 = c1126rz;
                            }
                            String strM4937B8 = oa6Var3.m9029p().m4937B();
                            s86Var.mo5038t();
                            SharedPreferences.Editor editorEdit7 = s86Var.m10560y().edit();
                            editorEdit7.putString("gmp_app_id", strM4937B8);
                            editorEdit7.apply();
                        } else {
                            c1126rz2 = c1126rz;
                        }
                        if (!s86Var.m10556B().m12660i(vc6Var)) {
                            c1126rz2.m10507d(null);
                        }
                        oa6.m9015k(mg6Var);
                        mg6Var.f24902k.set(c1126rz2.m10506c());
                        oa6Var4.f26509a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        d76Var3 = d76Var2;
                        if (!TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                            zM9018a = oa6Var3.m9018a();
                            sharedPreferences = s86Var.f29985g;
                            if (sharedPreferences == null) {
                                zContains = false;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                s86Var.m10558D(!zM9018a);
                            }
                            if (zM9018a) {
                                oa6.m9015k(mg6Var);
                                mg6Var.m8307H();
                            }
                            vk6 vk6Var5 = oa6Var3.f26516h;
                            oa6.m9015k(vk6Var5);
                            vk6Var5.f32708i.mo3680f();
                            oa6Var3.m9027n().m9147y(new AtomicReference());
                            oa6Var3.m9027n().m9148z(s86Var.f29984W.m10190a());
                        }
                    }
                    ho6.m6466a();
                    if (op5Var.m9225E(null, e56.f17750Q0)) {
                        dn6Var2.mo5038t();
                        if (dn6Var2.m4594P() == 1) {
                            jMax = Math.max(500L, ((((long) ((Integer) e56.f17826x0.m4379a(null)).intValue()) * 1000) + ((long) new Random().nextInt(5000))) - SystemClock.elapsedRealtime());
                            if (jMax > 500) {
                                oa6.m9016l(d76Var3);
                                x66Var3.m12505b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
                            oa6.m9015k(mg6Var);
                            mg6Var.mo5038t();
                            nd6Var = mg6Var.f24907p;
                            if (nd6Var == null) {
                                nd6Var = new nd6(mg6Var, oa6Var2, (byte) 0);
                                mg6Var.f24907p = nd6Var;
                            }
                            nd6Var.m6923b(jMax);
                        }
                    }
                    s86Var.f29974M.m6281b(true);
                }
                d76 d76Var116 = oa6Var.f26514f;
                oa6.m9016l(d76Var116);
                d76Var116.f16835j.m12504a("Failed to load metadata: Metadata bundle is null");
                numValueOf = null;
                if (numValueOf != null) {
                    stringArray = oa6Var.f26509a.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = null;
                    } else {
                        listAsList = Arrays.asList(stringArray);
                    }
                } else {
                    listAsList = null;
                }
                if (listAsList != null) {
                    e66Var3.f17858o = listAsList;
                    break;
                }
                if (listAsList.isEmpty()) {
                    it2 = listAsList.iterator();
                    do {
                        if (it2.hasNext()) {
                            e66Var3.f17858o = listAsList;
                            break;
                        } else {
                            str3 = (String) it2.next();
                            dn6Var3 = oa6Var5.f26517i;
                            oa6.m9014j(dn6Var3);
                        }
                    } while (dn6Var3.m4618w0("safelisted event", str3));
                } else {
                    oa6.m9016l(d76Var7);
                    d76Var7.f16840o.m12504a("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    e66Var3.f17860q = y42.m12872u0(context2) ? 1 : 0;
                } else {
                    e66Var3.f17860q = 0;
                }
                ((oa6) e66Var3.f36084a).f26507C.incrementAndGet();
                e66Var3.f28230f = true;
                zg6Var = new zg6();
                zg6Var.f36084a = oa6Var3;
                oa6Var3.f26505A++;
                zg6Var.m9742v();
                oa6Var3.f26529u = zg6Var;
                if (!zg6Var.f28230f) {
                    C1077qn.m9989o(str);
                    return;
                }
                zg6Var.f36078g = (JobScheduler) ((oa6) zg6Var.f36084a).f26509a.getSystemService("jobscheduler");
                atomicInteger.incrementAndGet();
                zg6Var.f28230f = true;
                oa6.m9016l(d76Var);
                d76Var2 = d76Var;
                x66Var = d76Var2.f16842q;
                x66Var2 = d76Var2.f16841p;
                x66Var3 = d76Var2.f16831L;
                x66Var4 = d76Var2.f16835j;
                op5Var.m9235z();
                x66Var2.m12505b(130000L, "App measurement initialized, version");
                oa6.m9016l(d76Var2);
                x66Var2.m12504a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                strM4936A = e66Var.m4936A();
                if (dn6Var4.m4596U(strM4936A, op5Var.f26943g)) {
                    oa6.m9016l(d76Var2);
                    x66Var2.m12504a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                } else {
                    oa6.m9016l(d76Var2);
                    x66Var2.m12504a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM4936A)));
                }
                oa6.m9016l(d76Var2);
                x66Var.m12504a("Debug-level message logging enabled");
                if (oa6Var3.f26505A != atomicInteger.get()) {
                    oa6.m9016l(d76Var2);
                    x66Var4.m12506c("Not all components initialized", Integer.valueOf(oa6Var3.f26505A), Integer.valueOf(atomicInteger.get()));
                }
                oa6Var3.f26530v = true;
                j = oa6Var3.f26508D;
                mg6Var = oa6Var3.f26521m;
                oa6.m9016l(ea6Var);
                ea6Var.mo5038t();
                oa6.m9013i(oa6Var3.f26529u);
                iM13552z = oa6Var3.f26529u.m13552z();
                ho6.m6466a();
                zM9225E = op5Var.m9225E(null, e56.f17750Q0);
                if (iM13552z == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (zM9225E) {
                    dn6Var4.mo5038t();
                    if (dn6Var4.m4594P() == 1) {
                        dn6Var4.mo5038t();
                        IntentFilter intentFilter10 = new IntentFilter();
                        intentFilter10.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter10.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z2 = z;
                        o30 o30Var10 = new o30((byte) 1);
                        o30Var10.f26313b = oa6Var4;
                        VarHandle.storeStoreFence();
                        x66Var5 = x66Var2;
                        kx5.m7721m0(oa6Var4.f26509a, o30Var10, intentFilter10, null);
                        d76 d76Var117 = oa6Var4.f26514f;
                        oa6.m9016l(d76Var117);
                        d76Var117.f16842q.m12504a("Registered app receiver");
                        if (z2) {
                            oa6.m9013i(oa6Var3.f26529u);
                            oa6Var3.f26529u.m13551y(((Long) e56.f17721C.m4379a(null)).longValue());
                        }
                    } else if (z) {
                        z = true;
                        dn6Var4.mo5038t();
                        IntentFilter intentFilter11 = new IntentFilter();
                        intentFilter11.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter11.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z2 = z;
                        o30 o30Var11 = new o30((byte) 1);
                        o30Var11.f26313b = oa6Var4;
                        VarHandle.storeStoreFence();
                        x66Var5 = x66Var2;
                        kx5.m7721m0(oa6Var4.f26509a, o30Var11, intentFilter11, null);
                        d76 d76Var118 = oa6Var4.f26514f;
                        oa6.m9016l(d76Var118);
                        d76Var118.f16842q.m12504a("Registered app receiver");
                        if (z2) {
                            oa6.m9013i(oa6Var3.f26529u);
                            oa6Var3.f26529u.m13551y(((Long) e56.f17721C.m4379a(null)).longValue());
                        }
                    } else {
                        x66Var5 = x66Var2;
                    }
                } else if (z) {
                    z = true;
                    dn6Var4.mo5038t();
                    IntentFilter intentFilter12 = new IntentFilter();
                    intentFilter12.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter12.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z2 = z;
                    o30 o30Var12 = new o30((byte) 1);
                    o30Var12.f26313b = oa6Var4;
                    VarHandle.storeStoreFence();
                    x66Var5 = x66Var2;
                    kx5.m7721m0(oa6Var4.f26509a, o30Var12, intentFilter12, null);
                    d76 d76Var119 = oa6Var4.f26514f;
                    oa6.m9016l(d76Var119);
                    d76Var119.f16842q.m12504a("Registered app receiver");
                    if (z2) {
                        oa6.m9013i(oa6Var3.f26529u);
                        oa6Var3.f26529u.m13551y(((Long) e56.f17721C.m4379a(null)).longValue());
                    }
                } else {
                    x66Var5 = x66Var2;
                }
                c1126rz = s86Var.f29989k;
                xc6VarM10556B = s86Var.m10556B();
                int i9 = xc6VarM10556B.f34161b;
                rc6VarM9230J = op5Var.m9230J("google_analytics_default_allow_ad_storage", false);
                rc6VarM9230J2 = op5Var.m9230J("google_analytics_default_allow_analytics_storage", false);
                rc6Var = rc6.UNINITIALIZED;
                vc6Var = vc6.ANALYTICS_STORAGE;
                if (rc6VarM9230J == rc6Var) {
                    dn6Var = dn6Var4;
                    j2 = j;
                    if (xc6.m12657l(-10, s86Var.m10560y().getInt("consent_source", 100))) {
                        EnumMap enumMap7 = new EnumMap(vc6.class);
                        enumMap7.put(vc6.AD_STORAGE, rc6VarM9230J);
                        enumMap7.put(vc6Var, rc6VarM9230J2);
                        xc6Var = new xc6(enumMap7, -10);
                    } else {
                        if (!TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                            oa6.m9015k(mg6Var);
                            mg6Var.m8316Q(new xc6(-10), false);
                        }
                        xc6Var = null;
                    }
                } else {
                    dn6Var = dn6Var4;
                    j2 = j;
                    if (xc6.m12657l(-10, s86Var.m10560y().getInt("consent_source", 100))) {
                        EnumMap enumMap8 = new EnumMap(vc6.class);
                        enumMap8.put(vc6.AD_STORAGE, rc6VarM9230J);
                        enumMap8.put(vc6Var, rc6VarM9230J2);
                        xc6Var = new xc6(enumMap8, -10);
                    } else {
                        if (!TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                            oa6.m9015k(mg6Var);
                            mg6Var.m8316Q(new xc6(-10), false);
                        }
                        xc6Var = null;
                    }
                }
                if (xc6Var != null) {
                    oa6.m9015k(mg6Var);
                    mg6Var.m8316Q(xc6Var, true);
                } else {
                    xc6Var = xc6VarM10556B;
                }
                oa6.m9015k(mg6Var);
                oa6Var2 = (oa6) mg6Var.f36084a;
                mg6Var.m8320y(xc6Var);
                s86Var.mo5038t();
                int i10 = mr5.m8386b(s86Var.m10560y().getString("dma_consent_settings", null)).f25171a;
                rc6VarM9230J3 = op5Var.m9230J("google_analytics_default_allow_ad_personalization_signals", true);
                if (rc6VarM9230J3 != rc6Var) {
                    oa6.m9016l(d76Var2);
                    x66Var3.m12505b(rc6VarM9230J3, "Default ad personalization consent from Manifest");
                }
                rc6VarM9230J4 = op5Var.m9230J("google_analytics_default_allow_ad_user_data", true);
                if (rc6VarM9230J4 == rc6Var) {
                    if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                        if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                            mr5VarM8387c = mr5.m8387c(30, bundle);
                            it = mr5VarM8387c.f25175e.values().iterator();
                            while (it.hasNext()) {
                                if (((rc6) it.next()) != rc6Var) {
                                    oa6.m9015k(mg6Var);
                                    mg6Var.m8315P(mr5VarM8387c, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                        mr5VarM8387c = mr5.m8387c(30, bundle);
                        it = mr5VarM8387c.f25175e.values().iterator();
                        while (it.hasNext()) {
                            if (((rc6) it.next()) != rc6Var) {
                                oa6.m9015k(mg6Var);
                                mg6Var.m8315P(mr5VarM8387c, true);
                                break;
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                    if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                        mr5VarM8387c = mr5.m8387c(30, bundle);
                        it = mr5VarM8387c.f25175e.values().iterator();
                        while (it.hasNext()) {
                            if (((rc6) it.next()) != rc6Var) {
                                oa6.m9015k(mg6Var);
                                mg6Var.m8315P(mr5VarM8387c, true);
                                break;
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                    mr5VarM8387c = mr5.m8387c(30, bundle);
                    it = mr5VarM8387c.f25175e.values().iterator();
                    while (it.hasNext()) {
                        if (((rc6) it.next()) != rc6Var) {
                            oa6.m9015k(mg6Var);
                            mg6Var.m8315P(mr5VarM8387c, true);
                            break;
                        }
                    }
                }
                boolM9227G = op5Var.m9227G("google_analytics_tcf_data_enabled");
                if (boolM9227G != null) {
                    oa6.m9016l(d76Var2);
                    x66Var.m12504a("TCF client enabled.");
                    oa6.m9015k(mg6Var);
                    mg6Var.mo5038t();
                    d76 d76Var1110 = oa6Var2.f26514f;
                    oa6.m9016l(d76Var1110);
                    d76Var1110.f16842q.m12504a("Register tcfPrefChangeListener.");
                    if (mg6Var.f24895S == null) {
                        mg6Var.f24896T = new nd6(mg6Var, oa6Var2, (byte) 2);
                        fg6 fg6Var8 = new fg6();
                        fg6Var8.f18970a = mg6Var;
                        VarHandle.storeStoreFence();
                        mg6Var.f24895S = fg6Var8;
                    }
                    s86 s86Var13 = oa6Var2.f26513e;
                    oa6.m9014j(s86Var13);
                    s86Var13.m10561z().registerOnSharedPreferenceChangeListener(mg6Var.f24895S);
                    oa6.m9015k(mg6Var);
                    mg6Var.m8300A();
                } else {
                    oa6.m9016l(d76Var2);
                    x66Var.m12504a("TCF client enabled.");
                    oa6.m9015k(mg6Var);
                    mg6Var.mo5038t();
                    d76 d76Var1111 = oa6Var2.f26514f;
                    oa6.m9016l(d76Var1111);
                    d76Var1111.f16842q.m12504a("Register tcfPrefChangeListener.");
                    if (mg6Var.f24895S == null) {
                        mg6Var.f24896T = new nd6(mg6Var, oa6Var2, (byte) 2);
                        fg6 fg6Var9 = new fg6();
                        fg6Var9.f18970a = mg6Var;
                        VarHandle.storeStoreFence();
                        mg6Var.f24895S = fg6Var9;
                    }
                    s86 s86Var14 = oa6Var2.f26513e;
                    oa6.m9014j(s86Var14);
                    s86Var14.m10561z().registerOnSharedPreferenceChangeListener(mg6Var.f24895S);
                    oa6.m9015k(mg6Var);
                    mg6Var.m8300A();
                }
                n86Var = s86Var.f29988j;
                if (n86Var.m8623a() == 0) {
                    oa6.m9016l(d76Var2);
                    x66Var3.m12505b(Long.valueOf(j2), "Persisting first open");
                    j3 = j2;
                    n86Var.m8624b(j3);
                } else {
                    j3 = j2;
                }
                oa6.m9015k(mg6Var);
                y86Var = mg6Var.f24892P;
                if (y86Var.m13052d()) {
                    s86 s86Var15 = y86Var.f35029b.f26513e;
                    oa6.m9014j(s86Var15);
                    s86Var15.f29982U.m10507d(null);
                }
                if (oa6Var3.m9025h()) {
                    if (oa6Var3.m9018a()) {
                        dn6Var2 = dn6Var;
                        if (dn6Var2.m4595R("android.permission.INTERNET")) {
                            oa6.m9016l(d76Var2);
                            x66Var6 = x66Var4;
                            x66Var6.m12504a("App is missing INTERNET permission");
                        } else {
                            x66Var6 = x66Var4;
                        }
                        if (!dn6Var2.m4595R("android.permission.ACCESS_NETWORK_STATE")) {
                            oa6.m9016l(d76Var2);
                            x66Var6.m12504a("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        context = oa6Var3.f26509a;
                        if (!r35.m10189a(context).m12999c()) {
                            if (!dn6.m4573k0(context)) {
                                oa6.m9016l(d76Var2);
                                x66Var6.m12504a("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!dn6.m4567N(context)) {
                                oa6.m9016l(d76Var2);
                                x66Var6.m12504a("AppMeasurementService not registered/enabled");
                            }
                        }
                        oa6.m9016l(d76Var2);
                        x66Var6.m12504a("Uploading is not possible. App measurement disabled");
                    } else {
                        dn6Var2 = dn6Var;
                    }
                    d76Var3 = d76Var2;
                } else {
                    dn6Var2 = dn6Var;
                    if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                        String strM4937B9 = oa6Var3.m9029p().m4937B();
                        s86Var.mo5038t();
                        String string6 = s86Var.m10560y().getString("gmp_app_id", null);
                        zIsEmpty = TextUtils.isEmpty(strM4937B9);
                        boolean zIsEmpty6 = TextUtils.isEmpty(string6);
                        if (zIsEmpty) {
                            c1126rz2 = c1126rz;
                        } else {
                            c1126rz2 = c1126rz;
                        }
                        String strM4937B10 = oa6Var3.m9029p().m4937B();
                        s86Var.mo5038t();
                        SharedPreferences.Editor editorEdit8 = s86Var.m10560y().edit();
                        editorEdit8.putString("gmp_app_id", strM4937B10);
                        editorEdit8.apply();
                    } else {
                        c1126rz2 = c1126rz;
                    }
                    if (!s86Var.m10556B().m12660i(vc6Var)) {
                        c1126rz2.m10507d(null);
                    }
                    oa6.m9015k(mg6Var);
                    mg6Var.f24902k.set(c1126rz2.m10506c());
                    oa6Var4.f26509a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    d76Var3 = d76Var2;
                    if (!TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                        zM9018a = oa6Var3.m9018a();
                        sharedPreferences = s86Var.f29985g;
                        if (sharedPreferences == null) {
                            zContains = false;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            s86Var.m10558D(!zM9018a);
                        }
                        if (zM9018a) {
                            oa6.m9015k(mg6Var);
                            mg6Var.m8307H();
                        }
                        vk6 vk6Var6 = oa6Var3.f26516h;
                        oa6.m9015k(vk6Var6);
                        vk6Var6.f32708i.mo3680f();
                        oa6Var3.m9027n().m9147y(new AtomicReference());
                        oa6Var3.m9027n().m9148z(s86Var.f29984W.m10190a());
                    }
                }
                ho6.m6466a();
                if (op5Var.m9225E(null, e56.f17750Q0)) {
                    dn6Var2.mo5038t();
                    if (dn6Var2.m4594P() == 1) {
                        jMax = Math.max(500L, ((((long) ((Integer) e56.f17826x0.m4379a(null)).intValue()) * 1000) + ((long) new Random().nextInt(5000))) - SystemClock.elapsedRealtime());
                        if (jMax > 500) {
                            oa6.m9016l(d76Var3);
                            x66Var3.m12505b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                        }
                        oa6.m9015k(mg6Var);
                        mg6Var.mo5038t();
                        nd6Var = mg6Var.f24907p;
                        if (nd6Var == null) {
                            nd6Var = new nd6(mg6Var, oa6Var2, (byte) 0);
                            mg6Var.f24907p = nd6Var;
                        }
                        nd6Var.m6923b(jMax);
                    }
                }
                s86Var.f29974M.m6281b(true);
            }
            oa6.m9016l(d76Var7);
            str = "Can't initialize twice";
            e66Var = e66Var2;
            d76Var = d76Var4;
            d76Var7.f16835j.m12505b(d76.m4401y(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
            strM6958a = iw5.m6958a(context2, oa6Var5.f26524p);
            if (!TextUtils.isEmpty(strM6958a)) {
                str4 = strM6958a;
            }
            e66Var3.f17846L = str4;
            if (iM9024g == 0) {
                oa6.m9016l(d76Var7);
                d76Var7.f16831L.m12506c("App measurement enabled for app package, google app id", e66Var3.f17850g, e66Var3.f17846L);
            }
        } catch (IllegalStateException e2) {
            oa6.m9016l(d76Var7);
            d76Var7.f16835j.m12506c("Fetching Google App Id failed with exception. appId", d76.m4401y(packageName), e2);
        }
        i = Integer.MIN_VALUE;
        string = "Unknown";
        str2 = string;
        String str9 = installerPackageName;
        e66Var3.f17850g = packageName;
        e66Var3.f17853j = str9;
        e66Var3.f17851h = str2;
        e66Var3.f17852i = i;
        e66Var3.f17854k = string;
        e66Var3.f17855l = 0L;
        iM9024g = oa6Var5.m9024g();
        if (iM9024g == 0) {
            oa6.m9016l(d76Var7);
            d76Var7.f16831L.m12504a("App measurement collection enabled");
        } else if (iM9024g == 1) {
            oa6.m9016l(d76Var7);
            d76Var7.f16841p.m12504a("App measurement deactivated via the manifest");
        } else if (iM9024g == 3) {
            oa6.m9016l(d76Var7);
            d76Var7.f16841p.m12504a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iM9024g == 4) {
            oa6.m9016l(d76Var7);
            d76Var7.f16841p.m12504a("App measurement disabled via the manifest");
        } else if (iM9024g == 6) {
            oa6.m9016l(d76Var7);
            d76Var7.f16840o.m12504a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iM9024g == 7) {
            oa6.m9016l(d76Var7);
            d76Var7.f16841p.m12504a("App measurement disabled via the global data collection setting");
        } else if (iM9024g != 8) {
            oa6.m9016l(d76Var7);
            d76Var7.f16841p.m12504a("App measurement disabled");
            oa6.m9016l(d76Var7);
            d76Var7.f16836k.m12504a("Invalid scion state in identity");
        } else {
            oa6.m9016l(d76Var7);
            d76Var7.f16841p.m12504a("App measurement disabled due to denied storage consent");
        }
        e66Var3.f17846L = "";
        e66Var3.f17858o = null;
        op5 op5Var4 = oa6Var5.f26512d;
        oa6Var = (oa6) op5Var4.f36084a;
        y42.m12851X("analytics.safelisted_events");
        bundleM9226F = op5Var4.m9226F();
        if (bundleM9226F != null) {
            if (bundleM9226F.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleM9226F.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                stringArray = oa6Var.f26509a.getResources().getStringArray(numValueOf.intValue());
                if (stringArray == null) {
                    listAsList = null;
                } else {
                    listAsList = Arrays.asList(stringArray);
                }
            } else {
                listAsList = null;
            }
            if (listAsList != null) {
                e66Var3.f17858o = listAsList;
                break;
            }
            if (listAsList.isEmpty()) {
                it2 = listAsList.iterator();
                do {
                    if (it2.hasNext()) {
                        e66Var3.f17858o = listAsList;
                        break;
                    } else {
                        str3 = (String) it2.next();
                        dn6Var3 = oa6Var5.f26517i;
                        oa6.m9014j(dn6Var3);
                    }
                } while (dn6Var3.m4618w0("safelisted event", str3));
            } else {
                oa6.m9016l(d76Var7);
                d76Var7.f16840o.m12504a("Safelisted event list is empty. Ignoring");
            }
            if (packageManager != null) {
                e66Var3.f17860q = y42.m12872u0(context2) ? 1 : 0;
            } else {
                e66Var3.f17860q = 0;
            }
            ((oa6) e66Var3.f36084a).f26507C.incrementAndGet();
            e66Var3.f28230f = true;
            zg6Var = new zg6();
            zg6Var.f36084a = oa6Var3;
            oa6Var3.f26505A++;
            zg6Var.m9742v();
            oa6Var3.f26529u = zg6Var;
            if (!zg6Var.f28230f) {
                C1077qn.m9989o(str);
                return;
            }
            zg6Var.f36078g = (JobScheduler) ((oa6) zg6Var.f36084a).f26509a.getSystemService("jobscheduler");
            atomicInteger.incrementAndGet();
            zg6Var.f28230f = true;
            oa6.m9016l(d76Var);
            d76Var2 = d76Var;
            x66Var = d76Var2.f16842q;
            x66Var2 = d76Var2.f16841p;
            x66Var3 = d76Var2.f16831L;
            x66Var4 = d76Var2.f16835j;
            op5Var.m9235z();
            x66Var2.m12505b(130000L, "App measurement initialized, version");
            oa6.m9016l(d76Var2);
            x66Var2.m12504a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
            strM4936A = e66Var.m4936A();
            if (dn6Var4.m4596U(strM4936A, op5Var.f26943g)) {
                oa6.m9016l(d76Var2);
                x66Var2.m12504a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                oa6.m9016l(d76Var2);
                x66Var2.m12504a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM4936A)));
            }
            oa6.m9016l(d76Var2);
            x66Var.m12504a("Debug-level message logging enabled");
            if (oa6Var3.f26505A != atomicInteger.get()) {
                oa6.m9016l(d76Var2);
                x66Var4.m12506c("Not all components initialized", Integer.valueOf(oa6Var3.f26505A), Integer.valueOf(atomicInteger.get()));
            }
            oa6Var3.f26530v = true;
            j = oa6Var3.f26508D;
            mg6Var = oa6Var3.f26521m;
            oa6.m9016l(ea6Var);
            ea6Var.mo5038t();
            oa6.m9013i(oa6Var3.f26529u);
            iM13552z = oa6Var3.f26529u.m13552z();
            ho6.m6466a();
            zM9225E = op5Var.m9225E(null, e56.f17750Q0);
            if (iM13552z == 2) {
                z = true;
            } else {
                z = false;
            }
            if (zM9225E) {
                dn6Var4.mo5038t();
                if (dn6Var4.m4594P() == 1) {
                    dn6Var4.mo5038t();
                    IntentFilter intentFilter13 = new IntentFilter();
                    intentFilter13.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter13.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z2 = z;
                    o30 o30Var13 = new o30((byte) 1);
                    o30Var13.f26313b = oa6Var4;
                    VarHandle.storeStoreFence();
                    x66Var5 = x66Var2;
                    kx5.m7721m0(oa6Var4.f26509a, o30Var13, intentFilter13, null);
                    d76 d76Var1112 = oa6Var4.f26514f;
                    oa6.m9016l(d76Var1112);
                    d76Var1112.f16842q.m12504a("Registered app receiver");
                    if (z2) {
                        oa6.m9013i(oa6Var3.f26529u);
                        oa6Var3.f26529u.m13551y(((Long) e56.f17721C.m4379a(null)).longValue());
                    }
                } else if (z) {
                    z = true;
                    dn6Var4.mo5038t();
                    IntentFilter intentFilter14 = new IntentFilter();
                    intentFilter14.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter14.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z2 = z;
                    o30 o30Var14 = new o30((byte) 1);
                    o30Var14.f26313b = oa6Var4;
                    VarHandle.storeStoreFence();
                    x66Var5 = x66Var2;
                    kx5.m7721m0(oa6Var4.f26509a, o30Var14, intentFilter14, null);
                    d76 d76Var1113 = oa6Var4.f26514f;
                    oa6.m9016l(d76Var1113);
                    d76Var1113.f16842q.m12504a("Registered app receiver");
                    if (z2) {
                        oa6.m9013i(oa6Var3.f26529u);
                        oa6Var3.f26529u.m13551y(((Long) e56.f17721C.m4379a(null)).longValue());
                    }
                } else {
                    x66Var5 = x66Var2;
                }
            } else if (z) {
                z = true;
                dn6Var4.mo5038t();
                IntentFilter intentFilter15 = new IntentFilter();
                intentFilter15.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter15.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z2 = z;
                o30 o30Var15 = new o30((byte) 1);
                o30Var15.f26313b = oa6Var4;
                VarHandle.storeStoreFence();
                x66Var5 = x66Var2;
                kx5.m7721m0(oa6Var4.f26509a, o30Var15, intentFilter15, null);
                d76 d76Var1114 = oa6Var4.f26514f;
                oa6.m9016l(d76Var1114);
                d76Var1114.f16842q.m12504a("Registered app receiver");
                if (z2) {
                    oa6.m9013i(oa6Var3.f26529u);
                    oa6Var3.f26529u.m13551y(((Long) e56.f17721C.m4379a(null)).longValue());
                }
            } else {
                x66Var5 = x66Var2;
            }
            c1126rz = s86Var.f29989k;
            xc6VarM10556B = s86Var.m10556B();
            int i11 = xc6VarM10556B.f34161b;
            rc6VarM9230J = op5Var.m9230J("google_analytics_default_allow_ad_storage", false);
            rc6VarM9230J2 = op5Var.m9230J("google_analytics_default_allow_analytics_storage", false);
            rc6Var = rc6.UNINITIALIZED;
            vc6Var = vc6.ANALYTICS_STORAGE;
            if (rc6VarM9230J == rc6Var) {
                dn6Var = dn6Var4;
                j2 = j;
                if (xc6.m12657l(-10, s86Var.m10560y().getInt("consent_source", 100))) {
                    EnumMap enumMap9 = new EnumMap(vc6.class);
                    enumMap9.put(vc6.AD_STORAGE, rc6VarM9230J);
                    enumMap9.put(vc6Var, rc6VarM9230J2);
                    xc6Var = new xc6(enumMap9, -10);
                } else {
                    if (!TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                        oa6.m9015k(mg6Var);
                        mg6Var.m8316Q(new xc6(-10), false);
                    }
                    xc6Var = null;
                }
            } else {
                dn6Var = dn6Var4;
                j2 = j;
                if (xc6.m12657l(-10, s86Var.m10560y().getInt("consent_source", 100))) {
                    EnumMap enumMap10 = new EnumMap(vc6.class);
                    enumMap10.put(vc6.AD_STORAGE, rc6VarM9230J);
                    enumMap10.put(vc6Var, rc6VarM9230J2);
                    xc6Var = new xc6(enumMap10, -10);
                } else {
                    if (!TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                        oa6.m9015k(mg6Var);
                        mg6Var.m8316Q(new xc6(-10), false);
                    }
                    xc6Var = null;
                }
            }
            if (xc6Var != null) {
                oa6.m9015k(mg6Var);
                mg6Var.m8316Q(xc6Var, true);
            } else {
                xc6Var = xc6VarM10556B;
            }
            oa6.m9015k(mg6Var);
            oa6Var2 = (oa6) mg6Var.f36084a;
            mg6Var.m8320y(xc6Var);
            s86Var.mo5038t();
            int i12 = mr5.m8386b(s86Var.m10560y().getString("dma_consent_settings", null)).f25171a;
            rc6VarM9230J3 = op5Var.m9230J("google_analytics_default_allow_ad_personalization_signals", true);
            if (rc6VarM9230J3 != rc6Var) {
                oa6.m9016l(d76Var2);
                x66Var3.m12505b(rc6VarM9230J3, "Default ad personalization consent from Manifest");
            }
            rc6VarM9230J4 = op5Var.m9230J("google_analytics_default_allow_ad_user_data", true);
            if (rc6VarM9230J4 == rc6Var) {
                if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                    if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                        mr5VarM8387c = mr5.m8387c(30, bundle);
                        it = mr5VarM8387c.f25175e.values().iterator();
                        while (it.hasNext()) {
                            if (((rc6) it.next()) != rc6Var) {
                                oa6.m9015k(mg6Var);
                                mg6Var.m8315P(mr5VarM8387c, true);
                                break;
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                    mr5VarM8387c = mr5.m8387c(30, bundle);
                    it = mr5VarM8387c.f25175e.values().iterator();
                    while (it.hasNext()) {
                        if (((rc6) it.next()) != rc6Var) {
                            oa6.m9015k(mg6Var);
                            mg6Var.m8315P(mr5VarM8387c, true);
                            break;
                        }
                    }
                }
            } else if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                    mr5VarM8387c = mr5.m8387c(30, bundle);
                    it = mr5VarM8387c.f25175e.values().iterator();
                    while (it.hasNext()) {
                        if (((rc6) it.next()) != rc6Var) {
                            oa6.m9015k(mg6Var);
                            mg6Var.m8315P(mr5VarM8387c, true);
                            break;
                        }
                    }
                }
            } else if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                mr5VarM8387c = mr5.m8387c(30, bundle);
                it = mr5VarM8387c.f25175e.values().iterator();
                while (it.hasNext()) {
                    if (((rc6) it.next()) != rc6Var) {
                        oa6.m9015k(mg6Var);
                        mg6Var.m8315P(mr5VarM8387c, true);
                        break;
                    }
                }
            }
            boolM9227G = op5Var.m9227G("google_analytics_tcf_data_enabled");
            if (boolM9227G != null) {
                oa6.m9016l(d76Var2);
                x66Var.m12504a("TCF client enabled.");
                oa6.m9015k(mg6Var);
                mg6Var.mo5038t();
                d76 d76Var1115 = oa6Var2.f26514f;
                oa6.m9016l(d76Var1115);
                d76Var1115.f16842q.m12504a("Register tcfPrefChangeListener.");
                if (mg6Var.f24895S == null) {
                    mg6Var.f24896T = new nd6(mg6Var, oa6Var2, (byte) 2);
                    fg6 fg6Var10 = new fg6();
                    fg6Var10.f18970a = mg6Var;
                    VarHandle.storeStoreFence();
                    mg6Var.f24895S = fg6Var10;
                }
                s86 s86Var16 = oa6Var2.f26513e;
                oa6.m9014j(s86Var16);
                s86Var16.m10561z().registerOnSharedPreferenceChangeListener(mg6Var.f24895S);
                oa6.m9015k(mg6Var);
                mg6Var.m8300A();
            } else {
                oa6.m9016l(d76Var2);
                x66Var.m12504a("TCF client enabled.");
                oa6.m9015k(mg6Var);
                mg6Var.mo5038t();
                d76 d76Var1116 = oa6Var2.f26514f;
                oa6.m9016l(d76Var1116);
                d76Var1116.f16842q.m12504a("Register tcfPrefChangeListener.");
                if (mg6Var.f24895S == null) {
                    mg6Var.f24896T = new nd6(mg6Var, oa6Var2, (byte) 2);
                    fg6 fg6Var11 = new fg6();
                    fg6Var11.f18970a = mg6Var;
                    VarHandle.storeStoreFence();
                    mg6Var.f24895S = fg6Var11;
                }
                s86 s86Var17 = oa6Var2.f26513e;
                oa6.m9014j(s86Var17);
                s86Var17.m10561z().registerOnSharedPreferenceChangeListener(mg6Var.f24895S);
                oa6.m9015k(mg6Var);
                mg6Var.m8300A();
            }
            n86Var = s86Var.f29988j;
            if (n86Var.m8623a() == 0) {
                oa6.m9016l(d76Var2);
                x66Var3.m12505b(Long.valueOf(j2), "Persisting first open");
                j3 = j2;
                n86Var.m8624b(j3);
            } else {
                j3 = j2;
            }
            oa6.m9015k(mg6Var);
            y86Var = mg6Var.f24892P;
            if (y86Var.m13052d()) {
                s86 s86Var18 = y86Var.f35029b.f26513e;
                oa6.m9014j(s86Var18);
                s86Var18.f29982U.m10507d(null);
            }
            if (oa6Var3.m9025h()) {
                if (oa6Var3.m9018a()) {
                    dn6Var2 = dn6Var;
                    if (dn6Var2.m4595R("android.permission.INTERNET")) {
                        oa6.m9016l(d76Var2);
                        x66Var6 = x66Var4;
                        x66Var6.m12504a("App is missing INTERNET permission");
                    } else {
                        x66Var6 = x66Var4;
                    }
                    if (!dn6Var2.m4595R("android.permission.ACCESS_NETWORK_STATE")) {
                        oa6.m9016l(d76Var2);
                        x66Var6.m12504a("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    context = oa6Var3.f26509a;
                    if (!r35.m10189a(context).m12999c()) {
                        if (!dn6.m4573k0(context)) {
                            oa6.m9016l(d76Var2);
                            x66Var6.m12504a("AppMeasurementReceiver not registered/enabled");
                        }
                        if (!dn6.m4567N(context)) {
                            oa6.m9016l(d76Var2);
                            x66Var6.m12504a("AppMeasurementService not registered/enabled");
                        }
                    }
                    oa6.m9016l(d76Var2);
                    x66Var6.m12504a("Uploading is not possible. App measurement disabled");
                } else {
                    dn6Var2 = dn6Var;
                }
                d76Var3 = d76Var2;
            } else {
                dn6Var2 = dn6Var;
                if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                    String strM4937B11 = oa6Var3.m9029p().m4937B();
                    s86Var.mo5038t();
                    String string7 = s86Var.m10560y().getString("gmp_app_id", null);
                    zIsEmpty = TextUtils.isEmpty(strM4937B11);
                    boolean zIsEmpty7 = TextUtils.isEmpty(string7);
                    if (zIsEmpty) {
                        c1126rz2 = c1126rz;
                    } else {
                        c1126rz2 = c1126rz;
                    }
                    String strM4937B12 = oa6Var3.m9029p().m4937B();
                    s86Var.mo5038t();
                    SharedPreferences.Editor editorEdit9 = s86Var.m10560y().edit();
                    editorEdit9.putString("gmp_app_id", strM4937B12);
                    editorEdit9.apply();
                } else {
                    c1126rz2 = c1126rz;
                }
                if (!s86Var.m10556B().m12660i(vc6Var)) {
                    c1126rz2.m10507d(null);
                }
                oa6.m9015k(mg6Var);
                mg6Var.f24902k.set(c1126rz2.m10506c());
                oa6Var4.f26509a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                d76Var3 = d76Var2;
                if (!TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                    zM9018a = oa6Var3.m9018a();
                    sharedPreferences = s86Var.f29985g;
                    if (sharedPreferences == null) {
                        zContains = false;
                    } else {
                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                    }
                    if (!zContains) {
                        s86Var.m10558D(!zM9018a);
                    }
                    if (zM9018a) {
                        oa6.m9015k(mg6Var);
                        mg6Var.m8307H();
                    }
                    vk6 vk6Var7 = oa6Var3.f26516h;
                    oa6.m9015k(vk6Var7);
                    vk6Var7.f32708i.mo3680f();
                    oa6Var3.m9027n().m9147y(new AtomicReference());
                    oa6Var3.m9027n().m9148z(s86Var.f29984W.m10190a());
                }
            }
            ho6.m6466a();
            if (op5Var.m9225E(null, e56.f17750Q0)) {
                dn6Var2.mo5038t();
                if (dn6Var2.m4594P() == 1) {
                    jMax = Math.max(500L, ((((long) ((Integer) e56.f17826x0.m4379a(null)).intValue()) * 1000) + ((long) new Random().nextInt(5000))) - SystemClock.elapsedRealtime());
                    if (jMax > 500) {
                        oa6.m9016l(d76Var3);
                        x66Var3.m12505b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                    }
                    oa6.m9015k(mg6Var);
                    mg6Var.mo5038t();
                    nd6Var = mg6Var.f24907p;
                    if (nd6Var == null) {
                        nd6Var = new nd6(mg6Var, oa6Var2, (byte) 0);
                        mg6Var.f24907p = nd6Var;
                    }
                    nd6Var.m6923b(jMax);
                }
            }
            s86Var.f29974M.m6281b(true);
        }
        d76 d76Var1117 = oa6Var.f26514f;
        oa6.m9016l(d76Var1117);
        d76Var1117.f16835j.m12504a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = oa6Var.f26509a.getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                listAsList = null;
            } else {
                listAsList = Arrays.asList(stringArray);
            }
        } else {
            listAsList = null;
        }
        if (listAsList != null) {
            e66Var3.f17858o = listAsList;
            break;
        }
        if (listAsList.isEmpty()) {
            it2 = listAsList.iterator();
            do {
                if (it2.hasNext()) {
                    e66Var3.f17858o = listAsList;
                    break;
                } else {
                    str3 = (String) it2.next();
                    dn6Var3 = oa6Var5.f26517i;
                    oa6.m9014j(dn6Var3);
                }
            } while (dn6Var3.m4618w0("safelisted event", str3));
        } else {
            oa6.m9016l(d76Var7);
            d76Var7.f16840o.m12504a("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            e66Var3.f17860q = y42.m12872u0(context2) ? 1 : 0;
        } else {
            e66Var3.f17860q = 0;
        }
        ((oa6) e66Var3.f36084a).f26507C.incrementAndGet();
        e66Var3.f28230f = true;
        zg6Var = new zg6();
        zg6Var.f36084a = oa6Var3;
        oa6Var3.f26505A++;
        zg6Var.m9742v();
        oa6Var3.f26529u = zg6Var;
        if (!zg6Var.f28230f) {
            C1077qn.m9989o(str);
            return;
        }
        zg6Var.f36078g = (JobScheduler) ((oa6) zg6Var.f36084a).f26509a.getSystemService("jobscheduler");
        atomicInteger.incrementAndGet();
        zg6Var.f28230f = true;
        oa6.m9016l(d76Var);
        d76Var2 = d76Var;
        x66Var = d76Var2.f16842q;
        x66Var2 = d76Var2.f16841p;
        x66Var3 = d76Var2.f16831L;
        x66Var4 = d76Var2.f16835j;
        op5Var.m9235z();
        x66Var2.m12505b(130000L, "App measurement initialized, version");
        oa6.m9016l(d76Var2);
        x66Var2.m12504a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        strM4936A = e66Var.m4936A();
        if (dn6Var4.m4596U(strM4936A, op5Var.f26943g)) {
            oa6.m9016l(d76Var2);
            x66Var2.m12504a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            oa6.m9016l(d76Var2);
            x66Var2.m12504a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM4936A)));
        }
        oa6.m9016l(d76Var2);
        x66Var.m12504a("Debug-level message logging enabled");
        if (oa6Var3.f26505A != atomicInteger.get()) {
            oa6.m9016l(d76Var2);
            x66Var4.m12506c("Not all components initialized", Integer.valueOf(oa6Var3.f26505A), Integer.valueOf(atomicInteger.get()));
        }
        oa6Var3.f26530v = true;
        j = oa6Var3.f26508D;
        mg6Var = oa6Var3.f26521m;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        oa6.m9013i(oa6Var3.f26529u);
        iM13552z = oa6Var3.f26529u.m13552z();
        ho6.m6466a();
        zM9225E = op5Var.m9225E(null, e56.f17750Q0);
        if (iM13552z == 2) {
            z = true;
        } else {
            z = false;
        }
        if (zM9225E) {
            dn6Var4.mo5038t();
            if (dn6Var4.m4594P() == 1) {
                dn6Var4.mo5038t();
                IntentFilter intentFilter16 = new IntentFilter();
                intentFilter16.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter16.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z2 = z;
                o30 o30Var16 = new o30((byte) 1);
                o30Var16.f26313b = oa6Var4;
                VarHandle.storeStoreFence();
                x66Var5 = x66Var2;
                kx5.m7721m0(oa6Var4.f26509a, o30Var16, intentFilter16, null);
                d76 d76Var1118 = oa6Var4.f26514f;
                oa6.m9016l(d76Var1118);
                d76Var1118.f16842q.m12504a("Registered app receiver");
                if (z2) {
                    oa6.m9013i(oa6Var3.f26529u);
                    oa6Var3.f26529u.m13551y(((Long) e56.f17721C.m4379a(null)).longValue());
                }
            } else if (z) {
                z = true;
                dn6Var4.mo5038t();
                IntentFilter intentFilter17 = new IntentFilter();
                intentFilter17.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter17.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z2 = z;
                o30 o30Var17 = new o30((byte) 1);
                o30Var17.f26313b = oa6Var4;
                VarHandle.storeStoreFence();
                x66Var5 = x66Var2;
                kx5.m7721m0(oa6Var4.f26509a, o30Var17, intentFilter17, null);
                d76 d76Var1119 = oa6Var4.f26514f;
                oa6.m9016l(d76Var1119);
                d76Var1119.f16842q.m12504a("Registered app receiver");
                if (z2) {
                    oa6.m9013i(oa6Var3.f26529u);
                    oa6Var3.f26529u.m13551y(((Long) e56.f17721C.m4379a(null)).longValue());
                }
            } else {
                x66Var5 = x66Var2;
            }
        } else if (z) {
            z = true;
            dn6Var4.mo5038t();
            IntentFilter intentFilter18 = new IntentFilter();
            intentFilter18.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intentFilter18.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            z2 = z;
            o30 o30Var18 = new o30((byte) 1);
            o30Var18.f26313b = oa6Var4;
            VarHandle.storeStoreFence();
            x66Var5 = x66Var2;
            kx5.m7721m0(oa6Var4.f26509a, o30Var18, intentFilter18, null);
            d76 d76Var11110 = oa6Var4.f26514f;
            oa6.m9016l(d76Var11110);
            d76Var11110.f16842q.m12504a("Registered app receiver");
            if (z2) {
                oa6.m9013i(oa6Var3.f26529u);
                oa6Var3.f26529u.m13551y(((Long) e56.f17721C.m4379a(null)).longValue());
            }
        } else {
            x66Var5 = x66Var2;
        }
        c1126rz = s86Var.f29989k;
        xc6VarM10556B = s86Var.m10556B();
        int i13 = xc6VarM10556B.f34161b;
        rc6VarM9230J = op5Var.m9230J("google_analytics_default_allow_ad_storage", false);
        rc6VarM9230J2 = op5Var.m9230J("google_analytics_default_allow_analytics_storage", false);
        rc6Var = rc6.UNINITIALIZED;
        vc6Var = vc6.ANALYTICS_STORAGE;
        if (rc6VarM9230J == rc6Var) {
            dn6Var = dn6Var4;
            j2 = j;
            if (xc6.m12657l(-10, s86Var.m10560y().getInt("consent_source", 100))) {
                EnumMap enumMap11 = new EnumMap(vc6.class);
                enumMap11.put(vc6.AD_STORAGE, rc6VarM9230J);
                enumMap11.put(vc6Var, rc6VarM9230J2);
                xc6Var = new xc6(enumMap11, -10);
            } else {
                if (!TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                    oa6.m9015k(mg6Var);
                    mg6Var.m8316Q(new xc6(-10), false);
                }
                xc6Var = null;
            }
        } else {
            dn6Var = dn6Var4;
            j2 = j;
            if (xc6.m12657l(-10, s86Var.m10560y().getInt("consent_source", 100))) {
                EnumMap enumMap12 = new EnumMap(vc6.class);
                enumMap12.put(vc6.AD_STORAGE, rc6VarM9230J);
                enumMap12.put(vc6Var, rc6VarM9230J2);
                xc6Var = new xc6(enumMap12, -10);
            } else {
                if (!TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                    oa6.m9015k(mg6Var);
                    mg6Var.m8316Q(new xc6(-10), false);
                }
                xc6Var = null;
            }
        }
        if (xc6Var != null) {
            oa6.m9015k(mg6Var);
            mg6Var.m8316Q(xc6Var, true);
        } else {
            xc6Var = xc6VarM10556B;
        }
        oa6.m9015k(mg6Var);
        oa6Var2 = (oa6) mg6Var.f36084a;
        mg6Var.m8320y(xc6Var);
        s86Var.mo5038t();
        int i14 = mr5.m8386b(s86Var.m10560y().getString("dma_consent_settings", null)).f25171a;
        rc6VarM9230J3 = op5Var.m9230J("google_analytics_default_allow_ad_personalization_signals", true);
        if (rc6VarM9230J3 != rc6Var) {
            oa6.m9016l(d76Var2);
            x66Var3.m12505b(rc6VarM9230J3, "Default ad personalization consent from Manifest");
        }
        rc6VarM9230J4 = op5Var.m9230J("google_analytics_default_allow_ad_user_data", true);
        if (rc6VarM9230J4 == rc6Var) {
            if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                    mr5VarM8387c = mr5.m8387c(30, bundle);
                    it = mr5VarM8387c.f25175e.values().iterator();
                    while (it.hasNext()) {
                        if (((rc6) it.next()) != rc6Var) {
                            oa6.m9015k(mg6Var);
                            mg6Var.m8315P(mr5VarM8387c, true);
                            break;
                        }
                    }
                }
            } else if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                mr5VarM8387c = mr5.m8387c(30, bundle);
                it = mr5VarM8387c.f25175e.values().iterator();
                while (it.hasNext()) {
                    if (((rc6) it.next()) != rc6Var) {
                        oa6.m9015k(mg6Var);
                        mg6Var.m8315P(mr5VarM8387c, true);
                        break;
                    }
                }
            }
        } else if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
            if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                mr5VarM8387c = mr5.m8387c(30, bundle);
                it = mr5VarM8387c.f25175e.values().iterator();
                while (it.hasNext()) {
                    if (((rc6) it.next()) != rc6Var) {
                        oa6.m9015k(mg6Var);
                        mg6Var.m8315P(mr5VarM8387c, true);
                        break;
                    }
                }
            }
        } else if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
            mr5VarM8387c = mr5.m8387c(30, bundle);
            it = mr5VarM8387c.f25175e.values().iterator();
            while (it.hasNext()) {
                if (((rc6) it.next()) != rc6Var) {
                    oa6.m9015k(mg6Var);
                    mg6Var.m8315P(mr5VarM8387c, true);
                    break;
                }
            }
        }
        boolM9227G = op5Var.m9227G("google_analytics_tcf_data_enabled");
        if (boolM9227G != null) {
            oa6.m9016l(d76Var2);
            x66Var.m12504a("TCF client enabled.");
            oa6.m9015k(mg6Var);
            mg6Var.mo5038t();
            d76 d76Var11111 = oa6Var2.f26514f;
            oa6.m9016l(d76Var11111);
            d76Var11111.f16842q.m12504a("Register tcfPrefChangeListener.");
            if (mg6Var.f24895S == null) {
                mg6Var.f24896T = new nd6(mg6Var, oa6Var2, (byte) 2);
                fg6 fg6Var12 = new fg6();
                fg6Var12.f18970a = mg6Var;
                VarHandle.storeStoreFence();
                mg6Var.f24895S = fg6Var12;
            }
            s86 s86Var19 = oa6Var2.f26513e;
            oa6.m9014j(s86Var19);
            s86Var19.m10561z().registerOnSharedPreferenceChangeListener(mg6Var.f24895S);
            oa6.m9015k(mg6Var);
            mg6Var.m8300A();
        } else {
            oa6.m9016l(d76Var2);
            x66Var.m12504a("TCF client enabled.");
            oa6.m9015k(mg6Var);
            mg6Var.mo5038t();
            d76 d76Var11112 = oa6Var2.f26514f;
            oa6.m9016l(d76Var11112);
            d76Var11112.f16842q.m12504a("Register tcfPrefChangeListener.");
            if (mg6Var.f24895S == null) {
                mg6Var.f24896T = new nd6(mg6Var, oa6Var2, (byte) 2);
                fg6 fg6Var13 = new fg6();
                fg6Var13.f18970a = mg6Var;
                VarHandle.storeStoreFence();
                mg6Var.f24895S = fg6Var13;
            }
            s86 s86Var110 = oa6Var2.f26513e;
            oa6.m9014j(s86Var110);
            s86Var110.m10561z().registerOnSharedPreferenceChangeListener(mg6Var.f24895S);
            oa6.m9015k(mg6Var);
            mg6Var.m8300A();
        }
        n86Var = s86Var.f29988j;
        if (n86Var.m8623a() == 0) {
            oa6.m9016l(d76Var2);
            x66Var3.m12505b(Long.valueOf(j2), "Persisting first open");
            j3 = j2;
            n86Var.m8624b(j3);
        } else {
            j3 = j2;
        }
        oa6.m9015k(mg6Var);
        y86Var = mg6Var.f24892P;
        if (y86Var.m13052d()) {
            s86 s86Var111 = y86Var.f35029b.f26513e;
            oa6.m9014j(s86Var111);
            s86Var111.f29982U.m10507d(null);
        }
        if (oa6Var3.m9025h()) {
            if (oa6Var3.m9018a()) {
                dn6Var2 = dn6Var;
                if (dn6Var2.m4595R("android.permission.INTERNET")) {
                    oa6.m9016l(d76Var2);
                    x66Var6 = x66Var4;
                    x66Var6.m12504a("App is missing INTERNET permission");
                } else {
                    x66Var6 = x66Var4;
                }
                if (!dn6Var2.m4595R("android.permission.ACCESS_NETWORK_STATE")) {
                    oa6.m9016l(d76Var2);
                    x66Var6.m12504a("App is missing ACCESS_NETWORK_STATE permission");
                }
                context = oa6Var3.f26509a;
                if (!r35.m10189a(context).m12999c()) {
                    if (!dn6.m4573k0(context)) {
                        oa6.m9016l(d76Var2);
                        x66Var6.m12504a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!dn6.m4567N(context)) {
                        oa6.m9016l(d76Var2);
                        x66Var6.m12504a("AppMeasurementService not registered/enabled");
                    }
                }
                oa6.m9016l(d76Var2);
                x66Var6.m12504a("Uploading is not possible. App measurement disabled");
            } else {
                dn6Var2 = dn6Var;
            }
            d76Var3 = d76Var2;
        } else {
            dn6Var2 = dn6Var;
            if (TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                String strM4937B13 = oa6Var3.m9029p().m4937B();
                s86Var.mo5038t();
                String string8 = s86Var.m10560y().getString("gmp_app_id", null);
                zIsEmpty = TextUtils.isEmpty(strM4937B13);
                boolean zIsEmpty8 = TextUtils.isEmpty(string8);
                if (zIsEmpty) {
                    c1126rz2 = c1126rz;
                } else {
                    c1126rz2 = c1126rz;
                }
                String strM4937B14 = oa6Var3.m9029p().m4937B();
                s86Var.mo5038t();
                SharedPreferences.Editor editorEdit10 = s86Var.m10560y().edit();
                editorEdit10.putString("gmp_app_id", strM4937B14);
                editorEdit10.apply();
            } else {
                c1126rz2 = c1126rz;
            }
            if (!s86Var.m10556B().m12660i(vc6Var)) {
                c1126rz2.m10507d(null);
            }
            oa6.m9015k(mg6Var);
            mg6Var.f24902k.set(c1126rz2.m10506c());
            oa6Var4.f26509a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            d76Var3 = d76Var2;
            if (!TextUtils.isEmpty(oa6Var3.m9029p().m4937B())) {
                zM9018a = oa6Var3.m9018a();
                sharedPreferences = s86Var.f29985g;
                if (sharedPreferences == null) {
                    zContains = false;
                } else {
                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                }
                if (!zContains) {
                    s86Var.m10558D(!zM9018a);
                }
                if (zM9018a) {
                    oa6.m9015k(mg6Var);
                    mg6Var.m8307H();
                }
                vk6 vk6Var8 = oa6Var3.f26516h;
                oa6.m9015k(vk6Var8);
                vk6Var8.f32708i.mo3680f();
                oa6Var3.m9027n().m9147y(new AtomicReference());
                oa6Var3.m9027n().m9148z(s86Var.f29984W.m10190a());
            }
        }
        ho6.m6466a();
        if (op5Var.m9225E(null, e56.f17750Q0)) {
            dn6Var2.mo5038t();
            if (dn6Var2.m4594P() == 1) {
                jMax = Math.max(500L, ((((long) ((Integer) e56.f17826x0.m4379a(null)).intValue()) * 1000) + ((long) new Random().nextInt(5000))) - SystemClock.elapsedRealtime());
                if (jMax > 500) {
                    oa6.m9016l(d76Var3);
                    x66Var3.m12505b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                }
                oa6.m9015k(mg6Var);
                mg6Var.mo5038t();
                nd6Var = mg6Var.f24907p;
                if (nd6Var == null) {
                    nd6Var = new nd6(mg6Var, oa6Var2, (byte) 0);
                    mg6Var.f24907p = nd6Var;
                }
                nd6Var.m6923b(jMax);
            }
        }
        s86Var.f29974M.m6281b(true);
    }

    /* JADX INFO: renamed from: d */
    private final void m9345d() {
        a86 a86Var = (a86) this.f27250c;
        synchronized (a86Var.f169c) {
            ((w33) a86Var.f170d).onComplete((nr6) this.f27249b);
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m9346e() {
        a86 a86Var = (a86) this.f27250c;
        synchronized (a86Var.f169c) {
            try {
                y33 y33Var = (y33) a86Var.f170d;
                if (y33Var != null) {
                    Exception excM8823g = ((nr6) this.f27249b).m8823g();
                    y42.m12854a0(excM8823g);
                    y33Var.mo141g(excM8823g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f27249b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        p000.f24.f18675f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f27249b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.f27249b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m9347f() {
        Runnable runnable;
        boolean z = false;
        boolean zInterrupted = false;
        while (true) {
            try {
                synchronized (((f24) this.f27250c).f18677b) {
                    if (z) {
                        runnable = (Runnable) ((f24) this.f27250c).f18677b.poll();
                        this.f27249b = runnable;
                        if (runnable == null) {
                            ((f24) this.f27250c).f18678c = 1;
                        }
                    } else {
                        f24 f24Var = (f24) this.f27250c;
                        if (f24Var.f18678c != 4) {
                            f24Var.f18679d++;
                            f24Var.f18678c = 4;
                            z = true;
                            runnable = (Runnable) ((f24) this.f27250c).f18677b.poll();
                            this.f27249b = runnable;
                            if (runnable == null) {
                                ((f24) this.f27250c).f18678c = 1;
                            }
                        }
                    }
                }
                if (zInterrupted) {
                    break;
                } else {
                    return;
                }
                this.f27249b = null;
            } catch (Throwable th) {
                if (zInterrupted) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        Thread.currentThread().interrupt();
    }

    /* JADX WARN: Code duplicated, block: B:289:0x01f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x01e7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thMo4846d;
        wm0 wm0Var;
        q25 q25Var;
        gz1 gz1Var;
        Long lValueOf;
        int i = 0;
        int i2 = 0;
        byte b = 0;
        byte b2 = 1;
        switch (this.f27248a) {
            case 0:
                mf3 mf3Var = (mf3) this.f27250c;
                yz5 yz5Var = (yz5) this.f27249b;
                if ((yz5Var instanceof yx5) && (thMo4846d = ((yx5) yz5Var).mo4846d()) != null) {
                    mf3Var.m8295a(thMo4846d);
                    return;
                }
                try {
                    if (!yz5Var.isDone()) {
                        throw new IllegalStateException(yt5.m13238b("Future was expected to be done: %s", yz5Var));
                    }
                    while (true) {
                        try {
                            Object obj = yz5Var.get();
                            if (b != 0) {
                                Thread.currentThread().interrupt();
                            }
                            Integer num = (Integer) obj;
                            int iIntValue = num.intValue();
                            ez5 ez5Var = (ez5) mf3Var.f24861d;
                            if (iIntValue <= 0) {
                                ((Runnable) mf3Var.f24860c).run();
                                return;
                            }
                            byte b3 = mf3Var.f24858a;
                            f00 f00VarM10511a = rz5.m10511a(num.intValue(), "Billing override value was set by a license tester.");
                            ez5Var.m5428O(93, b3, f00VarM10511a);
                            ((wl0) mf3Var.f24859b).accept(f00VarM10511a);
                            return;
                        } catch (InterruptedException unused) {
                            b = 1;
                        } catch (Throwable th) {
                            if (b == 0) {
                                throw th;
                            }
                            Thread.currentThread().interrupt();
                            throw th;
                        }
                    }
                } catch (ExecutionException e) {
                    mf3Var.m8295a(e.getCause());
                    return;
                } catch (Throwable th2) {
                    mf3Var.m8295a(th2);
                    return;
                }
                break;
            case 1:
                ((is0) this.f27250c).f21736b.onPostMessage((String) this.f27249b);
                return;
            case 2:
                break;
            case 3:
                ((b70) this.f27250c).m3481D((ub1) this.f27249b);
                return;
            case 4:
                try {
                    m9347f();
                    return;
                } catch (Error e2) {
                    synchronized (((f24) this.f27250c).f18677b) {
                        ((f24) this.f27250c).f18678c = 1;
                        throw e2;
                    }
                }
            case 5:
                jg3 jg3Var = ((hg4) this.f27250c).f20559a.f19517f;
                String str = (String) this.f27249b;
                synchronized (jg3Var.f22256j) {
                    try {
                        h35 h35VarM7106c = jg3Var.m7106c(str);
                        wm0Var = null;
                        q25Var = h35VarM7106c != null ? h35VarM7106c.f20341a : null;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (q25Var == null || z62.m13387o(jl0.f22381j, q25Var.f28171j)) {
                    return;
                }
                synchronized (((hg4) this.f27250c).f20561c) {
                    ((hg4) this.f27250c).f20564f.put(lb5.m7904L(q25Var), q25Var);
                    hg4 hg4Var = (hg4) this.f27250c;
                    cu2 cu2Var = hg4Var.f20566h;
                    so0 so0Var = hg4Var.f20560b.f21973b;
                    String str2 = w15.f33035a;
                    ((hg4) this.f27250c).f20565g.put(lb5.m7904L(q25Var), lb5.m7910S(zp0.m13670b(so0Var), null, null, new er2(cu2Var, q25Var, hg4Var, wm0Var, (byte) 17), 3));
                    break;
                }
                return;
            case 6:
                lk0 lk0Var = (lk0) this.f27249b;
                bt0 bt0Var = (bt0) this.f27250c;
                InterfaceC1074qk interfaceC1074qk = (InterfaceC1074qk) bt0Var.f15565b;
                ol5 ol5Var = (ol5) ((tt1) bt0Var.f15569f).f31420j.get((C0458al) bt0Var.f15566c);
                if (ol5Var == null) {
                    return;
                }
                if (lk0Var.f24097e != 0) {
                    ol5Var.m9180l(lk0Var, null);
                    return;
                }
                bt0Var.f15564a = true;
                if (interfaceC1074qk.requiresSignIn()) {
                    if (!bt0Var.f15564a || (gz1Var = (gz1) bt0Var.f15567d) == null) {
                        return;
                    }
                    interfaceC1074qk.getRemoteService(gz1Var, (Set) bt0Var.f15568e);
                    return;
                }
                try {
                    interfaceC1074qk.getRemoteService(null, interfaceC1074qk.mo9894a());
                    return;
                } catch (SecurityException e3) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e3);
                    interfaceC1074qk.disconnect("Failed to get service from broker.");
                    ol5Var.m9180l(new lk0(10, null, null), null);
                    return;
                }
            case 7:
                C0927mz c0927mz = (C0927mz) this.f27249b;
                C1015oz c1015oz = (C1015oz) this.f27250c;
                f00 f00Var = rz5.f29768k;
                c0927mz.m8450u(24, 9, f00Var);
                uu5 uu5Var = sv5.f30597b;
                c1015oz.m9337a(f00Var, mw5.f25264e);
                return;
            case 8:
                C0927mz c0927mz2 = (C0927mz) this.f27249b;
                f00 f00Var2 = (f00) this.f27250c;
                C1163sz c1163sz = c0927mz2.f25318f.f36325b;
                zr6 zr6Var = c0927mz2.f25318f;
                if (c1163sz != null) {
                    zr6Var.f36325b.m10956b(f00Var2);
                    return;
                } else {
                    qv5.m10140h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 9:
                oc6 oc6Var = (oc6) this.f27249b;
                oc6Var.mo9023f();
                if (yj5.m13150b()) {
                    oc6Var.mo9020c().m5033D(this);
                    return;
                }
                ir5 ir5Var = (ir5) this.f27250c;
                byte b4 = ir5Var.f21720c != 0 ? (byte) 1 : (byte) 0;
                ir5Var.f21720c = 0L;
                if (b4 != 0) {
                    ir5Var.mo6922a();
                    return;
                }
                return;
            case 10:
                gu5 gu5Var = (gu5) this.f27249b;
                ts5 ts5Var = (ts5) this.f27250c;
                AtomicReference atomicReference = gu5Var.f20144d;
                Objects.requireNonNull(atomicReference);
                bt5 bt5Var = new bt5(i);
                bt5Var.f15596b = atomicReference;
                VarHandle.storeStoreFence();
                ts5Var.m11130b(bt5Var, new pj5((byte) 2));
                return;
            case 11:
                C0927mz c0927mz3 = (C0927mz) this.f27249b;
                C1015oz c1015oz2 = (C1015oz) this.f27250c;
                f00 f00Var3 = rz5.f29768k;
                c0927mz3.m8450u(24, 7, f00Var3);
                uu5 uu5Var2 = sv5.f30597b;
                mw5 mw5Var = mw5.f25264e;
                cf0 cf0Var = c1015oz2.f27240a;
                tg3 tg3Var = new tg3();
                tg3Var.f31144a = f00Var3;
                tg3Var.f31145b = mw5Var;
                VarHandle.storeStoreFence();
                cf0Var.m4989U(tg3Var);
                return;
            case 12:
                ry5.m10503a("CronetUrlRequest#postTaskToExecutor " + ((String) this.f27249b) + " running callback");
                try {
                    ((au5) this.f27250c).run();
                    Trace.endSection();
                    return;
                } catch (Throwable th4) {
                    try {
                        Trace.endSection();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            case 13:
                try {
                    ((C0927mz) ((pq3) this.f27249b).f27897c).f25309B.mo7233a((f00) this.f27250c);
                    return;
                } catch (Throwable th6) {
                    qv5.m10141i("BillingClient", "Exception calling onBillingSetupFinished.", th6);
                    return;
                }
            case 14:
                m9342a();
                return;
            case 15:
                m9343b();
                return;
            case 16:
                i16 i16Var = (i16) this.f27249b;
                try {
                    ((j16) this.f27250c).mo3680f();
                    return;
                } catch (Throwable th7) {
                    i16Var.m6557b(new nr5("System error", th7));
                    return;
                }
            case 17:
                i16 i16Var2 = (i16) this.f27249b;
                m26 m26Var = (m26) this.f27250c;
                String str3 = i16Var2.f21032p;
                r06 r06Var = i16Var2.f21017a;
                tt2 tt2Var = new tt2((byte) 26, i);
                tt2Var.f31428b = r06Var;
                tt2Var.f31429c = m26Var;
                tt2Var.f31430d = str3;
                VarHandle.storeStoreFence();
                r06Var.m10176a(tt2Var, "onRedirectReceived");
                return;
            case 18:
                ry5.m10503a("Cronet JavaUrlRequest#executeOnExecutor " + ((String) this.f27249b) + " running callback");
                try {
                    ((Runnable) this.f27250c).run();
                    Trace.endSection();
                    return;
                } catch (Throwable th8) {
                    try {
                        Trace.endSection();
                        throw th8;
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                        throw th8;
                    }
                }
            case 19:
                tf6 tf6Var = (tf6) this.f27249b;
                li4 li4Var = (li4) this.f27250c;
                nr6 nr6Var = li4Var.f24059a;
                Context context = (Context) tf6Var.f31128b;
                String string = tf6.m11047b(context).getString("app_set_id", null);
                long j = tf6.m11047b(context).getLong("app_set_id_last_used_time", -1L);
                long j2 = j != -1 ? j + 33696000000L : -1L;
                if (string != null && System.currentTimeMillis() <= j2) {
                    try {
                        tf6.m11048c(context);
                    } catch (de6 e4) {
                        nr6Var.m8830n(e4);
                        return;
                    }
                    break;
                } else {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string).commit()) {
                            String strValueOf = String.valueOf(context.getPackageName());
                            Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(strValueOf) : new String("Failed to store app set ID generated for App "));
                            throw new de6("Failed to store the app set ID.");
                        }
                        tf6.m11048c(context);
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String strValueOf2 = String.valueOf(context.getPackageName());
                            Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(strValueOf2) : new String("Failed to store app set ID creation time for App "));
                            throw new de6("Failed to store the app set ID creation time.");
                        }
                    } catch (de6 e5) {
                        nr6Var.m8830n(e5);
                        return;
                    }
                }
                li4Var.m7988a(new C1298wm(string, 1));
                return;
            case 20:
                m9344c();
                return;
            case 21:
                m9345d();
                return;
            case 22:
                m9346e();
                return;
            case 23:
                qx5 qx5Var = (qx5) this.f27249b;
                mg6 mg6Var = (mg6) this.f27250c;
                vk6 vk6Var = ((oa6) mg6Var.f36084a).f26516h;
                oa6.m9015k(vk6Var);
                oa6 oa6Var = (oa6) vk6Var.f36084a;
                s86 s86Var = oa6Var.f26513e;
                s86 s86Var2 = oa6Var.f26513e;
                oa6.m9014j(s86Var);
                if (s86Var.m10556B().m12660i(vc6.ANALYTICS_STORAGE)) {
                    oa6.m9014j(s86Var2);
                    oa6Var.f26519k.getClass();
                    if (!s86Var2.m10559E(System.currentTimeMillis())) {
                        oa6.m9014j(s86Var2);
                        if (s86Var2.f29976O.m8623a() != 0) {
                            oa6.m9014j(s86Var2);
                            lValueOf = Long.valueOf(s86Var2.f29976O.m8623a());
                        }
                    }
                    if (lValueOf == null) {
                        dn6 dn6Var = ((oa6) mg6Var.f36084a).f26517i;
                        oa6.m9014j(dn6Var);
                        dn6Var.m4604d0(qx5Var, lValueOf.longValue());
                        return;
                    } else {
                        try {
                            qx5Var.mo7338h(null);
                            return;
                        } catch (RemoteException e6) {
                            d76 d76Var = ((oa6) mg6Var.f36084a).f26514f;
                            oa6.m9016l(d76Var);
                            d76Var.f16835j.m12505b(e6, "getSessionId failed with exception");
                            return;
                        }
                    }
                }
                d76 d76Var2 = oa6Var.f26514f;
                oa6.m9016l(d76Var2);
                d76Var2.f16840o.m12504a("Analytics storage consent denied; will not get session id");
                lValueOf = null;
                if (lValueOf == null) {
                    qx5Var.mo7338h(null);
                    return;
                }
                dn6 dn6Var2 = ((oa6) mg6Var.f36084a).f26517i;
                oa6.m9014j(dn6Var2);
                dn6Var2.m4604d0(qx5Var, lValueOf.longValue());
                return;
            case 24:
                oa6 oa6Var2 = (oa6) ((mg6) this.f27250c).f36084a;
                s86 s86Var3 = oa6Var2.f26513e;
                d76 d76Var3 = oa6Var2.f26514f;
                oa6.m9014j(s86Var3);
                s86Var3.mo5038t();
                s86Var3.mo5038t();
                mr5 mr5VarM8386b = mr5.m8386b(s86Var3.m10560y().getString("dma_consent_settings", null));
                mr5 mr5Var = (mr5) this.f27249b;
                int i3 = mr5Var.f25171a;
                if (!xc6.m12657l(i3, mr5VarM8386b.f25171a)) {
                    oa6.m9016l(d76Var3);
                    d76Var3.f16841p.m12505b(Integer.valueOf(i3), "Lower precedence consent source ignored, proposed source");
                    return;
                }
                SharedPreferences.Editor editorEdit = s86Var3.m10560y().edit();
                editorEdit.putString("dma_consent_settings", mr5Var.f25172b);
                editorEdit.apply();
                oa6.m9016l(d76Var3);
                d76Var3.f16831L.m12505b(mr5Var, "Setting DMA consent(FE)");
                if (!oa6Var2.m9027n().m9136F()) {
                    oa6Var2.m9027n().m9144N();
                    return;
                }
                oj6 oj6VarM9027n = oa6Var2.m9027n();
                oj6VarM9027n.mo5038t();
                oj6VarM9027n.m9741u();
                hj6 hj6Var = new hj6(b2);
                hj6Var.f20631b = oj6VarM9027n;
                VarHandle.storeStoreFence();
                oj6VarM9027n.m9140J(hj6Var);
                return;
            case 25:
                mg6 mg6Var2 = ((AppMeasurementDynamiteService) this.f27250c).f16259a.f26521m;
                oa6.m9015k(mg6Var2);
                pq3 pq3Var = (pq3) this.f27249b;
                mg6Var2.mo5038t();
                mg6Var2.m9741u();
                dd6 dd6Var = mg6Var2.f24899h;
                if (pq3Var != dd6Var) {
                    y42.m12856c0("EventInterceptor already set.", dd6Var == null);
                }
                mg6Var2.f24899h = pq3Var;
                return;
            case 26:
                oj6 oj6Var = ((jj6) this.f27250c).f22344c;
                oj6Var.f26789h = null;
                if (((lk0) this.f27249b).f24097e != 7777) {
                    oj6Var.m9141K();
                    return;
                }
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = oj6Var.f26792k;
                if (scheduledExecutorServiceNewScheduledThreadPool == null) {
                    scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
                    oj6Var.f26792k = scheduledExecutorServiceNewScheduledThreadPool;
                }
                RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 29);
                runnableC1029pc.f27515b = this;
                VarHandle.storeStoreFence();
                scheduledExecutorServiceNewScheduledThreadPool.schedule(runnableC1029pc, ((Long) e56.f17767Z.m4379a(null)).longValue(), TimeUnit.MILLISECONDS);
                return;
            case 27:
                bt5 bt5Var2 = (bt5) this.f27249b;
                JobParameters jobParameters = (JobParameters) this.f27250c;
                Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
                ((uj6) ((Service) bt5Var2.f15596b)).mo4065c(jobParameters);
                return;
            case 28:
                ((bl0) this.f27249b).mo3614l(((n56) this.f27250c).m8537a());
                return;
            default:
                wp5 wp5Var = (wp5) this.f27249b;
                ArrayList arrayList = (ArrayList) this.f27250c;
                try {
                    b86 b86Var = (b86) wp5Var.f33584b.f16551l;
                    if (b86Var == null) {
                        return;
                    }
                    Context context2 = wp5Var.f33583a;
                    String packageName = context2.getPackageName();
                    ArrayList arrayList2 = new ArrayList();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        yx1 yx1Var = (yx1) obj2;
                        arrayList2.add(new ao3(yx1Var.f35582b, yx1Var.f35583c, jCurrentTimeMillis, yx1Var.f35581a));
                    }
                    k36 k36Var = (k36) b86Var;
                    Parcel parcelM7550G = k36Var.m7550G();
                    parcelM7550G.writeString(packageName);
                    parcelM7550G.writeTypedList(arrayList2);
                    k36Var.m7552I(parcelM7550G, 5);
                    zt5.m13769O(context2, arrayList);
                    return;
                } catch (DeadObjectException e7) {
                    Log.e("HsdpClientImpl", "hsdpService is dead", e7);
                    return;
                } catch (RemoteException e8) {
                    Log.e("HsdpClientImpl", "Failed to call hsdpService.report", e8);
                    return;
                }
        }
        while (true) {
            try {
                ((Runnable) this.f27249b).run();
            } catch (Throwable th10) {
                n40.m8509s(r71.f29063a, th10);
            }
            try {
                Runnable runnableM12700O = ((xk2) this.f27250c).m12700O();
                if (runnableM12700O == null) {
                    return;
                }
                this.f27249b = runnableM12700O;
                i++;
                if (i >= 16) {
                    xk2 xk2Var = (xk2) this.f27250c;
                    if (g01.m5869c(xk2Var.f34335c, xk2Var)) {
                        xk2 xk2Var2 = (xk2) this.f27250c;
                        g01.m5868b(xk2Var2.f34335c, xk2Var2, this);
                        return;
                    }
                }
            } catch (Throwable th11) {
                xk2 xk2Var3 = (xk2) this.f27250c;
                synchronized (xk2Var3.f34339g) {
                    xk2.f34332h.decrementAndGet(xk2Var3);
                    throw th11;
                }
            }
        }
    }

    public String toString() {
        String str;
        switch (this.f27248a) {
            case 0:
                String simpleName = oz5.class.getSimpleName();
                pq3 pq3Var = new pq3((byte) 10);
                byte b = 14;
                yg3 yg3Var = new yg3(b);
                pq3Var.f27897c = yg3Var;
                pq3Var.f27896b = simpleName;
                VarHandle.storeStoreFence();
                mf3 mf3Var = (mf3) this.f27250c;
                yg3 yg3Var2 = new yg3(b);
                yg3Var.f35216c = yg3Var2;
                yg3Var2.f35215b = mf3Var;
                return pq3Var.toString();
            case 4:
                Runnable runnable = (Runnable) this.f27249b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((f24) this.f27250c).f18678c;
                if (i == 1) {
                    str = "IDLE";
                } else if (i == 2) {
                    str = "QUEUING";
                } else if (i != 3) {
                    str = i != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ oz5(byte b) {
        this.f27248a = b;
    }

    public oz5(xk2 xk2Var, Runnable runnable) {
        this.f27248a = (byte) 2;
        this.f27250c = xk2Var;
        this.f27249b = runnable;
    }
}
