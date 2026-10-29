package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ro1 {

    /* JADX INFO: renamed from: a */
    public String f29470a = null;

    /* JADX INFO: renamed from: b */
    public String f29471b = null;

    /* JADX INFO: renamed from: c */
    public int f29472c = -1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ro1 ro1Var = (ro1) obj;
        return ro1Var != null && this.f29472c == ro1Var.f29472c && z62.m13387o(this.f29470a, ro1Var.f29470a) && z62.m13387o(this.f29471b, ro1Var.f29471b);
    }

    public final int hashCode() {
        int i = this.f29472c * 31;
        String str = this.f29470a;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29471b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f29470a;
        String str2 = this.f29471b;
        return c75.m3880l(zi4.m13625y("Frame(name=", str, ", sourceFile=", str2, ", lineNumber="), this.f29472c, ")");
    }
}
