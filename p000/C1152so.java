package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: so */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1152so extends mt2 implements lf2 {

    /* JADX INFO: renamed from: o */
    public float f30418o;

    @Override // p000.lf2
    /* JADX INFO: renamed from: I */
    public final int mo4192I(so2 so2Var, sq2 sq2Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.f30418o) : sq2Var.mo5825b0(i);
    }

    /* JADX INFO: renamed from: O0 */
    public final long m10876O0(long j, boolean z) {
        int iRound;
        int iM7538h = kl0.m7538h(j);
        if (iM7538h == Integer.MAX_VALUE || (iRound = Math.round(iM7538h * this.f30418o)) <= 0) {
            return 0L;
        }
        if (!z || k43.m7395t(iRound, j, iM7538h)) {
            return (((long) iRound) << 32) | (((long) iM7538h) & 4294967295L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: P0 */
    public final long m10877P0(long j, boolean z) {
        int iRound;
        int iM7539i = kl0.m7539i(j);
        if (iM7539i == Integer.MAX_VALUE || (iRound = Math.round(iM7539i / this.f30418o)) <= 0) {
            return 0L;
        }
        if (!z || k43.m7395t(iM7539i, j, iRound)) {
            return (((long) iM7539i) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: Q0 */
    public final long m10878Q0(long j, boolean z) {
        int iM7540j = kl0.m7540j(j);
        int iRound = Math.round(iM7540j * this.f30418o);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || k43.m7395t(iRound, j, iM7540j)) {
            return (((long) iRound) << 32) | (((long) iM7540j) & 4294967295L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: R0 */
    public final long m10879R0(long j, boolean z) {
        int iM7541k = kl0.m7541k(j);
        int iRound = Math.round(iM7541k / this.f30418o);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || k43.m7395t(iM7541k, j, iRound)) {
            return (((long) iM7541k) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: V */
    public final int mo5819V(so2 so2Var, sq2 sq2Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.f30418o) : sq2Var.mo5823W(i);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        long jM10877P0 = m10877P0(j, true);
        if (w52.m12108c(jM10877P0, 0L)) {
            jM10877P0 = m10876O0(j, true);
            if (w52.m12108c(jM10877P0, 0L)) {
                jM10877P0 = m10879R0(j, true);
                if (w52.m12108c(jM10877P0, 0L)) {
                    jM10877P0 = m10878Q0(j, true);
                    if (w52.m12108c(jM10877P0, 0L)) {
                        jM10877P0 = m10877P0(j, false);
                        if (w52.m12108c(jM10877P0, 0L)) {
                            jM10877P0 = m10876O0(j, false);
                            if (w52.m12108c(jM10877P0, 0L)) {
                                jM10877P0 = m10879R0(j, false);
                                if (w52.m12108c(jM10877P0, 0L)) {
                                    jM10877P0 = m10878Q0(j, false);
                                    if (w52.m12108c(jM10877P0, 0L)) {
                                        jM10877P0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!w52.m12108c(jM10877P0, 0L)) {
            int i = (int) (jM10877P0 >> 32);
            int i2 = (int) (4294967295L & jM10877P0);
            if (!((i >= 0) & (i2 >= 0))) {
                s32.m10514a("width and height must be >= 0");
            }
            j = ll0.m8016h(i, i, i2, i2);
        }
        db3 db3VarMo5826e = sq2Var.mo5826e(j);
        int i3 = db3VarMo5826e.f16899a;
        int i4 = db3VarMo5826e.f16900b;
        C0830kc c0830kc = new C0830kc((byte) 2);
        c0830kc.f23061b = db3VarMo5826e;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(i3, i4, w71.f33134a, c0830kc);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: h */
    public final int mo5820h(so2 so2Var, sq2 sq2Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.f30418o) : sq2Var.mo5824Z(i);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: u */
    public final int mo4198u(so2 so2Var, sq2 sq2Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.f30418o) : sq2Var.mo5827h(i);
    }
}
