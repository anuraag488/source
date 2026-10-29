package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class be5 implements InterfaceC1412zo {
    @Override // p000.InterfaceC1412zo
    public final zl2 apply(Object obj) {
        ec5 ec5Var = (ec5) obj;
        zl2 zl2VarMo307a = ec5Var.mo307a();
        nc5 nc5Var = new nc5((byte) 2);
        nc5Var.f25687b = ec5Var;
        VarHandle.storeStoreFence();
        return AbstractRunnableC1204u2.m11207u(zl2VarMo307a, nc5Var, rz0.f29741a);
    }
}
