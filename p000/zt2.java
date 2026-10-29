package p000;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zt2 implements ScheduledFuture, zl2, Future {

    /* JADX INFO: renamed from: a */
    public final AbstractC0782j1 f36358a;

    /* JADX INFO: renamed from: b */
    public final ScheduledFuture f36359b;

    public zt2(AbstractC0782j1 abstractC0782j1, ScheduledFuture scheduledFuture) {
        this.f36358a = abstractC0782j1;
        this.f36359b = scheduledFuture;
    }

    @Override // p000.zl2
    /* JADX INFO: renamed from: a */
    public final void mo6454a(Runnable runnable, Executor executor) {
        this.f36358a.mo6454a(runnable, executor);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m13752c(boolean z) {
        return this.f36358a.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zM13752c = m13752c(z);
        if (zM13752c) {
            this.f36359b.cancel(z);
        }
        return zM13752c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f36359b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f36358a.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f36359b.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f36358a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f36358a.isDone();
    }

    public final String toString() {
        return this.f36358a.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f36358a.get(j, timeUnit);
    }
}
