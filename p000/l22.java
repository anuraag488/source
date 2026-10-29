package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l22 extends qx0 {

    /* JADX INFO: renamed from: A */
    public C0910mi f23730A;

    /* JADX INFO: renamed from: B */
    public t82 f23731B;

    /* JADX INFO: renamed from: C */
    public int f23732C;

    /* JADX INFO: renamed from: D */
    public C0910mi f23733D;

    /* JADX INFO: renamed from: E */
    public C0910mi f23734E;

    /* JADX INFO: renamed from: F */
    public C0910mi f23735F;

    /* JADX INFO: renamed from: G */
    public t82 f23736G;

    /* JADX INFO: renamed from: H */
    public float f23737H;

    /* JADX INFO: renamed from: I */
    public y50 f23738I;

    /* JADX INFO: renamed from: q */
    public long f23739q;

    /* JADX INFO: renamed from: r */
    public long f23740r;

    /* JADX INFO: renamed from: s */
    public pd4 f23741s;

    /* JADX INFO: renamed from: t */
    public pd4 f23742t;

    /* JADX INFO: renamed from: u */
    public float f23743u;

    /* JADX INFO: renamed from: v */
    public float f23744v;

    /* JADX INFO: renamed from: w */
    public float f23745w;

    /* JADX INFO: renamed from: x */
    public o90 f23746x;

    /* JADX INFO: renamed from: y */
    public n90 f23747y;

    /* JADX INFO: renamed from: z */
    public z73 f23748z;

    @Override // p000.mt2
    /* JADX INFO: renamed from: G0 */
    public final void mo26G0() {
        t82 t82Var = this.f23736G;
        wm0 wm0Var = null;
        if (t82Var != null) {
            t82Var.mo4993a(null);
        }
        if (this.f25208n && zp0.m13653D(m8391C0())) {
            C0910mi c0910miM4700c = this.f23733D;
            if (c0910miM4700c == null) {
                c0910miM4700c = dt0.m4700c(0.0f);
            }
            this.f23733D = c0910miM4700c;
            C0910mi c0910miM4700c2 = this.f23734E;
            if (c0910miM4700c2 == null) {
                c0910miM4700c2 = dt0.m4700c(0.0f);
            }
            this.f23734E = c0910miM4700c2;
            C0910mi c0910miM4700c3 = this.f23735F;
            if (c0910miM4700c3 == null) {
                c0910miM4700c3 = dt0.m4700c(0.1f);
            }
            this.f23735F = c0910miM4700c3;
            this.f23736G = lb5.m7910S(m8391C0(), null, null, new C1260vl((Object) this, wm0Var, (byte) 7), 3);
        }
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
        this.f23733D = null;
        this.f23734E = null;
        this.f23735F = null;
        this.f23732C = -1;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m7822R0() {
        int i;
        z73 z73Var = this.f23748z;
        t82 t82Var = this.f23731B;
        if (t82Var != null) {
            t82Var.mo4993a(null);
        }
        this.f23731B = null;
        this.f23730A = null;
        if (this.f25208n && zp0.m13653D(m8391C0()) && this.f23737H > 0.0f) {
            if (p11.m9351b(this.f23745w, 0.0f) <= 0 || p11.m9351b(this.f23744v, 0.0f) <= 0 || (i = this.f23732C) <= 0) {
                z73Var.m13400i(0.0f);
                return;
            }
            int iRound = Math.round((this.f23744v / this.f23745w) * 1000.0f * i);
            if (iRound < 50) {
                iRound = 50;
            }
            float fM13399h = z73Var.m13399h();
            this.f23730A = dt0.m4700c(fM13399h);
            this.f23731B = lb5.m7910S(m8391C0(), null, null, new C0814jx(this, fM13399h, iRound, null), 3);
        }
    }
}
