package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i70 {

    /* JADX INFO: renamed from: a */
    public ky0 f21146a;

    /* JADX INFO: renamed from: b */
    public df2 f21147b;

    /* JADX INFO: renamed from: c */
    public h70 f21148c;

    /* JADX INFO: renamed from: d */
    public long f21149d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i70)) {
            return false;
        }
        i70 i70Var = (i70) obj;
        return z62.m13387o(this.f21146a, i70Var.f21146a) && this.f21147b == i70Var.f21147b && z62.m13387o(this.f21148c, i70Var.f21148c) && h74.m6270b(this.f21149d, i70Var.f21149d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f21149d) + ((this.f21148c.hashCode() + ((this.f21147b.hashCode() + (this.f21146a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f21146a + ", layoutDirection=" + this.f21147b + ", canvas=" + this.f21148c + ", size=" + h74.m6275g(this.f21149d) + ")";
    }
}
