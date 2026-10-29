package p000;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w30 implements k40, j40, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a */
    public zz3 f33055a;

    /* JADX INFO: renamed from: b */
    public long f33056b;

    /* JADX INFO: renamed from: A */
    public final short m12045A() throws EOFException {
        long j = this.f33056b;
        if (j < 2) {
            throw new EOFException();
        }
        zz3 zz3Var = this.f33055a;
        int i = zz3Var.f36505b;
        int i2 = zz3Var.f36506c;
        if (i2 - i < 2) {
            return (short) ((m12067q() & 255) | ((m12067q() & 255) << 8));
        }
        byte[] bArr = zz3Var.f36504a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f33056b = j - 2;
        if (i5 == i2) {
            this.f33055a = zz3Var.m13894a();
            c04.m3786a(zz3Var);
        } else {
            zz3Var.f36505b = i5;
        }
        return (short) i6;
    }

    /* JADX INFO: renamed from: B */
    public final short m12046B() throws EOFException {
        short sM12045A = m12045A();
        return (short) (((sM12045A & 255) << 8) | ((65280 & sM12045A) >>> 8));
    }

    /* JADX INFO: renamed from: C */
    public final String m12047C(long j, Charset charset) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C1077qn.m9988n(zi4.m13619s("byteCount: ", j));
            return null;
        }
        if (this.f33056b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        zz3 zz3Var = this.f33055a;
        int i = zz3Var.f36505b;
        if (((long) i) + j > zz3Var.f36506c) {
            return new String(m12068t(j), charset);
        }
        int i2 = (int) j;
        String str = new String(zz3Var.f36504a, i, i2, charset);
        int i3 = zz3Var.f36505b + i2;
        zz3Var.f36505b = i3;
        this.f33056b -= j;
        if (i3 == zz3Var.f36506c) {
            this.f33055a = zz3Var.m13894a();
            c04.m3786a(zz3Var);
        }
        return str;
    }

    /* JADX INFO: renamed from: D */
    public final void m12048D(long j) throws EOFException {
        while (j > 0) {
            zz3 zz3Var = this.f33055a;
            if (zz3Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, zz3Var.f36506c - zz3Var.f36505b);
            long j2 = iMin;
            this.f33056b -= j2;
            j -= j2;
            int i = zz3Var.f36505b + iMin;
            zz3Var.f36505b = i;
            if (i == zz3Var.f36506c) {
                this.f33055a = zz3Var.m13894a();
                c04.m3786a(zz3Var);
            }
        }
    }

    @Override // p000.j40
    /* JADX INFO: renamed from: F */
    public final /* bridge */ /* synthetic */ j40 mo6998F(String str) {
        m12058S(str);
        return this;
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: H */
    public final long mo3021H() throws EOFException {
        int i;
        if (this.f33056b == 0) {
            throw new EOFException();
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            zz3 zz3Var = this.f33055a;
            byte[] bArr = zz3Var.f36504a;
            int i3 = zz3Var.f36505b;
            int i4 = zz3Var.f36506c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        z = true;
                        if (i2 != 0) {
                            break;
                        }
                        char[] cArr = AbstractC0647fd.f18911a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    w30 w30Var = new w30();
                    w30Var.m12055P(j);
                    w30Var.m12054O(b);
                    throw new NumberFormatException("Number too large: ".concat(w30Var.m12047C(w30Var.f33056b, z80.f35863a)));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f33055a = zz3Var.m13894a();
                c04.m3786a(zz3Var);
            } else {
                zz3Var.f36505b = i3;
            }
            if (z) {
                break;
            }
        } while (this.f33055a != null);
        this.f33056b -= (long) i2;
        return j;
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: I */
    public final String mo3022I(Charset charset) {
        return m12047C(this.f33056b, charset);
    }

    /* JADX INFO: renamed from: J */
    public final s50 m12049J(int i) {
        if (i == 0) {
            return s50.f29911d;
        }
        dt0.m4719u(this.f33056b, 0L, i);
        zz3 zz3Var = this.f33055a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = zz3Var.f36506c;
            int i6 = zz3Var.f36505b;
            if (i5 == i6) {
                C1077qn.m9985k("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            zz3Var = zz3Var.f36509f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        zz3 zz3Var2 = this.f33055a;
        int i7 = 0;
        while (i2 < i) {
            bArr[i7] = zz3Var2.f36504a;
            i2 += zz3Var2.f36506c - zz3Var2.f36505b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = zz3Var2.f36505b;
            zz3Var2.f36507d = true;
            i7++;
            zz3Var2 = zz3Var2.f36509f;
        }
        return new d04(bArr, iArr);
    }

    /* JADX INFO: renamed from: K */
    public final zz3 m12050K(int i) {
        if (i < 1 || i > 8192) {
            C1077qn.m9987m("unexpected capacity");
            return null;
        }
        zz3 zz3Var = this.f33055a;
        if (zz3Var == null) {
            zz3 zz3VarM3787b = c04.m3787b();
            this.f33055a = zz3VarM3787b;
            zz3VarM3787b.f36510g = zz3VarM3787b;
            zz3VarM3787b.f36509f = zz3VarM3787b;
            return zz3VarM3787b;
        }
        zz3 zz3Var2 = zz3Var.f36510g;
        if (zz3Var2.f36506c + i <= 8192 && zz3Var2.f36508e) {
            return zz3Var2;
        }
        zz3 zz3VarM3787b2 = c04.m3787b();
        zz3Var2.m13895b(zz3VarM3787b2);
        return zz3VarM3787b2;
    }

    /* JADX INFO: renamed from: L */
    public final void m12051L(int i, byte[] bArr) {
        long j = i;
        dt0.m4719u(bArr.length, 0L, j);
        int i2 = 0;
        while (i2 < i) {
            zz3 zz3VarM12050K = m12050K(1);
            int iMin = Math.min(i - i2, 8192 - zz3VarM12050K.f36506c);
            int i3 = i2 + iMin;
            System.arraycopy(bArr, i2, zz3VarM12050K.f36504a, zz3VarM12050K.f36506c, i3 - i2);
            zz3VarM12050K.f36506c += iMin;
            i2 = i3;
        }
        this.f33056b += j;
    }

    /* JADX INFO: renamed from: M */
    public final void m12052M(s50 s50Var) {
        s50Var.mo4271p(this, s50Var.mo4261b());
    }

    /* JADX INFO: renamed from: N */
    public final void m12053N(ja4 ja4Var) {
        while (ja4Var.mo3038w(this, 8192L) != -1) {
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m12054O(int i) {
        zz3 zz3VarM12050K = m12050K(1);
        byte[] bArr = zz3VarM12050K.f36504a;
        int i2 = zz3VarM12050K.f36506c;
        zz3VarM12050K.f36506c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f33056b++;
    }

    /* JADX INFO: renamed from: P */
    public final void m12055P(long j) {
        if (j == 0) {
            m12054O(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        zz3 zz3VarM12050K = m12050K(i);
        byte[] bArr = zz3VarM12050K.f36504a;
        int i2 = zz3VarM12050K.f36506c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = AbstractC0473b.f14970a[(int) (15 & j)];
            j >>>= 4;
        }
        zz3VarM12050K.f36506c += i;
        this.f33056b += (long) i;
    }

    /* JADX INFO: renamed from: Q */
    public final void m12056Q(int i) {
        zz3 zz3VarM12050K = m12050K(4);
        byte[] bArr = zz3VarM12050K.f36504a;
        int i2 = zz3VarM12050K.f36506c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        zz3VarM12050K.f36506c = i2 + 4;
        this.f33056b += 4;
    }

    /* JADX INFO: renamed from: R */
    public final void m12057R(int i, String str, int i2) {
        char cCharAt;
        if (i < 0) {
            C1077qn.m9988n(c75.m3877i(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            C1077qn.m9988n(zi4.m13618r(i2, i, "endIndex < beginIndex: ", " < "));
            return;
        }
        if (i2 > str.length()) {
            StringBuilder sbM3883o = c75.m3883o("endIndex > string.length: ", i2, " > ");
            sbM3883o.append(str.length());
            throw new IllegalArgumentException(sbM3883o.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                zz3 zz3VarM12050K = m12050K(1);
                byte[] bArr = zz3VarM12050K.f36504a;
                int i3 = zz3VarM12050K.f36506c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = zz3VarM12050K.f36506c;
                int i6 = (i3 + i) - i5;
                zz3VarM12050K.f36506c = i5 + i6;
                this.f33056b += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    zz3 zz3VarM12050K2 = m12050K(2);
                    byte[] bArr2 = zz3VarM12050K2.f36504a;
                    int i7 = zz3VarM12050K2.f36506c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    zz3VarM12050K2.f36506c = i7 + 2;
                    this.f33056b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    zz3 zz3VarM12050K3 = m12050K(3);
                    byte[] bArr3 = zz3VarM12050K3.f36504a;
                    int i8 = zz3VarM12050K3.f36506c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    zz3VarM12050K3.f36506c = i8 + 3;
                    this.f33056b += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m12054O(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        zz3 zz3VarM12050K4 = m12050K(4);
                        byte[] bArr4 = zz3VarM12050K4.f36504a;
                        int i11 = zz3VarM12050K4.f36506c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        zz3VarM12050K4.f36506c = i11 + 4;
                        this.f33056b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m12058S(String str) {
        m12057R(0, str, str.length());
    }

    /* JADX INFO: renamed from: T */
    public final void m12059T(int i) {
        if (i < 128) {
            m12054O(i);
            return;
        }
        if (i < 2048) {
            zz3 zz3VarM12050K = m12050K(2);
            byte[] bArr = zz3VarM12050K.f36504a;
            int i2 = zz3VarM12050K.f36506c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            zz3VarM12050K.f36506c = i2 + 2;
            this.f33056b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            m12054O(63);
            return;
        }
        if (i < 65536) {
            zz3 zz3VarM12050K2 = m12050K(3);
            byte[] bArr2 = zz3VarM12050K2.f36504a;
            int i3 = zz3VarM12050K2.f36506c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            zz3VarM12050K2.f36506c = i3 + 3;
            this.f33056b += 3;
            return;
        }
        if (i > 1114111) {
            C1077qn.m9987m("Unexpected code point: 0x".concat(dt0.m4693V(i)));
            return;
        }
        zz3 zz3VarM12050K3 = m12050K(4);
        byte[] bArr3 = zz3VarM12050K3.f36504a;
        int i4 = zz3VarM12050K3.f36506c;
        bArr3[i4] = (byte) ((i >> 18) | 240);
        bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i4 + 3] = (byte) ((i & 63) | 128);
        zz3VarM12050K3.f36506c = i4 + 4;
        this.f33056b += 4;
    }

    /* JADX INFO: renamed from: a */
    public final long m12060a() {
        long j = this.f33056b;
        if (j == 0) {
            return 0L;
        }
        zz3 zz3Var = this.f33055a.f36510g;
        int i = zz3Var.f36506c;
        return (i >= 8192 || !zz3Var.f36508e) ? j : j - ((long) (i - zz3Var.f36505b));
    }

    /* JADX INFO: renamed from: b */
    public final void m12061b(w30 w30Var, long j, long j2) {
        long j3 = j;
        dt0.m4719u(this.f33056b, j3, j2);
        if (j2 == 0) {
            return;
        }
        w30Var.f33056b += j2;
        zz3 zz3Var = this.f33055a;
        while (true) {
            long j4 = zz3Var.f36506c - zz3Var.f36505b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            zz3Var = zz3Var.f36509f;
        }
        long j5 = j2;
        while (j5 > 0) {
            zz3 zz3VarM13896c = zz3Var.m13896c();
            int i = zz3VarM13896c.f36505b + ((int) j3);
            zz3VarM13896c.f36505b = i;
            zz3VarM13896c.f36506c = Math.min(i + ((int) j5), zz3VarM13896c.f36506c);
            zz3 zz3Var2 = w30Var.f33055a;
            if (zz3Var2 == null) {
                zz3VarM13896c.f36510g = zz3VarM13896c;
                zz3VarM13896c.f36509f = zz3VarM13896c;
                w30Var.f33055a = zz3VarM13896c;
            } else {
                zz3Var2.f36510g.m13895b(zz3VarM13896c);
            }
            j5 -= (long) (zz3VarM13896c.f36506c - zz3VarM13896c.f36505b);
            zz3Var = zz3Var.f36509f;
            j3 = 0;
        }
    }

    @Override // p000.ja4
    /* JADX INFO: renamed from: c */
    public final ym4 mo3025c() {
        return ym4.f35333d;
    }

    public final Object clone() {
        w30 w30Var = new w30();
        if (this.f33056b == 0) {
            return w30Var;
        }
        zz3 zz3Var = this.f33055a;
        zz3 zz3VarM13896c = zz3Var.m13896c();
        w30Var.f33055a = zz3VarM13896c;
        zz3VarM13896c.f36510g = zz3VarM13896c;
        zz3VarM13896c.f36509f = zz3VarM13896c;
        for (zz3 zz3Var2 = zz3Var.f36509f; zz3Var2 != zz3Var; zz3Var2 = zz3Var2.f36509f) {
            zz3VarM13896c.f36510g.m13895b(zz3Var2.m13896c());
        }
        w30Var.f33056b = this.f33056b;
        return w30Var;
    }

    @Override // p000.f74
    /* JADX INFO: renamed from: d */
    public final void mo3368d(w30 w30Var, long j) {
        zz3 zz3VarM3787b;
        if (w30Var == this) {
            C1077qn.m9987m("source == this");
            return;
        }
        dt0.m4719u(w30Var.f33056b, 0L, j);
        while (j > 0) {
            zz3 zz3Var = w30Var.f33055a;
            int i = zz3Var.f36506c - zz3Var.f36505b;
            if (j < i) {
                zz3 zz3Var2 = this.f33055a;
                zz3 zz3Var3 = zz3Var2 != null ? zz3Var2.f36510g : null;
                if (zz3Var3 != null && zz3Var3.f36508e) {
                    if ((((long) zz3Var3.f36506c) + j) - ((long) (zz3Var3.f36507d ? 0 : zz3Var3.f36505b)) <= 8192) {
                        zz3Var.m13897d(zz3Var3, (int) j);
                        w30Var.f33056b -= j;
                        this.f33056b += j;
                        return;
                    }
                }
                int i2 = (int) j;
                if (i2 <= 0 || i2 > i) {
                    C1077qn.m9987m("byteCount out of range");
                    return;
                }
                if (i2 >= 1024) {
                    zz3VarM3787b = zz3Var.m13896c();
                } else {
                    zz3VarM3787b = c04.m3787b();
                    byte[] bArr = zz3Var.f36504a;
                    byte[] bArr2 = zz3VarM3787b.f36504a;
                    int i3 = zz3Var.f36505b;
                    AbstractC0990oo.m9202W(bArr, bArr2, i3, i3 + i2);
                }
                zz3VarM3787b.f36506c = zz3VarM3787b.f36505b + i2;
                zz3Var.f36505b += i2;
                zz3Var.f36510g.m13895b(zz3VarM3787b);
                w30Var.f33055a = zz3VarM3787b;
                zz3Var = zz3VarM3787b;
            }
            long j2 = zz3Var.f36506c - zz3Var.f36505b;
            w30Var.f33055a = zz3Var.m13894a();
            zz3 zz3Var4 = this.f33055a;
            if (zz3Var4 == null) {
                this.f33055a = zz3Var;
                zz3Var.f36510g = zz3Var;
                zz3Var.f36509f = zz3Var;
            } else {
                zz3Var4.f36510g.m13895b(zz3Var);
                zz3 zz3Var5 = zz3Var.f36510g;
                if (zz3Var5 == zz3Var) {
                    C1077qn.m9989o("cannot compact");
                    return;
                } else if (zz3Var5.f36508e) {
                    int i4 = zz3Var.f36506c - zz3Var.f36505b;
                    if (i4 <= (8192 - zz3Var5.f36506c) + (zz3Var5.f36507d ? 0 : zz3Var5.f36505b)) {
                        zz3Var.m13897d(zz3Var5, i4);
                        zz3Var.m13894a();
                        c04.m3786a(zz3Var);
                    }
                }
            }
            w30Var.f33056b -= j2;
            this.f33056b += j2;
            j -= j2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12062e() {
        return this.f33056b == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w30)) {
            return false;
        }
        long j = this.f33056b;
        w30 w30Var = (w30) obj;
        if (j != w30Var.f33056b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        zz3 zz3Var = this.f33055a;
        zz3 zz3Var2 = w30Var.f33055a;
        int i = zz3Var.f36505b;
        int i2 = zz3Var2.f36505b;
        long j2 = 0;
        while (j2 < this.f33056b) {
            long jMin = Math.min(zz3Var.f36506c - i, zz3Var2.f36506c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (zz3Var.f36504a[i] != zz3Var2.f36504a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == zz3Var.f36506c) {
                zz3Var = zz3Var.f36509f;
                i = zz3Var.f36505b;
            }
            if (i2 == zz3Var2.f36506c) {
                zz3Var2 = zz3Var2.f36509f;
                i2 = zz3Var2.f36505b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // p000.j40
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ j40 mo6999f(long j) {
        m12055P(j);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final byte m12063g(long j) {
        dt0.m4719u(this.f33056b, j, 1L);
        zz3 zz3Var = this.f33055a;
        zz3Var.getClass();
        long j2 = this.f33056b;
        if (j2 - j < j) {
            while (j2 > j) {
                zz3Var = zz3Var.f36510g;
                j2 -= (long) (zz3Var.f36506c - zz3Var.f36505b);
            }
            return zz3Var.f36504a[(int) ((((long) zz3Var.f36505b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = zz3Var.f36506c;
            int i2 = zz3Var.f36505b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return zz3Var.f36504a[(int) ((((long) i2) + j) - j3)];
            }
            zz3Var = zz3Var.f36509f;
            j3 = j4;
        }
    }

    public final int hashCode() {
        zz3 zz3Var = this.f33055a;
        if (zz3Var == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = zz3Var.f36506c;
            for (int i3 = zz3Var.f36505b; i3 < i2; i3++) {
                i = (i * 31) + zz3Var.f36504a[i3];
            }
            zz3Var = zz3Var.f36509f;
        } while (zz3Var != this.f33055a);
        return i;
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: i */
    public final boolean mo3028i(long j) {
        return this.f33056b >= j;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final long m12064j(byte b, long j, long j2) {
        zz3 zz3Var;
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + this.f33056b + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        long j4 = this.f33056b;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (zz3Var = this.f33055a) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                zz3Var = zz3Var.f36510g;
                j4 -= (long) (zz3Var.f36506c - zz3Var.f36505b);
            }
            while (j4 < j2) {
                byte[] bArr = zz3Var.f36504a;
                int iMin = (int) Math.min(zz3Var.f36506c, (((long) zz3Var.f36505b) + j2) - j4);
                for (int i = (int) ((((long) zz3Var.f36505b) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - zz3Var.f36505b)) + j4;
                    }
                }
                j4 += (long) (zz3Var.f36506c - zz3Var.f36505b);
                zz3Var = zz3Var.f36509f;
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (zz3Var.f36506c - zz3Var.f36505b)) + j3;
            if (j5 > j) {
                break;
            }
            zz3Var = zz3Var.f36509f;
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = zz3Var.f36504a;
            int iMin2 = (int) Math.min(zz3Var.f36506c, (((long) zz3Var.f36505b) + j2) - j3);
            for (int i2 = (int) ((((long) zz3Var.f36505b) + j) - j3); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - zz3Var.f36505b)) + j3;
                }
            }
            j3 += (long) (zz3Var.f36506c - zz3Var.f36505b);
            zz3Var = zz3Var.f36509f;
            j = j3;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: k */
    public final long m12065k(s50 s50Var) {
        int i;
        int i2;
        zz3 zz3Var = this.f33055a;
        if (zz3Var == null) {
            return -1L;
        }
        long j = this.f33056b;
        long j2 = 0;
        if (j < 0) {
            while (j > 0) {
                zz3Var = zz3Var.f36510g;
                j -= (long) (zz3Var.f36506c - zz3Var.f36505b);
            }
            if (s50Var.mo4261b() == 2) {
                byte bMo4265g = s50Var.mo4265g(0);
                byte bMo4265g2 = s50Var.mo4265g(1);
                while (j < this.f33056b) {
                    byte[] bArr = zz3Var.f36504a;
                    i = (int) ((((long) zz3Var.f36505b) + j2) - j);
                    int i3 = zz3Var.f36506c;
                    while (true) {
                        if (i >= i3) {
                            j2 = ((long) (zz3Var.f36506c - zz3Var.f36505b)) + j;
                            zz3Var = zz3Var.f36509f;
                            j = j2;
                        } else {
                            byte b = bArr[i];
                            if (b == bMo4265g || b == bMo4265g2) {
                                i2 = zz3Var.f36505b;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                return -1L;
            }
            byte[] bArrMo4264f = s50Var.mo4264f();
            while (j < this.f33056b) {
                byte[] bArr2 = zz3Var.f36504a;
                i = (int) ((((long) zz3Var.f36505b) + j2) - j);
                int i4 = zz3Var.f36506c;
                while (true) {
                    if (i < i4) {
                        byte b2 = bArr2[i];
                        int length = bArrMo4264f.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                i++;
                            } else if (b2 == bArrMo4264f[i5]) {
                                i2 = zz3Var.f36505b;
                            } else {
                                i5++;
                            }
                        }
                    } else {
                        j2 = ((long) (zz3Var.f36506c - zz3Var.f36505b)) + j;
                        zz3Var = zz3Var.f36509f;
                        j = j2;
                    }
                }
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j3 = ((long) (zz3Var.f36506c - zz3Var.f36505b)) + j;
            if (j3 > 0) {
                break;
            }
            zz3Var = zz3Var.f36509f;
            j = j3;
        }
        if (s50Var.mo4261b() == 2) {
            byte bMo4265g3 = s50Var.mo4265g(0);
            byte bMo4265g4 = s50Var.mo4265g(1);
            while (j < this.f33056b) {
                byte[] bArr3 = zz3Var.f36504a;
                i = (int) ((((long) zz3Var.f36505b) + j2) - j);
                int i6 = zz3Var.f36506c;
                while (true) {
                    if (i >= i6) {
                        j2 = ((long) (zz3Var.f36506c - zz3Var.f36505b)) + j;
                        zz3Var = zz3Var.f36509f;
                        j = j2;
                    } else {
                        byte b3 = bArr3[i];
                        if (b3 == bMo4265g3 || b3 == bMo4265g4) {
                            i2 = zz3Var.f36505b;
                        } else {
                            i++;
                        }
                    }
                }
            }
            return -1L;
        }
        byte[] bArrMo4264f2 = s50Var.mo4264f();
        while (j < this.f33056b) {
            byte[] bArr4 = zz3Var.f36504a;
            i = (int) ((((long) zz3Var.f36505b) + j2) - j);
            int i7 = zz3Var.f36506c;
            while (true) {
                if (i < i7) {
                    byte b4 = bArr4[i];
                    int length2 = bArrMo4264f2.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length2) {
                            i++;
                        } else if (b4 == bArrMo4264f2[i8]) {
                            i2 = zz3Var.f36505b;
                        } else {
                            i8++;
                        }
                    }
                } else {
                    j2 = ((long) (zz3Var.f36506c - zz3Var.f36505b)) + j;
                    zz3Var = zz3Var.f36509f;
                    j = j2;
                }
            }
        }
        return -1L;
        return ((long) (i - i2)) + j;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m12066l(s50 s50Var) {
        zz3 zz3Var;
        boolean z;
        long j;
        long j2;
        long j3;
        int iMo4261b = s50Var.mo4261b();
        if (iMo4261b >= 0) {
            long j4 = iMo4261b;
            if (j4 <= this.f33056b && iMo4261b <= s50Var.mo4261b()) {
                if (iMo4261b != 0) {
                    byte[] bArr = AbstractC0473b.f14970a;
                    dt0.m4719u(s50Var.mo4261b(), 0L, j4);
                    if (iMo4261b <= 0) {
                        C1077qn.m9987m("byteCount == 0");
                        return false;
                    }
                    long j5 = this.f33056b;
                    long j6 = 1;
                    long j7 = 1 > j5 ? j5 : 1L;
                    if (0 == j7 || (zz3Var = this.f33055a) == null) {
                        j3 = -1;
                        z = false;
                    } else if (j5 < 0) {
                        while (j5 > 0) {
                            zz3Var = zz3Var.f36510g;
                            j5 -= (long) (zz3Var.f36506c - zz3Var.f36505b);
                            j6 = j6;
                        }
                        long j8 = j6;
                        z = false;
                        byte[] bArrMo4264f = s50Var.mo4264f();
                        byte b = bArrMo4264f[0];
                        long jMin = Math.min(j7, (this.f33056b - j4) + j8);
                        long j9 = 0;
                        while (true) {
                            if (j5 < jMin) {
                                byte[] bArr2 = zz3Var.f36504a;
                                j = j5;
                                int iMin = (int) Math.min(zz3Var.f36506c, (((long) zz3Var.f36505b) + jMin) - j5);
                                int i = (int) ((((long) zz3Var.f36505b) + j9) - j);
                                while (true) {
                                    if (i >= iMin) {
                                        j9 = j + ((long) (zz3Var.f36506c - zz3Var.f36505b));
                                        zz3Var = zz3Var.f36509f;
                                        j5 = j9;
                                    } else if (bArr2[i] == b && AbstractC0473b.m3377a(zz3Var, i + 1, bArrMo4264f, 1, iMo4261b)) {
                                        j2 = i - zz3Var.f36505b;
                                        j3 = j2 + j;
                                    } else {
                                        i++;
                                    }
                                }
                            } else {
                                j3 = -1;
                            }
                        }
                    } else {
                        z = false;
                        long j10 = 0;
                        while (true) {
                            long j11 = ((long) (zz3Var.f36506c - zz3Var.f36505b)) + j10;
                            if (j11 > 0) {
                                break;
                            }
                            zz3Var = zz3Var.f36509f;
                            j10 = j11;
                        }
                        byte[] bArrMo4264f2 = s50Var.mo4264f();
                        byte b2 = bArrMo4264f2[0];
                        long jMin2 = Math.min(j7, (this.f33056b - j4) + 1);
                        long j12 = 0;
                        while (true) {
                            if (j10 < jMin2) {
                                byte[] bArr3 = zz3Var.f36504a;
                                j = j10;
                                int iMin2 = (int) Math.min(zz3Var.f36506c, (((long) zz3Var.f36505b) + jMin2) - j10);
                                int i2 = (int) ((((long) zz3Var.f36505b) + j12) - j);
                                while (true) {
                                    if (i2 >= iMin2) {
                                        j12 = j + ((long) (zz3Var.f36506c - zz3Var.f36505b));
                                        zz3Var = zz3Var.f36509f;
                                        j10 = j12;
                                    } else if (bArr3[i2] == b2 && AbstractC0473b.m3377a(zz3Var, i2 + 1, bArrMo4264f2, 1, iMo4261b)) {
                                        j2 = i2 - zz3Var.f36505b;
                                        j3 = j2 + j;
                                    } else {
                                        i2++;
                                    }
                                }
                            } else {
                                j3 = -1;
                            }
                        }
                    }
                    if (j3 == -1) {
                        return z;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: n */
    public final String mo3032n() {
        return mo3040y(Long.MAX_VALUE);
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: p */
    public final byte[] mo3033p() {
        return m12068t(this.f33056b);
    }

    /* JADX INFO: renamed from: q */
    public final byte m12067q() throws EOFException {
        long j = this.f33056b;
        if (j == 0) {
            throw new EOFException();
        }
        zz3 zz3Var = this.f33055a;
        int i = zz3Var.f36505b;
        int i2 = zz3Var.f36506c;
        int i3 = i + 1;
        byte b = zz3Var.f36504a[i];
        this.f33056b = j - 1;
        if (i3 != i2) {
            zz3Var.f36505b = i3;
            return b;
        }
        this.f33055a = zz3Var.m13894a();
        c04.m3786a(zz3Var);
        return b;
    }

    public final int read(byte[] bArr, int i, int i2) {
        dt0.m4719u(bArr.length, i, i2);
        zz3 zz3Var = this.f33055a;
        if (zz3Var == null) {
            return -1;
        }
        int iMin = Math.min(i2, zz3Var.f36506c - zz3Var.f36505b);
        byte[] bArr2 = zz3Var.f36504a;
        int i3 = zz3Var.f36505b;
        System.arraycopy(bArr2, i3, bArr, i, (i3 + iMin) - i3);
        int i4 = zz3Var.f36505b + iMin;
        zz3Var.f36505b = i4;
        this.f33056b -= (long) iMin;
        if (i4 == zz3Var.f36506c) {
            this.f33055a = zz3Var.m13894a();
            c04.m3786a(zz3Var);
        }
        return iMin;
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: s */
    public final int mo3036s(a63 a63Var) throws EOFException {
        int iM3379c = AbstractC0473b.m3379c(this, a63Var, false);
        if (iM3379c == -1) {
            return -1;
        }
        m12048D(a63Var.f141a[iM3379c].mo4261b());
        return iM3379c;
    }

    /* JADX INFO: renamed from: t */
    public final byte[] m12068t(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C1077qn.m9988n(zi4.m13619s("byteCount: ", j));
            return null;
        }
        if (this.f33056b < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        return bArr;
    }

    public final String toString() {
        long j = this.f33056b;
        if (j <= 2147483647L) {
            return m12049J((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f33056b).toString());
    }

    /* JADX INFO: renamed from: u */
    public final s50 m12069u(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            C1077qn.m9988n(zi4.m13619s("byteCount: ", j));
            return null;
        }
        if (this.f33056b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new s50(m12068t(j));
        }
        s50 s50VarM12049J = m12049J((int) j);
        m12048D(j);
        return s50VarM12049J;
    }

    /* JADX INFO: renamed from: v */
    public final int m12070v() throws EOFException {
        long j = this.f33056b;
        if (j < 4) {
            throw new EOFException();
        }
        zz3 zz3Var = this.f33055a;
        int i = zz3Var.f36505b;
        int i2 = zz3Var.f36506c;
        if (i2 - i < 4) {
            return (m12067q() & 255) | ((m12067q() & 255) << 24) | ((m12067q() & 255) << 16) | ((m12067q() & 255) << 8);
        }
        byte[] bArr = zz3Var.f36504a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.f33056b = j - 4;
        if (i5 != i2) {
            zz3Var.f36505b = i5;
            return i6;
        }
        this.f33055a = zz3Var.m13894a();
        c04.m3786a(zz3Var);
        return i6;
    }

    @Override // p000.ja4
    /* JADX INFO: renamed from: w */
    public final long mo3038w(w30 w30Var, long j) {
        if (j < 0) {
            C1077qn.m9988n(zi4.m13619s("byteCount < 0: ", j));
            return 0L;
        }
        long j2 = this.f33056b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        w30Var.mo3368d(this, j);
        return j;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            zz3 zz3VarM12050K = m12050K(1);
            int iMin = Math.min(i, 8192 - zz3VarM12050K.f36506c);
            byteBuffer.get(zz3VarM12050K.f36504a, zz3VarM12050K.f36506c, iMin);
            i -= iMin;
            zz3VarM12050K.f36506c += iMin;
        }
        this.f33056b += (long) iRemaining;
        return iRemaining;
    }

    @Override // p000.j40
    public final /* bridge */ /* synthetic */ j40 writeByte(int i) {
        m12054O(i);
        return this;
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: x */
    public final long mo3039x(yj3 yj3Var) {
        long j = this.f33056b;
        if (j > 0) {
            yj3Var.mo3368d(this, j);
        }
        return j;
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: y */
    public final String mo3040y(long j) throws EOFException {
        if (j < 0) {
            C1077qn.m9988n(zi4.m13619s("limit < 0: ", j));
            return null;
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jM12064j = m12064j((byte) 10, 0L, j2);
        if (jM12064j != -1) {
            return AbstractC0473b.m3378b(this, jM12064j);
        }
        if (j2 < this.f33056b && m12063g(j2 - 1) == 13 && m12063g(j2) == 10) {
            return AbstractC0473b.m3378b(this, j2);
        }
        w30 w30Var = new w30();
        m12061b(w30Var, 0L, Math.min(32L, this.f33056b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f33056b, j) + " content=" + w30Var.m12069u(w30Var.f33056b).mo4262c() + (char) 8230);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        zz3 zz3Var = this.f33055a;
        if (zz3Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), zz3Var.f36506c - zz3Var.f36505b);
        byteBuffer.put(zz3Var.f36504a, zz3Var.f36505b, iMin);
        int i = zz3Var.f36505b + iMin;
        zz3Var.f36505b = i;
        this.f33056b -= (long) iMin;
        if (i == zz3Var.f36506c) {
            this.f33055a = zz3Var.m13894a();
            c04.m3786a(zz3Var);
        }
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p000.f74
    public final void close() {
    }

    @Override // p000.j40, p000.f74, java.io.Flushable
    public final void flush() {
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: r */
    public final w30 mo3035r() {
        return this;
    }
}
