package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qp3 extends lc0 {

    /* JADX INFO: renamed from: r */
    public static final xd2 f28660r = new xd2(24);

    /* JADX INFO: renamed from: d */
    public final uz4 f28661d;

    /* JADX INFO: renamed from: e */
    public final float f28662e;

    /* JADX INFO: renamed from: f */
    public final float f28663f;

    /* JADX INFO: renamed from: g */
    public final so4 f28664g;

    /* JADX INFO: renamed from: h */
    public final float[] f28665h;

    /* JADX INFO: renamed from: i */
    public final float[] f28666i;

    /* JADX INFO: renamed from: j */
    public final float[] f28667j;

    /* JADX INFO: renamed from: k */
    public final k11 f28668k;

    /* JADX INFO: renamed from: l */
    public final pp3 f28669l;

    /* JADX INFO: renamed from: m */
    public final mp3 f28670m;

    /* JADX INFO: renamed from: n */
    public final k11 f28671n;

    /* JADX INFO: renamed from: o */
    public final pp3 f28672o;

    /* JADX INFO: renamed from: p */
    public final mp3 f28673p;

    /* JADX INFO: renamed from: q */
    public final boolean f28674q;

    /* JADX WARN: Code duplicated, block: B:41:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:42:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:45:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:47:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:53:0x021d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0226  */
    /* JADX WARN: Code duplicated, block: B:63:0x023a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0252  */
    /* JADX WARN: Code duplicated, block: B:75:0x021d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0218 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public qp3(String str, float[] fArr, uz4 uz4Var, float[] fArr2, k11 k11Var, k11 k11Var2, float f, float f2, so4 so4Var, int i) {
        char c;
        float f3;
        float[] fArr3;
        float f4;
        float[] fArr4;
        qp3 qp3Var;
        double d;
        boolean z;
        int i2;
        super(i, 12884901888L, str);
        this.f28661d = uz4Var;
        this.f28662e = f;
        this.f28663f = f2;
        this.f28664g = so4Var;
        this.f28668k = k11Var;
        byte b = 1;
        this.f28669l = new pp3(this, b);
        byte b2 = 0;
        mp3 mp3Var = new mp3(b2);
        mp3Var.f25113b = this;
        VarHandle.storeStoreFence();
        this.f28670m = mp3Var;
        this.f28671n = k11Var2;
        this.f28672o = new pp3(this, b2);
        mp3 mp3Var2 = new mp3(b);
        mp3Var2.f25113b = this;
        VarHandle.storeStoreFence();
        this.f28673p = mp3Var2;
        if (fArr.length != 6 && fArr.length != 9) {
            C1077qn.m9987m("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        float[] fArr5 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr5[0] = f5 / f7;
            fArr5[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr5[2] = f8 / f10;
            fArr5[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr5[4] = f11 / f13;
            fArr5[5] = f12 / f13;
        } else {
            AbstractC0990oo.m9203X(fArr, fArr5, 6);
        }
        this.f28665h = fArr5;
        if (fArr2 == null) {
            float f14 = fArr5[0];
            float f15 = fArr5[1];
            float f16 = fArr5[2];
            float f17 = fArr5[3];
            float f18 = fArr5[4];
            float f19 = fArr5[5];
            f3 = 1.0f;
            float f20 = uz4Var.f32275a;
            c = 1;
            float f21 = uz4Var.f32276b;
            float f22 = 1.0f - f14;
            float f23 = f22 / f15;
            float f24 = 1.0f - f16;
            float f25 = 1.0f - f18;
            float f26 = (1.0f - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = (f24 / f17) - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / ((((f25 / f19) - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            fArr3 = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
            this.f28666i = fArr3;
        } else {
            c = 1;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                C1077qn.m9987m(c75.m3877i(fArr2.length, "Transform must have 9 entries! Has "));
                throw null;
            }
            this.f28666i = fArr2;
            fArr3 = fArr2;
        }
        this.f28667j = zc6.m13505B(fArr3);
        float fM3254m = as4.m3254m(fArr5);
        float[] fArr6 = oc0.f26547a;
        if (fM3254m / as4.m3254m(oc0.f26548b) > 0.9f) {
            float[] fArr7 = oc0.f26547a;
            float f38 = fArr5[0];
            float f39 = fArr7[0];
            float f40 = fArr5[c];
            float f41 = fArr7[c];
            float f42 = fArr5[2];
            float f43 = fArr7[2];
            float f44 = fArr5[3];
            float f45 = fArr7[3];
            float f46 = fArr5[4];
            float f47 = fArr7[4];
            float f48 = fArr5[5];
            float f49 = fArr7[5];
            f4 = 0.0f;
            float[] fArr8 = new float[6];
            fArr8[0] = f38 - f39;
            fArr8[c] = f40 - f41;
            fArr8[2] = f42 - f43;
            fArr8[3] = f44 - f45;
            fArr8[4] = f46 - f47;
            fArr8[5] = f48 - f49;
            float f50 = fArr8[0];
            float f51 = fArr8[c];
            if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                float f52 = fArr8[2];
                float f53 = fArr8[3];
                if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                    float f54 = fArr8[4];
                    float f55 = fArr8[5];
                    if (((f49 - f45) * f54) - ((f47 - f43) * f55) < 0.0f || ((f47 - f39) * f55) - ((f49 - f41) * f54) < 0.0f) {
                    }
                }
            }
            if (i != 0) {
                fArr4 = oc0.f26547a;
                if (fArr5 == fArr4) {
                    i2 = 0;
                    while (true) {
                        if (i2 < 6) {
                            if (Float.compare(fArr5[i2], fArr4[i2]) != 0 || Math.abs(fArr5[i2] - fArr4[i2]) <= 0.001f) {
                                i2++;
                            }
                        } else if (zc6.m13536v(uz4Var, ev0.f18501i)) {
                            float[] fArr9 = oc0.f26547a;
                            qp3Var = oc0.f26551e;
                            d = 0.0d;
                            while (true) {
                                if (d <= 1.0d) {
                                    z = c;
                                } else if (Math.abs(k11Var.mo7356e(d) - qp3Var.f28668k.mo7356e(d)) > 0.001d) {
                                }
                                d += 0.00392156862745098d;
                            }
                        }
                    }
                } else if (zc6.m13536v(uz4Var, ev0.f18501i) && f == f4 && f2 == f3) {
                    float[] fArr10 = oc0.f26547a;
                    qp3Var = oc0.f26551e;
                    d = 0.0d;
                    while (true) {
                        if (d <= 1.0d) {
                            z = c;
                        } else if (Math.abs(k11Var.mo7356e(d) - qp3Var.f28668k.mo7356e(d)) > 0.001d && Math.abs(k11Var2.mo7356e(d) - qp3Var.f28671n.mo7356e(d)) <= 0.001d) {
                            d += 0.00392156862745098d;
                        }
                    }
                }
                z = 0;
            } else {
                z = c;
            }
            this.f28674q = z;
        }
        f4 = 0.0f;
        int i3 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
            fArr4 = oc0.f26547a;
            if (fArr5 == fArr4) {
                i2 = 0;
                while (true) {
                    if (i2 < 6) {
                        if (Float.compare(fArr5[i2], fArr4[i2]) != 0) {
                        }
                        i2++;
                    } else if (zc6.m13536v(uz4Var, ev0.f18501i)) {
                        float[] fArr11 = oc0.f26547a;
                        qp3Var = oc0.f26551e;
                        d = 0.0d;
                        while (true) {
                            if (d <= 1.0d) {
                                z = c;
                            } else if (Math.abs(k11Var.mo7356e(d) - qp3Var.f28668k.mo7356e(d)) > 0.001d) {
                            }
                            d += 0.00392156862745098d;
                        }
                    }
                }
            } else if (zc6.m13536v(uz4Var, ev0.f18501i)) {
                float[] fArr12 = oc0.f26547a;
                qp3Var = oc0.f26551e;
                d = 0.0d;
                while (true) {
                    if (d <= 1.0d) {
                        z = c;
                    } else if (Math.abs(k11Var.mo7356e(d) - qp3Var.f28668k.mo7356e(d)) > 0.001d) {
                    }
                    d += 0.00392156862745098d;
                }
            }
            z = 0;
        } else {
            z = c;
        }
        this.f28674q = z;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: a */
    public final float mo7946a(int i) {
        return this.f28663f;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: b */
    public final float mo7947b(int i) {
        return this.f28662e;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: c */
    public final boolean mo7948c() {
        return this.f28674q;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: d */
    public final long mo7949d(float f, float f2, float f3) {
        double d = f;
        mp3 mp3Var = this.f28673p;
        float fMo7356e = (float) mp3Var.mo7356e(d);
        float fMo7356e2 = (float) mp3Var.mo7356e(f2);
        float fMo7356e3 = (float) mp3Var.mo7356e(f3);
        float[] fArr = this.f28666i;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits((fArr[6] * fMo7356e3) + ((fArr[3] * fMo7356e2) + (fArr[0] * fMo7356e)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * fMo7356e3) + (fArr[4] * fMo7356e2) + (fArr[1] * fMo7356e))));
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: e */
    public final float mo7950e(float f, float f2, float f3) {
        double d = f;
        mp3 mp3Var = this.f28673p;
        float fMo7356e = (float) mp3Var.mo7356e(d);
        float fMo7356e2 = (float) mp3Var.mo7356e(f2);
        float fMo7356e3 = (float) mp3Var.mo7356e(f3);
        float[] fArr = this.f28666i;
        return (fArr[8] * fMo7356e3) + (fArr[5] * fMo7356e2) + (fArr[2] * fMo7356e);
    }

    @Override // p000.lc0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qp3.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        qp3 qp3Var = (qp3) obj;
        if (Float.compare(qp3Var.f28662e, this.f28662e) != 0 || Float.compare(qp3Var.f28663f, this.f28663f) != 0 || !z62.m13387o(this.f28661d, qp3Var.f28661d) || !Arrays.equals(this.f28665h, qp3Var.f28665h)) {
            return false;
        }
        so4 so4Var = qp3Var.f28664g;
        so4 so4Var2 = this.f28664g;
        if (so4Var2 != null) {
            return z62.m13387o(so4Var2, so4Var);
        }
        if (so4Var == null) {
            return true;
        }
        if (z62.m13387o(this.f28668k, qp3Var.f28668k)) {
            return z62.m13387o(this.f28671n, qp3Var.f28671n);
        }
        return false;
    }

    @Override // p000.lc0
    /* JADX INFO: renamed from: f */
    public final long mo7951f(float f, float f2, float f3, float f4, lc0 lc0Var) {
        float[] fArr = this.f28667j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        mp3 mp3Var = this.f28670m;
        return zy5.m13867c((float) mp3Var.mo7356e(f5), (float) mp3Var.mo7356e(f6), (float) mp3Var.mo7356e(f7), f4, lc0Var);
    }

    @Override // p000.lc0
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f28665h) + ((this.f28661d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.f28662e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f28663f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        so4 so4Var = this.f28664g;
        int iHashCode2 = iFloatToIntBits2 + (so4Var != null ? so4Var.hashCode() : 0);
        if (so4Var != null) {
            return iHashCode2;
        }
        return this.f28671n.hashCode() + ((this.f28668k.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public qp3(String str, float[] fArr, uz4 uz4Var, so4 so4Var, int i) {
        double d;
        op3 op3Var;
        op3 op3Var2;
        double d2 = so4Var.f30445a;
        byte b = 0;
        byte b2 = 1;
        boolean z = d2 == -3.0d;
        double d3 = so4Var.f30451g;
        double d4 = so4Var.f30450f;
        if (z) {
            d = -3.0d;
            op3Var = new op3((byte) 4);
            op3Var.f26937b = so4Var;
            VarHandle.storeStoreFence();
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                op3Var = new op3((byte) 5);
                op3Var.f26937b = so4Var;
                VarHandle.storeStoreFence();
            } else if (d4 == 0.0d && d3 == 0.0d) {
                op3Var = new op3((byte) 6);
                op3Var.f26937b = so4Var;
                VarHandle.storeStoreFence();
            } else {
                op3Var = new op3((byte) 7);
                op3Var.f26937b = so4Var;
                VarHandle.storeStoreFence();
            }
        }
        if (d2 == d) {
            op3Var2 = new op3(b);
            op3Var2.f26937b = so4Var;
            VarHandle.storeStoreFence();
        } else if (d2 == -2.0d) {
            op3Var2 = new op3(b2);
            op3Var2.f26937b = so4Var;
            VarHandle.storeStoreFence();
        } else if (d4 == 0.0d && d3 == 0.0d) {
            op3Var2 = new op3((byte) 2);
            op3Var2.f26937b = so4Var;
            VarHandle.storeStoreFence();
        } else {
            op3Var2 = new op3((byte) 3);
            op3Var2.f26937b = so4Var;
            VarHandle.storeStoreFence();
        }
        this(str, fArr, uz4Var, null, op3Var, op3Var2, 0.0f, 1.0f, so4Var, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [k11] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r12v0, types: [k11] */
    /* JADX WARN: Type inference failed for: r3v1, types: [xd2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [np3] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public qp3(String str, float[] fArr, uz4 uz4Var, double d, float f, float f2, int i) {
        ?? r11;
        ?? np3Var = f28660r;
        if (d == 1.0d) {
            r11 = np3Var;
        } else {
            np3 np3Var2 = new np3((byte) 0);
            np3Var2.f26020b = d;
            VarHandle.storeStoreFence();
            r11 = np3Var2;
        }
        if (d != 1.0d) {
            np3Var = new np3((byte) 1);
            np3Var.f26020b = d;
            VarHandle.storeStoreFence();
        }
        ?? r12 = np3Var;
        this(str, fArr, uz4Var, null, r11, r12, f, f2, new so4(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
