package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fv4 extends mt2 implements lf2 {

    /* JADX INFO: renamed from: o */
    public float f19340o;

    /* JADX INFO: renamed from: p */
    public float f19341p;

    @Override // p000.lf2
    /* JADX INFO: renamed from: I */
    public final int mo4192I(so2 so2Var, sq2 sq2Var, int i) {
        int iMo5825b0 = sq2Var.mo5825b0(i);
        int iMo3579U = !Float.isNaN(this.f19341p) ? so2Var.mo3579U(this.f19341p) : 0;
        return iMo5825b0 < iMo3579U ? iMo3579U : iMo5825b0;
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: V */
    public final int mo5819V(so2 so2Var, sq2 sq2Var, int i) {
        int iMo5823W = sq2Var.mo5823W(i);
        int iMo3579U = !Float.isNaN(this.f19340o) ? so2Var.mo3579U(this.f19340o) : 0;
        return iMo5823W < iMo3579U ? iMo3579U : iMo5823W;
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        int iM7541k;
        int iM7540j;
        if (Float.isNaN(this.f19340o) || kl0.m7541k(j) != 0) {
            iM7541k = kl0.m7541k(j);
        } else {
            int iMo3579U = zq2Var.mo3579U(this.f19340o);
            iM7541k = kl0.m7539i(j);
            if (iMo3579U < 0) {
                iMo3579U = 0;
            }
            if (iMo3579U <= iM7541k) {
                iM7541k = iMo3579U;
            }
        }
        int iM7539i = kl0.m7539i(j);
        if (Float.isNaN(this.f19341p) || kl0.m7540j(j) != 0) {
            iM7540j = kl0.m7540j(j);
        } else {
            int iMo3579U2 = zq2Var.mo3579U(this.f19341p);
            iM7540j = kl0.m7538h(j);
            int i = iMo3579U2 >= 0 ? iMo3579U2 : 0;
            if (i <= iM7540j) {
                iM7540j = i;
            }
        }
        db3 db3VarMo5826e = sq2Var.mo5826e(ll0.m8009a(iM7541k, iM7539i, iM7540j, kl0.m7538h(j)));
        int i2 = db3VarMo5826e.f16899a;
        int i3 = db3VarMo5826e.f16900b;
        C0830kc c0830kc = new C0830kc((byte) 17);
        c0830kc.f23061b = db3VarMo5826e;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(i2, i3, w71.f33134a, c0830kc);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: h */
    public final int mo5820h(so2 so2Var, sq2 sq2Var, int i) {
        int iMo5824Z = sq2Var.mo5824Z(i);
        int iMo3579U = !Float.isNaN(this.f19340o) ? so2Var.mo3579U(this.f19340o) : 0;
        return iMo5824Z < iMo3579U ? iMo3579U : iMo5824Z;
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: u */
    public final int mo4198u(so2 so2Var, sq2 sq2Var, int i) {
        int iMo5827h = sq2Var.mo5827h(i);
        int iMo3579U = !Float.isNaN(this.f19341p) ? so2Var.mo3579U(this.f19341p) : 0;
        return iMo5827h < iMo3579U ? iMo3579U : iMo5827h;
    }
}
