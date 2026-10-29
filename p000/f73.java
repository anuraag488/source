package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class f73 extends st2 {

    /* JADX INFO: renamed from: a */
    public e73 f18801a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        e73 e73Var = this.f18801a;
        h73 h73Var = new h73();
        h73Var.f20417o = e73Var;
        return h73Var;
    }

    public final boolean equals(Object obj) {
        f73 f73Var = obj instanceof f73 ? (f73) obj : null;
        if (f73Var == null) {
            return false;
        }
        return z62.m13387o(this.f18801a, f73Var.f18801a);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ((h73) mt2Var).f20417o = this.f18801a;
    }

    public final int hashCode() {
        return this.f18801a.hashCode();
    }
}
