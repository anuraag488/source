package org.chromium.net;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import p000.ej6;
import p000.qm5;

/* JADX INFO: renamed from: org.chromium.net.f */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1001f extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public LinkProperties f27005a;

    /* JADX INFO: renamed from: b */
    public ej6 f27006b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ NetworkChangeNotifierAutoDetect f27007c;

    public /* synthetic */ C1001f(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.f27007c = networkChangeNotifierAutoDetect;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX INFO: renamed from: a */
    public final ConnectivityManagerWrapper.NetworkState m9248a(Network network) {
        int i;
        int i2;
        NetworkCapabilities networkCapabilities;
        boolean zHasCapability;
        NetworkInfo networkInfo;
        int i3;
        int subtype = -1;
        if (!this.f27006b.m5137a(1) && !this.f27006b.m5137a(5)) {
            int type = 0;
            boolean zM5137a = this.f27006b.m5137a(0);
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f27007c;
            if (!zM5137a) {
                if (!this.f27006b.m5137a(3)) {
                    if (this.f27006b.m5137a(2)) {
                        i3 = 7;
                    } else if (this.f27006b.m5137a(4)) {
                        type = 17;
                        if (!ConnectivityManagerWrapper.getDeriveConnectionTypeFromCapabilities() && (networkInfo = networkChangeNotifierAutoDetect.mConnectivityManagerWrapper.getNetworkInfo(network)) != null) {
                            type = networkInfo.getType();
                        }
                    } else {
                        i = -1;
                        i2 = -1;
                    }
                    networkCapabilities = this.f27006b.f18144a;
                    if (networkCapabilities != null) {
                        zHasCapability = networkCapabilities.hasCapability(11);
                    } else {
                        zHasCapability = true;
                    }
                    return new ConnectivityManagerWrapper.NetworkState(true, i, i2, !zHasCapability, String.valueOf(ConnectivityManagerWrapper.networkToNetId(network)), this.f27005a.isPrivateDnsActive(), this.f27005a.getPrivateDnsServerName());
                }
                i3 = 9;
                i = i3;
            } else if (ConnectivityManagerWrapper.getDeriveConnectionTypeFromCapabilities()) {
                NetworkCapabilities networkCapabilities2 = this.f27006b.f18144a;
                if (networkCapabilities2 == null) {
                    qm5.m9919j("getLinkDownstreamBandwidthKbps is unavailable without wrapped NetworkCapabilities");
                    return null;
                }
                subtype = ConnectivityManagerWrapper.cellularSubtypeFromKbps(networkCapabilities2.getLinkDownstreamBandwidthKbps());
            } else {
                NetworkInfo rawNetworkInfo = networkChangeNotifierAutoDetect.mConnectivityManagerWrapper.getRawNetworkInfo(network);
                if (rawNetworkInfo != null) {
                    subtype = rawNetworkInfo.getSubtype();
                }
            }
            i2 = subtype;
            i = type;
            networkCapabilities = this.f27006b.f18144a;
            if (networkCapabilities != null) {
                zHasCapability = networkCapabilities.hasCapability(11);
            } else {
                zHasCapability = true;
            }
            return new ConnectivityManagerWrapper.NetworkState(true, i, i2, !zHasCapability, String.valueOf(ConnectivityManagerWrapper.networkToNetId(network)), this.f27005a.isPrivateDnsActive(), this.f27005a.getPrivateDnsServerName());
        }
        i = 1;
        i2 = -1;
        networkCapabilities = this.f27006b.f18144a;
        if (networkCapabilities != null) {
            zHasCapability = networkCapabilities.hasCapability(11);
        } else {
            zHasCapability = true;
        }
        return new ConnectivityManagerWrapper.NetworkState(true, i, i2, !zHasCapability, String.valueOf(ConnectivityManagerWrapper.networkToNetId(network)), this.f27005a.isPrivateDnsActive(), this.f27005a.getPrivateDnsServerName());
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f27005a = null;
        this.f27006b = null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        this.f27006b = new ej6(networkCapabilities);
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f27007c;
        if (!networkChangeNotifierAutoDetect.mRegistered || this.f27005a == null || this.f27006b == null) {
            return;
        }
        networkChangeNotifierAutoDetect.connectionTypeChangedTo(m9248a(network));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        this.f27005a = linkProperties;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f27007c;
        if (!networkChangeNotifierAutoDetect.mRegistered || this.f27005a == null || this.f27006b == null) {
            return;
        }
        networkChangeNotifierAutoDetect.connectionTypeChangedTo(m9248a(network));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f27005a = null;
        this.f27006b = null;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f27007c;
        if (networkChangeNotifierAutoDetect.mRegistered) {
            networkChangeNotifierAutoDetect.connectionTypeChangedTo(new ConnectivityManagerWrapper.NetworkState(false, -1, -1, false, null, false, ""));
        }
    }
}
