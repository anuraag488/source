package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jt4 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22611a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ pn0 f22612b;

    public /* synthetic */ jt4(byte b) {
        this.f22611a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        String title;
        byte b = this.f22611a;
        ju4 ju4Var = ju4.f22634a;
        pn0 pn0Var = this.f22612b;
        switch (b) {
            case 0:
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (pn0Var == null || (title = pn0Var.getTitle()) == null) {
                        title = "None";
                    }
                    gl4.m6037b(title, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ir1Var, 0, 0, 262142);
                } else {
                    ir1Var.m6874W();
                }
                return ju4Var;
            default:
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ir1Var2.m6874W();
                } else if (pn0Var != null) {
                    ir1Var2.m6885d0(1286663371);
                    nt2 nt2VarM8579g = n74.m8579g(kt2.f23428a, 24.0f);
                    xq2 xq2VarM9704c = q20.m9704c(ig1.f21378b, false);
                    int iHashCode = Long.hashCode(ir1Var2.f21683T);
                    ga3 ga3VarM6902m = ir1Var2.m6902m();
                    nt2 nt2VarM10006A = qq2.m10006A(ir1Var2, nt2VarM8579g);
                    bi0.f15310ap.getClass();
                    if (ir1Var2.f21685a == null) {
                        dt0.m4682E();
                        throw null;
                    }
                    ir1Var2.m6893h0();
                    if (ir1Var2.f21682S) {
                        ir1Var2.m6900l(wf2.f33290T);
                    } else {
                        ir1Var2.m6911q0();
                    }
                    C0006a5.m53I(ir1Var2, ia5.f21216g, xq2VarM9704c);
                    C0006a5.m53I(ir1Var2, ia5.f21215f, ga3VarM6902m);
                    C0006a5.m53I(ir1Var2, ia5.f21217h, Integer.valueOf(iHashCode));
                    C0006a5.m50F(ir1Var2);
                    C0006a5.m53I(ir1Var2, ia5.f21214e, nt2VarM10006A);
                    pn0Var.getIcon().invoke(ir1Var2, 0);
                    ir1Var2.m6912r(true);
                    ir1Var2.m6912r(false);
                } else {
                    ir1Var2.m6885d0(1286770941);
                    l02.m7759a((g12) o02.f26267x.getValue(), null, 0L, ir1Var2, 48, 12);
                    ir1Var2.m6912r(false);
                }
                return ju4Var;
        }
    }
}
