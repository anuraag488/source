package p000;

import java.lang.invoke.VarHandle;
import org.chromium.net.NetError;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d52 implements jc2 {

    /* JADX INFO: renamed from: a */
    public static final d52 f16786a = new d52();

    /* JADX INFO: renamed from: b */
    public static final xf3 f16787b = new xf3("kotlin.time.Instant", tf3.f31121r);

    /* JADX WARN: Code duplicated, block: B:196:0x046f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0485  */
    /* JADX WARN: Instruction removed from duplicated block: B:197:0x0485, please report this as an issue */
    @Override // p000.jc2
    /* JADX INFO: renamed from: b */
    public final Object mo13b(iv0 iv0Var) {
        int i;
        a52 a52VarM12875x0;
        int i2;
        int i3;
        int i4;
        char cCharAt;
        c52 c52VarM12876y0;
        char cCharAt2;
        x42 x42Var = x42.f33977c;
        String strMo5377A = iv0Var.mo5377A();
        if (strMo5377A.length() == 0) {
            c52VarM12876y0 = new a52("An empty string is not a valid Instant", strMo5377A);
        } else {
            char cCharAt3 = strMo5377A.charAt(0);
            if (cCharAt3 == '+' || cCharAt3 == '-') {
                i = 1;
            } else {
                i = 0;
                cCharAt3 = ' ';
            }
            int iCharAt = 0;
            int i5 = i;
            while (i5 < strMo5377A.length() && '0' <= (cCharAt2 = strMo5377A.charAt(i5)) && cCharAt2 < ':') {
                iCharAt = (iCharAt * 10) + (strMo5377A.charAt(i5) - '0');
                i5++;
            }
            int i6 = i5 - i;
            if (i6 > 10) {
                c52VarM12876y0 = y42.m12876y0(strMo5377A, "Expected at most 10 digits for the year number, got " + i6 + " digits");
            } else if (i6 == 10 && strMo5377A.charAt(i) >= '2') {
                c52VarM12876y0 = y42.m12876y0(strMo5377A, "Expected at most 9 digits for the year number or year 1000000000, got " + i6 + " digits");
            } else if (i6 < 4) {
                c52VarM12876y0 = y42.m12876y0(strMo5377A, "The year number must be padded to 4 digits, got " + i6 + " digits");
            } else if (cCharAt3 == '+' && i6 == 4) {
                c52VarM12876y0 = y42.m12876y0(strMo5377A, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (cCharAt3 != ' ' || i6 == 4) {
                if (cCharAt3 == '-') {
                    iCharAt = -iCharAt;
                }
                int i7 = i5 + 16;
                if (strMo5377A.length() < i7) {
                    c52VarM12876y0 = y42.m12876y0(strMo5377A, "The input string is too short");
                } else {
                    a52 a52VarM12875x1 = y42.m12875x0(strMo5377A, "'-'", i5, new el1((byte) 10));
                    if (a52VarM12875x1 == null && (a52VarM12875x1 = y42.m12875x0(strMo5377A, "'-'", i5 + 3, new el1((byte) 11))) == null && (a52VarM12875x1 = y42.m12875x0(strMo5377A, "'T' or 't'", i5 + 6, new el1((byte) 12))) == null && (a52VarM12875x1 = y42.m12875x0(strMo5377A, "':'", i5 + 9, new el1((byte) 13))) == null) {
                        a52VarM12875x0 = y42.m12875x0(strMo5377A, "':'", i5 + 12, new el1((byte) 14));
                        if (a52VarM12875x0 == null) {
                            c52VarM12876y0 = a52VarM12875x0;
                            int[] iArr = y42.f34864f;
                            for (int i8 = 0; i8 < 10; i8++) {
                                a52 a52VarM12875x2 = y42.m12875x0(strMo5377A, "an ASCII digit", iArr[i8] + i5, new el1((byte) 15));
                                if (a52VarM12875x2 != null) {
                                    c52VarM12876y0 = a52VarM12875x2;
                                }
                            }
                            int iM12877z0 = y42.m12877z0(i5 + 1, strMo5377A);
                            int iM12877z1 = y42.m12877z0(i5 + 4, strMo5377A);
                            int iM12877z2 = y42.m12877z0(i5 + 7, strMo5377A);
                            int iM12877z3 = y42.m12877z0(i5 + 10, strMo5377A);
                            int iM12877z4 = y42.m12877z0(i5 + 13, strMo5377A);
                            int i9 = i5 + 15;
                            if (strMo5377A.charAt(i9) == '.') {
                                i9 = i7;
                                int iCharAt2 = 0;
                                while (i9 < strMo5377A.length() && '0' <= (cCharAt = strMo5377A.charAt(i9)) && cCharAt < ':') {
                                    iCharAt2 = (iCharAt2 * 10) + (strMo5377A.charAt(i9) - '0');
                                    i9++;
                                }
                                int i10 = i9 - i7;
                                if (1 > i10 || i10 >= 10) {
                                    c52VarM12876y0 = y42.m12876y0(strMo5377A, "1..9 digits are supported for the fraction of the second, got " + i10 + " digits");
                                } else {
                                    i2 = iCharAt2 * y42.f34863e[9 - i10];
                                }
                            } else {
                                i2 = 0;
                            }
                            if (i9 >= strMo5377A.length()) {
                                c52VarM12876y0 = y42.m12876y0(strMo5377A, "The UTC offset at the end of the string is missing");
                            } else {
                                char cCharAt4 = strMo5377A.charAt(i9);
                                if (cCharAt4 == '+' || cCharAt4 == '-') {
                                    int length = strMo5377A.length() - i9;
                                    if (length > 9) {
                                        c52VarM12876y0 = y42.m12876y0(strMo5377A, "The UTC offset string \"" + y42.m12835J0(16, strMo5377A.subSequence(i9, strMo5377A.length()).toString()) + "\" is too long");
                                    } else if (length % 3 != 0) {
                                        c52VarM12876y0 = y42.m12876y0(strMo5377A, "Invalid UTC offset string \"" + strMo5377A.subSequence(i9, strMo5377A.length()).toString() + '\"');
                                    } else {
                                        int[] iArr2 = y42.f34865g;
                                        int i11 = 0;
                                        for (int i12 = 2; i11 < i12; i12 = 2) {
                                            int i13 = i9 + iArr2[i11];
                                            if (i13 >= strMo5377A.length()) {
                                                break;
                                            }
                                            if (strMo5377A.charAt(i13) != ':') {
                                                StringBuilder sbM3883o = c75.m3883o("Expected ':' at index ", i13, ", got '");
                                                sbM3883o.append(strMo5377A.charAt(i13));
                                                sbM3883o.append('\'');
                                                c52VarM12876y0 = y42.m12876y0(strMo5377A, sbM3883o.toString());
                                            } else {
                                                i11++;
                                            }
                                        }
                                        int[] iArr3 = y42.f34866h;
                                        int i14 = 0;
                                        while (i14 < 6 && (i4 = iArr3[i14] + i9) < strMo5377A.length()) {
                                            char cCharAt5 = strMo5377A.charAt(i4);
                                            int[] iArr4 = iArr3;
                                            if ('0' > cCharAt5 || cCharAt5 >= ':') {
                                                StringBuilder sbM3883o2 = c75.m3883o("Expected an ASCII digit at index ", i4, ", got '");
                                                sbM3883o2.append(strMo5377A.charAt(i4));
                                                sbM3883o2.append('\'');
                                                c52VarM12876y0 = y42.m12876y0(strMo5377A, sbM3883o2.toString());
                                            } else {
                                                i14++;
                                                iArr3 = iArr4;
                                            }
                                        }
                                        int iM12877z5 = y42.m12877z0(i9 + 1, strMo5377A);
                                        int iM12877z6 = length > 3 ? y42.m12877z0(i9 + 4, strMo5377A) : 0;
                                        int iM12877z7 = length > 6 ? y42.m12877z0(i9 + 7, strMo5377A) : 0;
                                        if (iM12877z6 > 59) {
                                            c52VarM12876y0 = y42.m12876y0(strMo5377A, "Expected offset-minute-of-hour in 0..59, got " + iM12877z6);
                                        } else if (iM12877z7 > 59) {
                                            c52VarM12876y0 = y42.m12876y0(strMo5377A, "Expected offset-second-of-minute in 0..59, got " + iM12877z7);
                                        } else if (iM12877z5 <= 17 || (iM12877z5 == 18 && iM12877z6 == 0 && iM12877z7 == 0)) {
                                            i3 = ((iM12877z6 * 60) + (iM12877z5 * 3600) + iM12877z7) * (cCharAt4 == '-' ? -1 : 1);
                                            if (1 <= iM12877z0 || iM12877z0 >= 13) {
                                                c52VarM12876y0 = y42.m12876y0(strMo5377A, "Expected a month number in 1..12, got " + iM12877z0);
                                            } else if (1 > iM12877z1) {
                                                StringBuilder sbM13624x = zi4.m13624x("Expected a valid day-of-month for month ", iM12877z0, " of year ", iCharAt, ", got ");
                                                sbM13624x.append(iM12877z1);
                                                c52VarM12876y0 = y42.m12876y0(strMo5377A, sbM13624x.toString());
                                            } else {
                                                int i15 = iCharAt & 3;
                                                if (iM12877z1 > (iM12877z0 != 2 ? (iM12877z0 == 4 || iM12877z0 == 6 || iM12877z0 == 9 || iM12877z0 == 11) ? 30 : 31 : i15 == 0 && (iCharAt % 100 != 0 || iCharAt % 400 == 0) ? 29 : 28)) {
                                                    StringBuilder sbM13624x2 = zi4.m13624x("Expected a valid day-of-month for month ", iM12877z0, " of year ", iCharAt, ", got ");
                                                    sbM13624x2.append(iM12877z1);
                                                    c52VarM12876y0 = y42.m12876y0(strMo5377A, sbM13624x2.toString());
                                                } else if (iM12877z2 > 23) {
                                                    c52VarM12876y0 = y42.m12876y0(strMo5377A, "Expected hour in 0..23, got " + iM12877z2);
                                                } else if (iM12877z3 > 59) {
                                                    c52VarM12876y0 = y42.m12876y0(strMo5377A, "Expected minute-of-hour in 0..59, got " + iM12877z3);
                                                } else if (iM12877z4 > 59) {
                                                    c52VarM12876y0 = y42.m12876y0(strMo5377A, "Expected second-of-minute in 0..59, got " + iM12877z4);
                                                } else {
                                                    long j = iCharAt;
                                                    long j2 = 365 * j;
                                                    long j3 = (j >= 0 ? ((j + 399) / 400) + (((j + 3) / 4) - ((j + 99) / 100)) + j2 : j2 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + ((long) (((iM12877z0 * 367) + NetError.ERR_HTTP2_FRAME_SIZE_ERROR) / 12)) + ((long) (iM12877z1 - 1));
                                                    if (iM12877z0 > 2) {
                                                        j3 = (i15 != 0 || (iCharAt % 100 == 0 && iCharAt % 400 != 0)) ? j3 - 2 : (-1) + j3;
                                                    }
                                                    b52 b52Var = new b52();
                                                    b52Var.f15086a = (((j3 - 719528) * 86400) + ((long) (((iM12877z3 * 60) + (iM12877z2 * 3600)) + iM12877z4))) - ((long) i3);
                                                    b52Var.f15087b = i2;
                                                    VarHandle.storeStoreFence();
                                                    c52VarM12876y0 = b52Var;
                                                }
                                            }
                                        } else {
                                            c52VarM12876y0 = y42.m12876y0(strMo5377A, "Expected an offset in -18:00..+18:00, got " + strMo5377A.subSequence(i9, strMo5377A.length()).toString());
                                        }
                                    }
                                } else if (cCharAt4 == 'Z' || cCharAt4 == 'z') {
                                    int i16 = i9 + 1;
                                    if (strMo5377A.length() == i16) {
                                        i3 = 0;
                                        if (1 <= iM12877z0) {
                                            c52VarM12876y0 = y42.m12876y0(strMo5377A, "Expected a month number in 1..12, got " + iM12877z0);
                                        } else {
                                            c52VarM12876y0 = y42.m12876y0(strMo5377A, "Expected a month number in 1..12, got " + iM12877z0);
                                        }
                                    } else {
                                        c52VarM12876y0 = y42.m12876y0(strMo5377A, "Extra text after the instant at position " + i16);
                                    }
                                } else {
                                    c52VarM12876y0 = y42.m12876y0(strMo5377A, "Expected the UTC offset at position " + i9 + ", got '" + cCharAt4 + '\'');
                                }
                            }
                        }
                    } else {
                        c52VarM12876y0 = a52VarM12875x1;
                    }
                }
            } else {
                c52VarM12876y0 = y42.m12876y0(strMo5377A, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        c52VarM12876y0 = a52VarM12875x0;
        return c52VarM12876y0.toInstant();
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        g81Var.mo5916B(((x42) obj).toString());
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return f16787b;
    }
}
