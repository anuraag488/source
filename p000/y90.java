package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y90 implements nq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35032a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ q22 f35033b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f35034c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ wp1 f35035d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f35036e;

    public /* synthetic */ y90(byte b) {
        this.f35032a = b;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.f35032a;
        kt2 kt2Var = kt2.f23428a;
        i50 i50Var = ki0.f23136a;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                ir1 ir1Var = (ir1) ((mi0) obj2);
                ir1Var.m6885d0(-1525724089);
                Object objM6869O = ir1Var.m6869O();
                if (objM6869O == i50Var) {
                    objM6869O = sj3.m10810f();
                    ir1Var.m6905n0(objM6869O);
                }
                nv2 nv2Var = (nv2) objM6869O;
                nt2 nt2VarMo7630d = n22.m8478a(kt2Var, nv2Var, this.f35033b).mo7630d(new x90(nv2Var, null, false, this.f35034c, null, (lq3) this.f35036e, this.f35035d));
                ir1Var.m6912r(false);
                return nt2VarMo7630d;
            default:
                ((Number) obj3).intValue();
                ir1 ir1Var2 = (ir1) ((mi0) obj2);
                ir1Var2.m6885d0(-1525724089);
                Object objM6869O2 = ir1Var2.m6869O();
                if (objM6869O2 == i50Var) {
                    objM6869O2 = sj3.m10810f();
                    ir1Var2.m6905n0(objM6869O2);
                }
                nv2 nv2Var2 = (nv2) objM6869O2;
                nt2 nt2VarMo7630d2 = n22.m8478a(kt2Var, nv2Var2, this.f35033b).mo7630d(new od0(nv2Var2, null, false, this.f35034c, this.f35035d, (wp1) this.f35036e));
                ir1Var2.m6912r(false);
                return nt2VarMo7630d2;
        }
    }
}
