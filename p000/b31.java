package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b31 extends st2 {

    /* JADX INFO: renamed from: i */
    public static final dh0 f15049i = new dh0((byte) 11);

    /* JADX INFO: renamed from: a */
    public m31 f15050a;

    /* JADX INFO: renamed from: b */
    public d63 f15051b;

    /* JADX INFO: renamed from: c */
    public boolean f15052c;

    /* JADX INFO: renamed from: d */
    public nv2 f15053d;

    /* JADX INFO: renamed from: e */
    public boolean f15054e;

    /* JADX INFO: renamed from: f */
    public nq1 f15055f;

    /* JADX INFO: renamed from: g */
    public nq1 f15056g;

    /* JADX INFO: renamed from: h */
    public boolean f15057h;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        m31 m31Var = this.f15050a;
        d63 d63Var = this.f15051b;
        boolean z = this.f15052c;
        nv2 nv2Var = this.f15053d;
        boolean z2 = this.f15054e;
        nq1 nq1Var = this.f15055f;
        nq1 nq1Var2 = this.f15056g;
        boolean z3 = this.f15057h;
        l31 l31Var = new l31(f15049i, z, nv2Var, d63Var);
        l31Var.f23756J = m31Var;
        l31Var.f23757K = z2;
        l31Var.f23758L = nq1Var;
        l31Var.f23759M = nq1Var2;
        l31Var.f23760N = z3;
        return l31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b31.class != obj.getClass()) {
            return false;
        }
        b31 b31Var = (b31) obj;
        return z62.m13387o(this.f15050a, b31Var.f15050a) && this.f15051b == b31Var.f15051b && this.f15052c == b31Var.f15052c && z62.m13387o(this.f15053d, b31Var.f15053d) && this.f15054e == b31Var.f15054e && z62.m13387o(this.f15055f, b31Var.f15055f) && z62.m13387o(this.f15056g, b31Var.f15056g) && this.f15057h == b31Var.f15057h;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        boolean z;
        l31 l31Var = (l31) mt2Var;
        m31 m31Var = this.f15050a;
        d63 d63Var = this.f15051b;
        boolean z2 = this.f15052c;
        nv2 nv2Var = this.f15053d;
        boolean z3 = this.f15054e;
        nq1 nq1Var = this.f15055f;
        nq1 nq1Var2 = this.f15056g;
        boolean z4 = this.f15057h;
        boolean z5 = true;
        if (z62.m13387o(l31Var.f23756J, m31Var)) {
            z = false;
        } else {
            l31Var.f23756J = m31Var;
            z = true;
        }
        if (l31Var.f23760N != z4) {
            l31Var.f23760N = z4;
        } else {
            z5 = z;
        }
        l31Var.f23758L = nq1Var;
        l31Var.f23759M = nq1Var2;
        l31Var.f23757K = z3;
        l31Var.m11708i1(f15049i, z2, nv2Var, d63Var, z5);
    }

    public final int hashCode() {
        int iM13611k = zi4.m13611k((this.f15051b.hashCode() + (this.f15050a.hashCode() * 31)) * 31, 31, this.f15052c);
        nv2 nv2Var = this.f15053d;
        return Boolean.hashCode(this.f15057h) + ((this.f15056g.hashCode() + ((this.f15055f.hashCode() + zi4.m13611k((iM13611k + (nv2Var != null ? nv2Var.hashCode() : 0)) * 31, 31, this.f15054e)) * 31)) * 31);
    }
}
