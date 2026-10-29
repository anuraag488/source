package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o42 implements e73 {

    /* JADX INFO: renamed from: b */
    public a05 f26331b;

    /* JADX INFO: renamed from: c */
    public ky0 f26332c;

    @Override // p000.e73
    /* JADX INFO: renamed from: a */
    public final float mo3502a(df2 df2Var) {
        a05 a05Var = this.f26331b;
        ky0 ky0Var = this.f26332c;
        return ky0Var.mo3586w0(a05Var.mo12d(ky0Var, df2Var));
    }

    @Override // p000.e73
    /* JADX INFO: renamed from: b */
    public final float mo3503b(df2 df2Var) {
        a05 a05Var = this.f26331b;
        ky0 ky0Var = this.f26332c;
        return ky0Var.mo3586w0(a05Var.mo11c(ky0Var, df2Var));
    }

    @Override // p000.e73
    /* JADX INFO: renamed from: c */
    public final float mo3504c() {
        a05 a05Var = this.f26331b;
        ky0 ky0Var = this.f26332c;
        return ky0Var.mo3586w0(a05Var.mo9a(ky0Var));
    }

    @Override // p000.e73
    /* JADX INFO: renamed from: d */
    public final float mo3505d() {
        a05 a05Var = this.f26331b;
        ky0 ky0Var = this.f26332c;
        return ky0Var.mo3586w0(a05Var.mo10b(ky0Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o42)) {
            return false;
        }
        o42 o42Var = (o42) obj;
        return z62.m13387o(this.f26331b, o42Var.f26331b) && z62.m13387o(this.f26332c, o42Var.f26332c);
    }

    public final int hashCode() {
        return this.f26332c.hashCode() + (this.f26331b.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f26331b + ", density=" + this.f26332c + ")";
    }
}
