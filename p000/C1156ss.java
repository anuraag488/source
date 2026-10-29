package p000;

/* JADX INFO: renamed from: ss */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1156ss extends aq0 {

    /* JADX INFO: renamed from: a */
    public String f30531a;

    /* JADX INFO: renamed from: b */
    public String f30532b;

    /* JADX INFO: renamed from: c */
    public String f30533c;

    /* JADX INFO: renamed from: d */
    public String f30534d;

    /* JADX INFO: renamed from: e */
    public String f30535e;

    /* JADX INFO: renamed from: f */
    public String f30536f;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aq0) {
            C1156ss c1156ss = (C1156ss) ((aq0) obj);
            if (this.f30531a.equals(c1156ss.f30531a) && this.f30532b.equals(c1156ss.f30532b)) {
                String str = this.f30533c;
                String str2 = c1156ss.f30533c;
                if (str != null ? str.equals(str2) : str2 == null) {
                    String str3 = this.f30534d;
                    String str4 = c1156ss.f30534d;
                    if (str3 != null ? str3.equals(str4) : str4 == null) {
                        String str5 = this.f30535e;
                        String str6 = c1156ss.f30535e;
                        if (str5 != null ? str5.equals(str6) : str6 == null) {
                            String str7 = this.f30536f;
                            String str8 = c1156ss.f30536f;
                            if (str7 != null ? str7.equals(str8) : str8 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f30531a.hashCode() ^ 1000003) * 1000003) ^ this.f30532b.hashCode()) * 1000003;
        String str = this.f30533c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f30534d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f30535e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f30536f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f30531a);
        sb.append(", version=");
        sb.append(this.f30532b);
        sb.append(", displayVersion=");
        sb.append(this.f30533c);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.f30534d);
        sb.append(", developmentPlatform=");
        sb.append(this.f30535e);
        sb.append(", developmentPlatformVersion=");
        return zi4.m13623w(sb, this.f30536f, "}");
    }
}
