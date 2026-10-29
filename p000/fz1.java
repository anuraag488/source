package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fz1 {

    /* JADX INFO: renamed from: a */
    public int f19429a;

    /* JADX INFO: renamed from: a */
    public static String m5863a(int i) {
        if (i == 1) {
            return "Hyphens.None";
        }
        if (i == 2) {
            return "Hyphens.Auto";
        }
        return i == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fz1) && this.f19429a == ((fz1) obj).f19429a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19429a);
    }

    public final String toString() {
        return m5863a(this.f19429a);
    }
}
