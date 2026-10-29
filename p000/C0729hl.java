package p000;

/* JADX INFO: renamed from: hl */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0729hl implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20668a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ wp1 f20669b;

    public /* synthetic */ C0729hl(byte b) {
        this.f20668a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f20668a;
        ju4 ju4Var = ju4.f22634a;
        wp1 wp1Var = this.f20669b;
        switch (b) {
            case 0:
                ((jp3) obj).m7253b(((Number) wp1Var.invoke()).floatValue());
                return ju4Var;
            case 1:
                wp1Var.invoke();
                return ju4Var;
            case 2:
                return wp1Var.invoke();
            default:
                return (b33) wp1Var.invoke();
        }
    }
}
