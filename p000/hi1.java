package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hi1 extends qf3 {

    /* JADX INFO: renamed from: c */
    public static final hi1 f20596c = new hi1(ki1.f23137a);

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: h */
    public final int mo3843h(Object obj) {
        return ((float[]) obj).length;
    }

    @Override // p000.db0, p000.AbstractC0966o0
    /* JADX INFO: renamed from: j */
    public final void mo3844j(ri0 ri0Var, int i, Object obj) {
        ei1 ei1Var = (ei1) obj;
        float fMo5393o = ri0Var.mo5393o(this.f28439b, i);
        ei1Var.mo4731b(ei1Var.mo4732d() + 1);
        float[] fArr = ei1Var.f18118a;
        int i2 = ei1Var.f18119b;
        ei1Var.f18119b = i2 + 1;
        fArr[i2] = fMo5393o;
    }

    @Override // p000.qf3
    /* JADX INFO: renamed from: m */
    public final of3 mo3845m() {
        ei1 ei1Var = new ei1();
        ei1Var.f18118a = new float[10];
        ei1Var.f18119b = 0;
        return ei1Var;
    }

    @Override // p000.qf3
    /* JADX INFO: renamed from: n */
    public final void mo3846n(si0 si0Var, Object obj, int i) {
        float[] fArr = (float[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            si0Var.mo6718A(this.f28439b, i2, fArr[i2]);
        }
    }
}
