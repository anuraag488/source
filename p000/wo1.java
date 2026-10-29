package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wo1 extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final xo1 f33545a;

    /* JADX INFO: renamed from: b */
    public final Throwable f33546b;

    public wo1(xo1 xo1Var, Throwable th) {
        super(th);
        this.f33545a = xo1Var;
        this.f33546b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f33546b;
    }
}
