package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pb0 {

    /* JADX INFO: renamed from: b */
    public static final long f27495b = zy5.m13870e(4278190080L);

    /* JADX INFO: renamed from: c */
    public static final long f27496c;

    /* JADX INFO: renamed from: d */
    public static final long f27497d;

    /* JADX INFO: renamed from: e */
    public static final long f27498e;

    /* JADX INFO: renamed from: f */
    public static final long f27499f;

    /* JADX INFO: renamed from: g */
    public static final long f27500g;

    /* JADX INFO: renamed from: h */
    public static final long f27501h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f27502i = 0;

    /* JADX INFO: renamed from: a */
    public long f27503a;

    static {
        zy5.m13870e(4282664004L);
        f27496c = zy5.m13870e(4287137928L);
        zy5.m13870e(4291611852L);
        f27497d = zy5.m13870e(4294967295L);
        f27498e = zy5.m13870e(4294901760L);
        zy5.m13870e(4278255360L);
        f27499f = zy5.m13870e(4278190335L);
        zy5.m13870e(4294967040L);
        zy5.m13870e(4278255615L);
        zy5.m13870e(4294902015L);
        f27500g = zy5.m13869d(0);
        float[] fArr = oc0.f26547a;
        f27501h = zy5.m13867c(0.0f, 0.0f, 0.0f, 0.0f, oc0.f26567u);
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ pb0 m9462a(long j) {
        pb0 pb0Var = new pb0();
        pb0Var.f27503a = j;
        VarHandle.storeStoreFence();
        return pb0Var;
    }

    /* JADX INFO: renamed from: b */
    public static final long m9463b(long j, lc0 lc0Var) {
        tk0 tk0VarM13538x;
        lc0 lc0VarM9467f = m9467f(j);
        int i = lc0VarM9467f.f23931c;
        int i2 = lc0Var.f23931c;
        if ((i | i2) < 0) {
            tk0VarM13538x = zc6.m13538x(lc0VarM9467f, lc0Var);
        } else {
            lv2 lv2Var = uk0.f31945a;
            int i3 = i | (i2 << 6);
            Object objM8197b = lv2Var.m8197b(i3);
            if (objM8197b == null) {
                objM8197b = zc6.m13538x(lc0VarM9467f, lc0Var);
                lv2Var.m8121h(i3, objM8197b);
            }
            tk0VarM13538x = (tk0) objM8197b;
        }
        return tk0VarM13538x.mo10350a(j);
    }

    /* JADX INFO: renamed from: c */
    public static long m9464c(long j, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = m9465d(j);
        }
        if ((i & 2) != 0) {
            f2 = m9469h(j);
        }
        if ((i & 4) != 0) {
            f3 = m9468g(j);
        }
        if ((i & 8) != 0) {
            f4 = m9466e(j);
        }
        return zy5.m13867c(f2, f3, f4, f, m9467f(j));
    }

    /* JADX INFO: renamed from: d */
    public static final float m9465d(long j) {
        float fM6606E;
        float f;
        if ((63 & j) == 0) {
            fM6606E = (float) i25.m6606E((j >>> 56) & 255);
            f = 255.0f;
        } else {
            fM6606E = (float) i25.m6606E((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return fM6606E / f;
    }

    /* JADX INFO: renamed from: e */
    public static final float m9466e(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) i25.m6606E((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - ci1.f16042a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: f */
    public static final lc0 m9467f(long j) {
        float[] fArr = oc0.f26547a;
        return oc0.f26571y[(int) (j & 63)];
    }

    /* JADX INFO: renamed from: g */
    public static final float m9468g(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) i25.m6606E((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - ci1.f16042a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: h */
    public static final float m9469h(long j) {
        int i;
        int i2;
        int i3;
        if ((63 & j) == 0) {
            return ((float) i25.m6606E((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - ci1.f16042a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* JADX INFO: renamed from: i */
    public static String m9470i(long j) {
        float fM9469h = m9469h(j);
        float fM9468g = m9468g(j);
        float fM9466e = m9466e(j);
        float fM9465d = m9465d(j);
        String str = m9467f(j).f23929a;
        StringBuilder sbM4370o = d55.m4370o("Color(", fM9469h, ", ", fM9468g, ", ");
        sbM4370o.append(fM9466e);
        sbM4370o.append(", ");
        sbM4370o.append(fM9465d);
        sbM4370o.append(", ");
        return zi4.m13623w(sbM4370o, str, ")");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pb0) && this.f27503a == ((pb0) obj).f27503a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f27503a);
    }

    public final String toString() {
        return m9470i(this.f27503a);
    }
}
