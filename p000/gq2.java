package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gq2 {

    /* JADX INFO: renamed from: a */
    public String f20026a;

    /* JADX INFO: renamed from: b */
    public r52 f20027b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq2)) {
            return false;
        }
        gq2 gq2Var = (gq2) obj;
        return this.f20026a.equals(gq2Var.f20026a) && this.f20027b.equals(gq2Var.f20027b);
    }

    public final int hashCode() {
        return this.f20027b.hashCode() + (this.f20026a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f20026a + ", range=" + this.f20027b + ')';
    }
}
