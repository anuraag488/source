package p000;

import android.net.http.X509TrustManagerExtensions;
import android.security.NetworkSecurityPolicy;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: qb */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1065qb extends hb3 {

    /* JADX INFO: renamed from: d */
    public static final boolean f28349d = sc6.m10635G();

    /* JADX INFO: renamed from: c */
    public ArrayList f28350c;

    @Override // p000.hb3
    /* JADX INFO: renamed from: b */
    public final n40 mo6328b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        C1399zb c1399zb = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            c1399zb = new C1399zb();
            c1399zb.f35908j = x509TrustManager;
            c1399zb.f35909k = x509TrustManagerExtensions;
            VarHandle.storeStoreFence();
        }
        return c1399zb != null ? c1399zb : super.mo6328b(x509TrustManager);
    }

    @Override // p000.hb3
    /* JADX INFO: renamed from: c */
    public final void mo4282c(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        ArrayList arrayList = this.f28350c;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            } else {
                obj = arrayList.get(i);
                i++;
            }
        } while (!((ca4) obj).mo3933a(sSLSocket));
        ca4 ca4Var = (ca4) obj;
        if (ca4Var != null) {
            ca4Var.mo3936d(sSLSocket, str, list);
        }
    }

    @Override // p000.hb3
    /* JADX INFO: renamed from: d */
    public final String mo4283d(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.f28350c;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
        } while (!((ca4) obj).mo3933a(sSLSocket));
        ca4 ca4Var = (ca4) obj;
        if (ca4Var != null) {
            return ca4Var.mo3934b(sSLSocket);
        }
        return null;
    }

    @Override // p000.hb3
    /* JADX INFO: renamed from: e */
    public final boolean mo6329e(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
