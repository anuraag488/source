package p000;

import android.content.Context;
import android.os.Trace;
import android.util.Log;
import java.io.File;
import java.lang.invoke.VarHandle;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.ProxyOptions;
import org.chromium.net.VersionSafeProxyOptions;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tw5 extends gr0 {

    /* JADX INFO: renamed from: s */
    public static final AtomicLong f31502s = new AtomicLong(0);

    @Override // org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        m6102a(str, set, z, date);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        m6103b(i, str, i2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        if (this.f20065f == null) {
            this.f20065f = getDefaultUserAgent();
        }
        c82 c82Var = new c82();
        c82Var.f15870e = new AtomicInteger();
        c82Var.f15871f = -1L;
        ry5.m10503a("JavaCronetEngine#JavaCronetEngine");
        try {
            Context context = this.f20061b;
            c82Var.f15872g = context;
            int iHashCode = c82Var.hashCode();
            c82Var.f15868c = iHashCode;
            c82Var.f15866a = this.f20065f;
            c82Var.f15867b = new ThreadPoolExecutor(10, 10, 50L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new io3((byte) 1));
            nr0 nr0Var = nr0.CRONET_SOURCE_FALLBACK;
            dt0 dt0VarM7599F = ks5.m7599F(context, nr0Var);
            c82Var.f15869d = dt0VarM7599F;
            try {
                dt0VarM7599F.mo4109I(iHashCode, m6106e(), new pr0(c82Var.getVersionString().split("/")[1].split("@")[0]), nr0Var);
            } catch (RuntimeException e) {
                Log.e("cn_".concat("c82"), "Error while trying to log JavaCronetEngine creation: ", e);
            }
            Log.w("cn_".concat("c82"), "using the fallback Cronet Engine implementation. Performance will suffer and many HTTP client features, including caching, will not work.");
            Trace.endSection();
            VarHandle.storeStoreFence();
            return c82Var;
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

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableBrotli(boolean z) {
        this.f20069j = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttp2(boolean z) {
        this.f20068i = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        m6104c(i, j);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.f20073n = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.f20064e = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableQuic(boolean z) {
        this.f20067h = z;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final long getLogCronetInitializationRef() {
        long jMo4725C = this.f20060a.mo4725C();
        AtomicLong atomicLong = f31502s;
        atomicLong.compareAndSet(0L, jMo4725C);
        return atomicLong.get();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setExperimentalOptions(String str) {
        this.f20072m = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setProxyOptionsV2(ProxyOptions proxyOptions) {
        this.f20074o = new VersionSafeProxyOptions(proxyOptions);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setStoragePath(String str) {
        if (new File(str).isDirectory()) {
            this.f20066g = str;
            return this;
        }
        C1077qn.m9987m("Storage path must be set to existing directory");
        return null;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setUserAgent(String str) {
        this.f20065f = str;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }
}
