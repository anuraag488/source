package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class iw4 implements jc2 {

    /* JADX INFO: renamed from: a */
    public static final iw4 f21851a = new iw4();

    /* JADX INFO: renamed from: b */
    public static final xf3 f21852b = new xf3("kotlin.uuid.Uuid", tf3.f31121r);

    @Override // p000.jc2
    /* JADX INFO: renamed from: b */
    public final Object mo13b(iv0 iv0Var) {
        String strMo5377A = iv0Var.mo5377A();
        int length = strMo5377A.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char cCharAt = strMo5377A.charAt(i);
                if ((cCharAt >>> '\b') == 0) {
                    long j3 = kw1.f23557b[cCharAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                oh6.m9083H(strMo5377A, i, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char cCharAt2 = strMo5377A.charAt(i2);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j6 = kw1.f23557b[cCharAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                oh6.m9083H(strMo5377A, i2, "a hexadecimal digit");
                throw null;
            }
            if (j != 0 || j4 != 0) {
                return new gw4(j, j4);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(strMo5377A.length() <= 64 ? strMo5377A : strMo5377A.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(strMo5377A.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j7 = 0;
            while (i < 8) {
                long j8 = j7 << 4;
                char cCharAt3 = strMo5377A.charAt(i);
                if ((cCharAt3 >>> '\b') == 0) {
                    long j9 = kw1.f23557b[cCharAt3];
                    if (j9 >= 0) {
                        j7 = j8 | j9;
                        i++;
                    }
                }
                oh6.m9083H(strMo5377A, i, "a hexadecimal digit");
                throw null;
            }
            if (strMo5377A.charAt(8) != '-') {
                oh6.m9083H(strMo5377A, 8, "'-' (hyphen)");
                throw null;
            }
            long j10 = 0;
            for (int i3 = 9; i3 < 13; i3++) {
                long j11 = j10 << 4;
                char cCharAt4 = strMo5377A.charAt(i3);
                if ((cCharAt4 >>> '\b') == 0) {
                    long j12 = kw1.f23557b[cCharAt4];
                    if (j12 >= 0) {
                        j10 = j11 | j12;
                    }
                }
                oh6.m9083H(strMo5377A, i3, "a hexadecimal digit");
                throw null;
            }
            if (strMo5377A.charAt(13) != '-') {
                oh6.m9083H(strMo5377A, 13, "'-' (hyphen)");
                throw null;
            }
            long j13 = 0;
            for (int i4 = 14; i4 < 18; i4++) {
                long j14 = j13 << 4;
                char cCharAt5 = strMo5377A.charAt(i4);
                if ((cCharAt5 >>> '\b') == 0) {
                    long j15 = kw1.f23557b[cCharAt5];
                    if (j15 >= 0) {
                        j13 = j14 | j15;
                    }
                }
                oh6.m9083H(strMo5377A, i4, "a hexadecimal digit");
                throw null;
            }
            if (strMo5377A.charAt(18) != '-') {
                oh6.m9083H(strMo5377A, 18, "'-' (hyphen)");
                throw null;
            }
            long j16 = 0;
            for (int i5 = 19; i5 < 23; i5++) {
                long j17 = j16 << 4;
                char cCharAt6 = strMo5377A.charAt(i5);
                if ((cCharAt6 >>> '\b') == 0) {
                    long j18 = kw1.f23557b[cCharAt6];
                    if (j18 >= 0) {
                        j16 = j17 | j18;
                    }
                }
                oh6.m9083H(strMo5377A, i5, "a hexadecimal digit");
                throw null;
            }
            if (strMo5377A.charAt(23) != '-') {
                oh6.m9083H(strMo5377A, 23, "'-' (hyphen)");
                throw null;
            }
            long j19 = 0;
            for (int i6 = 24; i6 < 36; i6++) {
                long j20 = j19 << 4;
                char cCharAt7 = strMo5377A.charAt(i6);
                if ((cCharAt7 >>> '\b') == 0) {
                    long j21 = kw1.f23557b[cCharAt7];
                    if (j21 >= 0) {
                        j19 = j20 | j21;
                    }
                }
                oh6.m9083H(strMo5377A, i6, "a hexadecimal digit");
                throw null;
            }
            long j22 = (j7 << 32) | (j10 << 16) | j13;
            long j23 = (j16 << 48) | j19;
            if (j22 != 0 || j23 != 0) {
                return new gw4(j22, j23);
            }
        }
        return gw4.f20153c;
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        g81Var.mo5916B(((gw4) obj).toString());
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return f21852b;
    }
}
