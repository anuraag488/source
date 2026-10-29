package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class ox1 extends st2 {

    /* JADX INFO: renamed from: a */
    public nv2 f27186a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        nv2 nv2Var = this.f27186a;
        sx1 sx1Var = new sx1();
        sx1Var.f30628o = nv2Var;
        return sx1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ox1) && z62.m13387o(((ox1) obj).f27186a, this.f27186a);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        sx1 sx1Var = (sx1) mt2Var;
        nv2 nv2Var = this.f27186a;
        if (z62.m13387o(sx1Var.f30628o, nv2Var)) {
            return;
        }
        sx1Var.m10945Q0();
        sx1Var.f30628o = nv2Var;
    }

    public final int hashCode() {
        return this.f27186a.hashCode() * 31;
    }
}
