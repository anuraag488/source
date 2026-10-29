package androidx.work.impl;

import android.os.Looper;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p000.C0982og;
import p000.C1077qn;
import p000.C1122rv;
import p000.C1260vl;
import p000.b81;
import p000.cf4;
import p000.fq2;
import p000.hb0;
import p000.ib0;
import p000.kg4;
import p000.l25;
import p000.m25;
import p000.mq1;
import p000.n72;
import p000.nh3;
import p000.po4;
import p000.r71;
import p000.r90;
import p000.rl3;
import p000.ry0;
import p000.t13;
import p000.td3;
import p000.u25;
import p000.um0;
import p000.uo1;
import p000.v71;
import p000.ve4;
import p000.vq3;
import p000.w25;
import p000.we4;
import p000.wm0;
import p000.y70;
import p000.ym0;
import p000.z62;
import p000.ze4;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class WorkDatabase {

    /* JADX INFO: renamed from: a */
    public um0 f14686a;

    /* JADX INFO: renamed from: b */
    public Executor f14687b;

    /* JADX INFO: renamed from: c */
    public po4 f14688c;

    /* JADX INFO: renamed from: d */
    public C1122rv f14689d;

    /* JADX INFO: renamed from: e */
    public n72 f14690e;

    /* JADX INFO: renamed from: f */
    public nh3 f14691f;

    /* JADX INFO: renamed from: g */
    public boolean f14692g;

    /* JADX INFO: renamed from: h */
    public ThreadLocal f14693h;

    /* JADX INFO: renamed from: i */
    public LinkedHashMap f14694i;

    /* JADX INFO: renamed from: j */
    public boolean f14695j;

    public WorkDatabase() {
        nh3 nh3Var = new nh3((byte) 5, false);
        nh3Var.f25810b = new AtomicInteger(0);
        nh3Var.f25811c = new AtomicBoolean(false);
        VarHandle.storeStoreFence();
        this.f14691f = nh3Var;
        this.f14693h = new ThreadLocal();
        this.f14694i = new LinkedHashMap();
        this.f14695j = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m3058a() {
        if (this.f14692g) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            C1077qn.m9989o("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3059b() throws Throwable {
        m3058a();
        m3058a();
        uo1 uo1VarMo13542G = m3065h().mo13542G();
        if (!uo1VarMo13542G.m11595l()) {
            wm0 wm0Var = null;
            C0982og c0982og = new C0982og((Object) m3064g(), wm0Var, (byte) 10);
            Thread.interrupted();
            y70.m13014O(r71.f29063a, new C1260vl((Object) c0982og, wm0Var, (byte) 12));
        }
        if (uo1VarMo13542G.f32025a.isWriteAheadLoggingEnabled()) {
            uo1VarMo13542G.m11590b();
        } else {
            uo1VarMo13542G.m11589a();
        }
    }

    /* JADX INFO: renamed from: c */
    public List mo3060c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(fq2.m5779K(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(((r90) entry.getKey()).f29101a, entry.getValue());
        }
        return v71.f32439a;
    }

    /* JADX INFO: renamed from: d */
    public abstract n72 mo3061d();

    /* JADX INFO: renamed from: e */
    public vq3 mo3062e() {
        throw new t13();
    }

    /* JADX INFO: renamed from: f */
    public abstract ry0 mo3063f();

    /* JADX INFO: renamed from: g */
    public final n72 m3064g() {
        n72 n72Var = this.f14690e;
        if (n72Var != null) {
            return n72Var;
        }
        z62.m13366Y("internalTracker");
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public final ze4 m3065h() {
        C1122rv c1122rv = this.f14689d;
        if (c1122rv == null) {
            z62.m13366Y("connectionManager");
            throw null;
        }
        ze4 ze4VarM10458q = c1122rv.m10458q();
        if (ze4VarM10458q != null) {
            return ze4VarM10458q;
        }
        C1077qn.m9989o("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    /* JADX INFO: renamed from: i */
    public Set mo3066i() {
        b81 b81Var = b81.f15153a;
        ArrayList arrayList = new ArrayList(ib0.m6717y0(b81Var, 10));
        Iterator<E> it = b81Var.iterator();
        while (it.hasNext()) {
            arrayList.add(rl3.m10361a((Class) it.next()));
        }
        return hb0.m6322h1(arrayList);
    }

    /* JADX INFO: renamed from: j */
    public LinkedHashMap mo3067j() {
        int iM5779K = fq2.m5779K(ib0.m6717y0(b81.f15153a, 10));
        if (iM5779K < 16) {
            iM5779K = 16;
        }
        return new LinkedHashMap(iM5779K);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m3068k() {
        C1122rv c1122rv = this.f14689d;
        if (c1122rv != null) {
            return c1122rv.m10458q() != null;
        }
        z62.m13366Y("connectionManager");
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m3069l() {
        return m3071n() && m3065h().mo13542G().m11595l();
    }

    /* JADX INFO: renamed from: m */
    public final void m3070m() {
        m3065h().mo13542G().m11592g();
        if (m3069l()) {
            return;
        }
        n72 n72VarM3064g = m3064g();
        n72VarM3064g.f25491b.m8373e(n72VarM3064g.f25494e, n72VarM3064g.f25495f);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m3071n() {
        C1122rv c1122rv = this.f14689d;
        if (c1122rv == null) {
            z62.m13366Y("connectionManager");
            throw null;
        }
        uo1 uo1Var = (uo1) c1122rv.f29655f;
        if (uo1Var != null) {
            return uo1Var.f32025a.isOpen();
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public abstract td3 mo3072o();

    /* JADX INFO: renamed from: p */
    public final Object m3073p(Callable callable) throws Throwable {
        m3059b();
        try {
            Object objCall = callable.call();
            m3075r();
            return objCall;
        } finally {
            m3070m();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m3074q(Runnable runnable) throws Throwable {
        m3059b();
        try {
            runnable.run();
            m3075r();
        } finally {
            m3070m();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m3075r() {
        m3065h().mo13542G().m11596q();
    }

    /* JADX INFO: renamed from: s */
    public abstract kg4 mo3076s();

    /* JADX INFO: renamed from: t */
    public final Object m3077t(boolean z, mq1 mq1Var, ym0 ym0Var) {
        C1122rv c1122rv = this.f14689d;
        if (c1122rv == null) {
            z62.m13366Y("connectionManager");
            throw null;
        }
        ze4 ze4Var = (ze4) ((we4) c1122rv.f29654e).f33280a.f33090b;
        ze4Var.getDatabaseName();
        ve4 ve4Var = new ve4(ze4Var.mo13542G());
        cf4 cf4Var = new cf4();
        cf4Var.f15983a = ve4Var;
        VarHandle.storeStoreFence();
        return mq1Var.invoke(cf4Var, ym0Var);
    }

    /* JADX INFO: renamed from: u */
    public abstract l25 mo3078u();

    /* JADX INFO: renamed from: v */
    public abstract m25 mo3079v();

    /* JADX INFO: renamed from: w */
    public abstract u25 mo3080w();

    /* JADX INFO: renamed from: x */
    public abstract w25 mo3081x();
}
