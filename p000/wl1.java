package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class wl1 extends st2 {

    /* JADX INFO: renamed from: a */
    public nv2 f33460a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        return new xl1(this.f33460a, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wl1) && z62.m13387o(this.f33460a, ((wl1) obj).f33460a);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ((xl1) mt2Var).m12707T0(this.f33460a);
    }

    public final int hashCode() {
        nv2 nv2Var = this.f33460a;
        if (nv2Var != null) {
            return nv2Var.hashCode();
        }
        return 0;
    }
}
