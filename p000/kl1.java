package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class kl1 extends st2 {

    /* JADX INFO: renamed from: a */
    public jl1 f23211a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        jl1 jl1Var = this.f23211a;
        ml1 ml1Var = new ml1();
        ml1Var.f24996o = jl1Var;
        return ml1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kl1) && z62.m13387o(this.f23211a, ((kl1) obj).f23211a);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ml1 ml1Var = (ml1) mt2Var;
        ml1Var.f24996o.f22394a.m11671k(ml1Var);
        jl1 jl1Var = this.f23211a;
        ml1Var.f24996o = jl1Var;
        jl1Var.f22394a.m11663b(ml1Var);
    }

    public final int hashCode() {
        return this.f23211a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f23211a + ")";
    }
}
