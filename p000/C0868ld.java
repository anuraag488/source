package p000;

/* JADX INFO: renamed from: ld */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0868ld implements mq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ long f23956a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ nt2 f23957b;

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        long j = this.f23956a;
        nt2 nt2Var = this.f23957b;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            ir1Var.m6874W();
        } else if (j != 9205357640488583168L) {
            ir1Var.m6885d0(-1244013944);
            nt2 nt2VarM8578f = n74.m8578f(nt2Var, t11.m10960b(j), t11.m10959a(j), 0.0f, 0.0f, 12);
            xq2 xq2VarM9704c = q20.m9704c(ig1.f21379c, false);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM8578f);
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
            AbstractC1030pd.m9495b(null, ir1Var, 0, 1);
            ir1Var.m6912r(true);
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6885d0(-1243644858);
            AbstractC1030pd.m9495b(nt2Var, ir1Var, 0, 0);
            ir1Var.m6912r(false);
        }
        return ju4.f22634a;
    }
}
