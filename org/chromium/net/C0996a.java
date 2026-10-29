package org.chromium.net;

import java.lang.invoke.VarHandle;
import java.util.List;
import p000.C1077qn;

/* JADX INFO: renamed from: org.chromium.net.a */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0996a implements android.net.http.Proxy$HttpConnectCallback {

    /* JADX INFO: renamed from: a */
    public Proxy.HttpConnectCallback f27002a;

    public final void onBeforeRequest(android.net.http.Proxy$HttpConnectCallback.Request request) {
        C0997b c0997b = new C0997b();
        if (!AndroidProxyOptions.areProxyApisEnabled()) {
            C1077qn.m9985k("AndroidProxy requires the proxy APIs to be enabled");
            return;
        }
        c0997b.f27003a = request;
        VarHandle.storeStoreFence();
        this.f27002a.onBeforeRequest(c0997b);
    }

    public final int onResponseReceived(List list, int i) {
        int iOnResponseReceived = this.f27002a.onResponseReceived(list, i);
        if (iOnResponseReceived == 0) {
            return 0;
        }
        if (iOnResponseReceived == 1) {
            return 1;
        }
        throw new AssertionError(String.format("Unknown OnResponseReceivedAction: %d", Integer.valueOf(iOnResponseReceived)));
    }
}
