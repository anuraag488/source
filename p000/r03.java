package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class r03 {

    /* JADX INFO: renamed from: a */
    @s24("active_network_state")
    public Integer f28929a;

    /* JADX INFO: renamed from: b */
    @s24("active_network_metered")
    public Boolean f28930b;

    public r03(int i) {
        this.f28929a = null;
        this.f28930b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r03)) {
            return false;
        }
        r03 r03Var = (r03) obj;
        return z62.m13387o(this.f28929a, r03Var.f28929a) && z62.m13387o(this.f28930b, r03Var.f28930b);
    }

    public final int hashCode() {
        Integer num = this.f28929a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.f28930b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkSignals(activeNetworkState=" + this.f28929a + ", isActiveNetworkMetered=" + this.f28930b + ")";
    }

    public r03() {
        this(0);
    }
}
