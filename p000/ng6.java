package p000;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ng6 {

    /* JADX INFO: renamed from: e */
    public static final Logger f25781e = Logger.getLogger(ng6.class.getName());

    /* JADX INFO: renamed from: f */
    public static final boolean f25782f = ml6.f25014e;

    /* JADX INFO: renamed from: a */
    public bt5 f25783a;

    /* JADX INFO: renamed from: b */
    public final byte[] f25784b;

    /* JADX INFO: renamed from: c */
    public final int f25785c;

    /* JADX INFO: renamed from: d */
    public int f25786d;

    public ng6(int i, byte[] bArr) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            C1077qn.m9987m(zi4.m13618r(length, i, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            throw null;
        }
        this.f25784b = bArr;
        this.f25786d = 0;
        this.f25785c = i;
    }

    /* JADX INFO: renamed from: a */
    public static int m8711a(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: b */
    public static int m8712b(String str) {
        int length;
        try {
            length = ql6.m9907b(str);
        } catch (pl6 unused) {
            length = str.getBytes(ni6.f25875a).length;
        }
        return m8713s(length) + length;
    }

    /* JADX INFO: renamed from: s */
    public static int m8713s(int i) {
        return c75.m3875g(i, 9, 352) >>> 6;
    }

    /* JADX INFO: renamed from: c */
    public final void m8714c(int i, int i2) throws za0 {
        m8724m((i << 3) | i2);
    }

    /* JADX INFO: renamed from: d */
    public final void m8715d(int i, int i2) throws za0 {
        m8724m(i << 3);
        m8723l(i2);
    }

    /* JADX INFO: renamed from: e */
    public final void m8716e(int i, int i2) throws za0 {
        m8724m(i << 3);
        m8724m(i2);
    }

    /* JADX INFO: renamed from: f */
    public final void m8717f(int i, int i2) throws za0 {
        m8724m((i << 3) | 5);
        m8725n(i2);
    }

    /* JADX INFO: renamed from: g */
    public final void m8718g(int i, long j) throws za0 {
        m8724m(i << 3);
        m8726o(j);
    }

    /* JADX INFO: renamed from: h */
    public final void m8719h(int i, long j) throws za0 {
        m8724m((i << 3) | 1);
        m8727p(j);
    }

    /* JADX INFO: renamed from: i */
    public final void m8720i(int i, ig6 ig6Var) throws za0 {
        m8724m((i << 3) | 2);
        m8721j(ig6Var);
    }

    /* JADX INFO: renamed from: j */
    public final void m8721j(ig6 ig6Var) throws za0 {
        m8724m(ig6Var.mo3593d());
        m8728q(ig6Var.mo3593d(), ig6Var.f21414b);
    }

    /* JADX INFO: renamed from: k */
    public final void m8722k(byte b) throws za0 {
        int i = this.f25786d;
        try {
            int i2 = i + 1;
            try {
                this.f25784b[i] = b;
                this.f25786d = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new za0(i, this.f25785c, 1, e, (byte) 4);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m8723l(int i) throws za0 {
        if (i >= 0) {
            m8724m(i);
        } else {
            m8726o(i);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m8724m(int i) throws za0 {
        int i2;
        int i3 = this.f25786d;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.f25784b;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.f25786d = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new za0(i2, this.f25785c, 1, e, (byte) 4);
                }
            }
            throw new za0(i2, this.f25785c, 1, e, (byte) 4);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m8725n(int i) throws za0 {
        int i2 = this.f25786d;
        try {
            byte[] bArr = this.f25784b;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f25786d = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new za0(i2, this.f25785c, 4, e, (byte) 4);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m8726o(long j) throws za0 {
        int i;
        int i2 = this.f25786d;
        byte[] bArr = this.f25784b;
        int i3 = this.f25785c;
        if (!f25782f || i3 - i2 < 10) {
            long j2 = j;
            while ((j2 & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j2) | 128);
                    j2 >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new za0(i, i3, 1, e, (byte) 4);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j2;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new za0(i, i3, 1, e, (byte) 4);
            }
        } else {
            long j3 = j;
            while ((j3 & (-128)) != 0) {
                ml6.f25012c.mo3732l(bArr, ml6.f25015f + ((long) i2), (byte) (((int) j3) | 128));
                j3 >>>= 7;
                i2++;
            }
            i = i2 + 1;
            ml6.f25012c.mo3732l(bArr, ml6.f25015f + ((long) i2), (byte) j3);
        }
        this.f25786d = i;
    }

    /* JADX INFO: renamed from: p */
    public final void m8727p(long j) throws za0 {
        int i = this.f25786d;
        try {
            byte[] bArr = this.f25784b;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.f25786d = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new za0(i, this.f25785c, 8, e, (byte) 4);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m8728q(int i, byte[] bArr) throws za0 {
        try {
            System.arraycopy(bArr, 0, this.f25784b, this.f25786d, i);
            this.f25786d += i;
        } catch (IndexOutOfBoundsException e) {
            throw new za0(this.f25786d, this.f25785c, i, e, (byte) 4);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m8729r(String str) throws za0 {
        int i = this.f25786d;
        try {
            int iM8713s = m8713s(str.length() * 3);
            int iM8713s2 = m8713s(str.length());
            int i2 = this.f25785c;
            byte[] bArr = this.f25784b;
            if (iM8713s2 != iM8713s) {
                m8724m(ql6.m9907b(str));
                int i3 = this.f25786d;
                this.f25786d = ql6.m9908c(str, bArr, i3, i2 - i3);
            } else {
                int i4 = i + iM8713s2;
                this.f25786d = i4;
                int iM9908c = ql6.m9908c(str, bArr, i4, i2 - i4);
                this.f25786d = i;
                m8724m((iM9908c - i) - iM8713s2);
                this.f25786d = iM9908c;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new za0(e);
        } catch (pl6 e2) {
            this.f25786d = i;
            f25781e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(ni6.f25875a);
            try {
                int length = bytes.length;
                m8724m(length);
                m8728q(length, bytes);
            } catch (IndexOutOfBoundsException e3) {
                throw new za0(e3);
            }
        }
    }
}
