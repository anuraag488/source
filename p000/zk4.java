package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zk4 {

    /* JADX INFO: renamed from: c */
    public static final zk4 f36160c = new zk4(1.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f36161a;

    /* JADX INFO: renamed from: b */
    public final float f36162b;

    public zk4(float f, float f2) {
        this.f36161a = f;
        this.f36162b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk4)) {
            return false;
        }
        zk4 zk4Var = (zk4) obj;
        return this.f36161a == zk4Var.f36161a && this.f36162b == zk4Var.f36162b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f36162b) + (Float.hashCode(this.f36161a) * 31);
    }

    public final String toString() {
        return "TextGeometricTransform(scaleX=" + this.f36161a + ", skewX=" + this.f36162b + ")";
    }
}
