package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class so1 {

    /* JADX INFO: renamed from: k */
    public static final so1 f30419k;

    /* JADX INFO: renamed from: a */
    public float f30420a;

    /* JADX INFO: renamed from: b */
    public float f30421b;

    /* JADX INFO: renamed from: c */
    public float f30422c;

    /* JADX INFO: renamed from: d */
    public float f30423d;

    /* JADX INFO: renamed from: e */
    public float f30424e;

    /* JADX INFO: renamed from: f */
    public float f30425f;

    /* JADX INFO: renamed from: g */
    public float[] f30426g;

    /* JADX INFO: renamed from: h */
    public float f30427h;

    /* JADX INFO: renamed from: i */
    public float f30428i;

    /* JADX INFO: renamed from: j */
    public float f30429j;

    static {
        float[] fArr = ks5.f23395d;
        float fPow = (float) (((Math.pow(0.5689655172413793d, 3.0d) * 100.0d) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = ks5.f23393b;
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
        float fExp = (1.0f - (((float) Math.exp(((-fPow) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f6) * fExp) + 1.0f) - fExp, (((100.0f / f7) * fExp) + 1.0f) - fExp, (((100.0f / f8) * fExp) + 1.0f) - fExp};
        float f9 = 1.0f / ((5.0f * fPow) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float fCbrt = (0.1f * f11 * f11 * ((float) Math.cbrt(((double) fPow) * 5.0d))) + (f10 * fPow);
        float fPow2 = ((float) (Math.pow(0.5689655172413793d, 3.0d) * 100.0d)) / fArr[1];
        double d2 = fPow2;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow3 = 0.725f / ((float) Math.pow(d2, 0.20000000298023224d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * fCbrt) * f6) / 100.0f, 0.41999998688697815d), (float) Math.pow(((fArr6[1] * fCbrt) * f7) / 100.0f, 0.41999998688697815d), (float) Math.pow(((fArr6[2] * fCbrt) * f8) / 100.0f, 0.41999998688697815d)};
        float f12 = fArr7[0];
        float f13 = (f12 * 400.0f) / (f12 + 27.13f);
        float f14 = fArr7[1];
        float f15 = (f14 * 400.0f) / (f14 + 27.13f);
        float f16 = fArr7[2];
        float[] fArr8 = {f13, f15, (400.0f * f16) / (f16 + 27.13f)};
        float f17 = ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow3;
        float fPow4 = (float) Math.pow(fCbrt, 0.25d);
        so1 so1Var = new so1();
        so1Var.f30420a = fPow2;
        so1Var.f30421b = f17;
        so1Var.f30422c = fPow3;
        so1Var.f30423d = fPow3;
        so1Var.f30424e = 0.69000006f;
        so1Var.f30425f = 1.0f;
        so1Var.f30426g = fArr6;
        so1Var.f30427h = fCbrt;
        so1Var.f30428i = fPow4;
        so1Var.f30429j = fSqrt;
        VarHandle.storeStoreFence();
        f30419k = so1Var;
    }
}
