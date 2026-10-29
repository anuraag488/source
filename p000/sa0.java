package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sa0 {

    /* JADX INFO: renamed from: a */
    @s24("cllt")
    public Double f30029a;

    /* JADX INFO: renamed from: b */
    @s24("cllg")
    public Double f30030b;

    /* JADX INFO: renamed from: c */
    @s24("clts")
    public Long f30031c;

    /* JADX INFO: renamed from: d */
    @s24("clrd")
    public Float f30032d;

    public sa0(Double d, Double d2, Long l, Float f) {
        this.f30029a = d;
        this.f30030b = d2;
        this.f30031c = l;
        this.f30032d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa0)) {
            return false;
        }
        sa0 sa0Var = (sa0) obj;
        return z62.m13387o(this.f30029a, sa0Var.f30029a) && z62.m13387o(this.f30030b, sa0Var.f30030b) && z62.m13387o(this.f30031c, sa0Var.f30031c) && z62.m13387o(this.f30032d, sa0Var.f30032d);
    }

    public final int hashCode() {
        Double d = this.f30029a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.f30030b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Long l = this.f30031c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Float f = this.f30032d;
        return iHashCode3 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "CoarseLocation(latitude=" + this.f30029a + ", longitude=" + this.f30030b + ", timestamp=" + this.f30031c + ", radius=" + this.f30032d + ")";
    }

    public sa0() {
        this(null, null, null, null);
    }
}
