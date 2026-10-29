package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x62 extends mt2 implements lf2 {

    /* JADX INFO: renamed from: o */
    public u62 f34024o;

    /* JADX INFO: renamed from: p */
    public boolean f34025p;

    @Override // p000.lf2
    /* JADX INFO: renamed from: I */
    public final int mo4192I(so2 so2Var, sq2 sq2Var, int i) {
        return sq2Var.mo5825b0(i);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: V */
    public final int mo5819V(so2 so2Var, sq2 sq2Var, int i) {
        return this.f34024o == u62.f31672a ? sq2Var.mo5823W(i) : sq2Var.mo5824Z(i);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        int iMo5823W = this.f34024o == u62.f31672a ? sq2Var.mo5823W(kl0.m7538h(j)) : sq2Var.mo5824Z(kl0.m7538h(j));
        if (iMo5823W < 0) {
            iMo5823W = 0;
        }
        if (iMo5823W < 0) {
            s32.m10514a("width must be >= 0");
        }
        long jM8016h = ll0.m8016h(iMo5823W, iMo5823W, 0, Integer.MAX_VALUE);
        if (this.f34025p) {
            jM8016h = ll0.m8013e(j, jM8016h);
        }
        db3 db3VarMo5826e = sq2Var.mo5826e(jM8016h);
        int i = db3VarMo5826e.f16899a;
        int i2 = db3VarMo5826e.f16900b;
        C0830kc c0830kc = new C0830kc((byte) 7);
        c0830kc.f23061b = db3VarMo5826e;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(i, i2, w71.f33134a, c0830kc);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: h */
    public final int mo5820h(so2 so2Var, sq2 sq2Var, int i) {
        return this.f34024o == u62.f31672a ? sq2Var.mo5823W(i) : sq2Var.mo5824Z(i);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: u */
    public final int mo4198u(so2 so2Var, sq2 sq2Var, int i) {
        return sq2Var.mo5827h(i);
    }
}
