package p000;

import android.net.http.BidirectionalStream$Callback;
import android.net.http.HeaderBlock;
import android.net.http.HttpException;
import android.net.http.UrlResponseInfo;
import java.lang.invoke.VarHandle;
import java.nio.ByteBuffer;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.CronetException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xm5 implements BidirectionalStream$Callback {

    /* JADX INFO: renamed from: a */
    public BidirectionalStream.Callback f34425a;

    /* JADX INFO: renamed from: b */
    public tr5 f34426b;

    public final void onCanceled(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        ir6 ir6VarM6926a = ir6.m6926a(urlResponseInfo);
        try {
            this.f34425a.onCanceled(this.f34426b, ir6VarM6926a);
        } finally {
            this.f34426b.m11120a(2, ir6VarM6926a, null);
        }
    }

    public final void onFailed(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HttpException httpException) {
        ir6 ir6VarM6926a = ir6.m6926a(urlResponseInfo);
        CronetException cronetExceptionM5029b = e96.m5029b(httpException);
        try {
            this.f34425a.onFailed(this.f34426b, ir6VarM6926a, cronetExceptionM5029b);
        } finally {
            this.f34426b.m11120a(1, ir6VarM6926a, cronetExceptionM5029b);
        }
    }

    public final void onReadCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.f34425a.onReadCompleted(this.f34426b, ir6.m6926a(urlResponseInfo), byteBuffer, z);
    }

    public final void onResponseHeadersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        this.f34425a.onResponseHeadersReceived(this.f34426b, ir6.m6926a(urlResponseInfo));
    }

    public final void onResponseTrailersReceived(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, HeaderBlock headerBlock) {
        ir6 ir6VarM6926a = ir6.m6926a(urlResponseInfo);
        qy5 qy5Var = new qy5();
        qy5Var.f28895a = headerBlock;
        VarHandle.storeStoreFence();
        this.f34425a.onResponseTrailersReceived(this.f34426b, ir6VarM6926a, qy5Var);
    }

    public final void onStreamReady(android.net.http.BidirectionalStream bidirectionalStream) {
        this.f34425a.onStreamReady(this.f34426b);
    }

    public final void onSucceeded(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo) {
        ir6 ir6VarM6926a = ir6.m6926a(urlResponseInfo);
        try {
            this.f34425a.onSucceeded(this.f34426b, ir6VarM6926a);
        } finally {
            this.f34426b.m11120a(0, ir6VarM6926a, null);
        }
    }

    public final void onWriteCompleted(android.net.http.BidirectionalStream bidirectionalStream, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer, boolean z) {
        this.f34425a.onWriteCompleted(this.f34426b, ir6.m6926a(urlResponseInfo), byteBuffer, z);
    }
}
