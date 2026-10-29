package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ak1 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f14581a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ bk1 f14582b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ dk1 f14583c;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        int iMo4420i0;
        int iMo4420i1;
        byte b = this.f14581a;
        ju4 ju4Var = ju4.f22634a;
        int iMo4421j0 = 0;
        switch (b) {
            case 0:
                bk1 bk1Var = this.f14582b;
                dk1 dk1Var = this.f14583c;
                db3 db3Var = (db3) obj;
                if (db3Var != null) {
                    dk1Var.getClass();
                    iMo4421j0 = db3Var.mo4421j0();
                    iMo4420i0 = db3Var.mo4420i0();
                } else {
                    iMo4420i0 = 0;
                }
                bk1Var.f15353f = j52.m7021a(j52.m7022b(iMo4421j0, iMo4420i0));
                bk1Var.f15350c = db3Var;
                break;
            default:
                bk1 bk1Var2 = this.f14582b;
                dk1 dk1Var2 = this.f14583c;
                db3 db3Var2 = (db3) obj;
                if (db3Var2 != null) {
                    dk1Var2.getClass();
                    iMo4421j0 = db3Var2.mo4421j0();
                    iMo4420i1 = db3Var2.mo4420i0();
                } else {
                    iMo4420i1 = 0;
                }
                bk1Var2.f15354g = j52.m7021a(j52.m7022b(iMo4421j0, iMo4420i1));
                bk1Var2.f15352e = db3Var2;
                break;
        }
        return ju4Var;
    }
}
