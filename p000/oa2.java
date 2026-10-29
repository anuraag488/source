package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class oa2 implements jc2 {

    /* JADX INFO: renamed from: a */
    public static final oa2 f26497a = new oa2();

    /* JADX INFO: renamed from: b */
    public static final xf3 f26498b = sc6.m10655a("kotlinx.serialization.json.JsonLiteral", tf3.f31121r);

    @Override // p000.jc2
    /* JADX INFO: renamed from: b */
    public final Object mo13b(iv0 iv0Var) {
        uc3 uc3VarM13778i = zt5.m13778i(iv0Var);
        aa2 aa2VarMo8192p = uc3VarM13778i.mo8192p();
        if (aa2VarMo8192p instanceof na2) {
            return (na2) aa2VarMo8192p;
        }
        throw new y92(kx5.m7687R(-1, "Unexpected JSON element, expected JsonLiteral, had " + rl3.m10361a(aa2VarMo8192p.getClass()), null, null, uc3VarM13778i.mo8191m().f21188a.f30011d ? kx5.m7695Z(aa2VarMo8192p.toString(), -1).toString() : null), null);
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        na2 na2Var = (na2) obj;
        String str = na2Var.f25599c;
        zt5.m13779j(g81Var);
        if (na2Var.f25597a) {
            g81Var.mo5916B(str);
            return;
        }
        g24 g24Var = na2Var.f25598b;
        if (g24Var != null) {
            g81Var.mo5925l(g24Var).mo5916B(str);
            return;
        }
        Long lM9045Z = od4.m9045Z(str);
        if (lM9045Z != null) {
            g81Var.mo5929v(lM9045Z.longValue());
            return;
        }
        ws4 ws4VarM13373c0 = z62.m13373c0(str);
        if (ws4VarM13373c0 != null) {
            g81Var.mo5925l(at4.f14863b).mo5929v(ws4VarM13373c0.f33693a);
            return;
        }
        Double dM8691Q = nd4.m8691Q(str);
        if (dM8691Q != null) {
            g81Var.mo5921g(dM8691Q.doubleValue());
            return;
        }
        Boolean boolM6359y0 = hd4.m6359y0(str);
        if (boolM6359y0 != null) {
            g81Var.mo5924k(boolM6359y0.booleanValue());
        } else {
            g81Var.mo5916B(str);
        }
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return f26498b;
    }
}
