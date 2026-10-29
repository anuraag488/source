package org.chromium.net;

/* JADX INFO: renamed from: org.chromium.net.h */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1003h implements Runnable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ long f27012a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f27013b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ C1007l f27014c;

    @Override // java.lang.Runnable
    public final void run() {
        this.f27014c.f27045b.mObserver.onNetworkConnect(this.f27012a, this.f27013b);
    }
}
