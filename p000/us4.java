package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class us4 extends qf3 {

    /* JADX INFO: renamed from: c */
    public static final us4 f32148c = new us4(vs4.f32840a);

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: h */
    public final int mo3843h(Object obj) {
        return ((ss4) obj).f30546a.length;
    }

    @Override // p000.db0, p000.AbstractC0966o0
    /* JADX INFO: renamed from: j */
    public final void mo3844j(ri0 ri0Var, int i, Object obj) {
        ts4 ts4Var = (ts4) obj;
        int iMo5396s = ri0Var.mo5384d(this.f28439b, i).mo5396s();
        ts4Var.mo4731b(ts4Var.mo4732d() + 1);
        int[] iArr = ts4Var.f31386a;
        int i2 = ts4Var.f31387b;
        ts4Var.f31387b = i2 + 1;
        iArr[i2] = iMo5396s;
    }

    @Override // p000.qf3
    /* JADX INFO: renamed from: m */
    public final of3 mo3845m() {
        ts4 ts4Var = new ts4();
        ts4Var.f31386a = new int[10];
        ts4Var.f31387b = 0;
        return ts4Var;
    }

    @Override // p000.qf3
    /* JADX INFO: renamed from: n */
    public final void mo3846n(si0 si0Var, Object obj, int i) {
        int[] iArr = ((ss4) obj).f30546a;
        for (int i2 = 0; i2 < i; i2++) {
            si0Var.mo6738z(this.f28439b, i2).mo5927p(iArr[i2]);
        }
    }
}
