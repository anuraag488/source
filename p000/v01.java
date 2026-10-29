package p000;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v01 implements w01 {

    /* JADX INFO: renamed from: a */
    public ScheduledFuture f32282a;

    @Override // p000.w01
    /* JADX INFO: renamed from: a */
    public final void mo3937a() {
        this.f32282a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f32282a + ']';
    }
}
