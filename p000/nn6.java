package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nn6 implements qe4 {

    /* JADX INFO: renamed from: b */
    public static final nn6 f25973b;

    /* JADX INFO: renamed from: a */
    public te4 f25974a;

    static {
        nn6 nn6Var = new nn6();
        nn6Var.f25974a = se0.m10702O(new vn6());
        VarHandle.storeStoreFence();
        f25973b = nn6Var;
    }

    @Override // p000.qe4
    public final Object get() {
        return (vn6) this.f25974a.f31098a;
    }
}
