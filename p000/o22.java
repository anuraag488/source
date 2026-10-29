package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class o22 extends st2 {

    /* JADX INFO: renamed from: a */
    public nv2 f26300a;

    /* JADX INFO: renamed from: b */
    public q22 f26301b;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        px0 px0VarMo7265a = this.f26301b.mo7265a(this.f26300a);
        p22 p22Var = new p22();
        p22Var.f27323q = px0VarMo7265a;
        p22Var.m10154O0(px0VarMo7265a);
        return p22Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o22)) {
            return false;
        }
        o22 o22Var = (o22) obj;
        return z62.m13387o(this.f26300a, o22Var.f26300a) && z62.m13387o(this.f26301b, o22Var.f26301b);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        p22 p22Var = (p22) mt2Var;
        px0 px0VarMo7265a = this.f26301b.mo7265a(this.f26300a);
        p22Var.m10155P0(p22Var.f27323q);
        p22Var.f27323q = px0VarMo7265a;
        p22Var.m10154O0(px0VarMo7265a);
    }

    public final int hashCode() {
        return this.f26301b.hashCode() + (this.f26300a.hashCode() * 31);
    }
}
