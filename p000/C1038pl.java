package p000;

/* JADX INFO: renamed from: pl */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1038pl implements wr1 {

    /* JADX INFO: renamed from: a */
    public static final C1038pl f27724a;
    private static final g24 descriptor;

    static {
        C1038pl c1038pl = new C1038pl();
        f27724a = c1038pl;
        dc3 dc3Var = new dc3("essentials.debug.AppCrash", c1038pl, 3);
        dc3Var.m4438l("threadName", false);
        dc3Var.m4438l("timestamp", false);
        dc3Var.m4438l("stacktrace", false);
        descriptor = dc3Var;
    }

    @Override // p000.wr1
    /* JADX INFO: renamed from: a */
    public final jc2[] mo3932a() {
        fd4 fd4Var = fd4.f18924a;
        return new jc2[]{fd4Var, l41.f23778a, fd4Var};
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: b */
    public final Object mo13b(iv0 iv0Var) {
        g24 g24Var = descriptor;
        ri0 ri0VarMo5382a = iv0Var.mo5382a(g24Var);
        boolean z = true;
        int i = 0;
        String strMo5395r = null;
        i41 i41Var = null;
        String strMo5395r2 = null;
        while (z) {
            int iMo6325j = ri0VarMo5382a.mo6325j(g24Var);
            if (iMo6325j == -1) {
                z = false;
            } else if (iMo6325j == 0) {
                strMo5395r = ri0VarMo5382a.mo5395r(g24Var, 0);
                i |= 1;
            } else if (iMo6325j == 1) {
                i41Var = (i41) ri0VarMo5382a.mo5402y(g24Var, 1, l41.f23778a, i41Var);
                i |= 2;
            } else {
                if (iMo6325j != 2) {
                    throw new mu4(iMo6325j);
                }
                strMo5395r2 = ri0VarMo5382a.mo5395r(g24Var, 2);
                i |= 4;
            }
        }
        ri0VarMo5382a.mo5398u(g24Var);
        if (7 != (i & 7)) {
            gq6.m6069G(i, 7, descriptor);
            throw null;
        }
        C1112rl c1112rl = new C1112rl();
        c1112rl.f29385a = strMo5395r;
        c1112rl.f29386b = i41Var.f21121a;
        c1112rl.f29387c = strMo5395r2;
        return c1112rl;
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        C1112rl c1112rl = (C1112rl) obj;
        g24 g24Var = descriptor;
        si0 si0VarMo5918a = g81Var.mo5918a(g24Var);
        si0VarMo5918a.mo6730n(g24Var, 0, c1112rl.f29385a);
        si0VarMo5918a.mo6734s(g24Var, 1, l41.f23778a, i41.m6644c(c1112rl.f29386b));
        si0VarMo5918a.mo6730n(g24Var, 2, c1112rl.f29387c);
        si0VarMo5918a.mo6728f();
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return descriptor;
    }
}
