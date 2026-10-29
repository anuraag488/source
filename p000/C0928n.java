package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import essentials.app.EsApp;
import java.lang.invoke.VarHandle;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: n */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0928n implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25352a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f25353b;

    public /* synthetic */ C0928n(byte b) {
        this.f25352a = b;
    }

    /* JADX INFO: renamed from: b */
    private final Object m8470b(Object obj, Object obj2, Object obj3) {
        kx1 kx1Var = (kx1) this.f25353b;
        yg4 yg4Var = (yg4) obj;
        mi0 mi0Var = (mi0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((ir1) mi0Var).m6890g(yg4Var) ? 4 : 2;
        }
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 19) != 18)) {
            View view = (View) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14655f);
            Context context = (Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b);
            Configuration configuration = (Configuration) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14650a);
            ky0 ky0Var = (ky0) ir1Var.m6898k(ij0.f21473h);
            lk2 lk2Var = (lk2) ir1Var.m6898k(rm2.f29413a);
            av3 av3Var = (av3) ir1Var.m6898k(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
            u33 u33VarM11585a = um2.m11585a(ir1Var);
            zk1 zk1Var = (zk1) ir1Var.m6898k(ij0.f21474i);
            ea4 ea4Var = (ea4) ir1Var.m6898k(ij0.f21482q);
            yz4 yz4Var = (yz4) ir1Var.m6898k(ij0.f21486u);
            fv1 fv1Var = (fv1) ir1Var.m6898k(ij0.f21477l);
            mw3 mw3Var = (mw3) ir1Var.m6898k(qw3.m10146b());
            mw3 mw3Var2 = (mw3) ir1Var.m6898k(st4.m10911a());
            cj0 cj0Var = (cj0) kx1Var.f23572c.getValue();
            rg4 rg4Var = new rg4();
            rg4Var.f29261a = view;
            rg4Var.f29262b = context;
            rg4Var.f29263c = configuration;
            rg4Var.f29264d = ky0Var;
            rg4Var.f29265e = lk2Var;
            rg4Var.f29266f = av3Var;
            rg4Var.f29267g = u33VarM11585a;
            rg4Var.f29268h = zk1Var;
            rg4Var.f29269i = ea4Var;
            rg4Var.f29270j = yz4Var;
            rg4Var.f29271k = fv1Var;
            rg4Var.f29272l = mw3Var;
            rg4Var.f29273m = mw3Var2;
            rg4Var.f29274n = kx1Var;
            rg4Var.f29275o = yg4Var;
            VarHandle.storeStoreFence();
            as4.m3243b(cj0Var, vd6.m11834R(1704240316, rg4Var, ir1Var), ir1Var, 48);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }

    /* JADX INFO: renamed from: e */
    private final Object m8471e(Object obj, Object obj2, Object obj3) {
        ck4 ck4Var = (ck4) this.f25353b;
        ((Integer) obj3).getClass();
        ir1 ir1Var = (ir1) ((mi0) obj2);
        ir1Var.m6885d0(-102778667);
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            objM6869O = lb5.m7942w(r71.f29063a, ir1Var);
            ir1Var.m6905n0(objM6869O);
        }
        zo0 zo0Var = (zo0) objM6869O;
        Object objM6869O2 = ir1Var.m6869O();
        if (objM6869O2 == i50Var) {
            objM6869O2 = k43.m7398w(null);
            ir1Var.m6905n0(objM6869O2);
        }
        sw2 sw2Var = (sw2) objM6869O2;
        sw2 sw2VarM7369C = k43.m7369C(ck4Var, ir1Var);
        boolean zM6890g = ir1Var.m6890g(null);
        Object objM6869O3 = ir1Var.m6869O();
        Object obj4 = objM6869O3;
        if (zM6890g || objM6869O3 == i50Var) {
            C0761ih c0761ih = new C0761ih((byte) 12);
            c0761ih.f21416b = sw2Var;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(c0761ih);
            obj4 = c0761ih;
        }
        lb5.m7923d(null, (yp1) obj4, ir1Var);
        boolean zM6894i = ir1Var.m6894i(zo0Var) | ir1Var.m6890g(null) | ir1Var.m6890g(sw2VarM7369C);
        Object objM6869O4 = ir1Var.m6869O();
        Object obj5 = objM6869O4;
        if (zM6894i || objM6869O4 == i50Var) {
            C1201u c1201u = new C1201u((byte) 1);
            c1201u.f31573b = zo0Var;
            c1201u.f31574c = sw2Var;
            c1201u.f31575d = sw2VarM7369C;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(c1201u);
            obj5 = c1201u;
        }
        nt2 nt2VarM10327a = rf4.m10327a(kt2.f23428a, null, (PointerInputEventHandler) obj5);
        ir1Var.m6912r(false);
        return nt2VarM10327a;
    }

    /* JADX INFO: renamed from: f */
    private final Object m8472f(Object obj, Object obj2, Object obj3) {
        pk4 pk4Var = (pk4) this.f25353b;
        nt2 nt2Var = (nt2) obj;
        ((Integer) obj3).getClass();
        ir1 ir1Var = (ir1) ((mi0) obj2);
        ir1Var.m6885d0(1980580247);
        ky0 ky0Var = (ky0) ir1Var.m6898k(ij0.f21473h);
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            objM6869O = k43.m7398w(w52.m12106a(0L));
            ir1Var.m6905n0(objM6869O);
        }
        sw2 sw2Var = (sw2) objM6869O;
        boolean zM6894i = ir1Var.m6894i(pk4Var);
        Object objM6869O2 = ir1Var.m6869O();
        Object obj4 = objM6869O2;
        if (zM6894i || objM6869O2 == i50Var) {
            jp1 jp1Var = new jp1((byte) 26);
            jp1Var.f22485b = pk4Var;
            jp1Var.f22486c = sw2Var;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(jp1Var);
            obj4 = jp1Var;
        }
        wp1 wp1Var = (wp1) obj4;
        boolean zM6890g = ir1Var.m6890g(ky0Var);
        Object objM6869O3 = ir1Var.m6869O();
        byte b = 0;
        Object obj5 = objM6869O3;
        if (zM6890g || objM6869O3 == i50Var) {
            sk4 sk4Var = new sk4(b);
            sk4Var.f30355b = ky0Var;
            sk4Var.f30356c = sw2Var;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(sk4Var);
            obj5 = sk4Var;
        }
        C0530ck c0530ck = b14.f15024a;
        up4 up4Var = new up4((byte) 8);
        up4Var.f32065b = wp1Var;
        up4Var.f32066c = (yp1) obj5;
        VarHandle.storeStoreFence();
        nt2 nt2VarM10029m = qq2.m10029m(nt2Var, up4Var);
        ir1Var.m6912r(false);
        return nt2VarM10029m;
    }

    /* JADX WARN: Code duplicated, block: B:365:0x09b5  */
    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Object obj5;
        Object obj6;
        long jM13870e;
        Object obj7;
        int iMo3579U;
        byte b = this.f25352a;
        da2 da2Var = wf2.f33290T;
        w71 w71Var = w71.f33134a;
        kt2 kt2Var = kt2.f23428a;
        byte b2 = 16;
        i50 i50Var = ki0.f23136a;
        byte b3 = 4;
        byte b4 = 2;
        boolean z = true;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                C0861l6 c0861l6 = (C0861l6) this.f25353b;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean zM6890g = ir1Var.m6890g(c0861l6);
                    Object objM6869O = ir1Var.m6869O();
                    if (zM6890g || objM6869O == i50Var) {
                        obj4 = objM6869O;
                        C1053q c1053q = new C1053q(false ? (byte) 1 : (byte) 0);
                        c1053q.f28113b = c0861l6;
                        VarHandle.storeStoreFence();
                        ir1Var.m6905n0(c1053q);
                        obj4 = c1053q;
                    }
                    mz3.m8463e(null, null, false, (wp1) obj4, null, null, oh6.f26714H, null, oh6.f26715I, null, ir1Var, 102236160, 695);
                } else {
                    ir1Var.m6874W();
                }
                return ju4Var;
            case 1:
                f40 f40Var = (f40) this.f25353b;
                at1 at1Var = new at1((byte) 3);
                at1Var.f14855b = obj3;
                at1Var.f14856c = f40Var;
                at1Var.f14857d = (g04) obj;
                VarHandle.storeStoreFence();
                return at1Var;
            case 2:
                ((b71) this.f25353b).invoke((Throwable) obj);
                return ju4Var;
            case 3:
                xb4 xb4Var = (xb4) this.f25353b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((ir1) mi0Var2).m6892h(zBooleanValue) ? (byte) 4 : (byte) 2;
                }
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    g12 g12VarM13398z = zBooleanValue ? z62.m13398z() : C0638f5.m5550u();
                    nt2 nt2VarM8579g = n74.m8579g(kt2Var, 16.0f);
                    boolean zM6890g2 = ir1Var2.m6890g(xb4Var);
                    Object objM6869O2 = ir1Var2.m6869O();
                    Object obj8 = objM6869O2;
                    if (zM6890g2 || objM6869O2 == i50Var) {
                        C0676g5 c0676g5 = new C0676g5((byte) 3);
                        c0676g5.f19614b = xb4Var;
                        VarHandle.storeStoreFence();
                        ir1Var2.m6905n0(c0676g5);
                        obj8 = c0676g5;
                    }
                    l02.m7759a(g12VarM13398z, se0.m10693F(nt2VarM8579g, (yp1) obj8), pb0.m9464c(((pb0) ir1Var2.m6898k(zl0.f36166a)).f27503a, 0.74f, 0.0f, 0.0f, 0.0f, 14), ir1Var2, 48, 0);
                } else {
                    ir1Var2.m6874W();
                }
                return ju4Var;
            case 4:
                wp1 wp1Var = (wp1) this.f25353b;
                ((Integer) obj3).getClass();
                ir1 ir1Var3 = (ir1) ((mi0) obj2);
                ir1Var3.m6885d0(-1240005580);
                lu2 lu2Var = ((lq2) ir1Var3.m6898k(pq2.f27894b)).f24280d;
                Object objM6869O3 = ir1Var3.m6869O();
                Object obj9 = objM6869O3;
                if (objM6869O3 == i50Var) {
                    C0910mi c0910miM4700c = dt0.m4700c(0.0f);
                    ir1Var3.m6905n0(c0910miM4700c);
                    obj9 = c0910miM4700c;
                }
                C0910mi c0910mi = (C0910mi) obj9;
                boolean zM6890g3 = ir1Var3.m6890g(wp1Var) | ir1Var3.m6894i(c0910mi) | ir1Var3.m6890g(lu2Var);
                Object objM6869O4 = ir1Var3.m6869O();
                if (zM6890g3 || objM6869O4 == i50Var) {
                    C0671g0 c0671g0 = new C0671g0(wp1Var, c0910mi, lu2Var, null, (byte) 14);
                    ir1Var3.m6905n0(c0671g0);
                    objM6869O4 = c0671g0;
                }
                lb5.m7926g(ir1Var3, (mq1) objM6869O4, ju4Var);
                boolean zM6894i = ir1Var3.m6894i(c0910mi);
                Object objM6869O5 = ir1Var3.m6869O();
                Object obj10 = objM6869O5;
                if (zM6894i || objM6869O5 == i50Var) {
                    zd0 zd0Var = new zd0(false ? (byte) 1 : (byte) 0);
                    zd0Var.f35995b = c0910mi;
                    VarHandle.storeStoreFence();
                    ir1Var3.m6905n0(zd0Var);
                    obj10 = zd0Var;
                }
                nt2 nt2VarM10693F = se0.m10693F(kt2Var, (yp1) obj10);
                ir1Var3.m6912r(false);
                return nt2VarM10693F;
            case 5:
                mo0 mo0Var = (mo0) this.f25353b;
                int iIntValue3 = ((Integer) obj).intValue();
                int iIntValue4 = ((Integer) obj2).intValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue2) {
                    mo0Var.f25076u.m11899b(iIntValue3);
                }
                if (!zBooleanValue2) {
                    mo0Var.f25076u.m11899b(iIntValue4);
                }
                if (mo0Var.f25075t) {
                    long j = mo0Var.f25073r.f34342b;
                    int i = ql4.f28557c;
                    if (iIntValue3 == ((int) (j >> 32)) && iIntValue4 == ((int) (j & 4294967295L))) {
                        z = false;
                    } else if (Math.min(iIntValue3, iIntValue4) < 0 || Math.max(iIntValue3, iIntValue4) > mo0Var.f25073r.f34341a.f24092b.length()) {
                        pk4 pk4Var = mo0Var.f25077v;
                        pk4Var.m9559u(false);
                        pk4Var.m9556r(wu1.f33741a);
                        z = false;
                    } else {
                        if (zBooleanValue2 || iIntValue3 == iIntValue4) {
                            pk4 pk4Var2 = mo0Var.f25077v;
                            pk4Var2.m9559u(false);
                            pk4Var2.m9556r(wu1.f33741a);
                        } else {
                            mo0Var.f25077v.m9543e(true);
                        }
                        mo0Var.f25074s.f31933v.invoke(new xk4(mo0Var.f25073r.f34341a, sc6.m10657b(iIntValue3, iIntValue4), (ql4) null));
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                dz0 dz0Var = (dz0) this.f25353b;
                yp1 yp1Var = (yp1) obj;
                mi0 mi0Var3 = (mi0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((ir1) mi0Var3).m6894i(yp1Var) ? (byte) 4 : (byte) 2;
                }
                ir1 ir1Var4 = (ir1) mi0Var3;
                if (ir1Var4.m6871T(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    if (dz0Var.m4802a()) {
                        ir1Var4.m6885d0(771037755);
                        boolean z2 = (iIntValue5 & 14) == 4;
                        Object objM6869O6 = ir1Var4.m6869O();
                        Object obj11 = objM6869O6;
                        if (z2 || objM6869O6 == i50Var) {
                            yy0 yy0Var = new yy0(false ? (byte) 1 : (byte) 0);
                            yy0Var.f35613b = yp1Var;
                            VarHandle.storeStoreFence();
                            ir1Var4.m6905n0(yy0Var);
                            obj11 = yy0Var;
                        }
                        lb5.m7932m(ju4Var, (wp1) obj11, ir1Var4);
                        ir1Var4.m6912r(false);
                    } else {
                        ir1Var4.m6885d0(771094454);
                        ir1Var4.m6912r(false);
                    }
                    boolean zM6890g4 = ir1Var4.m6890g(dz0Var) | ((iIntValue5 & 14) == 4);
                    Object objM6869O7 = ir1Var4.m6869O();
                    Object obj12 = objM6869O7;
                    if (zM6890g4 != 0 || objM6869O7 == i50Var) {
                        C0594e0 c0594e0 = new C0594e0((Object) yp1Var, (Object) dz0Var, (wm0) null, (byte) 27);
                        ir1Var4.m6905n0(c0594e0);
                        obj12 = c0594e0;
                    }
                    lb5.m7926g(ir1Var4, (mq1) obj12, ju4Var);
                } else {
                    ir1Var4.m6874W();
                }
                return ju4Var;
            case 7:
                kr3 kr3Var = (kr3) this.f25353b;
                yp1 yp1Var2 = (yp1) obj;
                mi0 mi0Var4 = (mi0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((ir1) mi0Var4).m6894i(yp1Var2) ? (byte) 4 : (byte) 2;
                }
                ir1 ir1Var5 = (ir1) mi0Var4;
                if (ir1Var5.m6871T(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    Object objM6869O8 = ir1Var5.m6869O();
                    if (objM6869O8 == i50Var) {
                        obj5 = objM6869O8;
                        fj0 fj0Var = new fj0((byte) 7);
                        ir1Var5.m6905n0(fj0Var);
                        obj5 = fj0Var;
                    }
                    obj5 = objM6869O8;
                    pz2 pz2VarM10509b = rz2.m10509b((wp1) obj5, ir1Var5);
                    boolean zM6890g5 = ir1Var5.m6890g(pz2VarM10509b) | ((iIntValue6 & 14) == 4) | ir1Var5.m6890g(kr3Var);
                    Object objM6869O9 = ir1Var5.m6869O();
                    Object obj13 = objM6869O9;
                    if (zM6890g5 || objM6869O9 == i50Var) {
                        C1031pe c1031pe = new C1031pe(yp1Var2, pz2VarM10509b, kr3Var, (wm0) null);
                        ir1Var5.m6905n0(c1031pe);
                        obj13 = c1031pe;
                    }
                    lb5.m7926g(ir1Var5, (mq1) obj13, ju4Var);
                    zz2.m13893a(pz2VarM10509b, null, null, null, null, null, null, ir1Var5, 0);
                } else {
                    ir1Var5.m6874W();
                }
                return ju4Var;
            case 8:
                C0459am c0459am = (C0459am) this.f25353b;
                mi0 mi0Var5 = (mi0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                int i2 = EsApp.f18450c;
                ir1 ir1Var6 = (ir1) mi0Var5;
                if (ir1Var6.m6871T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    Object objM6869O10 = ir1Var6.m6869O();
                    if (objM6869O10 == i50Var) {
                        objM6869O10 = new C1199ty(c0459am, (wm0) null, b3);
                        ir1Var6.m6905n0(objM6869O10);
                    }
                    sw2 sw2VarM13358Q = z62.m13358Q(ir1Var6, (mq1) objM6869O10, w71Var);
                    le0 le0Var = new le0(true ? (byte) 1 : (byte) 0);
                    le0Var.f23974b = sw2VarM13358Q;
                    VarHandle.storeStoreFence();
                    pg0 pg0VarM11834R = vd6.m11834R(-955388215, le0Var, ir1Var6);
                    le0 le0Var2 = new le0(b4);
                    le0Var2.f23974b = sw2VarM13358Q;
                    VarHandle.storeStoreFence();
                    mz3.m8463e(null, null, false, null, null, null, pg0VarM11834R, vd6.m11834R(-1082231832, le0Var2, ir1Var6), null, null, ir1Var6, 14155776, 831);
                } else {
                    ir1Var6.m6874W();
                }
                return ju4Var;
            case 9:
                EsApp esApp = (EsApp) this.f25353b;
                mq1 mq1Var = (mq1) obj;
                mi0 mi0Var6 = (mi0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                int i3 = EsApp.f18450c;
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ((ir1) mi0Var6).m6894i(mq1Var) ? (byte) 4 : (byte) 2;
                }
                ir1 ir1Var7 = (ir1) mi0Var6;
                if (ir1Var7.m6871T(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    Object objM6869O11 = ir1Var7.m6869O();
                    if (objM6869O11 == i50Var) {
                        obj6 = objM6869O11;
                        mw3 mw3Var = new mw3();
                        ir1Var7.m6905n0(mw3Var);
                        obj6 = mw3Var;
                    }
                    obj6 = objM6869O11;
                    mw3 mw3Var2 = (mw3) obj6;
                    ro0 ro0Var = ir1Var7.f21681R;
                    Object objM6869O12 = ir1Var7.m6869O();
                    Object obj14 = objM6869O12;
                    if (objM6869O12 == i50Var) {
                        pw0 pw0Var = l01.f23664a;
                        gw0 gw0Var = gw0.f20149b;
                        C0459am c0459am2 = new C0459am();
                        c0459am2.f14619a = ro0Var;
                        c0459am2.f14620b = pw0Var;
                        c0459am2.f14621c = gw0Var;
                        VarHandle.storeStoreFence();
                        ir1Var7.m6905n0(c0459am2);
                        obj14 = c0459am2;
                    }
                    C0459am c0459am3 = (C0459am) obj14;
                    zh3[] zh3VarArr = {AbstractC0496bm.m3626a().mo7523a(c0459am3), AndroidCompositionLocals_androidKt.f14651b.mo7523a(esApp), qw3.m10145a().mo7523a(mw3Var2), qw3.m10146b().mo7523a(mw3Var2)};
                    ma1 ma1Var = new ma1(true ? (byte) 1 : (byte) 0);
                    ma1Var.f24781b = esApp;
                    ma1Var.f24782c = mq1Var;
                    ma1Var.f24783d = c0459am3;
                    VarHandle.storeStoreFence();
                    as4.m3245d(zh3VarArr, vd6.m11834R(-1736484033, ma1Var, ir1Var7), ir1Var7, 48);
                } else {
                    ir1Var7.m6874W();
                }
                return ju4Var;
            case 10:
                Intent intent = (Intent) this.f25353b;
                yp1 yp1Var3 = (yp1) obj;
                mi0 mi0Var7 = (mi0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= ((ir1) mi0Var7).m6894i(yp1Var3) ? (byte) 4 : (byte) 2;
                }
                ir1 ir1Var8 = (ir1) mi0Var7;
                if (ir1Var8.m6871T(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    ag0 ag0Var = (ag0) ir1Var8.m6898k(pm2.f27747a);
                    boolean zM6894i2 = ir1Var8.m6894i(ag0Var) | ((iIntValue9 & 14) == 4) | ir1Var8.m6894i(intent);
                    Object objM6869O13 = ir1Var8.m6869O();
                    Object obj15 = objM6869O13;
                    if (zM6894i2 || objM6869O13 == i50Var) {
                        C1164t c1164t = new C1164t((byte) 17);
                        c1164t.f30700c = ag0Var;
                        c1164t.f30701d = intent;
                        c1164t.f30699b = yp1Var3;
                        VarHandle.storeStoreFence();
                        ir1Var8.m6905n0(c1164t);
                        obj15 = c1164t;
                    }
                    lb5.m7923d(ju4Var, (yp1) obj15, ir1Var8);
                } else {
                    ir1Var8.m6874W();
                }
                return ju4Var;
            case 11:
                rn2 rn2Var = (rn2) this.f25353b;
                sg2 sg2Var = (sg2) obj;
                mi0 mi0Var8 = (mi0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= ((ir1) mi0Var8).m6890g(sg2Var) ? 4 : 2;
                }
                ir1 ir1Var9 = (ir1) mi0Var8;
                boolean zM6871T = ir1Var9.m6871T(iIntValue10 & 1, (iIntValue10 & 19) != 18);
                InterfaceC0618en interfaceC0618en = ir1Var9.f21685a;
                if (zM6871T) {
                    nt2 nt2VarM5650H = AbstractC0647fd.m5650H(n74.m8574b(as4.m3253l(sg2Var, ir1Var9), 1.0f), 12.0f, 6.0f);
                    pr3 pr3VarM9243a = or3.m9243a(AbstractC1337xn.m12718d(8.0f), ig1.f21387k, ir1Var9, 54);
                    int iHashCode = Long.hashCode(ir1Var9.f21683T);
                    ga3 ga3VarM6902m = ir1Var9.m6902m();
                    nt2 nt2VarM10006A = qq2.m10006A(ir1Var9, nt2VarM5650H);
                    bi0.f15310ap.getClass();
                    if (interfaceC0618en == null) {
                        dt0.m4682E();
                        throw null;
                    }
                    ir1Var9.m6893h0();
                    if (ir1Var9.f21682S) {
                        ir1Var9.m6900l(da2Var);
                    } else {
                        ir1Var9.m6911q0();
                    }
                    jh0 jh0Var = ia5.f21216g;
                    C0006a5.m53I(ir1Var9, jh0Var, pr3VarM9243a);
                    jh0 jh0Var2 = ia5.f21215f;
                    C0006a5.m53I(ir1Var9, jh0Var2, ga3VarM6902m);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    jh0 jh0Var3 = ia5.f21217h;
                    C0006a5.m53I(ir1Var9, jh0Var3, numValueOf);
                    C0006a5.m50F(ir1Var9);
                    jh0 jh0Var4 = ia5.f21214e;
                    C0006a5.m53I(ir1Var9, jh0Var4, nt2VarM10006A);
                    String strName = rn2Var.f29436b.name();
                    if (strName.length() != 0) {
                        String strValueOf = String.valueOf(strName.charAt(0));
                        int iOrdinal = rn2Var.f29436b.ordinal();
                        if (iOrdinal == 0) {
                            jM13870e = pb0.f27496c;
                        } else if (iOrdinal == 1) {
                            jM13870e = zy5.m13870e(4286630852L);
                        } else if (iOrdinal == 2) {
                            jM13870e = zy5.m13870e(4286695300L);
                        } else if (iOrdinal == 3) {
                            jM13870e = zy5.m13870e(4294956367L);
                        } else if (iOrdinal == 4) {
                            jM13870e = zy5.m13870e(4293874512L);
                        } else if (iOrdinal == 5) {
                            jM13870e = zy5.m13870e(4291728344L);
                        } else {
                            C0670g.m5864c();
                        }
                        long j2 = jM13870e;
                        xm1 xm1Var = xm1.f34416i;
                        yr1 yr1Var = bm1.f15411c;
                        gl4.m6037b(strValueOf, null, j2, 0L, xm1Var, yr1Var, 0L, null, 0L, 0, false, 0, 0, null, ir1Var9, 1572864, 0, 261946);
                        lg2 lg2Var = new lg2(1.0f, true);
                        id0 id0VarM6333a = hd0.m6333a(AbstractC1337xn.f34436c, ig1.f21390n, ir1Var9, 0);
                        int iHashCode2 = Long.hashCode(ir1Var9.f21683T);
                        ga3 ga3VarM6902m2 = ir1Var9.m6902m();
                        nt2 nt2VarM10006A2 = qq2.m10006A(ir1Var9, lg2Var);
                        ir1Var9.m6893h0();
                        if (ir1Var9.f21682S) {
                            ir1Var9.m6900l(da2Var);
                        } else {
                            ir1Var9.m6911q0();
                        }
                        C0006a5.m53I(ir1Var9, jh0Var, id0VarM6333a);
                        C0006a5.m53I(ir1Var9, jh0Var2, ga3VarM6902m2);
                        d55.m4373r(iHashCode2, ir1Var9, jh0Var3, ir1Var9);
                        C0006a5.m53I(ir1Var9, jh0Var4, nt2VarM10006A2);
                        String str = Instant.ofEpochMilli(i41.m6647f(rn2Var.f29435a)).atZone(ZoneId.systemDefault()).format(un2.f32014c) + "  " + rn2Var.f29437c;
                        nc4 nc4Var = pq2.f27894b;
                        gl4.m6037b(str, null, ((lq2) ir1Var9.m6898k(nc4Var)).f24277a.f16962s, 0L, null, yr1Var, 0L, null, 0L, 0, false, 0, 0, ((lq2) ir1Var9.m6898k(nc4Var)).f24278b.f22584o, ir1Var9, 0, 0, 130938);
                        gl4.m6037b(rn2Var.f29438d, null, 0L, 0L, null, yr1Var, 0L, null, 0L, 0, false, 0, 0, ((lq2) ir1Var9.m6898k(nc4Var)).f24278b.f22581l, ir1Var9, 0, 0, 130942);
                        String str2 = rn2Var.f29439e;
                        if (str2 == null) {
                            ir1Var9.m6885d0(-1436200639);
                            ir1Var9.m6912r(false);
                        } else {
                            ir1Var9.m6885d0(-1436200638);
                            gl4.m6037b(str2, null, zy5.m13870e(4293874512L), 0L, null, yr1Var, 0L, null, 0L, 0, false, 0, 0, ((lq2) ir1Var9.m6898k(nc4Var)).f24278b.f22581l, ir1Var9, 384, 0, 130938);
                            ir1Var9.m6912r(false);
                        }
                        ir1Var9.m6912r(true);
                        ir1Var9.m6912r(true);
                    } else {
                        ds3.m4667k("Char sequence is empty.");
                    }
                    return null;
                }
                ir1Var9.m6874W();
                return ju4Var;
            case 12:
                su2 su2Var = (su2) this.f25353b;
                mi0 mi0Var9 = (mi0) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= (iIntValue11 & 8) == 0 ? ((ir1) mi0Var9).m6890g(obj) : ((ir1) mi0Var9).m6894i(obj) ? (byte) 4 : (byte) 2;
                }
                ir1 ir1Var10 = (ir1) mi0Var9;
                if (ir1Var10.m6871T(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    ir1Var10.m6860F(su2Var, ir1Var10.m6902m(), obj, false);
                } else {
                    ir1Var10.m6874W();
                }
                return ju4Var;
            case 13:
                gx2 gx2Var = (gx2) this.f25353b;
                gx2.f20171i.set(gx2Var, null);
                gx2Var.m6193g(null);
                return ju4Var;
            case 14:
                nt2 nt2Var = (nt2) this.f25353b;
                yg4 yg4Var = (yg4) obj;
                mi0 mi0Var10 = (mi0) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= ((ir1) mi0Var10).m6890g(yg4Var) ? (byte) 4 : (byte) 2;
                }
                ir1 ir1Var11 = (ir1) mi0Var10;
                if (ir1Var11.m6871T(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    nt2 nt2VarM8574b = n74.m8574b(yg4.m13125c(yg4Var, ig1.f21378b), 1.0f);
                    WeakHashMap weakHashMap = y05.f34773x;
                    nt2 nt2VarMo7630d = n74.m8575c(nt2VarM8574b, zt5.m13777h(k43.m7390o(ir1Var11).f34781h, ir1Var11).f29819b).mo7630d(nt2Var);
                    ic2[] ic2VarArr = gh4.f19795a;
                    q20.m9702a(qq2.m10029m(nt2VarMo7630d, new hv1((byte) 3)), ir1Var11, 0);
                } else {
                    ir1Var11.m6874W();
                }
                return ju4Var;
            case 15:
                pn0 pn0Var = (pn0) this.f25353b;
                mi0 mi0Var11 = (mi0) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ir1 ir1Var12 = (ir1) mi0Var11;
                if (ir1Var12.m6871T(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    nt2 nt2VarM8579g2 = n74.m8579g(kt2Var, 24.0f);
                    xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, false);
                    int iHashCode3 = Long.hashCode(ir1Var12.f21683T);
                    ga3 ga3VarM6902m3 = ir1Var12.m6902m();
                    nt2 nt2VarM10006A3 = qq2.m10006A(ir1Var12, nt2VarM8579g2);
                    bi0.f15310ap.getClass();
                    if (ir1Var12.f21685a == null) {
                        dt0.m4682E();
                        throw null;
                    }
                    ir1Var12.m6893h0();
                    if (ir1Var12.f21682S) {
                        ir1Var12.m6900l(da2Var);
                    } else {
                        ir1Var12.m6911q0();
                    }
                    C0006a5.m53I(ir1Var12, ia5.f21216g, xq2VarM9704c);
                    C0006a5.m53I(ir1Var12, ia5.f21215f, ga3VarM6902m3);
                    C0006a5.m53I(ir1Var12, ia5.f21217h, Integer.valueOf(iHashCode3));
                    C0006a5.m50F(ir1Var12);
                    C0006a5.m53I(ir1Var12, ia5.f21214e, nt2VarM10006A3);
                    pn0Var.getIcon().invoke(ir1Var12, 0);
                    ir1Var12.m6912r(true);
                } else {
                    ir1Var12.m6874W();
                }
                return ju4Var;
            case 16:
                Map map = (Map) this.f25353b;
                ny2 ny2Var = (ny2) obj;
                mi0 mi0Var12 = (mi0) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= ((ir1) mi0Var12).m6890g(ny2Var) ? (byte) 4 : (byte) 2;
                }
                ir1 ir1Var13 = (ir1) mi0Var12;
                if (ir1Var13.m6871T(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    Object obj16 = ny2Var.f26195b;
                    Object obj17 = map.get(obj16);
                    if (obj17 == null) {
                        obj7 = obj17;
                        mw3 mw3Var3 = new mw3();
                        map.put(obj16, mw3Var3);
                        obj7 = mw3Var3;
                    }
                    obj7 = obj17;
                    zh3 zh3VarMo7523a = qw3.m10146b().mo7523a((mw3) obj7);
                    boolean z3 = (iIntValue14 & 14) == 4;
                    Object objM6869O14 = ir1Var13.m6869O();
                    if (z3 || objM6869O14 == i50Var) {
                        objM6869O14 = new pl1(2, ny2Var, ny2.class, "Content", "Content(Landroidx/compose/runtime/Composer;I)V", 0, (byte) 2);
                        ir1Var13.m6905n0(objM6869O14);
                    }
                    as4.m3244c(zh3VarMo7523a, (mq1) ((xq1) objM6869O14), ir1Var13, 8);
                } else {
                    ir1Var13.m6874W();
                }
                return ju4Var;
            case 17:
                u93 u93Var = (u93) this.f25353b;
                yp1 yp1Var4 = (yp1) obj;
                mi0 mi0Var13 = (mi0) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= ((ir1) mi0Var13).m6894i(yp1Var4) ? (byte) 4 : (byte) 2;
                }
                ir1 ir1Var14 = (ir1) mi0Var13;
                if (ir1Var14.m6871T(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    Object objM6869O15 = ir1Var14.m6869O();
                    if (objM6869O15 == i50Var) {
                        objM6869O15 = new da2((byte) 23);
                        ir1Var14.m6905n0(objM6869O15);
                    }
                    pz2 pz2VarM10509b2 = rz2.m10509b((wp1) objM6869O15, ir1Var14);
                    ir1Var14.m6881b0(rz2.m10508a().mo7523a(pz2VarM10509b2));
                    ir1Var14.m6885d0(-409506162);
                    mq1 mq1Var2 = (mq1) u93Var.mo11304b().invoke(ir1Var14, 0);
                    ir1Var14.m6912r(false);
                    ir1Var14.m6914t();
                    boolean zM6894i3 = ir1Var14.m6894i(mq1Var2) | ir1Var14.m6890g(u93Var) | ((iIntValue15 & 14) == 4);
                    Object objM6869O16 = ir1Var14.m6869O();
                    if (zM6894i3 || objM6869O16 == i50Var) {
                        objM6869O16 = new C1199ty(mq1Var2, u93Var, yp1Var4, null, (byte) 7);
                        ir1Var14.m6905n0(objM6869O16);
                    }
                    lb5.m7926g(ir1Var14, (mq1) objM6869O16, ju4Var);
                    zz2.m13893a(pz2VarM10509b2, null, null, null, null, null, null, ir1Var14, 0);
                } else {
                    ir1Var14.m6874W();
                }
                return ju4Var;
            case 18:
                ye3 ye3Var = (ye3) this.f25353b;
                mi0 mi0Var14 = (mi0) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ir1 ir1Var15 = (ir1) mi0Var14;
                if (ir1Var15.m6871T(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    pw3 pw3VarM10148d = qw3.m10148d(ir1Var15);
                    C0839kl c0839kl = new C0839kl(b3);
                    c0839kl.f23208b = pw3VarM10148d;
                    c0839kl.f23209c = ye3Var;
                    VarHandle.storeStoreFence();
                    mz3.m8463e(null, null, false, c0839kl, null, null, oh6.f26717K, null, null, null, ir1Var15, 1572864, 951);
                } else {
                    ir1Var15.m6874W();
                }
                return ju4Var;
            case 19:
                iu3 iu3Var = (iu3) this.f25353b;
                ny2 ny2Var2 = (ny2) obj;
                mi0 mi0Var15 = (mi0) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= ((ir1) mi0Var15).m6890g(ny2Var2) ? (byte) 4 : (byte) 2;
                }
                ir1 ir1Var16 = (ir1) mi0Var15;
                if (ir1Var16.m6871T(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    Object obj18 = ny2Var2.f26195b;
                    C0553cw c0553cw = new C0553cw(true ? (byte) 1 : (byte) 0);
                    c0553cw.f16521b = ny2Var2;
                    VarHandle.storeStoreFence();
                    iu3Var.mo6170e(obj18, vd6.m11834R(121262920, c0553cw, ir1Var16), ir1Var16, 48);
                } else {
                    ir1Var16.m6874W();
                }
                return ju4Var;
            case 20:
                y94 y94Var = (y94) this.f25353b;
                ny2 ny2Var3 = (ny2) obj;
                mi0 mi0Var16 = (mi0) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= ((ir1) mi0Var16).m6890g(ny2Var3) ? (byte) 4 : (byte) 2;
                }
                ir1 ir1Var17 = (ir1) mi0Var16;
                if (ir1Var17.m6871T(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    Object obj19 = ny2Var3.f26195b;
                    if (((Set) ir1Var17.m6898k(zv3.f36414a)).contains(obj19)) {
                        ir1Var17.m6885d0(1576267665);
                        ir1Var17.m6912r(false);
                    } else {
                        ir1Var17.m6885d0(1574916499);
                        ir1Var17.m6879a0(1159182959, obj19);
                        Object objM6869O17 = ir1Var17.m6869O();
                        if (objM6869O17 == i50Var) {
                            Object pg0Var = y94Var.get(obj19);
                            if (pg0Var == null) {
                                su2 su2Var2 = new su2();
                                VarHandle.storeStoreFence();
                                C0928n c0928n = new C0928n((byte) 12);
                                c0928n.f25353b = su2Var2;
                                VarHandle.storeStoreFence();
                                pg0Var = new pg0(1032736913, true, c0928n);
                                y94Var.put(obj19, pg0Var);
                            }
                            objM6869O17 = (nq1) pg0Var;
                            ir1Var17.m6905n0(objM6869O17);
                        }
                        C0553cw c0553cw2 = new C0553cw(b4);
                        c0553cw2.f16521b = ny2Var3;
                        VarHandle.storeStoreFence();
                        ((nq1) objM6869O17).invoke(vd6.m11834R(-804085656, c0553cw2, ir1Var17), ir1Var17, 54);
                        ir1Var17.m6912r(false);
                        ir1Var17.m6912r(false);
                    }
                } else {
                    ir1Var17.m6874W();
                }
                return ju4Var;
            case 21:
                mq1 mq1Var3 = (mq1) this.f25353b;
                mi0 mi0Var17 = (mi0) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ir1 ir1Var18 = (ir1) mi0Var17;
                if (ir1Var18.m6871T(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    mq1Var3.invoke(ir1Var18, 0);
                } else {
                    ir1Var18.m6874W();
                }
                return ju4Var;
            case 22:
                ((u14) this.f25353b).m11205c();
                return ju4Var;
            case 23:
                d63 d63Var = (d63) this.f25353b;
                zq2 zq2Var = (zq2) obj;
                db3 db3VarMo5826e = ((sq2) obj2).mo5826e(((kl0) obj3).f23210a);
                if (p11.m9352c(Float.NaN, Float.NaN)) {
                    iMo3579U = d63Var == d63.f16814a ? db3VarMo5826e.f16899a / 2 : db3VarMo5826e.f16900b / 2;
                } else {
                    iMo3579U = zq2Var.mo3579U(Float.NaN);
                }
                int i4 = db3VarMo5826e.f16899a;
                int i5 = db3VarMo5826e.f16900b;
                Map mapSingletonMap = Collections.singletonMap(j84.f22091a, Integer.valueOf(iMo3579U));
                C0830kc c0830kc = new C0830kc((byte) 13);
                c0830kc.f23061b = db3VarMo5826e;
                VarHandle.storeStoreFence();
                return zq2Var.mo3583l0(i4, i5, mapSingletonMap, c0830kc);
            case 24:
                return m8470b(obj, obj2, obj3);
            case 25:
                return m8471e(obj, obj2, obj3);
            case 26:
                return m8472f(obj, obj2, obj3);
            default:
                a83 a83Var = (a83) this.f25353b;
                kl0 kl0Var = (kl0) obj3;
                db3 db3VarMo5826e2 = ((sq2) obj2).mo5826e(kl0.m7532b(kl0Var.f23210a, 0, Integer.MAX_VALUE, 0, 0, 13));
                a83Var.m133i(db3VarMo5826e2.f16899a);
                int iM7539i = kl0.m7539i(kl0Var.f23210a);
                int i6 = db3VarMo5826e2.f16900b;
                C0830kc c0830kc2 = new C0830kc(b2);
                c0830kc2.f23061b = db3VarMo5826e2;
                VarHandle.storeStoreFence();
                return ((zq2) obj).mo3583l0(iM7539i, i6, w71Var, c0830kc2);
        }
    }
}
