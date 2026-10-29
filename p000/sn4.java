package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sn4 {

    /* JADX INFO: renamed from: a */
    public final o41 f30411a;

    /* JADX INFO: renamed from: b */
    public final o41 f30412b;

    /* JADX INFO: renamed from: c */
    public final double f30413c;

    /* JADX INFO: renamed from: d */
    public final tn4 f30414d;

    /* JADX INFO: renamed from: e */
    public final boolean f30415e;

    /* JADX INFO: renamed from: f */
    public final rn4 f30416f;

    public sn4(o41 o41Var, o41 o41Var2, double d, tn4 tn4Var, boolean z, rn4 rn4Var, int i) {
        z = (i & 16) != 0 ? true : z;
        rn4Var = (i & 32) != 0 ? rn4.f29461a : rn4Var;
        this.f30411a = o41Var;
        this.f30412b = o41Var2;
        this.f30413c = d;
        this.f30414d = tn4Var;
        this.f30415e = z;
        this.f30416f = rn4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn4)) {
            return false;
        }
        sn4 sn4Var = (sn4) obj;
        return z62.m13387o(this.f30411a, sn4Var.f30411a) && z62.m13387o(this.f30412b, sn4Var.f30412b) && Double.compare(this.f30413c, sn4Var.f30413c) == 0 && this.f30414d == sn4Var.f30414d && this.f30415e == sn4Var.f30415e && this.f30416f == sn4Var.f30416f;
    }

    public final int hashCode() {
        return this.f30416f.hashCode() + zi4.m13611k((this.f30414d.hashCode() + ((Double.hashCode(this.f30413c) + ((this.f30412b.hashCode() + (this.f30411a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f30415e);
    }

    public final String toString() {
        return "ToneDeltaPair(roleA=" + this.f30411a + ", roleB=" + this.f30412b + ", delta=" + this.f30413c + ", polarity=" + this.f30414d + ", stayTogether=" + this.f30415e + ", deltaConstraint=" + this.f30416f + ")";
    }
}
