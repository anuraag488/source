package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bw1 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15655a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ cw1 f15656b;

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f15655a;
        ju4 ju4Var = ju4.f22634a;
        cw1 cw1Var = this.f15656b;
        switch (b) {
            case 0:
                is4 is4Var = cw1Var.f16531v;
                if (is4Var == null) {
                    throw d55.m4375t("Font resolution state is not set.");
                }
                is4Var.getValue();
                return ju4Var;
            default:
                is4 is4Var2 = cw1Var.f16531v;
                if (is4Var2 == null) {
                    throw d55.m4375t("Font resolution state is not set.");
                }
                is4Var2.getValue();
                return ju4Var;
        }
    }
}
