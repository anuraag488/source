package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dc4 extends jc4 {

    /* JADX INFO: renamed from: c */
    public AbstractC0003a2 f16981c;

    /* JADX INFO: renamed from: d */
    public int f16982d;

    /* JADX INFO: renamed from: e */
    public int f16983e;

    public dc4(long j, AbstractC0003a2 abstractC0003a2) {
        super(j);
        this.f16981c = abstractC0003a2;
    }

    @Override // p000.jc4
    /* JADX INFO: renamed from: a */
    public final void mo4439a(jc4 jc4Var) {
        synchronized (zt5.f36369e) {
            this.f16981c = ((dc4) jc4Var).f16981c;
            this.f16982d = ((dc4) jc4Var).f16982d;
            this.f16983e = ((dc4) jc4Var).f16983e;
        }
    }

    @Override // p000.jc4
    /* JADX INFO: renamed from: b */
    public final jc4 mo4440b(long j) {
        return new dc4(j, this.f16981c);
    }
}
