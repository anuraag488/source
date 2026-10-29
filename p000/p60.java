package p000;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p60 implements zl2 {

    /* JADX INFO: renamed from: a */
    public WeakReference f27391a;

    /* JADX INFO: renamed from: b */
    public o60 f27392b;

    @Override // p000.zl2
    /* JADX INFO: renamed from: a */
    public final void mo6454a(Runnable runnable, Executor executor) {
        this.f27392b.mo6454a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        m60 m60Var = (m60) this.f27391a.get();
        boolean zCancel = this.f27392b.cancel(z);
        if (zCancel && m60Var != null) {
            m60Var.f24678a = null;
            m60Var.f24679b = null;
            m60Var.f24680c.m7820k(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f27392b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f27392b.f23717a instanceof C0635f2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f27392b.isDone();
    }

    public final String toString() {
        return this.f27392b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f27392b.get(j, timeUnit);
    }
}
