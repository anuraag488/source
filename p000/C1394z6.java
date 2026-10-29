package p000;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: z6 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1394z6 {

    /* JADX INFO: renamed from: a */
    public ia5 f35768a;

    /* JADX INFO: renamed from: b */
    public SocketFactory f35769b;

    /* JADX INFO: renamed from: c */
    public SSLSocketFactory f35770c;

    /* JADX INFO: renamed from: d */
    public HostnameVerifier f35771d;

    /* JADX INFO: renamed from: e */
    public n70 f35772e;

    /* JADX INFO: renamed from: f */
    public o85 f35773f;

    /* JADX INFO: renamed from: g */
    public ProxySelector f35774g;

    /* JADX INFO: renamed from: h */
    public dz1 f35775h;

    /* JADX INFO: renamed from: i */
    public List f35776i;

    /* JADX INFO: renamed from: j */
    public List f35777j;

    /* JADX INFO: renamed from: a */
    public final boolean m13341a(C1394z6 c1394z6) {
        return z62.m13387o(this.f35768a, c1394z6.f35768a) && z62.m13387o(this.f35773f, c1394z6.f35773f) && z62.m13387o(this.f35776i, c1394z6.f35776i) && z62.m13387o(this.f35777j, c1394z6.f35777j) && z62.m13387o(this.f35774g, c1394z6.f35774g) && z62.m13387o(this.f35770c, c1394z6.f35770c) && z62.m13387o(this.f35771d, c1394z6.f35771d) && z62.m13387o(this.f35772e, c1394z6.f35772e) && this.f35775h.f17522e == c1394z6.f35775h.f17522e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1394z6)) {
            return false;
        }
        C1394z6 c1394z6 = (C1394z6) obj;
        return z62.m13387o(this.f35775h, c1394z6.f35775h) && m13341a(c1394z6);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f35772e) + ((Objects.hashCode(this.f35771d) + ((Objects.hashCode(this.f35770c) + ((this.f35774g.hashCode() + ((this.f35777j.hashCode() + ((this.f35776i.hashCode() + ((this.f35773f.hashCode() + ((this.f35768a.hashCode() + zi4.m13613m(527, this.f35775h.f17525h, 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        dz1 dz1Var = this.f35775h;
        sb.append(dz1Var.f17521d);
        sb.append(':');
        sb.append(dz1Var.f17522e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f35774g);
        sb.append('}');
        return sb.toString();
    }
}
