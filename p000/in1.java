package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class in1 implements f74 {

    /* JADX INFO: renamed from: a */
    public final f74 f21573a;

    public in1(f74 f74Var) {
        this.f21573a = f74Var;
    }

    @Override // p000.f74
    /* JADX INFO: renamed from: c */
    public final ym4 mo3367c() {
        return this.f21573a.mo3367c();
    }

    @Override // p000.f74, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f21573a.close();
    }

    @Override // p000.f74
    /* JADX INFO: renamed from: d */
    public void mo3368d(w30 w30Var, long j) {
        this.f21573a.mo3368d(w30Var, j);
    }

    @Override // p000.f74, java.io.Flushable
    public void flush() {
        this.f21573a.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f21573a + ')';
    }
}
