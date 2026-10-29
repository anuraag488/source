package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rv3 {

    /* JADX INFO: renamed from: a */
    public final float f29666a;

    /* JADX INFO: renamed from: b */
    public final long f29667b;

    /* JADX INFO: renamed from: c */
    public final ag1 f29668c;

    public rv3(float f, long j, ag1 ag1Var) {
        this.f29666a = f;
        this.f29667b = j;
        this.f29668c = ag1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv3)) {
            return false;
        }
        rv3 rv3Var = (rv3) obj;
        return Float.compare(this.f29666a, rv3Var.f29666a) == 0 && to4.m11081b(this.f29667b, rv3Var.f29667b) && z62.m13387o(this.f29668c, rv3Var.f29668c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f29666a) * 31;
        int i = to4.f31293c;
        return this.f29668c.hashCode() + zi4.m13612l(iHashCode, this.f29667b, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.f29666a + ", transformOrigin=" + to4.m11082c(this.f29667b) + ", animationSpec=" + this.f29668c + ")";
    }
}
