package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class im6 implements qe4 {

    /* JADX INFO: renamed from: b */
    public static final im6 f21564b;

    /* JADX INFO: renamed from: a */
    public te4 f21565a;

    static {
        im6 im6Var = new im6();
        im6Var.f21565a = se0.m10702O(new mm6());
        VarHandle.storeStoreFence();
        f21564b = im6Var;
    }

    @Override // p000.qe4
    public final Object get() {
        return (mm6) this.f21565a.f31098a;
    }
}
