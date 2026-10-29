package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xv0 extends eb1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: i */
    public static final xv0 f34637i;

    /* JADX INFO: renamed from: j */
    public static final long f34638j;

    static {
        Long l;
        xv0 xv0Var = new xv0();
        f34637i = xv0Var;
        xv0Var.m5049U(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f34638j = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // p000.mx0
    /* JADX INFO: renamed from: A */
    public final w01 mo6961A(long j, Runnable runnable, ro0 ro0Var) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return l13.f23702a;
        }
        long jNanoTime = System.nanoTime();
        bb1 bb1Var = new bb1(j2 + jNanoTime);
        bb1Var.f15196c = runnable;
        VarHandle.storeStoreFence();
        m5054Z(jNanoTime, bb1Var);
        return bb1Var;
    }

    @Override // p000.eb1
    /* JADX INFO: renamed from: Q */
    public final void mo5045Q(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo5045Q(runnable);
    }

    @Override // p000.eb1
    /* JADX INFO: renamed from: T */
    public final Thread mo5048T() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(xv0.class.getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // p000.eb1
    /* JADX INFO: renamed from: Y */
    public final void mo5053Y(long j, cb1 cb1Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* JADX INFO: renamed from: a0 */
    public final synchronized void m12761a0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            Unsafe unsafe = AbstractC1078qo.f28633a;
            unsafe.putObjectVolatile(this, eb1.f17946g, (Object) null);
            unsafe.putObjectVolatile(this, eb1.f17944e, (Object) null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        em4.f18262a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    m12761a0();
                    if (m5050V()) {
                        return;
                    }
                    mo5048T();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jM5051W = m5051W();
                    if (jM5051W == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f34638j + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m12761a0();
                            if (m5050V()) {
                                return;
                            }
                            mo5048T();
                            return;
                        }
                        if (jM5051W > j2) {
                            jM5051W = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jM5051W > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m12761a0();
                            if (m5050V()) {
                                return;
                            }
                            mo5048T();
                            return;
                        }
                        LockSupport.parkNanos(this, jM5051W);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            m12761a0();
            if (!m5050V()) {
                mo5048T();
            }
            throw th;
        }
    }

    @Override // p000.eb1
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p000.so0
    public final String toString() {
        return "DefaultExecutor";
    }
}
