package p000;

import android.content.Context;
import android.net.http.ConnectionMigrationOptions;
import android.net.http.DnsOptions;
import android.net.http.HttpEngine;
import android.net.http.QuicOptions;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.time.Duration;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.chromium.net.AndroidProxyOptions;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.ProxyOptions;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y06 extends ICronetEngineBuilder {

    /* JADX INFO: renamed from: d */
    public static boolean f34797d;

    /* JADX INFO: renamed from: a */
    public boolean f34798a;

    /* JADX INFO: renamed from: b */
    public Context f34799b;

    /* JADX INFO: renamed from: c */
    public HttpEngine.Builder f34800c;

    /* JADX INFO: renamed from: a */
    public static int m12814a(int i) {
        int i2 = i - 1;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                return 0;
            }
        }
        return i3;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        this.f34800c.addPublicKeyPins(str, set, z, date.toInstant());
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        this.f34800c.addQuicHint(str, i, i2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        if (!this.f34798a) {
            setUserAgent(getDefaultUserAgent());
        }
        HttpEngine httpEngineBuild = this.f34800c.build();
        v76 v76Var = new v76();
        v76Var.f32454b = Collections.synchronizedMap(new HashMap());
        v76Var.f32453a = httpEngineBuild;
        VarHandle.storeStoreFence();
        return v76Var;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableBrotli(boolean z) {
        this.f34800c.setEnableBrotli(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttp2(boolean z) {
        this.f34800c.setEnableHttp2(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttpCache(int i, long j) {
        this.f34800c.setEnableHttpCache(i, j);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        if (!f34797d) {
            Log.i("cn_HttpEngBuilderWrap", "NetworkQualityEstimator is unsupported when HttpEngineNativeProvider is used");
            f34797d = true;
        }
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.f34800c.setEnablePublicKeyPinningBypassForLocalTrustAnchors(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableQuic(boolean z) {
        this.f34800c.setEnableQuic(z);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        return zc6.m13515L(this.f34799b, nr0.CRONET_SOURCE_PLATFORM, HttpEngine.getVersionString());
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final Set getSupportedConfigOptions() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setExperimentalOptions(String str) {
        kq5 kq5Var = new kq5(str);
        ConnectionMigrationOptions.Builder builder = new ConnectionMigrationOptions.Builder();
        builder.setDefaultNetworkMigration(m12814a(x46.m12482a((Boolean) kq5Var.m7576a("QUIC", "migrate_sessions_on_network_change_v2", null, Boolean.class))));
        builder.setPathDegradationMigration(m12814a(x46.m12482a((Boolean) kq5Var.m7576a("QUIC", "allow_port_migration", null, Boolean.class))));
        int iM12482a = x46.m12482a((Boolean) kq5Var.m7576a("QUIC", "migrate_sessions_early_v2", null, Boolean.class));
        builder.setAllowNonDefaultNetworkUsage(m12814a(iM12482a));
        if (iM12482a == 2) {
            builder.setPathDegradationMigration(m12814a(2));
        }
        HttpEngine.Builder builder2 = this.f34800c;
        builder2.setConnectionMigrationOptions(builder.build());
        DnsOptions.StaleDnsOptions.Builder builder3 = new DnsOptions.StaleDnsOptions.Builder();
        int iIntValue = ((Integer) kq5Var.m7576a("StaleDNS", "delay_ms", -1, Integer.class)).intValue();
        if (iIntValue != -1) {
            builder3.setFreshLookupTimeout(Duration.ofMillis(iIntValue));
        }
        int iIntValue2 = ((Integer) kq5Var.m7576a("StaleDNS", "max_expired_time_ms", -1, Integer.class)).intValue();
        if (iIntValue2 != -1) {
            builder3.setMaxExpiredDelay(Duration.ofMillis(iIntValue2));
        }
        builder3.setAllowCrossNetworkUsage(m12814a(x46.m12482a((Boolean) kq5Var.m7576a("StaleDNS", "allow_other_network", null, Boolean.class)))).setUseStaleOnNameNotResolved(m12814a(x46.m12482a((Boolean) kq5Var.m7576a("StaleDNS", "use_stale_on_name_not_resolved", null, Boolean.class))));
        DnsOptions.Builder builder4 = new DnsOptions.Builder();
        builder4.setUseHttpStackDnsResolver(m12814a(x46.m12482a((Boolean) kq5Var.m7576a("AsyncDNS", "enable", null, Boolean.class)))).setStaleDns(m12814a(x46.m12482a((Boolean) kq5Var.m7576a("StaleDNS", "enable", null, Boolean.class)))).setStaleDnsOptions(builder3.build()).setPreestablishConnectionsToStaleDnsResults(m12814a(x46.m12482a((Boolean) kq5Var.m7576a("QUIC", "race_stale_dns_on_connection", null, Boolean.class)))).setPersistHostCache(m12814a(x46.m12482a((Boolean) kq5Var.m7576a("StaleDNS", "persist_to_disk", null, Boolean.class))));
        int iIntValue3 = ((Integer) kq5Var.m7576a("StaleDNS", "persist_delay_ms", -1, Integer.class)).intValue();
        if (iIntValue3 != -1) {
            builder4.setPersistHostCachePeriod(Duration.ofMillis(iIntValue3));
        }
        builder2.setDnsOptions(builder4.build());
        QuicOptions.Builder builder5 = new QuicOptions.Builder();
        if (((String) kq5Var.m7576a("QUIC", "host_whitelist", null, String.class)) != null) {
            for (String str2 : ((String) kq5Var.m7576a("QUIC", "host_whitelist", null, String.class)).split(",")) {
                builder5.addAllowedQuicHost(str2);
            }
        }
        int iIntValue4 = ((Integer) kq5Var.m7576a("QUIC", "max_server_configs_stored_in_properties", -1, Integer.class)).intValue();
        if (iIntValue4 != -1) {
            builder5.setInMemoryServerConfigsCacheSize(iIntValue4);
        }
        String str3 = (String) kq5Var.m7576a("QUIC", "user_agent_id", null, String.class);
        if (str3 != null) {
            builder5.setHandshakeUserAgent(str3);
        }
        int iIntValue5 = ((Integer) kq5Var.m7576a("QUIC", "idle_connection_timeout_seconds", -1, Integer.class)).intValue();
        if (iIntValue5 != -1) {
            builder5.setIdleConnectionTimeout(Duration.ofSeconds(iIntValue5));
        }
        builder2.setQuicOptions(builder5.build());
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setProxyOptionsV2(ProxyOptions proxyOptions) {
        AndroidProxyOptions.apply(this.f34800c, proxyOptions);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setStoragePath(String str) {
        this.f34800c.setStoragePath(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setUserAgent(String str) {
        this.f34800c.setUserAgent(str);
        this.f34798a = str != null;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }
}
