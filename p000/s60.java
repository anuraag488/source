package p000;

import android.graphics.Color;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s60 {

    /* JADX INFO: renamed from: a */
    public final float f29925a;

    /* JADX INFO: renamed from: b */
    public final float f29926b;

    /* JADX INFO: renamed from: c */
    public final float f29927c;

    /* JADX INFO: renamed from: d */
    public final float f29928d;

    /* JADX INFO: renamed from: e */
    public final float f29929e;

    /* JADX INFO: renamed from: f */
    public final float f29930f;

    public /* synthetic */ s60(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f29925a = f;
        this.f29926b = f2;
        this.f29927c = f3;
        this.f29928d = f4;
        this.f29929e = f5;
        this.f29930f = f6;
    }

    /* JADX INFO: renamed from: a */
    public static s60 m10527a(int i) {
        ty4 ty4Var = ty4.f31539k;
        float fM13013N = y70.m13013N(Color.red(i));
        float fM13013N2 = y70.m13013N(Color.green(i));
        float fM13013N3 = y70.m13013N(Color.blue(i));
        float[][] fArr = y70.f34976g;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * fM13013N3) + (fArr2[1] * fM13013N2) + (fArr2[0] * fM13013N);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * fM13013N3) + (fArr3[1] * fM13013N2) + (fArr3[0] * fM13013N);
        float[] fArr4 = fArr[2];
        float f3 = (fM13013N3 * fArr4[2]) + (fM13013N2 * fArr4[1]) + (fM13013N * fArr4[0]);
        float[][] fArr5 = y70.f34973d;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = ty4Var.f31546g;
        float f7 = ty4Var.f31548i;
        float f8 = ty4Var.f31543d;
        float f9 = ty4Var.f31540a;
        float f10 = fArr9[0] * f4;
        float f11 = fArr9[1] * f5;
        float f12 = fArr9[2] * f6;
        float f13 = ty4Var.f31547h;
        float fPow = (float) Math.pow(((double) (Math.abs(f10) * f13)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f11) * f13)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f12) * f13)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f10) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f11) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f12) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f14 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d)) / 11.0f;
        float f15 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f16 = fSignum2 * 20.0f;
        float f17 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f16)) / 20.0f;
        float f18 = (((fSignum * 40.0f) + f16) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f19 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f18 * ty4Var.f31541b) / f9, ty4Var.f31549j * f8)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f20 = f9 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, ty4Var.f31545f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * ty4Var.f31544e) * ty4Var.f31542c) * ((float) Math.sqrt((f15 * f15) + (f14 * f14)))) / (f17 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((fPow5 * f8) / f20);
        float f21 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f7 * fSqrt * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f19;
        return new s60(fAtan2, fSqrt, fPow4, f21, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX INFO: renamed from: b */
    public static s60 m10528b(float f, float f2, float f3) {
        ty4 ty4Var = ty4.f31539k;
        float f4 = ty4Var.f31543d;
        double d = ((double) f) / 100.0d;
        Math.sqrt(d);
        float f5 = ty4Var.f31540a + 4.0f;
        float f6 = ty4Var.f31548i * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(d))) * ty4Var.f31543d) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) f6) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new s60(f3, f2, f, f7, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX INFO: renamed from: c */
    public int m10529c(so1 so1Var) {
        float f = this.f29926b;
        float f2 = this.f29927c;
        float fSqrt = (f == 0.0f || f2 == 0.0f) ? 0.0f : f / ((float) Math.sqrt(f2 / 100.0f));
        float f3 = so1Var.f30420a;
        float f4 = so1Var.f30427h;
        float fPow = fSqrt / ((float) Math.pow(1.64f - ((float) Math.pow((float) Math.pow(0.28999999165534973d, f3), 0.7300000190734863d)), 1.1111111640930176d));
        float f5 = (this.f29925a * 3.1415927f) / 180.0f;
        float fCos = (((float) Math.cos(2.0f + f5)) + 3.8f) * 0.25f;
        float fPow2 = so1Var.f30421b * ((float) Math.pow(f2 / 100.0f, (1.0f / so1Var.f30424e) / so1Var.f30429j));
        float f6 = fCos * 3846.1538f * so1Var.f30425f * so1Var.f30423d;
        float f7 = fPow2 / so1Var.f30422c;
        double d = f5;
        float fSin = (float) Math.sin(d);
        float fCos2 = (float) Math.cos(d);
        float f8 = (((0.305f + f7) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f6 * 23.0f)));
        float f9 = fCos2 * f8;
        float f10 = f8 * fSin;
        float f11 = f7 * 460.0f;
        float f12 = ((288.0f * f10) + ((451.0f * f9) + f11)) / 1403.0f;
        float f13 = ((f11 - (891.0f * f9)) - (261.0f * f10)) / 1403.0f;
        float f14 = ((f11 - (f9 * 220.0f)) - (f10 * 6300.0f)) / 1403.0f;
        float f15 = 100.0f / f4;
        float fSignum = Math.signum(f12) * f15 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f12) * 27.13f) / (400.0f - Math.abs(f12))), 2.3809523582458496d));
        float fSignum2 = Math.signum(f13) * f15 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f13) * 27.13f) / (400.0f - Math.abs(f13))), 2.3809523582458496d));
        float fSignum3 = Math.signum(f14) * f15 * ((float) Math.pow(Math.max(0.0f, (Math.abs(f14) * 27.13f) / (400.0f - Math.abs(f14))), 2.3809523582458496d));
        float[] fArr = so1Var.f30426g;
        float f16 = fSignum / fArr[0];
        float f17 = fSignum2 / fArr[1];
        float f18 = fSignum3 / fArr[2];
        float[][] fArr2 = ks5.f23394c;
        float[] fArr3 = fArr2[0];
        float f19 = (fArr3[2] * f18) + (fArr3[1] * f17) + (fArr3[0] * f16);
        float[] fArr4 = fArr2[1];
        float f20 = (fArr4[2] * f18) + (fArr4[1] * f17) + (fArr4[0] * f16);
        float[] fArr5 = fArr2[2];
        return gd0.m5971a(f19, f20, (f18 * fArr5[2]) + (f17 * fArr5[1]) + (f16 * fArr5[0]));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX INFO: renamed from: d */
    public int m10530d(ty4 ty4Var) {
        float fSqrt;
        float f = this.f29926b;
        double d = f;
        float f2 = this.f29927c;
        if (d != 0.0d) {
            double d2 = f2;
            if (d2 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f / ((float) Math.sqrt(d2 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float f3 = ty4Var.f31545f;
        float f4 = ty4Var.f31547h;
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, f3), 0.73d), 1.1111111111111112d);
        double d3 = (this.f29925a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
        float fPow2 = ty4Var.f31540a * ((float) Math.pow(((double) f2) / 100.0d, (1.0d / ((double) ty4Var.f31543d)) / ((double) ty4Var.f31549j)));
        float f5 = fCos * 3846.1538f * ty4Var.f31544e * ty4Var.f31542c;
        float f6 = fPow2 / ty4Var.f31541b;
        float fSin = (float) Math.sin(d3);
        float fCos2 = (float) Math.cos(d3);
        float f7 = (((0.305f + f6) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f5 * 23.0f)));
        float f8 = fCos2 * f7;
        float f9 = f7 * fSin;
        float f10 = f6 * 460.0f;
        float f11 = ((288.0f * f9) + ((451.0f * f8) + f10)) / 1403.0f;
        float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
        float f13 = ((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f;
        float f14 = 100.0f / f4;
        float fSignum = Math.signum(f11) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f12) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f12)) * 27.13d) / (400.0d - ((double) Math.abs(f12)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f13) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f13)) * 27.13d) / (400.0d - ((double) Math.abs(f13)))), 2.380952380952381d));
        float[] fArr = ty4Var.f31546g;
        float f15 = fSignum / fArr[0];
        float f16 = fSignum2 / fArr[1];
        float f17 = fSignum3 / fArr[2];
        float[][] fArr2 = y70.f34974e;
        float[] fArr3 = fArr2[0];
        float f18 = (fArr3[2] * f17) + (fArr3[1] * f16) + (fArr3[0] * f15);
        float[] fArr4 = fArr2[1];
        float f19 = (fArr4[2] * f17) + (fArr4[1] * f16) + (fArr4[0] * f15);
        float[] fArr5 = fArr2[2];
        return gd0.m5971a(f18, f19, (f17 * fArr5[2]) + (f16 * fArr5[1]) + (f15 * fArr5[0]));
    }
}
