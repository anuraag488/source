package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e24 implements Executor {

    /* JADX INFO: renamed from: f */
    public static final Logger f17642f = Logger.getLogger(e24.class.getName());

    /* JADX INFO: renamed from: a */
    public Executor f17643a;

    /* JADX INFO: renamed from: b */
    public ArrayDeque f17644b;

    /* JADX INFO: renamed from: c */
    public int f17645c;

    /* JADX INFO: renamed from: d */
    public long f17646d;

    /* JADX INFO: renamed from: e */
    public ar1 f17647e;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        y42.m12854a0(runnable);
        synchronized (this.f17644b) {
            int i = this.f17645c;
            if (i != 4 && i != 3) {
                long j = this.f17646d;
                boolean z = true;
                au3 au3Var = new au3((byte) 1);
                au3Var.f14880b = runnable;
                VarHandle.storeStoreFence();
                this.f17644b.add(au3Var);
                this.f17645c = 2;
                try {
                    this.f17643a.execute(this.f17647e);
                    if (this.f17645c != 2) {
                        return;
                    }
                    synchronized (this.f17644b) {
                        try {
                            if (this.f17646d == j && this.f17645c == 2) {
                                this.f17645c = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f17644b) {
                        try {
                            int i2 = this.f17645c;
                            if ((i2 != 1 && i2 != 2) || !this.f17644b.removeLastOccurrence(au3Var)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            this.f17644b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f17643a + "}";
    }
}
