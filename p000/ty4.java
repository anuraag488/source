package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ty4 {

    /* JADX INFO: renamed from: k */
    public static final ty4 f31539k;

    /* JADX INFO: renamed from: a */
    public float f31540a;

    /* JADX INFO: renamed from: b */
    public float f31541b;

    /* JADX INFO: renamed from: c */
    public float f31542c;

    /* JADX INFO: renamed from: d */
    public float f31543d;

    /* JADX INFO: renamed from: e */
    public float f31544e;

    /* JADX INFO: renamed from: f */
    public float f31545f;

    /* JADX INFO: renamed from: g */
    public float[] f31546g;

    /* JADX INFO: renamed from: h */
    public float f31547h;

    /* JADX INFO: renamed from: i */
    public float f31548i;

    /* JADX INFO: renamed from: j */
    public float f31549j;

    static {
        float[] fArr = y70.f34975f;
        float fM13019T = (float) ((((double) y70.m13019T()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = y70.f34973d;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float fExp = (1.0f - (((float) Math.exp(((-fM13019T) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f6) * fExp) + 1.0f) - fExp, (((100.0f / f7) * fExp) + 1.0f) - fExp, (((100.0f / f8) * fExp) + 1.0f) - fExp};
        float f9 = 1.0f / ((5.0f * fM13019T) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float fCbrt = (0.1f * f11 * f11 * ((float) Math.cbrt(((double) fM13019T) * 5.0d))) + (f10 * fM13019T);
        float fM13019T2 = y70.m13019T() / fArr[1];
        double d2 = fM13019T2;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f6)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f7)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f8)) / 100.0d, 0.42d)};
        float f12 = fArr7[0];
        float f13 = (f12 * 400.0f) / (f12 + 27.13f);
        float f14 = fArr7[1];
        float f15 = (f14 * 400.0f) / (f14 + 27.13f);
        float f16 = fArr7[2];
        float[] fArr8 = {f13, f15, (400.0f * f16) / (f16 + 27.13f)};
        float f17 = ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow;
        float fPow2 = (float) Math.pow(fCbrt, 0.25d);
        ty4 ty4Var = new ty4();
        ty4Var.f31545f = fM13019T2;
        ty4Var.f31540a = f17;
        ty4Var.f31541b = fPow;
        ty4Var.f31542c = fPow;
        ty4Var.f31543d = 0.69f;
        ty4Var.f31544e = 1.0f;
        ty4Var.f31546g = fArr6;
        ty4Var.f31547h = fCbrt;
        ty4Var.f31548i = fPow2;
        ty4Var.f31549j = fSqrt;
        VarHandle.storeStoreFence();
        f31539k = ty4Var;
    }
}
