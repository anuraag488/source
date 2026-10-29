package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pw0 extends tb1 {

    /* JADX INFO: renamed from: c */
    public static final pw0 f28043c;

    /* JADX INFO: renamed from: b */
    public yo0 f28044b;

    static {
        int i = qi4.f28513c;
        int i2 = qi4.f28514d;
        long j = qi4.f28515e;
        String str = qi4.f28511a;
        pw0 pw0Var = new pw0();
        pw0Var.f28044b = new yo0(i, i2, j, str);
        VarHandle.storeStoreFence();
        f28043c = pw0Var;
    }

    @Override // p000.so0
    /* JADX INFO: renamed from: K */
    public final void mo5041K(ro0 ro0Var, Runnable runnable) {
        yo0.m13188e(this.f28044b, runnable, 6);
    }

    @Override // p000.so0
    /* JADX INFO: renamed from: L */
    public final void mo6175L(ro0 ro0Var, Runnable runnable) {
        yo0.m13188e(this.f28044b, runnable, 2);
    }

    @Override // p000.so0
    /* JADX INFO: renamed from: N */
    public final so0 mo5042N(int i, String str) {
        vd6.m11848g(i);
        return i >= qi4.f28513c ? vd6.m11823G(this, str) : super.mo5042N(i, str);
    }

    @Override // p000.tb1
    /* JADX INFO: renamed from: O */
    public final Executor mo6176O() {
        return this.f28044b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p000.so0
    public final String toString() {
        return "Dispatchers.Default";
    }
}
