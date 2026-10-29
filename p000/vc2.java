package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class vc2 extends st2 {

    /* JADX INFO: renamed from: a */
    public final yp1 f32518a;

    /* JADX INFO: renamed from: b */
    public final yp1 f32519b;

    public vc2(yp1 yp1Var, yp1 yp1Var2) {
        this.f32518a = yp1Var;
        this.f32519b = yp1Var2;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        xc2 xc2Var = new xc2();
        xc2Var.f34150o = this.f32518a;
        xc2Var.f34151p = this.f32519b;
        return xc2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc2)) {
            return false;
        }
        vc2 vc2Var = (vc2) obj;
        return this.f32518a == vc2Var.f32518a && this.f32519b == vc2Var.f32519b;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        xc2 xc2Var = (xc2) mt2Var;
        xc2Var.f34150o = this.f32518a;
        xc2Var.f34151p = this.f32519b;
    }

    public final int hashCode() {
        yp1 yp1Var = this.f32518a;
        int iHashCode = (yp1Var != null ? yp1Var.hashCode() : 0) * 31;
        yp1 yp1Var2 = this.f32519b;
        return iHashCode + (yp1Var2 != null ? yp1Var2.hashCode() : 0);
    }
}
