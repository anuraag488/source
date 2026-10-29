package p000;

import ads_mobile_sdk.C0146hk;
import ads_mobile_sdk.C0179jk;
import ads_mobile_sdk.C0310ra;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Size;
import android.util.SizeF;
import android.view.KeyEvent;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class kx5 {

    /* JADX INFO: renamed from: a */
    public static String f23589a;

    /* JADX INFO: renamed from: c */
    public static final pg0 f23591c;

    /* JADX INFO: renamed from: i */
    public static tt2 f23597i;

    /* JADX INFO: renamed from: k */
    public static final z45 f23599k;

    /* JADX INFO: renamed from: l */
    public static final ed1 f23600l;

    /* JADX INFO: renamed from: m */
    public static final ed1[] f23601m;

    /* JADX INFO: renamed from: n */
    public static g12 f23602n;

    /* JADX INFO: renamed from: b */
    public static final pg0 f23590b = new pg0(-1554298677, false, new ah0(10));

    /* JADX INFO: renamed from: d */
    public static final int[] f23592d = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* JADX INFO: renamed from: e */
    public static final int[] f23593e = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* JADX INFO: renamed from: f */
    public static final int[] f23594f = {67108863, 33554431};

    /* JADX INFO: renamed from: g */
    public static final int[] f23595g = {26, 25};

    /* JADX INFO: renamed from: h */
    public static final tt2 f23596h = new tt2((Method) null, (Method) null, (Method) null);

    /* JADX INFO: renamed from: j */
    public static final Object f23598j = new Object();

    static {
        byte b = 13;
        f23591c = new pg0(1753958567, false, new xg0(b));
        f23599k = new z45(b);
        ed1 ed1Var = new ed1("CLIENT_TELEMETRY", 1L);
        f23600l = ed1Var;
        f23601m = new ed1[]{ed1Var};
    }

    /* JADX INFO: renamed from: A */
    public static void m7675A(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public static nt2 m7676B(nv2 nv2Var, jq3 jq3Var, boolean z, wp1 wp1Var, wp1 wp1Var2) {
        if (jq3Var != null) {
            return new od0(nv2Var, jq3Var, false, z, wp1Var2, wp1Var);
        }
        if (jq3Var == null) {
            return new od0(nv2Var, null, false, z, wp1Var2, wp1Var);
        }
        kt2 kt2Var = kt2.f23428a;
        if (nv2Var != null) {
            return n22.m8478a(kt2Var, nv2Var, jq3Var).mo7630d(new od0(nv2Var, null, false, z, wp1Var2, wp1Var));
        }
        y90 y90Var = new y90((byte) 1);
        y90Var.f35033b = jq3Var;
        y90Var.f35034c = z;
        y90Var.f35035d = wp1Var2;
        y90Var.f35036e = wp1Var;
        VarHandle.storeStoreFence();
        return qq2.m10029m(kt2Var, y90Var);
    }

    /* JADX INFO: renamed from: C */
    public static nt2 m7677C(nt2 nt2Var, wp1 wp1Var, nv2 nv2Var, wp1 wp1Var2, int i) {
        if ((i & 128) != 0) {
            nv2Var = null;
        }
        return nt2Var.mo7630d(new od0(nv2Var, null, true, true, wp1Var2, wp1Var));
    }

    /* JADX INFO: renamed from: E */
    public static final boolean m7678E(jl3 jl3Var, float f, float f2) {
        float f3 = jl3Var.f22396a;
        if (f > jl3Var.f22398c || f3 > f) {
            return false;
        }
        return f2 <= jl3Var.f22399d && jl3Var.f22397b <= f2;
    }

    /* JADX INFO: renamed from: F */
    public static byte[] m7679F(long[] jArr) {
        long j;
        int[] iArr;
        int i;
        int[] iArr2;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            j = 19;
            iArr = f23595g;
            if (i3 >= 2) {
                break;
            }
            int i4 = 0;
            while (i4 < 9) {
                long j2 = jArrCopyOf[i4];
                int i5 = iArr[i4 & 1];
                int i6 = -((int) (((j2 >> 31) & j2) >> i5));
                jArrCopyOf[i4] = j2 + ((long) (i6 << i5));
                i4++;
                jArrCopyOf[i4] = jArrCopyOf[i4] - ((long) i6);
            }
            long j3 = jArrCopyOf[9];
            int i7 = -((int) (((j3 >> 31) & j3) >> 25));
            jArrCopyOf[9] = j3 + ((long) (i7 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - (((long) i7) * 19);
            i3++;
        }
        long j4 = jArrCopyOf[0];
        int i8 = -((int) (((j4 >> 31) & j4) >> 26));
        jArrCopyOf[0] = j4 + ((long) (i8 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i8);
        int i9 = 0;
        while (true) {
            iArr2 = f23594f;
            if (i9 >= 2) {
                break;
            }
            int i10 = i2;
            while (i10 < 9) {
                long j5 = jArrCopyOf[i10];
                int i11 = i10 & 1;
                int i12 = i2;
                int i13 = i9;
                int i14 = (int) (j5 >> iArr[i11]);
                jArrCopyOf[i10] = j5 & ((long) iArr2[i11]);
                i10++;
                jArrCopyOf[i10] = jArrCopyOf[i10] + ((long) i14);
                i2 = i12;
                j = j;
                i9 = i13;
            }
            i9++;
        }
        int i15 = i2;
        long j6 = jArrCopyOf[9];
        jArrCopyOf[9] = j6 & 33554431;
        long j7 = (((long) ((int) (j6 >> 25))) * j) + jArrCopyOf[i15];
        jArrCopyOf[i15] = j7;
        int i16 = ~((((int) j7) - 67108845) >> 31);
        for (int i17 = 1; i17 < 10; i17++) {
            int i18 = ~(((int) jArrCopyOf[i17]) ^ iArr2[i17 & 1]);
            int i19 = i18 & (i18 << 16);
            int i20 = i19 & (i19 << 8);
            int i21 = i20 & (i20 << 4);
            int i22 = i21 & (i21 << 2);
            i16 &= (i22 & (i22 << 1)) >> 31;
        }
        jArrCopyOf[i15] = jArrCopyOf[i15] - ((long) (67108845 & i16));
        long j8 = 33554431 & i16;
        jArrCopyOf[1] = jArrCopyOf[1] - j8;
        for (i = 2; i < 10; i += 2) {
            jArrCopyOf[i] = jArrCopyOf[i] - ((long) (67108863 & i16));
            int i23 = i + 1;
            jArrCopyOf[i23] = jArrCopyOf[i23] - j8;
        }
        for (int i24 = i15; i24 < 10; i24++) {
            jArrCopyOf[i24] = jArrCopyOf[i24] << f23593e[i24];
        }
        byte[] bArr = new byte[32];
        for (int i25 = i15; i25 < 10; i25++) {
            int i26 = f23592d[i25];
            long j9 = bArr[i26];
            long j10 = jArrCopyOf[i25];
            bArr[i26] = (byte) (j9 | (j10 & 255));
            int i27 = i26 + 1;
            bArr[i27] = (byte) (((long) bArr[i27]) | ((j10 >> 8) & 255));
            int i28 = i26 + 2;
            bArr[i28] = (byte) (((long) bArr[i28]) | ((j10 >> 16) & 255));
            int i29 = i26 + 3;
            bArr[i29] = (byte) (((long) bArr[i29]) | ((j10 >> 24) & 255));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: G */
    public static sl2 m7680G() {
        return new sl2(10);
    }

    /* JADX INFO: renamed from: I */
    public static final ny2 m7681I(ny2 ny2Var, List list, Set set, Set set2, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6885d0(-1239021605);
        sw2 sw2VarM7369C = k43.m7369C(list, ir1Var);
        Object obj = ny2Var.f26195b;
        ir1Var.m6879a0(-993800456, obj);
        jv0 jv0Var = new jv0();
        jv0Var.f22641a = set2;
        jv0Var.f22642b = obj;
        jv0Var.f22643c = set;
        jv0Var.f22644d = sw2VarM7369C;
        jv0Var.f22645e = list;
        jv0Var.f22646f = ny2Var;
        VarHandle.storeStoreFence();
        ny2 ny2Var2 = new ny2(ny2Var, vd6.m11834R(-1349345695, jv0Var, ir1Var));
        ir1Var.m6912r(false);
        ir1Var.m6912r(false);
        return ny2Var2;
    }

    /* JADX INFO: renamed from: L */
    public static int m7682L(String str, byte[] bArr, int i, int i2) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (bytes.length - i > i2) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i, bytes.length);
        return i + bytes.length;
    }

    /* JADX INFO: renamed from: N */
    public static String m7683N(t50 t50Var) {
        StringBuilder sb = new StringBuilder(t50Var.size());
        for (int i = 0; i < t50Var.size(); i++) {
            byte bMo7013b = t50Var.mo7013b(i);
            if (bMo7013b == 34) {
                sb.append("\\\"");
            } else if (bMo7013b == 39) {
                sb.append("\\'");
            } else if (bMo7013b != 92) {
                switch (bMo7013b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo7013b < 32 || bMo7013b > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo7013b >>> 6) & 3) + 48));
                            sb.append((char) (((bMo7013b >>> 3) & 7) + 48));
                            sb.append((char) ((bMo7013b & 7) + 48));
                        } else {
                            sb.append((char) bMo7013b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: O */
    public static long[] m7684O(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            int i2 = f23592d[i];
            jArr[i] = ((((((long) (bArr[i2] & 255)) | (((long) (bArr[i2 + 1] & 255)) << 8)) | (((long) (bArr[i2 + 2] & 255)) << 16)) | (((long) (bArr[i2 + 3] & 255)) << 24)) >> f23593e[i]) & ((long) f23594f[i & 1]);
        }
        return jArr;
    }

    /* JADX INFO: renamed from: P */
    public static final int m7685P(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: Q */
    public static final int m7686Q(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    /* JADX INFO: renamed from: R */
    public static final String m7687R(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i >= 0) {
            sb.append("Unexpected JSON token at offset " + i + ": ");
        }
        sb.append(str);
        if (str2 != null && !hd4.m6345k0(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !hd4.m6345k0(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: S */
    public static ECParameterSpec m7688S(h71 h71Var) throws NoSuchAlgorithmException {
        int iOrdinal = h71Var.ordinal();
        if (iOrdinal == 0) {
            return k71.f22950a;
        }
        if (iOrdinal == 1) {
            return k71.f22951b;
        }
        if (iOrdinal == 2) {
            return k71.f22952c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:" + h71Var);
    }

    /* JADX INFO: renamed from: T */
    public static int m7689T(List list) {
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: U */
    public static final void m7690U(AbstractC0856l1 abstractC0856l1, String str) {
        abstractC0856l1.m7806q("Trailing comma before the end of JSON ".concat(str), abstractC0856l1.f23686b - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ void m7691V(AbstractC0856l1 abstractC0856l1) {
        m7690U(abstractC0856l1, "object");
        throw null;
    }

    /* JADX INFO: renamed from: W */
    public static final boolean m7692W(KeyEvent keyEvent) {
        long jM10079D = qs5.m10079D(keyEvent);
        int i = nc2.f25646O;
        return nc2.m8689a(jM10079D, nc2.f25654h) || nc2.m8689a(jM10079D, nc2.f25664r) || nc2.m8689a(jM10079D, nc2.f25636E) || nc2.m8689a(jM10079D, nc2.f25663q);
    }

    /* JADX INFO: renamed from: X */
    public static boolean m7693X(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        if (bArr.length < 8 || bArr[0] != 48) {
            return false;
        }
        int i5 = bArr[1] & 255;
        if (i5 == 129) {
            i5 = bArr[2] & 255;
            if (i5 < 128) {
                return false;
            }
            i = 2;
        } else {
            if (i5 == 128 || i5 > 129) {
                return false;
            }
            i = 1;
        }
        if (i5 != (bArr.length - 1) - i || bArr[i + 1] != 2 || (i4 = (i3 = i + 3 + (i2 = bArr[i + 2] & 255)) + 1) >= bArr.length || i2 == 0) {
            return false;
        }
        int i6 = i + 3;
        byte b = bArr[i6];
        if ((b & 255) >= 128) {
            return false;
        }
        if ((i2 > 1 && b == 0 && (bArr[i + 4] & 255) < 128) || bArr[i6 + i2] != 2) {
            return false;
        }
        int i7 = bArr[i4] & 255;
        if (i3 + 2 + i7 != bArr.length || i7 == 0) {
            return false;
        }
        byte b2 = bArr[i + 5 + i2];
        if ((b2 & 255) >= 128) {
            return false;
        }
        return i7 <= 1 || b2 != 0 || (bArr[(i + 6) + i2] & 255) >= 128;
    }

    /* JADX INFO: renamed from: Y */
    public static List m7694Y(Object... objArr) {
        return objArr.length > 0 ? Arrays.asList(objArr) : v71.f32439a;
    }

    /* JADX INFO: renamed from: Z */
    public static final CharSequence m7695Z(CharSequence charSequence, int i) {
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sb = new StringBuilder(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sb.append(charSequence.subSequence(i2, i3).toString());
                sb.append(str2);
                return sb.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: a */
    public static final y92 m7696a(g24 g24Var) {
        String str = "Value of type '" + g24Var.mo3641b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + g24Var.mo4431c() + '\'';
        g24Var.mo3641b();
        return new y92(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.", null, 8);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m7697a0(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr2[0];
        long j2 = jArr3[0];
        long j3 = j * j2;
        long j4 = jArr3[1];
        long j5 = jArr2[1];
        long j6 = (j5 * j2) + (j * j4);
        long j7 = jArr3[2];
        long j8 = jArr2[2];
        long j9 = (j8 * j2) + (j * j7) + (j5 * 2 * j4);
        long j10 = jArr3[3];
        long j11 = jArr2[3];
        long j12 = (j11 * j2) + (j * j10) + (j8 * j4) + (j5 * j7);
        long j13 = jArr3[4];
        long j14 = jArr2[4];
        long j15 = (j14 * j2) + (j * j13) + (((j11 * j4) + (j5 * j10)) * 2) + (j8 * j7);
        long j16 = jArr3[5];
        long j17 = jArr2[5];
        long j18 = (j17 * j2) + (j * j16) + (j14 * j4) + (j5 * j13) + (j11 * j7) + (j8 * j10);
        long j19 = jArr3[6];
        long j20 = (j * j19) + (j14 * j7) + (j8 * j13) + (((j17 * j4) + (j5 * j16) + (j11 * j10)) * 2);
        long j21 = jArr2[6];
        long j22 = (j21 * j2) + j20;
        long j23 = jArr3[7];
        long j24 = jArr2[7];
        long j25 = (j24 * j2) + (j * j23) + (j21 * j4) + (j5 * j19) + (j17 * j7) + (j8 * j16) + (j14 * j10) + (j11 * j13);
        long j26 = jArr3[8];
        long j27 = jArr2[8];
        long j28 = (j27 * j2) + (j * j26) + (j21 * j7) + (j8 * j19) + (((j24 * j4) + (j5 * j23) + (j17 * j10) + (j11 * j16)) * 2) + (j14 * j13);
        long j29 = jArr3[9];
        long j30 = jArr2[9];
        long j31 = (j2 * j30) + (j * j29) + (j27 * j4) + (j5 * j26) + (j24 * j7) + (j8 * j23) + (j21 * j10) + (j11 * j19) + (j17 * j13) + (j14 * j16);
        long j32 = j4 * j30;
        long j33 = (j27 * j7) + (j8 * j26) + (j21 * j13) + (j14 * j19) + ((j32 + (j5 * j29) + (j24 * j10) + (j11 * j23) + (j17 * j16)) * 2);
        long j34 = j7 * j30;
        long j35 = j34 + (j8 * j29) + (j27 * j10) + (j11 * j26) + (j24 * j13) + (j14 * j23) + (j21 * j16) + (j17 * j19);
        long j36 = j10 * j30;
        long j37 = j27 * j13;
        long j38 = j13 * j30;
        long j39 = j27 * j19;
        long j40 = j19 * j30;
        m7717k0(new long[]{j3, j6, j9, j12, j15, j18, j22, j25, j28, j31, j33, j35, j37 + (j14 * j26) + ((j36 + (j11 * j29) + (j24 * j16) + (j17 * j23)) * 2) + (j21 * j19), j38 + (j14 * j29) + (j27 * j16) + (j17 * j26) + (j24 * j19) + (j21 * j23), j39 + (j21 * j26) + (((j16 * j30) + (j17 * j29) + (j24 * j23)) * 2), j40 + (j21 * j29) + (j27 * j23) + (j24 * j26), (((j23 * j30) + (j24 * j29)) * 2) + (j27 * j26), (j26 * j30) + (j27 * j29), j30 * 2 * j29}, jArr);
    }

    /* JADX WARN: Code duplicated, block: B:224:0x0532 A[PHI: r6
  0x0532: PHI (r6v41 yp1) = (r6v34 yp1), (r6v42 yp1) binds: [B:223:0x0530, B:219:0x0529] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:229:0x0541  */
    /* JADX WARN: Code duplicated, block: B:233:0x0579  */
    /* JADX WARN: Code duplicated, block: B:236:0x0592  */
    /* JADX WARN: Code duplicated, block: B:242:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:245:0x061c A[LOOP:1: B:245:0x061c->B:266:0x06f0, LOOP_START, PHI: r0 r14 r15 r29
  0x061c: PHI (r0v17 java.util.Map) = (r0v16 java.util.Map), (r0v26 java.util.Map) binds: [B:244:0x061a, B:266:0x06f0] A[DONT_GENERATE, DONT_INLINE]
  0x061c: PHI (r14v12 a2) = (r14v11 a2), (r14v16 a2) binds: [B:244:0x061a, B:266:0x06f0] A[DONT_GENERATE, DONT_INLINE]
  0x061c: PHI (r15v30 int) = (r15v29 int), (r15v33 int) binds: [B:244:0x061a, B:266:0x06f0] A[DONT_GENERATE, DONT_INLINE]
  0x061c: PHI (r29v2 java.util.ArrayList) = (r12v20 java.util.ArrayList), (r29v3 java.util.ArrayList) binds: [B:244:0x061a, B:266:0x06f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:247:0x0634  */
    /* JADX WARN: Code duplicated, block: B:248:0x0637  */
    /* JADX WARN: Code duplicated, block: B:251:0x0664  */
    /* JADX WARN: Code duplicated, block: B:253:0x069a A[LOOP:2: B:252:0x0698->B:253:0x069a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:256:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:261:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:263:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:266:0x06f0 A[LOOP:1: B:245:0x061c->B:266:0x06f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:279:0x0713 A[EDGE_INSN: B:279:0x0713->B:274:0x0713 BREAK  A[LOOP:1: B:245:0x061c->B:266:0x06f0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x06fe A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m7698b(aw3 aw3Var, kz2 kz2Var, nt2 nt2Var, InterfaceC0520ca interfaceC0520ca, yp1 yp1Var, yp1 yp1Var2, mq1 mq1Var, mi0 mi0Var, int i) {
        yp1 yp1Var3;
        nz2 nz2Var;
        float f;
        int i2;
        int i3;
        Object next;
        boolean z;
        int iIntValue;
        float f2;
        float fM12764c;
        int i4;
        wm0 wm0Var;
        Object obj;
        dp4 dp4Var;
        yp1 yp1Var4;
        boolean z2;
        boolean z3;
        Object obj2;
        Object obj3;
        ql3 ql3Var;
        float f3;
        boolean zM6890g;
        Object obj4;
        Object objM6869O;
        dp4 dp4Var2;
        boolean zM6890g2;
        Object er2Var;
        Object obj5;
        dp4 dp4Var3;
        AbstractC0003a2 abstractC0003a2M12171e;
        int iMo103a;
        int i5;
        xz2 xz2Var;
        fk2 fk2Var;
        zh3 zh3VarMo7523a;
        Object obj6;
        zh3 zh3VarMo7523a2;
        zh3 zh3VarMo7523a3;
        Map map;
        kj0 kj0Var;
        AbstractC0003a2 abstractC0003a2;
        Object obj7;
        ArrayList arrayList;
        int size;
        int i6;
        ArrayList arrayList2;
        byte b;
        boolean zM6890g3;
        Object objM6869O2;
        wm0 wm0Var2;
        nt2 nt2Var2 = nt2Var;
        InterfaceC0520ca interfaceC0520ca2 = interfaceC0520ca;
        mq1 mq1Var2 = mq1Var;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-303833701);
        int i7 = (i & 6) == 0 ? (ir1Var.m6890g(aw3Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i7 |= ir1Var.m6890g(kz2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i7 |= ir1Var.m6890g(nt2Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i7 |= ir1Var.m6890g(interfaceC0520ca2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i7 |= ir1Var.m6894i(null) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i7 |= ir1Var.m6894i(yp1Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i7 |= ir1Var.m6894i(yp1Var2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i7 |= ir1Var.m6894i(mq1Var2) ? 8388608 : 4194304;
        }
        if (ir1Var.m6871T(i7 & 1, (4793491 & i7) != 4793490)) {
            ir1Var.m6876Y();
            if ((i & 1) != 0 && !ir1Var.m6856B()) {
                ir1Var.m6874W();
            }
            ir1Var.m6913s();
            Object obj8 = aw3Var.f14918c;
            ArrayList arrayList3 = aw3Var.f14916a;
            Object objM6869O3 = ir1Var.m6869O();
            Object obj9 = ki0.f23136a;
            Object obj10 = objM6869O3;
            if (objM6869O3 == obj9) {
                yz3 yz3Var = new yz3((byte) 2);
                yz3Var.f35651f = k43.m7398w(obj8);
                yz3Var.f35652g = k43.m7398w(obj8);
                yz3Var.f35653h = obj8;
                g32 g32Var = new g32((byte) 22);
                g32Var.f19558b = yz3Var;
                VarHandle.storeStoreFence();
                yz3Var.f35656k = g32Var;
                yz3Var.f35658m = new z73(0.0f);
                yz3Var.f35660o = hx2.m6530a();
                yz3Var.f35661p = new ex2();
                yz3Var.f35662q = Long.MIN_VALUE;
                yz3Var.f35646L = new cw2();
                qz3 qz3Var = new qz3((byte) 0);
                qz3Var.f28903b = yz3Var;
                VarHandle.storeStoreFence();
                yz3Var.f35648N = qz3Var;
                qz3 qz3Var2 = new qz3((byte) 1);
                qz3Var2.f28903b = yz3Var;
                VarHandle.storeStoreFence();
                yz3Var.f35650P = qz3Var2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(yz3Var);
                obj10 = yz3Var;
            }
            yz3 yz3Var2 = (yz3) obj10;
            dp4 dp4VarM13663O = zp0.m13663O(yz3Var2, "scene", ir1Var, 56, 0);
            Object obj11 = (wv3) hb0.m6307S0(aw3Var.f14919d);
            nz2 nz2Var2 = (nz2) kz2Var.f23632a.getValue();
            boolean z4 = nz2Var2 instanceof mz2;
            boolean z5 = z4 && obj11 != null;
            boolean z6 = nz2Var2 instanceof lz2;
            if (z6) {
                nz2Var = nz2Var2;
                f = 0.0f;
            } else if (z4 == 0) {
                C0670g.m5864c();
                return;
            } else {
                nz2Var = nz2Var2;
                f = ((mz2) nz2Var).f25342a.f15700b;
            }
            if (z6) {
                i2 = 2;
            } else {
                if (!z4) {
                    C0670g.m5864c();
                    return;
                }
                i2 = ((mz2) nz2Var).f25342a.f15699a;
            }
            Object objM6869O4 = ir1Var.m6869O();
            int i8 = i7;
            if (objM6869O4 == obj9) {
                ArrayList arrayList4 = new ArrayList(ib0.m6717y0(arrayList3, 10));
                int size2 = arrayList3.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    arrayList4.add(((ny2) arrayList3.get(i9)).f26195b);
                }
                objM6869O4 = k43.m7398w(arrayList4);
                ir1Var.m6905n0(objM6869O4);
            }
            sw2 sw2Var = (sw2) objM6869O4;
            boolean zM6890g4 = ir1Var.m6890g(arrayList3);
            Object objM6869O5 = ir1Var.m6869O();
            if (zM6890g4 || objM6869O5 == obj9) {
                List list = (List) sw2Var.getValue();
                ArrayList arrayList5 = new ArrayList(ib0.m6717y0(arrayList3, 10));
                int i10 = 0;
                for (int size3 = arrayList3.size(); i10 < size3; size3 = size3) {
                    Object obj12 = arrayList3.get(i10);
                    i10++;
                    arrayList5.add(((ny2) obj12).f26195b);
                }
                if (z62.m13387o(hb0.m6299K0(list), hb0.m6299K0(arrayList5)) && arrayList5.size() <= list.size()) {
                    i3 = i2;
                    Iterator it = new r52(0, arrayList5.size() - 1, 1).iterator();
                    do {
                        q52 q52Var = (q52) it;
                        if (!q52Var.f28225c) {
                            next = null;
                            break;
                        } else {
                            next = q52Var.next();
                            iIntValue = ((Number) next).intValue();
                        }
                    } while (z62.m13387o(arrayList5.get(iIntValue), list.get(iIntValue)));
                    if (((Integer) next) == null && arrayList5.size() != list.size()) {
                        z = true;
                    }
                    sw2Var.setValue(arrayList5);
                    objM6869O5 = Boolean.valueOf(z);
                    ir1Var.m6905n0(objM6869O5);
                } else {
                    i3 = i2;
                }
                z = false;
                sw2Var.setValue(arrayList5);
                objM6869O5 = Boolean.valueOf(z);
                ir1Var.m6905n0(objM6869O5);
            } else {
                i3 = i2;
            }
            boolean zBooleanValue = ((Boolean) objM6869O5).booleanValue();
            Object objM6869O6 = ir1Var.m6869O();
            if (objM6869O6 == obj9) {
                objM6869O6 = k43.m7397v();
                ir1Var.m6905n0(objM6869O6);
            }
            y94 y94Var = (y94) objM6869O6;
            Object objM6869O7 = ir1Var.m6869O();
            if (objM6869O7 == obj9) {
                int i11 = o23.f26302a;
                objM6869O7 = new xv2(6);
                ir1Var.m6905n0(objM6869O7);
            }
            xv2 xv2Var = (xv2) objM6869O7;
            zh0 zh0Var = dp4VarM13663O.f17258a;
            d83 d83Var = dp4VarM13663O.f17261d;
            C0874lj c0874lj = new C0874lj((wv3) zh0Var.mo11188l());
            C0874lj c0874lj2 = new C0874lj((wv3) d83Var.getValue());
            int iM12763b = xv2Var.m12763b(c0874lj);
            if (iM12763b >= 0) {
                f2 = xv2Var.f34641c[iM12763b];
            } else {
                f2 = 0.0f;
                xv2Var.m12766e(c0874lj, 0.0f);
            }
            if (!z5 && !z62.m13387o(d83Var.getValue(), obj8) && xv2Var.m12763b(c0874lj2) >= 0) {
                fM12764c = xv2Var.m12764c(c0874lj2);
            } else if (c0874lj.equals(c0874lj2)) {
                fM12764c = f2;
            } else {
                fM12764c = (zBooleanValue || z5) ? f2 - 1.0f : 1.0f + f2;
            }
            y94Var.put(c0874lj2, d83Var.getValue());
            l94 l94Var = y94Var.f35053b;
            xv2Var.m12766e(c0874lj2, fM12764c);
            ArrayList arrayList6 = aw3Var.f14917b;
            Object objM6869O8 = ir1Var.m6869O();
            if (objM6869O8 == obj9) {
                objM6869O8 = new w94();
                ir1Var.m6905n0(objM6869O8);
            }
            w94 w94Var = (w94) objM6869O8;
            boolean zM6894i = ir1Var.m6894i(arrayList6);
            float f4 = f2;
            Object objM6869O9 = ir1Var.m6869O();
            if (zM6894i || objM6869O9 == obj9) {
                objM6869O9 = new C1260vl(arrayList6, w94Var, null, (byte) 10);
                ir1Var.m6905n0(objM6869O9);
            }
            lb5.m7926g(ir1Var, (mq1) objM6869O9, arrayList6);
            boolean zM6890g5 = ir1Var.m6890g(xv2Var.toString()) | ir1Var.m6890g(hb0.m6319e1(l94Var)) | ir1Var.m6890g(w94Var.m12171e());
            Object objM6869O10 = ir1Var.m6869O();
            if (zM6890g5 || objM6869O10 == obj9) {
                sp2 sp2Var = new sp2();
                ArrayList arrayList7 = new ArrayList();
                uc1 uc1Var = new uc1((byte) 1);
                uc1Var.f31781b = xv2Var;
                VarHandle.storeStoreFence();
                List listM6315a1 = hb0.m6315a1(l94Var, uc1Var);
                ArrayList arrayList8 = new ArrayList(ib0.m6717y0(listM6315a1, 10));
                Iterator it2 = listM6315a1.iterator();
                while (it2.hasNext()) {
                    arrayList8.add((wv3) ((Map.Entry) it2.next()).getValue());
                }
                int size4 = arrayList8.size();
                int i12 = 0;
                while (i12 < size4) {
                    Object obj13 = arrayList8.get(i12);
                    i12++;
                    wv3 wv3Var = (wv3) obj13;
                    if (!arrayList7.contains(wv3Var)) {
                        arrayList7.add(wv3Var);
                    }
                }
                boolean zM13387o = z62.m13387o(d83Var.getValue(), hb0.m6299K0(arrayList7));
                List listM6310V0 = hb0.m6310V0(w94Var, arrayList7);
                if (!zM13387o) {
                    listM6310V0 = hb0.m6312X0(listM6310V0);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int size5 = listM6310V0.size();
                int i13 = 0;
                while (i13 < size5) {
                    wv3 wv3Var2 = (wv3) listM6310V0.get(i13);
                    List list2 = listM6310V0;
                    int i14 = size5;
                    sp2Var.put(new C0874lj(wv3Var2), hb0.m6321g1(linkedHashSet));
                    List listMo12426a = wv3Var2.mo12426a();
                    ArrayList arrayList9 = new ArrayList(listMo12426a.size());
                    int size6 = listMo12426a.size();
                    sp2 sp2Var2 = sp2Var;
                    for (int i15 = 0; i15 < size6; i15++) {
                        arrayList9.add(((ny2) listMo12426a.get(i15)).f26195b);
                    }
                    linkedHashSet.addAll(arrayList9);
                    i13++;
                    listM6310V0 = list2;
                    size5 = i14;
                    sp2Var = sp2Var2;
                }
                objM6869O10 = sp2Var.m10893b();
                ir1Var.m6905n0(objM6869O10);
            }
            Map map2 = (Map) objM6869O10;
            wv3 wv3Var3 = f4 >= fM12764c ? (wv3) dp4VarM13663O.f17258a.mo11188l() : (wv3) d83Var.getValue();
            if (z5) {
                ir1Var.m6885d0(-2006502809);
                Float fValueOf = Float.valueOf(f);
                boolean zM6894i2 = ir1Var.m6894i(yz3Var2) | ir1Var.m6884d(f) | ir1Var.m6890g(obj11);
                Object objM6869O11 = ir1Var.m6869O();
                if (zM6894i2 || objM6869O11 == obj9) {
                    float f5 = f;
                    i4 = 131072;
                    wm0Var2 = null;
                    Object iy2Var = new iy2(yz3Var2, f5, obj11, wm0Var2, (byte) 0);
                    ir1Var.m6905n0(iy2Var);
                    objM6869O11 = iy2Var;
                } else {
                    i4 = 131072;
                    wm0Var2 = null;
                }
                lb5.m7927h(obj11, fValueOf, (mq1) objM6869O11, ir1Var);
                ir1Var.m6912r(false);
                dp4Var = dp4VarM13663O;
                wm0Var = wm0Var2;
            } else {
                i4 = 131072;
                wm0Var = null;
                ir1Var.m6885d0(-2006246408);
                boolean zM6894i3 = ir1Var.m6894i(yz3Var2) | ir1Var.m6890g(obj8) | ir1Var.m6890g(dp4VarM13663O);
                Object objM6869O12 = ir1Var.m6869O();
                if (zM6894i3 || objM6869O12 == obj9) {
                    Object c1312wz = new C1312wz((Object) yz3Var2, obj8, (Object) dp4VarM13663O, wm0Var, (byte) 4);
                    obj = obj8;
                    dp4Var = dp4VarM13663O;
                    ir1Var.m6905n0(c1312wz);
                    objM6869O12 = c1312wz;
                } else {
                    dp4Var = dp4VarM13663O;
                    obj = obj8;
                }
                lb5.m7926g(ir1Var, (mq1) objM6869O12, obj);
                ir1Var.m6912r(false);
            }
            int i16 = i3;
            mq1Var2 = mq1Var;
            boolean zM6892h = ir1Var.m6892h(z5) | ir1Var.m6890g(wv3Var3) | ir1Var.m6886e(i16) | ((((i8 & 29360128) ^ 12582912) > 8388608 && ir1Var.m6890g(mq1Var2)) || (i8 & 12582912) == 8388608) | ir1Var.m6892h(zBooleanValue) | ((((i8 & 3670016) ^ 1572864) > 1048576 && ir1Var.m6890g(yp1Var2)) || (i8 & 1572864) == 1048576);
            if (((i8 & 458752) ^ 196608) > i4) {
                yp1Var4 = yp1Var;
                if (ir1Var.m6890g(yp1Var4)) {
                    z2 = true;
                }
                z3 = zM6892h | z2;
                Object objM6869O13 = ir1Var.m6869O();
                obj2 = objM6869O13;
                if (z3 || objM6869O13 == obj9) {
                    fy2 fy2Var = new fy2();
                    fy2Var.f19415a = z5;
                    fy2Var.f19416b = wv3Var3;
                    fy2Var.f19417c = i16;
                    fy2Var.f19418d = mq1Var2;
                    fy2Var.f19419e = zBooleanValue;
                    fy2Var.f19420f = yp1Var2;
                    fy2Var.f19421g = yp1Var4;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(fy2Var);
                    obj2 = fy2Var;
                }
                obj3 = (yp1) obj2;
                ql3Var = new ql3();
                f3 = fM12764c;
                zM6890g = ir1Var.m6890g(obj3) | ir1Var.m6884d(f3) | ir1Var.m6894i(wm0Var);
                Object objM6869O14 = ir1Var.m6869O();
                obj4 = objM6869O14;
                if (zM6890g || objM6869O14 == obj9) {
                    m10 m10Var = new m10((byte) 3);
                    m10Var.f24531c = obj3;
                    m10Var.f24530b = f3;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(m10Var);
                    obj4 = m10Var;
                }
                yp1 yp1Var5 = (yp1) obj4;
                objM6869O = ir1Var.m6869O();
                if (objM6869O == obj9) {
                    objM6869O = new kr2((byte) 11);
                    ir1Var.m6905n0(objM6869O);
                }
                gy2 gy2Var = new gy2((byte) 0);
                gy2Var.f20188b = dp4Var;
                gy2Var.f20189c = w94Var;
                gy2Var.f20190d = ql3Var;
                gy2Var.f20191e = map2;
                VarHandle.storeStoreFence();
                interfaceC0520ca2 = interfaceC0520ca;
                dp4Var2 = dp4Var;
                nt2Var2 = nt2Var;
                ev0.m5330E(dp4Var2, nt2Var2, yp1Var5, interfaceC0520ca2, (yp1) objM6869O, vd6.m11834R(-1167420988, gy2Var, ir1Var), ir1Var, ((i8 >> 3) & 112) | 221184 | (i8 & 7168));
                zM6890g2 = ir1Var.m6890g(dp4Var2) | ir1Var.m6894i(xv2Var);
                Object objM6869O15 = ir1Var.m6869O();
                if (!zM6890g2 || objM6869O15 == obj9) {
                    obj5 = obj9;
                    dp4Var3 = dp4Var2;
                    yp1Var3 = yp1Var2;
                    er2Var = new er2(dp4Var3, y94Var, xv2Var, null, (byte) 1);
                    ir1Var.m6905n0(er2Var);
                } else {
                    dp4Var3 = dp4Var2;
                    yp1Var3 = yp1Var2;
                    er2Var = objM6869O15;
                    obj5 = obj9;
                }
                lb5.m7926g(ir1Var, (mq1) er2Var, dp4Var3);
                abstractC0003a2M12171e = w94Var.m12171e();
                iMo103a = abstractC0003a2M12171e.mo103a() - 1;
                if (iMo103a >= 0) {
                    while (true) {
                        i5 = iMo103a - 1;
                        xz2Var = (xz2) abstractC0003a2M12171e.get(iMo103a);
                        ir1Var.m6879a0(43486632, xz2Var);
                        if (z62.m13387o(hb0.m6301M0(arrayList6), xz2Var)) {
                            fk2Var = fk2.f19058e;
                        } else {
                            fk2Var = fk2.f19057d;
                        }
                        zh3VarMo7523a = rm2.f29413a.mo7523a(n40.m8516z(fk2Var, ir1Var));
                        kj0 kj0Var2 = zv3.f36414a;
                        C0874lj c0874lj3 = new C0874lj(xz2Var);
                        obj6 = xz2Var.f34736a;
                        zh3VarMo7523a2 = kj0Var2.mo7523a(eq2.m5273L(c0874lj3, map2));
                        zh3VarMo7523a3 = u44.f31652a.mo7523a(xz2Var);
                        map = map2;
                        kj0Var = sm2.f30395a;
                        abstractC0003a2 = abstractC0003a2M12171e;
                        obj7 = ql3Var.f28555a;
                        if (obj7 != null) {
                            z62.m13366Y("animatedContentScope");
                            throw null;
                        }
                        zh3[] zh3VarArr = {zh3VarMo7523a, zh3VarMo7523a2, zh3VarMo7523a3, kj0Var.mo7523a((C0456aj) obj7)};
                        C1017p0 c1017p0 = new C1017p0((byte) 25);
                        c1017p0.f27254b = xz2Var;
                        VarHandle.storeStoreFence();
                        as4.m3245d(zh3VarArr, vd6.m11834R(-1656080439, c1017p0, ir1Var), ir1Var, 56);
                        ir1Var.m6912r(false);
                        arrayList = new ArrayList(arrayList6.size());
                        size = arrayList6.size();
                        for (i6 = 0; i6 < size; i6++) {
                            arrayList.add(((xz2) arrayList6.get(i6)).f34736a);
                        }
                        arrayList2 = arrayList6;
                        if (arrayList.contains(obj6)) {
                            b = 10;
                            ir1Var.m6885d0(1349212134);
                            ir1Var.m6912r(false);
                        } else {
                            ir1Var.m6885d0(1349048764);
                            zM6890g3 = ir1Var.m6890g(xz2Var);
                            objM6869O2 = ir1Var.m6869O();
                            if (!zM6890g3 || objM6869O2 == obj5) {
                                b = 10;
                                objM6869O2 = new it1(xz2Var, w94Var, (wm0) null, b);
                                ir1Var.m6905n0(objM6869O2);
                            } else {
                                b = 10;
                            }
                            lb5.m7926g(ir1Var, (mq1) objM6869O2, obj6);
                            ir1Var.m6912r(false);
                        }
                        if (i5 < 0) {
                            break;
                        }
                        arrayList6 = arrayList2;
                        iMo103a = i5;
                        abstractC0003a2M12171e = abstractC0003a2;
                        map2 = map;
                    }
                }
            } else {
                yp1Var4 = yp1Var;
            }
            if ((i8 & 196608) == i4) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = zM6892h | z2;
            Object objM6869O16 = ir1Var.m6869O();
            obj2 = objM6869O16;
            if (z3) {
                fy2 fy2Var2 = new fy2();
                fy2Var2.f19415a = z5;
                fy2Var2.f19416b = wv3Var3;
                fy2Var2.f19417c = i16;
                fy2Var2.f19418d = mq1Var2;
                fy2Var2.f19419e = zBooleanValue;
                fy2Var2.f19420f = yp1Var2;
                fy2Var2.f19421g = yp1Var4;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(fy2Var2);
                obj2 = fy2Var2;
            } else {
                fy2 fy2Var3 = new fy2();
                fy2Var3.f19415a = z5;
                fy2Var3.f19416b = wv3Var3;
                fy2Var3.f19417c = i16;
                fy2Var3.f19418d = mq1Var2;
                fy2Var3.f19419e = zBooleanValue;
                fy2Var3.f19420f = yp1Var2;
                fy2Var3.f19421g = yp1Var4;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(fy2Var3);
                obj2 = fy2Var3;
            }
            obj3 = (yp1) obj2;
            ql3Var = new ql3();
            f3 = fM12764c;
            zM6890g = ir1Var.m6890g(obj3) | ir1Var.m6884d(f3) | ir1Var.m6894i(wm0Var);
            Object objM6869O17 = ir1Var.m6869O();
            obj4 = objM6869O17;
            if (zM6890g) {
                m10 m10Var2 = new m10((byte) 3);
                m10Var2.f24531c = obj3;
                m10Var2.f24530b = f3;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(m10Var2);
                obj4 = m10Var2;
            } else {
                m10 m10Var3 = new m10((byte) 3);
                m10Var3.f24531c = obj3;
                m10Var3.f24530b = f3;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(m10Var3);
                obj4 = m10Var3;
            }
            yp1 yp1Var6 = (yp1) obj4;
            objM6869O = ir1Var.m6869O();
            if (objM6869O == obj9) {
                objM6869O = new kr2((byte) 11);
                ir1Var.m6905n0(objM6869O);
            }
            gy2 gy2Var2 = new gy2((byte) 0);
            gy2Var2.f20188b = dp4Var;
            gy2Var2.f20189c = w94Var;
            gy2Var2.f20190d = ql3Var;
            gy2Var2.f20191e = map2;
            VarHandle.storeStoreFence();
            interfaceC0520ca2 = interfaceC0520ca;
            dp4Var2 = dp4Var;
            nt2Var2 = nt2Var;
            ev0.m5330E(dp4Var2, nt2Var2, yp1Var6, interfaceC0520ca2, (yp1) objM6869O, vd6.m11834R(-1167420988, gy2Var2, ir1Var), ir1Var, ((i8 >> 3) & 112) | 221184 | (i8 & 7168));
            zM6890g2 = ir1Var.m6890g(dp4Var2) | ir1Var.m6894i(xv2Var);
            Object objM6869O18 = ir1Var.m6869O();
            if (zM6890g2) {
                obj5 = obj9;
                dp4Var3 = dp4Var2;
                yp1Var3 = yp1Var2;
                er2Var = new er2(dp4Var3, y94Var, xv2Var, null, (byte) 1);
                ir1Var.m6905n0(er2Var);
            } else {
                obj5 = obj9;
                dp4Var3 = dp4Var2;
                yp1Var3 = yp1Var2;
                er2Var = new er2(dp4Var3, y94Var, xv2Var, null, (byte) 1);
                ir1Var.m6905n0(er2Var);
            }
            lb5.m7926g(ir1Var, (mq1) er2Var, dp4Var3);
            abstractC0003a2M12171e = w94Var.m12171e();
            iMo103a = abstractC0003a2M12171e.mo103a() - 1;
            if (iMo103a >= 0) {
                while (true) {
                    i5 = iMo103a - 1;
                    xz2Var = (xz2) abstractC0003a2M12171e.get(iMo103a);
                    ir1Var.m6879a0(43486632, xz2Var);
                    if (z62.m13387o(hb0.m6301M0(arrayList6), xz2Var)) {
                        fk2Var = fk2.f19058e;
                    } else {
                        fk2Var = fk2.f19057d;
                    }
                    zh3VarMo7523a = rm2.f29413a.mo7523a(n40.m8516z(fk2Var, ir1Var));
                    kj0 kj0Var3 = zv3.f36414a;
                    C0874lj c0874lj4 = new C0874lj(xz2Var);
                    obj6 = xz2Var.f34736a;
                    zh3VarMo7523a2 = kj0Var3.mo7523a(eq2.m5273L(c0874lj4, map2));
                    zh3VarMo7523a3 = u44.f31652a.mo7523a(xz2Var);
                    map = map2;
                    kj0Var = sm2.f30395a;
                    abstractC0003a2 = abstractC0003a2M12171e;
                    obj7 = ql3Var.f28555a;
                    if (obj7 != null) {
                        z62.m13366Y("animatedContentScope");
                        throw null;
                    }
                    zh3[] zh3VarArr2 = {zh3VarMo7523a, zh3VarMo7523a2, zh3VarMo7523a3, kj0Var.mo7523a((C0456aj) obj7)};
                    C1017p0 c1017p1 = new C1017p0((byte) 25);
                    c1017p1.f27254b = xz2Var;
                    VarHandle.storeStoreFence();
                    as4.m3245d(zh3VarArr2, vd6.m11834R(-1656080439, c1017p1, ir1Var), ir1Var, 56);
                    ir1Var.m6912r(false);
                    arrayList = new ArrayList(arrayList6.size());
                    size = arrayList6.size();
                    while (i6 < size) {
                        arrayList.add(((xz2) arrayList6.get(i6)).f34736a);
                    }
                    arrayList2 = arrayList6;
                    if (arrayList.contains(obj6)) {
                        ir1Var.m6885d0(1349048764);
                        zM6890g3 = ir1Var.m6890g(xz2Var);
                        objM6869O2 = ir1Var.m6869O();
                        if (zM6890g3) {
                            b = 10;
                            objM6869O2 = new it1(xz2Var, w94Var, (wm0) null, b);
                            ir1Var.m6905n0(objM6869O2);
                        } else {
                            b = 10;
                            objM6869O2 = new it1(xz2Var, w94Var, (wm0) null, b);
                            ir1Var.m6905n0(objM6869O2);
                        }
                        lb5.m7926g(ir1Var, (mq1) objM6869O2, obj6);
                        ir1Var.m6912r(false);
                    } else {
                        b = 10;
                        ir1Var.m6885d0(1349212134);
                        ir1Var.m6912r(false);
                    }
                    if (i5 < 0) {
                        break;
                        break;
                    }
                    arrayList6 = arrayList2;
                    iMo103a = i5;
                    abstractC0003a2M12171e = abstractC0003a2;
                    map2 = map;
                }
            }
        } else {
            yp1Var = yp1Var;
            yp1Var3 = yp1Var2;
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            hy2 hy2Var = new hy2();
            hy2Var.f20936a = aw3Var;
            hy2Var.f20937b = kz2Var;
            hy2Var.f20938c = nt2Var2;
            hy2Var.f20939d = interfaceC0520ca2;
            hy2Var.f20940e = yp1Var;
            hy2Var.f20941f = yp1Var3;
            hy2Var.f20942g = mq1Var2;
            hy2Var.f20943h = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = hy2Var;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static ArrayList m7699b0(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        C1374yn c1374yn = new C1374yn();
        c1374yn.f35341a = objArr;
        c1374yn.f35342b = true;
        VarHandle.storeStoreFence();
        return new ArrayList(c1374yn);
    }

    /* JADX INFO: renamed from: c */
    public static final void m7700c(ArrayList arrayList, nt2 nt2Var, InterfaceC0520ca interfaceC0520ca, List list, List list2, yp1 yp1Var, yp1 yp1Var2, mq1 mq1Var, wp1 wp1Var, mi0 mi0Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        mq1 mq1Var2;
        InterfaceC0520ca interfaceC0520ca2;
        yp1 yp1Var3;
        yp1 yp1Var4;
        nt2 nt2Var2;
        ir1 ir1Var;
        byte b;
        List list3;
        ir1 ir1Var2;
        Object obj;
        mq1 mq1Var3 = mq1Var;
        ir1 ir1Var3 = (ir1) mi0Var;
        ir1Var3.m6889f0(-1914095277);
        if ((i & 6) == 0) {
            i3 = (ir1Var3.m6894i(arrayList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ir1Var3.m6890g(nt2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ir1Var3.m6890g(interfaceC0520ca) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ir1Var3.m6894i(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ir1Var3.m6894i(list2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= ir1Var3.m6890g(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= ir1Var3.m6894i(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= ir1Var3.m6894i(yp1Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= ir1Var3.m6894i(yp1Var2) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= ir1Var3.m6894i(mq1Var3) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ir1Var3.m6894i(wp1Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (ir1Var3.m6871T(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            ir1Var3.m6876Y();
            if ((i & 1) != 0 && !ir1Var3.m6856B()) {
                ir1Var3.m6874W();
            }
            ir1Var3.m6913s();
            if (arrayList.isEmpty()) {
                C1077qn.m9987m("NavDisplay entries cannot be empty");
                return;
            }
            int i6 = i3 >> 6;
            int i7 = (i6 & 896) | (i3 & 14) | (i6 & 112) | (i6 & 7168) | ((i4 << 12) & 57344);
            k43.m7369C(wp1Var, ir1Var3);
            ir1Var3.m6885d0(-984503628);
            ir1Var3.m6912r(false);
            kj0 kj0Var = zv3.f36414a;
            Object objM6869O = ir1Var3.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                y94 y94VarM7397v = k43.m7397v();
                b71 b71Var = new b71((byte) 27);
                b71Var.f15141b = y94VarM7397v;
                VarHandle.storeStoreFence();
                C0928n c0928n = new C0928n((byte) 20);
                c0928n.f25353b = y94VarM7397v;
                VarHandle.storeStoreFence();
                b = 1;
                objM6869O = new yv3(b71Var, new pg0(-1714993007, true, c0928n));
                ir1Var3.m6905n0(objM6869O);
            } else {
                b = 1;
            }
            sw2 sw2VarM7369C = k43.m7369C(arrayList, ir1Var3);
            C1039pm c1039pm = new C1039pm(b);
            c1039pm.f27741b = sw2VarM7369C;
            VarHandle.storeStoreFence();
            char c = 3;
            ArrayList arrayListM7723n0 = m7723n0(arrayList, AbstractC0990oo.m9209d0(new oy2[]{null, (yv3) objM6869O, new oy2(new kr2((byte) 12), vd6.m11834R(1077673004, c1039pm, ir1Var3))}), ir1Var3, i7 & 14);
            boolean zM6890g = ir1Var3.m6890g(hb0.m6319e1(list)) | ir1Var3.m6890g(arrayListM7723n0);
            Object objM6869O2 = ir1Var3.m6869O();
            if (zM6890g || objM6869O2 == i50Var) {
                q50 q50Var = new q50((byte) 17);
                ArrayList arrayListM7699b0 = m7699b0(n40.m8513w(q50Var, arrayListM7723n0, list, list2));
                ir1 ir1Var4 = ir1Var3;
                while (true) {
                    Object objM6306R0 = hb0.m6306R0(arrayListM7699b0);
                    xz2 xz2Var = objM6306R0 instanceof xz2 ? (xz2) objM6306R0 : null;
                    List list4 = xz2Var != null ? xz2Var.f34738c : null;
                    if (list4 != null) {
                        if (list4.isEmpty()) {
                            xy4.m12783l("Overlaid entries from ", xz2Var, " must not be empty");
                            return;
                        }
                        arrayListM7699b0.add(n40.m8513w(q50Var, list4, list, list2));
                    }
                    if (list4 == null) {
                        List listM6296H0 = hb0.m6296H0(arrayListM7699b0);
                        ArrayList arrayList2 = new ArrayList(listM6296H0.size());
                        int size = listM6296H0.size();
                        int i8 = 0;
                        while (i8 < size) {
                            arrayList2.add((xz2) ((wv3) listM6296H0.get(i8)));
                            i8++;
                            c = c;
                        }
                        wv3 wv3Var = (wv3) hb0.m6306R0(arrayListM7699b0);
                        ArrayList arrayListM7699b1 = m7699b0(wv3Var);
                        do {
                            wv3 wv3Var2 = (wv3) hb0.m6301M0(arrayListM7699b1);
                            List listMo12427b = wv3Var2 != null ? wv3Var2.mo12427b() : null;
                            list3 = listMo12427b;
                            if (list3 != null && !list3.isEmpty()) {
                                arrayListM7699b1.add(0, n40.m8513w(q50Var, listMo12427b, list, list2));
                            }
                            if (list3 == null) {
                                break;
                            }
                        } while (!list3.isEmpty());
                        arrayListM7699b1.remove(wv3Var);
                        aw3 aw3Var = new aw3();
                        aw3Var.f14916a = arrayListM7723n0;
                        aw3Var.f14917b = arrayList2;
                        aw3Var.f14918c = wv3Var;
                        aw3Var.f14919d = arrayListM7699b1;
                        VarHandle.storeStoreFence();
                        ir1Var4.m6905n0(aw3Var);
                        obj = aw3Var;
                        ir1Var2 = ir1Var4;
                        break;
                    }
                    i6 = i6;
                    mq1Var3 = mq1Var3;
                    ir1Var4 = ir1Var4;
                    c = c;
                }
            } else {
                obj = objM6869O2;
                ir1Var2 = ir1Var3;
            }
            aw3 aw3Var2 = (aw3) obj;
            kz2 kz2VarM13662N = zp0.m13662N(aw3Var2, ir1Var2);
            int i9 = i6;
            ir1 ir1Var5 = ir1Var2;
            d24.m4303d(aw3Var2, kz2VarM13662N, null, wp1Var, ir1Var5, (i4 << 9) & 7168);
            i5 = i;
            m7698b(aw3Var2, kz2VarM13662N, nt2Var, interfaceC0520ca, yp1Var, yp1Var2, mq1Var3, ir1Var2, ((i3 << 3) & 8064) | (i9 & 57344) | (458752 & i9) | (3670016 & i9) | (29360128 & i9));
            nt2Var2 = nt2Var;
            interfaceC0520ca2 = interfaceC0520ca;
            yp1Var3 = yp1Var;
            yp1Var4 = yp1Var2;
            mq1Var2 = mq1Var;
            ir1Var = ir1Var5;
        } else {
            i5 = i;
            mq1Var2 = mq1Var3;
            ir1 ir1Var6 = ir1Var3;
            interfaceC0520ca2 = interfaceC0520ca;
            yp1Var3 = yp1Var;
            yp1Var4 = yp1Var2;
            nt2Var2 = nt2Var;
            ir1Var6.m6874W();
            ir1Var = ir1Var6;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ey2 ey2Var = new ey2();
            ey2Var.f18570a = arrayList;
            ey2Var.f18571b = nt2Var2;
            ey2Var.f18572c = interfaceC0520ca2;
            ey2Var.f18573d = list;
            ey2Var.f18574e = list2;
            ey2Var.f18575f = yp1Var3;
            ey2Var.f18576g = yp1Var4;
            ey2Var.f18577h = mq1Var2;
            ey2Var.f18578i = wp1Var;
            ey2Var.f18579j = i5;
            ey2Var.f18580k = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ey2Var;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static final String m7701c0(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return zi4.m13623w(sb, str != null ? zi4.m13621u(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    /* JADX INFO: renamed from: d */
    public static final void m7702d(List list, nt2 nt2Var, InterfaceC0520ca interfaceC0520ca, wp1 wp1Var, List list2, List list3, List list4, yp1 yp1Var, yp1 yp1Var2, mq1 mq1Var, yp1 yp1Var3, mi0 mi0Var, int i) {
        InterfaceC0520ca interfaceC0520ca2;
        List list5;
        InterfaceC0520ca interfaceC0520ca3;
        List list6;
        ArrayList arrayList;
        Object obj;
        nt2 nt2Var2 = nt2Var;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1398581072);
        int i2 = i | (ir1Var.m6894i(list) ? 4 : 2) | (ir1Var.m6890g(nt2Var2) ? 32 : 16) | 384 | (ir1Var.m6894i(wp1Var) ? 2048 : 1024) | (ir1Var.m6894i(list2) ? 16384 : 8192) | (ir1Var.m6894i(list3) ? 131072 : 65536) | 114819072 | (ir1Var.m6894i(yp1Var) ? 536870912 : 268435456);
        int i3 = (ir1Var.m6894i(yp1Var2) ? 4 : 2) | 384 | (ir1Var.m6894i(mq1Var) ? 32 : 16);
        if (ir1Var.m6871T(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 147) == 146) ? false : true)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                interfaceC0520ca3 = ig1.f21378b;
                list6 = v71.f32439a;
            } else {
                ir1Var.m6874W();
                interfaceC0520ca3 = interfaceC0520ca;
                list6 = list4;
            }
            ir1Var.m6913s();
            if (list.isEmpty()) {
                C1077qn.m9987m("NavDisplay backstack cannot be empty");
                return;
            }
            int i4 = i2 >> 9;
            int i5 = 384 | (i2 & 14) | (i4 & 112);
            List list7 = list;
            boolean zM6890g = ir1Var.m6890g(hb0.m6319e1(list7));
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                if (list instanceof RandomAccess) {
                    arrayList = new ArrayList(list.size());
                    int i6 = 0;
                    for (int size = list.size(); i6 < size; size = size) {
                        arrayList.add((ny2) yp1Var3.invoke(list.get(i6)));
                        i6++;
                    }
                } else {
                    arrayList = new ArrayList(ib0.m6717y0(list7, 10));
                    Iterator it = list7.iterator();
                    while (it.hasNext()) {
                        arrayList.add((ny2) yp1Var3.invoke(it.next()));
                    }
                }
                ir1Var.m6905n0(arrayList);
                obj = arrayList;
            }
            obj = objM6869O;
            ArrayList arrayListM7723n0 = m7723n0((List) obj, list2, ir1Var, i5 & 112);
            int i7 = i2 & 1008;
            int i8 = i2 >> 6;
            int i9 = (i8 & 29360128) | i7 | (i8 & 7168) | 1794048;
            int i10 = i3 << 24;
            interfaceC0520ca2 = interfaceC0520ca3;
            list5 = list6;
            nt2Var2 = nt2Var;
            m7700c(arrayListM7723n0, nt2Var2, interfaceC0520ca2, list3, list5, yp1Var, yp1Var2, mq1Var, wp1Var, ir1Var, i9 | (234881024 & i10) | (i10 & 1879048192), i4 & 14);
        } else {
            ir1Var.m6874W();
            interfaceC0520ca2 = interfaceC0520ca;
            list5 = list4;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            dy2 dy2Var = new dy2();
            dy2Var.f17492a = list;
            dy2Var.f17493b = nt2Var2;
            dy2Var.f17494c = interfaceC0520ca2;
            dy2Var.f17495d = wp1Var;
            dy2Var.f17496e = list2;
            dy2Var.f17497f = list3;
            dy2Var.f17498g = list5;
            dy2Var.f17499h = yp1Var;
            dy2Var.f17500i = yp1Var2;
            dy2Var.f17501j = mq1Var;
            dy2Var.f17502k = yp1Var3;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = dy2Var;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static final List m7703d0(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : Collections.singletonList(list.get(0));
        }
        return v71.f32439a;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:131:0x0204  */
    /* JADX WARN: Code duplicated, block: B:132:0x0206  */
    /* JADX WARN: Code duplicated, block: B:134:0x021d  */
    /* JADX WARN: Code duplicated, block: B:136:0x0234  */
    /* JADX WARN: Code duplicated, block: B:138:0x0238 A[LOOP:1: B:137:0x0236->B:138:0x0238, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x025f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0263  */
    /* JADX WARN: Code duplicated, block: B:144:0x027b  */
    /* JADX WARN: Code duplicated, block: B:146:0x028f  */
    /* JADX WARN: Code duplicated, block: B:147:0x0291  */
    /* JADX WARN: Code duplicated, block: B:153:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:156:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:157:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:161:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:99:0x0147  */
    /* JADX WARN: Instruction removed from duplicated block: B:136:0x0234, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:142:0x0263, please report this as an issue */
    /* JADX INFO: renamed from: e */
    public static final C1328xe m7704e(p73 p73Var, long j, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        hl4 hl4VarM12673a;
        int i9;
        C1328xe c1328xe;
        int i10;
        Layout layout;
        Spanned spanned;
        l44[] l44VarArr;
        CharSequence charSequence;
        Spanned spanned2;
        ArrayList arrayList;
        int i11;
        List list;
        int spanEnd;
        int iM6434g;
        boolean z;
        boolean z2;
        boolean z3;
        jl3 jl3Var;
        float fM6438k;
        int iM5954c;
        float fM6437j;
        int iM5954c2;
        int i12;
        int i13;
        C0452af c0452af = (C0452af) p73Var;
        CharSequence charSequence2 = c0452af.f14423g;
        C1328xe c1328xe2 = new C1328xe();
        c1328xe2.f34183a = c0452af;
        c1328xe2.f34184b = j;
        if (kl0.m7540j(j) != 0 || kl0.m7541k(j) != 0) {
            r32.m10186a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            r32.m10186a("maxLines should be greater than 0");
        }
        xl4 xl4Var = c0452af.f14418b;
        if (i2 == 2) {
            i3 = 0;
            if (!bm4.m3632b(xl4Var.f34389a.f27485h, vd6.m11817A(0)) && !bm4.m3632b(xl4Var.f34389a.f27485h, bm4.f15419c) && (i13 = xl4Var.f34390b.f29064a) != 0 && i13 != 5 && i13 != 4 && charSequence2.length() != 0) {
                Spannable spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                if (spannableString == null) {
                    spannableString = new SpannableString(charSequence2);
                }
                if (!C0638f5.m5554y(spannableString, e22.class)) {
                    spannableString.setSpan(new e22(), spannableString.length() - 1, spannableString.length() - 1, 33);
                }
                charSequence2 = spannableString;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        c1328xe2.f34186d = charSequence3;
        r73 r73Var = xl4Var.f34390b;
        pa4 pa4Var = xl4Var.f34389a;
        int i14 = r73Var.f29064a;
        if (i14 == 1) {
            i4 = 3;
        } else if (i14 == 2) {
            i4 = 4;
        } else if (i14 == 3) {
            i4 = 2;
        } else {
            i4 = (i14 != 5 && i14 == 6) ? 1 : i3;
        }
        int i15 = i14 == 4 ? 1 : i3;
        int i16 = r73Var.f29071h == 2 ? 4 : i3;
        int i17 = r73Var.f29070g;
        int i18 = i17 & 255;
        if (i18 == 1) {
            i5 = i3;
        } else if (i18 == 2) {
            i5 = 1;
        } else if (i18 == 3) {
            i5 = 2;
        } else {
            i5 = i3;
        }
        int i19 = (i17 >> 8) & 255;
        if (i19 == 1) {
            i6 = i3;
        } else if (i19 == 2) {
            i6 = 1;
        } else if (i19 == 3) {
            i6 = 2;
        } else if (i19 == 4) {
            i6 = 3;
        } else {
            i6 = i3;
        }
        int i20 = (i17 >> 16) & 255;
        if (i20 == 1) {
            i8 = i3;
            i7 = 2;
        } else {
            i7 = 2;
            i8 = i20 == 2 ? 1 : i3;
        }
        if (i2 != i7) {
            if (i2 == 5) {
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            } else {
                truncateAt = i2 == 4 ? TextUtils.TruncateAt.START : null;
            }
            hl4VarM12673a = c1328xe2.m12673a(i4, i15, truncateAt, i, i16, i5, i6, i8, charSequence3);
            Layout layout2 = hl4VarM12673a.f20679f;
            if (Build.VERSION.SDK_INT < 35 || c0452af.f14422f.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                i9 = i;
                c1328xe = c1328xe2;
                i10 = 2;
            } else {
                int ellipsisStart = layout2.getEllipsisStart(0);
                int ellipsisCount = layout2.getEllipsisCount(0) + ellipsisStart;
                i10 = 2;
                c1328xe = c1328xe2;
                hl4VarM12673a = c1328xe.m12673a(i4, i15, truncateAt, i, i16, i5, i6, i8, TextUtils.concat(charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(ellipsisCount, charSequence3.length())));
                i9 = i;
            }
            int i21 = hl4VarM12673a.f20680g;
            if (i2 == i10 || hl4VarM12673a.m6428a() <= kl0.m7538h(j) || i9 <= 1) {
                c1328xe.f34185c = hl4VarM12673a;
            } else {
                int iM7538h = kl0.m7538h(j);
                for (int i22 = 0; i22 < i21; i22++) {
                    if (hl4VarM12673a.m6432e(i22) > iM7538h) {
                        i21 = i22;
                        break;
                    }
                }
                if (i21 >= 0 && i21 != i9) {
                    if (i21 < 1) {
                        i21 = 1;
                    }
                    hl4VarM12673a = c1328xe.m12673a(i4, i15, truncateAt, i21, i16, i5, i6, i8, c1328xe.f34186d);
                }
                c1328xe.f34185c = hl4VarM12673a;
            }
            c1328xe.f34187e = hl4VarM12673a.m6428a();
            c1328xe.f34183a.f14422f.m7110c(pa4Var.f27478a.mo5690f(), (((long) Float.floatToRawIntBits(c1328xe.f34187e)) & 4294967295L) | (((long) Float.floatToRawIntBits(c1328xe.m12675c())) << 32), pa4Var.f27478a.mo5691h());
            layout = hl4VarM12673a.f20679f;
            if (layout.getText() instanceof Spanned) {
                spanned = (Spanned) layout.getText();
                if (spanned.nextSpanTransition(-1, spanned.length(), l44.class) != spanned.length()) {
                    l44VarArr = (l44[]) ((Spanned) layout.getText()).getSpans(0, layout.getText().length(), l44.class);
                } else {
                    l44VarArr = null;
                }
            } else {
                l44VarArr = null;
            }
            if (l44VarArr != null) {
                for (l44 l44Var : l44VarArr) {
                    l44Var.f23785c.setValue(h74.m6269a((((long) Float.floatToRawIntBits(c1328xe.f34187e)) & 4294967295L) | (((long) Float.floatToRawIntBits(c1328xe.m12675c())) << 32)));
                }
            }
            charSequence = c1328xe.f34186d;
            if (charSequence instanceof Spanned) {
                spanned2 = (Spanned) charSequence;
                Object[] spans = spanned2.getSpans(0, charSequence.length(), gb3.class);
                arrayList = new ArrayList(spans.length);
                for (Object obj : spans) {
                    gb3 gb3Var = (gb3) obj;
                    int spanStart = spanned2.getSpanStart(gb3Var);
                    spanEnd = spanned2.getSpanEnd(gb3Var);
                    iM6434g = c1328xe.f34185c.m6434g(spanStart);
                    if (iM6434g >= i9) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (c1328xe.f34185c.f20679f.getEllipsisCount(iM6434g) > 0 || spanEnd <= c1328xe.f34185c.f20679f.getEllipsisStart(iM6434g) + c1328xe.f34185c.f20679f.getLineStart(iM6434g)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (spanEnd > c1328xe.f34185c.m6433f(iM6434g)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 && !z3 && !z) {
                        boolean z4 = c1328xe.f34185c.f20679f.getParagraphDirection(iM6434g) == 1;
                        boolean zIsRtlCharAt = c1328xe.f34185c.f20679f.isRtlCharAt(spanStart);
                        if (!z4 || zIsRtlCharAt) {
                            if (z4 && zIsRtlCharAt) {
                                fM6437j = c1328xe.f34185c.m6438k(spanStart, false);
                                iM5954c2 = gb3Var.m5954c();
                            } else {
                                hl4 hl4Var = c1328xe.f34185c;
                                if (zIsRtlCharAt) {
                                    fM6437j = hl4Var.m6437j(spanStart, false);
                                    iM5954c2 = gb3Var.m5954c();
                                } else {
                                    fM6438k = hl4Var.m6438k(spanStart, false);
                                    iM5954c = gb3Var.m5954c();
                                }
                            }
                            fM6438k = fM6437j - iM5954c2;
                            hl4 hl4Var2 = c1328xe.f34185c;
                            gb3Var.getClass();
                            float fM6431d = hl4Var2.m6431d(iM6434g) - gb3Var.m5953b();
                            jl3Var = new jl3(fM6438k, fM6431d, fM6437j, gb3Var.m5953b() + fM6431d);
                        } else {
                            fM6438k = c1328xe.f34185c.m6437j(spanStart, false);
                            iM5954c = gb3Var.m5954c();
                        }
                        fM6437j = iM5954c + fM6438k;
                        hl4 hl4Var3 = c1328xe.f34185c;
                        gb3Var.getClass();
                        float fM6431d2 = hl4Var3.m6431d(iM6434g) - gb3Var.m5953b();
                        jl3Var = new jl3(fM6438k, fM6431d2, fM6437j, gb3Var.m5953b() + fM6431d2);
                    }
                    arrayList.add(jl3Var);
                }
                list = arrayList;
            } else {
                list = v71.f32439a;
            }
            c1328xe.f34188f = list;
            VarHandle.storeStoreFence();
            return c1328xe;
        }
        truncateAt2 = TextUtils.TruncateAt.END;
        truncateAt = truncateAt2;
        hl4VarM12673a = c1328xe2.m12673a(i4, i15, truncateAt, i, i16, i5, i6, i8, charSequence3);
        Layout layout3 = hl4VarM12673a.f20679f;
        if (Build.VERSION.SDK_INT < 35) {
            i9 = i;
            c1328xe = c1328xe2;
            i10 = 2;
        } else {
            i9 = i;
            c1328xe = c1328xe2;
            i10 = 2;
        }
        int i23 = hl4VarM12673a.f20680g;
        if (i2 == i10) {
            c1328xe.f34185c = hl4VarM12673a;
        } else {
            c1328xe.f34185c = hl4VarM12673a;
        }
        c1328xe.f34187e = hl4VarM12673a.m6428a();
        c1328xe.f34183a.f14422f.m7110c(pa4Var.f27478a.mo5690f(), (((long) Float.floatToRawIntBits(c1328xe.f34187e)) & 4294967295L) | (((long) Float.floatToRawIntBits(c1328xe.m12675c())) << 32), pa4Var.f27478a.mo5691h());
        layout = hl4VarM12673a.f20679f;
        if (layout.getText() instanceof Spanned) {
            l44VarArr = null;
        } else {
            spanned = (Spanned) layout.getText();
            if (spanned.nextSpanTransition(-1, spanned.length(), l44.class) != spanned.length()) {
                l44VarArr = (l44[]) ((Spanned) layout.getText()).getSpans(0, layout.getText().length(), l44.class);
            } else {
                l44VarArr = null;
            }
        }
        if (l44VarArr != null) {
            while (i12 < r2) {
                l44Var.f23785c.setValue(h74.m6269a((((long) Float.floatToRawIntBits(c1328xe.f34187e)) & 4294967295L) | (((long) Float.floatToRawIntBits(c1328xe.m12675c())) << 32)));
            }
        }
        charSequence = c1328xe.f34186d;
        if (charSequence instanceof Spanned) {
            list = v71.f32439a;
        } else {
            spanned2 = (Spanned) charSequence;
            Object[] spans2 = spanned2.getSpans(0, charSequence.length(), gb3.class);
            arrayList = new ArrayList(spans2.length);
            while (i11 < r4) {
                gb3 gb3Var2 = (gb3) obj;
                int spanStart2 = spanned2.getSpanStart(gb3Var2);
                spanEnd = spanned2.getSpanEnd(gb3Var2);
                iM6434g = c1328xe.f34185c.m6434g(spanStart2);
                if (iM6434g >= i9) {
                    z = true;
                } else {
                    z = false;
                }
                if (c1328xe.f34185c.f20679f.getEllipsisCount(iM6434g) > 0) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (spanEnd > c1328xe.f34185c.m6433f(iM6434g)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                jl3Var = z2 ? null : null;
                arrayList.add(jl3Var);
            }
            list = arrayList;
        }
        c1328xe.f34188f = list;
        VarHandle.storeStoreFence();
        return c1328xe;
    }

    /* JADX INFO: renamed from: e0 */
    public static final gs0 m7705e0(sl1 sl1Var, int i) {
        int iOrdinal = sl1Var.m10858T0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                sl1 sl1VarM13847K = zy5.m13847K(sl1Var);
                if (sl1VarM13847K == null) {
                    C1077qn.m9987m("ActiveParent with no focused child");
                    return null;
                }
                gs0 gs0VarM7705e0 = m7705e0(sl1VarM13847K, i);
                gs0 gs0Var = gs0.f20085a;
                gs0 gs0Var2 = gs0VarM7705e0 != gs0Var ? gs0VarM7705e0 : null;
                if (gs0Var2 != null) {
                    return gs0Var2;
                }
                if (sl1Var.f30368q) {
                    return gs0Var;
                }
                sl1Var.f30368q = true;
                try {
                    fl1 fl1VarM10855Q0 = sl1Var.m10855Q0();
                    y60 y60Var = new y60(i);
                    bl1 bl1Var = (bl1) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(sl1Var)).getFocusOwner();
                    sl1 sl1VarM3620f = bl1Var.m3620f();
                    fl1VarM10855Q0.f19077k.invoke(y60Var);
                    sl1 sl1VarM3620f2 = bl1Var.m3620f();
                    if (y60Var.f34920b) {
                        jl1 jl1Var = jl1.f22391b;
                        return gs0.f20086b;
                    }
                    if (sl1VarM3620f == sl1VarM3620f2 || sl1VarM3620f2 == null) {
                        return gs0Var;
                    }
                    return jl1.f22393d == jl1.f22392c ? gs0.f20086b : gs0.f20087c;
                } finally {
                    sl1Var.f30368q = false;
                }
            }
            if (iOrdinal == 2) {
                return gs0.f20086b;
            }
            if (iOrdinal != 3) {
                C0670g.m5864c();
                return null;
            }
        }
        return gs0.f20085a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [ir1, mi0] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, le] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX INFO: renamed from: f */
    public static final void m7706f(ArrayList arrayList, List list, Set set, Set set2, mi0 mi0Var, int i) {
        ?? r13 = (ir1) mi0Var;
        r13.m6889f0(-720826424);
        byte b = 4;
        int i2 = (i & 6) == 0 ? (r13.m6894i(arrayList) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= r13.m6894i(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= r13.m6894i(set) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= r13.m6894i(set2) ? 2048 : 1024;
        }
        if (r13.m6871T(i2 & 1, (i2 & 1171) != 1170)) {
            sw2 sw2VarM7369C = k43.m7369C(arrayList, r13);
            sw2 sw2VarM7369C2 = k43.m7369C(list, r13);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = ((ny2) arrayList.get(i3)).f26195b;
                set.add(obj);
                List listM6319e1 = hb0.m6319e1(arrayList);
                boolean zM6890g = r13.m6890g(sw2VarM7369C) | r13.m6894i(obj) | r13.m6894i(set) | r13.m6894i(set2) | r13.m6890g(sw2VarM7369C2);
                ?? M6869O = r13.m6869O();
                if (zM6890g || M6869O == ki0.f23136a) {
                    M6869O = new C0869le((byte) 3);
                    M6869O.f23968b = obj;
                    M6869O.f23969c = set;
                    M6869O.f23970d = set2;
                    M6869O.f23971e = sw2VarM7369C;
                    M6869O.f23972f = sw2VarM7369C2;
                    VarHandle.storeStoreFence();
                    r13.m6905n0(M6869O);
                }
                lb5.m7924e(obj, listM6319e1, (yp1) M6869O, r13);
            }
        } else {
            r13.m6874W();
        }
        yk3 yk3VarM6916v = r13.m6916v();
        if (yk3VarM6916v != null) {
            C0877lm c0877lm = new C0877lm(b);
            c0877lm.f24144c = arrayList;
            c0877lm.f24145d = list;
            c0877lm.f24146e = set;
            c0877lm.f24147f = set2;
            c0877lm.f24143b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0877lm;
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static final gs0 m7707f0(sl1 sl1Var, int i) {
        if (!sl1Var.f30369r) {
            sl1Var.f30369r = true;
            try {
                fl1 fl1VarM10855Q0 = sl1Var.m10855Q0();
                y60 y60Var = new y60(i);
                bl1 bl1Var = (bl1) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(sl1Var)).getFocusOwner();
                sl1 sl1VarM3620f = bl1Var.m3620f();
                fl1VarM10855Q0.f19076j.invoke(y60Var);
                sl1 sl1VarM3620f2 = bl1Var.m3620f();
                if (y60Var.f34920b) {
                    jl1 jl1Var = jl1.f22391b;
                    return gs0.f20086b;
                }
                if (sl1VarM3620f != sl1VarM3620f2 && sl1VarM3620f2 != null) {
                    return jl1.f22393d == jl1.f22392c ? gs0.f20086b : gs0.f20087c;
                }
            } finally {
                sl1Var.f30369r = false;
            }
        }
        return gs0.f20085a;
    }

    /* JADX INFO: renamed from: g */
    public static final w42 m7708g() {
        w42 w42Var = new w42((byte) 11, false);
        w42Var.f33090b = new Region();
        VarHandle.storeStoreFence();
        return w42Var;
    }

    /* JADX INFO: renamed from: g0 */
    public static final gs0 m7709g0(sl1 sl1Var, int i) {
        mt2 mt2VarM10644P;
        C0940nb c0940nb;
        int iOrdinal = sl1Var.m10858T0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                sl1 sl1VarM13847K = zy5.m13847K(sl1Var);
                if (sl1VarM13847K != null) {
                    return m7705e0(sl1VarM13847K, i);
                }
                C1077qn.m9987m("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C0670g.m5864c();
                    return null;
                }
                if (!sl1Var.f25195a.f25208n) {
                    q32.m9721c("visitAncestors called on an unattached node");
                }
                mt2 mt2Var = sl1Var.f25195a.f25199e;
                wf2 wf2VarM10652X = sc6.m10652X(sl1Var);
                loop0: while (true) {
                    if (wf2VarM10652X == null) {
                        mt2VarM10644P = null;
                        break;
                    }
                    if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 1024) != 0) {
                        while (mt2Var != null) {
                            if ((mt2Var.f25197c & 1024) != 0) {
                                mt2VarM10644P = mt2Var;
                                uw2 uw2Var = null;
                                while (mt2VarM10644P != null) {
                                    if (mt2VarM10644P instanceof sl1) {
                                        break loop0;
                                    }
                                    if ((mt2VarM10644P.f25197c & 1024) != 0 && (mt2VarM10644P instanceof qx0)) {
                                        int i2 = 0;
                                        for (mt2 mt2Var2 = ((qx0) mt2VarM10644P).f28863p; mt2Var2 != null; mt2Var2 = mt2Var2.f25200f) {
                                            if ((mt2Var2.f25197c & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    mt2VarM10644P = mt2Var2;
                                                } else {
                                                    if (uw2Var == null) {
                                                        uw2Var = new uw2(new mt2[16]);
                                                    }
                                                    if (mt2VarM10644P != null) {
                                                        uw2Var.m11663b(mt2VarM10644P);
                                                        mt2VarM10644P = null;
                                                    }
                                                    uw2Var.m11663b(mt2Var2);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    mt2VarM10644P = sc6.m10644P(uw2Var);
                                }
                            }
                            mt2Var = mt2Var.f25199e;
                        }
                    }
                    wf2VarM10652X = wf2VarM10652X.m12295v();
                    mt2Var = (wf2VarM10652X == null || (c0940nb = wf2VarM10652X.f33299G) == null) ? null : (vh4) c0940nb.f25609f;
                }
                sl1 sl1Var2 = (sl1) mt2VarM10644P;
                if (sl1Var2 == null) {
                    return gs0.f20085a;
                }
                int iOrdinal2 = sl1Var2.m10858T0().ordinal();
                if (iOrdinal2 == 0) {
                    return m7707f0(sl1Var2, i);
                }
                if (iOrdinal2 == 1) {
                    return m7709g0(sl1Var2, i);
                }
                if (iOrdinal2 == 2) {
                    return gs0.f20086b;
                }
                if (iOrdinal2 != 3) {
                    C0670g.m5864c();
                    return null;
                }
                gs0 gs0VarM7709g0 = m7709g0(sl1Var2, i);
                gs0 gs0Var = gs0VarM7709g0 != gs0.f20085a ? gs0VarM7709g0 : null;
                return gs0Var == null ? m7707f0(sl1Var2, i) : gs0Var;
            }
        }
        return gs0.f20085a;
    }

    /* JADX INFO: renamed from: h */
    public static int m7710h(int i, int i2) {
        int iM7732s = m7732s(i);
        int iM7732s2 = m7732s(i2);
        if (iM7732s == 1) {
            if (iM7732s2 == 1) {
                return 0;
            }
            if (iM7732s2 == 2) {
                return -1;
            }
            C1077qn.m9987m(zp0.m13676h(iM7732s2, "Unknown digestAlgorithm2: "));
            return 0;
        }
        if (iM7732s != 2) {
            C1077qn.m9987m(zp0.m13676h(iM7732s, "Unknown digestAlgorithm1: "));
            return 0;
        }
        if (iM7732s2 == 1) {
            return 1;
        }
        if (iM7732s2 == 2) {
            return 0;
        }
        C1077qn.m9987m(zp0.m13676h(iM7732s2, "Unknown digestAlgorithm2: "));
        return 0;
    }

    /* JADX INFO: renamed from: h0 */
    public static final boolean m7711h0(sl1 sl1Var) {
        uw2 uw2Var;
        C0940nb c0940nb;
        boolean z;
        C0940nb c0940nb2;
        bl1 bl1Var = (bl1) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(sl1Var)).getFocusOwner();
        sl1 sl1VarM3620f = bl1Var.m3620f();
        nl1 nl1VarM10858T0 = sl1Var.m10858T0();
        if (sl1VarM3620f == sl1Var) {
            sl1Var.m10854P0(nl1VarM10858T0, nl1VarM10858T0);
            return true;
        }
        if ((sl1VarM3620f == null || sl1VarM3620f.f30366o) && !sl1Var.f30366o && !((bl1) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(sl1Var)).getFocusOwner()).f15394a.m10599D()) {
            return false;
        }
        if (sl1VarM3620f != null) {
            uw2Var = new uw2(new sl1[16]);
            if (!sl1VarM3620f.f25195a.f25208n) {
                q32.m9721c("visitAncestors called on an unattached node");
            }
            mt2 mt2Var = sl1VarM3620f.f25195a.f25199e;
            wf2 wf2VarM10652X = sc6.m10652X(sl1VarM3620f);
            while (wf2VarM10652X != null) {
                if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 1024) != 0) {
                    while (mt2Var != null) {
                        if ((mt2Var.f25197c & 1024) != 0) {
                            mt2 mt2VarM10644P = mt2Var;
                            uw2 uw2Var2 = null;
                            while (mt2VarM10644P != null) {
                                if (mt2VarM10644P instanceof sl1) {
                                    uw2Var.m11663b((sl1) mt2VarM10644P);
                                } else if ((mt2VarM10644P.f25197c & 1024) != 0 && (mt2VarM10644P instanceof qx0)) {
                                    int i = 0;
                                    for (mt2 mt2Var2 = ((qx0) mt2VarM10644P).f28863p; mt2Var2 != null; mt2Var2 = mt2Var2.f25200f) {
                                        if ((mt2Var2.f25197c & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                mt2VarM10644P = mt2Var2;
                                            } else {
                                                if (uw2Var2 == null) {
                                                    uw2Var2 = new uw2(new mt2[16]);
                                                }
                                                if (mt2VarM10644P != null) {
                                                    uw2Var2.m11663b(mt2VarM10644P);
                                                    mt2VarM10644P = null;
                                                }
                                                uw2Var2.m11663b(mt2Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                mt2VarM10644P = sc6.m10644P(uw2Var2);
                            }
                        }
                        mt2Var = mt2Var.f25199e;
                    }
                }
                wf2VarM10652X = wf2VarM10652X.m12295v();
                mt2Var = (wf2VarM10652X == null || (c0940nb2 = wf2VarM10652X.f33299G) == null) ? null : (vh4) c0940nb2.f25609f;
            }
        } else {
            uw2Var = null;
        }
        Object[] objArr = new sl1[16];
        Object[] objArr2 = new sl1[16];
        if (!sl1Var.f25195a.f25208n) {
            q32.m9721c("visitAncestors called on an unattached node");
        }
        mt2 mt2Var3 = sl1Var.f25195a.f25199e;
        wf2 wf2VarM10652X2 = sc6.m10652X(sl1Var);
        boolean z2 = true;
        int i2 = 0;
        int i3 = 0;
        while (wf2VarM10652X2 != null) {
            if ((((mt2) wf2VarM10652X2.f33299G.f25610g).f25198d & 1024) != 0) {
                while (mt2Var3 != null) {
                    if ((mt2Var3.f25197c & 1024) != 0) {
                        mt2 mt2VarM10644P2 = mt2Var3;
                        uw2 uw2Var3 = null;
                        while (mt2VarM10644P2 != null) {
                            if (mt2VarM10644P2 instanceof sl1) {
                                sl1 sl1Var2 = (sl1) mt2VarM10644P2;
                                if (z62.m13387o(uw2Var != null ? Boolean.valueOf(uw2Var.m11671k(sl1Var2)) : null, Boolean.TRUE)) {
                                    int i4 = i2 + 1;
                                    if (objArr.length < i4) {
                                        int length = objArr.length;
                                        Object[] objArr3 = new Object[Math.max(i4, length * 2)];
                                        System.arraycopy(objArr, 0, objArr3, 0, length);
                                        objArr = objArr3;
                                    }
                                    objArr[i2] = sl1Var2;
                                    i2 = i4;
                                } else {
                                    bl1Var = bl1Var;
                                    int i5 = i3 + 1;
                                    if (objArr2.length < i5) {
                                        int length2 = objArr2.length;
                                        Object[] objArr4 = new Object[Math.max(i5, length2 * 2)];
                                        System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                        objArr2 = objArr4;
                                    }
                                    objArr2[i3] = sl1Var2;
                                    i3 = i5;
                                }
                                if (sl1Var2 == sl1VarM3620f) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                bl1Var = bl1Var;
                                z = true;
                            }
                            if (z && (mt2VarM10644P2.f25197c & 1024) != 0 && (mt2VarM10644P2 instanceof qx0)) {
                                int i6 = 0;
                                for (mt2 mt2Var4 = ((qx0) mt2VarM10644P2).f28863p; mt2Var4 != null; mt2Var4 = mt2Var4.f25200f) {
                                    if ((mt2Var4.f25197c & 1024) != 0) {
                                        int i7 = i6 + 1;
                                        if (i7 == 1) {
                                            mt2VarM10644P2 = mt2Var4;
                                            i7 = i7;
                                        } else {
                                            uw2 uw2Var4 = uw2Var3 == null ? new uw2(new mt2[16]) : uw2Var3;
                                            if (mt2VarM10644P2 != null) {
                                                uw2Var4.m11663b(mt2VarM10644P2);
                                                mt2VarM10644P2 = null;
                                            }
                                            uw2Var4.m11663b(mt2Var4);
                                            uw2Var3 = uw2Var4;
                                        }
                                        i6 = i7;
                                    }
                                }
                                if (i6 != 1) {
                                    mt2VarM10644P2 = sc6.m10644P(uw2Var3);
                                }
                            } else {
                                mt2VarM10644P2 = sc6.m10644P(uw2Var3);
                            }
                        }
                    }
                    mt2Var3 = mt2Var3.f25199e;
                    bl1Var = bl1Var;
                }
            }
            bl1 bl1Var2 = bl1Var;
            wf2VarM10652X2 = wf2VarM10652X2.m12295v();
            mt2Var3 = (wf2VarM10652X2 == null || (c0940nb = wf2VarM10652X2.f33299G) == null) ? null : (vh4) c0940nb.f25609f;
            bl1Var = bl1Var2;
        }
        bl1 bl1Var3 = bl1Var;
        if (z2 && sl1VarM3620f != null && !m7713i0(sl1VarM3620f, false)) {
            return false;
        }
        C1053q c1053q = new C1053q((byte) 27);
        c1053q.f28113b = sl1Var;
        VarHandle.storeStoreFence();
        c20.m3797B(sl1Var, c1053q);
        int iOrdinal = sl1Var.m10858T0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ((bl1) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(sl1Var)).getFocusOwner()).m3623i(sl1Var);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C0670g.m5864c();
                    return false;
                }
                ((bl1) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(sl1Var)).getFocusOwner()).m3623i(sl1Var);
            }
        }
        if (z2 && sl1VarM3620f != null) {
            sl1VarM3620f.m10854P0(nl1.f25927a, nl1.f25929c);
        }
        if (uw2Var != null) {
            int i8 = uw2Var.f32213c - 1;
            Object[] objArr5 = uw2Var.f32211a;
            if (i8 < objArr5.length) {
                while (i8 >= 0) {
                    sl1 sl1Var3 = (sl1) objArr5[i8];
                    if (bl1Var3.m3620f() != sl1Var) {
                        return false;
                    }
                    sl1Var3.m10854P0(nl1.f25928b, nl1.f25929c);
                    i8--;
                }
            }
        }
        int i9 = i3 - 1;
        if (i9 < objArr2.length) {
            while (i9 >= 0) {
                sl1 sl1Var4 = (sl1) objArr2[i9];
                if (bl1Var3.m3620f() != sl1Var) {
                    return false;
                }
                sl1Var4.m10854P0(sl1Var4 == sl1VarM3620f ? nl1.f25927a : nl1.f25929c, nl1.f25928b);
                i9--;
            }
        }
        if (bl1Var3.m3620f() != sl1Var) {
            return false;
        }
        sl1Var.m10854P0(nl1VarM10858T0, nl1.f25927a);
        return bl1Var3.m3620f() == sl1Var;
    }

    /* JADX INFO: renamed from: i */
    public static int m7712i(int i, String str) {
        return zi4.m13613m(i, str, 31);
    }

    /* JADX INFO: renamed from: i0 */
    public static final boolean m7713i0(sl1 sl1Var, boolean z) {
        int iOrdinal = sl1Var.m10858T0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                sl1 sl1VarM13847K = zy5.m13847K(sl1Var);
                if (!(sl1VarM13847K != null ? m7713i0(sl1VarM13847K, z) : true)) {
                    return false;
                }
                sl1Var.m10854P0(nl1.f25928b, nl1.f25929c);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                C0670g.m5864c();
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static String m7714j(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        C1077qn.m9987m(zp0.m13676h(i, "Unknown content digest algorthm: "));
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m7715j0(int i, int i2) {
        if (i2 < 0) {
            C1077qn.m9987m(c75.m3878j("fromIndex (0) is greater than toIndex (", i2, ")."));
        } else {
            if (i2 <= i) {
                return;
            }
            xy4.m12792u(d55.m4367l("toIndex (", i2, ") is greater than size (", i, ")."));
        }
    }

    /* JADX INFO: renamed from: k */
    public static ByteBuffer m7716k(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            C1077qn.m9987m("Negative length");
            return null;
        }
        if (i <= byteBuffer.remaining()) {
            return m7718l(byteBuffer, i);
        }
        StringBuilder sbM3883o = c75.m3883o("Length-prefixed field longer than remaining buffer. Field length: ", i, ", remaining: ");
        sbM3883o.append(byteBuffer.remaining());
        throw new IOException(sbM3883o.toString());
    }

    /* JADX INFO: renamed from: k0 */
    public static void m7717k0(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        long j = jArr[8];
        long j2 = jArr[18];
        long j3 = j + (j2 << 4);
        jArr[8] = j3;
        long j4 = j3 + (j2 << 1);
        jArr[8] = j4;
        jArr[8] = j4 + j2;
        long j5 = jArr[7];
        long j6 = jArr[17];
        long j7 = j5 + (j6 << 4);
        jArr[7] = j7;
        long j8 = j7 + (j6 << 1);
        jArr[7] = j8;
        jArr[7] = j8 + j6;
        long j9 = jArr[6];
        long j10 = jArr[16];
        long j11 = j9 + (j10 << 4);
        jArr[6] = j11;
        long j12 = j11 + (j10 << 1);
        jArr[6] = j12;
        jArr[6] = j12 + j10;
        long j13 = jArr[5];
        long j14 = jArr[15];
        long j15 = j13 + (j14 << 4);
        jArr[5] = j15;
        long j16 = j15 + (j14 << 1);
        jArr[5] = j16;
        jArr[5] = j16 + j14;
        long j17 = jArr[4];
        long j18 = jArr[14];
        long j19 = j17 + (j18 << 4);
        jArr[4] = j19;
        long j20 = j19 + (j18 << 1);
        jArr[4] = j20;
        jArr[4] = j20 + j18;
        long j21 = jArr[3];
        long j22 = jArr[13];
        long j23 = j21 + (j22 << 4);
        jArr[3] = j23;
        long j24 = j23 + (j22 << 1);
        jArr[3] = j24;
        jArr[3] = j24 + j22;
        long j25 = jArr[2];
        long j26 = jArr[12];
        long j27 = j25 + (j26 << 4);
        jArr[2] = j27;
        long j28 = j27 + (j26 << 1);
        jArr[2] = j28;
        jArr[2] = j28 + j26;
        long j29 = jArr[1];
        long j30 = jArr[11];
        long j31 = j29 + (j30 << 4);
        jArr[1] = j31;
        long j32 = j31 + (j30 << 1);
        jArr[1] = j32;
        jArr[1] = j32 + j30;
        long j33 = jArr[0];
        long j34 = jArr[10];
        long j35 = j33 + (j34 << 4);
        jArr[0] = j35;
        long j36 = j35 + (j34 << 1);
        jArr[0] = j36;
        jArr[0] = j36 + j34;
        m7719l0(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    /* JADX INFO: renamed from: l */
    public static ByteBuffer m7718l(ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            C1077qn.m9987m(zp0.m13676h(i, "size: "));
            return null;
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public static void m7719l0(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j = jArr[i];
            long j2 = j / 67108864;
            jArr[i] = j - (j2 << 26);
            int i2 = i + 1;
            long j3 = jArr[i2] + j2;
            jArr[i2] = j3;
            long j4 = j3 / 33554432;
            jArr[i2] = j3 - (j4 << 25);
            i += 2;
            jArr[i] = jArr[i] + j4;
        }
        long j5 = jArr[0];
        long j6 = jArr[10];
        long j7 = j5 + (j6 << 4);
        jArr[0] = j7;
        long j8 = j7 + (j6 << 1);
        jArr[0] = j8;
        long j9 = j8 + j6;
        jArr[0] = j9;
        jArr[10] = 0;
        long j10 = j9 / 67108864;
        jArr[0] = j9 - (j10 << 26);
        jArr[1] = jArr[1] + j10;
    }

    /* JADX INFO: renamed from: m */
    public static void m7720m(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) ((i >>> 24) & 255);
    }

    /* JADX INFO: renamed from: m0 */
    public static Intent m7721m0(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str) {
        return context.registerReceiver(broadcastReceiver, intentFilter, str, null, 2);
    }

    /* JADX INFO: renamed from: n */
    public static X509Certificate[] m7722n(ByteBuffer byteBuffer, HashMap map, CertificateFactory certificateFactory) throws IOException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferM7716k = m7716k(byteBuffer);
        ByteBuffer byteBufferM7716k2 = m7716k(byteBuffer);
        byte[] bArrM7734t = m7734t(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrM7734t2 = null;
        int i = 0;
        int i2 = -1;
        byte[] bArrM7734t3 = null;
        while (byteBufferM7716k2.hasRemaining()) {
            i++;
            try {
                ByteBuffer byteBufferM7716k3 = m7716k(byteBufferM7716k2);
                if (byteBufferM7716k3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = byteBufferM7716k3.getInt();
                arrayList.add(Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i2 == -1 || m7710h(i3, i2) > 0) {
                    bArrM7734t3 = m7734t(byteBufferM7716k3);
                    i2 = i3;
                }
            } catch (IOException | BufferUnderflowException e) {
                throw new SecurityException(zp0.m13676h(i, "Failed to parse signature record #"), e);
            }
        }
        if (i2 == -1) {
            if (i == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i2 == 513 || i2 == 514) {
            str = "EC";
        } else if (i2 != 769) {
            switch (i2) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    xy4.m12781j(Long.toHexString(i2), "Unknown signature algorithm: 0x");
                    return null;
            }
        } else {
            str = "DSA";
        }
        if (i2 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i2 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i2 != 769) {
            switch (i2) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    xy4.m12781j(Long.toHexString(i2), "Unknown signature algorithm: 0x");
                    return null;
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrM7734t));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferM7716k);
            if (!signature.verify(bArrM7734t3)) {
                throw new SecurityException(str2 + " signature did not verify");
            }
            byteBufferM7716k.clear();
            ByteBuffer byteBufferM7716k4 = m7716k(byteBufferM7716k);
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (byteBufferM7716k4.hasRemaining()) {
                i4++;
                try {
                    ByteBuffer byteBufferM7716k5 = m7716k(byteBufferM7716k4);
                    if (byteBufferM7716k5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i5 = byteBufferM7716k5.getInt();
                    arrayList2.add(Integer.valueOf(i5));
                    if (i5 == i2) {
                        bArrM7734t2 = m7734t(byteBufferM7716k5);
                    }
                } catch (IOException | BufferUnderflowException e2) {
                    throw new IOException(zp0.m13676h(i4, "Failed to parse digest record #"), e2);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iM7732s = m7732s(i2);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iM7732s), bArrM7734t2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrM7734t2)) {
                throw new SecurityException(m7714j(iM7732s).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferM7716k6 = m7716k(byteBufferM7716k);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            while (byteBufferM7716k6.hasRemaining()) {
                i6++;
                byte[] bArrM7734t4 = m7734t(byteBufferM7716k6);
                try {
                    arrayList3.add(new C0179jk((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrM7734t4)), bArrM7734t4));
                } catch (CertificateException e3) {
                    throw new SecurityException(zp0.m13676h(i6, "Failed to decode certificate #"), e3);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrM7734t, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
            throw new SecurityException(zi4.m13621u("Failed to verify ", str2, " signature"), e4);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static final ArrayList m7723n0(List list, List list2, mi0 mi0Var, int i) {
        List list3;
        ArrayList arrayList;
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            objM6869O = new LinkedHashSet();
            ir1Var.m6905n0(objM6869O);
        }
        Set set = (Set) objM6869O;
        Object objM6869O2 = ir1Var.m6869O();
        if (objM6869O2 == i50Var) {
            objM6869O2 = new LinkedHashSet();
            ir1Var.m6905n0(objM6869O2);
        }
        Set set2 = (Set) objM6869O2;
        ir1Var.m6885d0(110758886);
        if (list instanceof RandomAccess) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                List list4 = list2;
                arrayList.add(m7681I((ny2) list.get(i2), list4, set, set2, ir1Var, i & 112));
                i2++;
                list2 = list4;
            }
            list3 = list2;
        } else {
            list3 = list2;
            List list5 = list;
            arrayList = new ArrayList(ib0.m6717y0(list5, 10));
            Iterator it = list5.iterator();
            while (it.hasNext()) {
                arrayList.add(m7681I((ny2) it.next(), list3, set, set2, ir1Var, i & 112));
            }
        }
        ArrayList arrayList2 = arrayList;
        ir1Var.m6912r(false);
        m7706f(arrayList2, list3, set, set2, ir1Var, i & 112);
        return arrayList2;
    }

    /* JADX INFO: renamed from: o */
    public static byte[][] m7724o(int[] iArr, u85[] u85VarArr) throws DigestException {
        long j;
        byte[][] bArr;
        String str;
        int i;
        int i2;
        u85[] u85VarArr2 = u85VarArr;
        int length = u85VarArr2.length;
        int i3 = 0;
        long size = 0;
        while (true) {
            j = 1048576;
            if (i3 >= length) {
                break;
            }
            size += (u85VarArr2[i3].size() + 1048575) / 1048576;
            i3++;
        }
        if (size >= 2097151) {
            throw new DigestException(zi4.m13619s("Too many chunks: ", size));
        }
        int i4 = (int) size;
        byte[][] bArr2 = new byte[iArr.length][];
        int i5 = 0;
        while (true) {
            byte[][] bArr3 = null;
            if (i5 >= iArr.length) {
                byte[] bArr4 = new byte[5];
                bArr4[0] = -91;
                int length2 = iArr.length;
                MessageDigest[] messageDigestArr = new MessageDigest[length2];
                int i6 = 0;
                while (true) {
                    bArr = bArr3;
                    str = " digest not supported";
                    if (i6 >= iArr.length) {
                        break;
                    }
                    String strM7714j = m7714j(iArr[i6]);
                    try {
                        messageDigestArr[i6] = MessageDigest.getInstance(strM7714j);
                        i6++;
                        bArr3 = bArr;
                    } catch (NoSuchAlgorithmException e) {
                        xy4.m12785n(strM7714j.concat(" digest not supported"), e);
                        return bArr;
                    }
                }
                int length3 = u85VarArr2.length;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i7 < length3) {
                    u85 u85Var = u85VarArr2[i7];
                    int i10 = i7;
                    long size2 = u85Var.size();
                    long j2 = 0;
                    int i11 = i9;
                    while (size2 > 0) {
                        String str2 = str;
                        int i12 = i8;
                        int iMin = (int) Math.min(size2, j);
                        m7720m(iMin, bArr4);
                        for (int i13 = 0; i13 < length2; i13++) {
                            messageDigestArr[i13].update(bArr4);
                        }
                        long j3 = j2;
                        try {
                            u85Var.mo1154a(messageDigestArr, j3, iMin);
                            int i14 = 0;
                            while (i14 < iArr.length) {
                                int i15 = iArr[i14];
                                byte[] bArr5 = bArr2[i14];
                                byte[] bArr6 = bArr4;
                                if (i15 == 1) {
                                    i = 32;
                                } else {
                                    if (i15 != 2) {
                                        C1077qn.m9987m(zp0.m13676h(i15, "Unknown content digest algorthm: "));
                                        return bArr;
                                    }
                                    i = 64;
                                }
                                MessageDigest messageDigest = messageDigestArr[i14];
                                int i16 = length3;
                                int i17 = i11;
                                long j4 = size2;
                                int iDigest = messageDigest.digest(bArr5, (i17 * i) + 5, i);
                                if (iDigest != i) {
                                    throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                                }
                                i14++;
                                i11 = i17;
                                bArr4 = bArr6;
                                length3 = i16;
                                size2 = j4;
                            }
                            long j5 = iMin;
                            i11++;
                            bArr4 = bArr4;
                            j2 = j3 + j5;
                            size2 -= j5;
                            str = str2;
                            i8 = i12;
                            length3 = length3;
                            j = 1048576;
                        } catch (IOException e2) {
                            throw new DigestException(zi4.m13618r(i11, i12, "Failed to digest chunk #", " of section #"), e2);
                        }
                    }
                    i8++;
                    i7 = i10 + 1;
                    u85VarArr2 = u85VarArr;
                    i9 = i11;
                    length3 = length3;
                    j = 1048576;
                }
                String str3 = str;
                byte[][] bArr7 = new byte[iArr.length][];
                for (int i18 = 0; i18 < iArr.length; i18++) {
                    int i19 = iArr[i18];
                    byte[] bArr8 = bArr2[i18];
                    String strM7714j2 = m7714j(i19);
                    try {
                        bArr7[i18] = MessageDigest.getInstance(strM7714j2).digest(bArr8);
                    } catch (NoSuchAlgorithmException e3) {
                        xy4.m12785n(strM7714j2.concat(str3), e3);
                        return bArr;
                    }
                }
                return bArr7;
            }
            int i20 = iArr[i5];
            if (i20 == 1) {
                i2 = 32;
            } else {
                if (i20 != 2) {
                    C1077qn.m9987m(zp0.m13676h(i20, "Unknown content digest algorthm: "));
                    return null;
                }
                i2 = 64;
            }
            byte[] bArr9 = new byte[(i2 * i4) + 5];
            bArr9[0] = 90;
            m7720m(i4, bArr9);
            bArr2[i5] = bArr9;
            i5++;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m7725o0(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j2 = j * 2;
        long j3 = jArr2[1];
        long j4 = jArr2[2];
        long j5 = jArr2[3];
        long j6 = jArr2[4];
        long j7 = jArr2[5];
        long j8 = jArr2[6];
        long j9 = jArr2[7];
        long j10 = jArr2[8];
        long j11 = jArr2[9];
        m7717k0(new long[]{j * j, j2 * j3, ((j * j4) + (j3 * j3)) * 2, ((j * j5) + (j3 * j4)) * 2, (j2 * j6) + (j3 * 4 * j5) + (j4 * j4), ((j * j7) + (j3 * j6) + (j4 * j5)) * 2, ((j3 * 2 * j7) + (j * j8) + (j4 * j6) + (j5 * j5)) * 2, ((j * j9) + (j3 * j8) + (j4 * j7) + (j5 * j6)) * 2, (((((j5 * j7) + (j3 * j9)) * 2) + (j * j10) + (j4 * j8)) * 2) + (j6 * j6), ((j * j11) + (j3 * j10) + (j4 * j9) + (j5 * j8) + (j6 * j7)) * 2, ((((j3 * j11) + (j5 * j9)) * 2) + (j4 * j10) + (j6 * j8) + (j7 * j7)) * 2, ((j4 * j11) + (j5 * j10) + (j6 * j9) + (j7 * j8)) * 2, (((((j5 * j11) + (j7 * j9)) * 2) + (j6 * j10)) * 2) + (j8 * j8), ((j6 * j11) + (j7 * j10) + (j8 * j9)) * 2, ((j7 * 2 * j11) + (j8 * j10) + (j9 * j9)) * 2, ((j8 * j11) + (j9 * j10)) * 2, (j9 * 4 * j11) + (j10 * j10), j10 * 2 * j11, 2 * j11 * j11}, jArr);
    }

    /* JADX INFO: renamed from: p */
    public static X509Certificate[][] m7726p(RandomAccessFile randomAccessFile) throws w95, IOException {
        Pair pairM4304e;
        if (randomAccessFile.length() < 22) {
            pairM4304e = null;
        } else {
            pairM4304e = d24.m4304e(randomAccessFile, 0);
            if (pairM4304e == null) {
                pairM4304e = d24.m4304e(randomAccessFile, 65535);
            }
        }
        if (pairM4304e == null) {
            throw new w95("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
        }
        ByteBuffer byteBuffer = (ByteBuffer) pairM4304e.first;
        long jLongValue = ((Long) pairM4304e.second).longValue();
        long j = jLongValue - 20;
        if (j >= 0) {
            randomAccessFile.seek(j);
            if (randomAccessFile.readInt() == 1347094023) {
                throw new w95("ZIP64 APK not supported");
            }
        }
        ByteOrder byteOrderOrder = byteBuffer.order();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        if (byteOrderOrder != byteOrder) {
            C1077qn.m9987m("ByteBuffer byte order must be little endian");
            return null;
        }
        long j2 = ((long) byteBuffer.getInt(byteBuffer.position() + 16)) & 4294967295L;
        if (j2 >= jLongValue) {
            throw new w95("ZIP Central Directory offset out of range: " + j2 + ". ZIP End of Central Directory offset: " + jLongValue);
        }
        if (byteBuffer.order() != byteOrder) {
            C1077qn.m9987m("ByteBuffer byte order must be little endian");
            return null;
        }
        if (j2 + (((long) byteBuffer.getInt(byteBuffer.position() + 12)) & 4294967295L) != jLongValue) {
            throw new w95("ZIP Central Directory is not immediately followed by End of Central Directory");
        }
        if (j2 < 32) {
            throw new w95(zi4.m13619s("APK too small for APK Signing Block. ZIP Central Directory offset: ", j2));
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        byteBufferAllocate.order(byteOrder);
        randomAccessFile.seek(j2 - ((long) byteBufferAllocate.capacity()));
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
            throw new w95("No APK Signing Block before ZIP Central Directory");
        }
        long j3 = byteBufferAllocate.getLong(0);
        if (j3 < byteBufferAllocate.capacity() || j3 > 2147483639) {
            throw new w95(zi4.m13619s("APK Signing Block size out of range: ", j3));
        }
        int i = (int) (8 + j3);
        long j4 = j2 - ((long) i);
        if (j4 < 0) {
            throw new w95(zi4.m13619s("APK Signing Block offset out of range: ", j4));
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
        byteBufferAllocate2.order(byteOrder);
        randomAccessFile.seek(j4);
        randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
        long j5 = byteBufferAllocate2.getLong(0);
        if (j5 != j3) {
            throw new w95("APK Signing Block sizes in header and footer do not match: " + j5 + " vs " + j3);
        }
        Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j4));
        ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
        long jLongValue2 = ((Long) pairCreate.second).longValue();
        if (byteBuffer2.order() != byteOrder) {
            C1077qn.m9987m("ByteBuffer byte order must be little endian");
            return null;
        }
        int iCapacity = byteBuffer2.capacity() - 24;
        if (iCapacity < 8) {
            C1077qn.m9987m(c75.m3878j("end < start: ", iCapacity, " < 8"));
            return null;
        }
        int iCapacity2 = byteBuffer2.capacity();
        if (iCapacity > byteBuffer2.capacity()) {
            C1077qn.m9987m(zi4.m13618r(iCapacity, iCapacity2, "end > capacity: ", " > "));
            return null;
        }
        int iLimit = byteBuffer2.limit();
        int iPosition = byteBuffer2.position();
        try {
            byteBuffer2.position(0);
            byteBuffer2.limit(iCapacity);
            byteBuffer2.position(8);
            ByteBuffer byteBufferSlice = byteBuffer2.slice();
            byteBufferSlice.order(byteBuffer2.order());
            byteBuffer2.position(0);
            byteBuffer2.limit(iLimit);
            byteBuffer2.position(iPosition);
            int i2 = 0;
            while (byteBufferSlice.hasRemaining()) {
                i2++;
                if (byteBufferSlice.remaining() < 8) {
                    throw new w95(zp0.m13676h(i2, "Insufficient data to read size of APK Signing Block entry #"));
                }
                long j6 = byteBufferSlice.getLong();
                if (j6 < 4 || j6 > 2147483647L) {
                    throw new w95("APK Signing Block entry #" + i2 + " size out of range: " + j6);
                }
                int i3 = (int) j6;
                int iPosition2 = byteBufferSlice.position() + i3;
                if (i3 > byteBufferSlice.remaining()) {
                    StringBuilder sbM13624x = zi4.m13624x("APK Signing Block entry #", i2, " size out of range: ", i3, ", available: ");
                    sbM13624x.append(byteBufferSlice.remaining());
                    throw new w95(sbM13624x.toString());
                }
                if (byteBufferSlice.getInt() == 1896449818) {
                    ByteBuffer byteBufferM7718l = m7718l(byteBufferSlice, i3 - 4);
                    FileChannel channel = randomAccessFile.getChannel();
                    HashMap map = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    try {
                        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                        try {
                            ByteBuffer byteBufferM7716k = m7716k(byteBufferM7718l);
                            int i4 = 0;
                            while (byteBufferM7716k.hasRemaining()) {
                                i4++;
                                try {
                                    arrayList.add(m7722n(m7716k(byteBufferM7716k), map, certificateFactory));
                                } catch (IOException | SecurityException | BufferUnderflowException e) {
                                    throw new SecurityException(c75.m3878j("Failed to parse/verify signer #", i4, " block"), e);
                                }
                            }
                            if (i4 < 1) {
                                throw new SecurityException("No signers found");
                            }
                            if (map.isEmpty()) {
                                throw new SecurityException("No content digests found");
                            }
                            if (map.isEmpty()) {
                                throw new SecurityException("No digests provided");
                            }
                            C0146hk c0146hk = new C0146hk(channel, 0L, jLongValue2);
                            C0146hk c0146hk2 = new C0146hk(channel, j2, jLongValue - j2);
                            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
                            byteBufferDuplicate.order(byteOrder2);
                            if (byteBufferDuplicate.order() != byteOrder2) {
                                C1077qn.m9987m("ByteBuffer byte order must be little endian");
                                return null;
                            }
                            int iPosition3 = byteBufferDuplicate.position() + 16;
                            if (jLongValue2 < 0 || jLongValue2 > 4294967295L) {
                                C1077qn.m9987m(zi4.m13619s("uint32 value of out range: ", jLongValue2));
                                return null;
                            }
                            byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition3, (int) jLongValue2);
                            C0310ra c0310ra = new C0310ra((byte) 12);
                            c0310ra.f10609a = byteBufferDuplicate.slice();
                            VarHandle.storeStoreFence();
                            int size = map.size();
                            int[] iArr = new int[size];
                            Iterator it = map.keySet().iterator();
                            int i5 = 0;
                            while (it.hasNext()) {
                                iArr[i5] = ((Integer) it.next()).intValue();
                                i5++;
                            }
                            try {
                                byte[][] bArrM7724o = m7724o(iArr, new u85[]{c0146hk, c0146hk2, c0310ra});
                                for (int i6 = 0; i6 < size; i6++) {
                                    int i7 = iArr[i6];
                                    if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i7)), bArrM7724o[i6])) {
                                        throw new SecurityException(m7714j(i7).concat(" digest of contents did not verify"));
                                    }
                                }
                                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                            } catch (DigestException e2) {
                                throw new SecurityException("Failed to compute digest(s) of contents", e2);
                            }
                        } catch (IOException e3) {
                            throw new SecurityException("Failed to read list of signers", e3);
                        }
                    } catch (CertificateException e4) {
                        xy4.m12785n("Failed to obtain X.509 CertificateFactory", e4);
                        return null;
                    }
                }
                byteBufferSlice.position(iPosition2);
            }
            throw new w95("No APK Signature Scheme v2 block in APK Signing Block");
        } catch (Throwable th) {
            byteBuffer2.position(0);
            byteBuffer2.limit(iLimit);
            byteBuffer2.position(iPosition);
            throw th;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static void m7727p0(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    /* JADX INFO: renamed from: q */
    public static X509Certificate[][] m7728q(String str) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            X509Certificate[][] x509CertificateArrM7726p = m7726p(randomAccessFile);
            randomAccessFile.close();
            return x509CertificateArrM7726p;
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static void m7729q0(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    /* JADX INFO: renamed from: r */
    public static ArrayList m7730r(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        C1374yn c1374yn = new C1374yn();
        c1374yn.f35341a = objArr;
        c1374yn.f35342b = true;
        VarHandle.storeStoreFence();
        return new ArrayList(c1374yn);
    }

    /* JADX INFO: renamed from: r0 */
    public static final void m7731r0(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: s */
    public static int m7732s(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                xy4.m12781j(Long.toHexString(i), "Unknown signature algorithm: 0x");
                return 0;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static final void m7733s0(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    /* JADX INFO: renamed from: t */
    public static byte[] m7734t(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            wb1.m12191j("Negative length");
            return null;
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder sbM3883o = c75.m3883o("Underflow while reading length-prefixed value. Length: ", i, ", available: ");
        sbM3883o.append(byteBuffer.remaining());
        throw new IOException(sbM3883o.toString());
    }

    /* JADX INFO: renamed from: t0 */
    public static void m7735t0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* JADX INFO: renamed from: u */
    public static String m7736u(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte b = bArr2[i10][i11];
                    byte[] bArr3 = zv4.f36415a;
                    int i13 = b & 255;
                    z = z2;
                    i3 = i13;
                }
                byte b2 = bArr[i7 + i12];
                byte[] bArr4 = zv4.f36415a;
                i4 = i3 - (b2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (bArr2[i10].length != i11) {
                    z2 = z;
                } else {
                    if (i10 == bArr2.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    int length3 = bArr2.length;
                    for (int i15 = i10 + 1; i15 < length3; i15++) {
                        length2 += bArr2[i15].length;
                    }
                    if (length2 >= i14) {
                        if (length2 <= i14) {
                            return new String(bArr, i7, i9, StandardCharsets.UTF_8);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i6;
        }
        return null;
    }

    /* JADX INFO: renamed from: u0 */
    public static final void m7737u0(String str) {
        throw new NoSuchElementException(str);
    }

    /* JADX INFO: renamed from: v */
    public static int m7738v(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        m7715j0(arrayList.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iM10111p = qs5.m10111p((Comparable) arrayList.get(i3), comparable);
            if (iM10111p < 0) {
                i2 = i3 + 1;
            } else {
                if (iM10111p <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: v0 */
    public static byte[] m7739v0(byte[] bArr) {
        int length = 0;
        while (length < bArr.length && bArr[length] == 0) {
            length++;
        }
        if (length == bArr.length) {
            length = bArr.length - 1;
        }
        int i = (bArr[length] & 128) == 128 ? 1 : 0;
        byte[] bArr2 = new byte[(bArr.length - length) + i];
        System.arraycopy(bArr, length, bArr2, i, bArr.length - length);
        return bArr2;
    }

    /* JADX INFO: renamed from: w */
    public static sl2 m7740w(sl2 sl2Var) {
        sl2Var.m10865l();
        sl2Var.f30375c = true;
        return sl2Var.f30374b > 0 ? sl2Var : sl2.f30372d;
    }

    /* JADX INFO: renamed from: w0 */
    public static final void m7741w0() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: x */
    public static final Bundle m7742x(l73... l73VarArr) {
        Bundle bundle = new Bundle(l73VarArr.length);
        for (l73 l73Var : l73VarArr) {
            String str = (String) l73Var.f23833a;
            Object obj = l73Var.f23834b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        C1077qn.m9987m(zi4.m13622v("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, "\""));
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    C1077qn.m9987m(zi4.m13622v("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, "\""));
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    /* JADX INFO: renamed from: x0 */
    public static synchronized String m7743x0(Context context) {
        String str;
        String str2;
        try {
            str = f23589a;
            if (str == null) {
                ContentResolver contentResolver = context.getContentResolver();
                String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                if (string == null || hz5.m6533b()) {
                    string = "emulator";
                }
                int i = 0;
                while (true) {
                    if (i < 3) {
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                            messageDigest.update(string.getBytes());
                            str2 = String.format("%032X", new BigInteger(1, messageDigest.digest()));
                            break;
                        } catch (ArithmeticException unused) {
                            str2 = "";
                            break;
                        } catch (NoSuchAlgorithmException unused2) {
                            i++;
                        }
                    }
                    str2 = "";
                    break;
                }
                str = str2;
                f23589a = str;
            }
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }

    /* JADX INFO: renamed from: y */
    public static nt2 m7744y(nt2 nt2Var, nv2 nv2Var, jq3 jq3Var, boolean z, lq3 lq3Var, wp1 wp1Var, int i) {
        nt2 nt2VarM10029m;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            lq3Var = null;
        }
        lq3 lq3Var2 = lq3Var;
        if (jq3Var != null) {
            nt2VarM10029m = new x90(nv2Var, jq3Var, false, z2, null, lq3Var2, wp1Var);
        } else if (jq3Var == null) {
            nt2VarM10029m = new x90(nv2Var, null, false, z2, null, lq3Var2, wp1Var);
        } else {
            kt2 kt2Var = kt2.f23428a;
            if (nv2Var != null) {
                nt2VarM10029m = n22.m8478a(kt2Var, nv2Var, jq3Var).mo7630d(new x90(nv2Var, null, false, z2, null, lq3Var2, wp1Var));
            } else {
                y90 y90Var = new y90((byte) 0);
                y90Var.f35033b = jq3Var;
                y90Var.f35034c = z2;
                y90Var.f35036e = lq3Var2;
                y90Var.f35035d = wp1Var;
                VarHandle.storeStoreFence();
                nt2VarM10029m = qq2.m10029m(kt2Var, y90Var);
            }
        }
        return nt2Var.mo7630d(nt2VarM10029m);
    }

    /* JADX INFO: renamed from: z */
    public static nt2 m7745z(nt2 nt2Var, boolean z, String str, wp1 wp1Var, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            str = null;
        }
        return nt2Var.mo7630d(new x90(null, null, true, z2, str, null, wp1Var));
    }

    /* JADX INFO: renamed from: D */
    public void mo7746D(AbstractC1323x9 abstractC1323x9, Set set) {
        synchronized (abstractC1323x9) {
            try {
                if (abstractC1323x9.f200h == null) {
                    abstractC1323x9.f200h = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public abstract String mo7747H(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: J */
    public int mo7748J(AbstractC1323x9 abstractC1323x9) {
        int i;
        synchronized (abstractC1323x9) {
            i = abstractC1323x9.f201i - 1;
            abstractC1323x9.f201i = i;
        }
        return i;
    }

    /* JADX INFO: renamed from: K */
    public abstract int mo7749K(String str, byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: M */
    public int mo7750M(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int iM12429a = length;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 2048) {
                try {
                    iM12429a += wv4.m12429a(i, str);
                    break;
                } catch (uv4 unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
            iM12429a += (127 - cCharAt) >>> 31;
            i++;
        }
        if (iM12429a >= length) {
            return iM12429a;
        }
        ds3.m4666j(((long) iM12429a) + 4294967296L);
        return 0;
    }
}
