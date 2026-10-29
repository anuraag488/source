package p000;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o62 extends AbstractOwnableSynchronizer implements Runnable {

    /* JADX INFO: renamed from: a */
    public final q62 f26371a;

    public o62(q62 q62Var) {
        this.f26371a = q62Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m8968a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.f26371a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
