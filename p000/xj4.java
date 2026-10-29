package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xj4 {

    /* JADX INFO: renamed from: a */
    public int f34323a;

    /* JADX INFO: renamed from: a */
    public static String m12698a(int i) {
        if (i == 1) {
            return "Ltr";
        }
        if (i == 2) {
            return "Rtl";
        }
        if (i == 3) {
            return "Content";
        }
        if (i == 4) {
            return "ContentOrLtr";
        }
        if (i == 5) {
            return "ContentOrRtl";
        }
        return i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xj4) && this.f34323a == ((xj4) obj).f34323a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34323a);
    }

    public final String toString() {
        return m12698a(this.f34323a);
    }
}
