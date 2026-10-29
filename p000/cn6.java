package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cn6 implements qe4 {

    /* JADX INFO: renamed from: b */
    public static final cn6 f16165b;

    /* JADX INFO: renamed from: a */
    public te4 f16166a;

    static {
        cn6 cn6Var = new cn6();
        cn6Var.f16166a = se0.m10702O(new en6());
        VarHandle.storeStoreFence();
        f16165b = cn6Var;
    }

    @Override // p000.qe4
    public final Object get() {
        return (en6) this.f16166a.f31098a;
    }
}
