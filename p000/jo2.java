package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jo2 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22469a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ yj4 f22470b;

    public /* synthetic */ jo2(byte b) {
        this.f22469a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f22469a;
        ju4 ju4Var = ju4.f22634a;
        yj4 yj4Var = this.f22470b;
        switch (b) {
            case 0:
                yj4Var.mo8000c(((b33) obj).f15059a, wv1.f33773p);
                break;
            case 1:
                lc3 lc3Var = (lc3) obj;
                yj4Var.mo8001d(AbstractC1356y5.m12898G(lc3Var, false));
                lc3Var.m7952a();
                break;
            default:
                lc3 lc3Var2 = (lc3) obj;
                yj4Var.mo8001d(AbstractC1356y5.m12898G(lc3Var2, false));
                lc3Var2.m7952a();
                break;
        }
        return ju4Var;
    }
}
