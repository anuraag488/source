package p000;

import ads_mobile_sdk.AbstractC0241mu;
import ads_mobile_sdk.C0033as;
import ads_mobile_sdk.C0313rh;
import ads_mobile_sdk.EnumC0263nu;
import ads_mobile_sdk.ey0;
import ads_mobile_sdk.fp3;
import ads_mobile_sdk.z21;
import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Path;
import android.os.Build;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class zy5 {

    /* JADX INFO: renamed from: a */
    public static Boolean f36472a;

    /* JADX INFO: renamed from: q */
    public static yn5 f36488q;

    /* JADX INFO: renamed from: r */
    public static String f36489r;

    /* JADX INFO: renamed from: t */
    public static g12 f36491t;

    /* JADX INFO: renamed from: b */
    public static final Object[] f36473b = new Object[0];

    /* JADX INFO: renamed from: c */
    public static final pg0 f36474c = new pg0(1884804699, false, new xg0(14));

    /* JADX INFO: renamed from: d */
    public static final pg0 f36475d = new pg0(509732134, false, new me0(2));

    /* JADX INFO: renamed from: e */
    public static final pg0 f36476e = new pg0(-1853176480, false, new ah0(14));

    /* JADX INFO: renamed from: f */
    public static final pg0 f36477f = new pg0(1488589183, false, new ah0(15));

    /* JADX INFO: renamed from: g */
    public static final pg0 f36478g = new pg0(-255502427, false, new ah0(16));

    /* JADX INFO: renamed from: h */
    public static final pg0 f36479h = new pg0(1120521086, false, new xg0(16));

    /* JADX INFO: renamed from: i */
    public static final pg0 f36480i = new pg0(1752402396, false, new ah0(17));

    /* JADX INFO: renamed from: j */
    public static final pg0 f36481j = new pg0(1261071221, false, new xg0(17));

    /* JADX INFO: renamed from: k */
    public static final pg0 f36482k = new pg0(-1082103373, false, new xg0(15));

    /* JADX INFO: renamed from: l */
    public static final pg0 f36483l = new pg0(1707099552, false, new ah0(11));

    /* JADX INFO: renamed from: m */
    public static final pg0 f36484m = new pg0(1552619868, false, new ah0(12));

    /* JADX INFO: renamed from: n */
    public static final pg0 f36485n = new pg0(297251097, false, new ah0(13));

    /* JADX INFO: renamed from: o */
    public static final Object f36486o = new Object();

    /* JADX INFO: renamed from: p */
    public static final z45 f36487p = new z45(14);

    /* JADX INFO: renamed from: s */
    public static final Object f36490s = new Object();

    /* JADX INFO: renamed from: A */
    public static int m13837A(ri3 ri3Var, si3 si3Var, int[] iArr) {
        int i;
        int i2;
        int iOrdinal = si3Var.ordinal();
        if (iOrdinal == 0) {
            i = (-iArr[m13848L(ri3Var.f29316a, ri3Var.f29319d, ri3Var.f29321f)]) + iArr[m13848L(ri3Var.f29316a, ri3Var.f29319d, ri3Var.f29320e)] + iArr[m13848L(ri3Var.f29316a, ri3Var.f29318c, ri3Var.f29321f)];
            i2 = iArr[m13848L(ri3Var.f29316a, ri3Var.f29318c, ri3Var.f29320e)];
        } else if (iOrdinal == 1) {
            i = (-iArr[m13848L(ri3Var.f29317b, ri3Var.f29318c, ri3Var.f29321f)]) + iArr[m13848L(ri3Var.f29317b, ri3Var.f29318c, ri3Var.f29320e)] + iArr[m13848L(ri3Var.f29316a, ri3Var.f29318c, ri3Var.f29321f)];
            i2 = iArr[m13848L(ri3Var.f29316a, ri3Var.f29318c, ri3Var.f29320e)];
        } else {
            if (iOrdinal != 2) {
                C0670g.m5864c();
                return 0;
            }
            i = (-iArr[m13848L(ri3Var.f29317b, ri3Var.f29319d, ri3Var.f29320e)]) + iArr[m13848L(ri3Var.f29317b, ri3Var.f29318c, ri3Var.f29320e)] + iArr[m13848L(ri3Var.f29316a, ri3Var.f29319d, ri3Var.f29320e)];
            i2 = iArr[m13848L(ri3Var.f29316a, ri3Var.f29318c, ri3Var.f29320e)];
        }
        return i - i2;
    }

    /* JADX INFO: renamed from: B */
    public static final long m13838B(long j, long j2) {
        float f;
        float f2;
        long jM9463b = pb0.m9463b(j, pb0.m9467f(j2));
        float fM9465d = pb0.m9465d(j2);
        float fM9465d2 = pb0.m9465d(jM9463b);
        float f3 = 1.0f - fM9465d2;
        float f4 = (fM9465d * f3) + fM9465d2;
        float fM9469h = pb0.m9469h(jM9463b);
        float fM9469h2 = pb0.m9469h(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((fM9469h2 * fM9465d) * f3) + (fM9469h * fM9465d2)) / f4;
        }
        float fM9468g = pb0.m9468g(jM9463b);
        float fM9468g2 = pb0.m9468g(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fM9468g2 * fM9465d) * f3) + (fM9468g * fM9465d2)) / f4;
        }
        float fM9466e = pb0.m9466e(jM9463b);
        float fM9466e2 = pb0.m9466e(j2);
        if (f4 != 0.0f) {
            f5 = (((fM9466e2 * fM9465d) * f3) + (fM9466e * fM9465d2)) / f4;
        }
        return m13884s(f, f2, f5, f4, pb0.m9467f(j2));
    }

    /* JADX INFO: renamed from: C */
    public static final Object m13839C(AccessibilityService accessibilityService, GestureDescription gestureDescription, of4 of4Var) {
        b70 b70Var = new b70(1, C0006a5.m86x(of4Var));
        b70Var.m3497u();
        if (!accessibilityService.dispatchGesture(gestureDescription, new bw4(b70Var), null) && (b70Var.m3496t() instanceof s13)) {
            b70Var.resumeWith(Boolean.FALSE);
        }
        Object objM3495r = b70Var.m3495r();
        ap0 ap0Var = ap0.f14763a;
        return objM3495r;
    }

    /* JADX INFO: renamed from: D */
    public static final si1 m13840D(si1 si1Var) {
        if ((si1Var instanceof yb4) || (si1Var instanceof d11)) {
            return si1Var;
        }
        d11 d11Var = new d11();
        d11Var.f16700a = si1Var;
        VarHandle.storeStoreFence();
        return d11Var;
    }

    /* JADX INFO: renamed from: E */
    public static final void m13841E(C0489bf c0489bf, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((d2 * dSin) + (d * dCos)) / d10;
        double d13 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d14 = ((d4 * dSin) + (d3 * dCos)) / d10;
        double d15 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d20) / 1.99999d);
            m13841E(c0489bf, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d21);
        double d22 = d16 * dSqrt2;
        double d23 = dSqrt2 * d17;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double dAtan2 = Math.atan2(d13 - d9, d12 - d8);
        double dAtan3 = Math.atan2(d15 - d9, d14 - d8) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * dCos) - (d25 * dSin);
        double d27 = (d25 * dCos) + (d24 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d28 = -d10;
        double d29 = d28 * dCos2;
        double d30 = d6 * dSin2;
        double d31 = (d29 * dSin3) - (d30 * dCos3);
        double d32 = d28 * dSin2;
        double d33 = d6 * dCos2;
        double d34 = (dCos3 * d33) + (dSin3 * d32);
        double d35 = dAtan3 / ((double) iCeil);
        double d36 = dAtan2;
        double d37 = d31;
        int i = 0;
        double d38 = d34;
        double d39 = d2;
        while (i < iCeil) {
            double d40 = d36 + d35;
            double dSin4 = Math.sin(d40);
            double dCos4 = Math.cos(d40);
            int i2 = iCeil;
            double d41 = (((d10 * dCos2) * dCos4) + d26) - (d30 * dSin4);
            double d42 = (d33 * dSin4) + (d10 * dSin2 * dCos4) + d27;
            double d43 = (d29 * dSin4) - (d30 * dCos4);
            double d44 = (dCos4 * d33) + (dSin4 * d32);
            double d45 = d40 - d36;
            double dTan = Math.tan(d45 / 2.0d);
            double dSqrt3 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            c0489bf.m3560c((float) ((d37 * dSqrt3) + d), (float) ((d38 * dSqrt3) + d39), (float) (d41 - (dSqrt3 * d43)), (float) (d42 - (dSqrt3 * d44)), (float) d41, (float) d42);
            d35 = d35;
            d = d41;
            i++;
            d32 = d32;
            dSin2 = dSin2;
            d26 = d26;
            d36 = d40;
            d38 = d44;
            d37 = d43;
            iCeil = i2;
            d39 = d42;
            d10 = d5;
        }
    }

    /* JADX INFO: renamed from: F */
    public static String m13842F(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
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
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                        } else {
                            sb.append((char) b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: G */
    public static final void m13843G(ve4 ve4Var, String str) {
        gf4 gf4VarM11888b = ve4Var.m11888b(str);
        try {
            gf4VarM11888b.mo5112g();
            sc6.m10672m(gf4VarM11888b, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                sc6.m10672m(gf4VarM11888b, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public static final sl1 m13844H(sl1 sl1Var) {
        sl1 sl1VarM3620f = ((bl1) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(sl1Var)).getFocusOwner()).m3620f();
        if (sl1VarM3620f == null || !sl1VarM3620f.f25208n) {
            return null;
        }
        return sl1VarM3620f;
    }

    /* JADX INFO: renamed from: I */
    public static final sx3 m13845I(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((sx3) arrayList.get(i2)).f30634a == i) {
                return (sx3) arrayList.get(i2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public static final jl3 m13846J(sl1 sl1Var) {
        e13 e13Var;
        if (sl1Var.f25208n && (e13Var = sl1Var.f25202h) != null) {
            cf2 cf2VarM12861j0 = y42.m12861j0(e13Var);
            if (!cf2VarM12861j0.mo4000K()) {
                cf2VarM12861j0 = null;
            }
            if (cf2VarM12861j0 != null) {
                return sl1Var.m10856R0(cf2VarM12861j0);
            }
        }
        return jl3.f22395e;
    }

    /* JADX INFO: renamed from: K */
    public static final sl1 m13847K(sl1 sl1Var) {
        boolean z = sl1Var.f25195a.f25208n;
        if (z) {
            if (!z) {
                q32.m9721c("visitChildren called on an unattached node");
            }
            uw2 uw2Var = new uw2(new mt2[16]);
            mt2 mt2Var = sl1Var.f25195a;
            mt2 mt2Var2 = mt2Var.f25200f;
            if (mt2Var2 == null) {
                sc6.m10663e(uw2Var, mt2Var);
            } else {
                uw2Var.m11663b(mt2Var2);
            }
            while (true) {
                int i = uw2Var.f32213c;
                if (i == 0) {
                    break;
                }
                mt2 mt2VarM10644P = (mt2) uw2Var.m11672l(i - 1);
                if ((mt2VarM10644P.f25198d & 1024) == 0) {
                    sc6.m10663e(uw2Var, mt2VarM10644P);
                } else {
                    while (mt2VarM10644P != null) {
                        if ((mt2VarM10644P.f25197c & 1024) != 0) {
                            uw2 uw2Var2 = null;
                            while (mt2VarM10644P != null) {
                                if (mt2VarM10644P instanceof sl1) {
                                    sl1 sl1Var2 = (sl1) mt2VarM10644P;
                                    if (sl1Var2.f25195a.f25208n) {
                                        int iOrdinal = sl1Var2.m10858T0().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return sl1Var2;
                                        }
                                        if (iOrdinal != 3) {
                                            C0670g.m5864c();
                                            return null;
                                        }
                                    }
                                } else if ((mt2VarM10644P.f25197c & 1024) != 0 && (mt2VarM10644P instanceof qx0)) {
                                    int i2 = 0;
                                    for (mt2 mt2Var3 = ((qx0) mt2VarM10644P).f28863p; mt2Var3 != null; mt2Var3 = mt2Var3.f25200f) {
                                        if ((mt2Var3.f25197c & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                mt2VarM10644P = mt2Var3;
                                            } else {
                                                if (uw2Var2 == null) {
                                                    uw2Var2 = new uw2(new mt2[16]);
                                                }
                                                if (mt2VarM10644P != null) {
                                                    uw2Var2.m11663b(mt2VarM10644P);
                                                    mt2VarM10644P = null;
                                                }
                                                uw2Var2.m11663b(mt2Var3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                mt2VarM10644P = sc6.m10644P(uw2Var2);
                            }
                            break;
                        }
                        mt2VarM10644P = mt2VarM10644P.f25200f;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public static int m13848L(int i, int i2, int i3) {
        return sk5.m10848n((i << 10) + (i << 6) + i, i2 << 5, i2, i3);
    }

    /* JADX INFO: renamed from: M */
    public static final jl4 m13849M(e14 e14Var) {
        yp1 yp1Var;
        ArrayList arrayList = new ArrayList();
        Object objM8132g = e14Var.f17631a.m8132g(d14.f16704a);
        if (objM8132g == null) {
            objM8132g = null;
        }
        C1353y2 c1353y2 = (C1353y2) objM8132g;
        if (c1353y2 == null || (yp1Var = (yp1) c1353y2.f34818b) == null || !((Boolean) yp1Var.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (jl4) arrayList.get(0);
    }

    /* JADX INFO: renamed from: N */
    public static final boolean m13850N(e14 e14Var) {
        p14 p14Var = m14.f24570s;
        lw2 lw2Var = e14Var.f17631a;
        Object objM8132g = lw2Var.m8132g(p14Var);
        if (objM8132g == null) {
            objM8132g = null;
        }
        bm0.f15408a.getClass();
        if (z62.m13387o(objM8132g, am0.f14623b)) {
            return false;
        }
        return lw2Var.m8127b(d14.f16710g) || lw2Var.m8127b(d14.f16711h);
    }

    /* JADX INFO: renamed from: O */
    public static final boolean m13851O(sl1 sl1Var) {
        wf2 wf2Var;
        e13 e13Var;
        wf2 wf2Var2;
        e13 e13Var2 = sl1Var.f25202h;
        return (e13Var2 == null || (wf2Var = e13Var2.f17625u) == null || !wf2Var.m12257K() || (e13Var = sl1Var.f25202h) == null || (wf2Var2 = e13Var.f17625u) == null || !wf2Var2.m12256J()) ? false : true;
    }

    /* JADX INFO: renamed from: P */
    public static final long m13852P(sw2 sw2Var, long j) {
        int iOrdinal = ((yx2) sw2Var.getValue()).ordinal();
        if (iOrdinal == 0) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat >= 0.0f ? fIntBitsToFloat : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L);
        }
        if (iOrdinal == 1) {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat2 <= 0.0f ? fIntBitsToFloat2 : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L);
        }
        if (iOrdinal != 2) {
            C0670g.m5864c();
            return 0L;
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4 <= 0.0f ? fIntBitsToFloat4 : 0.0f)) & 4294967295L);
    }

    /* JADX INFO: renamed from: Q */
    public static final wf4 m13853Q(wf4 wf4Var, sw2 sw2Var) {
        int i;
        int iOrdinal = ((yx2) sw2Var.getValue()).ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    C0670g.m5864c();
                    return null;
                }
                i = 0;
            }
        } else {
            i = -1;
        }
        v91 v91Var = wf4.f33344f;
        int iOrdinal2 = (wf4Var.ordinal() + i) % 4;
        return (wf4) v91Var.get(iOrdinal2 + ((((iOrdinal2 ^ 4) & ((-iOrdinal2) | iOrdinal2)) >> 31) & 4));
    }

    /* JADX INFO: renamed from: R */
    public static ba2 m13854R(kb2 kb2Var) {
        int i = kb2Var.f23055o;
        if (i == 2) {
            kb2Var.f23055o = 1;
        }
        try {
            try {
                ba2 ba2VarM13762G = zt5.m13762G(kb2Var);
                kb2Var.m7484U(i);
                return ba2VarM13762G;
            } catch (OutOfMemoryError | StackOverflowError e) {
                throw new za2("Failed parsing JSON source: " + kb2Var + " to Json", e);
            }
        } catch (Throwable th) {
            kb2Var.m7484U(i);
            throw th;
        }
    }

    /* JADX INFO: renamed from: S */
    public static ba2 m13855S(String str) {
        try {
            kb2 kb2Var = new kb2(new StringReader(str));
            ba2 ba2VarM13854R = m13854R(kb2Var);
            ba2VarM13854R.getClass();
            if (!(ba2VarM13854R instanceof sa2) && kb2Var.mo7481R() != 10) {
                throw new lb2("Did not consume the entire document.");
            }
            return ba2VarM13854R;
        } catch (IOException e) {
            throw new ia2(e);
        } catch (NumberFormatException | op2 e2) {
            throw new lb2(e2);
        }
    }

    /* JADX INFO: renamed from: T */
    public static final AbstractC0492bi m13856T(C0689gi c0689gi, int i) {
        Object next;
        Iterator<T> it = c0689gi.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((wf2) ((Map.Entry) next).getKey()).f33312b != i);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AbstractC0492bi) entry.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: U */
    public static final void m13857U(int i, String str) {
        throw new SQLException(c75.m3877i(i, "Error code: ").concat(", message: ".concat(str)));
    }

    /* JADX INFO: renamed from: V */
    public static final int m13858V(long j) {
        float[] fArr = oc0.f26547a;
        return (int) (pb0.m9463b(j, oc0.f26551e) >>> 32);
    }

    /* JADX INFO: renamed from: W */
    public static final Object[] m13859W(Collection collection) {
        int size = collection.size();
        Object[] objArr = f36473b;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i2);
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: X */
    public static final Object[] m13860X(Collection collection, Object[] objArr) {
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = size <= objArr.length ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: Y */
    public static final String m13861Y(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    /* JADX INFO: renamed from: Z */
    public static final void m13862Z(List list, C0489bf c0489bf) {
        Path path;
        k93 k93Var;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        List list2 = list;
        C0489bf c0489bf2 = c0489bf;
        Path path2 = c0489bf2.f15228a;
        Path path3 = c0489bf2.f15228a;
        Path.FillType fillType = path2.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        c0489bf2.m3565h();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path3.setFillType(fillType2);
        k93 k93Var2 = list2.isEmpty() ? s83.f29968c : (k93) list2.get(0);
        int size = list2.size();
        float f10 = 0.0f;
        int i = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (i < size) {
            k93 k93Var3 = (k93) list2.get(i);
            if (k93Var3 instanceof s83) {
                path3.close();
                path = path3;
                size = size;
                f10 = f10;
                i = i;
                k93Var = k93Var3;
                f11 = f15;
                f13 = f11;
                f12 = f16;
                f14 = f12;
            } else {
                if (k93Var3 instanceof e93) {
                    e93 e93Var = (e93) k93Var3;
                    float f17 = e93Var.f17910c;
                    f13 += f17;
                    float f18 = e93Var.f17911d;
                    f14 += f18;
                    path3.rMoveTo(f17, f18);
                    path = path3;
                    f15 = f13;
                    f16 = f14;
                } else if (k93Var3 instanceof w83) {
                    w83 w83Var = (w83) k93Var3;
                    float f19 = w83Var.f33154c;
                    float f20 = w83Var.f33155d;
                    path3.moveTo(f19, f20);
                    f14 = f20;
                    f16 = f14;
                    path = path3;
                    f13 = f19;
                    f15 = f13;
                } else {
                    if (k93Var3 instanceof d93) {
                        d93 d93Var = (d93) k93Var3;
                        float f21 = d93Var.f16876d;
                        float f22 = d93Var.f16875c;
                        path3.rLineTo(f22, f21);
                        f13 += f22;
                        f14 += f21;
                    } else if (k93Var3 instanceof v83) {
                        v83 v83Var = (v83) k93Var3;
                        float f23 = v83Var.f32463d;
                        float f24 = v83Var.f32462c;
                        c0489bf2.m3562e(f24, f23);
                        f13 = f24;
                        path = path3;
                        f14 = f23;
                    } else if (k93Var3 instanceof c93) {
                        float f25 = ((c93) k93Var3).f15893c;
                        path3.rLineTo(f25, f10);
                        f13 += f25;
                    } else if (k93Var3 instanceof u83) {
                        float f26 = ((u83) k93Var3).f31730c;
                        c0489bf2.m3562e(f26, f14);
                        f13 = f26;
                    } else if (k93Var3 instanceof i93) {
                        float f27 = ((i93) k93Var3).f21190c;
                        path3.rLineTo(f10, f27);
                        f14 += f27;
                    } else if (k93Var3 instanceof j93) {
                        float f28 = ((j93) k93Var3).f22111c;
                        c0489bf2.m3562e(f13, f28);
                        f14 = f28;
                    } else if (k93Var3 instanceof b93) {
                        b93 b93Var = (b93) k93Var3;
                        path3.rCubicTo(b93Var.f15174c, b93Var.f15175d, b93Var.f15176e, b93Var.f15177f, b93Var.f15178g, b93Var.f15179h);
                        Path path4 = path3;
                        float f29 = b93Var.f15176e + f13;
                        float f30 = b93Var.f15177f + f14;
                        f13 += b93Var.f15178g;
                        f14 += b93Var.f15179h;
                        f12 = f30;
                        path = path4;
                        size = size;
                        f10 = f10;
                        i = i;
                        k93Var = k93Var3;
                        f11 = f29;
                    } else {
                        Path path5 = path3;
                        if (k93Var3 instanceof t83) {
                            t83 t83Var = (t83) k93Var3;
                            c0489bf2.m3560c(t83Var.f30991c, t83Var.f30992d, t83Var.f30993e, t83Var.f30994f, t83Var.f30995g, t83Var.f30996h);
                            f4 = t83Var.f30993e;
                            f5 = t83Var.f30994f;
                            f6 = t83Var.f30995g;
                            f7 = t83Var.f30996h;
                        } else {
                            if (k93Var3 instanceof g93) {
                                if (k93Var2.f23008a) {
                                    f8 = f13 - f11;
                                    f9 = f14 - f12;
                                } else {
                                    f8 = f10;
                                    f9 = f8;
                                }
                                g93 g93Var = (g93) k93Var3;
                                path5.rCubicTo(f8, f9, g93Var.f19672c, g93Var.f19673d, g93Var.f19674e, g93Var.f19675f);
                                path5 = path5;
                                float f31 = g93Var.f19672c + f13;
                                float f32 = g93Var.f19673d + f14;
                                f13 += g93Var.f19674e;
                                f14 += g93Var.f19675f;
                                f11 = f31;
                                f12 = f32;
                            } else if (k93Var3 instanceof y83) {
                                if (k93Var2.f23008a) {
                                    f13 = (f13 * 2.0f) - f11;
                                    f14 = (2.0f * f14) - f12;
                                }
                                y83 y83Var = (y83) k93Var3;
                                c0489bf.m3560c(f13, f14, y83Var.f35021c, y83Var.f35022d, y83Var.f35023e, y83Var.f35024f);
                                f4 = y83Var.f35021c;
                                f5 = y83Var.f35022d;
                                f6 = y83Var.f35023e;
                                f7 = y83Var.f35024f;
                            } else {
                                if (k93Var3 instanceof f93) {
                                    f93 f93Var = (f93) k93Var3;
                                    float f33 = f93Var.f18865f;
                                    float f34 = f93Var.f18864e;
                                    float f35 = f93Var.f18863d;
                                    float f36 = f93Var.f18862c;
                                    path5.rQuadTo(f36, f35, f34, f33);
                                    f4 = f36 + f13;
                                    f3 = f35 + f14;
                                    f13 += f34;
                                    f14 += f33;
                                } else if (k93Var3 instanceof x83) {
                                    x83 x83Var = (x83) k93Var3;
                                    float f37 = x83Var.f34065f;
                                    float f38 = x83Var.f34064e;
                                    f3 = x83Var.f34063d;
                                    f4 = x83Var.f34062c;
                                    path5.quadTo(f4, f3, f38, f37);
                                    f14 = f37;
                                    f13 = f38;
                                } else if (k93Var3 instanceof h93) {
                                    if (k93Var2.f23009b) {
                                        f = f13 - f11;
                                        f2 = f14 - f12;
                                    } else {
                                        f = f10;
                                        f2 = f;
                                    }
                                    h93 h93Var = (h93) k93Var3;
                                    float f39 = h93Var.f20449d;
                                    float f40 = h93Var.f20448c;
                                    path5.rQuadTo(f, f2, f40, f39);
                                    float f41 = f + f13;
                                    float f42 = f2 + f14;
                                    f13 += f40;
                                    f14 += f39;
                                    f11 = f41;
                                    f12 = f42;
                                } else if (k93Var3 instanceof z83) {
                                    if (k93Var2.f23009b) {
                                        f13 = (f13 * 2.0f) - f11;
                                        f14 = (2.0f * f14) - f12;
                                    }
                                    z83 z83Var = (z83) k93Var3;
                                    float f43 = z83Var.f35872d;
                                    float f44 = z83Var.f35871c;
                                    path5.quadTo(f13, f14, f44, f43);
                                    path = path5;
                                    size = size;
                                    f10 = f10;
                                    i = i;
                                    f11 = f13;
                                    f12 = f14;
                                    k93Var = k93Var3;
                                    f13 = f44;
                                    f14 = f43;
                                } else if (k93Var3 instanceof a93) {
                                    a93 a93Var = (a93) k93Var3;
                                    float f45 = a93Var.f190h + f13;
                                    float f46 = a93Var.f191i + f14;
                                    size = size;
                                    i = i;
                                    path = path5;
                                    f10 = 0.0f;
                                    m13841E(c0489bf, f13, f14, f45, f46, a93Var.f185c, a93Var.f186d, a93Var.f187e, a93Var.f188f, a93Var.f189g);
                                    f11 = f45;
                                    f13 = f11;
                                    f12 = f46;
                                    f14 = f12;
                                    k93Var = k93Var3;
                                } else {
                                    path = path5;
                                    size = size;
                                    f10 = f10;
                                    i = i;
                                    if (!(k93Var3 instanceof r83)) {
                                        C0670g.m5864c();
                                        return;
                                    }
                                    r83 r83Var = (r83) k93Var3;
                                    float f47 = r83Var.f29095i;
                                    float f48 = r83Var.f29094h;
                                    k93Var = k93Var3;
                                    m13841E(c0489bf, f13, f14, f48, f47, r83Var.f29089c, r83Var.f29090d, r83Var.f29091e, r83Var.f29092f, r83Var.f29093g);
                                    f12 = f47;
                                    f14 = f12;
                                    f11 = f48;
                                    f13 = f11;
                                }
                                f12 = f3;
                                path = path5;
                                size = size;
                                f10 = f10;
                                i = i;
                                k93Var = k93Var3;
                                f11 = f4;
                            }
                            path = path5;
                        }
                        f12 = f5;
                        f13 = f6;
                        f14 = f7;
                        path = path5;
                        size = size;
                        f10 = f10;
                        i = i;
                        k93Var = k93Var3;
                        f11 = f4;
                    }
                    path = path3;
                }
                k93Var = k93Var3;
            }
            i++;
            list2 = list;
            c0489bf2 = c0489bf;
            path3 = path;
            size = size;
            k93Var2 = k93Var;
            f10 = f10;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m13863a(C0954np c0954np, nt2 nt2Var, yp1 yp1Var, InterfaceC0520ca interfaceC0520ca, jm0 jm0Var, mi0 mi0Var, int i, int i2) {
        int i3;
        int i4;
        jm0 jm0Var2 = jm0Var;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-421592773);
        if ((i & 14) == 0) {
            i3 = (ir1Var.m6890g(c0954np) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= ir1Var.m6890g(null) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i3 |= ir1Var.m6890g(nt2Var) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i3 |= ir1Var.m6894i(yp1Var) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            i3 |= ir1Var.m6894i(null) ? 16384 : 8192;
        }
        if ((i & 458752) == 0) {
            i3 |= ir1Var.m6890g(interfaceC0520ca) ? 131072 : 65536;
        }
        if ((i & 3670016) == 0) {
            i3 |= ir1Var.m6890g(jm0Var2) ? 1048576 : 524288;
        }
        if ((i & 29360128) == 0) {
            i3 |= ir1Var.m6884d(1.0f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i3 |= ir1Var.m6890g(null) ? 67108864 : 33554432;
        }
        if ((1879048192 & i) == 0) {
            i3 |= ir1Var.m6886e(1) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 14) == 0) {
            i4 = i2 | (ir1Var.m6892h(true) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i5 & 1533916891) == 306783378 && (i4 & 11) == 2 && ir1Var.m6858D()) {
            ir1Var.m6874W();
        } else {
            b12 b12VarM5839b = fw4.m5839b(c0954np.f25988a, jm0Var2, ir1Var);
            int i6 = i5 >> 6;
            int i7 = i6 & 57344;
            C0880lp c0880lpM10794C = sj3.m10794C(b12VarM5839b, c0954np.f25990c, yp1Var, null, jm0Var2, ir1Var, 0);
            ir1Var = ir1Var;
            p74 p74Var = b12VarM5839b.f15017v;
            jm0Var2 = jm0Var;
            m13872g(p74Var instanceof nl0 ? nt2Var.mo7630d((nt2) p74Var) : nt2Var, c0880lpM10794C, interfaceC0520ca, jm0Var2, ir1Var, ((i5 << 3) & 896) | (i6 & 7168) | i7 | (i6 & 458752) | (i6 & 3670016) | ((i4 << 21) & 29360128));
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0462ap c0462ap = new C0462ap((byte) 0);
            c0462ap.f14759e = c0954np;
            c0462ap.f14756b = nt2Var;
            c0462ap.f14760f = yp1Var;
            c0462ap.f14761g = interfaceC0520ca;
            c0462ap.f14762h = jm0Var2;
            c0462ap.f14757c = i;
            c0462ap.f14758d = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0462ap;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static int m13864a0(ri3 ri3Var, si3 si3Var, int i, int[] iArr) {
        int i2;
        int i3;
        int iOrdinal = si3Var.ordinal();
        if (iOrdinal == 0) {
            i2 = (iArr[m13848L(i, ri3Var.f29319d, ri3Var.f29321f)] - iArr[m13848L(i, ri3Var.f29319d, ri3Var.f29320e)]) - iArr[m13848L(i, ri3Var.f29318c, ri3Var.f29321f)];
            i3 = iArr[m13848L(i, ri3Var.f29318c, ri3Var.f29320e)];
        } else if (iOrdinal == 1) {
            i2 = (iArr[m13848L(ri3Var.f29317b, i, ri3Var.f29321f)] - iArr[m13848L(ri3Var.f29317b, i, ri3Var.f29320e)]) - iArr[m13848L(ri3Var.f29316a, i, ri3Var.f29321f)];
            i3 = iArr[m13848L(ri3Var.f29316a, i, ri3Var.f29320e)];
        } else {
            if (iOrdinal != 2) {
                C0670g.m5864c();
                return 0;
            }
            i2 = (iArr[m13848L(ri3Var.f29317b, ri3Var.f29319d, i)] - iArr[m13848L(ri3Var.f29317b, ri3Var.f29318c, i)]) - iArr[m13848L(ri3Var.f29316a, ri3Var.f29319d, i)];
            i3 = iArr[m13848L(ri3Var.f29316a, ri3Var.f29318c, i)];
        }
        return i2 + i3;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0112  */
    /* JADX WARN: Code duplicated, block: B:104:0x0121  */
    /* JADX WARN: Code duplicated, block: B:105:0x0123  */
    /* JADX WARN: Code duplicated, block: B:108:0x012c  */
    /* JADX WARN: Code duplicated, block: B:110:0x013a  */
    /* JADX WARN: Code duplicated, block: B:123:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x015f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0164  */
    /* JADX WARN: Code duplicated, block: B:129:0x0169  */
    /* JADX WARN: Code duplicated, block: B:132:0x0176  */
    /* JADX WARN: Code duplicated, block: B:134:0x0186  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:139:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:141:0x01da  */
    /* JADX WARN: Code duplicated, block: B:143:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:144:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:148:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:151:0x0208  */
    /* JADX WARN: Code duplicated, block: B:152:0x020b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0211  */
    /* JADX WARN: Code duplicated, block: B:156:0x0214  */
    /* JADX WARN: Code duplicated, block: B:158:0x0218  */
    /* JADX WARN: Code duplicated, block: B:159:0x0231  */
    /* JADX WARN: Code duplicated, block: B:161:0x0246  */
    /* JADX WARN: Code duplicated, block: B:164:0x025c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x0265  */
    /* JADX WARN: Code duplicated, block: B:170:0x0281  */
    /* JADX WARN: Code duplicated, block: B:171:0x0283  */
    /* JADX WARN: Code duplicated, block: B:179:0x0294  */
    /* JADX WARN: Code duplicated, block: B:180:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:183:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:185:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:191:0x02da  */
    /* JADX WARN: Code duplicated, block: B:193:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:199:0x02f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:202:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:205:0x0321  */
    /* JADX WARN: Code duplicated, block: B:206:0x032d  */
    /* JADX WARN: Code duplicated, block: B:209:0x0334  */
    /* JADX WARN: Code duplicated, block: B:211:0x038c  */
    /* JADX WARN: Code duplicated, block: B:214:0x0399  */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:97:0x0109  */
    /* JADX WARN: Code duplicated, block: B:99:0x010f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static final void m13865b(wp1 wp1Var, nt2 nt2Var, boolean z, p44 p44Var, q40 q40Var, u40 u40Var, h10 h10Var, e73 e73Var, pg0 pg0Var, mi0 mi0Var, int i, int i2) {
        int i3;
        nt2 nt2Var2;
        int i4;
        boolean z2;
        int i5;
        p44 p44VarM10977a;
        q40 q40Var2;
        u40 u40Var2;
        int i6;
        h10 h10Var2;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        wp1 wp1Var2;
        e73 e73Var2;
        yk3 yk3VarM6916v;
        q40 q40Var3;
        e73 e73Var3;
        int i11;
        q40 q40Var4;
        e73 e73Var4;
        nt2 nt2Var3;
        dc0 dc0Var;
        Object objM6869O;
        i50 i50Var;
        nv2 nv2Var;
        long j;
        long j2;
        Object objM6869O2;
        w94 w94Var;
        boolean zM6890g;
        Object objM6869O3;
        c62 c62Var;
        float f;
        Object objM6869O4;
        C0910mi c0910mi;
        boolean zM6894i;
        Object objM6869O5;
        u40 u40Var3;
        C0457ak c0457ak;
        float f2;
        Object objM6869O6;
        int i12;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1310015664);
        if ((i & 6) == 0) {
            i3 = (ir1Var.m6894i(wp1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                nt2Var2 = nt2Var;
                i3 |= ir1Var.m6890g(nt2Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (ir1Var.m6892h(z2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        p44VarM10977a = p44Var;
                        int i14 = ir1Var.m6890g(p44VarM10977a) ? 2048 : 1024;
                        i3 |= i14;
                    } else {
                        p44VarM10977a = p44Var;
                    }
                    i3 |= i14;
                } else {
                    p44VarM10977a = p44Var;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        q40Var2 = q40Var;
                        int i15 = ir1Var.m6890g(q40Var2) ? 16384 : 8192;
                        i3 |= i15;
                    } else {
                        q40Var2 = q40Var;
                    }
                    i3 |= i15;
                } else {
                    q40Var2 = q40Var;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        u40Var2 = u40Var;
                        int i16 = ir1Var.m6890g(u40Var2) ? 131072 : 65536;
                        i3 |= i16;
                    } else {
                        u40Var2 = u40Var;
                    }
                    i3 |= i16;
                } else {
                    u40Var2 = u40Var;
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    h10Var2 = h10Var;
                } else {
                    h10Var2 = h10Var;
                    if ((i & 1572864) == 0) {
                        if (ir1Var.m6890g(h10Var2)) {
                            i7 = 1048576;
                        } else {
                            i7 = 524288;
                        }
                        i3 |= i7;
                    }
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (ir1Var.m6890g(e73Var)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i2 & 256) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (ir1Var.m6890g(null)) {
                        i10 = 67108864;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                if ((i & 805306368) == 0) {
                    if (ir1Var.m6894i(pg0Var)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i3 |= i12;
                }
                if ((i3 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ir1Var.m6871T(i3 & 1, z3)) {
                    ir1Var.m6876Y();
                    if ((i & 1) != 0 || ir1Var.m6856B()) {
                        if (i13 != 0) {
                            nt2Var2 = kt2.f23428a;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            g73 g73Var = r40.f28989a;
                            i3 &= -7169;
                            p44VarM10977a = t44.m10977a(6, ir1Var);
                        }
                        if ((i2 & 16) != 0) {
                            g73 g73Var2 = r40.f28989a;
                            dc0Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24277a;
                            q40Var3 = dc0Var.f16936W;
                            if (q40Var3 == null) {
                                q40Var3 = new q40(ic0.m6744d(dc0Var, 25), ic0.m6744d(dc0Var, 9), pb0.m9464c(ic0.m6744d(dc0Var, 17), 0.1f, 0.0f, 0.0f, 0.0f, 14), pb0.m9464c(ic0.m6744d(dc0Var, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                                dc0Var.f16936W = q40Var3;
                            }
                            i3 &= -57345;
                        } else {
                            q40Var3 = q40Var2;
                        }
                        if ((i2 & 32) != 0) {
                            g73 g73Var3 = r40.f28989a;
                            u40 u40Var4 = new u40();
                            VarHandle.storeStoreFence();
                            i3 &= -458753;
                            u40Var2 = u40Var4;
                        }
                        if (i6 != 0) {
                            h10Var2 = null;
                        }
                        if (i8 != 0) {
                            e73Var3 = r40.f28989a;
                        } else {
                            e73Var3 = e73Var;
                        }
                        q40 q40Var5 = q40Var3;
                        i11 = i3;
                        q40Var4 = q40Var5;
                        e73Var4 = e73Var3;
                        nt2Var3 = nt2Var2;
                    } else {
                        ir1Var.m6874W();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        e73Var4 = e73Var;
                        i11 = i3;
                        nt2Var3 = nt2Var2;
                        q40Var4 = q40Var2;
                    }
                    ir1Var.m6913s();
                    ir1Var.m6885d0(1691726283);
                    objM6869O = ir1Var.m6869O();
                    i50Var = ki0.f23136a;
                    if (objM6869O == i50Var) {
                        objM6869O = sj3.m10810f();
                        ir1Var.m6905n0(objM6869O);
                    }
                    nv2Var = (nv2) objM6869O;
                    ir1Var.m6912r(false);
                    if (z2) {
                        j = q40Var4.f28201a;
                    } else {
                        j = q40Var4.f28203c;
                    }
                    long j3 = j;
                    if (z2) {
                        j2 = q40Var4.f28202b;
                    } else {
                        j2 = q40Var4.f28204d;
                    }
                    if (u40Var2 == null) {
                        ir1Var.m6885d0(1691909926);
                        ir1Var.m6912r(false);
                        i11 = i11;
                        nv2Var = nv2Var;
                        h10Var2 = h10Var2;
                        p44VarM10977a = p44VarM10977a;
                        u40Var3 = u40Var2;
                        c0457ak = null;
                    } else {
                        ir1Var.m6885d0(-499611589);
                        int i17 = ((i11 >> 6) & 14) | ((i11 >> 9) & 896);
                        objM6869O2 = ir1Var.m6869O();
                        if (objM6869O2 == i50Var) {
                            objM6869O2 = new w94();
                            ir1Var.m6905n0(objM6869O2);
                        }
                        w94Var = (w94) objM6869O2;
                        zM6890g = ir1Var.m6890g(nv2Var);
                        objM6869O3 = ir1Var.m6869O();
                        if (zM6890g || objM6869O3 == i50Var) {
                            objM6869O3 = new s40(nv2Var, w94Var, null, (byte) 0);
                            ir1Var.m6905n0(objM6869O3);
                        }
                        lb5.m7926g(ir1Var, (mq1) objM6869O3, nv2Var);
                        c62Var = (c62) hb0.m6307S0(w94Var);
                        if (z2 || (c62Var instanceof ff3) || !(c62Var instanceof mx1)) {
                            f = 0.0f;
                        } else {
                            f = 1.0f;
                        }
                        objM6869O4 = ir1Var.m6869O();
                        if (objM6869O4 == i50Var) {
                            objM6869O4 = new C0910mi(p11.m9350a(f), sw4.f30614c, null, 12);
                            ir1Var.m6905n0(objM6869O4);
                        }
                        c0910mi = (C0910mi) objM6869O4;
                        p11 p11VarM9350a = p11.m9350a(f);
                        zM6894i = ir1Var.m6894i(c0910mi) | ir1Var.m6884d(f) | ((((i17 & 14) ^ 6) <= 4 && ir1Var.m6892h(z2)) || (i17 & 6) == 4) | ((((i17 & 896) ^ 384) <= 256 && ir1Var.m6890g(u40Var2)) || (i17 & 384) == 256) | ir1Var.m6894i(c62Var);
                        objM6869O5 = ir1Var.m6869O();
                        if (!zM6894i || objM6869O5 == i50Var) {
                            u40 u40Var5 = u40Var2;
                            objM6869O5 = new t40(c0910mi, f, z2, u40Var5, c62Var, null);
                            u40Var3 = u40Var5;
                            ir1Var.m6905n0(objM6869O5);
                        } else {
                            u40Var3 = u40Var2;
                        }
                        lb5.m7926g(ir1Var, (mq1) objM6869O5, p11VarM9350a);
                        c0457ak = c0910mi.f24929c;
                        ir1Var.m6912r(false);
                    }
                    if (c0457ak != null) {
                        f2 = ((p11) c0457ak.f14572b.getValue()).f27285a;
                    } else {
                        f2 = 0.0f;
                    }
                    objM6869O6 = ir1Var.m6869O();
                    if (objM6869O6 == i50Var) {
                        objM6869O6 = new C0499bp((byte) 8);
                        ir1Var.m6905n0(objM6869O6);
                    }
                    nt2 nt2VarM5458a = f14.m5458a(nt2Var3, false, (yp1) objM6869O6);
                    C0905md c0905md = new C0905md((byte) 1);
                    c0905md.f24822b = j2;
                    c0905md.f24823c = e73Var4;
                    c0905md.f24824d = pg0Var;
                    VarHandle.storeStoreFence();
                    pg0 pg0VarM11834R = vd6.m11834R(-535639973, c0905md, ir1Var);
                    int i18 = i11;
                    nt2 nt2Var4 = nt2Var3;
                    long j4 = j2;
                    boolean z4 = z2;
                    wp1Var2 = wp1Var;
                    kf4.m7512b(wp1Var2, nt2VarM5458a, z4, p44VarM10977a, j3, j4, 0.0f, f2, h10Var2, nv2Var, pg0VarM11834R, ir1Var, (i18 & 8078) | ((i18 << 6) & 234881024), 64);
                    z2 = z4;
                    u40Var2 = u40Var3;
                    nt2Var2 = nt2Var4;
                    e73Var2 = e73Var4;
                    h10Var2 = h10Var2;
                    q40Var2 = q40Var4;
                    p44VarM10977a = p44VarM10977a;
                } else {
                    wp1Var2 = wp1Var;
                    ir1Var.m6874W();
                    e73Var2 = e73Var;
                }
                yk3VarM6916v = ir1Var.m6916v();
                if (yk3VarM6916v != null) {
                    w40 w40Var = new w40();
                    w40Var.f33064a = wp1Var2;
                    w40Var.f33065b = nt2Var2;
                    w40Var.f33066c = z2;
                    w40Var.f33067d = p44VarM10977a;
                    w40Var.f33068e = q40Var2;
                    w40Var.f33069f = u40Var2;
                    w40Var.f33070g = h10Var2;
                    w40Var.f33071h = e73Var2;
                    w40Var.f33072i = pg0Var;
                    w40Var.f33073j = i;
                    w40Var.f33074k = i2;
                    VarHandle.storeStoreFence();
                    yk3VarM6916v.f35300d = w40Var;
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    p44VarM10977a = p44Var;
                    if (ir1Var.m6890g(p44VarM10977a)) {
                    }
                    i3 |= i14;
                } else {
                    p44VarM10977a = p44Var;
                }
                i3 |= i14;
            } else {
                p44VarM10977a = p44Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    q40Var2 = q40Var;
                    if (ir1Var.m6890g(q40Var2)) {
                    }
                    i3 |= i15;
                } else {
                    q40Var2 = q40Var;
                }
                i3 |= i15;
            } else {
                q40Var2 = q40Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    u40Var2 = u40Var;
                    if (ir1Var.m6890g(u40Var2)) {
                    }
                    i3 |= i16;
                } else {
                    u40Var2 = u40Var;
                }
                i3 |= i16;
            } else {
                u40Var2 = u40Var;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i3 |= 1572864;
                h10Var2 = h10Var;
            } else {
                h10Var2 = h10Var;
                if ((i & 1572864) == 0) {
                    if (ir1Var.m6890g(h10Var2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (ir1Var.m6890g(e73Var)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i2 & 256) != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (ir1Var.m6890g(null)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i3 |= i10;
            }
            if ((i & 805306368) == 0) {
                if (ir1Var.m6894i(pg0Var)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i3 |= i12;
            }
            if ((i3 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ir1Var.m6871T(i3 & 1, z3)) {
                ir1Var.m6876Y();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        nt2Var2 = kt2.f23428a;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        g73 g73Var4 = r40.f28989a;
                        i3 &= -7169;
                        p44VarM10977a = t44.m10977a(6, ir1Var);
                    }
                    if ((i2 & 16) != 0) {
                        g73 g73Var5 = r40.f28989a;
                        dc0Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24277a;
                        q40Var3 = dc0Var.f16936W;
                        if (q40Var3 == null) {
                            q40Var3 = new q40(ic0.m6744d(dc0Var, 25), ic0.m6744d(dc0Var, 9), pb0.m9464c(ic0.m6744d(dc0Var, 17), 0.1f, 0.0f, 0.0f, 0.0f, 14), pb0.m9464c(ic0.m6744d(dc0Var, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                            dc0Var.f16936W = q40Var3;
                        }
                        i3 &= -57345;
                    } else {
                        q40Var3 = q40Var2;
                    }
                    if ((i2 & 32) != 0) {
                        g73 g73Var6 = r40.f28989a;
                        u40 u40Var6 = new u40();
                        VarHandle.storeStoreFence();
                        i3 &= -458753;
                        u40Var2 = u40Var6;
                    }
                    if (i6 != 0) {
                        h10Var2 = null;
                    }
                    if (i8 != 0) {
                        e73Var3 = r40.f28989a;
                    } else {
                        e73Var3 = e73Var;
                    }
                    q40 q40Var6 = q40Var3;
                    i11 = i3;
                    q40Var4 = q40Var6;
                    e73Var4 = e73Var3;
                    nt2Var3 = nt2Var2;
                } else {
                    if (i13 != 0) {
                        nt2Var2 = kt2.f23428a;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        g73 g73Var7 = r40.f28989a;
                        i3 &= -7169;
                        p44VarM10977a = t44.m10977a(6, ir1Var);
                    }
                    if ((i2 & 16) != 0) {
                        g73 g73Var8 = r40.f28989a;
                        dc0Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24277a;
                        q40Var3 = dc0Var.f16936W;
                        if (q40Var3 == null) {
                            q40Var3 = new q40(ic0.m6744d(dc0Var, 25), ic0.m6744d(dc0Var, 9), pb0.m9464c(ic0.m6744d(dc0Var, 17), 0.1f, 0.0f, 0.0f, 0.0f, 14), pb0.m9464c(ic0.m6744d(dc0Var, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                            dc0Var.f16936W = q40Var3;
                        }
                        i3 &= -57345;
                    } else {
                        q40Var3 = q40Var2;
                    }
                    if ((i2 & 32) != 0) {
                        g73 g73Var9 = r40.f28989a;
                        u40 u40Var7 = new u40();
                        VarHandle.storeStoreFence();
                        i3 &= -458753;
                        u40Var2 = u40Var7;
                    }
                    if (i6 != 0) {
                        h10Var2 = null;
                    }
                    if (i8 != 0) {
                        e73Var3 = r40.f28989a;
                    } else {
                        e73Var3 = e73Var;
                    }
                    q40 q40Var7 = q40Var3;
                    i11 = i3;
                    q40Var4 = q40Var7;
                    e73Var4 = e73Var3;
                    nt2Var3 = nt2Var2;
                }
                ir1Var.m6913s();
                ir1Var.m6885d0(1691726283);
                objM6869O = ir1Var.m6869O();
                i50Var = ki0.f23136a;
                if (objM6869O == i50Var) {
                    objM6869O = sj3.m10810f();
                    ir1Var.m6905n0(objM6869O);
                }
                nv2Var = (nv2) objM6869O;
                ir1Var.m6912r(false);
                if (z2) {
                    j = q40Var4.f28201a;
                } else {
                    j = q40Var4.f28203c;
                }
                long j5 = j;
                if (z2) {
                    j2 = q40Var4.f28202b;
                } else {
                    j2 = q40Var4.f28204d;
                }
                if (u40Var2 == null) {
                    ir1Var.m6885d0(1691909926);
                    ir1Var.m6912r(false);
                    i11 = i11;
                    nv2Var = nv2Var;
                    h10Var2 = h10Var2;
                    p44VarM10977a = p44VarM10977a;
                    u40Var3 = u40Var2;
                    c0457ak = null;
                } else {
                    ir1Var.m6885d0(-499611589);
                    int i19 = ((i11 >> 6) & 14) | ((i11 >> 9) & 896);
                    objM6869O2 = ir1Var.m6869O();
                    if (objM6869O2 == i50Var) {
                        objM6869O2 = new w94();
                        ir1Var.m6905n0(objM6869O2);
                    }
                    w94Var = (w94) objM6869O2;
                    zM6890g = ir1Var.m6890g(nv2Var);
                    objM6869O3 = ir1Var.m6869O();
                    if (zM6890g) {
                        objM6869O3 = new s40(nv2Var, w94Var, null, (byte) 0);
                        ir1Var.m6905n0(objM6869O3);
                    } else {
                        objM6869O3 = new s40(nv2Var, w94Var, null, (byte) 0);
                        ir1Var.m6905n0(objM6869O3);
                    }
                    lb5.m7926g(ir1Var, (mq1) objM6869O3, nv2Var);
                    c62Var = (c62) hb0.m6307S0(w94Var);
                    if (z2) {
                        f = 0.0f;
                    } else {
                        f = 1.0f;
                    }
                    objM6869O4 = ir1Var.m6869O();
                    if (objM6869O4 == i50Var) {
                        objM6869O4 = new C0910mi(p11.m9350a(f), sw4.f30614c, null, 12);
                        ir1Var.m6905n0(objM6869O4);
                    }
                    c0910mi = (C0910mi) objM6869O4;
                    p11 p11VarM9350a2 = p11.m9350a(f);
                    zM6894i = ir1Var.m6894i(c0910mi) | ir1Var.m6884d(f) | ((((i19 & 14) ^ 6) <= 4 && ir1Var.m6892h(z2)) || (i19 & 6) == 4) | ((((i19 & 896) ^ 384) <= 256 && ir1Var.m6890g(u40Var2)) || (i19 & 384) == 256) | ir1Var.m6894i(c62Var);
                    objM6869O5 = ir1Var.m6869O();
                    if (zM6894i) {
                        u40 u40Var8 = u40Var2;
                        objM6869O5 = new t40(c0910mi, f, z2, u40Var8, c62Var, null);
                        u40Var3 = u40Var8;
                        ir1Var.m6905n0(objM6869O5);
                    } else {
                        u40 u40Var9 = u40Var2;
                        objM6869O5 = new t40(c0910mi, f, z2, u40Var9, c62Var, null);
                        u40Var3 = u40Var9;
                        ir1Var.m6905n0(objM6869O5);
                    }
                    lb5.m7926g(ir1Var, (mq1) objM6869O5, p11VarM9350a2);
                    c0457ak = c0910mi.f24929c;
                    ir1Var.m6912r(false);
                }
                if (c0457ak != null) {
                    f2 = ((p11) c0457ak.f14572b.getValue()).f27285a;
                } else {
                    f2 = 0.0f;
                }
                objM6869O6 = ir1Var.m6869O();
                if (objM6869O6 == i50Var) {
                    objM6869O6 = new C0499bp((byte) 8);
                    ir1Var.m6905n0(objM6869O6);
                }
                nt2 nt2VarM5458a2 = f14.m5458a(nt2Var3, false, (yp1) objM6869O6);
                C0905md c0905md2 = new C0905md((byte) 1);
                c0905md2.f24822b = j2;
                c0905md2.f24823c = e73Var4;
                c0905md2.f24824d = pg0Var;
                VarHandle.storeStoreFence();
                pg0 pg0VarM11834R2 = vd6.m11834R(-535639973, c0905md2, ir1Var);
                int i110 = i11;
                nt2 nt2Var5 = nt2Var3;
                long j6 = j2;
                boolean z5 = z2;
                wp1Var2 = wp1Var;
                kf4.m7512b(wp1Var2, nt2VarM5458a2, z5, p44VarM10977a, j5, j6, 0.0f, f2, h10Var2, nv2Var, pg0VarM11834R2, ir1Var, (i110 & 8078) | ((i110 << 6) & 234881024), 64);
                z2 = z5;
                u40Var2 = u40Var3;
                nt2Var2 = nt2Var5;
                e73Var2 = e73Var4;
                h10Var2 = h10Var2;
                q40Var2 = q40Var4;
                p44VarM10977a = p44VarM10977a;
            } else {
                wp1Var2 = wp1Var;
                ir1Var.m6874W();
                e73Var2 = e73Var;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                w40 w40Var2 = new w40();
                w40Var2.f33064a = wp1Var2;
                w40Var2.f33065b = nt2Var2;
                w40Var2.f33066c = z2;
                w40Var2.f33067d = p44VarM10977a;
                w40Var2.f33068e = q40Var2;
                w40Var2.f33069f = u40Var2;
                w40Var2.f33070g = h10Var2;
                w40Var2.f33071h = e73Var2;
                w40Var2.f33072i = pg0Var;
                w40Var2.f33073j = i;
                w40Var2.f33074k = i2;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = w40Var2;
            }
        }
        i3 |= 48;
        nt2Var2 = nt2Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (ir1Var.m6892h(z2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    p44VarM10977a = p44Var;
                    if (ir1Var.m6890g(p44VarM10977a)) {
                    }
                    i3 |= i14;
                } else {
                    p44VarM10977a = p44Var;
                }
                i3 |= i14;
            } else {
                p44VarM10977a = p44Var;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    q40Var2 = q40Var;
                    if (ir1Var.m6890g(q40Var2)) {
                    }
                    i3 |= i15;
                } else {
                    q40Var2 = q40Var;
                }
                i3 |= i15;
            } else {
                q40Var2 = q40Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    u40Var2 = u40Var;
                    if (ir1Var.m6890g(u40Var2)) {
                    }
                    i3 |= i16;
                } else {
                    u40Var2 = u40Var;
                }
                i3 |= i16;
            } else {
                u40Var2 = u40Var;
            }
            i6 = i2 & 64;
            if (i6 != 0) {
                i3 |= 1572864;
                h10Var2 = h10Var;
            } else {
                h10Var2 = h10Var;
                if ((i & 1572864) == 0) {
                    if (ir1Var.m6890g(h10Var2)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 128;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (ir1Var.m6890g(e73Var)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i2 & 256) != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (ir1Var.m6890g(null)) {
                    i10 = 67108864;
                } else {
                    i10 = 33554432;
                }
                i3 |= i10;
            }
            if ((i & 805306368) == 0) {
                if (ir1Var.m6894i(pg0Var)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i3 |= i12;
            }
            if ((i3 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ir1Var.m6871T(i3 & 1, z3)) {
                ir1Var.m6876Y();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        nt2Var2 = kt2.f23428a;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        g73 g73Var10 = r40.f28989a;
                        i3 &= -7169;
                        p44VarM10977a = t44.m10977a(6, ir1Var);
                    }
                    if ((i2 & 16) != 0) {
                        g73 g73Var11 = r40.f28989a;
                        dc0Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24277a;
                        q40Var3 = dc0Var.f16936W;
                        if (q40Var3 == null) {
                            q40Var3 = new q40(ic0.m6744d(dc0Var, 25), ic0.m6744d(dc0Var, 9), pb0.m9464c(ic0.m6744d(dc0Var, 17), 0.1f, 0.0f, 0.0f, 0.0f, 14), pb0.m9464c(ic0.m6744d(dc0Var, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                            dc0Var.f16936W = q40Var3;
                        }
                        i3 &= -57345;
                    } else {
                        q40Var3 = q40Var2;
                    }
                    if ((i2 & 32) != 0) {
                        g73 g73Var12 = r40.f28989a;
                        u40 u40Var10 = new u40();
                        VarHandle.storeStoreFence();
                        i3 &= -458753;
                        u40Var2 = u40Var10;
                    }
                    if (i6 != 0) {
                        h10Var2 = null;
                    }
                    if (i8 != 0) {
                        e73Var3 = r40.f28989a;
                    } else {
                        e73Var3 = e73Var;
                    }
                    q40 q40Var8 = q40Var3;
                    i11 = i3;
                    q40Var4 = q40Var8;
                    e73Var4 = e73Var3;
                    nt2Var3 = nt2Var2;
                } else {
                    if (i13 != 0) {
                        nt2Var2 = kt2.f23428a;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 8) != 0) {
                        g73 g73Var13 = r40.f28989a;
                        i3 &= -7169;
                        p44VarM10977a = t44.m10977a(6, ir1Var);
                    }
                    if ((i2 & 16) != 0) {
                        g73 g73Var14 = r40.f28989a;
                        dc0Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24277a;
                        q40Var3 = dc0Var.f16936W;
                        if (q40Var3 == null) {
                            q40Var3 = new q40(ic0.m6744d(dc0Var, 25), ic0.m6744d(dc0Var, 9), pb0.m9464c(ic0.m6744d(dc0Var, 17), 0.1f, 0.0f, 0.0f, 0.0f, 14), pb0.m9464c(ic0.m6744d(dc0Var, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                            dc0Var.f16936W = q40Var3;
                        }
                        i3 &= -57345;
                    } else {
                        q40Var3 = q40Var2;
                    }
                    if ((i2 & 32) != 0) {
                        g73 g73Var15 = r40.f28989a;
                        u40 u40Var11 = new u40();
                        VarHandle.storeStoreFence();
                        i3 &= -458753;
                        u40Var2 = u40Var11;
                    }
                    if (i6 != 0) {
                        h10Var2 = null;
                    }
                    if (i8 != 0) {
                        e73Var3 = r40.f28989a;
                    } else {
                        e73Var3 = e73Var;
                    }
                    q40 q40Var9 = q40Var3;
                    i11 = i3;
                    q40Var4 = q40Var9;
                    e73Var4 = e73Var3;
                    nt2Var3 = nt2Var2;
                }
                ir1Var.m6913s();
                ir1Var.m6885d0(1691726283);
                objM6869O = ir1Var.m6869O();
                i50Var = ki0.f23136a;
                if (objM6869O == i50Var) {
                    objM6869O = sj3.m10810f();
                    ir1Var.m6905n0(objM6869O);
                }
                nv2Var = (nv2) objM6869O;
                ir1Var.m6912r(false);
                if (z2) {
                    j = q40Var4.f28201a;
                } else {
                    j = q40Var4.f28203c;
                }
                long j7 = j;
                if (z2) {
                    j2 = q40Var4.f28202b;
                } else {
                    j2 = q40Var4.f28204d;
                }
                if (u40Var2 == null) {
                    ir1Var.m6885d0(1691909926);
                    ir1Var.m6912r(false);
                    i11 = i11;
                    nv2Var = nv2Var;
                    h10Var2 = h10Var2;
                    p44VarM10977a = p44VarM10977a;
                    u40Var3 = u40Var2;
                    c0457ak = null;
                } else {
                    ir1Var.m6885d0(-499611589);
                    int i111 = ((i11 >> 6) & 14) | ((i11 >> 9) & 896);
                    objM6869O2 = ir1Var.m6869O();
                    if (objM6869O2 == i50Var) {
                        objM6869O2 = new w94();
                        ir1Var.m6905n0(objM6869O2);
                    }
                    w94Var = (w94) objM6869O2;
                    zM6890g = ir1Var.m6890g(nv2Var);
                    objM6869O3 = ir1Var.m6869O();
                    if (zM6890g) {
                        objM6869O3 = new s40(nv2Var, w94Var, null, (byte) 0);
                        ir1Var.m6905n0(objM6869O3);
                    } else {
                        objM6869O3 = new s40(nv2Var, w94Var, null, (byte) 0);
                        ir1Var.m6905n0(objM6869O3);
                    }
                    lb5.m7926g(ir1Var, (mq1) objM6869O3, nv2Var);
                    c62Var = (c62) hb0.m6307S0(w94Var);
                    if (z2) {
                        f = 0.0f;
                    } else {
                        f = 1.0f;
                    }
                    objM6869O4 = ir1Var.m6869O();
                    if (objM6869O4 == i50Var) {
                        objM6869O4 = new C0910mi(p11.m9350a(f), sw4.f30614c, null, 12);
                        ir1Var.m6905n0(objM6869O4);
                    }
                    c0910mi = (C0910mi) objM6869O4;
                    p11 p11VarM9350a3 = p11.m9350a(f);
                    zM6894i = ir1Var.m6894i(c0910mi) | ir1Var.m6884d(f) | ((((i111 & 14) ^ 6) <= 4 && ir1Var.m6892h(z2)) || (i111 & 6) == 4) | ((((i111 & 896) ^ 384) <= 256 && ir1Var.m6890g(u40Var2)) || (i111 & 384) == 256) | ir1Var.m6894i(c62Var);
                    objM6869O5 = ir1Var.m6869O();
                    if (zM6894i) {
                        u40 u40Var12 = u40Var2;
                        objM6869O5 = new t40(c0910mi, f, z2, u40Var12, c62Var, null);
                        u40Var3 = u40Var12;
                        ir1Var.m6905n0(objM6869O5);
                    } else {
                        u40 u40Var13 = u40Var2;
                        objM6869O5 = new t40(c0910mi, f, z2, u40Var13, c62Var, null);
                        u40Var3 = u40Var13;
                        ir1Var.m6905n0(objM6869O5);
                    }
                    lb5.m7926g(ir1Var, (mq1) objM6869O5, p11VarM9350a3);
                    c0457ak = c0910mi.f24929c;
                    ir1Var.m6912r(false);
                }
                if (c0457ak != null) {
                    f2 = ((p11) c0457ak.f14572b.getValue()).f27285a;
                } else {
                    f2 = 0.0f;
                }
                objM6869O6 = ir1Var.m6869O();
                if (objM6869O6 == i50Var) {
                    objM6869O6 = new C0499bp((byte) 8);
                    ir1Var.m6905n0(objM6869O6);
                }
                nt2 nt2VarM5458a3 = f14.m5458a(nt2Var3, false, (yp1) objM6869O6);
                C0905md c0905md3 = new C0905md((byte) 1);
                c0905md3.f24822b = j2;
                c0905md3.f24823c = e73Var4;
                c0905md3.f24824d = pg0Var;
                VarHandle.storeStoreFence();
                pg0 pg0VarM11834R3 = vd6.m11834R(-535639973, c0905md3, ir1Var);
                int i112 = i11;
                nt2 nt2Var6 = nt2Var3;
                long j8 = j2;
                boolean z6 = z2;
                wp1Var2 = wp1Var;
                kf4.m7512b(wp1Var2, nt2VarM5458a3, z6, p44VarM10977a, j7, j8, 0.0f, f2, h10Var2, nv2Var, pg0VarM11834R3, ir1Var, (i112 & 8078) | ((i112 << 6) & 234881024), 64);
                z2 = z6;
                u40Var2 = u40Var3;
                nt2Var2 = nt2Var6;
                e73Var2 = e73Var4;
                h10Var2 = h10Var2;
                q40Var2 = q40Var4;
                p44VarM10977a = p44VarM10977a;
            } else {
                wp1Var2 = wp1Var;
                ir1Var.m6874W();
                e73Var2 = e73Var;
            }
            yk3VarM6916v = ir1Var.m6916v();
            if (yk3VarM6916v != null) {
                w40 w40Var3 = new w40();
                w40Var3.f33064a = wp1Var2;
                w40Var3.f33065b = nt2Var2;
                w40Var3.f33066c = z2;
                w40Var3.f33067d = p44VarM10977a;
                w40Var3.f33068e = q40Var2;
                w40Var3.f33069f = u40Var2;
                w40Var3.f33070g = h10Var2;
                w40Var3.f33071h = e73Var2;
                w40Var3.f33072i = pg0Var;
                w40Var3.f33073j = i;
                w40Var3.f33074k = i2;
                VarHandle.storeStoreFence();
                yk3VarM6916v.f35300d = w40Var3;
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                p44VarM10977a = p44Var;
                if (ir1Var.m6890g(p44VarM10977a)) {
                }
                i3 |= i14;
            } else {
                p44VarM10977a = p44Var;
            }
            i3 |= i14;
        } else {
            p44VarM10977a = p44Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                q40Var2 = q40Var;
                if (ir1Var.m6890g(q40Var2)) {
                }
                i3 |= i15;
            } else {
                q40Var2 = q40Var;
            }
            i3 |= i15;
        } else {
            q40Var2 = q40Var;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                u40Var2 = u40Var;
                if (ir1Var.m6890g(u40Var2)) {
                }
                i3 |= i16;
            } else {
                u40Var2 = u40Var;
            }
            i3 |= i16;
        } else {
            u40Var2 = u40Var;
        }
        i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
            h10Var2 = h10Var;
        } else {
            h10Var2 = h10Var;
            if ((i & 1572864) == 0) {
                if (ir1Var.m6890g(h10Var2)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
        }
        i8 = i2 & 128;
        if (i8 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (ir1Var.m6890g(e73Var)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i3 |= i9;
        }
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (ir1Var.m6890g(null)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i3 |= i10;
        }
        if ((i & 805306368) == 0) {
            if (ir1Var.m6894i(pg0Var)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i3 |= i12;
        }
        if ((i3 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (ir1Var.m6871T(i3 & 1, z3)) {
            ir1Var.m6876Y();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    nt2Var2 = kt2.f23428a;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    g73 g73Var16 = r40.f28989a;
                    i3 &= -7169;
                    p44VarM10977a = t44.m10977a(6, ir1Var);
                }
                if ((i2 & 16) != 0) {
                    g73 g73Var17 = r40.f28989a;
                    dc0Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24277a;
                    q40Var3 = dc0Var.f16936W;
                    if (q40Var3 == null) {
                        q40Var3 = new q40(ic0.m6744d(dc0Var, 25), ic0.m6744d(dc0Var, 9), pb0.m9464c(ic0.m6744d(dc0Var, 17), 0.1f, 0.0f, 0.0f, 0.0f, 14), pb0.m9464c(ic0.m6744d(dc0Var, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                        dc0Var.f16936W = q40Var3;
                    }
                    i3 &= -57345;
                } else {
                    q40Var3 = q40Var2;
                }
                if ((i2 & 32) != 0) {
                    g73 g73Var18 = r40.f28989a;
                    u40 u40Var14 = new u40();
                    VarHandle.storeStoreFence();
                    i3 &= -458753;
                    u40Var2 = u40Var14;
                }
                if (i6 != 0) {
                    h10Var2 = null;
                }
                if (i8 != 0) {
                    e73Var3 = r40.f28989a;
                } else {
                    e73Var3 = e73Var;
                }
                q40 q40Var10 = q40Var3;
                i11 = i3;
                q40Var4 = q40Var10;
                e73Var4 = e73Var3;
                nt2Var3 = nt2Var2;
            } else {
                if (i13 != 0) {
                    nt2Var2 = kt2.f23428a;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                if ((i2 & 8) != 0) {
                    g73 g73Var19 = r40.f28989a;
                    i3 &= -7169;
                    p44VarM10977a = t44.m10977a(6, ir1Var);
                }
                if ((i2 & 16) != 0) {
                    g73 g73Var110 = r40.f28989a;
                    dc0Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24277a;
                    q40Var3 = dc0Var.f16936W;
                    if (q40Var3 == null) {
                        q40Var3 = new q40(ic0.m6744d(dc0Var, 25), ic0.m6744d(dc0Var, 9), pb0.m9464c(ic0.m6744d(dc0Var, 17), 0.1f, 0.0f, 0.0f, 0.0f, 14), pb0.m9464c(ic0.m6744d(dc0Var, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                        dc0Var.f16936W = q40Var3;
                    }
                    i3 &= -57345;
                } else {
                    q40Var3 = q40Var2;
                }
                if ((i2 & 32) != 0) {
                    g73 g73Var111 = r40.f28989a;
                    u40 u40Var15 = new u40();
                    VarHandle.storeStoreFence();
                    i3 &= -458753;
                    u40Var2 = u40Var15;
                }
                if (i6 != 0) {
                    h10Var2 = null;
                }
                if (i8 != 0) {
                    e73Var3 = r40.f28989a;
                } else {
                    e73Var3 = e73Var;
                }
                q40 q40Var11 = q40Var3;
                i11 = i3;
                q40Var4 = q40Var11;
                e73Var4 = e73Var3;
                nt2Var3 = nt2Var2;
            }
            ir1Var.m6913s();
            ir1Var.m6885d0(1691726283);
            objM6869O = ir1Var.m6869O();
            i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                objM6869O = sj3.m10810f();
                ir1Var.m6905n0(objM6869O);
            }
            nv2Var = (nv2) objM6869O;
            ir1Var.m6912r(false);
            if (z2) {
                j = q40Var4.f28201a;
            } else {
                j = q40Var4.f28203c;
            }
            long j9 = j;
            if (z2) {
                j2 = q40Var4.f28202b;
            } else {
                j2 = q40Var4.f28204d;
            }
            if (u40Var2 == null) {
                ir1Var.m6885d0(1691909926);
                ir1Var.m6912r(false);
                i11 = i11;
                nv2Var = nv2Var;
                h10Var2 = h10Var2;
                p44VarM10977a = p44VarM10977a;
                u40Var3 = u40Var2;
                c0457ak = null;
            } else {
                ir1Var.m6885d0(-499611589);
                int i113 = ((i11 >> 6) & 14) | ((i11 >> 9) & 896);
                objM6869O2 = ir1Var.m6869O();
                if (objM6869O2 == i50Var) {
                    objM6869O2 = new w94();
                    ir1Var.m6905n0(objM6869O2);
                }
                w94Var = (w94) objM6869O2;
                zM6890g = ir1Var.m6890g(nv2Var);
                objM6869O3 = ir1Var.m6869O();
                if (zM6890g) {
                    objM6869O3 = new s40(nv2Var, w94Var, null, (byte) 0);
                    ir1Var.m6905n0(objM6869O3);
                } else {
                    objM6869O3 = new s40(nv2Var, w94Var, null, (byte) 0);
                    ir1Var.m6905n0(objM6869O3);
                }
                lb5.m7926g(ir1Var, (mq1) objM6869O3, nv2Var);
                c62Var = (c62) hb0.m6307S0(w94Var);
                if (z2) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                objM6869O4 = ir1Var.m6869O();
                if (objM6869O4 == i50Var) {
                    objM6869O4 = new C0910mi(p11.m9350a(f), sw4.f30614c, null, 12);
                    ir1Var.m6905n0(objM6869O4);
                }
                c0910mi = (C0910mi) objM6869O4;
                p11 p11VarM9350a4 = p11.m9350a(f);
                zM6894i = ir1Var.m6894i(c0910mi) | ir1Var.m6884d(f) | ((((i113 & 14) ^ 6) <= 4 && ir1Var.m6892h(z2)) || (i113 & 6) == 4) | ((((i113 & 896) ^ 384) <= 256 && ir1Var.m6890g(u40Var2)) || (i113 & 384) == 256) | ir1Var.m6894i(c62Var);
                objM6869O5 = ir1Var.m6869O();
                if (zM6894i) {
                    u40 u40Var16 = u40Var2;
                    objM6869O5 = new t40(c0910mi, f, z2, u40Var16, c62Var, null);
                    u40Var3 = u40Var16;
                    ir1Var.m6905n0(objM6869O5);
                } else {
                    u40 u40Var17 = u40Var2;
                    objM6869O5 = new t40(c0910mi, f, z2, u40Var17, c62Var, null);
                    u40Var3 = u40Var17;
                    ir1Var.m6905n0(objM6869O5);
                }
                lb5.m7926g(ir1Var, (mq1) objM6869O5, p11VarM9350a4);
                c0457ak = c0910mi.f24929c;
                ir1Var.m6912r(false);
            }
            if (c0457ak != null) {
                f2 = ((p11) c0457ak.f14572b.getValue()).f27285a;
            } else {
                f2 = 0.0f;
            }
            objM6869O6 = ir1Var.m6869O();
            if (objM6869O6 == i50Var) {
                objM6869O6 = new C0499bp((byte) 8);
                ir1Var.m6905n0(objM6869O6);
            }
            nt2 nt2VarM5458a4 = f14.m5458a(nt2Var3, false, (yp1) objM6869O6);
            C0905md c0905md4 = new C0905md((byte) 1);
            c0905md4.f24822b = j2;
            c0905md4.f24823c = e73Var4;
            c0905md4.f24824d = pg0Var;
            VarHandle.storeStoreFence();
            pg0 pg0VarM11834R4 = vd6.m11834R(-535639973, c0905md4, ir1Var);
            int i114 = i11;
            nt2 nt2Var7 = nt2Var3;
            long j10 = j2;
            boolean z7 = z2;
            wp1Var2 = wp1Var;
            kf4.m7512b(wp1Var2, nt2VarM5458a4, z7, p44VarM10977a, j9, j10, 0.0f, f2, h10Var2, nv2Var, pg0VarM11834R4, ir1Var, (i114 & 8078) | ((i114 << 6) & 234881024), 64);
            z2 = z7;
            u40Var2 = u40Var3;
            nt2Var2 = nt2Var7;
            e73Var2 = e73Var4;
            h10Var2 = h10Var2;
            q40Var2 = q40Var4;
            p44VarM10977a = p44VarM10977a;
        } else {
            wp1Var2 = wp1Var;
            ir1Var.m6874W();
            e73Var2 = e73Var;
        }
        yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            w40 w40Var4 = new w40();
            w40Var4.f33064a = wp1Var2;
            w40Var4.f33065b = nt2Var2;
            w40Var4.f33066c = z2;
            w40Var4.f33067d = p44VarM10977a;
            w40Var4.f33068e = q40Var2;
            w40Var4.f33069f = u40Var2;
            w40Var4.f33070g = h10Var2;
            w40Var4.f33071h = e73Var2;
            w40Var4.f33072i = pg0Var;
            w40Var4.f33073j = i;
            w40Var4.f33074k = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = w40Var4;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static int m13866b0(ri3 ri3Var, int[] iArr) {
        return ((((((iArr[m13848L(ri3Var.f29317b, ri3Var.f29319d, ri3Var.f29321f)] - iArr[m13848L(ri3Var.f29317b, ri3Var.f29319d, ri3Var.f29320e)]) - iArr[m13848L(ri3Var.f29317b, ri3Var.f29318c, ri3Var.f29321f)]) + iArr[m13848L(ri3Var.f29317b, ri3Var.f29318c, ri3Var.f29320e)]) - iArr[m13848L(ri3Var.f29316a, ri3Var.f29319d, ri3Var.f29321f)]) + iArr[m13848L(ri3Var.f29316a, ri3Var.f29319d, ri3Var.f29320e)]) + iArr[m13848L(ri3Var.f29316a, ri3Var.f29318c, ri3Var.f29321f)]) - iArr[m13848L(ri3Var.f29316a, ri3Var.f29318c, ri3Var.f29320e)];
    }

    /* JADX WARN: Code duplicated, block: B:102:0x014f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0156  */
    /* JADX WARN: Code duplicated, block: B:109:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0165  */
    /* JADX WARN: Code duplicated, block: B:112:0x016a  */
    /* JADX WARN: Code duplicated, block: B:114:0x016e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0174 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0176  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0184  */
    /* JADX WARN: Code duplicated, block: B:122:0x0186  */
    /* JADX WARN: Code duplicated, block: B:124:0x018c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0195  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:135:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:79:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0104  */
    /* JADX WARN: Code duplicated, block: B:81:0x0107  */
    /* JADX WARN: Code duplicated, block: B:83:0x010a  */
    /* JADX WARN: Code duplicated, block: B:85:0x010e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0116  */
    /* JADX WARN: Code duplicated, block: B:90:0x011f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0125  */
    /* JADX WARN: Code duplicated, block: B:93:0x0128  */
    /* JADX WARN: Code duplicated, block: B:95:0x012e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0138  */
    /* JADX INFO: renamed from: c */
    public static final long m13867c(float f, float f2, float f3, float f4, lc0 lc0Var) {
        int i;
        int i2;
        int i3;
        float fMo7947b;
        float fMo7946a;
        int iFloatToRawIntBits;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float fMo7947b2;
        float fMo7946a2;
        int iFloatToRawIntBits2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f5;
        if (lc0Var.mo7948c()) {
            float f6 = f4 < 0.0f ? 0.0f : f4;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i20 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f < 0.0f ? 0.0f : f;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i21 = i20 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i22 = i21 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            f5 = f3 >= 0.0f ? f3 : 0.0f;
            long j = ((long) (i22 | ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i23 = pb0.f27502i;
            return j;
        }
        int i24 = lc0Var.f23931c;
        if (i24 == -1) {
            p32.m9361a("Unknown color space, please use a color space in ColorSpaces");
        }
        int i25 = 0;
        float fMo7947b3 = lc0Var.mo7947b(0);
        float fMo7946a3 = lc0Var.mo7946a(0);
        if (f >= fMo7947b3) {
            fMo7947b3 = f;
        }
        if (fMo7947b3 <= fMo7946a3) {
            fMo7946a3 = fMo7947b3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fMo7946a3);
        int i26 = iFloatToRawIntBits3 >>> 31;
        int i27 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i28 = iFloatToRawIntBits3 & 8388607;
        if (i27 == 255) {
            i2 = i28 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i27 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else {
                if (i > 0) {
                    int i29 = i28 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i3 = (((i << 10) | i29) + 1) | (i26 << 15);
                    } else {
                        i2 = i29;
                    }
                    short s = (short) i3;
                    fMo7947b = lc0Var.mo7947b(1);
                    fMo7946a = lc0Var.mo7946a(1);
                    if (f2 >= fMo7947b) {
                        fMo7947b = f2;
                    }
                    if (fMo7947b <= fMo7946a) {
                        fMo7946a = fMo7947b;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fMo7946a);
                    i4 = iFloatToRawIntBits >>> 31;
                    i5 = (iFloatToRawIntBits >>> 23) & 255;
                    i6 = iFloatToRawIntBits & 8388607;
                    if (i5 == 255) {
                        if (i6 != 0) {
                            i9 = 512;
                        } else {
                            i9 = 0;
                        }
                        i7 = 31;
                    } else {
                        i7 = i5 - 112;
                        if (i7 >= 31) {
                            i9 = 0;
                            i7 = 49;
                        } else {
                            if (i7 <= 0) {
                                i8 = i6 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                                } else {
                                    i9 = i8;
                                }
                                short s2 = (short) i10;
                                fMo7947b2 = lc0Var.mo7947b(2);
                                fMo7946a2 = lc0Var.mo7946a(2);
                                if (f3 >= fMo7947b2) {
                                    fMo7947b2 = f3;
                                }
                                if (fMo7947b2 <= fMo7946a2) {
                                    fMo7946a2 = fMo7947b2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo7946a2);
                                i12 = iFloatToRawIntBits2 >>> 31;
                                i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i14 = 8388607 & iFloatToRawIntBits2;
                                if (i13 == 255) {
                                    i17 = i14 != 0 ? 512 : 0;
                                    i25 = 31;
                                } else {
                                    i15 = i13 - 112;
                                    if (i15 >= 31) {
                                        i17 = 0;
                                        i25 = 49;
                                    } else {
                                        if (i15 <= 0) {
                                            i16 = i14 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                            } else {
                                                i17 = i16;
                                                i25 = i15;
                                            }
                                            short s3 = (short) i18;
                                            f5 = f4 >= 0.0f ? f4 : 0.0f;
                                            long j2 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s3)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i30 = pb0.f27502i;
                                            return j2;
                                        }
                                        if (i15 >= -10) {
                                            i19 = (i14 | 8388608) >> (1 - i15);
                                            if ((i19 & 4096) != 0) {
                                                i19 += 8192;
                                            }
                                            i17 = i19 >> 13;
                                        } else {
                                            i17 = 0;
                                        }
                                    }
                                }
                                i18 = i17 | (i12 << 15) | (i25 << 10);
                                short s4 = (short) i18;
                                if (f4 >= 0.0f) {
                                }
                                long j3 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s4)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i31 = pb0.f27502i;
                                return j3;
                            }
                            if (i7 >= -10) {
                                i11 = (i6 | 8388608) >> (1 - i7);
                                if ((i11 & 4096) != 0) {
                                    i11 += 8192;
                                }
                                i9 = i11 >> 13;
                                i7 = 0;
                            } else {
                                i9 = 0;
                                i7 = 0;
                            }
                        }
                    }
                    i10 = i9 | (i4 << 15) | (i7 << 10);
                    short s5 = (short) i10;
                    fMo7947b2 = lc0Var.mo7947b(2);
                    fMo7946a2 = lc0Var.mo7946a(2);
                    if (f3 >= fMo7947b2) {
                        fMo7947b2 = f3;
                    }
                    if (fMo7947b2 <= fMo7946a2) {
                        fMo7946a2 = fMo7947b2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo7946a2);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i17 = i14 != 0 ? 512 : 0;
                        i25 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i25 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                    i25 = i15;
                                }
                                short s6 = (short) i18;
                                if (f4 >= 0.0f) {
                                }
                                long j4 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s6)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i32 = pb0.f27502i;
                                return j4;
                            }
                            if (i15 >= -10) {
                                i19 = (i14 | 8388608) >> (1 - i15);
                                if ((i19 & 4096) != 0) {
                                    i19 += 8192;
                                }
                                i17 = i19 >> 13;
                            } else {
                                i17 = 0;
                            }
                        }
                    }
                    i18 = i17 | (i12 << 15) | (i25 << 10);
                    short s7 = (short) i18;
                    if (f4 >= 0.0f) {
                    }
                    long j5 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s7)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i33 = pb0.f27502i;
                    return j5;
                }
                if (i >= -10) {
                    int i34 = (i28 | 8388608) >> (1 - i);
                    if ((i34 & 4096) != 0) {
                        i34 += 8192;
                    }
                    i2 = i34 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        i3 = i2 | (i26 << 15) | (i << 10);
        short s8 = (short) i3;
        fMo7947b = lc0Var.mo7947b(1);
        fMo7946a = lc0Var.mo7946a(1);
        if (f2 >= fMo7947b) {
            fMo7947b = f2;
        }
        if (fMo7947b <= fMo7946a) {
            fMo7946a = fMo7947b;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fMo7946a);
        i4 = iFloatToRawIntBits >>> 31;
        i5 = (iFloatToRawIntBits >>> 23) & 255;
        i6 = iFloatToRawIntBits & 8388607;
        if (i5 == 255) {
            if (i6 != 0) {
                i9 = 512;
            } else {
                i9 = 0;
            }
            i7 = 31;
        } else {
            i7 = i5 - 112;
            if (i7 >= 31) {
                i9 = 0;
                i7 = 49;
            } else {
                if (i7 <= 0) {
                    i8 = i6 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                    } else {
                        i9 = i8;
                    }
                    short s9 = (short) i10;
                    fMo7947b2 = lc0Var.mo7947b(2);
                    fMo7946a2 = lc0Var.mo7946a(2);
                    if (f3 >= fMo7947b2) {
                        fMo7947b2 = f3;
                    }
                    if (fMo7947b2 <= fMo7946a2) {
                        fMo7946a2 = fMo7947b2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo7946a2);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i17 = i14 != 0 ? 512 : 0;
                        i25 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i25 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                    i25 = i15;
                                }
                                short s10 = (short) i18;
                                if (f4 >= 0.0f) {
                                }
                                long j6 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((65535 & ((long) s10)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i35 = pb0.f27502i;
                                return j6;
                            }
                            if (i15 >= -10) {
                                i19 = (i14 | 8388608) >> (1 - i15);
                                if ((i19 & 4096) != 0) {
                                    i19 += 8192;
                                }
                                i17 = i19 >> 13;
                            } else {
                                i17 = 0;
                            }
                        }
                    }
                    i18 = i17 | (i12 << 15) | (i25 << 10);
                    short s11 = (short) i18;
                    if (f4 >= 0.0f) {
                    }
                    long j7 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((65535 & ((long) s11)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i36 = pb0.f27502i;
                    return j7;
                }
                if (i7 >= -10) {
                    i11 = (i6 | 8388608) >> (1 - i7);
                    if ((i11 & 4096) != 0) {
                        i11 += 8192;
                    }
                    i9 = i11 >> 13;
                    i7 = 0;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
            }
        }
        i10 = i9 | (i4 << 15) | (i7 << 10);
        short s12 = (short) i10;
        fMo7947b2 = lc0Var.mo7947b(2);
        fMo7946a2 = lc0Var.mo7946a(2);
        if (f3 >= fMo7947b2) {
            fMo7947b2 = f3;
        }
        if (fMo7947b2 <= fMo7946a2) {
            fMo7946a2 = fMo7947b2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fMo7946a2);
        i12 = iFloatToRawIntBits2 >>> 31;
        i13 = (iFloatToRawIntBits2 >>> 23) & 255;
        i14 = 8388607 & iFloatToRawIntBits2;
        if (i13 == 255) {
            i17 = i14 != 0 ? 512 : 0;
            i25 = 31;
        } else {
            i15 = i13 - 112;
            if (i15 >= 31) {
                i17 = 0;
                i25 = 49;
            } else {
                if (i15 <= 0) {
                    i16 = i14 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                    } else {
                        i17 = i16;
                        i25 = i15;
                    }
                    short s13 = (short) i18;
                    if (f4 >= 0.0f) {
                    }
                    long j8 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s13)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i37 = pb0.f27502i;
                    return j8;
                }
                if (i15 >= -10) {
                    i19 = (i14 | 8388608) >> (1 - i15);
                    if ((i19 & 4096) != 0) {
                        i19 += 8192;
                    }
                    i17 = i19 >> 13;
                } else {
                    i17 = 0;
                }
            }
        }
        i18 = i17 | (i12 << 15) | (i25 << 10);
        short s14 = (short) i18;
        if (f4 >= 0.0f) {
        }
        long j9 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s14)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i38 = pb0.f27502i;
        return j9;
    }

    /* JADX INFO: renamed from: c0 */
    public static yn5 m13868c0(Context context, boolean z, boolean z2) {
        ApplicationInfo applicationInfo;
        jn5 jn5VarM7191n;
        synchronized (f36490s) {
            try {
                String str = f36489r;
                if (str != null && !"155.0.8059.16".equals(str)) {
                    throw new IllegalStateException("getHttpFlags() called multiple times with different versions");
                }
                yn5 yn5Var = f36488q;
                if (yn5Var != null) {
                    return yn5Var;
                }
                f36489r = "155.0.8059.16";
                ry5.m10503a("HttpFlagsLoader#getHttpFlags loading flags");
                try {
                    jn5 jn5Var = null;
                    if (qs5.m10095T(context).getBoolean("android.net.http.ReadHttpFlags", true)) {
                        try {
                            ry5.m10503a("HttpFlagsLoader#getProviderApplicationInfo");
                            try {
                                ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(new Intent("android.net.http.FLAGS_FILE_PROVIDER"), 1048576);
                                if (resolveInfoResolveService == null) {
                                    Log.i("cn_HttpFlagsLoader", "Unable to resolve the HTTP flags file provider package. This is expected if the host system is not set up to provide HTTP flags.");
                                    Trace.endSection();
                                    applicationInfo = null;
                                } else {
                                    applicationInfo = resolveInfoResolveService.serviceInfo.applicationInfo;
                                    Trace.endSection();
                                }
                                if (applicationInfo != null) {
                                    rw5.m10480b("HttpFlagsLoader", "Found application exporting HTTP flags: %s", applicationInfo.packageName);
                                    File file = new File(new File(new File(applicationInfo.deviceProtectedDataDir), "app_httpflags"), "flags.binarypb");
                                    rw5.m10480b("HttpFlagsLoader", "HTTP flags file path: %s", file.getAbsolutePath());
                                    ry5.m10503a("HttpFlagsLoader#loadFlagsFile");
                                    try {
                                        try {
                                            try {
                                                FileInputStream fileInputStream = new FileInputStream(file);
                                                try {
                                                    jn5VarM7191n = jn5.m7191n(fileInputStream);
                                                    fileInputStream.close();
                                                    Trace.endSection();
                                                    if (jn5VarM7191n != null) {
                                                        if (Log.isLoggable("HttpFlagsLoader", 3)) {
                                                            rw5.m10480b("HttpFlagsLoader", "Successfully loaded HTTP flags: %s", jn5VarM7191n);
                                                        }
                                                        jn5Var = jn5VarM7191n;
                                                    }
                                                } catch (Throwable th) {
                                                    try {
                                                        fileInputStream.close();
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                    throw th;
                                                }
                                            } catch (FileNotFoundException unused) {
                                                Log.i("cn_HttpFlagsLoader", "HTTP flags file `" + file.getPath() + "` is missing. This is expected if HTTP flags functionality is currently disabled in the host system.");
                                                Trace.endSection();
                                                jn5VarM7191n = null;
                                            }
                                        } catch (IOException e) {
                                            throw new RuntimeException("Unable to read HTTP flags file", e);
                                        }
                                    } catch (Throwable th3) {
                                        try {
                                            Trace.endSection();
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                        }
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th5) {
                                try {
                                    Trace.endSection();
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                }
                                throw th5;
                            }
                        } catch (RuntimeException e2) {
                            Log.i("cn_HttpFlagsLoader", "Unable to load HTTP flags file", e2);
                        }
                    } else {
                        rw5.m10480b("HttpFlagsLoader", "Not loading HTTP flags because they are disabled in the manifest", new Object[0]);
                    }
                    if (jn5Var == null) {
                        jn5Var = (jn5) jn5.m7190m().m6061a();
                    }
                    yn5 yn5VarM13184a = yn5.m13184a(jn5Var, context.getPackageName(), z2);
                    f36488q = yn5VarM13184a;
                    tn5 tn5Var = (tn5) Collections.unmodifiableMap(yn5VarM13184a.f35372a).get("Cronet_log_me");
                    if (tn5Var != null) {
                        String str2 = z ? "API" : "Impl";
                        Log.i("cn_HttpFlagsLoader", "HTTP flags log line (" + str2 + "): " + tn5Var.m11071b());
                    }
                    yn5 yn5Var2 = f36488q;
                    Trace.endSection();
                    return yn5Var2;
                } catch (Throwable th7) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
            } catch (Throwable th9) {
                throw th9;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final long m13869d(int i) {
        long j = ((long) i) << 32;
        int i2 = pb0.f27502i;
        return j;
    }

    /* JADX INFO: renamed from: e */
    public static final long m13870e(long j) {
        long j2 = j << 32;
        int i = pb0.f27502i;
        return j2;
    }

    /* JADX INFO: renamed from: f */
    public static long m13871f(int i, int i2, int i3) {
        return m13869d(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }

    /* JADX INFO: renamed from: g */
    public static final void m13872g(nt2 nt2Var, C0880lp c0880lp, InterfaceC0520ca interfaceC0520ca, jm0 jm0Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(777774312);
        byte b = 4;
        if ((i & 14) == 0) {
            i2 = (ir1Var.m6890g(nt2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= ir1Var.m6890g(c0880lp) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= ir1Var.m6890g(null) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= ir1Var.m6890g(interfaceC0520ca) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= ir1Var.m6890g(jm0Var) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= ir1Var.m6884d(1.0f) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= ir1Var.m6890g(null) ? 1048576 : 524288;
        }
        byte b2 = 1;
        if ((29360128 & i) == 0) {
            i2 |= ir1Var.m6892h(true) ? 8388608 : 4194304;
        }
        if ((i2 & 23967451) == 4793490 && ir1Var.m6858D()) {
            ir1Var.m6874W();
        } else {
            sk3 sk3Var = fw4.f19357b;
            nt2 nt2VarMo7630d = i25.m6620n(nt2Var).mo7630d(new gm0(c0880lp, interfaceC0520ca, jm0Var, 1.0f, null));
            C1180tf c1180tf = C1180tf.f31101c;
            ir1Var.m6887e0(544976794);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarMo7630d);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            bi0.f15310ap.getClass();
            ir1Var.m6887e0(1405779621);
            if (ir1Var.f21685a == null) {
                dt0.m4682E();
                throw null;
            }
            ir1Var.m6893h0();
            int i3 = 0;
            if (ir1Var.f21682S) {
                ir1Var.m6900l(new b41(i3, b));
            } else {
                ir1Var.m6911q0();
            }
            C0006a5.m53I(ir1Var, ia5.f21216g, c1180tf);
            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
            jh0 jh0Var = ia5.f21217h;
            if (ir1Var.f21682S || !z62.m13387o(ir1Var.m6869O(), Integer.valueOf(iHashCode))) {
                ir1Var.m6905n0(Integer.valueOf(iHashCode));
                ir1Var.m6880b(jh0Var, Integer.valueOf(iHashCode));
            }
            ir1Var.m6912r(true);
            ir1Var.m6912r(false);
            ir1Var.m6912r(false);
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0877lm c0877lm = new C0877lm(b2);
            c0877lm.f24144c = nt2Var;
            c0877lm.f24145d = c0880lp;
            c0877lm.f24146e = interfaceC0520ca;
            c0877lm.f24147f = jm0Var;
            c0877lm.f24143b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0877lm;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x012f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0133  */
    /* JADX WARN: Code duplicated, block: B:66:0x013b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0144  */
    /* JADX WARN: Code duplicated, block: B:69:0x0147  */
    /* JADX WARN: Code duplicated, block: B:70:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0158  */
    /* JADX WARN: Code duplicated, block: B:76:0x0179  */
    /* JADX WARN: Code duplicated, block: B:79:0x0189  */
    /* JADX WARN: Code duplicated, block: B:83:0x019c  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c1  */
    /* JADX INFO: renamed from: h */
    public static C0759ie m13873h(int i, int i2, int i3) {
        ColorSpace rgb;
        String str;
        float[] fArrM11687a;
        ColorSpace.Rgb.TransferParameters transferParameters;
        float[] fArr;
        ColorSpace.Rgb rgb2;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        qp3 qp3Var = oc0.f26551e;
        AbstractC0647fd.m5658P(i3);
        Bitmap.Config configM5658P = AbstractC0647fd.m5658P(i3);
        if (z62.m13387o(qp3Var, qp3Var)) {
            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (z62.m13387o(qp3Var, oc0.f26563q)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (z62.m13387o(qp3Var, oc0.f26564r)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (z62.m13387o(qp3Var, oc0.f26561o)) {
            rgb = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (z62.m13387o(qp3Var, oc0.f26556j)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (z62.m13387o(qp3Var, oc0.f26555i)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (z62.m13387o(qp3Var, oc0.f26566t)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (z62.m13387o(qp3Var, oc0.f26565s)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (z62.m13387o(qp3Var, oc0.f26557k)) {
            rgb = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (z62.m13387o(qp3Var, oc0.f26558l)) {
            rgb = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (z62.m13387o(qp3Var, oc0.f26553g)) {
            rgb = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (z62.m13387o(qp3Var, oc0.f26554h)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (z62.m13387o(qp3Var, oc0.f26552f)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (z62.m13387o(qp3Var, oc0.f26559m)) {
            rgb = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (z62.m13387o(qp3Var, oc0.f26562p)) {
            rgb = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!z62.m13387o(qp3Var, oc0.f26560n)) {
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 34) {
                    if (z62.m13387o(qp3Var, oc0.f26568v)) {
                        colorSpace3 = ColorSpace.get(ColorSpace.Named.BT2020_HLG);
                    } else {
                        colorSpace3 = z62.m13387o(qp3Var, oc0.f26569w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
                    }
                    if (colorSpace3 != null) {
                        colorSpace = colorSpace3;
                    } else if (i4 < 36) {
                        if (z62.m13387o(qp3Var, oc0.f26570x)) {
                            colorSpace2 = ColorSpace.get(ColorSpace.Named.OK_LAB);
                        } else {
                            colorSpace2 = null;
                        }
                        if (colorSpace2 != null) {
                            colorSpace = colorSpace2;
                        } else if (qp3Var != null) {
                            str = qp3Var.f23929a;
                            fArrM11687a = qp3Var.f28661d.m11687a();
                            so4 so4Var = qp3Var.f28664g;
                            if (so4Var != null) {
                            }
                            fArr = qp3Var.f28666i;
                            if (transferParameters != null) {
                                rgb2 = new ColorSpace.Rgb(str, qp3Var.f28665h, fArrM11687a, transferParameters);
                                if (!Float.isNaN(fArr[0])) {
                                    rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                                }
                            } else {
                                float[] fArr2 = qp3Var.f28665h;
                                pp3 pp3Var = qp3Var.f28669l;
                                nc0 nc0Var = new nc0((byte) 0);
                                nc0Var.f25631b = pp3Var;
                                VarHandle.storeStoreFence();
                                pp3 pp3Var2 = qp3Var.f28672o;
                                nc0 nc0Var2 = new nc0((byte) 1);
                                nc0Var2.f25631b = pp3Var2;
                                VarHandle.storeStoreFence();
                                rgb2 = new ColorSpace.Rgb(str, fArr2, fArrM11687a, nc0Var, nc0Var2, qp3Var.f28662e, qp3Var.f28663f);
                            }
                            colorSpace = rgb2;
                        } else {
                            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                        }
                    } else if (qp3Var != null) {
                        str = qp3Var.f23929a;
                        fArrM11687a = qp3Var.f28661d.m11687a();
                        so4 so4Var2 = qp3Var.f28664g;
                        if (so4Var2 != null) {
                        }
                        fArr = qp3Var.f28666i;
                        if (transferParameters != null) {
                            rgb2 = new ColorSpace.Rgb(str, qp3Var.f28665h, fArrM11687a, transferParameters);
                            if (!Float.isNaN(fArr[0])) {
                                rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                            }
                        } else {
                            float[] fArr3 = qp3Var.f28665h;
                            pp3 pp3Var3 = qp3Var.f28669l;
                            nc0 nc0Var3 = new nc0((byte) 0);
                            nc0Var3.f25631b = pp3Var3;
                            VarHandle.storeStoreFence();
                            pp3 pp3Var4 = qp3Var.f28672o;
                            nc0 nc0Var4 = new nc0((byte) 1);
                            nc0Var4.f25631b = pp3Var4;
                            VarHandle.storeStoreFence();
                            rgb2 = new ColorSpace.Rgb(str, fArr3, fArrM11687a, nc0Var3, nc0Var4, qp3Var.f28662e, qp3Var.f28663f);
                        }
                        colorSpace = rgb2;
                    } else {
                        rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                } else if (i4 < 36) {
                    if (z62.m13387o(qp3Var, oc0.f26570x)) {
                        colorSpace2 = ColorSpace.get(ColorSpace.Named.OK_LAB);
                    } else {
                        colorSpace2 = null;
                    }
                    if (colorSpace2 != null) {
                        colorSpace = colorSpace2;
                    } else if (qp3Var != null) {
                        str = qp3Var.f23929a;
                        fArrM11687a = qp3Var.f28661d.m11687a();
                        so4 so4Var3 = qp3Var.f28664g;
                        if (so4Var3 != null) {
                        }
                        fArr = qp3Var.f28666i;
                        if (transferParameters != null) {
                            rgb2 = new ColorSpace.Rgb(str, qp3Var.f28665h, fArrM11687a, transferParameters);
                            if (!Float.isNaN(fArr[0])) {
                                rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                            }
                        } else {
                            float[] fArr4 = qp3Var.f28665h;
                            pp3 pp3Var5 = qp3Var.f28669l;
                            nc0 nc0Var5 = new nc0((byte) 0);
                            nc0Var5.f25631b = pp3Var5;
                            VarHandle.storeStoreFence();
                            pp3 pp3Var6 = qp3Var.f28672o;
                            nc0 nc0Var6 = new nc0((byte) 1);
                            nc0Var6.f25631b = pp3Var6;
                            VarHandle.storeStoreFence();
                            rgb2 = new ColorSpace.Rgb(str, fArr4, fArrM11687a, nc0Var5, nc0Var6, qp3Var.f28662e, qp3Var.f28663f);
                        }
                        colorSpace = rgb2;
                    } else {
                        rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                } else if (qp3Var != null) {
                    str = qp3Var.f23929a;
                    fArrM11687a = qp3Var.f28661d.m11687a();
                    so4 so4Var4 = qp3Var.f28664g;
                    transferParameters = so4Var4 != null ? new ColorSpace.Rgb.TransferParameters(so4Var4.f30446b, so4Var4.f30447c, so4Var4.f30448d, so4Var4.f30449e, so4Var4.f30450f, so4Var4.f30451g, so4Var4.f30445a) : null;
                    fArr = qp3Var.f28666i;
                    if (transferParameters != null) {
                        rgb2 = new ColorSpace.Rgb(str, qp3Var.f28665h, fArrM11687a, transferParameters);
                        if (!Float.isNaN(fArr[0]) && !Arrays.equals(rgb2.getTransform(), fArr)) {
                            rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                        }
                    } else {
                        float[] fArr5 = qp3Var.f28665h;
                        pp3 pp3Var7 = qp3Var.f28669l;
                        nc0 nc0Var7 = new nc0((byte) 0);
                        nc0Var7.f25631b = pp3Var7;
                        VarHandle.storeStoreFence();
                        pp3 pp3Var8 = qp3Var.f28672o;
                        nc0 nc0Var8 = new nc0((byte) 1);
                        nc0Var8.f25631b = pp3Var8;
                        VarHandle.storeStoreFence();
                        rgb2 = new ColorSpace.Rgb(str, fArr5, fArrM11687a, nc0Var7, nc0Var8, qp3Var.f28662e, qp3Var.f28663f);
                    }
                    colorSpace = rgb2;
                } else {
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new C0759ie(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configM5658P, true, colorSpace));
            }
            rgb = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        colorSpace = rgb;
        return new C0759ie(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configM5658P, true, colorSpace));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v3, types: [wp1] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r15v2, types: [wp1] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX INFO: renamed from: i */
    public static final void m13874i(int i, vx2 vx2Var, nt2 nt2Var, mi0 mi0Var, int i2) throws Throwable {
        nt2 nt2Var2;
        pn0 pn0VarM8040b;
        sw2 sw2Var;
        Throwable th;
        Object obj;
        ?? r15;
        ?? r13;
        l73 l73Var;
        Object k31Var;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(438806905);
        byte b = 16;
        int i3 = i2 | (ir1Var.m6890g(vx2Var) ? 32 : 16) | 384;
        byte b2 = 4;
        if (ir1Var.m6871T(i3 & 1, (i3 & 145) != 144)) {
            pn0 pn0VarM8040b2 = ln0.m8040b(vx2Var.f32907a, "nav_bar_click", ir1Var);
            sn0 sn0Var = vx2Var.f32908b;
            if (sn0Var == null) {
                ir1Var.m6885d0(-1383752789);
                ir1Var.m6912r(false);
                pn0VarM8040b = null;
            } else {
                ir1Var.m6885d0(786646806);
                pn0VarM8040b = ln0.m8040b(sn0Var, "nav_bar_long_click", ir1Var);
                ir1Var.m6912r(false);
            }
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                objM6869O = sj3.m10810f();
                ir1Var.m6905n0(objM6869O);
            }
            nv2 nv2Var = (nv2) objM6869O;
            boolean zM6892h = ir1Var.m6892h(pn0VarM8040b != null);
            Object objM6869O2 = ir1Var.m6869O();
            if (zM6892h || objM6869O2 == i50Var) {
                objM6869O2 = k43.m7398w(Boolean.FALSE);
                ir1Var.m6905n0(objM6869O2);
            }
            sw2 sw2Var2 = (sw2) objM6869O2;
            if (pn0VarM8040b != null) {
                ir1Var.m6885d0(-1383529340);
                r50 r50Var = i41.f21117b;
                long jM3239R = as4.m3239R(((fy4) ir1Var.m6898k(ij0.f21485t)).mo5858c(), m41.MILLISECONDS);
                sw2 sw2VarM13392t = z62.m13392t(nv2Var, ir1Var, 6);
                i41 i41VarM6644c = i41.m6644c(jM3239R);
                boolean zM6890g = ir1Var.m6890g(sw2VarM13392t) | ir1Var.m6888f(jM3239R) | ir1Var.m6890g(sw2Var2);
                th = null;
                Object objM6869O3 = ir1Var.m6869O();
                if (zM6890g || objM6869O3 == i50Var) {
                    sw2Var = sw2Var2;
                    k31Var = new k31((Object) sw2VarM13392t, jM3239R, (Object) sw2Var, (wm0) null, (byte) 1);
                    ir1Var.m6905n0(k31Var);
                } else {
                    k31Var = objM6869O3;
                    sw2Var = sw2Var2;
                }
                lb5.m7926g(ir1Var, (mq1) k31Var, i41VarM6644c);
                ir1Var.m6912r(false);
            } else {
                sw2Var = sw2Var2;
                th = null;
                ir1Var.m6885d0(-1383032503);
                ir1Var.m6912r(false);
            }
            lv1 lv1Var = (lv1) ir1Var.m6898k(nv1.f26110a);
            vf1 vf1Var = n74.f25506c;
            fr3 fr3Var = gr3.f20083a;
            s93 s93VarM5664b = AbstractC0647fd.m5664b(50);
            nt2 nt2VarM6619m = i25.m6619m(vf1Var, new fr3(s93VarM5664b, s93VarM5664b, s93VarM5664b, s93VarM5664b));
            yp1 yp1VarMo6047c = pn0VarM8040b2.mo6047c();
            r71 r71Var = r71.f29063a;
            if (yp1VarMo6047c == null) {
                ir1Var.m6885d0(-1382795850);
                ir1Var.m6912r(false);
                obj = th;
            } else {
                ir1Var.m6885d0(-1382795849);
                Object objM6869O4 = ir1Var.m6869O();
                if (objM6869O4 == i50Var) {
                    objM6869O4 = lb5.m7942w(r71Var, ir1Var);
                    ir1Var.m6905n0(objM6869O4);
                }
                C1297wl c1297wl = new C1297wl(b2);
                c1297wl.f33457b = (zo0) objM6869O4;
                c1297wl.f33458c = lv1Var;
                c1297wl.f33459d = yp1VarMo6047c;
                VarHandle.storeStoreFence();
                ir1Var.m6912r(false);
                obj = c1297wl;
            }
            if (obj == null) {
                ir1Var.m6885d0(-1382682265);
                Object objM6869O5 = ir1Var.m6869O();
                if (objM6869O5 == i50Var) {
                    objM6869O5 = new da2(b);
                    ir1Var.m6905n0(objM6869O5);
                }
                r15 = (wp1) objM6869O5;
            } else {
                ir1Var.m6885d0(786677154);
                r15 = obj;
            }
            ir1Var.m6912r(false);
            Object objMo6047c = pn0VarM8040b != null ? pn0VarM8040b.mo6047c() : th;
            byte b3 = 3;
            if (objMo6047c == null) {
                ir1Var.m6885d0(-1382632759);
                ir1Var.m6912r(false);
                r13 = th;
            } else {
                ir1Var.m6885d0(-1382632758);
                Object objM6869O6 = ir1Var.m6869O();
                if (objM6869O6 == i50Var) {
                    objM6869O6 = lb5.m7942w(r71Var, ir1Var);
                    ir1Var.m6905n0(objM6869O6);
                }
                C0839kl c0839kl = new C0839kl(b3);
                c0839kl.f23208b = (zo0) objM6869O6;
                c0839kl.f23209c = objMo6047c;
                VarHandle.storeStoreFence();
                ir1Var.m6912r(false);
                r13 = c0839kl;
            }
            nt2 nt2VarM7677C = kx5.m7677C(nt2VarM6619m, r13, nv2Var, r15, C0313rh.f10802l1);
            xq2 xq2VarM9704c = q20.m9704c(ig1.f21382f, false);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM7677C);
            bi0.f15310ap.getClass();
            if (ir1Var.f21685a == null) {
                dt0.m4682E();
                throw th;
            }
            ir1Var.m6893h0();
            if (ir1Var.f21682S) {
                ir1Var.m6900l(wf2.f33290T);
            } else {
                ir1Var.m6911q0();
            }
            C0006a5.m53I(ir1Var, ia5.f21216g, xq2VarM9704c);
            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
            C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
            C0006a5.m50F(ir1Var);
            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
            lu2 lu2Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24280d;
            if (((Boolean) sw2Var.getValue()).booleanValue()) {
                l73Var = new l73(pn0VarM8040b != null ? pn0VarM8040b.getIcon() : th, Boolean.TRUE);
            } else {
                l73Var = new l73(pn0VarM8040b2.getIcon(), Boolean.FALSE);
            }
            l73 l73Var2 = l73Var;
            boolean zM6890g2 = ir1Var.m6890g(lu2Var);
            Object objM6869O7 = ir1Var.m6869O();
            Object obj2 = objM6869O7;
            if (zM6890g2 || objM6869O7 == i50Var) {
                C0713h5 c0713h5 = new C0713h5(b3);
                c0713h5.f20393b = lu2Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0713h5);
                obj2 = c0713h5;
            }
            ev0.m5331F(l73Var2, null, (yp1) obj2, null, null, null, sc6.f30168e, ir1Var, 1572864, 58);
            ir1Var.m6912r(true);
            nt2Var2 = kt2.f23428a;
        } else {
            ir1Var.m6874W();
            nt2Var2 = nt2Var;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            mg0 mg0Var = new mg0(b2);
            mg0Var.f24878b = i;
            mg0Var.f24879c = vx2Var;
            mg0Var.f24880d = nt2Var2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = mg0Var;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m13875j(kz2 kz2Var, boolean z, wp1 wp1Var, wp1 wp1Var2, mi0 mi0Var, int i) {
        int i2;
        kz2 kz2Var2;
        boolean z2;
        wp1 wp1Var3;
        wp1 wp1Var4;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1220469155);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(kz2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6892h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6894i(wp1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6894i(wp1Var2) ? 2048 : 1024;
        }
        if (ir1Var.m6871T(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                objM6869O = new da2((byte) 17);
                ir1Var.m6905n0(objM6869O);
            }
            wp1 wp1Var5 = (wp1) objM6869O;
            Object objM6869O2 = ir1Var.m6869O();
            if (objM6869O2 == i50Var) {
                objM6869O2 = new da2((byte) 19);
                ir1Var.m6905n0(objM6869O2);
            }
            wp1 wp1Var6 = (wp1) objM6869O2;
            int i3 = (i2 & 14) | 3504;
            int i4 = i2 << 9;
            int i5 = i3 | (57344 & i4) | (458752 & i4) | (i4 & 3670016);
            kz2Var2 = kz2Var;
            z2 = z;
            wp1Var3 = wp1Var;
            wp1Var4 = wp1Var2;
            m13881p(kz2Var2, false, wp1Var5, wp1Var6, z2, wp1Var3, wp1Var4, ir1Var, i5);
        } else {
            kz2Var2 = kz2Var;
            z2 = z;
            wp1Var3 = wp1Var;
            wp1Var4 = wp1Var2;
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ez2 ez2Var = new ez2();
            ez2Var.f18599a = kz2Var2;
            ez2Var.f18600b = z2;
            ez2Var.f18601c = wp1Var3;
            ez2Var.f18602d = wp1Var4;
            ez2Var.f18603e = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ez2Var;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m13876k(List list, Map map, ie1 ie1Var, zx2 zx2Var, mi0 mi0Var, int i) {
        Object obj;
        xn2 xn2Var;
        int i2;
        Object obj2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1335212505);
        byte b = 2;
        int i3 = i | (ir1Var.m6890g(list) ? 4 : 2) | (ir1Var.m6890g(map) ? 32 : 16) | (ir1Var.m6890g(ie1Var) ? 256 : 128) | (ir1Var.m6890g(zx2Var) ? 2048 : 1024);
        if (ir1Var.m6871T(i3 & 1, (i3 & 1171) != 1170)) {
            nc4 nc4Var = pq2.f27894b;
            dc0 dc0Var = ((lq2) ir1Var.m6898k(nc4Var)).f24277a;
            long j = ((pb0) ie1Var.f21284b.f18930a.invoke(dc0Var)).f27503a;
            long jM6741a = ic0.m6741a(dc0Var, j);
            nc4 nc4Var2 = je0.f22196a;
            sw2 sw2VarM7369C = k43.m7369C(null, ir1Var);
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                obj = objM6869O;
                he0 he0Var = new he0();
                he0Var.f20512c = sw2VarM7369C;
                he0Var.f20510a = new w94();
                C0932n3 c0932n3 = new C0932n3(b);
                c0932n3.f25415b = he0Var;
                VarHandle.storeStoreFence();
                he0Var.f20511b = s94.m10566b(c0932n3);
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(he0Var);
                obj = he0Var;
            }
            obj = objM6869O;
            he0 he0Var2 = (he0) obj;
            xn2 xn2Var2 = (xn2) ir1Var.m6898k(yn2.f35357b);
            if (xn2Var2 == null) {
                ir1Var.m6885d0(-1476823888);
                ir1Var.m6912r(false);
                xn2Var = null;
            } else {
                ir1Var.m6885d0(-1476823887);
                boolean zM6890g = ir1Var.m6890g("ControlHostState") | ir1Var.m6890g(xn2Var2);
                Object objM6869O2 = ir1Var.m6869O();
                if (zM6890g || objM6869O2 == i50Var) {
                    objM6869O2 = xn2Var2.m12723c("ControlHostState");
                    ir1Var.m6905n0(objM6869O2);
                }
                xn2Var = (xn2) objM6869O2;
                ir1Var.m6912r(false);
            }
            if (xn2Var != null) {
                ir1Var.m6885d0(-1691879240);
                Boolean boolValueOf = Boolean.valueOf(he0Var2.m6364a());
                boolean zM6894i = ir1Var.m6894i(xn2Var);
                Object objM6869O3 = ir1Var.m6869O();
                if (zM6894i || objM6869O3 == i50Var) {
                    obj2 = objM6869O3;
                    C0675g4 c0675g4 = new C0675g4((byte) 16);
                    c0675g4.f19600b = xn2Var;
                    c0675g4.f19601c = he0Var2;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0675g4);
                    obj2 = c0675g4;
                }
                lb5.m7932m(boolValueOf, (wp1) obj2, ir1Var);
                i2 = 0;
                ir1Var.m6912r(false);
            } else {
                i2 = 0;
                ir1Var.m6885d0(-1691781218);
                ir1Var.m6912r(false);
            }
            zh3[] zh3VarArr = {zl0.f36166a.mo7523a(e74.m4941a(jM6741a, ((lq2) ir1Var.m6898k(nc4Var)).f24280d.mo7286c(), ir1Var, i2).getValue()), je0.f22196a.mo7523a(he0Var2)};
            ty2 ty2Var = new ty2();
            ty2Var.f31533a = list;
            ty2Var.f31534b = map;
            ty2Var.f31535c = he0Var2;
            ty2Var.f31536d = zx2Var;
            ty2Var.f31537e = j;
            VarHandle.storeStoreFence();
            as4.m3245d(zh3VarArr, vd6.m11834R(-701413017, ty2Var, ir1Var), ir1Var, 48);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0613ei c0613ei = new C0613ei((byte) 7);
            c0613ei.f18113c = list;
            c0613ei.f18114d = map;
            c0613ei.f18115e = ie1Var;
            c0613ei.f18112b = zx2Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0613ei;
        }
    }

    /* JADX INFO: renamed from: l */
    public static final float m13877l(xb4 xb4Var) {
        return ((p11) xb4Var.getValue()).f27285a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m13878m(sw2 sw2Var, lu2 lu2Var, sw2 sw2Var2, pn0 pn0Var, wf4 wf4Var, ir1 ir1Var, int i) {
        Object obj;
        zh3 zh3VarMo7523a = ln0.f24194e.mo7523a(dn0.f17204b);
        nc4 nc4Var = ln0.f24195f;
        boolean z = (((i & 112) ^ 48) > 32 && ir1Var.m6886e(wf4Var.ordinal())) || (i & 48) == 32;
        Object objM6869O = ir1Var.m6869O();
        if (z || objM6869O == ki0.f23136a) {
            obj = objM6869O;
            jp1 jp1Var = new jp1((byte) 6);
            jp1Var.f22485b = wf4Var;
            jp1Var.f22486c = sw2Var;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(jp1Var);
            obj = jp1Var;
        }
        obj = objM6869O;
        zh3[] zh3VarArr = {zh3VarMo7523a, nc4Var.mo7523a((wp1) obj)};
        C0613ei c0613ei = new C0613ei((byte) 8);
        c0613ei.f18113c = wf4Var;
        c0613ei.f18114d = lu2Var;
        c0613ei.f18115e = sw2Var2;
        c0613ei.f18112b = pn0Var;
        VarHandle.storeStoreFence();
        as4.m3245d(zh3VarArr, vd6.m11834R(1871547772, c0613ei, ir1Var), ir1Var, 48);
    }

    /* JADX INFO: renamed from: n */
    public static final void m13879n(pn0 pn0Var, pn0 pn0Var2, sw2 sw2Var, lu2 lu2Var, sw2 sw2Var2, lg2 lg2Var, boolean z, ir1 ir1Var, int i) {
        sw2 sw2Var3;
        lu2 lu2Var2;
        sw2 sw2Var4;
        ir1 ir1Var2;
        pn0 pn0Var3 = z ? pn0Var : pn0Var2;
        wf4 wf4Var = z ? wf4.f33339a : wf4.f33341c;
        if (z) {
            pn0Var = pn0Var2;
        }
        wf4 wf4Var2 = z ? wf4.f33341c : wf4.f33339a;
        if (pn0Var3 != null) {
            ir1Var.m6885d0(-1199527186);
            sw2Var3 = sw2Var;
            lu2Var2 = lu2Var;
            ir1Var2 = ir1Var;
            m13878m(sw2Var3, lu2Var2, sw2Var2, pn0Var3, wf4Var, ir1Var2, 0);
            sw2Var4 = sw2Var2;
            ir1Var2.m6912r(false);
        } else {
            sw2Var3 = sw2Var;
            lu2Var2 = lu2Var;
            sw2Var4 = sw2Var2;
            ir1Var2 = ir1Var;
            ir1Var2.m6885d0(-1199457994);
            ir1Var2.m6912r(false);
        }
        i25.m6610b(ir1Var2, lg2Var);
        if (pn0Var == null) {
            ir1Var2.m6885d0(-1199309194);
            ir1Var2.m6912r(false);
        } else {
            ir1Var2.m6885d0(-1199380308);
            m13878m(sw2Var3, lu2Var2, sw2Var4, pn0Var, wf4Var2, ir1Var2, 0);
            ir1Var2.m6912r(false);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final float m13880o(float f, float f2) {
        return Math.signum(f) * f2 * ((float) Math.log10((Math.abs(f) / f2) + 1.0f)) * 0.9f;
    }

    /* JADX INFO: renamed from: p */
    public static final void m13881p(kz2 kz2Var, boolean z, wp1 wp1Var, wp1 wp1Var2, boolean z2, wp1 wp1Var3, wp1 wp1Var4, mi0 mi0Var, int i) {
        int i2;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(898330592);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(kz2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6892h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6894i(wp1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6894i(wp1Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ir1Var.m6892h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ir1Var.m6894i(wp1Var3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ir1Var.m6894i(wp1Var4) ? 1048576 : 524288;
        }
        if (ir1Var.m6871T(i2 & 1, (599187 & i2) != 599186)) {
            cz2 cz2Var = (cz2) ir1Var.m6898k(tm2.f31238a);
            if (cz2Var == null) {
                C1077qn.m9989o("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                return;
            }
            C1283w7 c1283w7Mo2974a = cz2Var.mo2974a();
            int i3 = i2 & 14;
            boolean z3 = i3 == 4;
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (z3 || objM6869O == i50Var) {
                hz2 hz2Var = (hz2) kz2Var.f23634c.getValue();
                b71 b71Var = new b71((byte) 18);
                b71Var.f15141b = kz2Var;
                VarHandle.storeStoreFence();
                oh0 oh0Var = new oh0(hz2Var, false, 0);
                oh0Var.f26691h = b71Var;
                oh0Var.f26692i = new nh0((byte) 0);
                oh0Var.f26693j = new nh0((byte) 2);
                oh0Var.f26694k = new nh0((byte) 3);
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(oh0Var);
                obj = oh0Var;
            } else {
                obj = objM6869O;
            }
            oh0 oh0Var2 = (oh0) obj;
            boolean zM6894i = ((i2 & 112) == 32) | ir1Var.m6894i(oh0Var2) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | ((i2 & 3670016) == 1048576) | (i3 == 4);
            Object objM6869O2 = ir1Var.m6869O();
            Object obj2 = objM6869O2;
            if (zM6894i || objM6869O2 == i50Var) {
                fz2 fz2Var = new fz2();
                fz2Var.f19430a = oh0Var2;
                fz2Var.f19431b = z;
                fz2Var.f19432c = wp1Var;
                fz2Var.f19433d = wp1Var2;
                fz2Var.f19434e = z2;
                fz2Var.f19435f = wp1Var3;
                fz2Var.f19436g = wp1Var4;
                fz2Var.f19437h = kz2Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(fz2Var);
                obj2 = fz2Var;
            }
            lb5.m7914W(ir1Var, (wp1) obj2);
            boolean zM6894i2 = ir1Var.m6894i(oh0Var2) | (i3 == 4) | ir1Var.m6894i(c1283w7Mo2974a);
            Object objM6869O3 = ir1Var.m6869O();
            Object obj3 = objM6869O3;
            if (zM6894i2 || objM6869O3 == i50Var) {
                C1164t c1164t = new C1164t((byte) 22);
                c1164t.f30700c = kz2Var;
                c1164t.f30699b = oh0Var2;
                c1164t.f30701d = c1283w7Mo2974a;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c1164t);
                obj3 = c1164t;
            }
            lb5.m7923d(kz2Var, (yp1) obj3, ir1Var);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            i02 i02Var = new i02((byte) 1);
            i02Var.f20976e = kz2Var;
            i02Var.f20973b = z;
            i02Var.f20977f = wp1Var;
            i02Var.f20978g = wp1Var2;
            i02Var.f20974c = z2;
            i02Var.f20979h = wp1Var3;
            i02Var.f20980i = wp1Var4;
            i02Var.f20975d = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = i02Var;
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m13882q(wp1 wp1Var, nt2 nt2Var, boolean z, p44 p44Var, q40 q40Var, h10 h10Var, e73 e73Var, mi0 mi0Var, int i) {
        nt2 nt2Var2;
        boolean z2;
        p44 p44Var2;
        q40 q40Var2;
        h10 h10Var2;
        e73 e73Var2;
        int i2;
        pg0 pg0Var = ks5.f23398g;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(399974542);
        int i3 = i | (ir1Var.m6894i(wp1Var) ? 4 : 2) | 113976752;
        if (ir1Var.m6871T(i3 & 1, (306783379 & i3) != 306783378)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                g73 g73Var = r40.f28989a;
                p44 p44VarM10977a = t44.m10977a(6, ir1Var);
                dc0 dc0Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24277a;
                q40 q40Var3 = dc0Var.f16937X;
                if (q40Var3 == null) {
                    long j = pb0.f27500g;
                    q40 q40Var4 = new q40(j, ic0.m6744d(dc0Var, 18), j, pb0.m9464c(ic0.m6744d(dc0Var, 18), 0.38f, 0.0f, 0.0f, 0.0f, 14));
                    dc0Var.f16937X = q40Var4;
                    q40Var3 = q40Var4;
                }
                ir1Var.m6885d0(-112362814);
                long jM6745e = ic0.m6745e(24, ir1Var);
                ir1Var.m6912r(false);
                ga4 ga4Var = new ga4(jM6745e);
                h10 h10Var3 = new h10();
                h10Var3.f20260a = ga4Var;
                VarHandle.storeStoreFence();
                g73 g73Var2 = r40.f28989a;
                i2 = i3 & (-3734529);
                nt2Var2 = kt2.f23428a;
                h10Var2 = h10Var3;
                q40Var2 = q40Var3;
                e73Var2 = g73Var2;
                p44Var2 = p44VarM10977a;
                z2 = true;
            } else {
                ir1Var.m6874W();
                z2 = z;
                p44Var2 = p44Var;
                q40Var2 = q40Var;
                h10Var2 = h10Var;
                e73Var2 = e73Var;
                i2 = i3 & (-3734529);
                nt2Var2 = nt2Var;
            }
            ir1Var.m6913s();
            m13865b(wp1Var, nt2Var2, z2, p44Var2, q40Var2, null, h10Var2, e73Var2, pg0Var, ir1Var, 2147483646 & i2, 0);
        } else {
            ir1Var.m6874W();
            nt2Var2 = nt2Var;
            z2 = z;
            p44Var2 = p44Var;
            q40Var2 = q40Var;
            h10Var2 = h10Var;
            e73Var2 = e73Var;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            v40 v40Var = new v40();
            v40Var.f32365a = wp1Var;
            v40Var.f32366b = nt2Var2;
            v40Var.f32367c = z2;
            v40Var.f32368d = p44Var2;
            v40Var.f32369e = q40Var2;
            v40Var.f32370f = h10Var2;
            v40Var.f32371g = e73Var2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = v40Var;
        }
    }

    /* JADX INFO: renamed from: r */
    public static final dd4 m13883r(i92 i92Var, String str) {
        dd4 dd4Var = new dd4(i92Var.f21188a);
        dd4Var.f16996g = str;
        VarHandle.storeStoreFence();
        return dd4Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    /* JADX INFO: renamed from: s */
    public static final long m13884s(float f, float f2, float f3, float f4, lc0 lc0Var) {
        int i;
        int i2;
        int i3;
        int iFloatToRawIntBits;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iFloatToRawIntBits2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (lc0Var.mo7948c()) {
            long j = ((long) ((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f)))) << 32;
            int i18 = pb0.f27502i;
            return j;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f);
        int i19 = iFloatToRawIntBits3 >>> 31;
        int i20 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i21 = iFloatToRawIntBits3 & 8388607;
        int i22 = 49;
        int i23 = 0;
        if (i20 == 255) {
            i2 = i21 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i20 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else {
                if (i > 0) {
                    int i24 = i21 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i3 = (((i << 10) | i24) + 1) | (i19 << 15);
                    } else {
                        i2 = i24;
                    }
                    short s = (short) i3;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f2);
                    i4 = iFloatToRawIntBits >>> 31;
                    i5 = (iFloatToRawIntBits >>> 23) & 255;
                    i6 = iFloatToRawIntBits & 8388607;
                    if (i5 == 255) {
                        if (i6 != 0) {
                            i9 = 512;
                        } else {
                            i9 = 0;
                        }
                        i7 = 31;
                    } else {
                        i7 = i5 - 112;
                        if (i7 >= 31) {
                            i7 = 49;
                            i9 = 0;
                        } else {
                            if (i7 <= 0) {
                                i8 = i6 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                                } else {
                                    i9 = i8;
                                }
                                short s2 = (short) i10;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                                i12 = iFloatToRawIntBits2 >>> 31;
                                i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i14 = 8388607 & iFloatToRawIntBits2;
                                if (i13 == 255) {
                                    i15 = i13 - 112;
                                    if (i15 < 31) {
                                        if (i15 <= 0) {
                                            i23 = i14 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                            } else {
                                                i22 = i15;
                                            }
                                        } else if (i15 >= -10) {
                                            i17 = (i14 | 8388608) >> (1 - i15);
                                            if ((i17 & 4096) != 0) {
                                                i17 += 8192;
                                            }
                                            i22 = 0;
                                            i23 = i17 >> 13;
                                        } else {
                                            i22 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) lc0Var.f23931c) & 63);
                                    int i25 = pb0.f27502i;
                                    return jMax;
                                }
                                i23 = i14 == 0 ? 0 : 512;
                                i22 = 31;
                                i16 = (i12 << 15) | (i22 << 10) | i23;
                                long jMax2 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) lc0Var.f23931c) & 63);
                                int i26 = pb0.f27502i;
                                return jMax2;
                            }
                            if (i7 >= -10) {
                                i11 = (i6 | 8388608) >> (1 - i7);
                                if ((i11 & 4096) != 0) {
                                    i11 += 8192;
                                }
                                i9 = i11 >> 13;
                                i7 = 0;
                            } else {
                                i9 = 0;
                                i7 = 0;
                            }
                        }
                    }
                    i10 = i9 | (i4 << 15) | (i7 << 10);
                    short s3 = (short) i10;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i15 = i13 - 112;
                        if (i15 < 31) {
                            if (i15 <= 0) {
                                i23 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                } else {
                                    i22 = i15;
                                }
                            } else if (i15 >= -10) {
                                i17 = (i14 | 8388608) >> (1 - i15);
                                if ((i17 & 4096) != 0) {
                                    i17 += 8192;
                                }
                                i22 = 0;
                                i23 = i17 >> 13;
                            } else {
                                i22 = 0;
                            }
                        }
                        long jMax3 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) lc0Var.f23931c) & 63);
                        int i27 = pb0.f27502i;
                        return jMax3;
                    }
                    i23 = i14 == 0 ? 0 : 512;
                    i22 = 31;
                    i16 = (i12 << 15) | (i22 << 10) | i23;
                    long jMax4 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) lc0Var.f23931c) & 63);
                    int i28 = pb0.f27502i;
                    return jMax4;
                }
                if (i >= -10) {
                    int i29 = (i21 | 8388608) >> (1 - i);
                    if ((i29 & 4096) != 0) {
                        i29 += 8192;
                    }
                    i2 = i29 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        i3 = i2 | (i19 << 15) | (i << 10);
        short s4 = (short) i3;
        iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        i4 = iFloatToRawIntBits >>> 31;
        i5 = (iFloatToRawIntBits >>> 23) & 255;
        i6 = iFloatToRawIntBits & 8388607;
        if (i5 == 255) {
            if (i6 != 0) {
                i9 = 512;
            } else {
                i9 = 0;
            }
            i7 = 31;
        } else {
            i7 = i5 - 112;
            if (i7 >= 31) {
                i7 = 49;
                i9 = 0;
            } else {
                if (i7 <= 0) {
                    i8 = i6 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                    } else {
                        i9 = i8;
                    }
                    short s5 = (short) i10;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i15 = i13 - 112;
                        if (i15 < 31) {
                            if (i15 <= 0) {
                                i23 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                                } else {
                                    i22 = i15;
                                }
                            } else if (i15 >= -10) {
                                i17 = (i14 | 8388608) >> (1 - i15);
                                if ((i17 & 4096) != 0) {
                                    i17 += 8192;
                                }
                                i22 = 0;
                                i23 = i17 >> 13;
                            } else {
                                i22 = 0;
                            }
                        }
                        long jMax5 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) lc0Var.f23931c) & 63);
                        int i210 = pb0.f27502i;
                        return jMax5;
                    }
                    i23 = i14 == 0 ? 0 : 512;
                    i22 = 31;
                    i16 = (i12 << 15) | (i22 << 10) | i23;
                    long jMax6 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) lc0Var.f23931c) & 63);
                    int i211 = pb0.f27502i;
                    return jMax6;
                }
                if (i7 >= -10) {
                    i11 = (i6 | 8388608) >> (1 - i7);
                    if ((i11 & 4096) != 0) {
                        i11 += 8192;
                    }
                    i9 = i11 >> 13;
                    i7 = 0;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
            }
        }
        i10 = i9 | (i4 << 15) | (i7 << 10);
        short s6 = (short) i10;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
        i12 = iFloatToRawIntBits2 >>> 31;
        i13 = (iFloatToRawIntBits2 >>> 23) & 255;
        i14 = 8388607 & iFloatToRawIntBits2;
        if (i13 == 255) {
            i15 = i13 - 112;
            if (i15 < 31) {
                if (i15 <= 0) {
                    i23 = i14 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i16 = (((i15 << 10) | i23) + 1) | (i12 << 15);
                    } else {
                        i22 = i15;
                    }
                } else if (i15 >= -10) {
                    i17 = (i14 | 8388608) >> (1 - i15);
                    if ((i17 & 4096) != 0) {
                        i17 += 8192;
                    }
                    i22 = 0;
                    i23 = i17 >> 13;
                } else {
                    i22 = 0;
                }
            }
            long jMax7 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) lc0Var.f23931c) & 63);
            int i212 = pb0.f27502i;
            return jMax7;
        }
        i23 = i14 == 0 ? 0 : 512;
        i22 = 31;
        i16 = (i12 << 15) | (i22 << 10) | i23;
        long jMax8 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) lc0Var.f23931c) & 63);
        int i213 = pb0.f27502i;
        return jMax8;
    }

    /* JADX INFO: renamed from: t */
    public static long m13885t(wa2 wa2Var, wa2 wa2Var2, z21 z21Var, long j) throws Exception {
        try {
            try {
                r50 r50Var = i41.f21117b;
                return as4.m3239R(wa2Var.m12186z(String.valueOf(z21Var.getNumber())).mo3530q(), m41.MILLISECONDS);
            } catch (Exception unused) {
                if (AbstractC0241mu.f7403a == EnumC0263nu.f7860a) {
                    return j;
                }
                throw new Exception("No default value for signal: " + z21Var);
            }
        } catch (Exception unused2) {
            r50 r50Var2 = i41.f21117b;
            return as4.m3239R(wa2Var2.m12186z(String.valueOf(z21Var.getNumber())).mo3530q(), m41.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: u */
    public static long m13886u(ey0 ey0Var, z21 z21Var) {
        wa2 wa2Var = ey0.f3211D;
        return m13885t((wa2) ey0Var.m13553a("gads:signal_source_timeouts_ms", wa2Var, C0033as.a$1), wa2Var, z21Var, fp3.f3652c.f3656a);
    }

    /* JADX INFO: renamed from: v */
    public static i41 m13887v(int i, m41 m41Var) {
        return i41.m6644c(as4.m3238Q(i, m41Var));
    }

    /* JADX INFO: renamed from: w */
    public static boolean m13888w(wa2 wa2Var, wa2 wa2Var2, z21 z21Var, boolean z) throws Exception {
        try {
            try {
                return wa2Var.m12186z(String.valueOf(z21Var.getNumber())).mo3523b();
            } catch (Exception unused) {
                return wa2Var2.m12186z(String.valueOf(z21Var.getNumber())).mo3523b();
            }
        } catch (Exception unused2) {
            if (AbstractC0241mu.f7403a == EnumC0263nu.f7860a) {
                return z;
            }
            throw new Exception("No default value for signal: " + z21Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m13889x(int i, int i2, int i3, boolean z) {
        if (i2 >= i3) {
            if (z) {
                return 0;
            }
            return i3 - i2;
        }
        if (z) {
            if (z) {
                if (z) {
                    return i3 - i2;
                }
                return 0;
            }
            if (z) {
                return 0;
            }
            return i3 - i2;
        }
        if (z ? i3 - i2 <= i : i2 > i) {
            if (z) {
                return 0;
            }
            return i3 - i2;
        }
        if (z) {
            return i - i2;
        }
        return i;
    }

    /* JADX INFO: renamed from: y */
    public static final void m13890y(jy4 jy4Var, yu3 yu3Var, gk2 gk2Var) {
        AutoCloseable autoCloseable;
        ky4 ky4Var = jy4Var.f22749a;
        if (ky4Var != null) {
            synchronized (ky4Var.f23622a) {
                autoCloseable = (AutoCloseable) ky4Var.f23623b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        ru3 ru3Var = (ru3) autoCloseable;
        if (ru3Var == null || ru3Var.f29644c) {
            return;
        }
        ru3Var.m10443a(yu3Var, gk2Var);
        fk2 fk2VarMo6016b = gk2Var.mo6016b();
        if (fk2VarMo6016b == fk2.f19055b || fk2VarMo6016b.m5728a(fk2.f19057d)) {
            yu3Var.m13256d();
            return;
        }
        lw0 lw0Var = new lw0((byte) 1);
        lw0Var.f24410b = gk2Var;
        lw0Var.f24411c = yu3Var;
        VarHandle.storeStoreFence();
        gk2Var.mo6015a(lw0Var);
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m13891z(lc4 lc4Var, int i, qa3 qa3Var) {
        boolean z;
        synchronized (f36486o) {
            int i2 = lc4Var.f23953d;
            if (i2 == i) {
                lc4Var.f23952c = qa3Var;
                z = true;
                lc4Var.f23953d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }
}
