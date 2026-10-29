package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gu4 implements a05 {

    /* JADX INFO: renamed from: a */
    public a05 f20139a;

    /* JADX INFO: renamed from: b */
    public a05 f20140b;

    @Override // p000.a05
    /* JADX INFO: renamed from: a */
    public final int mo9a(ky0 ky0Var) {
        return Math.max(this.f20139a.mo9a(ky0Var), this.f20140b.mo9a(ky0Var));
    }

    @Override // p000.a05
    /* JADX INFO: renamed from: b */
    public final int mo10b(ky0 ky0Var) {
        return Math.max(this.f20139a.mo10b(ky0Var), this.f20140b.mo10b(ky0Var));
    }

    @Override // p000.a05
    /* JADX INFO: renamed from: c */
    public final int mo11c(ky0 ky0Var, df2 df2Var) {
        return Math.max(this.f20139a.mo11c(ky0Var, df2Var), this.f20140b.mo11c(ky0Var, df2Var));
    }

    @Override // p000.a05
    /* JADX INFO: renamed from: d */
    public final int mo12d(ky0 ky0Var, df2 df2Var) {
        return Math.max(this.f20139a.mo12d(ky0Var, df2Var), this.f20140b.mo12d(ky0Var, df2Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu4)) {
            return false;
        }
        gu4 gu4Var = (gu4) obj;
        return z62.m13387o(gu4Var.f20139a, this.f20139a) && z62.m13387o(gu4Var.f20140b, this.f20140b);
    }

    public final int hashCode() {
        return (this.f20140b.hashCode() * 31) + this.f20139a.hashCode();
    }

    public final String toString() {
        return "(" + this.f20139a + " ∪ " + this.f20140b + ")";
    }
}
