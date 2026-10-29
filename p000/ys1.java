package p000;

import ads_mobile_sdk.C0313rh;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ys1 implements nq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ sp1 f35492a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC0755ia f35493b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ yp1 f35494c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ xz4 f35495d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ yp1 f35496e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ lv1 f35497f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ long f35498g;

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sp1 sp1Var = this.f35492a;
        InterfaceC0755ia interfaceC0755ia = this.f35493b;
        yp1 yp1Var = this.f35494c;
        xz4 xz4Var = this.f35495d;
        yp1 yp1Var2 = this.f35496e;
        lv1 lv1Var = this.f35497f;
        long j = this.f35498g;
        mi0 mi0Var = (mi0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 17) != 16)) {
            pw3 pw3VarM10148d = qw3.m10148d(ir1Var);
            mt1 mt1Var = new mt1();
            mt1Var.f25188a = pw3VarM10148d;
            mt1Var.f25189b = sp1Var;
            mt1Var.f25190c = interfaceC0755ia;
            mt1Var.f25191d = yp1Var;
            mt1Var.f25192e = xz4Var;
            mt1Var.f25193f = yp1Var2;
            mt1Var.f25194g = lv1Var;
            VarHandle.storeStoreFence();
            boolean zMo5771a = sp1Var.mo5771a();
            xy3 xy3VarM10822r = sj3.m10822r(qn4.f28628e, true, ir1Var, 4);
            oz3 oz3VarM10799H = sj3.m10799H(null, xy3.m12776a(xy3VarM10822r, xy3VarM10822r.f34723b), null, ir1Var, 12583296, C0313rh.f10790h1);
            pg0 pg0Var = y70.f34981l;
            zs1 zs1Var = new zs1();
            zs1Var.f36340a = j;
            VarHandle.storeStoreFence();
            mz3.m8463e(null, oz3VarM10799H, zMo5771a, mt1Var, null, null, pg0Var, vd6.m11834R(129359050, zs1Var, ir1Var), null, y70.f34982m, ir1Var, 819462144, 305);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
