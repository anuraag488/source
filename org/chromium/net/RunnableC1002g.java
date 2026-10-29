package org.chromium.net;

/* JADX INFO: renamed from: org.chromium.net.g */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1002g implements Runnable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ long f27008a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f27009b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f27010c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ C1007l f27011d;

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f27011d.f27045b;
        NetworkChangeNotifierAutoDetect.Observer observer = networkChangeNotifierAutoDetect.mObserver;
        long j = this.f27008a;
        int i = this.f27009b;
        observer.onNetworkConnect(j, i);
        if (this.f27010c) {
            networkChangeNotifierAutoDetect.mObserver.onConnectionTypeChanged(i);
            networkChangeNotifierAutoDetect.mObserver.purgeActiveNetworkList(new long[]{j});
        }
    }
}
