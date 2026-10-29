package p000;

import android.net.ProxyInfo;
import android.net.Uri;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hn5 {

    /* JADX INFO: renamed from: e */
    public static final hn5 f20731e = new hn5("", new String[0], 0, "");

    /* JADX INFO: renamed from: a */
    public final String f20732a;

    /* JADX INFO: renamed from: b */
    public final int f20733b;

    /* JADX INFO: renamed from: c */
    public final String f20734c;

    /* JADX INFO: renamed from: d */
    public final String[] f20735d;

    public hn5(String str, String[] strArr, int i, String str2) {
        this.f20732a = str;
        this.f20733b = i;
        this.f20734c = str2;
        this.f20735d = strArr;
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ hn5 m6459a(ProxyInfo proxyInfo) {
        if (proxyInfo == null) {
            return null;
        }
        String host = proxyInfo.getHost();
        if (host == null) {
            host = "";
        }
        Uri pacFileUrl = proxyInfo.getPacFileUrl();
        return new hn5(host, proxyInfo.getExclusionList(), proxyInfo.getPort(), Uri.EMPTY.equals(pacFileUrl) ? null : pacFileUrl.toString());
    }

    public final String toString() {
        String str = this.f20732a;
        if (!str.equals("localhost") && !str.isEmpty()) {
            str = "<redacted>";
        }
        Locale locale = Locale.US;
        String str2 = this.f20734c == null ? "null" : "\"<redacted>\"";
        StringBuilder sb = new StringBuilder("ProxyConfig [mHost=\"");
        sb.append(str);
        sb.append("\", mPort=");
        sb.append(this.f20733b);
        sb.append(", mPacUrl=");
        return zi4.m13623w(sb, str2, "]");
    }
}
