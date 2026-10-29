package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ps0 {

    /* JADX INFO: renamed from: a */
    public final ni3 f27929a;

    /* JADX INFO: renamed from: b */
    public final boolean f27930b;

    public ps0(ni3 ni3Var, boolean z) {
        this.f27929a = ni3Var;
        this.f27930b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ps0) {
            ps0 ps0Var = (ps0) obj;
            if (ps0Var.f27929a.equals(this.f27929a) && ps0Var.f27930b == this.f27930b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f27930b).hashCode() ^ ((this.f27929a.hashCode() ^ 1000003) * 1000003);
    }
}
