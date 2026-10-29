package p000;

import java.io.Serializable;
import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ym6 implements Iterable, Serializable {

    /* JADX INFO: renamed from: c */
    public static final ym6 f35338c = new ym6(ro6.f29485b);

    /* JADX INFO: renamed from: a */
    public int f35339a = 0;

    /* JADX INFO: renamed from: b */
    public final byte[] f35340b;

    static {
        int i = lm6.f24186a;
    }

    public ym6(byte[] bArr) {
        bArr.getClass();
        this.f35340b = bArr;
    }

    /* JADX INFO: renamed from: g */
    public static void m13176g(int i) {
        if (((i - 47) | 47) >= 0) {
            return;
        }
        xy4.m12792u(c75.m3877i(i, "End index: 47 >= "));
    }

    /* JADX INFO: renamed from: b */
    public byte mo11065b(int i) {
        return this.f35340b[i];
    }

    /* JADX INFO: renamed from: c */
    public byte mo11066c(int i) {
        return this.f35340b[i];
    }

    /* JADX INFO: renamed from: d */
    public int mo11067d() {
        return this.f35340b.length;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m13177e(ym6 ym6Var) {
        if (!(ym6Var instanceof ym6)) {
            return ym6Var.m13177e(this);
        }
        int iMo11067d = mo11067d();
        if (iMo11067d > ym6Var.mo11067d()) {
            xy4.m12779g(iMo11067d, mo11067d());
            return false;
        }
        if (iMo11067d > ym6Var.mo11067d()) {
            C1077qn.m9987m(zi4.m13618r(iMo11067d, ym6Var.mo11067d(), "Ran off end of other: 0, ", ", "));
            return false;
        }
        byte[] bArr = ym6Var.f35340b;
        int i = 0;
        int i2 = 0;
        while (i < iMo11067d) {
            if (this.f35340b[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ym6)) {
            return false;
        }
        ym6 ym6Var = (ym6) obj;
        int iMo11067d = mo11067d();
        if (iMo11067d != ym6Var.mo11067d()) {
            return false;
        }
        if (iMo11067d == 0) {
            return true;
        }
        int i = this.f35339a;
        int i2 = ym6Var.f35339a;
        if (i == 0 || i2 == 0 || i == i2) {
            return m13177e(ym6Var);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f35339a;
        if (i != 0) {
            return i;
        }
        int iMo11067d = mo11067d();
        int i2 = iMo11067d;
        for (int i3 = 0; i3 < iMo11067d; i3++) {
            i2 = (i2 * 31) + this.f35340b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f35339a = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        g50 g50Var = new g50((byte) 5);
        g50Var.f19618d = this;
        g50Var.f19616b = 0;
        g50Var.f19617c = mo11067d();
        VarHandle.storeStoreFence();
        return g50Var;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMo11067d = mo11067d();
        if (mo11067d() <= 50) {
            strConcat = f06.m5440b(this);
        } else {
            m13176g(mo11067d());
            byte[] bArr = this.f35340b;
            tm6 tm6Var = new tm6(bArr);
            m13176g(bArr.length);
            strConcat = f06.m5440b(tm6Var).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iMo11067d);
        sb.append(" contents=\"");
        return zi4.m13623w(sb, strConcat, "\">");
    }
}
