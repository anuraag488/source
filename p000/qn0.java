package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qn0 implements wr1 {

    /* JADX INFO: renamed from: a */
    public static final qn0 f28618a;
    private static final g24 descriptor;

    static {
        qn0 qn0Var = new qn0();
        f28618a = qn0Var;
        dc3 dc3Var = new dc3("essentials.control.ControlToken", qn0Var, 2);
        dc3Var.m4438l("type", false);
        dc3Var.m4438l("id", false);
        descriptor = dc3Var;
    }

    @Override // p000.wr1
    /* JADX INFO: renamed from: a */
    public final jc2[] mo3932a() {
        fd4 fd4Var = fd4.f18924a;
        return new jc2[]{fd4Var, fd4Var};
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: b */
    public final Object mo13b(iv0 iv0Var) {
        g24 g24Var = descriptor;
        ri0 ri0VarMo5382a = iv0Var.mo5382a(g24Var);
        boolean z = true;
        int i = 0;
        String strMo5395r = null;
        String strMo5395r2 = null;
        while (z) {
            int iMo6325j = ri0VarMo5382a.mo6325j(g24Var);
            if (iMo6325j == -1) {
                z = false;
            } else if (iMo6325j == 0) {
                strMo5395r = ri0VarMo5382a.mo5395r(g24Var, 0);
                i |= 1;
            } else {
                if (iMo6325j != 1) {
                    throw new mu4(iMo6325j);
                }
                strMo5395r2 = ri0VarMo5382a.mo5395r(g24Var, 1);
                i |= 2;
            }
        }
        ri0VarMo5382a.mo5398u(g24Var);
        if (3 != (i & 3)) {
            gq6.m6069G(i, 3, descriptor);
            throw null;
        }
        sn0 sn0Var = new sn0();
        sn0Var.f30400a = strMo5395r;
        sn0Var.f30401b = strMo5395r2;
        VarHandle.storeStoreFence();
        return sn0Var;
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        sn0 sn0Var = (sn0) obj;
        g24 g24Var = descriptor;
        si0 si0VarMo5918a = g81Var.mo5918a(g24Var);
        si0VarMo5918a.mo6730n(g24Var, 0, sn0Var.f30400a);
        si0VarMo5918a.mo6730n(g24Var, 1, sn0Var.f30401b);
        si0VarMo5918a.mo6728f();
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return descriptor;
    }
}
