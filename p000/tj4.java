package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tj4 extends qx0 implements bj0, ej4 {

    /* JADX INFO: renamed from: q */
    public yg3 f31197q;

    /* JADX INFO: renamed from: r */
    public ik4 f31198r;

    /* JADX INFO: renamed from: s */
    public jk4 f31199s;

    /* JADX INFO: renamed from: t */
    public eo0 f31200t;

    /* JADX INFO: renamed from: u */
    public t82 f31201u;

    /* JADX INFO: renamed from: v */
    public wy0 f31202v;

    /* JADX INFO: renamed from: w */
    public jl3 f31203w;

    @Override // p000.mt2
    /* JADX INFO: renamed from: G0 */
    public final void mo26G0() {
        yg3 yg3Var = this.f31197q;
        yg3Var.f35216c = un4.f32017c;
        yg3Var.f35215b = this;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
        yg3 yg3Var = this.f31197q;
        yg3Var.f35216c = un4.f32016b;
        yg3Var.f35215b = null;
    }

    @Override // p000.ej4
    /* JADX INFO: renamed from: j */
    public final long mo5134j(cf2 cf2Var) {
        return mo5135s(cf2Var).m7169e();
    }

    @Override // p000.ej4
    /* JADX INFO: renamed from: s */
    public final jl3 mo5135s(cf2 cf2Var) {
        if (!this.f25208n) {
            return this.f31203w;
        }
        jl3 jl3Var = (jl3) this.f31200t.invoke(cf2Var);
        if (jl3Var == null) {
            return this.f31203w;
        }
        this.f31203w = jl3Var;
        return jl3Var;
    }

    @Override // p000.ej4
    /* JADX INFO: renamed from: y0 */
    public final dj4 mo5136y0() {
        return (dj4) this.f31202v.getValue();
    }
}
