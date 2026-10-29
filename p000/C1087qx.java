package p000;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: qx */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class C1087qx {

    /* JADX INFO: renamed from: d */
    public static final C1013ox f28856d = new C1013ox("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    /* JADX INFO: renamed from: e */
    public static final C1013ox f28857e = new C1013ox("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");

    /* JADX INFO: renamed from: f */
    public static final C0962nx f28858f;

    /* JADX INFO: renamed from: a */
    public final C0925mx f28859a;

    /* JADX INFO: renamed from: b */
    public final Character f28860b;

    /* JADX INFO: renamed from: c */
    public volatile C1087qx f28861c;

    static {
        new C1087qx("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new C1087qx("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f28858f = new C0962nx(new C0925mx("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public C1087qx(C0925mx c0925mx, Character ch) {
        boolean z;
        c0925mx.getClass();
        this.f28859a = c0925mx;
        if (ch != null) {
            char cCharValue = ch.charValue();
            byte[] bArr = c0925mx.f25273g;
            if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        if (z) {
            this.f28860b = ch;
        } else {
            C1077qn.m9987m(sc6.m10639K("Padding character %s was already in alphabet", ch));
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m10149a(String str) {
        try {
            CharSequence charSequenceM10153h = m10153h(str);
            int length = (int) (((((long) this.f28859a.f25270d) * ((long) charSequenceM10153h.length())) + 7) / 8);
            byte[] bArr = new byte[length];
            int iMo8881b = mo8881b(bArr, charSequenceM10153h);
            if (iMo8881b == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iMo8881b];
            System.arraycopy(bArr, 0, bArr2, 0, iMo8881b);
            return bArr2;
        } catch (C1050px e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public int mo8881b(byte[] bArr, CharSequence charSequence) throws C1050px {
        CharSequence charSequenceM10153h = m10153h(charSequence);
        int length = charSequenceM10153h.length();
        C0925mx c0925mx = this.f28859a;
        boolean[] zArr = c0925mx.f25274h;
        int i = c0925mx.f25270d;
        int i2 = c0925mx.f25271e;
        if (!zArr[length % i2]) {
            throw new C1050px("Invalid input length " + charSequenceM10153h.length());
        }
        int i3 = 0;
        for (int i4 = 0; i4 < charSequenceM10153h.length(); i4 += i2) {
            long jM8425a = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                jM8425a <<= i;
                if (i4 + i6 < charSequenceM10153h.length()) {
                    jM8425a |= (long) c0925mx.m8425a(charSequenceM10153h.charAt(i5 + i4));
                    i5++;
                }
            }
            int i7 = c0925mx.f25272f;
            int i8 = (i7 * 8) - (i5 * i);
            int i9 = (i7 - 1) * 8;
            while (i9 >= i8) {
                bArr[i3] = (byte) ((jM8425a >>> i9) & 255);
                i9 -= 8;
                i3++;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: c */
    public final String m10150c(byte[] bArr) {
        int length = bArr.length;
        dt0.m4721w(0, length, bArr.length);
        C0925mx c0925mx = this.f28859a;
        int i = c0925mx.f25271e;
        int i2 = c0925mx.f25272f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(ev0.m5345U(length, i2) * i);
        try {
            mo8882e(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            C1077qn.m9985k(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m10151d(StringBuilder sb, byte[] bArr, int i, int i2) {
        dt0.m4721w(i, i + i2, bArr.length);
        C0925mx c0925mx = this.f28859a;
        int i3 = c0925mx.f25272f;
        int i4 = c0925mx.f25270d;
        int i5 = 0;
        dt0.m4716r(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(c0925mx.f25268b[((int) (j >>> (i7 - i5))) & c0925mx.f25269c]);
            i5 += i4;
        }
        Character ch = this.f28860b;
        if (ch != null) {
            while (i5 < c0925mx.f25272f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo8882e(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        dt0.m4721w(0, i, bArr.length);
        while (i2 < i) {
            C0925mx c0925mx = this.f28859a;
            m10151d(sb, bArr, i2, Math.min(c0925mx.f25272f, i - i2));
            i2 += c0925mx.f25272f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1087qx) {
            C1087qx c1087qx = (C1087qx) obj;
            if (this.f28859a.equals(c1087qx.f28859a) && Objects.equals(this.f28860b, c1087qx.f28860b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b1 A[EDGE_INSN: B:48:0x00b1->B:50:0x00b7 BREAK  A[LOOP:0: B:5:0x000b->B:49:0x00b3]] */
    /* JADX INFO: renamed from: f */
    public final C1087qx m10152f() {
        boolean z;
        C1087qx c1087qxMo8883g = this.f28861c;
        if (c1087qxMo8883g == null) {
            C0925mx c0925mx = this.f28859a;
            char[] cArr = c0925mx.f25268b;
            for (char c : cArr) {
                if (c >= 'A' && c <= 'Z') {
                    int length = cArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        }
                        char c2 = cArr[i];
                        if (c2 >= 'a' && c2 <= 'z') {
                            z = true;
                            break;
                        }
                        i++;
                    }
                    dt0.m4722x("Cannot call lowerCase() on a mixed-case alphabet", !z);
                    char[] cArr2 = new char[cArr.length];
                    for (int i2 = 0; i2 < cArr.length; i2++) {
                        char c3 = cArr[i2];
                        if (c3 >= 'A' && c3 <= 'Z') {
                            c3 = (char) (c3 ^ ' ');
                        }
                        cArr2[i2] = c3;
                    }
                    C0925mx c0925mx2 = new C0925mx(zi4.m13623w(new StringBuilder(), c0925mx.f25267a, ".lowerCase()"), cArr2);
                    if (!c0925mx.f25275i) {
                        c0925mx = c0925mx2;
                        break;
                    }
                    byte[] bArr = c0925mx2.f25273g;
                    if (!c0925mx2.f25275i) {
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (int i3 = 65; i3 <= 90; i3++) {
                            int i4 = i3 | 32;
                            byte b = bArr[i3];
                            byte b2 = bArr[i4];
                            if (b == -1) {
                                bArrCopyOf[i3] = b2;
                            } else {
                                char c4 = (char) i3;
                                char c5 = (char) i4;
                                if (!(b2 == -1)) {
                                    C1077qn.m9989o(sc6.m10639K("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                    return null;
                                }
                                bArrCopyOf[i4] = b;
                            }
                        }
                        c0925mx = new C0925mx(zi4.m13623w(new StringBuilder(), c0925mx2.f25267a, ".ignoreCase()"), c0925mx2.f25268b, bArrCopyOf, true);
                        break;
                    }
                    c0925mx = c0925mx2;
                    break;
                }
            }
            c1087qxMo8883g = c0925mx == this.f28859a ? this : mo8883g(c0925mx, this.f28860b);
            this.f28861c = c1087qxMo8883g;
        }
        return c1087qxMo8883g;
    }

    /* JADX INFO: renamed from: g */
    public C1087qx mo8883g(C0925mx c0925mx, Character ch) {
        return new C1087qx(c0925mx, ch);
    }

    /* JADX INFO: renamed from: h */
    public final CharSequence m10153h(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.f28860b;
        if (ch == null) {
            return charSequence;
        }
        char cCharValue = ch.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == cCharValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f28860b) ^ this.f28859a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        C0925mx c0925mx = this.f28859a;
        sb.append(c0925mx);
        if (8 % c0925mx.f25270d != 0) {
            Character ch = this.f28860b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public C1087qx(String str, String str2) {
        this(new C0925mx(str, str2.toCharArray()), (Character) '=');
    }
}
