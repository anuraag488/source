package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class em4 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f18262a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static eb1 m5204a() {
        ThreadLocal threadLocal = f18262a;
        eb1 eb1Var = (eb1) threadLocal.get();
        if (eb1Var != null) {
            return eb1Var;
        }
        Thread threadCurrentThread = Thread.currentThread();
        u00 u00Var = new u00();
        u00Var.f31576i = threadCurrentThread;
        VarHandle.storeStoreFence();
        threadLocal.set(u00Var);
        return u00Var;
    }
}
