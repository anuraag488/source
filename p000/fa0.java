package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fa0 {

    /* JADX INFO: renamed from: a */
    @s24("signals")
    public t64 f18868a;

    /* JADX INFO: renamed from: b */
    @s24("url")
    public String f18869b;

    /* JADX INFO: renamed from: c */
    @s24("post_body")
    public String f18870c;

    /* JADX INFO: renamed from: d */
    @s24("error")
    public String f18871d;

    /* JADX INFO: renamed from: e */
    @s24("cookies_include")
    public Boolean f18872e;

    /* JADX INFO: renamed from: f */
    @s24("request_id")
    public String f18873f;

    /* JADX INFO: renamed from: g */
    @s24("params")
    public String f18874g;

    /* JADX INFO: renamed from: h */
    @s24("c_params")
    public String f18875h;

    public fa0(String str, String str2, String str3, Boolean bool, String str4, String str5, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        bool = (i & 16) != 0 ? null : bool;
        str4 = (i & 32) != 0 ? null : str4;
        str5 = (i & 128) != 0 ? null : str5;
        this.f18868a = null;
        this.f18869b = str;
        this.f18870c = str2;
        this.f18871d = str3;
        this.f18872e = bool;
        this.f18873f = str4;
        this.f18874g = null;
        this.f18875h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa0)) {
            return false;
        }
        fa0 fa0Var = (fa0) obj;
        return z62.m13387o(this.f18868a, fa0Var.f18868a) && z62.m13387o(this.f18869b, fa0Var.f18869b) && z62.m13387o(this.f18870c, fa0Var.f18870c) && z62.m13387o(this.f18871d, fa0Var.f18871d) && z62.m13387o(this.f18872e, fa0Var.f18872e) && z62.m13387o(this.f18873f, fa0Var.f18873f) && z62.m13387o(this.f18874g, fa0Var.f18874g) && z62.m13387o(this.f18875h, fa0Var.f18875h);
    }

    public final int hashCode() {
        t64 t64Var = this.f18868a;
        int iHashCode = (t64Var == null ? 0 : t64Var.hashCode()) * 31;
        String str = this.f18869b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18870c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18871d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f18872e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f18873f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f18874g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f18875h;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        t64 t64Var = this.f18868a;
        String str = this.f18869b;
        String str2 = this.f18870c;
        String str3 = this.f18871d;
        Boolean bool = this.f18872e;
        String str4 = this.f18873f;
        String str5 = this.f18874g;
        String str6 = this.f18875h;
        StringBuilder sb = new StringBuilder("ClientRequestBuildingData(signals=");
        sb.append(t64Var);
        sb.append(", url=");
        sb.append(str);
        sb.append(", postBody=");
        zi4.m13599B(sb, str2, ", error=", str3, ", cookiesInclude=");
        sb.append(bool);
        sb.append(", requestId=");
        sb.append(str4);
        sb.append(", params=");
        return c75.m3882n(sb, str5, ", cParams=", str6, ")");
    }

    public fa0() {
        this(null, null, null, null, null, null, 255);
    }
}
