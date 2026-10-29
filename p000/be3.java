package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class be3 {

    /* JADX INFO: renamed from: a */
    public static final wp2 f15224a;

    static {
        q15 q15Var = u15.f31600c;
        s15 s15Var = u15.f31602e;
        ge3 ge3VarM5981o = ge3.m5981o();
        wp2 wp2Var = new wp2();
        jp0 jp0Var = new jp0((byte) 28, false);
        jp0Var.f22481b = q15Var;
        jp0Var.f22482c = s15Var;
        jp0Var.f22483d = ge3VarM5981o;
        VarHandle.storeStoreFence();
        wp2Var.f33578a = jp0Var;
        VarHandle.storeStoreFence();
        f15224a = wp2Var;
    }
}
