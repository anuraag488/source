package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class zx3 extends st2 {

    /* JADX INFO: renamed from: a */
    public jy3 f36445a;

    /* JADX INFO: renamed from: b */
    public d63 f36446b;

    /* JADX INFO: renamed from: c */
    public boolean f36447c;

    /* JADX INFO: renamed from: d */
    public boolean f36448d;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        return new iy3(null, null, null, null, this.f36446b, this.f36445a, this.f36447c, this.f36448d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx3)) {
            return false;
        }
        zx3 zx3Var = (zx3) obj;
        return z62.m13387o(this.f36445a, zx3Var.f36445a) && this.f36446b == zx3Var.f36446b && this.f36447c == zx3Var.f36447c && this.f36448d == zx3Var.f36448d;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ((iy3) mt2Var).m6968j1(null, null, null, null, this.f36446b, this.f36445a, this.f36447c, this.f36448d);
    }

    public final int hashCode() {
        return zi4.m13611k(zi4.m13611k((this.f36446b.hashCode() + (this.f36445a.hashCode() * 31)) * 961, 31, this.f36447c), 29791, this.f36448d);
    }
}
