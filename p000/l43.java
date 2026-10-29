package p000;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.openjsse.net.ssl.OpenJSSE;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l43 extends hb3 {

    /* JADX INFO: renamed from: d */
    public static final boolean f23781d;

    /* JADX INFO: renamed from: c */
    public final Provider f23782c = new OpenJSSE();

    static {
        boolean z = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, k43.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f23781d = z;
    }

    @Override // p000.hb3
    /* JADX INFO: renamed from: d */
    public final String mo4283d(SSLSocket sSLSocket) {
        return null;
    }

    @Override // p000.hb3
    /* JADX INFO: renamed from: g */
    public final SSLContext mo4284g() {
        return SSLContext.getInstance("TLSv1.3", this.f23782c);
    }

    @Override // p000.hb3
    /* JADX INFO: renamed from: i */
    public final X509TrustManager mo4285i() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f23782c);
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        xy4.m12780h("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)));
        return null;
    }

    @Override // p000.hb3
    /* JADX INFO: renamed from: c */
    public final void mo4282c(SSLSocket sSLSocket, String str, List list) {
    }
}
