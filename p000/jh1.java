package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jh1 {

    /* JADX INFO: renamed from: a */
    public gx2 f22270a;

    /* JADX INFO: renamed from: b */
    public kp0 f22271b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jh1) {
            jh1 jh1Var = (jh1) obj;
            if (this.f22270a == jh1Var.f22270a && z62.m13387o(this.f22271b, jh1Var.f22271b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f22270a.hashCode() * 31;
        kp0 kp0Var = this.f22271b;
        return iHashCode + (kp0Var == null ? 0 : kp0Var.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f22270a + ", subscriber=" + this.f22271b + ')';
    }
}
