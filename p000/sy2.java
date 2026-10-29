package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sy2 implements nq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ v20 f30648a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ xb4 f30649b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ sw2 f30650c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ C0910mi f30651d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ xb4 f30652e;

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        v20 v20Var = this.f30648a;
        xb4 xb4Var = this.f30649b;
        sw2 sw2Var = this.f30650c;
        C0910mi c0910mi = this.f30651d;
        xb4 xb4Var2 = this.f30652e;
        mi0 mi0Var = (mi0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 17) != 16)) {
            fe4 fe4Var = v20Var.f32324a;
            long j = v20Var.f32325b;
            float fMo3586w0 = kl0.m7534d(j) ? fe4Var.mo3586w0(kl0.m7538h(j)) : Float.POSITIVE_INFINITY;
            kt2 kt2Var = kt2.f23428a;
            nt2 nt2VarM5651I = AbstractC0647fd.m5651I(n74.m8579g(kt2Var, fMo3586w0), 0.0f, 2.0f, 1);
            boolean zM6890g = ir1Var.m6890g(xb4Var);
            Object objM6869O = ir1Var.m6869O();
            i50 i50Var = ki0.f23136a;
            Object obj4 = objM6869O;
            if (zM6890g || objM6869O == i50Var) {
                C0676g5 c0676g5 = new C0676g5((byte) 6);
                c0676g5.f19614b = xb4Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0676g5);
                obj4 = c0676g5;
            }
            nt2 nt2VarM11824H = vd6.m11824H(nt2VarM5651I, (yp1) obj4);
            fr3 fr3Var = gr3.f20083a;
            s93 s93VarM5664b = AbstractC0647fd.m5664b(50);
            nt2 nt2VarM6619m = i25.m6619m(nt2VarM11824H, new fr3(s93VarM5664b, s93VarM5664b, s93VarM5664b, s93VarM5664b));
            boolean zM6890g2 = ir1Var.m6890g(sw2Var);
            Object objM6869O2 = ir1Var.m6869O();
            Object obj5 = objM6869O2;
            if (zM6890g2 || objM6869O2 == i50Var) {
                C0725hh c0725hh = new C0725hh((byte) 13);
                c0725hh.f20571b = sw2Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0725hh);
                obj5 = c0725hh;
            }
            wp1 wp1Var = (wp1) obj5;
            Object objM6869O3 = ir1Var.m6869O();
            if (objM6869O3 == i50Var) {
                objM6869O3 = new da2((byte) 15);
                ir1Var.m6905n0(objM6869O3);
            }
            nt2 nt2VarM7677C = kx5.m7677C(nt2VarM6619m, wp1Var, null, (wp1) objM6869O3, 239);
            xq2 xq2VarM9704c = q20.m9704c(ig1.f21382f, false);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM7677C);
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
            g12 g12Var = (g12) o02.f26247d.getValue();
            nt2 nt2VarM8579g = n74.m8579g(kt2Var, 18.0f);
            boolean zM6894i = ir1Var.m6894i(c0910mi) | ir1Var.m6890g(xb4Var2);
            Object objM6869O4 = ir1Var.m6869O();
            Object obj6 = objM6869O4;
            if (zM6894i || objM6869O4 == i50Var) {
                na1 na1Var = new na1((byte) 15);
                na1Var.f25595b = c0910mi;
                na1Var.f25596c = xb4Var2;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(na1Var);
                obj6 = na1Var;
            }
            l02.m7759a(g12Var, se0.m10693F(nt2VarM8579g, (yp1) obj6), 0L, ir1Var, 48, 8);
            ir1Var.m6912r(true);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
