package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class j83 extends st2 {

    /* JADX INFO: renamed from: a */
    public float f22088a;

    /* JADX INFO: renamed from: b */
    public a83 f22089b;

    /* JADX INFO: renamed from: c */
    public a83 f22090c;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        float f = this.f22088a;
        a83 a83Var = this.f22089b;
        a83 a83Var2 = this.f22090c;
        k83 k83Var = new k83();
        k83Var.f22983o = f;
        k83Var.f22984p = a83Var;
        k83Var.f22985q = a83Var2;
        return k83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j83)) {
            return false;
        }
        j83 j83Var = (j83) obj;
        return this.f22088a == j83Var.f22088a && z62.m13387o(this.f22089b, j83Var.f22089b) && z62.m13387o(this.f22090c, j83Var.f22090c);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        k83 k83Var = (k83) mt2Var;
        k83Var.f22983o = this.f22088a;
        k83Var.f22984p = this.f22089b;
        k83Var.f22985q = this.f22090c;
    }

    public final int hashCode() {
        a83 a83Var = this.f22089b;
        int iHashCode = (a83Var != null ? a83Var.hashCode() : 0) * 31;
        a83 a83Var2 = this.f22090c;
        return Float.hashCode(this.f22088a) + ((iHashCode + (a83Var2 != null ? a83Var2.hashCode() : 0)) * 31);
    }
}
