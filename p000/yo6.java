package p000;

import android.net.http.HttpException;
import android.net.http.UrlRequest$Callback;
import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yo6 implements UrlRequest$Callback {

    /* JADX INFO: renamed from: a */
    public UrlRequest.Callback f35443a;

    /* JADX INFO: renamed from: b */
    public xq6 f35444b;

    public final void onCanceled(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ir6 ir6VarM6927b = ir6.m6927b(urlResponseInfo);
        try {
            this.f35443a.onCanceled(this.f35444b, ir6VarM6927b);
        } finally {
            this.f35444b.m12752a(2, ir6VarM6927b, null);
        }
    }

    public final void onFailed(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        ir6 ir6VarM6927b = ir6.m6927b(urlResponseInfo);
        CronetException cronetExceptionM5029b = e96.m5029b(httpException);
        try {
            this.f35443a.onFailed(this.f35444b, ir6VarM6927b, cronetExceptionM5029b);
        } finally {
            this.f35444b.m12752a(1, ir6VarM6927b, cronetExceptionM5029b);
        }
    }

    public final void onReadCompleted(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws Exception {
        try {
            this.f35443a.onReadCompleted(this.f35444b, ir6.m6927b(urlResponseInfo), byteBuffer);
        } catch (Exception e) {
            if (gr2.m6143s(e)) {
                InlineExecutionProhibitedException inlineExecutionProhibitedException = new InlineExecutionProhibitedException();
                inlineExecutionProhibitedException.initCause(e);
                throw inlineExecutionProhibitedException;
            }
            if (gr2.m6148x(e)) {
                throw e96.m5029b(e);
            }
            if (!Exception.class.isInstance(e)) {
                throw e;
            }
            throw e;
        }
    }

    public final void onRedirectReceived(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) throws Exception {
        try {
            this.f35443a.onRedirectReceived(this.f35444b, ir6.m6927b(urlResponseInfo), str);
        } catch (Exception e) {
            if (gr2.m6143s(e)) {
                InlineExecutionProhibitedException inlineExecutionProhibitedException = new InlineExecutionProhibitedException();
                inlineExecutionProhibitedException.initCause(e);
                throw inlineExecutionProhibitedException;
            }
            if (gr2.m6148x(e)) {
                throw e96.m5029b(e);
            }
            if (!Exception.class.isInstance(e)) {
                throw e;
            }
            throw e;
        }
    }

    public final void onResponseStarted(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) throws Exception {
        try {
            this.f35443a.onResponseStarted(this.f35444b, ir6.m6927b(urlResponseInfo));
        } catch (Exception e) {
            if (gr2.m6143s(e)) {
                InlineExecutionProhibitedException inlineExecutionProhibitedException = new InlineExecutionProhibitedException();
                inlineExecutionProhibitedException.initCause(e);
                throw inlineExecutionProhibitedException;
            }
            if (gr2.m6148x(e)) {
                throw e96.m5029b(e);
            }
            if (!Exception.class.isInstance(e)) {
                throw e;
            }
            throw e;
        }
    }

    public final void onSucceeded(android.net.http.UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        ir6 ir6VarM6927b = ir6.m6927b(urlResponseInfo);
        try {
            this.f35443a.onSucceeded(this.f35444b, ir6VarM6927b);
        } finally {
            this.f35444b.m12752a(0, ir6VarM6927b, null);
        }
    }
}
