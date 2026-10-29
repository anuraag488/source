package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vn1 implements wl0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32746a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ eo1 f32747b;

    @Override // p000.wl0
    public final void accept(Object obj) {
        byte b = this.f32746a;
        eo1 eo1Var = this.f32747b;
        switch (b) {
            case 0:
                if (eo1Var.m5225L()) {
                    eo1Var.m5251j(false);
                }
                break;
            case 1:
                Integer num = (Integer) obj;
                if (eo1Var.m5225L() && num.intValue() == 80) {
                    eo1Var.m5255n(false);
                    break;
                }
                break;
            case 2:
                fv2 fv2Var = (fv2) obj;
                if (eo1Var.m5225L()) {
                    boolean z = fv2Var.f19338a;
                    eo1Var.m5256o(false);
                }
                break;
            default:
                za3 za3Var = (za3) obj;
                if (eo1Var.m5225L()) {
                    boolean z2 = za3Var.f35907a;
                    eo1Var.m5261t(false);
                }
                break;
        }
    }
}
