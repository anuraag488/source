package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wm6 implements qe4 {

    /* JADX INFO: renamed from: b */
    public static final wm6 f33509b;

    /* JADX INFO: renamed from: a */
    public te4 f33510a;

    static {
        wm6 wm6Var = new wm6();
        wm6Var.f33510a = se0.m10702O(new zm6());
        VarHandle.storeStoreFence();
        f33509b = wm6Var;
    }

    @Override // p000.qe4
    public final Object get() {
        return (zm6) this.f33510a.f31098a;
    }
}
