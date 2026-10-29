package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lk4 implements yj4 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ pk4 f24110a;

    @Override // p000.yj4
    /* JADX INFO: renamed from: a */
    public final void mo7998a() {
        pk4 pk4Var = this.f24110a;
        pk4Var.m9555q(null);
        pk4Var.m9554p(null);
    }

    @Override // p000.yj4
    /* JADX INFO: renamed from: c */
    public final void mo8000c(long j, ds3 ds3Var) {
        kl4 kl4VarM11577d;
        pk4 pk4Var = this.f24110a;
        long jM13287a = z04.m13287a(pk4Var.m9548j(true));
        uj2 uj2Var = pk4Var.f27696d;
        if (uj2Var == null || (kl4VarM11577d = uj2Var.m11577d()) == null) {
            return;
        }
        long jM7547e = kl4VarM11577d.m7547e(jM13287a);
        pk4Var.f27706n = jM7547e;
        pk4Var.m9554p(b33.m3423a(jM7547e));
        pk4Var.f27708p = 0L;
        pk4Var.m9555q(uu1.f32175a);
        pk4Var.m9559u(false);
    }

    @Override // p000.yj4
    /* JADX INFO: renamed from: d */
    public final void mo8001d(long j) {
        kl4 kl4VarM11577d;
        fv1 fv1Var;
        pk4 pk4Var = this.f24110a;
        pk4Var.f27708p = b33.m3430h(pk4Var.f27708p, j);
        uj2 uj2Var = pk4Var.f27696d;
        if (uj2Var == null || (kl4VarM11577d = uj2Var.m11577d()) == null) {
            return;
        }
        pk4Var.m9554p(b33.m3423a(b33.m3430h(pk4Var.f27706n, pk4Var.f27708p)));
        vi3 vi3Var = pk4Var.f27694b;
        int iM7544b = kl4VarM11577d.m7544b(pk4Var.m9545g().f15059a, true);
        vi3Var.m11899b(iM7544b);
        long jM10657b = sc6.m10657b(iM7544b, iM7544b);
        if (ql4.m9899c(jM10657b, pk4Var.m9550l().f34342b)) {
            return;
        }
        uj2 uj2Var2 = pk4Var.f27696d;
        if ((uj2Var2 == null || ((Boolean) uj2Var2.f31928q.getValue()).booleanValue()) && (fv1Var = pk4Var.f27702j) != null) {
            fv1Var.mo5818a(9);
        }
        pk4Var.f27695c.invoke(pk4.m9539b(pk4Var.m9550l().f34341a, jM10657b));
        pk4Var.f27714v = ql4.m9897a(jM10657b);
    }

    @Override // p000.yj4
    public final void onStop() {
        pk4 pk4Var = this.f24110a;
        pk4Var.m9555q(null);
        pk4Var.m9554p(null);
    }

    @Override // p000.yj4
    /* JADX INFO: renamed from: b */
    public final void mo7999b() {
    }

    @Override // p000.yj4
    public final void onCancel() {
    }
}
