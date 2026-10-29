package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gw0 extends tb1 implements Executor {

    /* JADX INFO: renamed from: b */
    public static final gw0 f20149b = new gw0();

    /* JADX INFO: renamed from: c */
    public static final so0 f20150c;

    static {
        qu4 qu4Var = qu4.f28819b;
        int i = ph4.f27610a;
        if (64 >= i) {
            i = 64;
        }
        f20150c = qu4Var.mo5042N(i20.m6570E(i, "kotlinx.coroutines.io.parallelism", 12), null);
    }

    @Override // p000.so0
    /* JADX INFO: renamed from: L */
    public final void mo6175L(ro0 ro0Var, Runnable runnable) {
        f20150c.mo6175L(ro0Var, runnable);
    }

    @Override // p000.so0
    /* JADX INFO: renamed from: N */
    public final so0 mo5042N(int i, String str) {
        return qu4.f28819b.mo5042N(i, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo5041K(r71.f29063a, runnable);
    }

    @Override // p000.so0
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // p000.tb1
    /* JADX INFO: renamed from: O */
    public final Executor mo6176O() {
        return this;
    }
}
