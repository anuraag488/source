package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pl0 extends ql0 {

    /* JADX INFO: renamed from: a */
    public final int f27725a;

    public pl0(int i) {
        this.f27725a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pl0) && this.f27725a == ((pl0) obj).f27725a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27725a);
    }

    public final String toString() {
        return c75.m3878j("ConstraintsNotMet(reason=", this.f27725a, ")");
    }
}
