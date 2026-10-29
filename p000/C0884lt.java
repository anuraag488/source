package p000;

/* JADX INFO: renamed from: lt */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0884lt extends fq0 {

    /* JADX INFO: renamed from: a */
    public long f24340a;

    /* JADX INFO: renamed from: b */
    public String f24341b;

    /* JADX INFO: renamed from: c */
    public String f24342c;

    /* JADX INFO: renamed from: d */
    public long f24343d;

    /* JADX INFO: renamed from: e */
    public int f24344e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fq0) {
            C0884lt c0884lt = (C0884lt) ((fq0) obj);
            if (this.f24340a == c0884lt.f24340a && this.f24341b.equals(c0884lt.f24341b)) {
                String str = this.f24342c;
                String str2 = c0884lt.f24342c;
                if (str != null ? str.equals(str2) : str2 == null) {
                    if (this.f24343d == c0884lt.f24343d && this.f24344e == c0884lt.f24344e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f24340a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f24341b.hashCode()) * 1000003;
        String str = this.f24342c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.f24343d;
        return this.f24344e ^ ((iHashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f24340a);
        sb.append(", symbol=");
        sb.append(this.f24341b);
        sb.append(", file=");
        sb.append(this.f24342c);
        sb.append(", offset=");
        sb.append(this.f24343d);
        sb.append(", importance=");
        return c75.m3880l(sb, this.f24344e, "}");
    }
}
