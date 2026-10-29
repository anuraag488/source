package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class j35 extends st2 {

    /* JADX INFO: renamed from: a */
    public final vz0 f21990a;

    /* JADX INFO: renamed from: b */
    public final mq1 f21991b;

    /* JADX INFO: renamed from: c */
    public final Object f21992c;

    public j35(vz0 vz0Var, mq1 mq1Var, Object obj) {
        this.f21990a = vz0Var;
        this.f21991b = mq1Var;
        this.f21992c = obj;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        l35 l35Var = new l35();
        l35Var.f23771o = this.f21990a;
        l35Var.f23772p = this.f21991b;
        return l35Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j35.class != obj.getClass()) {
            return false;
        }
        j35 j35Var = (j35) obj;
        return this.f21990a == j35Var.f21990a && z62.m13387o(this.f21992c, j35Var.f21992c);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        l35 l35Var = (l35) mt2Var;
        l35Var.f23771o = this.f21990a;
        l35Var.f23772p = this.f21991b;
    }

    public final int hashCode() {
        return this.f21992c.hashCode() + zi4.m13611k(this.f21990a.hashCode() * 31, 31, false);
    }
}
