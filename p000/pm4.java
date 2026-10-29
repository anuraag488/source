package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class pm4 extends st2 {

    /* JADX INFO: renamed from: a */
    public nv2 f27748a;

    /* JADX INFO: renamed from: b */
    public boolean f27749b;

    /* JADX INFO: renamed from: c */
    public ag1 f27750c;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        nv2 nv2Var = this.f27748a;
        boolean z = this.f27749b;
        ag1 ag1Var = this.f27750c;
        rm4 rm4Var = new rm4();
        rm4Var.f29419o = nv2Var;
        rm4Var.f29420p = z;
        rm4Var.f29421q = ag1Var;
        rm4Var.f29425u = Float.NaN;
        rm4Var.f29426v = Float.NaN;
        return rm4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm4)) {
            return false;
        }
        pm4 pm4Var = (pm4) obj;
        return z62.m13387o(this.f27748a, pm4Var.f27748a) && this.f27749b == pm4Var.f27749b && z62.m13387o(this.f27750c, pm4Var.f27750c);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        rm4 rm4Var = (rm4) mt2Var;
        rm4Var.f29419o = this.f27748a;
        boolean z = rm4Var.f29420p;
        boolean z2 = this.f27749b;
        if (z != z2) {
            z62.m13349H(rm4Var);
        }
        rm4Var.f29420p = z2;
        rm4Var.f29421q = this.f27750c;
        if (rm4Var.f29424t == null && !Float.isNaN(rm4Var.f29426v)) {
            rm4Var.f29424t = dt0.m4700c(rm4Var.f29426v);
        }
        if (rm4Var.f29423s != null || Float.isNaN(rm4Var.f29425u)) {
            return;
        }
        rm4Var.f29423s = dt0.m4700c(rm4Var.f29425u);
    }

    public final int hashCode() {
        return this.f27750c.hashCode() + zi4.m13611k(this.f27748a.hashCode() * 31, 31, this.f27749b);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.f27748a + ", checked=" + this.f27749b + ", animationSpec=" + this.f27750c + ")";
    }
}
