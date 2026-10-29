package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class hg6 {

    /* JADX INFO: renamed from: a */
    public static final qp6 f20569a;

    static {
        uq6 uq6Var = uq6.f32109d;
        uq6 uq6Var2 = uq6.f32108c;
        qp6 qp6Var = new qp6();
        pq3 pq3Var = new pq3((byte) 19);
        pq3Var.f27896b = uq6Var;
        pq3Var.f27897c = uq6Var2;
        VarHandle.storeStoreFence();
        qp6Var.f28678a = pq3Var;
        VarHandle.storeStoreFence();
        f20569a = qp6Var;
    }
}
