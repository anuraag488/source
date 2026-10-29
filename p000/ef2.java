package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class ef2 extends st2 {

    /* JADX INFO: renamed from: a */
    public nq1 f18050a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        nq1 nq1Var = this.f18050a;
        kf2 kf2Var = new kf2();
        kf2Var.f23098o = nq1Var;
        return kf2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ef2) && this.f18050a == ((ef2) obj).f18050a;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ((kf2) mt2Var).f23098o = this.f18050a;
    }

    public final int hashCode() {
        return this.f18050a.hashCode();
    }
}
