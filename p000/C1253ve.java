package p000;

import ads_mobile_sdk.ba4;
import ads_mobile_sdk.da4;
import android.graphics.Paint;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: ve */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1253ve implements m62 {

    /* JADX INFO: renamed from: a */
    public int f32548a;

    /* JADX INFO: renamed from: b */
    public Object f32549b;

    /* JADX INFO: renamed from: c */
    public Object f32550c;

    /* JADX INFO: renamed from: d */
    public Object f32551d;

    public C1253ve(int i, y30 y30Var, ro0 ro0Var, si1 si1Var) {
        this.f32549b = si1Var;
        this.f32548a = i;
        this.f32550c = y30Var;
        this.f32551d = ro0Var;
    }

    @Override // p000.m62
    /* JADX INFO: renamed from: a */
    public void mo6370a(char c) throws IOException {
        byte[] bArr = (byte[]) this.f32550c;
        if (c < 128) {
            if (bArr.length - this.f32548a < 1) {
                m11876f();
            }
            int i = this.f32548a;
            this.f32548a = i + 1;
            bArr[i] = (byte) c;
            return;
        }
        if (c < 2048) {
            if (bArr.length - this.f32548a < 2) {
                m11876f();
            }
            int i2 = this.f32548a;
            int i3 = i2 + 1;
            this.f32548a = i3;
            bArr[i2] = (byte) ((c >> 6) | 192);
            this.f32548a = i2 + 2;
            bArr[i3] = (byte) ((c & '?') | 128);
            return;
        }
        if (55296 <= c && c < 57344) {
            if (bArr.length - this.f32548a < 1) {
                m11876f();
            }
            int i4 = this.f32548a;
            this.f32548a = i4 + 1;
            bArr[i4] = 63;
            return;
        }
        if (c < 0) {
            if (bArr.length - this.f32548a < 3) {
                m11876f();
            }
            int i5 = this.f32548a;
            int i6 = i5 + 1;
            this.f32548a = i6;
            bArr[i5] = -32;
            int i7 = i5 + 2;
            this.f32548a = i7;
            bArr[i6] = (byte) (((c >> 6) & 63) | 128);
            this.f32548a = i5 + 3;
            bArr[i7] = (byte) ((c & '?') | 128);
            return;
        }
        if (c > 65535) {
            throw new y92(c75.m3878j("Unexpected code point: ", c, ". Check your strings for malformed UTF-8 sequences."), null, null, 14);
        }
        if (bArr.length - this.f32548a < 4) {
            m11876f();
        }
        int i8 = this.f32548a;
        int i9 = i8 + 1;
        this.f32548a = i9;
        bArr[i8] = -16;
        int i10 = i8 + 2;
        this.f32548a = i10;
        bArr[i9] = -128;
        int i11 = i8 + 3;
        this.f32548a = i11;
        bArr[i10] = (byte) (((c >> 6) & 63) | 128);
        this.f32548a = i8 + 4;
        bArr[i11] = (byte) ((c & '?') | 128);
    }

    /* JADX INFO: renamed from: b */
    public da4 m11872b(long j) throws f95, q85 {
        int[] iArr = {1667674495, 1502201381, 1197125461, 478240810, 622476187, -1652496091, 840440151, 1203013321, 774318984};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int iM13024d = y70.m13024d((i2 & (~i)) | i3, (i & i4) | iArr[4], iArr[5], iArr[6]) ^ (iArr[7] % iArr[8]);
        m11868c(m11869a() + j);
        int i5 = this.f32548a;
        long j2 = i5;
        da4 da4Var = (da4) this.f32549b;
        long j3 = (j >> iM13024d) + j2;
        if (j3 > da4Var.f2451a.length || j3 < j2) {
            throw new f95();
        }
        try {
            int i6 = (int) j3;
            da4 da4VarMo2971a = ((af5) this.f32550c).mo2971a(da4Var, i5, i6);
            this.f32548a = i6;
            return da4VarMo2971a;
        } catch (IndexOutOfBoundsException e) {
            xy4.m12790s(ba4.m472a("CEiv6BFfPnitUE+D"), e);
            return null;
        }
    }

    @Override // p000.m62
    /* JADX INFO: renamed from: c */
    public void mo6371c(String str) throws IOException {
        byte b;
        m11875e(0, str.length() + 2);
        char[] cArr = (char[]) this.f32551d;
        cArr[0] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, 1);
        int i = length + 1;
        int length2 = 1;
        while (length2 < i) {
            char c = cArr[length2];
            String[] strArr = ed4.f18023a;
            if (c <= 31 || c == '\"' || c == '\\') {
                int length3 = str.length();
                for (int i2 = length2 - 1; i2 < length3; i2++) {
                    m11875e(length2, 2);
                    char cCharAt = str.charAt(i2);
                    byte[] bArr = ed4.f18024b;
                    if (cCharAt >= bArr.length || (b = bArr[cCharAt]) == 0) {
                        int i3 = length2 + 1;
                        ((char[]) this.f32551d)[length2] = cCharAt;
                        length2 = i3;
                    } else if (b == 1) {
                        String str2 = ed4.f18023a[cCharAt];
                        m11875e(length2, str2.length());
                        str2.getChars(0, str2.length(), (char[]) this.f32551d, length2);
                        length2 = str2.length() + length2;
                    } else {
                        char[] cArr2 = (char[]) this.f32551d;
                        cArr2[length2] = '\\';
                        cArr2[length2 + 1] = (char) b;
                        length2 += 2;
                    }
                }
                m11875e(length2, 1);
                char[] cArr3 = (char[]) this.f32551d;
                cArr3[length2] = '\"';
                m11886p(cArr3, length2 + 1);
                m11876f();
                return;
            }
            length2++;
        }
        cArr[i] = '\"';
        m11886p(cArr, length + 2);
        m11876f();
    }

    /* JADX INFO: renamed from: d */
    public long m11874d() throws f85, f95 {
        int iM13024d = y70.m13024d(2113091120, 659347295, -1784934195, 38700438) ^ 301105688;
        int i = 0;
        long j = 0;
        while (i < iM13024d) {
            try {
                af5 af5Var = (af5) this.f32550c;
                da4 da4Var = (da4) this.f32549b;
                int i2 = this.f32548a;
                this.f32548a = i2 + 1;
                byte bMo2970a = af5Var.mo2970a(da4Var, i2);
                j |= ((long) (bMo2970a & 127)) << i;
                if (i == 63) {
                    if (bMo2970a > 1) {
                        throw new f85();
                    }
                    i = 63;
                }
                if ((bMo2970a & 128) == 0) {
                    return (j >>> 1) ^ (-(j & 1));
                }
                i += 7;
            } catch (IndexOutOfBoundsException e) {
                throw new f95(e);
            }
        }
        throw new f85();
    }

    /* JADX INFO: renamed from: e */
    public void m11875e(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.f32551d;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.f32551d = Arrays.copyOf(cArr, i3);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m11876f() throws IOException {
        ((xt4) this.f32549b).write((byte[]) this.f32550c, 0, this.f32548a);
        this.f32548a = 0;
    }

    /* JADX INFO: renamed from: g */
    public int m11877g() {
        Paint.Cap strokeCap = ((Paint) this.f32549b).getStrokeCap();
        int i = strokeCap == null ? -1 : AbstractC1290we.f33263a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: h */
    public int m11878h() {
        Paint.Join strokeJoin = ((Paint) this.f32549b).getStrokeJoin();
        int i = strokeJoin == null ? -1 : AbstractC1290we.f33264b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    /* JADX INFO: renamed from: i */
    public void m11879i(float f) {
        ((Paint) this.f32549b).setAlpha((int) Math.rint(f * 255.0f));
    }

    /* JADX INFO: renamed from: j */
    public void m11880j(int i) {
        if (this.f32548a == i) {
            return;
        }
        this.f32548a = i;
        o35.f26318a.m8937b((Paint) this.f32549b, i);
    }

    /* JADX INFO: renamed from: k */
    public void m11881k(long j) {
        o35.f26318a.m8938c((Paint) this.f32549b, j);
    }

    /* JADX INFO: renamed from: l */
    public void m11882l(o00 o00Var) {
        this.f32551d = o00Var;
        ((Paint) this.f32549b).setColorFilter(o00Var != null ? o00Var.f26229a : null);
    }

    /* JADX INFO: renamed from: m */
    public void m11883m(int i) {
        Paint.Cap cap;
        Paint paint = (Paint) this.f32549b;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    /* JADX INFO: renamed from: n */
    public void m11884n(int i) {
        Paint.Join join;
        Paint paint = (Paint) this.f32549b;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    /* JADX INFO: renamed from: o */
    public void m11885o(int i) {
        ((Paint) this.f32549b).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    /* JADX INFO: renamed from: p */
    public void m11886p(char[] cArr, int i) throws IOException {
        byte[] bArr = (byte[]) this.f32550c;
        if (i < 0) {
            C1077qn.m9987m("count < 0");
            return;
        }
        if (i > cArr.length) {
            StringBuilder sbM3883o = c75.m3883o("count > string.length: ", i, " > ");
            sbM3883o.append(cArr.length);
            throw new IllegalArgumentException(sbM3883o.toString().toString());
        }
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            if (c < 128) {
                if (bArr.length - this.f32548a < 1) {
                    m11876f();
                }
                int i3 = this.f32548a;
                int i4 = i3 + 1;
                this.f32548a = i4;
                bArr[i3] = (byte) c;
                i2++;
                int iMin = Math.min(i, (bArr.length - i4) + i2);
                while (i2 < iMin) {
                    char c2 = cArr[i2];
                    if (c2 >= 128) {
                        break;
                    }
                    int i5 = this.f32548a;
                    this.f32548a = i5 + 1;
                    bArr[i5] = (byte) c2;
                    i2++;
                }
            } else {
                if (c < 2048) {
                    if (bArr.length - this.f32548a < 2) {
                        m11876f();
                    }
                    int i6 = this.f32548a;
                    int i7 = i6 + 1;
                    this.f32548a = i7;
                    bArr[i6] = (byte) ((c >> 6) | 192);
                    this.f32548a = i6 + 2;
                    bArr[i7] = (byte) ((c & '?') | 128);
                } else if (c < 55296 || c > 57343) {
                    if (bArr.length - this.f32548a < 3) {
                        m11876f();
                    }
                    int i8 = this.f32548a;
                    int i9 = i8 + 1;
                    this.f32548a = i9;
                    bArr[i8] = (byte) ((c >> '\f') | 224);
                    int i10 = i8 + 2;
                    this.f32548a = i10;
                    bArr[i9] = (byte) (((c >> 6) & 63) | 128);
                    this.f32548a = i8 + 3;
                    bArr[i10] = (byte) ((c & '?') | 128);
                } else {
                    int i11 = i2 + 1;
                    char c3 = i11 < i ? cArr[i11] : (char) 0;
                    if (c > 56319 || 56320 > c3 || c3 >= 57344) {
                        if (bArr.length - this.f32548a < 1) {
                            m11876f();
                        }
                        int i12 = this.f32548a;
                        this.f32548a = i12 + 1;
                        bArr[i12] = 63;
                        i2 = i11;
                    } else {
                        int i13 = (((c & 1023) << 10) | (c3 & 1023)) + 65536;
                        if (bArr.length - this.f32548a < 4) {
                            m11876f();
                        }
                        int i14 = this.f32548a;
                        int i15 = i14 + 1;
                        this.f32548a = i15;
                        bArr[i14] = (byte) ((i13 >> 18) | 240);
                        int i16 = i14 + 2;
                        this.f32548a = i16;
                        bArr[i15] = (byte) (((i13 >> 12) & 63) | 128);
                        int i17 = i14 + 3;
                        this.f32548a = i17;
                        bArr[i16] = (byte) (((i13 >> 6) & 63) | 128);
                        this.f32548a = i14 + 4;
                        bArr[i17] = (byte) ((i13 & 63) | 128);
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    @Override // p000.m62
    public void writeLong(long j) throws IOException {
        mo6372d(String.valueOf(j));
    }

    public C1253ve(da4 da4Var, int i, af5 af5Var, r50 r50Var) {
        this(da4Var, i, af5Var);
        this.f32551d = r50Var;
    }

    public C1253ve(Paint paint) {
        this.f32549b = paint;
        this.f32548a = 3;
    }

    public C1253ve(da4 da4Var, int i, af5 af5Var) {
        this.f32549b = da4Var;
        this.f32548a = i;
        this.f32550c = af5Var;
    }

    @Override // p000.m62
    /* JADX INFO: renamed from: d */
    public void mo6372d(String str) throws IOException {
        int length = str.length();
        m11875e(0, length);
        str.getChars(0, length, (char[]) this.f32551d, 0);
        m11886p((char[]) this.f32551d, length);
    }

    /* JADX INFO: renamed from: b */
    public long m11871b() throws f95 {
        try {
            af5 af5Var = (af5) this.f32550c;
            da4 da4Var = (da4) this.f32549b;
            int i = this.f32548a;
            this.f32548a = i + 1;
            return af5Var.mo2970a(da4Var, i);
        } catch (IndexOutOfBoundsException e) {
            throw new f95(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m11868c(long j) throws q85 {
        long[] jArr = {141540322, 456640674, 1141397064, 993500330, 1614820873, 3337980909L, 410218731, 1716462158, 477127367};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        if (j % (((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - j7) + jArr[6]) ^ (jArr[7] % jArr[8])) != 0) {
            throw new q85();
        }
    }

    /* JADX INFO: renamed from: c */
    public int m11873c() throws f95 {
        int iM13024d = y70.m13024d(1695460764, 396394489, 1519637107, 6072641) ^ 578290844;
        try {
            af5 af5Var = (af5) this.f32550c;
            da4 da4Var = (da4) this.f32549b;
            int i = this.f32548a;
            this.f32548a = i + 1;
            int iMo2970a = af5Var.mo2970a(da4Var, i) & iM13024d;
            af5 af5Var2 = (af5) this.f32550c;
            da4 da4Var2 = (da4) this.f32549b;
            int i2 = this.f32548a;
            this.f32548a = i2 + 1;
            int iMo2970a2 = iMo2970a | ((af5Var2.mo2970a(da4Var2, i2) & iM13024d) << 8);
            af5 af5Var3 = (af5) this.f32550c;
            da4 da4Var3 = (da4) this.f32549b;
            int i3 = this.f32548a;
            this.f32548a = i3 + 1;
            int iMo2970a3 = ((iM13024d & af5Var3.mo2970a(da4Var3, i3)) << 16) | iMo2970a2;
            af5 af5Var4 = (af5) this.f32550c;
            da4 da4Var4 = (da4) this.f32549b;
            int i4 = this.f32548a;
            this.f32548a = i4 + 1;
            return (af5Var4.mo2970a(da4Var4, i4) << 24) | iMo2970a3;
        } catch (IndexOutOfBoundsException e) {
            throw new f95(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public long m11869a() {
        long[] jArr = {491705403, 818579170, 1201981453, 810223590, 1243973916, 3701563257L, 554701476, 1889947178, 1780695788};
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        return ((long) this.f32548a) * (((((((~j) & j2) | j3) + ((j & j4) | j5)) - j6) + jArr[6]) ^ (jArr[7] % jArr[8]));
    }

    /* JADX INFO: renamed from: a */
    public void m11870a(long j) throws f95, q85 {
        long[] jArr = {2139842053, 728564241, 750932242, 1403848321, 1892818418, 4558981222L, 1919655804, 1856374729, 899334107};
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = ((((((~j2) & j3) | j4) + ((j2 & j5) | j6)) - jArr[5]) + jArr[6]) ^ (jArr[7] % jArr[8]);
        m11868c(j);
        long j8 = j / j7;
        if (j8 >= 0 && j8 <= ((da4) this.f32549b).f2451a.length) {
            this.f32548a = (int) j8;
            return;
        }
        throw new f95();
    }
}
