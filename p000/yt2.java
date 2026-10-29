package p000;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class yt2 extends AbstractExecutorService implements AutoCloseable, ExecutorService {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35522a = 0;

    /* JADX INFO: renamed from: b */
    public final ExecutorService f35523b;

    public yt2(ExecutorService executorService) {
        executorService.getClass();
        this.f35523b = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        switch (this.f35522a) {
            case 0:
                return this.f35523b.awaitTermination(j, timeUnit);
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.f35522a;
        ExecutorService executorService = this.f35523b;
        switch (b) {
            case 0:
                executorService.execute(runnable);
                break;
            default:
                ((ThreadPoolExecutor) executorService).execute(runnable);
                break;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.f35522a) {
            case 0:
                return this.f35523b.isShutdown();
            default:
                return false;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.f35522a) {
            case 0:
                return this.f35523b.isTerminated();
            default:
                return false;
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new pq4(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        switch (this.f35522a) {
            case 0:
                this.f35523b.shutdown();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.f35522a) {
            case 0:
                return this.f35523b.shutdownNow();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return (zl2) super.submit(runnable);
    }

    public String toString() {
        switch (this.f35522a) {
            case 0:
                return super.toString() + "[" + this.f35523b + "]";
            default:
                return super.toString();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return (zl2) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final zl2 submit(Callable callable) {
        return (zl2) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return (zl2) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new pq4(callable);
    }

    public yt2(ThreadPoolExecutor threadPoolExecutor) {
        this.f35523b = threadPoolExecutor;
    }
}
