package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class gf2 extends st2 {

    /* JADX INFO: renamed from: a */
    public Object f19767a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        Object obj = this.f19767a;
        hf2 hf2Var = new hf2();
        hf2Var.f20531o = obj;
        return hf2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gf2) && z62.m13387o(this.f19767a, ((gf2) obj).f19767a);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ((hf2) mt2Var).f20531o = this.f19767a;
    }

    public final int hashCode() {
        return this.f19767a.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.f19767a + ")";
    }
}
