package p000;

import android.os.Looper;
import java.lang.invoke.VarHandle;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class cw4 {

    /* JADX INFO: renamed from: a */
    public static final ExecutorService f16539a;

    static {
        AtomicLong atomicLong = new AtomicLong(1L);
        zw0 zw0Var = new zw0((byte) 1);
        zw0Var.f36423b = atomicLong;
        VarHandle.storeStoreFence();
        ThreadPoolExecutor.DiscardPolicy discardPolicy = new ThreadPoolExecutor.DiscardPolicy();
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), zw0Var, discardPolicy));
        Runtime runtime = Runtime.getRuntime();
        vb1 vb1Var = new vb1((byte) 1);
        vb1Var.f32506b = executorServiceUnconfigurableExecutorService;
        VarHandle.storeStoreFence();
        runtime.addShutdownHook(new Thread(vb1Var, "Crashlytics Shutdown Hook for awaitEvenIfOnMainThread task continuation executor"));
        f16539a = executorServiceUnconfigurableExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public static void m4216a(nr6 nr6Var) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Executor executor = f16539a;
        C1040pn c1040pn = new C1040pn((byte) 19);
        c1040pn.f27754b = countDownLatch;
        VarHandle.storeStoreFence();
        nr6Var.m8821e(executor, c1040pn);
        Looper mainLooper = Looper.getMainLooper();
        Looper looperMyLooper = Looper.myLooper();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (mainLooper == looperMyLooper) {
            countDownLatch.await(3000L, timeUnit);
        } else {
            countDownLatch.await(4000L, timeUnit);
        }
        if (nr6Var.m8826j()) {
            nr6Var.m8824h();
        } else {
            if (nr6Var.f26060d) {
                throw new CancellationException("Task is already canceled");
            }
            if (!nr6Var.m8825i()) {
                throw new TimeoutException();
            }
            throw new IllegalStateException(nr6Var.m8823g());
        }
    }
}
