package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h11 extends qf3 {

    /* JADX INFO: renamed from: c */
    public static final h11 f20261c = new h11(m11.f24532a);

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: h */
    public final int mo3843h(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // p000.db0, p000.AbstractC0966o0
    /* JADX INFO: renamed from: j */
    public final void mo3844j(ri0 ri0Var, int i, Object obj) {
        e11 e11Var = (e11) obj;
        double dMo5390k = ri0Var.mo5390k(this.f28439b, i);
        e11Var.mo4731b(e11Var.mo4732d() + 1);
        double[] dArr = e11Var.f17583a;
        int i2 = e11Var.f17584b;
        e11Var.f17584b = i2 + 1;
        dArr[i2] = dMo5390k;
    }

    @Override // p000.qf3
    /* JADX INFO: renamed from: m */
    public final of3 mo3845m() {
        e11 e11Var = new e11();
        e11Var.f17583a = new double[10];
        e11Var.f17584b = 0;
        return e11Var;
    }

    @Override // p000.qf3
    /* JADX INFO: renamed from: n */
    public final void mo3846n(si0 si0Var, Object obj, int i) {
        double[] dArr = (double[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            si0Var.mo6726b(this.f28439b, i2, dArr[i2]);
        }
    }
}
