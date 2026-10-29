package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class n42 extends i42 implements lf2 {

    /* JADX INFO: renamed from: q */
    public a05 f25442q;

    public n42(a05 a05Var) {
        this.f25442q = a05Var;
    }

    @Override // p000.i42
    /* JADX INFO: renamed from: O0 */
    public final a05 mo6658O0(a05 a05Var) {
        return ev0.m5375y0(a05Var, this.f25442q);
    }

    @Override // p000.i42
    /* JADX INFO: renamed from: P0 */
    public final void mo6659P0() {
        super.mo6659P0();
        z62.m13349H(this);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        int iMo12d = this.f21123p.mo12d(zq2Var, zq2Var.getLayoutDirection()) - this.f21122o.mo12d(zq2Var, zq2Var.getLayoutDirection());
        int iMo10b = this.f21123p.mo10b(zq2Var) - this.f21122o.mo10b(zq2Var);
        int iMo11c = (this.f21123p.mo11c(zq2Var, zq2Var.getLayoutDirection()) - this.f21122o.mo11c(zq2Var, zq2Var.getLayoutDirection())) + iMo12d;
        int iMo9a = (this.f21123p.mo9a(zq2Var) - this.f21122o.mo9a(zq2Var)) + iMo10b;
        db3 db3VarMo5826e = sq2Var.mo5826e(ll0.m8017i(-iMo11c, j, -iMo9a));
        int iM8015g = ll0.m8015g(db3VarMo5826e.f16899a + iMo11c, j);
        int iM8014f = ll0.m8014f(db3VarMo5826e.f16900b + iMo9a, j);
        m42 m42Var = new m42((byte) 0);
        m42Var.f24638b = db3VarMo5826e;
        m42Var.f24639c = iMo12d;
        m42Var.f24640d = iMo10b;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(iM8015g, iM8014f, w71.f33134a, m42Var);
    }
}
