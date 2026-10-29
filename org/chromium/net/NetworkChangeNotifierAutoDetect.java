package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import p000.ej6;
import p000.fk6;
import p000.hv5;
import p000.ry5;
import p000.vr6;
import p000.x06;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "NetworkChangeNotifierAutoDetect";
    private ConnectivityManagerWrapper mConnectivityManagerWrapper;
    private ConnectivityManager.NetworkCallback mDefaultNetworkCallback;
    private boolean mDefaultNetworkCallbackRegistered;
    private final Handler mHandler;
    private boolean mIgnoreNextBroadcast;
    private final NetworkConnectivityIntentFilter mIntentFilter;
    private final Looper mLooper;
    private final C1007l mNetworkCallback;
    private boolean mNetworkCallbackRegistered;
    private final NetworkRequest mNetworkRequest;
    private ConnectivityManagerWrapper.NetworkState mNetworkState;
    private final Observer mObserver;
    private boolean mRegisterDefaultNetworkCallbackFailed;
    private boolean mRegisterNetworkCallbackFailed;
    private boolean mRegistered;
    private final RegistrationPolicy mRegistrationPolicy;
    private boolean mShouldSignalObserver;
    private vr6 mWifiManagerDelegate;

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    public static class NetworkConnectivityIntentFilter extends IntentFilter {
    }

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    public interface Observer {
        void onConnectionCostChanged(int i);

        void onConnectionSubtypeChanged(int i);

        void onConnectionTypeChanged(int i);

        void onNetworkConnect(long j, int i);

        void onNetworkDisconnect(long j);

        void onNetworkSoonToDisconnect(long j);

        void purgeActiveNetworkList(long[] jArr);
    }

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    @Retention(RetentionPolicy.SOURCE)
    public @interface RegisterResult {
        public static final int COUNT = 8;
        public static final int FAILURE_ILLEGAL_ARGUMENT = 6;
        public static final int FAILURE_OTHER_RUNTIME_EXCEPTION = 7;
        public static final int FAILURE_SECURITY_EXCEPTION = 4;
        public static final int FAILURE_TOO_MANY_REQUESTS = 5;
        public static final int SUCCESS_INITIAL = 0;
        public static final int SUCCESS_INITIAL_SECURITY_RETRY = 1;
        public static final int SUCCESS_SELF_HEAL = 2;
        public static final int SUCCESS_SELF_HEAL_SECURITY_RETRY = 3;
    }

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    @Retention(RetentionPolicy.SOURCE)
    public @interface RegistrationExceptionCategory {
        public static final int COUNT = 5;
        public static final int ILLEGAL_ARGUMENT_EXCEPTION = 2;
        public static final int ILLEGAL_STATE_EXCEPTION = 3;
        public static final int OTHER_RUNTIME_EXCEPTION = 4;
        public static final int SECURITY_EXCEPTION = 0;
        public static final int TOO_MANY_REQUESTS_EXCEPTION = 1;
    }

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    public static abstract class RegistrationPolicy {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private NetworkChangeNotifierAutoDetect mNotifier;

        public abstract void destroy();

        public void init(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
            this.mNotifier = networkChangeNotifierAutoDetect;
        }

        public final boolean isRegistrationFailed() {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mNotifier;
            if (networkChangeNotifierAutoDetect == null) {
                return NetworkChangeNotifierAutoDetect.$assertionsDisabled;
            }
            if (networkChangeNotifierAutoDetect.registerDefaultNetworkCallbackFailed() || this.mNotifier.registerNetworkCallbackFailed()) {
                return true;
            }
            return NetworkChangeNotifierAutoDetect.$assertionsDisabled;
        }

        public final void register() {
            this.mNotifier.register();
        }

        public final void unregister() {
            this.mNotifier.unregister();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    @Retention(RetentionPolicy.SOURCE)
    public @interface SelfHealResult {
        public static final int COUNT = 2;
        public static final int FAILED = 1;
        public static final int RECOVERED = 0;
    }

    public NetworkChangeNotifierAutoDetect(Observer observer, RegistrationPolicy registrationPolicy) {
        ry5.m10503a("NetworkChangeNotifierAutoDetect.constructor");
        try {
            Looper looperMyLooper = Looper.myLooper();
            this.mLooper = looperMyLooper;
            this.mHandler = new Handler(looperMyLooper);
            this.mObserver = observer;
            this.mConnectivityManagerWrapper = new ConnectivityManagerWrapper(x06.f33904a);
            this.mNetworkCallback = new C1007l(this);
            this.mNetworkRequest = new NetworkRequest.Builder().addCapability(12).removeCapability(15).build();
            this.mDefaultNetworkCallback = createDefaultNetworkCallback();
            updateCurrentNetworkState();
            NetworkConnectivityIntentFilter networkConnectivityIntentFilter = new NetworkConnectivityIntentFilter();
            networkConnectivityIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.mIntentFilter = networkConnectivityIntentFilter;
            this.mIgnoreNextBroadcast = $assertionsDisabled;
            this.mShouldSignalObserver = $assertionsDisabled;
            this.mRegistrationPolicy = registrationPolicy;
            registrationPolicy.init(this);
            this.mShouldSignalObserver = true;
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectionTypeChanged() {
        ry5.m10503a("NetworkChangeNotifierAutoDetect.connectionTypeChanged");
        try {
            connectionTypeChangedTo(this.mConnectivityManagerWrapper.getNetworkState(null));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectionTypeChangedTo(ConnectivityManagerWrapper.NetworkState networkState) {
        if (networkState.getConnectionType() != this.mNetworkState.getConnectionType() || !networkState.getNetworkIdentifier().equals(this.mNetworkState.getNetworkIdentifier()) || networkState.isPrivateDnsActive() != this.mNetworkState.isPrivateDnsActive() || !networkState.getPrivateDnsServerName().equals(this.mNetworkState.getPrivateDnsServerName())) {
            this.mObserver.onConnectionTypeChanged(networkState.getConnectionType());
        }
        if (networkState.getConnectionType() != this.mNetworkState.getConnectionType() || networkState.getConnectionSubtype() != this.mNetworkState.getConnectionSubtype()) {
            this.mObserver.onConnectionSubtypeChanged(networkState.getConnectionSubtype());
        }
        if (networkState.getConnectionCost() != this.mNetworkState.getConnectionCost()) {
            this.mObserver.onConnectionCostChanged(networkState.getConnectionCost());
        }
        this.mNetworkState = networkState;
    }

    private ConnectivityManager.NetworkCallback createDefaultNetworkCallback() {
        return new C1001f(this);
    }

    public static Network[] getAllNetworksFiltered(ConnectivityManagerWrapper connectivityManagerWrapper, Network network) {
        ej6 networkCapabilities;
        Network[] allNetworksUnfiltered = connectivityManagerWrapper.getAllNetworksUnfiltered();
        int i = 0;
        for (Network network2 : allNetworksUnfiltered) {
            if (!network2.equals(network) && (networkCapabilities = connectivityManagerWrapper.getNetworkCapabilities(network2)) != null) {
                NetworkCapabilities networkCapabilities2 = networkCapabilities.f18144a;
                if (!(networkCapabilities2 != null ? networkCapabilities2.hasCapability(12) : true)) {
                    continue;
                } else if (!networkCapabilities.m5137a(4)) {
                    allNetworksUnfiltered[i] = network2;
                    i++;
                } else if (connectivityManagerWrapper.vpnAccessible(network2)) {
                    return new Network[]{network2};
                }
            }
        }
        return (Network[]) Arrays.copyOf(allNetworksUnfiltered, i);
    }

    private static int getFailureResult(RuntimeException runtimeException) {
        if (runtimeException instanceof SecurityException) {
            return 4;
        }
        if (isTooManyRequestsException(runtimeException)) {
            return 5;
        }
        return runtimeException instanceof IllegalArgumentException ? 6 : 7;
    }

    private static int getSuccessResult(boolean z, int i) {
        if (z) {
            return i == 0 ? 2 : 3;
        }
        return i == 0 ? 0 : 1;
    }

    private static boolean isTooManyRequestsException(RuntimeException runtimeException) {
        if (runtimeException.getClass().getSimpleName().equals("TooManyRequestsException")) {
            return true;
        }
        String message = runtimeException.getMessage();
        if (message == null || !message.contains("used up all available NetworkRequests")) {
            return $assertionsDisabled;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runOnThread$0(Runnable runnable) {
        if (this.mRegistered) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setConnectivityManagerWrapperForTests$0(ConnectivityManagerWrapper connectivityManagerWrapper) {
        this.mConnectivityManagerWrapper = connectivityManagerWrapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$simulatePreAndroid28ForTesting$0(ConnectivityManager.NetworkCallback networkCallback) {
        this.mDefaultNetworkCallback = networkCallback;
    }

    private boolean onThread() {
        if (this.mLooper == Looper.myLooper()) {
            return true;
        }
        return $assertionsDisabled;
    }

    private void purgeActiveNetworkList() {
        if (this.mShouldSignalObserver) {
            Network[] allNetworksFiltered = getAllNetworksFiltered(this.mConnectivityManagerWrapper, null);
            long[] jArr = new long[allNetworksFiltered.length];
            for (int i = 0; i < allNetworksFiltered.length; i++) {
                jArr[i] = ConnectivityManagerWrapper.networkToNetId(allNetworksFiltered[i]);
            }
            this.mObserver.purgeActiveNetworkList(jArr);
        }
    }

    private static void recordRegistrationException(RuntimeException runtimeException) {
        int i;
        if (runtimeException instanceof SecurityException) {
            i = 0;
        } else if (isTooManyRequestsException(runtimeException)) {
            i = 1;
        } else if (runtimeException instanceof IllegalArgumentException) {
            i = 2;
        } else {
            i = runtimeException instanceof IllegalStateException ? 3 : 4;
        }
        hv5.m6511d(i, "Net.Android.NetworkChangeNotifier.RegistrationException", 5);
    }

    private static void recordRegistrationFailure(String str, RuntimeException runtimeException) {
        hv5.m6511d(getFailureResult(runtimeException), str, 8);
        recordRegistrationException(runtimeException);
    }

    private boolean registerDefaultNetworkCallback(boolean z) {
        if (this.mDefaultNetworkCallback == null) {
            this.mRegisterDefaultNetworkCallbackFailed = $assertionsDisabled;
            return $assertionsDisabled;
        }
        int i = 0;
        while (true) {
            try {
                this.mConnectivityManagerWrapper.registerDefaultNetworkCallback(this.mDefaultNetworkCallback, this.mHandler);
                hv5.m6511d(getSuccessResult(z, i), "Net.Android.NetworkChangeNotifier.RegisterDefaultNetworkCallbackResult", 8);
                this.mRegisterDefaultNetworkCallbackFailed = $assertionsDisabled;
                return true;
            } catch (SecurityException e) {
                if (i != 0) {
                    Log.w("cn_".concat(String.valueOf(TAG)), "Retry failed to register default network callback", e);
                    e = e;
                    this.mRegisterDefaultNetworkCallbackFailed = true;
                    recordRegistrationFailure("Net.Android.NetworkChangeNotifier.RegisterDefaultNetworkCallbackResult", e);
                    return $assertionsDisabled;
                }
                Log.w("cn_".concat(String.valueOf(TAG)), "Failed to register default network callback, retrying once", e);
                i = 1;
            } catch (RuntimeException e2) {
                e = e2;
                Log.w("cn_".concat(String.valueOf(TAG)), "Failed to register default network callback", e);
                this.mRegisterDefaultNetworkCallbackFailed = true;
                recordRegistrationFailure("Net.Android.NetworkChangeNotifier.RegisterDefaultNetworkCallbackResult", e);
                return $assertionsDisabled;
            }
        }
    }

    private boolean registerNetworkCallback(boolean z) {
        boolean z2;
        ej6 networkCapabilities;
        C1007l c1007l = this.mNetworkCallback;
        if (c1007l == null) {
            this.mRegisterNetworkCallbackFailed = $assertionsDisabled;
            return $assertionsDisabled;
        }
        ry5.m10503a("NetworkChangeNotifierAutoDetect.initializeVpnInPlace");
        try {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = c1007l.f27045b;
            RuntimeException runtimeException = null;
            Network[] allNetworksFiltered = getAllNetworksFiltered(networkChangeNotifierAutoDetect.mConnectivityManagerWrapper, null);
            c1007l.f27044a = null;
            if (allNetworksFiltered.length == 1 && (networkCapabilities = networkChangeNotifierAutoDetect.mConnectivityManagerWrapper.getNetworkCapabilities(allNetworksFiltered[0])) != null && networkCapabilities.m5137a(4)) {
                c1007l.f27044a = allNetworksFiltered[0];
            }
            Trace.endSection();
            int i = 0;
            while (true) {
                try {
                    this.mConnectivityManagerWrapper.registerNetworkCallback(this.mNetworkRequest, this.mNetworkCallback, this.mHandler);
                    hv5.m6511d(getSuccessResult(z, i), "Net.Android.NetworkChangeNotifier.RegisterNetworkCallbackResult", 8);
                    this.mRegisterNetworkCallbackFailed = $assertionsDisabled;
                    z2 = true;
                    break;
                } catch (SecurityException e) {
                    runtimeException = e;
                    if (i != 0) {
                        Log.w("cn_".concat(String.valueOf(TAG)), "Retry failed to register network callback", runtimeException);
                        z2 = false;
                        break;
                    }
                    Log.w("cn_".concat(String.valueOf(TAG)), "Failed to register network callback, retrying once", runtimeException);
                    i = 1;
                } catch (RuntimeException e2) {
                    runtimeException = e2;
                    Log.w("cn_".concat(String.valueOf(TAG)), "Failed to register network callback", runtimeException);
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                purgeActiveNetworkList();
                return true;
            }
            this.mRegisterNetworkCallbackFailed = true;
            recordRegistrationFailure("Net.Android.NetworkChangeNotifier.RegisterNetworkCallbackResult", runtimeException);
            return $assertionsDisabled;
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private void retryFailedRegistrations() {
        if (registerDefaultNetworkCallbackFailed()) {
            boolean zRegisterDefaultNetworkCallback = registerDefaultNetworkCallback(true);
            this.mDefaultNetworkCallbackRegistered = zRegisterDefaultNetworkCallback;
            if (zRegisterDefaultNetworkCallback) {
                x06.f33904a.unregisterReceiver(this);
            }
            hv5.m6511d(!this.mDefaultNetworkCallbackRegistered ? 1 : 0, "Net.Android.NetworkChangeNotifier.SelfHealDefaultNetworkResult", 2);
        }
        if (registerNetworkCallbackFailed()) {
            boolean zRegisterNetworkCallback = registerNetworkCallback(true);
            this.mNetworkCallbackRegistered = zRegisterNetworkCallback;
            hv5.m6511d(!zRegisterNetworkCallback ? 1 : 0, "Net.Android.NetworkChangeNotifier.SelfHealNetworkResult", 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnThread(final Runnable runnable) {
        if (onThread()) {
            runnable.run();
        } else {
            this.mHandler.post(new Runnable() { // from class: org.chromium.net.NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$runOnThread$0(runnable);
                }
            });
        }
    }

    public void destroy() {
        this.mRegistrationPolicy.destroy();
        unregister();
    }

    public ConnectivityManagerWrapper.NetworkState getCurrentNetworkState() {
        ry5.m10503a("NetworkChangeNotifierAutoDetect.getCurrentNetworkState");
        try {
            ConnectivityManagerWrapper.NetworkState networkState = this.mNetworkState;
            Trace.endSection();
            return networkState;
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public long getDefaultNetId() {
        Network defaultNetwork = getDefaultNetwork();
        if (defaultNetwork == null) {
            return -1L;
        }
        return ConnectivityManagerWrapper.networkToNetId(defaultNetwork);
    }

    public Network getDefaultNetwork() {
        return this.mConnectivityManagerWrapper.getDefaultNetwork();
    }

    public long[] getNetworksAndTypes() {
        ry5.m10503a("NetworkChangeNotifierAutoDetect.getNetworksAndTypes");
        try {
            Network[] allNetworksFiltered = getAllNetworksFiltered(this.mConnectivityManagerWrapper, null);
            int length = allNetworksFiltered.length;
            long[] jArr = new long[length + length];
            int i = 0;
            for (Network network : allNetworksFiltered) {
                int i2 = i + 1;
                jArr[i] = ConnectivityManagerWrapper.networkToNetId(network);
                i += 2;
                jArr[i2] = this.mConnectivityManagerWrapper.getConnectionType(network);
            }
            Trace.endSection();
            return jArr;
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public Network[] getNetworksForTesting() {
        return getAllNetworksFiltered(this.mConnectivityManagerWrapper, null);
    }

    public RegistrationPolicy getRegistrationPolicy() {
        return this.mRegistrationPolicy;
    }

    public boolean isReceiverRegisteredForTesting() {
        return this.mRegistered;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        fk6 fk6Var = new fk6((byte) 2);
        fk6Var.f19064b = this;
        VarHandle.storeStoreFence();
        runOnThread(fk6Var);
    }

    public void register() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect;
        ry5.m10503a("NetworkChangeNotifierAutoDetect.register");
        try {
            if (this.mRegistered) {
                retryFailedRegistrations();
                connectionTypeChanged();
            } else {
                if (this.mShouldSignalObserver) {
                    connectionTypeChanged();
                }
                boolean zRegisterDefaultNetworkCallback = registerDefaultNetworkCallback($assertionsDisabled);
                this.mDefaultNetworkCallbackRegistered = zRegisterDefaultNetworkCallback;
                if (zRegisterDefaultNetworkCallback) {
                    networkChangeNotifierAutoDetect = this;
                } else {
                    networkChangeNotifierAutoDetect = this;
                    networkChangeNotifierAutoDetect.mIgnoreNextBroadcast = x06.f33904a.registerReceiver(networkChangeNotifierAutoDetect, this.mIntentFilter, null, null, 0) != null;
                }
                networkChangeNotifierAutoDetect.mRegistered = true;
                networkChangeNotifierAutoDetect.mNetworkCallbackRegistered = networkChangeNotifierAutoDetect.registerNetworkCallback($assertionsDisabled);
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public boolean registerDefaultNetworkCallbackFailed() {
        if (this.mDefaultNetworkCallback == null || !this.mRegisterDefaultNetworkCallbackFailed) {
            return $assertionsDisabled;
        }
        return true;
    }

    public boolean registerNetworkCallbackFailed() {
        if (this.mNetworkCallback == null || !this.mRegisterNetworkCallbackFailed) {
            return $assertionsDisabled;
        }
        return true;
    }

    public void setConnectivityManagerWrapperForTests(ConnectivityManagerWrapper connectivityManagerWrapper) {
        this.mConnectivityManagerWrapper = connectivityManagerWrapper;
    }

    public void simulatePreAndroid28ForTesting() {
        this.mDefaultNetworkCallback = null;
    }

    public void unregister() {
        if (this.mRegistered) {
            this.mRegistered = $assertionsDisabled;
            if (this.mNetworkCallbackRegistered) {
                this.mConnectivityManagerWrapper.unregisterNetworkCallback(this.mNetworkCallback);
                this.mNetworkCallbackRegistered = $assertionsDisabled;
            }
            if (!this.mDefaultNetworkCallbackRegistered) {
                x06.f33904a.unregisterReceiver(this);
            } else {
                this.mConnectivityManagerWrapper.unregisterNetworkCallback(this.mDefaultNetworkCallback);
                this.mDefaultNetworkCallbackRegistered = $assertionsDisabled;
            }
        }
    }

    public void updateCurrentNetworkState() {
        ry5.m10503a("NetworkChangeNotifierAutoDetect.updateCurrentNetworkState");
        try {
            this.mNetworkState = this.mConnectivityManagerWrapper.getNetworkState(null);
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setWifiManagerDelegateForTests$0(vr6 vr6Var) {
    }

    public void setWifiManagerDelegateForTests(vr6 vr6Var) {
    }

    private void assertOnThread() {
    }
}
