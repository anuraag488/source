package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jp6 implements qe4 {

    /* JADX INFO: renamed from: b */
    public static final jp6 f22511b;

    /* JADX INFO: renamed from: a */
    public te4 f22512a;

    static {
        jp6 jp6Var = new jp6();
        jp6Var.f22512a = se0.m10702O(new mp6());
        VarHandle.storeStoreFence();
        f22511b = jp6Var;
    }

    @Override // p000.qe4
    public final Object get() {
        return (mp6) this.f22512a.f31098a;
    }
}
