package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rf0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f29220a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ag0 f29221b;

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f29220a;
        ag0 ag0Var = this.f29221b;
        switch (b) {
            case 0:
                ag0Var.invalidateOptionsMenu();
                break;
            default:
                ag0.m2973f(ag0Var);
                break;
        }
    }
}
