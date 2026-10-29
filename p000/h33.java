package p000;

import java.lang.invoke.VarHandle;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h33 implements Cloneable {

    /* JADX INFO: renamed from: B */
    public static final List f20309B = zv4.m13815j(wh3.HTTP_2, wh3.HTTP_1_1);

    /* JADX INFO: renamed from: C */
    public static final List f20310C = zv4.m13815j(ok0.f26796e, ok0.f26797f);

    /* JADX INFO: renamed from: A */
    public final wd3 f20311A;

    /* JADX INFO: renamed from: a */
    public final C1283w7 f20312a;

    /* JADX INFO: renamed from: b */
    public final ar3 f20313b;

    /* JADX INFO: renamed from: c */
    public final List f20314c;

    /* JADX INFO: renamed from: d */
    public final List f20315d;

    /* JADX INFO: renamed from: e */
    public final ds3 f20316e;

    /* JADX INFO: renamed from: f */
    public final boolean f20317f;

    /* JADX INFO: renamed from: g */
    public final o85 f20318g;

    /* JADX INFO: renamed from: h */
    public final boolean f20319h;

    /* JADX INFO: renamed from: i */
    public final boolean f20320i;

    /* JADX INFO: renamed from: j */
    public final ig1 f20321j;

    /* JADX INFO: renamed from: k */
    public final ia5 f20322k;

    /* JADX INFO: renamed from: l */
    public final ProxySelector f20323l;

    /* JADX INFO: renamed from: m */
    public final o85 f20324m;

    /* JADX INFO: renamed from: n */
    public final SocketFactory f20325n;

    /* JADX INFO: renamed from: o */
    public final SSLSocketFactory f20326o;

    /* JADX INFO: renamed from: p */
    public final X509TrustManager f20327p;

    /* JADX INFO: renamed from: q */
    public final List f20328q;

    /* JADX INFO: renamed from: r */
    public final List f20329r;

    /* JADX INFO: renamed from: s */
    public final HostnameVerifier f20330s;

    /* JADX INFO: renamed from: t */
    public final n70 f20331t;

    /* JADX INFO: renamed from: u */
    public final n40 f20332u;

    /* JADX INFO: renamed from: v */
    public final int f20333v;

    /* JADX INFO: renamed from: w */
    public final short f20334w;

    /* JADX INFO: renamed from: x */
    public final short f20335x;

    /* JADX INFO: renamed from: y */
    public final short f20336y;

    /* JADX INFO: renamed from: z */
    public final short f20337z;

    /* JADX WARN: Type inference failed for: r1v8, types: [int, short] */
    public h33(g33 g33Var) throws NoSuchAlgorithmException, KeyStoreException {
        SSLSocketFactory sSLSocketFactoryMo6330h;
        X509TrustManager x509TrustManagerMo4285i;
        n40 n40VarMo6328b;
        this.f20312a = g33Var.f19560a;
        this.f20313b = g33Var.f19561b;
        this.f20314c = zv4.m13827v(g33Var.f19562c);
        this.f20315d = zv4.m13827v(g33Var.f19563d);
        this.f20316e = g33Var.f19564e;
        this.f20317f = g33Var.f19565f;
        this.f20318g = g33Var.f19566g;
        this.f20319h = g33Var.f19567h;
        this.f20320i = g33Var.f19568i;
        this.f20321j = g33Var.f19569j;
        this.f20322k = g33Var.f19570k;
        ProxySelector proxySelector = g33Var.f19571l;
        proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
        this.f20323l = proxySelector == null ? c23.f15774a : proxySelector;
        this.f20324m = g33Var.f19572m;
        this.f20325n = g33Var.f19573n;
        List list = g33Var.f19576q;
        this.f20328q = list;
        this.f20329r = g33Var.f19577r;
        this.f20330s = g33Var.f19578s;
        this.f20333v = g33Var.f19581v;
        this.f20334w = g33Var.f19582w;
        this.f20335x = g33Var.f19583x;
        this.f20336y = g33Var.f19584y;
        this.f20337z = g33Var.f19585z;
        wd3 wd3Var = g33Var.f19559A;
        if (wd3Var == null) {
            wd3Var = new wd3((byte) 6);
            wd3Var.f33259b = new LinkedHashSet();
            VarHandle.storeStoreFence();
        }
        this.f20311A = wd3Var;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f20326o = null;
                    this.f20332u = null;
                    this.f20327p = null;
                    this.f20331t = n70.f25486c;
                    sSLSocketFactoryMo6330h = null;
                    n40VarMo6328b = null;
                    x509TrustManagerMo4285i = null;
                    break;
                }
                if (((ok0) it.next()).f26798a) {
                    sSLSocketFactoryMo6330h = g33Var.f19574o;
                    if (sSLSocketFactoryMo6330h == null) {
                        hb3 hb3Var = hb3.f20468a;
                        x509TrustManagerMo4285i = hb3.f20468a.mo4285i();
                        this.f20327p = x509TrustManagerMo4285i;
                        sSLSocketFactoryMo6330h = hb3.f20468a.mo6330h(x509TrustManagerMo4285i);
                        this.f20326o = sSLSocketFactoryMo6330h;
                        n40VarMo6328b = hb3.f20468a.mo6328b(x509TrustManagerMo4285i);
                        this.f20332u = n40VarMo6328b;
                        n70 n70Var = g33Var.f19579t;
                        this.f20331t = z62.m13387o(n70Var.f25488b, n40VarMo6328b) ? n70Var : new n70(n70Var.f25487a, n40VarMo6328b);
                        break;
                    }
                    this.f20326o = sSLSocketFactoryMo6330h;
                    n40VarMo6328b = g33Var.f19580u;
                    this.f20332u = n40VarMo6328b;
                    x509TrustManagerMo4285i = g33Var.f19575p;
                    this.f20327p = x509TrustManagerMo4285i;
                    n70 n70Var2 = g33Var.f19579t;
                    this.f20331t = z62.m13387o(n70Var2.f25488b, n40VarMo6328b) ? n70Var2 : new n70(n70Var2.f25487a, n40VarMo6328b);
                    break;
                }
            }
        } else {
            this.f20326o = null;
            this.f20332u = null;
            this.f20327p = null;
            this.f20331t = n70.f25486c;
            sSLSocketFactoryMo6330h = null;
            n40VarMo6328b = null;
            x509TrustManagerMo4285i = null;
            break;
        }
        List list3 = this.f20315d;
        List list4 = this.f20314c;
        if (list4.contains(null)) {
            xd2.m12669p(list4, "Null interceptor: ");
            throw null;
        }
        if (list3.contains(null)) {
            xd2.m12669p(list3, "Null network interceptor: ");
            throw null;
        }
        List list5 = this.f20328q;
        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((ok0) it2.next()).f26798a) {
                    if (sSLSocketFactoryMo6330h == null) {
                        C1077qn.m9989o("sslSocketFactory == null");
                        throw null;
                    }
                    if (n40VarMo6328b == null) {
                        C1077qn.m9989o("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManagerMo4285i != null) {
                        return;
                    }
                    C1077qn.m9989o("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactoryMo6330h != null) {
            C1077qn.m9989o("Check failed.");
            throw null;
        }
        if (n40VarMo6328b != null) {
            C1077qn.m9989o("Check failed.");
            throw null;
        }
        if (x509TrustManagerMo4285i != null) {
            C1077qn.m9989o("Check failed.");
            throw null;
        }
        if (z62.m13387o(this.f20331t, n70.f25486c)) {
            return;
        }
        C1077qn.m9989o("Check failed.");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v29, types: [int, short] */
    /* JADX INFO: renamed from: a */
    public final g33 m6208a() {
        g33 g33Var = new g33();
        g33Var.f19560a = this.f20312a;
        g33Var.f19561b = this.f20313b;
        mb0.m8260A0(g33Var.f19562c, this.f20314c);
        mb0.m8260A0(g33Var.f19563d, this.f20315d);
        g33Var.f19564e = this.f20316e;
        g33Var.f19565f = this.f20317f;
        g33Var.f19566g = this.f20318g;
        g33Var.f19567h = this.f20319h;
        g33Var.f19568i = this.f20320i;
        g33Var.f19569j = this.f20321j;
        g33Var.f19570k = this.f20322k;
        g33Var.f19571l = this.f20323l;
        g33Var.f19572m = this.f20324m;
        g33Var.f19573n = this.f20325n;
        g33Var.f19574o = this.f20326o;
        g33Var.f19575p = this.f20327p;
        g33Var.f19576q = this.f20328q;
        g33Var.f19577r = this.f20329r;
        g33Var.f19578s = this.f20330s;
        g33Var.f19579t = this.f20331t;
        g33Var.f19580u = this.f20332u;
        g33Var.f19581v = this.f20333v;
        g33Var.f19582w = this.f20334w;
        g33Var.f19583x = this.f20335x;
        g33Var.f19584y = this.f20336y;
        g33Var.f19585z = this.f20337z;
        g33Var.f19559A = this.f20311A;
        return g33Var;
    }

    public final Object clone() {
        return super.clone();
    }
}
