package org.chromium.net;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.lang.invoke.VarHandle;
import p000.ej6;
import p000.f51;

/* JADX INFO: renamed from: org.chromium.net.l */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1007l extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public Network f27044a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ NetworkChangeNotifierAutoDetect f27045b;

    public /* synthetic */ C1007l(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.f27045b = networkChangeNotifierAutoDetect;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9252a(Network network, ej6 ej6Var) {
        Network network2 = this.f27044a;
        if ((network2 == null || network2.equals(network)) && ej6Var != null) {
            return ej6Var.m5137a(4) && !this.f27045b.mConnectivityManagerWrapper.vpnAccessible(network);
        }
        return true;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Network network2;
        int i = f51.f18769a;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f27045b;
        ej6 networkCapabilities = networkChangeNotifierAutoDetect.mConnectivityManagerWrapper.getNetworkCapabilities(network);
        if (m9252a(network, networkCapabilities)) {
            return;
        }
        boolean z = false;
        if (networkCapabilities.m5137a(4) && ((network2 = this.f27044a) == null || !network.equals(network2))) {
            z = true;
        }
        if (z) {
            this.f27044a = network;
        }
        long jNetworkToNetId = ConnectivityManagerWrapper.networkToNetId(network);
        int connectionTypeFromCapabilities = ConnectivityManagerWrapper.getDeriveConnectionTypeFromCapabilities() ? ConnectivityManagerWrapper.getConnectionTypeFromCapabilities(networkCapabilities) : networkChangeNotifierAutoDetect.mConnectivityManagerWrapper.getConnectionType(network);
        RunnableC1002g runnableC1002g = new RunnableC1002g();
        runnableC1002g.f27008a = jNetworkToNetId;
        runnableC1002g.f27009b = connectionTypeFromCapabilities;
        runnableC1002g.f27010c = z;
        runnableC1002g.f27011d = this;
        VarHandle.storeStoreFence();
        networkChangeNotifierAutoDetect.runOnThread(runnableC1002g);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        int i = f51.f18769a;
        ej6 ej6Var = new ej6(networkCapabilities);
        if (m9252a(network, ej6Var)) {
            return;
        }
        long jNetworkToNetId = ConnectivityManagerWrapper.networkToNetId(network);
        boolean deriveConnectionTypeFromCapabilities = ConnectivityManagerWrapper.getDeriveConnectionTypeFromCapabilities();
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f27045b;
        int connectionTypeFromCapabilities = deriveConnectionTypeFromCapabilities ? ConnectivityManagerWrapper.getConnectionTypeFromCapabilities(ej6Var) : networkChangeNotifierAutoDetect.mConnectivityManagerWrapper.getConnectionType(network);
        RunnableC1003h runnableC1003h = new RunnableC1003h();
        runnableC1003h.f27012a = jNetworkToNetId;
        runnableC1003h.f27013b = connectionTypeFromCapabilities;
        runnableC1003h.f27014c = this;
        VarHandle.storeStoreFence();
        networkChangeNotifierAutoDetect.runOnThread(runnableC1003h);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i) {
        int i2 = f51.f18769a;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f27045b;
        if (m9252a(network, networkChangeNotifierAutoDetect.mConnectivityManagerWrapper.getNetworkCapabilities(network))) {
            return;
        }
        long jNetworkToNetId = ConnectivityManagerWrapper.networkToNetId(network);
        RunnableC1004i runnableC1004i = new RunnableC1004i();
        runnableC1004i.f27015a = jNetworkToNetId;
        runnableC1004i.f27016b = this;
        VarHandle.storeStoreFence();
        networkChangeNotifierAutoDetect.runOnThread(runnableC1004i);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        int i = f51.f18769a;
        Network network2 = this.f27044a;
        if (network2 == null || network2.equals(network)) {
            RunnableC1005j runnableC1005j = new RunnableC1005j();
            runnableC1005j.f27040a = network;
            runnableC1005j.f27041b = this;
            VarHandle.storeStoreFence();
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f27045b;
            networkChangeNotifierAutoDetect.runOnThread(runnableC1005j);
            if (this.f27044a != null) {
                this.f27044a = null;
                for (Network network3 : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(networkChangeNotifierAutoDetect.mConnectivityManagerWrapper, network)) {
                    onAvailable(network3);
                }
                networkChangeNotifierAutoDetect.updateCurrentNetworkState();
                int connectionType = networkChangeNotifierAutoDetect.getCurrentNetworkState().getConnectionType();
                RunnableC1006k runnableC1006k = new RunnableC1006k();
                runnableC1006k.f27042a = connectionType;
                runnableC1006k.f27043b = this;
                VarHandle.storeStoreFence();
                networkChangeNotifierAutoDetect.runOnThread(runnableC1006k);
            }
        }
    }
}
