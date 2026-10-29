package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface nt2 {
    /* JADX INFO: renamed from: a */
    Object mo7628a(mq1 mq1Var, Object obj);

    /* JADX INFO: renamed from: b */
    boolean mo7629b(yp1 yp1Var);

    /* JADX INFO: renamed from: d */
    default nt2 mo7630d(nt2 nt2Var) {
        if (nt2Var == kt2.f23428a) {
            return this;
        }
        vd0 vd0Var = new vd0();
        vd0Var.f32530a = this;
        vd0Var.f32531b = nt2Var;
        VarHandle.storeStoreFence();
        return vd0Var;
    }
}
