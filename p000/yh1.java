package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yh1 {

    /* JADX INFO: renamed from: a */
    public float f35222a;

    /* JADX INFO: renamed from: b */
    public float f35223b;

    /* JADX INFO: renamed from: c */
    public long f35224c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh1)) {
            return false;
        }
        yh1 yh1Var = (yh1) obj;
        return Float.compare(this.f35222a, yh1Var.f35222a) == 0 && Float.compare(this.f35223b, yh1Var.f35223b) == 0 && this.f35224c == yh1Var.f35224c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f35224c) + c75.m3874f(this.f35223b, Float.hashCode(this.f35222a) * 31, 31);
    }

    public final String toString() {
        float f = this.f35222a;
        float f2 = this.f35223b;
        return d55.m4369n(d55.m4370o("FlingInfo(initialVelocity=", f, ", distance=", f2, ", duration="), this.f35224c, ")");
    }
}
