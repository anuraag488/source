package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d11 implements si1 {

    /* JADX INFO: renamed from: a */
    public si1 f16700a;

    @Override // p000.si1
    public final Object collect(ti1 ti1Var, wm0 wm0Var) {
        ql3 ql3Var = new ql3();
        ql3Var.f28555a = e23.f17640a;
        si1 si1Var = this.f16700a;
        c11 c11Var = new c11((byte) 0);
        c11Var.f15754c = ql3Var;
        c11Var.f15753b = ti1Var;
        VarHandle.storeStoreFence();
        Object objCollect = si1Var.collect(c11Var, wm0Var);
        return objCollect == ap0.f14763a ? objCollect : ju4.f22634a;
    }
}
