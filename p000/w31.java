package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class w31 extends st2 {

    /* JADX INFO: renamed from: a */
    public yp1 f33057a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        return new y50(new z50(), this.f33057a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w31) && this.f33057a == ((w31) obj).f33057a;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        y50 y50Var = (y50) mt2Var;
        y50Var.f34898q = this.f33057a;
        y50Var.m12933O0();
    }

    public final int hashCode() {
        return this.f33057a.hashCode();
    }
}
