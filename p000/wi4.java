package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wi4 {

    /* JADX INFO: renamed from: a */
    public int f33412a;

    /* JADX INFO: renamed from: a */
    public static String m12307a(int i) {
        if (i == 1) {
            return "Left";
        }
        if (i == 2) {
            return "Right";
        }
        if (i == 3) {
            return "Center";
        }
        if (i == 4) {
            return "Justify";
        }
        if (i == 5) {
            return "Start";
        }
        if (i == 6) {
            return "End";
        }
        return i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wi4) && this.f33412a == ((wi4) obj).f33412a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33412a);
    }

    public final String toString() {
        return m12307a(this.f33412a);
    }
}
