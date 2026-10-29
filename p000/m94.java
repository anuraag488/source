package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m94 extends jc4 {

    /* JADX INFO: renamed from: c */
    public float f24771c;

    public m94(long j, float f) {
        super(j);
        this.f24771c = f;
    }

    @Override // p000.jc4
    /* JADX INFO: renamed from: a */
    public final void mo4439a(jc4 jc4Var) {
        this.f24771c = ((m94) jc4Var).f24771c;
    }

    @Override // p000.jc4
    /* JADX INFO: renamed from: b */
    public final jc4 mo4440b(long j) {
        return new m94(j, this.f24771c);
    }
}
