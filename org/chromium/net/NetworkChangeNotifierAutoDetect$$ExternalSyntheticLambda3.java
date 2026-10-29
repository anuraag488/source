package org.chromium.net;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda3 implements Runnable {
    public /* synthetic */ NetworkChangeNotifierAutoDetect f$0;
    public /* synthetic */ ConnectivityManagerWrapper f$1;

    public /* synthetic */ NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda3(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect, ConnectivityManagerWrapper connectivityManagerWrapper) {
        this.f$0 = networkChangeNotifierAutoDetect;
        this.f$1 = connectivityManagerWrapper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$setConnectivityManagerWrapperForTests$0(this.f$1);
    }
}
