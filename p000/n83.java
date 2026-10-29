package p000;

import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25531a;

    /* JADX INFO: renamed from: b */
    public int f25532b;

    /* JADX INFO: renamed from: c */
    public int f25533c;

    /* JADX INFO: renamed from: d */
    public Object f25534d;

    /* JADX INFO: renamed from: e */
    public Object f25535e;

    public n83(byte[] bArr, int i, byte b) {
        this.f25531a = b;
        switch (b) {
            case 4:
                int length = bArr.length;
                if (((length - i) | i) < 0) {
                    Locale locale = Locale.US;
                    C1077qn.m9987m(zi4.m13618r(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
                    throw null;
                }
                this.f25535e = bArr;
                this.f25533c = 0;
                this.f25532b = i;
                return;
            default:
                int length2 = bArr.length;
                if (((length2 - i) | i) < 0) {
                    Locale locale2 = Locale.US;
                    C1077qn.m9987m(zi4.m13618r(length2, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
                    throw null;
                }
                this.f25535e = bArr;
                this.f25533c = 0;
                this.f25532b = i;
                return;
        }
    }

    /* JADX INFO: renamed from: B */
    public static int m8593B(int i) {
        return c75.m3875g(i, 9, 352) >>> 6;
    }

    /* JADX INFO: renamed from: D */
    public static int m8594D(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: A */
    public void m8595A(long j) throws za0 {
        switch (this.f25531a) {
            case 3:
                long j2 = j & (-128);
                int i = this.f25533c;
                byte[] bArr = (byte[]) this.f25535e;
                try {
                    if (j2 == 0) {
                        bArr[i] = (byte) j;
                        this.f25533c = i + 1;
                    } else {
                        bArr[i] = (byte) (((int) j) | 128);
                        int i2 = i + 1;
                        long j3 = j >>> 7;
                        long j4 = j3 & (-128);
                        int i3 = (int) j3;
                        if (j4 == 0) {
                            bArr[i2] = (byte) i3;
                            this.f25533c = i + 2;
                        } else {
                            bArr[i2] = (byte) (i3 | 128);
                            int i4 = i + 2;
                            long j5 = j >>> 14;
                            long j6 = j5 & (-128);
                            int i5 = (int) j5;
                            if (j6 == 0) {
                                bArr[i4] = (byte) i5;
                                this.f25533c = i + 3;
                            } else {
                                bArr[i4] = (byte) (i5 | 128);
                                int i6 = i + 3;
                                long j7 = j >>> 21;
                                long j8 = j7 & (-128);
                                int i7 = (int) j7;
                                if (j8 == 0) {
                                    bArr[i6] = (byte) i7;
                                    this.f25533c = i + 4;
                                } else {
                                    bArr[i6] = (byte) (i7 | 128);
                                    int i8 = i + 4;
                                    long j9 = j >>> 28;
                                    long j10 = j9 & (-128);
                                    int i9 = (int) j9;
                                    if (j10 == 0) {
                                        bArr[i8] = (byte) i9;
                                        this.f25533c = i + 5;
                                    } else {
                                        bArr[i8] = (byte) (i9 | 128);
                                        int i10 = i + 5;
                                        long j11 = j >>> 35;
                                        long j12 = j11 & (-128);
                                        int i11 = (int) j11;
                                        if (j12 == 0) {
                                            bArr[i10] = (byte) i11;
                                            this.f25533c = i + 6;
                                        } else {
                                            bArr[i10] = (byte) (i11 | 128);
                                            int i12 = i + 6;
                                            long j13 = j >>> 42;
                                            long j14 = j13 & (-128);
                                            int i13 = (int) j13;
                                            if (j14 == 0) {
                                                bArr[i12] = (byte) i13;
                                                this.f25533c = i + 7;
                                            } else {
                                                bArr[i12] = (byte) (i13 | 128);
                                                int i14 = i + 7;
                                                long j15 = j >>> 49;
                                                long j16 = j15 & (-128);
                                                int i15 = (int) j15;
                                                if (j16 == 0) {
                                                    bArr[i14] = (byte) i15;
                                                    this.f25533c = i + 8;
                                                } else {
                                                    bArr[i14] = (byte) (i15 | 128);
                                                    int i16 = i + 8;
                                                    long j17 = j >>> 56;
                                                    long j18 = j17 & (-128);
                                                    int i17 = (int) j17;
                                                    if (j18 == 0) {
                                                        bArr[i16] = (byte) i17;
                                                        this.f25533c = i + 9;
                                                    } else {
                                                        bArr[i16] = (byte) (i17 | 128);
                                                        bArr[i + 9] = (byte) (j >>> 63);
                                                        this.f25533c = i + 10;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return;
                } catch (IndexOutOfBoundsException e) {
                    throw new za0(i, this.f25532b, 1, e, (byte) 3);
                }
            default:
                long j19 = j & (-128);
                int i18 = this.f25533c;
                byte[] bArr2 = (byte[]) this.f25535e;
                try {
                    if (j19 == 0) {
                        bArr2[i18] = (byte) j;
                        this.f25533c = i18 + 1;
                    } else {
                        bArr2[i18] = (byte) (((int) j) | 128);
                        int i19 = i18 + 1;
                        long j20 = j >>> 7;
                        long j21 = j20 & (-128);
                        int i20 = (int) j20;
                        if (j21 == 0) {
                            bArr2[i19] = (byte) i20;
                            this.f25533c = i18 + 2;
                        } else {
                            bArr2[i19] = (byte) (i20 | 128);
                            int i21 = i18 + 2;
                            long j22 = j >>> 14;
                            long j23 = j22 & (-128);
                            int i22 = (int) j22;
                            if (j23 == 0) {
                                bArr2[i21] = (byte) i22;
                                this.f25533c = i18 + 3;
                            } else {
                                bArr2[i21] = (byte) (i22 | 128);
                                int i23 = i18 + 3;
                                long j24 = j >>> 21;
                                long j25 = j24 & (-128);
                                int i24 = (int) j24;
                                if (j25 == 0) {
                                    bArr2[i23] = (byte) i24;
                                    this.f25533c = i18 + 4;
                                } else {
                                    bArr2[i23] = (byte) (i24 | 128);
                                    int i25 = i18 + 4;
                                    long j26 = j >>> 28;
                                    long j27 = j26 & (-128);
                                    int i26 = (int) j26;
                                    if (j27 == 0) {
                                        bArr2[i25] = (byte) i26;
                                        this.f25533c = i18 + 5;
                                    } else {
                                        bArr2[i25] = (byte) (i26 | 128);
                                        int i27 = i18 + 5;
                                        long j28 = j >>> 35;
                                        long j29 = j28 & (-128);
                                        int i28 = (int) j28;
                                        if (j29 == 0) {
                                            bArr2[i27] = (byte) i28;
                                            this.f25533c = i18 + 6;
                                        } else {
                                            bArr2[i27] = (byte) (i28 | 128);
                                            int i29 = i18 + 6;
                                            long j30 = j >>> 42;
                                            long j31 = j30 & (-128);
                                            int i30 = (int) j30;
                                            if (j31 == 0) {
                                                bArr2[i29] = (byte) i30;
                                                this.f25533c = i18 + 7;
                                            } else {
                                                bArr2[i29] = (byte) (i30 | 128);
                                                int i31 = i18 + 7;
                                                long j32 = j >>> 49;
                                                long j33 = j32 & (-128);
                                                int i32 = (int) j32;
                                                if (j33 == 0) {
                                                    bArr2[i31] = (byte) i32;
                                                    this.f25533c = i18 + 8;
                                                } else {
                                                    bArr2[i31] = (byte) (i32 | 128);
                                                    int i33 = i18 + 8;
                                                    long j34 = j >>> 56;
                                                    long j35 = j34 & (-128);
                                                    int i34 = (int) j34;
                                                    if (j35 == 0) {
                                                        bArr2[i33] = (byte) i34;
                                                        this.f25533c = i18 + 9;
                                                    } else {
                                                        bArr2[i33] = (byte) (i34 | 128);
                                                        bArr2[i18 + 9] = (byte) (j >>> 63);
                                                        this.f25533c = i18 + 10;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return;
                } catch (IndexOutOfBoundsException e2) {
                    throw new za0(i18, this.f25532b, 1, e2, (byte) 6);
                }
        }
    }

    /* JADX INFO: renamed from: C */
    public void m8596C() {
        int i = this.f25532b;
        int i2 = this.f25533c;
        if (i - i2 > 0) {
            C1077qn.m9989o("Did not write as much data as expected.");
        } else {
            if (i - i2 >= 0) {
                return;
            }
            C1077qn.m9989o("Wrote more data than expected.");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m8597a(int i) {
        int i2 = this.f25532b;
        int i3 = this.f25533c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbM13624x = zi4.m13624x("Invalid offset: ", i, ". Valid range is [", i2, " , ");
        sbM13624x.append(i3);
        sbM13624x.append("]");
        r32.m10186a(sbM13624x.toString());
    }

    /* JADX INFO: renamed from: b */
    public int m8598b() {
        xa0 xa0Var = (xa0) this.f25535e;
        String str = (String) this.f25534d;
        if (xa0Var == null) {
            return str.length();
        }
        return (xa0Var.f34092b - xa0Var.m12596c()) + (str.length() - (this.f25533c - this.f25532b));
    }

    /* JADX INFO: renamed from: c */
    public boolean m8599c(int i) {
        CharSequence charSequence = (CharSequence) this.f25534d;
        int i2 = this.f25532b + 1;
        if (i > this.f25533c || i2 > i) {
            return false;
        }
        return Character.isLetterOrDigit(Character.codePointBefore(charSequence, i)) || Character.isSurrogate(charSequence.charAt(i - 1));
    }

    /* JADX INFO: renamed from: d */
    public boolean m8600d(int i) {
        int i2 = this.f25532b + 1;
        if (i > this.f25533c || i2 > i) {
            return false;
        }
        return i25.m6628x(Character.codePointBefore((CharSequence) this.f25534d, i));
    }

    /* JADX INFO: renamed from: e */
    public boolean m8601e(int i) {
        m8597a(i);
        if (!((BreakIterator) this.f25535e).isBoundary(i)) {
            return false;
        }
        if (m8603g(i) && m8603g(i - 1) && m8603g(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.f25534d).length() - 1 || !(m8602f(i) || m8602f(i + 1));
    }

    /* JADX INFO: renamed from: f */
    public boolean m8602f(int i) {
        CharSequence charSequence = (CharSequence) this.f25534d;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (z62.m13387o(unicodeBlockOf, unicodeBlock) && z62.m13387o(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return z62.m13387o(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && z62.m13387o(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    /* JADX INFO: renamed from: g */
    public boolean m8603g(int i) {
        CharSequence charSequence = (CharSequence) this.f25534d;
        int i2 = this.f25532b;
        if (i >= this.f25533c || i2 > i) {
            return false;
        }
        return Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) || Character.isSurrogate(charSequence.charAt(i));
    }

    /* JADX INFO: renamed from: h */
    public boolean m8604h(int i) {
        int i2 = this.f25532b;
        if (i >= this.f25533c || i2 > i) {
            return false;
        }
        return i25.m6628x(Character.codePointAt((CharSequence) this.f25534d, i));
    }

    /* JADX INFO: renamed from: i */
    public int m8605i(int i) {
        m8597a(i);
        int iFollowing = ((BreakIterator) this.f25535e).following(i);
        return (m8603g(iFollowing + (-1)) && m8603g(iFollowing) && !m8602f(iFollowing)) ? m8605i(iFollowing) : iFollowing;
    }

    /* JADX INFO: renamed from: j */
    public int m8606j(int i) {
        m8597a(i);
        int iPreceding = ((BreakIterator) this.f25535e).preceding(i);
        return (m8603g(iPreceding) && m8599c(iPreceding) && !m8602f(iPreceding)) ? m8606j(iPreceding) : iPreceding;
    }

    /* JADX INFO: renamed from: k */
    public void m8607k(int i, String str, int i2) {
        if (i > i2) {
            r32.m10186a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            r32.m10186a("start must be non-negative, but was " + i);
        }
        xa0 xa0Var = (xa0) this.f25535e;
        byte b = 2;
        if (xa0Var == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.f25534d).length() - i2, 64);
            int i3 = i - iMin;
            ((String) this.f25534d).getChars(i3, i, cArr, 0);
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            ((String) this.f25534d).getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            xa0 xa0Var2 = new xa0(b);
            xa0Var2.f34092b = iMax;
            xa0Var2.f34095e = cArr;
            xa0Var2.f34093c = length;
            xa0Var2.f34094d = i4;
            this.f25535e = xa0Var2;
            this.f25532b = i3;
            this.f25533c = i5;
            return;
        }
        int i6 = this.f25532b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > xa0Var.f34092b - xa0Var.m12596c()) {
            this.f25534d = toString();
            this.f25535e = null;
            this.f25532b = -1;
            this.f25533c = -1;
            m8607k(i, str, i2);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > xa0Var.m12596c()) {
            int iM12596c = length2 - xa0Var.m12596c();
            int i9 = xa0Var.f34092b * 2;
            while (i9 - xa0Var.f34092b < iM12596c) {
                i9 *= 2;
            }
            char[] cArr2 = new char[i9];
            System.arraycopy((char[]) xa0Var.f34095e, 0, cArr2, 0, xa0Var.f34093c);
            int i10 = xa0Var.f34092b;
            int i11 = xa0Var.f34094d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy((char[]) xa0Var.f34095e, i11, cArr2, i13, (i12 + i11) - i11);
            xa0Var.f34095e = cArr2;
            xa0Var.f34092b = i9;
            xa0Var.f34094d = i13;
        }
        int i14 = xa0Var.f34093c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) xa0Var.f34095e;
            System.arraycopy(cArr3, i8, cArr3, xa0Var.f34094d - i15, i15);
            xa0Var.f34093c = i7;
            xa0Var.f34094d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iM12596c2 = xa0Var.m12596c() + i7;
            int iM12596c3 = xa0Var.m12596c() + i8;
            int i16 = xa0Var.f34094d;
            int i17 = iM12596c2 - i16;
            char[] cArr4 = (char[]) xa0Var.f34095e;
            System.arraycopy(cArr4, i16, cArr4, xa0Var.f34093c, i17);
            i7 = xa0Var.f34093c + i17;
            xa0Var.f34093c = i7;
            xa0Var.f34094d = iM12596c3;
        } else {
            xa0Var.f34094d = xa0Var.m12596c() + i8;
            xa0Var.f34093c = i7;
        }
        str.getChars(0, str.length(), (char[]) xa0Var.f34095e, i7);
        xa0Var.f34093c = str.length() + xa0Var.f34093c;
    }

    /* JADX INFO: renamed from: l */
    public void m8608l(byte b) throws za0 {
        IndexOutOfBoundsException indexOutOfBoundsException;
        IndexOutOfBoundsException indexOutOfBoundsException2;
        switch (this.f25531a) {
            case 3:
                int i = this.f25533c;
                try {
                    int i2 = i + 1;
                    try {
                        ((byte[]) this.f25535e)[i] = b;
                        this.f25533c = i2;
                        return;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i = i2;
                        throw new za0(i, this.f25532b, 1, indexOutOfBoundsException, (byte) 3);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                }
                break;
            default:
                int i3 = this.f25533c;
                try {
                    int i4 = i3 + 1;
                    try {
                        ((byte[]) this.f25535e)[i3] = b;
                        this.f25533c = i4;
                        return;
                    } catch (IndexOutOfBoundsException e3) {
                        indexOutOfBoundsException2 = e3;
                        i3 = i4;
                        throw new za0(i3, this.f25532b, 1, indexOutOfBoundsException2, (byte) 6);
                    }
                } catch (IndexOutOfBoundsException e4) {
                    indexOutOfBoundsException2 = e4;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m8609m(byte[] bArr, int i, int i2) {
        switch (this.f25531a) {
            case 3:
                try {
                    System.arraycopy(bArr, i, (byte[]) this.f25535e, this.f25533c, i2);
                    this.f25533c += i2;
                    return;
                } catch (IndexOutOfBoundsException e) {
                    throw new za0(this.f25533c, this.f25532b, i2, e, (byte) 3);
                }
            default:
                try {
                    System.arraycopy(bArr, i, (byte[]) this.f25535e, this.f25533c, i2);
                    this.f25533c += i2;
                    return;
                } catch (IndexOutOfBoundsException e2) {
                    throw new za0(this.f25533c, this.f25532b, i2, e2, (byte) 6);
                }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m8610n(int i, r46 r46Var) {
        m8621y((i << 3) | 2);
        m8621y(r46Var.mo8519d());
        r46Var.mo8522l(this);
    }

    /* JADX INFO: renamed from: o */
    public void m8611o(int i, aj6 aj6Var) {
        m8621y((i << 3) | 2);
        m8621y(aj6Var.mo3015d());
        aj6Var.mo3018l(this);
    }

    /* JADX INFO: renamed from: p */
    public void m8612p(int i, int i2) throws za0 {
        switch (this.f25531a) {
            case 3:
                m8621y((i << 3) | 5);
                m8613q(i2);
                break;
            default:
                m8621y((i << 3) | 5);
                m8613q(i2);
                break;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m8613q(int i) throws za0 {
        switch (this.f25531a) {
            case 3:
                int i2 = this.f25533c;
                try {
                    byte[] bArr = (byte[]) this.f25535e;
                    bArr[i2] = (byte) i;
                    bArr[i2 + 1] = (byte) (i >> 8);
                    bArr[i2 + 2] = (byte) (i >> 16);
                    bArr[i2 + 3] = (byte) (i >> 24);
                    this.f25533c = i2 + 4;
                    return;
                } catch (IndexOutOfBoundsException e) {
                    throw new za0(i2, this.f25532b, 4, e, (byte) 3);
                }
            default:
                int i3 = this.f25533c;
                try {
                    byte[] bArr2 = (byte[]) this.f25535e;
                    bArr2[i3] = (byte) i;
                    bArr2[i3 + 1] = (byte) (i >> 8);
                    bArr2[i3 + 2] = (byte) (i >> 16);
                    bArr2[i3 + 3] = (byte) (i >> 24);
                    this.f25533c = i3 + 4;
                    return;
                } catch (IndexOutOfBoundsException e2) {
                    throw new za0(i3, this.f25532b, 4, e2, (byte) 6);
                }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m8614r(int i, long j) throws za0 {
        switch (this.f25531a) {
            case 3:
                m8621y((i << 3) | 1);
                m8615s(j);
                break;
            default:
                m8621y((i << 3) | 1);
                m8615s(j);
                break;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m8615s(long j) throws za0 {
        switch (this.f25531a) {
            case 3:
                int i = this.f25533c;
                try {
                    byte[] bArr = (byte[]) this.f25535e;
                    bArr[i] = (byte) j;
                    bArr[i + 1] = (byte) (j >> 8);
                    bArr[i + 2] = (byte) (j >> 16);
                    bArr[i + 3] = (byte) (j >> 24);
                    bArr[i + 4] = (byte) (j >> 32);
                    bArr[i + 5] = (byte) (j >> 40);
                    bArr[i + 6] = (byte) (j >> 48);
                    bArr[i + 7] = (byte) (j >> 56);
                    this.f25533c = i + 8;
                    return;
                } catch (IndexOutOfBoundsException e) {
                    throw new za0(i, this.f25532b, 8, e, (byte) 3);
                }
            default:
                int i2 = this.f25533c;
                try {
                    byte[] bArr2 = (byte[]) this.f25535e;
                    bArr2[i2] = (byte) j;
                    bArr2[i2 + 1] = (byte) (j >> 8);
                    bArr2[i2 + 2] = (byte) (j >> 16);
                    bArr2[i2 + 3] = (byte) (j >> 24);
                    bArr2[i2 + 4] = (byte) (j >> 32);
                    bArr2[i2 + 5] = (byte) (j >> 40);
                    bArr2[i2 + 6] = (byte) (j >> 48);
                    bArr2[i2 + 7] = (byte) (j >> 56);
                    this.f25533c = i2 + 8;
                    return;
                } catch (IndexOutOfBoundsException e2) {
                    throw new za0(i2, this.f25532b, 8, e2, (byte) 6);
                }
        }
    }

    /* JADX INFO: renamed from: t */
    public void m8616t(int i, int i2) throws za0 {
        m8621y(i << 3);
        m8617u(i2);
    }

    public String toString() {
        switch (this.f25531a) {
            case 0:
                xa0 xa0Var = (xa0) this.f25535e;
                String str = (String) this.f25534d;
                if (xa0Var == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.f25532b);
                sb.append((char[]) xa0Var.f34095e, 0, xa0Var.f34093c);
                char[] cArr = (char[]) xa0Var.f34095e;
                int i = xa0Var.f34094d;
                sb.append(cArr, i, xa0Var.f34092b - i);
                String str2 = (String) this.f25534d;
                sb.append((CharSequence) str2, this.f25533c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m8617u(int i) throws za0 {
        IndexOutOfBoundsException indexOutOfBoundsException;
        IndexOutOfBoundsException indexOutOfBoundsException2;
        switch (this.f25531a) {
            case 3:
                if (i >= 0) {
                    m8621y(i);
                    return;
                }
                int i2 = this.f25533c;
                try {
                    byte[] bArr = (byte[]) this.f25535e;
                    long j = i;
                    int i3 = i2 + 1;
                    try {
                        bArr[i2] = (byte) (((int) j) | 128);
                        int i4 = i2 + 2;
                        try {
                            bArr[i3] = (byte) (((int) (j >>> 7)) | 128);
                            int i5 = i2 + 3;
                            try {
                                bArr[i4] = (byte) (((int) (j >>> 14)) | 128);
                                int i6 = i2 + 4;
                                try {
                                    bArr[i5] = (byte) (((int) (j >>> 21)) | 128);
                                    int i7 = i2 + 5;
                                    try {
                                        bArr[i6] = (byte) (((int) (j >>> 28)) | 128);
                                        int i8 = i2 + 6;
                                        try {
                                            bArr[i7] = -1;
                                            int i9 = i2 + 7;
                                            bArr[i8] = -1;
                                            i8 = i2 + 8;
                                            bArr[i9] = -1;
                                            i7 = i2 + 9;
                                            bArr[i8] = -1;
                                            i2 += 10;
                                            bArr[i7] = 1;
                                            this.f25533c = i2;
                                            return;
                                        } catch (IndexOutOfBoundsException e) {
                                            indexOutOfBoundsException = e;
                                            i2 = i8;
                                            throw new za0(i2, this.f25532b, 10, indexOutOfBoundsException, (byte) 3);
                                        }
                                    } catch (IndexOutOfBoundsException e2) {
                                        indexOutOfBoundsException = e2;
                                        i2 = i7;
                                    }
                                } catch (IndexOutOfBoundsException e3) {
                                    indexOutOfBoundsException = e3;
                                    i2 = i6;
                                }
                            } catch (IndexOutOfBoundsException e4) {
                                indexOutOfBoundsException = e4;
                                i2 = i5;
                            }
                        } catch (IndexOutOfBoundsException e5) {
                            indexOutOfBoundsException = e5;
                            i2 = i4;
                        }
                    } catch (IndexOutOfBoundsException e6) {
                        indexOutOfBoundsException = e6;
                        i2 = i3;
                    }
                } catch (IndexOutOfBoundsException e7) {
                    indexOutOfBoundsException = e7;
                }
                break;
            default:
                if (i >= 0) {
                    m8621y(i);
                    return;
                }
                int i10 = this.f25533c;
                try {
                    byte[] bArr2 = (byte[]) this.f25535e;
                    long j2 = i;
                    int i11 = i10 + 1;
                    try {
                        bArr2[i10] = (byte) (((int) j2) | 128);
                        int i12 = i10 + 2;
                        try {
                            bArr2[i11] = (byte) (((int) (j2 >>> 7)) | 128);
                            int i13 = i10 + 3;
                            try {
                                bArr2[i12] = (byte) (((int) (j2 >>> 14)) | 128);
                                int i14 = i10 + 4;
                                try {
                                    bArr2[i13] = (byte) (((int) (j2 >>> 21)) | 128);
                                    int i15 = i10 + 5;
                                    try {
                                        bArr2[i14] = (byte) (((int) (j2 >>> 28)) | 128);
                                        int i16 = i10 + 6;
                                        try {
                                            bArr2[i15] = -1;
                                            int i17 = i10 + 7;
                                            bArr2[i16] = -1;
                                            i16 = i10 + 8;
                                            bArr2[i17] = -1;
                                            i15 = i10 + 9;
                                            bArr2[i16] = -1;
                                            i10 += 10;
                                            bArr2[i15] = 1;
                                            this.f25533c = i10;
                                            return;
                                        } catch (IndexOutOfBoundsException e8) {
                                            indexOutOfBoundsException2 = e8;
                                            i10 = i16;
                                            throw new za0(i10, this.f25532b, 10, indexOutOfBoundsException2, (byte) 6);
                                        }
                                    } catch (IndexOutOfBoundsException e9) {
                                        indexOutOfBoundsException2 = e9;
                                        i10 = i15;
                                    }
                                } catch (IndexOutOfBoundsException e10) {
                                    indexOutOfBoundsException2 = e10;
                                    i10 = i14;
                                }
                            } catch (IndexOutOfBoundsException e11) {
                                indexOutOfBoundsException2 = e11;
                                i10 = i13;
                            }
                        } catch (IndexOutOfBoundsException e12) {
                            indexOutOfBoundsException2 = e12;
                            i10 = i12;
                        }
                    } catch (IndexOutOfBoundsException e13) {
                        indexOutOfBoundsException2 = e13;
                        i10 = i11;
                    }
                } catch (IndexOutOfBoundsException e14) {
                    indexOutOfBoundsException2 = e14;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: v */
    public void m8618v(String str) throws za0 {
        byte[] bArr = (byte[]) this.f25535e;
        int i = this.f25533c;
        try {
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(str.length() * 3) * 9;
            int iNumberOfLeadingZeros2 = (352 - (Integer.numberOfLeadingZeros(str.length()) * 9)) >>> 6;
            if (iNumberOfLeadingZeros2 != ((352 - iNumberOfLeadingZeros) >>> 6)) {
                m8621y(jy5.m7341b(str));
                int i2 = this.f25533c;
                this.f25533c = jy5.m7340a(str, bArr, i2, bArr.length - i2);
            } else {
                int i3 = i + iNumberOfLeadingZeros2;
                this.f25533c = i3;
                int iM7340a = jy5.m7340a(str, bArr, i3, bArr.length - i3);
                this.f25533c = i;
                m8621y((iM7340a - i) - iNumberOfLeadingZeros2);
                this.f25533c = iM7340a;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new za0("CodedOutputStream was writing to a flat byte array and ran out of space.", e);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m8619w(int i, int i2) {
        switch (this.f25531a) {
            case 3:
                m8621y((i << 3) | i2);
                break;
            default:
                m8621y((i << 3) | i2);
                break;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m8620x(int i, int i2) {
        switch (this.f25531a) {
            case 3:
                m8621y(i << 3);
                m8621y(i2);
                break;
            default:
                m8621y(i << 3);
                m8621y(i2);
                break;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 2721. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: y */
    public void m8621y(int r11) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.n83.m8621y(int):void");
    }

    /* JADX INFO: renamed from: z */
    public void m8622z(int i, long j) throws za0 {
        switch (this.f25531a) {
            case 3:
                m8621y(i << 3);
                m8595A(j);
                break;
            default:
                m8621y(i << 3);
                m8595A(j);
                break;
        }
    }

    public /* synthetic */ n83(byte b) {
        this.f25531a = b;
    }
}
