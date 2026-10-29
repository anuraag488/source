package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yg2 {

    /* JADX INFO: renamed from: a */
    public int f35211a;

    /* JADX INFO: renamed from: b */
    public int f35212b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg2)) {
            return false;
        }
        yg2 yg2Var = (yg2) obj;
        return this.f35211a == yg2Var.f35211a && this.f35212b == yg2Var.f35212b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35212b) + (Integer.hashCode(this.f35211a) * 31);
    }

    public final String toString() {
        return d55.m4367l("Interval(start=", this.f35211a, ", end=", this.f35212b, ")");
    }
}
