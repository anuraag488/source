package org.chromium.net;

/* JADX INFO: renamed from: org.chromium.net.k */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1006k implements Runnable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f27042a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C1007l f27043b;

    @Override // java.lang.Runnable
    public final void run() {
        this.f27043b.f27045b.mObserver.onConnectionTypeChanged(this.f27042a);
    }
}
