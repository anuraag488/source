package p000;

import java.lang.invoke.VarHandle;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ya0 {

    /* JADX INFO: renamed from: e */
    public static final Logger f35062e = Logger.getLogger(ya0.class.getName());

    /* JADX INFO: renamed from: f */
    public static final boolean f35063f = cv4.f16514e;

    /* JADX INFO: renamed from: a */
    public ar3 f35064a;

    /* JADX INFO: renamed from: b */
    public byte[] f35065b;

    /* JADX INFO: renamed from: c */
    public int f35066c;

    /* JADX INFO: renamed from: d */
    public int f35067d;

    /* JADX INFO: renamed from: a */
    public static int m13055a(int i, t50 t50Var) {
        int iM13059e = m13059e(i);
        int size = t50Var.size();
        return m13060f(size) + size + iM13059e;
    }

    /* JADX INFO: renamed from: b */
    public static int m13056b(int i) {
        return m13060f((i >> 31) ^ (i << 1));
    }

    /* JADX INFO: renamed from: c */
    public static int m13057c(long j) {
        return m13061g((j >> 63) ^ (j << 1));
    }

    /* JADX INFO: renamed from: d */
    public static int m13058d(String str) {
        int length;
        try {
            length = vv4.m11993a(str);
        } catch (tv4 unused) {
            length = str.getBytes(k62.f22939a).length;
        }
        return m13060f(length) + length;
    }

    /* JADX INFO: renamed from: e */
    public static int m13059e(int i) {
        return m13060f(i << 3);
    }

    /* JADX INFO: renamed from: f */
    public static int m13060f(int i) {
        return c75.m3875g(i, 9, 352) >>> 6;
    }

    /* JADX INFO: renamed from: g */
    public static int m13061g(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: h */
    public static ya0 m13062h(byte[] bArr) {
        int length = bArr.length;
        ya0 ya0Var = new ya0();
        if (((bArr.length - length) | length) < 0) {
            Locale locale = Locale.US;
            C1077qn.m9987m(zi4.m13618r(bArr.length, length, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            return null;
        }
        ya0Var.f35065b = bArr;
        ya0Var.f35067d = 0;
        ya0Var.f35066c = length;
        VarHandle.storeStoreFence();
        return ya0Var;
    }

    /* JADX INFO: renamed from: i */
    public final int m13063i() {
        return this.f35066c - this.f35067d;
    }

    /* JADX INFO: renamed from: j */
    public final void m13064j(byte b) throws za0 {
        int i;
        int i2 = this.f35067d;
        try {
            int i3 = i2 + 1;
            try {
                this.f35065b[i2] = b;
                this.f35067d = i3;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i3;
                throw new za0(i, this.f35066c, 1, e, (byte) 0);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            i = i2;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m13065k(int i, boolean z) throws za0 {
        m13075u(i, 0);
        m13064j(z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: l */
    public final void m13066l(int i, t50 t50Var) {
        m13075u(i, 2);
        m13077w(t50Var.size());
        o50 o50Var = (o50) t50Var;
        m13073s(o50Var.f26351d, o50Var.mo7016m(), o50Var.size());
    }

    /* JADX INFO: renamed from: m */
    public final void m13067m(int i, int i2) {
        m13075u(i, 5);
        m13068n(i2);
    }

    /* JADX INFO: renamed from: n */
    public final void m13068n(int i) throws za0 {
        int i2 = this.f35067d;
        try {
            byte[] bArr = this.f35065b;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.f35067d = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new za0(i2, this.f35066c, 4, e, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m13069o(int i, long j) {
        m13075u(i, 1);
        m13070p(j);
    }

    /* JADX INFO: renamed from: p */
    public final void m13070p(long j) throws za0 {
        int i = this.f35067d;
        try {
            byte[] bArr = this.f35065b;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.f35067d = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new za0(i, this.f35066c, 8, e, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m13071q(int i, int i2) throws za0 {
        m13075u(i, 0);
        m13072r(i2);
    }

    /* JADX INFO: renamed from: r */
    public final void m13072r(int i) throws za0 {
        if (i >= 0) {
            m13077w(i);
        } else {
            m13079y(i);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m13073s(byte[] bArr, int i, int i2) throws za0 {
        try {
            System.arraycopy(bArr, i, this.f35065b, this.f35067d, i2);
            this.f35067d += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new za0(this.f35067d, this.f35066c, i2, e, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m13074t(int i, String str) throws za0 {
        m13075u(i, 2);
        byte[] bArr = this.f35065b;
        int i2 = this.f35067d;
        try {
            int iM13060f = m13060f(str.length() * 3);
            int iM13060f2 = m13060f(str.length());
            if (iM13060f2 != iM13060f) {
                m13077w(vv4.m11993a(str));
                this.f35067d = vv4.f32889a.mo10474t(str, bArr, this.f35067d, m13063i());
                return;
            }
            int i3 = i2 + iM13060f2;
            this.f35067d = i3;
            int iMo10474t = vv4.f32889a.mo10474t(str, bArr, i3, m13063i());
            this.f35067d = i2;
            m13077w((iMo10474t - i2) - iM13060f2);
            this.f35067d = iMo10474t;
        } catch (IndexOutOfBoundsException e) {
            throw new za0(e);
        } catch (tv4 e2) {
            this.f35067d = i2;
            f35062e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
            byte[] bytes = str.getBytes(k62.f22939a);
            try {
                m13077w(bytes.length);
                m13073s(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e3) {
                throw new za0(e3);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m13075u(int i, int i2) {
        m13077w((i << 3) | i2);
    }

    /* JADX INFO: renamed from: v */
    public final void m13076v(int i, int i2) {
        m13075u(i, 0);
        m13077w(i2);
    }

    /* JADX INFO: renamed from: w */
    public final void m13077w(int i) {
        int i2;
        int i3 = this.f35067d;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.f35065b;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.f35067d = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new za0(i2, this.f35066c, 1, e, (byte) 0);
                }
            }
            throw new za0(i2, this.f35066c, 1, e, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m13078x(int i, long j) {
        m13075u(i, 0);
        m13079y(j);
    }

    /* JADX INFO: renamed from: y */
    public final void m13079y(long j) throws za0 {
        int i;
        byte[] bArr = this.f35065b;
        int i2 = this.f35067d;
        if (!f35063f || m13063i() < 10) {
            while ((j & (-128)) != 0) {
                i = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i;
                } catch (IndexOutOfBoundsException e) {
                    throw new za0(i, this.f35066c, 1, e, (byte) 0);
                }
            }
            i = i2 + 1;
            bArr[i2] = (byte) j;
        } else {
            while ((j & (-128)) != 0) {
                cv4.m4185l(bArr, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            cv4.m4185l(bArr, i2, (byte) j);
        }
        this.f35067d = i;
    }
}
