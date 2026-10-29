package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class np6 implements qe4 {

    /* JADX INFO: renamed from: b */
    public static final np6 f26025b;

    /* JADX INFO: renamed from: a */
    public te4 f26026a;

    static {
        np6 np6Var = new np6();
        np6Var.f26026a = se0.m10702O(new op6());
        VarHandle.storeStoreFence();
        f26025b = np6Var;
    }

    @Override // p000.qe4
    public final Object get() {
        return (op6) this.f26026a.f31098a;
    }
}
