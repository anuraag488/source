package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class v62 extends st2 {

    /* JADX INFO: renamed from: a */
    public u62 f32428a;

    /* JADX INFO: renamed from: b */
    public boolean f32429b;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        u62 u62Var = this.f32428a;
        boolean z = this.f32429b;
        x62 x62Var = new x62();
        x62Var.f34024o = u62Var;
        x62Var.f34025p = z;
        return x62Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        v62 v62Var = obj instanceof v62 ? (v62) obj : null;
        return v62Var != null && this.f32428a == v62Var.f32428a && this.f32429b == v62Var.f32429b;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        x62 x62Var = (x62) mt2Var;
        x62Var.f34024o = this.f32428a;
        x62Var.f34025p = this.f32429b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32429b) + (this.f32428a.hashCode() * 31);
    }
}
