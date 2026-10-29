package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class au2 extends AbstractC0634f1 implements Runnable {

    /* JADX INFO: renamed from: h */
    public final Runnable f14878h;

    public au2(Runnable runnable) {
        runnable.getClass();
        this.f14878h = runnable;
    }

    @Override // p000.AbstractC0782j1
    /* JADX INFO: renamed from: k */
    public final String mo3313k() {
        return "task=[" + this.f14878h + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f14878h.run();
        } catch (Error | RuntimeException e) {
            m6987n(e);
            throw e;
        }
    }
}
