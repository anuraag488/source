package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: fc */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0646fc implements Executor {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1140sc f18898a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f18898a.postOnAnimation(runnable);
    }
}
