package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b42 {

    /* JADX INFO: renamed from: a */
    public int f15077a;

    public final boolean equals(Object obj) {
        return (obj instanceof b42) && this.f15077a == ((b42) obj).f15077a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15077a);
    }

    public final String toString() {
        int i = this.f15077a;
        if (i == 1) {
            return "Touch";
        }
        return i == 2 ? "Keyboard" : "Error";
    }
}
