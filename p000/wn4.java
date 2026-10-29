package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wn4 implements mq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ float f33520a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long f33521b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ pg0 f33522c;

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        float f = this.f33520a;
        long j = this.f33521b;
        pg0 pg0Var = this.f33522c;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            nt2 nt2VarM5648F = AbstractC0647fd.m5648F(n74.m8582j(40.0f, f, 8), zn4.f36210a);
            xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, false);
            int iHashCode = Long.hashCode(ir1Var.f21683T);
            ga3 ga3VarM6902m = ir1Var.m6902m();
            nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM5648F);
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
            as4.m3245d(new zh3[]{zl0.f36166a.mo7523a(pb0.m9462a(j)), gl4.f19869a.mo7523a(ks4.m7594a(2, ir1Var))}, pg0Var, ir1Var, 0);
            ir1Var.m6912r(true);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
