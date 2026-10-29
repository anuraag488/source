package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vd0 implements nt2 {

    /* JADX INFO: renamed from: a */
    public nt2 f32530a;

    /* JADX INFO: renamed from: b */
    public nt2 f32531b;

    @Override // p000.nt2
    /* JADX INFO: renamed from: a */
    public final Object mo7628a(mq1 mq1Var, Object obj) {
        return this.f32531b.mo7628a(mq1Var, this.f32530a.mo7628a(mq1Var, obj));
    }

    @Override // p000.nt2
    /* JADX INFO: renamed from: b */
    public final boolean mo7629b(yp1 yp1Var) {
        return this.f32530a.mo7629b(yp1Var) && this.f32531b.mo7629b(yp1Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vd0)) {
            return false;
        }
        vd0 vd0Var = (vd0) obj;
        return this.f32530a.equals(vd0Var.f32530a) && z62.m13387o(this.f32531b, vd0Var.f32531b);
    }

    public final int hashCode() {
        return (this.f32531b.hashCode() * 31) + this.f32530a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = (StringBuilder) mo7628a(new sg0((byte) 16), new StringBuilder("["));
        sb.append("]");
        return sb.toString();
    }
}
