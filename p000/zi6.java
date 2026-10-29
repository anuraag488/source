package p000;

import org.chromium.net.UploadDataSink;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zi6 extends UploadDataSink {

    /* JADX INFO: renamed from: a */
    public final android.net.http.UploadDataSink f36142a;

    public zi6(android.net.http.UploadDataSink uploadDataSink) {
        this.f36142a = uploadDataSink;
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exc) {
        this.f36142a.onReadError(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(boolean z) {
        this.f36142a.onReadSucceeded(z);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(Exception exc) {
        this.f36142a.onRewindError(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        this.f36142a.onRewindSucceeded();
    }
}
