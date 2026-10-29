package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bz2 {

    /* JADX INFO: renamed from: a */
    public int f15699a;

    /* JADX INFO: renamed from: b */
    public float f15700b;

    /* JADX INFO: renamed from: c */
    public float f15701c;

    /* JADX INFO: renamed from: d */
    public float f15702d;

    /* JADX INFO: renamed from: e */
    public long f15703e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bz2.class == obj.getClass()) {
            bz2 bz2Var = (bz2) obj;
            return this.f15701c == bz2Var.f15701c && this.f15702d == bz2Var.f15702d && this.f15700b == bz2Var.f15700b && this.f15699a == bz2Var.f15699a && this.f15703e == bz2Var.f15703e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15703e) + zi4.m13609i(this.f15699a, c75.m3874f(this.f15700b, c75.m3874f(this.f15702d, Float.hashCode(this.f15701c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f15701c + ", touchY=" + this.f15702d + ", progress=" + this.f15700b + ", swipeEdge=" + this.f15699a + ", frameTimeMillis=" + this.f15703e + ')';
    }
}
