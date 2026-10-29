package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class po6 implements qe4 {

    /* JADX INFO: renamed from: b */
    public static final po6 f27870b;

    /* JADX INFO: renamed from: a */
    public te4 f27871a;

    static {
        po6 po6Var = new po6();
        po6Var.f27871a = se0.m10702O(new so6());
        VarHandle.storeStoreFence();
        f27870b = po6Var;
    }

    @Override // p000.qe4
    public final Object get() {
        return (so6) this.f27871a.f31098a;
    }
}
