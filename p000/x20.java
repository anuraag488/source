package p000;

import ads_mobile_sdk.C0313rh;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.invoke.VarHandle;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x20 implements g62 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33940a;

    /* JADX INFO: renamed from: b */
    public Object f33941b;

    public /* synthetic */ x20(byte b) {
        this.f33940a = b;
    }

    /* JADX INFO: renamed from: c */
    public static int m12463c(xo3 xo3Var, int i) {
        String strM11657a = xo3Var.f34499f.m11657a("Retry-After");
        if (strM11657a == null) {
            strM11657a = null;
        }
        if (strM11657a == null) {
            return i;
        }
        if (Pattern.compile("\\d+").matcher(strM11657a).matches()) {
            return Integer.valueOf(strM11657a).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x012d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0134  */
    /* JADX WARN: Code duplicated, block: B:108:0x014b  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:91:0x010e  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    /* JADX INFO: renamed from: a */
    public bo3 m12464a(xo3 xo3Var, g90 g90Var) throws ProtocolException {
        h33 h33Var;
        String strM11657a;
        bo3 bo3Var;
        cz1 cz1Var;
        dz1 dz1VarM4238a;
        C1122rv c1122rvM3644b;
        boolean z;
        xo3 xo3Var2;
        hk3 hk3Var;
        jr3 jr3Var = (g90Var == null || (hk3Var = (hk3) g90Var.f19665e) == null) ? null : hk3Var.f20642j;
        int i = xo3Var.f34497d;
        String str = xo3Var.f34494a.f15463b;
        if (i == 307 || i == 308) {
            h33Var = (h33) this.f33941b;
            if (h33Var.f20319h) {
                strM11657a = xo3Var.f34499f.m11657a("Location");
                if (strM11657a == null) {
                    strM11657a = null;
                }
                bo3Var = xo3Var.f34494a;
                if (strM11657a != null) {
                    dz1 dz1Var = bo3Var.f15462a;
                    dz1Var.getClass();
                    try {
                        cz1Var = new cz1();
                        cz1Var.m4240c(dz1Var, strM11657a);
                    } catch (IllegalArgumentException unused) {
                        cz1Var = null;
                    }
                    if (cz1Var != null) {
                        dz1VarM4238a = cz1Var.m4238a();
                    } else {
                        dz1VarM4238a = null;
                    }
                    if (dz1VarM4238a != null && (z62.m13387o(dz1VarM4238a.f17518a, bo3Var.f15462a.f17518a) || h33Var.f20320i)) {
                        c1122rvM3644b = bo3Var.m3644b();
                        if (ks5.m7597D(str)) {
                            int i2 = xo3Var.f34497d;
                            z = !str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                            if (!str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                                c1122rvM3644b.m10461t(str, z ? bo3Var.f15465d : null);
                            } else {
                                c1122rvM3644b.m10461t("GET", null);
                            }
                            if (!z) {
                                c1122rvM3644b.m10462u("Transfer-Encoding");
                                c1122rvM3644b.m10462u("Content-Length");
                                c1122rvM3644b.m10462u("Content-Type");
                            }
                        }
                        if (!zv4.m13806a(bo3Var.f15462a, dz1VarM4238a)) {
                            c1122rvM3644b.m10462u("Authorization");
                        }
                        c1122rvM3644b.f29651b = dz1VarM4238a;
                        return c1122rvM3644b.m10450i();
                    }
                }
            }
        } else {
            if (i == 401) {
                ((h33) this.f33941b).f20318g.getClass();
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    xo3 xo3Var3 = xo3Var.f34503j;
                    if ((xo3Var3 == null || xo3Var3.f34497d != 503) && m12463c(xo3Var, Integer.MAX_VALUE) == 0) {
                        return xo3Var.f34494a;
                    }
                } else {
                    if (i == 407) {
                        if (jr3Var.f22544b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((h33) this.f33941b).f20324m.getClass();
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                            case 300:
                            case C0313rh.f10781e1 /* 301 */:
                            case C0313rh.f10784f1 /* 302 */:
                            case 303:
                                h33Var = (h33) this.f33941b;
                                if (h33Var.f20319h) {
                                    strM11657a = xo3Var.f34499f.m11657a("Location");
                                    if (strM11657a == null) {
                                        strM11657a = null;
                                    }
                                    bo3Var = xo3Var.f34494a;
                                    if (strM11657a != null) {
                                        dz1 dz1Var2 = bo3Var.f15462a;
                                        dz1Var2.getClass();
                                        cz1Var = new cz1();
                                        cz1Var.m4240c(dz1Var2, strM11657a);
                                        if (cz1Var != null) {
                                            dz1VarM4238a = cz1Var.m4238a();
                                        } else {
                                            dz1VarM4238a = null;
                                        }
                                        if (dz1VarM4238a != null) {
                                            c1122rvM3644b = bo3Var.m3644b();
                                            if (ks5.m7597D(str)) {
                                                int i3 = xo3Var.f34497d;
                                                if (str.equals("PROPFIND")) {
                                                }
                                                if (str.equals("PROPFIND")) {
                                                    c1122rvM3644b.m10461t(str, z ? bo3Var.f15465d : null);
                                                } else {
                                                    c1122rvM3644b.m10461t(str, z ? bo3Var.f15465d : null);
                                                }
                                                if (!z) {
                                                    c1122rvM3644b.m10462u("Transfer-Encoding");
                                                    c1122rvM3644b.m10462u("Content-Length");
                                                    c1122rvM3644b.m10462u("Content-Type");
                                                }
                                            }
                                            if (!zv4.m13806a(bo3Var.f15462a, dz1VarM4238a)) {
                                                c1122rvM3644b.m10462u("Authorization");
                                            }
                                            c1122rvM3644b.f29651b = dz1VarM4238a;
                                            return c1122rvM3644b.m10450i();
                                        }
                                    }
                                }
                            default:
                                return null;
                        }
                    } else if (((h33) this.f33941b).f20317f && (((xo3Var2 = xo3Var.f34503j) == null || xo3Var2.f34497d != 408) && m12463c(xo3Var, 0) <= 0)) {
                        return xo3Var.f34494a;
                    }
                }
            } else if (g90Var != null && !z62.m13387o(((nb1) g90Var.f19663c).f25618b.f35775h.f17521d, ((hk3) g90Var.f19665e).f20642j.f22543a.f35775h.f17521d)) {
                hk3 hk3Var2 = (hk3) g90Var.f19665e;
                synchronized (hk3Var2) {
                    hk3Var2.f20651s = true;
                }
                return xo3Var.f34494a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public boolean m12465b(IOException iOException, ek3 ek3Var, bo3 bo3Var, boolean z) {
        boolean zM12522h;
        x72 x72Var;
        hk3 hk3Var;
        if (((h33) this.f33941b).f20317f && ((!z || !(iOException instanceof FileNotFoundException)) && !(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z))) {
            nb1 nb1Var = ek3Var.f18177g;
            int i = nb1Var.f25622f;
            if (i == 0 && nb1Var.f25623g == 0 && nb1Var.f25624h == 0) {
                zM12522h = false;
            } else if (nb1Var.f25625i != null) {
                zM12522h = true;
            } else {
                jr3 jr3Var = null;
                if (i <= 1 && nb1Var.f25623g <= 1 && nb1Var.f25624h <= 0 && (hk3Var = nb1Var.f25619c.f18178h) != null) {
                    synchronized (hk3Var) {
                        if (hk3Var.f20652t == 0 && zv4.m13806a(hk3Var.f20642j.f22543a.f35775h, nb1Var.f25618b.f35775h)) {
                            jr3Var = hk3Var.f20642j;
                        }
                    }
                }
                if (jr3Var != null) {
                    nb1Var.f25625i = jr3Var;
                } else {
                    hf0 hf0Var = nb1Var.f25620d;
                    if ((hf0Var == null || !hf0Var.m6377k()) && (x72Var = nb1Var.f25621e) != null) {
                        zM12522h = x72Var.m12522h();
                    }
                }
                zM12522h = true;
            }
            if (zM12522h) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.g62
    public final xo3 intercept(nk3 nk3Var) {
        long j;
        boolean z;
        d12 d12Var;
        xo3 xo3VarM8792b;
        n70 n70Var;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        switch (this.f33940a) {
            case 0:
                ig1 ig1Var = (ig1) this.f33941b;
                bo3 bo3Var = nk3Var.f25910e;
                C1122rv c1122rvM3644b = bo3Var.m3644b();
                dz1 dz1Var = bo3Var.f15462a;
                uv1 uv1Var = bo3Var.f15464c;
                zi3 zi3Var = bo3Var.f15465d;
                if (zi3Var != null) {
                    j = -1;
                    long j2 = zi3Var.f36140a;
                    if (j2 != -1) {
                        c1122rvM3644b.m10459r("Content-Length", String.valueOf(j2));
                        c1122rvM3644b.m10462u("Transfer-Encoding");
                    } else {
                        c1122rvM3644b.m10459r("Transfer-Encoding", "chunked");
                        c1122rvM3644b.m10462u("Content-Length");
                    }
                } else {
                    j = -1;
                }
                if (uv1Var.m11657a("Host") == null) {
                    c1122rvM3644b.m10459r("Host", zv4.m13826u(dz1Var, false));
                }
                if (uv1Var.m11657a("Connection") == null) {
                    c1122rvM3644b.m10459r("Connection", "Keep-Alive");
                }
                if (uv1Var.m11657a("Accept-Encoding") == null && uv1Var.m11657a("Range") == null) {
                    c1122rvM3644b.m10459r("Accept-Encoding", "gzip");
                    z = true;
                } else {
                    z = false;
                }
                ig1Var.getClass();
                if (uv1Var.m11657a("User-Agent") == null) {
                    c1122rvM3644b.m10459r("User-Agent", "okhttp/4.12.0");
                }
                xo3 xo3VarM8792b2 = nk3Var.m8792b(c1122rvM3644b.m10450i());
                uv1 uv1Var2 = xo3VarM8792b2.f34499f;
                xy1.m12775b(ig1Var, dz1Var, uv1Var2);
                wo3 wo3VarM12724a = xo3VarM8792b2.m12724a();
                wo3VarM12724a.f33549a = bo3Var;
                if (z) {
                    String strM11657a = uv1Var2.m11657a("Content-Encoding");
                    if (strM11657a == null) {
                        strM11657a = null;
                    }
                    if ("gzip".equalsIgnoreCase(strM11657a) && xy1.m12774a(xo3VarM8792b2) && (d12Var = xo3VarM8792b2.f34500g) != null) {
                        su1 su1Var = new su1(d12Var.mo4278j());
                        tv1 tv1VarM11659c = uv1Var2.m11659c();
                        tv1VarM11659c.m11178n("Content-Encoding");
                        tv1VarM11659c.m11178n("Content-Length");
                        wo3VarM12724a.f33554f = tv1VarM11659c.m11167c().m11659c();
                        String strM11657a2 = uv1Var2.m11657a("Content-Type");
                        wo3VarM12724a.f33555g = new rk3(strM11657a2 == null ? null : strM11657a2, j, new ak3(su1Var));
                    }
                }
                return wo3VarM12724a.m12344a();
            default:
                bo3 bo3Var2 = nk3Var.f25910e;
                ek3 ek3Var = nk3Var.f25906a;
                Collection collectionM6311W0 = v71.f32439a;
                xo3 xo3Var = null;
                int i = 0;
                bo3 bo3VarM12464a = bo3Var2;
                while (true) {
                    boolean z2 = true;
                    while (true) {
                        if (ek3Var.f18179i != null) {
                            C1077qn.m9989o("Check failed.");
                            return null;
                        }
                        synchronized (ek3Var) {
                            try {
                                if (ek3Var.f18181k) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (ek3Var.f18180j) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z2) {
                            p31 p31Var = ek3Var.f18173c;
                            dz1 dz1Var2 = bo3VarM12464a.f15462a;
                            h33 h33Var = ek3Var.f18171a;
                            if (dz1Var2.f17526i) {
                                sSLSocketFactory = h33Var.f20326o;
                                if (sSLSocketFactory != null) {
                                    hostnameVerifier = h33Var.f20330s;
                                    n70Var = h33Var.f20331t;
                                } else {
                                    C1077qn.m9989o("CLEARTEXT-only client");
                                }
                                return null;
                            }
                            n70Var = null;
                            sSLSocketFactory = null;
                            hostnameVerifier = null;
                            String str = dz1Var2.f17521d;
                            int i2 = dz1Var2.f17522e;
                            ia5 ia5Var = h33Var.f20322k;
                            SocketFactory socketFactory = h33Var.f20325n;
                            o85 o85Var = h33Var.f20324m;
                            List list = h33Var.f20329r;
                            List list2 = h33Var.f20328q;
                            ProxySelector proxySelector = h33Var.f20323l;
                            C1394z6 c1394z6 = new C1394z6();
                            c1394z6.f35768a = ia5Var;
                            c1394z6.f35769b = socketFactory;
                            c1394z6.f35770c = sSLSocketFactory;
                            c1394z6.f35771d = hostnameVerifier;
                            c1394z6.f35772e = n70Var;
                            c1394z6.f35773f = o85Var;
                            c1394z6.f35774g = proxySelector;
                            cz1 cz1Var = new cz1();
                            String str2 = sSLSocketFactory != null ? "https" : "http";
                            if (!str2.equalsIgnoreCase("http")) {
                                if (str2.equalsIgnoreCase("https")) {
                                    cz1Var.f16629a = "https";
                                } else {
                                    C1077qn.m9987m("unexpected scheme: ".concat(str2));
                                }
                                return null;
                            }
                            cz1Var.f16629a = "http";
                            String strM7916Y = lb5.m7916Y(q50.m9728k(0, 0, 7, str));
                            if (strM7916Y != null) {
                                cz1Var.f16632d = strM7916Y;
                                if (1 > i2 || i2 >= 65536) {
                                    C1077qn.m9988n(c75.m3877i(i2, "unexpected port: "));
                                } else {
                                    cz1Var.f16633e = i2;
                                    c1394z6.f35775h = cz1Var.m4238a();
                                    c1394z6.f35776i = zv4.m13827v(list);
                                    c1394z6.f35777j = zv4.m13827v(list2);
                                    VarHandle.storeStoreFence();
                                    nb1 nb1Var = new nb1();
                                    nb1Var.f25617a = p31Var;
                                    nb1Var.f25618b = c1394z6;
                                    nb1Var.f25619c = ek3Var;
                                    VarHandle.storeStoreFence();
                                    ek3Var.f18177g = nb1Var;
                                }
                            } else {
                                C1077qn.m9987m("unexpected host: ".concat(str));
                            }
                            return null;
                        }
                        try {
                            if (ek3Var.f18183m) {
                                throw new IOException("Canceled");
                            }
                            try {
                                xo3VarM8792b = nk3Var.m8792b(bo3VarM12464a);
                            } catch (IOException e) {
                                if (!m12465b(e, ek3Var, bo3VarM12464a, !(e instanceof mk0))) {
                                    Iterator it = collectionM6311W0.iterator();
                                    while (it.hasNext()) {
                                        se0.m10720f(e, (Exception) it.next());
                                    }
                                    throw e;
                                }
                                collectionM6311W0 = hb0.m6311W0(collectionM6311W0, e);
                                ek3Var.m5155f(true);
                                xo3Var = xo3Var;
                                i = i;
                                z2 = false;
                            } catch (lr3 e2) {
                                if (!m12465b(e2.f24317b, ek3Var, bo3VarM12464a, false)) {
                                    IOException iOException = e2.f24316a;
                                    Iterator it2 = collectionM6311W0.iterator();
                                    while (it2.hasNext()) {
                                        se0.m10720f(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                collectionM6311W0 = hb0.m6311W0(collectionM6311W0, e2.f24316a);
                                ek3Var.m5155f(true);
                                xo3Var = xo3Var;
                                i = i;
                                z2 = false;
                            }
                        } catch (Throwable th2) {
                            ek3Var.m5155f(true);
                            throw th2;
                        }
                        break;
                        xo3Var = xo3Var;
                        i = i;
                        z2 = false;
                    }
                    if (xo3Var != 0) {
                        wo3 wo3VarM12724a2 = xo3VarM8792b.m12724a();
                        wo3 wo3VarM12724a3 = xo3Var.m12724a();
                        wo3VarM12724a3.f33555g = null;
                        xo3 xo3VarM12344a = wo3VarM12724a3.m12344a();
                        if (xo3VarM12344a.f34500g != null) {
                            throw new IllegalArgumentException("priorResponse.body != null");
                        }
                        wo3VarM12724a2.f33558j = xo3VarM12344a;
                        xo3VarM8792b = wo3VarM12724a2.m12344a();
                    }
                    xo3Var = xo3VarM8792b;
                    bo3VarM12464a = m12464a(xo3Var, ek3Var.f18179i);
                    if (bo3VarM12464a == null) {
                        ek3Var.m5155f(false);
                        return xo3Var;
                    }
                    d12 d12Var2 = xo3Var.f34500g;
                    if (d12Var2 != null) {
                        zv4.m13808c(d12Var2);
                    }
                    i++;
                    if (i > 20) {
                        throw new ProtocolException("Too many follow-up requests: " + i);
                    }
                    ek3Var.m5155f(true);
                    collectionM6311W0 = collectionM6311W0;
                }
                break;
        }
    }
}
