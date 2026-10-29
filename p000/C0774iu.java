package p000;

/* JADX INFO: renamed from: iu */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0774iu {

    /* JADX INFO: renamed from: a */
    public String f21777a;

    /* JADX INFO: renamed from: b */
    public long f21778b;

    /* JADX INFO: renamed from: c */
    public long f21779c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0774iu) {
            C0774iu c0774iu = (C0774iu) obj;
            if (this.f21777a.equals(c0774iu.f21777a) && this.f21778b == c0774iu.f21778b && this.f21779c == c0774iu.f21779c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f21777a.hashCode() ^ 1000003) * 1000003;
        long j = this.f21778b;
        long j2 = this.f21779c;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.f21777a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f21778b);
        sb.append(", tokenCreationTimestamp=");
        return d55.m4369n(sb, this.f21779c, "}");
    }
}
