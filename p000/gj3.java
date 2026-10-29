package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gj3 implements hj3 {

    /* JADX INFO: renamed from: a */
    public final double f19820a;

    public gj3(double d) {
        this.f19820a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gj3) && Double.compare(this.f19820a, ((gj3) obj).f19820a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f19820a);
    }

    @Override // p000.hj3
    /* JADX INFO: renamed from: i */
    public final float mo6008i(float f) {
        return (float) as4.m3234M(f, this.f19820a);
    }

    @Override // p000.hj3
    /* JADX INFO: renamed from: j */
    public final float mo6009j(float f) {
        return (float) as4.m3234M(f, 1.0d / this.f19820a);
    }

    public final String toString() {
        return "GammaTransferFunctions(gamma=" + this.f19820a + ')';
    }
}
