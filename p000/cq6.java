package p000;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cq6 extends wa0 {

    /* JADX INFO: renamed from: d */
    public byte[] f16379d;

    /* JADX INFO: renamed from: e */
    public int f16380e;

    /* JADX INFO: renamed from: f */
    public int f16381f;

    /* JADX INFO: renamed from: g */
    public int f16382g;

    /* JADX INFO: renamed from: h */
    public int f16383h;

    /* JADX INFO: renamed from: i */
    public int f16384i;

    @Override // p000.wa0
    /* JADX INFO: renamed from: A */
    public final void mo4112A(int i) throws ss5 {
        if (this.f16383h == i) {
            return;
        }
        qm5.m9916g("Protocol message end-group tag did not match expected tag.");
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: B */
    public final void mo4113B(int i) {
        this.f16384i = i;
        int i2 = this.f16380e;
        if (i > i2) {
            i = i2;
        }
        this.f16381f = i;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: C */
    public final boolean mo4114C() {
        return this.f16382g == this.f16381f;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: D */
    public final boolean mo4115D() {
        return m4139d0() != 0;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: E */
    public final boolean mo4116E(int i) throws ss5 {
        byte[] bArr = this.f16379d;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                m4135Z(8);
                return true;
            }
            if (i2 == 2) {
                m4135Z(m4137b0());
                return true;
            }
            if (i2 == 3) {
                m12173G();
                mo4112A(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.f33188b == 0) {
                    mo4112A(0);
                }
                return false;
            }
            if (i2 == 5) {
                m4135Z(4);
                return true;
            }
            qm5.m9910a();
            return false;
        }
        if (this.f16381f - this.f16382g >= 10) {
            while (i3 < 10) {
                int i4 = this.f16382g;
                this.f16382g = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            qm5.m9916g("CodedInputStream encountered a malformed varint.");
            return false;
        }
        while (i3 < 10) {
            int i5 = this.f16382g;
            if (i5 == this.f16381f) {
                qm5.m9916g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return false;
            }
            this.f16382g = i5 + 1;
            if (bArr[i5] < 0) {
                i3++;
            }
        }
        qm5.m9916g("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: H */
    public final double mo4117H() {
        return Double.longBitsToDouble(m4138c0());
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: I */
    public final float mo4118I() {
        return Float.intBitsToFloat(m4136a0());
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: J */
    public final int mo4119J() {
        return this.f16382g;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: K */
    public final int mo4120K(int i) {
        if (i < 0) {
            qm5.m9916g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = this.f16382g;
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
            if (i > Integer.MAX_VALUE - i2) {
                qm5.m9916g("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
                return 0;
            }
        }
        int i4 = this.f16384i;
        if (i3 > i4) {
            qm5.m9916g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.f16384i = i3;
        int i5 = this.f16380e;
        if (i3 > i5) {
            i3 = i5;
        }
        this.f16381f = i3;
        return i4;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: L */
    public final int mo4121L() {
        return m4137b0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: M */
    public final int mo4122M() {
        return m4136a0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: N */
    public final int mo4123N() {
        return m4137b0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: O */
    public final int mo4124O() {
        return m4136a0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: P */
    public final int mo4125P() {
        int iM4137b0 = m4137b0();
        return (-(iM4137b0 & 1)) ^ (iM4137b0 >>> 1);
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: Q */
    public final int mo4126Q() throws ss5 {
        if (mo4114C()) {
            this.f16383h = 0;
            return 0;
        }
        int iM4137b0 = m4137b0();
        this.f16383h = iM4137b0;
        if ((iM4137b0 >>> 3) != 0) {
            return iM4137b0;
        }
        qm5.m9916g("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: R */
    public final int mo4127R() {
        return m4137b0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: S */
    public final long mo4128S() {
        return m4138c0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: T */
    public final long mo4129T() {
        return m4139d0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: U */
    public final long mo4130U() {
        return m4138c0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: V */
    public final long mo4131V() {
        long jM4139d0 = m4139d0();
        return (-(jM4139d0 & 1)) ^ (jM4139d0 >>> 1);
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: W */
    public final long mo4132W() {
        return m4139d0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: X */
    public final String mo4133X() throws ss5 {
        int iM4137b0 = m4137b0();
        if (iM4137b0 > 0) {
            int i = this.f16381f;
            int i2 = this.f16382g;
            if (iM4137b0 <= i - i2) {
                String str = new String(this.f16379d, i2, iM4137b0, StandardCharsets.UTF_8);
                this.f16382g += iM4137b0;
                return str;
            }
        }
        if (iM4137b0 == 0) {
            return "";
        }
        if (iM4137b0 < 0) {
            qm5.m9916g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        qm5.m9916g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: Y */
    public final String mo4134Y() throws ss5 {
        int iM4137b0 = m4137b0();
        if (iM4137b0 > 0) {
            int i = this.f16381f;
            int i2 = this.f16382g;
            if (iM4137b0 <= i - i2) {
                String strM7342c = jy5.m7342c(this.f16379d, i2, iM4137b0);
                this.f16382g += iM4137b0;
                return strM7342c;
            }
        }
        if (iM4137b0 == 0) {
            return "";
        }
        if (iM4137b0 <= 0) {
            qm5.m9916g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        qm5.m9916g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    /* JADX INFO: renamed from: Z */
    public final void m4135Z(int i) throws ss5 {
        if (i >= 0) {
            int i2 = this.f16381f;
            int i3 = this.f16382g;
            if (i <= i2 - i3) {
                this.f16382g = i3 + i;
                return;
            }
        }
        if (i < 0) {
            qm5.m9916g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            qm5.m9916g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final int m4136a0() throws ss5 {
        int i = this.f16382g;
        if (this.f16381f - i < 4) {
            qm5.m9916g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        byte[] bArr = this.f16379d;
        this.f16382g = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: renamed from: b0 */
    public final int m4137b0() {
        int i;
        int i2 = this.f16382g;
        int i3 = this.f16381f;
        if (i3 != i2) {
            byte[] bArr = this.f16379d;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f16382g = i4;
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
                this.f16382g = i5;
                return i;
            }
        }
        return (int) m4140e0();
    }

    /* JADX INFO: renamed from: c0 */
    public final long m4138c0() throws ss5 {
        int i = this.f16382g;
        if (this.f16381f - i < 8) {
            qm5.m9916g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0L;
        }
        byte[] bArr = this.f16379d;
        this.f16382g = i + 8;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        return ((((long) bArr[i + 6]) & 255) << 48) | (j & 255) | j2 | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: d0 */
    public final long m4139d0() {
        long j;
        long j2;
        long j3;
        int i = this.f16382g;
        int i2 = this.f16381f;
        if (i2 != i) {
            byte[] bArr = this.f16379d;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f16382g = i3;
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
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            i6 = i + 5;
                            long j5 = (((long) bArr[i8]) << 28) ^ ((long) i9);
                            if (j5 >= 0) {
                                j = j5 ^ 266354560;
                            } else {
                                i4 = i + 6;
                                long j6 = (((long) bArr[i6]) << 35) ^ j5;
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    int i10 = i + 7;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 42);
                                    if (j7 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j6 = j7 ^ (((long) bArr[i10]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            j7 = j6 ^ (((long) bArr[i4]) << 56);
                                            if (j7 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                i4 = i + 10;
                                                long j8 = j7 ^ (((long) bArr[i10]) << 63);
                                                if (j8 >= 0) {
                                                    j = j8 ^ (-9151873028817141888L);
                                                }
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    i4 = i10;
                                }
                                j = j6 ^ j3;
                            }
                        }
                    }
                    i4 = i6;
                }
                this.f16382g = i4;
                return j;
            }
        }
        return m4140e0();
    }

    /* JADX INFO: renamed from: e0 */
    public final long m4140e0() throws ss5 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f16382g;
            if (i2 == this.f16381f) {
                qm5.m9916g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
            byte[] bArr = this.f16379d;
            this.f16382g = i2 + 1;
            byte b = bArr[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        qm5.m9916g("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: z */
    public final qk6 mo4141z() throws ss5 {
        byte[] bArr = this.f16379d;
        int iM4137b0 = m4137b0();
        if (iM4137b0 > 0) {
            int i = this.f16381f;
            int i2 = this.f16382g;
            if (iM4137b0 <= i - i2) {
                qk6 qk6VarM3011r = aj6.m3011r(bArr, i2, iM4137b0);
                this.f16382g += iM4137b0;
                return qk6VarM3011r;
            }
        }
        if (iM4137b0 == 0) {
            return aj6.f14569b;
        }
        if (iM4137b0 > 0) {
            int i3 = this.f16381f;
            int i4 = this.f16382g;
            if (iM4137b0 <= i3 - i4) {
                int i5 = iM4137b0 + i4;
                this.f16382g = i5;
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
                qk6 qk6Var = aj6.f14569b;
                return bArrCopyOfRange.length == 0 ? aj6.f14569b : new qk6(bArrCopyOfRange);
            }
        }
        if (iM4137b0 <= 0) {
            qm5.m9916g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        qm5.m9916g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }
}
