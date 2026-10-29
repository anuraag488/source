package p000;

import java.util.List;

/* JADX INFO: renamed from: zs */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1416zs extends jq0 {

    /* JADX INFO: renamed from: a */
    public hq0 f36331a;

    /* JADX INFO: renamed from: b */
    public List f36332b;

    /* JADX INFO: renamed from: c */
    public List f36333c;

    /* JADX INFO: renamed from: d */
    public Boolean f36334d;

    /* JADX INFO: renamed from: e */
    public iq0 f36335e;

    /* JADX INFO: renamed from: f */
    public List f36336f;

    /* JADX INFO: renamed from: g */
    public int f36337g;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jq0) {
            C1416zs c1416zs = (C1416zs) ((jq0) obj);
            if (this.f36331a.equals(c1416zs.f36331a)) {
                List list = this.f36332b;
                List list2 = c1416zs.f36332b;
                if (list != null ? list.equals(list2) : list2 == null) {
                    List list3 = this.f36333c;
                    List list4 = c1416zs.f36333c;
                    if (list3 != null ? list3.equals(list4) : list4 == null) {
                        Boolean bool = this.f36334d;
                        Boolean bool2 = c1416zs.f36334d;
                        if (bool != null ? bool.equals(bool2) : bool2 == null) {
                            iq0 iq0Var = this.f36335e;
                            iq0 iq0Var2 = c1416zs.f36335e;
                            if (iq0Var != null ? iq0Var.equals(iq0Var2) : iq0Var2 == null) {
                                List list5 = this.f36336f;
                                List list6 = c1416zs.f36336f;
                                if (list5 != null ? list5.equals(list6) : list6 == null) {
                                    if (this.f36337g == c1416zs.f36337g) {
                                        return true;
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
        int iHashCode = (this.f36331a.hashCode() ^ 1000003) * 1000003;
        List list = this.f36332b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f36333c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f36334d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        iq0 iq0Var = this.f36335e;
        int iHashCode5 = (iHashCode4 ^ (iq0Var == null ? 0 : iq0Var.hashCode())) * 1000003;
        List list3 = this.f36336f;
        return this.f36337g ^ ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.f36331a);
        sb.append(", customAttributes=");
        sb.append(this.f36332b);
        sb.append(", internalKeys=");
        sb.append(this.f36333c);
        sb.append(", background=");
        sb.append(this.f36334d);
        sb.append(", currentProcessDetails=");
        sb.append(this.f36335e);
        sb.append(", appProcessDetails=");
        sb.append(this.f36336f);
        sb.append(", uiOrientation=");
        return c75.m3880l(sb, this.f36337g, "}");
    }
}
