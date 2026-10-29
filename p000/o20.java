package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class o20 extends st2 {

    /* JADX INFO: renamed from: a */
    public C0853kz f26295a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        C0853kz c0853kz = this.f26295a;
        p20 p20Var = new p20();
        p20Var.f27306o = c0853kz;
        return p20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        o20 o20Var = obj instanceof o20 ? (o20) obj : null;
        return o20Var != null && z62.m13387o(this.f26295a, o20Var.f26295a);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ((p20) mt2Var).f27306o = this.f26295a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f26295a.hashCode() * 31);
    }
}
