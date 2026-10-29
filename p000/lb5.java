package p000;

import ads_mobile_sdk.AbstractC0137h;
import ads_mobile_sdk.gh3;
import ads_mobile_sdk.ls3;
import ads_mobile_sdk.su1;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.UserManager;
import java.io.Closeable;
import java.lang.invoke.VarHandle;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.chromium.net.C0995R;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class lb5 {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f23923k = 0;

    /* JADX INFO: renamed from: n */
    public static g12 f23926n;

    /* JADX INFO: renamed from: c */
    public static final pg0 f23915c = new pg0(969297003, false, new tg0(27));

    /* JADX INFO: renamed from: d */
    public static final pg0 f23916d = new pg0(346015401, false, new tg0(28));

    /* JADX INFO: renamed from: e */
    public static final pg0 f23917e = new pg0(-951331177, false, new tg0(29));

    /* JADX INFO: renamed from: f */
    public static final pg0 f23918f = new pg0(1327071984, false, new ah0(0));

    /* JADX INFO: renamed from: g */
    public static final pg0 f23919g = new pg0(1057906606, false, new ah0(1));

    /* JADX INFO: renamed from: h */
    public static final pg0 f23920h = new pg0(1837095488, false, new ah0(2));

    /* JADX INFO: renamed from: i */
    public static final pg0 f23921i = new pg0(371421701, false, new xg0(6));

    /* JADX INFO: renamed from: j */
    public static final u01 f23922j = new u01();

    /* JADX INFO: renamed from: l */
    public static final z45 f23924l = new z45(9);

    /* JADX INFO: renamed from: m */
    public static final dn5 f23925m = new dn5();

    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac A[LOOP:1: B:54:0x00a0->B:57:0x00ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x00b2 A[EDGE_INSN: B:79:0x00b2->B:58:0x00b2 BREAK  A[LOOP:1: B:54:0x00a0->B:57:0x00ac], SYNTHETIC] */
    /* JADX INFO: renamed from: A */
    public static final InetAddress m7893A(int i, String str, int i2) {
        int i3;
        int i4;
        int iM13821p;
        byte[] bArr = new byte[16];
        int i5 = i;
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        while (i5 < i2) {
            if (i6 == 16) {
                return null;
            }
            int i9 = i5 + 2;
            if (i9 <= i2 && str.startsWith("::", i5)) {
                if (i7 != -1) {
                    return null;
                }
                i6 += 2;
                i7 = i6;
                if (i9 == i2) {
                    break;
                }
                i8 = i9;
                i3 = 0;
                i5 = i8;
                while (i5 < i2) {
                    iM13821p = zv4.m13821p(str.charAt(i5));
                    if (iM13821p != -1) {
                        break;
                        break;
                    }
                    i3 = (i3 << 4) + iM13821p;
                    i5++;
                }
                i4 = i5 - i8;
                return i4 == 0 ? null : null;
            }
            if (i6 != 0) {
                if (!str.startsWith(":", i5)) {
                    if (!str.startsWith(".", i5)) {
                        return null;
                    }
                    int i10 = i6 - 2;
                    int i11 = i10;
                    while (i8 < i2) {
                        if (i11 == 16) {
                            return null;
                        }
                        if (i11 != i10) {
                            if (str.charAt(i8) != '.') {
                                return null;
                            }
                            i8++;
                        }
                        int i12 = 0;
                        int i13 = i8;
                        while (i13 < i2) {
                            char cCharAt = str.charAt(i13);
                            if (z62.m13393u(cCharAt, 48) < 0 || z62.m13393u(cCharAt, 57) > 0) {
                                break;
                            }
                            if ((i12 == 0 && i8 != i13) || (i12 = ((i12 * 10) + cCharAt) - 48) > 255) {
                                return null;
                            }
                            i13++;
                        }
                        if (i13 - i8 == 0) {
                            return null;
                        }
                        bArr[i11] = (byte) i12;
                        i11++;
                        i8 = i13;
                    }
                    if (i11 != i6 + 2) {
                        return null;
                    }
                    i6 += 2;
                    break;
                }
                i5++;
            }
            i8 = i5;
            i3 = 0;
            i5 = i8;
            while (i5 < i2) {
                iM13821p = zv4.m13821p(str.charAt(i5));
                if (iM13821p != -1) {
                    break;
                }
                i3 = (i3 << 4) + iM13821p;
                i5++;
            }
            i4 = i5 - i8;
            if (i4 == 0 && i4 <= 4) {
                int i14 = i6 + 1;
                bArr[i6] = (byte) (255 & (i3 >>> 8));
                i6 += 2;
                bArr[i14] = (byte) (i3 & 255);
            }
        }
        if (i6 != 16) {
            if (i7 == -1) {
                return null;
            }
            int i15 = i6 - i7;
            System.arraycopy(bArr, i7, bArr, 16 - i15, i15);
            Arrays.fill(bArr, i7, (16 - i6) + i7, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    /* JADX INFO: renamed from: B */
    public static int m7894B(fw3 fw3Var, int i, byte[] bArr, int i2, int i3, i62 i62Var, C1411zn c1411zn) throws h72 {
        Object objMo5831d = fw3Var.mo5831d();
        fw3 fw3Var2 = fw3Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        C1411zn c1411zn2 = c1411zn;
        int iM7913V = m7913V(objMo5831d, fw3Var2, bArr2, i2, i4, c1411zn2);
        fw3Var2.mo5829b(objMo5831d);
        c1411zn2.f36192c = objMo5831d;
        i62Var.add(objMo5831d);
        while (iM7913V < i4) {
            C1411zn c1411zn3 = c1411zn2;
            int i5 = i4;
            int iM7897E = m7897E(bArr2, iM7913V, c1411zn3);
            if (i != c1411zn3.f36190a) {
                break;
            }
            byte[] bArr3 = bArr2;
            fw3 fw3Var3 = fw3Var2;
            Object objMo5831d2 = fw3Var3.mo5831d();
            iM7913V = m7913V(objMo5831d2, fw3Var3, bArr3, iM7897E, i5, c1411zn3);
            fw3Var2 = fw3Var3;
            bArr2 = bArr3;
            i4 = i5;
            c1411zn2 = c1411zn3;
            fw3Var2.mo5829b(objMo5831d2);
            c1411zn2.f36192c = objMo5831d2;
            i62Var.add(objMo5831d2);
        }
        return iM7913V;
    }

    /* JADX INFO: renamed from: C */
    public static int m7895C(int i, byte[] bArr, int i2, int i3, nu4 nu4Var, C1411zn c1411zn) throws h72 {
        if ((i >>> 3) == 0) {
            throw new h72("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM7899G = m7899G(bArr, i2, c1411zn);
            nu4Var.m8854d(i, Long.valueOf(c1411zn.f36191b));
            return iM7899G;
        }
        if (i4 == 1) {
            nu4Var.m8854d(i, Long.valueOf(m7945z(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM7897E = m7897E(bArr, i2, c1411zn);
            int i5 = c1411zn.f36190a;
            if (i5 < 0) {
                throw h72.m6266c();
            }
            if (i5 > bArr.length - iM7897E) {
                throw h72.m6268e();
            }
            if (i5 == 0) {
                nu4Var.m8854d(i, t50.f30782b);
            } else {
                nu4Var.m8854d(i, t50.m10980d(bArr, iM7897E, i5));
            }
            return iM7897E + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new h72("Protocol message contained an invalid tag (zero).");
            }
            nu4Var.m8854d(i, Integer.valueOf(m7944y(i2, bArr)));
            return i2 + 4;
        }
        nu4 nu4VarM8851c = nu4.m8851c();
        int i6 = (i & (-8)) | 4;
        int i7 = c1411zn.f36193d + 1;
        c1411zn.f36193d = i7;
        if (i7 >= 100) {
            throw new h72("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (i2 < i3) {
            int iM7897E2 = m7897E(bArr, i2, c1411zn);
            int i9 = c1411zn.f36190a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iM7897E2;
                break;
            }
            i2 = m7895C(i9, bArr, iM7897E2, i3, nu4VarM8851c, c1411zn);
            i8 = i9;
        }
        c1411zn.f36193d--;
        if (i2 > i3 || i8 != i6) {
            throw h72.m6267d();
        }
        nu4Var.m8854d(i, nu4VarM8851c);
        return i2;
    }

    /* JADX INFO: renamed from: D */
    public static int m7896D(int i, byte[] bArr, int i2, C1411zn c1411zn) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c1411zn.f36190a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c1411zn.f36190a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c1411zn.f36190a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c1411zn.f36190a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c1411zn.f36190a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: E */
    public static int m7897E(byte[] bArr, int i, C1411zn c1411zn) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m7896D(b, bArr, i2, c1411zn);
        }
        c1411zn.f36190a = b;
        return i2;
    }

    /* JADX INFO: renamed from: F */
    public static int m7898F(int i, byte[] bArr, int i2, int i3, i62 i62Var, C1411zn c1411zn) {
        f52 f52Var = (f52) i62Var;
        int iM7897E = m7897E(bArr, i2, c1411zn);
        f52Var.m5560b(c1411zn.f36190a);
        while (iM7897E < i3) {
            int iM7897E2 = m7897E(bArr, iM7897E, c1411zn);
            if (i != c1411zn.f36190a) {
                break;
            }
            iM7897E = m7897E(bArr, iM7897E2, c1411zn);
            f52Var.m5560b(c1411zn.f36190a);
        }
        return iM7897E;
    }

    /* JADX INFO: renamed from: G */
    public static int m7899G(byte[] bArr, int i, C1411zn c1411zn) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c1411zn.f36191b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        c1411zn.f36191b = j2;
        return i3;
    }

    /* JADX INFO: renamed from: H */
    public static final pn4 m7900H(Context context) throws Throwable {
        TypedArray typedArray;
        Resources.Theme theme = context.getTheme();
        if (theme == null) {
            theme = context.getResources().newTheme();
        }
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(C0995R.style.mc3_palette, dj3.f17104a);
        try {
            long jM13869d = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(28, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(38, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(37, 0));
            long jM13869d2 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(36, 0));
            long jM13869d3 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(35, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(34, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(33, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(32, 0));
            long jM13869d4 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(31, 0));
            long jM13869d5 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(30, 0));
            long jM13869d6 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(29, 0));
            long jM13869d7 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(27, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(26, 0));
            long jM13869d8 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(41, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(51, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(50, 0));
            long jM13869d9 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(49, 0));
            long jM13869d10 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(48, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(47, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(46, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(45, 0));
            long jM13869d11 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(44, 0));
            long jM13869d12 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(43, 0));
            long jM13869d13 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(42, 0));
            long jM13869d14 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(40, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(39, 0));
            long jM13869d15 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(54, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(64, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(63, 0));
            long jM13869d16 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(62, 0));
            long jM13869d17 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(61, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(60, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(59, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(58, 0));
            long jM13869d18 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(57, 0));
            long jM13869d19 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(56, 0));
            long jM13869d20 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(55, 0));
            long jM13869d21 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(53, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(52, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(2, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(12, 0));
            m7915X(zy5.m13869d(typedArrayObtainStyledAttributes.getColor(5, 0)), 98.0f);
            m7915X(zy5.m13869d(typedArrayObtainStyledAttributes.getColor(5, 0)), 96.0f);
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(11, 0));
            m7915X(zy5.m13869d(typedArrayObtainStyledAttributes.getColor(5, 0)), 94.0f);
            m7915X(zy5.m13869d(typedArrayObtainStyledAttributes.getColor(5, 0)), 92.0f);
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(10, 0));
            m7915X(zy5.m13869d(typedArrayObtainStyledAttributes.getColor(5, 0)), 87.0f);
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(9, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(8, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(7, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(6, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(5, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(4, 0));
            m7915X(zy5.m13869d(typedArrayObtainStyledAttributes.getColor(5, 0)), 24.0f);
            m7915X(zy5.m13869d(typedArrayObtainStyledAttributes.getColor(5, 0)), 22.0f);
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(3, 0));
            m7915X(zy5.m13869d(typedArrayObtainStyledAttributes.getColor(5, 0)), 17.0f);
            m7915X(zy5.m13869d(typedArrayObtainStyledAttributes.getColor(5, 0)), 12.0f);
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(1, 0));
            m7915X(zy5.m13869d(typedArrayObtainStyledAttributes.getColor(5, 0)), 6.0f);
            m7915X(zy5.m13869d(typedArrayObtainStyledAttributes.getColor(5, 0)), 4.0f);
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(0, 0));
            long jM13869d22 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(15, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(25, 0));
            long jM7915X = m7915X(zy5.m13869d(typedArrayObtainStyledAttributes.getColor(18, 0)), 98.0f);
            long jM7915X2 = m7915X(zy5.m13869d(typedArrayObtainStyledAttributes.getColor(18, 0)), 96.0f);
            long jM13869d23 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(24, 0));
            long jM7915X3 = m7915X(zy5.m13869d(typedArrayObtainStyledAttributes.getColor(18, 0)), 94.0f);
            long jM7915X4 = m7915X(zy5.m13869d(typedArrayObtainStyledAttributes.getColor(18, 0)), 92.0f);
            long jM13869d24 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(23, 0));
            long jM7915X5 = m7915X(zy5.m13869d(typedArrayObtainStyledAttributes.getColor(18, 0)), 87.0f);
            long jM13869d25 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(22, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(21, 0));
            long jM13869d26 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(20, 0));
            long jM13869d27 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(19, 0));
            zy5.m13869d(typedArrayObtainStyledAttributes.getColor(18, 0));
            long jM13869d28 = zy5.m13869d(typedArrayObtainStyledAttributes.getColor(17, 0));
            typedArray = typedArrayObtainStyledAttributes;
            try {
                long jM7915X6 = m7915X(zy5.m13869d(typedArrayObtainStyledAttributes.getColor(18, 0)), 24.0f);
                try {
                    long jM7915X7 = m7915X(zy5.m13869d(typedArray.getColor(18, 0)), 22.0f);
                    long jM13869d29 = zy5.m13869d(typedArray.getColor(16, 0));
                    long jM7915X8 = m7915X(zy5.m13869d(typedArray.getColor(18, 0)), 17.0f);
                    long jM7915X9 = m7915X(zy5.m13869d(typedArray.getColor(18, 0)), 12.0f);
                    long jM13869d30 = zy5.m13869d(typedArray.getColor(14, 0));
                    long jM7915X10 = m7915X(zy5.m13869d(typedArray.getColor(18, 0)), 6.0f);
                    long jM7915X11 = m7915X(zy5.m13869d(typedArray.getColor(18, 0)), 4.0f);
                    long jM13869d31 = zy5.m13869d(typedArray.getColor(13, 0));
                    typedArray = typedArray;
                    pn4 pn4Var = new pn4(jM13869d22, jM7915X, jM7915X2, jM13869d23, jM7915X3, jM7915X4, jM13869d24, jM7915X5, jM13869d25, jM13869d26, jM13869d27, jM13869d28, jM7915X6, jM7915X7, jM13869d29, jM7915X8, jM7915X9, jM13869d30, jM7915X10, jM7915X11, jM13869d31, jM13869d, jM13869d2, jM13869d3, jM13869d4, jM13869d5, jM13869d6, jM13869d7, jM13869d8, jM13869d9, jM13869d10, jM13869d11, jM13869d12, jM13869d13, jM13869d14, jM13869d15, jM13869d16, jM13869d17, jM13869d18, jM13869d19, jM13869d20, jM13869d21);
                    typedArray.recycle();
                    return pn4Var;
                } catch (Throwable th) {
                    th = th;
                    typedArray = typedArray;
                    typedArray.recycle();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            typedArray = typedArrayObtainStyledAttributes;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: I */
    public static final Object m7901I(si1 si1Var, ym0 ym0Var) {
        sj1 sj1Var;
        ql3 ql3Var;
        C0817k e;
        qj1 qj1Var;
        if (ym0Var instanceof sj1) {
            sj1Var = (sj1) ym0Var;
            int i = sj1Var.f30329w;
            if ((i & Integer.MIN_VALUE) != 0) {
                sj1Var.f30329w = i - Integer.MIN_VALUE;
            } else {
                sj1Var = new sj1(ym0Var);
            }
        } else {
            sj1Var = new sj1(ym0Var);
        }
        Object obj = sj1Var.f30328v;
        Object obj2 = ap0.f14763a;
        int i2 = sj1Var.f30329w;
        C0641f8 c0641f8 = e23.f17640a;
        if (i2 == 0) {
            k43.m7376J(obj);
            ql3 ql3Var2 = new ql3();
            ql3Var2.f28555a = c0641f8;
            qj1 qj1Var2 = new qj1((byte) 0);
            qj1Var2.f28523b = ql3Var2;
            VarHandle.storeStoreFence();
            try {
                sj1Var.f30326t = ql3Var2;
                sj1Var.f30327u = qj1Var2;
                sj1Var.f30329w = 1;
                if (si1Var.collect(qj1Var2, sj1Var) == obj2) {
                    return obj2;
                }
                ql3Var = ql3Var2;
            } catch (C0817k e2) {
                ql3Var = ql3Var2;
                e = e2;
                qj1Var = qj1Var2;
                if (e.f22781a == qj1Var) {
                    throw e;
                }
                y70.m13040t(sj1Var.getContext());
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qj1Var = sj1Var.f30327u;
            ql3Var = sj1Var.f30326t;
            try {
                k43.m7376J(obj);
            } catch (C0817k e3) {
                e = e3;
                if (e.f22781a == qj1Var) {
                    throw e;
                }
                y70.m13040t(sj1Var.getContext());
            }
        }
        Object obj3 = ql3Var.f28555a;
        if (obj3 != c0641f8) {
            return obj3;
        }
        ds3.m4667k("Expected at least one element");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: J */
    public static final Object m7902J(si1 si1Var, mq1 mq1Var, wm0 wm0Var) {
        tj1 tj1Var;
        ql3 ql3Var;
        C0817k e;
        fa1 fa1Var;
        if (wm0Var instanceof tj1) {
            tj1Var = (tj1) wm0Var;
            int i = tj1Var.f31195w;
            if ((i & Integer.MIN_VALUE) != 0) {
                tj1Var.f31195w = i - Integer.MIN_VALUE;
            } else {
                tj1Var = new tj1(wm0Var);
            }
        } else {
            tj1Var = new tj1(wm0Var);
        }
        Object obj = tj1Var.f31194v;
        Object obj2 = ap0.f14763a;
        int i2 = tj1Var.f31195w;
        C0641f8 c0641f8 = e23.f17640a;
        if (i2 == 0) {
            k43.m7376J(obj);
            ql3 ql3Var2 = new ql3();
            ql3Var2.f28555a = c0641f8;
            fa1 fa1Var2 = new fa1((byte) 3);
            fa1Var2.f18877b = mq1Var;
            fa1Var2.f18878c = ql3Var2;
            VarHandle.storeStoreFence();
            try {
                tj1Var.f31192t = ql3Var2;
                tj1Var.f31193u = fa1Var2;
                tj1Var.f31195w = 1;
                if (si1Var.collect(fa1Var2, tj1Var) == obj2) {
                    return obj2;
                }
                ql3Var = ql3Var2;
            } catch (C0817k e2) {
                ql3Var = ql3Var2;
                e = e2;
                fa1Var = fa1Var2;
                if (e.f22781a == fa1Var) {
                    throw e;
                }
                y70.m13040t(tj1Var.getContext());
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fa1Var = tj1Var.f31193u;
            ql3Var = tj1Var.f31192t;
            try {
                k43.m7376J(obj);
            } catch (C0817k e3) {
                e = e3;
                if (e.f22781a == fa1Var) {
                    throw e;
                }
                y70.m13040t(tj1Var.getContext());
            }
        }
        Object obj3 = ql3Var.f28555a;
        if (obj3 != c0641f8) {
            return obj3;
        }
        ds3.m4667k("Expected at least one element matching the predicate");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: K */
    public static final Object m7903K(si1 si1Var, ym0 ym0Var) {
        uj1 uj1Var;
        ql3 ql3Var;
        C0817k e;
        qj1 qj1Var;
        if (ym0Var instanceof uj1) {
            uj1Var = (uj1) ym0Var;
            int i = uj1Var.f31909w;
            if ((i & Integer.MIN_VALUE) != 0) {
                uj1Var.f31909w = i - Integer.MIN_VALUE;
            } else {
                uj1Var = new uj1(ym0Var);
            }
        } else {
            uj1Var = new uj1(ym0Var);
        }
        Object obj = uj1Var.f31908v;
        Object obj2 = ap0.f14763a;
        int i2 = uj1Var.f31909w;
        byte b = 1;
        if (i2 == 0) {
            k43.m7376J(obj);
            ql3 ql3Var2 = new ql3();
            qj1 qj1Var2 = new qj1(b);
            qj1Var2.f28523b = ql3Var2;
            VarHandle.storeStoreFence();
            try {
                uj1Var.f31906t = ql3Var2;
                uj1Var.f31907u = qj1Var2;
                uj1Var.f31909w = 1;
                if (si1Var.collect(qj1Var2, uj1Var) == obj2) {
                    return obj2;
                }
                ql3Var = ql3Var2;
            } catch (C0817k e2) {
                ql3Var = ql3Var2;
                e = e2;
                qj1Var = qj1Var2;
                if (e.f22781a == qj1Var) {
                    throw e;
                }
                y70.m13040t(uj1Var.getContext());
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qj1Var = uj1Var.f31907u;
            ql3Var = uj1Var.f31906t;
            try {
                k43.m7376J(obj);
            } catch (C0817k e3) {
                e = e3;
                if (e.f22781a == qj1Var) {
                    throw e;
                }
                y70.m13040t(uj1Var.getContext());
            }
        }
        return ql3Var.f28555a;
    }

    /* JADX INFO: renamed from: L */
    public static final e25 m7904L(q25 q25Var) {
        return new e25(q25Var.f28162a, q25Var.f28181t);
    }

    /* JADX INFO: renamed from: N */
    public static final jl3 m7905N(cb3 cb3Var, int i, uo4 uo4Var, jl4 jl4Var, boolean z, int i2) {
        jl3 jl3VarM7177c;
        if (jl4Var != null) {
            uo4Var.f32034b.m11898a(i);
            jl3VarM7177c = jl4Var.m7177c(i);
        } else {
            jl3VarM7177c = jl3.f22395e;
        }
        int iMo3579U = cb3Var.mo3579U(2.0f);
        float f = jl3VarM7177c.f22396a;
        return jl3.m7165b(jl3VarM7177c, z ? (i2 - f) - iMo3579U : f, z ? i2 - f : iMo3579U + f, 10);
    }

    /* JADX INFO: renamed from: O */
    public static final Object m7906O(e14 e14Var, p14 p14Var) {
        Object objM8132g = e14Var.f17631a.m8132g(p14Var);
        if (objM8132g == null) {
            return null;
        }
        return objM8132g;
    }

    /* JADX INFO: renamed from: P */
    public static final boolean m7907P(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m7908Q(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    /* JADX INFO: renamed from: R */
    public static final nb4 m7909R(zo0 zo0Var, ro0 ro0Var, cp0 cp0Var, mq1 mq1Var) {
        nb4 nb4Var;
        ro0 ro0VarM3796A = c20.m3796A(zo0Var, ro0Var);
        cp0Var.getClass();
        if (cp0Var == cp0.f16326b) {
            xi2 xi2Var = new xi2(ro0VarM3796A, false);
            xi2Var.f34306e = C0006a5.m74l(xi2Var, xi2Var, mq1Var);
            VarHandle.storeStoreFence();
            nb4Var = xi2Var;
        } else {
            nb4Var = new nb4(ro0VarM3796A, true);
        }
        nb4Var.m10957j0(cp0Var, nb4Var, mq1Var);
        return nb4Var;
    }

    /* JADX INFO: renamed from: S */
    public static t82 m7910S(zo0 zo0Var, ro0 ro0Var, cp0 cp0Var, mq1 mq1Var, int i) {
        if ((i & 1) != 0) {
            ro0Var = r71.f29063a;
        }
        if ((i & 2) != 0) {
            cp0Var = cp0.f16325a;
        }
        return m7909R(zo0Var, ro0Var, cp0Var, mq1Var);
    }

    /* JADX INFO: renamed from: T */
    public static final nt2 m7911T(nt2 nt2Var, hh3 hh3Var, yh2 yh2Var, d63 d63Var, boolean z) {
        zh2 zh2Var = new zh2();
        zh2Var.f36087a = hh3Var;
        zh2Var.f36088b = yh2Var;
        zh2Var.f36089c = d63Var;
        zh2Var.f36090d = z;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(zh2Var);
    }

    /* JADX INFO: renamed from: U */
    public static int m7912U(Object obj, fw3 fw3Var, byte[] bArr, int i, int i2, int i3, C1411zn c1411zn) throws h72 {
        ps2 ps2Var = (ps2) fw3Var;
        int i4 = c1411zn.f36193d + 1;
        c1411zn.f36193d = i4;
        if (i4 >= 100) {
            throw new h72("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iM9640D = ps2Var.m9640D(obj, bArr, i, i2, i3, c1411zn);
        c1411zn.f36193d--;
        c1411zn.f36192c = obj;
        return iM9640D;
    }

    /* JADX INFO: renamed from: V */
    public static int m7913V(Object obj, fw3 fw3Var, byte[] bArr, int i, int i2, C1411zn c1411zn) throws h72 {
        int iM7896D = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM7896D = m7896D(i3, bArr, iM7896D, c1411zn);
            i3 = c1411zn.f36190a;
        }
        int i4 = iM7896D;
        if (i3 < 0 || i3 > i2 - i4) {
            throw h72.m6268e();
        }
        int i5 = c1411zn.f36193d + 1;
        c1411zn.f36193d = i5;
        if (i5 >= 100) {
            throw new h72("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i4 + i3;
        fw3Var.mo5836i(obj, bArr, i4, i6, c1411zn);
        c1411zn.f36193d--;
        c1411zn.f36192c = obj;
        return i6;
    }

    /* JADX INFO: renamed from: W */
    public static final void m7914W(mi0 mi0Var, wp1 wp1Var) {
        x53 x53Var = ((ir1) mi0Var).f21676M.f25831b.f34991a;
        x53Var.m12494X(l53.f23797c);
        sj3.m10795D(x53Var, 0, wp1Var);
    }

    /* JADX WARN: Failed to calculate best type for var: r0v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v7 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v10 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v11 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v12 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v13 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v14 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v8 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v9 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v5 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    /* JADX INFO: renamed from: X */
    public static final long m7915X(long r63, float r65) {
        /*
            Method dump skipped, instruction units count: 1424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lb5.m7915X(long, float):long");
    }

    /* JADX INFO: renamed from: Y */
    public static final String m7916Y(String str) {
        int i;
        int i2 = 0;
        int i3 = -1;
        if (hd4.m6335a0(str, ":", false)) {
            InetAddress inetAddressM7893A = (od4.m9043X(str, "[", false) && od4.m9038S(str, "]", false)) ? m7893A(1, str, str.length() - 1) : m7893A(0, str, str.length());
            if (inetAddressM7893A != null) {
                byte[] address = inetAddressM7893A.getAddress();
                if (address.length != 16) {
                    if (address.length == 4) {
                        return inetAddressM7893A.getHostAddress();
                    }
                    C1077qn.m9985k(zi4.m13617q('\'', "Invalid IPv6 address: '", str));
                    return null;
                }
                int i4 = 0;
                int i5 = 0;
                while (i4 < address.length) {
                    int i6 = i4;
                    while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                        i6 += 2;
                    }
                    int i7 = i6 - i4;
                    if (i7 > i5 && i7 >= 4) {
                        i3 = i4;
                        i5 = i7;
                    }
                    i4 = i6 + 2;
                }
                w30 w30Var = new w30();
                while (i2 < address.length) {
                    if (i2 == i3) {
                        w30Var.m12054O(58);
                        i2 += i5;
                        if (i2 == 16) {
                            w30Var.m12054O(58);
                        }
                    } else {
                        if (i2 > 0) {
                            w30Var.m12054O(58);
                        }
                        byte b = address[i2];
                        byte[] bArr = zv4.f36415a;
                        w30Var.m12055P(((b & 255) << 8) | (address[i2 + 1] & 255));
                        i2 += 2;
                    }
                }
                return w30Var.m12047C(w30Var.f33056b, z80.f35863a);
            }
        } else {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.length() != 0) {
                    int length = lowerCase.length();
                    for (0; i < length; i + 1) {
                        char cCharAt = lowerCase.charAt(i);
                        i = (z62.m13393u(cCharAt, 31) > 0 && z62.m13393u(cCharAt, 127) < 0 && hd4.m6342h0(" #%/:?@[\\]", cCharAt, 0, 6) == -1) ? i + 1 : 0;
                    }
                    return lowerCase;
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:110:0x01da  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:143:0x01cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b8  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        if (r0 == r2) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a4, code lost:
    
        if (r0 == r2) goto L158;
     */
    /* JADX INFO: renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m7917Z(String str, gh3 gh3Var, yp1 yp1Var, ym0 ym0Var) throws Exception {
        tu0 tu0Var;
        t93 t93Var;
        gb1 gb1Var;
        boolean zIsTerminated;
        AutoCloseable autoCloseable;
        ExecutorService executorService;
        boolean zIsTerminated2;
        t93 t93Var2;
        gb1 gb1Var2;
        boolean zIsTerminated3;
        AutoCloseable autoCloseable2;
        ExecutorService executorService2;
        boolean zIsTerminated4;
        if (ym0Var instanceof tu0) {
            tu0Var = (tu0) ym0Var;
            int i = tu0Var.f31442B;
            if ((i & Integer.MIN_VALUE) != 0) {
                tu0Var.f31442B = i - Integer.MIN_VALUE;
            } else {
                tu0Var = new tu0(ym0Var);
            }
        } else {
            tu0Var = new tu0(ym0Var);
        }
        Object objInvoke = tu0Var.f31441A;
        Object obj = ap0.f14763a;
        int i2 = tu0Var.f31442B;
        byte b = 3;
        TimeUnit timeUnit = TimeUnit.DAYS;
        boolean z = false;
        wm0 wm0Var = null;
        switch (i2) {
            case 0:
                k43.m7376J(objInvoke);
                tu0Var.f31443t = null;
                tu0Var.f31442B = 7;
                Object objInvoke2 = yp1Var.invoke(tu0Var);
                return objInvoke2 == obj ? obj : objInvoke2;
            case 1:
                int i3 = tu0Var.f31449z;
                String str2 = tu0Var.f31446w;
                String str3 = tu0Var.f31445v;
                t93 t93Var3 = tu0Var.f31444u;
                yp1 yp1Var2 = (yp1) tu0Var.f31443t;
                k43.m7376J(objInvoke);
                gb1 gb1Var3 = (gb1) objInvoke;
                gb1Var3.f19702a.mo5688x();
                try {
                    po0 po0VarM6004a = gb1Var3.f19704c.m6004a();
                    if (po0VarM6004a == null) {
                        tu0Var.f31443t = null;
                        tu0Var.f31444u = t93Var3;
                        tu0Var.f31445v = str3;
                        tu0Var.f31446w = str2;
                        tu0Var.f31447x = null;
                        tu0Var.f31448y = gb1Var3;
                        tu0Var.f31449z = i3;
                        tu0Var.f31442B = 3;
                        objInvoke = yp1Var2.invoke(tu0Var);
                        break;
                    } else {
                        ro0 ro0VarPlus = tu0Var.getContext().plus(po0VarM6004a);
                        C0821k3 c0821k3 = new C0821k3(wm0Var, yp1Var2, (byte) 2);
                        tu0Var.f31443t = null;
                        tu0Var.f31444u = t93Var3;
                        tu0Var.f31445v = str3;
                        tu0Var.f31446w = str2;
                        tu0Var.f31447x = null;
                        tu0Var.f31448y = gb1Var3;
                        tu0Var.f31449z = i3;
                        tu0Var.f31442B = 2;
                        objInvoke = m7921b0(ro0VarPlus, c0821k3, tu0Var);
                        if (objInvoke == obj) {
                        }
                        gb1Var = gb1Var3;
                        autoCloseable = gb1Var.f19703b;
                        if (autoCloseable instanceof AutoCloseable) {
                            autoCloseable.close();
                        } else {
                            if (!(autoCloseable instanceof ExecutorService)) {
                                ds3.m4665g();
                                return null;
                            }
                            executorService = (ExecutorService) autoCloseable;
                            if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService.isTerminated())) {
                                executorService.shutdown();
                                while (!zIsTerminated2) {
                                    try {
                                        zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
                                    } catch (InterruptedException unused) {
                                        if (!z) {
                                            executorService.shutdownNow();
                                            z = true;
                                        }
                                    }
                                }
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                            }
                        }
                    }
                    return objInvoke;
                } catch (Throwable th) {
                    th = th;
                    t93Var = t93Var3;
                    gb1Var = gb1Var3;
                    try {
                        gq6.m6065C(t93Var, th);
                        throw null;
                    } catch (Throwable th2) {
                        AutoCloseable autoCloseable3 = gb1Var.f19703b;
                        if (autoCloseable3 instanceof AutoCloseable) {
                            autoCloseable3.close();
                        } else {
                            if (!(autoCloseable3 instanceof ExecutorService)) {
                                ds3.m4665g();
                                return null;
                            }
                            ExecutorService executorService3 = (ExecutorService) autoCloseable3;
                            if (executorService3 != ForkJoinPool.commonPool() && !(zIsTerminated = executorService3.isTerminated())) {
                                executorService3.shutdown();
                                while (!zIsTerminated) {
                                    try {
                                        zIsTerminated = executorService3.awaitTermination(1L, timeUnit);
                                    } catch (InterruptedException unused2) {
                                        if (!z) {
                                            executorService3.shutdownNow();
                                            z = true;
                                        }
                                    }
                                }
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                            }
                        }
                        throw th2;
                    }
                }
            case 2:
                gb1Var = tu0Var.f31448y;
                t93Var = tu0Var.f31444u;
                try {
                    k43.m7376J(objInvoke);
                    autoCloseable = gb1Var.f19703b;
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else {
                        if (!(autoCloseable instanceof ExecutorService)) {
                            ds3.m4665g();
                            return null;
                        }
                        executorService = (ExecutorService) autoCloseable;
                        if (executorService != ForkJoinPool.commonPool()) {
                            executorService.shutdown();
                            while (!zIsTerminated2) {
                                zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
                            }
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                    return objInvoke;
                } catch (Throwable th3) {
                    th = th3;
                    gq6.m6065C(t93Var, th);
                    throw null;
                }
            case 3:
                gb1Var = tu0Var.f31448y;
                t93Var = tu0Var.f31444u;
                k43.m7376J(objInvoke);
                autoCloseable = gb1Var.f19703b;
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else {
                    if (!(autoCloseable instanceof ExecutorService)) {
                        ds3.m4665g();
                        return null;
                    }
                    executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool()) {
                        executorService.shutdown();
                        while (!zIsTerminated2) {
                            zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                return objInvoke;
            case 4:
                int i4 = tu0Var.f31449z;
                String str4 = tu0Var.f31446w;
                String str5 = tu0Var.f31445v;
                t93 t93Var4 = tu0Var.f31444u;
                yp1 yp1Var3 = (yp1) tu0Var.f31443t;
                k43.m7376J(objInvoke);
                gb1 gb1Var4 = (gb1) objInvoke;
                gb1Var4.f19702a.mo5688x();
                try {
                    po0 po0VarM6004a2 = gb1Var4.f19704c.m6004a();
                    if (po0VarM6004a2 == null) {
                        tu0Var.f31443t = null;
                        tu0Var.f31444u = t93Var4;
                        tu0Var.f31445v = str5;
                        tu0Var.f31446w = str4;
                        tu0Var.f31447x = gb1Var4;
                        tu0Var.f31449z = i4;
                        tu0Var.f31442B = 6;
                        objInvoke = yp1Var3.invoke(tu0Var);
                        break;
                    } else {
                        ro0 ro0VarPlus2 = tu0Var.getContext().plus(po0VarM6004a2);
                        C0821k3 c0821k4 = new C0821k3(wm0Var, yp1Var3, b);
                        tu0Var.f31443t = null;
                        tu0Var.f31444u = t93Var4;
                        tu0Var.f31445v = str5;
                        tu0Var.f31446w = str4;
                        tu0Var.f31447x = gb1Var4;
                        tu0Var.f31449z = i4;
                        tu0Var.f31442B = 5;
                        objInvoke = m7921b0(ro0VarPlus2, c0821k4, tu0Var);
                        if (objInvoke == obj) {
                        }
                        gb1Var2 = gb1Var4;
                        autoCloseable2 = gb1Var2.f19703b;
                        if (autoCloseable2 instanceof AutoCloseable) {
                            autoCloseable2.close();
                        } else {
                            if (autoCloseable2 instanceof ExecutorService) {
                                ds3.m4665g();
                                return null;
                            }
                            executorService2 = (ExecutorService) autoCloseable2;
                            if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated4 = executorService2.isTerminated())) {
                                executorService2.shutdown();
                                while (!zIsTerminated4) {
                                    try {
                                        zIsTerminated4 = executorService2.awaitTermination(1L, timeUnit);
                                    } catch (InterruptedException unused3) {
                                        if (!z) {
                                            executorService2.shutdownNow();
                                            z = true;
                                        }
                                    }
                                }
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                            }
                        }
                    }
                    return objInvoke;
                } catch (Throwable th4) {
                    th = th4;
                    t93Var2 = t93Var4;
                    gb1Var2 = gb1Var4;
                    try {
                        gq6.m6065C(t93Var2, th);
                        throw null;
                    } catch (Throwable th5) {
                        AutoCloseable autoCloseable4 = gb1Var2.f19703b;
                        if (autoCloseable4 instanceof AutoCloseable) {
                            autoCloseable4.close();
                        } else {
                            if (!(autoCloseable4 instanceof ExecutorService)) {
                                ds3.m4665g();
                                return null;
                            }
                            ExecutorService executorService4 = (ExecutorService) autoCloseable4;
                            if (executorService4 != ForkJoinPool.commonPool() && !(zIsTerminated3 = executorService4.isTerminated())) {
                                executorService4.shutdown();
                                while (!zIsTerminated3) {
                                    try {
                                        zIsTerminated3 = executorService4.awaitTermination(1L, timeUnit);
                                    } catch (InterruptedException unused4) {
                                        if (!z) {
                                            executorService4.shutdownNow();
                                            z = true;
                                        }
                                    }
                                }
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                            }
                        }
                        throw th5;
                    }
                }
            case 5:
            case 6:
                gb1Var2 = tu0Var.f31447x;
                t93Var2 = tu0Var.f31444u;
                try {
                    k43.m7376J(objInvoke);
                    autoCloseable2 = gb1Var2.f19703b;
                    if (autoCloseable2 instanceof AutoCloseable) {
                        autoCloseable2.close();
                    } else {
                        if (autoCloseable2 instanceof ExecutorService) {
                            ds3.m4665g();
                            return null;
                        }
                        executorService2 = (ExecutorService) autoCloseable2;
                        if (executorService2 != ForkJoinPool.commonPool()) {
                            executorService2.shutdown();
                            while (!zIsTerminated4) {
                                zIsTerminated4 = executorService2.awaitTermination(1L, timeUnit);
                            }
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    }
                    return objInvoke;
                } catch (Throwable th6) {
                    th = th6;
                    gq6.m6065C(t93Var2, th);
                    throw null;
                }
            case 7:
                k43.m7376J(objInvoke);
                return objInvoke;
            default:
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m7918a(String str, nt2 nt2Var, nq1 nq1Var, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(161971797);
        int i2 = (ir1Var.m6890g(str) ? 4 : 2) | i | 176;
        byte b = 1;
        if (ir1Var.m6871T(i2 & 1, (i2 & 147) != 146)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                nq1Var = new fh0((byte) 3);
                nt2Var = kt2.f23428a;
            } else {
                ir1Var.m6874W();
            }
            ir1Var.m6913s();
            at1 at1Var = new at1(b);
            at1Var.f14855b = nq1Var;
            at1Var.f14856c = str;
            at1Var.f14857d = nt2Var;
            VarHandle.storeStoreFence();
            i25.m6609a(null, null, false, vd6.m11834R(1996606891, at1Var, ir1Var), ir1Var, 3072, 7);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0712h4 c0712h4 = new C0712h4(b);
            c0712h4.f20357b = str;
            c0712h4.f20358c = nt2Var;
            c0712h4.f20359d = nq1Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0712h4;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final ag1 m7919a0(int i, mi0 mi0Var) {
        lu2 lu2Var = ((lq2) ((ir1) mi0Var).m6898k(pq2.f27894b)).f24280d;
        if (i == 0) {
            return lu2Var.mo7289f();
        }
        if (i == 1) {
            return lu2Var.mo7284a();
        }
        if (i == 2) {
            return lu2Var.mo7287d();
        }
        if (i == 3) {
            return lu2Var.mo7286c();
        }
        if (i == 4) {
            return lu2Var.mo7288e();
        }
        return i == 5 ? lu2Var.mo7285b() : lu2Var.mo7289f();
    }

    /* JADX INFO: renamed from: b */
    public static final void m7920b(boolean z, nt2 nt2Var, pg0 pg0Var, pg0 pg0Var2, mi0 mi0Var, int i) {
        nt2 nt2Var2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1360054862);
        InterfaceC0618en interfaceC0618en = ir1Var.f21685a;
        int i2 = i | (ir1Var.m6892h(z) ? 4 : 2) | 48;
        if (ir1Var.m6871T(i2 & 1, (i2 & 1171) != 1170)) {
            id0 id0VarM6333a = hd0.m6333a(AbstractC1337xn.f34436c, ig1.f21391o, ir1Var, 48);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2Var2 = kt2.f23428a;
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2Var2);
            bi0.f15310ap.getClass();
            if (interfaceC0618en == null) {
                dt0.m4682E();
                throw null;
            }
            ir1Var.m6893h0();
            boolean z2 = ir1Var.f21682S;
            da2 da2Var = wf2.f33290T;
            if (z2) {
                ir1Var.m6900l(da2Var);
            } else {
                ir1Var.m6911q0();
            }
            jh0 jh0Var = ia5.f21216g;
            C0006a5.m53I(ir1Var, jh0Var, id0VarM6333a);
            jh0 jh0Var2 = ia5.f21215f;
            C0006a5.m53I(ir1Var, jh0Var2, ga3VarM6902m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jh0 jh0Var3 = ia5.f21217h;
            C0006a5.m53I(ir1Var, jh0Var3, numValueOf);
            C0006a5.m50F(ir1Var);
            jh0 jh0Var4 = ia5.f21214e;
            C0006a5.m53I(ir1Var, jh0Var4, nt2VarM10006A);
            ir1Var.m6885d0(65421193);
            nt2 nt2VarM7067a = jd0.m7067a(nt2Var2, 1.0f);
            if (z) {
                WeakHashMap weakHashMap = y05.f34773x;
                C0726hi c0726hi = k43.m7390o(ir1Var).f34778e;
                int i3 = sj3.f30342l;
                nt2VarM7067a = nt2VarM7067a.mo7630d(y42.m12858e0(ev0.m5364n0(c0726hi, 48)));
            }
            ir1Var.m6912r(false);
            xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, false);
            int iHashCode2 = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m2 = ir1Var.m6902m();
            nt2 nt2VarM10006A2 = qq2.m10006A(ir1Var, nt2VarM7067a);
            ir1Var.m6893h0();
            if (ir1Var.f21682S) {
                ir1Var.m6900l(da2Var);
            } else {
                ir1Var.m6911q0();
            }
            C0006a5.m53I(ir1Var, jh0Var, xq2VarM9704c);
            C0006a5.m53I(ir1Var, jh0Var2, ga3VarM6902m2);
            d55.m4373r(iHashCode2, ir1Var, jh0Var3, ir1Var);
            C0006a5.m53I(ir1Var, jh0Var4, nt2VarM10006A2);
            pg0Var2.invoke(ir1Var, 6);
            ir1Var.m6912r(true);
            long j = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24277a.f16919F;
            C0823k5 c0823k5 = new C0823k5((byte) 0);
            c0823k5.f22892b = z;
            c0823k5.f22893c = pg0Var;
            VarHandle.storeStoreFence();
            kf4.m7511a(null, null, j, 0L, 0.0f, vd6.m11834R(-880507683, c0823k5, ir1Var), ir1Var, 12582912, 123);
            ir1Var.m6912r(true);
        } else {
            ir1Var.m6874W();
            nt2Var2 = nt2Var;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0860l5 c0860l5 = new C0860l5();
            c0860l5.f23788a = z;
            c0860l5.f23789b = nt2Var2;
            c0860l5.f23790c = pg0Var;
            c0860l5.f23791d = pg0Var2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0860l5;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static final Object m7921b0(ro0 ro0Var, mq1 mq1Var, wm0 wm0Var) throws Throwable {
        Unsafe unsafe;
        long j;
        Object objM5616a;
        ro0 context = wm0Var.getContext();
        ro0 ro0VarPlus = !((Boolean) ro0Var.fold(new en0((byte) 8), Boolean.FALSE)).booleanValue() ? context.plus(ro0Var) : c20.m3820o(context, ro0Var, false);
        y70.m13040t(ro0VarPlus);
        if (ro0VarPlus == context) {
            nw3 nw3Var = new nw3(wm0Var, ro0VarPlus);
            objM5616a = as4.m3235N(nw3Var, true, nw3Var, mq1Var);
        } else {
            gb5 gb5Var = gb5.f19711b;
            if (z62.m13387o(ro0VarPlus.get(gb5Var), context.get(gb5Var))) {
                g70 g70Var = g70.f19625c;
                zt4 zt4Var = new zt4(wm0Var, ro0VarPlus.get(g70Var) == null ? ro0VarPlus.plus(g70Var) : ro0VarPlus);
                zt4Var.f36364f = new ThreadLocal();
                if (!(wm0Var.getContext().get(gb5Var) instanceof so0)) {
                    Object objM4555b = dm4.m4555b(ro0VarPlus, null);
                    dm4.m4554a(ro0VarPlus, objM4555b);
                    zt4Var.m13755n0(ro0VarPlus, objM4555b);
                }
                VarHandle.storeStoreFence();
                ro0 ro0Var2 = zt4Var.f30702d;
                Object objM4555b2 = dm4.m4555b(ro0Var2, null);
                try {
                    Object objM3235N = as4.m3235N(zt4Var, true, zt4Var, mq1Var);
                    dm4.m4554a(ro0Var2, objM4555b2);
                    objM5616a = objM3235N;
                } catch (Throwable th) {
                    dm4.m4554a(ro0Var2, objM4555b2);
                    throw th;
                }
            } else {
                h01 h01Var = new h01(wm0Var, ro0VarPlus);
                try {
                    g01.m5867a(C0006a5.m86x(C0006a5.m74l(h01Var, h01Var, mq1Var)), ju4.f22634a);
                    do {
                        unsafe = AbstractC1078qo.f28633a;
                        j = h01.f20242f;
                        int intVolatile = unsafe.getIntVolatile(h01Var, j);
                        if (intVolatile != 0) {
                            if (intVolatile != 2) {
                                C1077qn.m9989o("Already suspended");
                                return null;
                            }
                            objM5616a = f92.m5616a(h01Var.m4983O());
                            if (objM5616a instanceof ff0) {
                                throw ((ff0) objM5616a).f18941a;
                            }
                        }
                    } while (!unsafe.compareAndSwapInt(h01Var, j, 0, 1));
                    objM5616a = ap0.f14763a;
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    if (th3 instanceof e01) {
                        th3 = ((e01) th3).f17555a;
                    }
                    h01Var.resumeWith(k43.m7389n(th3));
                    throw th3;
                }
            }
        }
        ap0 ap0Var = ap0.f14763a;
        return objM5616a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final C0794jd m7922c(int i) {
        C0794jd c0794jd = new C0794jd();
        c0794jd.f22170b = i;
        VarHandle.storeStoreFence();
        return c0794jd;
    }

    /* JADX INFO: renamed from: d */
    public static final void m7923d(Object obj, yp1 yp1Var, mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        boolean zM6890g = ir1Var.m6890g(obj);
        Object objM6869O = ir1Var.m6869O();
        if (zM6890g || objM6869O == ki0.f23136a) {
            objM6869O = new s01(yp1Var);
            ir1Var.m6905n0(objM6869O);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m7924e(Object obj, Object obj2, yp1 yp1Var, mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        boolean zM6890g = ir1Var.m6890g(obj) | ir1Var.m6890g(obj2);
        Object objM6869O = ir1Var.m6869O();
        if (zM6890g || objM6869O == ki0.f23136a) {
            objM6869O = new s01(yp1Var);
            ir1Var.m6905n0(objM6869O);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m7925f(Object obj, Object obj2, Object obj3, yp1 yp1Var, mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        boolean zM6890g = ir1Var.m6890g(obj) | ir1Var.m6890g(obj2) | ir1Var.m6890g(obj3);
        Object objM6869O = ir1Var.m6869O();
        if (zM6890g || objM6869O == ki0.f23136a) {
            objM6869O = new s01(yp1Var);
            ir1Var.m6905n0(objM6869O);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m7926g(mi0 mi0Var, mq1 mq1Var, Object obj) {
        ro0 ro0Var = ((ir1) mi0Var).f21681R;
        ir1 ir1Var = (ir1) mi0Var;
        boolean zM6890g = ir1Var.m6890g(obj);
        Object objM6869O = ir1Var.m6869O();
        if (zM6890g || objM6869O == ki0.f23136a) {
            objM6869O = new xe2(ro0Var, mq1Var);
            ir1Var.m6905n0(objM6869O);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m7927h(Object obj, Object obj2, mq1 mq1Var, mi0 mi0Var) {
        ro0 ro0Var = ((ir1) mi0Var).f21681R;
        ir1 ir1Var = (ir1) mi0Var;
        boolean zM6890g = ir1Var.m6890g(obj) | ir1Var.m6890g(obj2);
        Object objM6869O = ir1Var.m6869O();
        if (zM6890g || objM6869O == ki0.f23136a) {
            objM6869O = new xe2(ro0Var, mq1Var);
            ir1Var.m6905n0(objM6869O);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m7928i(Object obj, Object obj2, Object obj3, mq1 mq1Var, mi0 mi0Var) {
        ro0 ro0Var = ((ir1) mi0Var).f21681R;
        ir1 ir1Var = (ir1) mi0Var;
        boolean zM6890g = ir1Var.m6890g(obj) | ir1Var.m6890g(obj2) | ir1Var.m6890g(obj3);
        Object objM6869O = ir1Var.m6869O();
        if (zM6890g || objM6869O == ki0.f23136a) {
            objM6869O = new xe2(ro0Var, mq1Var);
            ir1Var.m6905n0(objM6869O);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m7929j(Object[] objArr, mq1 mq1Var, mi0 mi0Var) {
        ro0 ro0Var = ((ir1) mi0Var).f21681R;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        ir1 ir1Var = (ir1) mi0Var;
        boolean zM6886e = ir1Var.m6886e(objArrCopyOf.length);
        for (Object obj : objArrCopyOf) {
            zM6886e |= ir1Var.m6890g(obj);
        }
        Object objM6869O = ir1Var.m6869O();
        if (zM6886e || objM6869O == ki0.f23136a) {
            ir1Var.m6905n0(new xe2(ro0Var, mq1Var));
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m7930k(wp1 wp1Var, nt2 nt2Var, vh2 vh2Var, li2 li2Var, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1055276397);
        int i2 = i | (ir1Var.m6894i(wp1Var) ? 4 : 2) | (ir1Var.m6890g(nt2Var) ? 32 : 16) | (ir1Var.m6890g(vh2Var) ? 256 : 128) | (ir1Var.m6890g(li2Var) ? 2048 : 1024);
        byte b = 0;
        byte b2 = 6;
        if (ir1Var.m6871T(i2 & 1, (i2 & 1171) != 1170)) {
            sw2 sw2VarM7369C = k43.m7369C(wp1Var, ir1Var);
            nh2 nh2Var = new nh2(b);
            nh2Var.f25807d = vh2Var;
            nh2Var.f25805b = nt2Var;
            nh2Var.f25808e = li2Var;
            nh2Var.f25806c = sw2VarM7369C;
            VarHandle.storeStoreFence();
            zt5.m13770a(vd6.m11834R(-933153643, nh2Var, ir1Var), ir1Var, 6);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0613ei c0613ei = new C0613ei(b2);
            c0613ei.f18113c = wp1Var;
            c0613ei.f18112b = nt2Var;
            c0613ei.f18114d = vh2Var;
            c0613ei.f18115e = li2Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0613ei;
        }
    }

    /* JADX WARN: Type inference failed for: r18v2, types: [ir3, java.lang.Throwable] */
    /* JADX INFO: renamed from: l */
    public static final ir3 m7931l(float[] fArr, no0 no0Var, ArrayList arrayList) {
        float f;
        List listSingletonList;
        as0 as0VarM12969g;
        no0 no0Var2;
        float f2 = 1.0f;
        Float fValueOf = Float.valueOf(1.0f);
        Object obj = null;
        if (fArr.length < 6) {
            C1077qn.m9987m("Polygons must have at least 3 vertices");
            return null;
        }
        int i = 2;
        int i2 = 1;
        if (fArr.length % 2 == 1) {
            C1077qn.m9987m("The vertices array should have even size");
            return null;
        }
        if (arrayList != null && arrayList.size() * 2 != fArr.length) {
            C1077qn.m9987m("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        int length = fArr.length / 2;
        ArrayList arrayList3 = new ArrayList();
        int i3 = 0;
        while (true) {
            f = 0.0f;
            if (i3 >= length) {
                break;
            }
            if (arrayList == null || (no0Var2 = (no0) arrayList.get(i3)) == null) {
                no0Var2 = no0Var;
            }
            int i4 = (((i3 + length) - i2) % length) * i;
            int i5 = i3 + 1;
            int i6 = (i5 % length) * 2;
            float f3 = f2;
            Object obj2 = obj;
            int i7 = i;
            long jM7130a = ji1.m7130a(fArr[i4], fArr[i4 + i2]);
            int i8 = i3 * 2;
            int i9 = i2;
            int i10 = length;
            long jM7130a2 = ji1.m7130a(fArr[i8], fArr[i8 + i2]);
            long jM7130a3 = ji1.m7130a(fArr[i6], fArr[i6 + 1]);
            dr3 dr3Var = new dr3();
            dr3Var.f17301a = jM7130a;
            dr3Var.f17302b = jM7130a2;
            dr3Var.f17303c = jM7130a3;
            long jM10700M = se0.m10700M(jM7130a, jM7130a2);
            long jM10700M2 = se0.m10700M(jM7130a3, jM7130a2);
            float fM10745z = se0.m10745z(jM10700M);
            float fM10745z2 = se0.m10745z(jM10700M2);
            if (fM10745z <= 0.0f || fM10745z2 <= 0.0f) {
                dr3Var.f17304d = ji1.m7130a(0.0f, 0.0f);
                dr3Var.f17305e = ji1.m7130a(0.0f, 0.0f);
                dr3Var.f17306f = 0.0f;
                dr3Var.f17307g = 0.0f;
                dr3Var.f17308h = 0.0f;
            } else {
                long jM10737r = se0.m10737r(jM10700M, fM10745z);
                dr3Var.f17304d = jM10737r;
                long jM10737r2 = se0.m10737r(jM10700M2, fM10745z2);
                dr3Var.f17305e = jM10737r2;
                float f4 = no0Var2.f25978a;
                dr3Var.f17306f = f4;
                dr3Var.f17307g = no0Var2.f25979b;
                float fM10738s = se0.m10738s(jM10737r, jM10737r2);
                float f5 = ew4.f18547b;
                float fSqrt = (float) Math.sqrt(f3 - (fM10738s * fM10738s));
                dr3Var.f17308h = ((double) fSqrt) > 0.001d ? ((fM10738s + f3) * f4) / fSqrt : 0.0f;
            }
            dr3Var.f17309i = ji1.m7130a(0.0f, 0.0f);
            VarHandle.storeStoreFence();
            arrayList3.add(dr3Var);
            i3 = i5;
            f2 = f3;
            obj = obj2;
            i = i7;
            i2 = i9;
            length = i10;
        }
        float f6 = f2;
        int i11 = i;
        ?? r18 = obj;
        int i12 = i2;
        r52 r52VarM10660c0 = sc6.m10660c0(0, length);
        ArrayList arrayList4 = new ArrayList(ib0.m6717y0(r52VarM10660c0, 10));
        Iterator it = r52VarM10660c0.iterator();
        while (true) {
            q52 q52Var = (q52) it;
            if (!q52Var.f28225c) {
                break;
            }
            int iNextInt = q52Var.nextInt();
            int i13 = (iNextInt + 1) % length;
            float f7 = ((dr3) arrayList3.get(iNextInt)).f17308h + ((dr3) arrayList3.get(i13)).f17308h;
            float fM4662c = ((dr3) arrayList3.get(i13)).m4662c() + ((dr3) arrayList3.get(iNextInt)).m4662c();
            int i14 = iNextInt * 2;
            float f8 = fArr[i14];
            float f9 = fArr[i14 + 1];
            int i15 = i13 * 2;
            float f10 = f8 - fArr[i15];
            float f11 = f9 - fArr[i15 + 1];
            float f12 = ew4.f18547b;
            float fSqrt2 = (float) Math.sqrt((f11 * f11) + (f10 * f10));
            arrayList4.add(f7 > fSqrt2 ? new l73(Float.valueOf(fSqrt2 / f7), Float.valueOf(0.0f)) : fM4662c > fSqrt2 ? new l73(fValueOf, Float.valueOf((fSqrt2 - f7) / (fM4662c - f7))) : new l73(fValueOf, fValueOf));
        }
        for (int i16 = 0; i16 < length; i16++) {
            int i17 = i11;
            float[] fArrCopyOf = new float[i17];
            int i18 = 0;
            int i19 = 0;
            while (i18 < i17) {
                l73 l73Var = (l73) arrayList4.get((((i16 + length) - 1) + i18) % length);
                float fM4662c2 = ((((dr3) arrayList3.get(i16)).m4662c() - ((dr3) arrayList3.get(i16)).f17308h) * ((Number) l73Var.f23834b).floatValue()) + (((dr3) arrayList3.get(i16)).f17308h * ((Number) l73Var.f23833a).floatValue());
                int i20 = i19 + 1;
                if (fArrCopyOf.length < i20) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, Math.max(i20, (fArrCopyOf.length * 3) / 2));
                }
                fArrCopyOf[i19] = fM4662c2;
                i18++;
                i19 = i20;
                fArrCopyOf = fArrCopyOf;
                i17 = 2;
            }
            dr3 dr3Var2 = (dr3) arrayList3.get(i16);
            if (i19 <= 0) {
                kx5.m7733s0("Index must be between 0 and size");
                throw r18;
            }
            float f13 = fArrCopyOf[0];
            int i21 = i12;
            if (i21 >= i19) {
                kx5.m7733s0("Index must be between 0 and size");
                throw r18;
            }
            float f14 = fArrCopyOf[i21];
            long j = dr3Var2.f17305e;
            long j2 = dr3Var2.f17304d;
            float f15 = f;
            float f16 = dr3Var2.f17306f;
            ArrayList arrayList5 = arrayList2;
            long j3 = dr3Var2.f17302b;
            float fMin = Math.min(f13, f14);
            float f17 = dr3Var2.f17308h;
            if (f17 < 1.0E-4f || fMin < 1.0E-4f || f16 < 1.0E-4f) {
                dr3Var2.f17309i = j3;
                float fM10691D = se0.m10691D(j3);
                float fM10692E = se0.m10692E(j3);
                float fM10691D2 = se0.m10691D(j3);
                float fM10692E2 = se0.m10692E(j3);
                listSingletonList = Collections.singletonList(y62.m12969g(fM10691D, fM10692E, ew4.m5414b(fM10691D, fM10691D2, 0.33333334f), ew4.m5414b(fM10692E, fM10692E2, 0.33333334f), ew4.m5414b(fM10691D, fM10691D2, 0.6666667f), ew4.m5414b(fM10692E, fM10692E2, 0.6666667f), fM10691D2, fM10692E2));
            } else {
                float fMin2 = Math.min(fMin, f17);
                float fM4661a = dr3Var2.m4661a(f13);
                float fM4661a2 = dr3Var2.m4661a(f14);
                float f18 = (f16 * fMin2) / f17;
                float f19 = ew4.f18547b;
                float fSqrt3 = (float) Math.sqrt((fMin2 * fMin2) + (f18 * f18));
                long jM10737r3 = se0.m10737r(se0.m10704S(j2, j), 2.0f);
                float fM10745z3 = se0.m10745z(jM10737r3);
                if (fM10745z3 <= f15) {
                    C1077qn.m9987m("Can't get the direction of a 0-length vector");
                    return r18;
                }
                dr3Var2.f17309i = se0.m10704S(j3, se0.m10721f0(se0.m10737r(jM10737r3, fM10745z3), fSqrt3));
                long jM10704S = se0.m10704S(j3, se0.m10721f0(j2, fMin2));
                long jM10704S2 = se0.m10704S(j3, se0.m10721f0(j, fMin2));
                as0 as0VarM4660b = dr3.m4660b(fMin2, fM4661a, dr3Var2.f17302b, dr3Var2.f17301a, jM10704S, jM10704S2, dr3Var2.f17309i, f18);
                as0 as0VarM4660b2 = dr3.m4660b(fMin2, fM4661a2, dr3Var2.f17302b, dr3Var2.f17303c, jM10704S2, jM10704S, dr3Var2.f17309i, f18);
                float fM3215a = as0VarM4660b2.m3215a();
                float fM3216b = as0VarM4660b2.m3216b();
                float[] fArr2 = as0VarM4660b2.f14841a;
                as0 as0VarM12969g2 = y62.m12969g(fM3215a, fM3216b, fArr2[4], fArr2[5], fArr2[2], fArr2[3], fArr2[0], fArr2[1]);
                float fM10691D3 = se0.m10691D(dr3Var2.f17309i);
                float fM10692E3 = se0.m10692E(dr3Var2.f17309i);
                float fM3215a2 = as0VarM4660b.m3215a();
                float fM3216b2 = as0VarM4660b.m3216b();
                float[] fArr3 = as0VarM12969g2.f14841a;
                float f20 = fArr3[0];
                float f21 = fArr3[1];
                float f22 = fM3215a2 - fM10691D3;
                float f23 = fM3216b2 - fM10692E3;
                long jM5413a = ew4.m5413a(f22, f23);
                float f24 = f20 - fM10691D3;
                float f25 = f21 - fM10692E3;
                long jM5413a2 = ew4.m5413a(f24, f25);
                long jM7130a4 = ji1.m7130a(-se0.m10692E(jM5413a), se0.m10691D(jM5413a));
                long jM7130a5 = ji1.m7130a(-se0.m10692E(jM5413a2), se0.m10691D(jM5413a2));
                boolean z = (se0.m10692E(jM7130a4) * f25) + (se0.m10691D(jM7130a4) * f24) >= f15;
                float fM10738s2 = se0.m10738s(jM5413a, jM5413a2);
                if (fM10738s2 > 0.999f) {
                    as0VarM12969g = y62.m12969g(fM3215a2, fM3216b2, ew4.m5414b(fM3215a2, f20, 0.33333334f), ew4.m5414b(fM3216b2, f21, 0.33333334f), ew4.m5414b(fM3215a2, f20, 0.6666667f), ew4.m5414b(fM3216b2, f21, 0.6666667f), f20, f21);
                } else {
                    float f26 = f6 - fM10738s2;
                    float fSqrt4 = (((((float) Math.sqrt(2.0f * f26)) - ((float) Math.sqrt(f6 - (fM10738s2 * fM10738s2)))) * ((((float) Math.sqrt((f23 * f23) + (f22 * f22))) * 4.0f) / 3.0f)) / f26) * (z ? f6 : -1.0f);
                    as0VarM12969g = y62.m12969g(fM3215a2, fM3216b2, (se0.m10691D(jM7130a4) * fSqrt4) + fM3215a2, (se0.m10692E(jM7130a4) * fSqrt4) + fM3216b2, f20 - (se0.m10691D(jM7130a5) * fSqrt4), f21 - (se0.m10692E(jM7130a5) * fSqrt4), f20, f21);
                }
                listSingletonList = kx5.m7694Y(as0VarM4660b, as0VarM12969g, as0VarM12969g2);
            }
            arrayList5.add(listSingletonList);
            arrayList2 = arrayList5;
            f = f15;
            arrayList4 = arrayList4;
            i11 = 2;
            i12 = 1;
        }
        ArrayList arrayList6 = arrayList2;
        float f27 = f;
        ArrayList arrayList7 = new ArrayList();
        int i22 = 0;
        while (i22 < length) {
            int i23 = i22 + 1;
            int i24 = i23 % length;
            int i25 = i22 * 2;
            long jM7130a6 = ji1.m7130a(fArr[i25], fArr[i25 + 1]);
            int i26 = (((i22 + length) - 1) % length) * 2;
            long jM7130a7 = ji1.m7130a(fArr[i26], fArr[i26 + 1]);
            int i27 = i24 * 2;
            long jM7130a8 = ji1.m7130a(fArr[i27], fArr[i27 + 1]);
            float f28 = ew4.f18547b;
            long jM10700M3 = se0.m10700M(jM7130a6, jM7130a7);
            long jM10700M4 = se0.m10700M(jM7130a8, jM7130a6);
            arrayList7.add(new cd1((List) arrayList6.get(i22), (se0.m10692E(jM10700M4) * se0.m10691D(jM10700M3)) - (se0.m10691D(jM10700M4) * se0.m10692E(jM10700M3)) > f27));
            float fM3215a3 = ((as0) hb0.m6306R0((List) arrayList6.get(i22))).m3215a();
            float fM3216b3 = ((as0) hb0.m6306R0((List) arrayList6.get(i22))).m3216b();
            float f29 = ((as0) hb0.m6299K0((List) arrayList6.get(i24))).f14841a[0];
            float f30 = ((as0) hb0.m6299K0((List) arrayList6.get(i24))).f14841a[1];
            arrayList7.add(new dd1(Collections.singletonList(y62.m12969g(fM3215a3, fM3216b3, ew4.m5414b(fM3215a3, f29, 0.33333334f), ew4.m5414b(fM3216b3, f30, 0.33333334f), ew4.m5414b(fM3215a3, f29, 0.6666667f), ew4.m5414b(fM3216b3, f30, 0.6666667f), f29, f30))));
            i22 = i23;
        }
        long jM7130a9 = ji1.m7130a(f27, f27);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM7130a9 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM7130a9 & 4294967295L));
        if (arrayList7.size() < 2) {
            C1077qn.m9987m("Polygons must have at least 2 features");
            return r18;
        }
        sl2 sl2VarM7680G = kx5.m7680G();
        int size = arrayList7.size();
        int i28 = 0;
        while (i28 < size) {
            Object obj3 = arrayList7.get(i28);
            i28++;
            for (as0 as0Var : ((fd1) obj3).f18921a) {
                sl2VarM7680G.add(Float.valueOf(as0Var.f14841a[0]));
                sl2VarM7680G.add(Float.valueOf(as0Var.f14841a[1]));
            }
        }
        sl2 sl2VarM7740w = kx5.m7740w(sl2VarM7680G);
        float[] fArr4 = new float[sl2VarM7740w.mo3088a()];
        ListIterator listIterator = sl2VarM7740w.listIterator(0);
        int i29 = 0;
        while (true) {
            ow1 ow1Var = (ow1) listIterator;
            if (!ow1Var.hasNext()) {
                break;
            }
            fArr4[i29] = ((Number) ow1Var.next()).floatValue();
            i29++;
        }
        if (Float.isNaN(fIntBitsToFloat)) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (m7940u(fArr4) >> 32));
        }
        if (Float.isNaN(fIntBitsToFloat2)) {
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (m7940u(fArr4) & 4294967295L));
        }
        return new ir3(arrayList7, ji1.m7130a(fIntBitsToFloat, fIntBitsToFloat2));
    }

    /* JADX INFO: renamed from: m */
    public static final void m7932m(Object obj, wp1 wp1Var, mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6890g(obj)) {
            m7914W(ir1Var, wp1Var);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m7933n(Object obj, Object obj2, wp1 wp1Var, mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6890g(obj) || ir1Var.m6890g(obj2)) {
            m7914W(ir1Var, wp1Var);
        }
    }

    /* JADX INFO: renamed from: o */
    public static ls3 m7934o(wa2 wa2Var) throws Exception {
        gh3 gh3Var;
        o92 o92VarM2271e;
        if (wa2Var.f33192a.containsKey("video_auto_play_start_time")) {
            String strMo3532s = wa2Var.m12186z("video_auto_play_start_time").mo3532s();
            try {
                gh3Var = (gh3) Enum.valueOf(gh3.class, strMo3532s.toUpperCase(Locale.ROOT));
            } catch (IllegalArgumentException e) {
                throw new Exception(c75.m3879k("Invalid for value enum ", lb5.class.getName(), ": ", strMo3532s), e);
            }
        } else {
            gh3Var = null;
        }
        wa2 wa2VarM2262a = su1.m2262a(wa2Var, "url_mapping", (wa2) null);
        String strM2258a = wa2VarM2262a != null ? su1.m2258a(wa2VarM2262a, "click_url", "") : null;
        ArrayList arrayList = new ArrayList();
        if (wa2VarM2262a != null && (o92VarM2271e = su1.m2271e(wa2VarM2262a, "interaction_types")) != null) {
            ArrayList arrayList2 = o92VarM2271e.f26491a;
            int size = arrayList2.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                int i3 = i + 1;
                if (i < 0) {
                    kx5.m7735t0();
                    throw null;
                }
                String strMo3532s2 = ((ba2) obj).mo3532s();
                if (strMo3532s2 != null) {
                    arrayList.add(strMo3532s2);
                }
                i = i3;
            }
        }
        int iM2255a = su1.m2255a(wa2Var, "required_screen_hold_sec", 0);
        ls3 ls3Var = new ls3();
        ls3Var.f6997a = iM2255a;
        ls3Var.f6998b = gh3Var;
        ls3Var.f6999c = strM2258a;
        ls3Var.f7000d = arrayList;
        VarHandle.storeStoreFence();
        return ls3Var;
    }

    /* JADX INFO: renamed from: p */
    public static void m7935p(int i, String str) {
        AbstractC0137h.m1112b(i + ": " + str, null);
    }

    /* JADX INFO: renamed from: q */
    public static final ix0 m7936q(zo0 zo0Var, ro0 ro0Var, mq1 mq1Var) {
        cp0 cp0Var = cp0.f16325a;
        ro0 ro0VarM3796A = c20.m3796A(zo0Var, ro0Var);
        cp0 cp0Var2 = cp0.f16325a;
        ix0 ix0Var = new ix0(ro0VarM3796A, true);
        ix0Var.m10957j0(cp0Var, ix0Var, mq1Var);
        return ix0Var;
    }

    /* JADX INFO: renamed from: r */
    public static ix0 m7937r(zo0 zo0Var, ro0 ro0Var, mq1 mq1Var, int i) {
        if ((i & 1) != 0) {
            ro0Var = r71.f29063a;
        }
        cp0 cp0Var = cp0.f16325a;
        return m7936q(zo0Var, ro0Var, mq1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public static final Object m7938s(mg3 mg3Var, wp1 wp1Var, ym0 ym0Var) {
        kg3 kg3Var;
        if (ym0Var instanceof kg3) {
            kg3Var = (kg3) ym0Var;
            int i = kg3Var.f23110v;
            if ((i & Integer.MIN_VALUE) != 0) {
                kg3Var.f23110v = i - Integer.MIN_VALUE;
            } else {
                kg3Var = new kg3(ym0Var);
            }
        } else {
            kg3Var = new kg3(ym0Var);
        }
        Object obj = kg3Var.f23109u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = kg3Var.f23110v;
        try {
            if (i2 == 0) {
                k43.m7376J(obj);
                if (kg3Var.getContext().get(o85.f26448h) != mg3Var) {
                    C1077qn.m9989o("awaitClose() can only be invoked from the producer context");
                    return null;
                }
                kg3Var.f23108t = wp1Var;
                kg3Var.f23110v = 1;
                b70 b70Var = new b70(1, C0006a5.m86x(kg3Var));
                b70Var.m3497u();
                ci0 ci0Var = new ci0((byte) 2);
                ci0Var.f16041b = b70Var;
                VarHandle.storeStoreFence();
                mg3Var.m8299k0(ci0Var);
                if (b70Var.m3495r() == ap0Var) {
                    return ap0Var;
                }
            } else {
                if (i2 != 1) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wp1Var = kg3Var.f23108t;
                k43.m7376J(obj);
            }
            wp1Var.invoke();
            return ju4.f22634a;
        } catch (Throwable th) {
            wp1Var.invoke();
            throw th;
        }
    }

    /* JADX INFO: renamed from: t */
    public static final nt2 m7939t(nt2 nt2Var, e30 e30Var) {
        c30 c30Var = new c30();
        c30Var.f15779a = e30Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(c30Var);
    }

    /* JADX INFO: renamed from: u */
    public static final long m7940u(float[] fArr) {
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        while (i < fArr.length) {
            int i2 = i + 1;
            f += fArr[i];
            i += 2;
            f2 += fArr[i2];
        }
        return ji1.m7130a(f / (fArr.length / 2), f2 / (fArr.length / 2));
    }

    /* JADX INFO: renamed from: v */
    public static final void m7941v(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                se0.m10720f(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static final zo0 m7942w(ro0 ro0Var, mi0 mi0Var) {
        if (ro0Var.get(o85.f26448h) != null) {
            v82 v82VarM13021a = y70.m13021a();
            v82VarM13021a.m4989U(new ff0(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false));
            return zp0.m13670b(v82VarM13021a);
        }
        ro0 ro0Var2 = ((ir1) mi0Var).f21681R;
        rm3 rm3Var = new rm3();
        rm3Var.f29415a = ro0Var2;
        rm3Var.f29416b = ro0Var;
        rm3Var.f29417c = rm3Var;
        VarHandle.storeStoreFence();
        return rm3Var;
    }

    /* JADX INFO: renamed from: x */
    public static int m7943x(byte[] bArr, int i, C1411zn c1411zn) throws h72 {
        int iM7897E = m7897E(bArr, i, c1411zn);
        int i2 = c1411zn.f36190a;
        if (i2 < 0) {
            throw h72.m6266c();
        }
        if (i2 > bArr.length - iM7897E) {
            throw h72.m6268e();
        }
        if (i2 == 0) {
            c1411zn.f36192c = t50.f30782b;
            return iM7897E;
        }
        c1411zn.f36192c = t50.m10980d(bArr, iM7897E, i2);
        return iM7897E + i2;
    }

    /* JADX INFO: renamed from: y */
    public static int m7944y(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: z */
    public static long m7945z(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: M */
    public abstract jl3 mo5906M();

    /* JADX INFO: renamed from: a */
    public abstract Object mo635a(r75 r75Var, of4 of4Var);

    /* JADX INFO: renamed from: a */
    public abstract void mo636a(mm2 mm2Var);
}
