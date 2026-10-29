package p000;

import java.lang.invoke.VarHandle;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zx0 extends AbstractC0857l2 implements ScheduledFuture {

    /* JADX INFO: renamed from: h */
    public final ScheduledFuture f36439h;

    public zx0(yx0 yx0Var) {
        ar3 ar3Var = new ar3((byte) 21);
        ar3Var.f14813b = this;
        VarHandle.storeStoreFence();
        this.f36439h = yx0Var.mo10942a(ar3Var);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f36439h.compareTo(delayed);
    }

    @Override // p000.AbstractC0857l2
    /* JADX INFO: renamed from: d */
    public final void mo7817d() {
        ScheduledFuture scheduledFuture = this.f36439h;
        Object obj = this.f23717a;
        scheduledFuture.cancel((obj instanceof C0635f2) && ((C0635f2) obj).f18668a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f36439h.getDelay(timeUnit);
    }
}
