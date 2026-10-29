package p000;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import java.io.Serializable;
import java.lang.invoke.VarHandle;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class oa6 implements oc6 {

    /* JADX INFO: renamed from: E */
    public static volatile oa6 f26504E;

    /* JADX INFO: renamed from: A */
    public int f26505A;

    /* JADX INFO: renamed from: B */
    public int f26506B;

    /* JADX INFO: renamed from: D */
    public final long f26508D;

    /* JADX INFO: renamed from: a */
    public final Context f26509a;

    /* JADX INFO: renamed from: b */
    public final boolean f26510b;

    /* JADX INFO: renamed from: c */
    public final yj5 f26511c;

    /* JADX INFO: renamed from: d */
    public final op5 f26512d;

    /* JADX INFO: renamed from: e */
    public final s86 f26513e;

    /* JADX INFO: renamed from: f */
    public final d76 f26514f;

    /* JADX INFO: renamed from: g */
    public final ea6 f26515g;

    /* JADX INFO: renamed from: h */
    public final vk6 f26516h;

    /* JADX INFO: renamed from: i */
    public final dn6 f26517i;

    /* JADX INFO: renamed from: j */
    public final p66 f26518j;

    /* JADX INFO: renamed from: k */
    public final ia5 f26519k;

    /* JADX INFO: renamed from: l */
    public final uh6 f26520l;

    /* JADX INFO: renamed from: m */
    public final mg6 f26521m;

    /* JADX INFO: renamed from: n */
    public final ly5 f26522n;

    /* JADX INFO: renamed from: o */
    public final wg6 f26523o;

    /* JADX INFO: renamed from: p */
    public final String f26524p;

    /* JADX INFO: renamed from: q */
    public m66 f26525q;

    /* JADX INFO: renamed from: r */
    public oj6 f26526r;

    /* JADX INFO: renamed from: s */
    public yr5 f26527s;

    /* JADX INFO: renamed from: t */
    public e66 f26528t;

    /* JADX INFO: renamed from: u */
    public zg6 f26529u;

    /* JADX INFO: renamed from: w */
    public Boolean f26531w;

    /* JADX INFO: renamed from: x */
    public long f26532x;

    /* JADX INFO: renamed from: y */
    public volatile Boolean f26533y;

    /* JADX INFO: renamed from: z */
    public volatile boolean f26534z;

    /* JADX INFO: renamed from: v */
    public boolean f26530v = false;

    /* JADX INFO: renamed from: C */
    public final AtomicInteger f26507C = new AtomicInteger(0);

    public oa6(jd6 jd6Var) {
        qe4 qe4Var;
        Context context;
        byte b = 0;
        Context context2 = jd6Var.f22185a;
        byte b2 = 1;
        yj5 yj5Var = new yj5(b2);
        this.f26511c = yj5Var;
        x46.f33990a = yj5Var;
        this.f26509a = context2;
        this.f26510b = jd6Var.f22189e;
        this.f26533y = jd6Var.f22186b;
        this.f26524p = jd6Var.f22191g;
        this.f26534z = true;
        if (le6.f23980h == null) {
            Object obj = le6.f23979g;
            synchronized (obj) {
                try {
                    if (le6.f23980h == null) {
                        synchronized (obj) {
                            try {
                                cd6 cd6Var = le6.f23980h;
                                Context applicationContext = context2.getApplicationContext();
                                context2 = applicationContext != null ? applicationContext : context2;
                                if (cd6Var == null || cd6Var.f15963a != context2) {
                                    if (cd6Var != null) {
                                        hd6.m6362c();
                                        xe6.m12682a();
                                        synchronized (rd6.class) {
                                            try {
                                                rd6 rd6Var = rd6.f29193e;
                                                if (rd6Var != null && (context = (Context) rd6Var.f29197c) != null && ((pd6) rd6Var.f29198d) != null && rd6Var.f29196b) {
                                                    context.getContentResolver().unregisterContentObserver((pd6) rd6.f29193e.f29198d);
                                                }
                                                rd6.f29193e = null;
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    }
                                    y63 y63Var = new y63();
                                    y63Var.f34949a = context2;
                                    VarHandle.storeStoreFence();
                                    if (y63Var instanceof Serializable) {
                                        re4 re4Var = new re4();
                                        re4Var.f29212a = y63Var;
                                        VarHandle.storeStoreFence();
                                        qe4Var = re4Var;
                                    } else {
                                        se4 se4Var = new se4();
                                        se4Var.f30217a = y63Var;
                                        qe4Var = se4Var;
                                    }
                                    cd6 cd6Var2 = new cd6();
                                    cd6Var2.f15963a = context2;
                                    cd6Var2.f15964b = qe4Var;
                                    VarHandle.storeStoreFence();
                                    le6.f23980h = cd6Var2;
                                    le6.f23981i.incrementAndGet();
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        this.f26519k = ia5.f21219j;
        Long l = jd6Var.f22190f;
        this.f26508D = l != null ? l.longValue() : System.currentTimeMillis();
        op5 op5Var = new op5();
        op5Var.f36084a = this;
        op5Var.f26944h = xk5.f34344b;
        this.f26512d = op5Var;
        s86 s86Var = new s86(this);
        s86Var.f29993o = new n86(s86Var, "session_timeout", 1800000L);
        s86Var.f29994p = new h86(s86Var, "start_new_session", true);
        s86Var.f29975N = new n86(s86Var, "last_pause_time", 0L);
        s86Var.f29976O = new n86(s86Var, "session_id", 0L);
        s86Var.f29995q = new C1126rz(s86Var, "non_personalized_ads");
        s86Var.f29973L = new r36(s86Var, "last_received_uri_timestamps_by_source");
        s86Var.f29974M = new h86(s86Var, "allow_remote_dynamite", false);
        s86Var.f29988j = new n86(s86Var, "first_open_time", 0L);
        new n86(s86Var, "app_install_time", 0L);
        s86Var.f29989k = new C1126rz(s86Var, "app_instance_id");
        s86Var.f29978Q = new h86(s86Var, "app_backgrounded", false);
        s86Var.f29979R = new h86(s86Var, "deep_link_retrieval_complete", false);
        s86Var.f29980S = new n86(s86Var, "deep_link_retrieval_attempts", 0L);
        s86Var.f29981T = new C1126rz(s86Var, "firebase_feature_rollouts");
        s86Var.f29982U = new C1126rz(s86Var, "deferred_attribution_cache");
        s86Var.f29983V = new n86(s86Var, "deferred_attribution_cache_timestamp", 0L);
        s86Var.f29984W = new r36(s86Var, "default_event_parameters");
        VarHandle.storeStoreFence();
        s86Var.m7956x();
        this.f26513e = s86Var;
        d76 d76Var = new d76(this);
        d76Var.f16832g = (char) 0;
        d76Var.f16833h = -1L;
        d76Var.f16835j = new x66(d76Var, 6, false, false);
        d76Var.f16836k = new x66(d76Var, 6, true, false);
        d76Var.f16837l = new x66(d76Var, 6, false, true);
        x66 x66Var = new x66(d76Var, 5, false, false);
        d76Var.f16838m = x66Var;
        d76Var.f16839n = new x66(d76Var, 5, true, false);
        d76Var.f16840o = new x66(d76Var, 5, false, true);
        d76Var.f16841p = new x66(d76Var, 4, false, false);
        d76Var.f16842q = new x66(d76Var, 3, false, false);
        byte b3 = 2;
        d76Var.f16831L = new x66(d76Var, 2, false, false);
        VarHandle.storeStoreFence();
        d76Var.m7956x();
        this.f26514f = d76Var;
        dn6 dn6Var = new dn6(this);
        dn6Var.f17228l = null;
        dn6Var.f17224h = new AtomicLong(0L);
        VarHandle.storeStoreFence();
        dn6Var.m7956x();
        this.f26517i = dn6Var;
        y86 y86Var = new y86(b2);
        y86Var.f35029b = this;
        VarHandle.storeStoreFence();
        p66 p66Var = new p66();
        p66Var.f27410a = y86Var;
        VarHandle.storeStoreFence();
        this.f26518j = p66Var;
        ly5 ly5Var = new ly5();
        ly5Var.f36084a = this;
        ly5Var.f24475g = new C0805jo(0);
        ly5Var.f24474f = new C0805jo(0);
        VarHandle.storeStoreFence();
        this.f26522n = ly5Var;
        uh6 uh6Var = new uh6(this);
        uh6Var.f31889p = new Object();
        uh6Var.f31883j = new ConcurrentHashMap();
        VarHandle.storeStoreFence();
        uh6Var.m9742v();
        this.f26520l = uh6Var;
        mg6 mg6Var = new mg6(this);
        mg6Var.f24900i = new CopyOnWriteArraySet();
        mg6Var.f24903l = new Object();
        mg6Var.f24904m = false;
        mg6Var.f24905n = 1;
        mg6Var.f24893Q = true;
        rr5 rr5Var = new rr5((byte) 12);
        rr5Var.f29555b = mg6Var;
        VarHandle.storeStoreFence();
        mg6Var.f24897U = rr5Var;
        mg6Var.f24902k = new AtomicReference();
        mg6Var.f24889M = xc6.f34159c;
        mg6Var.f24891O = -1L;
        mg6Var.f24890N = new AtomicLong(0L);
        y86 y86Var2 = new y86(b3);
        y86Var2.f35029b = this;
        VarHandle.storeStoreFence();
        mg6Var.f24892P = y86Var2;
        VarHandle.storeStoreFence();
        mg6Var.m9742v();
        this.f26521m = mg6Var;
        vk6 vk6Var = new vk6(this);
        vk6Var.f32707h = true;
        rr5 rr5Var2 = new rr5((byte) 14);
        rr5Var2.f29555b = vk6Var;
        VarHandle.storeStoreFence();
        vk6Var.f32708i = rr5Var2;
        dx4 dx4Var = new dx4();
        dx4Var.f17485d = vk6Var;
        oa6 oa6Var = (oa6) vk6Var.f36084a;
        dx4Var.f17484c = new kk6(dx4Var, oa6Var, b);
        oa6Var.f26519k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        dx4Var.f17482a = jElapsedRealtime;
        dx4Var.f17483b = jElapsedRealtime;
        VarHandle.storeStoreFence();
        vk6Var.f32709j = dx4Var;
        yg3 yg3Var = new yg3((byte) 23);
        yg3Var.f35216c = vk6Var;
        VarHandle.storeStoreFence();
        vk6Var.f32710k = yg3Var;
        VarHandle.storeStoreFence();
        vk6Var.m9742v();
        this.f26516h = vk6Var;
        wg6 wg6Var = new wg6();
        wg6Var.f36084a = this;
        this.f26505A++;
        wg6Var.m7956x();
        this.f26523o = wg6Var;
        ea6 ea6Var = new ea6(this);
        ea6Var.f17937m = new Object();
        ea6Var.f17938n = new Semaphore(2);
        ea6Var.f17933i = new PriorityBlockingQueue();
        ea6Var.f17934j = new LinkedBlockingQueue();
        w96 w96Var = new w96();
        w96Var.f33184b = ea6Var;
        w96Var.f33183a = "Thread death: Uncaught exception on worker thread";
        VarHandle.storeStoreFence();
        ea6Var.f17935k = w96Var;
        w96 w96Var2 = new w96();
        w96Var2.f33184b = ea6Var;
        w96Var2.f33183a = "Thread death: Uncaught exception on network thread";
        VarHandle.storeStoreFence();
        ea6Var.f17936l = w96Var2;
        VarHandle.storeStoreFence();
        ea6Var.m7956x();
        this.f26515g = ea6Var;
        mz5 mz5Var = jd6Var.f22188d;
        b = (mz5Var == null || mz5Var.f25348e == 0) ? (byte) 1 : (byte) 0;
        if (this.f26509a.getApplicationContext() instanceof Application) {
            m9015k(mg6Var);
            if (((oa6) mg6Var.f36084a).f26509a.getApplicationContext() instanceof Application) {
                Application application = (Application) ((oa6) mg6Var.f36084a).f26509a.getApplicationContext();
                zs5 zs5Var = mg6Var.f24898g;
                if (zs5Var == null) {
                    zs5Var = new zs5(b3);
                    zs5Var.f36348b = mg6Var;
                    VarHandle.storeStoreFence();
                    mg6Var.f24898g = zs5Var;
                }
                if (b != 0) {
                    application.unregisterActivityLifecycleCallbacks(zs5Var);
                    application.registerActivityLifecycleCallbacks(mg6Var.f24898g);
                    d76 d76Var2 = ((oa6) mg6Var.f36084a).f26514f;
                    m9016l(d76Var2);
                    d76Var2.f16831L.m12504a("Registered activity lifecycle callback");
                }
            }
        } else {
            m9016l(d76Var);
            x66Var.m12504a("Application context is not an Application");
        }
        oz5 oz5Var = new oz5((byte) 20);
        oz5Var.f27249b = jd6Var;
        oz5Var.f27250c = this;
        VarHandle.storeStoreFence();
        ea6Var.m5033D(oz5Var);
    }

    /* JADX INFO: renamed from: i */
    public static final void m9013i(t36 t36Var) {
        if (t36Var != null) {
            return;
        }
        C1077qn.m9989o("Component not created");
    }

    /* JADX INFO: renamed from: j */
    public static final void m9014j(zh0 zh0Var) {
        if (zh0Var != null) {
            return;
        }
        C1077qn.m9989o("Component not created");
    }

    /* JADX INFO: renamed from: k */
    public static final void m9015k(q56 q56Var) {
        if (q56Var == null) {
            C1077qn.m9989o("Component not created");
        } else {
            if (q56Var.f28230f) {
                return;
            }
            C1077qn.m9989o("Component not initialized: ".concat(String.valueOf(q56Var.getClass())));
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m9016l(lc6 lc6Var) {
        if (lc6Var == null) {
            C1077qn.m9989o("Component not created");
        } else {
            if (lc6Var.f23955f) {
                return;
            }
            C1077qn.m9989o("Component not initialized: ".concat(String.valueOf(lc6Var.getClass())));
        }
    }

    /* JADX INFO: renamed from: q */
    public static oa6 m9017q(Context context, mz5 mz5Var, Long l) {
        Bundle bundle;
        if (mz5Var != null) {
            Bundle bundle2 = mz5Var.f25350g;
            mz5Var = new mz5(mz5Var.f25347d, mz5Var.f25348e, mz5Var.f25349f, bundle2, null);
        }
        y42.m12854a0(context);
        y42.m12854a0(context.getApplicationContext());
        if (f26504E == null) {
            synchronized (oa6.class) {
                try {
                    if (f26504E == null) {
                        f26504E = new oa6(new jd6(context, mz5Var, l));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (mz5Var != null && (bundle = mz5Var.f25350g) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            y42.m12854a0(f26504E);
            f26504E.f26533y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        y42.m12854a0(f26504E);
        return f26504E;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9018a() {
        return m9024g() == 0;
    }

    @Override // p000.oc6
    /* JADX INFO: renamed from: b */
    public final d76 mo9019b() {
        d76 d76Var = this.f26514f;
        m9016l(d76Var);
        return d76Var;
    }

    @Override // p000.oc6
    /* JADX INFO: renamed from: c */
    public final ea6 mo9020c() {
        ea6 ea6Var = this.f26515g;
        m9016l(ea6Var);
        return ea6Var;
    }

    @Override // p000.oc6
    /* JADX INFO: renamed from: d */
    public final Context mo9021d() {
        return this.f26509a;
    }

    @Override // p000.oc6
    /* JADX INFO: renamed from: e */
    public final ia5 mo9022e() {
        return this.f26519k;
    }

    @Override // p000.oc6
    /* JADX INFO: renamed from: f */
    public final yj5 mo9023f() {
        return this.f26511c;
    }

    /* JADX INFO: renamed from: g */
    public final int m9024g() {
        ea6 ea6Var = this.f26515g;
        m9016l(ea6Var);
        ea6Var.mo5038t();
        op5 op5Var = this.f26512d;
        if (op5Var.m9228H()) {
            return 1;
        }
        m9016l(ea6Var);
        ea6Var.mo5038t();
        if (!this.f26534z) {
            return 8;
        }
        s86 s86Var = this.f26513e;
        m9014j(s86Var);
        s86Var.mo5038t();
        Boolean boolValueOf = s86Var.m10560y().contains("measurement_enabled") ? Boolean.valueOf(s86Var.m10560y().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        yj5 yj5Var = ((oa6) op5Var.f36084a).f26511c;
        Boolean boolM9227G = op5Var.m9227G("firebase_analytics_collection_enabled");
        if (boolM9227G != null) {
            return boolM9227G.booleanValue() ? 0 : 4;
        }
        return (this.f26533y == null || this.f26533y.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX INFO: renamed from: h */
    public final boolean m9025h() {
        dn6 dn6Var;
        Context context;
        boolean z = false;
        if (!this.f26530v) {
            C1077qn.m9989o("AppMeasurement is not initialized");
            return false;
        }
        ea6 ea6Var = this.f26515g;
        m9016l(ea6Var);
        ea6Var.mo5038t();
        Boolean bool = this.f26531w;
        ia5 ia5Var = this.f26519k;
        if (bool == null || this.f26532x == 0) {
            ia5Var.getClass();
            this.f26532x = SystemClock.elapsedRealtime();
            dn6Var = this.f26517i;
            m9014j(dn6Var);
            if (dn6Var.m4595R("android.permission.INTERNET") && dn6Var.m4595R("android.permission.ACCESS_NETWORK_STATE")) {
                context = this.f26509a;
                if (r35.m10189a(context).m12999c() || this.f26512d.m9233x() || (dn6.m4573k0(context) && dn6.m4567N(context))) {
                    z = true;
                }
            }
            this.f26531w = Boolean.valueOf(z);
            if (z) {
                this.f26531w = Boolean.valueOf(dn6Var.m4620y(m9029p().m4937B()));
            }
        } else if (!bool.booleanValue()) {
            ia5Var.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.f26532x) > 1000) {
                ia5Var.getClass();
                this.f26532x = SystemClock.elapsedRealtime();
                dn6Var = this.f26517i;
                m9014j(dn6Var);
                if (dn6Var.m4595R("android.permission.INTERNET")) {
                    context = this.f26509a;
                    if (r35.m10189a(context).m12999c()) {
                        z = true;
                    } else {
                        z = true;
                    }
                }
                this.f26531w = Boolean.valueOf(z);
                if (z) {
                    this.f26531w = Boolean.valueOf(dn6Var.m4620y(m9029p().m4937B()));
                }
            }
        }
        return this.f26531w.booleanValue();
    }

    /* JADX INFO: renamed from: m */
    public final m66 m9026m() {
        m9015k(this.f26525q);
        return this.f26525q;
    }

    /* JADX INFO: renamed from: n */
    public final oj6 m9027n() {
        m9015k(this.f26526r);
        return this.f26526r;
    }

    /* JADX INFO: renamed from: o */
    public final yr5 m9028o() {
        m9016l(this.f26527s);
        return this.f26527s;
    }

    /* JADX INFO: renamed from: p */
    public final e66 m9029p() {
        m9015k(this.f26528t);
        return this.f26528t;
    }
}
