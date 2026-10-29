package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class s74 implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public d81 f29944a;

    /* JADX INFO: renamed from: b */
    public Object f29945b = new Object();

    /* JADX INFO: renamed from: c */
    public volatile w42 f29946c;

    /* JADX INFO: renamed from: d */
    public volatile yc3 f29947d;

    public s74(d81 d81Var, long j) {
        this.f29944a = d81Var;
        new gb1();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        mo7188a();
    }

    /* JADX INFO: renamed from: a */
    public void mo7188a() {
    }
}
