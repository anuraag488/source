package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o74 extends mt2 implements lf2 {

    /* JADX INFO: renamed from: o */
    public float f26414o;

    /* JADX INFO: renamed from: p */
    public float f26415p;

    /* JADX INFO: renamed from: q */
    public float f26416q;

    /* JADX INFO: renamed from: r */
    public float f26417r;

    /* JADX INFO: renamed from: s */
    public boolean f26418s;

    @Override // p000.lf2
    /* JADX INFO: renamed from: I */
    public final int mo4192I(so2 so2Var, sq2 sq2Var, int i) {
        long jM8977O0 = m8977O0(so2Var);
        if (kl0.m7536f(jM8977O0)) {
            return kl0.m7538h(jM8977O0);
        }
        if (!this.f26418s) {
            i = ll0.m8015g(i, jM8977O0);
        }
        return ll0.m8014f(sq2Var.mo5825b0(i), jM8977O0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX INFO: renamed from: O0 */
    public final long m8977O0(zq2 zq2Var) {
        int iMo3579U;
        int iMo3579U2;
        int iMo3579U3;
        int i = 0;
        if (Float.isNaN(this.f26416q)) {
            iMo3579U = Integer.MAX_VALUE;
        } else {
            iMo3579U = zq2Var.mo3579U(this.f26416q);
            if (iMo3579U < 0) {
                iMo3579U = 0;
            }
        }
        if (Float.isNaN(this.f26417r)) {
            iMo3579U2 = Integer.MAX_VALUE;
        } else {
            iMo3579U2 = zq2Var.mo3579U(this.f26417r);
            if (iMo3579U2 < 0) {
                iMo3579U2 = 0;
            }
        }
        if (Float.isNaN(this.f26414o)) {
            iMo3579U3 = 0;
        } else {
            iMo3579U3 = zq2Var.mo3579U(this.f26414o);
            if (iMo3579U3 < 0) {
                iMo3579U3 = 0;
            }
            if (iMo3579U3 > iMo3579U) {
                iMo3579U3 = iMo3579U;
            }
            if (iMo3579U3 == Integer.MAX_VALUE) {
                iMo3579U3 = 0;
            }
        }
        if (!Float.isNaN(this.f26415p)) {
            int iMo3579U4 = zq2Var.mo3579U(this.f26415p);
            if (iMo3579U4 < 0) {
                iMo3579U4 = 0;
            }
            if (iMo3579U4 > iMo3579U2) {
                iMo3579U4 = iMo3579U2;
            }
            if (iMo3579U4 != Integer.MAX_VALUE) {
                i = iMo3579U4;
            }
        }
        return ll0.m8009a(iMo3579U3, iMo3579U, i, iMo3579U2);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: V */
    public final int mo5819V(so2 so2Var, sq2 sq2Var, int i) {
        long jM8977O0 = m8977O0(so2Var);
        if (kl0.m7537g(jM8977O0)) {
            return kl0.m7539i(jM8977O0);
        }
        if (!this.f26418s) {
            i = ll0.m8014f(i, jM8977O0);
        }
        return ll0.m8015g(sq2Var.mo5823W(i), jM8977O0);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        int iM7541k;
        int iM7539i;
        int iM7540j;
        int iM7538h;
        long jM8009a;
        long jM8977O0 = m8977O0(zq2Var);
        if (this.f26418s) {
            jM8009a = ll0.m8013e(j, jM8977O0);
        } else {
            if (Float.isNaN(this.f26414o)) {
                iM7541k = kl0.m7541k(j);
                int iM7539i2 = kl0.m7539i(jM8977O0);
                if (iM7541k > iM7539i2) {
                    iM7541k = iM7539i2;
                }
            } else {
                iM7541k = kl0.m7541k(jM8977O0);
            }
            if (Float.isNaN(this.f26416q)) {
                iM7539i = kl0.m7539i(j);
                int iM7541k2 = kl0.m7541k(jM8977O0);
                if (iM7539i < iM7541k2) {
                    iM7539i = iM7541k2;
                }
            } else {
                iM7539i = kl0.m7539i(jM8977O0);
            }
            if (Float.isNaN(this.f26415p)) {
                iM7540j = kl0.m7540j(j);
                int iM7538h2 = kl0.m7538h(jM8977O0);
                if (iM7540j > iM7538h2) {
                    iM7540j = iM7538h2;
                }
            } else {
                iM7540j = kl0.m7540j(jM8977O0);
            }
            if (Float.isNaN(this.f26417r)) {
                iM7538h = kl0.m7538h(j);
                int iM7540j2 = kl0.m7540j(jM8977O0);
                if (iM7538h < iM7540j2) {
                    iM7538h = iM7540j2;
                }
            } else {
                iM7538h = kl0.m7538h(jM8977O0);
            }
            jM8009a = ll0.m8009a(iM7541k, iM7539i, iM7540j, iM7538h);
        }
        db3 db3VarMo5826e = sq2Var.mo5826e(jM8009a);
        int i = db3VarMo5826e.f16899a;
        int i2 = db3VarMo5826e.f16900b;
        C0830kc c0830kc = new C0830kc((byte) 12);
        c0830kc.f23061b = db3VarMo5826e;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(i, i2, w71.f33134a, c0830kc);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: h */
    public final int mo5820h(so2 so2Var, sq2 sq2Var, int i) {
        long jM8977O0 = m8977O0(so2Var);
        if (kl0.m7537g(jM8977O0)) {
            return kl0.m7539i(jM8977O0);
        }
        if (!this.f26418s) {
            i = ll0.m8014f(i, jM8977O0);
        }
        return ll0.m8015g(sq2Var.mo5824Z(i), jM8977O0);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: u */
    public final int mo4198u(so2 so2Var, sq2 sq2Var, int i) {
        long jM8977O0 = m8977O0(so2Var);
        if (kl0.m7536f(jM8977O0)) {
            return kl0.m7538h(jM8977O0);
        }
        if (!this.f26418s) {
            i = ll0.m8015g(i, jM8977O0);
        }
        return ll0.m8014f(sq2Var.mo5827h(i), jM8977O0);
    }
}
