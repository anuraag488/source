package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lx0 {

    /* JADX INFO: renamed from: a */
    public p74 f24429a;

    /* JADX INFO: renamed from: b */
    public qv3 f24430b;

    /* JADX INFO: renamed from: c */
    public gd3 f24431c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx0)) {
            return false;
        }
        lx0 lx0Var = (lx0) obj;
        return z62.m13387o(this.f24429a, lx0Var.f24429a) && this.f24430b == lx0Var.f24430b && this.f24431c == lx0Var.f24431c;
    }

    public final int hashCode() {
        p74 p74Var = this.f24429a;
        int iHashCode = (p74Var != null ? p74Var.hashCode() : 0) * 31;
        qv3 qv3Var = this.f24430b;
        int iHashCode2 = (iHashCode + (qv3Var != null ? qv3Var.hashCode() : 0)) * 887503681;
        gd3 gd3Var = this.f24431c;
        return (iHashCode2 + (gd3Var != null ? gd3Var.hashCode() : 0)) * 887503681;
    }
}
