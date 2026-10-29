package p000;

import ads_mobile_sdk.cy3;
import ads_mobile_sdk.jm2;
import ads_mobile_sdk.mx3;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.inputmethod.ExtractedText;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import org.chromium.net.C0995R;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class i20 {

    /* JADX INFO: renamed from: k */
    public static volatile Handler f21057k;

    /* JADX INFO: renamed from: m */
    public static g12 f21059m;

    /* JADX INFO: renamed from: a */
    public static final int[] f21047a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: b */
    public static final int[] f21048b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: c */
    public static final int[] f21049c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: d */
    public static final int[] f21050d = {R.attr.name, R.attr.pathData};

    /* JADX INFO: renamed from: e */
    public static final pg0 f21051e = new pg0(-1362077981, false, new qg0(23));

    /* JADX INFO: renamed from: f */
    public static final pg0 f21052f = new pg0(641200809, false, new jh0(4));

    /* JADX INFO: renamed from: g */
    public static final char[] f21053g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: h */
    public static final char[] f21054h = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: i */
    public static final StackTraceElement[] f21055i = new StackTraceElement[0];

    /* JADX INFO: renamed from: j */
    public static final Object f21056j = new Object();

    /* JADX INFO: renamed from: l */
    public static final z45 f21058l = new z45(26);

    /* JADX INFO: renamed from: A */
    public static final dc0 m6566A(ie1 ie1Var, ir1 ir1Var) {
        boolean zM6629y;
        m73 m73Var;
        dc0 dc0VarM13638b;
        ir1Var.m6885d0(288882042);
        pb0 pb0Var = ie1Var.f21283a;
        if (pb0Var == null) {
            ir1Var.m6885d0(-1029446559);
            dc0VarM13638b = AbstractC1410zm.m13639c(false, ir1Var, 1);
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6885d0(-1557229227);
            ir1Var.m6912r(false);
            long j = pb0Var.f27503a;
            long j2 = pb0.f27495b;
            boolean z = ws4.m12408a(j, j2) || ws4.m12408a(j, pb0.f27497d);
            if (z) {
                ir1Var.m6885d0(-1557223410);
                ir1Var.m6912r(false);
                zM6629y = ws4.m12408a(j, j2);
            } else {
                ir1Var.m6885d0(-1557222577);
                zM6629y = i25.m6629y(ir1Var);
                ir1Var.m6912r(false);
            }
            boolean zM12408a = ws4.m12408a(j, j2);
            pb0 pb0VarM9462a = z ? pb0.m9462a(j) : null;
            pb0 pb0VarM9462a2 = z ? null : pb0.m9462a(j);
            int iOrdinal = ie1Var.f21285c.ordinal();
            if (iOrdinal == 0) {
                m73Var = m73.f24710a;
            } else if (iOrdinal == 1) {
                m73Var = m73.f24711b;
            } else if (iOrdinal == 2) {
                m73Var = m73.f24712c;
            } else {
                if (iOrdinal != 3) {
                    C0670g.m5864c();
                    return null;
                }
                m73Var = m73.f24713d;
            }
            dc0VarM13638b = AbstractC1410zm.m13638b(zM6629y, zM12408a, pb0VarM9462a2, pb0VarM9462a, null, m73Var, ir1Var, 0, 100);
        }
        ir1Var.m6912r(false);
        return dc0VarM13638b;
    }

    /* JADX INFO: renamed from: B */
    public static final void m6567B(b70 b70Var, wm0 wm0Var, boolean z) {
        Object objM3496t = b70Var.m3496t();
        Throwable thMo3486e = b70Var.mo3486e(objM3496t);
        Object objM7389n = thMo3486e != null ? k43.m7389n(thMo3486e) : b70Var.mo3487f(objM3496t);
        if (!z) {
            wm0Var.resumeWith(objM7389n);
            return;
        }
        f01 f01Var = (f01) wm0Var;
        ym0 ym0Var = f01Var.f18627e;
        Object obj = f01Var.f18629g;
        ro0 context = ym0Var.getContext();
        Object objM4555b = dm4.m4555b(context, obj);
        zt4 zt4VarM3805J = objM4555b != dm4.f17189a ? c20.m3805J(ym0Var, context, objM4555b) : null;
        try {
            ym0Var.resumeWith(objM7389n);
        } finally {
            if (zt4VarM3805J == null || zt4VarM3805J.m13753l0()) {
                dm4.m4554a(context, objM4555b);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public static final wf4 m6568C(long j, Set set) {
        int i = (int) (j >> 32);
        wf4 wf4Var = Float.intBitsToFloat(i) < 0.0f ? wf4.f33339a : wf4.f33341c;
        int i2 = (int) (j & 4294967295L);
        wf4 wf4Var2 = Float.intBitsToFloat(i2) < 0.0f ? wf4.f33340b : wf4.f33342d;
        boolean z = Math.abs(Float.intBitsToFloat(i2)) >= Math.abs(Float.intBitsToFloat(i));
        wf4 wf4Var3 = z ? wf4Var2 : wf4Var;
        if (!z) {
            wf4Var = wf4Var2;
        }
        return (m6600y(wf4Var3, set) || !m6600y(wf4Var, set) || Math.abs(z ? Float.intBitsToFloat(i) : Float.intBitsToFloat(i2)) < Math.max(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2))) * 0.577f) ? wf4Var3 : wf4Var;
    }

    /* JADX INFO: renamed from: D */
    public static final long m6569D(String str, long j, long j2, long j3) {
        String property;
        int i = ph4.f27610a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lM9045Z = od4.m9045Z(property);
        if (lM9045Z == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lM9045Z.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX INFO: renamed from: E */
    public static int m6570E(int i, String str, int i2) {
        return (int) m6569D(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX INFO: renamed from: F */
    public static final ExtractedText m6571F(xk4 xk4Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = xk4Var.f34341a.f24092b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = xk4Var.f34342b;
        extractedText.selectionStart = ql4.m9903g(j);
        extractedText.selectionEnd = ql4.m9902f(j);
        extractedText.flags = !hd4.m6336b0(xk4Var.f34341a.f24092b, '\n') ? 1 : 0;
        return extractedText;
    }

    /* JADX INFO: renamed from: G */
    public static final zr1 m6572G(wf4 wf4Var, boolean z) {
        int iOrdinal = wf4Var.ordinal();
        if (iOrdinal == 0) {
            return z ? zr1.f36282b : zr1.f36281a;
        }
        if (iOrdinal == 1) {
            return z ? zr1.f36284d : zr1.f36283c;
        }
        if (iOrdinal == 2) {
            return z ? zr1.f36286f : zr1.f36285e;
        }
        if (iOrdinal == 3) {
            return z ? zr1.f36288h : zr1.f36287g;
        }
        C0670g.m5864c();
        return null;
    }

    /* JADX INFO: renamed from: H */
    public static final void m6573H(ec3 ec3Var, long j, yp1 yp1Var, boolean z) {
        MotionEvent motionEventM5080a = ec3Var.m5080a();
        if (motionEventM5080a == null) {
            C1077qn.m9987m("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEventM5080a.getAction();
        if (z) {
            motionEventM5080a.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEventM5080a.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        yp1Var.invoke(motionEventM5080a);
        motionEventM5080a.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEventM5080a.setAction(action);
    }

    /* JADX INFO: renamed from: I */
    public static final vv3 m6574I(mw2 mw2Var) {
        vv3 vv3Var = new vv3();
        vv3Var.f32888a = mw2Var;
        VarHandle.storeStoreFence();
        return vv3Var;
    }

    /* JADX INFO: renamed from: J */
    public static Handler m6575J() {
        if (f21057k == null) {
            Looper mainLooper = Looper.getMainLooper();
            synchronized (f21056j) {
                try {
                    if (f21057k == null) {
                        f21057k = new Handler(mainLooper);
                    } else if (f21057k.getLooper() != mainLooper) {
                        throw new RuntimeException("UI thread looper is already set to " + String.valueOf(f21057k.getLooper()) + " (Main thread looper is " + String.valueOf(Looper.getMainLooper()) + "), cannot set to new looper " + String.valueOf(mainLooper));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f21057k;
    }

    /* JADX INFO: renamed from: a */
    public static final void m6576a(dd3 dd3Var, pg0 pg0Var, co4 co4Var, nt2 nt2Var, pg0 pg0Var2, mi0 mi0Var, int i) {
        int i2;
        nt2 nt2Var2;
        ir1 ir1Var;
        sw2 sw2Var;
        ir1 ir1Var2;
        dd3 dd3Var2 = dd3Var;
        pg0 pg0Var3 = pg0Var;
        co4 co4Var2 = co4Var;
        ir1 ir1Var3 = (ir1) mi0Var;
        ir1Var3.m6889f0(-1221877520);
        if ((i & 6) == 0) {
            i2 = (ir1Var3.m6890g(dd3Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var3.m6894i(pg0Var3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? ir1Var3.m6890g(co4Var2) : ir1Var3.m6894i(co4Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var3.m6890g(nt2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ir1Var3.m6894i(null) ? 16384 : 8192;
        }
        byte b = 0;
        if ((i & 196608) == 0) {
            i2 |= ir1Var3.m6892h(false) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ir1Var3.m6892h(true) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= ir1Var3.m6892h(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= ir1Var3.m6894i(pg0Var2) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (ir1Var3.m6871T(i3 & 1, (38347923 & i3) != 38347922)) {
            Object objM6869O = ir1Var3.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                objM6869O = lb5.m7942w(r71.f29063a, ir1Var3);
                ir1Var3.m6905n0(objM6869O);
            }
            zo0 zo0Var = (zo0) objM6869O;
            Object objM6869O2 = ir1Var3.m6869O();
            if (objM6869O2 == i50Var) {
                objM6869O2 = k43.m7398w(Boolean.FALSE);
                ir1Var3.m6905n0(objM6869O2);
            }
            sw2 sw2Var2 = (sw2) objM6869O2;
            ir1Var3.m6885d0(-1104742522);
            ir1Var3.m6912r(false);
            xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, false);
            int iHashCode = Long.hashCode(ir1Var3.f21683T);
            ga3 ga3VarM6902m = ir1Var3.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var3, kt2.f23428a);
            bi0.f15310ap.getClass();
            if (ir1Var3.f21685a == null) {
                dt0.m4682E();
                throw null;
            }
            ir1Var3.m6893h0();
            if (ir1Var3.f21682S) {
                ir1Var3.m6900l(wf2.f33290T);
            } else {
                ir1Var3.m6911q0();
            }
            C0006a5.m53I(ir1Var3, ia5.f21216g, xq2VarM9704c);
            C0006a5.m53I(ir1Var3, ia5.f21215f, ga3VarM6902m);
            C0006a5.m53I(ir1Var3, ia5.f21217h, Integer.valueOf(iHashCode));
            C0006a5.m50F(ir1Var3);
            C0006a5.m53I(ir1Var3, ia5.f21214e, nt2VarM10006A);
            if (co4Var2.m4054b()) {
                ir1Var3.m6885d0(-1891243071);
                m6586k(dd3Var2, co4Var2, zo0Var, false, sw2Var2, pg0Var3, ir1Var3, (i3 & 14) | 196608 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                sw2Var = sw2Var2;
                ir1 ir1Var4 = ir1Var3;
                ir1Var4.m6912r(false);
                ir1Var2 = ir1Var4;
            } else {
                sw2Var = sw2Var2;
                ir1Var3.m6885d0(-1890863476);
                ir1Var3.m6912r(false);
                ir1Var2 = ir1Var3;
            }
            nt2Var2 = nt2Var;
            m6587l(co4Var, sw2Var, nt2Var2, pg0Var2, ir1Var2, ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752));
            co4Var2 = co4Var;
            ir1Var2.m6912r(true);
            boolean z = (i3 & 896) == 256 || ((i3 & 512) != 0 && ir1Var2.m6894i(co4Var2));
            Object objM6869O3 = ir1Var2.m6869O();
            Object obj = objM6869O3;
            if (z || objM6869O3 == i50Var) {
                C1127s c1127s = new C1127s((byte) 17);
                c1127s.f29778b = co4Var2;
                VarHandle.storeStoreFence();
                ir1Var2.m6905n0(c1127s);
                obj = c1127s;
            }
            lb5.m7923d(co4Var2, (yp1) obj, ir1Var2);
            ir1Var = ir1Var2;
        } else {
            dd3Var2 = dd3Var2;
            pg0Var3 = pg0Var3;
            nt2Var2 = nt2Var;
            ir1Var3.m6874W();
            ir1Var = ir1Var3;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0963ny c0963ny = new C0963ny(b);
            c0963ny.f26184d = dd3Var2;
            c0963ny.f26182b = pg0Var3;
            c0963ny.f26186f = co4Var2;
            c0963ny.f26187g = nt2Var2;
            c0963ny.f26185e = pg0Var2;
            c0963ny.f26183c = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0963ny;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m6577b(nt2 nt2Var, yp1 yp1Var, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-932836462);
        int i2 = i | (ir1Var.m6890g(nt2Var) ? 4 : 2) | (ir1Var.m6894i(yp1Var) ? 32 : 16);
        if (ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
            i25.m6610b(ir1Var, C0638f5.m5542m(nt2Var, yp1Var));
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ne0 ne0Var = new ne0((byte) 10);
            ne0Var.f25728b = nt2Var;
            ne0Var.f25729c = yp1Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ne0Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m6578c(c33 c33Var, InterfaceC0520ca interfaceC0520ca, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        pg0 pg0Var2;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ir1Var.m6890g(c33Var) : ir1Var.m6894i(c33Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(interfaceC0520ca) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 256 : 128;
        }
        byte b = 0;
        boolean z = true;
        if (ir1Var.m6871T(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !ir1Var.m6890g(c33Var))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objM6869O = ir1Var.m6869O();
            if (z3 || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                vu1 vu1Var = new vu1();
                vu1Var.f32876a = interfaceC0520ca;
                vu1Var.f32877b = c33Var;
                vu1Var.f32878c = 0L;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(vu1Var);
                obj = vu1Var;
            }
            obj = objM6869O;
            pg0Var2 = pg0Var;
            AbstractC1217uf.m11536a((vu1) obj, null, new ed3(false, pz3.f28106a, false), pg0Var2, ir1Var, ((i2 << 3) & 7168) | 384, 2);
        } else {
            pg0Var2 = pg0Var;
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1403zf c1403zf = new C1403zf(b);
            c1403zf.f36036c = c33Var;
            c1403zf.f36037d = interfaceC0520ca;
            c1403zf.f36038e = pg0Var2;
            c1403zf.f36035b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1403zf;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final long m6579d(int i) {
        long j = ((long) i) << 32;
        int i2 = nc2.f25646O;
        return j;
    }

    /* JADX INFO: renamed from: e */
    public static final long m6580e(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX INFO: renamed from: f */
    public static final void m6581f(c33 c33Var, boolean z, oo3 oo3Var, boolean z2, long j, float f, nt2 nt2Var, mi0 mi0Var, int i) {
        int i2;
        long j2;
        int i3;
        boolean z3;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-466280168);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? ir1Var.m6890g(c33Var) : ir1Var.m6894i(c33Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6892h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6886e(oo3Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6892h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((1572864 & i) == 0) {
            i2 |= ir1Var.m6890g(nt2Var) ? 1048576 : 524288;
        }
        byte b = 0;
        if (ir1Var.m6871T(i2 & 1, (533651 & i2) != 533650)) {
            ir1Var.m6876Y();
            if ((i & 1) == 0 || ir1Var.m6856B()) {
                i3 = i2 & (-57345);
                j2 = 9205357640488583168L;
            } else {
                ir1Var.m6874W();
                i3 = i2 & (-57345);
                j2 = j;
            }
            ir1Var.m6913s();
            if (z) {
                p14 p14Var = z04.f35677a;
                if ((oo3Var != oo3.f26925a || z2) && !(oo3Var == oo3.f26926b && z2)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                p14 p14Var2 = z04.f35677a;
                if ((oo3Var != oo3.f26925a || z2) && !(oo3Var == oo3.f26926b && z2)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            C0743hz c0743hz = z3 ? se0.f30190c : se0.f30189b;
            int i4 = i3 & 14;
            boolean zM6892h = ((i3 & 112) == 32) | (i4 == 4 || ((i3 & 8) != 0 && ir1Var.m6894i(c33Var))) | ir1Var.m6892h(z3);
            Object objM6869O = ir1Var.m6869O();
            if (zM6892h || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                C0490bg c0490bg = new C0490bg(b);
                c0490bg.f15251d = c33Var;
                c0490bg.f15249b = z;
                c0490bg.f15250c = z3;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0490bg);
                obj = c0490bg;
            }
            obj = objM6869O;
            nt2 nt2VarM5458a = f14.m5458a(nt2Var, false, (yp1) obj);
            fy4 fy4Var = (fy4) ir1Var.m6898k(ij0.f21485t);
            C0526cg c0526cg = new C0526cg();
            c0526cg.f15991a = fy4Var;
            c0526cg.f15992b = j2;
            c0526cg.f15993c = z3;
            c0526cg.f15994d = nt2VarM5458a;
            c0526cg.f15995e = c33Var;
            VarHandle.storeStoreFence();
            m6578c(c33Var, c0743hz, vd6.m11834R(1365123137, c0526cg, ir1Var), ir1Var, i4 | 384);
        } else {
            ir1Var.m6874W();
            j2 = j;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0574dg c0574dg = new C0574dg();
            c0574dg.f17019a = c33Var;
            c0574dg.f17020b = z;
            c0574dg.f17021c = oo3Var;
            c0574dg.f17022d = z2;
            c0574dg.f17023e = j2;
            c0574dg.f17024f = f;
            c0574dg.f17025g = nt2Var;
            c0574dg.f17026h = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0574dg;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static final void m6582g(nt2 nt2Var, wp1 wp1Var, boolean z, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(2111672474);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(nt2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (ir1Var.m6894i(wp1Var) ? 32 : 16) | (ir1Var.m6892h(z) ? 256 : 128);
        byte b = 0;
        if (ir1Var.m6871T(i3 & 1, (i3 & 147) != 146)) {
            p14 p14Var = z04.f35677a;
            nt2 nt2VarM8580h = n74.m8580h(nt2Var, 25.0f, 25.0f);
            C0724hg c0724hg = new C0724hg(b);
            c0724hg.f20541c = wp1Var;
            c0724hg.f20540b = z;
            VarHandle.storeStoreFence();
            i25.m6610b(ir1Var, qq2.m10029m(nt2VarM8580h, c0724hg));
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0687gg c0687gg = new C0687gg(b);
            c0687gg.f19774b = nt2Var;
            c0687gg.f19777e = wp1Var;
            c0687gg.f19775c = z;
            c0687gg.f19776d = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0687gg;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final long m6583h(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: i */
    public static final void m6584i(int i, mi0 mi0Var) {
        ih0 ih0Var = ih0.f21417c;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(795128198);
        boolean zM6890g = ir1Var.m6890g(ih0Var);
        byte b = 2;
        int i2 = i | (zM6890g ? 4 : 2);
        if (ir1Var.m6871T(i2 & 1, (i2 & 3) != 2)) {
            a44 a44Var = (a44) ir1Var.m6898k(h44.m6217a());
            ch0 ch0Var = new ch0(b);
            ch0Var.f16014b = a44Var;
            VarHandle.storeStoreFence();
            C1297wl c1297wlM10510c = rz2.m10510c(vd6.m11834R(-147197251, ch0Var, ir1Var), ir1Var);
            pg0 pg0Var = lb5.f23915c;
            pg0 pg0Var2 = lb5.f23916d;
            C1017p0 c1017p0 = new C1017p0((byte) 19);
            c1017p0.f27254b = a44Var;
            VarHandle.storeStoreFence();
            mz3.m8463e(null, null, false, c1297wlM10510c, null, null, pg0Var, null, pg0Var2, vd6.m11834R(-2113109048, c1017p0, ir1Var), ir1Var, 907542528, 183);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            en0 en0Var = new en0((byte) 17);
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = en0Var;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m6585j(ie1 ie1Var, yp1 yp1Var, mi0 mi0Var, int i) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-265148618);
        byte b = 2;
        int i2 = (ir1Var.m6890g(ie1Var) ? 4 : 2) | i | (ir1Var.m6894i(yp1Var) ? 32 : 16);
        byte b2 = 0;
        if (ir1Var.m6871T(i2 & 1, (i2 & 19) != 18)) {
            lv1 lv1Var = (lv1) ir1Var.m6898k(nv1.f26110a);
            boolean zM6890g = ((i2 & 112) == 32) | ir1Var.m6890g(lv1Var);
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            Object obj = objM6869O;
            if (zM6890g || objM6869O == i50Var) {
                na1 na1Var = new na1(b);
                na1Var.f25595b = yp1Var;
                na1Var.f25596c = lv1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(na1Var);
                obj = na1Var;
            }
            yp1 yp1Var2 = (yp1) obj;
            nt2 nt2VarM12840M = y42.m12840M(kt2.f23428a, ((lq2) ir1Var.m6898k(pq2.f27894b)).f24280d.mo7289f());
            boolean zM6890g2 = ir1Var.m6890g(yp1Var2) | ((i2 & 14) == 4);
            Object objM6869O2 = ir1Var.m6869O();
            Object obj2 = objM6869O2;
            if (zM6890g2 || objM6869O2 == i50Var) {
                je1 je1Var = new je1(b2);
                je1Var.f22198b = ie1Var;
                je1Var.f22199c = yp1Var2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(je1Var);
                obj2 = je1Var;
            }
            AbstractC0647fd.m5668f(nt2VarM12840M, "Theme", false, null, (yp1) obj2, ir1Var, 48, 12);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            ne0 ne0Var = new ne0((byte) 29);
            ne0Var.f25728b = ie1Var;
            ne0Var.f25729c = yp1Var;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = ne0Var;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m6586k(dd3 dd3Var, co4 co4Var, zo0 zo0Var, boolean z, sw2 sw2Var, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1413720282);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(dd3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? ir1Var.m6890g(co4Var) : ir1Var.m6894i(co4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6894i(null) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? ir1Var.m6890g(zo0Var) : ir1Var.m6894i(zo0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ir1Var.m6892h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ir1Var.m6890g(sw2Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 1048576 : 524288;
        }
        byte b = 1;
        if (ir1Var.m6871T(i2 & 1, (599187 & i2) != 599186)) {
            String string = ((Resources) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14652c)).getString(C0995R.string.tooltip_description);
            boolean z2 = ((i2 & 112) == 32 || ((i2 & 64) != 0 && ir1Var.m6894i(co4Var))) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && ir1Var.m6894i(zo0Var))) | ((458752 & i2) == 131072);
            Object objM6869O = ir1Var.m6869O();
            if (z2 || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                C1048pv c1048pv = new C1048pv(b);
                c1048pv.f28016b = co4Var;
                c1048pv.f28017c = zo0Var;
                c1048pv.f28018d = sw2Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c1048pv);
                obj = c1048pv;
            }
            obj = objM6869O;
            ed3 ed3Var = new ed3(22, z);
            ne0 ne0Var = new ne0((byte) 6);
            ne0Var.f25728b = string;
            ne0Var.f25729c = pg0Var;
            VarHandle.storeStoreFence();
            AbstractC1217uf.m11536a(dd3Var, (wp1) obj, ed3Var, vd6.m11834R(-1287705660, ne0Var, ir1Var), ir1Var, (i2 & 14) | 3072, 0);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1014oy c1014oy = new C1014oy((byte) 0);
            c1014oy.f27199d = dd3Var;
            c1014oy.f27200e = co4Var;
            c1014oy.f27201f = zo0Var;
            c1014oy.f27197b = z;
            c1014oy.f27202g = sw2Var;
            c1014oy.f27203h = pg0Var;
            c1014oy.f27198c = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1014oy;
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m6587l(co4 co4Var, sw2 sw2Var, nt2 nt2Var, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1873232064);
        byte b = 1;
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6892h(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? ir1Var.m6890g(co4Var) : ir1Var.m6894i(co4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6890g(sw2Var) ? 256 : 128;
        }
        byte b3 = 0;
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6892h(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= ir1Var.m6890g(nt2Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 131072 : 65536;
        }
        if (ir1Var.m6871T(i2 & 1, (74899 & i2) != 74898)) {
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                objM6869O = lb5.m7942w(r71.f29063a, ir1Var);
                ir1Var.m6905n0(objM6869O);
            }
            zo0 zo0Var = (zo0) objM6869O;
            String string = ((Resources) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14652c)).getString(C0995R.string.tooltip_label);
            Object objM6869O2 = ir1Var.m6869O();
            if (objM6869O2 == i50Var) {
                objM6869O2 = k43.m7398w(Boolean.FALSE);
                ir1Var.m6905n0(objM6869O2);
            }
            sw2 sw2Var2 = (sw2) objM6869O2;
            C1311wy c1311wy = new C1311wy(b3);
            c1311wy.f33845b = co4Var;
            VarHandle.storeStoreFence();
            nt2 nt2VarM10327a = rf4.m10327a(nt2Var, co4Var, c1311wy);
            C1311wy c1311wy2 = new C1311wy(b);
            c1311wy2.f33845b = co4Var;
            VarHandle.storeStoreFence();
            nt2 nt2VarM10327a2 = rf4.m10327a(nt2VarM10327a, co4Var, c1311wy2);
            C1164t c1164t = new C1164t((byte) 6);
            c1164t.f30700c = string;
            c1164t.f30699b = zo0Var;
            c1164t.f30701d = co4Var;
            VarHandle.storeStoreFence();
            i83 i83Var = new i83();
            i83Var.f21171a = c1164t;
            VarHandle.storeStoreFence();
            nt2 nt2VarMo7630d = nt2VarM10327a2.mo7630d(i83Var);
            C1164t c1164t2 = new C1164t((byte) 5);
            c1164t2.f30700c = zo0Var;
            c1164t2.f30699b = sw2Var2;
            c1164t2.f30701d = co4Var;
            VarHandle.storeStoreFence();
            nt2 nt2VarM4290E = d24.m4290E(nt2VarMo7630d, c1164t2);
            C1385yy c1385yy = new C1385yy(b3);
            c1385yy.f35609b = co4Var;
            c1385yy.f35610c = sw2Var;
            c1385yy.f35611d = sw2Var2;
            VarHandle.storeStoreFence();
            nt2 nt2VarM13357P = z62.m13357P(nt2VarM4290E, c1385yy);
            xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, false);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM13357P);
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
            C0006a5.m53I(ir1Var, ia5.f21216g, xq2VarM9704c);
            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
            C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
            C0006a5.m50F(ir1Var);
            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
            pg0Var.invoke(ir1Var, Integer.valueOf((i2 >> 15) & 14));
            ir1Var.m6912r(true);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C0877lm c0877lm = new C0877lm(b2);
            c0877lm.f24144c = co4Var;
            c0877lm.f24145d = sw2Var;
            c0877lm.f24146e = nt2Var;
            c0877lm.f24147f = pg0Var;
            c0877lm.f24143b = i;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c0877lm;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final int m6588m(Context context, NetworkCapabilities networkCapabilities) {
        if (context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && networkCapabilities != null) {
            if (networkCapabilities.hasTransport(3)) {
                return 9;
            }
            if (networkCapabilities.hasTransport(1)) {
                return 1;
            }
            if (networkCapabilities.hasTransport(0)) {
                return 0;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public static jm2 m6589n(Exception exc) {
        mx3 mx3VarM653a = cy3.m653a();
        mx3VarM653a.m1735a(exc);
        return mx3VarM653a.mo1538e();
    }

    /* JADX INFO: renamed from: o */
    public static String m6590o(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            char[] cArr2 = f21054h;
            cArr[i] = cArr2[(b & 255) >>> 4];
            cArr[i + 1] = cArr2[b & 15];
            i += 2;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: p */
    public static String m6591p(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < length; i++) {
            int i2 = (bArr[i] & 240) >>> 4;
            char[] cArr = f21053g;
            sb.append(cArr[i2]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: q */
    public static Object m6592q(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(i20.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX INFO: renamed from: r */
    public static final t02 m6593r(z50 z50Var, float f) {
        int iCeil = ((int) Math.ceil(f)) * 2;
        C0759ie c0759ieM13873h = ev0.f18508p;
        C1325xb c1325xb = ev0.f18509q;
        j70 j70Var = ev0.f18510r;
        if (c0759ieM13873h == null || c1325xb == null) {
            c0759ieM13873h = zy5.m13873h(iCeil, iCeil, 1);
            ev0.f18508p = c0759ieM13873h;
            Canvas canvas = AbstractC1362yb.f35080a;
            c1325xb = new C1325xb();
            c1325xb.f34122a = new Canvas(AbstractC0647fd.m5679r(c0759ieM13873h));
            ev0.f18509q = c1325xb;
        } else {
            Bitmap bitmap = c0759ieM13873h.f21276a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                c0759ieM13873h = zy5.m13873h(iCeil, iCeil, 1);
                ev0.f18508p = c0759ieM13873h;
                Canvas canvas2 = AbstractC1362yb.f35080a;
                c1325xb = new C1325xb();
                c1325xb.f34122a = new Canvas(AbstractC0647fd.m5679r(c0759ieM13873h));
                ev0.f18509q = c1325xb;
            }
        }
        C0759ie c0759ie = c0759ieM13873h;
        C1325xb c1325xb2 = c1325xb;
        if (j70Var == null) {
            j70Var = new j70();
            ev0.f18510r = j70Var;
        }
        j70 j70Var2 = j70Var;
        i70 i70Var = j70Var2.f22063a;
        df2 layoutDirection = z50Var.f35750a.getLayoutDirection();
        Bitmap bitmap2 = c0759ie.f21276a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        ky0 ky0Var = i70Var.f21146a;
        df2 df2Var = i70Var.f21147b;
        h70 h70Var = i70Var.f21148c;
        long j = i70Var.f21149d;
        i70Var.f21146a = z50Var;
        i70Var.f21147b = layoutDirection;
        i70Var.f21148c = c1325xb2;
        i70Var.f21149d = jFloatToRawIntBits;
        c1325xb2.mo6253j();
        u31.m11225x(j70Var2, pb0.f27495b, 0L, j70Var2.mo11227d(), null, 58);
        u31.m11225x(j70Var2, zy5.m13870e(4278190080L), 0L, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), null, 120);
        u31.m11222g0(j70Var2, zy5.m13870e(4278190080L), f, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 120);
        c1325xb2.mo6251g();
        i70Var.f21146a = ky0Var;
        i70Var.f21147b = df2Var;
        i70Var.f21148c = h70Var;
        i70Var.f21149d = j;
        return c0759ie;
    }

    /* JADX INFO: renamed from: s */
    public static h20 m6594s(Object obj) {
        h20 h20Var = new h20();
        h20Var.f20276a = obj;
        VarHandle.storeStoreFence();
        return h20Var;
    }

    /* JADX INFO: renamed from: t */
    public static final void m6595t(jf1 jf1Var, p83 p83Var) throws IOException {
        try {
            IOException iOException = null;
            for (p83 p83Var2 : jf1Var.mo3778k(p83Var)) {
                try {
                    if (jf1Var.m7090l(p83Var2).f34191b) {
                        m6595t(jf1Var, p83Var2);
                    }
                    jf1Var.mo3777g(p83Var2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: u */
    public static final C1283w7 m6596u(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new C1283w7(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static final long m6597v(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: w */
    public static final void m6598w(ro0 ro0Var, Throwable th) throws IllegalAccessException, InvocationTargetException {
        Throwable runtimeException;
        Iterator it = uo0.f32020a.iterator();
        while (it.hasNext()) {
            try {
                ((to0) it.next()).handleException(ro0Var, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    se0.m10720f(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            iz0 iz0Var = new iz0();
            iz0Var.f21897a = ro0Var;
            VarHandle.storeStoreFence();
            se0.m10720f(th, iz0Var);
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: x */
    public static final jp1 m6599x(AbstractC1091r0 abstractC1091r0, gk2 gk2Var) {
        if (gk2Var.mo6016b().compareTo(fk2.f19054a) <= 0) {
            xd2.m12668o("Cannot configure ", abstractC1091r0, " to disposeComposition at Lifecycle ON_DESTROY: ", gk2Var, "is already destroyed");
            return null;
        }
        C0749i4 c0749i4 = new C0749i4((byte) 3);
        c0749i4.f21112b = abstractC1091r0;
        VarHandle.storeStoreFence();
        gk2Var.mo6015a(c0749i4);
        jp1 jp1Var = new jp1((byte) 29);
        jp1Var.f22485b = gk2Var;
        jp1Var.f22486c = c0749i4;
        VarHandle.storeStoreFence();
        return jp1Var;
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m6600y(wf4 wf4Var, Set set) {
        return set.contains(m6572G(wf4Var, false)) || set.contains(m6572G(wf4Var, true));
    }

    /* JADX INFO: renamed from: z */
    public static long m6601z(int i, int i2, int i3, int i4) {
        return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
    }
}
