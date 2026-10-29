package p000;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class d20 extends hb3 {

    /* JADX INFO: renamed from: d */
    public static final boolean f16739d;

    /* JADX INFO: renamed from: c */
    public final Provider f16740c = new BouncyCastleJsseProvider();

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, c20.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f16739d = z;
    }

    @Override // p000.hb3
    /* JADX INFO: renamed from: d */
    public final String mo4283d(SSLSocket sSLSocket) {
        return null;
    }

    @Override // p000.hb3
    /* JADX INFO: renamed from: g */
    public final SSLContext mo4284g() {
        return SSLContext.getInstance("TLS", this.f16740c);
    }

    @Override // p000.hb3
    /* JADX INFO: renamed from: i */
    public final X509TrustManager mo4285i() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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
