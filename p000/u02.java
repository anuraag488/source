package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u02 {

    /* JADX INFO: renamed from: a */
    public int f31577a;

    public final boolean equals(Object obj) {
        return (obj instanceof u02) && this.f31577a == ((u02) obj).f31577a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31577a);
    }

    public final String toString() {
        int i = this.f31577a;
        if (i == 0) {
            return "Argb8888";
        }
        if (i == 1) {
            return "Alpha8";
        }
        if (i == 2) {
            return "Rgb565";
        }
        if (i == 3) {
            return "F16";
        }
        return i == 4 ? "Gpu" : "Unknown";
    }
}
