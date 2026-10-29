package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h10 {

    /* JADX INFO: renamed from: a */
    public ga4 f20260a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h10) {
            return p11.m9352c(1.0f, 1.0f) && this.f20260a.equals(((h10) obj).f20260a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20260a.hashCode() + (Float.hashCode(1.0f) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + p11.m9353d(1.0f) + ", brush=" + this.f20260a + ")";
    }
}
