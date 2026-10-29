package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pg4 extends st2 {

    /* JADX INFO: renamed from: a */
    public C0853kz f27600a;

    /* JADX INFO: renamed from: b */
    public r54 f27601b;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        C0853kz c0853kz = this.f27600a;
        r54 r54Var = this.f27601b;
        qg4 qg4Var = new qg4();
        qg4Var.f28458o = c0853kz;
        qg4Var.f28459p = r54Var;
        return qg4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg4)) {
            return false;
        }
        pg4 pg4Var = (pg4) obj;
        return z62.m13387o(this.f27600a, pg4Var.f27600a) && z62.m13387o(this.f27601b, pg4Var.f27601b);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        qg4 qg4Var = (qg4) mt2Var;
        qg4Var.f28458o = this.f27600a;
        qg4Var.f28459p = this.f27601b;
    }

    public final int hashCode() {
        return this.f27601b.hashCode() + (this.f27600a.hashCode() * 31);
    }

    public final String toString() {
        return "SystemOverlayAlignElement(alignment=" + this.f27600a + ", offset=" + this.f27601b + ")";
    }
}
