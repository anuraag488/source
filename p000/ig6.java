package p000;

import java.io.Serializable;
import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ig6 implements Iterable, Serializable {

    /* JADX INFO: renamed from: c */
    public static final ig6 f21412c = new ig6(ni6.f25876b);

    /* JADX INFO: renamed from: a */
    public int f21413a = 0;

    /* JADX INFO: renamed from: b */
    public final byte[] f21414b;

    static {
        int i = lf6.f24009a;
    }

    public ig6(byte[] bArr) {
        bArr.getClass();
        this.f21414b = bArr;
    }

    /* JADX INFO: renamed from: e */
    public static ig6 m6803e(byte[] bArr, int i, int i2) {
        m6804g(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new ig6(bArr2);
    }

    /* JADX INFO: renamed from: g */
    public static int m6804g(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    /* JADX INFO: renamed from: b */
    public byte mo3591b(int i) {
        return this.f21414b[i];
    }

    /* JADX INFO: renamed from: c */
    public byte mo3592c(int i) {
        return this.f21414b[i];
    }

    /* JADX INFO: renamed from: d */
    public int mo3593d() {
        return this.f21414b.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ig6) && mo3593d() == ((ig6) obj).mo3593d()) {
            if (mo3593d() == 0) {
                return true;
            }
            if (!(obj instanceof ig6)) {
                return obj.equals(this);
            }
            ig6 ig6Var = (ig6) obj;
            int i = this.f21413a;
            int i2 = ig6Var.f21413a;
            if (i == 0 || i2 == 0 || i == i2) {
                int iMo3593d = mo3593d();
                if (iMo3593d > ig6Var.mo3593d()) {
                    int iMo3593d2 = mo3593d();
                    StringBuilder sb = new StringBuilder(String.valueOf(iMo3593d).length() + 18 + String.valueOf(iMo3593d2).length());
                    sb.append("Length too large: ");
                    sb.append(iMo3593d);
                    sb.append(iMo3593d2);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (iMo3593d <= ig6Var.mo3593d()) {
                    byte[] bArr = ig6Var.f21414b;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < iMo3593d) {
                        if (this.f21414b[i3] == bArr[i4]) {
                            i3++;
                            i4++;
                        }
                    }
                    return true;
                }
                int iMo3593d3 = ig6Var.mo3593d();
                StringBuilder sb2 = new StringBuilder(String.valueOf(iMo3593d).length() + 27 + String.valueOf(iMo3593d3).length());
                sb2.append("Ran off end of other: 0, ");
                sb2.append(iMo3593d);
                sb2.append(", ");
                sb2.append(iMo3593d3);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f21413a;
        if (i != 0) {
            return i;
        }
        int iMo3593d = mo3593d();
        int i2 = iMo3593d;
        for (int i3 = 0; i3 < iMo3593d; i3++) {
            i2 = (i2 * 31) + this.f21414b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f21413a = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        g50 g50Var = new g50((byte) 4);
        g50Var.f19618d = this;
        g50Var.f19616b = 0;
        g50Var.f19617c = mo3593d();
        VarHandle.storeStoreFence();
        return g50Var;
    }

    public final String toString() {
        ig6 ig6Var;
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMo3593d = mo3593d();
        if (mo3593d() <= 50) {
            strConcat = ay5.m3373a(this);
        } else {
            int iM6804g = m6804g(0, 47, mo3593d());
            if (iM6804g == 0) {
                ig6Var = f21412c;
            } else {
                byte[] bArr = this.f21414b;
                bg6 bg6Var = new bg6(bArr);
                m6804g(0, iM6804g, bArr.length);
                bg6Var.f15260d = iM6804g;
                VarHandle.storeStoreFence();
                ig6Var = bg6Var;
            }
            strConcat = ay5.m3373a(ig6Var).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iMo3593d);
        sb.append(" contents=\"");
        return zi4.m13623w(sb, strConcat, "\">");
    }
}
