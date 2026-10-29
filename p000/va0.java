package p000;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class va0 extends wa0 {

    /* JADX INFO: renamed from: d */
    public FileInputStream f32486d;

    /* JADX INFO: renamed from: e */
    public byte[] f32487e;

    /* JADX INFO: renamed from: f */
    public int f32488f;

    /* JADX INFO: renamed from: g */
    public int f32489g;

    /* JADX INFO: renamed from: h */
    public int f32490h;

    /* JADX INFO: renamed from: i */
    public int f32491i;

    /* JADX INFO: renamed from: j */
    public int f32492j;

    /* JADX INFO: renamed from: k */
    public int f32493k;

    /* JADX INFO: renamed from: Z */
    public static boolean m11773Z(int i, int i2, int i3) {
        return i3 < i || i2 > i3 - i;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: a */
    public final void mo11309a(int i) throws i72 {
        if (this.f32491i != i) {
            throw new i72("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final byte[] m11774a0(int i) throws IOException {
        byte[] bArrM11775b0 = m11775b0(i);
        if (bArrM11775b0 != null) {
            return bArrM11775b0;
        }
        int i2 = this.f32490h;
        int i3 = this.f32488f;
        int length = i3 - i2;
        this.f32492j += i3;
        this.f32490h = 0;
        this.f32488f = 0;
        ArrayList arrayListM11776c0 = m11776c0(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f32487e, i2, bArr, 0, length);
        int size = arrayListM11776c0.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListM11776c0.get(i4);
            i4++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: b */
    public final int mo11311b() {
        return this.f32492j + this.f32490h;
    }

    /* JADX INFO: renamed from: b0 */
    public final byte[] m11775b0(int i) throws IOException {
        FileInputStream fileInputStream = this.f32486d;
        if (i == 0) {
            return l62.f23817a;
        }
        if (i < 0) {
            throw i72.m6686d();
        }
        int i2 = this.f32492j + this.f32490h;
        if (m11773Z(i2, i, Integer.MAX_VALUE)) {
            throw new i72("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        if (m11773Z(i2, i, this.f32493k)) {
            int i3 = this.f32493k;
            if (i3 >= i2) {
                m11784k0(i3 - i2);
            }
            throw i72.m6687e();
        }
        int i4 = this.f32488f - this.f32490h;
        int i5 = i - i4;
        if (i5 >= 4096) {
            try {
                if (i5 > fileInputStream.available()) {
                    return null;
                }
            } catch (i72 e) {
                e.f21153a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f32487e, this.f32490h, bArr, 0, i4);
        this.f32492j += this.f32488f;
        this.f32490h = 0;
        this.f32488f = 0;
        while (i4 < i) {
            try {
                int i6 = fileInputStream.read(bArr, i4, i - i4);
                if (i6 == -1) {
                    throw i72.m6687e();
                }
                this.f32492j += i6;
                i4 += i6;
            } catch (i72 e2) {
                e2.f21153a = true;
                throw e2;
            }
        }
        return bArr;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: c */
    public final boolean mo11313c() {
        return this.f32490h == this.f32488f && !m11785l0(1);
    }

    /* JADX INFO: renamed from: c0 */
    public final ArrayList m11776c0(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                try {
                    int i3 = this.f32486d.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw i72.m6687e();
                    }
                    this.f32492j += i3;
                    i2 += i3;
                } catch (i72 e) {
                    e.f21153a = true;
                    throw e;
                }
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: d */
    public final void mo11315d(int i) {
        this.f32493k = i;
        m11782i0();
    }

    /* JADX INFO: renamed from: d0 */
    public final int m11777d0() throws i72 {
        int i = this.f32490h;
        if (this.f32488f - i < 4) {
            m11783j0(4);
            i = this.f32490h;
        }
        byte[] bArr = this.f32487e;
        this.f32490h = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: e */
    public final int mo11317e(int i) throws i72 {
        if (i < 0) {
            throw i72.m6686d();
        }
        int i2 = this.f32492j + this.f32490h;
        if (i > Integer.MAX_VALUE - i2) {
            throw new i72("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        if (m11773Z(i2, i, this.f32493k)) {
            throw i72.m6687e();
        }
        int i3 = this.f32493k;
        this.f32493k = i2 + i;
        m11782i0();
        return i3;
    }

    /* JADX INFO: renamed from: e0 */
    public final long m11778e0() throws i72 {
        int i = this.f32490h;
        if (this.f32488f - i < 8) {
            m11783j0(8);
            i = this.f32490h;
        }
        byte[] bArr = this.f32487e;
        this.f32490h = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: f */
    public final boolean mo11319f() {
        return m11780g0() != 0;
    }

    /* JADX INFO: renamed from: f0 */
    public final int m11779f0() {
        int i;
        int i2 = this.f32490h;
        int i3 = this.f32488f;
        if (i3 != i2) {
            byte[] bArr = this.f32487e;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f32490h = i4;
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
                this.f32490h = i5;
                return i;
            }
        }
        return (int) m11781h0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: g */
    public final p50 mo11321g() throws IOException {
        byte[] bArr = this.f32487e;
        int iM11779f0 = m11779f0();
        int i = this.f32488f;
        int i2 = this.f32490h;
        if (iM11779f0 <= i - i2 && iM11779f0 > 0) {
            p50 p50VarM8525b = n50.m8525b(bArr, i2, iM11779f0);
            this.f32490h += iM11779f0;
            return p50VarM8525b;
        }
        if (iM11779f0 == 0) {
            return n50.f25466b;
        }
        if (iM11779f0 < 0) {
            throw i72.m6686d();
        }
        byte[] bArrM11775b0 = m11775b0(iM11779f0);
        if (bArrM11775b0 != null) {
            return n50.m8525b(bArrM11775b0, 0, bArrM11775b0.length);
        }
        int i3 = this.f32490h;
        int i4 = this.f32488f;
        int length = i4 - i3;
        this.f32492j += i4;
        this.f32490h = 0;
        this.f32488f = 0;
        ArrayList arrayListM11776c0 = m11776c0(iM11779f0 - length);
        byte[] bArr2 = new byte[iM11779f0];
        System.arraycopy(bArr, i3, bArr2, 0, length);
        int size = arrayListM11776c0.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayListM11776c0.get(i5);
            i5++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        try {
            p50 p50Var = n50.f25466b;
            return iM11779f0 == 0 ? n50.f25466b : new p50(bArr2);
        } catch (i72 e) {
            xy4.m12790s("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final long m11780g0() {
        long j;
        long j2;
        long j3;
        int i = this.f32490h;
        int i2 = this.f32488f;
        if (i2 != i) {
            byte[] bArr = this.f32487e;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f32490h = i3;
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
                this.f32490h = i4;
                return j;
            }
        }
        return m11781h0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: h */
    public final double mo11323h() {
        return Double.longBitsToDouble(m11778e0());
    }

    /* JADX INFO: renamed from: h0 */
    public final long m11781h0() throws i72 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.f32490h == this.f32488f) {
                m11783j0(1);
            }
            byte[] bArr = this.f32487e;
            int i2 = this.f32490h;
            this.f32490h = i2 + 1;
            byte b = bArr[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw i72.m6685c();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: i */
    public final int mo11324i() {
        return m11779f0();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m11782i0() {
        int i = this.f32488f + this.f32489g;
        this.f32488f = i;
        int i2 = this.f32492j + i;
        int i3 = this.f32493k;
        if (i2 <= i3) {
            this.f32489g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f32489g = i4;
        this.f32488f = i - i4;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: j */
    public final int mo11325j() {
        return m11777d0();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m11783j0(int i) throws i72 {
        if (m11785l0(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f32492j) - this.f32490h) {
            throw i72.m6687e();
        }
        throw new i72("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: k */
    public final long mo11326k() {
        return m11778e0();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m11784k0(int i) throws i72 {
        int i2 = this.f32488f;
        int i3 = this.f32490h;
        if (i <= i2 - i3 && i >= 0) {
            this.f32490h = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.f32486d;
        if (i < 0) {
            throw i72.m6686d();
        }
        int i4 = this.f32492j + i3;
        if (m11773Z(i4, i, Integer.MAX_VALUE)) {
            throw new i72("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        if (m11773Z(i4, i, this.f32493k)) {
            int i5 = this.f32493k;
            if (i5 >= i4) {
                m11784k0(i5 - i4);
            }
            throw i72.m6687e();
        }
        int i6 = this.f32492j;
        int i7 = this.f32490h;
        this.f32492j = i6 + i7;
        int i8 = this.f32488f - i7;
        this.f32488f = 0;
        this.f32490h = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                try {
                    long jSkip = fileInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i8 += (int) jSkip;
                    }
                } catch (i72 e) {
                    e.f21153a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f32492j += i8;
                m11782i0();
                throw th;
            }
        }
        this.f32492j += i8;
        m11782i0();
        if (i8 >= i) {
            return;
        }
        int i9 = this.f32488f;
        int i10 = i9 - this.f32490h;
        this.f32490h = i9;
        m11783j0(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f32488f;
            if (i11 <= i12) {
                this.f32490h = i11;
                return;
            } else {
                i10 += i12;
                this.f32490h = i12;
                m11783j0(1);
            }
        }
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: l */
    public final float mo11327l() {
        return Float.intBitsToFloat(m11777d0());
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m11785l0(int i) throws IOException {
        FileInputStream fileInputStream = this.f32486d;
        byte[] bArr = this.f32487e;
        int i2 = this.f32490h;
        if (i2 + i <= this.f32488f) {
            C1077qn.m9989o(c75.m3878j("refillBuffer() called when ", i, " bytes were already available in buffer"));
            return false;
        }
        int i3 = this.f32492j + i2;
        if (!m11773Z(i3, i, Integer.MAX_VALUE) && !m11773Z(i3, i, this.f32493k)) {
            int i4 = this.f32490h;
            if (i4 > 0) {
                int i5 = this.f32488f;
                if (i5 > i4) {
                    System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                }
                this.f32492j += i4;
                this.f32488f -= i4;
                this.f32490h = 0;
            }
            int i6 = this.f32488f;
            try {
                int i7 = fileInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.f32492j) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.f32488f += i7;
                    m11782i0();
                    if (this.f32488f >= i || m11785l0(i)) {
                        return true;
                    }
                }
            } catch (i72 e) {
                e.f21153a = true;
                throw e;
            }
        }
        return false;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: m */
    public final int mo11328m() {
        return m11779f0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: n */
    public final long mo11329n() {
        return m11780g0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: o */
    public final int mo11330o() {
        return m11777d0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: p */
    public final long mo11331p() {
        return m11778e0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: q */
    public final int mo11332q() {
        int iM11779f0 = m11779f0();
        return (-(iM11779f0 & 1)) ^ (iM11779f0 >>> 1);
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: r */
    public final long mo11333r() {
        long jM11780g0 = m11780g0();
        return (-(jM11780g0 & 1)) ^ (jM11780g0 >>> 1);
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: s */
    public final String mo11334s() throws i72 {
        byte[] bArr = this.f32487e;
        int iM11779f0 = m11779f0();
        if (iM11779f0 > 0) {
            int i = this.f32488f;
            int i2 = this.f32490h;
            if (iM11779f0 <= i - i2) {
                String str = new String(bArr, i2, iM11779f0, StandardCharsets.UTF_8);
                this.f32490h += iM11779f0;
                return str;
            }
        }
        if (iM11779f0 == 0) {
            return "";
        }
        if (iM11779f0 < 0) {
            throw i72.m6686d();
        }
        if (iM11779f0 > this.f32488f) {
            return new String(m11774a0(iM11779f0), StandardCharsets.UTF_8);
        }
        m11783j0(iM11779f0);
        String str2 = new String(bArr, this.f32490h, iM11779f0, StandardCharsets.UTF_8);
        this.f32490h += iM11779f0;
        return str2;
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: t */
    public final String mo11335t() throws IOException {
        byte[] bArrM11774a0 = this.f32487e;
        int iM11779f0 = m11779f0();
        int i = this.f32490h;
        int i2 = this.f32488f;
        if (iM11779f0 <= i2 - i && iM11779f0 > 0) {
            this.f32490h = i + iM11779f0;
        } else {
            if (iM11779f0 == 0) {
                return "";
            }
            if (iM11779f0 < 0) {
                throw i72.m6686d();
            }
            i = 0;
            if (iM11779f0 <= i2) {
                m11783j0(iM11779f0);
                this.f32490h = iM11779f0;
            } else {
                bArrM11774a0 = m11774a0(iM11779f0);
            }
        }
        if (iM11779f0 != 0) {
            return wv4.f33788a.mo7747H(bArrM11774a0, i, iM11779f0);
        }
        kx5 kx5Var = wv4.f33788a;
        return "";
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: u */
    public final int mo11336u() throws i72 {
        if (mo11313c()) {
            this.f32491i = 0;
            return 0;
        }
        int iM11779f0 = m11779f0();
        this.f32491i = iM11779f0;
        if ((iM11779f0 >>> 3) != 0) {
            return iM11779f0;
        }
        throw new i72("Protocol message contained an invalid tag (zero).");
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: v */
    public final int mo11337v() {
        return m11779f0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: w */
    public final long mo11338w() {
        return m11780g0();
    }

    @Override // p000.wa0
    /* JADX INFO: renamed from: x */
    public final boolean mo11339x(int i) throws i72 {
        byte[] bArr = this.f32487e;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f32488f - this.f32490h >= 10) {
                while (i3 < 10) {
                    int i4 = this.f32490h;
                    this.f32490h = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw i72.m6685c();
            }
            while (i3 < 10) {
                if (this.f32490h == this.f32488f) {
                    m11783j0(1);
                }
                int i5 = this.f32490h;
                this.f32490h = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            throw i72.m6685c();
            return true;
        }
        if (i2 == 1) {
            m11784k0(8);
            return true;
        }
        if (i2 == 2) {
            m11784k0(m11779f0());
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
        m11784k0(4);
        return true;
    }
}
