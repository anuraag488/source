package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: bf */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0489bf {

    /* JADX INFO: renamed from: a */
    public final Path f15228a;

    /* JADX INFO: renamed from: b */
    public RectF f15229b;

    /* JADX INFO: renamed from: c */
    public float[] f15230c;

    /* JADX INFO: renamed from: d */
    public Matrix f15231d;

    public C0489bf(Path path) {
        this.f15228a = path;
    }

    /* JADX INFO: renamed from: a */
    public static void m3558a(C0489bf c0489bf, C0489bf c0489bf2) {
        Path path = c0489bf.f15228a;
        if (c0489bf2 instanceof C0489bf) {
            path.addPath(c0489bf2.f15228a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
        } else {
            qm5.m9919j("Unable to obtain android.graphics.Path");
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3559b(C0489bf c0489bf, cr3 cr3Var) {
        o83[] o83VarArr = o83.f26438a;
        RectF rectF = c0489bf.f15229b;
        if (rectF == null) {
            rectF = new RectF();
            c0489bf.f15229b = rectF;
        }
        float f = cr3Var.f16391a;
        long j = cr3Var.f16398h;
        long j2 = cr3Var.f16397g;
        long j3 = cr3Var.f16396f;
        long j4 = cr3Var.f16395e;
        rectF.set(f, cr3Var.f16392b, cr3Var.f16393c, cr3Var.f16394d);
        float[] fArr = c0489bf.f15230c;
        if (fArr == null) {
            fArr = new float[8];
            c0489bf.f15230c = fArr;
        }
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        c0489bf.f15228a.addRoundRect(c0489bf.f15229b, c0489bf.f15230c, Path.Direction.CCW);
    }

    /* JADX INFO: renamed from: c */
    public final void m3560c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f15228a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    /* JADX INFO: renamed from: d */
    public final jl3 m3561d() {
        RectF rectF = this.f15229b;
        if (rectF == null) {
            rectF = new RectF();
            this.f15229b = rectF;
        }
        this.f15228a.computeBounds(rectF, true);
        return new jl3(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: renamed from: e */
    public final void m3562e(float f, float f2) {
        this.f15228a.lineTo(f, f2);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3563f(C0489bf c0489bf, C0489bf c0489bf2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(c0489bf instanceof C0489bf)) {
            qm5.m9919j("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = c0489bf.f15228a;
        if (c0489bf2 instanceof C0489bf) {
            return this.f15228a.op(path, c0489bf2.f15228a, op);
        }
        qm5.m9919j("Unable to obtain android.graphics.Path");
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final void m3564g() {
        this.f15228a.reset();
    }

    /* JADX INFO: renamed from: h */
    public final void m3565h() {
        this.f15228a.rewind();
    }

    /* JADX INFO: renamed from: i */
    public final void m3566i(float[] fArr) {
        Matrix matrix = this.f15231d;
        if (matrix == null) {
            matrix = new Matrix();
            this.f15231d = matrix;
        }
        se0.m10709X(matrix, fArr);
        this.f15228a.transform(this.f15231d);
    }

    /* JADX INFO: renamed from: j */
    public final void m3567j(long j) {
        Matrix matrix = this.f15231d;
        if (matrix == null) {
            this.f15231d = new Matrix();
        } else {
            matrix.reset();
        }
        this.f15231d.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        this.f15228a.transform(this.f15231d);
    }
}
