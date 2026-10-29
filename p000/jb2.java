package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jb2 implements jc2 {

    /* JADX INFO: renamed from: a */
    public static final jb2 f22150a = new jb2();

    /* JADX INFO: renamed from: b */
    public static final i24 f22151b = sc6.m10669j("kotlinx.serialization.json.JsonPrimitive", tf3.f31121r, new g24[0], new fv3(29));

    @Override // p000.jc2
    /* JADX INFO: renamed from: b */
    public final Object mo13b(iv0 iv0Var) {
        uc3 uc3VarM13778i = zt5.m13778i(iv0Var);
        aa2 aa2VarMo8192p = uc3VarM13778i.mo8192p();
        if (aa2VarMo8192p instanceof fb2) {
            return (fb2) aa2VarMo8192p;
        }
        throw new y92(kx5.m7687R(-1, "Unexpected JSON element, expected JsonPrimitive, had " + rl3.m10361a(aa2VarMo8192p.getClass()), null, null, uc3VarM13778i.mo8191m().f21188a.f30011d ? kx5.m7695Z(aa2VarMo8192p.toString(), -1).toString() : null), null);
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        fb2 fb2Var = (fb2) obj;
        zt5.m13779j(g81Var);
        if (fb2Var instanceof ra2) {
            g81Var.mo5920d(ta2.f31036a, ra2.INSTANCE);
        } else {
            g81Var.mo5920d(oa2.f26497a, (na2) fb2Var);
        }
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return f22151b;
    }
}
