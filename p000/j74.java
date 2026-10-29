package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j74 {

    /* JADX INFO: renamed from: a */
    public C0910mi f22077a;

    /* JADX INFO: renamed from: b */
    public long f22078b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j74) {
            j74 j74Var = (j74) obj;
            if (this.f22077a == j74Var.f22077a && w52.m12108c(this.f22078b, j74Var.f22078b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22078b) + (this.f22077a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.f22077a + ", startSize=" + w52.m12109d(this.f22078b) + ")";
    }
}
