package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b10 {

    /* JADX INFO: renamed from: a */
    public C0759ie f14989a = null;

    /* JADX INFO: renamed from: b */
    public C1325xb f14990b = null;

    /* JADX INFO: renamed from: c */
    public j70 f14991c = null;

    /* JADX INFO: renamed from: d */
    public C0489bf f14992d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b10)) {
            return false;
        }
        b10 b10Var = (b10) obj;
        return z62.m13387o(this.f14989a, b10Var.f14989a) && z62.m13387o(this.f14990b, b10Var.f14990b) && z62.m13387o(this.f14991c, b10Var.f14991c) && z62.m13387o(this.f14992d, b10Var.f14992d);
    }

    public final int hashCode() {
        C0759ie c0759ie = this.f14989a;
        int iHashCode = (c0759ie == null ? 0 : c0759ie.hashCode()) * 31;
        C1325xb c1325xb = this.f14990b;
        int iHashCode2 = (iHashCode + (c1325xb == null ? 0 : c1325xb.hashCode())) * 31;
        j70 j70Var = this.f14991c;
        int iHashCode3 = (iHashCode2 + (j70Var == null ? 0 : j70Var.hashCode())) * 31;
        C0489bf c0489bf = this.f14992d;
        return iHashCode3 + (c0489bf != null ? c0489bf.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f14989a + ", canvas=" + this.f14990b + ", canvasDrawScope=" + this.f14991c + ", borderPath=" + this.f14992d + ")";
    }
}
