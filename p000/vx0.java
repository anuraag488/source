package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32901a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ xx0 f32902b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Runnable f32903c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ ar3 f32904d;

    public /* synthetic */ vx0(byte b) {
        this.f32901a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32901a) {
            case 0:
                xx0 xx0Var = this.f32902b;
                Runnable runnable = this.f32903c;
                ar3 ar3Var = this.f32904d;
                ExecutorService executorService = xx0Var.f34689a;
                tx0 tx0Var = new tx0((byte) 0);
                tx0Var.f31504b = runnable;
                tx0Var.f31505c = ar3Var;
                VarHandle.storeStoreFence();
                executorService.execute(tx0Var);
                break;
            case 1:
                xx0 xx0Var2 = this.f32902b;
                Runnable runnable2 = this.f32903c;
                ar3 ar3Var2 = this.f32904d;
                ExecutorService executorService2 = xx0Var2.f34689a;
                tx0 tx0Var2 = new tx0((byte) 2);
                tx0Var2.f31504b = runnable2;
                tx0Var2.f31505c = ar3Var2;
                VarHandle.storeStoreFence();
                executorService2.execute(tx0Var2);
                break;
            default:
                xx0 xx0Var3 = this.f32902b;
                Runnable runnable3 = this.f32903c;
                ar3 ar3Var3 = this.f32904d;
                ExecutorService executorService3 = xx0Var3.f34689a;
                tx0 tx0Var3 = new tx0((byte) 1);
                tx0Var3.f31504b = runnable3;
                tx0Var3.f31505c = ar3Var3;
                VarHandle.storeStoreFence();
                executorService3.execute(tx0Var3);
                break;
        }
    }
}
