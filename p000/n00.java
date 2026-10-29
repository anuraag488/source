package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n00 {

    /* JADX INFO: renamed from: a */
    public static final n00 f25354a = new n00();

    /* JADX INFO: renamed from: a */
    public static int m8473a(double d, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        r60 r60VarM10120y = qs5.m10120y(i);
        r60 r60VarM10120y2 = qs5.m10120y(i2);
        double d2 = 1.0d - d;
        double d3 = (r60VarM10120y2.f29042c * d) + (r60VarM10120y.f29042c * d2);
        double d4 = (r60VarM10120y2.f29043d * d) + (r60VarM10120y.f29043d * d2);
        double d5 = (r60VarM10120y2.f29044e * d) + (d2 * r60VarM10120y.f29044e);
        sy4 sy4Var = sy4.f30661k;
        double d6 = sy4Var.f30666e;
        double dExpm1 = Math.expm1(Math.hypot(d4, d5) * 0.0228d) / 0.0228d;
        double d7 = sy4Var.f30670i;
        double d8 = dExpm1 / d7;
        double dAtan2 = Math.atan2(d5, d4) * 57.29577951308232d;
        if (dAtan2 < 0.0d) {
            dAtan2 += 360.0d;
        }
        double d9 = d3 / (1.0d - ((d3 - 100.0d) * 0.007d));
        double d10 = d9 / 100.0d;
        Math.sqrt(d10);
        Math.sqrt(((d8 / Math.sqrt(d10)) * d6) / (sy4Var.f30663b + 4.0d));
        double d11 = dAtan2 * 0.017453292519943295d;
        Math.log1p(d7 * d8 * 0.0228d);
        Math.cos(d11);
        Math.sin(d11);
        double d12 = sy4Var.f30669h;
        double dPow = Math.pow(((d8 == 0.0d || d9 == 0.0d) ? 0.0d : d8 / Math.sqrt(d10)) / Math.pow(1.64d - Math.pow(0.29d, sy4Var.f30662a), 0.73d), 1.1111111111111112d);
        double dCos = (Math.cos(2.0d + d11) + 3.8d) * 0.25d;
        double dPow2 = Math.pow(d10, (1.0d / sy4Var.f30666e) / sy4Var.f30671j) * sy4Var.f30663b;
        double d13 = dCos * 3846.153846153846d * sy4Var.f30667f * sy4Var.f30665d;
        double d14 = dPow2 / sy4Var.f30664c;
        double dSin = Math.sin(d11);
        double dCos2 = Math.cos(d11);
        double d15 = (((0.305d + d14) * 23.0d) * dPow) / (((dPow * 108.0d) * dSin) + (((11.0d * dPow) * dCos2) + (d13 * 23.0d)));
        double d16 = dCos2 * d15;
        double d17 = d15 * dSin;
        double d18 = d14 * 460.0d;
        double d19 = ((288.0d * d17) + ((451.0d * d16) + d18)) / 1403.0d;
        double dM4361f = d55.m4361f(d17, 261.0d, d18 - (891.0d * d16), 1403.0d);
        double dM4361f2 = d55.m4361f(d17, 6300.0d, d18 - (d16 * 220.0d), 1403.0d);
        double dMax = Math.max(0.0d, (Math.abs(d19) * 27.13d) / (400.0d - Math.abs(d19)));
        if (d19 < 0.0d) {
            i3 = 1;
            i4 = -1;
        } else if (d19 == 0.0d) {
            i4 = 0;
            i3 = 1;
        } else {
            i3 = 1;
            i4 = 1;
        }
        double d20 = 100.0d / d12;
        double dPow3 = Math.pow(dMax, 2.380952380952381d) * ((double) i4) * d20;
        double dMax2 = Math.max(0.0d, (Math.abs(dM4361f) * 27.13d) / (400.0d - Math.abs(dM4361f)));
        if (dM4361f < 0.0d) {
            i5 = -1;
        } else {
            i5 = dM4361f == 0.0d ? 0 : i3;
        }
        double dPow4 = Math.pow(dMax2, 2.380952380952381d) * ((double) i5) * d20;
        double dMax3 = Math.max(0.0d, (Math.abs(dM4361f2) * 27.13d) / (400.0d - Math.abs(dM4361f2)));
        if (dM4361f2 < 0.0d) {
            i6 = -1;
        } else {
            i6 = dM4361f2 == 0.0d ? 0 : i3;
        }
        double dPow5 = Math.pow(dMax3, 2.380952380952381d) * d20 * ((double) i6);
        double[] dArr = sy4Var.f30668g;
        double d21 = dPow3 / dArr[0];
        double d22 = dPow4 / dArr[i3];
        double d23 = dPow5 / dArr[2];
        double[][] dArr2 = r60.f29039g;
        double[] dArr3 = dArr2[0];
        double d24 = (dArr3[2] * d23) + (dArr3[i3] * d22) + (dArr3[0] * d21);
        double[] dArr4 = dArr2[i3];
        double d25 = (dArr4[2] * d23) + (dArr4[i3] * d22) + (dArr4[0] * d21);
        double[] dArr5 = dArr2[2];
        return sc6.m10667h(d24, d25, (d23 * dArr5[2]) + (d22 * dArr5[i3]) + (d21 * dArr5[0]));
    }
}
