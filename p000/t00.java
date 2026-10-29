package p000;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t00 extends AbstractC1165t0 {

    /* JADX INFO: renamed from: e */
    public Thread f30703e;

    @Override // p000.e92
    /* JADX INFO: renamed from: p */
    public final void mo5002p(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f30703e;
        if (z62.m13387o(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
