package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mo6 implements qe4 {

    /* JADX INFO: renamed from: b */
    public static final mo6 f25092b;

    /* JADX INFO: renamed from: a */
    public te4 f25093a;

    static {
        mo6 mo6Var = new mo6();
        mo6Var.f25093a = se0.m10702O(new no6());
        VarHandle.storeStoreFence();
        f25092b = mo6Var;
    }

    @Override // p000.qe4
    public final Object get() {
        return (no6) this.f25093a.f31098a;
    }
}
