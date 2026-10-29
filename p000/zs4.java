package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zs4 extends qf3 {

    /* JADX INFO: renamed from: c */
    public static final zs4 f36346c = new zs4(at4.f14862a);

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: h */
    public final int mo3843h(Object obj) {
        return ((xs4) obj).f34598a.length;
    }

    @Override // p000.db0, p000.AbstractC0966o0
    /* JADX INFO: renamed from: j */
    public final void mo3844j(ri0 ri0Var, int i, Object obj) {
        ys4 ys4Var = (ys4) obj;
        long jMo5383c = ri0Var.mo5384d(this.f28439b, i).mo5383c();
        ys4Var.mo4731b(ys4Var.mo4732d() + 1);
        long[] jArr = ys4Var.f35502a;
        int i2 = ys4Var.f35503b;
        ys4Var.f35503b = i2 + 1;
        jArr[i2] = jMo5383c;
    }

    @Override // p000.qf3
    /* JADX INFO: renamed from: m */
    public final of3 mo3845m() {
        ys4 ys4Var = new ys4();
        ys4Var.f35502a = new long[10];
        ys4Var.f35503b = 0;
        return ys4Var;
    }

    @Override // p000.qf3
    /* JADX INFO: renamed from: n */
    public final void mo3846n(si0 si0Var, Object obj, int i) {
        long[] jArr = ((xs4) obj).f34598a;
        for (int i2 = 0; i2 < i; i2++) {
            si0Var.mo6738z(this.f28439b, i2).mo5929v(jArr[i2]);
        }
    }
}
