package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a11 {

    /* JADX INFO: renamed from: a */
    public float f34a;

    /* JADX INFO: renamed from: b */
    public fh3 f35b;

    /* JADX INFO: renamed from: c */
    public fh3 f36c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a11)) {
            return false;
        }
        a11 a11Var = (a11) obj;
        return Float.compare(this.f34a, a11Var.f34a) == 0 && this.f35b.equals(a11Var.f35b) && this.f36c.equals(a11Var.f36c);
    }

    public final int hashCode() {
        return this.f36c.hashCode() + ((this.f35b.hashCode() + (Float.hashCode(this.f34a) * 31)) * 31);
    }

    public final String toString() {
        return "DistanceVertex(distance=" + this.f34a + ", f1=" + this.f35b + ", f2=" + this.f36c + ')';
    }
}
