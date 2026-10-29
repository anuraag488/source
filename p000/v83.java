package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v83 extends k93 {

    /* JADX INFO: renamed from: c */
    public final float f32462c;

    /* JADX INFO: renamed from: d */
    public final float f32463d;

    public v83(float f, float f2) {
        super(3);
        this.f32462c = f;
        this.f32463d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v83)) {
            return false;
        }
        v83 v83Var = (v83) obj;
        return Float.compare(this.f32462c, v83Var.f32462c) == 0 && Float.compare(this.f32463d, v83Var.f32463d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32463d) + (Float.hashCode(this.f32462c) * 31);
    }

    public final String toString() {
        return "LineTo(x=" + this.f32462c + ", y=" + this.f32463d + ")";
    }
}
