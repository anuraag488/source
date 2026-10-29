package p000;

import java.io.Serializable;
import java.lang.invoke.VarHandle;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class t50 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final o50 f30782b = new o50(k62.f22940b);

    /* JADX INFO: renamed from: c */
    public static final l50 f30783c;

    /* JADX INFO: renamed from: a */
    public int f30784a;

    static {
        f30783c = AbstractC1139sb.m10589a() ? new q50((byte) 0) : new h50((byte) 0);
    }

    /* JADX INFO: renamed from: c */
    public static int m10979c(int i, int i2, int i3) {
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

    /* JADX INFO: renamed from: d */
    public static o50 m10980d(byte[] bArr, int i, int i2) {
        m10979c(i, i + i2, bArr.length);
        return new o50(f30783c.mo6231b(bArr, i, i2));
    }

    /* JADX INFO: renamed from: b */
    public abstract byte mo7013b(int i);

    /* JADX INFO: renamed from: e */
    public abstract void mo7014e(int i, byte[] bArr);

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract byte mo7015g(int i);

    public final int hashCode() {
        int i = this.f30784a;
        if (i != 0) {
            return i;
        }
        int size = size();
        o50 o50Var = (o50) this;
        int iMo7016m = o50Var.mo7016m();
        int i2 = size;
        for (int i3 = iMo7016m; i3 < iMo7016m + size; i3++) {
            i2 = (i2 * 31) + o50Var.f26351d[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f30784a = i2;
        return i2;
    }

    /* JADX INFO: renamed from: l */
    public final byte[] m10981l() {
        int size = size();
        if (size == 0) {
            return k62.f22940b;
        }
        byte[] bArr = new byte[size];
        mo7014e(size, bArr);
        return bArr;
    }

    public abstract int size();

    public final String toString() {
        o50 o50Var;
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = kx5.m7683N(this);
        } else {
            o50 o50Var2 = (o50) this;
            int iM10979c = m10979c(0, 47, o50Var2.size());
            if (iM10979c == 0) {
                o50Var = f30782b;
            } else {
                int iMo7016m = o50Var2.mo7016m();
                byte[] bArr = o50Var2.f26351d;
                j50 j50Var = new j50(bArr);
                m10979c(iMo7016m, iMo7016m + iM10979c, bArr.length);
                j50Var.f22025e = iMo7016m;
                j50Var.f22026f = iM10979c;
                VarHandle.storeStoreFence();
                o50Var = j50Var;
            }
            strConcat = kx5.m7683N(o50Var).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return zi4.m13623w(sb, strConcat, "\">");
    }
}
