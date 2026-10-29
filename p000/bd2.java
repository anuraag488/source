package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class bd2 {

    /* JADX INFO: renamed from: a */
    public static final w42 f15216a;

    static {
        f70 f70Var = new f70((byte) 11);
        VarHandle.storeStoreFence();
        w42 w42Var = new w42((byte) 2, false);
        w42Var.f33090b = f70Var;
        VarHandle.storeStoreFence();
        f15216a = w42Var;
    }
}
