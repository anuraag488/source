package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lc4 extends jc4 {

    /* JADX INFO: renamed from: c */
    public qa3 f23952c;

    /* JADX INFO: renamed from: d */
    public int f23953d;

    public lc4(long j, qa3 qa3Var) {
        super(j);
        this.f23952c = qa3Var;
    }

    @Override // p000.jc4
    /* JADX INFO: renamed from: a */
    public final void mo4439a(jc4 jc4Var) {
        synchronized (zy5.f36486o) {
            this.f23952c = ((lc4) jc4Var).f23952c;
            this.f23953d = ((lc4) jc4Var).f23953d;
        }
    }

    @Override // p000.jc4
    /* JADX INFO: renamed from: b */
    public final jc4 mo4440b(long j) {
        return new lc4(j, this.f23952c);
    }
}
