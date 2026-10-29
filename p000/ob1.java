package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ob1 implements a05 {

    /* JADX INFO: renamed from: a */
    public a05 f26536a;

    /* JADX INFO: renamed from: b */
    public a05 f26537b;

    @Override // p000.a05
    /* JADX INFO: renamed from: a */
    public final int mo9a(ky0 ky0Var) {
        int iMo9a = this.f26536a.mo9a(ky0Var) - this.f26537b.mo9a(ky0Var);
        if (iMo9a < 0) {
            return 0;
        }
        return iMo9a;
    }

    @Override // p000.a05
    /* JADX INFO: renamed from: b */
    public final int mo10b(ky0 ky0Var) {
        int iMo10b = this.f26536a.mo10b(ky0Var) - this.f26537b.mo10b(ky0Var);
        if (iMo10b < 0) {
            return 0;
        }
        return iMo10b;
    }

    @Override // p000.a05
    /* JADX INFO: renamed from: c */
    public final int mo11c(ky0 ky0Var, df2 df2Var) {
        int iMo11c = this.f26536a.mo11c(ky0Var, df2Var) - this.f26537b.mo11c(ky0Var, df2Var);
        if (iMo11c < 0) {
            return 0;
        }
        return iMo11c;
    }

    @Override // p000.a05
    /* JADX INFO: renamed from: d */
    public final int mo12d(ky0 ky0Var, df2 df2Var) {
        int iMo12d = this.f26536a.mo12d(ky0Var, df2Var) - this.f26537b.mo12d(ky0Var, df2Var);
        if (iMo12d < 0) {
            return 0;
        }
        return iMo12d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob1)) {
            return false;
        }
        ob1 ob1Var = (ob1) obj;
        return z62.m13387o(ob1Var.f26536a, this.f26536a) && z62.m13387o(ob1Var.f26537b, this.f26537b);
    }

    public final int hashCode() {
        return this.f26537b.hashCode() + (this.f26536a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f26536a + " - " + this.f26537b + ")";
    }
}
