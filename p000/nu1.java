package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class nu1 extends n24 {

    /* JADX INFO: renamed from: a */
    public uq4 f26092a = null;

    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) {
        uq4 uq4Var = this.f26092a;
        if (uq4Var != null) {
            return uq4Var.mo166b(kb2Var);
        }
        C1077qn.m9989o("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) {
        uq4 uq4Var = this.f26092a;
        if (uq4Var != null) {
            uq4Var.mo167c(yb2Var, obj);
        } else {
            C1077qn.m9989o("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }

    @Override // p000.n24
    /* JADX INFO: renamed from: d */
    public final uq4 mo8484d() {
        uq4 uq4Var = this.f26092a;
        if (uq4Var != null) {
            return uq4Var;
        }
        C1077qn.m9989o("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }
}
