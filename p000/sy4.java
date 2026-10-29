package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sy4 {

    /* JADX INFO: renamed from: k */
    public static final sy4 f30661k;

    /* JADX INFO: renamed from: a */
    public double f30662a;

    /* JADX INFO: renamed from: b */
    public double f30663b;

    /* JADX INFO: renamed from: c */
    public double f30664c;

    /* JADX INFO: renamed from: d */
    public double f30665d;

    /* JADX INFO: renamed from: e */
    public double f30666e;

    /* JADX INFO: renamed from: f */
    public double f30667f;

    /* JADX INFO: renamed from: g */
    public double[] f30668g;

    /* JADX INFO: renamed from: h */
    public double f30669h;

    /* JADX INFO: renamed from: i */
    public double f30670i;

    /* JADX INFO: renamed from: j */
    public double f30671j;

    static {
        double[] dArr = sc6.f30167d;
        double dMax = Math.max(0.1d, 50.0d);
        double d = dArr[0];
        double[][] dArr2 = r60.f29038f;
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = (dArr3[1] * d3) + d2;
        double d5 = dArr[2];
        double d6 = (dArr3[2] * d5) + d4;
        double[] dArr4 = dArr2[1];
        double d7 = (dArr4[2] * d5) + (dArr4[1] * d3) + (dArr4[0] * d);
        double[] dArr5 = dArr2[2];
        double d8 = (d5 * dArr5[2]) + (d3 * dArr5[1]) + (d * dArr5[0]);
        double dM10673n = sc6.m10673n((1.0d - (Math.exp(-0.5839747603136626d) * 0.2777777777777778d)) * 1.0d, 0.0d, 1.0d);
        double[] dArr6 = {(((100.0d / d6) * dM10673n) + 1.0d) - dM10673n, (((100.0d / d7) * dM10673n) + 1.0d) - dM10673n, (((100.0d / d8) * dM10673n) + 1.0d) - dM10673n};
        double dCbrt = (Math.cbrt(58.62838974428476d) * 0.09999998417959298d) + 9.275250255162799E-7d;
        double d9 = (dMax + 16.0d) / 116.0d;
        double d10 = d9 * d9 * d9;
        if (d10 <= 0.008856451679035631d) {
            d10 = ((116.0d * d9) - 16.0d) / 903.2962962962963d;
        }
        double d11 = (d10 * 100.0d) / dArr[1];
        double dSqrt = Math.sqrt(d11) + 1.48d;
        double dPow = 0.725d / Math.pow(d11, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * dCbrt) * d6) / 100.0d, 0.42d), Math.pow(((dArr6[1] * dCbrt) * d7) / 100.0d, 0.42d), Math.pow(((dArr6[2] * dCbrt) * d8) / 100.0d, 0.42d)};
        double d12 = dArr7[0];
        double d13 = (d12 * 400.0d) / (d12 + 27.13d);
        double d14 = dArr7[1];
        double d15 = (d14 * 400.0d) / (d14 + 27.13d);
        double d16 = dArr7[2];
        double[] dArr8 = {d13, d15, (400.0d * d16) / (d16 + 27.13d)};
        double d17 = ((dArr8[2] * 0.05d) + (dArr8[0] * 2.0d) + dArr8[1]) * dPow;
        double dPow2 = Math.pow(dCbrt, 0.25d);
        sy4 sy4Var = new sy4();
        sy4Var.f30662a = d11;
        sy4Var.f30663b = d17;
        sy4Var.f30664c = dPow;
        sy4Var.f30665d = dPow;
        sy4Var.f30666e = 0.69d;
        sy4Var.f30667f = 1.0d;
        sy4Var.f30668g = dArr6;
        sy4Var.f30669h = dCbrt;
        sy4Var.f30670i = dPow2;
        sy4Var.f30671j = dSqrt;
        VarHandle.storeStoreFence();
        f30661k = sy4Var;
    }
}
