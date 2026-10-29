package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ux0 implements yx0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32219a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ xx0 f32220b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Runnable f32221c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ long f32222d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ long f32223e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ TimeUnit f32224f;

    public /* synthetic */ ux0(byte b) {
        this.f32219a = b;
    }

    @Override // p000.yx0
    /* JADX INFO: renamed from: a */
    public final ScheduledFuture mo10942a(ar3 ar3Var) {
        switch (this.f32219a) {
            case 0:
                xx0 xx0Var = this.f32220b;
                Runnable runnable = this.f32221c;
                long j = this.f32222d;
                long j2 = this.f32223e;
                TimeUnit timeUnit = this.f32224f;
                ScheduledExecutorService scheduledExecutorService = xx0Var.f34690b;
                vx0 vx0Var = new vx0((byte) 0);
                vx0Var.f32902b = xx0Var;
                vx0Var.f32903c = runnable;
                vx0Var.f32904d = ar3Var;
                VarHandle.storeStoreFence();
                return scheduledExecutorService.scheduleAtFixedRate(vx0Var, j, j2, timeUnit);
            default:
                xx0 xx0Var2 = this.f32220b;
                Runnable runnable2 = this.f32221c;
                long j3 = this.f32222d;
                long j4 = this.f32223e;
                TimeUnit timeUnit2 = this.f32224f;
                ScheduledExecutorService scheduledExecutorService2 = xx0Var2.f34690b;
                vx0 vx0Var2 = new vx0((byte) 2);
                vx0Var2.f32902b = xx0Var2;
                vx0Var2.f32903c = runnable2;
                vx0Var2.f32904d = ar3Var;
                VarHandle.storeStoreFence();
                return scheduledExecutorService2.scheduleWithFixedDelay(vx0Var2, j3, j4, timeUnit2);
        }
    }
}
