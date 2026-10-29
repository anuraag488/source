package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tc3 {

    /* JADX INFO: renamed from: a */
    public int f31073a;

    /* JADX INFO: renamed from: a */
    public static String m11030a(int i) {
        if (i == 1) {
            return "Touch";
        }
        if (i == 2) {
            return "Mouse";
        }
        if (i != 3) {
            return i != 4 ? "Unknown" : "Eraser";
        }
        return "Stylus";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tc3) && this.f31073a == ((tc3) obj).f31073a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31073a);
    }

    public final String toString() {
        return m11030a(this.f31073a);
    }
}
