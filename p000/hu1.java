package p000;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.lang.invoke.VarHandle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hu1 implements bw3, x33, rb1 {

    /* JADX INFO: renamed from: o */
    public static final String f20866o = wn2.m12327g("GreedyScheduler");

    /* JADX INFO: renamed from: a */
    public Context f20867a;

    /* JADX INFO: renamed from: b */
    public HashMap f20868b;

    /* JADX INFO: renamed from: c */
    public ox0 f20869c;

    /* JADX INFO: renamed from: d */
    public boolean f20870d;

    /* JADX INFO: renamed from: e */
    public Object f20871e;

    /* JADX INFO: renamed from: f */
    public pq3 f20872f;

    /* JADX INFO: renamed from: g */
    public jg3 f20873g;

    /* JADX INFO: renamed from: h */
    public pq3 f20874h;

    /* JADX INFO: renamed from: i */
    public ik0 f20875i;

    /* JADX INFO: renamed from: j */
    public HashMap f20876j;

    /* JADX INFO: renamed from: k */
    public Boolean f20877k;

    /* JADX INFO: renamed from: l */
    public cu2 f20878l;

    /* JADX INFO: renamed from: m */
    public j25 f20879m;

    /* JADX INFO: renamed from: n */
    public C1283w7 f20880n;

    @Override // p000.bw3
    /* JADX INFO: renamed from: a */
    public final void mo3746a(String str) {
        List<qb4> listM13233c;
        Runnable runnable;
        String str2 = f20866o;
        Boolean boolValueOf = this.f20877k;
        if (boolValueOf == null) {
            Context context = this.f20867a;
            int i = ig3.f21407a;
            boolValueOf = Boolean.valueOf(Application.getProcessName().equals(context.getApplicationInfo().processName));
            this.f20877k = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            wn2.m12326e().m12331f(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f20870d) {
            this.f20873g.m7104a(this);
            this.f20870d = true;
        }
        wn2.m12326e().m12328b(str2, "Cancelling work ID " + str);
        ox0 ox0Var = this.f20869c;
        if (ox0Var != null && (runnable = (Runnable) ox0Var.f27185d.remove(str)) != null) {
            ((Handler) ox0Var.f27183b.f14813b).removeCallbacks(runnable);
        }
        pq3 pq3Var = this.f20872f;
        synchronized (pq3Var.f27897c) {
            listM13233c = ((ys0) pq3Var.f27896b).m13233c(str);
        }
        for (qb4 qb4Var : listM13233c) {
            this.f20880n.m12147w(qb4Var);
            this.f20874h.m9615n(qb4Var, -512);
        }
    }

    @Override // p000.x33
    /* JADX INFO: renamed from: b */
    public final void mo6394b(q25 q25Var, ql0 ql0Var) {
        pq3 pq3Var = this.f20874h;
        C1283w7 c1283w7 = this.f20880n;
        pq3 pq3Var2 = this.f20872f;
        e25 e25VarM7904L = lb5.m7904L(q25Var);
        boolean z = ql0Var instanceof ol0;
        String str = f20866o;
        if (z) {
            if (pq3Var2.m9605c(e25VarM7904L)) {
                return;
            }
            wn2.m12326e().m12328b(str, "Constraints met: Scheduling work ID " + e25VarM7904L);
            qb4 qb4VarM9616o = pq3Var2.m9616o(e25VarM7904L);
            c1283w7.m12132S(qb4VarM9616o);
            pq3Var.m9614m(qb4VarM9616o, null);
            return;
        }
        wn2.m12326e().m12328b(str, "Constraints not met: Cancelling work ID " + e25VarM7904L);
        qb4 qb4VarM9610h = pq3Var2.m9610h(e25VarM7904L);
        if (qb4VarM9610h != null) {
            c1283w7.m12147w(qb4VarM9610h);
            pq3Var.m9615n(qb4VarM9610h, ((pl0) ql0Var).f27725a);
        }
    }

    @Override // p000.bw3
    /* JADX INFO: renamed from: c */
    public final void mo3747c(q25... q25VarArr) {
        wm0 wm0Var;
        hu1 hu1Var;
        long jMax;
        Boolean boolValueOf = this.f20877k;
        if (boolValueOf == null) {
            Context context = this.f20867a;
            int i = ig3.f21407a;
            boolValueOf = Boolean.valueOf(Application.getProcessName().equals(context.getApplicationInfo().processName));
            this.f20877k = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            wn2.m12326e().m12331f(f20866o, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f20870d) {
            this.f20873g.m7104a(this);
            this.f20870d = true;
        }
        HashSet<q25> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int length = q25VarArr.length;
        int i2 = 0;
        while (true) {
            wm0Var = null;
            if (i2 >= length) {
                break;
            }
            q25 q25Var = q25VarArr[i2];
            if (!this.f20872f.m9605c(lb5.m7904L(q25Var))) {
                synchronized (this.f20871e) {
                    try {
                        e25 e25VarM7904L = lb5.m7904L(q25Var);
                        gu1 gu1Var = (gu1) this.f20876j.get(e25VarM7904L);
                        if (gu1Var == null) {
                            int i3 = q25Var.f28172k;
                            this.f20875i.f21506c.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            gu1Var = new gu1();
                            gu1Var.f20127a = i3;
                            gu1Var.f20128b = jCurrentTimeMillis;
                            VarHandle.storeStoreFence();
                            this.f20876j.put(e25VarM7904L, gu1Var);
                        }
                        jMax = (((long) Math.max((q25Var.f28172k - gu1Var.f20127a) - 5, 0)) * 30000) + gu1Var.f20128b;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                long jMax2 = Math.max(q25Var.m9716a(), jMax);
                this.f20875i.f21506c.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (q25Var.f28163b == f25.f18681a) {
                    if (jCurrentTimeMillis2 < jMax2) {
                        ox0 ox0Var = this.f20869c;
                        if (ox0Var != null) {
                            ar3 ar3Var = ox0Var.f27183b;
                            HashMap map = ox0Var.f27185d;
                            Runnable runnable = (Runnable) map.remove(q25Var.f28162a);
                            if (runnable != null) {
                                ((Handler) ar3Var.f14813b).removeCallbacks(runnable);
                            }
                            ar1 ar1Var = new ar1((byte) 2);
                            ar1Var.f14799c = ox0Var;
                            ar1Var.f14798b = q25Var;
                            VarHandle.storeStoreFence();
                            map.put(q25Var.f28162a, ar1Var);
                            ox0Var.f27184c.getClass();
                            ((Handler) ar3Var.f14813b).postDelayed(ar1Var, jMax2 - System.currentTimeMillis());
                        }
                    } else if (!z62.m13387o(jl0.f22381j, q25Var.f28171j)) {
                        jl0 jl0Var = q25Var.f28171j;
                        if (jl0Var.f22385d) {
                            wn2.m12326e().m12328b(f20866o, "Ignoring " + q25Var + ". Requires device idle.");
                        } else if (jl0Var.f22390i.isEmpty()) {
                            hashSet.add(q25Var);
                            hashSet2.add(q25Var.f28162a);
                        } else {
                            wn2.m12326e().m12328b(f20866o, "Ignoring " + q25Var + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.f20872f.m9605c(lb5.m7904L(q25Var))) {
                        wn2.m12326e().m12328b(f20866o, "Starting work for " + q25Var.f28162a);
                        qb4 qb4VarM9616o = this.f20872f.m9616o(lb5.m7904L(q25Var));
                        this.f20880n.m12132S(qb4VarM9616o);
                        this.f20874h.m9614m(qb4VarM9616o, null);
                    }
                }
            }
            i2++;
        }
        synchronized (this.f20871e) {
            try {
                if (!hashSet.isEmpty()) {
                    String strJoin = TextUtils.join(",", hashSet2);
                    wn2.m12326e().m12328b(f20866o, "Starting tracking for " + strJoin);
                    for (q25 q25Var2 : hashSet) {
                        e25 e25VarM7904L2 = lb5.m7904L(q25Var2);
                        if (this.f20868b.containsKey(e25VarM7904L2)) {
                            hu1Var = this;
                        } else {
                            cu2 cu2Var = this.f20878l;
                            so0 so0Var = this.f20879m.f21973b;
                            String str = w15.f33035a;
                            hu1Var = this;
                            hu1Var.f20868b.put(e25VarM7904L2, lb5.m7910S(zp0.m13670b(so0Var), null, null, new er2(cu2Var, q25Var2, hu1Var, wm0Var, (byte) 17), 3));
                        }
                        this = hu1Var;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.rb1
    /* JADX INFO: renamed from: d */
    public final void mo3084d(e25 e25Var, boolean z) {
        t82 t82Var;
        qb4 qb4VarM9610h = this.f20872f.m9610h(e25Var);
        if (qb4VarM9610h != null) {
            this.f20880n.m12147w(qb4VarM9610h);
        }
        synchronized (this.f20871e) {
            t82Var = (t82) this.f20868b.remove(e25Var);
        }
        if (t82Var != null) {
            wn2.m12326e().m12328b(f20866o, "Stopping tracking for " + e25Var);
            t82Var.mo4993a(null);
        }
        if (z) {
            return;
        }
        synchronized (this.f20871e) {
            this.f20876j.remove(e25Var);
        }
    }

    @Override // p000.bw3
    /* JADX INFO: renamed from: e */
    public final boolean mo3748e() {
        return false;
    }
}
