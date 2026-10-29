package org.chromium.net;

import android.content.Context;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p000.nt5;
import p000.tn5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExperimentalCronetEngine extends CronetEngine {
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;
    private static final String SHOULD_OVERRIDE_WITH_HTTPENGINE = "Cronet_OverrideWithHttpEngine";
    public static final long UNBIND_NETWORK_HANDLE = -1;

    public static boolean shouldOverrideWithHttpEngine(Context context) {
        tn5 tn5Var = (tn5) Collections.unmodifiableMap(nt5.m8845a(context).f35372a).get(SHOULD_OVERRIDE_WITH_HTTPENGINE);
        return tn5Var != null && tn5Var.m11072c();
    }

    @Override // org.chromium.net.CronetEngine
    public abstract ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor);

    @Override // org.chromium.net.CronetEngine
    public abstract ExperimentalUrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor);

    public URLConnection openConnection(URL url, java.net.Proxy proxy) {
        return url.openConnection(proxy);
    }

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    public static class Builder extends CronetEngine.Builder {
        public Builder(Context context) {
            super(context);
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public /* bridge */ /* synthetic */ CronetEngine.Builder addPublicKeyPins(String str, Set set, boolean z, Date date) {
            return addPublicKeyPins(str, (Set<byte[]>) set, z, date);
        }

        public ICronetEngineBuilder getBuilderDelegate() {
            return this.mBuilderDelegate;
        }

        public Builder setExperimentalOptions(String str) {
            JSONObject jSONObject = null;
            if (str != null && !str.isEmpty()) {
                try {
                    jSONObject = new JSONObject(str);
                } catch (JSONException e) {
                    throw new IllegalArgumentException("Experimental options parsing failed", e);
                }
            }
            this.mParsedExperimentalOptions = jSONObject;
            return this;
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            super(iCronetEngineBuilder);
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder addPublicKeyPins(String str, Set<byte[]> set, boolean z, Date date) {
            super.addPublicKeyPins(str, set, z, date);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder addQuicHint(String str, int i, int i2) {
            super.addQuicHint(str, i, i2);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public ExperimentalCronetEngine build() {
            return buildExperimental();
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enableHttp2(boolean z) {
            super.enableHttp2(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enableHttpCache(int i, long j) {
            super.enableHttpCache(i, j);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enableNetworkQualityEstimator(boolean z) {
            super.enableNetworkQualityEstimator(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            super.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enableQuic(boolean z) {
            super.enableQuic(z);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder enableSdch(boolean z) {
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder setConnectionMigrationOptions(ConnectionMigrationOptions connectionMigrationOptions) {
            super.setConnectionMigrationOptions(connectionMigrationOptions);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder setDnsOptions(DnsOptions dnsOptions) {
            super.setDnsOptions(dnsOptions);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        @Deprecated
        public Builder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder setQuicOptions(QuicOptions quicOptions) {
            super.setQuicOptions(quicOptions);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder setStoragePath(String str) {
            super.setStoragePath(str);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder setThreadPriority(int i) {
            super.setThreadPriority(i);
            return this;
        }

        @Override // org.chromium.net.CronetEngine.Builder
        public Builder setUserAgent(String str) {
            super.setUserAgent(str);
            return this;
        }
    }
}
