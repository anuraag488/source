package p000;

import ads_mobile_sdk.fs0;
import ads_mobile_sdk.i11;
import ads_mobile_sdk.j11;
import ads_mobile_sdk.k11;
import ads_mobile_sdk.l11;
import ads_mobile_sdk.m11;
import ads_mobile_sdk.n11;
import ads_mobile_sdk.o11;
import ads_mobile_sdk.p11;
import ads_mobile_sdk.pm1;
import ads_mobile_sdk.r11;
import ads_mobile_sdk.s11;
import ads_mobile_sdk.t11;
import ads_mobile_sdk.u11;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Vibrator;
import android.util.Log;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public abstract class qq2 implements i81, jf3 {

    /* JADX INFO: renamed from: g */
    public static final t92 f28688g;

    /* JADX INFO: renamed from: h */
    public static final z45 f28689h;

    /* JADX INFO: renamed from: a */
    public static final C1114rn f28682a = new C1114rn(0);

    /* JADX INFO: renamed from: b */
    public static final C1114rn f28683b = new C1114rn(1);

    /* JADX INFO: renamed from: c */
    public static final pg0 f28684c = new pg0(-1751512043, false, new tg0(14));

    /* JADX INFO: renamed from: d */
    public static final int[] f28685d = new int[0];

    /* JADX INFO: renamed from: e */
    public static final long[] f28686e = new long[0];

    /* JADX INFO: renamed from: f */
    public static final Object[] f28687f = new Object[0];

    /* JADX INFO: renamed from: i */
    public static final kh5 f28690i = new kh5(4);

    static {
        byte b = 2;
        f28688g = new t92(b);
        f28689h = new z45(b);
    }

    /* JADX INFO: renamed from: A */
    public static final nt2 m10006A(mi0 mi0Var, nt2 nt2Var) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6885d0(439770924);
        nt2 nt2VarM10042z = m10042z(ir1Var, nt2Var);
        ir1Var.m6912r(false);
        return nt2VarM10042z;
    }

    /* JADX INFO: renamed from: B */
    public static final void m10007B(Object obj) {
        if (obj instanceof yc1) {
            ((yc1) obj).f35112a.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: C */
    public static final mq1 m10008C(mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        xz4 xz4Var = (xz4) ir1Var.m6898k(la1.f23888a);
        Object objM6869O = ir1Var.m6869O();
        if (objM6869O == ki0.f23136a) {
            objM6869O = new it1((Object) xz4Var, (wm0) null, (byte) 2);
            ir1Var.m6905n0(objM6869O);
        }
        return (mq1) objM6869O;
    }

    /* JADX INFO: renamed from: D */
    public static int m10009D(double d) {
        if (Double.isNaN(d)) {
            C1077qn.m9987m("Cannot round NaN value.");
            return 0;
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    /* JADX INFO: renamed from: E */
    public static int m10010E(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        C1077qn.m9987m("Cannot round NaN value.");
        return 0;
    }

    /* JADX INFO: renamed from: F */
    public static long m10011F(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        C1077qn.m9987m("Cannot round NaN value.");
        return 0L;
    }

    /* JADX INFO: renamed from: G */
    public static void m10012G(PendingIntent pendingIntent) throws PendingIntent.CanceledException {
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            pendingIntent.send();
            return;
        }
        try {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            if (i >= 36) {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
            } else {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
            }
            pendingIntent.send(activityOptionsMakeBasic.toBundle());
        } catch (PendingIntent.CanceledException e) {
            Log.e("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e);
        }
    }

    /* JADX INFO: renamed from: H */
    public static final vt0 m10013H(wp1 wp1Var) {
        return m10032p(new C1160sw(wp1Var, null));
    }

    /* JADX INFO: renamed from: I */
    public static db4 m10014I(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new db4(f, f2, obj);
    }

    /* JADX INFO: renamed from: J */
    public static String m10015J(int i) {
        if (i == 0) {
            return "Clear";
        }
        if (i == 1) {
            return "Src";
        }
        if (i == 2) {
            return "Dst";
        }
        if (i == 3) {
            return "SrcOver";
        }
        if (i == 4) {
            return "DstOver";
        }
        if (i == 5) {
            return "SrcIn";
        }
        if (i == 6) {
            return "DstIn";
        }
        if (i == 7) {
            return "SrcOut";
        }
        if (i == 8) {
            return "DstOut";
        }
        if (i == 9) {
            return "SrcAtop";
        }
        if (i == 10) {
            return "DstAtop";
        }
        if (i == 11) {
            return "Xor";
        }
        if (i == 12) {
            return "Plus";
        }
        if (i == 13) {
            return "Modulate";
        }
        if (i == 14) {
            return "Screen";
        }
        if (i == 15) {
            return "Overlay";
        }
        if (i == 16) {
            return "Darken";
        }
        if (i == 17) {
            return "Lighten";
        }
        if (i == 18) {
            return "ColorDodge";
        }
        if (i == 19) {
            return "ColorBurn";
        }
        if (i == 20) {
            return "HardLight";
        }
        if (i == 21) {
            return "Softlight";
        }
        if (i == 22) {
            return "Difference";
        }
        if (i == 23) {
            return "Exclusion";
        }
        if (i == 24) {
            return "Multiply";
        }
        if (i == 25) {
            return "Hue";
        }
        if (i == 26) {
            return "Saturation";
        }
        if (i == 27) {
            return "Color";
        }
        return i == 28 ? "Luminosity" : "Unknown";
    }

    /* JADX INFO: renamed from: K */
    public static rq4 m10016K(int i, int i2, g51 g51Var, int i3) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            g51Var = h51.f20396a;
        }
        return new rq4(i, i2, g51Var);
    }

    /* JADX INFO: renamed from: a */
    public static final void m10017a(sn0 sn0Var, yp1 yp1Var, nt2 nt2Var, boolean z, String str, mq1 mq1Var, mi0 mi0Var, int i) {
        boolean z2;
        pn0 pn0VarM8040b;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-47112738);
        byte b = 4;
        int i2 = (ir1Var.m6890g(sn0Var) ? 4 : 2) | i | (ir1Var.m6894i(yp1Var) ? 32 : 16) | (ir1Var.m6890g(nt2Var) ? 256 : 128) | 3072;
        if ((i & 24576) == 0) {
            i2 |= ir1Var.m6890g(str) ? 16384 : 8192;
        }
        if (ir1Var.m6871T(i2 & 1, (74899 & i2) != 74898)) {
            lu2 lu2Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24280d;
            if (sn0Var == null) {
                ir1Var.m6885d0(919031122);
                ir1Var.m6912r(false);
                pn0VarM8040b = null;
            } else {
                ir1Var.m6885d0(1969308815);
                pn0VarM8040b = ln0.m8040b(sn0Var, "editor", ir1Var);
                ir1Var.m6912r(false);
            }
            boolean zM6890g = ir1Var.m6890g(lu2Var);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                C0713h5 c0713h5 = new C0713h5((byte) 5);
                c0713h5.f20393b = lu2Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0713h5);
                obj = c0713h5;
            }
            obj = objM6869O;
            mt4 mt4Var = new mt4();
            mt4Var.f25211a = str;
            mt4Var.f25212b = mq1Var;
            mt4Var.f25213c = yp1Var;
            VarHandle.storeStoreFence();
            ev0.m5331F(pn0VarM8040b, nt2Var, (yp1) obj, null, null, null, vd6.m11834R(-1087159695, mt4Var, ir1Var), ir1Var, ((i2 >> 3) & 112) | 1572864, 56);
            z2 = true;
        } else {
            ir1Var.m6874W();
            z2 = z;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1014oy c1014oy = new C1014oy(b);
            c1014oy.f27199d = sn0Var;
            c1014oy.f27200e = yp1Var;
            c1014oy.f27201f = nt2Var;
            c1014oy.f27197b = z2;
            c1014oy.f27202g = str;
            c1014oy.f27203h = mq1Var;
            c1014oy.f27198c = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1014oy;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10018b(nv2 nv2Var, mi0 mi0Var, int i) {
        int i2;
        yk3 yk3VarM6916v;
        iv1 iv1Var;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1313975704);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(nv2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 1;
        byte b2 = 0;
        if (ir1Var.m6871T(i2 & 1, (i2 & 3) != 2)) {
            lv1 lv1Var = (lv1) ir1Var.m6898k(nv1.f26110a);
            if (lv1Var == null) {
                yk3VarM6916v = ir1Var.m6916v();
                if (yk3VarM6916v == null) {
                    return;
                } else {
                    iv1Var = new iv1(b2);
                }
            } else if (((Boolean) z62.m13392t(nv2Var, ir1Var, i2 & 14).getValue()).booleanValue()) {
                ir1Var.m6885d0(318495242);
                r50 r50Var = i41.f21117b;
                long jM3239R = as4.m3239R(((fy4) ir1Var.m6898k(ij0.f21485t)).mo5858c(), m41.MILLISECONDS);
                Vibrator vibrator = (Vibrator) ((Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b)).getSystemService(Vibrator.class);
                boolean zM6894i = ir1Var.m6894i(vibrator) | ir1Var.m6888f(jM3239R) | ir1Var.m6890g(lv1Var);
                Object objM6869O = ir1Var.m6869O();
                if (zM6894i || objM6869O == ki0.f23136a) {
                    jv1 jv1Var = new jv1(vibrator, jM3239R, lv1Var, null);
                    ir1Var.m6905n0(jv1Var);
                    objM6869O = jv1Var;
                }
                lb5.m7926g(ir1Var, (mq1) objM6869O, ju4.f22634a);
                ir1Var.m6912r(false);
            } else {
                ir1Var.m6885d0(319909834);
                ir1Var.m6912r(false);
            }
            iv1Var.f21818b = nv2Var;
            iv1Var.f21819c = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = iv1Var;
        }
        ir1Var.m6874W();
        yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            iv1Var = new iv1(b);
            iv1Var.f21818b = nv2Var;
            iv1Var.f21819c = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = iv1Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final sw0 m10019c(yp1 yp1Var) {
        sw0 sw0Var = new sw0();
        sw0Var.f30605a = yp1Var;
        rw0 rw0Var = new rw0();
        rw0Var.f29676a = sw0Var;
        VarHandle.storeStoreFence();
        sw0Var.f30606b = rw0Var;
        sw0Var.f30607c = new dx2();
        Boolean bool = Boolean.FALSE;
        sw0Var.f30608d = k43.m7398w(bool);
        sw0Var.f30609e = k43.m7398w(bool);
        sw0Var.f30610f = k43.m7398w(bool);
        VarHandle.storeStoreFence();
        return sw0Var;
    }

    /* JADX INFO: renamed from: d */
    public static final Intent m10020d(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        return intent;
    }

    /* JADX INFO: renamed from: e */
    public static String m10021e(i11 i11Var) {
        if (i11Var.mo1256a() == pm1.f8670a) {
            fs0[] fs0VarArr = fs0.f3672h;
            return "Internal error.";
        }
        if (i11Var instanceof t11) {
            fs0[] fs0VarArr2 = fs0.f3672h;
            return "Internal error.";
        }
        if (i11Var instanceof s11) {
            s11 s11Var = (s11) i11Var;
            return "WebView HTTP error " + s11Var.f10992c + ": " + s11Var.f10993d + " on url: " + s11Var.f10994e;
        }
        if (i11Var instanceof u11) {
            fs0[] fs0VarArr3 = fs0.f3672h;
            return "The system WebView required for this operation was terminated.";
        }
        if (i11Var instanceof m11) {
            return ((m11) i11Var).f7072c;
        }
        if (i11Var instanceof j11) {
            j11 j11Var = (j11) i11Var;
            String str = j11Var.f5516e;
            return str == null ? j11Var.f5514c.toString() : str;
        }
        if (i11Var instanceof l11) {
            return ((l11) i11Var).f6569c.toString();
        }
        if (i11Var instanceof k11) {
            return i11Var.toString();
        }
        if (i11Var instanceof p11) {
            return ((p11) i11Var).f8435c;
        }
        if (i11Var instanceof n11) {
            return ((n11) i11Var).f7498c;
        }
        if (i11Var instanceof r11) {
            return ((r11) i11Var).f10533c;
        }
        if (i11Var instanceof o11) {
            return ((o11) i11Var).f7931c;
        }
        C0670g.m5864c();
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final String m10022f(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(z80.f35863a));
            return String.format(Locale.US, "%032X", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest())}, 1));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static final Throwable m10023g(Throwable th) {
        return th instanceof ka5 ? ((ka5) th).mo319a() : th;
    }

    /* JADX INFO: renamed from: h */
    public static final int m10024h(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX INFO: renamed from: i */
    public static final int m10025i(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: j */
    public static void m10026j(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            xd2.m12665l(i3, zi4.m13624x("fromIndex: ", i, ", toIndex: ", i2, ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            C1077qn.m9987m(zi4.m13618r(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m10027k(long j, d63 d63Var) {
        if (d63Var == d63.f16814a) {
            if (kl0.m7538h(j) != Integer.MAX_VALUE) {
                return;
            }
            t32.m10970c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (kl0.m7539i(j) != Integer.MAX_VALUE) {
                return;
            }
            t32.m10970c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    /* JADX INFO: renamed from: l */
    public static final sw2 m10028l(si1 si1Var, Object obj, mi0 mi0Var, int i, int i2) {
        ir1 ir1Var = (ir1) mi0Var;
        r71 r71Var = r71.f29063a;
        boolean zM6894i = ir1Var.m6894i(r71Var) | ir1Var.m6894i(si1Var);
        Object objM6869O = ir1Var.m6869O();
        if (zM6894i || objM6869O == ki0.f23136a) {
            objM6869O = new C1199ty((Object) r71Var, (Object) si1Var, (wm0) null, (byte) 8);
            ir1Var.m6905n0(objM6869O);
        }
        return z62.m13359R(obj, si1Var, r71Var, (mq1) objM6869O, ir1Var, ((i >> 3) & 14) | (i & 896));
    }

    /* JADX INFO: renamed from: m */
    public static nt2 m10029m(nt2 nt2Var, nq1 nq1Var) {
        ji0 ji0Var = new ji0();
        ji0Var.f22297r = nq1Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(ji0Var);
    }

    /* JADX INFO: renamed from: n */
    public static void m10030n(long[] jArr, long[] jArr2, int i) {
        int i2 = -i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = (int) jArr[i3];
            jArr[i3] = i4 ^ ((((int) jArr2[i3]) ^ i4) & i2);
        }
    }

    /* JADX INFO: renamed from: o */
    public static jf3 m10031o(C1135s7 c1135s7) {
        byte[] bArrM11250c = ((u50) c1135s7.f29938v.f33259b).m11250c();
        kf3 kf3Var = new kf3();
        kw4.m7669a(bArrM11250c.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArrM11250c, "AES");
        if (!zi4.m13603c(1)) {
            xy4.m12788q("Can not use AES-CMAC in FIPS-mode.");
            return null;
        }
        Cipher cipher = (Cipher) kf3.f23099a.get();
        cipher.init(1, secretKeySpec);
        zt5.m13786q(zt5.m13786q(cipher.doFinal(new byte[16])));
        VarHandle.storeStoreFence();
        try {
            q50.m9726h(c1135s7);
            i50 i50Var = new i50((byte) 15);
            VarHandle.storeStoreFence();
            return i50Var;
        } catch (GeneralSecurityException unused) {
            return kf3Var;
        }
    }

    /* JADX INFO: renamed from: p */
    public static final vt0 m10032p(mq1 mq1Var) {
        vt0 vt0Var = new vt0((byte) 2);
        vt0Var.f32851b = mq1Var;
        VarHandle.storeStoreFence();
        return vt0Var;
    }

    /* JADX INFO: renamed from: q */
    public static final vt0 m10033q(Object obj) {
        vt0 vt0Var = new vt0((byte) 1);
        vt0Var.f32851b = obj;
        VarHandle.storeStoreFence();
        return vt0Var;
    }

    /* JADX INFO: renamed from: r */
    public static qr2 m10034r(String str) {
        Matcher matcher = qr2.f28726c.matcher(str);
        if (!matcher.lookingAt()) {
            C1077qn.m9988n(zi4.m13617q('\"', "No subtype found for: \"", str));
            return null;
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        strGroup.toLowerCase(locale);
        matcher.group(2).toLowerCase(locale);
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = qr2.f28727d.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + str.substring(iEnd) + "\" for: \"" + str + '\"').toString());
            }
            String strGroup2 = matcher2.group(1);
            if (strGroup2 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup3 = matcher2.group(2);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(3);
                } else if (od4.m9043X(strGroup3, "'", false) && od4.m9038S(strGroup3, "'", false) && strGroup3.length() > 2) {
                    strGroup3 = strGroup3.substring(1, strGroup3.length() - 1);
                }
                arrayList.add(strGroup2);
                arrayList.add(strGroup3);
                iEnd = matcher2.end();
            }
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        qr2 qr2Var = new qr2();
        qr2Var.f28728a = str;
        qr2Var.f28729b = strArr;
        VarHandle.storeStoreFence();
        return qr2Var;
    }

    /* JADX INFO: renamed from: s */
    public static final Object m10035s(sq2 sq2Var) {
        Object objMo4423m = sq2Var.mo4423m();
        hf2 hf2Var = objMo4423m instanceof hf2 ? (hf2) objMo4423m : null;
        if (hf2Var != null) {
            return hf2Var.f20531o;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static int m10036t(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        C1077qn.m9987m(c75.m3877i(i, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    /* JADX INFO: renamed from: u */
    public static e32 m10037u(j41 j41Var, int i) {
        sn3 sn3Var = sn3.f30409a;
        e32 e32Var = new e32();
        e32Var.f17661a = j41Var;
        e32Var.f17662b = sn3Var;
        if (j41Var instanceof rq4) {
            rq4 rq4Var = (rq4) j41Var;
            if (rq4Var.f29529a != 0 || rq4Var.f29530b != 0) {
                VarHandle.storeStoreFence();
                return e32Var;
            }
        } else if (!(j41Var instanceof d94)) {
            if (!(j41Var instanceof rd2)) {
                VarHandle.storeStoreFence();
                return e32Var;
            }
            if (((rd2) j41Var).f29184a.f28397a != 0) {
                VarHandle.storeStoreFence();
                return e32Var;
            }
        }
        C1077qn.m9987m("Animation to be infinitely repeated cannot have a 0-duration");
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static final C1297wl m10038v(mi0 mi0Var, wp1 wp1Var) {
        mq1 mq1VarM10008C = m10008C(mi0Var);
        pw3 pw3VarM10148d = qw3.m10148d(mi0Var);
        C1297wl c1297wl = new C1297wl((byte) 3);
        c1297wl.f33457b = pw3VarM10148d;
        c1297wl.f33458c = mq1VarM10008C;
        c1297wl.f33459d = wp1Var;
        VarHandle.storeStoreFence();
        return c1297wl;
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m10039w(wf2 wf2Var) {
        if (wf2Var.f33319i == null) {
            return false;
        }
        wf2 wf2VarM12295v = wf2Var.m12295v();
        return (wf2VarM12295v != null ? wf2VarM12295v.f33319i : null) == null || wf2Var.f33300H.f14469b;
    }

    /* JADX INFO: renamed from: x */
    public static final wv1 m10040x(r50 r50Var, String str, Executor executor, wp1 wp1Var) {
        p53 p53Var = wv1.f33770m;
        qv2 qv2Var = new qv2();
        qv2Var.f28822a = new Object();
        qv2Var.f28823b = new zt3();
        qv2Var.f28824c = 0;
        qv2Var.f28827f = qv2.f28821k;
        qv2Var.f28831j = new RunnableC1029pc(qv2Var);
        qv2Var.f28826e = p53Var;
        qv2Var.f28828g = 0;
        VarHandle.storeStoreFence();
        xj0 xj0Var = new xj0();
        xj0Var.f34312a = executor;
        xj0Var.f34313b = r50Var;
        xj0Var.f34314c = str;
        xj0Var.f34315d = wp1Var;
        xj0Var.f34316e = qv2Var;
        VarHandle.storeStoreFence();
        AbstractC0647fd.m5686z(xj0Var);
        return new wv1((byte) 10);
    }

    /* JADX INFO: renamed from: y */
    public static final nt2 m10041y(Object obj) {
        gf2 gf2Var = new gf2();
        gf2Var.f19767a = obj;
        VarHandle.storeStoreFence();
        return gf2Var;
    }

    /* JADX INFO: renamed from: z */
    public static final nt2 m10042z(mi0 mi0Var, nt2 nt2Var) {
        if (nt2Var.mo7629b(new dh0((byte) 5))) {
            return nt2Var;
        }
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6887e0(1219399079);
        C1017p0 c1017p0 = new C1017p0((byte) 11);
        c1017p0.f27254b = ir1Var;
        VarHandle.storeStoreFence();
        nt2 nt2Var2 = (nt2) nt2Var.mo7628a(c1017p0, kt2.f23428a);
        ir1Var.m6912r(false);
        return nt2Var2;
    }
}
