package p000;

import ads_mobile_sdk.C0340tc;
import ads_mobile_sdk.C0344tm;
import ads_mobile_sdk.C0416yc;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.DragEvent;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.common.api.Status;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class y42 implements g81, si0 {

    /* JADX INFO: renamed from: a */
    public static Context f34859a;

    /* JADX INFO: renamed from: b */
    public static Boolean f34860b;

    /* JADX INFO: renamed from: c */
    public static final pg0 f34861c = new pg0(-432374862, false, new qg0(29));

    /* JADX INFO: renamed from: d */
    public static final pg0 f34862d = new pg0(-1759434350, false, new jh0(12));

    /* JADX INFO: renamed from: e */
    public static final int[] f34863e = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: f */
    public static final int[] f34864f = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* JADX INFO: renamed from: g */
    public static final int[] f34865g = {3, 6};

    /* JADX INFO: renamed from: h */
    public static final int[] f34866h = {1, 2, 4, 5, 7, 8};

    /* JADX INFO: renamed from: i */
    public static final kh5 f34867i = new kh5(1);

    /* JADX INFO: renamed from: j */
    public static g12 f34868j;

    /* JADX INFO: renamed from: A0 */
    public static final long m12819A0(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: B0 */
    public static final C1349xz m12820B0(ir1 ir1Var) {
        Object obj;
        Object obj2;
        xn2 xn2Var = (xn2) ir1Var.m6898k(yn2.f35357b);
        Object obj3 = ki0.f23136a;
        wm0 wm0Var = null;
        if (xn2Var == null) {
            ir1Var.m6885d0(-1476823888);
            ir1Var.m6912r(false);
            obj = null;
        } else {
            ir1Var.m6885d0(-1476823887);
            boolean zM6890g = ir1Var.m6890g("BillingState") | ir1Var.m6890g(xn2Var);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == obj3) {
                objM6869O = xn2Var.m12723c("BillingState");
                ir1Var.m6905n0(objM6869O);
            }
            obj = (xn2) objM6869O;
            ir1Var.m6912r(false);
        }
        Context context = (Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b);
        Object objM6869O2 = ir1Var.m6869O();
        Object obj4 = objM6869O2;
        if (objM6869O2 == obj3) {
            C0558d0 c0558d0 = new C0558d0((byte) 15);
            c0558d0.f16655b = context;
            c0558d0.f16656c = obj;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(c0558d0);
            obj4 = c0558d0;
        }
        Object obj5 = (yp1) obj4;
        Object objM6869O3 = ir1Var.m6869O();
        Object obj6 = objM6869O3;
        if (objM6869O3 == obj3) {
            C1349xz c1349xz = new C1349xz();
            c1349xz.f34727a = k43.m7398w(null);
            c1349xz.f34728b = new a83(0);
            c1349xz.f34729c = new a83(0);
            c1349xz.f34730d = k43.m7398w(null);
            c1349xz.f34731e = k43.m7398w(null);
            c1349xz.f34732f = new a83(0);
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(c1349xz);
            obj6 = c1349xz;
        }
        C1349xz c1349xz2 = (C1349xz) obj6;
        a83 a83Var = c1349xz2.f34732f;
        d83 d83Var = c1349xz2.f34727a;
        int iM132h = a83Var.m132h();
        ju4 ju4Var = ju4.f22634a;
        if (iM132h > 0 && ((C0927mz) d83Var.getValue()) == null) {
            ir1Var.m6885d0(-1779971594);
            boolean zM6890g2 = ir1Var.m6890g(obj5) | ir1Var.m6894i(obj);
            Object objM6869O4 = ir1Var.m6869O();
            if (zM6890g2 || objM6869O4 == obj3) {
                objM6869O4 = new C1031pe(obj5, obj, (Object) c1349xz2, wm0Var, (byte) 3);
                ir1Var.m6905n0(objM6869O4);
            }
            lb5.m7926g(ir1Var, (mq1) objM6869O4, obj5);
            ir1Var.m6912r(false);
        } else if (c1349xz2.f34732f.m132h() != 0 || ((C0927mz) d83Var.getValue()) == null) {
            ir1Var.m6885d0(-1778738259);
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6885d0(-1778909317);
            boolean zM6894i = ir1Var.m6894i(obj);
            Object objM6869O5 = ir1Var.m6869O();
            if (zM6894i || objM6869O5 == obj3) {
                objM6869O5 = new C0594e0(obj, (Object) c1349xz2, wm0Var, (byte) 9);
                ir1Var.m6905n0(objM6869O5);
            }
            lb5.m7926g(ir1Var, (mq1) objM6869O5, ju4Var);
            ir1Var.m6912r(false);
        }
        Object objM6869O6 = ir1Var.m6869O();
        if (objM6869O6 == obj3) {
            objM6869O6 = new C0982og((Object) c1349xz2, wm0Var, (byte) 3);
            ir1Var.m6905n0(objM6869O6);
        }
        lb5.m7926g(ir1Var, (mq1) objM6869O6, ju4Var);
        ag0 ag0VarM12798a = ((xz4) ir1Var.m6898k(la1.f23888a)).m12798a();
        if (ag0VarM12798a == null) {
            ir1Var.m6885d0(-1778562087);
            ir1Var.m6912r(false);
            return c1349xz2;
        }
        ir1Var.m6885d0(-1778562086);
        Object objM6869O7 = ir1Var.m6869O();
        if (objM6869O7 == obj3) {
            obj2 = objM6869O7;
            C1127s c1127s = new C1127s((byte) 18);
            c1127s.f29778b = c1349xz2;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(c1127s);
            obj2 = c1127s;
        }
        obj2 = objM6869O7;
        zc6.m13519d(ag0VarM12798a, (yp1) obj2, ir1Var, 390);
        ir1Var.m6912r(false);
        return c1349xz2;
    }

    /* JADX INFO: renamed from: C0 */
    public static final d00 m12821C0(og3 og3Var, C1349xz c1349xz, ir1 ir1Var) {
        xn2 xn2Var;
        a83 a83Var = c1349xz.f34729c;
        ir1Var.m6885d0(-250344809);
        xn2 xn2Var2 = (xn2) ir1Var.m6898k(yn2.f35357b);
        Object obj = ki0.f23136a;
        if (xn2Var2 == null) {
            ir1Var.m6885d0(-1476823888);
            ir1Var.m6912r(false);
            xn2Var = null;
        } else {
            ir1Var.m6885d0(-1476823887);
            boolean zM6890g = ir1Var.m6890g("ProductState") | ir1Var.m6890g(xn2Var2);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == obj) {
                objM6869O = xn2Var2.m12723c("ProductState");
                ir1Var.m6905n0(objM6869O);
            }
            ir1Var.m6912r(false);
            xn2Var = (xn2) objM6869O;
        }
        l84 l84Var = ir1Var.f21670G;
        int i = l84Var.f23853g;
        Object objM6097v = gq6.m6097v(i < l84Var.f23854h ? l84Var.m7860p(l84Var.f23848b, i) : null, og3Var, c1349xz);
        if (objM6097v == null) {
            objM6097v = new g92(og3Var, c1349xz);
        }
        ir1Var.m6879a0(-63181382, objM6097v);
        Object objM6869O2 = ir1Var.m6869O();
        if (objM6869O2 == obj) {
            objM6869O2 = lb5.m7942w(r71.f29063a, ir1Var);
            ir1Var.m6905n0(objM6869O2);
        }
        zo0 zo0Var = (zo0) objM6869O2;
        Object objM6869O3 = ir1Var.m6869O();
        Object obj2 = objM6869O3;
        if (objM6869O3 == obj) {
            d00 d00Var = new d00();
            d00Var.f16659c = zo0Var;
            d00Var.f16660d = xn2Var;
            d00Var.f16661e = c1349xz;
            d00Var.f16662f = og3Var;
            d00Var.f16657a = k43.m7398w(null);
            d00Var.f16658b = k43.m7398w(null);
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(d00Var);
            obj2 = d00Var;
        }
        d00 d00Var2 = (d00) obj2;
        Integer numValueOf = Integer.valueOf(a83Var.m132h());
        boolean zM6890g2 = ir1Var.m6890g(c1349xz) | ir1Var.m6894i(og3Var) | ir1Var.m6894i(xn2Var);
        Object objM6869O4 = ir1Var.m6869O();
        if (zM6890g2 || objM6869O4 == obj) {
            Object c1386yz = new C1386yz(c1349xz, d00Var2, og3Var, xn2Var, (wm0) null);
            d00Var2 = d00Var2;
            ir1Var.m6905n0(c1386yz);
            objM6869O4 = c1386yz;
        }
        lb5.m7926g(ir1Var, (mq1) objM6869O4, numValueOf);
        Integer numValueOf2 = Integer.valueOf(c1349xz.f34728b.m132h());
        Integer numValueOf3 = Integer.valueOf(a83Var.m132h());
        boolean zM6890g3 = ir1Var.m6890g(c1349xz) | ir1Var.m6894i(og3Var) | ir1Var.m6894i(xn2Var) | ir1Var.m6892h(true);
        Object objM6869O5 = ir1Var.m6869O();
        if (zM6890g3 || objM6869O5 == obj) {
            Object c1386yz2 = new C1386yz(c1349xz, og3Var, d00Var2, xn2Var, (wm0) null);
            ir1Var.m6905n0(c1386yz2);
            objM6869O5 = c1386yz2;
        }
        lb5.m7927h(numValueOf2, numValueOf3, (mq1) objM6869O5, ir1Var);
        ir1Var.m6912r(false);
        ir1Var.m6912r(false);
        return d00Var2;
    }

    /* JADX INFO: renamed from: D */
    public static final void m12822D(int i, mi0 mi0Var) {
        Object obj;
        C0984oi c0984oi;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1725718514);
        byte b = 0;
        if (ir1Var.m6871T(i & 1, i != 0)) {
            a44 a44Var = (a44) ir1Var.m6898k(h44.m6217a());
            si2 si2VarM11560a = ui2.m11560a(ir1Var);
            List listM12433a = wx2.m12433a(a44Var);
            boolean zM6890g = ir1Var.m6890g(a44Var);
            Object objM6869O = ir1Var.m6869O();
            byte b2 = 4;
            i50 i50Var = ki0.f23136a;
            if (zM6890g || objM6869O == i50Var) {
                obj = objM6869O;
                zg0 zg0Var = new zg0(b2);
                zg0Var.f36059b = a44Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(zg0Var);
                obj = zg0Var;
            }
            yp1 yp1Var = (yp1) obj;
            Object objM6869O2 = ir1Var.m6869O();
            if (objM6869O2 == i50Var) {
                objM6869O2 = new t63((byte) 11);
                ir1Var.m6905n0(objM6869O2);
            }
            sw2 sw2VarM7369C = k43.m7369C(listM12433a, ir1Var);
            sw2 sw2VarM7369C2 = k43.m7369C((yp1) objM6869O2, ir1Var);
            lv1 lv1Var = (lv1) ir1Var.m6898k(nv1.f26110a);
            boolean zM6890g2 = ir1Var.m6890g(yp1Var) | ir1Var.m6894i(listM12433a) | ir1Var.m6890g(sw2VarM7369C) | ir1Var.m6890g(sw2VarM7369C2) | ir1Var.m6890g(lv1Var);
            Object objM6869O3 = ir1Var.m6869O();
            if (zM6890g2 || objM6869O3 == i50Var) {
                rt4 rt4Var = new rt4(yp1Var, listM12433a, lv1Var, sw2VarM7369C, sw2VarM7369C2, null);
                ir1Var.m6905n0(rt4Var);
                objM6869O3 = rt4Var;
            }
            oq1 oq1Var = (oq1) objM6869O3;
            ir1Var.m6885d0(-645045624);
            g73 g73Var = new g73(0.0f, 0.0f, 0.0f, 0.0f);
            ir1Var.m6885d0(1347434050);
            boolean zM6890g3 = ir1Var.m6890g(si2VarM11560a);
            Object objM6869O4 = ir1Var.m6869O();
            if (zM6890g3 || objM6869O4 == i50Var) {
                objM6869O4 = new pn3(si2VarM11560a, b);
                ir1Var.m6905n0(objM6869O4);
            }
            wp1 wp1Var = (wp1) objM6869O4;
            ir1Var.m6912r(false);
            ir1Var.m6885d0(996643712);
            Object objM6869O5 = ir1Var.m6869O();
            r71 r71Var = r71.f29063a;
            if (objM6869O5 == i50Var) {
                jj0 jj0Var = new jj0(lb5.m7942w(r71Var, ir1Var));
                ir1Var.m6905n0(jj0Var);
                objM6869O5 = jj0Var;
            }
            zo0 zo0Var = ((jj0) objM6869O5).f22325a;
            sw2 sw2VarM7369C3 = k43.m7369C(wp1Var, ir1Var);
            sw2 sw2VarM7369C4 = k43.m7369C(100L, ir1Var);
            ir1Var.m6885d0(1852585201);
            boolean zM6890g4 = ir1Var.m6890g(si2VarM11560a) | ir1Var.m6890g(zo0Var) | ir1Var.m6888f(100L);
            Object objM6869O6 = ir1Var.m6869O();
            Object obj2 = null;
            Object obj3 = objM6869O6;
            if (zM6890g4 || objM6869O6 == i50Var) {
                dn3 dn3Var = new dn3(sw2VarM7369C3, sw2VarM7369C4, (byte) 2);
                py3 py3Var = new py3();
                py3Var.f28096a = si2VarM11560a;
                py3Var.f28097b = zo0Var;
                py3Var.f28098c = dn3Var;
                py3Var.f28100e = ev0.m5333H(-1, null, null, 6);
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(py3Var);
                obj3 = py3Var;
            }
            py3 py3Var2 = (py3) obj3;
            ir1Var.m6912r(false);
            ir1Var.m6912r(false);
            ky0 ky0Var = (ky0) ir1Var.m6898k(ij0.f21473h);
            float fMo3575E = ky0Var.mo3575E(48.0f);
            Object objM6869O7 = ir1Var.m6869O();
            if (objM6869O7 == i50Var) {
                objM6869O7 = new jj0(lb5.m7942w(r71Var, ir1Var));
                ir1Var.m6905n0(objM6869O7);
            }
            zo0 zo0Var2 = ((jj0) objM6869O7).f22325a;
            sw2 sw2VarM7369C5 = k43.m7369C(oq1Var, ir1Var);
            df2 df2Var = (df2) ir1Var.m6898k(ij0.f21479n);
            float fMo3575E2 = ky0Var.mo3575E(AbstractC0647fd.m5681t(g73Var, df2Var));
            float fMo3575E3 = ky0Var.mo3575E(AbstractC0647fd.m5680s(g73Var, df2Var));
            float fMo3575E4 = ky0Var.mo3575E(0.0f);
            float fMo3575E5 = ky0Var.mo3575E(0.0f);
            C1313x c1313x = new C1313x();
            c1313x.f33887a = fMo3575E2;
            c1313x.f33888b = fMo3575E3;
            c1313x.f33889c = fMo3575E4;
            c1313x.f33890d = fMo3575E5;
            VarHandle.storeStoreFence();
            ir1Var.m6885d0(1347465600);
            boolean zM6890g5 = ir1Var.m6890g(si2VarM11560a);
            Object objM6869O8 = ir1Var.m6869O();
            if (zM6890g5 || objM6869O8 == i50Var) {
                objM6869O8 = new pn3(si2VarM11560a, (byte) 1);
                ir1Var.m6905n0(objM6869O8);
            }
            ir1Var.m6912r(false);
            wy0 wy0VarM10566b = s94.m10566b((wp1) objM6869O8);
            d63 d63Var = (d63) wy0VarM10566b.getValue();
            ir1Var.m6885d0(1347468268);
            boolean zM6890g6 = ir1Var.m6890g(g73Var) | ir1Var.m6890g(zo0Var2) | ir1Var.m6890g(si2VarM11560a) | ir1Var.m6884d(48.0f) | ir1Var.m6890g(py3Var2) | ir1Var.m6890g(d63Var);
            Object objM6869O9 = ir1Var.m6869O();
            Object obj4 = objM6869O9;
            if (zM6890g6 || objM6869O9 == i50Var) {
                int iOrdinal = ((d63) wy0VarM10566b.getValue()).ordinal();
                if (iOrdinal == 0) {
                    c0984oi = C0984oi.f26757n;
                } else {
                    if (iOrdinal != 1) {
                        C0670g.m5864c();
                        return;
                    }
                    c0984oi = C0984oi.f26758o;
                }
                wd3 wd3Var = new wd3((byte) 4);
                wd3Var.f33259b = si2VarM11560a;
                VarHandle.storeStoreFence();
                px3 px3Var = px3.f28068a;
                rn3 rn3Var = new rn3();
                rn3Var.f29440a = wd3Var;
                rn3Var.f29441b = zo0Var2;
                rn3Var.f29442c = sw2VarM7369C5;
                rn3Var.f29443d = fMo3575E;
                rn3Var.f29444e = c1313x;
                rn3Var.f29445f = py3Var2;
                rn3Var.f29446g = px3Var;
                rn3Var.f29447h = df2Var;
                rn3Var.f29448i = c0984oi;
                rn3Var.f29449j = hx2.m6530a();
                rn3Var.f29450k = k43.m7398w(null);
                rn3Var.f29451l = s94.m10566b(new gn3(rn3Var, b));
                rn3Var.f29452m = k43.m7398w(b33.m3423a(0L));
                rn3Var.f29453n = k43.m7398w(o52.m8954a(0L));
                rn3Var.f29454o = k43.m7398w(null);
                rn3Var.f29455p = k43.m7398w(null);
                rn3Var.f29456q = 0L;
                rn3Var.f29457r = new HashSet();
                rn3Var.f29458s = k43.m7398w(null);
                rn3Var.f29459t = new C0910mi(b33.m3423a(0L), sw4.f30617f, obj2, 12);
                rn3Var.f29460u = qq2.m10013H(new gn3(rn3Var, (byte) 1));
                ir1Var.m6905n0(rn3Var);
                obj4 = rn3Var;
            }
            rn3 rn3Var2 = (rn3) obj4;
            ir1Var.m6912r(false);
            ir1Var.m6912r(false);
            boolean zM6890g7 = ir1Var.m6890g(a44Var) | ir1Var.m6890g(rn3Var2);
            Object objM6869O10 = ir1Var.m6869O();
            Object obj5 = objM6869O10;
            if (zM6890g7 || objM6869O10 == i50Var) {
                na1 na1Var = new na1((byte) 27);
                na1Var.f25595b = a44Var;
                na1Var.f25596c = rn3Var2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(na1Var);
                obj5 = na1Var;
            }
            gq6.m6081f("Buttons", si2VarM11560a, (yp1) obj5, ir1Var, 6, 6);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            gv3 gv3Var = new gv3((byte) 10);
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = gv3Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: D0 */
    public static final Object m12823D0(C0927mz c0927mz, String str, String str2, ym0 ym0Var) {
        C1423zz c1423zz;
        if (ym0Var instanceof C1423zz) {
            c1423zz = (C1423zz) ym0Var;
            int i = c1423zz.f36494v;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1423zz.f36494v = i - Integer.MIN_VALUE;
            } else {
                c1423zz = new C1423zz(ym0Var);
            }
        } else {
            c1423zz = new C1423zz(ym0Var);
        }
        Object objM5007w = c1423zz.f36493u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = c1423zz.f36494v;
        if (i2 == 0) {
            k43.m7376J(objM5007w);
            if (str2 == null) {
                C1077qn.m9987m("Product type must be set");
                return null;
            }
            c1423zz.f36492t = str;
            c1423zz.f36494v = 1;
            cf0 cf0Var = new cf0();
            C1015oz c1015oz = new C1015oz();
            c1015oz.f27240a = cf0Var;
            c0927mz.getClass();
            uo5 uo5Var = new uo5((byte) 5);
            uo5Var.f32038d = c1015oz;
            uo5Var.f32037c = str2;
            uo5Var.f32036b = c0927mz;
            VarHandle.storeStoreFence();
            oz5 oz5Var = new oz5((byte) 7);
            oz5Var.f27249b = c0927mz;
            oz5Var.f27250c = c1015oz;
            VarHandle.storeStoreFence();
            if (C0927mz.m8427h(uo5Var, 30000L, oz5Var, c0927mz.m8442i(), c0927mz.m8441g()) == null) {
                f00 f00VarM8445l = c0927mz.m8445l();
                c0927mz.m8450u(25, 9, f00VarM8445l);
                uu5 uu5Var = sv5.f30597b;
                c1015oz.m9337a(f00VarM8445l, mw5.f25264e);
            }
            objM5007w = cf0Var.m5007w(c1423zz);
            if (objM5007w == ap0Var) {
                return ap0Var;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = c1423zz.f36492t;
            k43.m7376J(objM5007w);
        }
        for (Object obj : ((ki3) objM5007w).f23154b) {
            ji3 ji3Var = (ji3) obj;
            ji3Var.getClass();
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = ji3Var.f22316c;
            if (jSONObject.has("productIds")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
                if (jSONArrayOptJSONArray != null) {
                    for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                        arrayList.add(jSONArrayOptJSONArray.optString(i3));
                    }
                }
            } else if (jSONObject.has("productId")) {
                arrayList.add(jSONObject.optString("productId"));
            }
            if (arrayList.contains(str)) {
                return obj;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: E */
    public static final void m12824E(dp4 dp4Var, nt2 nt2Var, ag1 ag1Var, yp1 yp1Var, pg0 pg0Var, mi0 mi0Var, int i) {
        yp1 yp1Var2;
        zh0 zh0Var = dp4Var.f17258a;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-1877370462);
        int i2 = (i & 6) == 0 ? (ir1Var.m6890g(dp4Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6890g(nt2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6894i(ag1Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= ir1Var.m6894i(pg0Var) ? 16384 : 8192;
        }
        if (ir1Var.m6871T(i3 & 1, (i3 & 9363) != 9362)) {
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            if (objM6869O == i50Var) {
                objM6869O = C1035pi.f27618p;
                ir1Var.m6905n0(objM6869O);
            }
            yp1Var2 = (yp1) objM6869O;
            Object objM6869O2 = ir1Var.m6869O();
            Object obj = objM6869O2;
            if (objM6869O2 == i50Var) {
                w94 w94Var = new w94();
                w94Var.add(zh0Var.mo11188l());
                ir1Var.m6905n0(w94Var);
                obj = w94Var;
            }
            w94 w94Var2 = (w94) obj;
            Object objM6869O3 = ir1Var.m6869O();
            if (objM6869O3 == i50Var) {
                long[] jArr = tv3.f31472a;
                objM6869O3 = new lw2();
                ir1Var.m6905n0(objM6869O3);
            }
            lw2 lw2Var = (lw2) objM6869O3;
            d83 d83Var = dp4Var.f17261d;
            if (z62.m13387o(zh0Var.mo11188l(), d83Var.getValue())) {
                ir1Var.m6885d0(321145192);
                if (w94Var2.size() == 1 && z62.m13387o(w94Var2.get(0), d83Var.getValue())) {
                    ir1Var.m6885d0(321469824);
                    ir1Var.m6912r(false);
                } else {
                    ir1Var.m6885d0(321279546);
                    boolean z = (i3 & 14) == 4;
                    Object objM6869O4 = ir1Var.m6869O();
                    if (z || objM6869O4 == i50Var) {
                        objM6869O4 = new C1183ti(dp4Var, (byte) 3);
                        ir1Var.m6905n0(objM6869O4);
                    }
                    mb0.m8261B0(w94Var2, (yp1) objM6869O4);
                    lw2Var.m8126a();
                    ir1Var.m6912r(false);
                }
                ir1Var.m6912r(false);
            } else {
                ir1Var.m6885d0(321475776);
                ir1Var.m6912r(false);
            }
            if (lw2Var.m8127b(d83Var.getValue())) {
                ir1Var.m6885d0(322279296);
                ir1Var.m6912r(false);
            } else {
                ir1Var.m6885d0(321536443);
                ListIterator listIterator = w94Var2.listIterator();
                int i4 = 0;
                while (true) {
                    ow1 ow1Var = (ow1) listIterator;
                    if (!ow1Var.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (z62.m13387o(yp1Var2.invoke(ow1Var.next()), yp1Var2.invoke(d83Var.getValue()))) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 == -1) {
                    w94Var2.add(d83Var.getValue());
                } else {
                    w94Var2.set(i4, d83Var.getValue());
                }
                lw2Var.m8126a();
                int size = w94Var2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Object obj2 = w94Var2.get(i5);
                    lw2Var.m8138m(obj2, vd6.m11834R(-934471669, new yr0(dp4Var, ag1Var, obj2, pg0Var), ir1Var));
                }
                ir1Var.m6912r(false);
            }
            xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, false);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2Var);
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
            C0006a5.m85w(ir1Var, Integer.valueOf(iHashCode));
            C0006a5.m50F(ir1Var);
            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
            ir1Var.m6885d0(-1312707512);
            int size2 = w94Var2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                Object obj3 = w94Var2.get(i6);
                ir1Var.m6879a0(1171574969, yp1Var2.invoke(obj3));
                mq1 mq1Var = (mq1) lw2Var.m8132g(obj3);
                if (mq1Var == null) {
                    ir1Var.m6885d0(1959122128);
                } else {
                    ir1Var.m6885d0(1171576145);
                    mq1Var.invoke(ir1Var, 0);
                }
                ir1Var.m6912r(false);
                ir1Var.m6912r(false);
            }
            ir1Var.m6912r(false);
            ir1Var.m6912r(true);
        } else {
            ir1Var.m6874W();
            yp1Var2 = yp1Var;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            yk3VarM6916v.f35300d = new zr0(dp4Var, nt2Var, ag1Var, yp1Var2, pg0Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E0 */
    public static void m12825E0(Executor executor, wd3 wd3Var, int i, PackageManager.NameNotFoundException nameNotFoundException) {
        vg3 vg3Var = new vg3();
        vg3Var.f32597a = wd3Var;
        vg3Var.f32598b = i;
        vg3Var.f32599c = nameNotFoundException;
        VarHandle.storeStoreFence();
        executor.execute(vg3Var);
    }

    /* JADX INFO: renamed from: F */
    public static final void m12826F(Boolean bool, nt2 nt2Var, ag1 ag1Var, String str, pg0 pg0Var, mi0 mi0Var, int i) {
        nt2 nt2Var2;
        String str2;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(-513216493);
        int i2 = i | (ir1Var.m6890g(bool) ? 4 : 2) | 48 | (ir1Var.m6894i(ag1Var) ? 256 : 128) | 3072;
        if (ir1Var.m6871T(i2 & 1, (i2 & 9363) != 9362)) {
            kt2 kt2Var = kt2.f23428a;
            m12824E(zp0.m13668T(bool, "Crossfade", ir1Var, (i2 & 14) | 48, 0), kt2Var, ag1Var, null, pg0Var, ir1Var, i2 & 58352);
            nt2Var2 = kt2Var;
            str2 = "Crossfade";
        } else {
            ir1Var.m6874W();
            nt2Var2 = nt2Var;
            str2 = str;
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            yk3VarM6916v.f35300d = new wr0(bool, nt2Var2, ag1Var, str2, pg0Var, i);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public static final long m12827F0(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    /* JADX INFO: renamed from: G */
    public static final void m12828G(int i, mi0 mi0Var) {
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(546974857);
        if (ir1Var.m6871T(i & 1, i != 0)) {
            a44 a44Var = (a44) ir1Var.m6898k(h44.m6217a());
            boolean zM6890g = ir1Var.m6890g(a44Var);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                zg0 zg0Var = new zg0((byte) 8);
                zg0Var.f36059b = a44Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(zg0Var);
                obj = zg0Var;
            }
            obj = objM6869O;
            gq6.m6081f("Gestures", null, (yp1) obj, ir1Var, 6, 14);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            gv3 gv3Var = new gv3((byte) 12);
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = gv3Var;
        }
    }

    /* JADX INFO: renamed from: G0 */
    public static final boolean m12829G0(int i, C1164t c1164t, sl1 sl1Var, jl3 jl3Var) {
        sl1 sl1VarM12859h0;
        uw2 uw2Var = new uw2(new sl1[16]);
        if (!sl1Var.f25195a.f25208n) {
            q32.m9721c("visitChildren called on an unattached node");
        }
        uw2 uw2Var2 = new uw2(new mt2[16]);
        mt2 mt2Var = sl1Var.f25195a;
        mt2 mt2Var2 = mt2Var.f25200f;
        if (mt2Var2 == null) {
            sc6.m10663e(uw2Var2, mt2Var);
        } else {
            uw2Var2.m11663b(mt2Var2);
        }
        while (true) {
            int i2 = uw2Var2.f32213c;
            if (i2 == 0) {
                break;
            }
            mt2 mt2VarM10644P = (mt2) uw2Var2.m11672l(i2 - 1);
            if ((mt2VarM10644P.f25198d & 1024) == 0) {
                sc6.m10663e(uw2Var2, mt2VarM10644P);
            } else {
                while (mt2VarM10644P != null) {
                    if ((mt2VarM10644P.f25197c & 1024) != 0) {
                        uw2 uw2Var3 = null;
                        while (mt2VarM10644P != null) {
                            if (mt2VarM10644P instanceof sl1) {
                                sl1 sl1Var2 = (sl1) mt2VarM10644P;
                                if (sl1Var2.f25208n) {
                                    uw2Var.m11663b(sl1Var2);
                                }
                            } else if ((mt2VarM10644P.f25197c & 1024) != 0 && (mt2VarM10644P instanceof qx0)) {
                                int i3 = 0;
                                for (mt2 mt2Var3 = ((qx0) mt2VarM10644P).f28863p; mt2Var3 != null; mt2Var3 = mt2Var3.f25200f) {
                                    if ((mt2Var3.f25197c & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            mt2VarM10644P = mt2Var3;
                                        } else {
                                            if (uw2Var3 == null) {
                                                uw2Var3 = new uw2(new mt2[16]);
                                            }
                                            if (mt2VarM10644P != null) {
                                                uw2Var3.m11663b(mt2VarM10644P);
                                                mt2VarM10644P = null;
                                            }
                                            uw2Var3.m11663b(mt2Var3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            mt2VarM10644P = sc6.m10644P(uw2Var3);
                        }
                        break;
                    }
                    mt2VarM10644P = mt2VarM10644P.f25200f;
                }
            }
        }
        while (uw2Var.f32213c != 0 && (sl1VarM12859h0 = m12859h0(uw2Var, jl3Var, i)) != null) {
            if (sl1VarM12859h0.m10855Q0().f19067a) {
                return ((Boolean) c1164t.invoke(sl1VarM12859h0)).booleanValue();
            }
            if (m12863l0(i, c1164t, sl1VarM12859h0, jl3Var)) {
                return true;
            }
            uw2Var.m11671k(sl1VarM12859h0);
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public static final long m12830H(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    /* JADX INFO: renamed from: H0 */
    public static void m12831H0(Status status, Object obj, li4 li4Var) {
        if (status.f16228d <= 0) {
            li4Var.m7988a(obj);
        } else {
            li4Var.f24059a.m8830n(status.f16230f != null ? new mo3(status) : new C1334xk(status));
        }
    }

    /* JADX INFO: renamed from: I */
    public static final void m12832I(rn3 rn3Var, Object obj, nt2 nt2Var, boolean z, boolean z2, pg0 pg0Var, mi0 mi0Var, int i) {
        int i2;
        boolean z3;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(1129341741);
        if ((i & 6) == 0) {
            i2 = (ir1Var.m6890g(rn3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= ir1Var.m6894i(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= ir1Var.m6890g(nt2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= ir1Var.m6892h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z3 = z2;
            i2 |= ir1Var.m6892h(z3) ? 16384 : 8192;
        } else {
            z3 = z2;
        }
        if ((196608 & i) == 0) {
            i2 |= ir1Var.m6894i(pg0Var) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && ir1Var.m6858D()) {
            ir1Var.m6874W();
        } else {
            ir1Var.m6885d0(-1931603123);
            Object objM6869O = ir1Var.m6869O();
            Object obj2 = ki0.f23136a;
            Object obj3 = objM6869O;
            if (objM6869O == obj2) {
                Object objM7398w = k43.m7398w(b33.m3423a(0L));
                ir1Var.m6905n0(objM7398w);
                obj3 = objM7398w;
            }
            sw2 sw2Var = (sw2) obj3;
            ir1Var.m6912r(false);
            ir1Var.m6885d0(-1931600257);
            Object objM6869O2 = ir1Var.m6869O();
            Object obj4 = objM6869O2;
            if (objM6869O2 == obj2) {
                Object c1183ti = new C1183ti(sw2Var, (byte) 7);
                ir1Var.m6905n0(c1183ti);
                obj4 = c1183ti;
            }
            ir1Var.m6912r(false);
            nt2 nt2VarM9120z = oh6.m9120z(nt2Var, (yp1) obj4);
            xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, false);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM9120z);
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
            jh0 jh0Var = ia5.f21217h;
            if (ir1Var.f21682S || !z62.m13387o(ir1Var.m6869O(), Integer.valueOf(iHashCode))) {
                ir1Var.m6905n0(Integer.valueOf(iHashCode));
                ir1Var.m6880b(jh0Var, Integer.valueOf(iHashCode));
            }
            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
            ir1Var.m6885d0(872013070);
            int i3 = i2 & 14;
            byte b = 1;
            boolean zM6890g = (i3 == 4) | ir1Var.m6890g(obj);
            Object objM6869O3 = ir1Var.m6869O();
            Object obj5 = objM6869O3;
            if (zM6890g || objM6869O3 == obj2) {
                C0911mj c0911mj = new C0911mj(sw2Var, b);
                en3 en3Var = new en3();
                en3Var.f18272a = rn3Var;
                en3Var.f18273b = obj;
                en3Var.f18274c = c0911mj;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(en3Var);
                obj5 = en3Var;
            }
            ir1Var.m6912r(false);
            pg0Var.mo183g((en3) obj5, Boolean.valueOf(z3), ir1Var, Integer.valueOf((i2 >> 9) & 1008));
            ir1Var.m6912r(true);
            HashSet hashSet = rn3Var.f29457r;
            Boolean boolValueOf = Boolean.valueOf(z);
            ir1Var.m6885d0(-1931586729);
            int i4 = ((i2 & 7168) == 2048 ? (byte) 1 : (byte) 0) | (i3 != 4 ? (byte) 0 : (byte) 1) | (ir1Var.m6894i(obj) ? 1 : 0);
            Object objM6869O4 = ir1Var.m6869O();
            Object obj6 = objM6869O4;
            if (i4 != 0 || objM6869O4 == obj2) {
                Object it1Var = new it1(z, rn3Var, obj, (wm0) null);
                ir1Var.m6905n0(it1Var);
                obj6 = it1Var;
            }
            ir1Var.m6912r(false);
            lb5.m7927h(hashSet, boolValueOf, (mq1) obj6, ir1Var);
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            yk3VarM6916v.f35300d = new fn3(rn3Var, obj, nt2Var, z, z3, pg0Var, i);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public static final ye1 m12833I0(File file) {
        List list;
        String path = file.getPath();
        int iM12867p0 = m12867p0(path);
        String strSubstring = path.substring(0, iM12867p0);
        String strSubstring2 = path.substring(iM12867p0);
        if (strSubstring2.length() == 0) {
            list = v71.f32439a;
        } else {
            List listM6354t0 = hd4.m6354t0(strSubstring2, new char[]{File.separatorChar});
            ArrayList arrayList = new ArrayList(ib0.m6717y0(listM6354t0, 10));
            Iterator it = listM6354t0.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new ye1(new File(strSubstring), list);
    }

    /* JADX INFO: renamed from: J */
    public static final void m12834J(int i, mi0 mi0Var) {
        Object obj;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(2039417488);
        byte b = 1;
        if (ir1Var.m6871T(i & 1, i != 0)) {
            a44 a44Var = (a44) ir1Var.m6898k(h44.m6217a());
            boolean zM13758C = zt5.m13758C(ir1Var);
            boolean zM12436d = wx2.m12436d(ir1Var);
            hd1 hd1Var = ((od1) ir1Var.m6898k(pd1.m9499d())).f26636a;
            boolean zM6892h = ir1Var.m6892h(zM13758C) | ir1Var.m6892h(zM12436d) | ir1Var.m6890g(a44Var);
            Object objM6869O = ir1Var.m6869O();
            if (zM6892h || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                C0490bg c0490bg = new C0490bg(b);
                c0490bg.f15249b = zM13758C;
                c0490bg.f15250c = zM12436d;
                c0490bg.f15251d = a44Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0490bg);
                obj = c0490bg;
            }
            obj = objM6869O;
            gq6.m6081f("Nav Bar", null, (yp1) obj, ir1Var, 0, 14);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            gv3 gv3Var = new gv3((byte) 11);
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = gv3Var;
        }
    }

    /* JADX INFO: renamed from: J0 */
    public static final String m12835J0(int i, String str) {
        if (str.length() <= i) {
            return str.toString();
        }
        return str.subSequence(0, i).toString() + "...";
    }

    /* JADX INFO: renamed from: K */
    public static String m12836K(C0344tm c0344tm, String str, String str2) {
        C0416yc c0416yc = (C0416yc) c0344tm.m2417y().get(str2.toLowerCase(Locale.ROOT));
        if (c0416yc == null) {
            return "";
        }
        for (C0340tc c0340tc : c0416yc.v$1()) {
            List listM2321x = c0340tc.m2321x();
            if (!(listM2321x instanceof Collection) || !listM2321x.isEmpty()) {
                Iterator it = listM2321x.iterator();
                while (it.hasNext()) {
                    if (Pattern.compile((String) it.next()).matcher(str.toLowerCase(Locale.ROOT)).matches()) {
                        v65 v65VarM2320w = c0340tc.m2320w();
                        if (!v65VarM2320w.isEmpty()) {
                            Iterator<E> it2 = v65VarM2320w.iterator();
                            do {
                                if (it2.hasNext()) {
                                }
                            } while (!Pattern.compile((String) it2.next()).matcher(str.toLowerCase(Locale.ROOT)).matches());
                        }
                        return c0340tc.m2319v().toLowerCase(Locale.ROOT);
                    }
                }
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: K0 */
    public static final boolean m12837K0(Throwable th, wp1 wp1Var) throws IllegalAccessException, InvocationTargetException {
        List listAsList;
        Object objInvoke;
        Integer num = a82.f163a;
        hz0 hz0Var = null;
        if (num == null || num.intValue() >= 19) {
            listAsList = Arrays.asList(th.getSuppressed());
        } else {
            Method method = jb3.f22153b;
            listAsList = (method == null || (objInvoke = method.invoke(th, null)) == null) ? v71.f32439a : Arrays.asList((Throwable[]) objInvoke);
        }
        int size = listAsList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) listAsList.get(i)) instanceof hz0) {
                return false;
            }
        }
        try {
            yh0 yh0Var = (yh0) wp1Var.invoke();
            if (yh0Var != null) {
                boolean z2 = yh0Var.f35221b;
                List list = yh0Var.f35220a;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((ai0) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                hz0Var = new hz0(yh0Var);
            }
        } catch (Throwable th2) {
            hz0Var = th2;
        }
        if (hz0Var != null) {
            se0.m10720f(th, hz0Var);
        }
        return z;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m12838L(Context context) {
        PowerManager powerManager;
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService(KeyguardManager.class);
        if (keyguardManager == null || (powerManager = (PowerManager) context.getSystemService(PowerManager.class)) == null || (activityManager = (ActivityManager) context.getSystemService(ActivityManager.class)) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (Process.myPid() == runningAppProcessInfo.pid) {
                return (powerManager.isInteractive() && !keyguardManager.isKeyguardLocked() && runningAppProcessInfo.importance == 100) ? false : true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: L0 */
    public static final Boolean m12839L0(int i, C1164t c1164t, sl1 sl1Var, jl3 jl3Var) {
        int iOrdinal = sl1Var.m10858T0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                sl1 sl1VarM13847K = zy5.m13847K(sl1Var);
                if (sl1VarM13847K == null) {
                    C1077qn.m9989o("ActiveParent must have a focusedChild");
                    return null;
                }
                int iOrdinal2 = sl1VarM13847K.m10858T0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolM12839L0 = m12839L0(i, c1164t, sl1VarM13847K, jl3Var);
                        if (!z62.m13387o(boolM12839L0, Boolean.FALSE)) {
                            return boolM12839L0;
                        }
                        if (jl3Var == null) {
                            if (sl1VarM13847K.m10858T0() != nl1.f25928b) {
                                C1077qn.m9989o("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            sl1 sl1VarM13844H = zy5.m13844H(sl1VarM13847K);
                            if (sl1VarM13844H == null) {
                                C1077qn.m9989o("ActiveParent must have a focusedChild");
                                return null;
                            }
                            jl3Var = zy5.m13846J(sl1VarM13844H);
                        }
                        return Boolean.valueOf(m12863l0(i, c1164t, sl1Var, jl3Var));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            C0670g.m5864c();
                            return null;
                        }
                        C1077qn.m9989o("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (jl3Var == null) {
                    jl3Var = zy5.m13846J(sl1VarM13847K);
                }
                return Boolean.valueOf(m12863l0(i, c1164t, sl1Var, jl3Var));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    C0670g.m5864c();
                    return null;
                }
                if (sl1Var.m10855Q0().f19067a) {
                    return (Boolean) c1164t.invoke(sl1Var);
                }
                return jl3Var == null ? Boolean.valueOf(m12860i0(sl1Var, i, c1164t)) : Boolean.valueOf(m12829G0(i, c1164t, sl1Var, jl3Var));
            }
        }
        return Boolean.valueOf(m12860i0(sl1Var, i, c1164t));
    }

    /* JADX INFO: renamed from: M */
    public static nt2 m12840M(nt2 nt2Var, ag1 ag1Var) {
        nt2 nt2VarM6620n = i25.m6620n(nt2Var);
        C0853kz c0853kz = ig1.f21378b;
        i74 i74Var = new i74();
        i74Var.f21159a = ag1Var;
        i74Var.f21160b = c0853kz;
        VarHandle.storeStoreFence();
        return nt2VarM6620n.mo7630d(i74Var);
    }

    /* JADX INFO: renamed from: M0 */
    public static final nt2 m12841M0(nt2 nt2Var, a05 a05Var) {
        l42 l42Var = new l42();
        l42Var.f23780a = a05Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(l42Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        r1 = r11 - r19.f22398c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r1 = r19.f22396a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r1 = r9 - r19.f22399d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        r1 = r19.f22397b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        p000.C1077qn.m9989o("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0094, code lost:
    
        p000.C1077qn.m9989o("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m12842N(jl3 jl3Var, jl3 jl3Var2, jl3 jl3Var3, int i) {
        boolean zM12843O = m12843O(i, jl3Var3, jl3Var);
        float f = jl3Var3.f22397b;
        float f2 = jl3Var3.f22399d;
        float f3 = jl3Var3.f22396a;
        float f4 = jl3Var3.f22398c;
        float f5 = jl3Var.f22399d;
        float f6 = jl3Var.f22397b;
        float f7 = jl3Var.f22398c;
        float f8 = jl3Var.f22396a;
        if (!zM12843O && m12843O(i, jl3Var2, jl3Var)) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            C1077qn.m9989o("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: O */
    public static final boolean m12843O(int i, jl3 jl3Var, jl3 jl3Var2) {
        if (i == 3 || i == 4) {
            return jl3Var.f22399d > jl3Var2.f22397b && jl3Var.f22397b < jl3Var2.f22399d;
        }
        if (i == 5 || i == 6) {
            return jl3Var.f22398c > jl3Var2.f22396a && jl3Var.f22396a < jl3Var2.f22398c;
        }
        C1077qn.m9989o("This function should only be used for 2-D focus search");
        return false;
    }

    /* JADX INFO: renamed from: P */
    public static final jl3 m12844P(cf2 cf2Var) {
        cf2 cf2VarMo4011n = cf2Var.mo4011n();
        return cf2VarMo4011n != null ? cf2VarMo4011n.mo4003Q(cf2Var, true) : new jl3(0.0f, 0.0f, (int) (cf2Var.mo4004R() >> 32), (int) (cf2Var.mo4004R() & 4294967295L));
    }

    /* JADX INFO: renamed from: Q */
    public static final jl3 m12845Q(cf2 cf2Var, boolean z) {
        cf2 cf2VarM12861j0 = m12861j0(cf2Var);
        float fMo4004R = (int) (cf2VarM12861j0.mo4004R() >> 32);
        float fMo4004R2 = (int) (cf2VarM12861j0.mo4004R() & 4294967295L);
        jl3 jl3VarMo4003Q = cf2VarM12861j0.mo4003Q(cf2Var, z);
        float f = jl3VarMo4003Q.f22396a;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > fMo4004R) {
                f = fMo4004R;
            }
        }
        float f2 = jl3VarMo4003Q.f22397b;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > fMo4004R2) {
                f2 = fMo4004R2;
            }
        }
        float f3 = jl3VarMo4003Q.f22398c;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= fMo4004R) {
                fMo4004R = f3;
            }
            f3 = fMo4004R;
        }
        float f4 = jl3VarMo4003Q.f22399d;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= fMo4004R2) {
                fMo4004R2 = f5;
            }
            f4 = fMo4004R2;
        }
        if (f == f3 || f2 == f4) {
            return jl3.f22395e;
        }
        long jMo4009k = cf2VarM12861j0.mo4009k((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jMo4009k2 = cf2VarM12861j0.mo4009k((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jMo4009k3 = cf2VarM12861j0.mo4009k((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L));
        long jMo4009k4 = cf2VarM12861j0.mo4009k((((long) Float.floatToRawIntBits(f4)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo4009k >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo4009k2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jMo4009k4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jMo4009k3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jMo4009k & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jMo4009k2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jMo4009k4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jMo4009k3 & 4294967295L));
        return new jl3(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    /* JADX INFO: renamed from: R */
    public static final void m12846R(yp1 yp1Var, Object obj, ro0 ro0Var) throws IllegalAccessException, InvocationTargetException {
        gf0 gf0VarM12847S = m12847S(yp1Var, obj, null);
        if (gf0VarM12847S != null) {
            n40.m8509s(ro0Var, gf0VarM12847S);
        }
    }

    /* JADX INFO: renamed from: S */
    public static final gf0 m12847S(yp1 yp1Var, Object obj, gf0 gf0Var) throws IllegalAccessException, InvocationTargetException {
        try {
            yp1Var.invoke(obj);
            return gf0Var;
        } catch (Throwable th) {
            if (gf0Var != null && gf0Var.getCause() != th) {
                se0.m10720f(gf0Var, th);
                return gf0Var;
            }
            return new gf0("Exception in undelivered element handler for " + obj, th);
        }
    }

    /* JADX INFO: renamed from: U */
    public static void m12848U(String str, boolean z) {
        if (z) {
            return;
        }
        C1077qn.m9987m(str);
    }

    /* JADX INFO: renamed from: V */
    public static void m12849V(boolean z) {
        if (z) {
            return;
        }
        ds3.m4665g();
    }

    /* JADX INFO: renamed from: W */
    public static void m12850W(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            zi4.m13599B(sb, "Must be called on ", name2, " thread, but got ", name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX INFO: renamed from: X */
    public static void m12851X(String str) {
        if (TextUtils.isEmpty(str)) {
            C1077qn.m9987m("Given String is empty or null");
        }
    }

    /* JADX INFO: renamed from: Y */
    public static void m12852Y(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            C1077qn.m9987m(str2);
        }
    }

    /* JADX INFO: renamed from: Z */
    public static void m12853Z(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        C1077qn.m9989o(str);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m12854a0(Object obj) {
        if (obj != null) {
            return;
        }
        xy4.m12782k("null reference");
    }

    /* JADX INFO: renamed from: b0 */
    public static void m12855b0(Object obj, String str) {
        if (obj != null) {
            return;
        }
        xy4.m12782k(str);
    }

    /* JADX INFO: renamed from: c0 */
    public static void m12856c0(String str, boolean z) {
        if (z) {
            return;
        }
        C1077qn.m9989o(str);
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m12857d0(sl1 sl1Var, uw2 uw2Var) {
        if (!sl1Var.f25195a.f25208n) {
            q32.m9721c("visitChildren called on an unattached node");
        }
        uw2 uw2Var2 = new uw2(new mt2[16]);
        mt2 mt2Var = sl1Var.f25195a;
        mt2 mt2Var2 = mt2Var.f25200f;
        if (mt2Var2 == null) {
            sc6.m10663e(uw2Var2, mt2Var);
        } else {
            uw2Var2.m11663b(mt2Var2);
        }
        while (true) {
            int i = uw2Var2.f32213c;
            if (i == 0) {
                return;
            }
            mt2 mt2VarM10644P = (mt2) uw2Var2.m11672l(i - 1);
            if ((mt2VarM10644P.f25198d & 1024) == 0) {
                sc6.m10663e(uw2Var2, mt2VarM10644P);
            } else {
                while (mt2VarM10644P != null) {
                    if ((mt2VarM10644P.f25197c & 1024) != 0) {
                        uw2 uw2Var3 = null;
                        while (mt2VarM10644P != null) {
                            if (mt2VarM10644P instanceof sl1) {
                                sl1 sl1Var2 = (sl1) mt2VarM10644P;
                                if (sl1Var2.f25208n && !sc6.m10652X(sl1Var2).f33310R) {
                                    if (sl1Var2.m10855Q0().f19067a) {
                                        uw2Var.m11663b(sl1Var2);
                                    } else {
                                        m12857d0(sl1Var2, uw2Var);
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
                                            if (uw2Var3 == null) {
                                                uw2Var3 = new uw2(new mt2[16]);
                                            }
                                            if (mt2VarM10644P != null) {
                                                uw2Var3.m11663b(mt2VarM10644P);
                                                mt2VarM10644P = null;
                                            }
                                            uw2Var3.m11663b(mt2Var3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            mt2VarM10644P = sc6.m10644P(uw2Var3);
                        }
                        break;
                    }
                    mt2VarM10644P = mt2VarM10644P.f25200f;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static final nt2 m12858e0(wk2 wk2Var) {
        hu4 hu4Var = new hu4();
        hu4Var.f20884a = wk2Var;
        VarHandle.storeStoreFence();
        return hu4Var;
    }

    /* JADX INFO: renamed from: h0 */
    public static final sl1 m12859h0(uw2 uw2Var, jl3 jl3Var, int i) {
        jl3 jl3VarM7173i;
        sl1 sl1Var = null;
        if (i == 3) {
            jl3VarM7173i = jl3Var.m7173i((jl3Var.f22398c - jl3Var.f22396a) + 1.0f, 0.0f);
        } else if (i == 4) {
            jl3VarM7173i = jl3Var.m7173i(-((jl3Var.f22398c - jl3Var.f22396a) + 1.0f), 0.0f);
        } else if (i == 5) {
            jl3VarM7173i = jl3Var.m7173i(0.0f, (jl3Var.f22399d - jl3Var.f22397b) + 1.0f);
        } else {
            if (i != 6) {
                C1077qn.m9989o("This function should only be used for 2-D focus search");
                return null;
            }
            jl3VarM7173i = jl3Var.m7173i(0.0f, -((jl3Var.f22399d - jl3Var.f22397b) + 1.0f));
        }
        Object[] objArr = uw2Var.f32211a;
        int i2 = uw2Var.f32213c;
        for (int i3 = 0; i3 < i2; i3++) {
            sl1 sl1Var2 = (sl1) objArr[i3];
            if (zy5.m13851O(sl1Var2)) {
                jl3 jl3VarM13846J = zy5.m13846J(sl1Var2);
                if (m12868q0(jl3VarM13846J, jl3VarM7173i, jl3Var, i)) {
                    sl1Var = sl1Var2;
                    jl3VarM7173i = jl3VarM13846J;
                }
            }
        }
        return sl1Var;
    }

    /* JADX INFO: renamed from: i0 */
    public static final boolean m12860i0(sl1 sl1Var, int i, yp1 yp1Var) {
        jl3 jl3Var;
        uw2 uw2Var = new uw2(new sl1[16]);
        m12857d0(sl1Var, uw2Var);
        int i2 = uw2Var.f32213c;
        if (i2 <= 1) {
            sl1 sl1Var2 = (sl1) (i2 == 0 ? null : uw2Var.f32211a[0]);
            if (sl1Var2 != null) {
                return ((Boolean) yp1Var.invoke(sl1Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                jl3 jl3VarM13846J = zy5.m13846J(sl1Var);
                float f = jl3VarM13846J.f22396a;
                float f2 = jl3VarM13846J.f22397b;
                jl3Var = new jl3(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    C1077qn.m9989o("This function should only be used for 2-D focus search");
                    return false;
                }
                jl3 jl3VarM13846J2 = zy5.m13846J(sl1Var);
                float f3 = jl3VarM13846J2.f22398c;
                float f4 = jl3VarM13846J2.f22399d;
                jl3Var = new jl3(f3, f4, f3, f4);
            }
            sl1 sl1VarM12859h0 = m12859h0(uw2Var, jl3Var, i);
            if (sl1VarM12859h0 != null) {
                return ((Boolean) yp1Var.invoke(sl1VarM12859h0)).booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j0 */
    public static final cf2 m12861j0(cf2 cf2Var) {
        cf2 cf2Var2;
        cf2 cf2VarMo4011n = cf2Var.mo4011n();
        while (true) {
            cf2 cf2Var3 = cf2VarMo4011n;
            cf2Var2 = cf2Var;
            cf2Var = cf2Var3;
            if (cf2Var == null) {
                break;
            }
            cf2VarMo4011n = cf2Var.mo4011n();
        }
        e13 e13Var = cf2Var2 instanceof e13 ? (e13) cf2Var2 : null;
        if (e13Var == null) {
            return cf2Var2;
        }
        e13 e13Var2 = e13Var.f17629y;
        while (true) {
            e13 e13Var3 = e13Var2;
            e13 e13Var4 = e13Var;
            e13Var = e13Var3;
            if (e13Var == null) {
                return e13Var4;
            }
            e13Var2 = e13Var.f17629y;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static final void m12862k0(StringBuilder sb, StringBuilder sb2, int i) {
        if (i < 10) {
            sb.append('0');
        }
        sb2.append(i);
    }

    /* JADX INFO: renamed from: l0 */
    public static final boolean m12863l0(int i, C1164t c1164t, sl1 sl1Var, jl3 jl3Var) {
        if (m12829G0(i, c1164t, sl1Var, jl3Var)) {
            return true;
        }
        sl1 sl1VarM3620f = ((bl1) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(sl1Var)).getFocusOwner()).m3620f();
        qb0 qb0Var = new qb0((byte) 2);
        qb0Var.f28353c = sl1VarM3620f;
        qb0Var.f28354d = sl1Var;
        qb0Var.f28355e = jl3Var;
        qb0Var.f28352b = i;
        qb0Var.f28356f = c1164t;
        VarHandle.storeStoreFence();
        Boolean bool = (Boolean) zp0.m13665Q(sl1Var, i, qb0Var);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: m0 */
    public static av1 m12864m0(SSLSession sSLSession) throws IOException {
        List listM13815j;
        List listM13815j2 = v71.f32439a;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            C1077qn.m9989o("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            wb1.m12191j("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        m90 m90VarM6234z = m90.f24744b.m6234z(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            C1077qn.m9989o("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            wb1.m12191j("tlsVersion == NONE");
            return null;
        }
        dn4 dn4VarM12928v = AbstractC1356y5.m12928v(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            listM13815j = peerCertificates != null ? zv4.m13815j(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listM13815j2;
        } catch (SSLPeerUnverifiedException unused) {
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listM13815j2 = zv4.m13815j(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new av1(dn4VarM12928v, m90VarM6234z, listM13815j2, new C0948nj(listM13815j, (byte) 2));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    /* JADX INFO: renamed from: n0 */
    public static byte[] m12865n0(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo packageInfoM12998b = r35.m10189a(context).m12998b(64, str);
        Signature[] signatureArr = packageInfoM12998b.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            for (int i = 0; i < 2; i++) {
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        if (messageDigest != null) {
                            return messageDigest.digest(packageInfoM12998b.signatures[0].toByteArray());
                        }
                    }
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            messageDigest = null;
            if (messageDigest != null) {
                return messageDigest.digest(packageInfoM12998b.signatures[0].toByteArray());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    public static final long m12866o0(js1 js1Var) {
        DragEvent dragEvent = (DragEvent) js1Var.f22555a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    /* JADX INFO: renamed from: p0 */
    public static final int m12867p0(String str) {
        int iM6342h0;
        char c = File.separatorChar;
        int iM6342h1 = hd4.m6342h0(str, c, 0, 4);
        if (iM6342h1 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c || (iM6342h0 = hd4.m6342h0(str, c, 2, 4)) < 0) {
                return 1;
            }
            int iM6342h2 = hd4.m6342h0(str, c, iM6342h0 + 1, 4);
            return iM6342h2 >= 0 ? iM6342h2 + 1 : str.length();
        }
        if (iM6342h1 > 0 && str.charAt(iM6342h1 - 1) == ':') {
            return iM6342h1 + 1;
        }
        if (iM6342h1 == -1 && str.length() > 0 && y62.m12994x(str.charAt(hd4.m6339e0(str)), ':', false)) {
            return str.length();
        }
        return 0;
    }

    /* JADX INFO: renamed from: q0 */
    public static final boolean m12868q0(jl3 jl3Var, jl3 jl3Var2, jl3 jl3Var3, int i) {
        if (!m12869r0(i, jl3Var, jl3Var3)) {
            return false;
        }
        if (m12869r0(i, jl3Var2, jl3Var3) && !m12842N(jl3Var3, jl3Var, jl3Var2, i)) {
            return !m12842N(jl3Var3, jl3Var2, jl3Var, i) && m12870s0(i, jl3Var3, jl3Var) < m12870s0(i, jl3Var3, jl3Var2);
        }
        return true;
    }

    /* JADX INFO: renamed from: r0 */
    public static final boolean m12869r0(int i, jl3 jl3Var, jl3 jl3Var2) {
        if (i == 3) {
            float f = jl3Var2.f22398c;
            float f2 = jl3Var2.f22396a;
            float f3 = jl3Var.f22398c;
            return (f > f3 || f2 >= f3) && f2 > jl3Var.f22396a;
        }
        if (i == 4) {
            float f4 = jl3Var2.f22396a;
            float f5 = jl3Var2.f22398c;
            float f6 = jl3Var.f22396a;
            return (f4 < f6 || f5 <= f6) && f5 < jl3Var.f22398c;
        }
        if (i == 5) {
            float f7 = jl3Var2.f22399d;
            float f8 = jl3Var2.f22397b;
            float f9 = jl3Var.f22399d;
            return (f7 > f9 || f8 >= f9) && f8 > jl3Var.f22397b;
        }
        if (i != 6) {
            C1077qn.m9989o("This function should only be used for 2-D focus search");
            return false;
        }
        float f10 = jl3Var2.f22397b;
        float f11 = jl3Var2.f22399d;
        float f12 = jl3Var.f22397b;
        return (f10 < f12 || f11 <= f12) && f11 < jl3Var.f22399d;
    }

    /* JADX INFO: renamed from: s0 */
    public static final long m12870s0(int i, jl3 jl3Var, jl3 jl3Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = jl3Var.f22396a;
            f2 = jl3Var2.f22398c;
        } else if (i == 4) {
            f = jl3Var2.f22396a;
            f2 = jl3Var.f22398c;
        } else if (i == 5) {
            f = jl3Var.f22397b;
            f2 = jl3Var2.f22399d;
        } else {
            if (i != 6) {
                C1077qn.m9989o("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = jl3Var2.f22397b;
            f2 = jl3Var.f22399d;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = (long) f6;
        if (i == 3 || i == 4) {
            float f7 = jl3Var.f22397b;
            f3 = ((jl3Var.f22399d - f7) / 2.0f) + f7;
            f4 = jl3Var2.f22397b;
            f5 = jl3Var2.f22399d;
        } else {
            if (i != 5 && i != 6) {
                C1077qn.m9989o("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = jl3Var.f22396a;
            f3 = ((jl3Var.f22398c - f8) / 2.0f) + f8;
            f4 = jl3Var2.f22396a;
            f5 = jl3Var2.f22398c;
        }
        long j2 = (long) (f3 - (((f5 - f4) / 2.0f) + f4));
        return (j2 * j2) + (13 * j * j);
    }

    /* JADX INFO: renamed from: t0 */
    public static final boolean m12871t0(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    /* JADX INFO: renamed from: u0 */
    public static synchronized boolean m12872u0(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f34859a;
        if (context2 != null && (bool = f34860b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f34860b = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f34860b = boolValueOf;
        f34859a = applicationContext;
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: v0 */
    public static void m12873v0(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static final nt2 m12874w0(nt2 nt2Var, yp1 yp1Var) {
        ul0 ul0Var = new ul0();
        ul0Var.f31967a = yp1Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(ul0Var);
    }

    /* JADX INFO: renamed from: x0 */
    public static final a52 m12875x0(String str, String str2, int i, yp1 yp1Var) {
        char cCharAt = str.charAt(i);
        if (((Boolean) yp1Var.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return m12876y0(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i);
    }

    /* JADX INFO: renamed from: y0 */
    public static final a52 m12876y0(String str, String str2) {
        return new a52(str2 + " when parsing an Instant from \"" + m12835J0(64, str) + '\"', str);
    }

    /* JADX INFO: renamed from: z0 */
    public static final int m12877z0(int i, String str) {
        return (str.charAt(i + 1) - '0') + ((str.charAt(i) - '0') * 10);
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: A */
    public void mo6718A(pf3 pf3Var, int i, float f) {
        mo12650f0(pf3Var, i);
        mo5928t(f);
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: B */
    public void mo5916B(String str) {
        m12878g0(str);
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: C */
    public void mo5917C(g24 g24Var, int i) {
        m12878g0(Integer.valueOf(i));
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: b */
    public void mo6726b(pf3 pf3Var, int i, double d) {
        mo12650f0(pf3Var, i);
        mo5921g(d);
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: c */
    public void mo5919c() {
        throw new o24("'null' is not supported by default");
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: e */
    public void mo6727e(pf3 pf3Var, int i, short s) {
        mo12650f0(pf3Var, i);
        mo5922h(s);
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: g */
    public void mo5921g(double d) {
        m12878g0(Double.valueOf(d));
    }

    /* JADX INFO: renamed from: g0 */
    public void m12878g0(Object obj) {
        throw new o24("Non-serializable " + rl3.m10361a(obj.getClass()) + " is not supported by " + rl3.m10361a(getClass()) + " encoder");
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: h */
    public void mo5922h(short s) {
        m12878g0(Short.valueOf(s));
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: i */
    public void mo6729i(pf3 pf3Var, int i, boolean z) {
        mo12650f0(pf3Var, i);
        mo5924k(z);
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: j */
    public void mo5923j(byte b) {
        m12878g0(Byte.valueOf(b));
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: k */
    public void mo5924k(boolean z) {
        m12878g0(Boolean.valueOf(z));
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: n */
    public void mo6730n(g24 g24Var, int i, String str) {
        mo12650f0(g24Var, i);
        mo5916B(str);
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: o */
    public void mo6731o(pf3 pf3Var, int i, char c) {
        mo12650f0(pf3Var, i);
        mo5930x(c);
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: p */
    public void mo5927p(int i) {
        m12878g0(Integer.valueOf(i));
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: q */
    public void mo6732q(pf3 pf3Var, int i, long j) {
        mo12650f0(pf3Var, i);
        mo5929v(j);
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: r */
    public void mo6733r(pf3 pf3Var, int i, int i2) {
        mo12650f0(pf3Var, i);
        mo5927p(i2);
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: s */
    public void mo6734s(g24 g24Var, int i, jc2 jc2Var, Object obj) {
        mo12650f0(g24Var, i);
        mo5920d(jc2Var, obj);
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: t */
    public void mo5928t(float f) {
        m12878g0(Float.valueOf(f));
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: u */
    public void mo6735u(g24 g24Var, int i, jc2 jc2Var, Object obj) {
        mo12650f0(g24Var, i);
        m5926m(jc2Var, obj);
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: v */
    public void mo5929v(long j) {
        m12878g0(Long.valueOf(j));
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: w */
    public void mo6736w(pf3 pf3Var, int i, byte b) {
        mo12650f0(pf3Var, i);
        mo5923j(b);
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: x */
    public void mo5930x(char c) {
        m12878g0(Character.valueOf(c));
    }

    @Override // p000.si0
    /* JADX INFO: renamed from: z */
    public g81 mo6738z(pf3 pf3Var, int i) {
        mo12650f0(pf3Var, i);
        return mo5925l(pf3Var.mo4436j(i));
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: a */
    public si0 mo5918a(g24 g24Var) {
        return this;
    }

    @Override // p000.g81
    /* JADX INFO: renamed from: l */
    public g81 mo5925l(g24 g24Var) {
        return this;
    }

    /* JADX INFO: renamed from: T */
    public void mo5617T() {
    }

    /* JADX INFO: renamed from: f */
    public void mo6728f() {
    }

    /* JADX INFO: renamed from: f0 */
    public void mo12650f0(g24 g24Var, int i) {
    }
}
