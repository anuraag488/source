package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zn6 implements qe4 {

    /* JADX INFO: renamed from: b */
    public static final zn6 f36211b;

    /* JADX INFO: renamed from: a */
    public te4 f36212a;

    static {
        zn6 zn6Var = new zn6();
        zn6Var.f36212a = se0.m10702O(new co6());
        VarHandle.storeStoreFence();
        f36211b = zn6Var;
    }

    @Override // p000.qe4
    public final Object get() {
        return (co6) this.f36212a.f31098a;
    }
}
