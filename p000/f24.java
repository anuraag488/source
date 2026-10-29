package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f24 implements Executor {

    /* JADX INFO: renamed from: f */
    public static final Logger f18675f = Logger.getLogger(f24.class.getName());

    /* JADX INFO: renamed from: a */
    public Executor f18676a;

    /* JADX INFO: renamed from: b */
    public ArrayDeque f18677b;

    /* JADX INFO: renamed from: c */
    public int f18678c;

    /* JADX INFO: renamed from: d */
    public long f18679d;

    /* JADX INFO: renamed from: e */
    public oz5 f18680e;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f18677b) {
            int i = this.f18678c;
            if (i != 4 && i != 3) {
                long j = this.f18679d;
                au3 au3Var = new au3((byte) 2);
                au3Var.f14880b = runnable;
                VarHandle.storeStoreFence();
                this.f18677b.add(au3Var);
                this.f18678c = 2;
                try {
                    this.f18676a.execute(this.f18680e);
                    if (this.f18678c != 2) {
                        return;
                    }
                    synchronized (this.f18677b) {
                        try {
                            if (this.f18679d == j && this.f18678c == 2) {
                                this.f18678c = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f18677b) {
                        try {
                            int i2 = this.f18678c;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.f18677b.removeLastOccurrence(au3Var)) {
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
            this.f18677b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f18676a + "}";
    }
}
