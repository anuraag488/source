package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ko2 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23286a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ yj4 f23287b;

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f23286a;
        ju4 ju4Var = ju4.f22634a;
        yj4 yj4Var = this.f23287b;
        switch (b) {
            case 0:
                yj4Var.onStop();
                break;
            default:
                yj4Var.onCancel();
                break;
        }
        return ju4Var;
    }
}
