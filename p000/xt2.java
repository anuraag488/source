package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xt2 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f34615a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Executor f34616b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f34617c;

    public /* synthetic */ xt2(byte b) {
        this.f34615a = b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f34615a) {
            case 0:
                try {
                    this.f34616b.execute(runnable);
                } catch (RejectedExecutionException e) {
                    ((ik1) this.f34617c).m6987n(e);
                }
                break;
            default:
                try {
                    this.f34616b.execute(runnable);
                } catch (RejectedExecutionException e2) {
                    ((u06) this.f34617c).mo11198a(e2);
                    return;
                }
                break;
        }
    }
}
