package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hn1 extends jk1 {

    /* JADX INFO: renamed from: h */
    public zl2 f20718h;

    @Override // p000.AbstractC0782j1, p000.zl2
    /* JADX INFO: renamed from: a */
    public final void mo6454a(Runnable runnable, Executor executor) {
        this.f20718h.mo6454a(runnable, executor);
    }

    @Override // p000.AbstractC0782j1, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f20718h.cancel(z);
    }

    @Override // p000.AbstractC0782j1, java.util.concurrent.Future
    public final Object get() {
        return this.f20718h.get();
    }

    @Override // p000.AbstractC0782j1, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f20718h.isCancelled();
    }

    @Override // p000.AbstractC0782j1, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f20718h.isDone();
    }

    @Override // p000.AbstractC0782j1
    public final String toString() {
        return this.f20718h.toString();
    }

    @Override // p000.AbstractC0782j1, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f20718h.get(j, timeUnit);
    }
}
