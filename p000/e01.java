package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e01 extends Exception {

    /* JADX INFO: renamed from: a */
    public final Throwable f17555a;

    public e01(Throwable th, so0 so0Var, ro0 ro0Var) {
        super("Coroutine dispatcher " + so0Var + " threw an exception, context = " + ro0Var, th);
        this.f17555a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f17555a;
    }
}
