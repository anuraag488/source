package p000;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class av1 {

    /* JADX INFO: renamed from: a */
    public final dn4 f14899a;

    /* JADX INFO: renamed from: b */
    public final m90 f14900b;

    /* JADX INFO: renamed from: c */
    public final List f14901c;

    /* JADX INFO: renamed from: d */
    public final dg4 f14902d;

    public av1(dn4 dn4Var, m90 m90Var, List list, wp1 wp1Var) {
        this.f14899a = dn4Var;
        this.f14900b = m90Var;
        this.f14901c = list;
        this.f14902d = new dg4(new C0948nj(wp1Var, (byte) 3));
    }

    /* JADX INFO: renamed from: a */
    public final List m3315a() {
        return (List) this.f14902d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof av1)) {
            return false;
        }
        av1 av1Var = (av1) obj;
        return av1Var.f14899a == this.f14899a && av1Var.f14900b == this.f14900b && z62.m13387o(av1Var.m3315a(), m3315a()) && av1Var.f14901c.equals(this.f14901c);
    }

    public final int hashCode() {
        return this.f14901c.hashCode() + ((m3315a().hashCode() + ((this.f14900b.hashCode() + ((this.f14899a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        List<Certificate> listM3315a = m3315a();
        ArrayList arrayList = new ArrayList(ib0.m6717y0(listM3315a, 10));
        for (Certificate certificate : listM3315a) {
            arrayList.add(certificate instanceof X509Certificate ? ((X509Certificate) certificate).getSubjectDN().toString() : certificate.getType());
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f14899a);
        sb.append(" cipherSuite=");
        sb.append(this.f14900b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f14901c;
        ArrayList arrayList2 = new ArrayList(ib0.m6717y0(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(certificate2 instanceof X509Certificate ? ((X509Certificate) certificate2).getSubjectDN().toString() : certificate2.getType());
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
