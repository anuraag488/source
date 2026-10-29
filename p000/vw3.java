package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vw3 {

    /* JADX INFO: renamed from: a */
    public float f32897a;

    /* JADX INFO: renamed from: b */
    public float f32898b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw3)) {
            return false;
        }
        vw3 vw3Var = (vw3) obj;
        return Float.compare(this.f32897a, vw3Var.f32897a) == 0 && Float.compare(this.f32898b, vw3Var.f32898b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32898b) + (Float.hashCode(this.f32897a) * 31);
    }

    public final String toString() {
        return "ScrollAreaOffsets(start=" + this.f32897a + ", end=" + this.f32898b + ')';
    }
}
