package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hj4 implements ej4 {

    /* JADX INFO: renamed from: a */
    public long f20628a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ij4 f20629b;

    @Override // p000.ej4
    /* JADX INFO: renamed from: j */
    public final long mo5134j(cf2 cf2Var) {
        cf2 cf2Var2 = (cf2) this.f20629b.f21498r.getValue();
        if (cf2Var2 != null) {
            if (cf2Var2.mo4000K()) {
                return cf2Var.mo3999I(cf2Var2.mo4007b(this.f20628a));
            }
            return 0L;
        }
        t32.m10971d("Tried to open context menu before the anchor was placed.");
        xy4.m12794w();
        return 0L;
    }

    @Override // p000.ej4
    /* JADX INFO: renamed from: s */
    public final jl3 mo5135s(cf2 cf2Var) {
        return AbstractC0647fd.m5672j(mo5134j(cf2Var), 0L);
    }

    @Override // p000.ej4
    /* JADX INFO: renamed from: y0 */
    public final dj4 mo5136y0() {
        return sj3.m10821q(this.f20629b);
    }
}
