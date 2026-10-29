package p000;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ua0 extends wa0 {

    /* JADX INFO: renamed from: d */
    public byte[] f31744d;

    /* JADX INFO: renamed from: e */
    public int f31745e;

    /* JADX INFO: renamed from: f */
    public int f31746f;

    /* JADX INFO: renamed from: g */
    public int f31747g;

    /* JADX INFO: renamed from: h */
    public int f31748h;

    /* JADX INFO: renamed from: i */
    public int f31749i;

    /* JADX INFO: renamed from: j */
    public int f31750j;

    /* JADX INFO: renamed from: Z */
    public final int m11308Z() throws i72 {
        int i = this.f31747g;
        if (this.f31746f - i < 4) {
            throw i72.m6687e();
        }
        byte[] bArr = this.f31744d;
        this.f31747g = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: a */
    public final void mo11309a(int i) throws i72 {
        if (this.f31749i != i) {
            throw new i72("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final long m11310a0() throws i72 {
        int i = this.f31747g;
        if (this.f31746f - i < 8) {
            throw i72.m6687e();
        }
        byte[] bArr = this.f31744d;
        this.f31747g = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: b */
    public final int mo11311b() {
        return this.f31747g - this.f31748h;
    }

    /* JADX INFO: renamed from: b0 */
    public final int m11312b0() {
        return m11316d0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: c */
    public final boolean mo11313c() {
        return this.f31747g == this.f31746f;
    }

    /* JADX INFO: renamed from: c0 */
    public final int m11314c0() {
        return m11316d0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: d */
    public final void mo11315d(int i) {
        this.f31750j = i;
        int i2 = this.f31745e;
        if (i <= i2) {
            this.f31746f = i;
        } else {
            this.f31746f = i2;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final int m11316d0() {
        int i;
        int i2 = this.f31747g;
        int i3 = this.f31746f;
        if (i3 != i2) {
            byte[] bArr = this.f31744d;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f31747g = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.f31747g = i5;
                return i;
            }
        }
        return (int) m11320f0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: e */
    public final int mo11317e(int i) {
        if (i < 0) {
            throw i72.m6686d();
        }
        int i2 = this.f31747g;
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
            if (i > Integer.MAX_VALUE - (i2 - this.f31748h)) {
                throw new i72("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
        }
        int i4 = this.f31750j;
        if (i3 > i4) {
            throw i72.m6687e();
        }
        this.f31750j = i3;
        int i5 = this.f31745e;
        if (i3 <= i5) {
            this.f31746f = i3;
            return i4;
        }
        this.f31746f = i5;
        return i4;
    }

    /* JADX INFO: renamed from: e0 */
    public final long m11318e0() {
        long j;
        long j2;
        long j3;
        int i = this.f31747g;
        int i2 = this.f31746f;
        if (i2 != i) {
            byte[] bArr = this.f31744d;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f31747g = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i10]) << 42);
                                    if (j6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            j6 = j7 ^ (((long) bArr[i10]) << 56);
                                            if (j6 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                int i11 = i + 10;
                                                long j8 = (((long) bArr[i4]) << 63) ^ j6;
                                                if (j8 >= 0) {
                                                    j = j8 ^ (-9151873028817141888L);
                                                    i4 = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j7 ^ j3;
                                i4 = i10;
                            }
                            j = j6 ^ j2;
                        }
                    }
                }
                this.f31747g = i4;
                return j;
            }
        }
        return m11320f0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: f */
    public final boolean mo11319f() {
        return m11318e0() != 0;
    }

    /* JADX INFO: renamed from: f0 */
    public final long m11320f0() throws i72 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f31747g;
            if (i2 == this.f31746f) {
                throw i72.m6687e();
            }
            byte[] bArr = this.f31744d;
            this.f31747g = i2 + 1;
            byte b = bArr[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw i72.m6685c();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    @Override // p000.wa0
    /* JADX INFO: renamed from: g */
    public final p50 mo11321g() throws i72 {
        byte[] bArrCopyOfRange;
        byte[] bArr = this.f31744d;
        int iM11314c0 = m11314c0();
        if (iM11314c0 > 0) {
            int i = this.f31746f;
            int i2 = this.f31747g;
            if (iM11314c0 <= i - i2) {
                p50 p50VarM8525b = n50.m8525b(bArr, i2, iM11314c0);
                this.f31747g += iM11314c0;
                return p50VarM8525b;
            }
        }
        if (iM11314c0 == 0) {
            return n50.f25466b;
        }
        if (iM11314c0 > 0) {
            int i3 = this.f31746f;
            int i4 = this.f31747g;
            if (iM11314c0 <= i3 - i4) {
                int i5 = iM11314c0 + i4;
                this.f31747g = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iM11314c0 <= 0) {
                    throw i72.m6687e();
                }
                if (iM11314c0 == 0) {
                    throw i72.m6686d();
                }
                bArrCopyOfRange = l62.f23817a;
            }
        } else {
            if (iM11314c0 <= 0) {
                throw i72.m6687e();
            }
            if (iM11314c0 == 0) {
                throw i72.m6686d();
            }
            bArrCopyOfRange = l62.f23817a;
        }
        p50 p50Var = n50.f25466b;
        return bArrCopyOfRange.length == 0 ? n50.f25466b : new p50(bArrCopyOfRange);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m11322g0(int i) throws i72 {
        if (i >= 0) {
            int i2 = this.f31746f;
            int i3 = this.f31747g;
            if (i <= i2 - i3) {
                this.f31747g = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw i72.m6687e();
        }
        throw i72.m6686d();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: h */
    public final double mo11323h() {
        return Double.longBitsToDouble(m11310a0());
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: i */
    public final int mo11324i() {
        return m11312b0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: j */
    public final int mo11325j() {
        return m11308Z();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: k */
    public final long mo11326k() {
        return m11310a0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: l */
    public final float mo11327l() {
        return Float.intBitsToFloat(m11308Z());
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: m */
    public final int mo11328m() {
        return m11312b0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: n */
    public final long mo11329n() {
        return m11318e0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: o */
    public final int mo11330o() {
        return m11308Z();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: p */
    public final long mo11331p() {
        return m11310a0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: q */
    public final int mo11332q() {
        int iM11314c0 = m11314c0();
        return (-(iM11314c0 & 1)) ^ (iM11314c0 >>> 1);
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: r */
    public final long mo11333r() {
        long jM11318e0 = m11318e0();
        return (-(jM11318e0 & 1)) ^ (jM11318e0 >>> 1);
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: s */
    public final String mo11334s() throws i72 {
        int iM11314c0 = m11314c0();
        if (iM11314c0 > 0) {
            int i = this.f31746f;
            int i2 = this.f31747g;
            if (iM11314c0 <= i - i2) {
                String str = new String(this.f31744d, i2, iM11314c0, StandardCharsets.UTF_8);
                this.f31747g += iM11314c0;
                return str;
            }
        }
        if (iM11314c0 == 0) {
            return "";
        }
        if (iM11314c0 < 0) {
            throw i72.m6686d();
        }
        throw i72.m6687e();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: t */
    public final String mo11335t() throws i72 {
        int iM11314c0 = m11314c0();
        String strMo7747H = "";
        if (iM11314c0 > 0) {
            int i = this.f31746f;
            int i2 = this.f31747g;
            if (iM11314c0 <= i - i2) {
                byte[] bArr = this.f31744d;
                if (iM11314c0 == 0) {
                    kx5 kx5Var = wv4.f33788a;
                } else {
                    strMo7747H = wv4.f33788a.mo7747H(bArr, i2, iM11314c0);
                }
                this.f31747g += iM11314c0;
                return strMo7747H;
            }
        }
        if (iM11314c0 == 0) {
            return "";
        }
        if (iM11314c0 <= 0) {
            throw i72.m6686d();
        }
        throw i72.m6687e();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: u */
    public final int mo11336u() throws i72 {
        if (mo11313c()) {
            this.f31749i = 0;
            return 0;
        }
        int iM11314c0 = m11314c0();
        this.f31749i = iM11314c0;
        if ((iM11314c0 >>> 3) != 0) {
            return iM11314c0;
        }
        throw new i72("Protocol message contained an invalid tag (zero).");
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: v */
    public final int mo11337v() {
        return m11314c0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: w */
    public final long mo11338w() {
        return m11318e0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: x */
    public final boolean mo11339x(int i) throws i72 {
        byte[] bArr = this.f31744d;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f31746f - this.f31747g >= 10) {
                while (i3 < 10) {
                    int i4 = this.f31747g;
                    this.f31747g = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw i72.m6685c();
            }
            while (i3 < 10) {
                int i5 = this.f31747g;
                if (i5 == this.f31746f) {
                    throw i72.m6687e();
                }
                this.f31747g = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw i72.m6685c();
            return true;
        }
        if (i2 == 1) {
            m11322g0(8);
            return true;
        }
        if (i2 == 2) {
            m11322g0(m11314c0());
            return true;
        }
        if (i2 == 3) {
            m12174y();
            mo11309a(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            if (this.f33188b == 0) {
                mo11309a(0);
            }
            return false;
        }
        if (i2 != 5) {
            throw i72.m6684b();
        }
        m11322g0(4);
        return true;
    }
}
