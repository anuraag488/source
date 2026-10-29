package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eh2 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18089a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ bu1 f18090b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ fh2 f18091c;

    public /* synthetic */ eh2(byte b) {
        this.f18089a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f18089a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                bu1 bu1Var = this.f18090b;
                fh2 fh2Var = this.f18091c;
                bu1Var.m3689f(((Number) ((C0910mi) obj).m8328d()).floatValue());
                fh2Var.f18984c.invoke();
                break;
            default:
                bu1 bu1Var2 = this.f18090b;
                fh2 fh2Var2 = this.f18091c;
                bu1Var2.m3689f(((Number) ((C0910mi) obj).m8328d()).floatValue());
                fh2Var2.f18984c.invoke();
                break;
        }
        return ju4Var;
    }
}
