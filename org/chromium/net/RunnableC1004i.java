package org.chromium.net;

/* JADX INFO: renamed from: org.chromium.net.i */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1004i implements Runnable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ long f27015a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C1007l f27016b;

    @Override // java.lang.Runnable
    public final void run() {
        this.f27016b.f27045b.mObserver.onNetworkSoonToDisconnect(this.f27015a);
    }
}
