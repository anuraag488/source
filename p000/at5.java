package p000;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import org.chromium.net.impl.CronetUrlRequestContext;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class at5 extends URLStreamHandler {

    /* JADX INFO: renamed from: a */
    public CronetUrlRequestContext f14864a;

    @Override // java.net.URLStreamHandler
    public final URLConnection openConnection(URL url) {
        return this.f14864a.openConnection(url);
    }

    @Override // java.net.URLStreamHandler
    public final URLConnection openConnection(URL url, Proxy proxy) {
        return this.f14864a.openConnection(url, proxy);
    }
}
