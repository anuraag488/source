package p000;

/* JADX INFO: renamed from: e6 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0600e6 {

    /* JADX INFO: renamed from: a */
    @s24("width")
    public final int f17831a;

    /* JADX INFO: renamed from: b */
    @s24("height")
    public final int f17832b;

    /* JADX INFO: renamed from: c */
    @s24("is_fluid_height")
    public final boolean f17833c;

    public C0600e6(int i, int i2, boolean z) {
        this.f17831a = i;
        this.f17832b = i2;
        this.f17833c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0600e6)) {
            return false;
        }
        C0600e6 c0600e6 = (C0600e6) obj;
        return this.f17831a == c0600e6.f17831a && this.f17832b == c0600e6.f17832b && this.f17833c == c0600e6.f17833c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iM13526k = zc6.m13526k(this.f17832b, Integer.hashCode(this.f17831a) * 31);
        boolean z = this.f17833c;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iM13526k + r2;
    }

    public final String toString() {
        int i = this.f17831a;
        int i2 = this.f17832b;
        boolean z = this.f17833c;
        StringBuilder sbM13624x = zi4.m13624x("AdSizeBundle(width=", i, ", height=", i2, ", isFluid=");
        sbM13624x.append(z);
        sbM13624x.append(")");
        return sbM13624x.toString();
    }
}
