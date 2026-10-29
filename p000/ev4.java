package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class ev4 extends st2 {

    /* JADX INFO: renamed from: a */
    public float f18516a;

    /* JADX INFO: renamed from: b */
    public float f18517b;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        float f = this.f18516a;
        float f2 = this.f18517b;
        fv4 fv4Var = new fv4();
        fv4Var.f19340o = f;
        fv4Var.f19341p = f2;
        return fv4Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ev4)) {
            return false;
        }
        ev4 ev4Var = (ev4) obj;
        return p11.m9352c(this.f18516a, ev4Var.f18516a) && p11.m9352c(this.f18517b, ev4Var.f18517b);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        fv4 fv4Var = (fv4) mt2Var;
        fv4Var.f19340o = this.f18516a;
        fv4Var.f19341p = this.f18517b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f18517b) + (Float.hashCode(this.f18516a) * 31);
    }
}
