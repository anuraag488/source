package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l35 extends mt2 implements lf2 {

    /* JADX INFO: renamed from: o */
    public vz0 f23771o;

    /* JADX INFO: renamed from: p */
    public mq1 f23772p;

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        db3 db3VarMo5826e = sq2Var.mo5826e(ll0.m8009a(this.f23771o != vz0.f32978a ? 0 : kl0.m7541k(j), kl0.m7539i(j), this.f23771o == vz0.f32979b ? kl0.m7540j(j) : 0, kl0.m7538h(j)));
        int iM10675p = sc6.m10675p(db3VarMo5826e.f16899a, kl0.m7541k(j), kl0.m7539i(j));
        int iM10675p2 = sc6.m10675p(db3VarMo5826e.f16900b, kl0.m7540j(j), kl0.m7538h(j));
        k35 k35Var = new k35();
        k35Var.f22848a = this;
        k35Var.f22849b = iM10675p;
        k35Var.f22850c = db3VarMo5826e;
        k35Var.f22851d = iM10675p2;
        k35Var.f22852e = zq2Var;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(iM10675p, iM10675p2, w71.f33134a, k35Var);
    }
}
