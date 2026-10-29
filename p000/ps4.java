package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ps4 extends qf3 {

    /* JADX INFO: renamed from: c */
    public static final ps4 f27951c = new ps4(qs4.f28766a);

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: h */
    public final int mo3843h(Object obj) {
        return ((ns4) obj).f26071a.length;
    }

    @Override // p000.db0, p000.AbstractC0966o0
    /* JADX INFO: renamed from: j */
    public final void mo3844j(ri0 ri0Var, int i, Object obj) {
        os4 os4Var = (os4) obj;
        byte bMo5400w = ri0Var.mo5384d(this.f28439b, i).mo5400w();
        os4Var.mo4731b(os4Var.mo4732d() + 1);
        byte[] bArr = os4Var.f27063a;
        int i2 = os4Var.f27064b;
        os4Var.f27064b = i2 + 1;
        bArr[i2] = bMo5400w;
    }

    @Override // p000.qf3
    /* JADX INFO: renamed from: m */
    public final of3 mo3845m() {
        os4 os4Var = new os4();
        os4Var.f27063a = new byte[10];
        os4Var.f27064b = 0;
        return os4Var;
    }

    @Override // p000.qf3
    /* JADX INFO: renamed from: n */
    public final void mo3846n(si0 si0Var, Object obj, int i) {
        byte[] bArr = ((ns4) obj).f26071a;
        for (int i2 = 0; i2 < i; i2++) {
            si0Var.mo6738z(this.f28439b, i2).mo5923j(bArr[i2]);
        }
    }
}
