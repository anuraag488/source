package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class kk1 extends st2 {

    /* JADX INFO: renamed from: a */
    public yp1 f23192a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        yp1 yp1Var = this.f23192a;
        lk1 lk1Var = new lk1();
        lk1Var.f24101o = yp1Var;
        return lk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kk1) && this.f23192a == ((kk1) obj).f23192a;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ((lk1) mt2Var).f24101o = this.f23192a;
    }

    public final int hashCode() {
        return this.f23192a.hashCode();
    }
}
