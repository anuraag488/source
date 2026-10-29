package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class in6 extends yy5 {

    /* JADX INFO: renamed from: f */
    public static final Logger f21595f = Logger.getLogger(in6.class.getName());

    /* JADX INFO: renamed from: g */
    public static final boolean f21596g = rq6.f29538e;

    /* JADX INFO: renamed from: a */
    public rr5 f21597a;

    /* JADX INFO: renamed from: b */
    public byte[] f21598b;

    /* JADX INFO: renamed from: c */
    public int f21599c;

    /* JADX INFO: renamed from: d */
    public int f21600d;

    /* JADX INFO: renamed from: e */
    public OutputStream f21601e;

    /* JADX INFO: renamed from: f */
    public static int m6824f(String str) {
        int length;
        try {
            length = tq6.m11091b(str);
        } catch (sq6 unused) {
            length = str.getBytes(ro6.f29484a).length;
        }
        return m6825g(length) + length;
    }

    /* JADX INFO: renamed from: g */
    public static int m6825g(int i) {
        return c75.m3875g(i, 9, 352) >>> 6;
    }

    /* JADX INFO: renamed from: h */
    public static int m6826h(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: A */
    public final void m6827A(long j) {
        m6830j(10);
        m6834n(j);
    }

    /* JADX INFO: renamed from: B */
    public final void m6828B(int i, byte[] bArr) throws IOException {
        int i2 = this.f21599c;
        int i3 = this.f21600d;
        int i4 = i2 - i3;
        byte[] bArr2 = this.f21598b;
        if (i4 >= i) {
            System.arraycopy(bArr, 0, bArr2, i3, i);
            this.f21600d += i;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i3, i4);
        this.f21600d = i2;
        m6829i();
        int i5 = i - i4;
        if (i5 > i2) {
            this.f21601e.write(bArr, i4, i5);
        } else {
            System.arraycopy(bArr, i4, bArr2, 0, i5);
            this.f21600d = i5;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m6829i() {
        this.f21601e.write(this.f21598b, 0, this.f21600d);
        this.f21600d = 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m6830j(int i) {
        if (this.f21599c - this.f21600d < i) {
            m6829i();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m6831k(int i) {
        int i2 = this.f21600d;
        byte[] bArr = this.f21598b;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f21600d = i2 + 4;
    }

    /* JADX INFO: renamed from: l */
    public final void m6832l(long j) {
        int i = this.f21600d;
        byte[] bArr = this.f21598b;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.f21600d = i + 8;
    }

    /* JADX INFO: renamed from: m */
    public final void m6833m(int i) {
        byte[] bArr = this.f21598b;
        if (f21596g) {
            while (true) {
                int i2 = i & (-128);
                int i3 = this.f21600d;
                if (i2 == 0) {
                    this.f21600d = i3 + 1;
                    byte b = (byte) i;
                    rq6.f29536c.mo3737q(bArr, rq6.f29539f + ((long) i3), b);
                    return;
                }
                this.f21600d = i3 + 1;
                rq6.f29536c.mo3737q(bArr, rq6.f29539f + ((long) i3), (byte) (i | 128));
                i >>>= 7;
            }
        } else {
            while (true) {
                int i4 = i & (-128);
                int i5 = this.f21600d;
                if (i4 == 0) {
                    this.f21600d = i5 + 1;
                    bArr[i5] = (byte) i;
                    return;
                } else {
                    this.f21600d = i5 + 1;
                    bArr[i5] = (byte) (i | 128);
                    i >>>= 7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m6834n(long j) {
        byte[] bArr = this.f21598b;
        if (f21596g) {
            while (true) {
                long j2 = j & (-128);
                int i = (int) j;
                int i2 = this.f21600d;
                if (j2 == 0) {
                    this.f21600d = i2 + 1;
                    rq6.f29536c.mo3737q(bArr, rq6.f29539f + ((long) i2), (byte) i);
                    return;
                }
                this.f21600d = i2 + 1;
                byte b = (byte) (i | 128);
                rq6.f29536c.mo3737q(bArr, rq6.f29539f + ((long) i2), b);
                j >>>= 7;
            }
        } else {
            while (true) {
                long j3 = j & (-128);
                int i3 = (int) j;
                int i4 = this.f21600d;
                if (j3 == 0) {
                    this.f21600d = i4 + 1;
                    bArr[i4] = (byte) i3;
                    return;
                } else {
                    this.f21600d = i4 + 1;
                    bArr[i4] = (byte) (i3 | 128);
                    j >>>= 7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m6835o(ym6 ym6Var) throws IOException {
        m6845y(ym6Var.mo11067d());
        m6828B(ym6Var.mo11067d(), ym6Var.f35340b);
    }

    /* JADX INFO: renamed from: p */
    public final void m6836p(int i, int i2) {
        m6830j(14);
        m6833m((i << 3) | 5);
        m6831k(i2);
    }

    /* JADX INFO: renamed from: q */
    public final void m6837q(int i) {
        m6830j(4);
        m6831k(i);
    }

    /* JADX INFO: renamed from: r */
    public final void m6838r(int i, long j) {
        m6830j(18);
        m6833m((i << 3) | 1);
        m6832l(j);
    }

    /* JADX INFO: renamed from: s */
    public final void m6839s(long j) {
        m6830j(8);
        m6832l(j);
    }

    /* JADX INFO: renamed from: t */
    public final void m6840t(int i, int i2) {
        m6830j(20);
        m6833m(i << 3);
        if (i2 >= 0) {
            m6833m(i2);
        } else {
            m6834n(i2);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m6841u(int i) {
        if (i >= 0) {
            m6845y(i);
        } else {
            m6827A(i);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m6842v(String str) throws IOException {
        byte[] bArr = this.f21598b;
        try {
            int length = str.length() * 3;
            int iM6825g = m6825g(length);
            int i = iM6825g + length;
            int i2 = this.f21599c;
            if (i > i2) {
                byte[] bArr2 = new byte[length];
                int iM11090a = tq6.m11090a(str, bArr2, 0, length);
                m6845y(iM11090a);
                m6828B(iM11090a, bArr2);
                return;
            }
            if (i > i2 - this.f21600d) {
                m6829i();
            }
            int iM6825g2 = m6825g(str.length());
            int i3 = this.f21600d;
            try {
                if (iM6825g2 == iM6825g) {
                    int i4 = i3 + iM6825g2;
                    this.f21600d = i4;
                    int iM11090a2 = tq6.m11090a(str, bArr, i4, i2 - i4);
                    this.f21600d = i3;
                    m6833m((iM11090a2 - i3) - iM6825g2);
                    this.f21600d = iM11090a2;
                } else {
                    int iM11091b = tq6.m11091b(str);
                    m6833m(iM11091b);
                    this.f21600d = tq6.m11090a(str, bArr, this.f21600d, iM11091b);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new za0(e);
            } catch (sq6 e2) {
                this.f21600d = i3;
                throw e2;
            }
        } catch (sq6 e3) {
            f21595f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(ro6.f29484a);
            try {
                int length2 = bytes.length;
                m6845y(length2);
                m6828B(length2, bytes);
            } catch (IndexOutOfBoundsException e4) {
                throw new za0(e4);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m6843w(int i, int i2) {
        m6845y((i << 3) | i2);
    }

    /* JADX INFO: renamed from: x */
    public final void m6844x(int i, int i2) {
        m6830j(20);
        m6833m(i << 3);
        m6833m(i2);
    }

    /* JADX INFO: renamed from: y */
    public final void m6845y(int i) {
        m6830j(5);
        m6833m(i);
    }

    /* JADX INFO: renamed from: z */
    public final void m6846z(int i, long j) {
        m6830j(20);
        m6833m(i << 3);
        m6834n(j);
    }
}
