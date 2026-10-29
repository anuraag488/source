package p000;

import java.lang.invoke.VarHandle;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zw0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f36422a;

    /* JADX INFO: renamed from: b */
    public Object f36423b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f36422a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.f36423b).getAndIncrement());
                return thread;
            case 1:
                ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
                vb1 vb1Var = new vb1((byte) 0);
                vb1Var.f32506b = runnable;
                VarHandle.storeStoreFence();
                Thread threadNewThread = threadFactoryDefaultThreadFactory.newThread(vb1Var);
                threadNewThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.f36423b).getAndIncrement());
                return threadNewThread;
            case 2:
                yq0 yq0Var = (yq0) this.f36423b;
                Thread thread2 = new Thread(runnable, c75.m3877i(((AtomicInteger) yq0Var.f35458b).getAndIncrement(), "Google consent worker #"));
                yq0Var.f35460d = new WeakReference(thread2);
                return thread2;
            default:
                Thread threadNewThread2 = ((ThreadFactory) this.f36423b).newThread(runnable);
                threadNewThread2.setName("ScionFrontendApi");
                return threadNewThread2;
        }
    }
}
