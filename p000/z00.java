package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z00 extends qf3 {

    /* JADX INFO: renamed from: c */
    public static final z00 f35665c = new z00(a10.f32a);

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: h */
    public final int mo3843h(Object obj) {
        return ((boolean[]) obj).length;
    }

    @Override // p000.db0, p000.AbstractC0966o0
    /* JADX INFO: renamed from: j */
    public final void mo3844j(ri0 ri0Var, int i, Object obj) {
        w00 w00Var = (w00) obj;
        boolean zMo5399v = ri0Var.mo5399v(this.f28439b, i);
        w00Var.mo4731b(w00Var.mo4732d() + 1);
        boolean[] zArr = w00Var.f33002a;
        int i2 = w00Var.f33003b;
        w00Var.f33003b = i2 + 1;
        zArr[i2] = zMo5399v;
    }
}
