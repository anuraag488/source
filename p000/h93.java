package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h93 extends k93 {

    /* JADX INFO: renamed from: c */
    public float f20448c;

    /* JADX INFO: renamed from: d */
    public float f20449d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h93)) {
            return false;
        }
        h93 h93Var = (h93) obj;
        return Float.compare(this.f20448c, h93Var.f20448c) == 0 && Float.compare(this.f20449d, h93Var.f20449d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f20449d) + (Float.hashCode(this.f20448c) * 31);
    }

    public final String toString() {
        return "RelativeReflectiveQuadTo(dx=" + this.f20448c + ", dy=" + this.f20449d + ")";
    }
}
