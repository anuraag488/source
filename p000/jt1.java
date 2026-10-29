package p000;

import ads_mobile_sdk.C0313rh;
import android.app.Activity;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jt1 implements nq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22602a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC0755ia f22603b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ qe3 f22604c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Activity f22605d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ yp1 f22606e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ xz4 f22607f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ yp1 f22608g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ lv1 f22609h;

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sg2 sg2Var = (sg2) obj;
        mi0 mi0Var = (mi0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        byte b = 2;
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((ir1) mi0Var).m6890g(sg2Var) ? 4 : 2;
        }
        byte b2 = 0;
        byte b3 = 1;
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 19) != 18)) {
            d00 d00Var = (d00) this.f22602a;
            ir1Var.m6885d0(81402602);
            pw3 pw3VarM10148d = qw3.m10148d(ir1Var);
            InterfaceC0755ia interfaceC0755ia = this.f22603b;
            qe3 qe3Var = this.f22604c;
            Activity activity = this.f22605d;
            yp1 yp1Var = this.f22606e;
            xz4 xz4Var = this.f22607f;
            yp1 yp1Var2 = this.f22608g;
            lv1 lv1Var = this.f22609h;
            lt1 lt1Var = new lt1();
            lt1Var.f24345a = pw3VarM10148d;
            lt1Var.f24346b = interfaceC0755ia;
            lt1Var.f24347c = qe3Var;
            lt1Var.f24348d = d00Var;
            lt1Var.f24349e = activity;
            lt1Var.f24350f = yp1Var;
            lt1Var.f24351g = xz4Var;
            lt1Var.f24352h = yp1Var2;
            lt1Var.f24353i = lv1Var;
            VarHandle.storeStoreFence();
            xy3 xy3VarM10822r = sj3.m10822r(qn4.f28627d, true, ir1Var, 4);
            oz3 oz3VarM10799H = sj3.m10799H(null, xy3.m12776a(xy3VarM10822r, xy3VarM10822r.f34723b), null, ir1Var, 12583296, C0313rh.f10790h1);
            ft1 ft1Var = new ft1(b2);
            ft1Var.f19273b = d00Var;
            VarHandle.storeStoreFence();
            pg0 pg0VarM11834R = vd6.m11834R(1009398680, ft1Var, ir1Var);
            ft1 ft1Var2 = new ft1(b3);
            ft1Var2.f19273b = d00Var;
            VarHandle.storeStoreFence();
            pg0 pg0VarM11834R2 = vd6.m11834R(1866048823, ft1Var2, ir1Var);
            ft1 ft1Var3 = new ft1(b);
            ft1Var3.f19273b = d00Var;
            VarHandle.storeStoreFence();
            mz3.m8463e(null, oz3VarM10799H, false, lt1Var, null, null, pg0VarM11834R, pg0VarM11834R2, null, vd6.m11834R(-715618187, ft1Var3, ir1Var), ir1Var, 819462144, 309);
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
