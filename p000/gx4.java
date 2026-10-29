package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class gx4 extends st2 {

    /* JADX INFO: renamed from: a */
    public dp4 f20175a;

    /* JADX INFO: renamed from: b */
    public yo4 f20176b;

    /* JADX INFO: renamed from: c */
    public p91 f20177c;

    /* JADX INFO: renamed from: d */
    public mc1 f20178d;

    /* JADX INFO: renamed from: e */
    public b54 f20179e;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        yo4 yo4Var = this.f20176b;
        p91 p91Var = this.f20177c;
        mc1 mc1Var = this.f20178d;
        b54 b54Var = this.f20179e;
        ix4 ix4Var = new ix4();
        ix4Var.f21866o = yo4Var;
        ix4Var.f21867p = p91Var;
        ix4Var.f21868q = mc1Var;
        ix4Var.f21869r = b54Var;
        return ix4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx4)) {
            return false;
        }
        gx4 gx4Var = (gx4) obj;
        return z62.m13387o(this.f20175a, gx4Var.f20175a) && z62.m13387o(this.f20176b, gx4Var.f20176b) && z62.m13387o(this.f20177c, gx4Var.f20177c) && z62.m13387o(this.f20178d, gx4Var.f20178d) && z62.m13387o(this.f20179e, gx4Var.f20179e);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ix4 ix4Var = (ix4) mt2Var;
        ix4Var.getClass();
        ix4Var.f21866o = this.f20176b;
        ix4Var.f21867p = this.f20177c;
        ix4Var.f21868q = this.f20178d;
        ix4Var.f21869r = this.f20179e;
    }

    public final int hashCode() {
        return this.f20179e.hashCode() + ((this.f20178d.f24813a.hashCode() + ((this.f20177c.f27464a.hashCode() + ((this.f20176b.hashCode() + (this.f20175a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VeilModifierElement(transition=" + this.f20175a + ", veilAnimation=" + this.f20176b + ", enter=" + this.f20177c + ", exit=" + this.f20178d + ", mutableTransformState=" + this.f20179e + ")";
    }
}
