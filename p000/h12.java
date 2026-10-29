package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h12 {

    /* JADX INFO: renamed from: a */
    public g12 f20262a;

    /* JADX INFO: renamed from: b */
    public int f20263b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h12)) {
            return false;
        }
        h12 h12Var = (h12) obj;
        return this.f20262a.equals(h12Var.f20262a) && this.f20263b == h12Var.f20263b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20263b) + (this.f20262a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageVectorEntry(imageVector=" + this.f20262a + ", configFlags=" + this.f20263b + ")";
    }
}
