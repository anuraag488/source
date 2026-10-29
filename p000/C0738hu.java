package p000;

/* JADX INFO: renamed from: hu */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0738hu {

    /* JADX INFO: renamed from: a */
    public String f20856a;

    /* JADX INFO: renamed from: b */
    public String f20857b;

    /* JADX INFO: renamed from: c */
    public String f20858c;

    /* JADX INFO: renamed from: d */
    public C0552cv f20859d;

    /* JADX INFO: renamed from: e */
    public int f20860e;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0738hu)) {
            return false;
        }
        C0738hu c0738hu = (C0738hu) obj;
        String str = this.f20856a;
        String str2 = c0738hu.f20856a;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        String str3 = this.f20857b;
        String str4 = c0738hu.f20857b;
        if (str3 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str3.equals(str4)) {
            return false;
        }
        String str5 = this.f20858c;
        String str6 = c0738hu.f20858c;
        if (str5 == null) {
            if (str6 != null) {
                return false;
            }
        } else if (!str5.equals(str6)) {
            return false;
        }
        C0552cv c0552cv = this.f20859d;
        C0552cv c0552cv2 = c0738hu.f20859d;
        if (c0552cv == null) {
            if (c0552cv2 != null) {
                return false;
            }
        } else if (!c0552cv.equals(c0552cv2)) {
            return false;
        }
        int i = this.f20860e;
        int i2 = c0738hu.f20860e;
        if (i == 0) {
            return i2 == 0;
        }
        return d55.m4358c(i, i2);
    }

    public final int hashCode() {
        String str = this.f20856a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f20857b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f20858c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C0552cv c0552cv = this.f20859d;
        int iHashCode4 = (iHashCode3 ^ (c0552cv == null ? 0 : c0552cv.hashCode())) * 1000003;
        int i = this.f20860e;
        return iHashCode4 ^ (i != 0 ? d55.m4376u(i) : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f20856a);
        sb.append(", fid=");
        sb.append(this.f20857b);
        sb.append(", refreshToken=");
        sb.append(this.f20858c);
        sb.append(", authToken=");
        sb.append(this.f20859d);
        sb.append(", responseCode=");
        int i = this.f20860e;
        if (i != 1) {
            str = i != 2 ? "null" : "BAD_CONFIG";
        } else {
            str = "OK";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
