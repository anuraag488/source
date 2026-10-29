package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bs0 implements g51 {

    /* JADX INFO: renamed from: a */
    public final float f15539a;

    /* JADX INFO: renamed from: b */
    public final float f15540b;

    /* JADX INFO: renamed from: c */
    public final float f15541c;

    /* JADX INFO: renamed from: d */
    public final float f15542d;

    /* JADX INFO: renamed from: e */
    public final float f15543e;

    /* JADX INFO: renamed from: f */
    public final float f15544f;

    public bs0(float f, float f2, float f3, float f4) {
        int iM4703e0;
        this.f15539a = f;
        this.f15540b = f2;
        this.f15541c = f3;
        this.f15542d = f4;
        if (!((Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) ? false : true)) {
            StringBuilder sbM4370o = d55.m4370o("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", f, ", ", f2, ", ");
            sbM4370o.append(f3);
            sbM4370o.append(", ");
            sbM4370o.append(f4);
            sbM4370o.append(".");
            md3.m8284a(sbM4370o.toString());
        }
        float[] fArr = new float[5];
        float f5 = (f2 - 0.0f) * 3.0f;
        float f6 = (f4 - f2) * 3.0f;
        float f7 = (1.0f - f4) * 3.0f;
        double d = f5;
        double d2 = f6;
        double d3 = f7;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == 0.0d) {
            iM4703e0 = d2 == d3 ? 0 : dt0.m4703e0((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
            double d7 = (-d) + d2;
            int iM4703e1 = dt0.m4703e0((float) ((-(d6 + d7)) / d5), fArr, 0);
            int iM4703e2 = dt0.m4703e0((float) ((d6 - d7) / d5), fArr, iM4703e1) + iM4703e1;
            if (iM4703e2 > 1) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                if (f8 > f9) {
                    fArr[0] = f9;
                    fArr[1] = f8;
                } else if (f8 == f9) {
                    iM4703e0 = iM4703e2 - 1;
                }
                iM4703e0 = iM4703e2;
            } else {
                iM4703e0 = iM4703e2;
            }
        }
        float f10 = (f6 - f5) * 2.0f;
        int iM4703e3 = dt0.m4703e0((-f10) / (((f7 - f6) * 2.0f) - f10), fArr, iM4703e0) + iM4703e0;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i = 0; i < iM4703e3; i++) {
            float f11 = fArr[i];
            float f12 = (((((((((f2 - f4) * 3.0f) + 1.0f) - 0.0f) * f11) + (((f4 - (f2 * 2.0f)) + 0.0f) * 3.0f)) * f11) + f5) * f11) + 0.0f;
            fMin = Math.min(fMin, f12);
            fMax = Math.max(fMax, f12);
        }
        long jM7130a = ji1.m7130a(fMin, fMax);
        this.f15543e = Float.intBitsToFloat((int) (jM7130a >> 32));
        this.f15544f = Float.intBitsToFloat((int) (jM7130a & 4294967295L));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0092 A[PHI: r3
  0x0092: PHI (r3v27 float) = (r3v5 float), (r3v16 float), (r3v21 float), (r3v31 float), (r3v36 float) binds: [B:128:0x0236, B:117:0x0206, B:92:0x01bb, B:47:0x00e5, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0162 A[PHI: r12
  0x0162: PHI (r12v39 float) = (r12v23 float), (r12v34 float) binds: [B:68:0x0160, B:81:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.g51
    /* JADX INFO: renamed from: c */
    public final float mo3662c(float f) {
        float f2;
        if (f <= 0.0f || f >= 1.0f) {
            return f;
        }
        float fMax = Math.max(f, 1.1920929E-7f);
        float f3 = 0.0f - fMax;
        float f4 = this.f15539a;
        float f5 = f4 - fMax;
        float f6 = this.f15541c;
        float f7 = f6 - fMax;
        double d = f3;
        float f8 = 0.0f;
        double d2 = ((d - (((double) f5) * 2.0d)) + ((double) f7)) * 3.0d;
        double d3 = ((double) (f5 - f3)) * 3.0d;
        double d4 = (((double) (f5 - f7)) * 3.0d) + ((double) (-f3)) + ((double) (1.0f - fMax));
        float f9 = Float.NaN;
        if (Math.abs(d4 - 0.0d) >= 1.0E-7d) {
            double d5 = d2 / d4;
            double d6 = d3 / d4;
            double d7 = d / d4;
            double dM4361f = d55.m4361f(d5, d5, d6 * 3.0d, 9.0d);
            double d8 = ((d7 * 27.0d) + ((((2.0d * d5) * d5) * d5) - ((d5 * 9.0d) * d6))) / 54.0d;
            double d9 = dM4361f * dM4361f * dM4361f;
            double d10 = (d8 * d8) + d9;
            double d11 = d5 / 3.0d;
            if (d10 < 0.0d) {
                double dSqrt = Math.sqrt(-d9);
                double d12 = (-d8) / dSqrt;
                if (d12 < -1.0d) {
                    d12 = -1.0d;
                }
                if (d12 > 1.0d) {
                    d12 = 1.0d;
                }
                double dAcos = Math.acos(d12);
                double dM13690v = zp0.m13690v((float) dSqrt) * 2.0f;
                float fCos = (float) ((Math.cos(dAcos / 3.0d) * dM13690v) - d11);
                float f10 = fCos < 0.0f ? 0.0f : fCos;
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
                if (Math.abs(f10 - fCos) > 1.05E-6f) {
                    f10 = Float.NaN;
                }
                if (Float.isNaN(f10)) {
                    float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dM13690v) - d11);
                    f10 = fCos2 < 0.0f ? 0.0f : fCos2;
                    if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                    if (Math.abs(f10 - fCos2) > 1.05E-6f) {
                        f10 = Float.NaN;
                    }
                    if (Float.isNaN(f10)) {
                        float fCos3 = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dM13690v) - d11);
                        if (fCos3 >= 0.0f) {
                            f8 = fCos3;
                        }
                        f2 = f8 > 1.0f ? 1.0f : f8;
                        if (Math.abs(f2 - fCos3) <= 1.05E-6f) {
                            f9 = f2;
                        }
                    } else {
                        f9 = f10;
                    }
                } else {
                    f9 = f10;
                }
            } else if (d10 == 0.0d) {
                float f11 = -zp0.m13690v((float) d8);
                float f12 = (float) d11;
                float f13 = (f11 * 2.0f) - f12;
                float f14 = f13 < 0.0f ? 0.0f : f13;
                if (f14 > 1.0f) {
                    f14 = 1.0f;
                }
                if (Math.abs(f14 - f13) > 1.05E-6f) {
                    f14 = Float.NaN;
                }
                if (Float.isNaN(f14)) {
                    float f15 = (-f11) - f12;
                    if (f15 >= 0.0f) {
                        f8 = f15;
                    }
                    f2 = f8 > 1.0f ? 1.0f : f8;
                    if (Math.abs(f2 - f15) <= 1.05E-6f) {
                        f9 = f2;
                    }
                } else {
                    f9 = f14;
                }
            } else {
                double dSqrt2 = Math.sqrt(d10);
                float fM13690v = (float) (((double) (zp0.m13690v((float) ((-d8) + dSqrt2)) - zp0.m13690v((float) (d8 + dSqrt2)))) - d11);
                if (fM13690v >= 0.0f) {
                    f8 = fM13690v;
                }
                f2 = f8 > 1.0f ? 1.0f : f8;
                if (Math.abs(f2 - fM13690v) <= 1.05E-6f) {
                    f9 = f2;
                }
            }
        } else if (Math.abs(d2 - 0.0d) >= 1.0E-7d) {
            double dSqrt3 = Math.sqrt((d3 * d3) - ((4.0d * d2) * d));
            double d13 = d2 * 2.0d;
            float f16 = (float) ((dSqrt3 - d3) / d13);
            float f17 = f16 < 0.0f ? 0.0f : f16;
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            if (Math.abs(f17 - f16) > 1.05E-6f) {
                f17 = Float.NaN;
            }
            if (Float.isNaN(f17)) {
                float f18 = (float) (((-d3) - dSqrt3) / d13);
                if (f18 >= 0.0f) {
                    f8 = f18;
                }
                f2 = f8 > 1.0f ? 1.0f : f8;
                if (Math.abs(f2 - f18) <= 1.05E-6f) {
                    f9 = f2;
                }
            } else {
                f9 = f17;
            }
        } else if (Math.abs(d3 - 0.0d) >= 1.0E-7d) {
            float f19 = (float) ((-d) / d3);
            if (f19 >= 0.0f) {
                f8 = f19;
            }
            f2 = f8 > 1.0f ? 1.0f : f8;
            if (Math.abs(f2 - f19) <= 1.05E-6f) {
                f9 = f2;
            }
        }
        boolean zIsNaN = Float.isNaN(f9);
        float f20 = this.f15542d;
        float f21 = this.f15540b;
        if (!zIsNaN) {
            float f22 = ((((((f21 - f20) + 0.33333334f) * f9) + (f20 - (2.0f * f21))) * f9) + f21) * 3.0f * f9;
            float f23 = this.f15543e;
            if (f22 < f23) {
                f22 = f23;
            }
            float f24 = this.f15544f;
            return f22 > f24 ? f24 : f22;
        }
        StringBuilder sbM4370o = d55.m4370o("The cubic curve with parameters (", f4, ", ", f21, ", ");
        sbM4370o.append(f6);
        sbM4370o.append(", ");
        sbM4370o.append(f20);
        sbM4370o.append(") has no solution at ");
        sbM4370o.append(f);
        throw new IllegalArgumentException(sbM4370o.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bs0)) {
            return false;
        }
        bs0 bs0Var = (bs0) obj;
        return this.f15539a == bs0Var.f15539a && this.f15540b == bs0Var.f15540b && this.f15541c == bs0Var.f15541c && this.f15542d == bs0Var.f15542d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15542d) + c75.m3874f(this.f15541c, c75.m3874f(this.f15540b, Float.hashCode(this.f15539a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM4370o = d55.m4370o("CubicBezierEasing(a=", this.f15539a, ", b=", this.f15540b, ", c=");
        sbM4370o.append(this.f15541c);
        sbM4370o.append(", d=");
        sbM4370o.append(this.f15542d);
        sbM4370o.append(")");
        return sbM4370o.toString();
    }
}
