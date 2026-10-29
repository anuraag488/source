package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xv4 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ String f34646a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f34647b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f34646a;
        boolean z = this.f34647b;
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }
}
