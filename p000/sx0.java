package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sx0 implements yx0, cg4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f30623a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f30624b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ long f30625c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f30626d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f30627e;

    public /* synthetic */ sx0(byte b) {
        this.f30623a = b;
    }

    @Override // p000.yx0
    /* JADX INFO: renamed from: a */
    public ScheduledFuture mo10942a(ar3 ar3Var) {
        switch (this.f30623a) {
            case 0:
                xx0 xx0Var = (xx0) this.f30624b;
                Runnable runnable = (Runnable) this.f30627e;
                long j = this.f30625c;
                TimeUnit timeUnit = (TimeUnit) this.f30626d;
                ScheduledExecutorService scheduledExecutorService = xx0Var.f34690b;
                vx0 vx0Var = new vx0((byte) 1);
                vx0Var.f32902b = xx0Var;
                vx0Var.f32903c = runnable;
                vx0Var.f32904d = ar3Var;
                VarHandle.storeStoreFence();
                return scheduledExecutorService.schedule(vx0Var, j, timeUnit);
            default:
                xx0 xx0Var2 = (xx0) this.f30624b;
                Callable callable = (Callable) this.f30627e;
                long j2 = this.f30625c;
                TimeUnit timeUnit2 = (TimeUnit) this.f30626d;
                ScheduledExecutorService scheduledExecutorService2 = xx0Var2.f34690b;
                wx0 wx0Var = new wx0((byte) 0);
                wx0Var.f33818b = xx0Var2;
                wx0Var.f33819c = callable;
                wx0Var.f33820d = ar3Var;
                VarHandle.storeStoreFence();
                return scheduledExecutorService2.schedule(wx0Var, j2, timeUnit2);
        }
    }

    @Override // p000.cg4
    /* JADX INFO: renamed from: d */
    public Object mo4024d() {
        wo5 wo5Var = (wo5) this.f30624b;
        Iterable iterable = (Iterable) this.f30627e;
        C0588dv c0588dv = (C0588dv) this.f30626d;
        long j = this.f30625c;
        pt3 pt3Var = (pt3) wo5Var.f33568c;
        pt3Var.getClass();
        if (iterable.iterator().hasNext()) {
            String strConcat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(pt3.m9669l(iterable));
            C1163sz c1163sz = new C1163sz((byte) 13);
            c1163sz.f30676b = pt3Var;
            c1163sz.f30677c = strConcat;
            VarHandle.storeStoreFence();
            pt3Var.m9672e(c1163sz);
        }
        long jMo5609j = ((ja0) wo5Var.f33572g).mo5609j() + j;
        lt3 lt3Var = new lt3((byte) 1);
        lt3Var.f24355b = jMo5609j;
        lt3Var.f24356c = c0588dv;
        VarHandle.storeStoreFence();
        pt3Var.m9672e(lt3Var);
        return null;
    }
}
