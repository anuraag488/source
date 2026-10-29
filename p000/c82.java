package p000;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Trace;
import java.lang.invoke.VarHandle;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.NetworkQualityRttListener;
import org.chromium.net.NetworkQualityThroughputListener;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.ImplVersion;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class c82 extends fr0 {

    /* JADX INFO: renamed from: a */
    public String f15866a;

    /* JADX INFO: renamed from: b */
    public ThreadPoolExecutor f15867b;

    /* JADX INFO: renamed from: c */
    public int f15868c;

    /* JADX INFO: renamed from: d */
    public dt0 f15869d;

    /* JADX INFO: renamed from: e */
    public AtomicInteger f15870e;

    /* JADX INFO: renamed from: f */
    public long f15871f;

    /* JADX INFO: renamed from: g */
    public Context f15872g;

    @Override // p000.fr0
    /* JADX INFO: renamed from: b */
    public final ExperimentalUrlRequest mo3890b(String str, UrlRequest.Callback callback, Executor executor, int i, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, RequestFinishedInfo.Listener listener, int i4, long j, String str2, ArrayList arrayList2, UploadDataProvider uploadDataProvider, Executor executor2, byte[] bArr, ByteBuffer byteBuffer, String str3) {
        Executor bu3Var = executor2;
        if (j != -1) {
            this.f15871f = j;
        }
        ThreadPoolExecutor threadPoolExecutor = this.f15867b;
        String str4 = this.f15866a;
        long j2 = this.f15871f;
        i16 i16Var = new i16();
        i16Var.f21020d = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        i16Var.f21021e = new ArrayList();
        i16Var.f21022f = new AtomicInteger(0);
        i16Var.f21023g = new AtomicBoolean(false);
        i16Var.f21028l = -1;
        ry5.m10503a("Cronet JavaUrlRequest#JavaUrlRequest");
        try {
            Objects.requireNonNull(str, "URL is required");
            Objects.requireNonNull(callback, "Listener is required");
            Objects.requireNonNull(threadPoolExecutor, "Executor is required");
            Objects.requireNonNull(executor, "userExecutor is required");
            i16Var.f21024h = z3;
            r06 r06Var = new r06();
            r06Var.f28940d = i16Var;
            r06Var.f28937a = new i36(callback);
            cr5 cr5Var = null;
            if (z3) {
                r06Var.f28938b = executor;
                r06Var.f28939c = null;
            } else {
                r06Var.f28938b = new bu3(executor);
                r06Var.f28939c = executor;
            }
            VarHandle.storeStoreFence();
            i16Var.f21017a = r06Var;
            int threadStatsTag = !z4 ? TrafficStats.getThreadStatsTag() : i2;
            cz5 cz5Var = new cz5();
            cz5Var.f16649a = threadPoolExecutor;
            cz5Var.f16650b = threadStatsTag;
            cz5Var.f16651c = z5;
            cz5Var.f16652d = i3;
            VarHandle.storeStoreFence();
            h16 h16Var = new h16();
            RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 24);
            runnableC1029pc.f27515b = h16Var;
            VarHandle.storeStoreFence();
            h16Var.f20269b = runnableC1029pc;
            h16Var.f20270c = new ArrayDeque();
            h16Var.f20268a = cz5Var;
            VarHandle.storeStoreFence();
            i16Var.f21018b = h16Var;
            i16Var.f21035s = this;
            i16Var.f21036t = this.f15868c;
            i16Var.f21037u = this.f15869d;
            i16Var.f21029m = str;
            i16Var.f21019c = str4;
            i16Var.f21038v = j2;
            if (!"OPTIONS".equalsIgnoreCase(str2) && !"GET".equalsIgnoreCase(str2) && !"HEAD".equalsIgnoreCase(str2) && !"POST".equalsIgnoreCase(str2) && !"PUT".equalsIgnoreCase(str2) && !"DELETE".equalsIgnoreCase(str2) && !"TRACE".equalsIgnoreCase(str2) && !"PATCH".equalsIgnoreCase(str2)) {
                throw new IllegalArgumentException("Invalid http method ".concat(str2));
            }
            i16Var.f21025i = str2;
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                Map.Entry entry = (Map.Entry) arrayList2.get(i5);
                String str5 = (String) entry.getKey();
                for (int i6 = 0; i6 < str5.length(); i6++) {
                    char cCharAt = str5.charAt(i6);
                    if (cCharAt != ',' && cCharAt != '/' && cCharAt != '{' && cCharAt != '}') {
                        switch (cCharAt) {
                            case '\'':
                            case '(':
                            case ')':
                                break;
                            default:
                                switch (cCharAt) {
                                    case ':':
                                    case ';':
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                        break;
                                    default:
                                        switch (cCharAt) {
                                            case '[':
                                            case '\\':
                                            case ']':
                                                break;
                                            default:
                                                if (!Character.isISOControl(cCharAt) && !Character.isWhitespace(cCharAt)) {
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    }
                    throw new IllegalArgumentException("Invalid header with headername: ".concat(String.valueOf((String) entry.getKey())));
                }
                if (((String) entry.getValue()).contains("\r\n")) {
                    throw new IllegalArgumentException("Invalid header with headername: ".concat(String.valueOf((String) entry.getKey())));
                }
                i16Var.f21020d.put((String) entry.getKey(), (String) entry.getValue());
            }
            if (uploadDataProvider != null) {
                if (!i16Var.f21020d.containsKey("Content-Type")) {
                    throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                }
                cr5Var = new cr5(uploadDataProvider, (byte) 3);
            }
            i16Var.f21026j = cr5Var;
            if (bu3Var != null && !i16Var.f21024h) {
                bu3Var = new bu3(bu3Var);
            }
            i16Var.f21027k = bu3Var;
            Trace.endSection();
            VarHandle.storeStoreFence();
            return i16Var;
        } catch (Throwable th) {
            try {
                Trace.endSection();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public final void bindToNetwork(long j) {
        this.f15871f = j;
    }

    @Override // org.chromium.net.CronetEngine
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new qw5();
    }

    @Override // org.chromium.net.CronetEngine
    public final int getActiveRequestCount() {
        return this.f15870e.get();
    }

    @Override // org.chromium.net.CronetEngine
    public final int getDownstreamThroughputKbps() {
        return -1;
    }

    @Override // org.chromium.net.CronetEngine
    public final int getEffectiveConnectionType() {
        return 0;
    }

    @Override // org.chromium.net.CronetEngine
    public final byte[] getGlobalMetricsDeltas() {
        return new byte[0];
    }

    @Override // org.chromium.net.CronetEngine
    public final int getHttpRttMs() {
        return -1;
    }

    @Override // org.chromium.net.CronetEngine
    public final int getTransportRttMs() {
        return -1;
    }

    @Override // org.chromium.net.CronetEngine
    public final String getVersionString() {
        return "CronetHttpURLConnection/".concat(ImplVersion.getCronetVersionWithLastChange());
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        throw new UnsupportedOperationException("The bidirectional stream API is not supported by the Java implementation of Cronet Engine");
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* bridge */ /* synthetic */ UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return newUrlRequestBuilder(str, callback, executor);
    }

    @Override // org.chromium.net.CronetEngine
    public final URLConnection openConnection(URL url) {
        return url.openConnection();
    }

    @Override // org.chromium.net.CronetEngine
    public final void shutdown() {
        this.f15867b.shutdown();
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final URLConnection openConnection(URL url, Proxy proxy) {
        return url.openConnection(proxy);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final /* bridge */ /* synthetic */ BidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        newBidirectionalStreamBuilder(str, callback, executor);
        throw null;
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void stopNetLog() {
    }

    @Override // org.chromium.net.CronetEngine
    public final void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToDisk(String str, boolean z, int i) {
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToFile(String str, boolean z) {
    }
}
