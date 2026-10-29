package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class hv5 {
    /* JADX INFO: renamed from: a */
    public static int m6508a(byte[] bArr, int i, C1411zn c1411zn) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m6509b(b, bArr, i2, c1411zn);
        }
        c1411zn.f36190a = b;
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m6509b(int i, byte[] bArr, int i2, C1411zn c1411zn) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            c1411zn.f36190a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            c1411zn.f36190a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c1411zn.f36190a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c1411zn.f36190a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c1411zn.f36190a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m6510c(byte[] bArr, int i, C1411zn c1411zn) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            c1411zn.f36191b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        c1411zn.f36191b = j2;
        return i3;
    }

    /* JADX INFO: renamed from: d */
    public static void m6511d(int i, String str, int i2) {
        n36.f25429a.m11148I(i, str);
    }

    /* JADX INFO: renamed from: e */
    public static int m6512e(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* JADX INFO: renamed from: f */
    public static long m6513f(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:48:0x009f A[PHI: r5
  0x009f: PHI (r5v6 byte) = (r5v5 byte), (r5v9 byte) binds: [B:45:0x009a, B:47:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00b7 A[SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static int m6514g(byte[] bArr, int i, C1411zn c1411zn) throws qi6 {
        int iM6508a = m6508a(bArr, i, c1411zn);
        int i2 = c1411zn.f36190a;
        if (i2 < 0) {
            qm5.m9918i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 == 0) {
            c1411zn.f36192c = "";
            return iM6508a;
        }
        int i3 = ql6.f28559a;
        int length = bArr.length;
        if ((((length - iM6508a) - i2) | iM6508a | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iM6508a), Integer.valueOf(i2)));
        }
        int i4 = iM6508a + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (iM6508a < i4) {
            byte b = bArr[iM6508a];
            if (b < 0) {
                break;
            }
            iM6508a++;
            cArr[i5] = (char) b;
            i5++;
        }
        while (iM6508a < i4) {
            int i6 = iM6508a + 1;
            byte b2 = bArr[iM6508a];
            if (b2 >= 0) {
                cArr[i5] = (char) b2;
                i5++;
                iM6508a = i6;
                while (iM6508a < i4) {
                    byte b3 = bArr[iM6508a];
                    if (b3 < 0) {
                        break;
                    }
                    iM6508a++;
                    cArr[i5] = (char) b3;
                    i5++;
                }
            } else {
                if (b2 >= -32) {
                    if (b2 >= -16) {
                        if (i6 >= i4 - 2) {
                            qm5.m9918i("Protocol message had invalid UTF-8.");
                            return 0;
                        }
                        byte b4 = bArr[i6];
                        int i7 = iM6508a + 3;
                        byte b5 = bArr[iM6508a + 2];
                        iM6508a += 4;
                        byte b6 = bArr[i7];
                        if (!cy5.m4234b(b4)) {
                            if ((((b4 + 112) + (b2 << 28)) >> 30) == 0 && !cy5.m4234b(b5) && !cy5.m4234b(b6)) {
                                int i8 = ((b4 & 63) << 12) | ((b2 & 7) << 18) | ((b5 & 63) << 6) | (b6 & 63);
                                cArr[i5] = (char) ((i8 >>> 10) + 55232);
                                cArr[i5 + 1] = (char) ((i8 & 1023) + 56320);
                                i5 += 2;
                            }
                        }
                        qm5.m9918i("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    if (i6 >= i4 - 1) {
                        qm5.m9918i("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    int i9 = i5 + 1;
                    int i10 = iM6508a + 2;
                    byte b7 = bArr[i6];
                    iM6508a += 3;
                    byte b8 = bArr[i10];
                    if (!cy5.m4234b(b7)) {
                        if (b2 != -32) {
                            if (b2 != -19) {
                                if (!cy5.m4234b(b8)) {
                                    cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i5 = i9;
                                }
                            } else if (b7 < -96) {
                                b2 = -19;
                                if (!cy5.m4234b(b8)) {
                                    cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i5 = i9;
                                }
                            }
                        } else if (b7 >= -96) {
                            b2 = -32;
                            if (b2 != -19) {
                                if (!cy5.m4234b(b8)) {
                                    cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i5 = i9;
                                }
                            } else if (b7 < -96) {
                                b2 = -19;
                                if (!cy5.m4234b(b8)) {
                                    cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i5 = i9;
                                }
                            }
                        }
                    }
                    qm5.m9918i("Protocol message had invalid UTF-8.");
                    return 0;
                }
                if (i6 >= i4) {
                    qm5.m9918i("Protocol message had invalid UTF-8.");
                    return 0;
                }
                int i11 = i5 + 1;
                iM6508a += 2;
                byte b9 = bArr[i6];
                if (b2 < -62 || cy5.m4234b(b9)) {
                    qm5.m9918i("Protocol message had invalid UTF-8.");
                    return 0;
                }
                cArr[i5] = (char) ((b9 & 63) | ((b2 & 31) << 6));
                i5 = i11;
            }
        }
        c1411zn.f36192c = new String(cArr, 0, i5);
        return i4;
    }

    /* JADX INFO: renamed from: h */
    public static int m6515h(byte[] bArr, int i, C1411zn c1411zn) throws qi6 {
        int iM6508a = m6508a(bArr, i, c1411zn);
        int i2 = c1411zn.f36190a;
        if (i2 < 0) {
            qm5.m9918i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iM6508a) {
            qm5.m9918i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            c1411zn.f36192c = ig6.f21412c;
            return iM6508a;
        }
        c1411zn.f36192c = ig6.m6803e(bArr, iM6508a, i2);
        return iM6508a + i2;
    }

    /* JADX INFO: renamed from: i */
    public static int m6516i(Object obj, gk6 gk6Var, byte[] bArr, int i, int i2, C1411zn c1411zn) throws qi6 {
        int iM6509b = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM6509b = m6509b(i3, bArr, iM6509b, c1411zn);
            i3 = c1411zn.f36190a;
        }
        int i4 = iM6509b;
        if (i3 < 0 || i3 > i2 - i4) {
            qm5.m9918i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = c1411zn.f36193d + 1;
        c1411zn.f36193d = i5;
        if (i5 >= 100) {
            qm5.m9918i("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i6 = i4 + i3;
        gk6Var.mo6030h(obj, bArr, i4, i6, c1411zn);
        c1411zn.f36193d--;
        c1411zn.f36192c = obj;
        return i6;
    }

    /* JADX INFO: renamed from: j */
    public static int m6517j(Object obj, gk6 gk6Var, byte[] bArr, int i, int i2, int i3, C1411zn c1411zn) throws qi6 {
        vj6 vj6Var = (vj6) gk6Var;
        int i4 = c1411zn.f36193d + 1;
        c1411zn.f36193d = i4;
        if (i4 >= 100) {
            qm5.m9918i("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iM11917t = vj6Var.m11917t(obj, bArr, i, i2, i3, c1411zn);
        c1411zn.f36193d--;
        c1411zn.f36192c = obj;
        return iM11917t;
    }

    /* JADX INFO: renamed from: k */
    public static int m6518k(int i, byte[] bArr, int i2, int i3, mi6 mi6Var, C1411zn c1411zn) {
        ci6 ci6Var = (ci6) mi6Var;
        int iM6508a = m6508a(bArr, i2, c1411zn);
        ci6Var.m4030d(c1411zn.f36190a);
        while (iM6508a < i3) {
            int iM6508a2 = m6508a(bArr, iM6508a, c1411zn);
            if (i != c1411zn.f36190a) {
                break;
            }
            iM6508a = m6508a(bArr, iM6508a2, c1411zn);
            ci6Var.m4030d(c1411zn.f36190a);
        }
        return iM6508a;
    }

    /* JADX INFO: renamed from: l */
    public static int m6519l(byte[] bArr, int i, mi6 mi6Var, C1411zn c1411zn) throws qi6 {
        ci6 ci6Var = (ci6) mi6Var;
        int iM6508a = m6508a(bArr, i, c1411zn);
        int i2 = c1411zn.f36190a + iM6508a;
        while (iM6508a < i2) {
            iM6508a = m6508a(bArr, iM6508a, c1411zn);
            ci6Var.m4030d(c1411zn.f36190a);
        }
        if (iM6508a == i2) {
            return iM6508a;
        }
        qm5.m9918i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public static int m6520m(gk6 gk6Var, int i, byte[] bArr, int i2, int i3, mi6 mi6Var, C1411zn c1411zn) throws qi6 {
        zh6 zh6VarMo6028f = gk6Var.mo6028f();
        gk6 gk6Var2 = gk6Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        C1411zn c1411zn2 = c1411zn;
        int iM6516i = m6516i(zh6VarMo6028f, gk6Var2, bArr2, i2, i4, c1411zn2);
        gk6Var2.mo6025c(zh6VarMo6028f);
        c1411zn2.f36192c = zh6VarMo6028f;
        mi6Var.add(zh6VarMo6028f);
        while (iM6516i < i4) {
            C1411zn c1411zn3 = c1411zn2;
            int i5 = i4;
            int iM6508a = m6508a(bArr2, iM6516i, c1411zn3);
            if (i != c1411zn3.f36190a) {
                break;
            }
            byte[] bArr3 = bArr2;
            gk6 gk6Var3 = gk6Var2;
            zh6 zh6VarMo6028f2 = gk6Var3.mo6028f();
            iM6516i = m6516i(zh6VarMo6028f2, gk6Var3, bArr3, iM6508a, i5, c1411zn3);
            gk6Var2 = gk6Var3;
            bArr2 = bArr3;
            i4 = i5;
            c1411zn2 = c1411zn3;
            gk6Var2.mo6025c(zh6VarMo6028f2);
            c1411zn2.f36192c = zh6VarMo6028f2;
            mi6Var.add(zh6VarMo6028f2);
        }
        return iM6516i;
    }

    /* JADX INFO: renamed from: n */
    public static int m6521n(int i, byte[] bArr, int i2, int i3, el6 el6Var, C1411zn c1411zn) throws qi6 {
        if ((i >>> 3) == 0) {
            qm5.m9918i("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM6510c = m6510c(bArr, i2, c1411zn);
            el6Var.m5196d(i, Long.valueOf(c1411zn.f36191b));
            return iM6510c;
        }
        if (i4 == 1) {
            el6Var.m5196d(i, Long.valueOf(m6513f(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM6508a = m6508a(bArr, i2, c1411zn);
            int i5 = c1411zn.f36190a;
            if (i5 < 0) {
                qm5.m9918i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iM6508a) {
                qm5.m9918i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                el6Var.m5196d(i, ig6.f21412c);
            } else {
                el6Var.m5196d(i, ig6.m6803e(bArr, iM6508a, i5));
            }
            return iM6508a + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                el6Var.m5196d(i, Integer.valueOf(m6512e(i2, bArr)));
                return i2 + 4;
            }
            qm5.m9918i("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        el6 el6VarM5193a = el6.m5193a();
        int i7 = c1411zn.f36193d + 1;
        c1411zn.f36193d = i7;
        if (i7 >= 100) {
            qm5.m9918i("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (i2 < i3) {
            int iM6508a2 = m6508a(bArr, i2, c1411zn);
            int i9 = c1411zn.f36190a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iM6508a2;
                break;
            }
            i2 = m6521n(i9, bArr, iM6508a2, i3, el6VarM5193a, c1411zn);
            i8 = i9;
        }
        c1411zn.f36193d--;
        if (i2 > i3 || i8 != i6) {
            qm5.m9918i("Failed to parse the message.");
            return 0;
        }
        el6Var.m5196d(i, el6VarM5193a);
        return i2;
    }

    /* JADX INFO: renamed from: o */
    public static int m6522o(int i, byte[] bArr, int i2, int i3, C1411zn c1411zn) throws qi6 {
        if ((i >>> 3) == 0) {
            qm5.m9918i("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return m6510c(bArr, i2, c1411zn);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return m6508a(bArr, i2, c1411zn) + c1411zn.f36190a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            qm5.m9918i("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = m6508a(bArr, i2, c1411zn);
            i6 = c1411zn.f36190a;
            if (i6 == i5) {
                break;
            }
            i2 = m6522o(i6, bArr, i2, i3, c1411zn);
        }
        if (i2 <= i3 && i6 == i5) {
            return i2;
        }
        qm5.m9918i("Failed to parse the message.");
        return 0;
    }
}
