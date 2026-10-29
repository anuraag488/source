package p000;

/* JADX INFO: renamed from: is */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0773is extends tq0 {

    /* JADX INFO: renamed from: b */
    public String f21723b;

    /* JADX INFO: renamed from: c */
    public String f21724c;

    /* JADX INFO: renamed from: d */
    public int f21725d;

    /* JADX INFO: renamed from: e */
    public String f21726e;

    /* JADX INFO: renamed from: f */
    public String f21727f;

    /* JADX INFO: renamed from: g */
    public String f21728g;

    /* JADX INFO: renamed from: h */
    public String f21729h;

    /* JADX INFO: renamed from: i */
    public String f21730i;

    /* JADX INFO: renamed from: j */
    public String f21731j;

    /* JADX INFO: renamed from: k */
    public sq0 f21732k;

    /* JADX INFO: renamed from: l */
    public yp0 f21733l;

    /* JADX INFO: renamed from: m */
    public vp0 f21734m;

    @Override // p000.tq0
    /* JADX INFO: renamed from: a */
    public final C0736hs mo6928a() {
        C0736hs c0736hs = new C0736hs();
        c0736hs.f20810a = this.f21723b;
        c0736hs.f20811b = this.f21724c;
        c0736hs.f20812c = this.f21725d;
        c0736hs.f20813d = this.f21726e;
        c0736hs.f20814e = this.f21727f;
        c0736hs.f20815f = this.f21728g;
        c0736hs.f20816g = this.f21729h;
        c0736hs.f20817h = this.f21730i;
        c0736hs.f20818i = this.f21731j;
        c0736hs.f20819j = this.f21732k;
        c0736hs.f20820k = this.f21733l;
        c0736hs.f20821l = this.f21734m;
        c0736hs.f20822m = (byte) 1;
        return c0736hs;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tq0) {
            C0773is c0773is = (C0773is) ((tq0) obj);
            if (this.f21723b.equals(c0773is.f21723b) && this.f21724c.equals(c0773is.f21724c) && this.f21725d == c0773is.f21725d && this.f21726e.equals(c0773is.f21726e)) {
                String str = this.f21727f;
                String str2 = c0773is.f21727f;
                if (str != null ? str.equals(str2) : str2 == null) {
                    String str3 = this.f21728g;
                    String str4 = c0773is.f21728g;
                    if (str3 != null ? str3.equals(str4) : str4 == null) {
                        String str5 = this.f21729h;
                        String str6 = c0773is.f21729h;
                        if (str5 != null ? str5.equals(str6) : str6 == null) {
                            if (this.f21730i.equals(c0773is.f21730i) && this.f21731j.equals(c0773is.f21731j)) {
                                sq0 sq0Var = this.f21732k;
                                sq0 sq0Var2 = c0773is.f21732k;
                                if (sq0Var != null ? sq0Var.equals(sq0Var2) : sq0Var2 == null) {
                                    yp0 yp0Var = this.f21733l;
                                    yp0 yp0Var2 = c0773is.f21733l;
                                    if (yp0Var != null ? yp0Var.equals(yp0Var2) : yp0Var2 == null) {
                                        vp0 vp0Var = this.f21734m;
                                        vp0 vp0Var2 = c0773is.f21734m;
                                        if (vp0Var != null ? vp0Var.equals(vp0Var2) : vp0Var2 == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f21723b.hashCode() ^ 1000003) * 1000003) ^ this.f21724c.hashCode()) * 1000003) ^ this.f21725d) * 1000003) ^ this.f21726e.hashCode()) * 1000003;
        String str = this.f21727f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f21728g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f21729h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f21730i.hashCode()) * 1000003) ^ this.f21731j.hashCode()) * 1000003;
        sq0 sq0Var = this.f21732k;
        int iHashCode5 = (iHashCode4 ^ (sq0Var == null ? 0 : sq0Var.hashCode())) * 1000003;
        yp0 yp0Var = this.f21733l;
        int iHashCode6 = (iHashCode5 ^ (yp0Var == null ? 0 : yp0Var.hashCode())) * 1000003;
        vp0 vp0Var = this.f21734m;
        return iHashCode6 ^ (vp0Var != null ? vp0Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f21723b + ", gmpAppId=" + this.f21724c + ", platform=" + this.f21725d + ", installationUuid=" + this.f21726e + ", firebaseInstallationId=" + this.f21727f + ", firebaseAuthenticationToken=" + this.f21728g + ", appQualitySessionId=" + this.f21729h + ", buildVersion=" + this.f21730i + ", displayVersion=" + this.f21731j + ", session=" + this.f21732k + ", ndkPayload=" + this.f21733l + ", appExitInfo=" + this.f21734m + "}";
    }
}
