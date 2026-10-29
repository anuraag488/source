package p000;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w60 implements x60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33118a;

    /* JADX INFO: renamed from: b */
    public Object f33119b;

    public /* synthetic */ w60(byte b) {
        this.f33118a = b;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: b */
    public final void mo5874b(Throwable th) {
        switch (this.f33118a) {
            case 0:
                ((ScheduledFuture) this.f33119b).cancel(false);
                break;
            case 1:
                ((yp1) this.f33119b).invoke(th);
                break;
            default:
                ((w01) this.f33119b).mo3937a();
                break;
        }
    }

    public final String toString() {
        switch (this.f33118a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f33119b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((yp1) this.f33119b).getClass().getSimpleName() + '@' + ev0.m5354d0(this) + ']';
            default:
                return "DisposeOnCancel[" + ((w01) this.f33119b) + ']';
        }
    }
}
