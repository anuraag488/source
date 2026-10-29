package p000;

/* JADX INFO: renamed from: ae */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0451ae {

    /* JADX INFO: renamed from: a */
    public float f14397a;

    /* JADX INFO: renamed from: b */
    public float f14398b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0451ae)) {
            return false;
        }
        C0451ae c0451ae = (C0451ae) obj;
        return Float.compare(this.f14397a, c0451ae.f14397a) == 0 && Float.compare(this.f14398b, c0451ae.f14398b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14398b) + (Float.hashCode(this.f14397a) * 31);
    }

    public final String toString() {
        return "FlingResult(distanceCoefficient=" + this.f14397a + ", velocityCoefficient=" + this.f14398b + ")";
    }
}
