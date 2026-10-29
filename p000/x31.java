package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class x31 extends st2 {

    /* JADX INFO: renamed from: a */
    public yp1 f33953a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        yp1 yp1Var = this.f33953a;
        y31 y31Var = new y31();
        y31Var.f34836o = yp1Var;
        return y31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x31) && this.f33953a == ((x31) obj).f33953a;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ((y31) mt2Var).f34836o = this.f33953a;
    }

    public final int hashCode() {
        return this.f33953a.hashCode();
    }
}
