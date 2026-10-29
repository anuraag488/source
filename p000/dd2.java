package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dd2 {

    /* JADX INFO: renamed from: a */
    public u50 f16994a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ed2 f16995b;

    /* JADX INFO: renamed from: a */
    public static dd2 m4479a(ed2 ed2Var, u50 u50Var) {
        dd2 dd2Var = new dd2();
        dd2Var.f16995b = ed2Var;
        dd2Var.f16994a = u50Var;
        VarHandle.storeStoreFence();
        return dd2Var;
    }
}
