package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h73 extends mt2 implements lf2 {

    /* JADX INFO: renamed from: o */
    public e73 f20417o;

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        float fMo3502a = this.f20417o.mo3502a(zq2Var.getLayoutDirection());
        float fMo3505d = this.f20417o.mo3505d();
        float fMo3503b = this.f20417o.mo3503b(zq2Var.getLayoutDirection());
        float fMo3504c = this.f20417o.mo3504c();
        if (!((p11.m9351b(fMo3502a, 0.0f) >= 0) & (p11.m9351b(fMo3505d, 0.0f) >= 0) & (p11.m9351b(fMo3503b, 0.0f) >= 0) & (p11.m9351b(fMo3504c, 0.0f) >= 0))) {
            o32.m8934a("Padding must be non-negative");
        }
        int iMo3579U = zq2Var.mo3579U(fMo3502a);
        int iMo3579U2 = zq2Var.mo3579U(fMo3503b) + iMo3579U;
        int iMo3579U3 = zq2Var.mo3579U(fMo3505d);
        int iMo3579U4 = zq2Var.mo3579U(fMo3504c) + iMo3579U3;
        db3 db3VarMo5826e = sq2Var.mo5826e(ll0.m8017i(-iMo3579U2, j, -iMo3579U4));
        int iM8015g = ll0.m8015g(db3VarMo5826e.f16899a + iMo3579U2, j);
        int iM8014f = ll0.m8014f(db3VarMo5826e.f16900b + iMo3579U4, j);
        m42 m42Var = new m42((byte) 3);
        m42Var.f24638b = db3VarMo5826e;
        m42Var.f24639c = iMo3579U;
        m42Var.f24640d = iMo3579U3;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(iM8015g, iM8014f, w71.f33134a, m42Var);
    }
}
