package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class kz3 implements aj0 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ vg2 f23637a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ArrayList f23638b;

    /* JADX INFO: renamed from: a */
    public final void m7753a(Object obj, nq1 nq1Var) {
        ArrayList arrayList = this.f23638b;
        lz3 lz3Var = new lz3();
        lz3Var.f24484a = obj;
        lz3Var.f24485b = nq1Var;
        VarHandle.storeStoreFence();
        arrayList.add(lz3Var);
    }

    @Override // p000.aj0
    /* JADX INFO: renamed from: b */
    public final Object mo2998b(xh3 xh3Var) {
        return this.f23637a.mo2998b(xh3Var);
    }
}
