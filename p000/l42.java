package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class l42 extends st2 {

    /* JADX INFO: renamed from: a */
    public a05 f23780a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        return new n42(this.f23780a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l42) {
            return z62.m13387o(((l42) obj).f23780a, this.f23780a);
        }
        return false;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        n42 n42Var = (n42) mt2Var;
        a05 a05Var = this.f23780a;
        if (z62.m13387o(a05Var, n42Var.f25442q)) {
            return;
        }
        n42Var.f25442q = a05Var;
        n42Var.mo6659P0();
    }

    public final int hashCode() {
        return this.f23780a.hashCode();
    }
}
