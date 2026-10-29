package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ux3 {

    /* JADX INFO: renamed from: a */
    public final int f32233a;

    /* JADX INFO: renamed from: b */
    public final long f32234b;

    /* JADX INFO: renamed from: c */
    public final int f32235c;

    /* JADX INFO: renamed from: d */
    public final int f32236d;

    public ux3(int i, int i2, int i3, long j) {
        this.f32233a = i;
        this.f32234b = j;
        this.f32235c = i2;
        this.f32236d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux3)) {
            return false;
        }
        ux3 ux3Var = (ux3) obj;
        return this.f32233a == ux3Var.f32233a && i41.m6646e(this.f32234b, ux3Var.f32234b) && this.f32235c == ux3Var.f32235c && this.f32236d == ux3Var.f32236d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f32233a) * 31;
        r50 r50Var = i41.f21117b;
        return Integer.hashCode(this.f32236d) + zi4.m13609i(this.f32235c, zi4.m13612l(iHashCode, this.f32234b, 31), 31);
    }

    public final String toString() {
        return "ScrollSnapshot(version=" + this.f32233a + ", at=" + i41.m6656o(this.f32234b) + ", fromIndex=" + this.f32235c + ", scrollY=" + this.f32236d + ")";
    }
}
