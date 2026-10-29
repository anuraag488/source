package org.chromium.net;

import android.net.wifi.WifiManager;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AndroidNetworkLibrary$$ExternalSyntheticLambda0 implements Runnable {
    public /* synthetic */ WifiManager f$0;
    public /* synthetic */ boolean f$1;

    public /* synthetic */ AndroidNetworkLibrary$$ExternalSyntheticLambda0(WifiManager wifiManager, boolean z) {
        this.f$0 = wifiManager;
        this.f$1 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.setWifiEnabled(this.f$1);
    }
}
