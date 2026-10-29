package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class c50 extends qf3 {

    /* JADX INFO: renamed from: c */
    public static final c50 f15807c = new c50(d50.f16784a);

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: h */
    public final int mo3843h(Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // p000.db0, p000.AbstractC0966o0
    /* JADX INFO: renamed from: j */
    public final void mo3844j(ri0 ri0Var, int i, Object obj) {
        x40 x40Var = (x40) obj;
        byte bMo5394q = ri0Var.mo5394q(this.f28439b, i);
        x40Var.mo4731b(x40Var.mo4732d() + 1);
        byte[] bArr = x40Var.f33970a;
        int i2 = x40Var.f33971b;
        x40Var.f33971b = i2 + 1;
        bArr[i2] = bMo5394q;
    }

    @Override // p000.qf3
    /* JADX INFO: renamed from: m */
    public final of3 mo3845m() {
        x40 x40Var = new x40();
        x40Var.f33970a = new byte[10];
        x40Var.f33971b = 0;
        return x40Var;
    }

    @Override // p000.qf3
    /* JADX INFO: renamed from: n */
    public final void mo3846n(si0 si0Var, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            si0Var.mo6736w(this.f28439b, i2, bArr[i2]);
        }
    }
}
