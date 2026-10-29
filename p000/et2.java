package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class et2 extends st2 {

    /* JADX INFO: renamed from: a */
    public boolean f18468a;

    /* JADX INFO: renamed from: b */
    public boolean f18469b;

    /* JADX INFO: renamed from: c */
    public ag1 f18470c;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        boolean z = this.f18468a;
        boolean z2 = this.f18469b;
        ag1 ag1Var = this.f18470c;
        ft2 ft2Var = new ft2();
        ft2Var.f19274o = z;
        ft2Var.f19275p = z2;
        ft2Var.f19276q = ag1Var;
        ft2Var.f19277r = dt0.m4700c((z || z2) ? 0.0f : 1.0f);
        return ft2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et2)) {
            return false;
        }
        et2 et2Var = (et2) obj;
        return this.f18468a == et2Var.f18468a && this.f18469b == et2Var.f18469b && z62.m13387o(this.f18470c, et2Var.f18470c);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        ft2 ft2Var = (ft2) mt2Var;
        ft2Var.f19274o = this.f18468a;
        ft2Var.f19275p = this.f18469b;
        ft2Var.f19276q = this.f18470c;
        lb5.m7910S(ft2Var.m8391C0(), null, null, new C0784j3(ft2Var, null, (byte) 4), 3);
    }

    public final int hashCode() {
        return this.f18470c.hashCode() + zi4.m13611k(Boolean.hashCode(this.f18468a) * 31, 31, this.f18469b);
    }

    public final String toString() {
        return "MinimumInteractiveBalancedPaddingElement(hasVisibleLeadingContent=" + this.f18468a + ", hasVisibleTrailingContent=" + this.f18469b + ", animationSpec=" + this.f18470c + ")";
    }
}
