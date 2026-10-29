package p000;

import android.graphics.Paint;
import android.graphics.Shader;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j70 implements u31 {

    /* JADX INFO: renamed from: a */
    public final i70 f22063a;

    /* JADX INFO: renamed from: b */
    public final jp0 f22064b;

    /* JADX INFO: renamed from: c */
    public C1253ve f22065c;

    /* JADX INFO: renamed from: d */
    public C1253ve f22066d;

    public j70() {
        ly0 ly0Var = q31.f28194a;
        df2 df2Var = df2.f17011a;
        i70 i70Var = new i70();
        i70Var.f21146a = ly0Var;
        i70Var.f21147b = df2Var;
        i70Var.f21148c = p71.f27414a;
        i70Var.f21149d = 0L;
        this.f22063a = i70Var;
        byte b = 12;
        jp0 jp0Var = new jp0(b, false);
        jp0Var.f22483d = this;
        ar3 ar3Var = new ar3(b);
        ar3Var.f14813b = jp0Var;
        VarHandle.storeStoreFence();
        jp0Var.f22481b = ar3Var;
        VarHandle.storeStoreFence();
        this.f22064b = jp0Var;
    }

    /* JADX INFO: renamed from: a */
    public static C1253ve m7033a(j70 j70Var, long j, qq2 qq2Var, int i) {
        C1253ve c1253veM7037e = j70Var.m7037e(qq2Var);
        Paint paint = (Paint) c1253veM7037e.f32549b;
        long jM8936a = o35.f26318a.m8936a(paint);
        int i2 = pb0.f27502i;
        if (!ws4.m12408a(jM8936a, j)) {
            c1253veM7037e.m11881k(j);
        }
        if (((Shader) c1253veM7037e.f32550c) != null) {
            c1253veM7037e.f32550c = null;
            paint.setShader(null);
        }
        if (!z62.m13387o((o00) c1253veM7037e.f32551d, null)) {
            c1253veM7037e.m11882l(null);
        }
        if (c1253veM7037e.f32548a != i) {
            c1253veM7037e.m11880j(i);
        }
        if (paint.isFilterBitmap()) {
            return c1253veM7037e;
        }
        paint.setFilterBitmap(true);
        return c1253veM7037e;
    }

    @Override // p000.u31
    /* JADX INFO: renamed from: H */
    public final void mo7034H(long j, long j2, long j3, qq2 qq2Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.f22063a.f21148c.mo6259p(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), m7033a(this, j, qq2Var, i));
    }

    @Override // p000.u31
    /* JADX INFO: renamed from: J */
    public final jp0 mo7035J() {
        return this.f22064b;
    }

    /* JADX INFO: renamed from: b */
    public final C1253ve m7036b(t30 t30Var, qq2 qq2Var, float f, o00 o00Var, int i, int i2) {
        C1253ve c1253veM7037e = m7037e(qq2Var);
        Paint paint = (Paint) c1253veM7037e.f32549b;
        if (t30Var != null) {
            t30Var.mo5948a(f, mo11227d(), c1253veM7037e);
        } else {
            if (((Shader) c1253veM7037e.f32550c) != null) {
                c1253veM7037e.f32550c = null;
                paint.setShader(null);
            }
            long jM8936a = o35.f26318a.m8936a(paint);
            long j = pb0.f27495b;
            if (!ws4.m12408a(jM8936a, j)) {
                c1253veM7037e.m11881k(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                c1253veM7037e.m11879i(f);
            }
        }
        if (!z62.m13387o((o00) c1253veM7037e.f32551d, o00Var)) {
            c1253veM7037e.m11882l(o00Var);
        }
        if (c1253veM7037e.f32548a != i) {
            c1253veM7037e.m11880j(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return c1253veM7037e;
        }
        paint.setFilterBitmap(true ^ (i2 == 0));
        return c1253veM7037e;
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: c */
    public final float mo3580c() {
        return this.f22063a.f21146a.mo3580c();
    }

    /* JADX INFO: renamed from: e */
    public final C1253ve m7037e(qq2 qq2Var) {
        if (z62.m13387o(qq2Var, uf1.f31820j)) {
            C1253ve c1253ve = this.f22065c;
            if (c1253ve != null) {
                return c1253ve;
            }
            C1253ve c1253veM3810e = c20.m3810e();
            c1253veM3810e.m11885o(0);
            this.f22065c = c1253veM3810e;
            return c1253veM3810e;
        }
        if (!(qq2Var instanceof pd4)) {
            C0670g.m5864c();
            return null;
        }
        C1253ve c1253veM3810e2 = this.f22066d;
        if (c1253veM3810e2 == null) {
            c1253veM3810e2 = c20.m3810e();
            c1253veM3810e2.m11885o(1);
            this.f22066d = c1253veM3810e2;
        }
        Paint paint = (Paint) c1253veM3810e2.f32549b;
        float strokeWidth = paint.getStrokeWidth();
        pd4 pd4Var = (pd4) qq2Var;
        float f = pd4Var.f27547j;
        if (strokeWidth != f) {
            paint.setStrokeWidth(f);
        }
        int iM11877g = c1253veM3810e2.m11877g();
        int i = pd4Var.f27549l;
        if (iM11877g != i) {
            c1253veM3810e2.m11883m(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = pd4Var.f27548k;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iM11878h = c1253veM3810e2.m11878h();
        int i2 = pd4Var.f27550m;
        if (iM11878h != i2) {
            c1253veM3810e2.m11884n(i2);
        }
        return c1253veM3810e2;
    }

    @Override // p000.u31
    /* JADX INFO: renamed from: f */
    public final void mo7038f(t30 t30Var, long j, long j2, long j3, float f, qq2 qq2Var) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.f22063a.f21148c.mo6252h(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), m7036b(t30Var, qq2Var, f, null, 3, 1));
    }

    @Override // p000.u31
    /* JADX INFO: renamed from: g */
    public final void mo7039g(long j, float f, float f2, long j2, long j3, qq2 qq2Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.f22063a.f21148c.mo6263t(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, m7033a(this, j, qq2Var, 3));
    }

    @Override // p000.u31
    public final df2 getLayoutDirection() {
        return this.f22063a.f21147b;
    }

    @Override // p000.u31
    /* JADX INFO: renamed from: m0 */
    public final void mo7040m0(C0489bf c0489bf, long j, qq2 qq2Var) {
        this.f22063a.f21148c.mo6250f(c0489bf, m7033a(this, j, qq2Var, 3));
    }

    @Override // p000.u31
    /* JADX INFO: renamed from: p */
    public final void mo7041p(long j, long j2, float f) {
        this.f22063a.f21148c.mo6247c(f, j2, m7033a(this, j, uf1.f31820j, 3));
    }

    @Override // p000.ky0
    /* JADX INFO: renamed from: r */
    public final float mo3585r() {
        return this.f22063a.f21146a.mo3585r();
    }

    @Override // p000.u31
    /* JADX INFO: renamed from: s0 */
    public final void mo7042s0(t02 t02Var, long j, long j2, long j3, float f, o00 o00Var, int i) {
        this.f22063a.f21148c.mo6257n(t02Var, j, j2, j3, m7036b(null, uf1.f31820j, f, o00Var, 3, i));
    }

    @Override // p000.u31
    /* JADX INFO: renamed from: t */
    public final void mo7043t(C0489bf c0489bf, t30 t30Var, float f, qq2 qq2Var, int i) {
        this.f22063a.f21148c.mo6250f(c0489bf, m7036b(t30Var, qq2Var, f, null, i, 1));
    }

    @Override // p000.u31
    /* JADX INFO: renamed from: x0 */
    public final void mo7044x0(t30 t30Var, long j, long j2, float f, qq2 qq2Var) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        this.f22063a.f21148c.mo6259p(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i2), m7036b(t30Var, qq2Var, f, null, 3, 1));
    }
}
