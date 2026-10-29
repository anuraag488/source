package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class qj0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f28519a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long f28520b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ rj0 f28521c;

    @Override // java.lang.Runnable
    public final void run() {
        rj0 rj0Var = this.f28521c;
        int i = this.f28519a;
        long j = this.f28520b;
        synchronized (rj0Var) {
            int i2 = i - 1;
            nr6 nr6VarM12348c = rj0Var.f29342c.m12348c(3 - i2);
            nr6 nr6VarM11571b = rj0Var.f29343d.m11571b();
            nr6 nr6VarM12978k0 = y62.m12978k0(nr6VarM12348c, nr6VarM11571b);
            ScheduledExecutorService scheduledExecutorService = rj0Var.f29345f;
            pj0 pj0Var = new pj0();
            pj0Var.f27648a = rj0Var;
            pj0Var.f27649b = nr6VarM12348c;
            pj0Var.f27650c = nr6VarM11571b;
            pj0Var.f27651d = j;
            pj0Var.f27652e = i2;
            VarHandle.storeStoreFence();
            nr6VarM12978k0.m8822f(scheduledExecutorService, pj0Var);
        }
    }
}
