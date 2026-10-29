package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z83 extends k93 {

    /* JADX INFO: renamed from: c */
    public float f35871c;

    /* JADX INFO: renamed from: d */
    public float f35872d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z83)) {
            return false;
        }
        z83 z83Var = (z83) obj;
        return Float.compare(this.f35871c, z83Var.f35871c) == 0 && Float.compare(this.f35872d, z83Var.f35872d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f35872d) + (Float.hashCode(this.f35871c) * 31);
    }

    public final String toString() {
        return "ReflectiveQuadTo(x=" + this.f35871c + ", y=" + this.f35872d + ")";
    }
}
