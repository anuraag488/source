package org.chromium.net;

import java.util.List;

/* JADX INFO: renamed from: org.chromium.net.b */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0997b extends Proxy.HttpConnectCallback.Request {

    /* JADX INFO: renamed from: a */
    public android.net.http.Proxy$HttpConnectCallback.Request f27003a;

    @Override // org.chromium.net.Proxy.HttpConnectCallback.Request, java.lang.AutoCloseable
    public final void close() {
        this.f27003a.close();
    }

    @Override // org.chromium.net.Proxy.HttpConnectCallback.Request
    public final void proceed(List list) {
        this.f27003a.proceed(list);
    }
}
