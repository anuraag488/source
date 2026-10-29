package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pd2 {

    /* JADX INFO: renamed from: a */
    public Comparable f27533a;

    /* JADX INFO: renamed from: b */
    public g51 f27534b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pd2)) {
            return false;
        }
        pd2 pd2Var = (pd2) obj;
        return z62.m13387o(pd2Var.f27533a, this.f27533a) && z62.m13387o(pd2Var.f27534b, this.f27534b);
    }

    public final int hashCode() {
        Comparable comparable = this.f27533a;
        return this.f27534b.hashCode() + zi4.m13609i(0, (comparable != null ? comparable.hashCode() : 0) * 31, 31);
    }
}
