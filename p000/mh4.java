package p000;

import android.content.Context;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mh4 extends AbstractC1091r0 {

    /* JADX INFO: renamed from: j */
    public s52 f24923j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Context f24924k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ nh4 f24925l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh4(nh4 nh4Var, Context context) {
        super(context);
        this.f24924k = context;
        this.f24925l = nh4Var;
    }

    @Override // p000.AbstractC1091r0
    /* JADX INFO: renamed from: a */
    public final void mo3976a(int i, mi0 mi0Var) {
        xn2 xn2Var;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        byte b = 0;
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6885d0(-1640695390);
        nh4 nh4Var = this.f24925l;
        mw3 mw3Var = nh4Var.f25819h;
        xn2 xn2Var2 = (xn2) ir1Var.m6898k(yn2.f35357b);
        fv1 fv1Var = null;
        i50 i50Var = ki0.f23136a;
        if (xn2Var2 == null) {
            ir1Var.m6885d0(-1476823888);
            ir1Var.m6912r(false);
            xn2Var = null;
        } else {
            ir1Var.m6885d0(-1476823887);
            boolean zM6890g = ir1Var.m6890g("SystemOverlayView") | ir1Var.m6890g(xn2Var2);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == i50Var) {
                objM6869O = xn2Var2.m12723c("SystemOverlayView");
                ir1Var.m6905n0(objM6869O);
            }
            xn2Var = (xn2) objM6869O;
            ir1Var.m6912r(false);
        }
        nh4Var.f25827p = xn2Var;
        byte b2 = 9;
        boolean zBooleanValue = ((Boolean) se0.m10708W("show_bounds", 0L, new n14(b2), ir1Var, 6, 14).invoke(ir1Var, 0)).booleanValue();
        ju4 ju4Var = ju4.f22634a;
        if (zBooleanValue) {
            ir1Var.m6885d0(-1228043906);
            boolean zM6894i = ir1Var.m6894i(this);
            Object objM6869O2 = ir1Var.m6869O();
            if (zM6894i || objM6869O2 == i50Var) {
                obj4 = objM6869O2;
                o04 o04Var = new o04((byte) 11);
                o04Var.f26271b = this;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(o04Var);
                obj4 = o04Var;
            }
            lb5.m7923d(ju4Var, (yp1) obj4, ir1Var);
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6885d0(-1227888224);
            ir1Var.m6912r(false);
        }
        if (((C0950nl) ir1Var.m6898k(AbstractC0987ol.m9168a())).f25925f >= 34) {
            ir1Var.m6885d0(-1227825697);
            List listM6319e1 = hb0.m6319e1(nh4Var.getTouchAreas().f35055d);
            Integer numValueOf = Integer.valueOf(nh4Var.getAttachVersion());
            boolean zM6894i2 = ir1Var.m6894i(this) | ir1Var.m6894i(listM6319e1);
            Object objM6869O3 = ir1Var.m6869O();
            if (zM6894i2 || objM6869O3 == i50Var) {
                obj3 = objM6869O3;
                jp1 jp1Var = new jp1((byte) 23);
                jp1Var.f22485b = this;
                jp1Var.f22486c = listM6319e1;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(jp1Var);
                obj3 = jp1Var;
            }
            lb5.m7933n(listM6319e1, numValueOf, (wp1) obj3, ir1Var);
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6885d0(-1227517216);
            ir1Var.m6912r(false);
        }
        if (((Boolean) nh4Var.getState().f36073g.getValue()).booleanValue()) {
            ir1Var.m6885d0(-1227469693);
            Object objM6869O4 = ir1Var.m6869O();
            if (objM6869O4 == i50Var) {
                objM6869O4 = lb5.m7942w(r71.f29063a, ir1Var);
                ir1Var.m6905n0(objM6869O4);
            }
            zo0 zo0Var = (zo0) objM6869O4;
            boolean zM6890g2 = ir1Var.m6890g(zo0Var) | ir1Var.m6890g(nh4Var);
            Object objM6869O5 = ir1Var.m6869O();
            Object obj5 = objM6869O5;
            if (zM6890g2 || objM6869O5 == i50Var) {
                cz3 cz3Var = new cz3(b2);
                cz3Var.f16638b = zo0Var;
                cz3Var.f16639c = nh4Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(cz3Var);
                obj5 = cz3Var;
            }
            lb5.m7923d(ju4Var, (yp1) obj5, ir1Var);
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6885d0(-1226888288);
            ir1Var.m6912r(false);
        }
        if (((C1354y3) ir1Var.m6898k(AbstractC0637f4.f18723a)).m12815a() != null) {
            ir1Var.m6885d0(-1226632414);
            u04 u04Var = new u04((byte) 7);
            u04Var.f31581b = nh4Var;
            VarHandle.storeStoreFence();
            lh4 lh4Var = (lh4) se0.m10708W("system_overlay_window_insets", 0L, u04Var, ir1Var, 6, 14).invoke(ir1Var, 0);
            boolean zM6894i3 = ir1Var.m6894i(lh4Var) | ir1Var.m6890g(nh4Var);
            Object objM6869O6 = ir1Var.m6869O();
            if (zM6894i3 || objM6869O6 == i50Var) {
                obj2 = objM6869O6;
                cz3 cz3Var2 = new cz3((byte) 10);
                cz3Var2.f16638b = lh4Var;
                cz3Var2.f16639c = nh4Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(cz3Var2);
                obj2 = cz3Var2;
            }
            lb5.m7923d(ju4Var, (yp1) obj2, ir1Var);
            boolean zM6894i4 = ir1Var.m6894i(lh4Var);
            Object objM6869O7 = ir1Var.m6869O();
            Object obj6 = objM6869O7;
            if (zM6894i4 || objM6869O7 == i50Var) {
                jh4 jh4Var = new jh4((byte) 0);
                jh4Var.f22283b = lh4Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(jh4Var);
                obj6 = jh4Var;
            }
            nh4Var.f25824m = (wp1) obj6;
            boolean zM6894i5 = ir1Var.m6894i(lh4Var);
            Object objM6869O8 = ir1Var.m6869O();
            Object obj7 = objM6869O8;
            if (zM6894i5 || objM6869O8 == i50Var) {
                jh4 jh4Var2 = new jh4((byte) 1);
                jh4Var2.f22283b = lh4Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(jh4Var2);
                obj7 = jh4Var2;
            }
            nh4Var.f25825n = (wp1) obj7;
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6885d0(-1224789216);
            ir1Var.m6912r(false);
        }
        nc4 nc4Var = ij0.f21473h;
        ky0 ky0Var = (ky0) ir1Var.m6898k(nc4Var);
        boolean zM6886e = ir1Var.m6886e(nh4Var.getAttachVersion()) | ir1Var.m6890g(ky0Var);
        Object objM6869O9 = ir1Var.m6869O();
        Object obj8 = objM6869O9;
        if (zM6886e || objM6869O9 == i50Var) {
            kh4 kh4Var = new kh4();
            kh4Var.f23130a = ky0Var;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(kh4Var);
            obj8 = kh4Var;
        }
        zh3 zh3VarMo7523a = AndroidCompositionLocals_androidKt.f14651b.mo7523a(this.f24924k);
        zh3 zh3VarMo7523a2 = nc4Var.mo7523a((kh4) obj8);
        nc4 nc4Var2 = ij0.f21477l;
        lv1 lv1Var = (lv1) ir1Var.m6898k(nv1.f26110a);
        if (lv1Var == null) {
            ir1Var.m6885d0(-1224039389);
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6885d0(-1224039388);
            Object objM6869O10 = ir1Var.m6869O();
            if (objM6869O10 == i50Var) {
                obj = objM6869O10;
                mv1 mv1Var = new mv1(b);
                mv1Var.f25230b = lv1Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(mv1Var);
                obj = mv1Var;
            }
            obj = objM6869O10;
            fv1Var = (fv1) obj;
            ir1Var.m6912r(false);
        }
        if (fv1Var == null) {
            ir1Var.m6885d0(-455124503);
            fv1Var = (fv1) ir1Var.m6898k(nc4Var2);
        } else {
            ir1Var.m6885d0(-455127789);
        }
        ir1Var.m6912r(false);
        zh3[] zh3VarArr = {zh3VarMo7523a, zh3VarMo7523a2, nc4Var2.mo7523a(fv1Var), qw3.m10146b().mo7523a(mw3Var), st4.m10911a().mo7523a(mw3Var)};
        er1 er1Var = new er1((byte) 18);
        er1Var.f18412b = this;
        er1Var.f18413c = nh4Var;
        VarHandle.storeStoreFence();
        as4.m3245d(zh3VarArr, vd6.m11834R(-1033605534, er1Var, ir1Var), ir1Var, 48);
        ir1Var.m6912r(false);
    }
}
