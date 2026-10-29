package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class i73 {

    /* JADX INFO: renamed from: a */
    public C1253ve f21154a;

    /* JADX INFO: renamed from: b */
    public boolean f21155b;

    /* JADX INFO: renamed from: c */
    public o00 f21156c;

    /* JADX INFO: renamed from: d */
    public float f21157d = 1.0f;

    /* JADX INFO: renamed from: e */
    public df2 f21158e = df2.f17011a;

    /* JADX INFO: renamed from: a */
    public abstract boolean mo35a(float f);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo36b(o00 o00Var);

    /* JADX INFO: renamed from: f */
    public final void m6688f(u31 u31Var, long j, float f, o00 o00Var) {
        if (this.f21157d != f) {
            if (!mo35a(f)) {
                C1253ve c1253veM3810e = this.f21154a;
                if (f == 1.0f) {
                    if (c1253veM3810e != null) {
                        c1253veM3810e.m11879i(f);
                    }
                    this.f21155b = false;
                } else {
                    if (c1253veM3810e == null) {
                        c1253veM3810e = c20.m3810e();
                        this.f21154a = c1253veM3810e;
                    }
                    c1253veM3810e.m11879i(f);
                    this.f21155b = true;
                }
            }
            this.f21157d = f;
        }
        if (!z62.m13387o(this.f21156c, o00Var)) {
            if (!mo36b(o00Var)) {
                C1253ve c1253veM3810e2 = this.f21154a;
                if (o00Var == null) {
                    if (c1253veM3810e2 != null) {
                        c1253veM3810e2.m11882l(null);
                    }
                    this.f21155b = false;
                } else {
                    if (c1253veM3810e2 == null) {
                        c1253veM3810e2 = c20.m3810e();
                        this.f21154a = c1253veM3810e2;
                    }
                    c1253veM3810e2.m11882l(o00Var);
                    this.f21155b = true;
                }
            }
            this.f21156c = o00Var;
        }
        df2 layoutDirection = u31Var.getLayoutDirection();
        if (this.f21158e != layoutDirection) {
            mo39e(layoutDirection);
            this.f21158e = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (u31Var.mo11227d() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (u31Var.mo11227d() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((ar3) u31Var.mo7035J().f22481b).m3150t(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.f21155b) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        jl3 jl3VarM5672j = AbstractC0647fd.m5672j(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        h70 h70VarM7248w = u31Var.mo7035J().m7248w();
                        C1253ve c1253veM3810e3 = this.f21154a;
                        if (c1253veM3810e3 == null) {
                            c1253veM3810e3 = c20.m3810e();
                            this.f21154a = c1253veM3810e3;
                        }
                        try {
                            h70VarM7248w.mo6258o(jl3VarM5672j, c1253veM3810e3);
                            mo42i(u31Var);
                            h70VarM7248w.mo6251g();
                        } catch (Throwable th) {
                            h70VarM7248w.mo6251g();
                            throw th;
                        }
                    } else {
                        mo42i(u31Var);
                    }
                }
            } catch (Throwable th2) {
                ((ar3) u31Var.mo7035J().f22481b).m3150t(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        ((ar3) u31Var.mo7035J().f22481b).m3150t(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    /* JADX INFO: renamed from: g */
    public abstract long mo40g();

    /* JADX INFO: renamed from: i */
    public abstract void mo42i(u31 u31Var);

    /* JADX INFO: renamed from: e */
    public void mo39e(df2 df2Var) {
    }
}
