package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s93 implements oo0 {

    /* JADX INFO: renamed from: a */
    public float f30013a;

    @Override // p000.oo0
    /* JADX INFO: renamed from: a */
    public final float mo9217a(long j, ky0 ky0Var) {
        return (this.f30013a / 100.0f) * h74.m6272d(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s93) && Float.compare(this.f30013a, ((s93) obj).f30013a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f30013a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f30013a + "%)";
    }
}
