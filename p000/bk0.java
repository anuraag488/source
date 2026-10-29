package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bk0 {

    /* JADX INFO: renamed from: a */
    @s24("app_id")
    public final String f15340a;

    /* JADX INFO: renamed from: b */
    @s24("ad_unit_id")
    public final String f15341b;

    /* JADX INFO: renamed from: c */
    @s24("is_init")
    public final boolean f15342c;

    /* JADX INFO: renamed from: d */
    @s24("pn")
    public final String f15343d;

    /* JADX INFO: renamed from: e */
    @s24("version")
    public final Integer f15344e;

    /* JADX INFO: renamed from: f */
    @s24("js")
    public final String f15345f;

    /* JADX INFO: renamed from: g */
    @s24("experiment_ids")
    public final String f15346g;

    /* JADX INFO: renamed from: h */
    @s24("inspector_enabled")
    public final boolean f15347h;

    public bk0(String str, String str2, boolean z, String str3, Integer num, String str4, String str5, boolean z2) {
        this.f15340a = str;
        this.f15341b = str2;
        this.f15342c = z;
        this.f15343d = str3;
        this.f15344e = num;
        this.f15345f = str4;
        this.f15346g = str5;
        this.f15347h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk0)) {
            return false;
        }
        bk0 bk0Var = (bk0) obj;
        return z62.m13387o(this.f15340a, bk0Var.f15340a) && z62.m13387o(this.f15341b, bk0Var.f15341b) && this.f15342c == bk0Var.f15342c && z62.m13387o(this.f15343d, bk0Var.f15343d) && z62.m13387o(this.f15344e, bk0Var.f15344e) && z62.m13387o(this.f15345f, bk0Var.f15345f) && z62.m13387o(this.f15346g, bk0Var.f15346g) && this.f15347h == bk0Var.f15347h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public final int hashCode() {
        int iHashCode = this.f15340a.hashCode() * 31;
        String str = this.f15341b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f15342c;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iM7712i = kx5.m7712i((iHashCode2 + r1) * 31, this.f15343d);
        Integer num = this.f15344e;
        int iM7712i2 = kx5.m7712i(kx5.m7712i((iM7712i + (num != null ? num.hashCode() : 0)) * 31, this.f15345f), this.f15346g);
        boolean z2 = this.f15347h;
        return iM7712i2 + (z2 ? 1 : z2);
    }

    public final String toString() {
        String str = this.f15340a;
        String str2 = this.f15341b;
        boolean z = this.f15342c;
        String str3 = this.f15343d;
        Integer num = this.f15344e;
        String str4 = this.f15345f;
        String str5 = this.f15346g;
        boolean z2 = this.f15347h;
        StringBuilder sbM13625y = zi4.m13625y("ConfigLoaderRequest(appId=", str, ", adUnitId=", str2, ", isCalledFromInit=");
        sbM13625y.append(z);
        sbM13625y.append(", packageName=");
        sbM13625y.append(str3);
        sbM13625y.append(", versionCode=");
        sbM13625y.append(num);
        sbM13625y.append(", afmaVersion=");
        sbM13625y.append(str4);
        sbM13625y.append(", experimentIds=");
        sbM13625y.append(str5);
        sbM13625y.append(", inspectorEnabled=");
        sbM13625y.append(z2);
        sbM13625y.append(")");
        return sbM13625y.toString();
    }
}
