package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tw2 extends zh0 {

    /* JADX INFO: renamed from: f */
    public final d83 f31486f;

    /* JADX INFO: renamed from: g */
    public final d83 f31487g;

    public tw2(Object obj) {
        super((byte) 2);
        this.f31486f = k43.m7398w(obj);
        this.f31487g = k43.m7398w(obj);
    }

    @Override // p000.zh0
    /* JADX INFO: renamed from: l */
    public final Object mo11188l() {
        return this.f31486f.getValue();
    }

    @Override // p000.zh0
    /* JADX INFO: renamed from: m */
    public final Object mo11189m() {
        return this.f31487g.getValue();
    }

    @Override // p000.zh0
    /* JADX INFO: renamed from: q */
    public final void mo11190q(Object obj) {
        this.f31486f.setValue(obj);
    }
}
