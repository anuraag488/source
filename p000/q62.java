package p000;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class q62 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: a */
    public static final p62 f28241a;

    /* JADX INFO: renamed from: b */
    public static final p62 f28242b;

    static {
        byte b = 0;
        f28241a = new p62(b);
        f28242b = new p62(b);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo9238a(Throwable th);

    /* JADX INFO: renamed from: b */
    public abstract void mo9239b(Object obj);

    /* JADX INFO: renamed from: c */
    public final void m9745c() {
        p62 p62Var = f28242b;
        p62 p62Var2 = f28241a;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            o62 o62Var = new o62(this);
            o62Var.m8968a(Thread.currentThread());
            if (compareAndSet(runnable, o62Var)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(p62Var2)) == p62Var) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo9240d();

    /* JADX INFO: renamed from: e */
    public abstract Object mo9241e();

    /* JADX INFO: renamed from: f */
    public abstract String mo9242f();

    /* JADX INFO: renamed from: g */
    public final void m9746g(Thread thread) {
        Runnable runnable = (Runnable) get();
        o62 o62Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof o62;
            p62 p62Var = f28242b;
            if (!z2 && runnable != p62Var) {
                break;
            }
            if (z2) {
                o62Var = (o62) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == p62Var || compareAndSet(runnable, p62Var)) {
                z = Thread.interrupted() || z;
                LockSupport.park(o62Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objMo9241e = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zMo9240d = mo9240d();
            p62 p62Var = f28241a;
            if (!zMo9240d) {
                try {
                    objMo9241e = mo9241e();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, p62Var)) {
                            m9746g(threadCurrentThread);
                        }
                        if (zMo9240d) {
                            return;
                        }
                        mo9238a(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, p62Var)) {
                            m9746g(threadCurrentThread);
                        }
                        if (!zMo9240d) {
                            mo9239b(null);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, p62Var)) {
                m9746g(threadCurrentThread);
            }
            if (zMo9240d) {
                return;
            }
            mo9239b(objMo9241e);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f28241a) {
            str = "running=[DONE]";
        } else if (runnable instanceof o62) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + mo9242f();
    }
}
