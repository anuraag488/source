package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: sh */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1145sh {

    /* JADX INFO: renamed from: a */
    public int f30262a;

    /* JADX INFO: renamed from: b */
    public int f30263b;

    /* JADX INFO: renamed from: c */
    public Object f30264c;

    /* JADX INFO: renamed from: d */
    public Object f30265d;

    /* JADX INFO: renamed from: e */
    public Object f30266e;

    /* JADX INFO: renamed from: g */
    public static int m10751g(int i, n50 n50Var) {
        int iM10752h = m10752h(i);
        int size = n50Var.size();
        return m10753i(size) + size + iM10752h;
    }

    /* JADX INFO: renamed from: h */
    public static int m10752h(int i) {
        return m10753i(i << 3);
    }

    /* JADX INFO: renamed from: i */
    public static int m10753i(int i) {
        return c75.m3875g(i, 9, 352) >>> 6;
    }

    /* JADX INFO: renamed from: j */
    public static int m10754j(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: A */
    public void m10755A(int i) {
        if (i >= 0) {
            m10761G(i);
        } else {
            m10763I(i);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m10756B(byte[] bArr, int i, int i2) {
        m10777r(bArr, i, i2);
    }

    /* JADX INFO: renamed from: C */
    public void m10757C(int i, String str) throws IOException {
        m10759E(i, 2);
        m10758D(str);
    }

    /* JADX INFO: renamed from: D */
    public void m10758D(String str) throws IOException {
        byte[] bArr = (byte[]) this.f30265d;
        int length = str.length() * 3;
        int iM10753i = m10753i(length);
        int i = iM10753i + length;
        int i2 = this.f30262a;
        if (i > i2) {
            byte[] bArr2 = new byte[length];
            int iMo7749K = wv4.f33788a.mo7749K(str, bArr2, 0, length);
            m10761G(iMo7749K);
            m10777r(bArr2, 0, iMo7749K);
            return;
        }
        if (i > i2 - this.f30263b) {
            m10770k();
        }
        int iM10753i2 = m10753i(str.length());
        int i3 = this.f30263b;
        try {
            if (iM10753i2 == iM10753i) {
                int i4 = i3 + iM10753i2;
                this.f30263b = i4;
                int iMo7749K2 = wv4.f33788a.mo7749K(str, bArr, i4, i2 - i4);
                this.f30263b = i3;
                m10768e((iMo7749K2 - i3) - iM10753i2);
                this.f30263b = iMo7749K2;
            } else {
                kx5 kx5Var = wv4.f33788a;
                int iMo7750M = kx5Var.mo7750M(str);
                m10768e(iMo7750M);
                this.f30263b = kx5Var.mo7749K(str, bArr, this.f30263b, iMo7750M);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new za0(e);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m10759E(int i, int i2) {
        m10761G((i << 3) | i2);
    }

    /* JADX INFO: renamed from: F */
    public void m10760F(int i, int i2) {
        m10771l(20);
        m10767d(i, 0);
        m10768e(i2);
    }

    /* JADX INFO: renamed from: G */
    public void m10761G(int i) {
        m10771l(5);
        m10768e(i);
    }

    /* JADX INFO: renamed from: H */
    public void m10762H(int i, long j) {
        m10771l(20);
        m10767d(i, 0);
        m10769f(j);
    }

    /* JADX INFO: renamed from: I */
    public void m10763I(long j) {
        m10771l(10);
        m10769f(j);
    }

    /* JADX INFO: renamed from: a */
    public int m10764a(long j) {
        int i = this.f30262a + 1;
        long[] jArr = (long[]) this.f30264c;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
            AbstractC0990oo.m9204Y((int[]) this.f30265d, iArr, 0, 0, 14);
            this.f30264c = jArr2;
            this.f30265d = iArr;
        }
        int i3 = this.f30262a;
        this.f30262a = i3 + 1;
        int[] iArr2 = (int[]) this.f30266e;
        int length2 = iArr2.length;
        if (this.f30263b >= length2) {
            int i4 = length2 * 2;
            iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            AbstractC0990oo.m9204Y((int[]) this.f30266e, iArr2, 0, 0, 14);
            this.f30266e = iArr2;
        }
        int[] iArr3 = iArr2;
        int i7 = this.f30263b;
        this.f30263b = iArr2[i7];
        long[] jArr3 = (long[]) this.f30264c;
        jArr3[i3] = j;
        ((int[]) this.f30265d)[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (z62.m13394v(jArr3[i8], j) <= 0) {
                break;
            }
            m10774o(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    /* JADX INFO: renamed from: b */
    public void m10765b(int i) {
        int i2 = this.f30263b;
        byte[] bArr = (byte[]) this.f30265d;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.f30263b = i2 + 4;
    }

    /* JADX INFO: renamed from: c */
    public void m10766c(long j) {
        int i = this.f30263b;
        byte[] bArr = (byte[]) this.f30265d;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
        this.f30263b = i + 8;
    }

    /* JADX INFO: renamed from: d */
    public void m10767d(int i, int i2) {
        m10768e((i << 3) | i2);
    }

    /* JADX INFO: renamed from: e */
    public void m10768e(int i) {
        int i2 = this.f30263b;
        int i3 = i & (-128);
        byte[] bArr = (byte[]) this.f30265d;
        if (i3 == 0) {
            bArr[i2] = (byte) i;
            this.f30263b = i2 + 1;
            return;
        }
        bArr[i2] = (byte) (i | 128);
        int i4 = i >>> 7;
        if ((i4 & (-128)) == 0) {
            bArr[i2 + 1] = (byte) i4;
            this.f30263b = i2 + 2;
            return;
        }
        bArr[i2 + 1] = (byte) (i4 | 128);
        int i5 = i >>> 14;
        if ((i5 & (-128)) == 0) {
            bArr[i2 + 2] = (byte) i5;
            this.f30263b = i2 + 3;
            return;
        }
        bArr[i2 + 2] = (byte) (i5 | 128);
        int i6 = i >>> 21;
        if ((i6 & (-128)) == 0) {
            bArr[i2 + 3] = (byte) i6;
            this.f30263b = i2 + 4;
        } else {
            bArr[i2 + 3] = (byte) (i6 | 128);
            bArr[i2 + 4] = (byte) (i >>> 28);
            this.f30263b = i2 + 5;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m10769f(long j) {
        int i = this.f30263b;
        long j2 = j & (-128);
        byte[] bArr = (byte[]) this.f30265d;
        if (j2 == 0) {
            bArr[i] = (byte) j;
            this.f30263b = i + 1;
            return;
        }
        bArr[i] = (byte) (((int) j) | 128);
        long j3 = j >>> 7;
        if ((j3 & (-128)) == 0) {
            bArr[i + 1] = (byte) j3;
            this.f30263b = i + 2;
            return;
        }
        bArr[i + 1] = (byte) (((int) j3) | 128);
        long j4 = j >>> 14;
        if ((j4 & (-128)) == 0) {
            bArr[i + 2] = (byte) j4;
            this.f30263b = i + 3;
            return;
        }
        bArr[i + 2] = (byte) (((int) j4) | 128);
        long j5 = j >>> 21;
        if ((j5 & (-128)) == 0) {
            bArr[i + 3] = (byte) j5;
            this.f30263b = i + 4;
            return;
        }
        bArr[i + 3] = (byte) (((int) j5) | 128);
        long j6 = j >>> 28;
        if ((j6 & (-128)) == 0) {
            bArr[i + 4] = (byte) j6;
            this.f30263b = i + 5;
            return;
        }
        bArr[i + 4] = (byte) (((int) j6) | 128);
        long j7 = j >>> 35;
        if ((j7 & (-128)) == 0) {
            bArr[i + 5] = (byte) j7;
            this.f30263b = i + 6;
            return;
        }
        bArr[i + 5] = (byte) (((int) j7) | 128);
        long j8 = j >>> 42;
        if ((j8 & (-128)) == 0) {
            bArr[i + 6] = (byte) j8;
            this.f30263b = i + 7;
            return;
        }
        bArr[i + 6] = (byte) (((int) j8) | 128);
        long j9 = j >>> 49;
        if ((j9 & (-128)) == 0) {
            bArr[i + 7] = (byte) j9;
            this.f30263b = i + 8;
            return;
        }
        bArr[i + 7] = (byte) (((int) j9) | 128);
        long j10 = j >>> 56;
        if (((-128) & j10) == 0) {
            bArr[i + 8] = (byte) j10;
            this.f30263b = i + 9;
        } else {
            bArr[i + 8] = (byte) (((int) j10) | 128);
            bArr[i + 9] = (byte) (j >>> 63);
            this.f30263b = i + 10;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m10770k() {
        ((xt4) this.f30266e).write((byte[]) this.f30265d, 0, this.f30263b);
        this.f30263b = 0;
    }

    /* JADX INFO: renamed from: l */
    public void m10771l(int i) {
        if (this.f30262a - this.f30263b < i) {
            m10770k();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    /* JADX INFO: renamed from: m */
    public hf0 m10772m(TypedArray typedArray, Resources.Theme theme, String str, int i) throws XmlPullParserException, IOException {
        hf0 hf0Var;
        if (y62.m12942J((XmlResourceParser) this.f30264c, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 < 28 || i2 > 31) {
                try {
                    hf0Var = hf0.m6368h(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                } catch (Exception e) {
                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                    hf0Var = null;
                }
                if (hf0Var == null) {
                    hf0Var = new hf0((Shader) null, 0);
                }
            } else {
                hf0Var = new hf0((Shader) null, typedValue.data);
            }
        } else {
            hf0Var = new hf0((Shader) null, 0);
        }
        m10775p(typedArray.getChangingConfigurations());
        return hf0Var;
    }

    /* JADX INFO: renamed from: n */
    public float m10773n(TypedArray typedArray, String str, int i, float f) {
        if (y62.m12942J((XmlResourceParser) this.f30264c, str)) {
            f = typedArray.getFloat(i, f);
        }
        m10775p(typedArray.getChangingConfigurations());
        return f;
    }

    /* JADX INFO: renamed from: o */
    public void m10774o(int i, int i2) {
        long[] jArr = (long[]) this.f30264c;
        int[] iArr = (int[]) this.f30265d;
        int[] iArr2 = (int[]) this.f30266e;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    /* JADX INFO: renamed from: p */
    public void m10775p(int i) {
        this.f30262a = i | this.f30262a;
    }

    /* JADX INFO: renamed from: q */
    public void m10776q(byte b) {
        if (this.f30263b == this.f30262a) {
            m10770k();
        }
        int i = this.f30263b;
        ((byte[]) this.f30265d)[i] = b;
        this.f30263b = i + 1;
    }

    /* JADX INFO: renamed from: r */
    public void m10777r(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f30262a;
        int i4 = this.f30263b;
        int i5 = i3 - i4;
        byte[] bArr2 = (byte[]) this.f30265d;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i4, i2);
            this.f30263b += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f30263b = i3;
        m10770k();
        if (i7 > i3) {
            ((xt4) this.f30266e).write(bArr, i6, i7);
        } else {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.f30263b = i7;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m10778s(int i, boolean z) {
        m10771l(11);
        m10767d(i, 0);
        byte b = z ? (byte) 1 : (byte) 0;
        int i2 = this.f30263b;
        ((byte[]) this.f30265d)[i2] = b;
        this.f30263b = i2 + 1;
    }

    /* JADX INFO: renamed from: t */
    public void m10779t(int i, n50 n50Var) {
        m10759E(i, 2);
        m10780u(n50Var);
    }

    /* JADX INFO: renamed from: u */
    public void m10780u(n50 n50Var) {
        m10761G(n50Var.size());
        n50Var.mo7406r(this);
    }

    /* JADX INFO: renamed from: v */
    public void m10781v(int i, int i2) {
        m10771l(14);
        m10767d(i, 5);
        m10765b(i2);
    }

    /* JADX INFO: renamed from: w */
    public void m10782w(int i) {
        m10771l(4);
        m10765b(i);
    }

    /* JADX INFO: renamed from: x */
    public void m10783x(int i, long j) {
        m10771l(18);
        m10767d(i, 1);
        m10766c(j);
    }

    /* JADX INFO: renamed from: y */
    public void m10784y(long j) {
        m10771l(8);
        m10766c(j);
    }

    /* JADX INFO: renamed from: z */
    public void m10785z(int i, int i2) {
        m10771l(20);
        m10767d(i, 0);
        if (i2 >= 0) {
            m10768e(i2);
        } else {
            m10769f(i2);
        }
    }
}
