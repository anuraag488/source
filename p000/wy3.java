package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wy3 {

    /* JADX INFO: renamed from: a */
    @s24("instant_app")
    public Boolean f33862a;

    /* JADX INFO: renamed from: b */
    @s24("is_privileged_process")
    public boolean f33863b;

    public wy3(int i) {
        this.f33862a = null;
        this.f33863b = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy3)) {
            return false;
        }
        wy3 wy3Var = (wy3) obj;
        return z62.m13387o(this.f33862a, wy3Var.f33862a) && this.f33863b == wy3Var.f33863b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        Boolean bool = this.f33862a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        boolean z = this.f33863b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final String toString() {
        return "SdkEnvironment(isInstantApp=" + this.f33862a + ", isPrivilegedProcess=" + this.f33863b + ")";
    }

    public wy3() {
        this(0);
    }
}
