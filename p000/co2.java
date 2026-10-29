package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class co2 extends qf3 {

    /* JADX INFO: renamed from: c */
    public static final co2 f16179c = new co2(no2.f25981a);

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: h */
    public final int mo3843h(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // p000.db0, p000.AbstractC0966o0
    /* JADX INFO: renamed from: j */
    public final void mo3844j(ri0 ri0Var, int i, Object obj) {
        zn2 zn2Var = (zn2) obj;
        long jMo5392n = ri0Var.mo5392n(this.f28439b, i);
        zn2Var.mo4731b(zn2Var.mo4732d() + 1);
        long[] jArr = zn2Var.f36197a;
        int i2 = zn2Var.f36198b;
        zn2Var.f36198b = i2 + 1;
        jArr[i2] = jMo5392n;
    }

    @Override // p000.qf3
    /* JADX INFO: renamed from: m */
    public final of3 mo3845m() {
        zn2 zn2Var = new zn2();
        zn2Var.f36197a = new long[10];
        zn2Var.f36198b = 0;
        return zn2Var;
    }

    @Override // p000.qf3
    /* JADX INFO: renamed from: n */
    public final void mo3846n(si0 si0Var, Object obj, int i) {
        long[] jArr = (long[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            si0Var.mo6732q(this.f28439b, i2, jArr[i2]);
        }
    }
}
