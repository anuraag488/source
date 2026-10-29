package p000;

import android.os.Trace;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lt5 implements Executor {

    /* JADX INFO: renamed from: a */
    public LinkedBlockingQueue f24361a;

    /* JADX INFO: renamed from: b */
    public boolean f24362b;

    /* JADX INFO: renamed from: c */
    public boolean f24363c;

    /* JADX INFO: renamed from: d */
    public InterruptedIOException f24364d;

    /* JADX INFO: renamed from: e */
    public RuntimeException f24365e;

    /* JADX INFO: renamed from: a */
    public final void m8107a(int i) {
        Runnable runnableM8108b;
        ry5.m10503a("Cronet MessageLoop#loop");
        try {
            long jNanoTime = System.nanoTime();
            long jConvert = TimeUnit.NANOSECONDS.convert(i, TimeUnit.MILLISECONDS);
            if (this.f24363c) {
                InterruptedIOException interruptedIOException = this.f24364d;
                if (interruptedIOException == null) {
                    throw this.f24365e;
                }
                throw interruptedIOException;
            }
            if (this.f24362b) {
                throw new IllegalStateException("Cannot run loop when it is already running.");
            }
            this.f24362b = true;
            while (this.f24362b) {
                if (i == 0) {
                    try {
                        runnableM8108b = m8108b(0L, false);
                    } catch (InterruptedIOException e) {
                        this.f24362b = false;
                        this.f24363c = true;
                        this.f24364d = e;
                        throw e;
                    } catch (RuntimeException e2) {
                        this.f24362b = false;
                        this.f24363c = true;
                        this.f24365e = e2;
                        throw e2;
                    }
                } else {
                    runnableM8108b = m8108b((jConvert - System.nanoTime()) + jNanoTime, true);
                }
                ry5.m10503a("Cronet MessageLoop#loop running task");
                try {
                    runnableM8108b.run();
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th3) {
            try {
                Trace.endSection();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Runnable m8108b(long j, boolean z) throws InterruptedIOException {
        LinkedBlockingQueue linkedBlockingQueue = this.f24361a;
        try {
            Runnable runnable = !z ? (Runnable) linkedBlockingQueue.take() : (Runnable) linkedBlockingQueue.poll(j, TimeUnit.NANOSECONDS);
            if (runnable != null) {
                return runnable;
            }
            throw new SocketTimeoutException();
        } catch (InterruptedException e) {
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            interruptedIOException.initCause(e);
            throw interruptedIOException;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable == null) {
            ds3.m4665g();
            return;
        }
        try {
            this.f24361a.put(runnable);
        } catch (InterruptedException e) {
            throw new RejectedExecutionException(e);
        }
    }
}
