package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class po4 implements Executor {

    /* JADX INFO: renamed from: a */
    public Executor f27864a;

    /* JADX INFO: renamed from: b */
    public ArrayDeque f27865b;

    /* JADX INFO: renamed from: c */
    public Runnable f27866c;

    /* JADX INFO: renamed from: d */
    public Object f27867d;

    /* JADX INFO: renamed from: a */
    public final void m9596a() {
        synchronized (this.f27867d) {
            Object objPoll = this.f27865b.poll();
            Runnable runnable = (Runnable) objPoll;
            this.f27866c = runnable;
            if (objPoll != null) {
                this.f27864a.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f27867d) {
            ArrayDeque arrayDeque = this.f27865b;
            RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 20);
            runnableC1285w9.f33164b = runnable;
            runnableC1285w9.f33165c = this;
            VarHandle.storeStoreFence();
            arrayDeque.offer(runnableC1285w9);
            if (this.f27866c == null) {
                m9596a();
            }
        }
    }
}
