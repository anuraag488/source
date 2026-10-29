package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class n33 extends dz2 {

    /* JADX INFO: renamed from: h */
    public o33 f25420h;

    /* JADX INFO: renamed from: i */
    public boolean f25421i;

    @Override // p000.dz2
    /* JADX INFO: renamed from: a */
    public final void mo4812a() {
        this.f25420h.handleOnBackCancelled();
    }

    @Override // p000.dz2
    /* JADX INFO: renamed from: b */
    public final void mo4813b() {
        this.f25420h.handleOnBackPressed();
    }

    @Override // p000.dz2
    /* JADX INFO: renamed from: c */
    public final void mo4814c(bz2 bz2Var) {
        this.f25420h.handleOnBackProgressed(new C1233uv(bz2Var));
    }

    @Override // p000.dz2
    /* JADX INFO: renamed from: d */
    public final void mo4815d(bz2 bz2Var) {
        this.f25420h.handleOnBackStarted(new C1233uv(bz2Var));
    }

    /* JADX INFO: renamed from: h */
    public final void m8487h(boolean z) {
        this.f25421i = z;
        m4818g(z && this.f25420h.isEnabled());
    }
}
