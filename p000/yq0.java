package p000;

import java.lang.invoke.VarHandle;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yq0 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35457a;

    /* JADX INFO: renamed from: b */
    public Object f35458b;

    /* JADX INFO: renamed from: c */
    public Object f35459c;

    /* JADX INFO: renamed from: d */
    public Object f35460d;

    public yq0(ExecutorService executorService) {
        this.f35457a = (byte) 0;
        this.f35459c = new Object();
        this.f35460d = y62.m12936B(null);
        this.f35458b = executorService;
    }

    /* JADX INFO: renamed from: a */
    public nr6 m13214a(Runnable runnable) {
        nr6 nr6VarM8822f;
        synchronized (this.f35459c) {
            nr6 nr6Var = (nr6) this.f35460d;
            ExecutorService executorService = (ExecutorService) this.f35458b;
            C1040pn c1040pn = new C1040pn((byte) 9);
            c1040pn.f27754b = runnable;
            VarHandle.storeStoreFence();
            nr6VarM8822f = nr6Var.m8822f(executorService, c1040pn);
            this.f35460d = nr6VarM8822f;
        }
        return nr6VarM8822f;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f35457a) {
            case 0:
                ((ExecutorService) this.f35458b).execute(runnable);
                break;
            default:
                if (Thread.currentThread() != ((WeakReference) this.f35460d).get()) {
                    ((ThreadPoolExecutor) this.f35459c).execute(runnable);
                } else {
                    runnable.run();
                }
                break;
        }
    }
}
