package p000;

import ads_mobile_sdk.C0313rh;
import ads_mobile_sdk.a83;
import ads_mobile_sdk.b23;
import ads_mobile_sdk.bj0;
import ads_mobile_sdk.f33;
import ads_mobile_sdk.g93;
import ads_mobile_sdk.jj0;
import ads_mobile_sdk.jo1;
import ads_mobile_sdk.l93;
import ads_mobile_sdk.my3;
import ads_mobile_sdk.sg0;
import ads_mobile_sdk.sy3;
import ads_mobile_sdk.tq1;
import ads_mobile_sdk.z01;
import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class en0 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18267a;

    public /* synthetic */ en0(byte b) {
        this.f18267a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v3, types: [yp1] */
    /* JADX WARN: Type inference failed for: r9v0, types: [wm0] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        sd0 sd0Var;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        byte b = this.f18267a;
        r71 r71Var = r71.f29063a;
        byte b2 = 10;
        byte b3 = 2;
        i50 i50Var = ki0.f23136a;
        byte b4 = 3;
        ?? r9 = 0;
        String str = null;
        xn2 xn2Var = null;
        xn2 xn2Var2 = null;
        ju4 ju4Var = ju4.f22634a;
        boolean z = true;
        z = true;
        byte b5 = 0;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ir1 ir1Var = (ir1) ((mi0) obj);
                ir1Var.m6885d0(1174610475);
                g12 g12VarM5449e = gq6.f20051p;
                if (g12VarM5449e == null) {
                    f12 f12Var = new f12("Filled.Notifications", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i = uw4.f32218a;
                    ga4 ga4Var = new ga4(pb0.f27495b);
                    tv1 tv1Var = new tv1((byte) 1);
                    tv1Var.m11175k(12.0f, 22.0f);
                    tv1Var.m11170f(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                    tv1Var.m11172h(-4.0f);
                    tv1Var.m11170f(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                    tv1Var.m11168d();
                    tv1Var.m11175k(18.0f, 16.0f);
                    tv1Var.m11180p(-5.0f);
                    tv1Var.m11170f(0.0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f);
                    tv1Var.m11173i(13.5f, 4.0f);
                    tv1Var.m11170f(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
                    tv1Var.m11177m(-1.5f, 0.67f, -1.5f, 1.5f);
                    tv1Var.m11180p(0.68f);
                    tv1Var.m11169e(7.63f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
                    tv1Var.m11180p(5.0f);
                    tv1Var.m11174j(-2.0f, 2.0f);
                    tv1Var.m11180p(1.0f);
                    tv1Var.m11172h(16.0f);
                    tv1Var.m11180p(-1.0f);
                    tv1Var.m11174j(-2.0f, -2.0f);
                    tv1Var.m11168d();
                    f12.m5445c(f12Var, tv1Var.f31466a, ga4Var, 1.0f, 1.0f, 2, 1.0f, 14336);
                    g12VarM5449e = f12Var.m5449e();
                    gq6.f20051p = g12VarM5449e;
                }
                gn0 gn0VarM3800E = c20.m3800E("Notifications", g12VarM5449e, oh4.f26701c, ir1Var);
                ir1Var.m6912r(false);
                return gn0VarM3800E;
            case 1:
                ((Integer) obj2).getClass();
                ir1 ir1Var2 = (ir1) ((mi0) obj);
                ir1Var2.m6885d0(1975146028);
                gn0 gn0VarM9718a = AbstractC1057q3.m9718a(6, "Power dialog", gq6.f20040e, null, ir1Var2, 25014, C0313rh.f10760V0);
                ir1Var2.m6912r(false);
                return gn0VarM9718a;
            case 2:
                ((Integer) obj2).getClass();
                ir1 ir1Var3 = (ir1) ((mi0) obj);
                ir1Var3.m6885d0(-1519285715);
                gn0 gn0VarM3800E2 = c20.m3800E("Quick settings", oh6.m9116v(), oh4.f26702d, ir1Var3);
                ir1Var3.m6912r(false);
                return gn0VarM3800E2;
            case 3:
                ((Integer) obj2).getClass();
                ir1 ir1Var4 = (ir1) ((mi0) obj);
                ir1Var4.m6885d0(-718750162);
                gn0 gn0VarM9718a2 = AbstractC1057q3.m9718a(3, "Recent apps", gq6.f20041f, null, ir1Var4, 1769910, 24);
                ir1Var4.m6912r(false);
                return gn0VarM9718a2;
            case 4:
                ((Integer) obj2).getClass();
                ir1 ir1Var5 = (ir1) ((mi0) obj);
                ir1Var5.m6885d0(81785391);
                pg2 pg2Var = AbstractC1057q3.f28187a;
                pg0 pg0Var = gq6.f20042g;
                ir1Var5.m6885d0(-1074814746);
                he0 he0Var = (he0) ir1Var5.m6898k(je0.f22196a);
                if (he0Var == null) {
                    ir1Var5.m6885d0(-1894587332);
                    ir1Var5.m6912r(false);
                } else {
                    ir1Var5.m6885d0(-1894570622);
                    boolean zM6890g = ir1Var5.m6890g(he0Var);
                    Object objM6869O = ir1Var5.m6869O();
                    if (zM6890g || objM6869O == i50Var) {
                        objM6869O = new C1020p3(he0Var, r9, b5);
                        ir1Var5.m6905n0(objM6869O);
                    }
                    ir1Var5.m6912r(false);
                    r9 = (yp1) objM6869O;
                }
                ?? r16 = r9;
                ir1Var5.m6912r(false);
                gn0 gn0VarM9718a3 = AbstractC1057q3.m9718a(9, "Screenshot", pg0Var, r16, ir1Var5, 25014, 96);
                ir1Var5.m6912r(false);
                return gn0VarM9718a3;
            case 5:
                ((Integer) obj2).getClass();
                ir1 ir1Var6 = (ir1) ((mi0) obj);
                ir1Var6.m6885d0(882320944);
                int i2 = ox3.f27193g;
                AbstractC1128s0 abstractC1128s0 = (AbstractC1128s0) se0.m10708W("scroll_to_top_control_state", 0L, new gv3((byte) 13), ir1Var6, 6, 14).invoke(ir1Var6, 0);
                ir1Var6.m6912r(false);
                return abstractC1128s0;
            case 6:
                ((Integer) obj2).getClass();
                ir1 ir1Var7 = (ir1) ((mi0) obj);
                ir1Var7.m6885d0(1682856497);
                mq1 mq1VarM7087c = je0.m7087c(false, ir1Var7, 3);
                z93 z93VarM10793B = sj3.m10793B(ir1Var7, 0, 1);
                pg0 pg0Var2 = qs5.f28773f;
                boolean zM6890g2 = ir1Var7.m6890g(z93VarM10793B) | ir1Var7.m6894i(mq1VarM7087c);
                Object objM6869O2 = ir1Var7.m6869O();
                if (zM6890g2 || objM6869O2 == i50Var) {
                    objM6869O2 = new ge0(z93VarM10793B, mq1VarM7087c, r9, b4);
                    ir1Var7.m6905n0(objM6869O2);
                }
                gn0 gn0VarM8039a = ln0.m8039a("Search", null, pg0Var2, null, null, (yp1) objM6869O2, 90);
                ir1Var7.m6912r(false);
                return gn0VarM8039a;
            case 7:
                po0 po0Var = (po0) obj2;
                ro0 ro0VarMinusKey = ((ro0) obj).minusKey(po0Var.getKey());
                if (ro0VarMinusKey == r71Var) {
                    return po0Var;
                }
                gb5 gb5Var = gb5.f19711b;
                so0 so0Var = (so0) ro0VarMinusKey.get(gb5Var);
                if (so0Var == null) {
                    sd0Var = new sd0(ro0VarMinusKey, po0Var);
                } else {
                    ro0 ro0VarMinusKey2 = ro0VarMinusKey.minusKey(gb5Var);
                    if (ro0VarMinusKey2 == r71Var) {
                        return new sd0(po0Var, so0Var);
                    }
                    sd0Var = new sd0(new sd0(ro0VarMinusKey2, po0Var), so0Var);
                }
                return sd0Var;
            case 8:
                po0 po0Var2 = (po0) obj2;
                if (!((Boolean) obj).booleanValue() && !(po0Var2 instanceof my3)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                ro0 ro0Var = (ro0) obj;
                po0 po0Var3 = (po0) obj2;
                return po0Var3 instanceof my3 ? ro0Var.plus(new my3()) : ro0Var.plus(po0Var3);
            case 10:
                ((Integer) obj2).getClass();
                ir1 ir1Var8 = (ir1) ((mi0) obj);
                ir1Var8.m6885d0(-1962046739);
                C1354y3 c1354y3 = (C1354y3) ir1Var8.m6898k(AbstractC0637f4.f18723a);
                Object objM6869O3 = ir1Var8.m6869O();
                Object obj8 = objM6869O3;
                if (objM6869O3 == i50Var) {
                    d83 d83VarM7398w = k43.m7398w(null);
                    ir1Var8.m6905n0(d83VarM7398w);
                    obj8 = d83VarM7398w;
                }
                sw2 sw2Var = (sw2) obj8;
                Object objM6869O4 = ir1Var8.m6869O();
                Object obj9 = objM6869O4;
                if (objM6869O4 == i50Var) {
                    zo0 zo0VarM7942w = lb5.m7942w(r71Var, ir1Var8);
                    ir1Var8.m6905n0(zo0VarM7942w);
                    obj9 = zo0VarM7942w;
                }
                zo0 zo0Var = (zo0) obj9;
                Object objM6869O5 = ir1Var8.m6869O();
                Object obj10 = objM6869O5;
                if (objM6869O5 == i50Var) {
                    d83 d83VarM7398w2 = k43.m7398w(null);
                    ir1Var8.m6905n0(d83VarM7398w2);
                    obj10 = d83VarM7398w2;
                }
                sw2 sw2Var2 = (sw2) obj10;
                boolean zM6890g3 = ir1Var8.m6890g(zo0Var) | ir1Var8.m6890g(c1354y3);
                Object objM6869O6 = ir1Var8.m6869O();
                Object obj11 = objM6869O6;
                if (zM6890g3 || objM6869O6 == i50Var) {
                    C0762ii c0762ii = new C0762ii(b3);
                    c0762ii.f21430b = zo0Var;
                    c0762ii.f21431c = sw2Var2;
                    c0762ii.f21432d = c1354y3;
                    c0762ii.f21433e = sw2Var;
                    VarHandle.storeStoreFence();
                    ir1Var8.m6905n0(c0762ii);
                    obj11 = c0762ii;
                }
                AbstractC0637f4.m5467b(32, false, null, (yp1) obj11, ir1Var8, 6, 6);
                xn2 xn2Var3 = (xn2) ir1Var8.m6898k(yn2.f35357b);
                if (xn2Var3 == null) {
                    ir1Var8.m6885d0(-1476823888);
                    ir1Var8.m6912r(false);
                } else {
                    ir1Var8.m6885d0(-1476823887);
                    boolean zM6890g4 = ir1Var8.m6890g("CurrentApp") | ir1Var8.m6890g(xn2Var3);
                    Object objM6869O7 = ir1Var8.m6869O();
                    if (zM6890g4 || objM6869O7 == i50Var) {
                        obj3 = objM6869O7;
                        xn2 xn2VarM12723c = xn2Var3.m12723c("CurrentApp");
                        ir1Var8.m6905n0(xn2VarM12723c);
                        obj3 = xn2VarM12723c;
                    }
                    xn2Var2 = (xn2) obj3;
                    ir1Var8.m6912r(false);
                }
                if (xn2Var2 != null) {
                    ir1Var8.m6885d0(-1123785896);
                    String str2 = (String) sw2Var.getValue();
                    boolean zM6894i = ir1Var8.m6894i(xn2Var2);
                    Object objM6869O8 = ir1Var8.m6869O();
                    if (zM6894i || objM6869O8 == i50Var) {
                        obj4 = objM6869O8;
                        C0675g4 c0675g4 = new C0675g4((byte) 21);
                        c0675g4.f19600b = xn2Var2;
                        c0675g4.f19601c = sw2Var;
                        VarHandle.storeStoreFence();
                        ir1Var8.m6905n0(c0675g4);
                        obj4 = c0675g4;
                    }
                    lb5.m7932m(str2, (wp1) obj4, ir1Var8);
                    ir1Var8.m6912r(false);
                } else {
                    ir1Var8.m6885d0(-1123696523);
                    ir1Var8.m6912r(false);
                }
                String str3 = (String) sw2Var.getValue();
                ir1Var8.m6912r(false);
                return str3;
            case 11:
                Throwable cancellationException = (Throwable) obj2;
                cf0 cf0Var = ((ks2) obj).f23380b;
                if (cancellationException == null) {
                    cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                cf0Var.m4989U(new ff0(cancellationException, false));
                return ju4Var;
            case 12:
                ((Integer) obj2).getClass();
                cv0.m4171c(vd6.m11838V(1), (mi0) obj);
                return ju4Var;
            case 13:
                ((Integer) obj2).getClass();
                cv0.m4170b(vd6.m11838V(1), (mi0) obj);
                return ju4Var;
            case 14:
                ((Integer) obj2).getClass();
                ir1 ir1Var9 = (ir1) ((mi0) obj);
                ir1Var9.m6885d0(624205497);
                xn2 xn2Var4 = (xn2) ir1Var9.m6898k(yn2.f35357b);
                if (xn2Var4 == null) {
                    ir1Var9.m6885d0(-1476823888);
                    ir1Var9.m6912r(false);
                } else {
                    ir1Var9.m6885d0(-1476823887);
                    boolean zM6890g5 = ir1Var9.m6890g("ScreenState") | ir1Var9.m6890g(xn2Var4);
                    Object objM6869O9 = ir1Var9.m6869O();
                    if (zM6890g5 || objM6869O9 == i50Var) {
                        obj5 = objM6869O9;
                        xn2 xn2VarM12723c2 = xn2Var4.m12723c("ScreenState");
                        ir1Var9.m6905n0(xn2VarM12723c2);
                        obj5 = xn2VarM12723c2;
                    }
                    xn2Var = (xn2) obj5;
                    ir1Var9.m6912r(false);
                }
                xz4 xz4Var = (xz4) ir1Var9.m6898k(la1.f23888a);
                nc4 nc4Var = AndroidCompositionLocals_androidKt.f14651b;
                Context applicationContext = ((Context) ir1Var9.m6898k(nc4Var)).getApplicationContext();
                boolean zM6890g6 = ir1Var9.m6890g(applicationContext);
                Object objM6869O10 = ir1Var9.m6869O();
                if (zM6890g6 || objM6869O10 == i50Var) {
                    objM6869O10 = applicationContext.getSystemService((Class<Object>) PowerManager.class);
                    ir1Var9.m6905n0(objM6869O10);
                }
                PowerManager powerManager = (PowerManager) objM6869O10;
                Context applicationContext2 = ((Context) ir1Var9.m6898k(nc4Var)).getApplicationContext();
                boolean zM6890g7 = ir1Var9.m6890g(applicationContext2);
                Object objM6869O11 = ir1Var9.m6869O();
                if (zM6890g7 || objM6869O11 == i50Var) {
                    objM6869O11 = applicationContext2.getSystemService((Class<Object>) KeyguardManager.class);
                    ir1Var9.m6905n0(objM6869O11);
                }
                KeyguardManager keyguardManager = (KeyguardManager) objM6869O11;
                Object objM6869O12 = ir1Var9.m6869O();
                Object obj12 = objM6869O12;
                if (objM6869O12 == i50Var) {
                    dz0 dz0Var = new dz0();
                    dz0Var.f17513d = powerManager;
                    dz0Var.f17514e = keyguardManager;
                    dz0Var.f17515f = xn2Var;
                    dz0Var.f17516g = xz4Var;
                    dz0Var.f17510a = k43.m7398w(powerManager.isInteractive() ? keyguardManager.isDeviceLocked() ? uw3.f32215b : uw3.f32216c : uw3.f32214a);
                    xy0 xy0Var = new xy0((byte) 0);
                    xy0Var.f34713b = dz0Var;
                    VarHandle.storeStoreFence();
                    dz0Var.f17511b = s94.m10566b(xy0Var);
                    xy0 xy0Var2 = new xy0((byte) 1);
                    xy0Var2.f34713b = dz0Var;
                    VarHandle.storeStoreFence();
                    dz0Var.f17512c = s94.m10566b(xy0Var2);
                    VarHandle.storeStoreFence();
                    ir1Var9.m6905n0(dz0Var);
                    obj12 = dz0Var;
                }
                dz0 dz0Var2 = (dz0) obj12;
                String[] strArr = {"android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.USER_PRESENT"};
                boolean zM6894i2 = ir1Var9.m6894i(powerManager) | ir1Var9.m6894i(keyguardManager);
                Object objM6869O13 = ir1Var9.m6869O();
                Object obj13 = objM6869O13;
                if (zM6894i2 || objM6869O13 == i50Var) {
                    C1164t c1164t = new C1164t((byte) 11);
                    c1164t.f30700c = dz0Var2;
                    c1164t.f30699b = powerManager;
                    c1164t.f30701d = keyguardManager;
                    VarHandle.storeStoreFence();
                    ir1Var9.m6905n0(c1164t);
                    obj13 = c1164t;
                }
                r30.m10185b(strArr, null, null, (yp1) obj13, ir1Var9, 0);
                uw3 uw3Var = (uw3) dz0Var2.f17510a.getValue();
                boolean zM6894i3 = ir1Var9.m6894i(xn2Var);
                Object objM6869O14 = ir1Var9.m6869O();
                Object obj14 = objM6869O14;
                if (zM6894i3 || objM6869O14 == i50Var) {
                    C0675g4 c0675g5 = new C0675g4((byte) 24);
                    c0675g5.f19600b = xn2Var;
                    c0675g5.f19601c = dz0Var2;
                    VarHandle.storeStoreFence();
                    ir1Var9.m6905n0(c0675g5);
                    obj14 = c0675g5;
                }
                lb5.m7932m(uw3Var, (wp1) obj14, ir1Var9);
                ir1Var9.m6912r(false);
                return dz0Var2;
            case 15:
                ((Integer) obj2).getClass();
                gq6.m6076a(vd6.m11838V(1), (mi0) obj);
                return ju4Var;
            case 16:
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var10 = (ir1) mi0Var;
                if (ir1Var10.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var10.m6885d0(1747088866);
                    ir1Var10.m6912r(false);
                } else {
                    ir1Var10.m6874W();
                }
                return ju4Var;
            case 17:
                ih0 ih0Var = ih0.f21417c;
                ((Integer) obj2).getClass();
                i20.m6584i(vd6.m11838V(1), (mi0) obj);
                return ju4Var;
            case 18:
                ((Integer) obj2).getClass();
                ir1 ir1Var11 = (ir1) ((mi0) obj);
                ir1Var11.m6885d0(838481960);
                Context applicationContext3 = ((Context) ir1Var11.m6898k(AndroidCompositionLocals_androidKt.f14651b)).getApplicationContext();
                boolean zM6890g8 = ir1Var11.m6890g(applicationContext3);
                Object objM6869O15 = ir1Var11.m6869O();
                if (zM6890g8 || objM6869O15 == i50Var) {
                    objM6869O15 = applicationContext3.getSystemService((Class<Object>) CameraManager.class);
                    ir1Var11.m6905n0(objM6869O15);
                }
                CameraManager cameraManager = (CameraManager) objM6869O15;
                Object objM6869O16 = ir1Var11.m6869O();
                if (objM6869O16 == i50Var) {
                    for (String str4 : cameraManager.getCameraIdList()) {
                        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str4);
                        boolean zM13387o = z62.m13387o(cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE), Boolean.TRUE);
                        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                        boolean z2 = num != null && num.intValue() == 1;
                        if (zM13387o && z2) {
                            str = str4;
                            ir1Var11.m6905n0(str);
                            objM6869O16 = str;
                        }
                    }
                    ir1Var11.m6905n0(str);
                    objM6869O16 = str;
                }
                String str5 = (String) objM6869O16;
                Object objM6869O17 = ir1Var11.m6869O();
                Object obj15 = objM6869O17;
                if (objM6869O17 == i50Var) {
                    d83 d83VarM7398w3 = k43.m7398w(Boolean.FALSE);
                    ir1Var11.m6905n0(d83VarM7398w3);
                    obj15 = d83VarM7398w3;
                }
                sw2 sw2Var3 = (sw2) obj15;
                if (str5 != null) {
                    ir1Var11.m6885d0(-313144993);
                    boolean zM6894i4 = ir1Var11.m6894i(cameraManager);
                    Object objM6869O18 = ir1Var11.m6869O();
                    if (zM6894i4 || objM6869O18 == i50Var) {
                        obj7 = objM6869O18;
                        th1 th1Var = new th1((byte) 0);
                        th1Var.f31166b = cameraManager;
                        th1Var.f31167c = str5;
                        th1Var.f31168d = sw2Var3;
                        VarHandle.storeStoreFence();
                        ir1Var11.m6905n0(th1Var);
                        obj7 = th1Var;
                    }
                    lb5.m7923d(ju4Var, (yp1) obj7, ir1Var11);
                    ir1Var11.m6912r(false);
                } else {
                    ir1Var11.m6885d0(-312534758);
                    ir1Var11.m6912r(false);
                }
                Object objM6869O19 = ir1Var11.m6869O();
                Object obj16 = objM6869O19;
                if (objM6869O19 == i50Var) {
                    d83 d83VarM7398w4 = k43.m7398w(Boolean.FALSE);
                    ir1Var11.m6905n0(d83VarM7398w4);
                    obj16 = d83VarM7398w4;
                }
                sw2 sw2Var4 = (sw2) obj16;
                if (((Boolean) sw2Var3.getValue()).booleanValue()) {
                    ir1Var11.m6885d0(-312435310);
                    boolean zM6894i5 = ir1Var11.m6894i(cameraManager);
                    Object objM6869O20 = ir1Var11.m6869O();
                    if (zM6894i5 || objM6869O20 == i50Var) {
                        obj6 = objM6869O20;
                        th1 th1Var2 = new th1((byte) 1);
                        th1Var2.f31166b = cameraManager;
                        th1Var2.f31167c = str5;
                        th1Var2.f31168d = sw2Var4;
                        VarHandle.storeStoreFence();
                        ir1Var11.m6905n0(th1Var2);
                        obj6 = th1Var2;
                    }
                    lb5.m7923d(ju4Var, (yp1) obj6, ir1Var11);
                    ir1Var11.m6912r(false);
                } else {
                    ir1Var11.m6885d0(-311997094);
                    ir1Var11.m6912r(false);
                }
                Object objM6869O21 = ir1Var11.m6869O();
                Object obj17 = objM6869O21;
                if (objM6869O21 == i50Var) {
                    ld1 ld1Var = new ld1(true ? (byte) 1 : (byte) 0);
                    ld1Var.f23961b = sw2Var3;
                    ld1Var.f23962c = sw2Var4;
                    VarHandle.storeStoreFence();
                    wy0 wy0VarM10566b = s94.m10566b(ld1Var);
                    ir1Var11.m6905n0(wy0VarM10566b);
                    obj17 = wy0VarM10566b;
                }
                xb4 xb4Var = (xb4) obj17;
                Object objM6869O22 = ir1Var11.m6869O();
                Object obj18 = objM6869O22;
                if (objM6869O22 == i50Var) {
                    wh1 wh1Var = new wh1();
                    wh1Var.f33379a = xb4Var;
                    wh1Var.f33380b = cameraManager;
                    wh1Var.f33381c = str5;
                    wh1Var.f33382d = sw2Var3;
                    wh1Var.f33383e = sw2Var4;
                    VarHandle.storeStoreFence();
                    ir1Var11.m6905n0(wh1Var);
                    obj18 = wh1Var;
                }
                wh1 wh1Var2 = (wh1) obj18;
                ir1Var11.m6912r(false);
                return wh1Var2;
            case 19:
                return Boolean.valueOf(z62.m13387o(obj, obj2));
            case 20:
                C0007a6 c0007a6 = new C0007a6((String) obj, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null);
                js1 js1Var = new js1();
                js1Var.f22555a = (yp1) obj2;
                VarHandle.storeStoreFence();
                l93.f6762d.getClass();
                x45.f33989a.getClass();
                jo1 jo1Var = (jo1) ((sg0) z01.m2787a()).f11293E3.get();
                sg0 sg0Var = ((sg0) z01.m2787a()).f11418c;
                a83 a83Var = a83.REWARDED;
                Boolean bool = Boolean.FALSE;
                sy3.m2303a(jo1Var.f5931b, (t82) null, new C0682gb(jo1Var, new g93((f33) new jj0(sg0Var, c0007a6, c0007a6, a83Var, bool, bool).f5800i.get(), js1Var, r9, b5), r9, b2), 3);
                return ju4Var;
            case 21:
                C0007a6 c0007a7 = new C0007a6((String) obj, new LinkedHashSet(), null, new LinkedHashMap(), new Bundle(), new HashSet(), new HashSet(), new LinkedHashMap(), null);
                t31 t31Var = new t31();
                t31Var.f30740a = (yp1) obj2;
                VarHandle.storeStoreFence();
                tq1.f12076d.getClass();
                x45.f33989a.getClass();
                jo1 jo1Var2 = (jo1) ((sg0) z01.m2787a()).f11293E3.get();
                sg0 sg0Var2 = ((sg0) z01.m2787a()).f11418c;
                a83 a83Var2 = a83.INTERSTITIAL;
                Boolean bool2 = Boolean.FALSE;
                sy3.m2303a(jo1Var2.f5931b, (t82) null, new C0682gb(jo1Var2, new g93((b23) new bj0(sg0Var2, c0007a7, c0007a7, a83Var2, bool2, bool2).f1200i.get(), t31Var, r9, true ? (byte) 1 : (byte) 0), r9, b2), 3);
                return ju4Var;
            case 22:
                si2 si2Var = (si2) obj2;
                return kx5.m7694Y(Integer.valueOf(si2Var.m10788g()), Integer.valueOf(((a83) si2Var.f30299e.f19663c).m132h()));
            case 23:
                Map mapMo8111c = ((vi2) obj2).mo8111c();
                if (mapMo8111c.isEmpty()) {
                    return null;
                }
                return mapMo8111c;
            case 24:
                ((Integer) obj2).getClass();
                un2.m11586a(vd6.m11838V(1), (mi0) obj);
                return ju4Var;
            case 25:
                qf2 qf2Var = new qf2(true ? (byte) 1 : (byte) 0);
                qf2Var.f28438b = (wf2) obj;
                VarHandle.storeStoreFence();
                ((ap2) obj2).f14768a = qf2Var;
                return ju4Var;
            case 26:
                ((Integer) obj2).getClass();
                return new km0(k91.m7438c(qq2.m10014I(1.0f, 1600.0f, null, 4), 2), k91.m7441f(null, 0.7f, 5));
            case 27:
                return jd0.m7067a((nt2) obj, ((Float) obj2).floatValue());
            case 28:
                return qr3.m10048a((nt2) obj, ((Float) obj2).floatValue());
            default:
                return qr3.m10048a((nt2) obj, ((Float) obj2).floatValue());
        }
    }
}
