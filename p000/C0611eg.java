package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: eg */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0611eg implements mq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ long f18059a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f18060b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ nt2 f18061c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ c33 f18062d;

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        long j = this.f18059a;
        boolean z = this.f18060b;
        nt2 nt2Var = this.f18061c;
        c33 c33Var = this.f18062d;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            i50 i50Var = ki0.f23136a;
            if (j != 9205357640488583168L) {
                ir1Var.m6885d0(3458246);
                C1114rn c1114rn = z ? qq2.f28683b : qq2.f28682a;
                nt2 nt2VarM8578f = n74.m8578f(nt2Var, t11.m10960b(j), t11.m10959a(j), 0.0f, 0.0f, 12);
                pr3 pr3VarM9243a = or3.m9243a(c1114rn, ig1.f21387k, ir1Var, 0);
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
                C0006a5.m53I(ir1Var, ia5.f21216g, pr3VarM9243a);
                C0006a5.m53I(ir1Var, ia5.f21215f, ga3VarM6902m);
                C0006a5.m53I(ir1Var, ia5.f21217h, Integer.valueOf(iHashCode));
                C0006a5.m50F(ir1Var);
                C0006a5.m53I(ir1Var, ia5.f21214e, nt2VarM10006A);
                boolean zM6894i = ir1Var.m6894i(c33Var);
                Object objM6869O = ir1Var.m6869O();
                Object obj4 = objM6869O;
                if (zM6894i || objM6869O == i50Var) {
                    C0650fg c0650fg = new C0650fg((byte) 0);
                    c0650fg.f18954b = c33Var;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0650fg);
                    obj4 = c0650fg;
                }
                i20.m6582g(kt2.f23428a, (wp1) obj4, z, ir1Var, 6);
                ir1Var.m6912r(true);
                ir1Var.m6912r(false);
            } else {
                ir1Var.m6885d0(4389176);
                boolean zM6894i2 = ir1Var.m6894i(c33Var);
                Object objM6869O2 = ir1Var.m6869O();
                if (zM6894i2 || objM6869O2 == i50Var) {
                    obj3 = objM6869O2;
                    C0650fg c0650fg2 = new C0650fg((byte) 1);
                    c0650fg2.f18954b = c33Var;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0650fg2);
                    obj3 = c0650fg2;
                }
                i20.m6582g(nt2Var, (wp1) obj3, z, ir1Var, 0);
                ir1Var.m6912r(false);
            }
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
