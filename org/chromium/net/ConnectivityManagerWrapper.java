package org.chromium.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC0581dn;
import p000.AbstractC1356y5;
import p000.ej6;
import p000.f51;
import p000.qm5;
import p000.vr6;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ConnectivityManagerWrapper {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ConnectivityManagerW";
    private static final AtomicBoolean sDeriveConnectionTypeFromCapabilities = new AtomicBoolean(true);
    private final ConnectivityManager mConnectivityManager;

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    public static class NetworkState {
        private final boolean mConnected;
        private final boolean mIsMetered;
        private final boolean mIsPrivateDnsActive;
        private final String mNetworkIdentifier;
        private final String mPrivateDnsServerName;
        private final int mSubtype;
        private final int mType;

        public NetworkState(boolean z, int i, int i2, boolean z2, String str, boolean z3, String str2) {
            this.mConnected = z;
            this.mType = i;
            this.mSubtype = i2;
            this.mIsMetered = z2;
            this.mNetworkIdentifier = str == null ? "" : str;
            this.mIsPrivateDnsActive = z3;
            this.mPrivateDnsServerName = str2 == null ? "" : str2;
        }

        public int getConnectionCost() {
            return isMetered() ? 2 : 1;
        }

        public int getConnectionSubtype() {
            if (!isConnected()) {
                return 1;
            }
            int networkType = getNetworkType();
            if (networkType != 0 && networkType != 4 && networkType != 5) {
                return 0;
            }
            switch (getNetworkSubType()) {
                case 1:
                    return 7;
                case 2:
                    return 8;
                case 3:
                    return 9;
                case 4:
                    return 5;
                case 5:
                    return 10;
                case 6:
                    return 11;
                case 7:
                    return 6;
                case 8:
                    return 14;
                case 9:
                    return 15;
                case 10:
                    return 12;
                case 11:
                    return 4;
                case 12:
                    return 13;
                case 13:
                    return 18;
                case 14:
                    return 16;
                case 15:
                    return 17;
                default:
                    return 0;
            }
        }

        public int getConnectionType() {
            if (isConnected()) {
                return ConnectivityManagerWrapper.convertToConnectionType(getNetworkType(), getNetworkSubType());
            }
            return 6;
        }

        public String getNetworkIdentifier() {
            return this.mNetworkIdentifier;
        }

        public int getNetworkSubType() {
            return this.mSubtype;
        }

        public int getNetworkType() {
            return this.mType;
        }

        public String getPrivateDnsServerName() {
            return this.mPrivateDnsServerName;
        }

        public boolean isConnected() {
            return this.mConnected;
        }

        public boolean isMetered() {
            return this.mIsMetered;
        }

        public boolean isPrivateDnsActive() {
            return this.mIsPrivateDnsActive;
        }
    }

    public ConnectivityManagerWrapper(Context context) {
        this.mConnectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static int cellularSubtypeFromKbps(int i) {
        if (i <= 0) {
            return 13;
        }
        if (i < 100) {
            return 1;
        }
        if (i < 20000) {
            return 3;
        }
        return i < 40000 ? 13 : 20;
    }

    public static int connectivityTypeFromCapabilities(ej6 ej6Var) {
        if (ej6Var.m5137a(1) || ej6Var.m5137a(5)) {
            return 1;
        }
        if (ej6Var.m5137a(0)) {
            return 0;
        }
        if (ej6Var.m5137a(3)) {
            return 9;
        }
        if (ej6Var.m5137a(2)) {
            return 7;
        }
        return ej6Var.m5137a(4) ? 17 : -1;
    }

    public static int convertToConnectionType(int i, int i2) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i != 4 && i != 5) {
                if (i == 6) {
                    return 5;
                }
                if (i != 7) {
                    return i != 9 ? 0 : 1;
                }
                return 7;
            }
        }
        if (i2 == 20) {
            return 8;
        }
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 3;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 4;
            case 13:
                return 5;
            default:
                return 0;
        }
    }

    public static int getConnectionTypeFromCapabilities(ej6 ej6Var) {
        int iConnectivityTypeFromCapabilities = connectivityTypeFromCapabilities(ej6Var);
        int iCellularSubtypeFromKbps = 0;
        if (iConnectivityTypeFromCapabilities == 0) {
            NetworkCapabilities networkCapabilities = ej6Var.f18144a;
            if (networkCapabilities == null) {
                qm5.m9919j("getLinkDownstreamBandwidthKbps is unavailable without wrapped NetworkCapabilities");
                return 0;
            }
            iConnectivityTypeFromCapabilities = 0;
            iCellularSubtypeFromKbps = cellularSubtypeFromKbps(networkCapabilities.getLinkDownstreamBandwidthKbps());
        }
        return convertToConnectionType(iConnectivityTypeFromCapabilities, iCellularSubtypeFromKbps);
    }

    public static boolean getDeriveConnectionTypeFromCapabilities() {
        return sDeriveConnectionTypeFromCapabilities.get();
    }

    private NetworkState getNetworkStateFromCapabilities(Network network) {
        ej6 networkCapabilities;
        int i;
        int iCellularSubtypeFromKbps;
        if (network == null || (networkCapabilities = getNetworkCapabilities(network)) == null) {
            return null;
        }
        NetworkCapabilities networkCapabilities2 = networkCapabilities.f18144a;
        int iConnectivityTypeFromCapabilities = connectivityTypeFromCapabilities(networkCapabilities);
        if (iConnectivityTypeFromCapabilities != 0) {
            i = iConnectivityTypeFromCapabilities;
            iCellularSubtypeFromKbps = 0;
        } else {
            if (networkCapabilities2 == null) {
                qm5.m9919j("getLinkDownstreamBandwidthKbps is unavailable without wrapped NetworkCapabilities");
                return null;
            }
            iCellularSubtypeFromKbps = cellularSubtypeFromKbps(networkCapabilities2.getLinkDownstreamBandwidthKbps());
            i = 0;
        }
        boolean z = !(networkCapabilities2 != null ? networkCapabilities2.hasCapability(11) : true);
        DnsStatus dnsStatusM12906O = AbstractC1356y5.m12906O(network);
        return new NetworkState(networkCapabilities2 != null ? networkCapabilities2.hasCapability(12) : true, i, iCellularSubtypeFromKbps, z, String.valueOf(networkToNetId(network)), dnsStatusM12906O != null && dnsStatusM12906O.getPrivateDnsActive(), dnsStatusM12906O == null ? "" : dnsStatusM12906O.getPrivateDnsServerName());
    }

    public static long networkToNetId(Network network) {
        return network.getNetworkHandle();
    }

    private NetworkInfo processActiveNetworkInfo(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            if (networkInfo.isConnected()) {
                return networkInfo;
            }
            if (networkInfo.getDetailedState() == NetworkInfo.DetailedState.BLOCKED) {
                synchronized (AbstractC0581dn.f17200a) {
                }
                return null;
            }
        }
        return null;
    }

    public static void setDeriveConnectionTypeFromCapabilities(boolean z) {
        sDeriveConnectionTypeFromCapabilities.set(z);
    }

    public static void setDeriveConnectionTypeFromCapabilitiesForTesting(boolean z) {
        sDeriveConnectionTypeFromCapabilities.set(z);
    }

    public Network[] getAllNetworks(Network network) {
        return NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(this, network);
    }

    public Network[] getAllNetworksUnfiltered() {
        Network[] allNetworks = this.mConnectivityManager.getAllNetworks();
        return allNetworks == null ? new Network[0] : allNetworks;
    }

    public int getConnectionType(Network network) {
        NetworkInfo networkInfo = getNetworkInfo(network);
        if (networkInfo == null || !networkInfo.isConnected()) {
            return 6;
        }
        return convertToConnectionType(networkInfo.getType(), networkInfo.getSubtype());
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    public Network getDefaultNetwork() {
        Network activeNetwork = this.mConnectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            NetworkInfo activeNetworkInfo = this.mConnectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            for (Network network : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(this, null)) {
                NetworkInfo rawNetworkInfo = getRawNetworkInfo(network);
                if (rawNetworkInfo != null && (rawNetworkInfo.getType() == activeNetworkInfo.getType() || rawNetworkInfo.getType() == 17)) {
                    if (activeNetwork != null) {
                        NetworkInfo.DetailedState detailedState = rawNetworkInfo.getDetailedState();
                        NetworkInfo.DetailedState detailedState2 = NetworkInfo.DetailedState.CONNECTING;
                        if (detailedState != detailedState2) {
                            NetworkInfo rawNetworkInfo2 = getRawNetworkInfo(activeNetwork);
                            if (rawNetworkInfo2 != null && rawNetworkInfo2.getDetailedState() == detailedState2) {
                                activeNetwork = null;
                            }
                            if (activeNetwork != null) {
                                Log.e("cn_ConnectivityManagerW", "There should not be multiple connected networks of the same type. At least as of Android Marshmallow this is not supported. If this becomes supported this assertion may trigger.");
                            }
                            activeNetwork = network;
                        }
                    } else {
                        if (activeNetwork != null) {
                            Log.e("cn_ConnectivityManagerW", "There should not be multiple connected networks of the same type. At least as of Android Marshmallow this is not supported. If this becomes supported this assertion may trigger.");
                        }
                        activeNetwork = network;
                    }
                }
            }
        }
        return activeNetwork;
    }

    public ej6 getNetworkCapabilities(Network network) {
        for (int i = 0; i < 2; i++) {
            try {
                return new ej6(this.mConnectivityManager.getNetworkCapabilities(network));
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    public NetworkInfo getNetworkInfo(Network network) {
        NetworkInfo rawNetworkInfo = getRawNetworkInfo(network);
        return (rawNetworkInfo == null || rawNetworkInfo.getType() != 17) ? rawNetworkInfo : this.mConnectivityManager.getActiveNetworkInfo();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    public NetworkState getNetworkState(vr6 vr6Var) {
        NetworkInfo networkInfo;
        boolean z;
        Network defaultNetwork = getDefaultNetwork();
        if (getDeriveConnectionTypeFromCapabilities()) {
            NetworkState networkStateFromCapabilities = getNetworkStateFromCapabilities(defaultNetwork);
            if (networkStateFromCapabilities != null) {
                return networkStateFromCapabilities;
            }
            networkInfo = null;
        } else {
            networkInfo = getNetworkInfo(defaultNetwork);
        }
        NetworkInfo networkInfoProcessActiveNetworkInfo = processActiveNetworkInfo(networkInfo);
        if (networkInfoProcessActiveNetworkInfo == null) {
            return new NetworkState($assertionsDisabled, -1, -1, $assertionsDisabled, null, $assertionsDisabled, "");
        }
        if (defaultNetwork == null) {
            if (networkInfoProcessActiveNetworkInfo.getType() != 1) {
                return new NetworkState(true, networkInfoProcessActiveNetworkInfo.getType(), networkInfoProcessActiveNetworkInfo.getSubtype(), $assertionsDisabled, null, $assertionsDisabled, "");
            }
            if (networkInfoProcessActiveNetworkInfo.getExtraInfo() != null && !"".equals(networkInfoProcessActiveNetworkInfo.getExtraInfo())) {
                return new NetworkState(true, networkInfoProcessActiveNetworkInfo.getType(), networkInfoProcessActiveNetworkInfo.getSubtype(), $assertionsDisabled, networkInfoProcessActiveNetworkInfo.getExtraInfo(), $assertionsDisabled, "");
            }
            networkInfoProcessActiveNetworkInfo.getType();
            networkInfoProcessActiveNetworkInfo.getSubtype();
            throw null;
        }
        ej6 networkCapabilities = getNetworkCapabilities(defaultNetwork);
        if (networkCapabilities == null) {
            z = false;
        } else {
            NetworkCapabilities networkCapabilities2 = networkCapabilities.f18144a;
            if (networkCapabilities2 != null ? networkCapabilities2.hasCapability(11) : true) {
                z = false;
            } else {
                z = true;
            }
        }
        DnsStatus dnsStatusM12906O = AbstractC1356y5.m12906O(defaultNetwork);
        return dnsStatusM12906O == null ? new NetworkState(true, networkInfoProcessActiveNetworkInfo.getType(), networkInfoProcessActiveNetworkInfo.getSubtype(), z, String.valueOf(networkToNetId(defaultNetwork)), $assertionsDisabled, "") : new NetworkState(true, networkInfoProcessActiveNetworkInfo.getType(), networkInfoProcessActiveNetworkInfo.getSubtype(), z, String.valueOf(networkToNetId(defaultNetwork)), dnsStatusM12906O.getPrivateDnsActive(), dnsStatusM12906O.getPrivateDnsServerName());
    }

    public NetworkInfo getRawNetworkInfo(Network network) {
        try {
            try {
                return this.mConnectivityManager.getNetworkInfo(network);
            } catch (NullPointerException unused) {
                return this.mConnectivityManager.getNetworkInfo(network);
            }
        } catch (NullPointerException unused2) {
            return null;
        }
    }

    public void registerDefaultNetworkCallback(ConnectivityManager.NetworkCallback networkCallback, Handler handler) {
        this.mConnectivityManager.registerDefaultNetworkCallback(networkCallback, handler);
    }

    public void registerNetworkCallback(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback, Handler handler) {
        int i = f51.f18769a;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            this.mConnectivityManager.registerNetworkCallback(networkRequest, networkCallback, handler);
            if (threadPolicyAllowThreadDiskReads != null) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
            int i2 = f51.f18769a;
        } catch (Throwable th) {
            if (threadPolicyAllowThreadDiskReads != null) {
                try {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            int i3 = f51.f18769a;
            throw th;
        }
    }

    public void unregisterNetworkCallback(ConnectivityManager.NetworkCallback networkCallback) {
        this.mConnectivityManager.unregisterNetworkCallback(networkCallback);
    }

    public boolean vpnAccessible(Network network) {
        boolean z;
        Socket socket = new Socket();
        try {
            int i = f51.f18769a;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
            try {
                network.bindSocket(socket);
                if (vmPolicy != null) {
                    StrictMode.setVmPolicy(vmPolicy);
                }
                int i2 = f51.f18769a;
                z = true;
                try {
                    socket.close();
                } catch (IOException unused) {
                }
                return z;
            } catch (Throwable th) {
                if (vmPolicy != null) {
                    try {
                        StrictMode.setVmPolicy(vmPolicy);
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
                int i3 = f51.f18769a;
                throw th;
            }
        } catch (IOException unused2) {
            z = $assertionsDisabled;
        } catch (Throwable th3) {
            try {
                socket.close();
            } catch (IOException unused3) {
            }
            throw th3;
        }
    }

    public ConnectivityManagerWrapper() {
        this.mConnectivityManager = null;
    }
}
