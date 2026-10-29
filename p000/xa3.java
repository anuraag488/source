package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xa3 {

    /* JADX INFO: renamed from: a */
    @s24("pvid")
    public String f34100a;

    /* JADX INFO: renamed from: b */
    @s24("pvid_s")
    public Integer f34101b;

    /* JADX INFO: renamed from: c */
    @s24("paidv1_id_android")
    public String f34102c;

    /* JADX INFO: renamed from: d */
    @s24("paidv1_creation_time_android")
    public Long f34103d;

    /* JADX INFO: renamed from: e */
    @s24("paidv1_creation_time_android_seconds")
    public Long f34104e;

    /* JADX INFO: renamed from: f */
    @s24("paidv2_id_android")
    public String f34105f;

    /* JADX INFO: renamed from: g */
    @s24("paidv2_creation_time_android")
    public Long f34106g;

    /* JADX INFO: renamed from: h */
    @s24("paidv2_user_option_android")
    public Boolean f34107h;

    /* JADX INFO: renamed from: i */
    @s24("paidv2_pub_option_android")
    public Boolean f34108i;

    /* JADX INFO: renamed from: j */
    @s24("rdid")
    public String f34109j;

    /* JADX INFO: renamed from: k */
    @s24("is_lat")
    public Boolean f34110k;

    /* JADX INFO: renamed from: l */
    @s24("idtype")
    public String f34111l;

    /* JADX INFO: renamed from: m */
    @s24("adsid")
    public String f34112m;

    /* JADX INFO: renamed from: n */
    @s24("afai")
    public String f34113n;

    /* JADX INFO: renamed from: o */
    @s24("is_afai_lat")
    public Boolean f34114o;

    public xa3(int i) {
        this.f34100a = null;
        this.f34101b = null;
        this.f34102c = null;
        this.f34103d = null;
        this.f34104e = null;
        this.f34105f = null;
        this.f34106g = null;
        this.f34107h = null;
        this.f34108i = null;
        this.f34109j = null;
        this.f34110k = null;
        this.f34111l = null;
        this.f34112m = null;
        this.f34113n = null;
        this.f34114o = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa3)) {
            return false;
        }
        xa3 xa3Var = (xa3) obj;
        return z62.m13387o(this.f34100a, xa3Var.f34100a) && z62.m13387o(this.f34101b, xa3Var.f34101b) && z62.m13387o(this.f34102c, xa3Var.f34102c) && z62.m13387o(this.f34103d, xa3Var.f34103d) && z62.m13387o(this.f34104e, xa3Var.f34104e) && z62.m13387o(this.f34105f, xa3Var.f34105f) && z62.m13387o(this.f34106g, xa3Var.f34106g) && z62.m13387o(this.f34107h, xa3Var.f34107h) && z62.m13387o(this.f34108i, xa3Var.f34108i) && z62.m13387o(this.f34109j, xa3Var.f34109j) && z62.m13387o(this.f34110k, xa3Var.f34110k) && z62.m13387o(this.f34111l, xa3Var.f34111l) && z62.m13387o(this.f34112m, xa3Var.f34112m) && z62.m13387o(this.f34113n, xa3Var.f34113n) && z62.m13387o(this.f34114o, xa3Var.f34114o);
    }

    public final int hashCode() {
        String str = this.f34100a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f34101b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f34102c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f34103d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f34104e;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.f34105f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l3 = this.f34106g;
        int iHashCode7 = (iHashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool = this.f34107h;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f34108i;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.f34109j;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool3 = this.f34110k;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str5 = this.f34111l;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f34112m;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f34113n;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool4 = this.f34114o;
        return iHashCode14 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f34100a;
        Integer num = this.f34101b;
        String str2 = this.f34102c;
        Long l = this.f34103d;
        Long l2 = this.f34104e;
        String str3 = this.f34105f;
        Long l3 = this.f34106g;
        Boolean bool = this.f34107h;
        Boolean bool2 = this.f34108i;
        String str4 = this.f34109j;
        Boolean bool3 = this.f34110k;
        String str5 = this.f34111l;
        String str6 = this.f34112m;
        String str7 = this.f34113n;
        Boolean bool4 = this.f34114o;
        StringBuilder sb = new StringBuilder("PersonallyIdentifiableInformation(appSetId=");
        sb.append(str);
        sb.append(", appSetIdScope=");
        sb.append(num);
        sb.append(", perAppIdV1=");
        sb.append(str2);
        sb.append(", paidV1CreationTimeMilliseconds=");
        sb.append(l);
        sb.append(", paidV1CreationTimeSeconds=");
        sb.append(l2);
        sb.append(", perAppIdV2=");
        sb.append(str3);
        sb.append(", paidV2CreationTimeMilliseconds=");
        sb.append(l3);
        sb.append(", paidV2UserOption=");
        sb.append(bool);
        sb.append(", paidV2PubOption=");
        sb.append(bool2);
        sb.append(", adId=");
        sb.append(str4);
        sb.append(", isLimitedAdTracking=");
        sb.append(bool3);
        sb.append(", idTypeParameter=");
        sb.append(str5);
        sb.append(", adsId=");
        zi4.m13599B(sb, str6, ", amazonFireAdId=", str7, ", isAmazonFireAdIdLimitAdTracking=");
        sb.append(bool4);
        sb.append(")");
        return sb.toString();
    }

    public xa3() {
        this(0);
    }
}
