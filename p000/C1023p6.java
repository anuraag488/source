package p000;

/* JADX INFO: renamed from: p6 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1023p6 {

    /* JADX INFO: renamed from: a */
    public final jd3 f27388a;

    /* JADX INFO: renamed from: b */
    public final long f27389b;

    /* JADX INFO: renamed from: c */
    public final String f27390c;

    public C1023p6(jd3 jd3Var, long j, String str) {
        this.f27388a = jd3Var;
        this.f27389b = j;
        this.f27390c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1023p6)) {
            return false;
        }
        C1023p6 c1023p6 = (C1023p6) obj;
        return this.f27388a == c1023p6.f27388a && this.f27389b == c1023p6.f27389b && this.f27390c.equals(c1023p6.f27390c);
    }

    public final int hashCode() {
        return this.f27390c.hashCode() + zi4.m13612l(this.f27388a.hashCode() * 31, this.f27389b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdValue(precisionType=");
        sb.append(this.f27388a);
        sb.append(", valueMicros=");
        sb.append(this.f27389b);
        return c75.m3881m(sb, ", currencyCode=", this.f27390c, ")");
    }
}
