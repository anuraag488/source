package p000;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xk0 extends hb3 {

    /* JADX INFO: renamed from: d */
    public static final boolean f34325d;

    /* JADX INFO: renamed from: c */
    public final Provider f34326c = Conscrypt.newProvider();

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, vk0.class.getClassLoader());
            if (Conscrypt.isAvailable() && vk0.m11923a()) {
                z = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f34325d = z;
    }

    @Override // p000.hb3
    /* JADX INFO: renamed from: c */
    public final void mo4282c(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((wh3) obj) != wh3.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(ib0.m6717y0(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                arrayList2.add(((wh3) obj2).f33392a);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) arrayList2.toArray(new String[0]));
        }
    }

    @Override // p000.hb3
    /* JADX INFO: renamed from: d */
    public final String mo4283d(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p000.hb3
    /* JADX INFO: renamed from: g */
    public final SSLContext mo4284g() {
        return SSLContext.getInstance("TLS", this.f34326c);
    }

    @Override // p000.hb3
    /* JADX INFO: renamed from: h */
    public final SSLSocketFactory mo6330h(X509TrustManager x509TrustManager) throws KeyManagementException {
        SSLContext sSLContextMo4284g = mo4284g();
        sSLContextMo4284g.init(null, new TrustManager[]{x509TrustManager}, null);
        return sSLContextMo4284g.getSocketFactory();
    }

    @Override // p000.hb3
    /* JADX INFO: renamed from: i */
    public final X509TrustManager mo4285i() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, wk0.f33442a);
                return x509TrustManager;
            }
        }
        xy4.m12780h("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)));
        return null;
    }
}
