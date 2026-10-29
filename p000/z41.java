package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z41 implements nw4 {

    /* JADX INFO: renamed from: a */
    public final sw2 f35746a;

    public z41(sw2 sw2Var) {
        this.f35746a = sw2Var;
    }

    @Override // p000.nw4
    /* JADX INFO: renamed from: a */
    public final zh3 mo3606a(xh3 xh3Var) {
        return new zh3(xh3Var, null, false, null, this.f35746a, null, true);
    }

    @Override // p000.nw4
    /* JADX INFO: renamed from: b */
    public final Object mo3607b(ga3 ga3Var) {
        return this.f35746a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z41) && z62.m13387o(this.f35746a, ((z41) obj).f35746a);
    }

    public final int hashCode() {
        return this.f35746a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f35746a + ")";
    }
}
