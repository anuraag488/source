package p000;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class yb2 implements Closeable, Flushable {

    /* JADX INFO: renamed from: l */
    public static final Pattern f35087l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: m */
    public static final String[] f35088m = new String[128];

    /* JADX INFO: renamed from: n */
    public static final String[] f35089n;

    /* JADX INFO: renamed from: a */
    public final Writer f35090a;

    /* JADX INFO: renamed from: b */
    public int[] f35091b;

    /* JADX INFO: renamed from: c */
    public int f35092c;

    /* JADX INFO: renamed from: d */
    public gn1 f35093d;

    /* JADX INFO: renamed from: e */
    public String f35094e;

    /* JADX INFO: renamed from: f */
    public String f35095f;

    /* JADX INFO: renamed from: g */
    public boolean f35096g;

    /* JADX INFO: renamed from: h */
    public int f35097h;

    /* JADX INFO: renamed from: i */
    public boolean f35098i;

    /* JADX INFO: renamed from: j */
    public String f35099j;

    /* JADX INFO: renamed from: k */
    public boolean f35100k;

    static {
        for (int i = 0; i <= 31; i++) {
            f35088m[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f35088m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f35089n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public yb2(Writer writer) {
        int[] iArrCopyOf = new int[32];
        this.f35091b = iArrCopyOf;
        this.f35092c = 0;
        if (iArrCopyOf.length == 0) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, 0);
            this.f35091b = iArrCopyOf;
        }
        int i = this.f35092c;
        this.f35092c = i + 1;
        iArrCopyOf[i] = 6;
        this.f35097h = 2;
        this.f35100k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f35090a = writer;
        m13087v(gn1.f19970d);
    }

    /* JADX INFO: renamed from: A */
    public final void m13080A(int i) {
        if (i == 0) {
            throw null;
        }
        this.f35097h = i;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX INFO: renamed from: B */
    public final void m13081B(String str) throws IOException {
        String str2;
        String[] strArr = this.f35098i ? f35089n : f35088m;
        Writer writer = this.f35090a;
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        writer.write(str, i, i2 - i);
                    }
                    writer.write(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    writer.write(str, i, i2 - i);
                }
                writer.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }

    /* JADX INFO: renamed from: C */
    public void mo12198C(double d) throws IOException {
        m13082N();
        if (this.f35097h == 1 || !(Double.isNaN(d) || Double.isInfinite(d))) {
            m13083a();
            this.f35090a.append((CharSequence) Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
    }

    /* JADX INFO: renamed from: D */
    public void mo12199D(long j) throws IOException {
        m13082N();
        m13083a();
        this.f35090a.write(Long.toString(j));
    }

    /* JADX INFO: renamed from: J */
    public void mo12200J(Boolean bool) throws IOException {
        if (bool == null) {
            mo12211t();
            return;
        }
        m13082N();
        m13083a();
        this.f35090a.write(bool.booleanValue() ? "true" : "false");
    }

    /* JADX INFO: renamed from: K */
    public void mo12201K(Number number) throws IOException {
        if (number == null) {
            mo12211t();
            return;
        }
        m13082N();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f35097h != 1) {
                    C1077qn.m9987m("Numeric values must be finite, but was ".concat(string));
                    return;
                }
            } else if (cls != Float.class && cls != Double.class && !f35087l.matcher(string).matches()) {
                nm0.m8797j("String created by ", cls, " is not a valid JSON number: ", string);
                return;
            }
        }
        m13083a();
        this.f35090a.append((CharSequence) string);
    }

    /* JADX INFO: renamed from: L */
    public void mo12202L(String str) throws IOException {
        if (str == null) {
            mo12211t();
            return;
        }
        m13082N();
        m13083a();
        m13081B(str);
    }

    /* JADX INFO: renamed from: M */
    public void mo12203M(boolean z) throws IOException {
        m13082N();
        m13083a();
        this.f35090a.write(z ? "true" : "false");
    }

    /* JADX INFO: renamed from: N */
    public final void m13082N() throws IOException {
        if (this.f35099j != null) {
            int iM13086u = m13086u();
            if (iM13086u == 5) {
                this.f35090a.write(this.f35095f);
            } else if (iM13086u != 3) {
                C1077qn.m9989o("Nesting problem.");
                return;
            }
            m13085q();
            this.f35091b[this.f35092c - 1] = 4;
            m13081B(this.f35099j);
            this.f35099j = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m13083a() throws IOException {
        int iM13086u = m13086u();
        if (iM13086u == 1) {
            this.f35091b[this.f35092c - 1] = 2;
            m13085q();
            return;
        }
        Writer writer = this.f35090a;
        if (iM13086u == 2) {
            writer.append((CharSequence) this.f35095f);
            m13085q();
            return;
        }
        if (iM13086u == 4) {
            writer.append((CharSequence) this.f35094e);
            this.f35091b[this.f35092c - 1] = 5;
            return;
        }
        if (iM13086u != 6) {
            if (iM13086u != 7) {
                C1077qn.m9989o("Nesting problem.");
                return;
            } else if (this.f35097h != 1) {
                C1077qn.m9989o("JSON must have only one top-level value.");
                return;
            }
        }
        this.f35091b[this.f35092c - 1] = 7;
    }

    /* JADX INFO: renamed from: b */
    public void mo12206b() throws IOException {
        m13082N();
        m13083a();
        int i = this.f35092c;
        int[] iArrCopyOf = this.f35091b;
        if (i == iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i * 2);
            this.f35091b = iArrCopyOf;
        }
        int i2 = this.f35092c;
        this.f35092c = i2 + 1;
        iArrCopyOf[i2] = 1;
        this.f35090a.write(91);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f35090a.close();
        int i = this.f35092c;
        if (i > 1 || (i == 1 && this.f35091b[i - 1] != 7)) {
            wb1.m12191j("Incomplete document");
        } else {
            this.f35092c = 0;
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo12207e() throws IOException {
        m13082N();
        m13083a();
        int i = this.f35092c;
        int[] iArrCopyOf = this.f35091b;
        if (i == iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i * 2);
            this.f35091b = iArrCopyOf;
        }
        int i2 = this.f35092c;
        this.f35092c = i2 + 1;
        iArrCopyOf[i2] = 3;
        this.f35090a.write(123);
    }

    public void flush() throws IOException {
        if (this.f35092c != 0) {
            this.f35090a.flush();
        } else {
            C1077qn.m9989o("JsonWriter is closed.");
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m13084g(int i, int i2, char c) throws IOException {
        int iM13086u = m13086u();
        if (iM13086u != i2 && iM13086u != i) {
            C1077qn.m9989o("Nesting problem.");
            return;
        }
        if (this.f35099j != null) {
            wb1.m12197q(this.f35099j, "Dangling name: ");
            return;
        }
        this.f35092c--;
        if (iM13086u == i2) {
            m13085q();
        }
        this.f35090a.write(c);
    }

    /* JADX INFO: renamed from: j */
    public void mo12208j() throws IOException {
        m13084g(1, 2, ']');
    }

    /* JADX INFO: renamed from: k */
    public void mo12209k() throws IOException {
        m13084g(3, 5, '}');
    }

    /* JADX INFO: renamed from: l */
    public void mo12210l(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f35099j != null) {
            C1077qn.m9989o("Already wrote a name, expecting a value.");
            return;
        }
        int iM13086u = m13086u();
        if (iM13086u == 3 || iM13086u == 5) {
            this.f35099j = str;
        } else {
            C1077qn.m9989o("Please begin an object before writing a name.");
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m13085q() throws IOException {
        if (this.f35096g) {
            return;
        }
        String str = this.f35093d.f19972a;
        Writer writer = this.f35090a;
        writer.write(str);
        int i = this.f35092c;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.f35093d.f19973b);
        }
    }

    /* JADX INFO: renamed from: t */
    public yb2 mo12211t() {
        if (this.f35099j != null) {
            if (!this.f35100k) {
                this.f35099j = null;
                return this;
            }
            m13082N();
        }
        m13083a();
        this.f35090a.write("null");
        return this;
    }

    /* JADX INFO: renamed from: u */
    public final int m13086u() {
        int i = this.f35092c;
        if (i != 0) {
            return this.f35091b[i - 1];
        }
        C1077qn.m9989o("JsonWriter is closed.");
        return 0;
    }

    /* JADX INFO: renamed from: v */
    public final void m13087v(gn1 gn1Var) {
        Objects.requireNonNull(gn1Var);
        this.f35093d = gn1Var;
        this.f35095f = ",";
        if (gn1Var.f19974c) {
            this.f35094e = ": ";
            if (gn1Var.f19972a.isEmpty()) {
                this.f35095f = ", ";
            }
        } else {
            this.f35094e = ":";
        }
        this.f35096g = this.f35093d.f19972a.isEmpty() && this.f35093d.f19973b.isEmpty();
    }
}
