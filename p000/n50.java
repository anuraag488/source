package p000;

import java.io.Serializable;
import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class n50 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final p50 f25466b = new p50(l62.f23817a);

    /* JADX INFO: renamed from: c */
    public static final m50 f25467c;

    /* JADX INFO: renamed from: a */
    public int f25468a = 0;

    static {
        byte b = 0;
        f25467c = AbstractC1176tb.m11018a() ? new r50(b) : new i50(b);
    }

    /* JADX INFO: renamed from: a */
    public static int m8524a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            xy4.m12792u(c75.m3878j("Beginning index: ", i, " < 0"));
            return 0;
        }
        if (i2 < i) {
            xy4.m12792u(zi4.m13618r(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        xy4.m12792u(zi4.m13618r(i2, i3, "End index: ", " >= "));
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static p50 m8525b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return f25466b;
        }
        m8524a(i, i + i2, bArr.length);
        return new p50(f25467c.mo6669b(bArr, i, i2));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m8526l(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        m8524a(i, i4, bArr.length);
        m8524a(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo7401c(int i, byte[] bArr);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo7402d(n50 n50Var);

    /* JADX INFO: renamed from: e */
    public abstract byte mo7403e(int i);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n50)) {
            return false;
        }
        n50 n50Var = (n50) obj;
        int size = size();
        if (size != n50Var.size()) {
            return false;
        }
        if (size == 0) {
            return true;
        }
        int i = this.f25468a;
        int i2 = n50Var.f25468a;
        if (i == 0 || i2 == 0 || i == i2) {
            return mo7402d(n50Var);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo7404g(int i, int i2);

    public final int hashCode() {
        int iMo7404g = this.f25468a;
        if (iMo7404g == 0) {
            int size = size();
            iMo7404g = mo7404g(size, size);
            if (iMo7404g == 0) {
                iMo7404g = 1;
            }
            this.f25468a = iMo7404g;
        }
        return iMo7404g;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        g50 g50Var = new g50((byte) 1);
        g50Var.f19618d = this;
        g50Var.f19616b = 0;
        g50Var.f19617c = size();
        VarHandle.storeStoreFence();
        return g50Var;
    }

    /* JADX INFO: renamed from: m */
    public abstract n50 mo7405m(int i, int i2);

    /* JADX INFO: renamed from: q */
    public final byte[] m8527q() {
        int size = size();
        if (size == 0) {
            return l62.f23817a;
        }
        byte[] bArr = new byte[size];
        mo7401c(size, bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo7406r(C1145sh c1145sh);

    public abstract int size();

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        String strM13842F = size() <= 50 ? zy5.m13842F(m8527q()) : zy5.m13842F(mo7405m(0, 47).m8527q()).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return zi4.m13623w(sb, strM13842F, "\">");
    }
}
