package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x94 extends jc4 {

    /* JADX INFO: renamed from: c */
    public ha3 f34083c;

    /* JADX INFO: renamed from: d */
    public int f34084d;

    public x94(long j, ha3 ha3Var) {
        super(j);
        this.f34083c = ha3Var;
    }

    @Override // p000.jc4
    /* JADX INFO: renamed from: a */
    public final void mo4439a(jc4 jc4Var) {
        x94 x94Var = (x94) jc4Var;
        synchronized (kx5.f23598j) {
            this.f34083c = x94Var.f34083c;
            this.f34084d = x94Var.f34084d;
        }
    }

    @Override // p000.jc4
    /* JADX INFO: renamed from: b */
    public final jc4 mo4440b(long j) {
        return new x94(j, this.f34083c);
    }
}
