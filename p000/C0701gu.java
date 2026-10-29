package p000;

/* JADX INFO: renamed from: gu */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0701gu {

    /* JADX INFO: renamed from: a */
    public final String f20120a;

    /* JADX INFO: renamed from: b */
    public final String f20121b;

    /* JADX INFO: renamed from: c */
    public final String f20122c;

    public C0701gu(String str, String str2, String str3) {
        if (str == null) {
            xy4.m12782k("Null crashlyticsInstallId");
            throw null;
        }
        this.f20120a = str;
        this.f20121b = str2;
        this.f20122c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0701gu) {
            C0701gu c0701gu = (C0701gu) obj;
            if (this.f20120a.equals(c0701gu.f20120a)) {
                String str = c0701gu.f20121b;
                String str2 = this.f20121b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = c0701gu.f20122c;
                    String str4 = this.f20122c;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f20120a.hashCode() ^ 1000003) * 1000003;
        String str = this.f20121b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f20122c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.f20120a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f20121b);
        sb.append(", firebaseAuthenticationToken=");
        return zi4.m13623w(sb, this.f20122c, "}");
    }
}
