package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: ur */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1229ur implements nq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f32114a;

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        int i = this.f32114a;
        ((Integer) obj3).getClass();
        ir1 ir1Var = (ir1) ((mi0) obj2);
        ir1Var.m6885d0(-1702247749);
        sw2 sw2VarM7369C = k43.m7369C(Integer.valueOf(i), ir1Var);
        boolean zM6890g = ir1Var.m6890g(sw2VarM7369C);
        Object objM6869O = ir1Var.m6869O();
        if (zM6890g || objM6869O == ki0.f23136a) {
            obj4 = objM6869O;
            C0725hh c0725hh = new C0725hh((byte) 1);
            c0725hh.f20571b = sw2VarM7369C;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(c0725hh);
            obj4 = c0725hh;
        }
        obj4 = objM6869O;
        nc4 nc4Var = je0.f22196a;
        C0928n c0928n = new C0928n((byte) 4);
        c0928n.f25353b = (wp1) obj4;
        VarHandle.storeStoreFence();
        nt2 nt2VarM10029m = qq2.m10029m(kt2.f23428a, c0928n);
        ir1Var.m6912r(false);
        return nt2VarM10029m;
    }
}
