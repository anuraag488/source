package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class so4 {

    /* JADX INFO: renamed from: a */
    public final double f30445a;

    /* JADX INFO: renamed from: b */
    public final double f30446b;

    /* JADX INFO: renamed from: c */
    public final double f30447c;

    /* JADX INFO: renamed from: d */
    public final double f30448d;

    /* JADX INFO: renamed from: e */
    public final double f30449e;

    /* JADX INFO: renamed from: f */
    public final double f30450f;

    /* JADX INFO: renamed from: g */
    public final double f30451g;

    public so4(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.f30445a = d;
        this.f30446b = d2;
        this.f30447c = d3;
        this.f30448d = d4;
        this.f30449e = d5;
        this.f30450f = d6;
        this.f30451g = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            C1077qn.m9987m("Parameters cannot be NaN");
            throw null;
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d5);
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            C1077qn.m9987m("Parameter a or g is zero, the transfer function is constant");
            throw null;
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            C1077qn.m9987m("Parameter c is zero, the transfer function is constant");
            throw null;
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            C1077qn.m9987m("Parameter a or g is zero, and c is zero, the transfer function is constant");
            throw null;
        }
        if (d4 < 0.0d) {
            C1077qn.m9987m("The transfer function must be increasing");
            throw null;
        }
        if (d2 < 0.0d || d < 0.0d) {
            C1077qn.m9987m("The transfer function must be positive or increasing");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so4)) {
            return false;
        }
        so4 so4Var = (so4) obj;
        return Double.compare(this.f30445a, so4Var.f30445a) == 0 && Double.compare(this.f30446b, so4Var.f30446b) == 0 && Double.compare(this.f30447c, so4Var.f30447c) == 0 && Double.compare(this.f30448d, so4Var.f30448d) == 0 && Double.compare(this.f30449e, so4Var.f30449e) == 0 && Double.compare(this.f30450f, so4Var.f30450f) == 0 && Double.compare(this.f30451g, so4Var.f30451g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f30451g) + ((Double.hashCode(this.f30450f) + ((Double.hashCode(this.f30449e) + ((Double.hashCode(this.f30448d) + ((Double.hashCode(this.f30447c) + ((Double.hashCode(this.f30446b) + (Double.hashCode(this.f30445a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f30445a + ", a=" + this.f30446b + ", b=" + this.f30447c + ", c=" + this.f30448d + ", d=" + this.f30449e + ", e=" + this.f30450f + ", f=" + this.f30451g + ")";
    }

    public /* synthetic */ so4(double d, double d2, double d3, double d4, double d5) {
        this(d, d2, d3, d4, d5, 0.0d, 0.0d);
    }
}
