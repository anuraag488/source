package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fu2 {

    /* JADX INFO: renamed from: a */
    public long f19320a;

    public final boolean equals(Object obj) {
        return (obj instanceof fu2) && this.f19320a == ((fu2) obj).f19320a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19320a);
    }

    public final String toString() {
        return "IndirectPointerEventData(packedValue=" + this.f19320a + ")";
    }
}
