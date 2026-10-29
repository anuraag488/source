package p000;

import android.net.Network;
import android.net.http.HttpEngine;
import android.util.Log;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v76 extends fr0 {

    /* JADX INFO: renamed from: c */
    public static boolean f32451c;

    /* JADX INFO: renamed from: d */
    public static boolean f32452d;

    /* JADX INFO: renamed from: a */
    public HttpEngine f32453a;

    /* JADX INFO: renamed from: b */
    public Map f32454b;

    @Override // p000.fr0
    /* JADX INFO: renamed from: a */
    public final ExperimentalBidirectionalStream mo5788a(String str, BidirectionalStream.Callback callback, Executor executor, String str2, ArrayList arrayList, int i, boolean z, ArrayList arrayList2, boolean z2, int i2, boolean z3, int i3, long j) {
        xm5 xm5Var = new xm5();
        Objects.requireNonNull(callback, "Callback is required.");
        xm5Var.f34425a = callback;
        VarHandle.storeStoreFence();
        android.net.http.BidirectionalStream.Builder builderNewBidirectionalStreamBuilder = this.f32453a.newBidirectionalStreamBuilder(str, executor, xm5Var);
        builderNewBidirectionalStreamBuilder.setHttpMethod(str2);
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            Map.Entry entry = (Map.Entry) obj;
            builderNewBidirectionalStreamBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        builderNewBidirectionalStreamBuilder.setPriority(i);
        builderNewBidirectionalStreamBuilder.setDelayRequestHeadersUntilFirstFlushEnabled(z);
        if (z2) {
            builderNewBidirectionalStreamBuilder.setTrafficStatsTag(i2);
        }
        if (z3) {
            builderNewBidirectionalStreamBuilder.setTrafficStatsUid(i3);
        }
        android.net.http.BidirectionalStream bidirectionalStreamBuild = builderNewBidirectionalStreamBuilder.build();
        tr5 tr5Var = new tr5();
        tr5Var.f31376a = bidirectionalStreamBuild;
        tr5Var.f31377b = this;
        tr5Var.f31378c = str;
        tr5Var.f31379d = arrayList2;
        VarHandle.storeStoreFence();
        xm5Var.f34426b = tr5Var;
        return tr5Var;
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.f32454b.put(listener, new f36(listener));
    }

    @Override // p000.fr0
    /* JADX INFO: renamed from: b */
    public final ExperimentalUrlRequest mo3890b(String str, UrlRequest.Callback callback, Executor executor, int i, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, RequestFinishedInfo.Listener listener, int i4, long j, String str2, ArrayList arrayList2, UploadDataProvider uploadDataProvider, Executor executor2, byte[] bArr, ByteBuffer byteBuffer, String str3) {
        yo6 yo6Var = new yo6();
        Objects.requireNonNull(callback, "Callback is required.");
        yo6Var.f35443a = callback;
        VarHandle.storeStoreFence();
        android.net.http.UrlRequest.Builder builderNewUrlRequestBuilder = this.f32453a.newUrlRequestBuilder(str, executor, yo6Var);
        builderNewUrlRequestBuilder.setPriority(i);
        if (z) {
            builderNewUrlRequestBuilder.setCacheDisabled(true);
        }
        if (z3) {
            builderNewUrlRequestBuilder.setDirectExecutorAllowed(true);
        }
        if (z4) {
            builderNewUrlRequestBuilder.setTrafficStatsTag(i2);
        }
        if (z5) {
            builderNewUrlRequestBuilder.setTrafficStatsUid(i3);
        }
        f36 f36Var = null;
        builderNewUrlRequestBuilder.bindToNetwork(j == -1 ? null : Network.fromNetworkHandle(j));
        builderNewUrlRequestBuilder.setHttpMethod(str2);
        int size = arrayList2.size();
        for (int i5 = 0; i5 < size; i5++) {
            Map.Entry entry = (Map.Entry) arrayList2.get(i5);
            builderNewUrlRequestBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (uploadDataProvider != null) {
            builderNewUrlRequestBuilder.setUploadDataProvider(new rh6(uploadDataProvider), executor2);
        }
        android.net.http.UrlRequest urlRequestBuild = builderNewUrlRequestBuilder.build();
        xq6 xq6Var = new xq6();
        xq6Var.f34547a = urlRequestBuild;
        xq6Var.f34548b = this;
        xq6Var.f34549c = str;
        xq6Var.f34550d = arrayList;
        if (listener != null) {
            f36Var = new f36(listener.getExecutor());
            f36Var.f18722a = listener;
            VarHandle.storeStoreFence();
        }
        xq6Var.f34551e = f36Var;
        VarHandle.storeStoreFence();
        yo6Var.f35444b = xq6Var;
        return xq6Var;
    }

    @Override // org.chromium.net.CronetEngine
    public final void bindToNetwork(long j) {
        this.f32453a.bindToNetwork(j == -1 ? null : Network.fromNetworkHandle(j));
    }

    @Override // org.chromium.net.CronetEngine
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return this.f32453a.createUrlStreamHandlerFactory();
    }

    @Override // org.chromium.net.CronetEngine
    public final byte[] getGlobalMetricsDeltas() {
        if (!f32452d) {
            Log.i("cn_HttpEngineWrapper", "GlobalMetricsDelta is unsupported when HttpEngineNativeProvider is used. An empty protobuf is returned.");
            f32452d = true;
        }
        return new byte[0];
    }

    @Override // org.chromium.net.CronetEngine
    public final String getVersionString() {
        return HttpEngine.getVersionString();
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* synthetic */ BidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new kr6(str, callback, executor, this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* bridge */ /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return newUrlRequestBuilder(str, callback, executor);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final URLConnection openConnection(URL url, Proxy proxy) {
        if (proxy.type() != Proxy.Type.DIRECT) {
            xy4.m12791t();
            return null;
        }
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || "https".equals(protocol)) {
            return openConnection(url);
        }
        qm5.m9919j("Unexpected protocol:".concat(String.valueOf(protocol)));
        return null;
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.f32454b.remove(listener);
    }

    @Override // org.chromium.net.CronetEngine
    public final void shutdown() {
        this.f32453a.shutdown();
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToFile(String str, boolean z) {
        if (f32451c) {
            return;
        }
        Log.i("cn_HttpEngineWrapper", "Netlog is unsupported when HttpEngineNativeProvider is used.");
        f32451c = true;
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new kr6(str, callback, executor, this);
    }

    @Override // org.chromium.net.CronetEngine
    public final URLConnection openConnection(URL url) throws Exception {
        try {
            return this.f32453a.openConnection(url);
        } catch (Exception e) {
            if (!gr2.m6143s(e)) {
                if (!gr2.m6148x(e)) {
                    if (IOException.class.isInstance(e)) {
                        throw e;
                    }
                    throw e;
                }
                throw e96.m5029b(e);
            }
            InlineExecutionProhibitedException inlineExecutionProhibitedException = new InlineExecutionProhibitedException();
            inlineExecutionProhibitedException.initCause(e);
            throw inlineExecutionProhibitedException;
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void stopNetLog() {
    }
}
