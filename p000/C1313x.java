package p000;

/* JADX INFO: renamed from: x */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1313x {

    /* JADX INFO: renamed from: a */
    public float f33887a;

    /* JADX INFO: renamed from: b */
    public float f33888b;

    /* JADX INFO: renamed from: c */
    public float f33889c;

    /* JADX INFO: renamed from: d */
    public float f33890d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1313x)) {
            return false;
        }
        C1313x c1313x = (C1313x) obj;
        return Float.compare(this.f33887a, c1313x.f33887a) == 0 && Float.compare(this.f33888b, c1313x.f33888b) == 0 && Float.compare(this.f33889c, c1313x.f33889c) == 0 && Float.compare(this.f33890d, c1313x.f33890d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f33890d) + c75.m3874f(this.f33889c, c75.m3874f(this.f33888b, Float.hashCode(this.f33887a) * 31, 31), 31);
    }

    public final String toString() {
        return "AbsolutePixelPadding(start=" + this.f33887a + ", end=" + this.f33888b + ", top=" + this.f33889c + ", bottom=" + this.f33890d + ')';
    }
}
