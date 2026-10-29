package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k83 extends mt2 implements lf2 {

    /* JADX INFO: renamed from: o */
    public float f22983o;

    /* JADX INFO: renamed from: p */
    public a83 f22984p;

    /* JADX INFO: renamed from: q */
    public a83 f22985q;

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        a83 a83Var = this.f22984p;
        int iRound = (a83Var == null || ((Number) a83Var.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) a83Var.getValue()).floatValue() * this.f22983o);
        a83 a83Var2 = this.f22985q;
        int iRound2 = (a83Var2 == null || ((Number) a83Var2.getValue()).intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(((Number) a83Var2.getValue()).floatValue() * this.f22983o);
        int iM7541k = iRound != Integer.MAX_VALUE ? iRound : kl0.m7541k(j);
        int iM7540j = iRound2 != Integer.MAX_VALUE ? iRound2 : kl0.m7540j(j);
        if (iRound == Integer.MAX_VALUE) {
            iRound = kl0.m7539i(j);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = kl0.m7538h(j);
        }
        db3 db3VarMo5826e = sq2Var.mo5826e(ll0.m8009a(iM7541k, iRound, iM7540j, iRound2));
        int i = db3VarMo5826e.f16899a;
        int i2 = db3VarMo5826e.f16900b;
        C0830kc c0830kc = new C0830kc((byte) 10);
        c0830kc.f23061b = db3VarMo5826e;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(i, i2, w71.f33134a, c0830kc);
    }
}
