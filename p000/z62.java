package p000;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.lang.invoke.VarHandle;
import java.lang.ref.WeakReference;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class z62 {

    /* JADX INFO: renamed from: a */
    public static final float[] f35779a = new float[91];

    /* JADX INFO: renamed from: b */
    public static final pg0 f35780b = new pg0(-1571120048, false, new wg0());

    /* JADX INFO: renamed from: c */
    public static final pg0 f35781c = new pg0(-1455401925, false, new fh0(27));

    /* JADX INFO: renamed from: d */
    public static final String[] f35782d = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    /* JADX INFO: renamed from: e */
    public static final byte[] f35783e = {48, 49, 53, 0};

    /* JADX INFO: renamed from: f */
    public static final byte[] f35784f = {48, 49, 48, 0};

    /* JADX INFO: renamed from: g */
    public static final byte[] f35785g = {48, 48, 57, 0};

    /* JADX INFO: renamed from: h */
    public static final byte[] f35786h = {48, 48, 53, 0};

    /* JADX INFO: renamed from: i */
    public static final byte[] f35787i = {48, 48, 49, 0};

    /* JADX INFO: renamed from: j */
    public static final byte[] f35788j = {48, 48, 49, 0};

    /* JADX INFO: renamed from: k */
    public static final byte[] f35789k = {48, 48, 50, 0};

    /* JADX INFO: renamed from: l */
    public static final kh5 f35790l = new kh5(3);

    /* JADX INFO: renamed from: m */
    public static g12 f35791m;

    /* JADX INFO: renamed from: A */
    public static final ii0 m13342A(View view) {
        Object tag = view.getTag(C0995R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (ii0) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public static final int m13343B(yu2 yu2Var, long j, fy4 fy4Var) {
        float fMo5861f = fy4Var != null ? fy4Var.mo5861f() : 0.0f;
        int i = (int) (4294967295L & j);
        int iM13246e = yu2Var.m13246e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < yu2Var.m13247f(iM13246e) - fMo5861f || Float.intBitsToFloat(i) > yu2Var.m13243b(iM13246e) + fMo5861f) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-fMo5861f) || Float.intBitsToFloat(i2) > yu2Var.f35535d + fMo5861f) {
            return -1;
        }
        return iM13246e;
    }

    /* JADX INFO: renamed from: C */
    public static final int m13344C(uj2 uj2Var, long j, fy4 fy4Var) {
        long jMo3999I;
        int iM13343B;
        kl4 kl4VarM11577d = uj2Var.m11577d();
        if (kl4VarM11577d != null) {
            yu2 yu2Var = kl4VarM11577d.f23216a.f22401b;
            cf2 cf2VarM11576c = uj2Var.m11576c();
            if (cf2VarM11576c != null && (iM13343B = m13343B(yu2Var, (jMo3999I = cf2VarM11576c.mo3999I(j)), fy4Var)) != -1) {
                return yu2Var.m13248g(b33.m3424b(jMo3999I, (yu2Var.m13243b(iM13343B) + yu2Var.m13247f(iM13343B)) / 2.0f, 1));
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: D */
    public static final long m13345D(uj2 uj2Var, jl3 jl3Var, int i) {
        ds3 ds3Var = wv1.f33778u;
        kl4 kl4VarM11577d = uj2Var.m11577d();
        yu2 yu2Var = kl4VarM11577d != null ? kl4VarM11577d.f23216a.f22401b : null;
        cf2 cf2VarM11576c = uj2Var.m11576c();
        return (yu2Var == null || cf2VarM11576c == null) ? ql4.f28556b : yu2Var.m13249h(jl3Var.m7174j(cf2VarM11576c.mo3999I(0L)), i, ds3Var);
    }

    /* JADX INFO: renamed from: E */
    public static final long m13346E(uj2 uj2Var, jl3 jl3Var, jl3 jl3Var2, int i) {
        long jM13345D = m13345D(uj2Var, jl3Var, i);
        if (ql4.m9900d(jM13345D)) {
            return ql4.f28556b;
        }
        long jM13345D2 = m13345D(uj2Var, jl3Var2, i);
        if (ql4.m9900d(jM13345D2)) {
            return ql4.f28556b;
        }
        int i2 = (int) (jM13345D >> 32);
        int i3 = (int) (jM13345D2 & 4294967295L);
        return sc6.m10657b(Math.min(i2, i2), Math.max(i3, i3));
    }

    /* JADX INFO: renamed from: F */
    public static j35 m13347F(C0816jz c0816jz) {
        vz0 vz0Var = vz0.f32978a;
        u04 u04Var = new u04((byte) 13);
        u04Var.f31581b = c0816jz;
        VarHandle.storeStoreFence();
        return new j35(vz0Var, u04Var, c0816jz);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public static final void m13348G(s31 s31Var) {
        if (((mt2) s31Var).f25195a.f25208n) {
            sc6.m10650V(s31Var, 1).m4879h1();
        }
    }

    /* JADX INFO: renamed from: H */
    public static final void m13349H(lf2 lf2Var) {
        sc6.m10652X(lf2Var).m12253G();
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m13350I(jl4 jl4Var, int i) {
        yu2 yu2Var = jl4Var.f22401b;
        int iM13245d = yu2Var.m13245d(i);
        return i == jl4Var.m7180f(iM13245d) || i == yu2Var.m13244c(iM13245d, false) ? jl4Var.m7181g(i) != jl4Var.m7175a(i) : jl4Var.m7175a(i) != jl4Var.m7175a(i - 1);
    }

    /* JADX INFO: renamed from: J */
    public static final boolean m13351J(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: renamed from: K */
    public static final boolean m13352K(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m13353L(int i) {
        int type;
        return (!m13352K(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    /* JADX INFO: renamed from: M */
    public static boolean m13354M(p83 p83Var) {
        s50 s50VarM10522m = p83Var.f27432a;
        int iM10521i = s50.m10521i(s50VarM10522m, AbstractC0593e.f17543a);
        if (iM10521i == -1) {
            iM10521i = s50.m10521i(p83Var.f27432a, AbstractC0593e.f17544b);
        }
        if (iM10521i != -1) {
            s50VarM10522m = s50.m10522m(s50VarM10522m, iM10521i + 1, 0, 2);
        } else if (p83Var.m9387e() != null && s50VarM10522m.mo4261b() == 2) {
            s50VarM10522m = s50.f29911d;
        }
        return !od4.m9038S(s50VarM10522m.m10524o(), ".class", true);
    }

    /* JADX INFO: renamed from: N */
    public static br2 m13355N(i50 i50Var, ir3 ir3Var) {
        List listSingletonList;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List list = ir3Var.f21714a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            fd1 fd1Var = (fd1) list.get(i);
            int size2 = fd1Var.f18921a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if ((fd1Var instanceof cd1) && i2 == fd1Var.f18921a.size() / 2) {
                    arrayList2.add(new l73(fd1Var, Integer.valueOf(arrayList.size())));
                }
                arrayList.add(fd1Var.f18921a.get(i2));
            }
        }
        Float fValueOf = Float.valueOf(0.0f);
        int iM6717y0 = ib0.m6717y0(arrayList, 9);
        if (iM6717y0 == 0) {
            listSingletonList = Collections.singletonList(fValueOf);
        } else {
            ArrayList arrayList3 = new ArrayList(iM6717y0 + 1);
            arrayList3.add(fValueOf);
            int size3 = arrayList.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj = arrayList.get(i3);
                i3++;
                float fFloatValue = fValueOf.floatValue();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (i50.m6665e((as0) obj, Float.POSITIVE_INFINITY) & 4294967295L));
                if (fIntBitsToFloat < 0.0f) {
                    C1077qn.m9987m("Measured cubic is expected to be greater or equal to zero");
                    return null;
                }
                fValueOf = Float.valueOf(fFloatValue + fIntBitsToFloat);
                arrayList3.add(fValueOf);
            }
            listSingletonList = arrayList3;
        }
        float fFloatValue2 = ((Number) hb0.m6306R0(listSingletonList)).floatValue();
        iv2 iv2Var = new iv2(listSingletonList.size());
        int size4 = listSingletonList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            iv2Var.m6944a(((Number) listSingletonList.get(i4)).floatValue() / fFloatValue2);
        }
        sl2 sl2VarM7680G = kx5.m7680G();
        int size5 = arrayList2.size();
        for (int i5 = 0; i5 < size5; i5++) {
            int iIntValue = ((Number) ((l73) arrayList2.get(i5)).f23834b).intValue();
            sl2VarM7680G.add(new fh3(ew4.m5415c((iv2Var.m6945b(iIntValue + 1) + iv2Var.m6945b(iIntValue)) / 2.0f), (fd1) ((l73) arrayList2.get(i5)).f23833a));
        }
        return new br2(i50Var, kx5.m7740w(sl2VarM7680G), arrayList, iv2Var);
    }

    /* JADX INFO: renamed from: O */
    public static final nt2 m13356O(nt2 nt2Var, yp1 yp1Var) {
        return nt2Var.mo7630d(new vc2(yp1Var, null));
    }

    /* JADX INFO: renamed from: P */
    public static final nt2 m13357P(nt2 nt2Var, yp1 yp1Var) {
        return nt2Var.mo7630d(new vc2(null, yp1Var));
    }

    /* JADX INFO: renamed from: Q */
    public static final sw2 m13358Q(mi0 mi0Var, mq1 mq1Var, Object obj) {
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            objM6869O = k43.m7398w(obj);
            ir1Var.m6905n0(objM6869O);
        }
        sw2 sw2Var = (sw2) objM6869O;
        boolean zM6894i = ir1Var.m6894i(mq1Var);
        Object objM6869O2 = ir1Var.m6869O();
        if (zM6894i || objM6869O2 == i50Var) {
            objM6869O2 = new t94(mq1Var, sw2Var, null, (byte) 0);
            ir1Var.m6905n0(objM6869O2);
        }
        lb5.m7926g(ir1Var, (mq1) objM6869O2, ju4.f22634a);
        return sw2Var;
    }

    /* JADX INFO: renamed from: R */
    public static final sw2 m13359R(Object obj, Object obj2, Object obj3, mq1 mq1Var, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            objM6869O = k43.m7398w(obj);
            ir1Var.m6905n0(objM6869O);
        }
        sw2 sw2Var = (sw2) objM6869O;
        boolean zM6894i = ir1Var.m6894i(mq1Var);
        Object objM6869O2 = ir1Var.m6869O();
        if (zM6894i || objM6869O2 == i50Var) {
            objM6869O2 = new t94(mq1Var, sw2Var, null, (byte) 2);
            ir1Var.m6905n0(objM6869O2);
        }
        lb5.m7927h(obj2, obj3, (mq1) objM6869O2, ir1Var);
        return sw2Var;
    }

    /* JADX INFO: renamed from: S */
    public static Provider m13360S() {
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(f35782d[i]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: T */
    public static final long m13361T(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    /* JADX INFO: renamed from: U */
    public static void m13362U(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* JADX INFO: renamed from: V */
    public static void m13363V(Window window) {
        if (Build.VERSION.SDK_INT >= 35) {
            window.setDecorFitsSystemWindows(false);
            return;
        }
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 256);
        window.setDecorFitsSystemWindows(false);
    }

    /* JADX INFO: renamed from: W */
    public static j35 m13364W(InterfaceC0520ca interfaceC0520ca) {
        vz0 vz0Var = vz0.f32980c;
        u04 u04Var = new u04((byte) 14);
        u04Var.f31581b = interfaceC0520ca;
        VarHandle.storeStoreFence();
        return new j35(vz0Var, u04Var, interfaceC0520ca);
    }

    /* JADX INFO: renamed from: X */
    public static final b91 m13365X(dp4 dp4Var, yp1 yp1Var, Object obj, mi0 mi0Var) {
        b91 b91Var;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6879a0(-422486566, dp4Var);
        boolean zM4648j = dp4Var.m4648j();
        zh0 zh0Var = dp4Var.f17258a;
        if (zM4648j) {
            ir1Var.m6885d0(-212166497);
            ir1Var.m6912r(false);
            if (((Boolean) yp1Var.invoke(obj)).booleanValue()) {
                b91Var = b91.f15169b;
            } else {
                b91Var = ((Boolean) yp1Var.invoke(zh0Var.mo11188l())).booleanValue() ? b91.f15170c : b91.f15168a;
            }
        } else {
            ir1Var.m6885d0(-211886815);
            Object objM6869O = ir1Var.m6869O();
            if (objM6869O == ki0.f23136a) {
                objM6869O = k43.m7398w(Boolean.FALSE);
                ir1Var.m6905n0(objM6869O);
            }
            sw2 sw2Var = (sw2) objM6869O;
            Object value = dp4Var.f17262e.getValue();
            if (((Boolean) yp1Var.invoke(zh0Var.mo11188l())).booleanValue() || (value != null && ((Boolean) yp1Var.invoke(value)).booleanValue())) {
                sw2Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) yp1Var.invoke(obj)).booleanValue()) {
                b91Var = b91.f15169b;
            } else {
                b91Var = ((value == null || !((Boolean) yp1Var.invoke(value)).booleanValue()) && ((Boolean) sw2Var.getValue()).booleanValue()) ? b91.f15170c : b91.f15168a;
            }
            ir1Var.m6912r(false);
        }
        ir1Var.m6912r(false);
        return b91Var;
    }

    /* JADX INFO: renamed from: Y */
    public static void m13366Y(String str) {
        gf0 gf0Var = new gf0(zi4.m13621u("lateinit property ", str, " has not been initialized"));
        m13362U(z62.class.getName(), gf0Var);
        throw gf0Var;
    }

    /* JADX INFO: renamed from: Z */
    public static final long m13367Z(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.Object, pg0] */
    /* JADX INFO: renamed from: a */
    public static final void m13368a(dp4 dp4Var, yp1 yp1Var, nt2 nt2Var, p91 p91Var, mc1 mc1Var, mq1 mq1Var, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var;
        wm0 wm0Var;
        boolean z;
        ir1 ir1Var2;
        b91 b91VarM13365X;
        ir1 ir1Var3 = (ir1) mi0Var;
        ir1Var3.m6889f0(-1310802509);
        if ((i & 6) == 0) {
            i2 = (ir1Var3.m6890g(dp4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var3.m6894i(yp1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var3.m6890g(nt2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var3.m6890g(p91Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ir1Var3.m6890g(mc1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ir1Var3.m6894i(mq1Var) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i3 |= ir1Var3.m6894i(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= ir1Var3.m6894i(pg0Var) ? 67108864 : 33554432;
        }
        int i4 = i3;
        byte b = 0;
        if (ir1Var3.m6871T(i4 & 1, (i4 & 38347923) != 38347922)) {
            d83 d83Var = dp4Var.f17262e;
            d83 d83Var2 = dp4Var.f17261d;
            zh0 zh0Var = dp4Var.f17258a;
            Object value = d83Var.getValue();
            Object objM6869O = ir1Var3.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                objM6869O = k43.m7398w(Boolean.FALSE);
                ir1Var3.m6905n0(objM6869O);
            }
            sw2 sw2Var = (sw2) objM6869O;
            Object objM6869O2 = ir1Var3.m6869O();
            if (objM6869O2 == i50Var) {
                objM6869O2 = new C0911mj(sw2Var, b);
                ir1Var3.m6905n0(objM6869O2);
            }
            int i5 = i4 & 14;
            int i6 = i5 | 48;
            k91.m7436a(dp4Var, (wp1) objM6869O2, ir1Var3, i6);
            if (value != null && ((Boolean) yp1Var.invoke(value)).booleanValue()) {
                sw2Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) yp1Var.invoke(d83Var2.getValue())).booleanValue() || ((Boolean) yp1Var.invoke(zh0Var.mo11188l())).booleanValue() || ((value != null && ((Boolean) yp1Var.invoke(value)).booleanValue()) || ((((Boolean) sw2Var.getValue()).booleanValue() && !m13387o(zh0Var.mo11188l(), d83Var2.getValue())) || dp4Var.m4648j() || dp4Var.m4643e()))) {
                ir1Var3.m6885d0(-273709037);
                int i7 = i6 & 14;
                boolean z2 = ((i7 ^ 6) > 4 && ir1Var3.m6890g(dp4Var)) || (i6 & 6) == 4;
                Object objM6869O3 = ir1Var3.m6869O();
                if (z2 || objM6869O3 == i50Var) {
                    objM6869O3 = zh0Var.mo11188l();
                    ir1Var3.m6905n0(objM6869O3);
                }
                if (dp4Var.m4648j()) {
                    objM6869O3 = zh0Var.mo11188l();
                }
                ir1Var3.m6885d0(2016262395);
                b91 b91VarM13365X2 = m13365X(dp4Var, yp1Var, objM6869O3, ir1Var3);
                ir1Var3.m6912r(false);
                Object value2 = d83Var2.getValue();
                ir1Var3.m6885d0(2016262395);
                b91 b91VarM13365X3 = m13365X(dp4Var, yp1Var, value2, ir1Var3);
                ir1Var3.m6912r(false);
                dp4 dp4VarM13686r = zp0.m13686r(dp4Var, b91VarM13365X2, b91VarM13365X3, "EnterExitTransition", ir1Var3, i7 | 3072);
                if (dp4Var.m4648j()) {
                    ir1Var3.m6885d0(782538635);
                    ir1Var3.m6912r(false);
                } else {
                    ir1Var3.m6885d0(782386797);
                    Object value3 = dp4Var.f17262e.getValue();
                    if (value3 == null) {
                        ir1Var3.m6885d0(782437481);
                        ir1Var3.m6912r(false);
                        b91VarM13365X = null;
                    } else {
                        ir1Var3.m6885d0(782437482);
                        ir1Var3.m6885d0(2016262395);
                        b91VarM13365X = m13365X(dp4Var, yp1Var, value3, ir1Var3);
                        ir1Var3.m6912r(false);
                        ir1Var3.m6912r(false);
                    }
                    dp4VarM13686r.m4658t(b91VarM13365X);
                    ir1Var3.m6912r(false);
                }
                p91 p91VarM7442g = k91.m7442g(dp4VarM13686r, p91Var, ir1Var3, (i4 >> 6) & 112);
                d83 d83Var3 = dp4VarM13686r.f17261d;
                zh0 zh0Var2 = dp4VarM13686r.f17258a;
                mc1 mc1VarM7443h = k91.m7443h(dp4VarM13686r, mc1Var, ir1Var3, (i4 >> 9) & 112);
                sw2 sw2VarM7369C = k43.m7369C(mq1Var, ir1Var3);
                Object objInvoke = mq1Var.invoke(zh0Var2.mo11188l(), d83Var3.getValue());
                boolean zM6890g = ir1Var3.m6890g(dp4VarM13686r) | ir1Var3.m6890g(sw2VarM7369C);
                Object objM6869O4 = ir1Var3.m6869O();
                if (zM6890g || objM6869O4 == i50Var) {
                    wm0Var = null;
                    objM6869O4 = new C0671g0((Object) dp4VarM13686r, (Object) sw2VarM7369C, wm0Var, (byte) 5);
                    ir1Var3.m6905n0(objM6869O4);
                } else {
                    wm0Var = null;
                }
                sw2 sw2VarM13358Q = m13358Q(ir1Var3, (mq1) objM6869O4, objInvoke);
                Object objMo11188l = zh0Var2.mo11188l();
                b91 b91Var = b91.f15170c;
                if (objMo11188l == b91Var && d83Var3.getValue() == b91Var && ((Boolean) sw2VarM13358Q.getValue()).booleanValue()) {
                    ir1Var3.m6885d0(-270520625);
                    ir1Var3.m6912r(false);
                    z = false;
                    ir1Var2 = ir1Var3;
                } else {
                    ir1Var3.m6885d0(-272022668);
                    boolean z3 = i5 == 4;
                    Object objM6869O5 = ir1Var3.m6869O();
                    Object obj = objM6869O5;
                    if (z3 || objM6869O5 == i50Var) {
                        C1184tj c1184tj = new C1184tj();
                        c1184tj.f31186a = dp4VarM13686r;
                        c1184tj.f31187b = k43.m7398w(w52.m12106a(0L));
                        c1184tj.f31188c = new b54();
                        VarHandle.storeStoreFence();
                        ir1Var3.m6905n0(c1184tj);
                        obj = c1184tj;
                    }
                    C1184tj c1184tj2 = (C1184tj) obj;
                    c1184tj2.f31188c.getClass();
                    z = false;
                    nt2 nt2VarM7437b = k91.m7437b(dp4VarM13686r, p91VarM7442g, mc1VarM7443h, c1184tj2.f31188c, "Built-in", ir1Var3, 1575936, 8);
                    ir1 ir1Var4 = ir1Var3;
                    ir1Var4.m6885d0(-1255657861);
                    ir1Var4.m6912r(false);
                    nt2 nt2VarMo7630d = nt2Var.mo7630d(nt2VarM7437b.mo7630d(kt2.f23428a));
                    Object objM6869O6 = ir1Var4.m6869O();
                    Object obj2 = objM6869O6;
                    if (objM6869O6 == i50Var) {
                        C0763ij c0763ij = new C0763ij();
                        c0763ij.f21464a = c1184tj2;
                        VarHandle.storeStoreFence();
                        ir1Var4.m6905n0(c0763ij);
                        obj2 = c0763ij;
                    }
                    C0763ij c0763ij2 = (C0763ij) obj2;
                    ?? r16 = wm0Var;
                    int iHashCode = Long.hashCode(ir1Var4.f21683T);
                    ga3 ga3VarM6902m = ir1Var4.m6902m();
                    nt2 nt2VarM10006A = qq2.m10006A(ir1Var4, nt2VarMo7630d);
                    bi0.f15310ap.getClass();
                    if (ir1Var4.f21685a == null) {
                        dt0.m4682E();
                        throw r16;
                    }
                    ir1Var4.m6893h0();
                    if (ir1Var4.f21682S) {
                        ir1Var4.m6900l(wf2.f33290T);
                    } else {
                        ir1Var4.m6911q0();
                    }
                    C0006a5.m53I(ir1Var4, ia5.f21216g, c0763ij2);
                    C0006a5.m53I(ir1Var4, ia5.f21215f, ga3VarM6902m);
                    C0006a5.m85w(ir1Var4, Integer.valueOf(iHashCode));
                    C0006a5.m50F(ir1Var4);
                    C0006a5.m53I(ir1Var4, ia5.f21214e, nt2VarM10006A);
                    pg0Var.invoke(c1184tj2, ir1Var4, Integer.valueOf((i4 >> 21) & 112));
                    ir1Var4.m6912r(true);
                    ir1Var4.m6912r(false);
                    ir1Var2 = ir1Var4;
                }
                ir1Var2.m6912r(z);
                ir1Var = ir1Var2;
            } else {
                ir1Var3.m6885d0(-270514673);
                ir1Var3.m6912r(false);
                ir1Var = ir1Var3;
            }
        } else {
            ir1 ir1Var5 = ir1Var3;
            ir1Var5.m6874W();
            ir1Var = ir1Var5;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            yk3VarM6916v.f35300d = new C1146si(dp4Var, yp1Var, nt2Var, p91Var, mc1Var, mq1Var, (pg0) pg0Var, i);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final long m13369a0(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static final void m13370b(tw2 tw2Var, nt2 nt2Var, p91 p91Var, mc1 mc1Var, String str, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        String str2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(657024243);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ir1Var.m6890g(tw2Var) : ir1Var.m6894i(tw2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(nt2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6890g(p91Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6890g(mc1Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= ir1Var.m6894i(pg0Var) ? 131072 : 65536;
        }
        if (ir1Var.m6871T(i3 & 1, (74899 & i3) != 74898)) {
            dp4 dp4VarM13663O = zp0.m13663O(tw2Var, "AnimatedVisibility", ir1Var, (i3 & 14) | ((i3 >> 9) & 112), 0);
            Object objM6869O = ir1Var.m6869O();
            if (objM6869O == ki0.f23136a) {
                objM6869O = C1035pi.f27616n;
                ir1Var.m6905n0(objM6869O);
            }
            int i4 = i3 << 3;
            m13376e(dp4VarM13663O, (yp1) objM6869O, nt2Var, p91Var, mc1Var, pg0Var, ir1Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016));
            str2 = "AnimatedVisibility";
        } else {
            ir1Var.m6874W();
            str2 = str;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            yk3VarM6916v.f35300d = new C1109ri(tw2Var, nt2Var, p91Var, mc1Var, str2, pg0Var, i);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static final rs4 m13371b0(String str) {
        int i;
        y62.m12992v(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt < '0') {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int iDivideUnsigned = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                if (iDivideUnsigned != 119304647) {
                    return null;
                }
                iDivideUnsigned = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                    return null;
                }
            }
            int i3 = i2 * 10;
            int i4 = iDigit + i3;
            if (Integer.compareUnsigned(i4, i3) < 0) {
                return null;
            }
            i++;
            i2 = i4;
        }
        rs4 rs4Var = new rs4();
        rs4Var.f29588a = i2;
        VarHandle.storeStoreFence();
        return rs4Var;
    }

    /* JADX INFO: renamed from: c */
    public static final void m13372c(boolean z, nt2 nt2Var, p91 p91Var, mc1 mc1Var, String str, pg0 pg0Var, mi0 mi0Var, int i) {
        nt2 nt2Var2;
        String str2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1448730565);
        int i2 = i | (ir1Var.m6892h(z) ? 4 : 2) | 48 | (ir1Var.m6890g(p91Var) ? 256 : 128) | (ir1Var.m6890g(mc1Var) ? 2048 : 1024) | 24576;
        if (ir1Var.m6871T(i2 & 1, (74899 & i2) != 74898)) {
            dp4 dp4VarM13668T = zp0.m13668T(Boolean.valueOf(z), "AnimatedVisibility", ir1Var, (i2 & 14) | 48, 0);
            Object objM6869O = ir1Var.m6869O();
            if (objM6869O == ki0.f23136a) {
                objM6869O = C1035pi.f27614l;
                ir1Var.m6905n0(objM6869O);
            }
            int i3 = i2 << 3;
            kt2 kt2Var = kt2.f23428a;
            m13376e(dp4VarM13668T, (yp1) objM6869O, kt2Var, p91Var, mc1Var, pg0Var, ir1Var, (i3 & 57344) | (i3 & 7168) | 432 | 1572864);
            str2 = "AnimatedVisibility";
            nt2Var2 = kt2Var;
        } else {
            ir1Var.m6874W();
            nt2Var2 = nt2Var;
            str2 = str;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            yk3VarM6916v.f35300d = new C0985oj(z, nt2Var2, p91Var, mc1Var, str2, pg0Var, i, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static final ws4 m13373c0(String str) {
        y62.m12992v(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt < '0') {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, 10L);
                if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j2 = j * 10;
            long j3 = (((long) iDigit) & 4294967295L) + j2;
            if (Long.compareUnsigned(j3, j2) < 0) {
                return null;
            }
            i++;
            j = j3;
        }
        ws4 ws4Var = new ws4();
        ws4Var.f33693a = j;
        VarHandle.storeStoreFence();
        return ws4Var;
    }

    /* JADX INFO: renamed from: d */
    public static final void m13374d(boolean z, nt2 nt2Var, p91 p91Var, mc1 mc1Var, String str, pg0 pg0Var, mi0 mi0Var, int i) {
        nt2 nt2Var2;
        String str2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1799879339);
        int i2 = i | (ir1Var.m6892h(z) ? 32 : 16) | 384 | (ir1Var.m6890g(p91Var) ? 2048 : 1024) | (ir1Var.m6890g(mc1Var) ? 16384 : 8192) | 196608;
        if (ir1Var.m6871T(i2 & 1, (599185 & i2) != 599184)) {
            dp4 dp4VarM13668T = zp0.m13668T(Boolean.valueOf(z), "AnimatedVisibility", ir1Var, ((i2 >> 3) & 14) | 48, 0);
            Object objM6869O = ir1Var.m6869O();
            if (objM6869O == ki0.f23136a) {
                objM6869O = C1035pi.f27615m;
                ir1Var.m6905n0(objM6869O);
            }
            kt2 kt2Var = kt2.f23428a;
            m13376e(dp4VarM13668T, (yp1) objM6869O, kt2Var, p91Var, mc1Var, pg0Var, ir1Var, (i2 & 57344) | (i2 & 7168) | 432 | 1572864);
            str2 = "AnimatedVisibility";
            nt2Var2 = kt2Var;
        } else {
            ir1Var.m6874W();
            nt2Var2 = nt2Var;
            str2 = str;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            yk3VarM6916v.f35300d = new C0985oj(z, nt2Var2, p91Var, mc1Var, str2, pg0Var, i, (byte) 1);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static final String m13375d0(byte b) {
        if (b == 1) {
            return "quotation mark '\"'";
        }
        if (b == 2) {
            return "string escape sequence '\\'";
        }
        if (b == 4) {
            return "comma ','";
        }
        if (b == 5) {
            return "colon ':'";
        }
        if (b == 6) {
            return "start of the object '{'";
        }
        if (b == 7) {
            return "end of the object '}'";
        }
        if (b == 8) {
            return "start of the array '['";
        }
        if (b == 9) {
            return "end of the array ']'";
        }
        if (b == 10) {
            return "end of the input";
        }
        return b == 127 ? "invalid token" : "valid token";
    }

    /* JADX INFO: renamed from: e */
    public static final void m13376e(dp4 dp4Var, yp1 yp1Var, nt2 nt2Var, p91 p91Var, mc1 mc1Var, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        p91 p91Var2;
        mc1 mc1Var2;
        pg0 pg0Var2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-497872534);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(dp4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(yp1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6890g(nt2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            p91Var2 = p91Var;
            i2 |= ir1Var.m6890g(p91Var2) ? 2048 : 1024;
        } else {
            p91Var2 = p91Var;
        }
        if ((i & 24576) == 0) {
            mc1Var2 = mc1Var;
            i2 |= ir1Var.m6890g(mc1Var2) ? 16384 : 8192;
        } else {
            mc1Var2 = mc1Var;
        }
        int i3 = i2 | 196608;
        if ((1572864 & i) == 0) {
            pg0Var2 = pg0Var;
            i3 |= ir1Var.m6894i(pg0Var2) ? 1048576 : 524288;
        } else {
            pg0Var2 = pg0Var;
        }
        if (ir1Var.m6871T(i3 & 1, (599187 & i3) != 599186)) {
            int i4 = i3 & 112;
            int i5 = i3 & 14;
            boolean z = (i4 == 32) | (i5 == 4);
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (z || objM6869O == i50Var) {
                objM6869O = new C1073qj(yp1Var, dp4Var);
                ir1Var.m6905n0(objM6869O);
            }
            nt2 nt2VarM10829y = sj3.m10829y(nt2Var, (nq1) objM6869O);
            Object objM6869O2 = ir1Var.m6869O();
            if (objM6869O2 == i50Var) {
                objM6869O2 = C0984oi.f26756m;
                ir1Var.m6905n0(objM6869O2);
            }
            int i6 = 196608 | i5 | i4 | (i3 & 7168) | (57344 & i3);
            int i7 = i3 << 6;
            m13368a(dp4Var, yp1Var, nt2VarM10829y, p91Var2, mc1Var2, (mq1) objM6869O2, pg0Var2, ir1Var, i6 | (29360128 & i7) | (i7 & 234881024));
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            yk3VarM6916v.f35300d = new C1109ri(dp4Var, yp1Var, nt2Var, p91Var, mc1Var, pg0Var, i);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static j35 m13377e0(C0779iz c0779iz) {
        vz0 vz0Var = vz0.f32979b;
        u04 u04Var = new u04((byte) 12);
        u04Var.f31581b = c0779iz;
        VarHandle.storeStoreFence();
        return new j35(vz0Var, u04Var, c0779iz);
    }

    /* JADX INFO: renamed from: f */
    public static l00 m13378f(t02 t02Var) {
        l00 l00Var = new l00(t02Var, (((long) ((C0759ie) t02Var).f21276a.getHeight()) & 4294967295L) | (((long) ((C0759ie) t02Var).f21276a.getWidth()) << 32));
        l00Var.f23660h = true;
        return l00Var;
    }

    /* JADX INFO: renamed from: g */
    public static final void m13379g(nt2 nt2Var, pi1 pi1Var, e73 e73Var, p44 p44Var, pg0 pg0Var, mi0 mi0Var, int i) {
        pi1 pi1Var2;
        e73 e73Var2;
        p44 p44VarM10977a;
        pi1 pi1Var3;
        e73 e73Var3;
        nt2 nt2VarM10631C;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(711446191);
        int i2 = i | (ir1Var.m6890g(nt2Var) ? 32 : 16) | 920218752;
        boolean z = true;
        if (ir1Var.m6871T(i2 & 1, (306783379 & i2) != 306783378)) {
            ir1Var.m6876Y();
            byte b = 6;
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                g73 g73Var = qi1.f28503a;
                dc0 dc0Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24277a;
                pi1Var3 = dc0Var.f16947d0;
                if (pi1Var3 == null) {
                    long jM6744d = ic0.m6744d(dc0Var, 36);
                    long jM6741a = ic0.m6741a(dc0Var, ic0.m6744d(dc0Var, 36));
                    long jM6744d2 = ic0.m6744d(dc0Var, 26);
                    long jM6741a2 = ic0.m6741a(dc0Var, ic0.m6744d(dc0Var, 26));
                    pi1Var3 = new pi1();
                    pi1Var3.f27631a = jM6744d;
                    pi1Var3.f27632b = jM6741a;
                    pi1Var3.f27633c = jM6744d2;
                    pi1Var3.f27634d = jM6741a2;
                    VarHandle.storeStoreFence();
                    dc0Var.f16947d0 = pi1Var3;
                }
                e73Var3 = qi1.f28503a;
                p44VarM10977a = t44.m10977a(6, ir1Var);
            } else {
                ir1Var.m6874W();
                pi1Var3 = pi1Var;
                e73Var3 = e73Var;
                p44VarM10977a = p44Var;
            }
            ir1Var.m6913s();
            fm2 fm2VarM3233L = as4.m3233L(false, ir1Var);
            Object[] objArr = new Object[0];
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                objM6869O = new fj0((byte) 14);
                ir1Var.m6905n0(objM6869O);
            }
            sw2 sw2Var = (sw2) dt0.m4686O(objArr, (wp1) objM6869O, ir1Var, 48);
            Object objM6869O2 = ir1Var.m6869O();
            if (objM6869O2 == i50Var) {
                objM6869O2 = s94.m10566b(new fj0((byte) 15));
                ir1Var.m6905n0(objM6869O2);
            }
            if (((Boolean) ((xb4) objM6869O2).getValue()).booleanValue()) {
                ir1Var.m6885d0(800026871);
                ir1Var.m6912r(false);
                nt2VarM10631C = kt2.f23428a;
            } else {
                ir1Var.m6885d0(800027635);
                Object objM6869O3 = ir1Var.m6869O();
                if (objM6869O3 == i50Var) {
                    objM6869O3 = new dh0((byte) 25);
                    ir1Var.m6905n0(objM6869O3);
                }
                nt2VarM10631C = sc6.m10631C((yp1) objM6869O3);
                ir1Var.m6912r(false);
            }
            nt2 nt2VarMo7630d = nt2Var.mo7630d(nt2VarM10631C);
            if (((Boolean) sw2Var.getValue()).booleanValue()) {
                z = false;
            } else {
                fm2VarM3233L.getValue();
            }
            boolean zM6890g = ir1Var.m6890g(sw2Var);
            Object objM6869O4 = ir1Var.m6869O();
            Object obj = objM6869O4;
            if (zM6890g || objM6869O4 == i50Var) {
                C0761ih c0761ih = new C0761ih(b);
                c0761ih.f21416b = sw2Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0761ih);
                obj = c0761ih;
            }
            fm2VarM3233L.getValue();
            e73Var2 = e73Var3;
            boolean z2 = z;
            pi1Var2 = pi1Var3;
            m13380h(nt2VarMo7630d, z2, (yp1) obj, pi1Var2, e73Var2, p44VarM10977a, pg0Var, ir1Var, 918577152, 54);
        } else {
            ir1Var.m6874W();
            pi1Var2 = pi1Var;
            e73Var2 = e73Var;
            p44VarM10977a = p44Var;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ri1 ri1Var = new ri1((byte) 3);
            ri1Var.f29309c = nt2Var;
            ri1Var.f29310d = pi1Var2;
            ri1Var.f29311e = e73Var2;
            ri1Var.f29312f = p44VarM10977a;
            ri1Var.f29308b = pg0Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ri1Var;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m13380h(nt2 nt2Var, boolean z, yp1 yp1Var, pi1 pi1Var, e73 e73Var, p44 p44Var, pg0 pg0Var, mi0 mi0Var, int i, int i2) {
        int i3;
        int i4;
        byte b;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1009218538);
        if ((i & 6) == 0) {
            i3 = (ir1Var.m6890g(nt2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ir1Var.m6892h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ir1Var.m6894i(yp1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ir1Var.m6890g(pi1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= ir1Var.m6890g(e73Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= ir1Var.m6890g(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= ir1Var.m6890g(p44Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= ir1Var.m6894i(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= ir1Var.m6894i(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= ir1Var.m6884d(0.0f) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (ir1Var.m6884d(0.0f) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ir1Var.m6894i(pg0Var) ? 32 : 16;
        }
        if (ir1Var.m6871T(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            String strM11818B = vd6.m11818B(C0995R.string.m3c_floating_toolbar_expand, ir1Var);
            String strM11818B2 = vd6.m11818B(C0995R.string.m3c_floating_toolbar_collapse, ir1Var);
            sw2 sw2VarM7369C = k43.m7369C(Boolean.valueOf(z), ir1Var);
            g73 g73Var = qi1.f28503a;
            int i5 = i3;
            xb4 xb4VarM8765a = AbstractC0947ni.m8765a(0.0f, lb5.m7919a0(1, ir1Var), ir1Var);
            nt2 nt2VarMo7630d = nt2Var.mo7630d(kt2.f23428a);
            boolean zM6890g = ir1Var.m6890g(xb4VarM8765a) | ((i5 & 3670016) == 1048576);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                na1 na1Var = new na1((byte) 3);
                na1Var.f25595b = p44Var;
                na1Var.f25596c = xb4VarM8765a;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(na1Var);
                obj = na1Var;
            }
            obj = objM6869O;
            nt2 nt2VarM5648F = AbstractC0647fd.m5648F(as4.m3258q(n74.m8576d(se0.m10693F(nt2VarMo7630d, (yp1) obj), 64.0f, Float.NaN), pi1Var.f27631a, p44Var), e73Var);
            pr3 pr3VarM9243a = or3.m9243a(AbstractC1337xn.f34437d, ig1.f21388l, ir1Var, 54);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM5648F);
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
            zh3 zh3VarMo7523a = zl0.f36166a.mo7523a(pb0.m9462a(pi1Var.f27632b));
            ri1 ri1Var = new ri1((byte) 0);
            ri1Var.f29309c = sw2VarM7369C;
            ri1Var.f29310d = yp1Var;
            ri1Var.f29311e = strM11818B;
            ri1Var.f29312f = strM11818B2;
            ri1Var.f29308b = pg0Var;
            VarHandle.storeStoreFence();
            as4.m3244c(zh3VarMo7523a, vd6.m11834R(-113592250, ri1Var, ir1Var), ir1Var, 56);
            b = 1;
            ir1Var.m6912r(true);
        } else {
            b = 1;
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            s41 s41Var = new s41(b);
            s41Var.f29870e = nt2Var;
            s41Var.f29867b = z;
            s41Var.f29871f = yp1Var;
            s41Var.f29872g = pi1Var;
            s41Var.f29873h = e73Var;
            s41Var.f29874i = p44Var;
            s41Var.f29875j = pg0Var;
            s41Var.f29868c = i;
            s41Var.f29869d = i2;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = s41Var;
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m13381i(Context context, int i) {
        return (int) Math.ceil(TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics()));
    }

    /* JADX INFO: renamed from: j */
    public static l73 m13382j(Activity activity) {
        Window window = activity.getWindow();
        View viewFindViewById = window != null ? window.findViewById(R.id.content) : null;
        l73 l73Var = viewFindViewById != null ? new l73(Integer.valueOf(viewFindViewById.getTop()), Integer.valueOf(viewFindViewById.getBottom())) : new l73(0, 0);
        return new l73(Integer.valueOf(qq2.m10010E(((Number) l73Var.f23833a).intValue() / activity.getResources().getDisplayMetrics().density)), Integer.valueOf(qq2.m10010E(((Number) l73Var.f23834b).intValue() / activity.getResources().getDisplayMetrics().density)));
    }

    /* JADX INFO: renamed from: k */
    public static Rect m13383k(Context context, Rect rect) {
        return new Rect(qq2.m10010E(rect.left / context.getResources().getDisplayMetrics().density), qq2.m10010E(rect.top / context.getResources().getDisplayMetrics().density), qq2.m10010E(rect.right / context.getResources().getDisplayMetrics().density), qq2.m10010E(rect.bottom / context.getResources().getDisplayMetrics().density));
    }

    /* JADX INFO: renamed from: l */
    public static Object m13384l(String str, yp1 yp1Var) {
        if (hd4.m6345k0(str)) {
            return null;
        }
        return yp1Var.invoke(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public static final Object m13385m(jy3 jy3Var, float f, ag1 ag1Var, ym0 ym0Var) {
        ax3 ax3Var;
        nl3 nl3Var;
        if (ym0Var instanceof ax3) {
            ax3Var = (ax3) ym0Var;
            int i = ax3Var.f14931v;
            if ((i & Integer.MIN_VALUE) != 0) {
                ax3Var.f14931v = i - Integer.MIN_VALUE;
            } else {
                ax3Var = new ax3(ym0Var);
            }
        } else {
            ax3Var = new ax3(ym0Var);
        }
        Object obj = ax3Var.f14930u;
        Object obj2 = ap0.f14763a;
        int i2 = ax3Var.f14931v;
        if (i2 == 0) {
            k43.m7376J(obj);
            nl3 nl3Var2 = new nl3();
            mq1 bx3Var = new bx3(f, ag1Var, nl3Var2, null);
            ax3Var.f14929t = nl3Var2;
            ax3Var.f14931v = 1;
            if (jy3Var.mo6021d(xw2.f34665a, bx3Var, ax3Var) == obj2) {
                return obj2;
            }
            nl3Var = nl3Var2;
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nl3Var = ax3Var.f14929t;
            k43.m7376J(obj);
        }
        return new Float(nl3Var.f25933a);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m13386n(float f, Float f2) {
        return f2 != null && f == f2.floatValue();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m13387o(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: p */
    public static final Object m13388p(nr6 nr6Var, ym0 ym0Var) throws Exception {
        if (nr6Var.m8825i()) {
            Exception excM8823g = nr6Var.m8823g();
            if (excM8823g != null) {
                throw excM8823g;
            }
            if (!nr6Var.f26060d) {
                return nr6Var.m8824h();
            }
            throw new CancellationException("Task " + nr6Var + " was cancelled normally.");
        }
        b70 b70Var = new b70(1, C0006a5.m86x(ym0Var));
        b70Var.m3497u();
        sz0 sz0Var = sz0.f30678b;
        wd3 wd3Var = new wd3((byte) 15);
        wd3Var.f33259b = b70Var;
        VarHandle.storeStoreFence();
        nr6Var.f26058b.m10307g(new a86(sz0Var, wd3Var));
        nr6Var.m8833q();
        Object objM3495r = b70Var.m3495r();
        ap0 ap0Var = ap0.f14763a;
        return objM3495r;
    }

    /* JADX INFO: renamed from: q */
    public static int m13389q(Context context, int i) {
        return qq2.m10010E(i / context.getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: r */
    public static l73 m13390r(Activity activity) {
        Window window = activity.getWindow();
        View viewFindViewById = window != null ? window.findViewById(R.id.content) : null;
        l73 l73Var = viewFindViewById != null ? new l73(Integer.valueOf(viewFindViewById.getWidth()), Integer.valueOf(viewFindViewById.getHeight())) : new l73(0, 0);
        return new l73(Integer.valueOf(qq2.m10010E(((Number) l73Var.f23833a).intValue() / activity.getResources().getDisplayMetrics().density)), Integer.valueOf(qq2.m10010E(((Number) l73Var.f23834b).intValue() / activity.getResources().getDisplayMetrics().density)));
    }

    /* JADX INFO: renamed from: s */
    public static final byte m13391s(char c) {
        if (c < '~') {
            return u80.f31716b[c];
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: t */
    public static final sw2 m13392t(nv2 nv2Var, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            objM6869O = k43.m7398w(Boolean.FALSE);
            ir1Var.m6905n0(objM6869O);
        }
        sw2 sw2Var = (sw2) objM6869O;
        byte b = 1;
        boolean z = (((i & 14) ^ 6) > 4 && ir1Var.m6890g(nv2Var)) || (i & 6) == 4;
        Object objM6869O2 = ir1Var.m6869O();
        if (z || objM6869O2 == i50Var) {
            objM6869O2 = new vk1(nv2Var, sw2Var, null, b);
            ir1Var.m6905n0(objM6869O2);
        }
        lb5.m7926g(ir1Var, (mq1) objM6869O2, nv2Var);
        return sw2Var;
    }

    /* JADX INFO: renamed from: u */
    public static int m13393u(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: v */
    public static int m13394v(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m13395w(jl3 jl3Var, float f, float f2) {
        float f3 = jl3Var.f22396a;
        if (f > jl3Var.f22398c || f3 > f) {
            return false;
        }
        return f2 <= jl3Var.f22399d && jl3Var.f22397b <= f2;
    }

    /* JADX INFO: renamed from: x */
    public static final int m13396x(View view, int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i3 = i2;
            }
            i2++;
            Object objM8506p = n40.m8506p(view);
            view = objM8506p instanceof View ? (View) objM8506p : null;
        }
        return i3;
    }

    /* JADX INFO: renamed from: y */
    public static final View m13397y(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(m13396x(view, C0995R.id.view_tree_lifecycle_owner), m13396x(view, C0995R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i = 0;
        View view3 = view2;
        while (view != null) {
            if (i == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (m13342A(view) == null) {
                i++;
                Object objM8506p = n40.m8506p(view);
                View view4 = view2;
                view2 = view;
                view = objM8506p instanceof View ? (View) objM8506p : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    /* JADX INFO: renamed from: z */
    public static final g12 m13398z() {
        g12 g12Var = f35791m;
        if (g12Var != null) {
            return g12Var;
        }
        f12 f12Var = new f12("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = uw4.f32218a;
        ga4 ga4Var = new ga4(pb0.f27495b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new w83(9.0f, 16.17f));
        arrayList.add(new v83(4.83f, 12.0f));
        arrayList.add(new d93(-1.42f, 1.41f));
        arrayList.add(new v83(9.0f, 19.0f));
        arrayList.add(new v83(21.0f, 7.0f));
        arrayList.add(new d93(-1.41f, -1.41f));
        arrayList.add(s83.f29968c);
        f12.m5445c(f12Var, arrayList, ga4Var, 1.0f, 1.0f, 2, 1.0f, 14336);
        g12 g12VarM5449e = f12Var.m5449e();
        f35791m = g12VarM5449e;
        return g12VarM5449e;
    }
}
