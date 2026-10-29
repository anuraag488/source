package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s80 extends qf3 {

    /* JADX INFO: renamed from: c */
    public static final s80 f29956c = new s80(x80.f34058a);

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: h */
    public final int mo3843h(Object obj) {
        return ((char[]) obj).length;
    }

    @Override // p000.db0, p000.AbstractC0966o0
    /* JADX INFO: renamed from: j */
    public final void mo3844j(ri0 ri0Var, int i, Object obj) {
        q80 q80Var = (q80) obj;
        char cMo5391l = ri0Var.mo5391l(this.f28439b, i);
        q80Var.mo4731b(q80Var.mo4732d() + 1);
        char[] cArr = q80Var.f28268a;
        int i2 = q80Var.f28269b;
        q80Var.f28269b = i2 + 1;
        cArr[i2] = cMo5391l;
    }

    @Override // p000.qf3
    /* JADX INFO: renamed from: m */
    public final of3 mo3845m() {
        q80 q80Var = new q80();
        q80Var.f28268a = new char[10];
        q80Var.f28269b = 0;
        return q80Var;
    }

    @Override // p000.qf3
    /* JADX INFO: renamed from: n */
    public final void mo3846n(si0 si0Var, Object obj, int i) {
        char[] cArr = (char[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            si0Var.mo6731o(this.f28439b, i2, cArr[i2]);
        }
    }
}
