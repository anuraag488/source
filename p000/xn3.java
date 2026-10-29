package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xn3 implements np4 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ zn3 f34461a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ li4 f34462b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f34463c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ C0809js f34464d;

    @Override // p000.np4
    /* JADX INFO: renamed from: c */
    public final void mo4671c(Exception exc) throws Throwable {
        zn3 zn3Var = this.f34461a;
        li4 li4Var = this.f34462b;
        boolean z = this.f34463c;
        C0809js c0809js = this.f34464d;
        if (exc != null) {
            li4Var.m7989b(exc);
            return;
        }
        if (z) {
            boolean z2 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 18);
            runnableC1285w9.f33164b = zn3Var;
            runnableC1285w9.f33165c = countDownLatch;
            VarHandle.storeStoreFence();
            new Thread(runnableC1285w9).start();
            ExecutorService executorService = cw4.f16539a;
            boolean z3 = false;
            try {
                long jNanoTime = 2000000000;
                long jNanoTime2 = System.nanoTime() + 2000000000;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(jNanoTime, TimeUnit.NANOSECONDS);
                            break;
                        } catch (InterruptedException unused) {
                            jNanoTime = jNanoTime2 - System.nanoTime();
                            z3 = true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (z2) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z3) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th2) {
                th = th2;
                z2 = z3;
            }
        }
        li4Var.m7990c(c0809js);
    }
}
