package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g64 extends qf3 {

    /* JADX INFO: renamed from: c */
    public static final g64 f19623c = new g64(h64.f20409a);

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: h */
    public final int mo3843h(Object obj) {
        return ((short[]) obj).length;
    }

    @Override // p000.db0, p000.AbstractC0966o0
    /* JADX INFO: renamed from: j */
    public final void mo3844j(ri0 ri0Var, int i, Object obj) {
        f64 f64Var = (f64) obj;
        short sMo5397t = ri0Var.mo5397t(this.f28439b, i);
        f64Var.mo4731b(f64Var.mo4732d() + 1);
        short[] sArr = f64Var.f18790a;
        int i2 = f64Var.f18791b;
        f64Var.f18791b = i2 + 1;
        sArr[i2] = sMo5397t;
    }

    @Override // p000.qf3
    /* JADX INFO: renamed from: m */
    public final of3 mo3845m() {
        f64 f64Var = new f64();
        f64Var.f18790a = new short[10];
        f64Var.f18791b = 0;
        return f64Var;
    }

    @Override // p000.qf3
    /* JADX INFO: renamed from: n */
    public final void mo3846n(si0 si0Var, Object obj, int i) {
        short[] sArr = (short[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            si0Var.mo6727e(this.f28439b, i2, sArr[i2]);
        }
    }
}
