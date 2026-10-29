package org.chromium.net;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p000.C1077qn;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ProxyOptions {
    public static final int ALL_PROXIES_FAILED_BEHAVIOR_ALLOW_DIRECT = 1;
    public static final int ALL_PROXIES_FAILED_BEHAVIOR_DISALLOW_DIRECT = 0;
    private final List<Proxy> mProxyList;

    /* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
    @Retention(RetentionPolicy.SOURCE)
    public @interface AllProxiesFailedBehavior {
    }

    private ProxyOptions(List<Proxy> list) {
        Objects.requireNonNull(list);
        if (list.isEmpty()) {
            C1077qn.m9987m("ProxyList cannot be empty");
            throw null;
        }
        int iIndexOf = list.indexOf(null);
        if (iIndexOf == -1 || iIndexOf == list.size() - 1) {
            this.mProxyList = Collections.unmodifiableList(list);
        } else {
            C1077qn.m9987m("Null is allowed only as the last element in the proxy list");
            throw null;
        }
    }

    public static ProxyOptions fromProxyList(List<Proxy> list, int i) {
        Objects.requireNonNull(list);
        if (list.isEmpty()) {
            C1077qn.m9987m("proxyList cannot be empty");
            return null;
        }
        if (list.contains(null)) {
            C1077qn.m9987m("proxyList cannot contain null");
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        if (i == 1) {
            arrayList.add(null);
        }
        return new ProxyOptions(arrayList);
    }

    public List<Proxy> getProxyList() {
        return this.mProxyList;
    }
}
