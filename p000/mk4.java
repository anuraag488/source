package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mk4 implements yj4 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ pk4 f24982a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f24983b;

    @Override // p000.yj4
    /* JADX INFO: renamed from: a */
    public final void mo7998a() {
        pk4 pk4Var = this.f24982a;
        pk4Var.m9555q(null);
        pk4Var.m9554p(null);
        pk4Var.m9559u(true);
    }

    @Override // p000.yj4
    /* JADX INFO: renamed from: b */
    public final void mo7999b() {
        kl4 kl4VarM11577d;
        pk4 pk4Var = this.f24982a;
        boolean z = this.f24983b;
        pk4Var.m9555q(z ? uu1.f32176b : uu1.f32177c);
        long jM13287a = z04.m13287a(pk4Var.m9548j(z));
        uj2 uj2Var = pk4Var.f27696d;
        if (uj2Var == null || (kl4VarM11577d = uj2Var.m11577d()) == null) {
            return;
        }
        long jM7547e = kl4VarM11577d.m7547e(jM13287a);
        pk4Var.f27706n = jM7547e;
        pk4Var.m9554p(b33.m3423a(jM7547e));
        pk4Var.f27708p = 0L;
        pk4Var.f27711s = -1;
        uj2 uj2Var2 = pk4Var.f27696d;
        if (uj2Var2 != null) {
            uj2Var2.f31928q.setValue(Boolean.TRUE);
        }
        pk4Var.m9559u(false);
    }

    @Override // p000.yj4
    /* JADX INFO: renamed from: d */
    public final void mo8001d(long j) {
        pk4 pk4Var = this.f24982a;
        long jM3430h = b33.m3430h(pk4Var.f27708p, j);
        pk4Var.f27708p = jM3430h;
        pk4Var.m9554p(b33.m3423a(b33.m3430h(pk4Var.f27706n, jM3430h)));
        xk4 xk4VarM9550l = pk4Var.m9550l();
        long j2 = pk4Var.m9545g().f15059a;
        boolean z = this.f24983b;
        ds3 ds3Var = wv1.f33776s;
        gv1 gv1Var = new gv1();
        gv1Var.f20146a = (byte) 9;
        VarHandle.storeStoreFence();
        pk4Var.m9560v(xk4VarM9550l, j2, false, z, ds3Var, true, gv1Var);
        pk4Var.m9559u(false);
    }

    @Override // p000.yj4
    public final void onStop() {
        pk4 pk4Var = this.f24982a;
        pk4Var.m9555q(null);
        pk4Var.m9554p(null);
        pk4Var.m9559u(true);
    }

    @Override // p000.yj4
    public final void onCancel() {
    }

    @Override // p000.yj4
    /* JADX INFO: renamed from: c */
    public final void mo8000c(long j, ds3 ds3Var) {
    }
}
