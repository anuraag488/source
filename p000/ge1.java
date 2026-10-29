package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ge1 implements wr1 {

    /* JADX INFO: renamed from: a */
    public static final ge1 f19756a;
    private static final g24 descriptor;

    static {
        ge1 ge1Var = new ge1();
        f19756a = ge1Var;
        dc3 dc3Var = new dc3("essentials.FeatureTheme", ge1Var, 3);
        dc3Var.m4438l("themeColor", false);
        dc3Var.m4438l("featureStyle", false);
        dc3Var.m4438l("paletteStyle", false);
        descriptor = dc3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.wr1
    /* JADX INFO: renamed from: a */
    public final jc2[] mo3932a() {
        pg2[] pg2VarArr = ie1.f21282d;
        return new jc2[]{ks5.m7618s(jc0.f22160a), pg2VarArr[1].getValue(), pg2VarArr[2].getValue()};
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: b */
    public final Object mo13b(iv0 iv0Var) {
        g24 g24Var = descriptor;
        ri0 ri0VarMo5382a = iv0Var.mo5382a(g24Var);
        pg2[] pg2VarArr = ie1.f21282d;
        boolean z = true;
        int i = 0;
        pb0 pb0Var = null;
        fe1 fe1Var = null;
        qd1 qd1Var = null;
        while (z) {
            int iMo6325j = ri0VarMo5382a.mo6325j(g24Var);
            if (iMo6325j == -1) {
                z = false;
            } else if (iMo6325j == 0) {
                pb0Var = (pb0) ri0VarMo5382a.mo5389i(g24Var, 0, jc0.f22160a, pb0Var);
                i |= 1;
            } else if (iMo6325j == 1) {
                fe1Var = (fe1) ri0VarMo5382a.mo5402y(g24Var, 1, (jc2) pg2VarArr[1].getValue(), fe1Var);
                i |= 2;
            } else {
                if (iMo6325j != 2) {
                    throw new mu4(iMo6325j);
                }
                qd1Var = (qd1) ri0VarMo5382a.mo5402y(g24Var, 2, (jc2) pg2VarArr[2].getValue(), qd1Var);
                i |= 4;
            }
        }
        ri0VarMo5382a.mo5398u(g24Var);
        if (7 != (i & 7)) {
            gq6.m6069G(i, 7, descriptor);
            throw null;
        }
        ie1 ie1Var = new ie1();
        ie1Var.f21283a = pb0Var;
        ie1Var.f21284b = fe1Var;
        ie1Var.f21285c = qd1Var;
        VarHandle.storeStoreFence();
        return ie1Var;
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: c */
    public final void mo14c(g81 g81Var, Object obj) {
        ie1 ie1Var = (ie1) obj;
        g24 g24Var = descriptor;
        si0 si0VarMo5918a = g81Var.mo5918a(g24Var);
        pg2[] pg2VarArr = ie1.f21282d;
        si0VarMo5918a.mo6735u(g24Var, 0, jc0.f22160a, ie1Var.f21283a);
        si0VarMo5918a.mo6734s(g24Var, 1, (jc2) pg2VarArr[1].getValue(), ie1Var.f21284b);
        si0VarMo5918a.mo6734s(g24Var, 2, (jc2) pg2VarArr[2].getValue(), ie1Var.f21285c);
        si0VarMo5918a.mo6728f();
    }

    @Override // p000.jc2
    /* JADX INFO: renamed from: d */
    public final g24 mo15d() {
        return descriptor;
    }
}
