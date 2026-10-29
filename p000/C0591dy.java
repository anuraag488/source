package p000;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: dy */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0591dy extends n40 {

    /* JADX INFO: renamed from: j */
    public C1422zy f17488j;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0591dy) && ((C0591dy) obj).f17488j.equals(this.f17488j);
    }

    public final int hashCode() {
        return this.f17488j.hashCode();
    }

    @Override // p000.n40
    /* JADX INFO: renamed from: j */
    public final List mo4796j(String str, List list) throws SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        int i = 0;
        boolean z = false;
        while (i < 9) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            Set set = (Set) this.f17488j.f36457a.get(x509Certificate.getIssuerX500Principal());
            X509Certificate x509Certificate2 = null;
            Object obj = null;
            if (set != null) {
                for (Object obj2 : set) {
                    try {
                        x509Certificate.verify(((X509Certificate) obj2).getPublicKey());
                        obj = obj2;
                        break;
                    } catch (Exception unused) {
                    }
                }
                x509Certificate2 = (X509Certificate) obj;
            }
            if (x509Certificate2 != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(x509Certificate2)) {
                    arrayList.add(x509Certificate2);
                }
                if (z62.m13387o(x509Certificate2.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                    try {
                        x509Certificate2.verify(x509Certificate2.getPublicKey());
                        return arrayList;
                    } catch (GeneralSecurityException unused2) {
                    }
                }
                z = true;
                i++;
                z = z;
            } else {
                Iterator it = arrayDeque.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        if (!z) {
                            throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                        }
                        return arrayList;
                    }
                    X509Certificate x509Certificate3 = (X509Certificate) it.next();
                    if (z62.m13387o(x509Certificate.getIssuerDN(), x509Certificate3.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate3.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate3);
                            break;
                        } catch (GeneralSecurityException unused3) {
                            continue;
                        }
                    }
                }
                i++;
                z = z;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
