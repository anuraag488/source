package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h52 extends qf3 {

    /* JADX INFO: renamed from: c */
    public static final h52 f20399c = new h52(u52.f31657a);

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: h */
    public final int mo3843h(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // p000.db0, p000.AbstractC0966o0
    /* JADX INFO: renamed from: j */
    public final void mo3844j(ri0 ri0Var, int i, Object obj) {
        e52 e52Var = (e52) obj;
        int iMo5385e = ri0Var.mo5385e(this.f28439b, i);
        e52Var.mo4731b(e52Var.mo4732d() + 1);
        int[] iArr = e52Var.f17707a;
        int i2 = e52Var.f17708b;
        e52Var.f17708b = i2 + 1;
        iArr[i2] = iMo5385e;
    }

    @Override // p000.qf3
    /* JADX INFO: renamed from: m */
    public final of3 mo3845m() {
        e52 e52Var = new e52();
        e52Var.f17707a = new int[10];
        e52Var.f17708b = 0;
        return e52Var;
    }

    @Override // p000.qf3
    /* JADX INFO: renamed from: n */
    public final void mo3846n(si0 si0Var, Object obj, int i) {
        int[] iArr = (int[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            si0Var.mo6733r(this.f28439b, i2, iArr[i2]);
        }
    }
}
