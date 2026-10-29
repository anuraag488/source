package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class c73 extends mt2 implements lf2 {

    /* JADX INFO: renamed from: o */
    public float f15855o;

    /* JADX INFO: renamed from: p */
    public float f15856p;

    /* JADX INFO: renamed from: q */
    public float f15857q;

    /* JADX INFO: renamed from: r */
    public float f15858r;

    /* JADX INFO: renamed from: s */
    public boolean f15859s;

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        int iMo3579U = zq2Var.mo3579U(this.f15857q) + zq2Var.mo3579U(this.f15855o);
        int iMo3579U2 = zq2Var.mo3579U(this.f15858r) + zq2Var.mo3579U(this.f15856p);
        db3 db3VarMo5826e = sq2Var.mo5826e(ll0.m8017i(-iMo3579U, j, -iMo3579U2));
        int iM8015g = ll0.m8015g(db3VarMo5826e.f16899a + iMo3579U, j);
        int iM8014f = ll0.m8014f(db3VarMo5826e.f16900b + iMo3579U2, j);
        na1 na1Var = new na1((byte) 18);
        na1Var.f25595b = this;
        na1Var.f25596c = db3VarMo5826e;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(iM8015g, iM8014f, w71.f33134a, na1Var);
    }
}
