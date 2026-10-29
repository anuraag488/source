package p000;

import ads_mobile_sdk.AbstractC0137h;
import ads_mobile_sdk.ur1;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class z55 extends AbstractC0137h {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ byte f35767c;

    public /* synthetic */ z55(byte b) {
        this.f35767c = b;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0048 A[EDGE_INSN: B:104:0x0048->B:99:0x0048 BREAK  A[LOOP:2: B:23:0x0057->B:26:0x005d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:26:0x005d A[LOOP:2: B:23:0x0057->B:26:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:80:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x012c A[SYNTHETIC] */
    @Override // ads_mobile_sdk.AbstractC0137h
    /* JADX INFO: renamed from: a */
    public final String mo1126a(byte[] bArr, int i, int i2) throws ur1 {
        int i3;
        byte b;
        byte b2;
        byte b3;
        byte b4;
        switch (this.f35767c) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
                }
                int i4 = i + i2;
                char[] cArr = new char[i2];
                int i5 = 0;
                while (i < i4) {
                    byte b5 = bArr[i];
                    if (b5 < 0) {
                        while (i < i4) {
                            i3 = i + 1;
                            b = bArr[i];
                            if (b < 0) {
                                cArr[i5] = (char) b;
                                i5++;
                                i = i3;
                                while (i < i4) {
                                    b2 = bArr[i];
                                    if (b2 >= 0) {
                                    }
                                    i++;
                                    cArr[i5] = (char) b2;
                                    i5++;
                                    break;
                                }
                            } else if (b < -32) {
                                if (i3 < i4) {
                                    throw ur1.m2480d();
                                }
                                i += 2;
                                byte b6 = bArr[i3];
                                int i6 = i5 + 1;
                                if (b >= -62 || qs5.m10099d(b6)) {
                                    throw ur1.m2480d();
                                }
                                cArr[i5] = (char) ((b6 & 63) | ((b & 31) << 6));
                                i5 = i6;
                            } else {
                                if (b >= -16) {
                                    if (i3 < i4 - 2) {
                                        throw ur1.m2480d();
                                    }
                                    b4 = bArr[i3];
                                    int i7 = i + 3;
                                    byte b7 = bArr[i + 2];
                                    i += 4;
                                    byte b8 = bArr[i7];
                                    if (!qs5.m10099d(b4)) {
                                        if ((((b4 + 112) + (b << 28)) >> 30) != 0 && !qs5.m10099d(b7) && !qs5.m10099d(b8)) {
                                            int i8 = ((b4 & 63) << 12) | ((b & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
                                            cArr[i5] = (char) ((i8 >>> 10) + 55232);
                                            cArr[i5 + 1] = (char) ((i8 & 1023) + 56320);
                                            i5 += 2;
                                        }
                                    }
                                    throw ur1.m2480d();
                                }
                                if (i3 < i4 - 1) {
                                    throw ur1.m2480d();
                                }
                                int i9 = i + 2;
                                b3 = bArr[i3];
                                i += 3;
                                byte b9 = bArr[i9];
                                int i10 = i5 + 1;
                                if (!qs5.m10099d(b3) || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || qs5.m10099d(b9)))) {
                                    throw ur1.m2480d();
                                }
                                cArr[i5] = (char) (((b3 & 63) << 6) | ((b & 15) << 12) | (b9 & 63));
                                i5 = i10;
                            }
                        }
                        return new String(cArr, 0, i5);
                    }
                    i++;
                    cArr[i5] = (char) b5;
                    i5++;
                }
                while (i < i4) {
                    i3 = i + 1;
                    b = bArr[i];
                    if (b < 0) {
                        if (b < -32) {
                            if (i3 < i4) {
                                throw ur1.m2480d();
                            }
                            i += 2;
                            byte b10 = bArr[i3];
                            int i11 = i5 + 1;
                            if (b >= -62) {
                            }
                            throw ur1.m2480d();
                        }
                        if (b >= -16) {
                            if (i3 < i4 - 1) {
                                throw ur1.m2480d();
                            }
                            int i12 = i + 2;
                            b3 = bArr[i3];
                            i += 3;
                            byte b11 = bArr[i12];
                            int i13 = i5 + 1;
                            if (qs5.m10099d(b3)) {
                            }
                            throw ur1.m2480d();
                        }
                        if (i3 < i4 - 2) {
                            throw ur1.m2480d();
                        }
                        b4 = bArr[i3];
                        int i14 = i + 3;
                        byte b12 = bArr[i + 2];
                        i += 4;
                        byte b13 = bArr[i14];
                        if (!qs5.m10099d(b4)) {
                            if ((((b4 + 112) + (b << 28)) >> 30) != 0) {
                            }
                        }
                        throw ur1.m2480d();
                    }
                    cArr[i5] = (char) b;
                    i5++;
                    i = i3;
                    while (i < i4) {
                        b2 = bArr[i];
                        if (b2 >= 0) {
                        }
                        i++;
                        cArr[i5] = (char) b2;
                        i5++;
                        break;
                    }
                }
                return new String(cArr, 0, i5);
            default:
                Charset charset = StandardCharsets.UTF_8;
                String str = new String(bArr, i, i2, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw ur1.m2480d();
                }
                return str;
        }
    }

    @Override // ads_mobile_sdk.AbstractC0137h
    /* JADX INFO: renamed from: a */
    public final int mo1125a(String str, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char cCharAt;
        switch (this.f35767c) {
            case 0:
                int length = str.length();
                int i5 = i + i2;
                int i6 = 0;
                while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = str.charAt(i6)) < 128) {
                    bArr[i4] = (byte) cCharAt;
                    i6++;
                }
                if (i6 == length) {
                    return i + length;
                }
                int i7 = i + i6;
                while (i6 < length) {
                    char cCharAt2 = str.charAt(i6);
                    if (cCharAt2 < 128 && i7 < i5) {
                        bArr[i7] = (byte) cCharAt2;
                        i7++;
                    } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                        int i8 = i7 + 1;
                        bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                        i7 += 2;
                        bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                            if (i7 <= i5 - 4) {
                                i6++;
                                if (i6 != str.length()) {
                                    char cCharAt3 = str.charAt(i6);
                                    if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                        int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                        bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                                        bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i9 = i7 + 3;
                                        bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i7 += 4;
                                        bArr[i9] = (byte) ((codePoint & 63) | 128);
                                    }
                                }
                                return AbstractC0137h.m1110b(str, bArr, i, i2);
                            }
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                return AbstractC0137h.m1110b(str, bArr, i, i2);
                            }
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                        int i10 = i7 + 2;
                        bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                        i7 += 3;
                        bArr[i10] = (byte) ((cCharAt2 & '?') | 128);
                    }
                    i6++;
                }
                return i7;
            default:
                return AbstractC0137h.m1110b(str, bArr, i, i2);
        }
    }

    @Override // ads_mobile_sdk.AbstractC0137h
    /* JADX INFO: renamed from: a */
    public final boolean mo1127a() {
        switch (this.f35767c) {
            case 0:
                return false;
            default:
                return true;
        }
    }
}
