package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class hu4 extends st2 {

    /* JADX INFO: renamed from: a */
    public wk2 f20884a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        wk2 wk2Var = this.f20884a;
        iu4 iu4Var = new iu4();
        iu4Var.f21809q = wk2Var;
        return iu4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hu4) {
            return z62.m13387o(((hu4) obj).f20884a, this.f20884a);
        }
        return false;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        iu4 iu4Var = (iu4) mt2Var;
        wk2 wk2Var = this.f20884a;
        if (z62.m13387o(wk2Var, iu4Var.f21809q)) {
            return;
        }
        iu4Var.f21809q = wk2Var;
        iu4Var.mo6659P0();
    }

    public final int hashCode() {
        return this.f20884a.hashCode();
    }
}
