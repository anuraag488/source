package p000;

/* JADX INFO: renamed from: cv */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0552cv {

    /* JADX INFO: renamed from: a */
    public String f16500a;

    /* JADX INFO: renamed from: b */
    public long f16501b;

    /* JADX INFO: renamed from: c */
    public int f16502c;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0552cv)) {
            return false;
        }
        C0552cv c0552cv = (C0552cv) obj;
        String str = this.f16500a;
        String str2 = c0552cv.f16500a;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        if (this.f16501b != c0552cv.f16501b) {
            return false;
        }
        int i = this.f16502c;
        int i2 = c0552cv.f16502c;
        if (i == 0) {
            return i2 == 0;
        }
        return d55.m4358c(i, i2);
    }

    public final int hashCode() {
        String str = this.f16500a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f16501b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        int i2 = this.f16502c;
        return i ^ (i2 != 0 ? d55.m4376u(i2) : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f16500a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f16501b);
        sb.append(", responseCode=");
        int i = this.f16502c;
        if (i == 1) {
            str = "OK";
        } else if (i != 2) {
            str = i != 3 ? "null" : "AUTH_ERROR";
        } else {
            str = "BAD_CONFIG";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
