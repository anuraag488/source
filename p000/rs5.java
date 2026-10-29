package p000;

import android.os.Trace;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rs5 extends UrlRequest.Callback {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ws5 f29589k;

    public rs5(ws5 ws5Var) {
        this.f29589k = ws5Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m10423a(IOException iOException) {
        ws5 ws5Var = this.f29589k;
        ws5Var.f33705l = iOException;
        et5 et5Var = ws5Var.f33702i;
        if (et5Var != null) {
            et5Var.f18481d = iOException;
            et5Var.f18479b = true;
            et5Var.f18480c = null;
        }
        ht5 ht5Var = ws5Var.f33703j;
        if (ht5Var != null) {
            ht5Var.f20853a = iOException;
            ht5Var.f20855c = true;
        }
        ws5Var.f33707n = true;
        ws5Var.f33695b.f24362b = false;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ry5.m10503a("CronetHttpURLConnection.CronetUrlRequestCallback#onCanceled");
        try {
            this.f29589k.f33704k = urlResponseInfo;
            m10423a(new IOException("disconnect() called"));
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

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        ry5.m10503a("CronetHttpURLConnection.CronetUrlRequestCallback#onFailed");
        try {
            if (cronetException == null) {
                throw new IllegalStateException("Exception cannot be null in onFailed.");
            }
            this.f29589k.f33704k = urlResponseInfo;
            m10423a(cronetException);
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

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        ry5.m10503a("CronetHttpURLConnection.CronetUrlRequestCallback#onReadCompleted");
        try {
            ws5 ws5Var = this.f29589k;
            ws5Var.f33704k = urlResponseInfo;
            ws5Var.f33695b.f24362b = false;
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

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        ws5 ws5Var = this.f29589k;
        ry5.m10503a("CronetHttpURLConnection.CronetUrlRequestCallback#onRedirectReceived");
        try {
            ws5Var.f33706m = true;
            try {
                URL url = new URL(str);
                boolean zEquals = url.getProtocol().equals(((HttpURLConnection) ws5Var).url.getProtocol());
                if (((HttpURLConnection) ws5Var).instanceFollowRedirects) {
                    ((HttpURLConnection) ws5Var).url = url;
                }
                if (((HttpURLConnection) ws5Var).instanceFollowRedirects && zEquals) {
                    ws5Var.f33696c.followRedirect();
                } else {
                    ws5Var.f33704k = urlResponseInfo;
                    ws5Var.f33696c.cancel();
                    m10423a(null);
                }
            } catch (MalformedURLException unused) {
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

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ry5.m10503a("CronetHttpURLConnection.CronetUrlRequestCallback#onResponseStarted");
        try {
            ws5 ws5Var = this.f29589k;
            ws5Var.f33704k = urlResponseInfo;
            ws5Var.f33707n = true;
            ws5Var.f33695b.f24362b = false;
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

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ry5.m10503a("CronetHttpURLConnection.CronetUrlRequestCallback#onSucceeded");
        try {
            this.f29589k.f33704k = urlResponseInfo;
            m10423a(null);
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
}
