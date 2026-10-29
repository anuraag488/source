package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qy3 extends st2 {

    /* JADX INFO: renamed from: a */
    public wx3 f28893a;

    /* JADX INFO: renamed from: b */
    public boolean f28894b;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        wx3 wx3Var = this.f28893a;
        boolean z = this.f28894b;
        rx3 rx3Var = new rx3();
        rx3Var.f29707o = wx3Var;
        rx3Var.f29708p = z;
        return rx3Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qy3)) {
            return false;
        }
        qy3 qy3Var = (qy3) obj;
        return z62.m13387o(this.f28893a, qy3Var.f28893a) && this.f28894b == qy3Var.f28894b;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        rx3 rx3Var = (rx3) mt2Var;
        rx3Var.f29707o = this.f28893a;
        rx3Var.f29708p = this.f28894b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28894b) + zi4.m13611k(this.f28893a.hashCode() * 31, 31, false);
    }
}
