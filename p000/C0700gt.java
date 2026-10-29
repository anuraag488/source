package p000;

/* JADX INFO: renamed from: gt */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0700gt extends eq0 {

    /* JADX INFO: renamed from: a */
    public String f20110a;

    /* JADX INFO: renamed from: b */
    public String f20111b;

    /* JADX INFO: renamed from: c */
    public long f20112c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eq0) {
            C0700gt c0700gt = (C0700gt) ((eq0) obj);
            if (this.f20110a.equals(c0700gt.f20110a) && this.f20111b.equals(c0700gt.f20111b) && this.f20112c == c0700gt.f20112c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f20110a.hashCode() ^ 1000003) * 1000003) ^ this.f20111b.hashCode()) * 1000003;
        long j = this.f20112c;
        return ((int) (j ^ (j >>> 32))) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.f20110a);
        sb.append(", code=");
        sb.append(this.f20111b);
        sb.append(", address=");
        return d55.m4369n(sb, this.f20112c, "}");
    }
}
