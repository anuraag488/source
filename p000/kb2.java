package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class kb2 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final Reader f23041a;

    /* JADX INFO: renamed from: h */
    public long f23048h;

    /* JADX INFO: renamed from: i */
    public int f23049i;

    /* JADX INFO: renamed from: j */
    public String f23050j;

    /* JADX INFO: renamed from: k */
    public int[] f23051k;

    /* JADX INFO: renamed from: m */
    public String[] f23053m;

    /* JADX INFO: renamed from: n */
    public int[] f23054n;

    /* JADX INFO: renamed from: o */
    public int f23055o = 2;

    /* JADX INFO: renamed from: b */
    public final char[] f23042b = new char[1024];

    /* JADX INFO: renamed from: c */
    public int f23043c = 0;

    /* JADX INFO: renamed from: d */
    public int f23044d = 0;

    /* JADX INFO: renamed from: e */
    public int f23045e = 0;

    /* JADX INFO: renamed from: f */
    public int f23046f = 0;

    /* JADX INFO: renamed from: g */
    public int f23047g = 0;

    /* JADX INFO: renamed from: l */
    public int f23052l = 1;

    static {
        r50.f29018b = new r50((byte) 11);
    }

    public kb2(Reader reader) {
        int[] iArr = new int[32];
        this.f23051k = iArr;
        iArr[0] = 6;
        this.f23053m = new String[32];
        this.f23054n = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f23041a = reader;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m7469A(char c) throws op2 {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m7493e();
        return false;
    }

    /* JADX INFO: renamed from: B */
    final String m7470B() {
        StringBuilder sbM13624x = zi4.m13624x(" at line ", this.f23045e + 1, " column ", (this.f23043c - this.f23046f) + 1, " path ");
        sbM13624x.append(mo7498q());
        return sbM13624x.toString();
    }

    /* JADX INFO: renamed from: C */
    public boolean mo7471C() throws IOException {
        int iM7494g = this.f23047g;
        if (iM7494g == 0) {
            iM7494g = m7494g();
        }
        if (iM7494g == 5) {
            this.f23047g = 0;
            int[] iArr = this.f23054n;
            int i = this.f23052l - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM7494g != 6) {
            throw m7491a0("a boolean");
        }
        this.f23047g = 0;
        int[] iArr2 = this.f23054n;
        int i2 = this.f23052l - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    /* JADX INFO: renamed from: D */
    public double mo7472D() throws IOException {
        int iM7494g = this.f23047g;
        if (iM7494g == 0) {
            iM7494g = m7494g();
        }
        if (iM7494g == 15) {
            this.f23047g = 0;
            int[] iArr = this.f23054n;
            int i = this.f23052l - 1;
            iArr[i] = iArr[i] + 1;
            return this.f23048h;
        }
        if (iM7494g == 16) {
            this.f23050j = new String(this.f23042b, this.f23043c, this.f23049i);
            this.f23043c += this.f23049i;
        } else if (iM7494g == 8 || iM7494g == 9) {
            this.f23050j = m7478O(iM7494g == 8 ? '\'' : '\"');
        } else if (iM7494g == 10) {
            this.f23050j = m7480Q();
        } else if (iM7494g != 11) {
            throw m7491a0("a double");
        }
        this.f23047g = 11;
        double d = Double.parseDouble(this.f23050j);
        if (this.f23055o != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
            m7489Z("JSON forbids NaN and infinities: " + d);
            throw null;
        }
        this.f23050j = null;
        this.f23047g = 0;
        int[] iArr2 = this.f23054n;
        int i2 = this.f23052l - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    /* JADX INFO: renamed from: J */
    public int mo7473J() throws IOException {
        String strM7478O;
        int iM7494g = this.f23047g;
        if (iM7494g == 0) {
            iM7494g = m7494g();
        }
        if (iM7494g == 15) {
            long j = this.f23048h;
            int i = (int) j;
            if (j == i) {
                this.f23047g = 0;
                int[] iArr = this.f23054n;
                int i2 = this.f23052l - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new NumberFormatException("Expected an int but was " + this.f23048h + m7470B());
        }
        if (iM7494g == 16) {
            this.f23050j = new String(this.f23042b, this.f23043c, this.f23049i);
            this.f23043c += this.f23049i;
        } else {
            if (iM7494g != 8 && iM7494g != 9 && iM7494g != 10) {
                throw m7491a0("an int");
            }
            if (iM7494g == 10) {
                strM7478O = m7480Q();
                this.f23050j = strM7478O;
            } else {
                strM7478O = m7478O(iM7494g == 8 ? '\'' : '\"');
                this.f23050j = strM7478O;
            }
            try {
                int i3 = Integer.parseInt(strM7478O);
                this.f23047g = 0;
                int[] iArr2 = this.f23054n;
                int i4 = this.f23052l - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.f23047g = 11;
        double d = Double.parseDouble(this.f23050j);
        int i5 = (int) d;
        if (i5 == d) {
            this.f23050j = null;
            this.f23047g = 0;
            int[] iArr3 = this.f23054n;
            int i6 = this.f23052l - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.f23050j + m7470B());
    }

    /* JADX INFO: renamed from: K */
    public long mo7474K() throws IOException {
        String strM7478O;
        int iM7494g = this.f23047g;
        if (iM7494g == 0) {
            iM7494g = m7494g();
        }
        if (iM7494g == 15) {
            this.f23047g = 0;
            int[] iArr = this.f23054n;
            int i = this.f23052l - 1;
            iArr[i] = iArr[i] + 1;
            return this.f23048h;
        }
        if (iM7494g == 16) {
            this.f23050j = new String(this.f23042b, this.f23043c, this.f23049i);
            this.f23043c += this.f23049i;
        } else {
            if (iM7494g != 8 && iM7494g != 9 && iM7494g != 10) {
                throw m7491a0("a long");
            }
            if (iM7494g == 10) {
                strM7478O = m7480Q();
                this.f23050j = strM7478O;
            } else {
                strM7478O = m7478O(iM7494g == 8 ? '\'' : '\"');
                this.f23050j = strM7478O;
            }
            try {
                long j = Long.parseLong(strM7478O);
                this.f23047g = 0;
                int[] iArr2 = this.f23054n;
                int i2 = this.f23052l - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.f23047g = 11;
        double d = Double.parseDouble(this.f23050j);
        long j2 = (long) d;
        if (j2 == d) {
            this.f23050j = null;
            this.f23047g = 0;
            int[] iArr3 = this.f23054n;
            int i3 = this.f23052l - 1;
            iArr3[i3] = iArr3[i3] + 1;
            return j2;
        }
        throw new NumberFormatException("Expected a long but was " + this.f23050j + m7470B());
    }

    /* JADX INFO: renamed from: L */
    public String mo7475L() throws IOException {
        String strM7478O;
        int iM7494g = this.f23047g;
        if (iM7494g == 0) {
            iM7494g = m7494g();
        }
        if (iM7494g == 14) {
            strM7478O = m7480Q();
        } else if (iM7494g == 12) {
            strM7478O = m7478O('\'');
        } else {
            if (iM7494g != 13) {
                throw m7491a0("a name");
            }
            strM7478O = m7478O('\"');
        }
        this.f23047g = 0;
        this.f23053m[this.f23052l - 1] = strM7478O;
        return strM7478O;
    }

    /* JADX INFO: renamed from: M */
    public final int m7476M(boolean z) throws IOException {
        int i = this.f23043c;
        int i2 = this.f23044d;
        while (true) {
            if (i == i2) {
                this.f23043c = i;
                if (!m7497l(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(m7470B()));
                    }
                    return -1;
                }
                i = this.f23043c;
                i2 = this.f23044d;
            }
            int i3 = i + 1;
            char[] cArr = this.f23042b;
            char c = cArr[i];
            if (c == '\n') {
                this.f23045e++;
                this.f23046f = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f23043c = i3;
                    if (i3 == i2) {
                        this.f23043c = i;
                        boolean zM7497l = m7497l(2);
                        this.f23043c++;
                        if (!zM7497l) {
                        }
                        return c;
                    }
                    m7493e();
                    int i4 = this.f23043c;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f23043c = i4 + 1;
                        while (true) {
                            if (this.f23043c + 2 > this.f23044d && !m7497l(2)) {
                                m7489Z("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.f23043c;
                            if (cArr[i5] != '\n') {
                                int i6 = 0;
                                while (true) {
                                    int i7 = this.f23043c;
                                    if (i6 >= 2) {
                                        i = i7 + 2;
                                        i2 = this.f23044d;
                                        break;
                                    }
                                    if (cArr[i7 + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                this.f23045e++;
                                this.f23046f = i5 + 1;
                            }
                            this.f23043c++;
                        }
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.f23043c = i4 + 1;
                        m7486W();
                        i = this.f23043c;
                        i2 = this.f23044d;
                    }
                } else {
                    if (c != '#') {
                        this.f23043c = i3;
                        return c;
                    }
                    this.f23043c = i3;
                    m7493e();
                    m7486W();
                    i = this.f23043c;
                    i2 = this.f23044d;
                }
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: N */
    public void mo7477N() throws IOException {
        int iM7494g = this.f23047g;
        if (iM7494g == 0) {
            iM7494g = m7494g();
        }
        if (iM7494g != 7) {
            throw m7491a0("null");
        }
        this.f23047g = 0;
        int[] iArr = this.f23054n;
        int i = this.f23052l - 1;
        iArr[i] = iArr[i] + 1;
    }

    /* JADX INFO: renamed from: O */
    public final String m7478O(char c) throws op2 {
        int i;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i2 = this.f23043c;
            int i3 = this.f23044d;
            while (true) {
                int i4 = i3;
                i = i2;
                while (true) {
                    cArr = this.f23042b;
                    if (i2 < i4) {
                        int i5 = i2 + 1;
                        char c2 = cArr[i2];
                        if (this.f23055o == 3 && c2 < ' ') {
                            m7489Z("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                            throw null;
                        }
                        if (c2 == c) {
                            this.f23043c = i5;
                            int i6 = (i5 - i) - 1;
                            if (sb == null) {
                                return new String(cArr, i, i6);
                            }
                            sb.append(cArr, i, i6);
                            return sb.toString();
                        }
                        if (c2 == '\\') {
                            this.f23043c = i5;
                            int i7 = i5 - i;
                            int i8 = i7 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i7 * 2, 16));
                            }
                            sb.append(cArr, i, i8);
                            sb.append(m7483T());
                            i2 = this.f23043c;
                            i3 = this.f23044d;
                        } else {
                            if (c2 == '\n') {
                                this.f23045e++;
                                this.f23046f = i5;
                            }
                            i2 = i5;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i2 - i) * 2, 16));
            }
            sb.append(cArr, i, i2 - i);
            this.f23043c = i2;
        } while (m7497l(1));
        m7489Z("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: P */
    public String mo7479P() {
        String str;
        int iM7494g = this.f23047g;
        if (iM7494g == 0) {
            iM7494g = m7494g();
        }
        if (iM7494g == 10) {
            str = m7480Q();
        } else if (iM7494g == 8) {
            str = m7478O('\'');
        } else if (iM7494g == 9) {
            str = m7478O('\"');
        } else if (iM7494g == 11) {
            str = this.f23050j;
            this.f23050j = null;
        } else if (iM7494g == 15) {
            str = Long.toString(this.f23048h);
        } else {
            if (iM7494g != 16) {
                throw m7491a0("a string");
            }
            str = new String(this.f23042b, this.f23043c, this.f23049i);
            this.f23043c += this.f23049i;
        }
        this.f23047g = 0;
        int[] iArr = this.f23054n;
        int i = this.f23052l - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    /* JADX INFO: renamed from: Q */
    public final String m7480Q() throws op2 {
        String string;
        StringBuilder sb = null;
        int i = 0;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.f23043c + i2;
                int i4 = this.f23044d;
                char[] cArr = this.f23042b;
                if (i3 < i4) {
                    char c = cArr[i3];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        m7493e();
                    }
                    i = i2;
                } else if (i2 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(cArr, this.f23043c, i2);
                    this.f23043c += i2;
                    if (!m7497l(1)) {
                    }
                } else if (!m7497l(i2 + 1)) {
                    i = i2;
                }
                int i5 = this.f23043c;
                if (sb == null) {
                    string = new String(cArr, i5, i);
                } else {
                    sb.append(cArr, i5, i);
                    string = sb.toString();
                }
                this.f23043c += i;
                return string;
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public int mo7481R() throws IOException {
        int iM7494g = this.f23047g;
        if (iM7494g == 0) {
            iM7494g = m7494g();
        }
        switch (iM7494g) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m7482S(int i) throws op2 {
        int i2 = this.f23052l;
        if (i2 - 1 >= 255) {
            throw new op2("Nesting limit 255 reached".concat(m7470B()));
        }
        int[] iArr = this.f23051k;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f23051k = Arrays.copyOf(iArr, i3);
            this.f23054n = Arrays.copyOf(this.f23054n, i3);
            this.f23053m = (String[]) Arrays.copyOf(this.f23053m, i3);
        }
        int[] iArr2 = this.f23051k;
        int i4 = this.f23052l;
        this.f23052l = i4 + 1;
        iArr2[i4] = i;
    }

    /* JADX INFO: renamed from: T */
    public final char m7483T() throws op2 {
        int i;
        if (this.f23043c == this.f23044d && !m7497l(1)) {
            m7489Z("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.f23043c;
        int i3 = i2 + 1;
        this.f23043c = i3;
        char[] cArr = this.f23042b;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c == 'b') {
                            return '\b';
                        }
                        if (c == 'f') {
                            return '\f';
                        }
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c == 'r') {
                            return '\r';
                        }
                        if (c == 't') {
                            return '\t';
                        }
                        if (c != 'u') {
                            m7489Z("Invalid escape sequence");
                            throw null;
                        }
                        if (i2 + 5 > this.f23044d && !m7497l(4)) {
                            m7489Z("Unterminated escape sequence");
                            throw null;
                        }
                        int i4 = this.f23043c;
                        int i5 = i4 + 4;
                        int i6 = 0;
                        while (i4 < i5) {
                            char c2 = cArr[i4];
                            int i7 = i6 << 4;
                            if (c2 >= '0' && c2 <= '9') {
                                i = c2 - '0';
                            } else if (c2 >= 'a' && c2 <= 'f') {
                                i = c2 - 'W';
                            } else {
                                if (c2 < 'A' || c2 > 'F') {
                                    m7489Z("Malformed Unicode escape \\u".concat(new String(cArr, this.f23043c, 4)));
                                    throw null;
                                }
                                i = c2 - '7';
                            }
                            i6 = i + i7;
                            i4++;
                        }
                        this.f23043c += 4;
                        return (char) i6;
                    }
                }
            }
            return c;
        }
        if (this.f23055o == 3) {
            m7489Z("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f23045e++;
        this.f23046f = i3;
        if (this.f23055o == 3) {
            m7489Z("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c;
    }

    /* JADX INFO: renamed from: U */
    public final void m7484U(int i) {
        if (i == 0) {
            throw null;
        }
        this.f23055o = i;
    }

    /* JADX INFO: renamed from: V */
    public final void m7485V(char c) throws op2 {
        do {
            int i = this.f23043c;
            int i2 = this.f23044d;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = this.f23042b[i];
                if (c2 == c) {
                    this.f23043c = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.f23043c = i3;
                    m7483T();
                    i = this.f23043c;
                    i2 = this.f23044d;
                } else {
                    if (c2 == '\n') {
                        this.f23045e++;
                        this.f23046f = i3;
                    }
                    i = i3;
                }
            }
            this.f23043c = i;
        } while (m7497l(1));
        m7489Z("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: W */
    public final void m7486W() {
        char c;
        do {
            if (this.f23043c >= this.f23044d && !m7497l(1)) {
                return;
            }
            int i = this.f23043c;
            int i2 = i + 1;
            this.f23043c = i2;
            c = this.f23042b[i];
            if (c == '\n') {
                this.f23045e++;
                this.f23046f = i2;
                return;
            }
        } while (c != '\r');
    }

    /* JADX INFO: renamed from: X */
    public final void m7487X() throws op2 {
        do {
            int i = 0;
            while (true) {
                int i2 = this.f23043c + i;
                if (i2 < this.f23044d) {
                    char c = this.f23042b[i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        m7493e();
                    }
                    this.f23043c += i;
                    return;
                }
                this.f23043c = i2;
            }
        } while (m7497l(1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: Y */
    public void mo7488Y() throws IOException {
        int i = 0;
        do {
            int iM7494g = this.f23047g;
            if (iM7494g == 0) {
                iM7494g = m7494g();
            }
            switch (iM7494g) {
                case 1:
                    m7482S(3);
                    i++;
                    this.f23047g = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.f23053m[this.f23052l - 1] = null;
                    }
                    this.f23052l--;
                    i--;
                    this.f23047g = 0;
                    break;
                case 3:
                    m7482S(1);
                    i++;
                    this.f23047g = 0;
                    break;
                case 4:
                    this.f23052l--;
                    i--;
                    this.f23047g = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f23047g = 0;
                    break;
                case 8:
                    m7485V('\'');
                    this.f23047g = 0;
                    break;
                case 9:
                    m7485V('\"');
                    this.f23047g = 0;
                    break;
                case 10:
                    m7487X();
                    this.f23047g = 0;
                    break;
                case 12:
                    m7485V('\'');
                    if (i == 0) {
                        this.f23053m[this.f23052l - 1] = "<skipped>";
                    }
                    this.f23047g = 0;
                    break;
                case 13:
                    m7485V('\"');
                    if (i == 0) {
                        this.f23053m[this.f23052l - 1] = "<skipped>";
                    }
                    this.f23047g = 0;
                    break;
                case 14:
                    m7487X();
                    if (i == 0) {
                        this.f23053m[this.f23052l - 1] = "<skipped>";
                    }
                    this.f23047g = 0;
                    break;
                case 16:
                    this.f23043c += this.f23049i;
                    this.f23047g = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.f23054n;
        int i2 = this.f23052l - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX INFO: renamed from: Z */
    public final void m7489Z(String str) throws op2 {
        throw new op2(zi4.m13623w(new StringBuilder(str), m7470B(), "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
    }

    /* JADX INFO: renamed from: a */
    public void mo7490a() throws IOException {
        int iM7494g = this.f23047g;
        if (iM7494g == 0) {
            iM7494g = m7494g();
        }
        if (iM7494g != 3) {
            throw m7491a0("BEGIN_ARRAY");
        }
        m7482S(1);
        this.f23054n[this.f23052l - 1] = 0;
        this.f23047g = 0;
    }

    /* JADX INFO: renamed from: a0 */
    public final IllegalStateException m7491a0(String str) {
        String str2 = mo7481R() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbM10844j = sk5.m10844j("Expected ", str, " but was ");
        sbM10844j.append(d55.m4377v(mo7481R()));
        sbM10844j.append(m7470B());
        sbM10844j.append("\nSee ");
        sbM10844j.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbM10844j.toString());
    }

    /* JADX INFO: renamed from: b */
    public void mo7492b() throws IOException {
        int iM7494g = this.f23047g;
        if (iM7494g == 0) {
            iM7494g = m7494g();
        }
        if (iM7494g != 1) {
            throw m7491a0("BEGIN_OBJECT");
        }
        m7482S(3);
        this.f23047g = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f23047g = 0;
        this.f23051k[0] = 8;
        this.f23052l = 1;
        this.f23041a.close();
    }

    /* JADX INFO: renamed from: e */
    public final void m7493e() throws op2 {
        if (this.f23055o == 1) {
            return;
        }
        m7489Z("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0184 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:120:0x0185  */
    /* JADX WARN: Code duplicated, block: B:123:0x0196  */
    /* JADX WARN: Code duplicated, block: B:126:0x019c  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ad A[PHI: r1 r10
  0x01ad: PHI (r1v56 int) = (r1v55 int), (r1v72 int) binds: [B:122:0x0194, B:130:0x01a9] A[DONT_GENERATE, DONT_INLINE]
  0x01ad: PHI (r10v6 int) = (r10v5 int), (r10v7 int) binds: [B:122:0x0194, B:130:0x01a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:133:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:176:0x0227  */
    /* JADX WARN: Code duplicated, block: B:177:0x0229  */
    /* JADX WARN: Code duplicated, block: B:190:0x024c A[DONT_INVERT, PHI: r8
  0x024c: PHI (r8v20 char) = (r8v19 char), (r8v21 char) binds: [B:175:0x0225, B:181:0x0232] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:191:0x024e  */
    /* JADX WARN: Code duplicated, block: B:204:0x026a  */
    /* JADX WARN: Code duplicated, block: B:206:0x026d  */
    /* JADX WARN: Code duplicated, block: B:209:0x0272 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:213:0x027e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:214:0x027f  */
    /* JADX WARN: Code duplicated, block: B:216:0x0289  */
    /* JADX WARN: Code duplicated, block: B:218:0x0291  */
    /* JADX WARN: Code duplicated, block: B:280:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x01a4 A[SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public final int m7494g() throws IOException {
        int iM7476M;
        int i;
        String str;
        String str2;
        int i2;
        int i3;
        char c;
        int i4;
        int i5;
        boolean z;
        int i6;
        char c2;
        char c3;
        int i7;
        char c4;
        int[] iArr = this.f23051k;
        boolean z2 = true;
        int i8 = this.f23052l - 1;
        int i9 = iArr[i8];
        char[] cArr = this.f23042b;
        if (i9 == 1) {
            iArr[i8] = 2;
        } else if (i9 == 2) {
            int iM7476M2 = m7476M(true);
            if (iM7476M2 != 44) {
                if (iM7476M2 != 59) {
                    if (iM7476M2 == 93) {
                        this.f23047g = 4;
                        return 4;
                    }
                    m7489Z("Unterminated array");
                    throw null;
                }
                m7493e();
            }
        } else {
            if (i9 == 3 || i9 == 5) {
                iArr[i8] = 4;
                if (i9 == 5 && (iM7476M = m7476M(true)) != 44) {
                    if (iM7476M != 59) {
                        if (iM7476M == 125) {
                            this.f23047g = 2;
                            return 2;
                        }
                        m7489Z("Unterminated object");
                        throw null;
                    }
                    m7493e();
                }
                int iM7476M3 = m7476M(true);
                if (iM7476M3 == 34) {
                    this.f23047g = 13;
                    return 13;
                }
                if (iM7476M3 == 39) {
                    m7493e();
                    this.f23047g = 12;
                    return 12;
                }
                if (iM7476M3 == 125) {
                    if (i9 != 5) {
                        this.f23047g = 2;
                        return 2;
                    }
                    m7489Z("Expected name");
                    throw null;
                }
                m7493e();
                this.f23043c--;
                if (m7469A((char) iM7476M3)) {
                    this.f23047g = 14;
                    return 14;
                }
                m7489Z("Expected name");
                throw null;
            }
            if (i9 == 4) {
                iArr[i8] = 5;
                int iM7476M4 = m7476M(true);
                if (iM7476M4 != 58) {
                    if (iM7476M4 != 61) {
                        m7489Z("Expected ':'");
                        throw null;
                    }
                    m7493e();
                    if (this.f23043c < this.f23044d || m7497l(1)) {
                        int i10 = this.f23043c;
                        if (cArr[i10] == '>') {
                            this.f23043c = i10 + 1;
                        }
                    }
                }
            } else if (i9 == 6) {
                if (this.f23055o == 1) {
                    m7476M(true);
                    int i11 = this.f23043c;
                    this.f23043c = i11 - 1;
                    if (i11 + 4 <= this.f23044d || m7497l(5)) {
                        int i12 = this.f23043c;
                        if (cArr[i12] == ')' && cArr[i12 + 1] == ']' && cArr[i12 + 2] == '}' && cArr[i12 + 3] == '\'' && cArr[i12 + 4] == '\n') {
                            this.f23043c = i12 + 5;
                        }
                    }
                }
                this.f23051k[this.f23052l - 1] = 7;
            } else if (i9 == 7) {
                if (m7476M(false) == -1) {
                    this.f23047g = 17;
                    return 17;
                }
                m7493e();
                this.f23043c--;
            } else if (i9 == 8) {
                C1077qn.m9989o("JsonReader is closed");
                return 0;
            }
        }
        int iM7476M5 = m7476M(true);
        if (iM7476M5 == 34) {
            this.f23047g = 9;
            return 9;
        }
        if (iM7476M5 == 39) {
            m7493e();
            this.f23047g = 8;
            return 8;
        }
        if (iM7476M5 == 44 || iM7476M5 == 59) {
            i = 1;
        } else {
            if (iM7476M5 == 91) {
                this.f23047g = 3;
                return 3;
            }
            if (iM7476M5 != 93) {
                if (iM7476M5 == 123) {
                    this.f23047g = 1;
                    return 1;
                }
                int i13 = this.f23043c - 1;
                this.f23043c = i13;
                char c5 = cArr[i13];
                if (c5 == 't' || c5 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i2 = 5;
                } else {
                    if (c5 != 'f' && c5 != 'F') {
                        if (c5 != 'n' && c5 != 'N') {
                            i3 = 0;
                            break;
                        }
                        str = "null";
                        str2 = "NULL";
                        i2 = 7;
                        if (i3 != 0) {
                            return i3;
                        }
                        i4 = this.f23043c;
                        i5 = this.f23044d;
                        z = true;
                        i6 = 0;
                        long j = 0;
                        boolean z3 = false;
                        c2 = 0;
                        while (true) {
                            if (i4 + i6 != i5) {
                                c3 = cArr[i4 + i6];
                                if (c3 != '+') {
                                    if (c3 != 'E' || c3 == 'e') {
                                        if (c2 != 2 || c2 == 4) {
                                            c2 = 5;
                                            i6++;
                                            z2 = true;
                                        }
                                    } else if (c3 == '-') {
                                        if (c2 == 0) {
                                            z3 = true;
                                            c2 = 1;
                                        } else {
                                            if (c2 != 5) {
                                            }
                                            c2 = 6;
                                        }
                                        i6++;
                                        z2 = true;
                                    } else if (c3 != '.') {
                                        if (c3 >= '0' && c3 <= '9') {
                                            if (c2 == z2 || c2 == 0) {
                                                j = -(c3 - '0');
                                                c2 = 2;
                                            } else if (c2 != 2) {
                                                long j2 = j;
                                                if (c2 == 3) {
                                                    j = j2;
                                                    c2 = 4;
                                                } else if (c2 == 5 || c2 == 6) {
                                                    j = j2;
                                                    c2 = 7;
                                                } else {
                                                    j = j2;
                                                }
                                            } else if (j != 0) {
                                                long j3 = j;
                                                long j4 = (10 * j) - ((long) (c3 - '0'));
                                                z &= j3 > -922337203685477580L || (j3 == -922337203685477580L && j4 < j3);
                                                j = j4;
                                            }
                                            i6++;
                                            z2 = true;
                                        } else if (!m7469A(c3)) {
                                            c4 = 2;
                                            if (c2 != 2) {
                                                if (c2 != c4 || c2 == 4 || c2 == 7) {
                                                    this.f23049i = i6;
                                                    i7 = 16;
                                                    this.f23047g = 16;
                                                }
                                            } else if (z || ((j == Long.MIN_VALUE && !z3) || (j == 0 && z3))) {
                                                c4 = 2;
                                                if (c2 != c4) {
                                                }
                                                this.f23049i = i6;
                                                i7 = 16;
                                                this.f23047g = 16;
                                            } else {
                                                long j5 = j;
                                                if (!z3) {
                                                    j5 = -j5;
                                                }
                                                this.f23048h = j5;
                                                this.f23043c += i6;
                                                i7 = 15;
                                                this.f23047g = 15;
                                            }
                                        }
                                    } else if (c2 == 2) {
                                        c2 = 3;
                                        i6++;
                                        z2 = true;
                                    }
                                    if (i7 != 0) {
                                        return i7;
                                    }
                                    if (m7469A(cArr[this.f23043c])) {
                                        m7489Z("Expected value");
                                        throw null;
                                    }
                                    m7493e();
                                    this.f23047g = 10;
                                    return 10;
                                }
                                if (c2 != 5) {
                                }
                                c2 = 6;
                                i6++;
                                z2 = true;
                            } else if (i6 != cArr.length) {
                                if (!m7497l(i6 + 1)) {
                                    i4 = this.f23043c;
                                    i5 = this.f23044d;
                                    c3 = cArr[i4 + i6];
                                    if (c3 != '+') {
                                        if (c3 != 'E') {
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i6++;
                                            z2 = true;
                                        } else {
                                            if (c2 != 2) {
                                            }
                                            c2 = 5;
                                            i6++;
                                            z2 = true;
                                        }
                                        if (i7 != 0) {
                                            return i7;
                                        }
                                        if (m7469A(cArr[this.f23043c])) {
                                            m7489Z("Expected value");
                                            throw null;
                                        }
                                        m7493e();
                                        this.f23047g = 10;
                                        return 10;
                                    }
                                    if (c2 != 5) {
                                    }
                                    c2 = 6;
                                    i6++;
                                    z2 = true;
                                }
                                c4 = 2;
                                if (c2 != 2) {
                                    if (c2 != c4) {
                                    }
                                    this.f23049i = i6;
                                    i7 = 16;
                                    this.f23047g = 16;
                                } else {
                                    if (z) {
                                    }
                                    c4 = 2;
                                    if (c2 != c4) {
                                    }
                                    this.f23049i = i6;
                                    i7 = 16;
                                    this.f23047g = 16;
                                }
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (m7469A(cArr[this.f23043c])) {
                                    m7489Z("Expected value");
                                    throw null;
                                }
                                m7493e();
                                this.f23047g = 10;
                                return 10;
                            }
                            i7 = 0;
                            if (i7 != 0) {
                                return i7;
                            }
                            if (m7469A(cArr[this.f23043c])) {
                                m7489Z("Expected value");
                                throw null;
                            }
                            m7493e();
                            this.f23047g = 10;
                            return 10;
                        }
                    }
                    str = "false";
                    str2 = "FALSE";
                    i2 = 6;
                }
                boolean z4 = this.f23055o != 3;
                int length = str.length();
                int i14 = 0;
                while (true) {
                    int i15 = this.f23043c;
                    int i16 = this.f23044d;
                    if (i14 >= length) {
                        if ((i15 + length >= i16 && !m7497l(length + 1)) || !m7469A(cArr[this.f23043c + length])) {
                            this.f23043c += length;
                            this.f23047g = i2;
                            i3 = i2;
                            break;
                        }
                        break;
                    }
                    if ((i15 + i14 < i16 || m7497l(i14 + 1)) && ((c = cArr[this.f23043c + i14]) == str.charAt(i14) || (z4 && c == str2.charAt(i14)))) {
                        i14++;
                    }
                    i3 = 0;
                    break;
                }
                if (i3 != 0) {
                    return i3;
                }
                i4 = this.f23043c;
                i5 = this.f23044d;
                z = true;
                i6 = 0;
                long j6 = 0;
                boolean z5 = false;
                c2 = 0;
                while (true) {
                    if (i4 + i6 != i5) {
                        c3 = cArr[i4 + i6];
                        if (c3 != '+') {
                            if (c3 != 'E') {
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i6++;
                                z2 = true;
                            } else {
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i6++;
                                z2 = true;
                            }
                            if (i7 != 0) {
                                return i7;
                            }
                            if (m7469A(cArr[this.f23043c])) {
                                m7489Z("Expected value");
                                throw null;
                            }
                            m7493e();
                            this.f23047g = 10;
                            return 10;
                        }
                        if (c2 != 5) {
                        }
                        c2 = 6;
                        i6++;
                        z2 = true;
                    } else if (i6 != cArr.length) {
                        if (!m7497l(i6 + 1)) {
                            i4 = this.f23043c;
                            i5 = this.f23044d;
                            c3 = cArr[i4 + i6];
                            if (c3 != '+') {
                                if (c3 != 'E') {
                                    if (c2 != 2) {
                                    }
                                    c2 = 5;
                                    i6++;
                                    z2 = true;
                                } else {
                                    if (c2 != 2) {
                                    }
                                    c2 = 5;
                                    i6++;
                                    z2 = true;
                                }
                                if (i7 != 0) {
                                    return i7;
                                }
                                if (m7469A(cArr[this.f23043c])) {
                                    m7489Z("Expected value");
                                    throw null;
                                }
                                m7493e();
                                this.f23047g = 10;
                                return 10;
                            }
                            if (c2 != 5) {
                            }
                            c2 = 6;
                            i6++;
                            z2 = true;
                        }
                        c4 = 2;
                        if (c2 != 2) {
                            if (c2 != c4) {
                            }
                            this.f23049i = i6;
                            i7 = 16;
                            this.f23047g = 16;
                        } else {
                            if (z) {
                            }
                            c4 = 2;
                            if (c2 != c4) {
                            }
                            this.f23049i = i6;
                            i7 = 16;
                            this.f23047g = 16;
                        }
                        if (i7 != 0) {
                            return i7;
                        }
                        if (m7469A(cArr[this.f23043c])) {
                            m7489Z("Expected value");
                            throw null;
                        }
                        m7493e();
                        this.f23047g = 10;
                        return 10;
                    }
                    i7 = 0;
                    if (i7 != 0) {
                        return i7;
                    }
                    if (m7469A(cArr[this.f23043c])) {
                        m7489Z("Expected value");
                        throw null;
                    }
                    m7493e();
                    this.f23047g = 10;
                    return 10;
                }
            }
            i = 1;
            if (i9 == 1) {
                this.f23047g = 4;
                return 4;
            }
        }
        if (i9 != i && i9 != 2) {
            m7489Z("Unexpected value");
            throw null;
        }
        m7493e();
        this.f23043c -= i;
        this.f23047g = 7;
        return 7;
    }

    /* JADX INFO: renamed from: j */
    public void mo7495j() throws IOException {
        int iM7494g = this.f23047g;
        if (iM7494g == 0) {
            iM7494g = m7494g();
        }
        if (iM7494g != 4) {
            throw m7491a0("END_ARRAY");
        }
        int i = this.f23052l;
        this.f23052l = i - 1;
        int[] iArr = this.f23054n;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f23047g = 0;
    }

    /* JADX INFO: renamed from: k */
    public void mo7496k() throws IOException {
        int iM7494g = this.f23047g;
        if (iM7494g == 0) {
            iM7494g = m7494g();
        }
        if (iM7494g != 2) {
            throw m7491a0("END_OBJECT");
        }
        int i = this.f23052l;
        int i2 = i - 1;
        this.f23052l = i2;
        this.f23053m[i2] = null;
        int[] iArr = this.f23054n;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f23047g = 0;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m7497l(int i) throws IOException {
        int i2;
        int i3;
        int i4 = this.f23046f;
        int i5 = this.f23043c;
        this.f23046f = i4 - i5;
        int i6 = this.f23044d;
        char[] cArr = this.f23042b;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f23044d = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f23044d = 0;
        }
        this.f23043c = 0;
        do {
            int i8 = this.f23044d;
            int i9 = this.f23041a.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.f23044d + i9;
            this.f23044d = i2;
            if (this.f23045e == 0 && (i3 = this.f23046f) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f23043c++;
                this.f23046f = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public String mo7498q() {
        return m7499t(false);
    }

    /* JADX INFO: renamed from: t */
    public final String m7499t(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.f23052l;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.f23051k[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.f23054n[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.f23053m[i];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    C1077qn.m9985k(c75.m3877i(i3, "Unknown scope value: "));
                    return null;
            }
            i++;
        }
    }

    public String toString() {
        return getClass().getSimpleName().concat(m7470B());
    }

    /* JADX INFO: renamed from: u */
    public String mo7500u() {
        return m7499t(true);
    }

    /* JADX INFO: renamed from: v */
    public boolean mo7501v() throws IOException {
        int iM7494g = this.f23047g;
        if (iM7494g == 0) {
            iM7494g = m7494g();
        }
        return (iM7494g == 2 || iM7494g == 4 || iM7494g == 17) ? false : true;
    }
}
