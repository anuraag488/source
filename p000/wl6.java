package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wl6 implements qe4 {

    /* JADX INFO: renamed from: b */
    public static final wl6 f33484b;

    /* JADX INFO: renamed from: a */
    public te4 f33485a;

    static {
        wl6 wl6Var = new wl6();
        wl6Var.f33485a = se0.m10702O(new yl6());
        VarHandle.storeStoreFence();
        f33484b = wl6Var;
    }

    @Override // p000.qe4
    public final Object get() {
        return (yl6) this.f33485a.f31098a;
    }
}
