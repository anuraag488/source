package p000;

/* JADX INFO: renamed from: tz */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1200tz implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31552a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C1349xz f31553b;

    public /* synthetic */ C1200tz(byte b) {
        this.f31552a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        byte b = this.f31552a;
        C1349xz c1349xz = this.f31553b;
        switch (b) {
            case 0:
                a83 a83Var = c1349xz.f34728b;
                a83Var.m133i(a83Var.m132h() + 1);
                return ju4.f22634a;
            case 1:
                return (C0927mz) c1349xz.f34727a.getValue();
            case 2:
                return (C0927mz) c1349xz.f34727a.getValue();
            default:
                return Integer.valueOf(c1349xz.f34728b.m132h());
        }
    }
}
