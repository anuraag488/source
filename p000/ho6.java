package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ho6 implements qe4 {

    /* JADX INFO: renamed from: b */
    public static final ho6 f20761b;

    /* JADX INFO: renamed from: a */
    public te4 f20762a;

    static {
        ho6 ho6Var = new ho6();
        ho6Var.f20762a = se0.m10702O(new ko6());
        VarHandle.storeStoreFence();
        f20761b = ho6Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m6466a() {
        f20761b.get();
    }

    @Override // p000.qe4
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ko6 get() {
        return (ko6) this.f20762a.f31098a;
    }
}
