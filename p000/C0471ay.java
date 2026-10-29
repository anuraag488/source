package p000;

/* JADX INFO: renamed from: ay */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0471ay {

    /* JADX INFO: renamed from: a */
    public float f14938a;

    public final boolean equals(Object obj) {
        return (obj instanceof C0471ay) && Float.compare(this.f14938a, ((C0471ay) obj).f14938a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14938a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f14938a + ")";
    }
}
