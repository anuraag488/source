package org.chromium.net;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p000.C1077qn;
import p000.bp5;
import p000.c75;
import p000.go5;
import p000.hp5;
import p000.r26;
import p000.to5;
import p000.v36;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class VersionSafeProxyOptions {
    private static final int SET_PROXY_OPTIONS_API_LEVEL = 49;
    private final ProxyOptions mBackend;

    public VersionSafeProxyOptions(ProxyOptions proxyOptions) {
        if (!apiContainsProxyOptionsClass()) {
            C1077qn.m9985k(c75.m3878j("This should have not been created: the Cronet API being used has an ApiLevel of ", r26.m10182a(), ", but setProxyOptions was added in ApiLevel 49"));
            throw null;
        }
        Objects.requireNonNull(proxyOptions);
        this.mBackend = proxyOptions;
        if (proxyOptions.getProxyList().isEmpty()) {
            C1077qn.m9985k("The list of proxies should never be empty, this is checked in the API layer");
            throw null;
        }
    }

    private static boolean apiContainsProxyOptionsClass() {
        return r26.m10182a() >= 49;
    }

    public List<v36> createProxyCallbackList() {
        ArrayList arrayList = new ArrayList();
        for (Proxy proxy : this.mBackend.getProxyList()) {
            v36 v36Var = null;
            if (proxy != null) {
                Executor executor = proxy.getExecutor();
                Proxy.HttpConnectCallback callback = proxy.getCallback();
                v36 v36Var2 = new v36();
                if (r26.m10182a() < 49) {
                    C1077qn.m9985k(c75.m3878j("This should not have been created: the Cronet API being used has an ApiLevel of ", r26.m10182a(), ", but ProxyCallback was added in ApiLevel 49"));
                    return null;
                }
                Objects.requireNonNull(executor);
                Objects.requireNonNull(callback);
                VarHandle.storeStoreFence();
                v36Var = v36Var2;
            }
            arrayList.add(v36Var);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public hp5 createProxyOptionsProto() {
        ProxyOptions proxyOptions = this.mBackend;
        bp5 bp5VarM6470l = hp5.m6470l();
        for (Proxy proxy : proxyOptions.getProxyList()) {
            go5 go5VarM11083l = to5.m11083l();
            if (proxy == null) {
                go5VarM11083l.m6062b();
                to5.m11086o((to5) go5VarM11083l.f20035b, 1);
            } else {
                String host = proxy.getHost();
                go5VarM11083l.m6062b();
                to5.m11084m((to5) go5VarM11083l.f20035b, host);
                int port = proxy.getPort();
                go5VarM11083l.m6062b();
                to5.m11085n((to5) go5VarM11083l.f20035b, port);
                int scheme = proxy.getScheme();
                if (scheme == 0) {
                    go5VarM11083l.m6062b();
                    to5.m11086o((to5) go5VarM11083l.f20035b, 2);
                } else {
                    if (scheme != 1) {
                        C1077qn.m9985k(c75.m3878j("Unknown Proxy.Scheme: ", scheme, ". This should have been caught by the API layer"));
                        return null;
                    }
                    go5VarM11083l.m6062b();
                    to5.m11086o((to5) go5VarM11083l.f20035b, 3);
                }
            }
            to5 to5Var = (to5) go5VarM11083l.m6061a();
            bp5VarM6470l.m6062b();
            hp5.m6471m((hp5) bp5VarM6470l.f20035b, to5Var);
        }
        return (hp5) bp5VarM6470l.m6061a();
    }
}
