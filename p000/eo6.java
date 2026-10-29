package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class eo6 implements qe4 {

    /* JADX INFO: renamed from: b */
    public static final eo6 f18344b;

    /* JADX INFO: renamed from: a */
    public te4 f18345a;

    static {
        eo6 eo6Var = new eo6();
        eo6Var.f18345a = se0.m10702O(new go6());
        VarHandle.storeStoreFence();
        f18344b = eo6Var;
    }

    @Override // p000.qe4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final go6 get() {
        return (go6) this.f18345a.f31098a;
    }
}
