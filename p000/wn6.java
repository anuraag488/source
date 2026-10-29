package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wn6 implements qe4 {

    /* JADX INFO: renamed from: b */
    public static final wn6 f33526b;

    /* JADX INFO: renamed from: a */
    public te4 f33527a;

    static {
        wn6 wn6Var = new wn6();
        wn6Var.f33527a = se0.m10702O(new yn6());
        VarHandle.storeStoreFence();
        f33526b = wn6Var;
    }

    @Override // p000.qe4
    public final Object get() {
        return (yn6) this.f33527a.f31098a;
    }
}
