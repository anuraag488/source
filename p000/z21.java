package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class z21<T> extends st2 {

    /* JADX INFO: renamed from: a */
    public C0940nb f35708a;

    /* JADX INFO: renamed from: b */
    public mq1 f35709b;

    /* JADX INFO: renamed from: c */
    public d63 f35710c;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        C0940nb c0940nb = this.f35708a;
        mq1 mq1Var = this.f35709b;
        d63 d63Var = this.f35710c;
        a31 a31Var = new a31();
        a31Var.f75o = c0940nb;
        a31Var.f76p = mq1Var;
        a31Var.f77q = d63Var;
        return a31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z21)) {
            return false;
        }
        z21 z21Var = (z21) obj;
        return z62.m13387o(this.f35708a, z21Var.f35708a) && this.f35709b == z21Var.f35709b && this.f35710c == z21Var.f35710c;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        a31 a31Var = (a31) mt2Var;
        C0940nb c0940nb = this.f35708a;
        mq1 mq1Var = this.f35709b;
        d63 d63Var = this.f35710c;
        boolean zM13387o = z62.m13387o(a31Var.f75o, c0940nb);
        a31Var.f75o = c0940nb;
        a31Var.f76p = mq1Var;
        a31Var.f77q = d63Var;
        if (zM13387o) {
            return;
        }
        a31Var.f78r = false;
        z62.m13349H(a31Var);
    }

    public final int hashCode() {
        return this.f35710c.hashCode() + ((this.f35709b.hashCode() + (this.f35708a.hashCode() * 31)) * 31);
    }
}
