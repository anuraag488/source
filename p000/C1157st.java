package p000;

/* JADX INFO: renamed from: st */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1157st extends nq0 {

    /* JADX INFO: renamed from: a */
    public C1194tt f30548a;

    /* JADX INFO: renamed from: b */
    public String f30549b;

    /* JADX INFO: renamed from: c */
    public String f30550c;

    /* JADX INFO: renamed from: d */
    public long f30551d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nq0)) {
            return false;
        }
        C1157st c1157st = (C1157st) ((nq0) obj);
        return this.f30548a.equals(c1157st.f30548a) && this.f30549b.equals(c1157st.f30549b) && this.f30550c.equals(c1157st.f30550c) && this.f30551d == c1157st.f30551d;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f30548a.hashCode() ^ 1000003) * 1000003) ^ this.f30549b.hashCode()) * 1000003) ^ this.f30550c.hashCode()) * 1000003;
        long j = this.f30551d;
        return ((int) (j ^ (j >>> 32))) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.f30548a);
        sb.append(", parameterKey=");
        sb.append(this.f30549b);
        sb.append(", parameterValue=");
        sb.append(this.f30550c);
        sb.append(", templateVersion=");
        return d55.m4369n(sb, this.f30551d, "}");
    }
}
