package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bn0 {

    /* JADX INFO: renamed from: a */
    public final double f15426a;

    /* JADX INFO: renamed from: b */
    public final double f15427b;

    /* JADX INFO: renamed from: c */
    public final double f15428c;

    /* JADX INFO: renamed from: d */
    public final double f15429d;

    public bn0(double d, double d2, double d3, double d4) {
        this.f15426a = d;
        this.f15427b = d2;
        this.f15428c = d3;
        this.f15429d = d4;
    }

    /* JADX INFO: renamed from: a */
    public final double m3637a(double d) {
        double d2;
        double d3;
        double d4 = this.f15426a;
        if (d <= -1.0d) {
            return d4;
        }
        double d5 = this.f15427b;
        if (d < 0.0d) {
            double d6 = (d - (-1.0d)) / 1.0d;
            d2 = (1.0d - d6) * d4;
            d3 = d6 * d5;
        } else {
            double d7 = this.f15428c;
            if (d < 0.5d) {
                double d8 = (d - 0.0d) / 0.5d;
                d2 = (1.0d - d8) * d5;
                d3 = d8 * d7;
            } else {
                double d9 = this.f15429d;
                if (d >= 1.0d) {
                    return d9;
                }
                double d10 = (d - 0.5d) / 0.5d;
                d2 = (1.0d - d10) * d7;
                d3 = d10 * d9;
            }
        }
        return d3 + d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn0)) {
            return false;
        }
        bn0 bn0Var = (bn0) obj;
        return Double.compare(this.f15426a, bn0Var.f15426a) == 0 && Double.compare(this.f15427b, bn0Var.f15427b) == 0 && Double.compare(this.f15428c, bn0Var.f15428c) == 0 && Double.compare(this.f15429d, bn0Var.f15429d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f15429d) + ((Double.hashCode(this.f15428c) + ((Double.hashCode(this.f15427b) + (Double.hashCode(this.f15426a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ContrastCurve(low=" + this.f15426a + ", normal=" + this.f15427b + ", medium=" + this.f15428c + ", high=" + this.f15429d + ")";
    }
}
