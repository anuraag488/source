package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: nn */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC0952nn implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25953a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f25953a) {
            case 0:
                C0989on.m9190f0().f26895r.f14925s.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
