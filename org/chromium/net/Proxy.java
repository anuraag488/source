package org.chromium.net;

import android.util.Pair;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p000.C1077qn;
import p000.c75;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class Proxy {
    public static final int SCHEME_HTTP = 0;
    public static final int SCHEME_HTTPS = 1;
    private final HttpConnectCallback mCallback;
    private final Executor mExecutor;
    private final String mHost;
    private final int mPort;
    private final int mScheme;

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    public static abstract class HttpConnectCallback {
        public static final int RESPONSE_ACTION_CLOSE = 0;
        public static final int RESPONSE_ACTION_PROCEED = 1;

        /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
        @Retention(RetentionPolicy.SOURCE)
        public @interface OnResponseReceivedAction {
        }

        /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
        public static abstract class Request implements AutoCloseable {
            @Override // java.lang.AutoCloseable
            public abstract void close();

            public abstract void proceed(List<Pair<String, String>> list);
        }

        public abstract void onBeforeRequest(Request request);

        public abstract int onResponseReceived(List<Pair<String, String>> list, int i);
    }

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Scheme {
    }

    private Proxy(int i, String str, int i2, Executor executor, HttpConnectCallback httpConnectCallback) {
        if (i != 0 && i != 1) {
            C1077qn.m9987m(c75.m3877i(i, "Unknown scheme "));
            throw null;
        }
        if (str.equals("")) {
            C1077qn.m9987m("host cannot be an empty string");
            throw null;
        }
        if (i2 < 0 || i2 > 65535) {
            throw new IllegalArgumentException(String.format("port must be within [0, 65535] but it was: %d", Integer.valueOf(i2)));
        }
        this.mScheme = i;
        this.mHost = str;
        this.mPort = i2;
        Objects.requireNonNull(executor);
        this.mExecutor = executor;
        Objects.requireNonNull(httpConnectCallback);
        this.mCallback = httpConnectCallback;
    }

    public static Proxy createHttpProxy(int i, String str, int i2, Executor executor, HttpConnectCallback httpConnectCallback) {
        return new Proxy(i, str, i2, executor, httpConnectCallback);
    }

    public HttpConnectCallback getCallback() {
        return this.mCallback;
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public String getHost() {
        return this.mHost;
    }

    public int getPort() {
        return this.mPort;
    }

    public int getScheme() {
        return this.mScheme;
    }
}
