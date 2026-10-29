package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ca1 implements po3 {

    /* JADX INFO: renamed from: a */
    public Throwable f15903a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ca1) && this.f15903a.equals(((ca1) obj).f15903a);
    }

    public final int hashCode() {
        return this.f15903a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f15903a + ")";
    }
}
