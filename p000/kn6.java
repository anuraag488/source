package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kn6 implements qe4 {

    /* JADX INFO: renamed from: b */
    public static final kn6 f23266b;

    /* JADX INFO: renamed from: a */
    public te4 f23267a;

    static {
        kn6 kn6Var = new kn6();
        kn6Var.f23267a = se0.m10702O(new mn6());
        VarHandle.storeStoreFence();
        f23266b = kn6Var;
    }

    @Override // p000.qe4
    public final Object get() {
        return (mn6) this.f23267a.f31098a;
    }
}
