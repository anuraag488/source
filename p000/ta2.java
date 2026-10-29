package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ta2 implements jc2 {

    /* JADX INFO: renamed from: a */
    public static final ta2 f31036a = new ta2();

    /* JADX INFO: renamed from: b */
    public static final i24 f31037b = sc6.m10669j("kotlinx.serialization.json.JsonNull", l24.f23749j, new g24[0], new fv3(29));

    @Override // p000.jc2
    /* JADX INFO: renamed from: b */
    public final Object mo13b(iv0 iv0Var) {
        zt5.m13778i(iv0Var);
        if (iv0Var.mo5387g()) {
            throw new y92(kx5.m7687R(-1, "Expected 'null' literal", null, null, null), null);
        }
        return ra2.INSTANCE;
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        zt5.m13779j(g81Var);
        g81Var.mo5919c();
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return f31037b;
    }
}
