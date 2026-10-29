package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zx2 {

    /* JADX INFO: renamed from: a */
    public final yx2 f36443a;

    /* JADX INFO: renamed from: b */
    public final float f36444b;

    public zx2(yx2 yx2Var, float f) {
        this.f36443a = yx2Var;
        this.f36444b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx2)) {
            return false;
        }
        zx2 zx2Var = (zx2) obj;
        return this.f36443a == zx2Var.f36443a && p11.m9352c(this.f36444b, zx2Var.f36444b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f36444b) + (this.f36443a.hashCode() * 31);
    }

    public final String toString() {
        return "NavBarLayoutInfo(position=" + this.f36443a + ", size=" + p11.m9353d(this.f36444b) + ")";
    }
}
