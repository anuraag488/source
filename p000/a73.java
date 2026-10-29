package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class a73 extends st2 {

    /* JADX INFO: renamed from: a */
    public final float f149a;

    /* JADX INFO: renamed from: b */
    public final float f150b;

    /* JADX INFO: renamed from: c */
    public final float f151c;

    /* JADX INFO: renamed from: d */
    public final float f152d;

    /* JADX INFO: renamed from: e */
    public final boolean f153e;

    public a73(float f, float f2, float f3, float f4, boolean z) {
        this.f149a = f;
        this.f150b = f2;
        this.f151c = f3;
        this.f152d = f4;
        this.f153e = z;
        boolean z2 = true;
        boolean z3 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z2 = false;
        }
        if (!z3 || !z2) {
            o32.m8934a("Padding must be non-negative");
        }
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        c73 c73Var = new c73();
        c73Var.f15855o = this.f149a;
        c73Var.f15856p = this.f150b;
        c73Var.f15857q = this.f151c;
        c73Var.f15858r = this.f152d;
        c73Var.f15859s = this.f153e;
        return c73Var;
    }

    public final boolean equals(Object obj) {
        a73 a73Var = obj instanceof a73 ? (a73) obj : null;
        return a73Var != null && p11.m9352c(this.f149a, a73Var.f149a) && p11.m9352c(this.f150b, a73Var.f150b) && p11.m9352c(this.f151c, a73Var.f151c) && p11.m9352c(this.f152d, a73Var.f152d) && this.f153e == a73Var.f153e;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        c73 c73Var = (c73) mt2Var;
        c73Var.f15855o = this.f149a;
        c73Var.f15856p = this.f150b;
        c73Var.f15857q = this.f151c;
        c73Var.f15858r = this.f152d;
        c73Var.f15859s = this.f153e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f153e) + c75.m3874f(this.f152d, c75.m3874f(this.f151c, c75.m3874f(this.f150b, Float.hashCode(this.f149a) * 31, 31), 31), 31);
    }
}
