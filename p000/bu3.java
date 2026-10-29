package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.chromium.net.InlineExecutionProhibitedException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bu3 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15635a;

    /* JADX INFO: renamed from: b */
    public Object f15636b;

    public bu3(Executor executor) {
        this.f15635a = (byte) 3;
        this.f15636b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f15635a) {
            case 0:
                ExecutorService executorService = (ExecutorService) this.f15636b;
                au3 au3Var = new au3((byte) 0);
                au3Var.f14880b = runnable;
                VarHandle.storeStoreFence();
                executorService.execute(au3Var);
                return;
            case 1:
                ((j25) this.f15636b).f21975d.post(runnable);
                return;
            case 2:
                ((km5) this.f15636b).post(runnable);
                return;
            case 3:
                Thread threadCurrentThread = Thread.currentThread();
                yn3 yn3Var = new yn3((byte) 12);
                yn3Var.f35360b = runnable;
                yn3Var.f35361c = threadCurrentThread;
                VarHandle.storeStoreFence();
                ((Executor) this.f15636b).execute(yn3Var);
                InlineExecutionProhibitedException inlineExecutionProhibitedException = (InlineExecutionProhibitedException) yn3Var.f35362d;
                if (inlineExecutionProhibitedException != null) {
                    throw inlineExecutionProhibitedException;
                }
                yn3Var.f35361c = null;
                return;
            case 4:
                ea6 ea6Var = ((oa6) ((mg6) this.f15636b).f36084a).f26515g;
                oa6.m9016l(ea6Var);
                ea6Var.m5033D(runnable);
                return;
            default:
                ((km5) this.f15636b).post(runnable);
                return;
        }
    }

    public /* synthetic */ bu3(byte b) {
        this.f15635a = b;
    }
}
