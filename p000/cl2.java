package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cl2 {

    /* JADX INFO: renamed from: a */
    public int f16098a;

    public final boolean equals(Object obj) {
        return (obj instanceof cl2) && this.f16098a == ((cl2) obj).f16098a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16098a);
    }

    public final String toString() {
        int i = this.f16098a;
        if (i == 1) {
            return "LineHeightStyle.Trim.FirstLineTop";
        }
        if (i == 16) {
            return "LineHeightStyle.Trim.LastLineBottom";
        }
        if (i == 17) {
            return "LineHeightStyle.Trim.Both";
        }
        return i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
