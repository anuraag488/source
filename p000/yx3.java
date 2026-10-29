package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yx3 extends qx0 implements bj0, y23 {

    /* JADX INFO: renamed from: A */
    public C1327xd f35588A;

    /* JADX INFO: renamed from: B */
    public C1289wd f35589B;

    /* JADX INFO: renamed from: C */
    public boolean f35590C;

    /* JADX INFO: renamed from: q */
    public jy3 f35591q;

    /* JADX INFO: renamed from: r */
    public d63 f35592r;

    /* JADX INFO: renamed from: s */
    public boolean f35593s;

    /* JADX INFO: renamed from: t */
    public xh1 f35594t;

    /* JADX INFO: renamed from: u */
    public nv2 f35595u;

    /* JADX INFO: renamed from: v */
    public k30 f35596v;

    /* JADX INFO: renamed from: w */
    public boolean f35597w;

    /* JADX INFO: renamed from: x */
    public C1289wd f35598x;

    /* JADX INFO: renamed from: y */
    public iy3 f35599y;

    /* JADX INFO: renamed from: z */
    public px0 f35600z;

    @Override // p000.mt2
    /* JADX INFO: renamed from: D0 */
    public final boolean mo4191D0() {
        return false;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: G0 */
    public final void mo26G0() {
        this.f35590C = m13268S0();
        m13267R0();
        if (this.f35599y == null) {
            jy3 jy3Var = this.f35591q;
            C1289wd c1289wd = this.f35597w ? this.f35589B : this.f35598x;
            iy3 iy3Var = new iy3(c1289wd, this.f35596v, this.f35594t, this.f35595u, this.f35592r, jy3Var, this.f35593s, this.f35590C);
            m10154O0(iy3Var);
            this.f35599y = iy3Var;
        }
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
        px0 px0Var = this.f35600z;
        if (px0Var != null) {
            m10155P0(px0Var);
        }
    }

    @Override // p000.y23
    /* JADX INFO: renamed from: P */
    public final void mo4194P() {
        C1327xd c1327xd = (C1327xd) sj3.m10825u(this, n63.f25473a);
        if (z62.m13387o(c1327xd, this.f35588A)) {
            return;
        }
        this.f35588A = c1327xd;
        this.f35589B = null;
        px0 px0Var = this.f35600z;
        if (px0Var != null) {
            m10155P0(px0Var);
        }
        this.f35600z = null;
        m13267R0();
        iy3 iy3Var = this.f35599y;
        if (iy3Var != null) {
            jy3 jy3Var = this.f35591q;
            d63 d63Var = this.f35592r;
            C1289wd c1289wd = this.f35597w ? this.f35589B : this.f35598x;
            iy3Var.m6968j1(c1289wd, this.f35596v, this.f35594t, this.f35595u, d63Var, jy3Var, this.f35593s, this.f35590C);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m13267R0() {
        px0 px0Var = this.f35600z;
        if (px0Var != null) {
            if (((mt2) px0Var).f25195a.f25208n) {
                return;
            }
            m10154O0(px0Var);
            return;
        }
        if (this.f35597w) {
            g32 g32Var = new g32((byte) 21);
            g32Var.f19558b = this;
            VarHandle.storeStoreFence();
            c20.m3797B(this, g32Var);
        }
        C1289wd c1289wd = this.f35597w ? this.f35589B : this.f35598x;
        if (c1289wd != null) {
            bd4 bd4Var = c1289wd.f33252i;
            if (bd4Var.f25195a.f25208n) {
                return;
            }
            m10154O0(bd4Var);
            this.f35600z = bd4Var;
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final boolean m13268S0() {
        df2 df2Var = df2.f17011a;
        if (this.f25208n) {
            df2Var = sc6.m10652X(this).f33293A;
        }
        return df2Var != df2.f17012b || this.f35592r == d63.f16814a;
    }

    /* JADX INFO: renamed from: T0 */
    public final void m13269T0(C1289wd c1289wd, k30 k30Var, xh1 xh1Var, nv2 nv2Var, d63 d63Var, jy3 jy3Var, boolean z, boolean z2) {
        boolean z3;
        this.f35591q = jy3Var;
        this.f35592r = d63Var;
        boolean z4 = true;
        if (this.f35597w != z) {
            this.f35597w = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (z62.m13387o(this.f35598x, c1289wd)) {
            z4 = false;
        } else {
            this.f35598x = c1289wd;
        }
        if (z3 || (z4 && !z)) {
            px0 px0Var = this.f35600z;
            if (px0Var != null) {
                m10155P0(px0Var);
            }
            this.f35600z = null;
            m13267R0();
        }
        this.f35593s = z2;
        this.f35594t = xh1Var;
        this.f35595u = nv2Var;
        this.f35596v = k30Var;
        boolean zM13268S0 = m13268S0();
        this.f35590C = zM13268S0;
        iy3 iy3Var = this.f35599y;
        if (iy3Var != null) {
            iy3Var.m6968j1(this.f35597w ? this.f35589B : this.f35598x, k30Var, xh1Var, nv2Var, d63Var, jy3Var, z2, zM13268S0);
        }
    }

    @Override // p000.px0
    /* JADX INFO: renamed from: z0 */
    public final void mo4199z0() {
        boolean zM13268S0 = m13268S0();
        if (this.f35590C != zM13268S0) {
            this.f35590C = zM13268S0;
            jy3 jy3Var = this.f35591q;
            d63 d63Var = this.f35592r;
            boolean z = this.f35597w;
            C1289wd c1289wd = z ? this.f35589B : this.f35598x;
            m13269T0(c1289wd, this.f35596v, this.f35594t, this.f35595u, d63Var, jy3Var, z, this.f35593s);
        }
    }
}
