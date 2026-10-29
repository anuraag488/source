package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31503a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Runnable f31504b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ ar3 f31505c;

    public /* synthetic */ tx0(byte b) {
        this.f31503a = b;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.f31503a) {
            case 0:
                Runnable runnable = this.f31504b;
                ar3 ar3Var = this.f31505c;
                try {
                    runnable.run();
                    return;
                } catch (Exception e) {
                    ((zx0) ar3Var.f14813b).mo7821l(e);
                    throw e;
                }
            case 1:
                Runnable runnable2 = this.f31504b;
                ar3 ar3Var2 = this.f31505c;
                try {
                    runnable2.run();
                    return;
                } catch (Exception e2) {
                    ((zx0) ar3Var2.f14813b).mo7821l(e2);
                    return;
                }
            default:
                Runnable runnable3 = this.f31504b;
                zx0 zx0Var = (zx0) this.f31505c.f14813b;
                try {
                    runnable3.run();
                    zx0Var.m7820k(null);
                    return;
                } catch (Exception e3) {
                    zx0Var.mo7821l(e3);
                    return;
                }
        }
    }
}
