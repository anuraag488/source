package p000;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m26 extends UrlResponseInfo {

    /* JADX INFO: renamed from: a */
    public List f24600a;

    /* JADX INFO: renamed from: b */
    public int f24601b;

    /* JADX INFO: renamed from: c */
    public String f24602c;

    /* JADX INFO: renamed from: d */
    public String f24603d;

    /* JADX INFO: renamed from: e */
    public String f24604e;

    /* JADX INFO: renamed from: f */
    public AtomicLong f24605f;

    /* JADX INFO: renamed from: g */
    public i26 f24606g;

    @Override // org.chromium.net.UrlResponseInfo
    public final Map getAllHeaders() {
        return this.f24606g.getAsMap();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getAllHeadersAsList() {
        return this.f24606g.f21085a;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final int getHttpStatusCode() {
        return this.f24601b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getHttpStatusText() {
        return this.f24602c;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getNegotiatedProtocol() {
        return this.f24603d;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getProxyServer() {
        return this.f24604e;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final long getReceivedByteCount() {
        return this.f24605f.get();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getUrl() {
        List list = this.f24600a;
        return (String) list.get(list.size() - 1);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getUrlChain() {
        return this.f24600a;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        List list = this.f24600a;
        String str = (String) list.get(list.size() - 1);
        String string = list.toString();
        int i = this.f24601b;
        String str2 = this.f24602c;
        String string2 = this.f24606g.f21085a.toString();
        String str3 = this.f24603d;
        String str4 = this.f24604e;
        long j = this.f24605f.get();
        StringBuilder sbM13625y = zi4.m13625y("UrlResponseInfo@[", hexString, "][", str, "]: urlChain = ");
        sbM13625y.append(string);
        sbM13625y.append(", httpStatus = ");
        sbM13625y.append(i);
        sbM13625y.append(" ");
        zi4.m13599B(sbM13625y, str2, ", headers = ", string2, ", wasCached = false, negotiatedProtocol = ");
        zi4.m13599B(sbM13625y, str3, ", proxyServer= ", str4, ", receivedByteCount = ");
        sbM13625y.append(j);
        return sbM13625y.toString();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final boolean wasCached() {
        return false;
    }
}
