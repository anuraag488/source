package org.chromium.net;

import android.net.ConnectivityManager;
import internal.p002J.AbstractC0768N;
import p000.x06;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class NetworkActiveNotifier implements ConnectivityManager.OnNetworkActiveListener {
    private boolean mAreNotificationsEnabled;
    private final ConnectivityManager mConnectivityManager = (ConnectivityManager) x06.f33904a.getSystemService("connectivity");
    private final long mNativeNetworkActiveObserver;

    private NetworkActiveNotifier(long j) {
        this.mNativeNetworkActiveObserver = j;
    }

    public static NetworkActiveNotifier build(long j) {
        return new NetworkActiveNotifier(j);
    }

    public void disableNotifications() {
        this.mAreNotificationsEnabled = false;
        this.mConnectivityManager.removeDefaultNetworkActiveListener(this);
    }

    public void enableNotifications() {
        this.mAreNotificationsEnabled = true;
        this.mConnectivityManager.addDefaultNetworkActiveListener(this);
    }

    public void fakeDefaultNetworkActive() {
        if (this.mAreNotificationsEnabled) {
            onNetworkActive();
        }
    }

    public boolean isDefaultNetworkActive() {
        return this.mConnectivityManager.isDefaultNetworkActive();
    }

    @Override // android.net.ConnectivityManager.OnNetworkActiveListener
    public void onNetworkActive() {
        AbstractC0768N.MSZPA7qE(this.mNativeNetworkActiveObserver);
    }
}
