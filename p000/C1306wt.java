package p000;

/* JADX INFO: renamed from: wt */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1306wt extends qq0 {

    /* JADX INFO: renamed from: a */
    public int f33710a;

    /* JADX INFO: renamed from: b */
    public String f33711b;

    /* JADX INFO: renamed from: c */
    public String f33712c;

    /* JADX INFO: renamed from: d */
    public boolean f33713d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qq0) {
            C1306wt c1306wt = (C1306wt) ((qq0) obj);
            if (this.f33710a == c1306wt.f33710a && this.f33711b.equals(c1306wt.f33711b) && this.f33712c.equals(c1306wt.f33712c) && this.f33713d == c1306wt.f33713d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f33713d ? 1231 : 1237) ^ ((((((this.f33710a ^ 1000003) * 1000003) ^ this.f33711b.hashCode()) * 1000003) ^ this.f33712c.hashCode()) * 1000003);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f33710a + ", version=" + this.f33711b + ", buildVersion=" + this.f33712c + ", jailbroken=" + this.f33713d + "}";
    }
}
