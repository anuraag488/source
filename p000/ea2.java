package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ea2 implements jc2 {

    /* JADX INFO: renamed from: a */
    public static final ea2 f17925a = new ea2();

    /* JADX INFO: renamed from: b */
    public static final i24 f17926b = sc6.m10669j("kotlinx.serialization.json.JsonElement", vc3.f32520j, new g24[0], new el1(16));

    @Override // p000.jc2
    /* JADX INFO: renamed from: b */
    public final Object mo13b(iv0 iv0Var) {
        return zt5.m13778i(iv0Var).mo8192p();
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        aa2 aa2Var = (aa2) obj;
        zt5.m13779j(g81Var);
        if (aa2Var instanceof fb2) {
            g81Var.mo5920d(jb2.f22150a, aa2Var);
            return;
        }
        if (aa2Var instanceof va2) {
            g81Var.mo5920d(ya2.f35070a, aa2Var);
        } else if (aa2Var instanceof n92) {
            g81Var.mo5920d(q92.f28321a, aa2Var);
        } else {
            C0670g.m5864c();
        }
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return f17926b;
    }
}
