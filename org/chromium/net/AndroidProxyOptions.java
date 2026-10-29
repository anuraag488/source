package org.chromium.net;

import android.net.http.HttpEngine;
import android.os.ext.SdkExtensions;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p000.C1077qn;
import p000.qm5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidProxyOptions {
    private AndroidProxyOptions() {
    }

    public static void apply(HttpEngine.Builder builder, ProxyOptions proxyOptions) {
        if (!areProxyApisEnabled()) {
            qm5.m9919j("Proxy APIs are not supported");
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Proxy proxy : proxyOptions.getProxyList()) {
            int i2 = 1;
            if (proxy == null) {
                i = 1;
            } else {
                if (!areProxyApisEnabled()) {
                    C1077qn.m9985k("AndroidProxy requires the proxy APIs to be enabled");
                    return;
                }
                int scheme = proxy.getScheme();
                if (!areProxyApisEnabled()) {
                    C1077qn.m9985k("AndroidProxy requires the proxy APIs to be enabled");
                    return;
                }
                if (scheme == 0) {
                    i2 = 0;
                } else if (scheme != 1) {
                    throw new AssertionError(String.format("Unknown scheme %d", Integer.valueOf(scheme)));
                }
                String host = proxy.getHost();
                int port = proxy.getPort();
                Executor executor = proxy.getExecutor();
                Proxy.HttpConnectCallback callback = proxy.getCallback();
                C0996a c0996a = new C0996a();
                if (!areProxyApisEnabled()) {
                    C1077qn.m9985k("AndroidProxy requires the proxy APIs to be enabled");
                    return;
                } else {
                    c0996a.f27002a = callback;
                    VarHandle.storeStoreFence();
                    arrayList.add(android.net.http.Proxy.createHttpProxy(i2, host, port, executor, c0996a));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        builder.setProxyOptions(android.net.http.ProxyOptions.fromProxyList(arrayList, i));
    }

    public static boolean areProxyApisEnabled() {
        return SdkExtensions.getExtensionVersion(31) >= 22;
    }
}
