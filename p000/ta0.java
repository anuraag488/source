package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ta0 {

    /* JADX INFO: renamed from: a */
    public int f31018a;

    /* JADX INFO: renamed from: b */
    public xa0 f31019b;

    /* JADX INFO: renamed from: c */
    public byte[] f31020c;

    /* JADX INFO: renamed from: d */
    public int f31021d;

    /* JADX INFO: renamed from: e */
    public int f31022e;

    /* JADX INFO: renamed from: f */
    public int f31023f;

    /* JADX INFO: renamed from: g */
    public int f31024g;

    /* JADX INFO: renamed from: h */
    public int f31025h;

    /* JADX INFO: renamed from: i */
    public int f31026i;

    /* JADX INFO: renamed from: a */
    public static int m10995a(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: b */
    public static long m10996b(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: e */
    public static ta0 m10997e(byte[] bArr, int i, int i2, boolean z) {
        ta0 ta0Var = new ta0();
        ta0Var.f31026i = Integer.MAX_VALUE;
        ta0Var.f31020c = bArr;
        ta0Var.f31021d = i + i2;
        ta0Var.f31023f = i;
        ta0Var.f31024g = i;
        VarHandle.storeStoreFence();
        try {
            ta0Var.m11000f(i2);
            return ta0Var;
        } catch (h72 e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m10998c() {
        return this.f31023f - this.f31024g;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10999d() {
        return this.f31023f == this.f31021d;
    }

    /* JADX INFO: renamed from: f */
    public final int m11000f(int i) {
        if (i < 0) {
            throw h72.m6266c();
        }
        int iM10998c = m10998c() + i;
        if (iM10998c < 0) {
            throw new h72("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i2 = this.f31026i;
        if (iM10998c > i2) {
            throw h72.m6268e();
        }
        this.f31026i = iM10998c;
        m11008n();
        return i2;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m11001g() {
        return m11005k() != 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m11002h() throws h72 {
        int i = this.f31023f;
        if (this.f31021d - i < 4) {
            throw h72.m6268e();
        }
        byte[] bArr = this.f31020c;
        this.f31023f = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: renamed from: i */
    public final long m11003i() throws h72 {
        int i = this.f31023f;
        if (this.f31021d - i < 8) {
            throw h72.m6268e();
        }
        byte[] bArr = this.f31020c;
        this.f31023f = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: j */
    public final int m11004j() {
        int i;
        int i2 = this.f31023f;
        int i3 = this.f31021d;
        if (i3 != i2) {
            byte[] bArr = this.f31020c;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f31023f = i4;
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
                this.f31023f = i5;
                return i;
            }
        }
        return (int) m11006l();
    }

    /* JADX INFO: renamed from: k */
    public final long m11005k() {
        long j;
        long j2;
        long j3;
        int i = this.f31023f;
        int i2 = this.f31021d;
        if (i2 != i) {
            byte[] bArr = this.f31020c;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f31023f = i3;
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
                                j3 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i10]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i11 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i11;
                                                }
                                            }
                                            j = j8;
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
                this.f31023f = i4;
                return j;
            }
        }
        return m11006l();
    }

    /* JADX INFO: renamed from: l */
    public final long m11006l() throws h72 {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f31023f;
            if (i2 == this.f31021d) {
                throw h72.m6268e();
            }
            byte[] bArr = this.f31020c;
            this.f31023f = i2 + 1;
            byte b = bArr[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw new h72("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: m */
    public final int m11007m() {
        if (m10999d()) {
            this.f31025h = 0;
            return 0;
        }
        int iM11004j = m11004j();
        this.f31025h = iM11004j;
        if ((iM11004j >>> 3) != 0) {
            return iM11004j;
        }
        throw new h72("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: n */
    public final void m11008n() {
        int i = this.f31021d + this.f31022e;
        this.f31021d = i;
        int i2 = i - this.f31024g;
        int i3 = this.f31026i;
        if (i2 <= i3) {
            this.f31022e = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f31022e = i4;
        this.f31021d = i - i4;
    }
}
