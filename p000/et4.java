package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class et4 extends qf3 {

    /* JADX INFO: renamed from: c */
    public static final et4 f18477c = new et4(ft4.f19281a);

    @Override // p000.AbstractC0966o0
    /* JADX INFO: renamed from: h */
    public final int mo3843h(Object obj) {
        return ((ct4) obj).f16465a.length;
    }

    @Override // p000.db0, p000.AbstractC0966o0
    /* JADX INFO: renamed from: j */
    public final void mo3844j(ri0 ri0Var, int i, Object obj) {
        dt4 dt4Var = (dt4) obj;
        short sMo5403z = ri0Var.mo5384d(this.f28439b, i).mo5403z();
        dt4Var.mo4731b(dt4Var.mo4732d() + 1);
        short[] sArr = dt4Var.f17379a;
        int i2 = dt4Var.f17380b;
        dt4Var.f17380b = i2 + 1;
        sArr[i2] = sMo5403z;
    }

    @Override // p000.qf3
    /* JADX INFO: renamed from: m */
    public final of3 mo3845m() {
        dt4 dt4Var = new dt4();
        dt4Var.f17379a = new short[10];
        dt4Var.f17380b = 0;
        return dt4Var;
    }

    @Override // p000.qf3
    /* JADX INFO: renamed from: n */
    public final void mo3846n(si0 si0Var, Object obj, int i) {
        short[] sArr = ((ct4) obj).f16465a;
        for (int i2 = 0; i2 < i; i2++) {
            si0Var.mo6738z(this.f28439b, i2).mo5922h(sArr[i2]);
        }
    }
}
