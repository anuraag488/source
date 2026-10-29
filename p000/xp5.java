package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xp5 extends ur1 {
    public static final int BROTLI_ENABLED_FIELD_NUMBER = 6;
    public static final int BYPASS_PUBLIC_KEY_PINNING_FOR_LOCAL_TRUST_ANCHORS_FIELD_NUMBER = 13;
    private static final xp5 DEFAULT_INSTANCE;
    public static final int DISABLE_CACHE_FIELD_NUMBER = 7;
    public static final int ENABLE_NETWORK_QUALITY_ESTIMATOR_FIELD_NUMBER = 12;
    public static final int EXPERIMENTAL_OPTIONS_FIELD_NUMBER = 10;
    public static final int HTTP2_ENABLED_FIELD_NUMBER = 5;
    public static final int HTTP_CACHE_MAX_SIZE_FIELD_NUMBER = 9;
    public static final int HTTP_CACHE_MODE_FIELD_NUMBER = 8;
    public static final int MOCK_CERT_VERIFIER_FIELD_NUMBER = 11;
    public static final int NETWORK_THREAD_PRIORITY_FIELD_NUMBER = 14;
    private static volatile yu5 PARSER = null;
    public static final int PROXY_OPTIONS_FIELD_NUMBER = 15;
    public static final int QUIC_DEFAULT_USER_AGENT_ID_FIELD_NUMBER = 4;
    public static final int QUIC_ENABLED_FIELD_NUMBER = 3;
    public static final int STORAGE_PATH_FIELD_NUMBER = 2;
    public static final int USER_AGENT_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean brotliEnabled_;
    private boolean bypassPublicKeyPinningForLocalTrustAnchors_;
    private boolean disableCache_;
    private boolean enableNetworkQualityEstimator_;
    private boolean http2Enabled_;
    private long httpCacheMaxSize_;
    private int httpCacheMode_;
    private long mockCertVerifier_;
    private int networkThreadPriority_;
    private hp5 proxyOptions_;
    private boolean quicEnabled_;
    private String userAgent_ = "";
    private String storagePath_ = "";
    private String quicDefaultUserAgentId_ = "";
    private String experimentalOptions_ = "";

    static {
        xp5 xp5Var = new xp5();
        DEFAULT_INSTANCE = xp5Var;
        ur1.m11628e(xp5.class, xp5Var);
    }

    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ void m12730A(xp5 xp5Var, String str) {
        str.getClass();
        xp5Var.bitField0_ |= 1;
        xp5Var.userAgent_ = str;
    }

    /* JADX INFO: renamed from: l */
    public static pp5 m12731l() {
        return (pp5) ((gq5) DEFAULT_INSTANCE.mo5307i(5));
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ void m12732m(xp5 xp5Var, boolean z) {
        xp5Var.bitField0_ |= 32;
        xp5Var.brotliEnabled_ = z;
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m12733n(xp5 xp5Var, boolean z) {
        xp5Var.bitField0_ |= 4096;
        xp5Var.bypassPublicKeyPinningForLocalTrustAnchors_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m12734o(xp5 xp5Var, boolean z) {
        xp5Var.bitField0_ |= 64;
        xp5Var.disableCache_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m12735p(xp5 xp5Var, boolean z) {
        xp5Var.bitField0_ |= 2048;
        xp5Var.enableNetworkQualityEstimator_ = z;
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m12736q(xp5 xp5Var, String str) {
        xp5Var.bitField0_ |= 512;
        xp5Var.experimentalOptions_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m12737r(xp5 xp5Var, boolean z) {
        xp5Var.bitField0_ |= 16;
        xp5Var.http2Enabled_ = z;
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m12738s(xp5 xp5Var, long j) {
        xp5Var.bitField0_ |= 256;
        xp5Var.httpCacheMaxSize_ = j;
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ void m12739t(xp5 xp5Var, int i) {
        xp5Var.bitField0_ |= 128;
        xp5Var.httpCacheMode_ = i;
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ void m12740u(xp5 xp5Var) {
        xp5Var.bitField0_ |= 1024;
        xp5Var.mockCertVerifier_ = 0L;
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ void m12741v(xp5 xp5Var, int i) {
        xp5Var.bitField0_ |= 8192;
        xp5Var.networkThreadPriority_ = i;
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ void m12742w(xp5 xp5Var, hp5 hp5Var) {
        hp5Var.getClass();
        xp5Var.proxyOptions_ = hp5Var;
        xp5Var.bitField0_ |= 16384;
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ void m12743x(xp5 xp5Var, String str) {
        xp5Var.bitField0_ |= 8;
        xp5Var.quicDefaultUserAgentId_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ void m12744y(xp5 xp5Var, boolean z) {
        xp5Var.bitField0_ |= 4;
        xp5Var.quicEnabled_ = z;
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ void m12745z(xp5 xp5Var, String str) {
        str.getClass();
        xp5Var.bitField0_ |= 2;
        xp5Var.storagePath_ = str;
    }

    @Override // p000.ur1
    /* JADX INFO: renamed from: i */
    public final Object mo5307i(int i) {
        yu5 lq5Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return ur1.m11631k(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007\tဂ\b\nဈ\t\u000bဂ\n\fဇ\u000b\rဇ\f\u000eင\r\u000fဉ\u000e", new Object[]{"bitField0_", "userAgent_", "storagePath_", "quicEnabled_", "quicDefaultUserAgentId_", "http2Enabled_", "brotliEnabled_", "disableCache_", "httpCacheMode_", "httpCacheMaxSize_", "experimentalOptions_", "mockCertVerifier_", "enableNetworkQualityEstimator_", "bypassPublicKeyPinningForLocalTrustAnchors_", "networkThreadPriority_", "proxyOptions_"});
        }
        if (i2 == 3) {
            return new xp5();
        }
        if (i2 == 4) {
            return new pp5(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        if (i2 != 6) {
            throw null;
        }
        yu5 yu5Var = PARSER;
        if (yu5Var != null) {
            return yu5Var;
        }
        synchronized (xp5.class) {
            try {
                lq5Var = PARSER;
                if (lq5Var == null) {
                    lq5Var = new lq5(DEFAULT_INSTANCE);
                    PARSER = lq5Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return lq5Var;
    }
}
