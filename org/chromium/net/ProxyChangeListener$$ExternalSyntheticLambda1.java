package org.chromium.net;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ProxyChangeListener$$ExternalSyntheticLambda1 implements Runnable {
    public /* synthetic */ ProxyChangeListener f$0;
    public /* synthetic */ ProxyChangeListener.Delegate f$1;

    public /* synthetic */ ProxyChangeListener$$ExternalSyntheticLambda1(ProxyChangeListener proxyChangeListener, ProxyChangeListener.Delegate delegate) {
        this.f$0 = proxyChangeListener;
        this.f$1 = delegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$setDelegateForTesting$0(this.f$1);
    }
}
