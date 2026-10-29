package org.chromium.net;

import android.net.Network;

/* JADX INFO: renamed from: org.chromium.net.j */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1005j implements Runnable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Network f27040a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C1007l f27041b;

    @Override // java.lang.Runnable
    public final void run() {
        this.f27041b.f27045b.mObserver.onNetworkDisconnect(ConnectivityManagerWrapper.networkToNetId(this.f27040a));
    }
}
