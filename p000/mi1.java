package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mi1 implements di1 {

    /* JADX INFO: renamed from: a */
    public final float f24938a;

    /* JADX INFO: renamed from: b */
    public final cb4 f24939b;

    public mi1(float f, float f2, float f3) {
        this.f24938a = f3;
        cb4 cb4Var = new cb4();
        cb4Var.f15916a = 1.0f;
        cb4Var.f15917b = Math.sqrt(50.0d);
        cb4Var.f15918c = 1.0f;
        if (f < 0.0f) {
            md3.m8284a("Damping ratio must be non-negative");
        }
        cb4Var.f15918c = f;
        double d = cb4Var.f15917b;
        if (((float) (d * d)) <= 0.0f) {
            md3.m8284a("Spring stiffness constant must be positive.");
        }
        cb4Var.f15917b = Math.sqrt(f2);
        this.f24939b = cb4Var;
    }

    @Override // p000.di1
    /* JADX INFO: renamed from: b */
    public final float mo4508b(long j, float f, float f2, float f3) {
        cb4 cb4Var = this.f24939b;
        cb4Var.f15916a = f2;
        return Float.intBitsToFloat((int) (cb4Var.m3953a(f, f3, j / 1000000) >> 32));
    }

    @Override // p000.di1
    /* JADX INFO: renamed from: c */
    public final float mo4509c(long j, float f, float f2, float f3) {
        cb4 cb4Var = this.f24939b;
        cb4Var.f15916a = f2;
        return Float.intBitsToFloat((int) (cb4Var.m3953a(f, f3, j / 1000000) & 4294967295L));
    }

    @Override // p000.di1
    /* JADX INFO: renamed from: d */
    public final long mo4510d(float f, float f2, float f3) {
        double d;
        double dLog;
        long j;
        double d2;
        cb4 cb4Var = this.f24939b;
        double d3 = cb4Var.f15917b;
        float f4 = (float) (d3 * d3);
        float f5 = cb4Var.f15918c;
        float f6 = this.f24938a;
        float f7 = (f - f2) / f6;
        float f8 = f3 / f6;
        if (f5 == 0.0f) {
            j = 9223372036854L;
        } else {
            double d4 = f4;
            double d5 = f5;
            double d6 = f8;
            double d7 = f7;
            double dSqrt = Math.sqrt(d4) * d5 * 2.0d;
            double d8 = (dSqrt * dSqrt) - (d4 * 4.0d);
            double dSqrt2 = d8 < 0.0d ? 0.0d : Math.sqrt(d8);
            double d9 = -dSqrt;
            double d10 = (d9 + dSqrt2) * 0.5d;
            double dSqrt3 = (d8 < 0.0d ? Math.sqrt(Math.abs(d8)) : 0.0d) * 0.5d;
            double d11 = (d9 - dSqrt2) * 0.5d;
            if (d7 == 0.0d && d6 == 0.0d) {
                j = 0;
            } else {
                if (d7 < 0.0d) {
                    d6 = -d6;
                }
                double d12 = d6;
                double dAbs = Math.abs(d7);
                double dAbs2 = Double.MAX_VALUE;
                if (d5 > 1.0d) {
                    double d13 = d10 - d11;
                    double d14 = ((d10 * dAbs) - d12) / d13;
                    double d15 = dAbs - d14;
                    dLog = Math.log(Math.abs(1.0d / d15)) / d10;
                    double dLog2 = Math.log(Math.abs(1.0d / d14)) / d11;
                    if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog = dLog2;
                    } else if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog = Math.max(dLog, dLog2);
                    }
                    double d16 = d15 * d10;
                    double dLog3 = Math.log(d16 / ((-d14) * d11)) / (d11 - d10);
                    if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
                        d2 = -1.0d;
                    } else {
                        if (dLog3 > 0.0d) {
                            if ((-((Math.exp(dLog3 * d11) * d14) + (Math.exp(d10 * dLog3) * d15))) < 1.0d) {
                                if (d14 > 0.0d && d15 < 0.0d) {
                                    dLog = 0.0d;
                                }
                                d2 = -1.0d;
                            }
                        }
                        dLog = Math.log((-((d14 * d11) * d11)) / (d16 * d10)) / d13;
                        d2 = 1.0d;
                    }
                    double d17 = d14 * d11;
                    if (Math.abs((Math.exp(d11 * dLog) * d17) + (Math.exp(d10 * dLog) * d16)) >= 1.0E-4d) {
                        int i = 0;
                        while (dAbs2 > 0.001d && i < 100) {
                            i++;
                            double d18 = d10 * dLog;
                            double d19 = d11 * dLog;
                            double dExp = dLog - ((((Math.exp(d19) * d14) + (Math.exp(d18) * d15)) + d2) / ((Math.exp(d19) * d17) + (Math.exp(d18) * d16)));
                            dAbs2 = Math.abs(dLog - dExp);
                            dLog = dExp;
                        }
                    }
                } else if (d5 < 1.0d) {
                    double dM4361f = d55.m4361f(d10, dAbs, d12, dSqrt3);
                    dLog = Math.log(1.0d / Math.sqrt((dM4361f * dM4361f) + (dAbs * dAbs))) / d10;
                } else {
                    double d20 = d10 * dAbs;
                    double d21 = d12 - d20;
                    double dLog4 = Math.log(Math.abs(1.0d / dAbs)) / d10;
                    double dLog5 = Math.log(Math.abs(1.0d / d21));
                    double dLog6 = dLog5;
                    for (int i2 = 0; i2 < 6; i2++) {
                        dLog6 = dLog5 - Math.log(Math.abs(dLog6 / d10));
                    }
                    double d22 = dLog6 / d10;
                    if ((Double.doubleToRawLongBits(dLog4) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog4 = d22;
                    } else if ((Double.doubleToRawLongBits(d22) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog4 = Math.max(dLog4, d22);
                    }
                    double d23 = (-(d20 + d21)) / (d10 * d21);
                    double d24 = d10 * d23;
                    double dExp2 = (Math.exp(d24) * d21 * d23) + (Math.exp(d24) * dAbs);
                    if (Double.isNaN(d23) || d23 <= 0.0d) {
                        d = -1.0d;
                    } else if (d23 <= 0.0d || (-dExp2) >= 1.0d) {
                        dLog4 = (-(2.0d / d10)) - (dAbs / d21);
                        d = 1.0d;
                    } else {
                        dLog4 = (d21 >= 0.0d || dAbs <= 0.0d) ? dLog4 : 0.0d;
                        d = -1.0d;
                    }
                    dLog = dLog4;
                    int i3 = 0;
                    while (dAbs2 > 0.001d && i3 < 100) {
                        i3++;
                        double d25 = d10 * dLog;
                        double dExp3 = dLog - (((Math.exp(d25) * ((d21 * dLog) + dAbs)) + d) / (Math.exp(d25) * (((d25 + 1.0d) * d21) + d20)));
                        dAbs2 = Math.abs(dLog - dExp3);
                        dLog = dExp3;
                    }
                }
                j = (long) (dLog * 1000.0d);
            }
        }
        return j * 1000000;
    }

    @Override // p000.di1
    /* JADX INFO: renamed from: e */
    public final float mo4511e(float f, float f2, float f3) {
        return 0.0f;
    }

    public /* synthetic */ mi1(float f, float f2) {
        this(f, f2, 0.01f);
    }
}
