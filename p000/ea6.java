package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ea6 extends lc6 {

    /* JADX INFO: renamed from: o */
    public static final AtomicLong f17930o = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: g */
    public aa6 f17931g;

    /* JADX INFO: renamed from: h */
    public aa6 f17932h;

    /* JADX INFO: renamed from: i */
    public PriorityBlockingQueue f17933i;

    /* JADX INFO: renamed from: j */
    public LinkedBlockingQueue f17934j;

    /* JADX INFO: renamed from: k */
    public w96 f17935k;

    /* JADX INFO: renamed from: l */
    public w96 f17936l;

    /* JADX INFO: renamed from: m */
    public Object f17937m;

    /* JADX INFO: renamed from: n */
    public Semaphore f17938n;

    /* JADX INFO: renamed from: A */
    public final boolean m5030A() {
        return Thread.currentThread() == this.f17931g;
    }

    /* JADX INFO: renamed from: B */
    public final y96 m5031B(Callable callable) {
        m7955v();
        y96 y96Var = new y96(this, callable, false);
        if (Thread.currentThread() != this.f17931g) {
            m5037H(y96Var);
            return y96Var;
        }
        if (!this.f17933i.isEmpty()) {
            d76 d76Var = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12504a("Callable skipped the worker queue.");
        }
        y96Var.run();
        return y96Var;
    }

    /* JADX INFO: renamed from: C */
    public final y96 m5032C(Callable callable) {
        m7955v();
        y96 y96Var = new y96(this, callable, true);
        if (Thread.currentThread() == this.f17931g) {
            y96Var.run();
            return y96Var;
        }
        m5037H(y96Var);
        return y96Var;
    }

    /* JADX INFO: renamed from: D */
    public final void m5033D(Runnable runnable) {
        m7955v();
        y42.m12854a0(runnable);
        m5037H(new y96(this, runnable, false, "Task exception on worker thread"));
    }

    /* JADX INFO: renamed from: E */
    public final Object m5034E(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            ea6 ea6Var = ((oa6) this.f36084a).f26515g;
            oa6.m9016l(ea6Var);
            ea6Var.m5033D(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                d76 d76Var = ((oa6) this.f36084a).f26514f;
                oa6.m9016l(d76Var);
                x66 x66Var = d76Var.f16838m;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                x66Var.m12504a(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            d76 d76Var2 = ((oa6) this.f36084a).f26514f;
            oa6.m9016l(d76Var2);
            d76Var2.f16838m.m12504a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    /* JADX INFO: renamed from: F */
    public final void m5035F(Runnable runnable) {
        m7955v();
        m5037H(new y96(this, runnable, true, "Task exception on worker thread"));
    }

    /* JADX INFO: renamed from: G */
    public final void m5036G(Runnable runnable) {
        m7955v();
        y96 y96Var = new y96(this, runnable, false, "Task exception on network thread");
        synchronized (this.f17937m) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f17934j;
                linkedBlockingQueue.add(y96Var);
                aa6 aa6Var = this.f17932h;
                if (aa6Var == null) {
                    aa6 aa6Var2 = new aa6(this, "Measurement Network", linkedBlockingQueue);
                    this.f17932h = aa6Var2;
                    aa6Var2.setUncaughtExceptionHandler(this.f17936l);
                    this.f17932h.start();
                } else {
                    Object obj = aa6Var.f221a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m5037H(y96 y96Var) {
        synchronized (this.f17937m) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f17933i;
                priorityBlockingQueue.add(y96Var);
                aa6 aa6Var = this.f17931g;
                if (aa6Var == null) {
                    aa6 aa6Var2 = new aa6(this, "Measurement Worker", priorityBlockingQueue);
                    this.f17931g = aa6Var2;
                    aa6Var2.setUncaughtExceptionHandler(this.f17935k);
                    this.f17931g.start();
                } else {
                    Object obj = aa6Var.f221a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.zh0
    /* JADX INFO: renamed from: t */
    public final void mo5038t() {
        if (Thread.currentThread() == this.f17931g) {
            return;
        }
        C1077qn.m9989o("Call expected from worker thread");
    }

    @Override // p000.lc6
    /* JADX INFO: renamed from: u */
    public final boolean mo4615u() {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final void m5039y() {
        if (Thread.currentThread() == this.f17932h) {
            return;
        }
        C1077qn.m9989o("Call expected from network thread");
    }

    /* JADX INFO: renamed from: z */
    public final void m5040z() {
        if (Thread.currentThread() != this.f17931g) {
            return;
        }
        C1077qn.m9989o("Call not expected from worker thread");
    }
}
