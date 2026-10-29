package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p42 {

    /* JADX INFO: renamed from: a */
    public int f27372a;

    /* JADX INFO: renamed from: b */
    public int f27373b;

    /* JADX INFO: renamed from: c */
    public int f27374c;

    /* JADX INFO: renamed from: d */
    public int f27375d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p42)) {
            return false;
        }
        p42 p42Var = (p42) obj;
        return this.f27372a == p42Var.f27372a && this.f27373b == p42Var.f27373b && this.f27374c == p42Var.f27374c && this.f27375d == p42Var.f27375d;
    }

    public final int hashCode() {
        return (((((this.f27372a * 31) + this.f27373b) * 31) + this.f27374c) * 31) + this.f27375d;
    }

    public final String toString() {
        int i = this.f27372a;
        int i2 = this.f27373b;
        int i3 = this.f27374c;
        int i4 = this.f27375d;
        StringBuilder sbM13624x = zi4.m13624x("InsetsValues(left=", i, ", top=", i2, ", right=");
        sbM13624x.append(i3);
        sbM13624x.append(", bottom=");
        sbM13624x.append(i4);
        sbM13624x.append(")");
        return sbM13624x.toString();
    }
}
