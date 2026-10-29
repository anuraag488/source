package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class we2 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33268a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ a83 f33269b;

    public /* synthetic */ we2(byte b) {
        this.f33268a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f33268a;
        a83 a83Var = this.f33269b;
        switch (b) {
            case 0:
                return Integer.valueOf(a83Var.m132h());
            default:
                return Boolean.valueOf(a83Var.m132h() > 0);
        }
    }
}
