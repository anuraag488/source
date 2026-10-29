package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ru3 implements jk2, AutoCloseable {

    /* JADX INFO: renamed from: a */
    public String f29642a;

    /* JADX INFO: renamed from: b */
    public qu3 f29643b;

    /* JADX INFO: renamed from: c */
    public boolean f29644c;

    /* JADX INFO: renamed from: a */
    public final void m10443a(yu3 yu3Var, gk2 gk2Var) {
        if (this.f29644c) {
            C1077qn.m9989o("Already attached to lifecycleOwner");
            return;
        }
        this.f29644c = true;
        gk2Var.mo6015a(this);
        yu3Var.m13255c(this.f29642a, (vf0) this.f29643b.f28818a.f29655f);
    }

    @Override // p000.jk2
    /* JADX INFO: renamed from: b */
    public final void mo3449b(lk2 lk2Var, ek2 ek2Var) {
        if (ek2Var == ek2.ON_DESTROY) {
            this.f29644c = false;
            lk2Var.getLifecycle().mo6017c(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
