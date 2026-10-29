package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class aw1 extends st2 {

    /* JADX INFO: renamed from: a */
    public xl4 f14911a;

    /* JADX INFO: renamed from: b */
    public boolean f14912b;

    /* JADX INFO: renamed from: c */
    public int f14913c;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        xl4 xl4Var = this.f14911a;
        boolean z = this.f14912b;
        int i = this.f14913c;
        cw1 cw1Var = new cw1();
        cw1Var.f16524o = xl4Var;
        cw1Var.f16525p = z;
        cw1Var.f16526q = i;
        cw1Var.f16528s = -1;
        cw1Var.f16529t = -1;
        return cw1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw1)) {
            return false;
        }
        aw1 aw1Var = (aw1) obj;
        return z62.m13387o(this.f14911a, aw1Var.f14911a) && this.f14912b == aw1Var.f14912b && this.f14913c == aw1Var.f14913c;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        cw1 cw1Var = (cw1) mt2Var;
        xl4 xl4Var = this.f14911a;
        boolean z = this.f14912b;
        int i = this.f14913c;
        if (z62.m13387o(cw1Var.f16524o, xl4Var) && cw1Var.f16525p == z && cw1Var.f16526q == i) {
            return;
        }
        cw1Var.f16524o = xl4Var;
        cw1Var.f16525p = z;
        cw1Var.f16526q = i;
        cw1Var.f16530u = zc6.m13512I(xl4Var, sc6.m10652X(cw1Var).f33293A);
        cw1Var.f16527r = true;
        z62.m13349H(cw1Var);
    }

    public final int hashCode() {
        return (((this.f14911a.hashCode() * 31) + (this.f14912b ? 1 : 0)) * 31) + this.f14913c;
    }
}
