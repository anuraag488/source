package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k82 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f22980a;

    /* JADX INFO: renamed from: b */
    public AtomicInteger f22981b;

    /* JADX INFO: renamed from: c */
    public Object f22982c;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f22980a) {
            case 0:
                return new Thread(runnable, "JavaScriptSandbox Thread #" + this.f22981b.getAndIncrement());
            default:
                AtomicInteger atomicInteger = this.f22981b;
                Thread threadNewThread = ((ThreadFactory) this.f22982c).newThread(runnable);
                threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
                return threadNewThread;
        }
    }
}
