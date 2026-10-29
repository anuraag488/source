package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t74 {

    /* JADX INFO: renamed from: a */
    public final yp1 f30976a;

    /* JADX INFO: renamed from: b */
    public final ag1 f30977b;

    public t74(yp1 yp1Var, ag1 ag1Var) {
        this.f30976a = yp1Var;
        this.f30977b = ag1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t74)) {
            return false;
        }
        t74 t74Var = (t74) obj;
        return z62.m13387o(this.f30976a, t74Var.f30976a) && z62.m13387o(this.f30977b, t74Var.f30977b);
    }

    public final int hashCode() {
        return this.f30977b.hashCode() + (this.f30976a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f30976a + ", animationSpec=" + this.f30977b + ")";
    }
}
