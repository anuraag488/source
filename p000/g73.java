package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g73 implements e73 {

    /* JADX INFO: renamed from: b */
    public final float f19635b;

    /* JADX INFO: renamed from: c */
    public final float f19636c;

    /* JADX INFO: renamed from: d */
    public final float f19637d;

    /* JADX INFO: renamed from: e */
    public final float f19638e;

    public g73(float f, float f2, float f3, float f4) {
        this.f19635b = f;
        this.f19636c = f2;
        this.f19637d = f3;
        this.f19638e = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            o32.m8934a("Padding must be non-negative");
        }
    }

    @Override // p000.e73
    /* JADX INFO: renamed from: a */
    public final float mo3502a(df2 df2Var) {
        return df2Var == df2.f17011a ? this.f19635b : this.f19637d;
    }

    @Override // p000.e73
    /* JADX INFO: renamed from: b */
    public final float mo3503b(df2 df2Var) {
        return df2Var == df2.f17011a ? this.f19637d : this.f19635b;
    }

    @Override // p000.e73
    /* JADX INFO: renamed from: c */
    public final float mo3504c() {
        return this.f19638e;
    }

    @Override // p000.e73
    /* JADX INFO: renamed from: d */
    public final float mo3505d() {
        return this.f19636c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g73)) {
            return false;
        }
        g73 g73Var = (g73) obj;
        return p11.m9352c(this.f19635b, g73Var.f19635b) && p11.m9352c(this.f19636c, g73Var.f19636c) && p11.m9352c(this.f19637d, g73Var.f19637d) && p11.m9352c(this.f19638e, g73Var.f19638e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f19638e) + c75.m3874f(this.f19637d, c75.m3874f(this.f19636c, Float.hashCode(this.f19635b) * 31, 31), 31);
    }

    public final String toString() {
        String strM9353d = p11.m9353d(this.f19635b);
        String strM9353d2 = p11.m9353d(this.f19636c);
        return c75.m3882n(zi4.m13625y("PaddingValues(start=", strM9353d, ", top=", strM9353d2, ", end="), p11.m9353d(this.f19637d), ", bottom=", p11.m9353d(this.f19638e), ")");
    }
}
