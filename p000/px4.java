package p000;

import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class px4 extends UrlRequest.StatusListener {

    /* JADX INFO: renamed from: a */
    public final UrlRequest.StatusListener f28070a;

    public px4(UrlRequest.StatusListener statusListener) {
        this.f28070a = statusListener;
    }

    @Override // org.chromium.net.UrlRequest.StatusListener
    public final void onStatus(int i) {
        this.f28070a.onStatus(i);
    }
}
