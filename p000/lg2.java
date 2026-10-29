package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lg2 extends st2 {

    /* JADX INFO: renamed from: a */
    public final float f24023a;

    /* JADX INFO: renamed from: b */
    public final boolean f24024b;

    public lg2(float f, boolean z) {
        this.f24023a = f;
        this.f24024b = z;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        mg2 mg2Var = new mg2();
        mg2Var.f24883o = this.f24023a;
        mg2Var.f24884p = this.f24024b;
        return mg2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        lg2 lg2Var = obj instanceof lg2 ? (lg2) obj : null;
        return lg2Var != null && this.f24023a == lg2Var.f24023a && this.f24024b == lg2Var.f24024b;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        mg2 mg2Var = (mg2) mt2Var;
        mg2Var.f24883o = this.f24023a;
        mg2Var.f24884p = this.f24024b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24024b) + (Float.hashCode(this.f24023a) * 31);
    }
}
