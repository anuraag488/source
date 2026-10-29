package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class r43 extends v53 {

    /* JADX INFO: renamed from: c */
    public static final r43 f28998c = new r43(0, 0, 3);

    @Override // p000.v53
    /* JADX INFO: renamed from: a */
    public final void mo90a(xa0 xa0Var, InterfaceC0618en interfaceC0618en, p84 p84Var, om3 om3Var, w53 w53Var) {
        int i = p84Var.f27452t;
        er1 er1Var = new er1((byte) 1);
        er1Var.f18412b = om3Var;
        er1Var.f18413c = p84Var;
        VarHandle.storeStoreFence();
        p84Var.m9424m(i, er1Var);
    }
}
