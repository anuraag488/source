package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cw1 extends mt2 implements bj0, lf2, y23 {

    /* JADX INFO: renamed from: o */
    public xl4 f16524o;

    /* JADX INFO: renamed from: p */
    public boolean f16525p;

    /* JADX INFO: renamed from: q */
    public int f16526q;

    /* JADX INFO: renamed from: r */
    public boolean f16527r;

    /* JADX INFO: renamed from: s */
    public int f16528s;

    /* JADX INFO: renamed from: t */
    public int f16529t;

    /* JADX INFO: renamed from: u */
    public xl4 f16530u;

    /* JADX INFO: renamed from: v */
    public is4 f16531v;

    @Override // p000.mt2
    /* JADX INFO: renamed from: D0 */
    public final boolean mo4191D0() {
        return false;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: G0 */
    public final void mo26G0() {
        am1 am1Var = (am1) sj3.m10825u(this, ij0.f21476k);
        this.f16530u = zc6.m13512I(this.f16524o, sc6.m10652X(this).f33293A);
        bm1 bm1Var = m4196Q0().f34389a.f27483f;
        xm1 xm1Var = m4196Q0().f34389a.f27480c;
        if (xm1Var == null) {
            xm1Var = xm1.f34413f;
        }
        tm1 tm1Var = m4196Q0().f34389a.f27481d;
        int i = tm1Var != null ? tm1Var.f31237a : 0;
        um1 um1Var = m4196Q0().f34389a.f27482e;
        this.f16531v = ((cm1) am1Var).m4044b(bm1Var, xm1Var, i, um1Var != null ? um1Var.f31990a : 65535);
        bw1 bw1Var = new bw1((byte) 0);
        bw1Var.f15656b = this;
        VarHandle.storeStoreFence();
        c20.m3797B(this, bw1Var);
        this.f16527r = true;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
        this.f16530u = null;
        this.f16531v = null;
        this.f16527r = false;
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: I */
    public final int mo4192I(so2 so2Var, sq2 sq2Var, int i) {
        m4195P0(so2Var);
        int i2 = this.f16528s;
        if (i2 == this.f16529t) {
            return i2;
        }
        int iMo5825b0 = sq2Var.mo5825b0(i);
        int i3 = this.f16528s;
        int i4 = this.f16529t;
        if (iMo5825b0 < i3) {
            iMo5825b0 = i3;
        }
        return iMo5825b0 > i4 ? i4 : iMo5825b0;
    }

    /* JADX INFO: renamed from: O0 */
    public final void m4193O0(zq2 zq2Var, xl4 xl4Var, am1 am1Var) {
        hl4 hl4Var = zj4.m13628b(xl4Var, zq2Var, am1Var, 3, true).f34185c;
        float fM6435h = hl4Var.m6435h(0);
        float fM6435h2 = hl4Var.m6435h(1);
        float fM6435h3 = hl4Var.m6435h(2);
        this.f16528s = as4.m3264w(fM6435h, fM6435h2, fM6435h3, this.f16525p ? 1 : 0, 1);
        this.f16529t = as4.m3264w(fM6435h, fM6435h2, fM6435h3, this.f16526q, Integer.MAX_VALUE);
    }

    @Override // p000.y23
    /* JADX INFO: renamed from: P */
    public final void mo4194P() {
        if (this.f16531v != null) {
            bw1 bw1Var = new bw1((byte) 1);
            bw1Var.f15656b = this;
            VarHandle.storeStoreFence();
            c20.m3797B(this, bw1Var);
        }
        this.f16527r = true;
        z62.m13349H(this);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m4195P0(so2 so2Var) {
        if (this.f16527r) {
            m4193O0(so2Var, m4196Q0(), (am1) sj3.m10825u(this, ij0.f21476k));
            this.f16527r = false;
        }
        int i = this.f16528s;
        this.f16528s = i >= 0 ? i : 0;
        int i2 = this.f16529t;
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        this.f16529t = i2;
    }

    /* JADX INFO: renamed from: Q0 */
    public final xl4 m4196Q0() {
        xl4 xl4Var = this.f16530u;
        if (xl4Var != null) {
            return xl4Var;
        }
        throw d55.m4375t("Resolved style is not set.");
    }

    @Override // p000.px0
    /* JADX INFO: renamed from: a */
    public final void mo4197a() {
        this.f16527r = true;
        z62.m13349H(this);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        if (this.f16527r) {
            m4193O0(zq2Var, m4196Q0(), (am1) sj3.m10825u(this, ij0.f21476k));
            this.f16527r = false;
        }
        int i = this.f16528s;
        int iM10675p = i != -1 ? sc6.m10675p(i, kl0.m7540j(j), kl0.m7538h(j)) : kl0.m7540j(j);
        int i2 = this.f16529t;
        db3 db3VarMo5826e = sq2Var.mo5826e(kl0.m7532b(j, 0, 0, iM10675p, i2 != -1 ? sc6.m10675p(i2, kl0.m7540j(j), kl0.m7538h(j)) : kl0.m7538h(j), 3));
        int i3 = db3VarMo5826e.f16899a;
        int i4 = db3VarMo5826e.f16900b;
        C0830kc c0830kc = new C0830kc((byte) 6);
        c0830kc.f23061b = db3VarMo5826e;
        VarHandle.storeStoreFence();
        return zq2Var.mo3583l0(i3, i4, w71.f33134a, c0830kc);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: u */
    public final int mo4198u(so2 so2Var, sq2 sq2Var, int i) {
        m4195P0(so2Var);
        int i2 = this.f16528s;
        int i3 = this.f16529t;
        if (i2 == i3) {
            return i3;
        }
        int iMo5827h = sq2Var.mo5827h(i);
        int i4 = this.f16528s;
        int i5 = this.f16529t;
        if (iMo5827h < i4) {
            iMo5827h = i4;
        }
        return iMo5827h > i5 ? i5 : iMo5827h;
    }

    @Override // p000.px0
    /* JADX INFO: renamed from: z0 */
    public final void mo4199z0() {
        this.f16530u = zc6.m13512I(this.f16524o, sc6.m10652X(this).f33293A);
        this.f16527r = true;
        z62.m13349H(this);
    }
}
