package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bu2 extends yt2 implements ScheduledExecutorService {

    /* JADX INFO: renamed from: c */
    public ScheduledExecutorService f15634c;

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        pq4 pq4Var = new pq4(Executors.callable(runnable, null));
        return new zt2(pq4Var, this.f15634c.schedule(pq4Var, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        au2 au2Var = new au2(runnable);
        return new zt2(au2Var, this.f15634c.scheduleAtFixedRate(au2Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        au2 au2Var = new au2(runnable);
        return new zt2(au2Var, this.f15634c.scheduleWithFixedDelay(au2Var, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        pq4 pq4Var = new pq4(callable);
        return new zt2(pq4Var, this.f15634c.schedule(pq4Var, j, timeUnit));
    }
}
