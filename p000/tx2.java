package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tx2 implements wr1 {

    /* JADX INFO: renamed from: a */
    public static final tx2 f31513a;
    private static final g24 descriptor;

    static {
        tx2 tx2Var = new tx2();
        f31513a = tx2Var;
        dc3 dc3Var = new dc3("navbar.NavBarButton", tx2Var, 2);
        dc3Var.m4438l("click", false);
        dc3Var.m4438l("longClick", true);
        descriptor = dc3Var;
    }

    @Override // p000.wr1
    /* JADX INFO: renamed from: a */
    public final jc2[] mo3932a() {
        qn0 qn0Var = qn0.f28618a;
        return new jc2[]{qn0Var, ks5.m7618s(qn0Var)};
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: b */
    public final Object mo13b(iv0 iv0Var) {
        g24 g24Var = descriptor;
        ri0 ri0VarMo5382a = iv0Var.mo5382a(g24Var);
        boolean z = true;
        int i = 0;
        sn0 sn0Var = null;
        sn0 sn0Var2 = null;
        while (z) {
            int iMo6325j = ri0VarMo5382a.mo6325j(g24Var);
            if (iMo6325j == -1) {
                z = false;
            } else if (iMo6325j == 0) {
                sn0Var = (sn0) ri0VarMo5382a.mo5402y(g24Var, 0, qn0.f28618a, sn0Var);
                i |= 1;
            } else {
                if (iMo6325j != 1) {
                    throw new mu4(iMo6325j);
                }
                sn0Var2 = (sn0) ri0VarMo5382a.mo5389i(g24Var, 1, qn0.f28618a, sn0Var2);
                i |= 2;
            }
        }
        ri0VarMo5382a.mo5398u(g24Var);
        if (1 != (i & 1)) {
            gq6.m6069G(i, 1, descriptor);
            throw null;
        }
        vx2 vx2Var = new vx2();
        vx2Var.f32907a = sn0Var;
        if ((i & 2) == 0) {
            vx2Var.f32908b = null;
        } else {
            vx2Var.f32908b = sn0Var2;
        }
        VarHandle.storeStoreFence();
        return vx2Var;
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        vx2 vx2Var = (vx2) obj;
        g24 g24Var = descriptor;
        si0 si0VarMo5918a = g81Var.mo5918a(g24Var);
        qn0 qn0Var = qn0.f28618a;
        sn0 sn0Var = vx2Var.f32907a;
        sn0 sn0Var2 = vx2Var.f32908b;
        si0VarMo5918a.mo6734s(g24Var, 0, qn0Var, sn0Var);
        if (si0VarMo5918a.mo6737y() || sn0Var2 != null) {
            si0VarMo5918a.mo6735u(g24Var, 1, qn0Var, sn0Var2);
        }
        si0VarMo5918a.mo6728f();
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return descriptor;
    }
}
