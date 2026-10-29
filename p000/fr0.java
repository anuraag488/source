package p000;

import java.lang.invoke.VarHandle;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class fr0 extends ExperimentalCronetEngine {
    /* JADX INFO: renamed from: a */
    public ExperimentalBidirectionalStream mo5788a(String str, BidirectionalStream.Callback callback, Executor executor, String str2, ArrayList arrayList, int i, boolean z, ArrayList arrayList2, boolean z2, int i2, boolean z3, int i3, long j) {
        throw new UnsupportedOperationException("Can't create a bidi stream - httpurlconnection doesn't have those APIs");
    }

    /* JADX INFO: renamed from: b */
    public abstract ExperimentalUrlRequest mo3890b(String str, UrlRequest.Callback callback, Executor executor, int i, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, RequestFinishedInfo.Listener listener, int i4, long j, String str2, ArrayList arrayList2, UploadDataProvider uploadDataProvider, Executor executor2, byte[] bArr, ByteBuffer byteBuffer, String str3);

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final ExperimentalUrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        g26 g26Var = new g26();
        g26Var.f19527f = new ArrayList();
        g26Var.f19530i = 3;
        g26Var.f19542u = "";
        g26Var.f19543v = -1L;
        g26Var.f19544w = 0;
        Objects.requireNonNull(str, "URL is required.");
        g26Var.f19523b = str;
        Objects.requireNonNull(callback, "Callback is required.");
        g26Var.f19524c = callback;
        Objects.requireNonNull(executor, "Executor is required.");
        g26Var.f19525d = executor;
        g26Var.f19522a = this;
        VarHandle.storeStoreFence();
        return g26Var;
    }
}
