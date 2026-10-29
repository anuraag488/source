package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class o31 extends st2 {

    /* JADX INFO: renamed from: a */
    public yp1 f26314a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        yp1 yp1Var = this.f26314a;
        n31 n31Var = new n31();
        n31Var.f25418o = yp1Var;
        return n31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o31) && this.f26314a == ((o31) obj).f26314a;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ((n31) mt2Var).f25418o = this.f26314a;
    }

    public final int hashCode() {
        return this.f26314a.hashCode();
    }
}
