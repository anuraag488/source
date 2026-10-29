package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jy0 {

    /* JADX INFO: renamed from: a */
    public int f22740a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jy0) && this.f22740a == ((jy0) obj).f22740a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22740a);
    }

    public final String toString() {
        return c75.m3878j("DeltaCounter(count=", this.f22740a, ")");
    }
}
