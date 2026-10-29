package org.chromium.net;

/* JADX INFO: renamed from: org.chromium.net.e */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1000e implements NetworkChangeNotifierAutoDetect.Observer {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ NetworkChangeNotifier f27004a;

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
    public final void onConnectionCostChanged(int i) {
        this.f27004a.notifyObserversOfConnectionCostChange(i);
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
    public final void onConnectionSubtypeChanged(int i) {
        this.f27004a.notifyObserversOfConnectionSubtypeChange(i);
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
    public final void onConnectionTypeChanged(int i) {
        this.f27004a.updateCurrentConnectionType(i);
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
    public final void onNetworkConnect(long j, int i) {
        this.f27004a.notifyObserversOfNetworkConnect(j, i);
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
    public final void onNetworkDisconnect(long j) {
        this.f27004a.notifyObserversOfNetworkDisconnect(j);
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
    public final void onNetworkSoonToDisconnect(long j) {
        this.f27004a.notifyObserversOfNetworkSoonToDisconnect(j);
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
    public final void purgeActiveNetworkList(long[] jArr) {
        this.f27004a.notifyObserversToPurgeActiveNetworkList(jArr);
    }
}
