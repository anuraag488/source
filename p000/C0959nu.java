package p000;

/* JADX INFO: renamed from: nu */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0959nu extends n03 {

    /* JADX INFO: renamed from: a */
    public m03 f26083a;

    /* JADX INFO: renamed from: b */
    public l03 f26084b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n03) {
            n03 n03Var = (n03) obj;
            m03 m03Var = this.f26083a;
            if (m03Var != null ? m03Var.equals(((C0959nu) n03Var).f26083a) : ((C0959nu) n03Var).f26083a == null) {
                l03 l03Var = this.f26084b;
                if (l03Var != null ? l03Var.equals(((C0959nu) n03Var).f26084b) : ((C0959nu) n03Var).f26084b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        m03 m03Var = this.f26083a;
        int iHashCode = ((m03Var == null ? 0 : m03Var.hashCode()) ^ 1000003) * 1000003;
        l03 l03Var = this.f26084b;
        return iHashCode ^ (l03Var != null ? l03Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f26083a + ", mobileSubtype=" + this.f26084b + "}";
    }
}
