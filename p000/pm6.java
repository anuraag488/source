package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pm6 implements qe4 {

    /* JADX INFO: renamed from: b */
    public static final pm6 f27751b;

    /* JADX INFO: renamed from: a */
    public te4 f27752a;

    static {
        pm6 pm6Var = new pm6();
        pm6Var.f27752a = se0.m10702O(new rm6());
        VarHandle.storeStoreFence();
        f27751b = pm6Var;
    }

    @Override // p000.qe4
    public final Object get() {
        return (rm6) this.f27752a.f31098a;
    }
}
