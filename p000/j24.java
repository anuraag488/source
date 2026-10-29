package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j24 implements Executor {

    /* JADX INFO: renamed from: e */
    public static final String f21967e = wn2.m12327g("SerialExecutorImpl");

    /* JADX INFO: renamed from: b */
    public final Executor f21969b;

    /* JADX INFO: renamed from: c */
    public Runnable f21970c;

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f21968a = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public final Object f21971d = new Object();

    public j24(Executor executor) {
        this.f21969b = executor;
    }

    /* JADX INFO: renamed from: a */
    public final void m6995a() {
        Runnable runnable = (Runnable) this.f21968a.poll();
        this.f21970c = runnable;
        if (runnable != null) {
            try {
                this.f21969b.execute(runnable);
            } catch (Throwable th) {
                wn2.m12326e().m12330d(f21967e, "Delegate executor failed to execute", th);
                this.f21970c = null;
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f21971d) {
            try {
                ArrayDeque arrayDeque = this.f21968a;
                ar1 ar1Var = new ar1((byte) 5);
                ar1Var.f14798b = this;
                ar1Var.f14799c = runnable;
                VarHandle.storeStoreFence();
                arrayDeque.add(ar1Var);
                if (this.f21970c == null) {
                    m6995a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
