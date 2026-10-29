package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gp6 implements qe4 {

    /* JADX INFO: renamed from: b */
    public static final gp6 f20014b;

    /* JADX INFO: renamed from: a */
    public te4 f20015a;

    static {
        gp6 gp6Var = new gp6();
        gp6Var.f20015a = se0.m10702O(new ip6());
        VarHandle.storeStoreFence();
        f20014b = gp6Var;
    }

    @Override // p000.qe4
    public final Object get() {
        return (ip6) this.f20015a.f31098a;
    }
}
