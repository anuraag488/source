package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s23 implements jc2 {

    /* JADX INFO: renamed from: a */
    public pg2 f29840a;

    @Override // p000.jc2
    /* JADX INFO: renamed from: b */
    public final Object mo13b(iv0 iv0Var) {
        g24 g24VarMo15d = mo15d();
        ri0 ri0VarMo5382a = iv0Var.mo5382a(g24VarMo15d);
        int iMo6325j = ri0VarMo5382a.mo6325j(mo15d());
        if (iMo6325j != -1) {
            throw new o24(c75.m3877i(iMo6325j, "Unexpected index "));
        }
        ri0VarMo5382a.mo5398u(g24VarMo15d);
        return ju4.f22634a;
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        si0 si0VarMo5918a = g81Var.mo5918a(mo15d());
        mo15d();
        si0VarMo5918a.mo6728f();
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return (g24) this.f29840a.getValue();
    }
}
