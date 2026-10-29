package p000;

/* JADX INFO: renamed from: tu */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1195tu extends nq3 {

    /* JADX INFO: renamed from: b */
    public String f31436b;

    /* JADX INFO: renamed from: c */
    public String f31437c;

    /* JADX INFO: renamed from: d */
    public String f31438d;

    /* JADX INFO: renamed from: e */
    public String f31439e;

    /* JADX INFO: renamed from: f */
    public long f31440f;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nq3) {
            C1195tu c1195tu = (C1195tu) ((nq3) obj);
            if (this.f31436b.equals(c1195tu.f31436b) && this.f31437c.equals(c1195tu.f31437c) && this.f31438d.equals(c1195tu.f31438d) && this.f31439e.equals(c1195tu.f31439e) && this.f31440f == c1195tu.f31440f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f31436b.hashCode() ^ 1000003) * 1000003) ^ this.f31437c.hashCode()) * 1000003) ^ this.f31438d.hashCode()) * 1000003) ^ this.f31439e.hashCode()) * 1000003;
        long j = this.f31440f;
        return ((int) (j ^ (j >>> 32))) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.f31436b);
        sb.append(", parameterKey=");
        sb.append(this.f31437c);
        sb.append(", parameterValue=");
        sb.append(this.f31438d);
        sb.append(", variantId=");
        sb.append(this.f31439e);
        sb.append(", templateVersion=");
        return d55.m4369n(sb, this.f31440f, "}");
    }
}
