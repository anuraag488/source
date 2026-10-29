package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ly3 {

    /* JADX INFO: renamed from: e */
    public static final ly3 f24466e = new ly3(ky3.f23620b, 0.0f, b41.f15075m, new fe0(1, null, (byte) 1));

    /* JADX INFO: renamed from: a */
    public final ky3 f24467a;

    /* JADX INFO: renamed from: b */
    public final float f24468b;

    /* JADX INFO: renamed from: c */
    public final wp1 f24469c;

    /* JADX INFO: renamed from: d */
    public final yp1 f24470d;

    public ly3(ky3 ky3Var, float f, wp1 wp1Var, yp1 yp1Var) {
        this.f24467a = ky3Var;
        this.f24468b = f;
        this.f24469c = wp1Var;
        this.f24470d = yp1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly3)) {
            return false;
        }
        ly3 ly3Var = (ly3) obj;
        return this.f24467a == ly3Var.f24467a && Float.compare(this.f24468b, ly3Var.f24468b) == 0 && this.f24469c.equals(ly3Var.f24469c) && this.f24470d.equals(ly3Var.f24470d);
    }

    public final int hashCode() {
        return this.f24470d.hashCode() + ((this.f24469c.hashCode() + c75.m3874f(this.f24468b, this.f24467a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "ScrollInfo(direction=" + this.f24467a + ", speedMultiplier=" + this.f24468b + ", maxScrollDistanceProvider=" + this.f24469c + ", onScroll=" + this.f24470d + ')';
    }
}
