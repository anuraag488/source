package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface u31 extends ky0 {
    /* JADX INFO: renamed from: A */
    static void m11217A(u31 u31Var, C0489bf c0489bf, t30 t30Var, float f, pd4 pd4Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        qq2 qq2Var = pd4Var;
        if ((i & 8) != 0) {
            qq2Var = uf1.f31820j;
        }
        u31Var.mo7043t(c0489bf, t30Var, f2, qq2Var, (i & 32) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: B0 */
    static long m11218B0(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: M */
    static void m11219M(u31 u31Var, t02 t02Var, long j, long j2, float f, o00 o00Var, int i, int i2) {
        u31Var.mo7042s0(t02Var, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, o00Var, (i2 & 512) != 0 ? 1 : i);
    }

    /* JADX INFO: renamed from: d0 */
    static void m11220d0(u31 u31Var, ga4 ga4Var, long j, long j2, long j3, qq2 qq2Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j4 = j;
        u31Var.mo7038f(ga4Var, j4, (i & 4) != 0 ? m11218B0(u31Var.mo11227d(), j4) : j2, j3, 1.0f, (i & 32) != 0 ? uf1.f31820j : qq2Var);
    }

    /* JADX INFO: renamed from: f0 */
    static void m11221f0(u31 u31Var, t30 t30Var, long j, long j2, float f, qq2 qq2Var, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = m11218B0(u31Var.mo11227d(), j3);
        }
        u31Var.mo7044x0(t30Var, j3, j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? uf1.f31820j : qq2Var);
    }

    /* JADX INFO: renamed from: g0 */
    static void m11222g0(u31 u31Var, long j, float f, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = u31Var.mo11226a0();
        }
        u31Var.mo7041p(j, j2, f);
    }

    /* JADX INFO: renamed from: o */
    static void m11223o(yf2 yf2Var, t02 t02Var, o00 o00Var) {
        j70 j70Var = yf2Var.f35194a;
        j70Var.f22063a.f21148c.mo6255l(t02Var, j70Var.m7036b(null, uf1.f31820j, 1.0f, o00Var, 3, 1));
    }

    /* JADX INFO: renamed from: q */
    static void m11224q(u31 u31Var, C0489bf c0489bf, long j, qq2 qq2Var, int i) {
        if ((i & 8) != 0) {
            qq2Var = uf1.f31820j;
        }
        u31Var.mo7040m0(c0489bf, j, qq2Var);
    }

    /* JADX INFO: renamed from: x */
    static void m11225x(u31 u31Var, long j, long j2, long j3, pd4 pd4Var, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j4 = j2;
        u31Var.mo7034H(j, j4, (i & 4) != 0 ? m11218B0(u31Var.mo11227d(), j4) : j3, (i & 16) != 0 ? uf1.f31820j : pd4Var, (i & 64) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: H */
    void mo7034H(long j, long j2, long j3, qq2 qq2Var, int i);

    /* JADX INFO: renamed from: J */
    jp0 mo7035J();

    /* JADX INFO: renamed from: a0 */
    default long mo11226a0() {
        return i20.m6597v(mo7035J().m7219E());
    }

    /* JADX INFO: renamed from: d */
    default long mo11227d() {
        return mo7035J().m7219E();
    }

    /* JADX INFO: renamed from: f */
    void mo7038f(t30 t30Var, long j, long j2, long j3, float f, qq2 qq2Var);

    /* JADX INFO: renamed from: g */
    void mo7039g(long j, float f, float f2, long j2, long j3, qq2 qq2Var);

    df2 getLayoutDirection();

    /* JADX INFO: renamed from: m0 */
    void mo7040m0(C0489bf c0489bf, long j, qq2 qq2Var);

    /* JADX INFO: renamed from: p */
    void mo7041p(long j, long j2, float f);

    /* JADX INFO: renamed from: s0 */
    void mo7042s0(t02 t02Var, long j, long j2, long j3, float f, o00 o00Var, int i);

    /* JADX INFO: renamed from: t */
    void mo7043t(C0489bf c0489bf, t30 t30Var, float f, qq2 qq2Var, int i);

    /* JADX INFO: renamed from: x0 */
    void mo7044x0(t30 t30Var, long j, long j2, float f, qq2 qq2Var);
}
