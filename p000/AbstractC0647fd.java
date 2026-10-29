package p000;

import ads_mobile_sdk.C0259no;
import ads_mobile_sdk.C0310ra;
import ads_mobile_sdk.at0;
import ads_mobile_sdk.ey0;
import ads_mobile_sdk.zs0;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: fd */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0647fd {

    /* JADX INFO: renamed from: c */
    public static final pg0 f18913c;

    /* JADX INFO: renamed from: d */
    public static final z45 f18914d;

    /* JADX INFO: renamed from: f */
    public static Boolean f18916f;

    /* JADX INFO: renamed from: g */
    public static Boolean f18917g;

    /* JADX INFO: renamed from: h */
    public static Boolean f18918h;

    /* JADX INFO: renamed from: i */
    public static Boolean f18919i;

    /* JADX INFO: renamed from: a */
    public static final char[] f18911a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    public static final pg0 f18912b = new pg0(-1131826196, false, new qg0(19));

    /* JADX INFO: renamed from: e */
    public static final ed1[] f18915e = {new ed1("name_ulr_private", 1), new ed1("name_sleep_segment_request", 1), new ed1("get_last_activity_feature_id", 1), new ed1("support_context_feature_id", 1), new ed1("get_current_location", 2), new ed1("get_last_location_with_request", 1), new ed1("set_mock_mode_with_callback", 1), new ed1("set_mock_location_with_callback", 1), new ed1("inject_location_with_callback", 1), new ed1("location_updates_with_callback", 1), new ed1("use_safe_parcelable_in_intents", 1), new ed1("flp_debug_updates", 1), new ed1("google_location_accuracy_enabled", 1), new ed1("geofences_with_callback", 1), new ed1("location_enabled", 1)};

    static {
        byte b = 21;
        f18913c = new pg0(-51699941, false, new xg0(b));
        f18914d = new z45(b);
    }

    /* JADX INFO: renamed from: A */
    public static final int m5643A(g24 g24Var, g24[] g24VarArr) {
        int iHashCode = (g24Var.mo3641b().hashCode() * 31) + Arrays.hashCode(g24VarArr);
        int iMo4432d = g24Var.mo4432d();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iMo4432d > 0)) {
                break;
            }
            int i2 = iMo4432d - 1;
            int i3 = i * 31;
            String strMo3641b = g24Var.mo4436j(g24Var.mo4432d() - iMo4432d).mo3641b();
            if (strMo3641b != null) {
                iHashCode2 = strMo3641b.hashCode();
            }
            i = i3 + iHashCode2;
            iMo4432d = i2;
        }
        int iMo4432d2 = g24Var.mo4432d();
        int iHashCode3 = 1;
        while (true) {
            if (!(iMo4432d2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iMo4432d2 - 1;
            int i5 = iHashCode3 * 31;
            zc6 zc6VarMo4431c = g24Var.mo4436j(g24Var.mo4432d() - iMo4432d2).mo4431c();
            iHashCode3 = i5 + (zc6VarMo4431c != null ? zc6VarMo4431c.hashCode() : 0);
            iMo4432d2 = i4;
        }
    }

    /* JADX INFO: renamed from: B */
    public static boolean m5644B(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f18916f == null) {
            f18916f = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        Boolean boolValueOf = f18917g;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            f18917g = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: C */
    public static final yg3 m5645C(mq1 mq1Var, yp1 yp1Var) {
        hh0 hh0Var = new hh0((byte) 2);
        hh0Var.f20573b = mq1Var;
        VarHandle.storeStoreFence();
        as4.m3259r(1, yp1Var);
        return ev3.m5407a(hh0Var, yp1Var);
    }

    /* JADX INFO: renamed from: D */
    public static pg2 m5646D(yp1 yp1Var) {
        aj2 aj2Var = aj2.f14537b;
        yy0 yy0Var = new yy0((byte) 6);
        yy0Var.f35613b = yp1Var;
        VarHandle.storeStoreFence();
        return i25.m6630z(aj2Var, yy0Var);
    }

    /* JADX INFO: renamed from: E */
    public static pg2 m5647E(String str) {
        C1051py c1051py = new C1051py((byte) 9);
        c1051py.f28076b = str;
        VarHandle.storeStoreFence();
        aj2 aj2Var = aj2.f14537b;
        yy0 yy0Var = new yy0((byte) 6);
        yy0Var.f35613b = c1051py;
        VarHandle.storeStoreFence();
        return i25.m6630z(aj2Var, yy0Var);
    }

    /* JADX INFO: renamed from: F */
    public static final nt2 m5648F(nt2 nt2Var, e73 e73Var) {
        f73 f73Var = new f73();
        f73Var.f18801a = e73Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(f73Var);
    }

    /* JADX INFO: renamed from: G */
    public static final nt2 m5649G(nt2 nt2Var, float f) {
        return nt2Var.mo7630d(new a73(f, f, f, f, true));
    }

    /* JADX INFO: renamed from: H */
    public static final nt2 m5650H(nt2 nt2Var, float f, float f2) {
        return nt2Var.mo7630d(new a73(f, f2, f, f2, true));
    }

    /* JADX INFO: renamed from: I */
    public static nt2 m5651I(nt2 nt2Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return m5650H(nt2Var, f, f2);
    }

    /* JADX INFO: renamed from: J */
    public static final nt2 m5652J(nt2 nt2Var, float f, float f2, float f3, float f4) {
        return nt2Var.mo7630d(new a73(f, f2, f3, f4, true));
    }

    /* JADX INFO: renamed from: K */
    public static nt2 m5653K(nt2 nt2Var, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return m5652J(nt2Var, f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: L */
    public static BigDecimal m5654L(String str) {
        m5682u(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    /* JADX INFO: renamed from: M */
    public static final void m5655M(C0489bf c0489bf, boolean z, sl2 sl2Var, float f, float f2) {
        boolean z2;
        as0 as0Var;
        boolean z3;
        c0489bf.m3565h();
        Path path = c0489bf.f15228a;
        int size = sl2Var.size();
        as0 as0Var2 = null;
        boolean z4 = true;
        int i = 0;
        while (i < size) {
            as0 as0Var3 = (as0) sl2Var.get(i);
            if (z4) {
                float[] fArr = as0Var3.f14841a;
                path.moveTo(fArr[0], fArr[1]);
                as0Var = as0Var3;
                z3 = false;
            } else {
                as0Var = as0Var2;
                z3 = z4;
            }
            float[] fArr2 = as0Var3.f14841a;
            c0489bf.m3560c(fArr2[2], fArr2[3], fArr2[4], fArr2[5], as0Var3.m3215a(), as0Var3.m3216b());
            i++;
            z4 = z3;
            as0Var2 = as0Var;
        }
        if (z) {
            int size2 = sl2Var.size();
            boolean z5 = true;
            int i2 = 0;
            while (i2 < size2) {
                as0 as0Var4 = (as0) sl2Var.get(i2);
                if (z5) {
                    float[] fArr3 = as0Var4.f14841a;
                    c0489bf.m3562e(fArr3[0], fArr3[1]);
                    z2 = false;
                } else {
                    z2 = z5;
                }
                float[] fArr4 = as0Var4.f14841a;
                c0489bf.m3560c(fArr4[2], fArr4[3], fArr4[4], fArr4[5], as0Var4.m3215a(), as0Var4.m3216b());
                i2++;
                z5 = z2;
            }
        }
        path.close();
        if (as0Var2 != null) {
            float fAtan2 = (float) ((((double) ((float) Math.atan2(((as0) sl2Var.get(0)).f14841a[1] - f2, ((as0) sl2Var.get(0)).f14841a[0] - f))) * 180.0d) / 3.141592653589793d);
            float[] fArrM10392b = rq2.m10392b();
            rq2.m10396f(fArrM10392b, (-fAtan2) + 270.0f);
            c0489bf.m3566i(fArrM10392b);
        }
    }

    /* JADX INFO: renamed from: N */
    public static final ju3 m5656N(mi0 mi0Var) {
        iu3 iu3VarM6066D = gq6.m6066D(mi0Var);
        ir1 ir1Var = (ir1) mi0Var;
        boolean zM6890g = ir1Var.m6890g(iu3VarM6066D);
        Object objM6869O = ir1Var.m6869O();
        if (zM6890g || objM6869O == ki0.f23136a) {
            hu3 hu3Var = new hu3((byte) 1);
            hu3Var.f20883b = iu3VarM6066D;
            VarHandle.storeStoreFence();
            C0928n c0928n = new C0928n((byte) 19);
            c0928n.f25353b = iu3VarM6066D;
            VarHandle.storeStoreFence();
            objM6869O = new ju3(hu3Var, new pg0(-1320822745, true, c0928n));
            ir1Var.m6905n0(objM6869O);
        }
        return (ju3) objM6869O;
    }

    /* JADX INFO: renamed from: O */
    public static final nt2 m5657O(mn3 mn3Var) {
        gj4 gj4Var = new gj4();
        gj4Var.f19821a = mn3Var;
        VarHandle.storeStoreFence();
        return gj4Var;
    }

    /* JADX INFO: renamed from: P */
    public static final Bitmap.Config m5658P(int i) {
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        if (i == 3) {
            return Bitmap.Config.RGBA_F16;
        }
        return i == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    /* JADX INFO: renamed from: Q */
    public static void m5659Q(ir3 ir3Var, C0489bf c0489bf, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        sl2 sl2Var = ir3Var.f21716c;
        long j = ir3Var.f21715b;
        m5655M(c0489bf, z, sl2Var, se0.m10691D(j), se0.m10692E(j));
    }

    /* JADX INFO: renamed from: R */
    public static final String m5660R(long j) {
        if (i41.m6646e(j, 0L)) {
            return "0 seconds";
        }
        sl2 sl2VarM7680G = kx5.m7680G();
        m41 m41Var = m41.DAYS;
        long jM6655n = i41.m6655n(j, m41Var);
        long jM6651j = i41.m6651j(j, as4.m3239R(jM6655n, m41Var));
        m41 m41Var2 = m41.HOURS;
        long jM6655n2 = i41.m6655n(jM6651j, m41Var2);
        long jM6651j2 = i41.m6651j(i41.m6651j(j, as4.m3239R(jM6655n, m41Var)), as4.m3239R(jM6655n2, m41Var2));
        m41 m41Var3 = m41.MINUTES;
        long jM6655n3 = i41.m6655n(jM6651j2, m41Var3);
        long jM6655n4 = i41.m6655n(i41.m6651j(i41.m6651j(i41.m6651j(j, as4.m3239R(jM6655n, m41Var)), as4.m3239R(jM6655n2, m41Var2)), as4.m3239R(jM6655n3, m41Var3)), m41.SECONDS);
        if (jM6655n != 0) {
            sl2VarM7680G.add(jM6655n + " day" + (jM6655n != 1 ? "s" : ""));
        }
        if (jM6655n2 != r2) {
            sl2VarM7680G.add(jM6655n2 + " hour" + (jM6655n2 != 1 ? "s" : ""));
        }
        if (jM6655n3 != r2) {
            sl2VarM7680G.add(jM6655n3 + " minute" + (jM6655n3 != 1 ? "s" : ""));
        }
        if (jM6655n4 != 0) {
            sl2VarM7680G.add(jM6655n4 + " second" + (jM6655n4 != 1 ? "s" : ""));
        }
        return hb0.m6305Q0(kx5.m7740w(sl2VarM7680G), ", ", null, null, 0, null, 62);
    }

    /* JADX INFO: renamed from: S */
    public static final String m5661S(g24 g24Var) {
        r52 r52VarM10660c0 = sc6.m10660c0(0, g24Var.mo4432d());
        String str = g24Var.mo3641b() + '(';
        b71 b71Var = new b71((byte) 21);
        b71Var.f15141b = g24Var;
        VarHandle.storeStoreFence();
        return hb0.m6305Q0(r52VarM10660c0, ", ", str, ")", 0, b71Var, 24);
    }

    /* JADX INFO: renamed from: T */
    public static final Object m5662T(yp1 yp1Var, ym0 ym0Var) {
        d32 d32Var = (d32) ym0Var.getContext().get(wv1.f33766i);
        if (d32Var == null) {
            return C0006a5.m84v(ym0Var.getContext()).mo9530l(yp1Var, ym0Var);
        }
        new fn0(yp1Var, null, (byte) 1);
        return d32Var.m4336g();
    }

    /* JADX INFO: renamed from: a */
    public static final void m5663a(mq1 mq1Var, InterfaceC0961nw interfaceC0961nw, mi0 mi0Var, int i) {
        Object obj;
        Object obj2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1157800900);
        int i2 = i | 18;
        byte b = 1;
        if (ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
            ir1Var.m6876Y();
            int i3 = i & 1;
            i50 i50Var = ki0.f23136a;
            if (i3 == 0 || ir1Var.m6856B()) {
                qe3 qe3Var = (qe3) ir1Var.m6898k(ze3.f36022a);
                boolean zM6890g = ir1Var.m6890g(qe3Var);
                Object objM6869O = ir1Var.m6869O();
                wm0 wm0Var = null;
                if (zM6890g || objM6869O == i50Var) {
                    objM6869O = new C0594e0((Object) qe3Var, wm0Var, (byte) 7);
                    ir1Var.m6905n0(objM6869O);
                }
                mq1Var = (mq1) objM6869O;
                kj0 kj0Var = wz0.f33871a;
                C1409zl c1409zl = (C1409zl) ir1Var.m6898k(kj0Var);
                boolean zM6890g2 = ir1Var.m6890g(c1409zl);
                Object objM6869O2 = ir1Var.m6869O();
                if (zM6890g2 || objM6869O2 == i50Var) {
                    objM6869O2 = new C1020p3(c1409zl, wm0Var, b);
                    ir1Var.m6905n0(objM6869O2);
                }
                yp1 yp1Var = (yp1) objM6869O2;
                Context context = (Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b);
                C0459am c0459am = (C0459am) ir1Var.m6898k(AbstractC0496bm.m3626a());
                C0950nl c0950nl = (C0950nl) ir1Var.m6898k(AbstractC0987ol.m9168a());
                C1409zl c1409zl2 = (C1409zl) ir1Var.m6898k(kj0Var);
                mq1 mq1VarM10008C = qq2.m10008C(ir1Var);
                Object objM6869O3 = ir1Var.m6869O();
                Object obj3 = objM6869O3;
                if (objM6869O3 == i50Var) {
                    C1197tw c1197tw = new C1197tw();
                    c1197tw.f31476a = c0459am;
                    c1197tw.f31477b = context;
                    c1197tw.f31478c = yp1Var;
                    c1197tw.f31479d = c0950nl;
                    c1197tw.f31480e = mq1VarM10008C;
                    c1197tw.f31481f = c1409zl2;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c1197tw);
                    obj3 = c1197tw;
                }
                z32 z32Var = new z32((byte) 4);
                z32Var.f35738b = mq1Var;
                z32Var.f35739c = (C1197tw) obj3;
                VarHandle.storeStoreFence();
                obj2 = z32Var;
            } else {
                ir1Var.m6874W();
                obj2 = interfaceC0961nw;
            }
            ir1Var.m6913s();
            yp1 yp1VarM5366p0 = ev0.m5366p0(ir1Var);
            boolean zM6890g3 = ir1Var.m6890g(obj2) | ir1Var.m6890g(yp1VarM5366p0);
            Object objM6869O4 = ir1Var.m6869O();
            Object obj4 = objM6869O4;
            if (zM6890g3 || objM6869O4 == i50Var) {
                C0558d0 c0558d0 = new C0558d0((byte) 11);
                c0558d0.f16655b = obj2;
                c0558d0.f16656c = yp1VarM5366p0;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0558d0);
                obj4 = c0558d0;
            }
            m5674l(null, "Backup/Restore", false, (yp1) obj4, ir1Var, 48, 5);
            obj = obj2;
        } else {
            ir1Var.m6874W();
            obj = interfaceC0961nw;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ne0 ne0Var = new ne0((byte) 5);
            ne0Var.f25728b = mq1Var;
            ne0Var.f25729c = obj;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ne0Var;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final s93 m5664b(int i) {
        float f = i;
        s93 s93Var = new s93();
        s93Var.f30013a = f;
        if (f >= 0.0f && f <= 100.0f) {
            VarHandle.storeStoreFence();
            return s93Var;
        }
        t32.m10968a("The percent should be in the range of [0, 100]");
        VarHandle.storeStoreFence();
        return s93Var;
    }

    /* JADX INFO: renamed from: c */
    public static final q11 m5665c(float f) {
        q11 q11Var = new q11();
        q11Var.f28138a = f;
        VarHandle.storeStoreFence();
        return q11Var;
    }

    /* JADX INFO: renamed from: d */
    public static final void m5666d(qe3 qe3Var, wp1 wp1Var, long j, List list, boolean z, yp1 yp1Var, mi0 mi0Var, int i) {
        int i2;
        byte b;
        boolean z2;
        boolean z3;
        int i3;
        long j2;
        Object obj;
        Object obj2;
        long j3 = j;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1148390415);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(qe3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(wp1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6888f(j3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6890g(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ir1Var.m6894i(yp1Var) ? 131072 : 65536;
        }
        if (ir1Var.m6871T(i2 & 1, (74899 & i2) != 74898)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                List listMo9875h = qe3Var.mo9875h();
                if (!(listMo9875h instanceof Collection) || !listMo9875h.isEmpty()) {
                    Iterator it = listMo9875h.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z3 = true;
                            break;
                        } else if (((d00) it.next()).f16662f.f26682b == ng3.InApp) {
                            z3 = false;
                            break;
                        }
                    }
                } else {
                    z3 = true;
                    break;
                }
                i3 = i2 & (-57345);
                z2 = z3;
            } else {
                ir1Var.m6874W();
                i3 = i2 & (-57345);
                z2 = z;
            }
            ir1Var.m6913s();
            InterfaceC0755ia interfaceC0755ia = (InterfaceC0755ia) ir1Var.m6898k(AbstractC1138sa.f30027b);
            lv1 lv1Var = (lv1) ir1Var.m6898k(nv1.f26110a);
            i50 i50Var = ki0.f23136a;
            if (lv1Var != null) {
                ir1Var.m6885d0(-2010193909);
                boolean zM6890g = ir1Var.m6890g(lv1Var);
                Object objM6869O = ir1Var.m6869O();
                if (zM6890g || objM6869O == i50Var) {
                    obj2 = objM6869O;
                    C1053q c1053q = new C1053q((byte) 29);
                    c1053q.f28113b = lv1Var;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c1053q);
                    obj2 = c1053q;
                }
                lb5.m7932m(ju4.f22634a, (wp1) obj2, ir1Var);
                ir1Var.m6912r(false);
            } else {
                ir1Var.m6885d0(-2010124717);
                ir1Var.m6912r(false);
            }
            Activity activity = (Activity) ir1Var.m6898k(pm2.f27747a);
            yp1 yp1VarM5366p0 = ev0.m5366p0(ir1Var);
            xz4 xz4Var = (xz4) ir1Var.m6898k(la1.f23888a);
            vf1 vf1Var = n74.f25506c;
            boolean zM6890g2 = ((i3 & 7168) == 2048) | ((i3 & 14) == 4) | ir1Var.m6890g(interfaceC0755ia) | ir1Var.m6894i(activity) | ir1Var.m6890g(yp1VarM5366p0) | ir1Var.m6890g(xz4Var) | ir1Var.m6890g(lv1Var) | ((458752 & i3) == 131072) | ((i3 & 112) == 32) | ((i3 & 896) == 256) | ir1Var.m6892h(z2);
            Object objM6869O2 = ir1Var.m6869O();
            if (zM6890g2 || objM6869O2 == i50Var) {
                bt1 bt1Var = new bt1();
                bt1Var.f15570a = z2;
                bt1Var.f15571b = list;
                bt1Var.f15572c = qe3Var;
                bt1Var.f15573d = wp1Var;
                bt1Var.f15574e = interfaceC0755ia;
                bt1Var.f15575f = activity;
                bt1Var.f15576g = yp1VarM5366p0;
                bt1Var.f15577h = xz4Var;
                bt1Var.f15578i = yp1Var;
                bt1Var.f15579j = lv1Var;
                j2 = j;
                bt1Var.f15580k = j2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(bt1Var);
                obj = bt1Var;
            } else {
                j2 = j;
                obj = objM6869O2;
            }
            j3 = j2;
            b = 0;
            m5668f(vf1Var, "Upgrade to premium", false, null, (yp1) obj, ir1Var, 54, 12);
        } else {
            b = 0;
            ir1Var.m6874W();
            z2 = z;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ct1 ct1Var = new ct1(b);
            ct1Var.f16447e = qe3Var;
            ct1Var.f16448f = wp1Var;
            ct1Var.f16445c = j3;
            ct1Var.f16449g = list;
            ct1Var.f16444b = z2;
            ct1Var.f16450h = yp1Var;
            ct1Var.f16446d = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ct1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Object m5667e(yp1 yp1Var, xz4 xz4Var, yp1 yp1Var2, lv1 lv1Var, String str, xs1 xs1Var, ym0 ym0Var) {
        ht1 ht1Var;
        if (ym0Var instanceof ht1) {
            ht1Var = (ht1) ym0Var;
            int i = ht1Var.f20845w;
            if ((i & Integer.MIN_VALUE) != 0) {
                ht1Var.f20845w = i - Integer.MIN_VALUE;
            } else {
                ht1Var = new ht1(ym0Var);
            }
        } else {
            ht1Var = new ht1(ym0Var);
        }
        Object objM12799b = ht1Var.f20844v;
        Object obj = ap0.f14763a;
        int i2 = ht1Var.f20845w;
        try {
            if (i2 == 0) {
                k43.m7376J(objM12799b);
                yp1Var.invoke(str);
                at1 at1Var = new at1((byte) 0);
                at1Var.f14855b = lv1Var;
                at1Var.f14856c = yp1Var2;
                at1Var.f14857d = xs1Var;
                VarHandle.storeStoreFence();
                pg0 pg0Var = new pg0(-1887983638, true, at1Var);
                ht1Var.f20842t = yp1Var2;
                ht1Var.f20843u = xs1Var;
                ht1Var.f20845w = 1;
                objM12799b = xz4Var.m12799b(pg0Var, ht1Var);
                if (objM12799b == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xs1Var = ht1Var.f20843u;
                yp1Var2 = ht1Var.f20842t;
                k43.m7376J(objM12799b);
            }
            yp1Var2.invoke(xs1Var);
            return ju4.f22634a;
        } catch (Throwable th) {
            yp1Var2.invoke(xs1Var);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final void m5668f(nt2 nt2Var, String str, boolean z, si2 si2Var, yp1 yp1Var, mi0 mi0Var, int i, int i2) {
        int i3;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1800593326);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (ir1Var.m6890g(nt2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= ir1Var.m6890g(str) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= ir1Var.m6892h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ir1Var.m6894i(yp1Var) ? 16384 : 8192;
        }
        if (ir1Var.m6871T(i3 & 1, (i3 & 9363) != 9362)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                if (i4 != 0) {
                    nt2Var = kt2.f23428a;
                }
                if (i5 != 0) {
                    str = null;
                }
                if (i6 != 0) {
                    z = true;
                }
                si2Var = ui2.m11560a(ir1Var);
            } else {
                ir1Var.m6874W();
            }
            int i7 = i3 & (-7169);
            boolean z2 = z;
            ir1Var.m6913s();
            nh2 nh2Var = new nh2((byte) 3);
            nh2Var.f25805b = nt2Var;
            nh2Var.f25807d = si2Var;
            nh2Var.f25808e = str;
            nh2Var.f25806c = yp1Var;
            VarHandle.storeStoreFence();
            a64.m104a(null, null, z2, null, vd6.m11834R(-1902261106, nh2Var, ir1Var), ir1Var, (i7 & 896) | 24576);
            z = z2;
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            qe0 qe0Var = new qe0();
            qe0Var.f28405a = nt2Var;
            qe0Var.f28406b = str;
            qe0Var.f28407c = z;
            qe0Var.f28408d = si2Var;
            qe0Var.f28409e = yp1Var;
            qe0Var.f28410f = i;
            qe0Var.f28411g = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = qe0Var;
        }
    }

    /* JADX INFO: renamed from: g */
    public static g73 m5669g(float f, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new g73(0.0f, f, 0.0f, f);
    }

    /* JADX INFO: renamed from: h */
    public static g73 m5670h(float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        float f3 = (i & 2) != 0 ? 0.0f : 10.0f;
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        return new g73(f, f3, f2, (i & 8) == 0 ? 10.0f : 0.0f);
    }

    /* JADX INFO: renamed from: i */
    public static final jl3 m5671i(long j, long j2) {
        return new jl3(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    /* JADX INFO: renamed from: j */
    public static final jl3 m5672j(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new jl3(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    /* JADX INFO: renamed from: k */
    public static final void m5673k(nt2 nt2Var, pg0 pg0Var, mi0 mi0Var, int i) {
        pg0 pg0Var2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1718961564);
        int i2 = i | 54;
        byte b = 0;
        if (ir1Var.m6871T(i2 & 1, (i2 & 147) != 146)) {
            kt2 kt2Var = kt2.f23428a;
            nt2 nt2VarM8574b = n74.m8574b(m5652J(kt2Var, 34.0f, 0.0f, 34.0f, 20.0f), 1.0f);
            pr3 pr3VarM9243a = or3.m9243a(AbstractC1337xn.f34434a, ig1.f21388l, ir1Var, 48);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM8574b);
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
            C0006a5.m53I(ir1Var, ia5.f21216g, pr3VarM9243a);
            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
            C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
            C0006a5.m50F(ir1Var);
            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
            nc4 nc4Var = pq2.f27894b;
            pg0Var2 = pg0Var;
            k43.m7380b(((lq2) ir1Var.m6898k(nc4Var)).f24277a.f16962s, ((lq2) ir1Var.m6898k(nc4Var)).f24278b.f22576g, pg0Var2, ir1Var, 384);
            i25.m6610b(ir1Var, new lg2(1.0f, true));
            ir1Var.m6885d0(-212669758);
            ir1Var.m6912r(false);
            ir1Var.m6912r(true);
            nt2Var = kt2Var;
        } else {
            pg0Var2 = pg0Var;
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            pe0 pe0Var = new pe0(b);
            pe0Var.f27559b = nt2Var;
            pe0Var.f27560c = pg0Var2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = pe0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static final void m5674l(nt2 nt2Var, String str, boolean z, yp1 yp1Var, mi0 mi0Var, int i, int i2) {
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(2041960132);
        int i3 = i | 6;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 54;
        } else if ((i & 48) == 0) {
            i3 |= ir1Var.m6890g(str) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= ir1Var.m6892h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ir1Var.m6894i(yp1Var) ? 2048 : 1024;
        }
        byte b = 1;
        if (ir1Var.m6871T(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                str = null;
            }
            boolean z2 = i5 != 0 ? true : z;
            boolean z3 = (i3 & 7168) == 2048;
            Object objM6869O = ir1Var.m6869O();
            if (z3 || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                C0797jg c0797jg = new C0797jg((byte) 2);
                c0797jg.f22228b = yp1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0797jg);
                obj = c0797jg;
            }
            obj = objM6869O;
            kt2 kt2Var = kt2.f23428a;
            m5668f(kt2Var, str, z2, null, (yp1) obj, ir1Var, i3 & 1022, 8);
            nt2Var = kt2Var;
            z = z2;
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            u20 u20Var = new u20(b);
            u20Var.f31611b = nt2Var;
            u20Var.f31615f = str;
            u20Var.f31612c = z;
            u20Var.f31616g = yp1Var;
            u20Var.f31613d = i;
            u20Var.f31614e = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = u20Var;
        }
    }

    /* JADX INFO: renamed from: m */
    public static pe4 m5675m() {
        return new pe4(null);
    }

    /* JADX INFO: renamed from: n */
    public static Integer m5676n(ey0 ey0Var, int i) {
        ey0Var.getClass();
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: o */
    public static void m5677o(Context context, String str, C0310ra c0310ra) {
        zs0 zs0VarM5596r;
        if (context == null || str == null) {
            return;
        }
        try {
            if (str.trim().isEmpty()) {
                return;
            }
            C0259no.m1827a(context).getClass();
            at0 at0Var = (at0) C0259no.f7805d.get(str);
            if (at0Var == null || !at0Var.m304a() || (zs0VarM5596r = f70.m5596r(context, str)) == null) {
                return;
            }
            zs0VarM5596r.m2928a(c0310ra);
        } catch (Exception e) {
            Log.e("OMIDLIB", "Error during attestation with mechanism: ".concat(str), e);
        }
    }

    /* JADX INFO: renamed from: p */
    public static nt2 m5678p(float f, float f2, int i) {
        return new a73((i & 1) != 0 ? 0.0f : f, 0.0f, (i & 4) != 0 ? 0.0f : f2, 0.0f, false);
    }

    /* JADX INFO: renamed from: r */
    public static final Bitmap m5679r(t02 t02Var) {
        if (t02Var instanceof C0759ie) {
            return ((C0759ie) t02Var).f21276a;
        }
        qm5.m9919j("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static final float m5680s(e73 e73Var, df2 df2Var) {
        return df2Var == df2.f17011a ? e73Var.mo3503b(df2Var) : e73Var.mo3502a(df2Var);
    }

    /* JADX INFO: renamed from: t */
    public static final float m5681t(e73 e73Var, df2 df2Var) {
        return df2Var == df2.f17011a ? e73Var.mo3502a(df2Var) : e73Var.mo3503b(df2Var);
    }

    /* JADX INFO: renamed from: u */
    public static void m5682u(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m5683v(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public static jy4 m5684w(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                return (jy4) declaredConstructor.newInstance(null);
            } catch (IllegalAccessException e) {
                ds3.m4668l("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                ds3.m4668l("Cannot create an instance of ", cls, e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            ds3.m4668l("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public static final float m5685y(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    /* JADX INFO: renamed from: z */
    public static p60 m5686z(n60 n60Var) {
        m60 m60Var = new m60();
        m60Var.f24680c = new no3();
        p60 p60Var = new p60();
        o60 o60Var = new o60();
        o60Var.f26366h = p60Var;
        VarHandle.storeStoreFence();
        p60Var.f27392b = o60Var;
        p60Var.f27391a = new WeakReference(m60Var);
        VarHandle.storeStoreFence();
        m60Var.f24679b = p60Var;
        m60Var.f24678a = n60Var.getClass();
        try {
            Object objMo4036f = n60Var.mo4036f(m60Var);
            if (objMo4036f == null) {
                return p60Var;
            }
            m60Var.f24678a = objMo4036f;
            return p60Var;
        } catch (Exception e) {
            p60Var.f27392b.mo7821l(e);
            return p60Var;
        }
    }

    /* JADX INFO: renamed from: x */
    public void mo5688x() {
    }

    /* JADX INFO: renamed from: q */
    public void mo5687q(String str, int i, String str2) {
    }
}
