package p000;

/* JADX INFO: renamed from: mg */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0908mg implements sw2 {

    /* JADX INFO: renamed from: a */
    public jc2 f24869a;

    /* JADX INFO: renamed from: b */
    public xd3 f24870b;

    /* JADX INFO: renamed from: c */
    public d83 f24871c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ xn2 f24872d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ zo0 f24873e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ C1033pg f24874f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ lt0 f24875g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ i92 f24876h;

    @Override // p000.xb4
    public final Object getValue() {
        return this.f24871c.getValue();
    }

    @Override // p000.sw2
    public final void setValue(Object obj) {
        d83 d83Var = this.f24871c;
        if (z62.m13387o(d83Var.getValue(), obj)) {
            return;
        }
        xn2 xn2Var = this.f24872d;
        if (xn2Var != null) {
            String strM12721a = xn2Var.m12721a();
            k44 k44Var = k44.f22883b;
            if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                xn2Var.m12722b(k44Var, strM12721a, this.f24870b.f34170a + " set to " + obj, null);
            }
        }
        d83Var.setValue(obj);
        lb5.m7910S(this.f24873e, null, cp0.f16328d, new C0934n5(this.f24874f, this.f24875g, obj, this, this.f24876h, null), 1);
    }
}
