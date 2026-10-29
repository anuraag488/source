package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class ul0 extends st2 {

    /* JADX INFO: renamed from: a */
    public yp1 f31967a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        yp1 yp1Var = this.f31967a;
        vl0 vl0Var = new vl0();
        vl0Var.f32714q = yp1Var;
        return vl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ul0) && ((ul0) obj).f31967a == this.f31967a;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        vl0 vl0Var = (vl0) mt2Var;
        yp1 yp1Var = this.f31967a;
        if (yp1Var != vl0Var.f32714q) {
            vl0Var.f32714q = yp1Var;
            vl0Var.mo6659P0();
        }
    }

    public final int hashCode() {
        return this.f31967a.hashCode();
    }
}
