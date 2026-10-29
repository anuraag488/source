package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class x90 extends st2 {

    /* JADX INFO: renamed from: a */
    public final nv2 f34073a;

    /* JADX INFO: renamed from: b */
    public final q22 f34074b;

    /* JADX INFO: renamed from: c */
    public final boolean f34075c;

    /* JADX INFO: renamed from: d */
    public final boolean f34076d;

    /* JADX INFO: renamed from: e */
    public final String f34077e;

    /* JADX INFO: renamed from: f */
    public final lq3 f34078f;

    /* JADX INFO: renamed from: g */
    public final wp1 f34079g;

    public x90(nv2 nv2Var, q22 q22Var, boolean z, boolean z2, String str, lq3 lq3Var, wp1 wp1Var) {
        this.f34073a = nv2Var;
        this.f34074b = q22Var;
        this.f34075c = z;
        this.f34076d = z2;
        this.f34077e = str;
        this.f34078f = lq3Var;
        this.f34079g = wp1Var;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        return new z90(this.f34073a, this.f34074b, this.f34075c, this.f34076d, this.f34077e, this.f34078f, this.f34079g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x90.class != obj.getClass()) {
            return false;
        }
        x90 x90Var = (x90) obj;
        return z62.m13387o(this.f34073a, x90Var.f34073a) && z62.m13387o(this.f34074b, x90Var.f34074b) && this.f34075c == x90Var.f34075c && this.f34076d == x90Var.f34076d && z62.m13387o(this.f34077e, x90Var.f34077e) && z62.m13387o(this.f34078f, x90Var.f34078f) && this.f34079g == x90Var.f34079g;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ((z90) mt2Var).m8168e1(this.f34073a, this.f34074b, this.f34075c, this.f34076d, this.f34077e, this.f34078f, this.f34079g);
    }

    public final int hashCode() {
        nv2 nv2Var = this.f34073a;
        int iHashCode = (nv2Var != null ? nv2Var.hashCode() : 0) * 31;
        q22 q22Var = this.f34074b;
        int iM13611k = zi4.m13611k(zi4.m13611k((iHashCode + (q22Var != null ? q22Var.hashCode() : 0)) * 31, 31, this.f34075c), 31, this.f34076d);
        String str = this.f34077e;
        int iHashCode2 = (iM13611k + (str != null ? str.hashCode() : 0)) * 31;
        lq3 lq3Var = this.f34078f;
        return this.f34079g.hashCode() + ((iHashCode2 + (lq3Var != null ? Integer.hashCode(lq3Var.f24281a) : 0)) * 31);
    }
}
