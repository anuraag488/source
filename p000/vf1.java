package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class vf1 extends st2 {

    /* JADX INFO: renamed from: a */
    public final vz0 f32564a;

    /* JADX INFO: renamed from: b */
    public final float f32565b;

    public vf1(vz0 vz0Var, float f) {
        this.f32564a = vz0Var;
        this.f32565b = f;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        wf1 wf1Var = new wf1();
        wf1Var.f33287o = this.f32564a;
        wf1Var.f33288p = this.f32565b;
        return wf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf1)) {
            return false;
        }
        vf1 vf1Var = (vf1) obj;
        return this.f32564a == vf1Var.f32564a && this.f32565b == vf1Var.f32565b;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        wf1 wf1Var = (wf1) mt2Var;
        wf1Var.f33287o = this.f32564a;
        wf1Var.f33288p = this.f32565b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32565b) + (this.f32564a.hashCode() * 31);
    }
}
