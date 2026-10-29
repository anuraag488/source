package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ss2 implements gw3 {

    /* JADX INFO: renamed from: a */
    public AbstractC1277w1 f30544a;

    /* JADX INFO: renamed from: b */
    public ia5 f30545b;

    @Override // p000.gw3
    /* JADX INFO: renamed from: a */
    public final void mo6179a(Object obj, Object obj2) {
        kw3.m7653k(this.f30545b, obj, obj2);
    }

    @Override // p000.gw3
    /* JADX INFO: renamed from: b */
    public final void mo6180b(Object obj) {
        this.f30545b.getClass();
        ou4 ou4Var = ((vr1) obj).unknownFields;
        if (ou4Var.f27131e) {
            ou4Var.f27131e = false;
        }
        c75.m3884p(obj);
        throw null;
    }

    @Override // p000.gw3
    /* JADX INFO: renamed from: c */
    public final boolean mo6181c(Object obj) {
        c75.m3884p(obj);
        throw null;
    }

    @Override // p000.gw3
    /* JADX INFO: renamed from: d */
    public final vr1 mo6182d() {
        AbstractC1277w1 abstractC1277w1 = this.f30544a;
        return abstractC1277w1 instanceof vr1 ? ((vr1) abstractC1277w1).m11982i() : ((qr1) ((vr1) abstractC1277w1).mo3989b(5)).m10046b();
    }

    @Override // p000.gw3
    /* JADX INFO: renamed from: e */
    public final int mo6183e(vr1 vr1Var) {
        this.f30545b.getClass();
        return vr1Var.unknownFields.hashCode();
    }

    @Override // p000.gw3
    /* JADX INFO: renamed from: f */
    public final void mo6184f(Object obj, xa0 xa0Var, rc1 rc1Var) {
        this.f30545b.m6714g(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // p000.gw3
    /* JADX INFO: renamed from: g */
    public final int mo6185g(vr1 vr1Var) {
        this.f30545b.getClass();
        ou4 ou4Var = vr1Var.unknownFields;
        int i = ou4Var.f27130d;
        if (i != -1) {
            return i;
        }
        int iM10751g = 0;
        for (int i2 = 0; i2 < ou4Var.f27127a; i2++) {
            int i3 = ou4Var.f27128b[i2] >>> 3;
            iM10751g += C1145sh.m10751g(3, (n50) ou4Var.f27129c[i2]) + C1145sh.m10753i(i3) + C1145sh.m10752h(2) + (C1145sh.m10752h(1) * 2);
        }
        ou4Var.f27130d = iM10751g;
        return iM10751g;
    }

    @Override // p000.gw3
    /* JADX INFO: renamed from: h */
    public final boolean mo6186h(vr1 vr1Var, vr1 vr1Var2) {
        ia5 ia5Var = this.f30545b;
        ia5Var.getClass();
        ou4 ou4Var = vr1Var.unknownFields;
        ia5Var.getClass();
        return ou4Var.equals(vr1Var2.unknownFields);
    }

    @Override // p000.gw3
    /* JADX INFO: renamed from: i */
    public final void mo6187i(Object obj, js1 js1Var) {
        c75.m3884p(obj);
        throw null;
    }
}
