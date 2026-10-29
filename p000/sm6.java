package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sm6 implements qe4 {

    /* JADX INFO: renamed from: b */
    public static final sm6 f30397b;

    /* JADX INFO: renamed from: a */
    public te4 f30398a;

    static {
        sm6 sm6Var = new sm6();
        sm6Var.f30398a = se0.m10702O(new vm6());
        VarHandle.storeStoreFence();
        f30397b = sm6Var;
    }

    @Override // p000.qe4
    public final Object get() {
        return (vm6) this.f30398a.f31098a;
    }
}
