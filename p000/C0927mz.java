package p000;

import ads_mobile_sdk.C0313rh;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: mz */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class C0927mz {

    /* JADX INFO: renamed from: A */
    public bw5 f25308A;

    /* JADX INFO: renamed from: B */
    public volatile InterfaceC1052pz f25309B;

    /* JADX INFO: renamed from: C */
    public ExecutorService f25310C;

    /* JADX INFO: renamed from: D */
    public final Long f25311D;

    /* JADX INFO: renamed from: E */
    public final is5 f25312E;

    /* JADX INFO: renamed from: c */
    public final String f25315c;

    /* JADX INFO: renamed from: d */
    public final String f25316d;

    /* JADX INFO: renamed from: f */
    public volatile zr6 f25318f;

    /* JADX INFO: renamed from: g */
    public final Context f25319g;

    /* JADX INFO: renamed from: h */
    public final pq3 f25320h;

    /* JADX INFO: renamed from: i */
    public volatile nq5 f25321i;

    /* JADX INFO: renamed from: j */
    public volatile zu5 f25322j;

    /* JADX INFO: renamed from: k */
    public boolean f25323k;

    /* JADX INFO: renamed from: m */
    public boolean f25325m;

    /* JADX INFO: renamed from: n */
    public boolean f25326n;

    /* JADX INFO: renamed from: o */
    public boolean f25327o;

    /* JADX INFO: renamed from: p */
    public boolean f25328p;

    /* JADX INFO: renamed from: q */
    public boolean f25329q;

    /* JADX INFO: renamed from: r */
    public boolean f25330r;

    /* JADX INFO: renamed from: s */
    public boolean f25331s;

    /* JADX INFO: renamed from: t */
    public boolean f25332t;

    /* JADX INFO: renamed from: u */
    public boolean f25333u;

    /* JADX INFO: renamed from: v */
    public boolean f25334v;

    /* JADX INFO: renamed from: w */
    public boolean f25335w;

    /* JADX INFO: renamed from: x */
    public boolean f25336x;

    /* JADX INFO: renamed from: y */
    public final i50 f25337y;

    /* JADX INFO: renamed from: z */
    public final boolean f25338z;

    /* JADX INFO: renamed from: a */
    public final Object f25313a = new Object();

    /* JADX INFO: renamed from: b */
    public volatile byte f25314b = 0;

    /* JADX INFO: renamed from: e */
    public final Handler f25317e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l */
    public int f25324l = 0;

    public C0927mz(i50 i50Var, Context context, C1163sz c1163sz, C0890lz c0890lz) {
        int i = bw5.f15662c;
        this.f25308A = cx5.f16587j;
        long jNextLong = new Random().nextLong();
        this.f25311D = Long.valueOf(jNextLong);
        this.f25312E = us5.f32149a;
        this.f25315c = "9.1.0";
        String strM8428o = m8428o();
        this.f25316d = strM8428o;
        this.f25319g = context.getApplicationContext();
        pe6 pe6VarM10310A = re6.m10310A();
        pe6VarM10310A.m9508h();
        if (strM8428o != null) {
            pe6VarM10310A.m8971b();
            re6.m10325z((re6) pe6VarM10310A.f26373b, strM8428o);
        }
        pe6VarM10310A.m9507g(this.f25319g.getPackageName());
        pe6VarM10310A.m8971b();
        re6.m10314E((re6) pe6VarM10310A.f26373b, jNextLong);
        boolean z = c0890lz.f24480d;
        pe6VarM10310A.m8971b();
        re6.m10323x((re6) pe6VarM10310A.f26373b, z);
        pe6VarM10310A.m9503c(Build.VERSION.SDK_INT);
        pe6VarM10310A.m9506f();
        m8431s(pe6VarM10310A, context);
        try {
            pe6VarM10310A.m9504d(this.f25319g.getPackageManager().getPackageInfo(this.f25319g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            qv5.m10141i("BillingClient", "Error getting app version code.", th);
        }
        this.f25320h = new pq3(this.f25319g, (re6) pe6VarM10310A.m8970a());
        if (c1163sz == null) {
            qv5.m10140h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f25318f = new zr6(this.f25319g, c1163sz, this.f25320h);
        this.f25337y = i50Var;
        this.f25319g.getPackageName();
        this.f25338z = c0890lz.f24480d;
    }

    /* JADX INFO: renamed from: h */
    public static Future m8427h(Callable callable, long j, Runnable runnable, Handler handler, ExecutorService executorService) {
        try {
            Future futureSubmit = executorService.submit(callable);
            ar1 ar1Var = new ar1((byte) 10);
            ar1Var.f14798b = futureSubmit;
            ar1Var.f14799c = runnable;
            VarHandle.storeStoreFence();
            handler.postDelayed(ar1Var, (long) (j * 0.95d));
            return futureSubmit;
        } catch (Exception e) {
            qv5.m10141i("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public static String m8428o() {
        try {
            return (String) n40.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m8429q(C0927mz c0927mz, int i) {
        c0927mz.f25324l = i;
        c0927mz.f25336x = i >= 28;
        c0927mz.f25335w = i >= 26;
        c0927mz.f25334v = i >= 24;
        c0927mz.f25333u = i >= 21;
        c0927mz.f25332t = i >= 20;
        c0927mz.f25331s = i >= 19;
        c0927mz.f25330r = i >= 17;
        c0927mz.f25329q = i >= 16;
        c0927mz.f25328p = i >= 15;
        c0927mz.f25327o = i >= 14;
        c0927mz.f25326n = i >= 9;
        c0927mz.f25325m = i >= 6;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: r */
    public static void m8430r(C0927mz c0927mz, int i) {
        if (i != 0) {
            c0927mz.m8435D(0);
            return;
        }
        synchronized (c0927mz.f25313a) {
            try {
                if (c0927mz.f25314b == 3) {
                    return;
                }
                c0927mz.m8435D(2);
                zr6 zr6Var = c0927mz.f25318f != null ? c0927mz.f25318f : null;
                if (zr6Var != null) {
                    boolean z = c0927mz.f25333u;
                    IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    zr6Var.f36329f = z;
                    e86 e86Var = zr6Var.f36328e;
                    Context context = zr6Var.f36324a;
                    e86Var.m4962a(context, intentFilter2);
                    boolean z2 = zr6Var.f36329f;
                    e86 e86Var2 = zr6Var.f36327d;
                    if (!z2) {
                        e86Var2.m4962a(context, intentFilter);
                        return;
                    }
                    synchronized (e86Var2) {
                        if (e86Var2.f17897b) {
                            return;
                        }
                        context.registerReceiver(e86Var2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != e86Var2.f17898c ? 4 : 2);
                        e86Var2.f17897b = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m8431s(pe6 pe6Var, Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                int i = (int) (memoryInfo.totalMem / 1048576);
                pe6Var.m8971b();
                re6.m10322w((re6) pe6Var.f26373b, i);
                String str = Build.BRAND;
                pe6Var.m8971b();
                re6.m10318s((re6) pe6Var.f26373b);
                String str2 = Build.MODEL;
                pe6Var.m8971b();
                re6.m10321v((re6) pe6Var.f26373b);
                String str3 = Build.MANUFACTURER;
                pe6Var.m8971b();
                re6.m10320u((re6) pe6Var.f26373b);
                String str4 = Build.FINGERPRINT;
                pe6Var.m8971b();
                re6.m10319t((re6) pe6Var.f26373b);
            }
        } catch (RuntimeException e) {
            qv5.m10141i("BillingClient", "Runtime error while populating device info.", e);
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m8432A(yc6 yc6Var) {
        try {
            pq3 pq3Var = this.f25320h;
            int i = this.f25324l;
            pq3Var.getClass();
            try {
                pe6 pe6Var = (pe6) ((re6) pq3Var.f27896b).m10543l();
                pe6Var.m8971b();
                re6.m10313D((re6) pe6Var.f26373b, i);
                pq3Var.f27896b = (re6) pe6Var.m8970a();
                pq3Var.m9620s(yc6Var);
            } catch (Throwable th) {
                qv5.m10141i("BillingLogger", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            qv5.m10141i("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m8433B(fd6 fd6Var) {
        try {
            pq3 pq3Var = this.f25320h;
            int i = this.f25324l;
            pq3Var.getClass();
            try {
                pe6 pe6Var = (pe6) ((re6) pq3Var.f27896b).m10543l();
                pe6Var.m8971b();
                re6.m10313D((re6) pe6Var.f26373b, i);
                re6 re6Var = (re6) pe6Var.m8970a();
                pq3Var.f27896b = re6Var;
                try {
                    pq3Var.m9604D(fd6Var, re6Var);
                } catch (Throwable th) {
                    qv5.m10141i("BillingLogger", "Unable to log.", th);
                }
            } catch (Throwable th2) {
                qv5.m10141i("BillingLogger", "Unable to log.", th2);
            }
        } catch (Throwable th3) {
            qv5.m10141i("BillingClient", "Unable to log.", th3);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m8434C(int i, int i2, f00 f00Var) {
        try {
            int i3 = kz5.f23653a;
            uc6 uc6Var = (uc6) kz5.m7757b(i, 6, f00Var, null, xd6.f34175b).m10543l();
            sg6 sg6VarM11892q = vg6.m11892q();
            sg6VarM11892q.m10749c(i2 > 0);
            sg6VarM11892q.m10750d(i2);
            uc6Var.m11534d(sg6VarM11892q);
            m8432A((yc6) uc6Var.m8970a());
        } catch (Throwable th) {
            qv5.m10141i("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public final void m8435D(int i) {
        String str;
        String str2;
        synchronized (this.f25313a) {
            try {
                if (this.f25314b == 3) {
                    return;
                }
                byte b = this.f25314b;
                if (b == 0) {
                    str = "DISCONNECTED";
                } else if (b != 1) {
                    str = b != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str = "CONNECTING";
                }
                if (i == 0) {
                    str2 = "DISCONNECTED";
                } else if (i != 1) {
                    str2 = i != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str2 = "CONNECTING";
                }
                qv5.m10139g("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.f25314b = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m8436E(InterfaceC1052pz interfaceC1052pz, int i) {
        int i2;
        f00 f00VarM8444k;
        f00 f00Var;
        synchronized (this.f25313a) {
            try {
                if (m8439H()) {
                    f00VarM8444k = m8444k(i);
                } else {
                    if (this.f25314b == 1) {
                        qv5.m10140h("BillingClient", "Client is already in the process of connecting to billing service.");
                        f00Var = rz5.f29761d;
                        m8434C(37, i, f00Var);
                    } else if (this.f25314b == 3) {
                        qv5.m10140h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                        f00Var = rz5.f29767j;
                        m8434C(38, i, f00Var);
                    } else {
                        m8435D(1);
                        if (i == 0) {
                            this.f25309B = interfaceC1052pz;
                            i = 0;
                        }
                        m8437F();
                        qv5.m10139g("BillingClient", "Starting in-app billing setup.");
                        zu5 zu5Var = new zu5();
                        zu5Var.f36397e = this;
                        is5 is5Var = this.f25312E;
                        zu5Var.f36394b = new tt5(is5Var);
                        zu5Var.f36395c = new tt5(is5Var);
                        zu5Var.f36393a = interfaceC1052pz;
                        zu5Var.f36396d = i;
                        VarHandle.storeStoreFence();
                        this.f25322j = zu5Var;
                        zu5 zu5Var2 = this.f25322j;
                        synchronized (zu5Var2.f36397e.f25313a) {
                            tt5 tt5Var = zu5Var2.f36394b;
                            tt5Var.f31434c = 0L;
                            tt5Var.f31433b = false;
                            tt5Var.m11159a();
                        }
                        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                        intent.setPackage("com.android.vending");
                        List<ResolveInfo> listQueryIntentServices = this.f25319g.getPackageManager().queryIntentServices(intent, 0);
                        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                            i2 = 41;
                        } else {
                            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                            i2 = 40;
                            if (serviceInfo != null) {
                                String str = serviceInfo.packageName;
                                String str2 = serviceInfo.name;
                                if (!Objects.equals(str, "com.android.vending") || str2 == null) {
                                    qv5.m10140h("BillingClient", "The device doesn't have valid Play Store.");
                                } else {
                                    ComponentName componentName = new ComponentName(str, str2);
                                    Intent intent2 = new Intent(intent);
                                    intent2.setComponent(componentName);
                                    intent2.putExtra("playBillingLibraryVersion", this.f25315c);
                                    synchronized (this.f25313a) {
                                        try {
                                            if (this.f25314b == 2) {
                                                f00VarM8444k = m8444k(i);
                                            } else if (this.f25314b != 1) {
                                                qv5.m10140h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                                f00Var = rz5.f29767j;
                                                m8434C(C0313rh.f10762W0, i, f00Var);
                                            } else {
                                                zu5 zu5Var3 = this.f25322j;
                                                Context context = this.f25319g;
                                                if (i > 0 ? context.bindService(intent2, 1, m8441g(), zu5Var3) : context.bindService(intent2, zu5Var3, 1)) {
                                                    qv5.m10139g("BillingClient", "Service was bonded successfully.");
                                                    f00VarM8444k = null;
                                                } else {
                                                    qv5.m10140h("BillingClient", "Connection to Billing service is blocked.");
                                                    i2 = 39;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                qv5.m10140h("BillingClient", "The device doesn't have valid Play Store.");
                            }
                        }
                        m8435D(0);
                        qv5.m10139g("BillingClient", "Billing service unavailable on device.");
                        f00 f00Var2 = rz5.f29759b;
                        m8434C(i2, i, f00Var2);
                        f00VarM8444k = f00Var2;
                    }
                    f00VarM8444k = f00Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (f00VarM8444k != null) {
            interfaceC1052pz.mo7233a(f00VarM8444k);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m8437F() {
        synchronized (this.f25313a) {
            if (this.f25322j != null) {
                try {
                    this.f25319g.unbindService(this.f25322j);
                    this.f25321i = null;
                    this.f25322j = null;
                } catch (Throwable th) {
                    try {
                        qv5.m10141i("BillingClient", "There was an exception while unbinding service!", th);
                        this.f25321i = null;
                        this.f25322j = null;
                    } catch (Throwable th2) {
                        this.f25321i = null;
                        this.f25322j = null;
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final boolean m8438G(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        is5 is5Var = this.f25312E;
        if (is5Var == null) {
            xy4.m12782k("ticker");
            return false;
        }
        long jM6930a = is5Var.m6930a();
        int i = g06.f19479c;
        long jM6930a2 = j;
        for (int i2 = 1; i2 <= i; i2++) {
            try {
                long jMax = Math.max(0L, jM6930a2);
                if (jMax <= 0) {
                    qv5.m10140h("BillingClient", "No time remaining for reconnection attempt.");
                    return m8439H();
                }
                int i3 = ((f00) m8446m(i2).get(jMax, timeUnit)).f18622a;
                if (i3 == 0) {
                    qv5.m10139g("BillingClient", "Reconnection succeeded with result: " + i3);
                    return m8439H();
                }
                qv5.m10140h("BillingClient", "Reconnection failed with result: " + i3);
                jM6930a2 = j - (((is5Var.m6930a() - jM6930a) + 0) / 1000000);
                long jPow = ((long) Math.pow(2.0d, i2 - 1)) * 1000;
                if (jM6930a2 < jPow) {
                    qv5.m10140h("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return m8439H();
                }
                if (i2 < i && jPow > 0) {
                    try {
                        Thread.sleep(jPow);
                        jM6930a2 = j - (((is5Var.m6930a() - jM6930a) + 0) / 1000000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        qv5.m10141i("BillingClient", "Error sleeping during reconnection attempt: ", e);
                    }
                }
            } catch (Exception e2) {
                if (e2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                qv5.m10141i("BillingClient", "Error during reconnection attempt: ", e2);
            }
        }
        qv5.m10140h("BillingClient", "Max retries reached.");
        return m8439H();
    }

    /* JADX INFO: renamed from: H */
    public final boolean m8439H() {
        boolean z;
        synchronized (this.f25313a) {
            try {
                z = false;
                if (this.f25314b == 2 && this.f25321i != null && this.f25322j != null) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: I */
    public final void m8440I(f00 f00Var) {
        if (Thread.interrupted()) {
            return;
        }
        oz5 oz5Var = new oz5((byte) 8);
        oz5Var.f27249b = this;
        oz5Var.f27250c = f00Var;
        VarHandle.storeStoreFence();
        this.f25317e.post(oz5Var);
    }

    /* JADX INFO: renamed from: a */
    public void mo5431a(C0973o7 c0973o7, C0964nz c0964nz) {
        uo5 uo5Var = new uo5((byte) 1);
        uo5Var.f32036b = this;
        uo5Var.f32037c = c0964nz;
        uo5Var.f32038d = c0973o7;
        VarHandle.storeStoreFence();
        ar1 ar1Var = new ar1((byte) 9);
        ar1Var.f14798b = this;
        ar1Var.f14799c = c0964nz;
        VarHandle.storeStoreFence();
        if (m8427h(uo5Var, 30000L, ar1Var, m8442i(), m8441g()) == null) {
            f00 f00VarM8445l = m8445l();
            m8450u(25, 3, f00VarM8445l);
            c0964nz.m8899a(f00VarM8445l);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo5432b(C0973o7 c0973o7, C0964nz c0964nz) {
        uo5 uo5Var = new uo5((byte) 3);
        uo5Var.f32036b = this;
        uo5Var.f32037c = c0964nz;
        uo5Var.f32038d = c0973o7;
        VarHandle.storeStoreFence();
        yn3 yn3Var = new yn3((byte) 4);
        yn3Var.f35360b = this;
        yn3Var.f35361c = c0964nz;
        yn3Var.f35362d = c0973o7;
        VarHandle.storeStoreFence();
        if (m8427h(uo5Var, 30000L, yn3Var, m8442i(), m8441g()) == null) {
            f00 f00VarM8445l = m8445l();
            m8450u(25, 4, f00VarM8445l);
            c0964nz.m8900b(f00VarM8445l, c0973o7.f26402b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {, blocks: (B:20:0x004a, B:22:0x004e), top: B:44:0x004a, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public void mo5433c() {
        ExecutorService executorService;
        try {
            int i = kz5.f23653a;
            m8433B(kz5.m7758c(12, xd6.f34175b));
        } catch (Throwable th) {
            qv5.m10141i("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f25313a) {
            try {
                if (this.f25318f != null) {
                    zr6 zr6Var = this.f25318f;
                    e86 e86Var = zr6Var.f36327d;
                    Context context = zr6Var.f36324a;
                    e86Var.m4964c(context);
                    zr6Var.f36328e.m4964c(context);
                    try {
                        qv5.m10139g("BillingClient", "Unbinding from service.");
                        m8437F();
                    } catch (Throwable th2) {
                        qv5.m10141i("BillingClient", "There was an exception while unbinding from the service while ending connection!", th2);
                    }
                    try {
                        synchronized (this) {
                            executorService = this.f25310C;
                            if (executorService != null) {
                                executorService.shutdownNow();
                                this.f25310C = null;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            qv5.m10141i("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th3);
                        } catch (Throwable th4) {
                            m8435D(3);
                            this.f25309B = null;
                            throw th4;
                        }
                    }
                    m8435D(3);
                    this.f25309B = null;
                } else {
                    qv5.m10139g("BillingClient", "Unbinding from service.");
                    m8437F();
                    synchronized (this) {
                        executorService = this.f25310C;
                        if (executorService != null) {
                            executorService.shutdownNow();
                            this.f25310C = null;
                        }
                        m8435D(3);
                        this.f25309B = null;
                    }
                }
            } catch (Throwable th5) {
                qv5.m10141i("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", th5);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0301 A[EDGE_INSN: B:137:0x0301->B:138:0x0303 BREAK  A[LOOP:5: B:91:0x01b8->B:98:0x01ee]] */
    /* JADX WARN: Code duplicated, block: B:140:0x0307  */
    /* JADX WARN: Code duplicated, block: B:142:0x0317  */
    /* JADX WARN: Code duplicated, block: B:144:0x0321  */
    /* JADX WARN: Code duplicated, block: B:146:0x0351  */
    /* JADX WARN: Code duplicated, block: B:147:0x0359  */
    /* JADX WARN: Code duplicated, block: B:150:0x0361  */
    /* JADX WARN: Code duplicated, block: B:153:0x036c  */
    /* JADX WARN: Code duplicated, block: B:156:0x038b  */
    /* JADX WARN: Code duplicated, block: B:159:0x039d  */
    /* JADX WARN: Code duplicated, block: B:162:0x03af  */
    /* JADX WARN: Code duplicated, block: B:165:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:167:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:171:0x03e2 A[LOOP:2: B:169:0x03dc->B:171:0x03e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:174:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:177:0x0415  */
    /* JADX WARN: Code duplicated, block: B:179:0x0438  */
    /* JADX WARN: Code duplicated, block: B:181:0x043e  */
    /* JADX WARN: Code duplicated, block: B:184:0x044a  */
    /* JADX WARN: Code duplicated, block: B:186:0x0466  */
    /* JADX WARN: Code duplicated, block: B:188:0x0478  */
    /* JADX WARN: Code duplicated, block: B:190:0x0485  */
    /* JADX WARN: Code duplicated, block: B:191:0x0488  */
    /* JADX WARN: Code duplicated, block: B:193:0x0495  */
    /* JADX WARN: Code duplicated, block: B:196:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:198:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:213:0x0523  */
    /* JADX WARN: Code duplicated, block: B:217:0x052f  */
    /* JADX WARN: Code duplicated, block: B:219:0x0534  */
    /* JADX WARN: Code duplicated, block: B:223:0x0569  */
    /* JADX WARN: Code duplicated, block: B:226:0x0574  */
    /* JADX WARN: Code duplicated, block: B:229:0x057f  */
    /* JADX WARN: Code duplicated, block: B:232:0x058a  */
    /* JADX WARN: Code duplicated, block: B:241:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:243:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:246:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:249:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:250:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:252:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:258:0x0625  */
    /* JADX WARN: Code duplicated, block: B:259:0x0628  */
    /* JADX WARN: Code duplicated, block: B:264:0x0635  */
    /* JADX WARN: Code duplicated, block: B:266:0x0639 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:268:0x063e  */
    /* JADX WARN: Code duplicated, block: B:270:0x0642  */
    /* JADX WARN: Code duplicated, block: B:271:0x0645  */
    /* JADX WARN: Code duplicated, block: B:273:0x066f  */
    /* JADX WARN: Code duplicated, block: B:275:0x0690 A[Catch: Exception -> 0x069b, CancellationException | TimeoutException -> 0x069e, TRY_ENTER, TryCatch #5 {Exception -> 0x069b, blocks: (B:275:0x0690, B:281:0x06a1, B:283:0x06ba, B:310:0x0749, B:306:0x0732, B:297:0x0707, B:316:0x0755), top: B:339:0x068e }] */
    /* JADX WARN: Code duplicated, block: B:281:0x06a1 A[Catch: Exception -> 0x069b, CancellationException | TimeoutException -> 0x069e, TryCatch #5 {Exception -> 0x069b, blocks: (B:275:0x0690, B:281:0x06a1, B:283:0x06ba, B:310:0x0749, B:306:0x0732, B:297:0x0707, B:316:0x0755), top: B:339:0x068e }] */
    /* JADX WARN: Code duplicated, block: B:283:0x06ba A[Catch: Exception -> 0x069b, CancellationException | TimeoutException -> 0x069e, TRY_LEAVE, TryCatch #5 {Exception -> 0x069b, blocks: (B:275:0x0690, B:281:0x06a1, B:283:0x06ba, B:310:0x0749, B:306:0x0732, B:297:0x0707, B:316:0x0755), top: B:339:0x068e }] */
    /* JADX WARN: Code duplicated, block: B:285:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:289:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:290:0x06d9 A[Catch: all -> 0x06e8, TryCatch #8 {all -> 0x06e8, blocks: (B:287:0x06d0, B:290:0x06d9, B:292:0x06dd, B:295:0x06ea), top: B:341:0x06d0 }] */
    /* JADX WARN: Code duplicated, block: B:292:0x06dd A[Catch: all -> 0x06e8, TryCatch #8 {all -> 0x06e8, blocks: (B:287:0x06d0, B:290:0x06d9, B:292:0x06dd, B:295:0x06ea), top: B:341:0x06d0 }] */
    /* JADX WARN: Code duplicated, block: B:295:0x06ea A[Catch: all -> 0x06e8, TRY_LEAVE, TryCatch #8 {all -> 0x06e8, blocks: (B:287:0x06d0, B:290:0x06d9, B:292:0x06dd, B:295:0x06ea), top: B:341:0x06d0 }] */
    /* JADX WARN: Code duplicated, block: B:299:0x071b  */
    /* JADX WARN: Code duplicated, block: B:302:0x0721  */
    /* JADX WARN: Code duplicated, block: B:316:0x0755 A[Catch: Exception -> 0x069b, CancellationException | TimeoutException -> 0x069e, CancellationException | TimeoutException -> 0x069e, TRY_LEAVE, TryCatch #5 {Exception -> 0x069b, blocks: (B:275:0x0690, B:281:0x06a1, B:283:0x06ba, B:310:0x0749, B:306:0x0732, B:297:0x0707, B:316:0x0755), top: B:339:0x068e }] */
    /* JADX WARN: Code duplicated, block: B:335:0x0726 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x06d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x054e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:325:0x07b1
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX INFO: renamed from: d */
    public p000.f00 mo5434d(android.app.Activity r34, p000.C1126rz r35) {
        /*
            Method dump skipped, instruction units count: 1980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0927mz.mo5434d(android.app.Activity, rz):f00");
    }

    /* JADX INFO: renamed from: e */
    public void mo5435e(wd3 wd3Var, C1015oz c1015oz) {
        uo5 uo5Var = new uo5((byte) 4);
        uo5Var.f32036b = this;
        uo5Var.f32037c = c1015oz;
        uo5Var.f32038d = wd3Var;
        VarHandle.storeStoreFence();
        oz5 oz5Var = new oz5((byte) 11);
        oz5Var.f27249b = this;
        oz5Var.f27250c = c1015oz;
        VarHandle.storeStoreFence();
        if (m8427h(uo5Var, 30000L, oz5Var, m8442i(), m8441g()) == null) {
            f00 f00VarM8445l = m8445l();
            m8450u(25, 7, f00VarM8445l);
            uu5 uu5Var = sv5.f30597b;
            mw5 mw5Var = mw5.f25264e;
            cf0 cf0Var = c1015oz.f27240a;
            tg3 tg3Var = new tg3();
            tg3Var.f31144a = f00VarM8445l;
            tg3Var.f31145b = mw5Var;
            VarHandle.storeStoreFence();
            cf0Var.m4989U(tg3Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo5436f(jp0 jp0Var) {
        m8436E(jp0Var, 0);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized ExecutorService m8441g() {
        ExecutorService executorServiceNewFixedThreadPool;
        executorServiceNewFixedThreadPool = this.f25310C;
        if (executorServiceNewFixedThreadPool == null) {
            int i = qv5.f28836a;
            k82 k82Var = new k82((byte) 1);
            k82Var.f22982c = Executors.defaultThreadFactory();
            k82Var.f22981b = new AtomicInteger(1);
            VarHandle.storeStoreFence();
            executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(i, k82Var);
            this.f25310C = executorServiceNewFixedThreadPool;
        }
        return executorServiceNewFixedThreadPool;
    }

    /* JADX INFO: renamed from: i */
    public final Handler m8442i() {
        return Looper.myLooper() == null ? this.f25317e : new Handler(Looper.myLooper());
    }

    /* JADX INFO: renamed from: j */
    public final C0795je m8443j(f00 f00Var, int i, String str, Exception exc) {
        qv5.m10141i("BillingClient", str, exc);
        m8452w(i, 7, f00Var, kz5.m7756a(exc));
        return new C0795je(f00Var.f18622a, f00Var.f18624c, new ArrayList(), new ArrayList());
    }

    /* JADX INFO: renamed from: k */
    public final f00 m8444k(int i) {
        qv5.m10139g("BillingClient", "Service connection is valid. No need to re-initialize.");
        bd6 bd6VarM5694r = fd6.m5694r();
        bd6VarM5694r.m8971b();
        fd6.m5693q((fd6) bd6VarM5694r.f26373b, 6);
        sg6 sg6VarM11892q = vg6.m11892q();
        sg6VarM11892q.m8971b();
        vg6.m11897v((vg6) sg6VarM11892q.f26373b);
        sg6VarM11892q.m10749c(i > 0);
        sg6VarM11892q.m10750d(i);
        bd6VarM5694r.m8971b();
        fd6.m5697v((fd6) bd6VarM5694r.f26373b, (vg6) sg6VarM11892q.m8970a());
        m8433B((fd6) bd6VarM5694r.m8970a());
        return rz5.f29766i;
    }

    /* JADX INFO: renamed from: l */
    public final f00 m8445l() {
        int[] iArr = {0, 3};
        synchronized (this.f25313a) {
            for (int i = 0; i < 2; i++) {
                if (this.f25314b == iArr[i]) {
                    return rz5.f29767j;
                }
            }
            return rz5.f29765h;
        }
    }

    /* JADX INFO: renamed from: m */
    public final yz5 m8446m(int i) {
        if (this.f25338z && !m8439H()) {
            hf0 hf0Var = new hf0((byte) 10);
            hf0Var.f20529c = this;
            hf0Var.f20528b = i;
            VarHandle.storeStoreFence();
            return x06.m12450a(hf0Var);
        }
        qv5.m10139g("BillingClient", "Already connected or not opted into auto reconnection.");
        f00 f00Var = rz5.f29766i;
        tz5 tz5Var = new tz5();
        tz5Var.f31571a = f00Var;
        VarHandle.storeStoreFence();
        return tz5Var;
    }

    /* JADX INFO: renamed from: n */
    public final void m8447n() {
        if (TextUtils.isEmpty(null)) {
            this.f25319g.getPackageName();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m8448p(C0964nz c0964nz, f00 f00Var, int i, Exception exc) {
        qv5.m10141i("BillingClient", "Error in acknowledge purchase!", exc);
        m8452w(i, 3, f00Var, kz5.m7756a(exc));
        c0964nz.m8899a(f00Var);
    }

    /* JADX INFO: renamed from: t */
    public final pq3 m8449t(f00 f00Var, int i, String str, Exception exc) {
        m8452w(i, 9, f00Var, kz5.m7756a(exc));
        qv5.m10141i("BillingClient", str, exc);
        return new pq3(f00Var, (ArrayList) null);
    }

    /* JADX INFO: renamed from: u */
    public final void m8450u(int i, int i2, f00 f00Var) {
        try {
            int i3 = kz5.f23653a;
            m8432A(kz5.m7757b(i, i2, f00Var, null, xd6.f34175b));
        } catch (Throwable th) {
            qv5.m10141i("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m8451v(int i, f00 f00Var, long j) {
        try {
            int i2 = kz5.f23653a;
            try {
                this.f25320h.m9622u(kz5.m7757b(i, 2, f00Var, null, xd6.f34175b), this.f25324l, j);
            } catch (Throwable th) {
                qv5.m10141i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            qv5.m10141i("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m8452w(int i, int i2, f00 f00Var, String str) {
        try {
            int i3 = kz5.f23653a;
            m8432A(kz5.m7757b(i, i2, f00Var, str, xd6.f34175b));
        } catch (Throwable th) {
            qv5.m10141i("BillingClient", "Unable to log.", th);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m8453x(int i, f00 f00Var, long j, boolean z) {
        try {
            int i2 = kz5.f23653a;
            try {
                this.f25320h.m9624w(kz5.m7757b(i, 2, f00Var, null, xd6.f34175b), this.f25324l, j, z);
            } catch (Throwable th) {
                qv5.m10141i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            qv5.m10141i("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m8454y(int i, f00 f00Var, String str, long j, boolean z) {
        try {
            int i2 = kz5.f23653a;
            try {
                this.f25320h.m9624w(kz5.m7757b(i, 2, f00Var, str, xd6.f34175b), this.f25324l, j, z);
            } catch (Throwable th) {
                qv5.m10141i("BillingClient", "Unable to log.", th);
            }
        } catch (Throwable th2) {
            qv5.m10141i("BillingClient", "Unable to log.", th2);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m8455z(C0964nz c0964nz, String str, f00 f00Var, int i, String str2, Exception exc) {
        qv5.m10141i("BillingClient", str2, exc);
        m8452w(i, 4, f00Var, kz5.m7756a(exc));
        c0964nz.m8900b(f00Var, str);
    }

    public C0927mz(i50 i50Var, Context context, C0890lz c0890lz) {
        int i = bw5.f15662c;
        this.f25308A = cx5.f16587j;
        long jNextLong = new Random().nextLong();
        this.f25311D = Long.valueOf(jNextLong);
        this.f25312E = us5.f32149a;
        this.f25315c = "9.1.0";
        String strM8428o = m8428o();
        this.f25316d = strM8428o;
        this.f25319g = context.getApplicationContext();
        pe6 pe6VarM10310A = re6.m10310A();
        pe6VarM10310A.m9508h();
        if (strM8428o != null) {
            pe6VarM10310A.m8971b();
            re6.m10325z((re6) pe6VarM10310A.f26373b, strM8428o);
        }
        pe6VarM10310A.m9507g(this.f25319g.getPackageName());
        pe6VarM10310A.m8971b();
        re6.m10314E((re6) pe6VarM10310A.f26373b, jNextLong);
        boolean z = c0890lz.f24480d;
        pe6VarM10310A.m8971b();
        re6.m10323x((re6) pe6VarM10310A.f26373b, z);
        pe6VarM10310A.m9503c(Build.VERSION.SDK_INT);
        pe6VarM10310A.m9506f();
        m8431s(pe6VarM10310A, context);
        try {
            pe6VarM10310A.m9504d(this.f25319g.getPackageManager().getPackageInfo(this.f25319g.getPackageName(), 0).versionCode);
        } catch (Throwable th) {
            qv5.m10141i("BillingClient", "Error getting app version code.", th);
        }
        this.f25320h = new pq3(this.f25319g, (re6) pe6VarM10310A.m8970a());
        qv5.m10140h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f25318f = new zr6(this.f25319g, null, this.f25320h);
        this.f25337y = i50Var;
        this.f25319g.getPackageName();
        this.f25338z = c0890lz.f24480d;
    }
}
