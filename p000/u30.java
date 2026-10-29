package p000;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u30 extends t30 {

    /* JADX INFO: renamed from: a */
    public wd3 f31632a;

    /* JADX INFO: renamed from: b */
    public long f31633b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Shader f31634c;

    @Override // p000.t30
    /* JADX INFO: renamed from: a */
    public final void mo5948a(float f, long j, C1253ve c1253ve) {
        Paint paint = (Paint) c1253ve.f32549b;
        wd3 wd3Var = this.f31632a;
        if (wd3Var == null || !h74.m6270b(this.f31633b, j)) {
            if (h74.m6274f(j)) {
                this.f31632a = null;
                this.f31633b = 9205357640488583168L;
                wd3Var = null;
            } else {
                wd3Var = this.f31632a;
                if (wd3Var == null) {
                    wd3Var = new wd3((byte) 16);
                    this.f31632a = wd3Var;
                }
                wd3Var.f33259b = this.f31634c;
                this.f31632a = wd3Var;
                this.f31633b = j;
            }
        }
        long jM8936a = o35.f26318a.m8936a(paint);
        long j2 = pb0.f27495b;
        if (!ws4.m12408a(jM8936a, j2)) {
            c1253ve.m11881k(j2);
        }
        if (!z62.m13387o((Shader) c1253ve.f32550c, wd3Var != null ? (Shader) wd3Var.f33259b : null)) {
            Shader shader = wd3Var != null ? (Shader) wd3Var.f33259b : null;
            c1253ve.f32550c = shader;
            paint.setShader(shader);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        c1253ve.m11879i(f);
    }
}
