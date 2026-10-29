package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zl6 implements qe4 {

    /* JADX INFO: renamed from: b */
    public static final zl6 f36172b;

    /* JADX INFO: renamed from: a */
    public te4 f36173a;

    static {
        zl6 zl6Var = new zl6();
        zl6Var.f36173a = se0.m10702O(new gm6());
        VarHandle.storeStoreFence();
        f36172b = zl6Var;
    }

    @Override // p000.qe4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gm6 get() {
        return (gm6) this.f36173a.f31098a;
    }
}
