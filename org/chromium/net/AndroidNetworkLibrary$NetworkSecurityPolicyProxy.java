package org.chromium.net;

import android.os.Build;
import android.security.NetworkSecurityPolicy;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class AndroidNetworkLibrary$NetworkSecurityPolicyProxy {
    private static AndroidNetworkLibrary$NetworkSecurityPolicyProxy sInstance = new AndroidNetworkLibrary$NetworkSecurityPolicyProxy();

    public static AndroidNetworkLibrary$NetworkSecurityPolicyProxy getInstance() {
        return sInstance;
    }

    public static void setInstanceForTesting(AndroidNetworkLibrary$NetworkSecurityPolicyProxy androidNetworkLibrary$NetworkSecurityPolicyProxy) {
        sInstance = androidNetworkLibrary$NetworkSecurityPolicyProxy;
    }

    public int getDomainEncryptionMode(String str) {
        if (Build.VERSION.SDK_INT < 37) {
            return 0;
        }
        return NetworkSecurityPolicy.getInstance().getDomainEncryptionMode(str);
    }

    public boolean isCleartextTrafficPermitted() {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    public boolean isCleartextTrafficPermitted(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
