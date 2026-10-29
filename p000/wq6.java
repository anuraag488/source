package p000;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wq6 implements yz5 {

    /* JADX INFO: renamed from: a */
    public WeakReference f33644a;

    /* JADX INFO: renamed from: b */
    public fq6 f33645b;

    @Override // p000.yz5
    /* JADX INFO: renamed from: b */
    public final void mo4845b(Runnable runnable, Executor executor) {
        this.f33645b.mo4845b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        dm6 dm6Var = (dm6) this.f33644a.get();
        boolean zCancel = this.f33645b.cancel(z);
        if (!zCancel || dm6Var == null) {
            return zCancel;
        }
        dm6Var.f17196a = null;
        dm6Var.f17197b = null;
        dm6Var.f17198c.m7266i(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f33645b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f33645b.f26828a instanceof f16;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f33645b.isDone();
    }

    public final String toString() {
        return this.f33645b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f33645b.get(j, timeUnit);
    }
}
