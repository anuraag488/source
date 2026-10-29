package org.chromium.net;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ChromiumNetworkAdapter {
    private ChromiumNetworkAdapter() {
    }

    public static URLConnection openConnection(URL url, java.net.Proxy proxy, NetworkTrafficAnnotationTag networkTrafficAnnotationTag) {
        return url.openConnection(proxy);
    }

    public static InputStream openStream(URL url, NetworkTrafficAnnotationTag networkTrafficAnnotationTag) {
        return url.openStream();
    }

    public static URLConnection openConnection(URL url, NetworkTrafficAnnotationTag networkTrafficAnnotationTag) {
        return url.openConnection();
    }
}
