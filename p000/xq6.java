package p000;

import android.net.http.UrlRequest;
import java.lang.invoke.VarHandle;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xq6 extends ExperimentalUrlRequest {

    /* JADX INFO: renamed from: a */
    public UrlRequest f34547a;

    /* JADX INFO: renamed from: b */
    public v76 f34548b;

    /* JADX INFO: renamed from: c */
    public String f34549c;

    /* JADX INFO: renamed from: d */
    public Collection f34550d;

    /* JADX INFO: renamed from: e */
    public f36 f34551e;

    /* JADX INFO: renamed from: a */
    public final void m12752a(int i, ir6 ir6Var, CronetException cronetException) {
        sf6.m10746a(this.f34548b, this.f34549c, this.f34550d, this.f34551e, i, ir6Var, cronetException);
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        this.f34547a.cancel();
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        this.f34547a.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(org.chromium.net.UrlRequest.StatusListener statusListener) {
        hq6 hq6Var = new hq6();
        hq6Var.f20792a = statusListener;
        VarHandle.storeStoreFence();
        this.f34547a.getStatus(hq6Var);
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        return this.f34547a.isDone();
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer) {
        this.f34547a.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.f34547a.start();
    }
}
