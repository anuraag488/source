package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fn6 implements qe4 {

    /* JADX INFO: renamed from: b */
    public static final fn6 f19154b;

    /* JADX INFO: renamed from: a */
    public te4 f19155a;

    static {
        fn6 fn6Var = new fn6();
        fn6Var.f19155a = se0.m10702O(new gn6());
        VarHandle.storeStoreFence();
        f19154b = fn6Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m5761a() {
    }

    @Override // p000.qe4
    public final Object get() {
        return (gn6) this.f19155a.f31098a;
    }
}
