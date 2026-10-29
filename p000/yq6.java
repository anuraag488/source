package p000;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yq6 extends wa0 {

    /* JADX INFO: renamed from: d */
    public an5 f35463d;

    /* JADX INFO: renamed from: e */
    public byte[] f35464e;

    /* JADX INFO: renamed from: f */
    public int f35465f;

    /* JADX INFO: renamed from: g */
    public int f35466g;

    /* JADX INFO: renamed from: h */
    public int f35467h;

    /* JADX INFO: renamed from: i */
    public int f35468i;

    /* JADX INFO: renamed from: j */
    public int f35469j;

    /* JADX INFO: renamed from: k */
    public int f35470k;

    /* JADX INFO: renamed from: b0 */
    public static boolean m13215b0(int i, int i2, int i3) {
        return i3 < i || i2 > i3 - i;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: A */
    public final void mo4112A(int i) throws ss5 {
        if (this.f35468i == i) {
            return;
        }
        qm5.m9916g("Protocol message end-group tag did not match expected tag.");
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: B */
    public final void mo4113B(int i) {
        this.f35470k = i;
        m13216Z();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: C */
    public final boolean mo4114C() {
        return this.f35467h == this.f35465f && !m13218c0(1);
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: D */
    public final boolean mo4115D() {
        return m13224i0() != 0;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: E */
    public final boolean mo4116E(int i) throws ss5 {
        byte[] bArr = this.f35464e;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f35465f - this.f35467h >= 10) {
                while (i3 < 10) {
                    int i4 = this.f35467h;
                    this.f35467h = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                qm5.m9916g("CodedInputStream encountered a malformed varint.");
                return false;
            }
            while (i3 < 10) {
                if (this.f35467h == this.f35465f) {
                    m13217a0(1);
                }
                int i5 = this.f35467h;
                this.f35467h = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            qm5.m9916g("CodedInputStream encountered a malformed varint.");
            return false;
            return true;
        }
        if (i2 == 1) {
            m13226k0(8);
            return true;
        }
        if (i2 == 2) {
            m13226k0(m13222g0());
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
            m13226k0(4);
            return true;
        }
        qm5.m9910a();
        return false;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: H */
    public final double mo4117H() {
        return Double.longBitsToDouble(m13223h0());
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: I */
    public final float mo4118I() {
        return Float.intBitsToFloat(m13221f0());
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: J */
    public final int mo4119J() {
        return this.f35469j + this.f35467h;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: K */
    public final int mo4120K(int i) throws ss5 {
        if (i < 0) {
            qm5.m9916g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = this.f35469j + this.f35467h;
        if (i > Integer.MAX_VALUE - i2) {
            qm5.m9916g("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i3 = this.f35470k;
        if (m13215b0(i2, i, i3)) {
            qm5.m9916g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.f35470k = i2 + i;
        m13216Z();
        return i3;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: L */
    public final int mo4121L() {
        return m13222g0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: M */
    public final int mo4122M() {
        return m13221f0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: N */
    public final int mo4123N() {
        return m13222g0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: O */
    public final int mo4124O() {
        return m13221f0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: P */
    public final int mo4125P() {
        int iM13222g0 = m13222g0();
        return (-(iM13222g0 & 1)) ^ (iM13222g0 >>> 1);
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: Q */
    public final int mo4126Q() throws ss5 {
        if (mo4114C()) {
            this.f35468i = 0;
            return 0;
        }
        int iM13222g0 = m13222g0();
        this.f35468i = iM13222g0;
        if ((iM13222g0 >>> 3) != 0) {
            return iM13222g0;
        }
        qm5.m9916g("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: R */
    public final int mo4127R() {
        return m13222g0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: S */
    public final long mo4128S() {
        return m13223h0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: T */
    public final long mo4129T() {
        return m13224i0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: U */
    public final long mo4130U() {
        return m13223h0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: V */
    public final long mo4131V() {
        long jM13224i0 = m13224i0();
        return (-(jM13224i0 & 1)) ^ (jM13224i0 >>> 1);
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: W */
    public final long mo4132W() {
        return m13224i0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: X */
    public final String mo4133X() throws ss5 {
        byte[] bArr = this.f35464e;
        int iM13222g0 = m13222g0();
        if (iM13222g0 > 0) {
            int i = this.f35465f;
            int i2 = this.f35467h;
            if (iM13222g0 <= i - i2) {
                String str = new String(bArr, i2, iM13222g0, StandardCharsets.UTF_8);
                this.f35467h += iM13222g0;
                return str;
            }
        }
        if (iM13222g0 == 0) {
            return "";
        }
        if (iM13222g0 < 0) {
            qm5.m9916g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        if (iM13222g0 > this.f35465f) {
            return new String(m13219d0(iM13222g0), StandardCharsets.UTF_8);
        }
        m13217a0(iM13222g0);
        String str2 = new String(bArr, this.f35467h, iM13222g0, StandardCharsets.UTF_8);
        this.f35467h += iM13222g0;
        return str2;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: Y */
    public final String mo4134Y() throws IOException {
        byte[] bArrM13219d0 = this.f35464e;
        int iM13222g0 = m13222g0();
        int i = this.f35467h;
        int i2 = this.f35465f;
        if (iM13222g0 <= i2 - i && iM13222g0 > 0) {
            this.f35467h = i + iM13222g0;
        } else {
            if (iM13222g0 == 0) {
                return "";
            }
            if (iM13222g0 < 0) {
                qm5.m9916g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
            i = 0;
            if (iM13222g0 <= i2) {
                m13217a0(iM13222g0);
                this.f35467h = iM13222g0;
            } else {
                bArrM13219d0 = m13219d0(iM13222g0);
            }
        }
        return jy5.m7342c(bArrM13219d0, i, iM13222g0);
    }

    /* JADX INFO: renamed from: Z */
    public final void m13216Z() {
        int i = this.f35465f + this.f35466g;
        this.f35465f = i;
        int i2 = this.f35469j + i;
        int i3 = this.f35470k;
        if (i2 <= i3) {
            this.f35466g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f35466g = i4;
        this.f35465f = i - i4;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m13217a0(int i) throws ss5 {
        if (m13218c0(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.f35469j) - this.f35467h) {
            qm5.m9916g("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        } else {
            qm5.m9916g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m13218c0(int i) throws IOException {
        an5 an5Var = this.f35463d;
        byte[] bArr = this.f35464e;
        int i2 = this.f35467h;
        int i3 = i2 + i;
        int i4 = this.f35465f;
        if (i3 <= i4) {
            C1077qn.m9989o(c75.m3878j("refillBuffer() called when ", i, " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.f35469j;
        int i6 = i5 + i2;
        if (!m13215b0(i6, i, Integer.MAX_VALUE) && !m13215b0(i6, i, this.f35470k)) {
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                i5 = this.f35469j + i2;
                this.f35469j = i5;
                i4 = this.f35465f - i2;
                this.f35465f = i4;
                this.f35467h = 0;
            }
            try {
                int i7 = an5Var.read(bArr, i4, Math.min(4096 - i4, (Integer.MAX_VALUE - i5) - i4));
                if (i7 == 0 || i7 < -1 || i7 > 4096) {
                    throw new IllegalStateException(an5.class + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.f35465f += i7;
                    m13216Z();
                    if (this.f35465f >= i || m13218c0(i)) {
                        return true;
                    }
                }
            } catch (ss5 e) {
                e.f30547a = true;
                throw e;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public final byte[] m13219d0(int i) throws IOException {
        byte[] bArrM13220e0 = m13220e0(i);
        if (bArrM13220e0 != null) {
            return bArrM13220e0;
        }
        int i2 = this.f35467h;
        int i3 = this.f35465f;
        int i4 = i3 - i2;
        this.f35469j += i3;
        this.f35467h = 0;
        this.f35465f = 0;
        ArrayList arrayListM13227l0 = m13227l0(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f35464e, i2, bArr, 0, i4);
        int size = arrayListM13227l0.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayListM13227l0.get(i5);
            i5++;
            byte[] bArr2 = (byte[]) obj;
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: e0 */
    public final byte[] m13220e0(int i) throws IOException {
        an5 an5Var = this.f35463d;
        if (i == 0) {
            return kr5.f23354a;
        }
        int i2 = this.f35469j;
        int i3 = this.f35467h;
        int i4 = i2 + i3;
        if (m13215b0(i4, i, Integer.MAX_VALUE)) {
            qm5.m9916g("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return null;
        }
        int i5 = this.f35470k;
        if (m13215b0(i4, i, i5)) {
            if (i5 >= i4) {
                m13226k0(i5 - i4);
            }
            qm5.m9916g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        int i6 = this.f35465f - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > an5Var.available()) {
                    return null;
                }
            } catch (ss5 e) {
                e.f30547a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f35464e, this.f35467h, bArr, 0, i6);
        this.f35469j += this.f35465f;
        this.f35467h = 0;
        this.f35465f = 0;
        while (i6 < i) {
            try {
                int i8 = an5Var.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    qm5.m9916g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return null;
                }
                this.f35469j += i8;
                i6 += i8;
            } catch (ss5 e2) {
                e2.f30547a = true;
                throw e2;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: f0 */
    public final int m13221f0() throws ss5 {
        int i = this.f35467h;
        if (this.f35465f - i < 4) {
            m13217a0(4);
            i = this.f35467h;
        }
        byte[] bArr = this.f35464e;
        this.f35467h = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: renamed from: g0 */
    public final int m13222g0() {
        int i;
        int i2 = this.f35467h;
        int i3 = this.f35465f;
        if (i3 != i2) {
            byte[] bArr = this.f35464e;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f35467h = i4;
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
                this.f35467h = i5;
                return i;
            }
        }
        return (int) m13225j0();
    }

    /* JADX INFO: renamed from: h0 */
    public final long m13223h0() throws ss5 {
        int i = this.f35467h;
        if (this.f35465f - i < 8) {
            m13217a0(8);
            i = this.f35467h;
        }
        byte[] bArr = this.f35464e;
        this.f35467h = i + 8;
        long j = bArr[i];
        long j2 = (((long) bArr[i + 1]) & 255) << 8;
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        return ((((long) bArr[i + 6]) & 255) << 48) | (j & 255) | j2 | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: i0 */
    public final long m13224i0() {
        long j;
        long j2;
        long j3;
        int i = this.f35467h;
        int i2 = this.f35465f;
        if (i2 != i) {
            byte[] bArr = this.f35464e;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f35467h = i3;
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
                this.f35467h = i4;
                return j;
            }
        }
        return m13225j0();
    }

    /* JADX INFO: renamed from: j0 */
    public final long m13225j0() throws ss5 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f35467h == this.f35465f) {
                m13217a0(1);
            }
            byte[] bArr = this.f35464e;
            int i2 = this.f35467h;
            this.f35467h = i2 + 1;
            byte b = bArr[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        qm5.m9916g("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m13226k0(int i) throws ss5 {
        an5 an5Var = this.f35463d;
        int i2 = this.f35465f;
        int i3 = this.f35467h;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f35467h = i3 + i;
            return;
        }
        if (i < 0) {
            qm5.m9916g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return;
        }
        int i5 = this.f35469j + i3;
        if (m13215b0(i5, i, Integer.MAX_VALUE)) {
            qm5.m9916g("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return;
        }
        int i6 = this.f35470k;
        if (m13215b0(i5, i, i6)) {
            if (i6 >= i5) {
                m13226k0(i6 - i5);
            }
            qm5.m9916g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return;
        }
        this.f35469j = i5;
        this.f35465f = 0;
        this.f35467h = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = an5Var.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(an5.class + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (ss5 e) {
                    e.f30547a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f35469j += i4;
                m13216Z();
                throw th;
            }
        }
        this.f35469j += i4;
        m13216Z();
        if (i4 >= i) {
            return;
        }
        int i7 = this.f35465f;
        int i8 = i7 - this.f35467h;
        this.f35467h = i7;
        m13217a0(1);
        while (true) {
            int i9 = i - i8;
            int i10 = this.f35465f;
            if (i9 <= i10) {
                this.f35467h = i9;
                return;
            } else {
                i8 += i10;
                this.f35467h = i10;
                m13217a0(1);
            }
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final ArrayList m13227l0(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                try {
                    int i3 = this.f35463d.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        qm5.m9916g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return null;
                    }
                    this.f35469j += i3;
                    i2 += i3;
                } catch (ss5 e) {
                    e.f30547a = true;
                    throw e;
                }
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: z */
    public final qk6 mo4141z() throws IOException {
        byte[] bArr = this.f35464e;
        int iM13222g0 = m13222g0();
        int i = this.f35465f;
        int i2 = this.f35467h;
        if (iM13222g0 <= i - i2 && iM13222g0 > 0) {
            qk6 qk6VarM3011r = aj6.m3011r(bArr, i2, iM13222g0);
            this.f35467h += iM13222g0;
            return qk6VarM3011r;
        }
        if (iM13222g0 == 0) {
            return aj6.f14569b;
        }
        if (iM13222g0 < 0) {
            qm5.m9916g("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        byte[] bArrM13220e0 = m13220e0(iM13222g0);
        if (bArrM13220e0 != null) {
            return aj6.m3011r(bArrM13220e0, 0, bArrM13220e0.length);
        }
        int i3 = this.f35467h;
        int i4 = this.f35465f;
        int i5 = i4 - i3;
        this.f35469j += i4;
        this.f35467h = 0;
        this.f35465f = 0;
        ArrayList arrayListM13227l0 = m13227l0(iM13222g0 - i5);
        byte[] bArr2 = new byte[iM13222g0];
        System.arraycopy(bArr, i3, bArr2, 0, i5);
        int size = arrayListM13227l0.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListM13227l0.get(i6);
            i6++;
            byte[] bArr3 = (byte[]) obj;
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i5, length);
            i5 += length;
        }
        try {
            qk6 qk6Var = aj6.f14569b;
            return iM13222g0 == 0 ? aj6.f14569b : new qk6(bArr2);
        } catch (ss5 e) {
            xy4.m12790s("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
            return null;
        }
    }
}
