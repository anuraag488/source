package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kh6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23132a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ uh6 f23133b;

    public /* synthetic */ kh6(byte b) {
        this.f23132a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23132a) {
            case 0:
                uh6 uh6Var = this.f23133b;
                uh6Var.f31882i = uh6Var.f31887n;
                break;
            default:
                this.f23133b.f31887n = null;
                break;
        }
    }
}
