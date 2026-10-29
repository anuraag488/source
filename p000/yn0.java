package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yn0 implements mq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ pk4 f35343a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ uj2 f35344b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f35345c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ yz4 f35346d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ zo0 f35347e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ yp1 f35348f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ xk4 f35349g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ vi3 f35350h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ ky0 f35351i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ e30 f35352j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ int f35353k;

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        pk4 pk4Var = this.f35343a;
        uj2 uj2Var = this.f35344b;
        boolean z = this.f35345c;
        yz4 yz4Var = this.f35346d;
        zo0 zo0Var = this.f35347e;
        yp1 yp1Var = this.f35348f;
        xk4 xk4Var = this.f35349g;
        vi3 vi3Var = this.f35350h;
        ky0 ky0Var = this.f35351i;
        e30 e30Var = this.f35352j;
        int i = this.f35353k;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            fo0 fo0Var = new fo0();
            fo0Var.f19161a = uj2Var;
            fo0Var.f19162b = pk4Var;
            fo0Var.f19163c = yz4Var;
            fo0Var.f19164d = zo0Var;
            fo0Var.f19165e = yp1Var;
            fo0Var.f19166f = xk4Var;
            fo0Var.f19167g = vi3Var;
            fo0Var.f19168h = ky0Var;
            fo0Var.f19169i = e30Var;
            fo0Var.f19170j = i;
            VarHandle.storeStoreFence();
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, kt2.f23428a);
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
            C0006a5.m53I(ir1Var, ia5.f21216g, fo0Var);
            C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
            C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
            C0006a5.m50F(ir1Var);
            C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
            boolean z2 = true;
            ir1Var.m6912r(true);
            if (uj2Var.m11574a() == wu1.f33741a || uj2Var.m11576c() == null || !uj2Var.m11576c().mo4000K() || !z) {
                z2 = false;
            }
            oh6.m9100f(pk4Var, z2, ir1Var, 0);
            if (uj2Var.m11574a() == wu1.f33743c && z) {
                ir1Var.m6885d0(-713510518);
                oh6.m9106l(pk4Var, ir1Var, 0);
                ir1Var.m6912r(false);
            } else {
                ir1Var.m6885d0(-713433638);
                ir1Var.m6912r(false);
            }
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
