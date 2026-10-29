package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w96 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public String f33183a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ea6 f33184b;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        d76 d76Var = ((oa6) this.f33184b.f36084a).f26514f;
        oa6.m9016l(d76Var);
        d76Var.f16835j.m12505b(th, this.f33183a);
    }
}
