package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: ow */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1012ow implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f27151a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC0961nw f27152b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ yp1 f27153c;

    public /* synthetic */ C1012ow(byte b) {
        this.f27151a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.f27151a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                InterfaceC0961nw interfaceC0961nw = this.f27152b;
                yp1 yp1Var = this.f27153c;
                mi0 mi0Var = (mi0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(1 & iIntValue, (iIntValue & 17) != 16)) {
                    ir1Var.m6874W();
                } else {
                    pw3 pw3VarM10148d = qw3.m10148d(ir1Var);
                    C1123rw c1123rw = new C1123rw((byte) 0);
                    c1123rw.f29673b = pw3VarM10148d;
                    c1123rw.f29674c = interfaceC0961nw;
                    c1123rw.f29675d = yp1Var;
                    VarHandle.storeStoreFence();
                    mz3.m8463e(null, null, false, c1123rw, null, null, n40.f25431b, null, n40.f25432c, null, ir1Var, 102236160, 695);
                }
                break;
            default:
                InterfaceC0961nw interfaceC0961nw2 = this.f27152b;
                yp1 yp1Var2 = this.f27153c;
                mi0 mi0Var2 = (mi0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (!ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ir1Var2.m6874W();
                } else {
                    pw3 pw3VarM10148d2 = qw3.m10148d(ir1Var2);
                    C1123rw c1123rw2 = new C1123rw((byte) 1);
                    c1123rw2.f29673b = pw3VarM10148d2;
                    c1123rw2.f29674c = interfaceC0961nw2;
                    c1123rw2.f29675d = yp1Var2;
                    VarHandle.storeStoreFence();
                    mz3.m8463e(null, null, false, c1123rw2, null, null, n40.f25433d, null, n40.f25434e, null, ir1Var2, 102236160, 695);
                }
                break;
        }
        return ju4Var;
    }
}
