package p000;

import ads_mobile_sdk.C0313rh;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import essentials.notificationlistener.EsNotificationListenerService;
import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jh0 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22269a;

    public /* synthetic */ jh0(byte b) {
        this.f22269a = b;
    }

    /* JADX INFO: renamed from: b */
    private final Object m7115b(Object obj, Object obj2) {
        gn0 gn0VarM8039a;
        ((Integer) obj2).getClass();
        ir1 ir1Var = (ir1) ((mi0) obj);
        ir1Var.m6885d0(-422662549);
        a44 a44Var = (a44) ir1Var.m6898k(ln0.m8041c());
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            objM6869O = new C0515c5((byte) 17);
            ir1Var.m6905n0(objM6869O);
        }
        wp1 wp1Var = (wp1) objM6869O;
        Object objM6869O2 = ir1Var.m6869O();
        if (objM6869O2 == i50Var) {
            objM6869O2 = C0971o5.f26340c;
            ir1Var.m6905n0(objM6869O2);
        }
        g44 g44VarM6218b = h44.m6218b("package_name", (wp1) objM6869O2, a44Var, wp1Var, ir1Var);
        xz4 xz4Var = (xz4) ir1Var.m6898k(la1.f23888a);
        z93 z93VarM10793B = sj3.m10793B(ir1Var, 0, 1);
        wm0 wm0Var = null;
        if (((String) g44VarM6218b.getValue()) == null) {
            ir1Var.m6885d0(-1549012105);
            pg0 pg0Var = AbstractC1356y5.f34879b;
            boolean zM6890g = ir1Var.m6890g(z93VarM10793B) | ir1Var.m6890g(xz4Var) | ir1Var.m6890g(g44VarM6218b);
            Object objM6869O3 = ir1Var.m6869O();
            if (zM6890g || objM6869O3 == i50Var) {
                C0803jm c0803jm = new C0803jm(z93VarM10793B, xz4Var, g44VarM6218b, wm0Var, (byte) 0);
                ir1Var.m6905n0(c0803jm);
                objM6869O3 = c0803jm;
            }
            gn0VarM8039a = ln0.m8039a("Launch app", null, pg0Var, null, (yp1) objM6869O3, null, C0313rh.f10787g1);
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6885d0(-1548698509);
            mq1 mq1VarM12962c0 = y62.m12962c0(ir1Var);
            String str = (String) g44VarM6218b.getValue();
            Object[] objArr = new Object[0];
            boolean zM6894i = ir1Var.m6894i(mq1VarM12962c0) | ir1Var.m6890g(g44VarM6218b);
            Object objM6869O4 = ir1Var.m6869O();
            byte b = 3;
            if (zM6894i || objM6869O4 == i50Var) {
                objM6869O4 = new C0792jb(mq1VarM12962c0, g44VarM6218b, wm0Var, b);
                ir1Var.m6905n0(objM6869O4);
            }
            sw2 sw2VarM12950R = y62.m12950R(str, objArr, (yp1) objM6869O4, ir1Var);
            Context context = (Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b);
            mq1 mq1VarM7087c = je0.m7087c(false, ir1Var, 3);
            String str2 = (String) sw2VarM12950R.getValue();
            if (str2 == null) {
                str2 = (String) g44VarM6218b.getValue();
            }
            C1017p0 c1017p0 = new C1017p0(b);
            c1017p0.f27254b = g44VarM6218b;
            VarHandle.storeStoreFence();
            pg0 pg0VarM11834R = vd6.m11834R(694364793, c1017p0, ir1Var);
            boolean zM6890g2 = ir1Var.m6890g(z93VarM10793B) | ir1Var.m6894i(context) | ir1Var.m6890g(g44VarM6218b) | ir1Var.m6894i(mq1VarM7087c);
            Object objM6869O5 = ir1Var.m6869O();
            if (zM6890g2 || objM6869O5 == i50Var) {
                objM6869O5 = new C0840km(z93VarM10793B, context, mq1VarM7087c, g44VarM6218b, null, (byte) 0);
                ir1Var.m6905n0(objM6869O5);
            }
            gn0VarM8039a = ln0.m8039a(str2, null, pg0VarM11834R, null, null, (yp1) objM6869O5, 90);
            ir1Var.m6912r(false);
        }
        ir1Var.m6912r(false);
        return gn0VarM8039a;
    }

    /* JADX INFO: renamed from: e */
    private final Object m7116e(Object obj, Object obj2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        on0 on0Var;
        ((Integer) obj2).getClass();
        ir1 ir1Var = (ir1) ((mi0) obj);
        ir1Var.m6885d0(1178408557);
        pg2 pg2Var = AbstractC1266vr.f32803a;
        EnumC1070qg enumC1070qg = EnumC1070qg.f28447b;
        g12 g12Var = (g12) AbstractC1266vr.f32803a.getValue();
        g12 g12Var2 = (g12) AbstractC1266vr.f32804b.getValue();
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            objM6869O = new sg0((byte) 13);
            ir1Var.m6905n0(objM6869O);
        }
        mq1 mq1Var = (mq1) objM6869O;
        C1367yg c1367ygM8515y = n40.m8515y("accelerometer_rotation", enumC1070qg, 1, ir1Var);
        Context context = (Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b);
        g12 g12VarM9116v = oh6.m9116v();
        boolean zM6894i = ir1Var.m6894i(context);
        Object objM6869O2 = ir1Var.m6869O();
        Object obj3 = objM6869O2;
        if (zM6894i || objM6869O2 == i50Var) {
            C1317x3 c1317x3 = new C1317x3((byte) 2);
            c1317x3.f33950b = context;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(c1317x3);
            obj3 = c1317x3;
        }
        z93 z93VarM154a = aa3.m154a("Write settings", "Required to change system settings", g12VarM9116v, (wp1) obj3, new n14((byte) 19), ir1Var);
        String str = ((Number) c1367ygM8515y.f35202a.getValue()).intValue() == 1 ? "On" : "Off";
        if (z62.m13387o(z93VarM154a.mo11770a(), Boolean.TRUE)) {
            on0Var = ((Number) c1367ygM8515y.f35202a.getValue()).intValue() == 1 ? on0.f26897b : on0.f26898c;
        } else {
            on0Var = on0.f26896a;
        }
        on0 on0Var2 = on0Var;
        C0613ei c0613ei = new C0613ei((byte) 10);
        c0613ei.f18113c = g12Var;
        c0613ei.f18114d = g12Var2;
        c0613ei.f18115e = mq1Var;
        c0613ei.f18112b = c1367ygM8515y;
        VarHandle.storeStoreFence();
        pg0 pg0VarM11834R = vd6.m11834R(-1616915291, c0613ei, ir1Var);
        boolean zM6890g = ir1Var.m6890g(z93VarM154a) | ir1Var.m6890g(c1367ygM8515y);
        Object objM6869O3 = ir1Var.m6869O();
        if (zM6890g || objM6869O3 == i50Var) {
            objM6869O3 = new C0792jb(z93VarM154a, c1367ygM8515y, null, (byte) 9);
            ir1Var.m6905n0(objM6869O3);
        }
        gn0 gn0VarM8039a = ln0.m8039a("Auto rotation", str, pg0VarM11834R, on0Var2, null, (yp1) objM6869O3, 80);
        ir1Var.m6912r(false);
        return gn0VarM8039a;
    }

    /* JADX INFO: renamed from: f */
    private final Object m7117f(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ir1 ir1Var = (ir1) ((mi0) obj);
        ir1Var.m6885d0(-714952080);
        C0950nl c0950nl = (C0950nl) ir1Var.m6898k(AbstractC0987ol.m9168a());
        he0 he0Var = (he0) ir1Var.m6898k(je0.f22196a);
        yp1 yp1VarM5366p0 = ev0.m5366p0(ir1Var);
        pg0 pg0Var = ev0.f18493a;
        boolean zM6890g = ir1Var.m6890g(he0Var) | ir1Var.m6894i(c0950nl) | ir1Var.m6890g(yp1VarM5366p0);
        Object objM6869O = ir1Var.m6869O();
        if (zM6890g || objM6869O == ki0.f23136a) {
            C0866lb c0866lb = new C0866lb(he0Var, c0950nl, yp1VarM5366p0, null, (byte) 1);
            ir1Var.m6905n0(c0866lb);
            objM6869O = c0866lb;
        }
        gn0 gn0VarM8039a = ln0.m8039a("Circle to search", null, pg0Var, null, null, (yp1) objM6869O, 90);
        ir1Var.m6912r(false);
        return gn0VarM8039a;
    }

    /* JADX INFO: renamed from: h */
    private final Object m7118h(Object obj, Object obj2) {
        String str;
        on0 on0Var;
        Object obj3;
        ((Integer) obj2).getClass();
        ir1 ir1Var = (ir1) ((mi0) obj);
        ir1Var.m6885d0(85583473);
        wh1 wh1Var = (wh1) se0.m10708W("flashlight_state", 0L, new en0((byte) 18), ir1Var, 6, 14).invoke(ir1Var, 0);
        xb4 xb4Var = wh1Var.f33379a;
        xb4 xb4Var2 = wh1Var.f33379a;
        int iOrdinal = ((sh1) xb4Var.getValue()).ordinal();
        yp1 yp1Var = null;
        if (iOrdinal == 0) {
            str = "Unavailable";
        } else if (iOrdinal == 1) {
            str = "Off";
        } else {
            if (iOrdinal != 2) {
                C0670g.m5864c();
                return null;
            }
            str = "On";
        }
        String str2 = str;
        int iOrdinal2 = ((sh1) xb4Var2.getValue()).ordinal();
        if (iOrdinal2 == 0) {
            on0Var = on0.f26896a;
        } else if (iOrdinal2 == 1) {
            on0Var = on0.f26898c;
        } else {
            if (iOrdinal2 != 2) {
                C0670g.m5864c();
                return null;
            }
            on0Var = on0.f26897b;
        }
        on0 on0Var2 = on0Var;
        if (((sh1) xb4Var2.getValue()) == sh1.f30269a) {
            ir1Var.m6885d0(-1533558059);
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6885d0(-1533542434);
            boolean zM6890g = ir1Var.m6890g(wh1Var);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == ki0.f23136a) {
                obj3 = objM6869O;
                C1020p3 c1020p3 = new C1020p3(wh1Var, false ? 1 : 0, (byte) 4);
                ir1Var.m6905n0(c1020p3);
                obj3 = c1020p3;
            }
            obj3 = objM6869O;
            yp1Var = (yp1) obj3;
            ir1Var.m6912r(false);
        }
        yp1 yp1Var2 = yp1Var;
        C1017p0 c1017p0 = new C1017p0((byte) 21);
        c1017p0.f27254b = wh1Var;
        VarHandle.storeStoreFence();
        gn0 gn0VarM8039a = ln0.m8039a("Flashlight", str2, vd6.m11834R(-872463995, c1017p0, ir1Var), on0Var2, null, yp1Var2, 80);
        ir1Var.m6912r(false);
        return gn0VarM8039a;
    }

    /* JADX INFO: renamed from: i */
    private final Object m7119i(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ir1 ir1Var = (ir1) ((mi0) obj);
        ir1Var.m6885d0(886119026);
        gn0 gn0VarM9718a = AbstractC1057q3.m9718a(2, "Home", gq6.f20038c, null, ir1Var, 438, 120);
        ir1Var.m6912r(false);
        return gn0VarM9718a;
    }

    /* JADX INFO: renamed from: j */
    private final Object m7120j(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ir1 ir1Var = (ir1) ((mi0) obj);
        ir1Var.m6885d0(1686654579);
        C1354y3 c1354y3 = (C1354y3) ir1Var.m6898k(AbstractC0637f4.f18723a);
        byte b = 0;
        z93 z93VarM10793B = sj3.m10793B(ir1Var, 0, 1);
        yp1 yp1VarM7086b = je0.m7086b(ir1Var);
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            objM6869O = new a83(0);
            ir1Var.m6905n0(objM6869O);
        }
        a83 a83Var = (a83) objM6869O;
        ve2 ve2Var = new ve2(b);
        ve2Var.f32556b = a83Var;
        VarHandle.storeStoreFence();
        pg0 pg0VarM11834R = vd6.m11834R(1469899017, ve2Var, ir1Var);
        boolean zM6890g = ir1Var.m6890g(z93VarM10793B) | ir1Var.m6894i(yp1VarM7086b) | ir1Var.m6890g(c1354y3);
        Object objM6869O2 = ir1Var.m6869O();
        if (zM6890g || objM6869O2 == i50Var) {
            C0840km c0840km = new C0840km(z93VarM10793B, yp1VarM7086b, c1354y3, a83Var, null, (byte) 1);
            ir1Var.m6905n0(c0840km);
            objM6869O2 = c0840km;
        }
        gn0 gn0VarM8039a = ln0.m8039a("Last app", null, pg0VarM11834R, null, null, (yp1) objM6869O2, 90);
        ir1Var.m6912r(false);
        return gn0VarM8039a;
    }

    /* JADX INFO: renamed from: k */
    private final Object m7121k(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ir1 ir1Var = (ir1) ((mi0) obj);
        ir1Var.m6885d0(-1807777164);
        gn0 gn0VarM9718a = AbstractC1057q3.m9718a(8, "Lock screen", gq6.f20039d, null, ir1Var, 438, 120);
        ir1Var.m6912r(false);
        return gn0VarM9718a;
    }

    /* JADX WARN: Code duplicated, block: B:95:0x029b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v100, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v101 */
    /* JADX WARN: Type inference failed for: r1v102 */
    /* JADX WARN: Type inference failed for: r1v103 */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v205 */
    /* JADX WARN: Type inference failed for: r1v206 */
    /* JADX WARN: Type inference failed for: r1v93 */
    /* JADX WARN: Type inference failed for: r1v94, types: [mt2] */
    /* JADX WARN: Type inference failed for: r1v98 */
    /* JADX WARN: Type inference failed for: r1v99, types: [mt2] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [uw2] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [uw2] */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        gn0 gn0VarM8039a;
        Object next;
        gn0 gn0VarM8039a2;
        Object obj3;
        Object obj4;
        byte b = this.f22269a;
        kt2 kt2Var = kt2.f23428a;
        wm0 wm0Var = null;
        byte b2 = 12;
        byte b3 = 11;
        i50 i50Var = ki0.f23136a;
        ju4 ju4Var = ju4.f22634a;
        byte b4 = 2;
        byte b5 = 1;
        boolean z = false;
        switch (b) {
            case 0:
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l02.m7759a(k43.m7394s(), null, 0L, ir1Var, 48, 12);
                } else {
                    ir1Var.m6874W();
                }
                return ju4Var;
            case 1:
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    gl4.m6037b("Search..", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var2, 6, 0, 262142);
                } else {
                    ir1Var2.m6874W();
                }
                return ju4Var;
            case 2:
                mi0 mi0Var3 = (mi0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ir1 ir1Var3 = (ir1) mi0Var3;
                if (ir1Var3.m6871T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l02.m7759a(as4.m3224C(), null, 0L, ir1Var3, 48, 12);
                } else {
                    ir1Var3.m6874W();
                }
                return ju4Var;
            case 3:
                mi0 mi0Var4 = (mi0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ir1 ir1Var4 = (ir1) mi0Var4;
                if (ir1Var4.m6871T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    l02.m7759a((g12) o02.f26252i.getValue(), null, 0L, ir1Var4, 48, 12);
                } else {
                    ir1Var4.m6874W();
                }
                return ju4Var;
            case 4:
                mi0 mi0Var5 = (mi0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ir1 ir1Var5 = (ir1) mi0Var5;
                if (!ir1Var5.m6871T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ir1Var5.m6874W();
                }
                return ju4Var;
            case 5:
                mi0 mi0Var6 = (mi0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ir1 ir1Var6 = (ir1) mi0Var6;
                if (ir1Var6.m6871T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    gl4.m6037b("Use system overlay trigger views", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var6, 6, 0, 262142);
                } else {
                    ir1Var6.m6874W();
                }
                return ju4Var;
            case 6:
                mi0 mi0Var7 = (mi0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ir1 ir1Var7 = (ir1) mi0Var7;
                if (ir1Var7.m6871T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    Object objM6869O = ir1Var7.m6869O();
                    if (objM6869O == i50Var) {
                        objM6869O = new dh0(b4);
                        ir1Var7.m6905n0(objM6869O);
                    }
                    cv0.m4169a((yp1) objM6869O, ir1Var7, 6);
                } else {
                    ir1Var7.m6874W();
                }
                return ju4Var;
            case 7:
                mi0 mi0Var8 = (mi0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ir1 ir1Var8 = (ir1) mi0Var8;
                if (ir1Var8.m6871T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    gl4.m6037b("Show Bounds", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var8, 6, 0, 262142);
                } else {
                    ir1Var8.m6874W();
                }
                return ju4Var;
            case 8:
                mi0 mi0Var9 = (mi0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ir1 ir1Var9 = (ir1) mi0Var9;
                if (ir1Var9.m6871T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    gl4.m6037b("Delete", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var9, 6, 0, 262142);
                } else {
                    ir1Var9.m6874W();
                }
                return ju4Var;
            case 9:
                mi0 mi0Var10 = (mi0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ir1 ir1Var10 = (ir1) mi0Var10;
                if (ir1Var10.m6871T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    l02.m7759a(vd6.m11861t(), null, 0L, ir1Var10, 48, 12);
                } else {
                    ir1Var10.m6874W();
                }
                return ju4Var;
            case 10:
                mi0 mi0Var11 = (mi0) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ir1 ir1Var11 = (ir1) mi0Var11;
                if (ir1Var11.m6871T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    i25.m6610b(ir1Var11, n74.m8579g(kt2Var, 40.0f));
                } else {
                    ir1Var11.m6874W();
                }
                return ju4Var;
            case 11:
                mi0 mi0Var12 = (mi0) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ir1 ir1Var12 = (ir1) mi0Var12;
                if (ir1Var12.m6871T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    g12 g12VarM5449e = ks5.f23405n;
                    if (g12VarM5449e == null) {
                        f12 f12Var = new f12("Filled.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i = uw4.f32218a;
                        ga4 ga4Var = new ga4(pb0.f27495b);
                        tv1 tv1Var = new tv1((byte) 1);
                        tv1Var.m11175k(19.0f, 13.0f);
                        tv1Var.m11172h(-6.0f);
                        tv1Var.m11180p(6.0f);
                        tv1Var.m11172h(-2.0f);
                        tv1Var.m11180p(-6.0f);
                        tv1Var.m11171g(5.0f);
                        tv1Var.m11180p(-2.0f);
                        tv1Var.m11172h(6.0f);
                        j93 j93Var = new j93(5.0f);
                        ArrayList arrayList = tv1Var.f31466a;
                        arrayList.add(j93Var);
                        tv1Var.m11172h(2.0f);
                        tv1Var.m11180p(6.0f);
                        tv1Var.m11172h(6.0f);
                        tv1Var.m11180p(2.0f);
                        tv1Var.m11168d();
                        f12.m5445c(f12Var, arrayList, ga4Var, 1.0f, 1.0f, 2, 1.0f, 14336);
                        g12VarM5449e = f12Var.m5449e();
                        ks5.f23405n = g12VarM5449e;
                    }
                    l02.m7759a(g12VarM5449e, null, 0L, ir1Var12, 48, 12);
                } else {
                    ir1Var12.m6874W();
                }
                return ju4Var;
            case 12:
                mi0 mi0Var13 = (mi0) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                ir1 ir1Var13 = (ir1) mi0Var13;
                if (!ir1Var13.m6871T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    ir1Var13.m6874W();
                }
                return ju4Var;
            case 13:
                ((wf2) ((bi0) obj)).m12278f0((nt2) obj2);
                return ju4Var;
            case 14:
                ej0 ej0Var = (ej0) obj2;
                wf2 wf2Var = (wf2) ((bi0) obj);
                wf2Var.f33295C = ej0Var;
                C0940nb c0940nb = wf2Var.f33299G;
                nc4 nc4Var = ij0.f21473h;
                ga3 ga3Var = (ga3) ej0Var;
                ga3Var.getClass();
                wf2Var.m12272b0((ky0) i25.m6603B(ga3Var, nc4Var));
                ga3 ga3Var2 = (ga3) ej0Var;
                df2 df2Var = (df2) i25.m6603B(ga3Var2, ij0.f21479n);
                if (wf2Var.f33293A != df2Var) {
                    wf2Var.f33293A = df2Var;
                    wf2Var.m12253G();
                    wf2 wf2VarM12295v = wf2Var.m12295v();
                    if (wf2VarM12295v != null) {
                        wf2VarM12295v.m12251D();
                    } else {
                        r63 r63Var = wf2Var.f33325o;
                        if (r63Var != null) {
                            ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) r63Var).invalidate();
                        }
                    }
                    wf2Var.m12252E();
                    for (mt2 mt2Var = (mt2) c0940nb.f25610g; mt2Var != null; mt2Var = mt2Var.f25200f) {
                        mt2Var.mo4199z0();
                    }
                }
                wf2Var.m12280g0((fy4) i25.m6603B(ga3Var2, ij0.f21485t));
                mt2 mt2Var2 = (mt2) c0940nb.f25610g;
                if ((mt2Var2.f25198d & 32768) != 0) {
                    while (mt2Var2 != null) {
                        if ((mt2Var2.f25197c & 32768) != 0) {
                            ?? M10644P = mt2Var2;
                            ?? uw2Var = 0;
                            while (M10644P != 0) {
                                if (M10644P instanceof bj0) {
                                    mt2 mt2Var3 = ((mt2) ((bj0) M10644P)).f25195a;
                                    if (mt2Var3.f25208n) {
                                        f13.m5453c(mt2Var3);
                                    } else {
                                        mt2Var3.f25204j = true;
                                    }
                                } else if ((M10644P.f25197c & 32768) != 0 && (M10644P instanceof qx0)) {
                                    mt2 mt2Var4 = ((qx0) M10644P).f28863p;
                                    int i2 = 0;
                                    while (mt2Var4 != null) {
                                        if ((mt2Var4.f25197c & 32768) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                M10644P = M10644P;
                                                uw2Var = uw2Var;
                                                uw2Var = uw2Var;
                                                M10644P = mt2Var4;
                                            } else {
                                                if (uw2Var == 0) {
                                                    uw2Var = new uw2(new mt2[16]);
                                                }
                                                if (M10644P != 0) {
                                                    uw2Var.m11663b(M10644P);
                                                    M10644P = 0;
                                                }
                                                uw2Var.m11663b(mt2Var4);
                                            }
                                        } else {
                                            M10644P = M10644P;
                                            uw2Var = uw2Var;
                                        }
                                        mt2Var4 = mt2Var4.f25200f;
                                        M10644P = M10644P;
                                        uw2Var = uw2Var;
                                    }
                                    if (i2 == 1) {
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
                        if ((mt2Var2.f25198d & 32768) != 0) {
                            mt2Var2 = mt2Var2.f25200f;
                        }
                    }
                }
                return ju4Var;
            case 15:
                ((wf2) ((bi0) obj)).m12276e0((xq2) obj2);
                return ju4Var;
            case 16:
                ((Integer) obj2).getClass();
                ((wf2) ((bi0) obj)).getClass();
                return ju4Var;
            case 17:
                ((Integer) obj2).getClass();
                ir1 ir1Var14 = (ir1) ((mi0) obj);
                ir1Var14.m6885d0(-1811575246);
                a44 a44Var = (a44) ir1Var14.m6898k(ln0.m8041c());
                Object objM6869O2 = ir1Var14.m6869O();
                Object obj5 = objM6869O2;
                if (objM6869O2 == i50Var) {
                    nu3 nu3Var = new nu3(b3);
                    ir1Var14.m6905n0(nu3Var);
                    obj5 = nu3Var;
                }
                wp1 wp1Var = (wp1) obj5;
                Object objM6869O3 = ir1Var14.m6869O();
                Object obj6 = objM6869O3;
                if (objM6869O3 == i50Var) {
                    C0971o5 c0971o5 = C0971o5.f26348k;
                    ir1Var14.m6905n0(c0971o5);
                    obj6 = c0971o5;
                }
                g44 g44VarM6218b = h44.m6218b("shortcut", (wp1) obj6, a44Var, wp1Var, ir1Var14);
                z93 z93VarM10793B = sj3.m10793B(ir1Var14, 0, 1);
                xz4 xz4Var = (xz4) ir1Var14.m6898k(la1.f23888a);
                ea3 ea3Var = (ea3) g44VarM6218b.getValue();
                if (ea3Var == null) {
                    ir1Var14.m6885d0(-92233738);
                    pg0 pg0Var = c20.f15763e;
                    boolean zM6890g = ir1Var14.m6890g(z93VarM10793B) | ir1Var14.m6890g(xz4Var) | ir1Var14.m6890g(g44VarM6218b);
                    Object objM6869O4 = ir1Var14.m6869O();
                    if (zM6890g || objM6869O4 == i50Var) {
                        C0803jm c0803jm = new C0803jm(z93VarM10793B, xz4Var, g44VarM6218b, null, (byte) 2);
                        ir1Var14.m6905n0(c0803jm);
                        objM6869O4 = c0803jm;
                    }
                    gn0VarM8039a = ln0.m8039a("Shortcut", null, pg0Var, null, (yp1) objM6869O4, null, C0313rh.f10787g1);
                    ir1Var14.m6912r(false);
                } else {
                    ir1Var14.m6885d0(-91926528);
                    yp1 yp1VarM5366p0 = ev0.m5366p0(ir1Var14);
                    mq1 mq1VarM7087c = je0.m7087c(false, ir1Var14, 3);
                    String str = ea3Var.f17927a;
                    u04 u04Var = new u04(b4);
                    u04Var.f31581b = ea3Var;
                    VarHandle.storeStoreFence();
                    pg0 pg0VarM11834R = vd6.m11834R(607705121, u04Var, ir1Var14);
                    boolean zM6890g2 = ir1Var14.m6890g(z93VarM10793B) | ir1Var14.m6894i(mq1VarM7087c) | ir1Var14.m6894i(ea3Var) | ir1Var14.m6890g(yp1VarM5366p0) | ir1Var14.m6890g(g44VarM6218b);
                    Object objM6869O5 = ir1Var14.m6869O();
                    if (zM6890g2 || objM6869O5 == i50Var) {
                        nu0 nu0Var = new nu0(z93VarM10793B, mq1VarM7087c, ea3Var, yp1VarM5366p0, g44VarM6218b, null);
                        ir1Var14.m6905n0(nu0Var);
                        objM6869O5 = nu0Var;
                    }
                    gn0VarM8039a = ln0.m8039a(str, null, pg0VarM11834R, null, null, (yp1) objM6869O5, 90);
                    ir1Var14.m6912r(false);
                }
                ir1Var14.m6912r(false);
                return gn0VarM8039a;
            case 18:
                ((Integer) obj2).getClass();
                ir1 ir1Var15 = (ir1) ((mi0) obj);
                ir1Var15.m6885d0(-1011039693);
                Object objM6869O6 = ir1Var15.m6869O();
                if (objM6869O6 == i50Var) {
                    objM6869O6 = new nu3(b2);
                    ir1Var15.m6905n0(objM6869O6);
                }
                wp1 wp1Var2 = (wp1) objM6869O6;
                g12 g12VarM5449e2 = dt0.f17359q;
                if (g12VarM5449e2 == null) {
                    f12 f12Var2 = new f12("SnapchatGhost", 512.0f, 512.0f, 512.0f, 512.0f, 0L, 0, false, 224);
                    ga4 ga4Var2 = new ga4(zy5.m13870e(4278190080L));
                    tv1 tv1Var2 = new tv1((byte) 1);
                    tv1Var2.m11175k(510.85f, 392.67f);
                    tv1Var2.m11170f(-5.21f, 12.16f, -27.24f, 21.09f, -67.36f, 27.32f);
                    tv1Var2.m11170f(-2.06f, 2.79f, -3.78f, 14.69f, -6.51f, 23.96f);
                    tv1Var2.m11170f(-1.63f, 5.57f, -5.62f, 8.87f, -12.13f, 8.87f);
                    tv1Var2.m11174j(-0.3f, -0.0f);
                    tv1Var2.m11170f(-9.4f, 0.0f, -19.2f, -4.32f, -38.85f, -4.32f);
                    tv1Var2.m11170f(-26.52f, 0.0f, -35.66f, 6.04f, -56.25f, 20.59f);
                    tv1Var2.m11170f(-21.83f, 15.44f, -42.77f, 28.76f, -74.03f, 27.4f);
                    tv1Var2.m11170f(-31.65f, 2.33f, -58.03f, -16.91f, -72.87f, -27.4f);
                    tv1Var2.m11170f(-20.71f, -14.64f, -29.83f, -20.58f, -56.24f, -20.58f);
                    tv1Var2.m11170f(-18.86f, 0.0f, -30.74f, 4.72f, -38.85f, 4.72f);
                    tv1Var2.m11170f(-8.07f, 0.0f, -11.21f, -4.92f, -12.42f, -9.04f);
                    tv1Var2.m11170f(-2.7f, -9.19f, -4.4f, -21.26f, -6.52f, -24.13f);
                    tv1Var2.m11170f(-20.68f, -3.21f, -67.31f, -11.34f, -68.5f, -32.15f);
                    a93 a93Var = new a93(10.63f, 10.63f, 0.0f, false, true, 8.88f, -11.07f);
                    ArrayList arrayList2 = tv1Var2.f31466a;
                    arrayList2.add(a93Var);
                    tv1Var2.m11170f(69.58f, -11.45f, 100.92f, -82.9f, 102.23f, -85.93f);
                    tv1Var2.m11170f(0.07f, -0.18f, 0.16f, -0.34f, 0.24f, -0.51f);
                    tv1Var2.m11170f(3.71f, -7.54f, 4.54f, -13.85f, 2.46f, -18.75f);
                    tv1Var2.m11170f(-5.05f, -11.9f, -26.87f, -16.16f, -36.05f, -19.8f);
                    tv1Var2.m11170f(-23.72f, -9.37f, -27.01f, -20.13f, -25.61f, -27.5f);
                    tv1Var2.m11170f(2.44f, -12.84f, 21.73f, -20.74f, 33.0f, -15.45f);
                    tv1Var2.m11170f(8.92f, 4.18f, 16.84f, 6.3f, 23.55f, 6.3f);
                    tv1Var2.m11170f(5.02f, 0.0f, 8.21f, -1.2f, 9.96f, -2.17f);
                    tv1Var2.m11170f(-2.04f, -35.94f, -7.1f, -87.29f, 5.69f, -115.97f);
                    tv1Var2.m11169e(158.12f, 21.3f, 229.71f, 15.42f, 250.83f, 15.42f);
                    tv1Var2.m11170f(0.94f, 0.0f, 9.14f, -0.09f, 10.11f, -0.09f);
                    tv1Var2.m11170f(52.15f, 0.0f, 102.25f, 26.78f, 126.72f, 81.64f);
                    tv1Var2.m11170f(12.78f, 28.65f, 7.75f, 79.79f, 5.7f, 116.01f);
                    tv1Var2.m11170f(1.58f, 0.87f, 4.36f, 1.94f, 8.6f, 2.14f);
                    tv1Var2.m11170f(6.4f, -0.29f, 13.81f, -2.39f, 22.07f, -6.26f);
                    tv1Var2.m11170f(6.09f, -2.85f, 14.41f, -2.46f, 20.48f, 0.06f);
                    tv1Var2.m11174j(0.03f, 0.01f);
                    tv1Var2.m11170f(9.48f, 3.38f, 15.44f, 10.22f, 15.59f, 17.87f);
                    tv1Var2.m11170f(0.18f, 9.75f, -8.52f, 18.17f, -25.88f, 25.02f);
                    tv1Var2.m11170f(-2.12f, 0.83f, -4.69f, 1.65f, -7.43f, 2.53f);
                    tv1Var2.m11170f(-9.8f, 3.11f, -24.6f, 7.8f, -28.62f, 17.27f);
                    tv1Var2.m11170f(-2.08f, 4.9f, -1.26f, 11.21f, 2.46f, 18.75f);
                    tv1Var2.m11170f(0.09f, 0.17f, 0.17f, 0.34f, 0.24f, 0.51f);
                    tv1Var2.m11170f(1.3f, 3.03f, 32.62f, 74.46f, 102.23f, 85.93f);
                    tv1Var2.m11170f(6.43f, 1.06f, 11.16f, 7.88f, 7.72f, 15.86f);
                    tv1Var2.m11168d();
                    f12.m5445c(f12Var2, arrayList2, ga4Var2, 1.0f, 0.0f, 0, 4.0f, 14336);
                    g12VarM5449e2 = f12Var2.m5449e();
                    dt0.f17359q = g12VarM5449e2;
                }
                g12 g12Var = g12VarM5449e2;
                nt2 nt2VarM8579g = n74.m8579g(kt2Var, 20.0f);
                Object objM6869O7 = ir1Var15.m6869O();
                if (objM6869O7 == i50Var) {
                    objM6869O7 = new r54(b4);
                    ir1Var15.m6905n0(objM6869O7);
                }
                gn0 gn0VarM10726i = se0.m10726i("Snapchat", "com.snapchat.android", wp1Var2, g12Var, nt2VarM8579g, (yp1) objM6869O7, ir1Var15, 1597878, 32);
                ir1Var15.m6912r(false);
                return gn0VarM10726i;
            case 19:
                ((Integer) obj2).getClass();
                ir1 ir1Var16 = (ir1) ((mi0) obj);
                ir1Var16.m6885d0(377873004);
                Context applicationContext = ((Context) ir1Var16.m6898k(AndroidCompositionLocals_androidKt.f14651b)).getApplicationContext();
                boolean zM6890g3 = ir1Var16.m6890g(applicationContext);
                Object objM6869O8 = ir1Var16.m6869O();
                if (zM6890g3 || objM6869O8 == i50Var) {
                    objM6869O8 = applicationContext.getSystemService((Class<Object>) SearchManager.class);
                    ir1Var16.m6905n0(objM6869O8);
                }
                SearchManager searchManager = (SearchManager) objM6869O8;
                pg0 pg0Var2 = i20.f21051e;
                boolean zM6894i = ir1Var16.m6894i(searchManager);
                Object objM6869O9 = ir1Var16.m6869O();
                Object obj7 = objM6869O9;
                if (zM6894i || objM6869O9 == i50Var) {
                    C0873li c0873li = new C0873li(searchManager, wm0Var, b5);
                    ir1Var16.m6905n0(c0873li);
                    obj7 = c0873li;
                }
                gn0 gn0VarM8039a3 = ln0.m8039a("Assistant", null, pg0Var2, null, null, (yp1) obj7, 90);
                ir1Var16.m6912r(false);
                return gn0VarM8039a3;
            case 20:
                return m7116e(obj, obj2);
            case 21:
                ((Integer) obj2).getClass();
                ir1 ir1Var17 = (ir1) ((mi0) obj);
                ir1Var17.m6885d0(1978944110);
                gn0 gn0VarM9718a = AbstractC1057q3.m9718a(1, "Back", gq6.f20037b, null, ir1Var17, 438, 120);
                ir1Var17.m6912r(false);
                return gn0VarM9718a;
            case 22:
                ((Integer) obj2).getClass();
                ir1 ir1Var18 = (ir1) ((mi0) obj);
                ir1Var18.m6885d0(-1515487633);
                List list = u60.f31668a;
                Context context = (Context) ir1Var18.m6898k(AndroidCompositionLocals_androidKt.f14651b);
                Object objM6869O10 = ir1Var18.m6869O();
                if (objM6869O10 == i50Var) {
                    objM6869O10 = context.getPackageManager().resolveActivity(new Intent("android.media.action.STILL_IMAGE_CAMERA_SECURE"), 65536).activityInfo.packageName;
                    ir1Var18.m6905n0(objM6869O10);
                }
                String str2 = (String) objM6869O10;
                Object objM6869O11 = ir1Var18.m6869O();
                if (objM6869O11 == i50Var) {
                    objM6869O11 = new C0515c5((byte) 21);
                    ir1Var18.m6905n0(objM6869O11);
                }
                wp1 wp1Var3 = (wp1) objM6869O11;
                g12 g12Var2 = (g12) o02.f26264u.getValue();
                Object objM6869O12 = ir1Var18.m6869O();
                if (objM6869O12 == i50Var) {
                    objM6869O12 = t60.f30795b;
                    ir1Var18.m6905n0(objM6869O12);
                }
                gn0 gn0VarM10726i2 = se0.m10726i("Camera", str2, wp1Var3, g12Var2, null, (yp1) ((xq1) objM6869O12), ir1Var18, 1769862, 16);
                ir1Var18.m6912r(false);
                return gn0VarM10726i2;
            case 23:
                return m7117f(obj, obj2);
            case 24:
                return m7115b(obj, obj2);
            case 25:
                return m7118h(obj, obj2);
            case 26:
                return m7119i(obj, obj2);
            case 27:
                return m7120j(obj, obj2);
            case 28:
                return m7121k(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                ir1 ir1Var19 = (ir1) ((mi0) obj);
                ir1Var19.m6885d0(374074922);
                ir1Var19.m6885d0(113434554);
                a44 a44Var2 = (a44) ir1Var19.m6898k(ln0.m8041c());
                Object objM6869O13 = ir1Var19.m6869O();
                Object obj8 = objM6869O13;
                if (objM6869O13 == i50Var) {
                    da2 da2Var = new da2((byte) 14);
                    ir1Var19.m6905n0(da2Var);
                    obj8 = da2Var;
                }
                wp1 wp1Var4 = (wp1) obj8;
                Object objM6869O14 = ir1Var19.m6869O();
                Object obj9 = objM6869O14;
                if (objM6869O14 == i50Var) {
                    C0971o5 c0971o6 = C0971o5.f26345h;
                    ir1Var19.m6905n0(c0971o6);
                    obj9 = c0971o6;
                }
                g44 g44VarM6218b2 = h44.m6218b("media_action", (wp1) obj9, a44Var2, wp1Var4, ir1Var19);
                C0950nl c0950nl = (C0950nl) ir1Var19.m6898k(AbstractC0987ol.m9168a());
                nc4 nc4Var2 = AndroidCompositionLocals_androidKt.f14651b;
                Context context2 = (Context) ir1Var19.m6898k(nc4Var2);
                g12 g12Var3 = (g12) o02.f26261r.getValue();
                boolean zM6894i2 = ir1Var19.m6894i(context2) | ir1Var19.m6894i(c0950nl);
                Object objM6869O15 = ir1Var19.m6869O();
                Object obj10 = objM6869O15;
                if (zM6894i2 || objM6869O15 == i50Var) {
                    jp1 jp1Var = new jp1(b3);
                    jp1Var.f22485b = context2;
                    jp1Var.f22486c = c0950nl;
                    VarHandle.storeStoreFence();
                    ir1Var19.m6905n0(jp1Var);
                    obj10 = jp1Var;
                }
                z93 z93VarM154a = aa3.m154a("Notification access", "Required to control the current media app", g12Var3, (wp1) obj10, new z13(z ? (byte) 1 : (byte) 0), ir1Var19);
                xz4 xz4Var2 = (xz4) ir1Var19.m6898k(la1.f23888a);
                lr2 lr2Var = (lr2) g44VarM6218b2.getValue();
                boolean z2 = false;
                if (lr2Var == null) {
                    ir1Var19.m6885d0(-810089256);
                    pg0 pg0Var3 = kx5.f23590b;
                    boolean zM6890g4 = ir1Var19.m6890g(z93VarM154a) | ir1Var19.m6890g(xz4Var2) | ir1Var19.m6890g(g44VarM6218b2);
                    Object objM6869O16 = ir1Var19.m6869O();
                    if (zM6890g4 || objM6869O16 == i50Var) {
                        C0803jm c0803jm2 = new C0803jm(z93VarM154a, xz4Var2, g44VarM6218b2, z2 ? 1 : 0, (byte) 1);
                        ir1Var19.m6905n0(c0803jm2);
                        objM6869O16 = c0803jm2;
                    }
                    gn0VarM8039a2 = ln0.m8039a("Media", null, pg0Var3, null, (yp1) objM6869O16, null, C0313rh.f10787g1);
                    ir1Var19.m6912r(false);
                } else {
                    ir1Var19.m6885d0(1636435764);
                    ir1Var19.m6912r(false);
                    Context context3 = (Context) ir1Var19.m6898k(nc4Var2);
                    EsNotificationListenerService esNotificationListenerService = (EsNotificationListenerService) ((b23) ir1Var19.m6898k(y13.f34814a)).f15039b.getValue();
                    Context applicationContext2 = ((Context) ir1Var19.m6898k(nc4Var2)).getApplicationContext();
                    boolean zM6890g5 = ir1Var19.m6890g(applicationContext2);
                    Object objM6869O17 = ir1Var19.m6869O();
                    if (zM6890g5 || objM6869O17 == i50Var) {
                        objM6869O17 = applicationContext2.getSystemService((Class<Object>) MediaSessionManager.class);
                        ir1Var19.m6905n0(objM6869O17);
                    }
                    MediaSessionManager mediaSessionManager = (MediaSessionManager) objM6869O17;
                    Object objM6869O18 = ir1Var19.m6869O();
                    Object obj11 = objM6869O18;
                    if (objM6869O18 == i50Var) {
                        d83 d83VarM7398w = k43.m7398w(v71.f32439a);
                        ir1Var19.m6905n0(d83VarM7398w);
                        obj11 = d83VarM7398w;
                    }
                    sw2 sw2Var = (sw2) obj11;
                    if (esNotificationListenerService != null) {
                        ir1Var19.m6885d0(-809180832);
                        boolean zM6894i3 = ir1Var19.m6894i(context3) | ir1Var19.m6894i(mediaSessionManager);
                        Object objM6869O19 = ir1Var19.m6869O();
                        if (zM6894i3 || objM6869O19 == i50Var) {
                            obj4 = objM6869O19;
                            C1164t c1164t = new C1164t((byte) 20);
                            c1164t.f30700c = context3;
                            c1164t.f30699b = mediaSessionManager;
                            c1164t.f30701d = sw2Var;
                            VarHandle.storeStoreFence();
                            ir1Var19.m6905n0(c1164t);
                            obj4 = c1164t;
                        }
                        lb5.m7923d(mediaSessionManager, (yp1) obj4, ir1Var19);
                        ir1Var19.m6912r(false);
                    } else {
                        ir1Var19.m6885d0(-808619608);
                        ir1Var19.m6912r(false);
                    }
                    Iterator it = ((List) sw2Var.getValue()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            PlaybackState playbackState = ((MediaController) next).getPlaybackState();
                            if (playbackState == null || playbackState.getState() != 3) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    MediaController mediaController = (MediaController) next;
                    if (mediaController == null) {
                        mediaController = (MediaController) hb0.m6301M0((List) sw2Var.getValue());
                    }
                    boolean zM6890g6 = ir1Var19.m6890g(mediaController);
                    Object objM6869O20 = ir1Var19.m6869O();
                    Object obj12 = objM6869O20;
                    if (zM6890g6 || objM6869O20 == i50Var) {
                        d83 d83VarM7398w2 = k43.m7398w(mediaController != null ? mediaController.getPlaybackState() : null);
                        ir1Var19.m6905n0(d83VarM7398w2);
                        obj12 = d83VarM7398w2;
                    }
                    sw2 sw2Var2 = (sw2) obj12;
                    if (mediaController != null) {
                        ir1Var19.m6885d0(-808333664);
                        boolean zM6890g7 = ir1Var19.m6890g(sw2Var2) | ir1Var19.m6894i(mediaController);
                        Object objM6869O21 = ir1Var19.m6869O();
                        if (zM6890g7 || objM6869O21 == i50Var) {
                            obj3 = objM6869O21;
                            na1 na1Var = new na1(b2);
                            na1Var.f25595b = mediaController;
                            na1Var.f25596c = sw2Var2;
                            VarHandle.storeStoreFence();
                            ir1Var19.m6905n0(na1Var);
                            obj3 = na1Var;
                        }
                        lb5.m7923d(mediaController, (yp1) obj3, ir1Var19);
                        ir1Var19.m6912r(false);
                    } else {
                        ir1Var19.m6885d0(-808018456);
                        ir1Var19.m6912r(false);
                    }
                    PlaybackState playbackState2 = (PlaybackState) sw2Var2.getValue();
                    boolean z3 = playbackState2 != null && playbackState2.getState() == 3;
                    if (mediaController == null || ((PlaybackState) sw2Var2.getValue()) == null) {
                        b5 = 0;
                    } else {
                        int iOrdinal = lr2Var.ordinal();
                        if (iOrdinal == 0) {
                            long actions = ((PlaybackState) sw2Var2.getValue()).getActions();
                            if (!z3 ? !((actions & 4) != 0 || (actions & 512) != 0) : !((actions & 2) != 0 || (actions & 512) != 0)) {
                                b5 = 0;
                            }
                        } else if (iOrdinal == 1 ? (((PlaybackState) sw2Var2.getValue()).getActions() & 32) == 0 : iOrdinal != 2 || (((PlaybackState) sw2Var2.getValue()).getActions() & 16) == 0) {
                            b5 = 0;
                        }
                    }
                    String str3 = (String) lr2Var.f24314a.invoke((PlaybackState) sw2Var2.getValue());
                    er1 er1Var = new er1((byte) 7);
                    er1Var.f18412b = lr2Var;
                    er1Var.f18413c = sw2Var2;
                    VarHandle.storeStoreFence();
                    pg0 pg0VarM11834R2 = vd6.m11834R(592412887, er1Var, ir1Var19);
                    on0 on0Var = b5 != 0 ? on0.f26898c : on0.f26896a;
                    boolean zM6890g8 = ir1Var19.m6890g(z93VarM154a) | ir1Var19.m6894i(mediaController) | ir1Var19.m6886e(lr2Var.ordinal()) | ir1Var19.m6892h(z3);
                    Object objM6869O22 = ir1Var19.m6869O();
                    if (zM6890g8 || objM6869O22 == i50Var) {
                        objM6869O22 = new pr2(z93VarM154a, mediaController, lr2Var, z3, null);
                        ir1Var19.m6905n0(objM6869O22);
                    }
                    gn0VarM8039a2 = ln0.m8039a(str3, null, pg0VarM11834R2, on0Var, null, (yp1) objM6869O22, 82);
                }
                ir1Var19.m6912r(false);
                ir1Var19.m6912r(false);
                return gn0VarM8039a2;
        }
    }
}
