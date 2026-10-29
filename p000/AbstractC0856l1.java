package p000;

import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l1 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0856l1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23685a = 0;

    /* JADX INFO: renamed from: b */
    public int f23686b;

    /* JADX INFO: renamed from: c */
    public final Object f23687c;

    /* JADX INFO: renamed from: d */
    public final Object f23688d;

    /* JADX INFO: renamed from: e */
    public Object f23689e;

    /* JADX INFO: renamed from: f */
    public Object f23690f;

    public AbstractC0856l1(s92 s92Var) {
        this.f23687c = s92Var;
        db2 db2Var = new db2();
        db2Var.f16894a = (short) 400;
        db2Var.f16895b = s92Var.f30011d;
        db2Var.f16896c = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        db2Var.f16897d = iArr;
        db2Var.f16898e = -1;
        VarHandle.storeStoreFence();
        this.f23688d = db2Var;
        this.f23690f = new StringBuilder();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m7793r(AbstractC0856l1 abstractC0856l1, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = abstractC0856l1.f23686b;
        }
        abstractC0856l1.m7806q(str, i, (i2 & 4) != 0 ? null : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        throw null;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m7794u(char c) {
        return (c == ',' || c == ':' || c == ']' || c == '}') ? false : true;
    }

    /* JADX INFO: renamed from: A */
    public boolean m7795A(boolean z) {
        int iMo4485w = mo4485w(mo4486x());
        int length = mo4484t().length() - iMo4485w;
        if (length >= 4 && iMo4485w != -1) {
            for (int i = 0; i < 4; i++) {
                if ("null".charAt(i) == mo4484t().charAt(iMo4485w + i)) {
                }
            }
            if (length <= 4 || z62.m13391s(mo4484t().charAt(iMo4485w + 4)) != 0) {
                if (z) {
                    this.f23686b = iMo4485w + 4;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B */
    public void m7796B(char c) {
        int i = this.f23686b;
        if (i > 0 && c == '\"') {
            try {
                this.f23686b = i - 1;
                String strM7804n = m7804n();
                this.f23686b = i;
                if (z62.m13387o(strM7804n, "null")) {
                    m7806q("Expected string literal but 'null' literal was found", this.f23686b - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f23686b = i;
                throw th;
            }
        }
        String strM13375d0 = z62.m13375d0(z62.m13391s(c));
        int i2 = this.f23686b;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        m7793r(this, zi4.m13622v("Expected ", strM13375d0, ", but had '", (i2 == mo4484t().length() || i3 < 0) ? "EOF" : String.valueOf(mo4484t().charAt(i3)), "' instead"), i3, 4);
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public void m7797a() {
        this.f23689e = (Map.Entry) this.f23690f;
        Iterator it = (Iterator) this.f23688d;
        this.f23690f = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    /* JADX INFO: renamed from: b */
    public int m7798b(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.f23690f).append((char) (m7807s(charSequence, i + 3) + (m7807s(charSequence, i) << 12) + (m7807s(charSequence, i + 1) << 8) + (m7807s(charSequence, i + 2) << 4)));
            return i2;
        }
        this.f23686b = i;
        mo6640o();
        if (this.f23686b + 4 < charSequence.length()) {
            return m7798b(charSequence, this.f23686b);
        }
        m7793r(this, "Unexpected EOF during unicode escape", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public void mo6639c(int i, int i2) {
        ((StringBuilder) this.f23690f).append(mo4484t(), i, i2);
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo4480d();

    /* JADX INFO: renamed from: e */
    public void m7799e(int i, String str) {
        if (mo4484t().length() - i < str.length()) {
            m7793r(this, "Unexpected end of boolean literal", 0, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (mo4484t().charAt(i + i2) | ' ')) {
                m7793r(this, "Expected valid boolean literal prefix, but had '" + m7804n() + '\'', 0, 6);
                throw null;
            }
        }
        this.f23686b = str.length() + i;
    }

    /* JADX INFO: renamed from: f */
    public abstract String mo4481f();

    /* JADX INFO: renamed from: h */
    public abstract byte mo4482h();

    public boolean hasNext() {
        return ((Map.Entry) this.f23690f) != null;
    }

    /* JADX INFO: renamed from: i */
    public byte m7800i(byte b) {
        byte bMo4482h = mo4482h();
        if (bMo4482h == b) {
            return bMo4482h;
        }
        String strM13375d0 = z62.m13375d0(b);
        int i = this.f23686b;
        int i2 = i > 0 ? i - 1 : i;
        m7793r(this, zi4.m13622v("Expected ", strM13375d0, ", but had '", (i == mo4484t().length() || i2 < 0) ? "EOF" : String.valueOf(mo4484t().charAt(i2)), "' instead"), i2, 4);
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo4483j(char c);

    /* JADX INFO: renamed from: k */
    public long m7801k() {
        boolean z;
        double dPow;
        int iMo4485w = mo4485w(mo4486x());
        if (iMo4485w >= mo4484t().length() || iMo4485w == -1) {
            m7793r(this, "EOF", 0, 6);
            throw null;
        }
        if (mo4484t().charAt(iMo4485w) == '\"') {
            iMo4485w++;
            if (iMo4485w == mo4484t().length()) {
                m7793r(this, "EOF", 0, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = iMo4485w;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        long j = 0;
        long j2 = 0;
        while (true) {
            if (i == mo4484t().length()) {
                z = z;
                z3 = z3;
                break;
            }
            char cCharAt = mo4484t().charAt(i);
            z = z;
            if ((cCharAt != 'e' && cCharAt != 'E') || z3) {
                z3 = z3;
                if (cCharAt == '-' && z3) {
                    if (i == iMo4485w) {
                        m7793r(this, "Unexpected symbol '-' in numeric literal", i, 4);
                        throw null;
                    }
                    i++;
                    z2 = false;
                } else if (cCharAt != '+' || !z3) {
                    if (cCharAt != '-') {
                        if (z62.m13391s(cCharAt) != 0) {
                            break;
                        }
                        int i2 = i + 1;
                        int i3 = cCharAt - '0';
                        if (i3 < 0 || i3 >= 10) {
                            m7793r(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, 4);
                            throw null;
                        }
                        if (z3) {
                            j = (j * 10) + ((long) i3);
                        } else {
                            j2 = (j2 * 10) - ((long) i3);
                            if (j2 > 0) {
                                m7793r(this, "Numeric value overflow", 0, 6);
                                throw null;
                            }
                        }
                        i = i2;
                    } else {
                        if (i != iMo4485w) {
                            m7793r(this, "Unexpected symbol '-' in numeric literal", i, 4);
                            throw null;
                        }
                        i++;
                        z = z;
                        z3 = z3;
                        z4 = true;
                    }
                } else {
                    if (i == iMo4485w) {
                        m7793r(this, "Unexpected symbol '+' in numeric literal", i, 4);
                        throw null;
                    }
                    i++;
                    z2 = true;
                }
            } else {
                if (i == iMo4485w) {
                    m7793r(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, 4);
                    throw null;
                }
                i++;
                z = z;
                z2 = true;
                z3 = true;
            }
        }
        boolean z5 = i != iMo4485w;
        if (iMo4485w == i || (z4 && iMo4485w == i - 1)) {
            m7793r(this, "Expected numeric literal", i, 4);
            throw null;
        }
        if (z) {
            if (!z5) {
                m7793r(this, "EOF", 0, 6);
                throw null;
            }
            if (mo4484t().charAt(i) != '\"') {
                m7793r(this, "Expected closing quotation mark", i, 4);
                throw null;
            }
            i++;
        }
        this.f23686b = i;
        if (z3) {
            double d = j2;
            if (!z2) {
                dPow = Math.pow(10.0d, -j);
            } else {
                if (!z2) {
                    C0670g.m5864c();
                    return 0L;
                }
                dPow = Math.pow(10.0d, j);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                m7793r(this, "Numeric value overflow", 0, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                m7793r(this, "Can't convert " + d2 + " to Long", 0, 6);
                throw null;
            }
            j2 = (long) d2;
        }
        if (z4) {
            return j2;
        }
        if (j2 != Long.MIN_VALUE) {
            return -j2;
        }
        m7793r(this, "Numeric value overflow", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public String m7802l() {
        String str = (String) this.f23689e;
        if (str == null) {
            return mo4481f();
        }
        this.f23689e = null;
        return str;
    }

    /* JADX INFO: renamed from: m */
    public String m7803m(CharSequence charSequence, int i, int i2) {
        String string;
        StringBuilder sb = (StringBuilder) this.f23690f;
        char cCharAt = charSequence.charAt(i2);
        boolean z = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                mo6639c(i, i2);
                int iMo4485w = mo4485w(i2 + 1);
                if (iMo4485w == -1) {
                    m7793r(this, "Expected escape sequence to continue, got EOF", 0, 6);
                    throw null;
                }
                int iM7798b = iMo4485w + 1;
                char cCharAt2 = mo4484t().charAt(iMo4485w);
                if (cCharAt2 == 'u') {
                    iM7798b = m7798b(mo4484t(), iM7798b);
                } else {
                    char c = cCharAt2 < 'u' ? u80.f31715a[cCharAt2] : (char) 0;
                    if (c == 0) {
                        m7793r(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, 6);
                        throw null;
                    }
                    sb.append(c);
                }
                i = mo4485w(iM7798b);
                if (i == -1) {
                    m7793r(this, "Unexpected EOF", i, 4);
                    throw null;
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    mo6639c(i, i2);
                    i = mo4485w(i2);
                    if (i == -1) {
                        m7793r(this, "Unexpected EOF", i, 4);
                        throw null;
                    }
                } else {
                    continue;
                }
                cCharAt = charSequence.charAt(i2);
            }
            i2 = i;
            z = true;
            cCharAt = charSequence.charAt(i2);
        }
        if (z) {
            mo6639c(i, i2);
            string = sb.toString();
            sb.setLength(0);
        } else {
            string = mo6641y(i, i2);
        }
        this.f23686b = i2 + 1;
        return string;
    }

    /* JADX INFO: renamed from: n */
    public String m7804n() {
        String strMo6641y;
        StringBuilder sb = (StringBuilder) this.f23690f;
        String str = (String) this.f23689e;
        if (str != null) {
            this.f23689e = null;
            return str;
        }
        int iMo4486x = mo4486x();
        if (iMo4486x >= mo4484t().length() || iMo4486x == -1) {
            m7793r(this, "EOF", iMo4486x, 4);
            throw null;
        }
        byte bM13391s = z62.m13391s(mo4484t().charAt(iMo4486x));
        if (bM13391s == 1) {
            return m7802l();
        }
        if (bM13391s != 0) {
            m7793r(this, "Expected beginning of the string, but got " + mo4484t().charAt(iMo4486x), 0, 6);
            throw null;
        }
        boolean z = false;
        while (z62.m13391s(mo4484t().charAt(iMo4486x)) == 0) {
            iMo4486x++;
            if (iMo4486x >= mo4484t().length()) {
                mo6639c(this.f23686b, iMo4486x);
                int iMo4485w = mo4485w(iMo4486x);
                if (iMo4485w == -1) {
                    this.f23686b = iMo4486x;
                    mo6639c(0, 0);
                    String string = sb.toString();
                    sb.setLength(0);
                    return string;
                }
                iMo4486x = iMo4485w;
                z = true;
            }
        }
        int i = this.f23686b;
        if (z) {
            mo6639c(i, iMo4486x);
            String string2 = sb.toString();
            sb.setLength(0);
            strMo6641y = string2;
        } else {
            strMo6641y = mo6641y(i, iMo4486x);
        }
        this.f23686b = iMo4486x;
        return strMo6641y;
    }

    /* JADX INFO: renamed from: p */
    public void m7805p() {
        if (mo4482h() == 10) {
            return;
        }
        m7793r(this, "Expected EOF after parsing, but had " + mo4484t().charAt(this.f23686b - 1) + " instead", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public void m7806q(String str, int i, String str2) {
        throw new y92(kx5.m7687R(i, str, ((db2) this.f23688d).m4417a(), str2, ((s92) this.f23687c).f30011d ? kx5.m7695Z(mo4484t(), i).toString() : null), null);
    }

    public void remove() {
        y94 y94Var = (y94) this.f23687c;
        if (y94Var.m13054e().f34084d != this.f23686b) {
            C1077qn.m9983c();
            return;
        }
        Map.Entry entry = (Map.Entry) this.f23689e;
        if (entry == null) {
            xy4.m12787p();
            return;
        }
        y94Var.remove(entry.getKey());
        this.f23689e = null;
        this.f23686b = y94Var.m13054e().f34084d;
    }

    /* JADX INFO: renamed from: s */
    public int m7807s(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        m7793r(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: t */
    public abstract CharSequence mo4484t();

    public String toString() {
        switch (this.f23685a) {
            case 0:
                return "JsonReader(source='" + ((Object) mo4484t()) + "', currentPosition=" + this.f23686b + ')';
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: v */
    public byte m7808v() {
        CharSequence charSequenceMo4484t = mo4484t();
        int i = this.f23686b;
        while (true) {
            int iMo4485w = mo4485w(i);
            if (iMo4485w == -1) {
                this.f23686b = iMo4485w;
                return (byte) 10;
            }
            char cCharAt = charSequenceMo4484t.charAt(iMo4485w);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f23686b = iMo4485w;
                return z62.m13391s(cCharAt);
            }
            i = iMo4485w + 1;
        }
    }

    /* JADX INFO: renamed from: w */
    public abstract int mo4485w(int i);

    /* JADX INFO: renamed from: x */
    public abstract int mo4486x();

    /* JADX INFO: renamed from: y */
    public String mo6641y(int i, int i2) {
        return mo4484t().subSequence(i, i2).toString();
    }

    /* JADX INFO: renamed from: z */
    public boolean m7809z() {
        int iMo4486x = mo4486x();
        CharSequence charSequenceMo4484t = mo4484t();
        if (iMo4486x >= charSequenceMo4484t.length() || iMo4486x == -1 || charSequenceMo4484t.charAt(iMo4486x) != ',') {
            return false;
        }
        this.f23686b++;
        return true;
    }

    public AbstractC0856l1(y94 y94Var, Iterator it) {
        this.f23687c = y94Var;
        this.f23688d = it;
        this.f23686b = y94Var.m13054e().f34084d;
        m7797a();
    }

    /* JADX INFO: renamed from: o */
    public void mo6640o() {
    }
}
