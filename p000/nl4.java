package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nl4 {

    /* JADX INFO: renamed from: a */
    public int f25934a;

    public final boolean equals(Object obj) {
        return (obj instanceof nl4) && this.f25934a == ((nl4) obj).f25934a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25934a);
    }

    public final String toString() {
        int i = this.f25934a;
        if (i == 1) {
            return "Linearity.Linear";
        }
        if (i == 2) {
            return "Linearity.FontHinting";
        }
        return i == 3 ? "Linearity.None" : "Invalid";
    }
}
