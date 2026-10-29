package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pe3 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f27565d = 0;

    /* JADX INFO: renamed from: a */
    public final String f27566a;

    /* JADX INFO: renamed from: b */
    public final String f27567b;

    /* JADX INFO: renamed from: c */
    public final g12 f27568c;

    static {
        as4.m3224C();
    }

    public pe3(String str, String str2, g12 g12Var) {
        this.f27566a = str;
        this.f27567b = str2;
        this.f27568c = g12Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe3)) {
            return false;
        }
        pe3 pe3Var = (pe3) obj;
        return z62.m13387o(this.f27566a, pe3Var.f27566a) && z62.m13387o(this.f27567b, pe3Var.f27567b) && z62.m13387o(this.f27568c, pe3Var.f27568c);
    }

    public final int hashCode() {
        int iHashCode = this.f27566a.hashCode() * 31;
        String str = this.f27567b;
        return this.f27568c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM13625y = zi4.m13625y("PremiumFeature(title=", this.f27566a, ", description=", this.f27567b, ", icon=");
        sbM13625y.append(this.f27568c);
        sbM13625y.append(")");
        return sbM13625y.toString();
    }
}
