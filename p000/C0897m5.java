package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: m5 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0897m5 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24663a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ pg0 f24664b;

    public /* synthetic */ C0897m5(byte b) {
        this.f24663a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        byte b = this.f24663a;
        ju4 ju4Var = ju4.f22634a;
        byte b2 = 1;
        switch (b) {
            case 0:
                pg0 pg0Var = this.f24664b;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nt2 nt2VarM12946N = y62.m12946N(n74.m8574b(kt2.f23428a, 1.0f));
                    xq2 xq2VarM9704c = q20.m9704c(ig1.f21382f, false);
                    int iHashCode = Long.hashCode(ir1Var.f21683T);
                    ga3 ga3VarM6902m = ir1Var.m6902m();
                    nt2 nt2VarM10006A = qq2.m10006A(ir1Var, nt2VarM12946N);
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
                    pg0Var.invoke(ir1Var, 0);
                    ir1Var.m6912r(true);
                } else {
                    ir1Var.m6874W();
                }
                return ju4Var;
            case 1:
                pg0 pg0Var2 = y70.f34985p;
                pg0 pg0Var3 = this.f24664b;
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zM6890g = ir1Var2.m6890g(pg0Var2) | ir1Var2.m6890g(null) | ir1Var2.m6890g(pg0Var3);
                    Object objM6869O = ir1Var2.m6869O();
                    if (zM6890g || objM6869O == ki0.f23136a) {
                        obj4 = objM6869O;
                        zy3 zy3Var = new zy3(b2);
                        zy3Var.f36470b = pg0Var3;
                        VarHandle.storeStoreFence();
                        ir1Var2.m6905n0(zy3Var);
                        obj4 = zy3Var;
                    }
                    obj4 = objM6869O;
                    AbstractC0647fd.m5668f(null, null, false, null, (yp1) obj4, ir1Var2, 0, 15);
                } else {
                    ir1Var2.m6874W();
                }
                return ju4Var;
            default:
                pg0 pg0Var4 = this.f24664b;
                mi0 mi0Var3 = (mi0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ir1 ir1Var3 = (ir1) mi0Var3;
                if (ir1Var3.m6871T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    mz3.m8460b(null, null, false, null, null, null, null, pg0Var4, ir1Var3, 0, 255);
                } else {
                    ir1Var3.m6874W();
                }
                return ju4Var;
        }
    }
}
