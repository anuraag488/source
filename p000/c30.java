package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class c30 extends st2 {

    /* JADX INFO: renamed from: a */
    public e30 f15779a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        e30 e30Var = this.f15779a;
        f30 f30Var = new f30();
        f30Var.f18699o = e30Var;
        return f30Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c30) && z62.m13387o(this.f15779a, ((c30) obj).f15779a);
        }
        return true;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        f30 f30Var = (f30) mt2Var;
        e30 e30Var = this.f15779a;
        e30 e30Var2 = f30Var.f18699o;
        if (e30Var2 != null) {
            e30Var2.f17658a.m11671k(f30Var);
        }
        if (e30Var != null) {
            e30Var.f17658a.m11663b(f30Var);
        }
        f30Var.f18699o = e30Var;
    }

    public final int hashCode() {
        return this.f15779a.hashCode();
    }
}
