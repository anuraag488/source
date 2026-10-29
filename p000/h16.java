package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h16 implements Executor {

    /* JADX INFO: renamed from: a */
    public cz5 f20268a;

    /* JADX INFO: renamed from: b */
    public RunnableC1029pc f20269b;

    /* JADX INFO: renamed from: c */
    public ArrayDeque f20270c;

    /* JADX INFO: renamed from: d */
    public boolean f20271d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ArrayDeque arrayDeque = this.f20270c;
        synchronized (arrayDeque) {
            arrayDeque.addLast(runnable);
            try {
                this.f20268a.execute(this.f20269b);
            } catch (RejectedExecutionException unused) {
                this.f20270c.removeLast();
            }
        }
    }
}
