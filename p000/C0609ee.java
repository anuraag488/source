package p000;

/* JADX INFO: renamed from: ee */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0609ee implements pb3 {

    /* JADX INFO: renamed from: a */
    public int f18025a;

    @Override // p000.pb3
    /* JADX INFO: renamed from: a */
    public final xm1 mo5094a(xm1 xm1Var) {
        int i = this.f18025a;
        return (i == 0 || i == Integer.MAX_VALUE) ? xm1Var : new xm1(sc6.m10675p(xm1Var.f34418a + i, 1, 1000));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0609ee) && this.f18025a == ((C0609ee) obj).f18025a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18025a);
    }

    public final String toString() {
        return c75.m3878j("AndroidFontResolveInterceptor(fontWeightAdjustment=", this.f18025a, ")");
    }
}
