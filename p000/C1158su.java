package p000;

/* JADX INFO: renamed from: su */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1158su extends mq3 {

    /* JADX INFO: renamed from: b */
    public String f30559b;

    /* JADX INFO: renamed from: c */
    public String f30560c;

    /* JADX INFO: renamed from: d */
    public String f30561d;

    /* JADX INFO: renamed from: e */
    public String f30562e;

    /* JADX INFO: renamed from: f */
    public long f30563f;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mq3) {
            C1158su c1158su = (C1158su) ((mq3) obj);
            if (this.f30559b.equals(c1158su.f30559b) && this.f30560c.equals(c1158su.f30560c) && this.f30561d.equals(c1158su.f30561d) && this.f30562e.equals(c1158su.f30562e) && this.f30563f == c1158su.f30563f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f30559b.hashCode() ^ 1000003) * 1000003) ^ this.f30560c.hashCode()) * 1000003) ^ this.f30561d.hashCode()) * 1000003) ^ this.f30562e.hashCode()) * 1000003;
        long j = this.f30563f;
        return ((int) (j ^ (j >>> 32))) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.f30559b);
        sb.append(", variantId=");
        sb.append(this.f30560c);
        sb.append(", parameterKey=");
        sb.append(this.f30561d);
        sb.append(", parameterValue=");
        sb.append(this.f30562e);
        sb.append(", templateVersion=");
        return d55.m4369n(sb, this.f30563f, "}");
    }
}
