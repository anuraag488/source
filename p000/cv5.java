package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cv5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f16517a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long f16518b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ t36 f16519c;

    public /* synthetic */ cv5(byte b) {
        this.f16517a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16517a) {
            case 0:
                ((ly5) this.f16519c).m8154z(this.f16518b);
                break;
            default:
                uh6 uh6Var = (uh6) this.f16519c;
                ly5 ly5Var = ((oa6) uh6Var.f36084a).f26522n;
                oa6.m9013i(ly5Var);
                ly5Var.m8151w(this.f16518b);
                uh6Var.f31882i = null;
                break;
        }
    }
}
