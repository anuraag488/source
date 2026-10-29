package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bl2 {

    /* JADX INFO: renamed from: a */
    public int f15402a;

    public final boolean equals(Object obj) {
        return (obj instanceof bl2) && this.f15402a == ((bl2) obj).f15402a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15402a);
    }

    public final String toString() {
        int i = this.f15402a;
        if (i == 0) {
            return "LineHeightStyle.Mode.Fixed";
        }
        if (i == 1) {
            return "LineHeightStyle.Mode.Minimum";
        }
        return i == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
