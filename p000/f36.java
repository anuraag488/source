package p000;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f36 extends RequestFinishedInfo.Listener {

    /* JADX INFO: renamed from: a */
    public RequestFinishedInfo.Listener f18722a;

    public f36(RequestFinishedInfo.Listener listener) {
        super(listener.getExecutor());
        this.f18722a = listener;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final Executor getExecutor() {
        return this.f18722a.getExecutor();
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        this.f18722a.onRequestFinished(requestFinishedInfo);
    }
}
