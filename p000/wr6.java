package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wr6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33667a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ fo5 f33668b;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33667a) {
            case 0:
                this.f33668b.f19192d.cancel();
                break;
            default:
                this.f33668b.m5767d();
                break;
        }
    }
}
