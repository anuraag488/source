package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wo6 implements qe4 {

    /* JADX INFO: renamed from: b */
    public static final wo6 f33575b;

    /* JADX INFO: renamed from: a */
    public te4 f33576a;

    static {
        wo6 wo6Var = new wo6();
        wo6Var.f33576a = se0.m10702O(new xo6());
        VarHandle.storeStoreFence();
        f33575b = wo6Var;
    }

    @Override // p000.qe4
    public final Object get() {
        return (xo6) this.f33576a.f31098a;
    }
}
