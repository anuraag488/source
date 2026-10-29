package p000;

import java.io.Serializable;
import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class r46 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b */
    public static final t46 f29010b = new t46(j76.f22079a);

    /* JADX INFO: renamed from: a */
    public int f29011a = 0;

    static {
        int i = a46.f101a;
    }

    /* JADX INFO: renamed from: q */
    public static int m10201q(int i, int i2, int i3) {
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
    public static t46 m10202r(byte[] bArr, int i, int i2) {
        try {
            m10201q(i, i + i2, bArr.length);
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return new t46(bArr2);
        } catch (g86 e) {
            xy4.m12790s("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ boolean m10203s(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i + i3;
        m10201q(i, i4, bArr.length);
        m10201q(i2, i3 + i2, bArr2.length);
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
    public abstract byte mo8517b(int i);

    /* JADX INFO: renamed from: c */
    public abstract int mo8518c(int i, int i2);

    /* JADX INFO: renamed from: d */
    public abstract int mo8519d();

    /* JADX INFO: renamed from: e */
    public abstract r46 mo8520e(int i, int i2);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r46)) {
            return false;
        }
        r46 r46Var = (r46) obj;
        int iMo8519d = mo8519d();
        if (iMo8519d != r46Var.mo8519d()) {
            return false;
        }
        if (iMo8519d == 0) {
            return true;
        }
        int i = this.f29011a;
        int i2 = r46Var.f29011a;
        if (i == 0 || i2 == 0 || i == i2) {
            return mo8523m(r46Var);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo8521g(int i, byte[] bArr);

    public final int hashCode() {
        int iMo8518c = this.f29011a;
        if (iMo8518c == 0) {
            int iMo8519d = mo8519d();
            iMo8518c = mo8518c(iMo8519d, iMo8519d);
            if (iMo8518c == 0) {
                iMo8518c = 1;
            }
            this.f29011a = iMo8518c;
        }
        return iMo8518c;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        g50 g50Var = new g50((byte) 2);
        g50Var.f19618d = this;
        g50Var.f19616b = 0;
        g50Var.f19617c = mo8519d();
        VarHandle.storeStoreFence();
        return g50Var;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo8522l(n83 n83Var);

    /* JADX INFO: renamed from: m */
    public abstract boolean mo8523m(r46 r46Var);

    public final String toString() {
        byte[] bArr;
        String strConcat;
        byte[] bArr2;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMo8519d = mo8519d();
        if (mo8519d() <= 50) {
            int iMo8519d2 = mo8519d();
            if (iMo8519d2 == 0) {
                bArr2 = j76.f22079a;
            } else {
                byte[] bArr3 = new byte[iMo8519d2];
                mo8521g(iMo8519d2, bArr3);
                bArr2 = bArr3;
            }
            strConcat = yt5.m13237a(bArr2);
        } else {
            r46 r46VarMo8520e = mo8520e(0, 47);
            int iMo8519d3 = r46VarMo8520e.mo8519d();
            if (iMo8519d3 == 0) {
                bArr = j76.f22079a;
            } else {
                byte[] bArr4 = new byte[iMo8519d3];
                r46VarMo8520e.mo8521g(iMo8519d3, bArr4);
                bArr = bArr4;
            }
            strConcat = yt5.m13237a(bArr).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iMo8519d);
        sb.append(" contents=\"");
        return zi4.m13623w(sb, strConcat, "\">");
    }
}
