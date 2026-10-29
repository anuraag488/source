package p000;

import ads_mobile_sdk.C0217lc;
import ads_mobile_sdk.aq1;
import ads_mobile_sdk.d63;
import ads_mobile_sdk.e33;
import ads_mobile_sdk.fy3;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;
import android.text.TextPaint;
import android.view.View;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class dt0 {

    /* JADX INFO: renamed from: a */
    public static final C0494bk f17343a = new C0494bk(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: b */
    public static final C0530ck f17344b = new C0530ck(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c */
    public static final C0578dk f17345c = new C0578dk(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d */
    public static final C0615ek f17346d = new C0615ek(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e */
    public static final C0494bk f17347e = new C0494bk(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: f */
    public static final C0530ck f17348f = new C0530ck(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: g */
    public static final C0578dk f17349g = new C0578dk(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: h */
    public static final C0615ek f17350h = new C0615ek(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: i */
    public static final pg0 f17351i = new pg0(-1363242082, false, new fh0(18));

    /* JADX INFO: renamed from: j */
    public static final pg0 f17352j = new pg0(-1283099720, false, new sg0(0));

    /* JADX INFO: renamed from: k */
    public static final pg0 f17353k = new pg0(-454947609, false, new jh0(7));

    /* JADX INFO: renamed from: l */
    public static final C0796jf f17354l = new C0796jf(1000);

    /* JADX INFO: renamed from: m */
    public static final C0796jf f17355m;

    /* JADX INFO: renamed from: n */
    public static final C0796jf f17356n;

    /* JADX INFO: renamed from: o */
    public static final vi3 f17357o;

    /* JADX INFO: renamed from: p */
    public static final z45 f17358p;

    /* JADX INFO: renamed from: q */
    public static g12 f17359q;

    static {
        new C0796jf(1007);
        f17355m = new C0796jf(1008);
        f17356n = new C0796jf(1002);
        int i = 0;
        f17357o = new vi3(i, i, (byte) 2);
        f17358p = new z45((byte) 29);
    }

    /* JADX INFO: renamed from: A */
    public static final uo4 m4679A(xy4 xy4Var, C0875lk c0875lk) {
        xy4Var.getClass();
        int length = c0875lk.f24092b.length();
        String str = c0875lk.f24092b;
        int length2 = str.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            m4699b0(i, length2, i);
        }
        m4699b0(length, length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            m4701c0(i2, length, i2);
        }
        m4701c0(length2, length, length2);
        return new uo4(c0875lk, new vi3(str.length(), str.length(), (byte) 2));
    }

    /* JADX INFO: renamed from: B */
    public static final String m4680B(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    /* JADX INFO: renamed from: D */
    public static final av3 m4681D(View view) {
        while (view != null) {
            Object tag = view.getTag(C0995R.id.view_tree_saved_state_registry_owner);
            av3 av3Var = tag instanceof av3 ? (av3) tag : null;
            if (av3Var != null) {
                return av3Var;
            }
            Object objM8506p = n40.m8506p(view);
            view = objM8506p instanceof View ? (View) objM8506p : null;
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public static final void m4682E() {
        throw new IllegalStateException("Invalid applier");
    }

    /* JADX INFO: renamed from: L */
    public static double[] m4683L(double[] dArr, double[][] dArr2) {
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = (dArr3[1] * d3) + d2;
        double d5 = dArr[2];
        double d6 = (dArr3[2] * d5) + d4;
        double[] dArr4 = dArr2[1];
        double d7 = (dArr4[2] * d5) + (dArr4[1] * d3) + (dArr4[0] * d);
        double[] dArr5 = dArr2[2];
        return new double[]{d6, d7, (d5 * dArr5[2]) + (d3 * dArr5[1]) + (d * dArr5[0])};
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: M */
    public static final lm4 m4684M(mt2 mt2Var, yp1 yp1Var) {
        wf2 wf2VarM10652X = sc6.m10652X(mt2Var);
        int i = wf2VarM10652X.f33312b;
        ll3 rectManager = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) zf2.m13548a(wf2VarM10652X)).getRectManager();
        mm4 mm4Var = rectManager.f24129d;
        mm4Var.getClass();
        lv2 lv2Var = mm4Var.f25032a;
        lm4 lm4Var = new lm4();
        lm4Var.f24180h = mm4Var;
        lm4Var.f24173a = i;
        lm4Var.f24174b = mt2Var;
        lm4Var.f24175c = yp1Var;
        lm4Var.f24179g = Long.MIN_VALUE;
        VarHandle.storeStoreFence();
        Object objM8197b = lv2Var.m8197b(i);
        if (objM8197b == null) {
            lv2Var.m8121h(i, lm4Var);
            objM8197b = lm4Var;
        }
        lm4 lm4Var2 = (lm4) objM8197b;
        if (lm4Var2 != lm4Var) {
            while (true) {
                lm4 lm4Var3 = lm4Var2.f24176d;
                if (lm4Var3 == null) {
                    break;
                }
                lm4Var2 = lm4Var3;
            }
            lm4Var2.f24176d = lm4Var;
        }
        wf2 wf2VarM10652X2 = sc6.m10652X(mt2Var.f25195a);
        if (wf2VarM10652X2.f33317g != -4) {
            C0795je c0795je = rectManager.f24128c;
            int iM8029d = rectManager.m8029d(wf2VarM10652X2);
            long[] jArr = (long[]) c0795je.f22194c;
            int i2 = iM8029d + 2;
            jArr[i2] = (jArr[i2] & 8070450532247928831L) | (-8070450532247928832L);
        }
        rectManager.f24131f = true;
        rectManager.m8033j();
        return lm4Var;
    }

    /* JADX INFO: renamed from: N */
    public static final gr1 m4685N(mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6877Z(206, qi0.f28502e);
        if (ir1Var.f21682S) {
            p84.m9389y(ir1Var.f21672I);
        }
        Object objM6861G = ir1Var.m6861G();
        mr1 ip3Var = objM6861G instanceof mr1 ? (mr1) objM6861G : null;
        if (ip3Var == null) {
            long j = ir1Var.f21683T;
            boolean z = ir1Var.f21701q;
            boolean z2 = ir1Var.f21666C;
            gr1 gr1Var = new gr1();
            gr1Var.f20082g = ir1Var;
            gr1Var.f20076a = j;
            gr1Var.f20077b = z;
            gr1Var.f20078c = z2;
            mw2 mw2Var = uv3.f32207a;
            gr1Var.f20080e = new mw2();
            gr1Var.f20081f = new d83(ga3.f19690d, o85.f26454n);
            VarHandle.storeStoreFence();
            fr1 fr1Var = new fr1();
            fr1Var.f19234a = gr1Var;
            VarHandle.storeStoreFence();
            ip3Var = new ip3(fr1Var, -1);
            ir1Var.m6907o0(ip3Var);
        }
        gr1 gr1Var2 = ((fr1) ip3Var.f25168a).f19234a;
        gr1Var2.f20081f.setValue(ir1Var.m6902m());
        ir1Var.m6912r(false);
        return gr1Var2;
    }

    /* JADX INFO: renamed from: O */
    public static final Object m4686O(Object[] objArr, wp1 wp1Var, mi0 mi0Var, int i) {
        return m4687P(Arrays.copyOf(objArr, objArr.length), ev3.f18515a, wp1Var, mi0Var, ((i << 6) & 7168) | 384);
    }

    /* JADX INFO: renamed from: P */
    public static final Object m4687P(Object[] objArr, dv3 dv3Var, wp1 wp1Var, mi0 mi0Var, int i) {
        Object objMo8112d;
        ir1 ir1Var = (ir1) mi0Var;
        long j = ir1Var.f21683T;
        y62.m12992v(36);
        String string = Long.toString(j, 36);
        lu3 lu3Var = (lu3) ir1Var.m6898k(ou3.f27125a);
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            Object objMo4749d = (lu3Var == null || (objMo8112d = lu3Var.mo8112d(string)) == null) ? null : dv3Var.mo4749d(objMo8112d);
            if (objMo4749d == null) {
                objMo4749d = wp1Var.invoke();
            }
            fu3 fu3Var = new fu3();
            fu3Var.f19321a = dv3Var;
            fu3Var.f19322b = lu3Var;
            fu3Var.f19323c = string;
            fu3Var.f19324d = objMo4749d;
            fu3Var.f19325e = objArr;
            g32 g32Var = new g32((byte) 17);
            g32Var.f19558b = fu3Var;
            VarHandle.storeStoreFence();
            fu3Var.f19327g = g32Var;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(fu3Var);
            objM6869O = fu3Var;
        }
        fu3 fu3Var2 = (fu3) objM6869O;
        Object objInvoke = Arrays.equals(objArr, fu3Var2.f19325e) ? fu3Var2.f19324d : null;
        if (objInvoke == null) {
            objInvoke = wp1Var.invoke();
        }
        byte b = 1;
        boolean zM6894i = ir1Var.m6894i(fu3Var2) | ((((i & 112) ^ 48) > 32 && ir1Var.m6894i(dv3Var)) || (i & 48) == 32) | ir1Var.m6894i(lu3Var) | ir1Var.m6890g(string) | ir1Var.m6894i(objInvoke) | ir1Var.m6894i(objArr);
        Object objM6869O2 = ir1Var.m6869O();
        Object obj = objM6869O2;
        if (zM6894i || objM6869O2 == i50Var) {
            ip1 ip1Var = new ip1(b);
            ip1Var.f21616c = fu3Var2;
            ip1Var.f21617d = dv3Var;
            ip1Var.f21618e = lu3Var;
            ip1Var.f21619f = string;
            ip1Var.f21615b = objInvoke;
            ip1Var.f21620g = objArr;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(ip1Var);
            obj = ip1Var;
        }
        lb5.m7914W(ir1Var, (wp1) obj);
        return objInvoke;
    }

    /* JADX INFO: renamed from: Q */
    public static final Object m4688Q(Object[] objArr, dv3 dv3Var, wp1 wp1Var, mi0 mi0Var, int i) {
        return m4687P(Arrays.copyOf(objArr, objArr.length), dv3Var, wp1Var, mi0Var, ((i << 3) & 7168) | 384);
    }

    /* JADX INFO: renamed from: R */
    public static final boolean m4689R(lw2 lw2Var, Object obj, Object obj2) {
        Object objM8132g = lw2Var.m8132g(obj);
        if (objM8132g == null) {
            return false;
        }
        if (!(objM8132g instanceof mw2)) {
            if (!objM8132g.equals(obj2)) {
                return false;
            }
            lw2Var.m8136k(obj);
            return true;
        }
        mw2 mw2Var = (mw2) objM8132g;
        boolean zM8420l = mw2Var.m8420l(obj2);
        if (zM8420l && mw2Var.m8415g()) {
            lw2Var.m8136k(obj);
        }
        return zM8420l;
    }

    /* JADX INFO: renamed from: S */
    public static final void m4690S(lw2 lw2Var, Object obj) {
        boolean zM8415g;
        long[] jArr = lw2Var.f24418a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = lw2Var.f24419b[i4];
                        Object obj3 = lw2Var.f24420c[i4];
                        if (obj3 instanceof mw2) {
                            mw2 mw2Var = (mw2) obj3;
                            mw2Var.m8420l(obj);
                            zM8415g = mw2Var.m8415g();
                        } else {
                            zM8415g = obj3 == obj;
                        }
                        if (zM8415g) {
                            lw2Var.m8137l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: T */
    public static final Object m4691T(File file, yp1 yp1Var, ym0 ym0Var) throws IOException {
        gf1 gf1Var;
        if (ym0Var instanceof gf1) {
            gf1Var = (gf1) ym0Var;
            int i = gf1Var.f19766v;
            if ((i & Integer.MIN_VALUE) != 0) {
                gf1Var.f19766v = i - Integer.MIN_VALUE;
            } else {
                gf1Var = new gf1(ym0Var);
            }
        } else {
            gf1Var = new gf1(ym0Var);
        }
        Object obj = gf1Var.f19765u;
        Object obj2 = ap0.f14763a;
        int i2 = gf1Var.f19766v;
        try {
            if (i2 == 0) {
                k43.m7376J(obj);
                gf1Var.f19764t = file;
                gf1Var.f19766v = 1;
                Object objInvoke = yp1Var.invoke(gf1Var);
                return objInvoke == obj2 ? obj2 : objInvoke;
            }
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            File file2 = gf1Var.f19764t;
            k43.m7376J(obj);
            return obj;
        } catch (IOException e) {
            if (e instanceof gp0) {
                throw new gp0("Corruption in file " + file, e);
            }
            if (!file.exists()) {
                throw n40.m8498g(file, e);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    if (file.canWrite()) {
                        throw n40.m8498g(file, e);
                    }
                    throw n40.m8498g(file, e);
                }
                if (file.canWrite()) {
                    throw n40.m8498g(file, e);
                }
                throw n40.m8498g(file, e);
            }
            if (file.canRead()) {
                if (file.canWrite()) {
                    throw n40.m8498g(file, e);
                }
                throw n40.m8498g(file, e);
            }
            if (file.canWrite()) {
                throw n40.m8498g(file, e);
            }
            throw n40.m8498g(file, e);
        }
    }

    /* JADX INFO: renamed from: U */
    public static final void m4692U(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255.0f));
    }

    /* JADX INFO: renamed from: V */
    public static final String m4693V(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = AbstractC0647fd.f18911a;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        return od4.m9037R(cArr2, i2, 8);
    }

    /* JADX INFO: renamed from: W */
    public static String m4694W(int i) {
        if (i == 0) {
            return "Unspecified";
        }
        if (i == 1) {
            return "Text";
        }
        if (i == 2) {
            return "Ascii";
        }
        if (i == 3) {
            return "Number";
        }
        if (i == 4) {
            return "Phone";
        }
        if (i == 5) {
            return "Uri";
        }
        if (i == 6) {
            return "Email";
        }
        if (i == 7) {
            return "Password";
        }
        if (i == 8) {
            return "NumberPassword";
        }
        if (i == 9) {
            return "Decimal";
        }
        if (i == 10) {
            return "PasswordVisible";
        }
        if (i == 11) {
            return "PostalAddress";
        }
        if (i == 12) {
            return "PersonName";
        }
        if (i == 13) {
            return "EmailSubject";
        }
        if (i == 14) {
            return "ShortMessage";
        }
        if (i == 15) {
            return "LongMessage";
        }
        if (i == 16) {
            return "Filter";
        }
        if (i == 17) {
            return "Phonetic";
        }
        if (i == 18) {
            return "DateTime";
        }
        if (i == 19) {
            return "Date";
        }
        if (i == 20) {
            return "Time";
        }
        if (i == 21) {
            return "NumberSigned";
        }
        if (i == 22) {
            return "DecimalSigned";
        }
        if (i == 23) {
            return "DecimalPassword";
        }
        if (i == 24) {
            return "NumberPasswordSigned";
        }
        return i == 25 ? "DecimalPasswordSigned" : "Invalid";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [yp1] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [mt2] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [mt2] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [uw2] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [uw2] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX INFO: renamed from: X */
    public static final void m4695X(px0 px0Var, Object obj, yp1 yp1Var) {
        C0940nb c0940nb;
        if (!((mt2) px0Var).f25195a.f25208n) {
            q32.m9721c("visitAncestors called on an unattached node");
        }
        mt2 mt2Var = ((mt2) px0Var).f25195a.f25199e;
        wf2 wf2VarM10652X = sc6.m10652X(px0Var);
        while (wf2VarM10652X != null) {
            if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 262144) != 0) {
                while (mt2Var != null) {
                    if ((mt2Var.f25197c & 262144) != 0) {
                        ?? M10644P = mt2Var;
                        ?? uw2Var = 0;
                        while (M10644P != 0) {
                            if (M10644P instanceof pp4) {
                                pp4 pp4Var = (pp4) M10644P;
                                if (!(obj.equals(pp4Var.mo3663w()) ? ((Boolean) yp1Var.invoke(pp4Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((M10644P.f25197c & 262144) != 0 && (M10644P instanceof qx0)) {
                                mt2 mt2Var2 = ((qx0) M10644P).f28863p;
                                int i = 0;
                                while (mt2Var2 != null) {
                                    if ((mt2Var2.f25197c & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            M10644P = M10644P;
                                            uw2Var = uw2Var;
                                            uw2Var = uw2Var;
                                            M10644P = mt2Var2;
                                        } else {
                                            if (uw2Var == 0) {
                                                uw2Var = new uw2(new mt2[16]);
                                            }
                                            if (M10644P != 0) {
                                                uw2Var.m11663b(M10644P);
                                                M10644P = 0;
                                            }
                                            uw2Var.m11663b(mt2Var2);
                                        }
                                    } else {
                                        M10644P = M10644P;
                                        uw2Var = uw2Var;
                                    }
                                    mt2Var2 = mt2Var2.f25200f;
                                    M10644P = M10644P;
                                    uw2Var = uw2Var;
                                }
                                if (i == 1) {
                                    M10644P = M10644P;
                                    uw2Var = uw2Var;
                                } else {
                                    M10644P = M10644P;
                                    uw2Var = uw2Var;
                                }
                            }
                            M10644P = sc6.m10644P(uw2Var);
                        }
                    }
                    mt2Var = mt2Var.f25199e;
                }
            }
            wf2VarM10652X = wf2VarM10652X.m12295v();
            mt2Var = (wf2VarM10652X == null || (c0940nb = wf2VarM10652X.f33299G) == null) ? null : (vh4) c0940nb.f25609f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, pp4, px0] */
    /* JADX WARN: Type inference failed for: r11v0, types: [yp1] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [mt2] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [mt2] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [uw2] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [uw2] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX INFO: renamed from: Y */
    public static final void m4696Y(pp4 pp4Var, yp1 yp1Var) {
        C0940nb c0940nb;
        mt2 mt2Var = (mt2) pp4Var;
        if (!mt2Var.f25195a.f25208n) {
            q32.m9721c("visitAncestors called on an unattached node");
        }
        mt2 mt2Var2 = mt2Var.f25195a.f25199e;
        wf2 wf2VarM10652X = sc6.m10652X(pp4Var);
        while (wf2VarM10652X != null) {
            if ((((mt2) wf2VarM10652X.f33299G.f25610g).f25198d & 262144) != 0) {
                while (mt2Var2 != null) {
                    if ((mt2Var2.f25197c & 262144) != 0) {
                        ?? M10644P = mt2Var2;
                        ?? uw2Var = 0;
                        while (M10644P != 0) {
                            boolean zBooleanValue = true;
                            if (M10644P instanceof pp4) {
                                pp4 pp4Var2 = (pp4) M10644P;
                                if (z62.m13387o(pp4Var.mo3663w(), pp4Var2.mo3663w()) && pp4Var.getClass() == pp4Var2.getClass()) {
                                    zBooleanValue = ((Boolean) yp1Var.invoke(pp4Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else if ((M10644P.f25197c & 262144) != 0 && (M10644P instanceof qx0)) {
                                mt2 mt2Var3 = ((qx0) M10644P).f28863p;
                                int i = 0;
                                while (mt2Var3 != null) {
                                    if ((mt2Var3.f25197c & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            M10644P = M10644P;
                                            uw2Var = uw2Var;
                                            uw2Var = uw2Var;
                                            M10644P = mt2Var3;
                                        } else {
                                            if (uw2Var == 0) {
                                                uw2Var = new uw2(new mt2[16]);
                                            }
                                            if (M10644P != 0) {
                                                uw2Var.m11663b(M10644P);
                                                M10644P = 0;
                                            }
                                            uw2Var.m11663b(mt2Var3);
                                        }
                                    } else {
                                        M10644P = M10644P;
                                        uw2Var = uw2Var;
                                    }
                                    mt2Var3 = mt2Var3.f25200f;
                                    M10644P = M10644P;
                                    uw2Var = uw2Var;
                                }
                                if (i == 1) {
                                    M10644P = M10644P;
                                    uw2Var = uw2Var;
                                } else {
                                    M10644P = M10644P;
                                    uw2Var = uw2Var;
                                }
                            }
                            M10644P = sc6.m10644P(uw2Var);
                        }
                    }
                    mt2Var2 = mt2Var2.f25199e;
                }
            }
            wf2VarM10652X = wf2VarM10652X.m12295v();
            mt2Var2 = (wf2VarM10652X == null || (c0940nb = wf2VarM10652X.f33299G) == null) ? null : (vh4) c0940nb.f25609f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [yp1] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [mt2] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [mt2] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [uw2] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [uw2] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX INFO: renamed from: Z */
    public static final void m4697Z(mt2 mt2Var, String str, yp1 yp1Var) {
        if (!mt2Var.f25195a.f25208n) {
            q32.m9721c("visitSubtreeIf called on an unattached node");
        }
        uw2 uw2Var = new uw2(new mt2[16]);
        mt2 mt2Var2 = mt2Var.f25195a;
        mt2 mt2Var3 = mt2Var2.f25200f;
        if (mt2Var3 == null) {
            sc6.m10663e(uw2Var, mt2Var2);
        } else {
            uw2Var.m11663b(mt2Var3);
        }
        while (true) {
            int i = uw2Var.f32213c;
            if (i == 0) {
                return;
            }
            mt2 mt2Var4 = (mt2) uw2Var.m11672l(i - 1);
            if ((mt2Var4.f25198d & 262144) != 0) {
                mt2 mt2Var5 = mt2Var4;
                while (true) {
                    if (mt2Var5 != null && mt2Var5.f25208n) {
                        if ((mt2Var5.f25197c & 262144) != 0) {
                            ?? M10644P = mt2Var5;
                            ?? uw2Var2 = 0;
                            while (M10644P != 0) {
                                if (M10644P instanceof pp4) {
                                    pp4 pp4Var = (pp4) M10644P;
                                    op4 op4Var = str.equals(pp4Var.mo3663w()) ? (op4) yp1Var.invoke(pp4Var) : op4.f26938a;
                                    if (op4Var != op4.f26940c) {
                                        if (op4Var == op4.f26939b) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((M10644P.f25197c & 262144) != 0 && (M10644P instanceof qx0)) {
                                    mt2 mt2Var6 = ((qx0) M10644P).f28863p;
                                    int i2 = 0;
                                    M10644P = M10644P;
                                    uw2Var2 = uw2Var2;
                                    while (mt2Var6 != null) {
                                        if ((mt2Var6.f25197c & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                uw2Var2 = uw2Var2;
                                                M10644P = mt2Var6;
                                            } else {
                                                if (uw2Var2 == 0) {
                                                    uw2Var2 = new uw2(new mt2[16]);
                                                }
                                                if (M10644P != 0) {
                                                    uw2Var2.m11663b(M10644P);
                                                    M10644P = 0;
                                                }
                                                uw2Var2.m11663b(mt2Var6);
                                            }
                                        }
                                        mt2Var6 = mt2Var6.f25200f;
                                        M10644P = M10644P;
                                        uw2Var2 = uw2Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M10644P = sc6.m10644P(uw2Var2);
                            }
                        }
                        mt2Var5 = mt2Var5.f25200f;
                    }
                }
            }
            sc6.m10663e(uw2Var, mt2Var4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, pp4] */
    /* JADX WARN: Type inference failed for: r13v0, types: [yp1] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [mt2] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [mt2] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [uw2] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [uw2] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: a0 */
    public static final void m4698a0(pp4 pp4Var, yp1 yp1Var) {
        if (!((mt2) pp4Var).f25195a.f25208n) {
            q32.m9721c("visitSubtreeIf called on an unattached node");
        }
        uw2 uw2Var = new uw2(new mt2[16]);
        mt2 mt2Var = ((mt2) pp4Var).f25195a;
        mt2 mt2Var2 = mt2Var.f25200f;
        if (mt2Var2 == null) {
            sc6.m10663e(uw2Var, mt2Var);
        } else {
            uw2Var.m11663b(mt2Var2);
        }
        while (true) {
            int i = uw2Var.f32213c;
            if (i == 0) {
                return;
            }
            mt2 mt2Var3 = (mt2) uw2Var.m11672l(i - 1);
            if ((mt2Var3.f25198d & 262144) != 0) {
                mt2 mt2Var4 = mt2Var3;
                while (true) {
                    if (mt2Var4 != null && mt2Var4.f25208n) {
                        if ((mt2Var4.f25197c & 262144) != 0) {
                            ?? M10644P = mt2Var4;
                            ?? uw2Var2 = 0;
                            while (M10644P != 0) {
                                if (M10644P instanceof pp4) {
                                    pp4 pp4Var2 = (pp4) M10644P;
                                    op4 op4Var = (z62.m13387o(pp4Var.mo3663w(), pp4Var2.mo3663w()) && pp4Var.getClass() == pp4Var2.getClass()) ? (op4) yp1Var.invoke(pp4Var2) : op4.f26938a;
                                    if (op4Var != op4.f26940c) {
                                        if (op4Var == op4.f26939b) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((M10644P.f25197c & 262144) != 0 && (M10644P instanceof qx0)) {
                                    mt2 mt2Var5 = ((qx0) M10644P).f28863p;
                                    int i2 = 0;
                                    M10644P = M10644P;
                                    uw2Var2 = uw2Var2;
                                    while (mt2Var5 != null) {
                                        if ((mt2Var5.f25197c & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                uw2Var2 = uw2Var2;
                                                M10644P = mt2Var5;
                                            } else {
                                                if (uw2Var2 == 0) {
                                                    uw2Var2 = new uw2(new mt2[16]);
                                                }
                                                if (M10644P != 0) {
                                                    uw2Var2.m11663b(M10644P);
                                                    M10644P = 0;
                                                }
                                                uw2Var2.m11663b(mt2Var5);
                                            }
                                        }
                                        mt2Var5 = mt2Var5.f25200f;
                                        M10644P = M10644P;
                                        uw2Var2 = uw2Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                M10644P = sc6.m10644P(uw2Var2);
                            }
                        }
                        mt2Var4 = mt2Var4.f25200f;
                    }
                }
            }
            sc6.m10663e(uw2Var, mt2Var3);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m4699b0(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbM13624x = zi4.m13624x("OffsetMapping.originalToTransformed returned invalid mapping: ", i3, " -> ", i, " is not in range of transformed text [0, ");
        sbM13624x.append(i2);
        sbM13624x.append("]");
        t32.m10970c(sbM13624x.toString());
    }

    /* JADX INFO: renamed from: c */
    public static C0910mi m4700c(float f) {
        return new C0910mi(Float.valueOf(f), sw4.f30612a, Float.valueOf(0.01f), 8);
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m4701c0(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbM13624x = zi4.m13624x("OffsetMapping.transformedToOriginal returned invalid mapping: ", i3, " -> ", i, " is not in range of original text [0, ");
        sbM13624x.append(i2);
        sbM13624x.append("]");
        t32.m10970c(sbM13624x.toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d0 */
    public static final Object m4702d0(ro0 ro0Var, Object obj, Object obj2, mq1 mq1Var, wm0 wm0Var) throws Throwable {
        f80 f80Var;
        Object objM4555b;
        Object objInvoke;
        if (wm0Var instanceof f80) {
            f80Var = (f80) wm0Var;
            int i = f80Var.f18833y;
            if ((i & Integer.MIN_VALUE) != 0) {
                f80Var.f18833y = i - Integer.MIN_VALUE;
            } else {
                f80Var = new f80(wm0Var);
            }
        } else {
            f80Var = new f80(wm0Var);
        }
        Object obj3 = f80Var.f18832x;
        Object obj4 = ap0.f14763a;
        int i2 = f80Var.f18833y;
        if (i2 != 0) {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj5 = f80Var.f18831w;
            ro0 ro0Var2 = f80Var.f18830v;
            ro0 ro0Var3 = f80Var.f18828t;
            try {
                k43.m7376J(obj3);
                objM4555b = obj5;
                ro0Var = ro0Var2;
                dm4.m4554a(ro0Var, objM4555b);
                return obj3;
            } catch (Throwable th) {
                objM4555b = obj5;
                ro0Var = ro0Var2;
                th = th;
                dm4.m4554a(ro0Var, objM4555b);
                throw th;
            }
        }
        k43.m7376J(obj3);
        objM4555b = dm4.m4555b(ro0Var, obj2);
        try {
            f80Var.f18828t = ro0Var;
            f80Var.f18829u = obj;
            f80Var.f18830v = ro0Var;
            f80Var.f18831w = objM4555b;
            f80Var.f18833y = 1;
            kb4 kb4Var = new kb4();
            kb4Var.f23057a = f80Var;
            kb4Var.f23058b = ro0Var;
            VarHandle.storeStoreFence();
            if (mq1Var == null) {
                objInvoke = C0006a5.m62R(mq1Var, obj, kb4Var);
            } else {
                as4.m3259r(2, mq1Var);
                objInvoke = mq1Var.invoke(obj, kb4Var);
            }
            obj3 = objInvoke;
            if (obj3 == obj4) {
                return obj4;
            }
            dm4.m4554a(ro0Var, objM4555b);
            return obj3;
        } catch (Throwable th2) {
            th = th2;
            dm4.m4554a(ro0Var, objM4555b);
            throw th;
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static final int m4703e0(float f, float[] fArr, int i) {
        float f2 = f >= 0.0f ? f : 0.0f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    /* JADX INFO: renamed from: f */
    public static final long m4704f(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: g */
    public static final void m4705g(C1297wl c1297wl, nt2 nt2Var, boolean z, p44 p44Var, c02 c02Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(947208840);
        int i3 = (ir1Var.m6894i(c1297wl) ? 4 : 2) | i | (ir1Var.m6890g(nt2Var) ? 32 : 16) | 1408 | (ir1Var.m6890g(c02Var) ? 16384 : 8192) | 196608;
        byte b = 0;
        if (ir1Var.m6871T(i3 & 1, (599187 & i3) != 599186)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                p44Var = t44.m10977a(6, ir1Var);
                i2 = i3 & (-7169);
                z = true;
            } else {
                ir1Var.m6874W();
                i2 = i3 & (-7169);
            }
            ir1Var.m6913s();
            m4709k(c1297wl, nt2Var, z, p44Var, c02Var, ir1Var, (i2 & 57344) | (i2 & 14) | 196608 | (i2 & 112) | 384 | 14155776);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            d02 d02Var = new d02(b);
            d02Var.f16683d = c1297wl;
            d02Var.f16681b = nt2Var;
            d02Var.f16682c = z;
            d02Var.f16684e = p44Var;
            d02Var.f16685f = c02Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = d02Var;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m4706h(boolean z, yp1 yp1Var, nt2 nt2Var, boolean z2, p44 p44Var, m02 m02Var, pg0 pg0Var, mi0 mi0Var, int i) {
        boolean z3;
        p44 p44Var2;
        m02 m02Var2;
        int i2;
        boolean z4 = z;
        yp1 yp1Var2 = yp1Var;
        nt2 nt2Var2 = nt2Var;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-713829427);
        int i3 = i | (ir1Var.m6892h(z4) ? 4 : 2) | (ir1Var.m6894i(yp1Var2) ? 32 : 16) | (ir1Var.m6890g(nt2Var2) ? 256 : 128) | 1649664;
        if (ir1Var.m6871T(i3 & 1, (4793491 & i3) != 4793490)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                p44 p44VarM10977a = t44.m10977a(6, ir1Var);
                dc0 dc0Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24277a;
                m02 m02Var3 = dc0Var.f16943b0;
                if (m02Var3 == null) {
                    long jM6744d = ic0.m6744d(dc0Var, 36);
                    long jM6744d2 = ic0.m6744d(dc0Var, 18);
                    long jM9464c = pb0.m9464c(ic0.m6744d(dc0Var, 17), 0.1f, 0.0f, 0.0f, 0.0f, 14);
                    long jM9464c2 = pb0.m9464c(ic0.m6744d(dc0Var, 17), 0.38f, 0.0f, 0.0f, 0.0f, 14);
                    long jM6744d3 = ic0.m6744d(dc0Var, 25);
                    long jM6744d4 = ic0.m6744d(dc0Var, 9);
                    m02Var3 = new m02();
                    m02Var3.f24511a = jM6744d;
                    m02Var3.f24512b = jM6744d2;
                    m02Var3.f24513c = jM9464c;
                    m02Var3.f24514d = jM9464c2;
                    m02Var3.f24515e = jM6744d3;
                    m02Var3.f24516f = jM6744d4;
                    VarHandle.storeStoreFence();
                    dc0Var.f16943b0 = m02Var3;
                }
                i2 = i3 & (-516097);
                p44Var2 = p44VarM10977a;
                m02Var2 = m02Var3;
                z3 = true;
            } else {
                ir1Var.m6874W();
                i2 = i3 & (-516097);
                z3 = z2;
                p44Var2 = p44Var;
                m02Var2 = m02Var;
            }
            ir1Var.m6913s();
            Object objM6869O = ir1Var.m6869O();
            if (objM6869O == ki0.f23136a) {
                objM6869O = new el1((byte) 6);
                ir1Var.m6905n0(objM6869O);
            }
            nt2Var2 = nt2Var;
            yp1Var2 = yp1Var;
            z4 = z;
            m4710l(z4, yp1Var2, f14.m5458a(nt2Var2, false, (yp1) objM6869O), z3, p44Var2, m02Var2, pg0Var, ir1Var, (i2 & 14) | 1572864 | (i2 & 112) | 113249280);
        } else {
            ir1Var.m6874W();
            z3 = z2;
            p44Var2 = p44Var;
            m02Var2 = m02Var;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            g02 g02Var = new g02();
            g02Var.f19459a = z4;
            g02Var.f19460b = yp1Var2;
            g02Var.f19461c = nt2Var2;
            g02Var.f19462d = z3;
            g02Var.f19463e = p44Var2;
            g02Var.f19464f = m02Var2;
            g02Var.f19465g = pg0Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = g02Var;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m4707i(int i, pg0 pg0Var, mi0 mi0Var, wp1 wp1Var, c02 c02Var, nt2 nt2Var, p44 p44Var, boolean z) {
        c02 c02Var2;
        nt2 nt2Var2;
        p44 p44VarM10977a;
        boolean z2;
        long j;
        c02 c02VarM3782a;
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1413012038);
        int i3 = i | (ir1Var.m6894i(wp1Var) ? 4 : 2) | 91568;
        byte b = 0;
        if (ir1Var.m6871T(i3 & 1, (599187 & i3) != 599186)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                long j2 = ((pb0) ir1Var.m6898k(zl0.f36166a)).f27503a;
                dc0 dc0Var = ((lq2) ir1Var.m6898k(pq2.f27894b)).f24277a;
                c02 c02Var3 = dc0Var.f16939Z;
                if (c02Var3 == null) {
                    long j3 = pb0.f27500g;
                    j = j2;
                    c02Var3 = new c02(j3, j, j3, pb0.m9464c(j2, 0.38f, 0.0f, 0.0f, 0.0f, 14));
                    dc0Var.f16939Z = c02Var3;
                } else {
                    j = j2;
                }
                if (ws4.m12408a(c02Var3.f15733b, j)) {
                    c02VarM3782a = c02Var3;
                } else {
                    long j4 = j;
                    c02VarM3782a = c02Var3.m3782a(c02Var3.f15732a, j4, c02Var3.f15734c, pb0.m9464c(j4, 0.38f, 0.0f, 0.0f, 0.0f, 14));
                }
                p44VarM10977a = t44.m10977a(6, ir1Var);
                i2 = i3 & (-465921);
                z2 = true;
                nt2Var2 = kt2.f23428a;
                c02Var2 = c02VarM3782a;
            } else {
                ir1Var.m6874W();
                i2 = i3 & (-465921);
                c02Var2 = c02Var;
                nt2Var2 = nt2Var;
                p44VarM10977a = p44Var;
                z2 = z;
            }
            ir1Var.m6913s();
            m4708j(((i2 << 3) & 112) | 1769862, pg0Var, ir1Var, wp1Var, c02Var2, nt2Var2, p44VarM10977a, z2);
        } else {
            ir1Var.m6874W();
            c02Var2 = c02Var;
            nt2Var2 = nt2Var;
            p44VarM10977a = p44Var;
            z2 = z;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            f02 f02Var = new f02(b);
            f02Var.f18631b = wp1Var;
            f02Var.f18634e = nt2Var2;
            f02Var.f18632c = z2;
            f02Var.f18635f = c02Var2;
            f02Var.f18636g = p44VarM10977a;
            f02Var.f18633d = pg0Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = f02Var;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m4708j(int i, pg0 pg0Var, mi0 mi0Var, wp1 wp1Var, c02 c02Var, nt2 nt2Var, p44 p44Var, boolean z) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1134296466);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(nt2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(wp1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6892h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6890g(p44Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ir1Var.m6890g(c02Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ir1Var.m6890g(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (ir1Var.m6871T(i3 & 1, (599187 & i3) != 599186)) {
            ir1Var.m6885d0(976976045);
            Object objM6869O = ir1Var.m6869O();
            if (objM6869O == ki0.f23136a) {
                objM6869O = sj3.m10810f();
                ir1Var.m6905n0(objM6869O);
            }
            nv2 nv2Var = (nv2) objM6869O;
            ir1Var.m6912r(false);
            dx1 dx1Var = f62.f18784a;
            nt2 nt2VarMo7630d = nt2Var.mo7630d(gt2.f20114a);
            long jM4704f = m4704f(40.0f, 40.0f);
            vf1 vf1Var = n74.f25504a;
            nt2 nt2VarM3258q = as4.m3258q(i25.m6619m(n74.m8580h(nt2VarMo7630d, t11.m10960b(jM4704f), t11.m10959a(jM4704f)), p44Var), z ? c02Var.f15732a : c02Var.f15734c, p44Var);
            jq3 jq3VarM12729a = xp3.m12729a(p44Var, 247);
            lq3 lq3Var = new lq3();
            lq3Var.f24281a = (byte) 0;
            VarHandle.storeStoreFence();
            nt2 nt2VarM7387l = k43.m7387l(kx5.m7744y(nt2VarM3258q, nv2Var, jq3VarM12729a, z, lq3Var, wp1Var, 8));
            xq2 xq2VarM9704c = q20.m9704c(ig1.f21382f, false);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM7387l);
            bi0.f15310ap.getClass();
            if (ir1Var.f21685a == null) {
                m4682E();
                throw null;
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
            as4.m3244c(zl0.f36166a.mo7523a(pb0.m9462a(z ? c02Var.f15733b : c02Var.f15735d)), pg0Var, ir1Var, ((i3 >> 15) & 112) | 8);
            ir1Var.m6912r(true);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1014oy c1014oy = new C1014oy((byte) 2);
            c1014oy.f27199d = nt2Var;
            c1014oy.f27200e = wp1Var;
            c1014oy.f27197b = z;
            c1014oy.f27201f = p44Var;
            c1014oy.f27202g = c02Var;
            c1014oy.f27203h = pg0Var;
            c1014oy.f27198c = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1014oy;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m4709k(C1297wl c1297wl, nt2 nt2Var, boolean z, p44 p44Var, c02 c02Var, mi0 mi0Var, int i) {
        int i2;
        pg0 pg0Var = i25.f21080e;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-171935091);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6894i(c1297wl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(nt2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6892h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6890g(p44Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ir1Var.m6890g(c02Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ir1Var.m6890g(null) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ir1Var.m6890g(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 8388608 : 4194304;
        }
        byte b = 1;
        if (ir1Var.m6871T(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objM6869O = ir1Var.m6869O();
            if (objM6869O == ki0.f23136a) {
                objM6869O = new el1((byte) 5);
                ir1Var.m6905n0(objM6869O);
            }
            nt2 nt2VarM5458a = f14.m5458a(nt2Var, false, (yp1) objM6869O);
            long j = z ? c02Var.f15732a : c02Var.f15734c;
            long j2 = z ? c02Var.f15733b : c02Var.f15735d;
            sg0 sg0Var = new sg0(b);
            VarHandle.storeStoreFence();
            pg0 pg0VarM11834R = vd6.m11834R(669231714, sg0Var, ir1Var);
            int i3 = i2 & 8078;
            int i4 = i2 << 9;
            kf4.m7512b(c1297wl, nt2VarM5458a, z, p44Var, j, j2, 0.0f, 0.0f, null, null, pg0VarM11834R, ir1Var, (i4 & 1879048192) | i3 | (i4 & 234881024), 192);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            e02 e02Var = new e02((byte) 0);
            e02Var.f17559d = c1297wl;
            e02Var.f17560e = nt2Var;
            e02Var.f17557b = z;
            e02Var.f17561f = p44Var;
            e02Var.f17562g = c02Var;
            e02Var.f17558c = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = e02Var;
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m4710l(boolean z, yp1 yp1Var, nt2 nt2Var, boolean z2, p44 p44Var, m02 m02Var, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        long j;
        long j2;
        long j3;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1118363928);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6892h(z) ? 4 : 2) | i;
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
            i2 |= ir1Var.m6892h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ir1Var.m6890g(p44Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ir1Var.m6890g(m02Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ir1Var.m6890g(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= ir1Var.m6890g(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 67108864 : 33554432;
        }
        if (ir1Var.m6871T(i2 & 1, (38347923 & i2) != 38347922)) {
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                objM6869O = new el1((byte) 7);
                ir1Var.m6905n0(objM6869O);
            }
            nt2 nt2VarM5458a = f14.m5458a(nt2Var, false, (yp1) objM6869O);
            if (z2) {
                j = !z ? m02Var.f24511a : m02Var.f24515e;
            } else {
                j = m02Var.f24513c;
            }
            long j4 = ((pb0) k43.m7369C(pb0.m9462a(j), ir1Var).getValue()).f27503a;
            if (z2) {
                j2 = j4;
                j3 = !z ? m02Var.f24512b : m02Var.f24516f;
            } else {
                j2 = j4;
                j3 = m02Var.f24514d;
            }
            long j5 = ((pb0) k43.m7369C(pb0.m9462a(j3), ir1Var).getValue()).f27503a;
            h02 h02Var = new h02((byte) 0);
            h02Var.f20244b = pg0Var;
            VarHandle.storeStoreFence();
            pg0 pg0VarM11834R = vd6.m11834R(1492028158, h02Var, ir1Var);
            kj0 kj0Var = kf4.f23100a;
            ir1Var.m6885d0(643383721);
            Object objM6869O2 = ir1Var.m6869O();
            if (objM6869O2 == i50Var) {
                objM6869O2 = sj3.m10810f();
                ir1Var.m6905n0(objM6869O2);
            }
            ir1Var.m6912r(false);
            kj0 kj0Var2 = kf4.f23100a;
            float f = ((p11) ir1Var.m6898k(kj0Var2)).f27285a + 0.0f;
            zh3[] zh3VarArr = {zl0.f36166a.mo7523a(pb0.m9462a(j5)), kj0Var2.mo7523a(p11.m9350a(f))};
            jf4 jf4Var = new jf4();
            jf4Var.f22210a = nt2VarM5458a;
            jf4Var.f22211b = (nv2) objM6869O2;
            jf4Var.f22212c = p44Var;
            jf4Var.f22213d = j2;
            jf4Var.f22214e = f;
            jf4Var.f22215f = z;
            jf4Var.f22216g = z2;
            jf4Var.f22217h = yp1Var;
            jf4Var.f22218i = pg0VarM11834R;
            VarHandle.storeStoreFence();
            as4.m3245d(zh3VarArr, vd6.m11834R(-1839065134, jf4Var, ir1Var), ir1Var, 48);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            i02 i02Var = new i02((byte) 0);
            i02Var.f20973b = z;
            i02Var.f20976e = yp1Var;
            i02Var.f20977f = nt2Var;
            i02Var.f20974c = z2;
            i02Var.f20978g = p44Var;
            i02Var.f20979h = m02Var;
            i02Var.f20980i = pg0Var;
            i02Var.f20975d = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = i02Var;
        }
    }

    /* JADX INFO: renamed from: m */
    public static jw2 m4711m(Class cls, String str, String str2) {
        jw2 jw2Var = new jw2(cls, str, str2, 0);
        rl3.f29396a.getClass();
        return jw2Var;
    }

    /* JADX INFO: renamed from: n */
    public static fy3 m4712n() {
        return new fy3(new e33(), new aq1(), new d63(), new C0217lc());
    }

    /* JADX INFO: renamed from: o */
    public static final void m4713o(lw2 lw2Var, Object obj, Object obj2) {
        int iM8131f = lw2Var.m8131f(obj);
        boolean z = iM8131f < 0;
        Object obj3 = z ? null : lw2Var.f24420c[iM8131f];
        if (obj3 != null) {
            if (obj3 instanceof mw2) {
                ((mw2) obj3).m8409a(obj2);
            } else if (obj3 != obj2) {
                mw2 mw2Var = new mw2();
                mw2Var.m8409a(obj3);
                mw2Var.m8409a(obj2);
                obj2 = mw2Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            lw2Var.f24420c[iM8131f] = obj2;
            return;
        }
        int i = ~iM8131f;
        lw2Var.f24419b[i] = obj;
        lw2Var.f24420c[i] = obj2;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m4714p(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static String m4715q(int i, String str, int i2) {
        if (i < 0) {
            return sc6.m10639K("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return sc6.m10639K("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        C1077qn.m9987m(c75.m3877i(i2, "negative size: "));
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static void m4716r(boolean z) {
        if (z) {
            return;
        }
        ds3.m4665g();
    }

    /* JADX INFO: renamed from: s */
    public static void m4717s(int i, int i2) {
        String strM10639K;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM10639K = sc6.m10639K("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    C1077qn.m9987m(c75.m3877i(i2, "negative size: "));
                    return;
                }
                strM10639K = sc6.m10639K("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM10639K);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m4718t(Object obj, String str) {
        if (obj != null) {
            return;
        }
        xy4.m12782k(str);
    }

    /* JADX INFO: renamed from: u */
    public static final void m4719u(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m4720v(int i, int i2) {
        if (i < 0 || i > i2) {
            xy4.m12792u(m4715q(i, "index", i2));
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m4721w(int i, int i2, int i3) {
        String strM4715q;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM4715q = m4715q(i, "start index", i3);
            } else {
                strM4715q = (i2 < 0 || i2 > i3) ? m4715q(i2, "end index", i3) : sc6.m10639K("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM4715q);
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m4722x(String str, boolean z) {
        if (z) {
            return;
        }
        C1077qn.m9989o(str);
    }

    /* JADX INFO: renamed from: y */
    public static lw2 m4723y() {
        long[] jArr = tv3.f31472a;
        return new lw2();
    }

    /* JADX INFO: renamed from: z */
    public static final void m4724z(u31 u31Var, bu1 bu1Var) {
        Canvas canvas;
        float f;
        float f2;
        Canvas canvas2;
        h70 h70VarM7248w = u31Var.mo7035J().m7248w();
        bu1 bu1Var2 = (bu1) u31Var.mo7035J().f22482c;
        fu1 fu1Var = bu1Var.f15608a;
        fu1 fu1Var2 = bu1Var.f15608a;
        RenderNode renderNode = fu1Var.f19296c;
        if (bu1Var.f15626s) {
            return;
        }
        long j = bu1Var.f15615h;
        Canvas canvas3 = AbstractC1362yb.f35080a;
        Canvas canvas4 = ((C1325xb) h70VarM7248w).f34122a;
        boolean zIsHardwareAccelerated = canvas4.isHardwareAccelerated();
        if (zIsHardwareAccelerated) {
            canvas = canvas4;
        } else {
            long j2 = bu1Var.f15627t;
            float f3 = (int) (j2 >> 32);
            float f4 = f3 - bu1Var.f15629v;
            float f5 = (int) (j2 & 4294967295L);
            float f6 = f5 - bu1Var.f15630w;
            long j3 = bu1Var.f15628u;
            float f7 = f3 + ((int) (j3 >> 32)) + bu1Var.f15631x;
            float f8 = f5 + ((int) (j3 & 4294967295L)) + bu1Var.f15632y;
            float f9 = fu1Var2.f19301h;
            byte b = fu1Var.f19302i;
            if (f9 < 1.0f || b != 3 || fu1Var.f19293C == 1) {
                C1253ve c1253veM3810e = bu1Var.f15623p;
                if (c1253veM3810e == null) {
                    c1253veM3810e = c20.m3810e();
                    bu1Var.f15623p = c1253veM3810e;
                }
                c1253veM3810e.m11879i(f9);
                c1253veM3810e.m11880j(b);
                c1253veM3810e.m11882l(null);
                Paint paint = (Paint) c1253veM3810e.f32549b;
                f = f6;
                f2 = f4;
                canvas2 = canvas4;
                canvas2.saveLayer(f2, f, f7, f8, paint);
            } else {
                canvas4.save();
                f = f6;
                f2 = f4;
                canvas2 = canvas4;
            }
            canvas2.translate(f2, f);
            Matrix matrix = fu1Var.f19299f;
            if (matrix == null) {
                matrix = new Matrix();
                fu1Var.f19299f = matrix;
            }
            renderNode.getMatrix(matrix);
            matrix.preTranslate(bu1Var.f15629v, bu1Var.f15630w);
            canvas2.concat(matrix);
            canvas = canvas2;
            bu1Var.f15615h = b33.m3429g(bu1Var.f15615h, (((long) Float.floatToRawIntBits(bu1Var.f15630w)) & 4294967295L) | (((long) Float.floatToRawIntBits(bu1Var.f15629v)) << 32));
        }
        bu1Var.m3684a();
        if (!renderNode.hasDisplayList()) {
            try {
                bu1Var.m3688e();
            } catch (Throwable unused) {
            }
        }
        float f10 = fu1Var2.f19308o;
        boolean z = false;
        boolean z2 = f10 > 0.0f;
        if (z2) {
            h70VarM7248w.mo6261r();
        }
        boolean z3 = zIsHardwareAccelerated == 0 && bu1Var.f15606A;
        if (z3) {
            h70VarM7248w.mo6253j();
            lb5 lb5VarM3687d = bu1Var.m3687d();
            if (lb5VarM3687d instanceof h63) {
                h70.m6244i(h70VarM7248w, ((h63) lb5VarM3687d).f20408o);
            } else if (lb5VarM3687d instanceof i63) {
                C0489bf c0489bfM4495a = bu1Var.f15620m;
                if (c0489bfM4495a != null) {
                    c0489bfM4495a.m3565h();
                } else {
                    c0489bfM4495a = AbstractC0573df.m4495a();
                    bu1Var.f15620m = c0489bfM4495a;
                }
                C0489bf.m3559b(c0489bfM4495a, ((i63) lb5VarM3687d).f21139o);
                h70VarM7248w.mo6262s(c0489bfM4495a);
            } else {
                if (!(lb5VarM3687d instanceof g63)) {
                    C0670g.m5864c();
                    return;
                }
                h70VarM7248w.mo6262s(((g63) lb5VarM3687d).f19622o);
            }
        }
        if (bu1Var2 != null) {
            g90 g90Var = bu1Var2.f15625r;
            if (!g90Var.f19661a) {
                p32.m9361a("Only add dependencies during a tracking");
            }
            mw2 mw2Var = (mw2) g90Var.f19664d;
            if (mw2Var != null) {
                mw2Var.m8409a(bu1Var);
            } else if (((bu1) g90Var.f19662b) != null) {
                mw2 mw2Var2 = uv3.f32207a;
                mw2 mw2Var3 = new mw2();
                mw2Var3.m8409a((bu1) g90Var.f19662b);
                mw2Var3.m8409a(bu1Var);
                g90Var.f19664d = mw2Var3;
                g90Var.f19662b = null;
            } else {
                g90Var.f19662b = bu1Var;
            }
            mw2 mw2Var4 = (mw2) g90Var.f19665e;
            if (mw2Var4 != null) {
                z = !mw2Var4.m8420l(bu1Var);
            } else if (((bu1) g90Var.f19663c) != bu1Var) {
                z = true;
            } else {
                g90Var.f19663c = null;
            }
            if (z) {
                bu1Var.f15624q++;
            }
        }
        C1325xb c1325xb = (C1325xb) h70VarM7248w;
        if (c1325xb.f34122a.isHardwareAccelerated()) {
            Canvas canvas5 = AbstractC1362yb.f35080a;
            c1325xb.f34122a.drawRenderNode(renderNode);
        } else {
            j70 j70Var = bu1Var.f15622o;
            if (j70Var == null) {
                j70Var = new j70();
                bu1Var.f15622o = j70Var;
            }
            jp0 jp0Var = j70Var.f22064b;
            ky0 ky0Var = bu1Var.f15609b;
            df2 df2Var = bu1Var.f15610c;
            long jM13369a0 = z62.m13369a0(bu1Var.f15628u);
            ky0 ky0VarM7250y = jp0Var.m7250y();
            df2 df2VarM7216B = jp0Var.m7216B();
            h70 h70VarM7248w2 = jp0Var.m7248w();
            long jM7219E = jp0Var.m7219E();
            bu1 bu1Var3 = (bu1) jp0Var.f22482c;
            jp0Var.m7227Q(ky0Var);
            jp0Var.m7229S(df2Var);
            jp0Var.m7226P(h70VarM7248w);
            jp0Var.m7230T(jM13369a0);
            jp0Var.f22482c = bu1Var;
            h70VarM7248w.mo6253j();
            try {
                bu1Var.m3686c(j70Var);
                h70VarM7248w.mo6251g();
                jp0Var.m7227Q(ky0VarM7250y);
                jp0Var.m7229S(df2VarM7216B);
                jp0Var.m7226P(h70VarM7248w2);
                jp0Var.m7230T(jM7219E);
                jp0Var.f22482c = bu1Var3;
            } catch (Throwable th) {
                h70VarM7248w.mo6251g();
                jp0Var.m7227Q(ky0VarM7250y);
                jp0Var.m7229S(df2VarM7216B);
                jp0Var.m7226P(h70VarM7248w2);
                jp0Var.m7230T(jM7219E);
                jp0Var.f22482c = bu1Var3;
                throw th;
            }
        }
        if (z3) {
            h70VarM7248w.mo6251g();
        }
        if (z2) {
            h70VarM7248w.mo6256m();
        }
        if (!zIsHardwareAccelerated) {
            canvas.restore();
        }
        bu1Var.f15615h = j;
    }

    /* JADX INFO: renamed from: C */
    public long mo4725C() {
        long jNextLong = ThreadLocalRandom.current().nextLong(-9223372036854775807L, 9223372036854775805L);
        return jNextLong >= -1 ? jNextLong + 2 : jNextLong;
    }

    /* JADX INFO: renamed from: F */
    public void mo4106F(nr0 nr0Var, long j, boolean z, boolean z2) {
    }

    /* JADX INFO: renamed from: I */
    public void mo4109I(long j, kr0 kr0Var, pr0 pr0Var, nr0 nr0Var) {
    }

    /* JADX INFO: renamed from: G */
    public void mo4107G(C1283w7 c1283w7) {
    }

    /* JADX INFO: renamed from: H */
    public void mo4108H(lr0 lr0Var) {
    }

    /* JADX INFO: renamed from: J */
    public void mo4110J(mr0 mr0Var) {
    }

    /* JADX INFO: renamed from: K */
    public void mo4111K(long j, or0 or0Var) {
    }
}
