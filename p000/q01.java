package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class q01 extends st2 {

    /* JADX INFO: renamed from: a */
    public jh2 f28117a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        jh2 jh2Var = this.f28117a;
        r01 r01Var = new r01();
        r01Var.f28923o = jh2Var;
        return r01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q01) && z62.m13387o(this.f28117a, ((q01) obj).f28117a);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        r01 r01Var = (r01) mt2Var;
        jh2 jh2Var = this.f28117a;
        if (z62.m13387o(r01Var.f28923o, jh2Var) || !r01Var.f25195a.f25208n) {
            return;
        }
        jh2 jh2Var2 = r01Var.f28923o;
        jh2Var2.m7126d();
        jh2Var2.f22273b = null;
        jh2Var2.f22274c = -1;
        jh2Var.f22281j = r01Var;
        r01Var.f28923o = jh2Var;
    }

    public final int hashCode() {
        return this.f28117a.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.f28117a + ")";
    }
}
