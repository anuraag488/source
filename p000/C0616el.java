package p000;

/* JADX INFO: renamed from: el */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0616el implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18195a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ nq1 f18196b;

    public /* synthetic */ C0616el(byte b) {
        this.f18195a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f18195a;
        ju4 ju4Var = ju4.f22634a;
        nq1 nq1Var = this.f18196b;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pr3 pr3VarM9243a = or3.m9243a(AbstractC1337xn.f34435b, ig1.f21388l, ir1Var, 54);
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
                    C0006a5.m53I(ir1Var, ia5.f21216g, pr3VarM9243a);
                    C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
                    C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
                    C0006a5.m50F(ir1Var);
                    C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
                    nq1Var.invoke(rr3.f29550a, ir1Var, 6);
                    ir1Var.m6912r(true);
                } else {
                    ir1Var.m6874W();
                }
                return ju4Var;
            default:
                ir1 ir1Var2 = (ir1) mi0Var;
                if (ir1Var2.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nq1Var.invoke(jd0.f22171a, ir1Var2, 0);
                } else {
                    ir1Var2.m6874W();
                }
                return ju4Var;
        }
    }
}
