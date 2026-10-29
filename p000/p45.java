package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p45 extends st2 {

    /* JADX INFO: renamed from: a */
    public float f27377a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        float f = this.f27377a;
        t45 t45Var = new t45();
        t45Var.f30779o = f;
        return t45Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p45) && Float.compare(this.f27377a, ((p45) obj).f27377a) == 0;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ((t45) mt2Var).f30779o = this.f27377a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27377a);
    }

    public final String toString() {
        return "ZIndexElement(zIndex=" + this.f27377a + ")";
    }
}
