package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: renamed from: xb */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1325xb implements h70 {

    /* JADX INFO: renamed from: a */
    public Canvas f34122a = AbstractC1362yb.f35080a;

    /* JADX INFO: renamed from: b */
    public Rect f34123b;

    /* JADX INFO: renamed from: c */
    public Rect f34124c;

    @Override // p000.h70
    /* JADX INFO: renamed from: a */
    public final void mo6245a(float f, float f2) {
        this.f34122a.scale(f, f2);
    }

    @Override // p000.h70
    /* JADX INFO: renamed from: b */
    public final void mo6246b(float f) {
        this.f34122a.rotate(f);
    }

    @Override // p000.h70
    /* JADX INFO: renamed from: c */
    public final void mo6247c(float f, long j, C1253ve c1253ve) {
        this.f34122a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) c1253ve.f32549b);
    }

    @Override // p000.h70
    /* JADX INFO: renamed from: d */
    public final void mo6248d(float f, float f2, float f3, float f4, int i) {
        this.f34122a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // p000.h70
    /* JADX INFO: renamed from: e */
    public final void mo6249e(float f, float f2) {
        this.f34122a.translate(f, f2);
    }

    @Override // p000.h70
    /* JADX INFO: renamed from: f */
    public final void mo6250f(C0489bf c0489bf, C1253ve c1253ve) {
        Canvas canvas = this.f34122a;
        if (c0489bf instanceof C0489bf) {
            canvas.drawPath(c0489bf.f15228a, c20.m3823t(c1253ve));
        } else {
            qm5.m9919j("Unable to obtain android.graphics.Path");
        }
    }

    @Override // p000.h70
    /* JADX INFO: renamed from: g */
    public final void mo6251g() {
        this.f34122a.restore();
    }

    @Override // p000.h70
    /* JADX INFO: renamed from: h */
    public final void mo6252h(float f, float f2, float f3, float f4, float f5, float f6, C1253ve c1253ve) {
        this.f34122a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) c1253ve.f32549b);
    }

    @Override // p000.h70
    /* JADX INFO: renamed from: j */
    public final void mo6253j() {
        this.f34122a.save();
    }

    @Override // p000.h70
    /* JADX INFO: renamed from: k */
    public final void mo6254k(long j, long j2, C1253ve c1253ve) {
        this.f34122a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) c1253ve.f32549b);
    }

    @Override // p000.h70
    /* JADX INFO: renamed from: l */
    public final void mo6255l(t02 t02Var, C1253ve c1253ve) {
        this.f34122a.drawBitmap(AbstractC0647fd.m5679r(t02Var), Float.intBitsToFloat(0), Float.intBitsToFloat(0), (Paint) c1253ve.f32549b);
    }

    @Override // p000.h70
    /* JADX INFO: renamed from: m */
    public final void mo6256m() {
        this.f34122a.disableZ();
    }

    @Override // p000.h70
    /* JADX INFO: renamed from: n */
    public final void mo6257n(t02 t02Var, long j, long j2, long j3, C1253ve c1253ve) {
        if (this.f34123b == null) {
            this.f34123b = new Rect();
            this.f34124c = new Rect();
        }
        Canvas canvas = this.f34122a;
        Bitmap bitmapM5679r = AbstractC0647fd.m5679r(t02Var);
        Rect rect = this.f34123b;
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.f34124c;
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapM5679r, rect, rect2, (Paint) c1253ve.f32549b);
    }

    @Override // p000.h70
    /* JADX INFO: renamed from: o */
    public final void mo6258o(jl3 jl3Var, C1253ve c1253ve) {
        this.f34122a.saveLayer(jl3Var.f22396a, jl3Var.f22397b, jl3Var.f22398c, jl3Var.f22399d, (Paint) c1253ve.f32549b, 31);
    }

    @Override // p000.h70
    /* JADX INFO: renamed from: p */
    public final void mo6259p(float f, float f2, float f3, float f4, C1253ve c1253ve) {
        this.f34122a.drawRect(f, f2, f3, f4, c20.m3823t(c1253ve));
    }

    @Override // p000.h70
    /* JADX INFO: renamed from: q */
    public final void mo6260q(float[] fArr) {
        if (y42.m12871t0(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        se0.m10709X(matrix, fArr);
        this.f34122a.concat(matrix);
    }

    @Override // p000.h70
    /* JADX INFO: renamed from: r */
    public final void mo6261r() {
        this.f34122a.enableZ();
    }

    @Override // p000.h70
    /* JADX INFO: renamed from: s */
    public final void mo6262s(C0489bf c0489bf) {
        Canvas canvas = this.f34122a;
        if (c0489bf instanceof C0489bf) {
            canvas.clipPath(c0489bf.f15228a, Region.Op.INTERSECT);
        } else {
            qm5.m9919j("Unable to obtain android.graphics.Path");
        }
    }

    @Override // p000.h70
    /* JADX INFO: renamed from: t */
    public final void mo6263t(float f, float f2, float f3, float f4, float f5, float f6, C1253ve c1253ve) {
        this.f34122a.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) c1253ve.f32549b);
    }
}
