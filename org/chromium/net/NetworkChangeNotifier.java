package org.chromium.net;

import android.os.Trace;
import internal.p002J.AbstractC0768N;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Iterator;
import p000.on6;
import p000.pk6;
import p000.ry5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class NetworkChangeNotifier {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static NetworkChangeNotifier sInstance;
    private NetworkChangeNotifierAutoDetect mAutoDetector;
    private int mCurrentConnectionType = 0;
    private int mCurrentConnectionCost = 0;
    private final ArrayList<Long> mNativeChangeNotifiers = new ArrayList<>();
    private final on6 mConnectionTypeObservers = new on6();

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    public interface ConnectionTypeObserver {
        void onConnectionTypeChanged(int i);
    }

    public static void addConnectionTypeObserver(ConnectionTypeObserver connectionTypeObserver) {
        getInstance().addConnectionTypeObserverInternal(connectionTypeObserver);
    }

    private void addConnectionTypeObserverInternal(ConnectionTypeObserver connectionTypeObserver) {
        this.mConnectionTypeObservers.m9193a(connectionTypeObserver);
    }

    private void destroyAutoDetector() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect != null) {
            networkChangeNotifierAutoDetect.destroy();
            this.mAutoDetector = null;
        }
    }

    public static void fakeConnectionCostChanged(int i) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionCostChange(i);
    }

    public static void fakeConnectionSubtypeChanged(int i) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionSubtypeChange(i);
    }

    public static void fakeDefaultNetwork(long j, int i) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfConnectionTypeChange(i, j);
    }

    public static void fakeNetworkConnected(long j, int i) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkConnect(j, i);
    }

    public static void fakeNetworkDisconnected(long j) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkDisconnect(j);
    }

    public static void fakeNetworkSoonToBeDisconnected(long j) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversOfNetworkSoonToDisconnect(j);
    }

    public static void fakePurgeActiveNetworkList(long[] jArr) {
        setAutoDetectConnectivityState(false);
        getInstance().notifyObserversToPurgeActiveNetworkList(jArr);
    }

    public static void forceConnectivityState(boolean z) {
        setAutoDetectConnectivityState(false);
        getInstance().forceConnectivityStateInternal(z);
    }

    private void forceConnectivityStateInternal(boolean z) {
        if ((this.mCurrentConnectionType != 6) != z) {
            updateCurrentConnectionType(true != z ? 6 : 0);
            notifyObserversOfConnectionSubtypeChange(!z ? 1 : 0);
        }
    }

    public static NetworkChangeNotifierAutoDetect getAutoDetectorForTest() {
        return getInstance().mAutoDetector;
    }

    public static NetworkChangeNotifier getInstance() {
        return sInstance;
    }

    public static NetworkChangeNotifier init() {
        NetworkChangeNotifier networkChangeNotifier = sInstance;
        if (networkChangeNotifier != null) {
            return networkChangeNotifier;
        }
        NetworkChangeNotifier networkChangeNotifier2 = new NetworkChangeNotifier();
        sInstance = networkChangeNotifier2;
        return networkChangeNotifier2;
    }

    public static boolean isInitialized() {
        return sInstance != null;
    }

    public static boolean isOnline() {
        return getInstance().getCurrentConnectionType() != 6;
    }

    private void notifyObserversOfConnectionTypeChange(int i, long j) {
        ArrayList<Long> arrayList = this.mNativeChangeNotifiers;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0768N.MbPIImnU(arrayList.get(i2).longValue(), i, j);
        }
        Iterator it = this.mConnectionTypeObservers.iterator();
        while (true) {
            pk6 pk6Var = (pk6) it;
            if (!pk6Var.hasNext()) {
                return;
            } else {
                ((ConnectionTypeObserver) pk6Var.next()).onConnectionTypeChanged(i);
            }
        }
    }

    public static void registerToReceiveNotificationsAlways() {
        getInstance().setAutoDetectConnectivityStateInternal(true, new RegistrationPolicyAlwaysRegister());
    }

    public static void removeConnectionTypeObserver(ConnectionTypeObserver connectionTypeObserver) {
        getInstance().removeConnectionTypeObserverInternal(connectionTypeObserver);
    }

    private void removeConnectionTypeObserverInternal(ConnectionTypeObserver connectionTypeObserver) {
        this.mConnectionTypeObservers.m9194b(connectionTypeObserver);
    }

    public static void resetInstanceForTests() {
        sInstance = new NetworkChangeNotifier();
    }

    public static void setAutoDetectConnectivityState(boolean z) {
        getInstance().setAutoDetectConnectivityStateInternal(z, new RegistrationPolicyApplicationStatus());
    }

    private void setAutoDetectConnectivityStateInternal(boolean z, NetworkChangeNotifierAutoDetect.RegistrationPolicy registrationPolicy) {
        ry5.m10503a("NetworkChangeNotifier.setAutoDetectConnectivityStateInternal");
        try {
            if (!z) {
                destroyAutoDetector();
            } else if (this.mAutoDetector == null) {
                C1000e c1000e = new C1000e();
                c1000e.f27004a = this;
                VarHandle.storeStoreFence();
                NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = new NetworkChangeNotifierAutoDetect(c1000e, registrationPolicy);
                this.mAutoDetector = networkChangeNotifierAutoDetect;
                ConnectivityManagerWrapper.NetworkState currentNetworkState = networkChangeNotifierAutoDetect.getCurrentNetworkState();
                updateCurrentConnectionType(currentNetworkState.getConnectionType());
                updateCurrentConnectionCost(currentNetworkState.getConnectionCost());
                notifyObserversOfConnectionSubtypeChange(currentNetworkState.getConnectionSubtype());
            }
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

    public static void setDeriveConnectionTypeFromCapabilities(boolean z) {
        ConnectivityManagerWrapper.setDeriveConnectionTypeFromCapabilities(z);
    }

    private void updateCurrentConnectionCost(int i) {
        this.mCurrentConnectionCost = i;
        notifyObserversOfConnectionCostChange(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCurrentConnectionType(int i) {
        this.mCurrentConnectionType = i;
        notifyObserversOfConnectionTypeChange(i);
    }

    public void addNativeObserver(long j) {
        this.mNativeChangeNotifiers.add(Long.valueOf(j));
    }

    public int getCurrentConnectionCost() {
        return this.mCurrentConnectionCost;
    }

    public int getCurrentConnectionSubtype(boolean z) {
        int connectionSubtype;
        ry5.m10503a("NetworkChangeNotifier.getCurrentConnectionSubtype");
        try {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
            if (networkChangeNotifierAutoDetect == null) {
                connectionSubtype = 0;
            } else {
                if (z) {
                    networkChangeNotifierAutoDetect.updateCurrentNetworkState();
                }
                connectionSubtype = this.mAutoDetector.getCurrentNetworkState().getConnectionSubtype();
            }
            Trace.endSection();
            return connectionSubtype;
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public int getCurrentConnectionType() {
        return this.mCurrentConnectionType;
    }

    public long getCurrentDefaultNetId() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect == null) {
            return -1L;
        }
        return networkChangeNotifierAutoDetect.getDefaultNetId();
    }

    public long[] getCurrentNetworksAndTypes() {
        ry5.m10503a("NetworkChangeNotifierAutoDetect.getCurrentNetworksAndTypes");
        try {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
            long[] networksAndTypes = networkChangeNotifierAutoDetect == null ? new long[0] : networkChangeNotifierAutoDetect.getNetworksAndTypes();
            Trace.endSection();
            return networksAndTypes;
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void notifyObserversOfConnectionCostChange(int i) {
        ArrayList<Long> arrayList = this.mNativeChangeNotifiers;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0768N.Mg0W7eRL(arrayList.get(i2).longValue(), i);
        }
    }

    public void notifyObserversOfConnectionSubtypeChange(int i) {
        ArrayList<Long> arrayList = this.mNativeChangeNotifiers;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0768N.MCEqyWQ0(arrayList.get(i2).longValue(), i);
        }
    }

    public void notifyObserversOfNetworkConnect(long j, int i) {
        ArrayList<Long> arrayList = this.mNativeChangeNotifiers;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0768N.MBT1i5cd(arrayList.get(i2).longValue(), j, i);
        }
    }

    public void notifyObserversOfNetworkDisconnect(long j) {
        ArrayList<Long> arrayList = this.mNativeChangeNotifiers;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0768N.MDpuHJTB(arrayList.get(i).longValue(), j);
        }
    }

    public void notifyObserversOfNetworkSoonToDisconnect(long j) {
        ArrayList<Long> arrayList = this.mNativeChangeNotifiers;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0768N.MiJIMrTb(arrayList.get(i).longValue(), j);
        }
    }

    public void notifyObserversToPurgeActiveNetworkList(long[] jArr) {
        ArrayList<Long> arrayList = this.mNativeChangeNotifiers;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0768N.MpF$179U(arrayList.get(i).longValue(), jArr);
        }
    }

    public boolean registerDefaultNetworkCallbackFailed() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect == null) {
            return false;
        }
        return networkChangeNotifierAutoDetect.registerDefaultNetworkCallbackFailed();
    }

    public boolean registerNetworkCallbackFailed() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.mAutoDetector;
        if (networkChangeNotifierAutoDetect == null) {
            return false;
        }
        return networkChangeNotifierAutoDetect.registerNetworkCallbackFailed();
    }

    public void removeNativeObserver(long j) {
        this.mNativeChangeNotifiers.remove(Long.valueOf(j));
    }

    public static void resetInstanceForTests(NetworkChangeNotifier networkChangeNotifier) {
        sInstance = networkChangeNotifier;
    }

    public static void setAutoDetectConnectivityState(NetworkChangeNotifierAutoDetect.RegistrationPolicy registrationPolicy) {
        getInstance().setAutoDetectConnectivityStateInternal(true, registrationPolicy);
    }

    public void notifyObserversOfConnectionTypeChange(int i) {
        notifyObserversOfConnectionTypeChange(i, getCurrentDefaultNetId());
    }
}
