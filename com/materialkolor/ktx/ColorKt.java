package com.materialkolor.ktx;

import java.util.Locale;
import p000.AbstractC1356y5;
import p000.InterfaceC1407zj;
import p000.c20;
import p000.d24;
import p000.db4;
import p000.e74;
import p000.fj3;
import p000.h50;
import p000.hd4;
import p000.kj3;
import p000.lc0;
import p000.m45;
import p000.mi0;
import p000.oc0;
import p000.on4;
import p000.pb0;
import p000.qq2;
import p000.qt3;
import p000.rv1;
import p000.sc6;
import p000.se2;
import p000.tu1;
import p000.ws4;
import p000.xb4;
import p000.y62;
import p000.yp1;
import p000.zy5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ColorKt {

    /* JADX INFO: renamed from: a */
    public static final db4 f16323a = qq2.m10014I(0.0f, 0.0f, null, 7);

    /* JADX INFO: renamed from: animate-euL9pac, reason: not valid java name */
    public static final xb4 m13919animateeuL9pac(long j, InterfaceC1407zj interfaceC1407zj, String str, yp1 yp1Var, mi0 mi0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            interfaceC1407zj = f16323a;
        }
        return e74.m4941a(j, interfaceC1407zj, mi0Var, i & 126);
    }

    /* JADX INFO: renamed from: darken-DxMtmZc, reason: not valid java name */
    public static final long m13920darkenDxMtmZc(long j, float f) {
        rv1 rv1VarM13950toHct8_81llA = HctKt.m13950toHct8_81llA(j);
        double dM10682w = sc6.m10682w(rv1VarM13950toHct8_81llA.f29663d, f);
        Double dValueOf = Double.valueOf(dM10682w);
        if (dM10682w <= -1.0d) {
            dValueOf = null;
        }
        if (dValueOf == null) {
            return j;
        }
        return HctKt.toColor(new rv1(AbstractC1356y5.m12899H(rv1VarM13950toHct8_81llA.f29661b, rv1VarM13950toHct8_81llA.f29662c, dValueOf.doubleValue())));
    }

    /* JADX INFO: renamed from: darken-DxMtmZc$default, reason: not valid java name */
    public static /* synthetic */ long m13921darkenDxMtmZc$default(long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.1f;
        }
        return m13920darkenDxMtmZc(j, f);
    }

    /* JADX INFO: renamed from: fixIfDisliked-8_81llA, reason: not valid java name */
    public static final long m13922fixIfDisliked8_81llA(long j) {
        return HctKt.toColor(c20.m3819n(HctKt.m13950toHct8_81llA(j)));
    }

    public static final String format(int i) {
        y62.m12992v(16);
        return hd4.m6347m0(2, Integer.toString(i, 16));
    }

    public static final db4 getDefaultColorSpring() {
        return f16323a;
    }

    /* JADX INFO: renamed from: isDisliked-8_81llA, reason: not valid java name */
    public static final boolean m13923isDisliked8_81llA(long j) {
        rv1 rv1VarM13950toHct8_81llA = HctKt.m13950toHct8_81llA(j);
        double dRint = Math.rint(rv1VarM13950toHct8_81llA.f29661b);
        return ((90.0d > dRint ? 1 : (90.0d == dRint ? 0 : -1)) <= 0 && (dRint > 111.0d ? 1 : (dRint == 111.0d ? 0 : -1)) <= 0) && ((Math.rint(rv1VarM13950toHct8_81llA.f29662c) > 16.0d ? 1 : (Math.rint(rv1VarM13950toHct8_81llA.f29662c) == 16.0d ? 0 : -1)) > 0) && ((Math.rint(rv1VarM13950toHct8_81llA.f29663d) > 65.0d ? 1 : (Math.rint(rv1VarM13950toHct8_81llA.f29663d) == 65.0d ? 0 : -1)) < 0);
    }

    /* JADX INFO: renamed from: isLight-8_81llA, reason: not valid java name */
    public static final boolean m13924isLight8_81llA(long j) {
        return !ws4.m12408a(j, pb0.f27500g) && sc6.m10662d0(zy5.m13858V(j))[1] / 100.0d > 0.5d;
    }

    /* JADX INFO: renamed from: lighten-DxMtmZc, reason: not valid java name */
    public static final long m13925lightenDxMtmZc(long j, float f) {
        rv1 rv1VarM13950toHct8_81llA = HctKt.m13950toHct8_81llA(j);
        double dM10640L = sc6.m10640L(rv1VarM13950toHct8_81llA.f29663d, f);
        Double dValueOf = Double.valueOf(dM10640L);
        if (dM10640L <= -1.0d) {
            dValueOf = null;
        }
        if (dValueOf == null) {
            return j;
        }
        return HctKt.toColor(new rv1(AbstractC1356y5.m12899H(rv1VarM13950toHct8_81llA.f29661b, rv1VarM13950toHct8_81llA.f29662c, dValueOf.doubleValue())));
    }

    /* JADX INFO: renamed from: lighten-DxMtmZc$default, reason: not valid java name */
    public static /* synthetic */ long m13926lightenDxMtmZc$default(long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return m13925lightenDxMtmZc(j, f);
    }

    /* JADX INFO: renamed from: matchSaturation--OWjLjI, reason: not valid java name */
    public static final long m13927matchSaturationOWjLjI(long j, long j2) {
        lc0 lc0Var;
        fj3 fj3VarMo5129e;
        tu1 tu1VarMo5727a = d24.m4296K(j).mo5727a();
        tu1 tu1VarMo5727a2 = d24.m4296K(j2).mo5727a();
        float f = tu1VarMo5727a.f31451a;
        float f2 = tu1VarMo5727a2.f31452b;
        float f3 = tu1VarMo5727a2.f31453c;
        tu1 tu1Var = new tu1(f, f2, f3, 1.0f);
        h50 h50Var = tu1.f31450e;
        if (h50Var == qt3.f28787b) {
            lc0Var = oc0.f26551e;
        } else if (h50Var == kj3.f23172c) {
            lc0Var = oc0.f26563q;
        } else if (h50Var == kj3.f23173d) {
            lc0Var = oc0.f26564r;
        } else if (h50Var == kj3.f23174e) {
            lc0Var = oc0.f26561o;
        } else if (h50Var == kj3.f23175f) {
            lc0Var = oc0.f26556j;
        } else if (h50Var == kj3.f23176g) {
            lc0Var = oc0.f26555i;
        } else if (h50Var == se2.f30213a) {
            lc0Var = oc0.f26566t;
        } else if (h50Var == m45.f24647b) {
            lc0Var = oc0.f26565s;
        } else if (h50Var == kj3.f23177h) {
            lc0Var = oc0.f26557k;
        } else if (h50Var == kj3.f23178i) {
            lc0Var = oc0.f26558l;
        } else if (h50Var == kj3.f23171b) {
            lc0Var = oc0.f26552f;
        } else {
            lc0Var = h50Var == kj3.f23179j ? oc0.f26562p : null;
        }
        if (lc0Var != null) {
            float[] fArr = {f, f2, f3, 1.0f};
            return zy5.m13867c(fArr[0], fArr[1], fArr[2], fArr[3], lc0Var);
        }
        double d = tu1Var.f31452b;
        float f4 = tu1Var.f31454d;
        float f5 = tu1Var.f31453c;
        if (d < 1.0E-7d) {
            fj3VarMo5129e = fj3.f19041f.f18143a.mo5129e(f5, f5, f5, f4);
        } else {
            Integer num = 0;
            float fFloatValue = tu1Var.f31451a;
            if (Float.isNaN(fFloatValue)) {
                fFloatValue = num.floatValue();
            }
            double d2 = ((double) (((fFloatValue % 360.0f) + 360.0f) % 360.0f)) / 30.0d;
            double d3 = f5;
            fj3VarMo5129e = qt3.f28787b.f28788a.mo5129e(tu1.m11160b(d2, d, d3, 0), tu1.m11160b(d2, d, d3, 8), tu1.m11160b(d2, d, d3, 4), f4);
        }
        return zy5.m13867c(fj3VarMo5129e.f19042a, fj3VarMo5129e.f19043b, fj3VarMo5129e.f19044c, fj3VarMo5129e.f19045d, oc0.f26551e);
    }

    /* JADX INFO: renamed from: toHex-Iv8Zu3U, reason: not valid java name */
    public static final String m13928toHexIv8Zu3U(long j, boolean z, String str, boolean z2) {
        int iM10010E = qq2.m10010E(pb0.m9465d(j) * 255.0f);
        int iM10010E2 = qq2.m10010E(pb0.m9469h(j) * 255.0f);
        int iM10010E3 = qq2.m10010E(pb0.m9468g(j) * 255.0f);
        int iM10010E4 = qq2.m10010E(pb0.m9466e(j) * 255.0f);
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(str);
        }
        if (z2 || iM10010E < 255) {
            sb.append(format(iM10010E));
        }
        sb.append(format(iM10010E2));
        sb.append(format(iM10010E3));
        sb.append(format(iM10010E4));
        return sb.toString().toUpperCase(Locale.ROOT);
    }

    /* JADX INFO: renamed from: toHex-Iv8Zu3U$default, reason: not valid java name */
    public static /* synthetic */ String m13929toHexIv8Zu3U$default(long j, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = "#";
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return m13928toHexIv8Zu3U(j, z, str, z2);
    }

    /* JADX INFO: renamed from: toTonalPalette-8_81llA, reason: not valid java name */
    public static final on4 m13930toTonalPalette8_81llA(long j) {
        return TonalPaletteKt.m13961from4WTKRHQ(on4.f26914e, j);
    }
}
