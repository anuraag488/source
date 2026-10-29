package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class xx3 extends st2 {

    /* JADX INFO: renamed from: a */
    public final jy3 f34698a;

    /* JADX INFO: renamed from: b */
    public final d63 f34699b;

    /* JADX INFO: renamed from: c */
    public final boolean f34700c;

    /* JADX INFO: renamed from: d */
    public final xh1 f34701d;

    /* JADX INFO: renamed from: e */
    public final nv2 f34702e;

    /* JADX INFO: renamed from: f */
    public final k30 f34703f;

    /* JADX INFO: renamed from: g */
    public final boolean f34704g;

    /* JADX INFO: renamed from: h */
    public final C1289wd f34705h;

    public xx3(C1289wd c1289wd, k30 k30Var, xh1 xh1Var, nv2 nv2Var, d63 d63Var, jy3 jy3Var, boolean z, boolean z2) {
        this.f34698a = jy3Var;
        this.f34699b = d63Var;
        this.f34700c = z;
        this.f34701d = xh1Var;
        this.f34702e = nv2Var;
        this.f34703f = k30Var;
        this.f34704g = z2;
        this.f34705h = c1289wd;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        yx3 yx3Var = new yx3();
        yx3Var.f35591q = this.f34698a;
        yx3Var.f35592r = this.f34699b;
        yx3Var.f35593s = this.f34700c;
        yx3Var.f35594t = this.f34701d;
        yx3Var.f35595u = this.f34702e;
        yx3Var.f35596v = this.f34703f;
        yx3Var.f35597w = this.f34704g;
        yx3Var.f35598x = this.f34705h;
        return yx3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xx3.class != obj.getClass()) {
            return false;
        }
        xx3 xx3Var = (xx3) obj;
        return this.f34698a.equals(xx3Var.f34698a) && this.f34699b == xx3Var.f34699b && this.f34700c == xx3Var.f34700c && z62.m13387o(this.f34701d, xx3Var.f34701d) && z62.m13387o(this.f34702e, xx3Var.f34702e) && z62.m13387o(this.f34703f, xx3Var.f34703f) && this.f34704g == xx3Var.f34704g && z62.m13387o(this.f34705h, xx3Var.f34705h);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        nv2 nv2Var = this.f34702e;
        ((yx3) mt2Var).m13269T0(this.f34705h, this.f34703f, this.f34701d, nv2Var, this.f34699b, this.f34698a, this.f34704g, this.f34700c);
    }

    public final int hashCode() {
        int iM13611k = zi4.m13611k(zi4.m13611k((this.f34699b.hashCode() + (this.f34698a.hashCode() * 31)) * 31, 31, this.f34700c), 31, false);
        xh1 xh1Var = this.f34701d;
        int iHashCode = (iM13611k + (xh1Var != null ? xh1Var.hashCode() : 0)) * 31;
        nv2 nv2Var = this.f34702e;
        int iHashCode2 = (iHashCode + (nv2Var != null ? nv2Var.hashCode() : 0)) * 31;
        k30 k30Var = this.f34703f;
        int iM13611k2 = zi4.m13611k((iHashCode2 + (k30Var != null ? k30Var.hashCode() : 0)) * 31, 31, this.f34704g);
        C1289wd c1289wd = this.f34705h;
        return iM13611k2 + (c1289wd != null ? c1289wd.hashCode() : 0);
    }
}
