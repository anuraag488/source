package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class f14 {

    /* JADX INFO: renamed from: a */
    public static final AtomicInteger f18661a = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public static final nt2 m5458a(nt2 nt2Var, boolean z, yp1 yp1Var) {
        C0497bn c0497bn = new C0497bn();
        c0497bn.f15424a = z;
        c0497bn.f15425b = yp1Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(c0497bn);
    }
}
