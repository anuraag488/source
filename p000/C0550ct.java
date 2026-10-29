package p000;

/* JADX INFO: renamed from: ct */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0550ct extends cq0 {

    /* JADX INFO: renamed from: a */
    public long f16438a;

    /* JADX INFO: renamed from: b */
    public long f16439b;

    /* JADX INFO: renamed from: c */
    public String f16440c;

    /* JADX INFO: renamed from: d */
    public String f16441d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cq0) {
            C0550ct c0550ct = (C0550ct) ((cq0) obj);
            if (this.f16438a == c0550ct.f16438a && this.f16439b == c0550ct.f16439b && this.f16440c.equals(c0550ct.f16440c)) {
                String str = this.f16441d;
                String str2 = c0550ct.f16441d;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f16438a;
        long j2 = this.f16439b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f16440c.hashCode()) * 1000003;
        String str = this.f16441d;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.f16438a);
        sb.append(", size=");
        sb.append(this.f16439b);
        sb.append(", name=");
        sb.append(this.f16440c);
        sb.append(", uuid=");
        return zi4.m13623w(sb, this.f16441d, "}");
    }
}
