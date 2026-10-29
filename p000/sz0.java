package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sz0 implements Executor {

    /* JADX INFO: renamed from: b */
    public static final sz0 f30678b = new sz0(0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ sz0 f30679c = new sz0(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f30680a;

    public /* synthetic */ sz0(byte b) {
        this.f30680a = b;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f30680a) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
