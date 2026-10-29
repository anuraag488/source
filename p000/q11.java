package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q11 implements oo0 {

    /* JADX INFO: renamed from: a */
    public float f28138a;

    @Override // p000.oo0
    /* JADX INFO: renamed from: a */
    public final float mo9217a(long j, ky0 ky0Var) {
        return ky0Var.mo3575E(this.f28138a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q11) && p11.m9352c(this.f28138a, ((q11) obj).f28138a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f28138a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f28138a + ".dp)";
    }
}
