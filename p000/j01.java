package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j01 implements Executor {

    /* JADX INFO: renamed from: a */
    public so0 f21923a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        so0 so0Var = this.f21923a;
        r71 r71Var = r71.f29063a;
        if (g01.m5869c(so0Var, r71Var)) {
            g01.m5868b(so0Var, r71Var, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f21923a.toString();
    }
}
