package p000;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rv4 extends zt5 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ byte f29669h;

    public /* synthetic */ rv4(byte b) {
        this.f29669h = b;
    }

    /* JADX INFO: renamed from: P */
    public static int m10471P(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            zt5 zt5Var = vv4.f32889a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return vv4.m11994b(i, cv4.m4178e(bArr, j));
        }
        if (i2 == 2) {
            return vv4.m11995c(i, cv4.m4178e(bArr, j), cv4.m4178e(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fb  */
    @Override // p000.zt5
    /* JADX INFO: renamed from: H */
    public final int mo10472H(byte[] bArr, int i, int i2) {
        long j;
        int i3;
        int i4;
        long j2;
        long j3;
        byte bM4178e;
        long j4;
        byte bM4178e2;
        long j5;
        int i5 = i;
        switch (this.f29669h) {
            case 0:
                break;
            default:
                if ((i5 | i2 | (bArr.length - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i2)));
                }
                long j6 = i5;
                int i6 = (int) (((long) i2) - j6);
                if (i6 < 16) {
                    j = 1;
                    i3 = 0;
                } else {
                    int i7 = 8 - (((int) j6) & 7);
                    long j7 = j6;
                    j = 1;
                    i3 = 0;
                    while (true) {
                        if (i3 < i7) {
                            long j8 = j7 + 1;
                            if (cv4.m4178e(bArr, j7) >= 0) {
                                i3++;
                                j7 = j8;
                            }
                        } else {
                            while (true) {
                                int i8 = i3 + 8;
                                if (i8 <= i6 && (cv4.m4182i(cv4.f16515f + j7, bArr) & (-9187201950435737472L)) == 0) {
                                    j7 += 8;
                                    i3 = i8;
                                }
                            }
                            while (true) {
                                if (i3 < i6) {
                                    long j9 = j7 + 1;
                                    if (cv4.m4178e(bArr, j7) >= 0) {
                                        i3++;
                                        j7 = j9;
                                    }
                                } else {
                                    i3 = i6;
                                }
                            }
                        }
                    }
                }
                int i9 = i6 - i3;
                long j10 = j6 + ((long) i3);
                while (true) {
                    byte b = 0;
                    while (i9 > 0) {
                        long j11 = j10 + j;
                        byte bM4178e3 = cv4.m4178e(bArr, j10);
                        if (bM4178e3 >= 0) {
                            i9--;
                            b = bM4178e3;
                            j10 = j11;
                        } else {
                            b = bM4178e3;
                            j10 = j11;
                            if (i9 == 0) {
                                return 0;
                            }
                            i4 = i9 - 1;
                            if (b < -32) {
                                if (i4 == 0) {
                                    return b;
                                }
                                i9 -= 2;
                                if (b >= -62) {
                                    return -1;
                                }
                                j2 = j10 + j;
                                if (cv4.m4178e(bArr, j10) > -65) {
                                    return -1;
                                }
                                j10 = j2;
                            } else if (b < -16) {
                                if (i4 < 2) {
                                    return m10471P(j10, bArr, b, i4);
                                }
                                i9 -= 3;
                                j3 = j10 + j;
                                bM4178e = cv4.m4178e(bArr, j10);
                                if (bM4178e <= -65) {
                                    return -1;
                                }
                                if (b != -32 && bM4178e < -96) {
                                    return -1;
                                }
                                if (b != -19 && bM4178e >= -96) {
                                    return -1;
                                }
                                j10 += 2;
                                if (cv4.m4178e(bArr, j3) > -65) {
                                    return -1;
                                }
                            } else {
                                if (i4 < 3) {
                                    return m10471P(j10, bArr, b, i4);
                                }
                                i9 -= 4;
                                j4 = j10 + j;
                                bM4178e2 = cv4.m4178e(bArr, j10);
                                if (bM4178e2 <= -65) {
                                    return -1;
                                }
                                if ((((bM4178e2 + 112) + (b << 28)) >> 30) == 0) {
                                    return -1;
                                }
                                j5 = j10 + 2;
                                if (cv4.m4178e(bArr, j4) <= -65) {
                                    return -1;
                                }
                                j10 += 3;
                                if (cv4.m4178e(bArr, j5) > -65) {
                                    return -1;
                                }
                            }
                        }
                    }
                    if (i9 == 0) {
                        return 0;
                    }
                    i4 = i9 - 1;
                    if (b < -32) {
                        if (i4 == 0) {
                            return b;
                        }
                        i9 -= 2;
                        if (b >= -62) {
                            return -1;
                        }
                        j2 = j10 + j;
                        if (cv4.m4178e(bArr, j10) > -65) {
                            return -1;
                        }
                        j10 = j2;
                    } else if (b < -16) {
                        if (i4 < 2) {
                            return m10471P(j10, bArr, b, i4);
                        }
                        i9 -= 3;
                        j3 = j10 + j;
                        bM4178e = cv4.m4178e(bArr, j10);
                        if (bM4178e <= -65) {
                            return -1;
                        }
                        if (b != -32) {
                        }
                        if (b != -19) {
                        }
                        j10 += 2;
                        if (cv4.m4178e(bArr, j3) > -65) {
                            return -1;
                        }
                    } else {
                        if (i4 < 3) {
                            return m10471P(j10, bArr, b, i4);
                        }
                        i9 -= 4;
                        j4 = j10 + j;
                        bM4178e2 = cv4.m4178e(bArr, j10);
                        if (bM4178e2 <= -65) {
                            return -1;
                        }
                        if ((((bM4178e2 + 112) + (b << 28)) >> 30) == 0) {
                            return -1;
                        }
                        j5 = j10 + 2;
                        if (cv4.m4178e(bArr, j4) <= -65) {
                            return -1;
                        }
                        j10 += 3;
                        if (cv4.m4178e(bArr, j5) > -65) {
                            return -1;
                        }
                    }
                }
                break;
        }
        while (i5 < i2 && bArr[i5] >= 0) {
            i5++;
        }
        if (i5 < i2) {
            while (i5 < i2) {
                int i10 = i5 + 1;
                byte b2 = bArr[i5];
                if (b2 >= 0) {
                    i5 = i10;
                } else if (b2 < -32) {
                    if (i10 >= i2) {
                        return b2;
                    }
                    if (b2 < -62) {
                        return -1;
                    }
                    i5 += 2;
                    if (bArr[i10] > -65) {
                        return -1;
                    }
                } else if (b2 < -16) {
                    if (i10 >= i2 - 1) {
                        return vv4.m11996d(bArr, i10, i2);
                    }
                    int i11 = i5 + 2;
                    byte b3 = bArr[i10];
                    if (b3 > -65) {
                        return -1;
                    }
                    if (b2 == -32 && b3 < -96) {
                        return -1;
                    }
                    if (b2 == -19 && b3 >= -96) {
                        return -1;
                    }
                    i5 += 3;
                    if (bArr[i11] > -65) {
                        return -1;
                    }
                } else {
                    if (i10 >= i2 - 2) {
                        return vv4.m11996d(bArr, i10, i2);
                    }
                    int i12 = i5 + 2;
                    byte b4 = bArr[i10];
                    if (b4 > -65) {
                        return -1;
                    }
                    if ((((b4 + 112) + (b2 << 28)) >> 30) != 0) {
                        return -1;
                    }
                    int i13 = i5 + 3;
                    if (bArr[i12] > -65) {
                        return -1;
                    }
                    i5 += 4;
                    if (bArr[i13] > -65) {
                        return -1;
                    }
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[LOOP:2: B:23:0x0055->B:26:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012d A[SYNTHETIC] */
    @Override // p000.zt5
    /* JADX INFO: renamed from: r */
    public final String mo10473r(byte[] bArr, int i, int i2) throws h72 {
        int i3;
        byte b;
        int i4;
        byte b2;
        byte b3;
        byte b4;
        switch (this.f29669h) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                int i5 = i + i2;
                char[] cArr = new char[i2];
                int i6 = 0;
                while (i < i5) {
                    byte b5 = bArr[i];
                    if (b5 < 0) {
                        while (i < i5) {
                            i3 = i + 1;
                            b = bArr[i];
                            if (b < 0) {
                                i4 = i6 + 1;
                                cArr[i6] = (char) b;
                                while (i3 < i5) {
                                    b2 = bArr[i3];
                                    if (b2 >= 0) {
                                        i3++;
                                        cArr[i4] = (char) b2;
                                        i4++;
                                    } else {
                                        i6 = i4;
                                        i = i3;
                                    }
                                }
                                i6 = i4;
                                i = i3;
                            } else if (b < -32) {
                                if (i3 < i5) {
                                    throw h72.m6264a();
                                }
                                i += 2;
                                byte b6 = bArr[i3];
                                int i7 = i6 + 1;
                                if (b >= -62 || y70.m13008I(b6)) {
                                    throw h72.m6264a();
                                }
                                cArr[i6] = (char) ((b6 & 63) | ((b & 31) << 6));
                                i6 = i7;
                            } else {
                                if (b >= -16) {
                                    if (i3 < i5 - 2) {
                                        throw h72.m6264a();
                                    }
                                    b4 = bArr[i3];
                                    int i8 = i + 3;
                                    byte b7 = bArr[i + 2];
                                    i += 4;
                                    byte b8 = bArr[i8];
                                    int i9 = i6 + 1;
                                    if (!y70.m13008I(b4)) {
                                        if ((((b4 + 112) + (b << 28)) >> 30) != 0 && !y70.m13008I(b7) && !y70.m13008I(b8)) {
                                            int i10 = ((b4 & 63) << 12) | ((b & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
                                            cArr[i6] = (char) ((i10 >>> 10) + 55232);
                                            cArr[i9] = (char) ((i10 & 1023) + 56320);
                                            i6 += 2;
                                        }
                                    }
                                    throw h72.m6264a();
                                }
                                if (i3 < i5 - 1) {
                                    throw h72.m6264a();
                                }
                                int i11 = i + 2;
                                b3 = bArr[i3];
                                i += 3;
                                byte b9 = bArr[i11];
                                int i12 = i6 + 1;
                                if (!y70.m13008I(b3) || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || y70.m13008I(b9)))) {
                                    throw h72.m6264a();
                                }
                                cArr[i6] = (char) (((b3 & 63) << 6) | ((b & 15) << 12) | (b9 & 63));
                                i6 = i12;
                            }
                        }
                        return new String(cArr, 0, i6);
                    }
                    i++;
                    cArr[i6] = (char) b5;
                    i6++;
                }
                while (i < i5) {
                    i3 = i + 1;
                    b = bArr[i];
                    if (b < 0) {
                        if (b < -32) {
                            if (i3 < i5) {
                                throw h72.m6264a();
                            }
                            i += 2;
                            byte b10 = bArr[i3];
                            int i13 = i6 + 1;
                            if (b >= -62) {
                            }
                            throw h72.m6264a();
                        }
                        if (b >= -16) {
                            if (i3 < i5 - 1) {
                                throw h72.m6264a();
                            }
                            int i14 = i + 2;
                            b3 = bArr[i3];
                            i += 3;
                            byte b11 = bArr[i14];
                            int i15 = i6 + 1;
                            if (y70.m13008I(b3)) {
                            }
                            throw h72.m6264a();
                        }
                        if (i3 < i5 - 2) {
                            throw h72.m6264a();
                        }
                        b4 = bArr[i3];
                        int i16 = i + 3;
                        byte b12 = bArr[i + 2];
                        i += 4;
                        byte b13 = bArr[i16];
                        int i17 = i6 + 1;
                        if (!y70.m13008I(b4)) {
                            if ((((b4 + 112) + (b << 28)) >> 30) != 0) {
                            }
                        }
                        throw h72.m6264a();
                    }
                    i4 = i6 + 1;
                    cArr[i6] = (char) b;
                    while (i3 < i5) {
                        b2 = bArr[i3];
                        if (b2 >= 0) {
                            i3++;
                            cArr[i4] = (char) b2;
                            i4++;
                        } else {
                            i6 = i4;
                            i = i3;
                        }
                    }
                    i6 = i4;
                    i = i3;
                }
                return new String(cArr, 0, i6);
            default:
                Charset charset = k62.f22939a;
                String str = new String(bArr, i, i2, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw h72.m6264a();
                }
                return str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:71:0x0184  */
    /* JADX WARN: Code duplicated, block: B:73:0x0187  */
    /* JADX WARN: Code duplicated, block: B:77:0x0199  */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bd  */
    @Override // p000.zt5
    /* JADX INFO: renamed from: t */
    public final int mo10474t(String str, byte[] bArr, int i, int i2) {
        int i3;
        char cCharAt;
        int i4;
        char cCharAt2;
        int i5;
        char cCharAt3;
        char c = 2048;
        char c2 = 55296;
        switch (this.f29669h) {
            case 0:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length) {
                    int i8 = i7 + i;
                    if (i8 >= i6 || (cCharAt2 = str.charAt(i7)) >= 128) {
                        if (i7 == length) {
                            return i + length;
                        }
                        i3 = i + i7;
                        while (i7 < length) {
                            cCharAt = str.charAt(i7);
                            if (cCharAt >= 128 && i3 < i6) {
                                bArr[i3] = (byte) cCharAt;
                                i3++;
                            } else if (cCharAt >= 2048 && i3 <= i6 - 2) {
                                int i9 = i3 + 1;
                                bArr[i3] = (byte) ((cCharAt >>> 6) | 960);
                                i3 += 2;
                                bArr[i9] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                if ((cCharAt < 55296 && 57343 >= cCharAt) || i3 > i6 - 3) {
                                    if (i3 > i6 - 4) {
                                        if (55296 <= cCharAt && cCharAt <= 57343 && ((i4 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt, str.charAt(i4)))) {
                                            throw new tv4(i7, length);
                                        }
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt + " at index " + i3);
                                    }
                                    int i10 = i7 + 1;
                                    if (i10 != str.length()) {
                                        char cCharAt4 = str.charAt(i10);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt4)) {
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt4);
                                            bArr[i3] = (byte) ((codePoint >>> 18) | 240);
                                            bArr[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                            int i11 = i3 + 3;
                                            bArr[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                            i3 += 4;
                                            bArr[i11] = (byte) ((codePoint & 63) | 128);
                                            i7 = i10;
                                        } else {
                                            i7 = i10;
                                        }
                                    }
                                    throw new tv4(i7 - 1, length);
                                }
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i12 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i12] = (byte) ((cCharAt & '?') | 128);
                            }
                            i7++;
                        }
                        return i3;
                    }
                    bArr[i8] = (byte) cCharAt2;
                    i7++;
                }
                if (i7 == length) {
                    return i + length;
                }
                i3 = i + i7;
                while (i7 < length) {
                    cCharAt = str.charAt(i7);
                    if (cCharAt >= 128) {
                        if (cCharAt >= 2048) {
                            if (cCharAt < 55296) {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i13 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i13] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i14 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i14] = (byte) ((cCharAt & '?') | 128);
                            }
                        } else if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i15 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i15] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i16 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i16] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt >= 2048) {
                        if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i17 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i17] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i18 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i18] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt < 55296) {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i19 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i19] = (byte) ((cCharAt & '?') | 128);
                    } else {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i110 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i110] = (byte) ((cCharAt & '?') | 128);
                    }
                    i7++;
                }
                return i3;
            default:
                long j = i;
                long j2 = ((long) i2) + j;
                int length2 = str.length();
                if (length2 > i2 || bArr.length - i2 < i) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i + i2));
                }
                int i20 = 0;
                while (i20 < length2 && (cCharAt3 = str.charAt(i20)) < 128) {
                    cv4.m4185l(bArr, j, (byte) cCharAt3);
                    i20++;
                    j++;
                }
                if (i20 != length2) {
                    while (i20 < length2) {
                        char cCharAt5 = str.charAt(i20);
                        if (cCharAt5 < 128 && j < j2) {
                            cv4.m4185l(bArr, j, (byte) cCharAt5);
                            j++;
                        } else if (cCharAt5 >= c || j > j2 - 2) {
                            int i21 = i20;
                            if ((cCharAt5 >= c2 && 57343 >= cCharAt5) || j > j2 - 3) {
                                if (j > j2 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i5 = i21 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i5)))) {
                                        throw new tv4(i21, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j);
                                }
                                i20 = i21 + 1;
                                if (i20 != length2) {
                                    char cCharAt6 = str.charAt(i20);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        cv4.m4185l(bArr, j, (byte) ((codePoint2 >>> 18) | 240));
                                        cv4.m4185l(bArr, j + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j3 = j + 3;
                                        cv4.m4185l(bArr, j + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j += 4;
                                        cv4.m4185l(bArr, j3, (byte) ((codePoint2 & 63) | 128));
                                    }
                                } else {
                                    i20 = i21;
                                }
                                throw new tv4(i20 - 1, length2);
                            }
                            cv4.m4185l(bArr, j, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j4 = j + 2;
                            cv4.m4185l(bArr, j + 1, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j += 3;
                            cv4.m4185l(bArr, j4, (byte) ((cCharAt5 & '?') | 128));
                            i20 = i21;
                        } else {
                            long j5 = j + 1;
                            cv4.m4185l(bArr, j, (byte) ((cCharAt5 >>> 6) | 960));
                            j += 2;
                            cv4.m4185l(bArr, j5, (byte) ((cCharAt5 & '?') | 128));
                            i20 = i20;
                        }
                        i20++;
                        c = 2048;
                        c2 = 55296;
                    }
                }
                return (int) j;
        }
    }
}
