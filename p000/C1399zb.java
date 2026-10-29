package p000;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: zb */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1399zb extends n40 {

    /* JADX INFO: renamed from: j */
    public X509TrustManager f35908j;

    /* JADX INFO: renamed from: k */
    public X509TrustManagerExtensions f35909k;

    public final boolean equals(Object obj) {
        return (obj instanceof C1399zb) && ((C1399zb) obj).f35908j == this.f35908j;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f35908j);
    }

    @Override // p000.n40
    /* JADX INFO: renamed from: j */
    public final List mo4796j(String str, List list) throws SSLPeerUnverifiedException {
        try {
            return this.f35909k.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
