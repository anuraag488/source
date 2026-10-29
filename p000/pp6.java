package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pp6 implements qe4 {

    /* JADX INFO: renamed from: b */
    public static final pp6 f27888b;

    /* JADX INFO: renamed from: a */
    public te4 f27889a;

    static {
        pp6 pp6Var = new pp6();
        pp6Var.f27889a = se0.m10702O(new sp6());
        VarHandle.storeStoreFence();
        f27888b = pp6Var;
    }

    @Override // p000.qe4
    public final Object get() {
        return (sp6) this.f27889a.f31098a;
    }
}
