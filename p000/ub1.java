package p000;

import java.lang.invoke.VarHandle;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ub1 extends tb1 implements mx0 {

    /* JADX INFO: renamed from: b */
    public final Executor f31769b;

    public ub1(Executor executor) {
        Method method;
        this.f31769b = executor;
        Method method2 = mj0.f24962a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = mj0.f24962a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // p000.mx0
    /* JADX INFO: renamed from: A */
    public final w01 mo6961A(long j, Runnable runnable, ro0 ro0Var) {
        Executor executor = this.f31769b;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                y70.m13032l(ro0Var, cancellationException);
            }
        }
        if (scheduledFutureSchedule == null) {
            return xv0.f34637i.mo6961A(j, runnable, ro0Var);
        }
        v01 v01Var = new v01();
        v01Var.f32282a = scheduledFutureSchedule;
        VarHandle.storeStoreFence();
        return v01Var;
    }

    @Override // p000.so0
    /* JADX INFO: renamed from: K */
    public final void mo5041K(ro0 ro0Var, Runnable runnable) {
        try {
            this.f31769b.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            y70.m13032l(ro0Var, cancellationException);
            pw0 pw0Var = l01.f23664a;
            gw0.f20149b.mo5041K(ro0Var, runnable);
        }
    }

    @Override // p000.tb1
    /* JADX INFO: renamed from: O */
    public final Executor mo6176O() {
        return this.f31769b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f31769b;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ub1) && ((ub1) obj).f31769b == this.f31769b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f31769b);
    }

    @Override // p000.mx0
    /* JADX INFO: renamed from: j */
    public final void mo5055j(long j, b70 b70Var) {
        Executor executor = this.f31769b;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            oz5 oz5Var = new oz5((byte) 3);
            oz5Var.f27249b = this;
            oz5Var.f27250c = b70Var;
            VarHandle.storeStoreFence();
            ro0 ro0Var = b70Var.f15139e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(oz5Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                y70.m13032l(ro0Var, cancellationException);
            }
        }
        if (scheduledFutureSchedule == null) {
            xv0.f34637i.mo5055j(j, b70Var);
            return;
        }
        w60 w60Var = new w60((byte) 0);
        w60Var.f33119b = scheduledFutureSchedule;
        VarHandle.storeStoreFence();
        b70Var.m3500x(w60Var);
    }

    @Override // p000.so0
    public final String toString() {
        return this.f31769b.toString();
    }
}
