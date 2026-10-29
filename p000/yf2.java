package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yf2 implements u31 {

    /* JADX INFO: renamed from: a */
    public j70 f35194a;

    /* JADX INFO: renamed from: b */
    public s31 f35195b;

    @Override // p000.ky0
    /* JADX INFO: renamed from: A0 */
    public final float mo3572A0(float f) {
        return f / this.f35194a.mo3580c();
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: C */
    public final long mo3573C(float f) {
        return this.f35194a.mo3573C(f);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: D */
    public final long mo3574D(long j) {
        return this.f35194a.mo3574D(j);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: E */
    public final float mo3575E(float f) {
        return this.f35194a.mo3580c() * f;
    }

    @Override // p000.u31
    /* JADX INFO: renamed from: H */
    public final void mo7034H(long j, long j2, long j3, qq2 qq2Var, int i) {
        this.f35194a.mo7034H(j, j2, j3, qq2Var, i);
    }

    @Override // p000.u31
    /* JADX INFO: renamed from: J */
    public final jp0 mo7035J() {
        return this.f35194a.f22064b;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: O */
    public final float mo3577O(long j) {
        return this.f35194a.mo3577O(j);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: U */
    public final int mo3579U(float f) {
        return this.f35194a.mo3579U(f);
    }

    /* JADX INFO: renamed from: a */
    public final void m13113a() {
        j70 j70Var = this.f35194a;
        jp0 jp0Var = j70Var.f22064b;
        h70 h70VarM7248w = j70Var.f22064b.m7248w();
        px0 px0Var = this.f35195b;
        if (px0Var == null) {
            throw d55.m4363h("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        mt2 mt2Var = (mt2) px0Var;
        mt2 mt2VarM10644P = mt2Var.f25195a.f25200f;
        if (mt2VarM10644P != null && (mt2VarM10644P.f25198d & 4) != 0) {
            while (true) {
                if (mt2VarM10644P != null) {
                    int i = mt2VarM10644P.f25197c;
                    if ((i & 2) == 0) {
                        if ((i & 4) != 0) {
                            break;
                        } else {
                            mt2VarM10644P = mt2VarM10644P.f25200f;
                        }
                    }
                }
                mt2VarM10644P = null;
                break;
            }
        } else {
            mt2VarM10644P = null;
            break;
        }
        if (mt2VarM10644P == null) {
            e13 e13VarM10650V = sc6.m10650V(px0Var, 4);
            if (e13VarM10650V.mo4871Z0() == mt2Var.f25195a) {
                e13VarM10650V = e13VarM10650V.f17628x;
            }
            e13VarM10650V.mo4887p1(h70VarM7248w, (bu1) jp0Var.f22482c);
            return;
        }
        uw2 uw2Var = null;
        while (mt2VarM10644P != null) {
            if (mt2VarM10644P instanceof s31) {
                s31 s31Var = (s31) mt2VarM10644P;
                bu1 bu1Var = (bu1) jp0Var.f22482c;
                e13 e13VarM10650V2 = sc6.m10650V(s31Var, 4);
                long jM13369a0 = z62.m13369a0(e13VarM10650V2.f16901c);
                wf2 wf2Var = e13VarM10650V2.f17625u;
                wf2Var.getClass();
                ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2Var)).getSharedDrawScope().m13114b(h70VarM7248w, jM13369a0, e13VarM10650V2, s31Var, bu1Var);
            } else if ((mt2VarM10644P.f25197c & 4) != 0 && (mt2VarM10644P instanceof qx0)) {
                int i2 = 0;
                for (mt2 mt2Var2 = ((qx0) mt2VarM10644P).f28863p; mt2Var2 != null; mt2Var2 = mt2Var2.f25200f) {
                    if ((mt2Var2.f25197c & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            mt2VarM10644P = mt2Var2;
                        } else {
                            if (uw2Var == null) {
                                uw2Var = new uw2(new mt2[16]);
                            }
                            if (mt2VarM10644P != null) {
                                uw2Var.m11663b(mt2VarM10644P);
                                mt2VarM10644P = null;
                            }
                            uw2Var.m11663b(mt2Var2);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            mt2VarM10644P = sc6.m10644P(uw2Var);
        }
    }

    @Override // p000.u31
    /* JADX INFO: renamed from: a0 */
    public final long mo11226a0() {
        return this.f35194a.mo11226a0();
    }

    /* JADX INFO: renamed from: b */
    public final void m13114b(h70 h70Var, long j, e13 e13Var, s31 s31Var, bu1 bu1Var) {
        s31 s31Var2 = this.f35195b;
        this.f35195b = s31Var;
        j70 j70Var = this.f35194a;
        df2 df2Var = e13Var.f17625u.f33293A;
        jp0 jp0Var = j70Var.f22064b;
        ky0 ky0VarM7250y = jp0Var.m7250y();
        df2 df2VarM7216B = jp0Var.m7216B();
        h70 h70VarM7248w = jp0Var.m7248w();
        long jM7219E = jp0Var.m7219E();
        bu1 bu1Var2 = (bu1) jp0Var.f22482c;
        jp0Var.m7227Q(e13Var);
        jp0Var.m7229S(df2Var);
        jp0Var.m7226P(h70Var);
        jp0Var.m7230T(j);
        jp0Var.f22482c = bu1Var;
        h70Var.mo6253j();
        try {
            s31Var.mo3550S(this);
            h70Var.mo6251g();
            jp0Var.m7227Q(ky0VarM7250y);
            jp0Var.m7229S(df2VarM7216B);
            jp0Var.m7226P(h70VarM7248w);
            jp0Var.m7230T(jM7219E);
            jp0Var.f22482c = bu1Var2;
            this.f35195b = s31Var2;
        } catch (Throwable th) {
            h70Var.mo6251g();
            jp0Var.m7227Q(ky0VarM7250y);
            jp0Var.m7229S(df2VarM7216B);
            jp0Var.m7226P(h70VarM7248w);
            jp0Var.m7230T(jM7219E);
            jp0Var.f22482c = bu1Var2;
            throw th;
        }
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: c */
    public final float mo3580c() {
        return this.f35194a.mo3580c();
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: c0 */
    public final long mo3581c0(long j) {
        return this.f35194a.mo3581c0(j);
    }

    @Override // p000.u31
    /* JADX INFO: renamed from: d */
    public final long mo11227d() {
        return this.f35194a.mo11227d();
    }

    @Override // p000.u31
    /* JADX INFO: renamed from: f */
    public final void mo7038f(t30 t30Var, long j, long j2, long j3, float f, qq2 qq2Var) {
        this.f35194a.mo7038f(t30Var, j, j2, j3, f, qq2Var);
    }

    @Override // p000.u31
    /* JADX INFO: renamed from: g */
    public final void mo7039g(long j, float f, float f2, long j2, long j3, qq2 qq2Var) {
        this.f35194a.mo7039g(j, f, f2, j2, j3, qq2Var);
    }

    @Override // p000.u31
    public final df2 getLayoutDirection() {
        return this.f35194a.f22063a.f21147b;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: h0 */
    public final float mo3582h0(long j) {
        return this.f35194a.mo3582h0(j);
    }

    @Override // p000.u31
    /* JADX INFO: renamed from: m0 */
    public final void mo7040m0(C0489bf c0489bf, long j, qq2 qq2Var) {
        this.f35194a.mo7040m0(c0489bf, j, qq2Var);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: o0 */
    public final long mo3584o0(float f) {
        return this.f35194a.mo3584o0(f);
    }

    @Override // p000.u31
    /* JADX INFO: renamed from: p */
    public final void mo7041p(long j, long j2, float f) {
        this.f35194a.mo7041p(j, j2, f);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: r */
    public final float mo3585r() {
        return this.f35194a.mo3585r();
    }

    @Override // p000.u31
    /* JADX INFO: renamed from: s0 */
    public final void mo7042s0(t02 t02Var, long j, long j2, long j3, float f, o00 o00Var, int i) {
        this.f35194a.mo7042s0(t02Var, j, j2, j3, f, o00Var, i);
    }

    @Override // p000.u31
    /* JADX INFO: renamed from: t */
    public final void mo7043t(C0489bf c0489bf, t30 t30Var, float f, qq2 qq2Var, int i) {
        this.f35194a.mo7043t(c0489bf, t30Var, f, qq2Var, i);
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: w0 */
    public final float mo3586w0(int i) {
        return this.f35194a.mo3586w0(i);
    }

    @Override // p000.u31
    /* JADX INFO: renamed from: x0 */
    public final void mo7044x0(t30 t30Var, long j, long j2, float f, qq2 qq2Var) {
        this.f35194a.mo7044x0(t30Var, j, j2, f, qq2Var);
    }
}
