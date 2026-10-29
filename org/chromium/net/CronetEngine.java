package org.chromium.net;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C1077qn;
import p000.dt0;
import p000.j56;
import p000.ks5;
import p000.lr0;
import p000.m36;
import p000.pr0;
import p000.rw5;
import p000.ry5;
import p000.xy4;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class CronetEngine {
    public static final int ACTIVE_REQUEST_COUNT_UNKNOWN = -1;
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;
    private static final String TAG = "CronetEngine";
    public static final long UNBIND_NETWORK_HANDLE = -1;

    public abstract URLStreamHandlerFactory createURLStreamHandlerFactory();

    public int getActiveRequestCount() {
        return -1;
    }

    public int getDownstreamThroughputKbps() {
        return -1;
    }

    public int getEffectiveConnectionType() {
        return 0;
    }

    @Deprecated
    public abstract byte[] getGlobalMetricsDeltas();

    public int getHttpRttMs() {
        return -1;
    }

    public int getTransportRttMs() {
        return -1;
    }

    public abstract String getVersionString();

    public BidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        throw new UnsupportedOperationException("Not implemented.");
    }

    public abstract UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor);

    public abstract URLConnection openConnection(URL url);

    public abstract void shutdown();

    public abstract void startNetLogToFile(String str, boolean z);

    public abstract void stopNetLog();

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    public static class Builder {
        public static final int HTTP_CACHE_DISABLED = 0;
        public static final int HTTP_CACHE_DISK = 3;
        public static final int HTTP_CACHE_DISK_NO_HTTP = 2;
        public static final int HTTP_CACHE_IN_MEMORY = 1;
        private static final String TAG = "CronetEngine.Builder";
        protected final ICronetEngineBuilder mBuilderDelegate;
        private final List<j56> mExperimentalOptionsPatches;
        protected JSONObject mParsedExperimentalOptions;

        /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
        @Deprecated
        public static abstract class LibraryLoader {
            @Deprecated
            public abstract void loadLibrary(String str);
        }

        public Builder(ICronetEngineBuilder iCronetEngineBuilder) {
            this.mExperimentalOptionsPatches = new ArrayList();
            this.mBuilderDelegate = iCronetEngineBuilder;
        }

        private static ICronetEngineBuilder createBuilderDelegate(Context context) {
            ry5.m10503a("CronetEngine#createBuilderDelegate");
            try {
                long jUptimeMillis = SystemClock.uptimeMillis();
                m36 preferredCronetProvider = getPreferredCronetProvider(context, new ArrayList(CronetProvider.getAllProviderInfos(context)));
                dt0 dt0VarM7599F = ks5.m7599F(context, preferredCronetProvider.f24626c);
                lr0 lr0Var = new lr0();
                try {
                    lr0Var.f24302e = Boolean.FALSE;
                    lr0Var.f24299b = 1;
                    lr0Var.f24301d = preferredCronetProvider.f24626c;
                    lr0Var.f24305h = Process.myUid();
                    lr0Var.f24303f = new pr0(ApiVersion.getCronetVersion());
                    if (Log.isLoggable(TAG, 3)) {
                        rw5.m10480b(TAG, String.format("Using '%s' provider for creating CronetEngine.Builder.", preferredCronetProvider.f24624a), new Object[0]);
                    }
                    ICronetEngineBuilder iCronetEngineBuilder = preferredCronetProvider.f24624a.createBuilder().mBuilderDelegate;
                    String implCronetVersion = getImplCronetVersion(iCronetEngineBuilder);
                    if (implCronetVersion != null) {
                        lr0Var.f24304g = new pr0(implCronetVersion);
                    }
                    lr0Var.f24298a = iCronetEngineBuilder.getLogCronetInitializationRef();
                    lr0Var.f24302e = Boolean.TRUE;
                    lr0Var.f24300c = (int) (SystemClock.uptimeMillis() - jUptimeMillis);
                    dt0VarM7599F.mo4108H(lr0Var);
                    Trace.endSection();
                    return iCronetEngineBuilder;
                } catch (Throwable th) {
                    lr0Var.f24300c = (int) (SystemClock.uptimeMillis() - jUptimeMillis);
                    dt0VarM7599F.mo4108H(lr0Var);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    Trace.endSection();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        private static int getImplApiLevel(ICronetEngineBuilder iCronetEngineBuilder) {
            try {
                Method implVersionMethod = getImplVersionMethod(iCronetEngineBuilder, "getApiLevel");
                if (implVersionMethod == null) {
                    return -1;
                }
                return ((Integer) implVersionMethod.invoke(null, null)).intValue();
            } catch (ReflectiveOperationException e) {
                xy4.m12785n("Failed to retrieve Cronet impl API level", e);
                return 0;
            }
        }

        private static String getImplCronetVersion(ICronetEngineBuilder iCronetEngineBuilder) {
            try {
                Method implVersionMethod = getImplVersionMethod(iCronetEngineBuilder, "getCronetVersion");
                if (implVersionMethod == null) {
                    return null;
                }
                return (String) implVersionMethod.invoke(null, null);
            } catch (ReflectiveOperationException e) {
                xy4.m12785n("Failed to retrieve Cronet impl version", e);
                return null;
            }
        }

        private static Method getImplVersionMethod(ICronetEngineBuilder iCronetEngineBuilder, String str) {
            try {
                return iCronetEngineBuilder.getClass().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion").getMethod(str, null);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                return null;
            }
        }

        private int getMaximumApiLevel() {
            return 49;
        }

        public static m36 getPreferredCronetProvider(Context context, List<m36> list) {
            if (list.isEmpty()) {
                throw new RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
            }
            m36 preferredCronetProviderUsingScore = getPreferredCronetProviderUsingScore(list);
            if (preferredCronetProviderUsingScore != null) {
                return preferredCronetProviderUsingScore;
            }
            throw new RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
        }

        private static m36 getPreferredCronetProviderUsingScore(List<m36> list) {
            Collections.sort(list, new C0998c());
            for (m36 m36Var : list) {
                if (m36Var.f24624a.isEnabled()) {
                    return m36Var;
                }
            }
            return null;
        }

        public static void lambda$setConnectionMigrationOptions$0(ConnectionMigrationOptions connectionMigrationOptions, JSONObject jSONObject) throws JSONException {
            JSONObject jSONObjectM9247a = AbstractC0999d.m9247a("QUIC", jSONObject);
            if (connectionMigrationOptions.getEnableDefaultNetworkMigration() != null) {
                jSONObjectM9247a.put("migrate_sessions_on_network_change_v2", connectionMigrationOptions.getEnableDefaultNetworkMigration());
            }
            if (connectionMigrationOptions.getAllowServerMigration() != null) {
                jSONObjectM9247a.put("allow_server_migration", connectionMigrationOptions.getAllowServerMigration());
            }
            if (connectionMigrationOptions.getMigrateIdleConnections() != null) {
                jSONObjectM9247a.put("migrate_idle_sessions", connectionMigrationOptions.getMigrateIdleConnections());
            }
            if (connectionMigrationOptions.getIdleMigrationPeriodSeconds() != null) {
                jSONObjectM9247a.put("idle_session_migration_period_seconds", connectionMigrationOptions.getIdleMigrationPeriodSeconds());
            }
            if (connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork() != null) {
                jSONObjectM9247a.put("retry_on_alternate_network_before_handshake", connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork());
            }
            if (connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds() != null) {
                jSONObjectM9247a.put("max_time_on_non_default_network_seconds", connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds());
            }
            if (connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount() != null) {
                jSONObjectM9247a.put("max_migrations_to_non_default_network_on_path_degrading", connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount());
            }
            if (connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount() != null) {
                jSONObjectM9247a.put("max_migrations_to_non_default_network_on_write_error", connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount());
            }
            if (connectionMigrationOptions.getEnablePathDegradationMigration() != null) {
                boolean zBooleanValue = connectionMigrationOptions.getEnablePathDegradationMigration().booleanValue();
                jSONObjectM9247a.put("allow_port_migration", zBooleanValue);
                if (connectionMigrationOptions.getAllowNonDefaultNetworkUsage() != null) {
                    boolean zBooleanValue2 = connectionMigrationOptions.getAllowNonDefaultNetworkUsage().booleanValue();
                    if (!zBooleanValue && zBooleanValue2) {
                        C1077qn.m9987m("Unable to turn on non-default network usage without path degradation migration!");
                    } else if (!zBooleanValue || !zBooleanValue2) {
                        jSONObjectM9247a.put("migrate_sessions_early_v2", false);
                    } else {
                        jSONObjectM9247a.put("migrate_sessions_early_v2", true);
                        jSONObjectM9247a.put("migrate_sessions_on_network_change_v2", true);
                    }
                }
            }
        }

        public static void lambda$setDnsOptions$0(DnsOptions dnsOptions, JSONObject jSONObject) throws JSONException {
            JSONObject jSONObjectM9247a = AbstractC0999d.m9247a("AsyncDNS", jSONObject);
            if (dnsOptions.getUseBuiltInDnsResolver() != null) {
                jSONObjectM9247a.put("enable", dnsOptions.getUseBuiltInDnsResolver());
            }
            JSONObject jSONObjectM9247a2 = AbstractC0999d.m9247a("StaleDNS", jSONObject);
            if (dnsOptions.getEnableStaleDns() != null) {
                jSONObjectM9247a2.put("enable", dnsOptions.getEnableStaleDns());
            }
            if (dnsOptions.getPersistHostCache() != null) {
                jSONObjectM9247a2.put("persist_to_disk", dnsOptions.getPersistHostCache());
            }
            if (dnsOptions.getPersistHostCachePeriodMillis() != null) {
                jSONObjectM9247a2.put("persist_delay_ms", dnsOptions.getPersistHostCachePeriodMillis());
            }
            if (dnsOptions.getStaleDnsOptions() != null) {
                DnsOptions.StaleDnsOptions staleDnsOptions = dnsOptions.getStaleDnsOptions();
                if (staleDnsOptions.getAllowCrossNetworkUsage() != null) {
                    jSONObjectM9247a2.put("allow_other_network", staleDnsOptions.getAllowCrossNetworkUsage());
                }
                if (staleDnsOptions.getFreshLookupTimeoutMillis() != null) {
                    jSONObjectM9247a2.put("delay_ms", staleDnsOptions.getFreshLookupTimeoutMillis());
                }
                if (staleDnsOptions.getUseStaleOnNameNotResolved() != null) {
                    jSONObjectM9247a2.put("use_stale_on_name_not_resolved", staleDnsOptions.getUseStaleOnNameNotResolved());
                }
                if (staleDnsOptions.getMaxExpiredDelayMillis() != null) {
                    jSONObjectM9247a2.put("max_expired_time_ms", staleDnsOptions.getMaxExpiredDelayMillis());
                }
            }
            JSONObject jSONObjectM9247a3 = AbstractC0999d.m9247a("QUIC", jSONObject);
            if (dnsOptions.getPreestablishConnectionsToStaleDnsResults() != null) {
                jSONObjectM9247a3.put("race_stale_dns_on_connection", dnsOptions.getPreestablishConnectionsToStaleDnsResults());
            }
        }

        public static void lambda$setQuicOptions$0(QuicOptions quicOptions, JSONObject jSONObject) throws JSONException {
            JSONObject jSONObjectM9247a = AbstractC0999d.m9247a("QUIC", jSONObject);
            if (!quicOptions.getQuicHostAllowlist().isEmpty()) {
                jSONObjectM9247a.put("host_whitelist", ExperimentalOptionsTranslator$$ExternalSyntheticBackport0.m9246m(",", quicOptions.getQuicHostAllowlist()));
            }
            if (!quicOptions.getEnabledQuicVersions().isEmpty()) {
                jSONObjectM9247a.put("quic_version", ExperimentalOptionsTranslator$$ExternalSyntheticBackport0.m9246m(",", quicOptions.getEnabledQuicVersions()));
            }
            if (!quicOptions.getConnectionOptions().isEmpty()) {
                jSONObjectM9247a.put("connection_options", ExperimentalOptionsTranslator$$ExternalSyntheticBackport0.m9246m(",", quicOptions.getConnectionOptions()));
            }
            if (!quicOptions.getClientConnectionOptions().isEmpty()) {
                jSONObjectM9247a.put("client_connection_options", ExperimentalOptionsTranslator$$ExternalSyntheticBackport0.m9246m(",", quicOptions.getClientConnectionOptions()));
            }
            if (!quicOptions.getExtraQuicheFlags().isEmpty()) {
                jSONObjectM9247a.put("set_quic_flags", ExperimentalOptionsTranslator$$ExternalSyntheticBackport0.m9246m(",", quicOptions.getExtraQuicheFlags()));
            }
            if (quicOptions.getInMemoryServerConfigsCacheSize() != null) {
                jSONObjectM9247a.put("max_server_configs_stored_in_properties", quicOptions.getInMemoryServerConfigsCacheSize());
            }
            if (quicOptions.getHandshakeUserAgent() != null) {
                jSONObjectM9247a.put("user_agent_id", quicOptions.getHandshakeUserAgent());
            }
            if (quicOptions.getRetryWithoutAltSvcOnQuicErrors() != null) {
                jSONObjectM9247a.put("retry_without_alt_svc_on_quic_errors", quicOptions.getRetryWithoutAltSvcOnQuicErrors());
            }
            if (quicOptions.getEnableTlsZeroRtt() != null) {
                jSONObjectM9247a.put("disable_tls_zero_rtt", !quicOptions.getEnableTlsZeroRtt().booleanValue());
            }
            if (quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds() != null) {
                jSONObjectM9247a.put("max_idle_time_before_crypto_handshake_seconds", quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds());
            }
            if (quicOptions.getCryptoHandshakeTimeoutSeconds() != null) {
                jSONObjectM9247a.put("max_time_before_crypto_handshake_seconds", quicOptions.getCryptoHandshakeTimeoutSeconds());
            }
            if (quicOptions.getIdleConnectionTimeoutSeconds() != null) {
                jSONObjectM9247a.put("idle_connection_timeout_seconds", quicOptions.getIdleConnectionTimeoutSeconds());
            }
            if (quicOptions.getRetransmittableOnWireTimeoutMillis() != null) {
                jSONObjectM9247a.put("retransmittable_on_wire_timeout_milliseconds", quicOptions.getRetransmittableOnWireTimeoutMillis());
            }
            if (quicOptions.getCloseSessionsOnIpChange() != null) {
                jSONObjectM9247a.put("close_sessions_on_ip_change", quicOptions.getCloseSessionsOnIpChange());
            }
            if (quicOptions.getGoawaySessionsOnIpChange() != null) {
                jSONObjectM9247a.put("goaway_sessions_on_ip_change", quicOptions.getGoawaySessionsOnIpChange());
            }
            if (quicOptions.getInitialBrokenServicePeriodSeconds() != null) {
                jSONObjectM9247a.put("initial_delay_for_broken_alternative_service_seconds", quicOptions.getInitialBrokenServicePeriodSeconds());
            }
            if (quicOptions.getIncreaseBrokenServicePeriodExponentially() != null) {
                jSONObjectM9247a.put("exponential_backoff_on_initial_delay", quicOptions.getIncreaseBrokenServicePeriodExponentially());
            }
            if (quicOptions.getDelayJobsWithAvailableSpdySession() != null) {
                jSONObjectM9247a.put("delay_main_job_with_available_spdy_session", quicOptions.getDelayJobsWithAvailableSpdySession());
            }
        }

        private void maybeSetExperimentalOptions() {
            JSONObject jSONObject;
            List<j56> list = this.mExperimentalOptionsPatches;
            JSONObject jSONObject2 = this.mParsedExperimentalOptions;
            if (jSONObject2 == null && list.isEmpty()) {
                jSONObject = null;
            } else {
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                Iterator<j56> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().applyTo(jSONObject2);
                    } catch (JSONException e) {
                        throw new IllegalStateException("Unable to apply JSON patch!", e);
                    }
                }
                jSONObject = jSONObject2;
            }
            if (jSONObject != null) {
                this.mBuilderDelegate.setExperimentalOptions(jSONObject.toString());
            }
        }

        public Builder addPublicKeyPins(String str, Set<byte[]> set, boolean z, Date date) {
            this.mBuilderDelegate.addPublicKeyPins(str, set, z, date);
            return this;
        }

        public Builder addQuicHint(String str, int i, int i2) {
            this.mBuilderDelegate.addQuicHint(str, i, i2);
            return this;
        }

        public CronetEngine build() {
            return buildExperimental();
        }

        public ExperimentalCronetEngine buildExperimental() {
            int implApiLevel = getImplApiLevel(this.mBuilderDelegate);
            if (implApiLevel != -1 && implApiLevel < 49) {
                Log.w("cn_CronetEngine.Builder", "The implementation version is lower than the API version. Calls to methods added in API " + (implApiLevel + 1) + " and newer will likely have no effect.");
            }
            maybeSetExperimentalOptions();
            return this.mBuilderDelegate.build();
        }

        public Builder enableBrotli(boolean z) {
            this.mBuilderDelegate.enableBrotli(z);
            return this;
        }

        public Builder enableHttp2(boolean z) {
            this.mBuilderDelegate.enableHttp2(z);
            return this;
        }

        public Builder enableHttpCache(int i, long j) {
            this.mBuilderDelegate.enableHttpCache(i, j);
            return this;
        }

        public Builder enableNetworkQualityEstimator(boolean z) {
            this.mBuilderDelegate.enableNetworkQualityEstimator(z);
            return this;
        }

        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
            this.mBuilderDelegate.enablePublicKeyPinningBypassForLocalTrustAnchors(z);
            return this;
        }

        public Builder enableQuic(boolean z) {
            this.mBuilderDelegate.enableQuic(z);
            return this;
        }

        public String getDefaultUserAgent() {
            return this.mBuilderDelegate.getDefaultUserAgent();
        }

        public Builder setConnectionMigrationOptions(final ConnectionMigrationOptions connectionMigrationOptions) {
            if (this.mBuilderDelegate.getSupportedConfigOptions().contains(1)) {
                this.mBuilderDelegate.setConnectionMigrationOptions(connectionMigrationOptions);
                return this;
            }
            this.mExperimentalOptionsPatches.add(new j56() { // from class: org.chromium.net.CronetEngine$Builder$$ExternalSyntheticLambda1
                @Override // p000.j56
                public final void applyTo(JSONObject jSONObject) throws JSONException {
                    CronetEngine.Builder.lambda$setConnectionMigrationOptions$0(connectionMigrationOptions, jSONObject);
                }
            });
            return this;
        }

        public Builder setDnsOptions(final DnsOptions dnsOptions) {
            if (this.mBuilderDelegate.getSupportedConfigOptions().contains(2)) {
                this.mBuilderDelegate.setDnsOptions(dnsOptions);
                return this;
            }
            this.mExperimentalOptionsPatches.add(new j56() { // from class: org.chromium.net.CronetEngine$Builder$$ExternalSyntheticLambda2
                @Override // p000.j56
                public final void applyTo(JSONObject jSONObject) throws JSONException {
                    CronetEngine.Builder.lambda$setDnsOptions$0(dnsOptions, jSONObject);
                }
            });
            return this;
        }

        public Builder setProxyOptions(ProxyOptions proxyOptions) {
            Objects.requireNonNull(proxyOptions);
            this.mBuilderDelegate.setProxyOptionsV2(proxyOptions);
            return this;
        }

        public Builder setQuicOptions(final QuicOptions quicOptions) {
            if (this.mBuilderDelegate.getSupportedConfigOptions().contains(3)) {
                this.mBuilderDelegate.setQuicOptions(quicOptions);
                return this;
            }
            this.mExperimentalOptionsPatches.add(new j56() { // from class: org.chromium.net.CronetEngine$Builder$$ExternalSyntheticLambda0
                @Override // p000.j56
                public final void applyTo(JSONObject jSONObject) throws JSONException {
                    CronetEngine.Builder.lambda$setQuicOptions$0(quicOptions, jSONObject);
                }
            });
            return this;
        }

        public Builder setStoragePath(String str) {
            this.mBuilderDelegate.setStoragePath(str);
            return this;
        }

        @Deprecated
        public Builder setThreadPriority(int i) {
            this.mBuilderDelegate.setThreadPriority(i);
            return this;
        }

        public Builder setUserAgent(String str) {
            this.mBuilderDelegate.setUserAgent(str);
            return this;
        }

        public Builder(Context context) {
            this(createBuilderDelegate(context));
        }

        public Builder setConnectionMigrationOptions(ConnectionMigrationOptions.Builder builder) {
            return setConnectionMigrationOptions(builder.build());
        }

        public Builder setDnsOptions(DnsOptions.Builder builder) {
            return setDnsOptions(builder.build());
        }

        public Builder setQuicOptions(QuicOptions.Builder builder) {
            return setQuicOptions(builder.build());
        }

        @Deprecated
        public Builder enableSdch(boolean z) {
            return this;
        }

        @Deprecated
        public Builder setLibraryLoader(LibraryLoader libraryLoader) {
            return this;
        }
    }

    public void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void addRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void addThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void bindToNetwork(long j) {
    }

    public void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
    }

    public void removeRttListener(NetworkQualityRttListener networkQualityRttListener) {
    }

    public void removeThroughputListener(NetworkQualityThroughputListener networkQualityThroughputListener) {
    }

    public void configureNetworkQualityEstimatorForTesting(boolean z, boolean z2, boolean z3) {
    }

    public void startNetLogToDisk(String str, boolean z, int i) {
    }
}
