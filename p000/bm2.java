package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bm2 extends cm2 {

    /* JADX INFO: renamed from: a */
    public zs0 f15412a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bm2.class != obj.getClass()) {
            return false;
        }
        return this.f15412a.equals(((bm2) obj).f15412a);
    }

    public final int hashCode() {
        return this.f15412a.hashCode() + (bm2.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f15412a + '}';
    }
}
