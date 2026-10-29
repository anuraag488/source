package p000;

import java.io.Serializable;
import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class aj6 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final qk6 f14569b = new qk6(kr5.f23354a);

    /* JADX INFO: renamed from: a */
    public int f14570a = 0;

    static {
        Class cls = o36.f26319a;
    }

    /* JADX INFO: renamed from: q */
    public static int m3010q(int i, int i2, int i3) {
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

    /* JADX INFO: renamed from: r */
    public static qk6 m3011r(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return f14569b;
        }
        m3010q(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new qk6(bArr2);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ boolean m3012s(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        m3010q(i, i4, bArr.length);
        m3010q(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public abstract byte mo3013b(int i);

    /* JADX INFO: renamed from: c */
    public abstract int mo3014c(int i, int i2);

    /* JADX INFO: renamed from: d */
    public abstract int mo3015d();

    /* JADX INFO: renamed from: e */
    public abstract aj6 mo3016e(int i, int i2);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aj6)) {
            return false;
        }
        aj6 aj6Var = (aj6) obj;
        int iMo3015d = mo3015d();
        if (iMo3015d != aj6Var.mo3015d()) {
            return false;
        }
        if (iMo3015d == 0) {
            return true;
        }
        int i = this.f14570a;
        int i2 = aj6Var.f14570a;
        if (i == 0 || i2 == 0 || i == i2) {
            return mo3019m(aj6Var);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo3017g(int i, byte[] bArr);

    public final int hashCode() {
        int iMo3014c = this.f14570a;
        if (iMo3014c == 0) {
            int iMo3015d = mo3015d();
            iMo3014c = mo3014c(iMo3015d, iMo3015d);
            if (iMo3014c == 0) {
                iMo3014c = 1;
            }
            this.f14570a = iMo3014c;
        }
        return iMo3014c;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        g50 g50Var = new g50((byte) 3);
        g50Var.f19618d = this;
        g50Var.f19616b = 0;
        g50Var.f19617c = mo3015d();
        VarHandle.storeStoreFence();
        return g50Var;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo3018l(n83 n83Var);

    /* JADX INFO: renamed from: m */
    public abstract boolean mo3019m(aj6 aj6Var);

    public final String toString() {
        byte[] bArr;
        String strConcat;
        byte[] bArr2;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMo3015d = mo3015d();
        if (mo3015d() <= 50) {
            int iMo3015d2 = mo3015d();
            if (iMo3015d2 == 0) {
                bArr2 = kr5.f23354a;
            } else {
                byte[] bArr3 = new byte[iMo3015d2];
                mo3017g(iMo3015d2, bArr3);
                bArr2 = bArr3;
            }
            strConcat = rw5.m10479a(bArr2);
        } else {
            aj6 aj6VarMo3016e = mo3016e(0, 47);
            int iMo3015d3 = aj6VarMo3016e.mo3015d();
            if (iMo3015d3 == 0) {
                bArr = kr5.f23354a;
            } else {
                byte[] bArr4 = new byte[iMo3015d3];
                aj6VarMo3016e.mo3017g(iMo3015d3, bArr4);
                bArr = bArr4;
            }
            strConcat = rw5.m10479a(bArr).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iMo3015d);
        sb.append(" contents=\"");
        return zi4.m13623w(sb, strConcat, "\">");
    }
}
