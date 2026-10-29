package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class st2 implements lt2 {
    /* JADX INFO: renamed from: c */
    public mt2 mo118c() {
        qk1 qk1Var = new qk1();
        pk1 pk1Var = new pk1((byte) 0);
        pk1Var.f27688b = qk1Var;
        VarHandle.storeStoreFence();
        qk1Var.f28541p = pk1Var;
        pk1 pk1Var2 = new pk1((byte) 1);
        pk1Var2.f27688b = qk1Var;
        VarHandle.storeStoreFence();
        qk1Var.f28542q = pk1Var2;
        VarHandle.storeStoreFence();
        return qk1Var;
    }

    /* JADX INFO: renamed from: f */
    public void mo119f(mt2 mt2Var) {
    }
}
