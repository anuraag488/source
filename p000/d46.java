package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class d46 {
    /* JADX INFO: renamed from: a */
    public static int m4340a(byte[] bArr, int i, C1411zn c1411zn) throws g86 {
        int iM4347h = m4347h(bArr, i, c1411zn);
        int i2 = c1411zn.f36190a;
        if (i2 < 0) {
            qm5.m9917h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iM4347h) {
            qm5.m9917h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            c1411zn.f36192c = r46.f29010b;
            return iM4347h;
        }
        c1411zn.f36192c = r46.m10202r(bArr, iM4347h, i2);
        return iM4347h + i2;
    }

    /* JADX INFO: renamed from: b */
    public static void m4341b(int i) {
        boolean z = true;
        if (i != 100 && i != 102 && i != 104) {
            if (i == 105) {
                i = 105;
            } else {
                z = false;
            }
        }
        Object[] objArr = {Integer.valueOf(i)};
        if (!z) {
            throw new IllegalArgumentException(String.format("priority %d must be a Priority.PRIORITY_* constant", objArr));
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m4342c(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* JADX INFO: renamed from: d */
    public static String m4343d(int i) {
        if (i == 100) {
            return "HIGH_ACCURACY";
        }
        if (i == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i == 104) {
            return "LOW_POWER";
        }
        if (i == 105) {
            return "PASSIVE";
        }
        ds3.m4665g();
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static int m4344e(na6 na6Var, int i, byte[] bArr, int i2, int i3, f76 f76Var, C1411zn c1411zn) throws g86 {
        s66 s66VarMo8654a = na6Var.mo8654a();
        na6 na6Var2 = na6Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        C1411zn c1411zn2 = c1411zn;
        int iM4352m = m4352m(s66VarMo8654a, na6Var2, bArr2, i2, i4, c1411zn2);
        na6Var2.mo8656c(s66VarMo8654a);
        c1411zn2.f36192c = s66VarMo8654a;
        f76Var.add(s66VarMo8654a);
        while (iM4352m < i4) {
            C1411zn c1411zn3 = c1411zn2;
            int i5 = i4;
            int iM4347h = m4347h(bArr2, iM4352m, c1411zn3);
            if (i != c1411zn3.f36190a) {
                break;
            }
            byte[] bArr3 = bArr2;
            na6 na6Var3 = na6Var2;
            s66 s66VarMo8654a2 = na6Var3.mo8654a();
            iM4352m = m4352m(s66VarMo8654a2, na6Var3, bArr3, iM4347h, i5, c1411zn3);
            na6Var2 = na6Var3;
            bArr2 = bArr3;
            i4 = i5;
            c1411zn2 = c1411zn3;
            na6Var2.mo8656c(s66VarMo8654a2);
            c1411zn2.f36192c = s66VarMo8654a2;
            f76Var.add(s66VarMo8654a2);
        }
        return iM4352m;
    }

    /* JADX INFO: renamed from: f */
    public static int m4345f(byte[] bArr, int i, f76 f76Var, C1411zn c1411zn) throws g86 {
        u66 u66Var = (u66) f76Var;
        int iM4347h = m4347h(bArr, i, c1411zn);
        int i2 = c1411zn.f36190a;
        if (i2 < 0) {
            qm5.m9917h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iM4347h) {
            qm5.m9917h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i3 = i2 + iM4347h;
        while (iM4347h < i3) {
            iM4347h = m4347h(bArr, iM4347h, c1411zn);
            u66Var.m11267d(c1411zn.f36190a);
        }
        if (iM4347h == i3) {
            return iM4347h;
        }
        qm5.m9917h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public static int m4346g(int i, byte[] bArr, int i2, int i3, mb6 mb6Var, C1411zn c1411zn) throws g86 {
        if ((i >>> 3) == 0) {
            qm5.m9917h("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM4350k = m4350k(bArr, i2, c1411zn);
            mb6Var.m8269c(i, Long.valueOf(c1411zn.f36191b));
            return iM4350k;
        }
        if (i4 == 1) {
            mb6Var.m8269c(i, Long.valueOf(m4353n(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM4347h = m4347h(bArr, i2, c1411zn);
            int i5 = c1411zn.f36190a;
            if (i5 < 0) {
                qm5.m9917h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iM4347h) {
                qm5.m9917h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                mb6Var.m8269c(i, r46.f29010b);
            } else {
                mb6Var.m8269c(i, r46.m10202r(bArr, iM4347h, i5));
            }
            return iM4347h + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                mb6Var.m8269c(i, Integer.valueOf(m4342c(i2, bArr)));
                return i2 + 4;
            }
            qm5.m9917h("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        mb6 mb6VarM8267b = mb6.m8267b();
        int i7 = c1411zn.f36193d + 1;
        c1411zn.f36193d = i7;
        m4354o(i7);
        int i8 = 0;
        while (i2 < i3) {
            int iM4347h2 = m4347h(bArr, i2, c1411zn);
            int i9 = c1411zn.f36190a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iM4347h2;
                break;
            }
            i2 = m4346g(i9, bArr, iM4347h2, i3, mb6VarM8267b, c1411zn);
            i8 = i9;
        }
        c1411zn.f36193d--;
        if (i2 > i3 || i8 != i6) {
            qm5.m9917h("Failed to parse the message.");
            return 0;
        }
        mb6Var.m8269c(i, mb6VarM8267b);
        return i2;
    }

    /* JADX INFO: renamed from: h */
    public static int m4347h(byte[] bArr, int i, C1411zn c1411zn) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m4348i(b, bArr, i2, c1411zn);
        }
        c1411zn.f36190a = b;
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public static int m4348i(int i, byte[] bArr, int i2, C1411zn c1411zn) {
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

    /* JADX INFO: renamed from: j */
    public static int m4349j(int i, byte[] bArr, int i2, int i3, f76 f76Var, C1411zn c1411zn) {
        u66 u66Var = (u66) f76Var;
        int iM4347h = m4347h(bArr, i2, c1411zn);
        u66Var.m11267d(c1411zn.f36190a);
        while (iM4347h < i3) {
            int iM4347h2 = m4347h(bArr, iM4347h, c1411zn);
            if (i != c1411zn.f36190a) {
                break;
            }
            iM4347h = m4347h(bArr, iM4347h2, c1411zn);
            u66Var.m11267d(c1411zn.f36190a);
        }
        return iM4347h;
    }

    /* JADX INFO: renamed from: k */
    public static int m4350k(byte[] bArr, int i, C1411zn c1411zn) {
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

    /* JADX INFO: renamed from: l */
    public static int m4351l(Object obj, na6 na6Var, byte[] bArr, int i, int i2, int i3, C1411zn c1411zn) throws g86 {
        int i4 = c1411zn.f36193d + 1;
        c1411zn.f36193d = i4;
        m4354o(i4);
        int iM10580r = ((s96) na6Var).m10580r(obj, bArr, i, i2, i3, c1411zn);
        c1411zn.f36193d--;
        c1411zn.f36192c = obj;
        return iM10580r;
    }

    /* JADX INFO: renamed from: m */
    public static int m4352m(Object obj, na6 na6Var, byte[] bArr, int i, int i2, C1411zn c1411zn) throws g86 {
        int iM4348i = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM4348i = m4348i(i3, bArr, iM4348i, c1411zn);
            i3 = c1411zn.f36190a;
        }
        int i4 = iM4348i;
        if (i3 < 0 || i3 > i2 - i4) {
            qm5.m9917h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = c1411zn.f36193d + 1;
        c1411zn.f36193d = i5;
        m4354o(i5);
        int i6 = i4 + i3;
        na6Var.mo8662i(obj, bArr, i4, i6, c1411zn);
        c1411zn.f36193d--;
        c1411zn.f36192c = obj;
        return i6;
    }

    /* JADX INFO: renamed from: n */
    public static long m4353n(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: o */
    public static void m4354o(int i) throws g86 {
        if (i < 100) {
            return;
        }
        qm5.m9917h("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }
}
