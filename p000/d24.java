package p000;

import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Binder;
import android.os.Process;
import android.text.Layout;
import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.annotation.Annotation;
import java.lang.invoke.VarHandle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.Bidi;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class d24 {

    /* JADX INFO: renamed from: a */
    public static final wc0 f16743a = new wc0();

    /* JADX INFO: renamed from: b */
    public static final dd0 f16744b = new dd0();

    /* JADX INFO: renamed from: c */
    public static final pg0 f16745c;

    /* JADX INFO: renamed from: d */
    public static final fm4 f16746d;

    /* JADX INFO: renamed from: e */
    public static final z45 f16747e;

    /* JADX INFO: renamed from: f */
    public static final Object f16748f;

    /* JADX INFO: renamed from: g */
    public static boolean f16749g;

    /* JADX INFO: renamed from: h */
    public static int f16750h;

    static {
        new pg0(-2120088239, false, new fh0((byte) 0));
        f16745c = new pg0(-1980052722, false, new xg0((byte) 18));
        f16746d = new fm4(0, new long[0], new Object[0]);
        f16747e = new z45((byte) 15);
        f16748f = new Object();
    }

    /* JADX INFO: renamed from: A */
    public static final void m4286A(C0489bf c0489bf, float f, float f2, float f3, float f4, float f5) {
        float f6 = (f3 * f5) + f;
        float f7 = (f4 * f5) + f2;
        Path path = c0489bf.f15228a;
        path.moveTo(f, f2);
        c0489bf.m3562e(f6, f2);
        float f8 = f4 < 0.0f ? 90.0f : 270.0f;
        float f9 = ((((f3 > 0.0f ? 180.0f : 0.0f) - f8) + 540.0f) % 360.0f) - 180.0f;
        float f10 = f6 - f5;
        float f11 = f7 - f5;
        float f12 = f6 + f5;
        float f13 = f7 + f5;
        RectF rectF = c0489bf.f15229b;
        if (rectF == null) {
            rectF = new RectF();
            c0489bf.f15229b = rectF;
        }
        rectF.set(f10, f11, f12, f13);
        path.arcTo(c0489bf.f15229b, f8, f9, false);
        path.close();
    }

    /* JADX INFO: renamed from: B */
    public static String m4287B(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            C1077qn.m9987m("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: C */
    public static final bk2 m4288C(i92 i92Var, g24 g24Var) {
        zc6 zc6VarMo4431c = g24Var.mo4431c();
        if (zc6VarMo4431c instanceof vc3) {
            return bk2.POLY_OBJ;
        }
        if (z62.m13387o(zc6VarMo4431c, rd4.f29189k)) {
            return bk2.LIST;
        }
        if (!z62.m13387o(zc6VarMo4431c, rd4.f29190l)) {
            return bk2.OBJ;
        }
        g24 g24VarM4309j = m4309j(g24Var.mo4436j(0));
        zc6 zc6VarMo4431c2 = g24VarM4309j.mo4431c();
        if ((zc6VarMo4431c2 instanceof tf3) || z62.m13387o(zc6VarMo4431c2, l24.f23749j)) {
            return bk2.MAP;
        }
        throw kx5.m7696a(g24VarM4309j);
    }

    /* JADX INFO: renamed from: D */
    public static final nt2 m4289D(nt2 nt2Var, d03 d03Var, g03 g03Var) {
        h03 h03Var = new h03();
        h03Var.f20245a = d03Var;
        h03Var.f20246b = g03Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(h03Var);
    }

    /* JADX INFO: renamed from: E */
    public static final nt2 m4290E(nt2 nt2Var, yp1 yp1Var) {
        kk1 kk1Var = new kk1();
        kk1Var.f23192a = yp1Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(kk1Var);
    }

    /* JADX INFO: renamed from: F */
    public static byte[] m4291F(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                C1077qn.m9989o(c75.m3877i(i, "Not enough bytes to read: "));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: G */
    public static byte[] m4292G(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    /* JADX INFO: renamed from: H */
    public static long m4293H(InputStream inputStream, int i) throws IOException {
        byte[] bArrM4291F = m4291F(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrM4291F[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: I */
    public static final long m4294I(long j, d63 d63Var) {
        int iOrdinal = d63Var.ordinal();
        if (iOrdinal == 0) {
            return i20.m6580e(b33.m3427e(j), -b33.m3428f(j));
        }
        if (iOrdinal == 1) {
            return i20.m6580e(-b33.m3427e(j), b33.m3428f(j));
        }
        C0670g.m5864c();
        return 0L;
    }

    /* JADX INFO: renamed from: J */
    public static final BlendMode m4295J(int i) {
        if (i == 0) {
            return BlendMode.CLEAR;
        }
        if (i == 1) {
            return BlendMode.SRC;
        }
        if (i == 2) {
            return BlendMode.DST;
        }
        if (i == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i == 4) {
            return BlendMode.DST_OVER;
        }
        if (i == 5) {
            return BlendMode.SRC_IN;
        }
        if (i == 6) {
            return BlendMode.DST_IN;
        }
        if (i == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i == 8) {
            return BlendMode.DST_OUT;
        }
        if (i == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i == 11) {
            return BlendMode.XOR;
        }
        if (i == 12) {
            return BlendMode.PLUS;
        }
        if (i == 13) {
            return BlendMode.MODULATE;
        }
        if (i == 14) {
            return BlendMode.SCREEN;
        }
        if (i == 15) {
            return BlendMode.OVERLAY;
        }
        if (i == 16) {
            return BlendMode.DARKEN;
        }
        if (i == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i == 25) {
            return BlendMode.HUE;
        }
        if (i == 26) {
            return BlendMode.SATURATION;
        }
        if (i == 27) {
            return BlendMode.COLOR;
        }
        return i == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    /* JADX INFO: renamed from: K */
    public static final ob0 m4296K(long j) {
        lc0 lc0VarM9467f = pb0.m9467f(j);
        qp3 qp3Var = oc0.f26551e;
        if (z62.m13387o(lc0VarM9467f, qp3Var)) {
            qt3 qt3Var = qt3.f28787b;
            return qt3Var.f28788a.mo5129e(pb0.m9469h(j), pb0.m9468g(j), pb0.m9466e(j), pb0.m9465d(j));
        }
        if (z62.m13387o(lc0VarM9467f, oc0.f26563q)) {
            return kj3.f23172c.mo5129e(pb0.m9469h(j), pb0.m9468g(j), pb0.m9466e(j), pb0.m9465d(j));
        }
        if (z62.m13387o(lc0VarM9467f, oc0.f26564r)) {
            return kj3.f23173d.mo5129e(pb0.m9469h(j), pb0.m9468g(j), pb0.m9466e(j), pb0.m9465d(j));
        }
        if (z62.m13387o(lc0VarM9467f, oc0.f26561o)) {
            return kj3.f23174e.mo5129e(pb0.m9469h(j), pb0.m9468g(j), pb0.m9466e(j), pb0.m9465d(j));
        }
        if (z62.m13387o(lc0VarM9467f, oc0.f26556j)) {
            return kj3.f23175f.mo5129e(pb0.m9469h(j), pb0.m9468g(j), pb0.m9466e(j), pb0.m9465d(j));
        }
        if (z62.m13387o(lc0VarM9467f, oc0.f26555i)) {
            return kj3.f23176g.mo5129e(pb0.m9469h(j), pb0.m9468g(j), pb0.m9466e(j), pb0.m9465d(j));
        }
        if (z62.m13387o(lc0VarM9467f, oc0.f26566t)) {
            re2 re2Var = se2.f30213a;
            float fM9469h = pb0.m9469h(j);
            float fM9468g = pb0.m9468g(j);
            float fM9466e = pb0.m9466e(j);
            float fM9465d = pb0.m9465d(j);
            re2Var.getClass();
            qe2 qe2Var = new qe2();
            qe2Var.f28415a = fM9469h;
            qe2Var.f28416b = fM9468g;
            qe2Var.f28417c = fM9466e;
            qe2Var.f28418d = fM9465d;
            qe2Var.f28419e = re2Var;
            VarHandle.storeStoreFence();
            return qe2Var;
        }
        if (z62.m13387o(lc0VarM9467f, oc0.f26565s)) {
            return m45.f24647b.m7833a(pb0.m9469h(j), pb0.m9468g(j), pb0.m9466e(j), pb0.m9465d(j));
        }
        if (z62.m13387o(lc0VarM9467f, oc0.f26557k)) {
            return kj3.f23177h.mo5129e(pb0.m9469h(j), pb0.m9468g(j), pb0.m9466e(j), pb0.m9465d(j));
        }
        if (z62.m13387o(lc0VarM9467f, oc0.f26558l)) {
            return kj3.f23178i.mo5129e(pb0.m9469h(j), pb0.m9468g(j), pb0.m9466e(j), pb0.m9465d(j));
        }
        if (z62.m13387o(lc0VarM9467f, oc0.f26552f)) {
            return kj3.f23171b.mo5129e(pb0.m9469h(j), pb0.m9468g(j), pb0.m9466e(j), pb0.m9465d(j));
        }
        if (z62.m13387o(lc0VarM9467f, oc0.f26562p)) {
            return kj3.f23179j.mo5129e(pb0.m9469h(j), pb0.m9468g(j), pb0.m9466e(j), pb0.m9465d(j));
        }
        long jM9463b = pb0.m9463b(j, qp3Var);
        qt3 qt3Var2 = qt3.f28787b;
        return qt3Var2.f28788a.mo5129e(pb0.m9469h(jM9463b), pb0.m9468g(jM9463b), pb0.m9466e(jM9463b), pb0.m9465d(jM9463b));
    }

    /* JADX INFO: renamed from: L */
    public static final long m4297L(long j) {
        boolean zM6650i = i41.m6650i(j);
        if (zM6650i) {
            return i41.m6647f(i41.m6652k(j, as4.m3239R(999999L, m41.NANOSECONDS)));
        }
        if (!zM6650i) {
            return 0L;
        }
        C0670g.m5864c();
        return 0L;
    }

    /* JADX INFO: renamed from: M */
    public static void m4298M(OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: N */
    public static void m4299N(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        m4298M(byteArrayOutputStream, i, 2);
    }

    /* JADX INFO: renamed from: a */
    public static final void m4300a(pk4 pk4Var, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(2080741862);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6894i(pk4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 32 : 16;
        }
        byte b = 1;
        if (ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
            vd6.m11842a(pk4Var, pg0Var, ir1Var, i2 & 126);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            yd0 yd0Var = new yd0(b);
            yd0Var.f35123b = pk4Var;
            yd0Var.f35124c = pg0Var;
            yd0Var.f35125d = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = yd0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m4301b(i73 i73Var, nt2 nt2Var, mi0 mi0Var, int i) {
        C0853kz c0853kz = ig1.f21382f;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1142754848);
        int i2 = (ir1Var.m6894i(i73Var) ? 4 : 2) | i;
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6890g(nt2Var) ? 256 : 128;
        }
        int i3 = (ir1Var.m6890g(c0853kz) ? 2048 : 1024) | i2 | (ir1Var.m6890g(im0.f21547b) ? 16384 : 8192) | (ir1Var.m6884d(1.0f) ? 131072 : 65536) | (ir1Var.m6890g(null) ? 1048576 : 524288);
        if (ir1Var.m6871T(i3 & 1, (599187 & i3) != 599186)) {
            ir1Var.m6885d0(1899381698);
            ir1Var.m6912r(false);
            nt2 nt2VarM10703R = se0.m10703R(i25.m6620n(nt2Var.mo7630d(kt2.f23428a)), i73Var, null, 2);
            Object objM6869O = ir1Var.m6869O();
            if (objM6869O == ki0.f23136a) {
                objM6869O = C1180tf.f31105g;
                ir1Var.m6905n0(objM6869O);
            }
            xq2 xq2Var = (xq2) objM6869O;
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM10703R);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            bi0.f15310ap.getClass();
            if (ir1Var.f21685a == null) {
                dt0.m4682E();
                throw null;
            }
            ir1Var.m6893h0();
            if (ir1Var.f21682S) {
                ir1Var.m6900l(wf2.f33290T);
            } else {
                ir1Var.m6911q0();
            }
            C0006a5.m53I(ir1Var, ia5.f21216g, xq2Var);
            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
            C0006a5.m50F(ir1Var);
            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
            C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
            ir1Var.m6912r(true);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            x02 x02Var = new x02();
            x02Var.f33897a = i73Var;
            x02Var.f33898b = nt2Var;
            x02Var.f33899c = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = x02Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m4302c(t02 t02Var, nt2 nt2Var, ir1 ir1Var, int i, int i2) {
        if ((i2 & 4) != 0) {
            nt2Var = kt2.f23428a;
        }
        jm0.f22418cp.getClass();
        boolean zM6890g = ir1Var.m6890g(t02Var);
        Object objM6869O = ir1Var.m6869O();
        if (zM6890g || objM6869O == ki0.f23136a) {
            objM6869O = z62.m13378f(t02Var);
            ir1Var.m6905n0(objM6869O);
        }
        m4301b((l00) objM6869O, nt2Var, ir1Var, (i & 896) | 56);
    }

    /* JADX INFO: renamed from: d */
    public static final void m4303d(aw3 aw3Var, kz2 kz2Var, wp1 wp1Var, wp1 wp1Var2, mi0 mi0Var, int i) {
        int i2;
        kz2 kz2Var2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1784101165);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(aw3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(kz2Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= ir1Var.m6894i(wp1Var2) ? 2048 : 1024;
        }
        if (ir1Var.m6871T(i3 & 1, (i3 & 1171) != 1170)) {
            ir1Var.m6876Y();
            int i4 = i & 1;
            i50 i50Var = ki0.f23136a;
            if (i4 == 0 || ir1Var.m6856B()) {
                Object objM6869O = ir1Var.m6869O();
                if (objM6869O == i50Var) {
                    objM6869O = new da2((byte) 18);
                    ir1Var.m6905n0(objM6869O);
                }
                wp1Var = (wp1) objM6869O;
            } else {
                ir1Var.m6874W();
            }
            ir1Var.m6913s();
            boolean z = !aw3Var.f14918c.mo12427b().isEmpty();
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048);
            Object objM6869O2 = ir1Var.m6869O();
            Object obj = objM6869O2;
            if (z2 || objM6869O2 == i50Var) {
                jp1 jp1Var = new jp1((byte) 9);
                jp1Var.f22485b = aw3Var;
                jp1Var.f22486c = wp1Var2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(jp1Var);
                obj = jp1Var;
            }
            kz2Var2 = kz2Var;
            zy5.m13875j(kz2Var2, z, wp1Var, (wp1) obj, ir1Var, ((i3 >> 3) & 14) | (i3 & 896));
        } else {
            kz2Var2 = kz2Var;
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0877lm c0877lm = new C0877lm((byte) 6);
            c0877lm.f24144c = aw3Var;
            c0877lm.f24145d = kz2Var2;
            c0877lm.f24146e = wp1Var;
            c0877lm.f24147f = wp1Var2;
            c0877lm.f24143b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0877lm;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Pair m4304e(RandomAccessFile randomAccessFile, int i) {
        int i2;
        if (i < 0 || i > 65535) {
            C1077qn.m9987m(zp0.m13676h(i, "maxCommentSize: "));
            return null;
        }
        long length = randomAccessFile.length();
        if (length >= 22) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i, length - 22)) + 22);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            long jCapacity = length - ((long) byteBufferAllocate.capacity());
            randomAccessFile.seek(jCapacity);
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.order() != byteOrder) {
                C1077qn.m9987m("ByteBuffer byte order must be little endian");
                return null;
            }
            int iCapacity = byteBufferAllocate.capacity();
            if (iCapacity >= 22) {
                int i3 = iCapacity - 22;
                int iMin = Math.min(i3, 65535);
                int i4 = 0;
                while (true) {
                    if (i4 >= iMin) {
                        i2 = -1;
                        break;
                    }
                    i2 = i3 - i4;
                    if (byteBufferAllocate.getInt(i2) == 101010256 && (byteBufferAllocate.getShort(i2 + 20) & 65535) == i4) {
                        break;
                    }
                    i4++;
                }
            } else {
                i2 = -1;
                break;
            }
            if (i2 != -1) {
                byteBufferAllocate.position(i2);
                ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
                byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
                return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) i2)));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m4305f(Object obj) {
        if (obj == null) {
            return;
        }
        xy4.m12778e();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public static final void m4306g(ym0 ym0Var) {
        nx0 nx0Var;
        if (ym0Var instanceof nx0) {
            nx0Var = (nx0) ym0Var;
            int i = nx0Var.f26161u;
            if ((i & Integer.MIN_VALUE) != 0) {
                nx0Var.f26161u = i - Integer.MIN_VALUE;
            } else {
                nx0Var = new nx0(ym0Var);
            }
        } else {
            nx0Var = new nx0(ym0Var);
        }
        Object obj = nx0Var.f26160t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = nx0Var.f26161u;
        if (i2 == 0) {
            k43.m7376J(obj);
            nx0Var.f26161u = 1;
            b70 b70Var = new b70(1, C0006a5.m86x(nx0Var));
            b70Var.m3497u();
            if (b70Var.m3495r() == ap0Var) {
                return;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            k43.m7376J(obj);
        }
        xy4.m12794w();
    }

    /* JADX INFO: renamed from: h */
    public static C1116rp m4307h() throws InterruptedException {
        hf0 hf0Var = C1116rp.f29486h;
        C1116rp c1116rp = ((C1116rp[]) hf0Var.f20529c)[1];
        if (c1116rp == null) {
            long jNanoTime = System.nanoTime();
            C1116rp.f29489k.await(C1116rp.f29490l, TimeUnit.MILLISECONDS);
            if (((C1116rp[]) hf0Var.f20529c)[1] != null || System.nanoTime() - jNanoTime < C1116rp.f29491m) {
                return null;
            }
            return C1116rp.f29487i;
        }
        long jNanoTime2 = c1116rp.f29494g - System.nanoTime();
        if (jNanoTime2 > 0) {
            C1116rp.f29489k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        hf0Var.m6383q(c1116rp);
        c1116rp.f29492e = (byte) 2;
        return c1116rp;
    }

    /* JADX INFO: renamed from: i */
    public static final String m4308i(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    /* JADX INFO: renamed from: j */
    public static final g24 m4309j(g24 g24Var) {
        if (!z62.m13387o(g24Var.mo4431c(), k24.f22835j)) {
            return g24Var.mo5886f() ? m4309j(g24Var.mo4436j(0)) : g24Var;
        }
        zt5.m13788u(g24Var);
        return g24Var;
    }

    /* JADX INFO: renamed from: k */
    public static final void m4310k(i92 i92Var, jc2 jc2Var, jc2 jc2Var2, String str) {
        g24 g24VarMo15d = jc2Var2.mo15d();
        qa2.m9807d(i92Var, g24VarMo15d);
        if (n40.m8500i(g24VarMo15d).contains(str)) {
            String strMo3641b = jc2Var.mo15d().mo3641b();
            String strMo3641b2 = jc2Var2.mo15d().mo3641b();
            throw new y92(zi4.m13623w(zi4.m13625y("Class '", strMo3641b2, "' cannot be serialized ", (((q90) i92Var.f21188a.f30012e) == q90.f28307b && z62.m13387o(strMo3641b, strMo3641b2)) ? "in ALL_JSON_OBJECTS class discriminator mode" : zi4.m13617q('\'', "as base class '", strMo3641b), " because it has property name that conflicts with JSON class discriminator '"), str, "'."), "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.", null, 8);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m4311l(zc6 zc6Var) {
        if (zc6Var instanceof l24) {
            C1077qn.m9989o("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (zc6Var instanceof tf3) {
            C1077qn.m9989o("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (zc6Var instanceof vc3) {
            C1077qn.m9989o("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    /* JADX INFO: renamed from: m */
    public static int m4312m(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName)) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, context.getOpPackageName()) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public static final String m4313n(i92 i92Var, g24 g24Var) {
        for (Annotation annotation : g24Var.getAnnotations()) {
            if (annotation instanceof r92) {
                return ((r92) annotation).discriminator();
            }
        }
        return "type";
    }

    /* JADX INFO: renamed from: o */
    public static byte[] m4314o(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m4315p(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            i = inputStream.read(bArr);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final cm1 m4316q(Context context) {
        C0572de c0572de = new C0572de();
        c0572de.f16997a = context.getApplicationContext();
        VarHandle.storeStoreFence();
        int iM13173a = ym1.f35327a.m13173a(context);
        C0609ee c0609ee = new C0609ee();
        c0609ee.f18025a = iM13173a;
        VarHandle.storeStoreFence();
        pq3 pq3Var = dm1.f17185a;
        jp0 jp0Var = dm1.f17186b;
        im1 im1Var = new im1();
        im1Var.f21551a = jp0Var;
        hm1 hm1Var = im1.f21550c;
        yu1 yu1Var = k01.f22789a;
        hm1Var.getClass();
        im1Var.f21552b = zp0.m13670b(qs5.m10089N(hm1Var, yu1Var).plus(r71.f29063a).plus(new pe4(null)));
        VarHandle.storeStoreFence();
        w42 w42Var = new w42((byte) 5, false);
        w42Var.f33090b = new r50((byte) 14);
        VarHandle.storeStoreFence();
        cm1 cm1Var = new cm1();
        cm1Var.f16121a = c0572de;
        cm1Var.f16122b = c0609ee;
        cm1Var.f16123c = pq3Var;
        cm1Var.f16124d = im1Var;
        cm1Var.f16125e = w42Var;
        b71 b71Var = new b71((byte) 4);
        b71Var.f15141b = cm1Var;
        VarHandle.storeStoreFence();
        cm1Var.f16126f = b71Var;
        VarHandle.storeStoreFence();
        return cm1Var;
    }

    /* JADX INFO: renamed from: r */
    public static final Object m4317r(long j, wm0 wm0Var) {
        if (j > 0) {
            b70 b70Var = new b70(1, C0006a5.m86x(wm0Var));
            b70Var.m3497u();
            if (j < Long.MAX_VALUE) {
                m4321v(b70Var.f15139e).mo5055j(j, b70Var);
            }
            Object objM3495r = b70Var.m3495r();
            if (objM3495r == ap0.f14763a) {
                return objM3495r;
            }
        }
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: s */
    public static final Object m4318s(long j, wm0 wm0Var) {
        Object objM4317r = m4317r(m4297L(j), wm0Var);
        return objM4317r == ap0.f14763a ? objM4317r : ju4.f22634a;
    }

    /* JADX INFO: renamed from: t */
    public static final float m4319t(long j, d63 d63Var) {
        int iOrdinal = d63Var.ordinal();
        if (iOrdinal == 0) {
            return b33.m3428f(j);
        }
        if (iOrdinal == 1) {
            return b33.m3427e(j);
        }
        C0670g.m5864c();
        return 0.0f;
    }

    /* JADX INFO: renamed from: u */
    public static final float m4320u(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    /* JADX INFO: renamed from: v */
    public static final mx0 m4321v(ro0 ro0Var) {
        po0 po0Var = ro0Var.get(gb5.f19711b);
        mx0 mx0Var = po0Var instanceof mx0 ? (mx0) po0Var : null;
        return mx0Var == null ? yv0.f35546a : mx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x025e A[EDGE_INSN: B:144:0x025e->B:171:0x02ba BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a6  */
    /* JADX INFO: renamed from: w */
    public static final int m4322w(hl4 hl4Var, Layout layout, C1122rv c1122rv, int i, RectF rectF, b04 b04Var, C1017p0 c1017p0, boolean z) {
        ff2[] ff2VarArr;
        ff2[] ff2VarArr2;
        int i2;
        int iMo3387c;
        int i3;
        int i4;
        int iMo3386b;
        Bidi bidiCreateLineBidi;
        float fM5418a;
        float fM5418a2;
        float fM5418a3;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i5 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i5];
        Layout layout2 = hl4Var.f20679f;
        int lineStart2 = layout2.getLineStart(i);
        int iM6433f = hl4Var.m6433f(i);
        if (i5 < (iM6433f - lineStart2) * 2) {
            r32.m10186a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        ex1 ex1Var = new ex1(hl4Var);
        boolean z2 = false;
        boolean z3 = layout2.getParagraphDirection(i) == 1;
        int i6 = 0;
        while (lineStart2 < iM6433f) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z3 && !zIsRtlCharAt) {
                fM5418a = ex1Var.m5418a(lineStart2, z2, z2, true);
                fM5418a3 = ex1Var.m5418a(lineStart2 + 1, true, true, true);
            } else if (z3 && zIsRtlCharAt) {
                fM5418a3 = ex1Var.m5418a(lineStart2, false, false, false);
                fM5418a = ex1Var.m5418a(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fM5418a2 = ex1Var.m5418a(lineStart2, false, false, true);
                    fM5418a = ex1Var.m5418a(lineStart2 + 1, true, true, true);
                } else {
                    fM5418a = ex1Var.m5418a(lineStart2, false, false, false);
                    fM5418a2 = ex1Var.m5418a(lineStart2 + 1, true, true, false);
                }
                fM5418a3 = fM5418a2;
            }
            fArr[i6] = fM5418a;
            fArr[i6 + 1] = fM5418a3;
            i6 += 2;
            lineStart2++;
            z3 = z3;
            z2 = false;
        }
        Layout layout3 = (Layout) c1122rv.f29651b;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int iM10456o = c1122rv.m10456o(lineStart3, false);
        int iM10457p = c1122rv.m10457p(iM10456o);
        int i7 = lineStart3 - iM10457p;
        int i8 = lineEnd2 - iM10457p;
        Bidi bidiM10448g = c1122rv.m10448g(iM10456o);
        if (bidiM10448g == null || (bidiCreateLineBidi = bidiM10448g.createLineBidi(i7, i8)) == null) {
            ff2VarArr = new ff2[]{new ff2(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            ff2VarArr = new ff2[runCount];
            int i9 = 0;
            while (i9 < runCount) {
                int i10 = runCount;
                ff2VarArr[i9] = new ff2(bidiCreateLineBidi.getRunStart(i9) + lineStart3, bidiCreateLineBidi.getRunLimit(i9) + lineStart3, bidiCreateLineBidi.getRunLevel(i9) % 2 == 1);
                i9++;
                runCount = i10;
            }
        }
        p52 r52Var = z ? new r52(0, ff2VarArr.length - 1, 1) : new p52(ff2VarArr.length - 1, 0, -1);
        int i11 = r52Var.f27382a;
        int i12 = r52Var.f27383b;
        int i13 = r52Var.f27384c;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return -1;
        }
        while (true) {
            ff2 ff2Var = ff2VarArr[i11];
            boolean z4 = ff2Var.f18950c;
            int iMo3388h = ff2Var.f18948a;
            int iMo3389i = ff2Var.f18949b;
            float f = z4 ? fArr[((iMo3389i - 1) - lineStart) * 2] : fArr[(iMo3388h - lineStart) * 2];
            float fM4320u = z4 ? m4320u(iMo3388h, lineStart, fArr) : m4320u(iMo3389i - 1, lineStart, fArr);
            float f2 = rectF.left;
            int i14 = i13;
            if (!z) {
                ff2VarArr2 = ff2VarArr;
                if (fM4320u < f2) {
                    iMo3389i = -1;
                    break;
                }
                float f3 = rectF.right;
                if (f <= f3) {
                    if ((z4 || f3 < fM4320u) && (!z4 || f2 > f)) {
                        int i15 = iMo3389i;
                        int i16 = iMo3388h;
                        while (i15 - i16 > 1) {
                            int i17 = (i15 + i16) / 2;
                            float f4 = fArr[(i17 - lineStart) * 2];
                            int i18 = i15;
                            if ((z4 || f4 <= rectF.right) && (!z4 || f4 >= rectF.left)) {
                                i15 = i18;
                                i16 = i17;
                            } else {
                                i15 = i17;
                            }
                        }
                        i2 = z4 ? i15 : i16;
                    } else {
                        i2 = iMo3389i - 1;
                    }
                    int iMo3386b2 = b04Var.mo3386b(i2 + 1);
                    if (iMo3386b2 == -1 || (iMo3387c = b04Var.mo3387c(iMo3386b2)) <= iMo3388h) {
                        iMo3389i = -1;
                        break;
                    }
                    if (iMo3386b2 < iMo3388h) {
                        iMo3386b2 = iMo3388h;
                    }
                    if (iMo3387c <= iMo3389i) {
                        iMo3389i = iMo3387c;
                    }
                    RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iMo3386b3 = iMo3386b2;
                    while (true) {
                        rectF2.left = z4 ? fArr[((iMo3389i - 1) - lineStart) * 2] : fArr[(iMo3386b3 - lineStart) * 2];
                        rectF2.right = z4 ? m4320u(iMo3386b3, lineStart, fArr) : m4320u(iMo3389i - 1, lineStart, fArr);
                        if (((Boolean) c1017p0.invoke(rectF2, rectF)).booleanValue()) {
                            break;
                        }
                        iMo3389i = b04Var.mo3389i(iMo3389i);
                        if (iMo3389i == -1 || iMo3389i <= iMo3388h) {
                            iMo3389i = -1;
                            break;
                        }
                        iMo3386b3 = b04Var.mo3386b(iMo3389i);
                        if (iMo3386b3 < iMo3388h) {
                            iMo3386b3 = iMo3388h;
                        }
                    }
                } else {
                    iMo3389i = -1;
                    break;
                }
                iMo3388h = iMo3389i;
            } else {
                if (fM4320u < f2) {
                    ff2VarArr2 = ff2VarArr;
                    iMo3388h = -1;
                    break;
                }
                float f5 = rectF.right;
                if (f <= f5) {
                    if ((z4 || f2 > f) && (!z4 || f5 < fM4320u)) {
                        int i19 = iMo3389i;
                        int i20 = iMo3388h;
                        while (true) {
                            i3 = i19;
                            if (i19 - i20 <= 1) {
                                break;
                            }
                            int i21 = (i3 + i20) / 2;
                            float f6 = fArr[(i21 - lineStart) * 2];
                            if ((z4 || f6 <= rectF.left) && (!z4 || f6 >= rectF.right)) {
                                i19 = i3;
                                i20 = i21;
                            } else {
                                i19 = i21;
                            }
                        }
                        i4 = z4 ? i3 : i20;
                    } else {
                        i4 = iMo3388h;
                    }
                    int iMo3387c2 = b04Var.mo3387c(i4);
                    if (iMo3387c2 != -1 && (iMo3386b = b04Var.mo3386b(iMo3387c2)) < iMo3389i) {
                        if (iMo3386b >= iMo3388h) {
                            iMo3388h = iMo3386b;
                        }
                        if (iMo3387c2 > iMo3389i) {
                            iMo3387c2 = iMo3389i;
                        }
                        ff2VarArr2 = ff2VarArr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int iMo3387c3 = iMo3387c2;
                        while (true) {
                            rectF3.left = z4 ? fArr[((iMo3387c3 - 1) - lineStart) * 2] : fArr[(iMo3388h - lineStart) * 2];
                            rectF3.right = z4 ? m4320u(iMo3388h, lineStart, fArr) : m4320u(iMo3387c3 - 1, lineStart, fArr);
                            if (((Boolean) c1017p0.invoke(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iMo3388h = b04Var.mo3388h(iMo3388h);
                            if (iMo3388h != -1 && iMo3388h < iMo3389i) {
                                iMo3387c3 = b04Var.mo3387c(iMo3388h);
                                if (iMo3387c3 > iMo3389i) {
                                    iMo3387c3 = iMo3389i;
                                }
                            }
                        }
                    } else {
                        ff2VarArr2 = ff2VarArr;
                    }
                    iMo3388h = -1;
                    break;
                } else {
                    ff2VarArr2 = ff2VarArr;
                    iMo3388h = -1;
                    break;
                }
            }
            if (iMo3388h >= 0) {
                return iMo3388h;
            }
            if (i11 == i12) {
                return -1;
            }
            i11 += i14;
            i13 = i14;
            ff2VarArr = ff2VarArr2;
        }
    }

    /* JADX INFO: renamed from: x */
    public static final int m4323x(ve4 ve4Var) {
        gf4 gf4VarM11888b = ve4Var.m11888b("SELECT changes()");
        try {
            gf4VarM11888b.mo5112g();
            int i = (int) gf4VarM11888b.getLong(0);
            sc6.m10672m(gf4VarM11888b, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                sc6.m10672m(gf4VarM11888b, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m4324y(C1116rp c1116rp) {
        if (C1116rp.f29487i == null) {
            C1116rp.f29487i = new C1116rp();
            C0991op c0991op = new C0991op("Okio Watchdog");
            c0991op.setDaemon(true);
            c0991op.start();
        }
        long jNanoTime = System.nanoTime();
        long j = c1116rp.f35336c;
        boolean z = c1116rp.f35334a;
        if (j != 0 && z) {
            c1116rp.f29494g = Math.min(j, c1116rp.mo7563c() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            c1116rp.f29494g = jNanoTime + j;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            c1116rp.f29494g = c1116rp.mo7563c();
        }
        hf0 hf0Var = C1116rp.f29486h;
        int i = hf0Var.f20528b + 1;
        hf0Var.f20528b = i;
        C1116rp[] c1116rpArr = (C1116rp[]) hf0Var.f20529c;
        if (i == c1116rpArr.length) {
            C1116rp[] c1116rpArr2 = new C1116rp[i * 2];
            AbstractC0990oo.m9201V(0, 0, 14, c1116rpArr, c1116rpArr2);
            hf0Var.f20529c = c1116rpArr2;
        }
        hf0Var.m6378l(i, c1116rp);
        if (c1116rp.f29493f == 1) {
            C1116rp.f29489k.signal();
        }
    }

    /* JADX INFO: renamed from: z */
    public static b24 m4325z(mq1 mq1Var) {
        b24 b24Var = new b24();
        b24Var.f15042c = C0006a5.m74l(b24Var, b24Var, mq1Var);
        return b24Var;
    }
}
