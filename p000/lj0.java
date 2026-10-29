package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lj0 implements nw4 {

    /* JADX INFO: renamed from: a */
    public final yp1 f24062a;

    public lj0(yp1 yp1Var) {
        this.f24062a = yp1Var;
    }

    @Override // p000.nw4
    /* JADX INFO: renamed from: a */
    public final zh3 mo3606a(xh3 xh3Var) {
        return new zh3(xh3Var, null, false, null, null, this.f24062a, false);
    }

    @Override // p000.nw4
    /* JADX INFO: renamed from: b */
    public final Object mo3607b(ga3 ga3Var) {
        return this.f24062a.invoke(ga3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lj0) && z62.m13387o(this.f24062a, ((lj0) obj).f24062a);
    }

    public final int hashCode() {
        return this.f24062a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f24062a + ")";
    }
}
