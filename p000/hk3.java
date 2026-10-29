package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.invoke.VarHandle;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hk3 extends zp0 {

    /* JADX INFO: renamed from: j */
    public jr3 f20642j;

    /* JADX INFO: renamed from: k */
    public Socket f20643k;

    /* JADX INFO: renamed from: l */
    public Socket f20644l;

    /* JADX INFO: renamed from: m */
    public av1 f20645m;

    /* JADX INFO: renamed from: n */
    public wh3 f20646n;

    /* JADX INFO: renamed from: o */
    public oy1 f20647o;

    /* JADX INFO: renamed from: p */
    public ak3 f20648p;

    /* JADX INFO: renamed from: q */
    public yj3 f20649q;

    /* JADX INFO: renamed from: r */
    public boolean f20650r;

    /* JADX INFO: renamed from: s */
    public boolean f20651s;

    /* JADX INFO: renamed from: t */
    public int f20652t;

    /* JADX INFO: renamed from: u */
    public int f20653u;

    /* JADX INFO: renamed from: v */
    public int f20654v;

    /* JADX INFO: renamed from: w */
    public int f20655w;

    /* JADX INFO: renamed from: x */
    public ArrayList f20656x;

    /* JADX INFO: renamed from: y */
    public long f20657y;

    /* JADX INFO: renamed from: V */
    public static void m6415V(h33 h33Var, jr3 jr3Var, IOException iOException) {
        if (jr3Var.f22544b.type() != Proxy.Type.DIRECT) {
            C1394z6 c1394z6 = jr3Var.f22543a;
            c1394z6.f35774g.connectFailed(c1394z6.f35775h.m4811g(), jr3Var.f22544b.address(), iOException);
        }
        wd3 wd3Var = h33Var.f20311A;
        synchronized (wd3Var) {
            ((LinkedHashSet) wd3Var.f33259b).add(jr3Var);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m6416U(int i, int i2, int i3, boolean z, ek3 ek3Var) throws Throwable {
        if (this.f20646n != null) {
            C1077qn.m9989o("already connected");
            return;
        }
        C1394z6 c1394z6 = this.f20642j.f22543a;
        List list = c1394z6.f35777j;
        pk0 pk0Var = new pk0();
        pk0Var.f27683a = list;
        VarHandle.storeStoreFence();
        if (c1394z6.f35770c == null) {
            if (!list.contains(ok0.f26797f)) {
                throw new lr3(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f20642j.f22543a.f35775h.f17521d;
            hb3 hb3Var = hb3.f20468a;
            if (!hb3.f20468a.mo6329e(str)) {
                throw new lr3(new UnknownServiceException(zi4.m13621u("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c1394z6.f35776i.contains(wh3.H2_PRIOR_KNOWLEDGE)) {
            throw new lr3(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        lr3 lr3Var = null;
        while (true) {
            try {
                jr3 jr3Var = this.f20642j;
                if (jr3Var.f22543a.f35770c != null && jr3Var.f22544b.type() == Proxy.Type.HTTP) {
                    m6418X(i, i2, i3);
                    if (this.f20643k != null) {
                        break;
                    } else {
                        break;
                    }
                }
                m6417W(i, i2);
                m6419Y(pk0Var);
                break;
            } catch (IOException e) {
                Socket socket = this.f20644l;
                if (socket != null) {
                    zv4.m13809d(socket);
                }
                Socket socket2 = this.f20643k;
                if (socket2 != null) {
                    zv4.m13809d(socket2);
                }
                this.f20644l = null;
                this.f20643k = null;
                this.f20648p = null;
                this.f20649q = null;
                this.f20645m = null;
                this.f20646n = null;
                this.f20647o = null;
                this.f20655w = 1;
                if (lr3Var == null) {
                    lr3Var = new lr3(e);
                } else {
                    se0.m10720f(lr3Var.f24316a, e);
                    lr3Var.f24317b = e;
                }
                if (!z) {
                    throw lr3Var;
                }
                pk0Var.f27686d = true;
                if (!pk0Var.f27685c) {
                    throw lr3Var;
                }
                if (e instanceof ProtocolException) {
                    throw lr3Var;
                }
                if (e instanceof InterruptedIOException) {
                    throw lr3Var;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw lr3Var;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw lr3Var;
                }
                if (!(e instanceof SSLException)) {
                    throw lr3Var;
                }
            }
        }
        jr3 jr3Var2 = this.f20642j;
        if (jr3Var2.f22543a.f35770c != null && jr3Var2.f22544b.type() == Proxy.Type.HTTP && this.f20643k == null) {
            throw new lr3(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f20657y = System.nanoTime();
    }

    /* JADX INFO: renamed from: W */
    public final void m6417W(int i, int i2) throws IOException {
        jr3 jr3Var = this.f20642j;
        Proxy proxy = jr3Var.f22544b;
        C1394z6 c1394z6 = jr3Var.f22543a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : fk3.f19060a[type.ordinal()];
        Socket socketCreateSocket = (i3 == 1 || i3 == 2) ? c1394z6.f35769b.createSocket() : new Socket(proxy);
        this.f20643k = socketCreateSocket;
        socketCreateSocket.setSoTimeout(i2);
        try {
            hb3 hb3Var = hb3.f20468a;
            hb3 hb3Var2 = hb3.f20468a;
            InetSocketAddress inetSocketAddress = this.f20642j.f22545c;
            hb3Var2.getClass();
            socketCreateSocket.connect(inetSocketAddress, i);
            try {
                da4 da4Var = new da4(socketCreateSocket);
                C1079qp c1079qp = new C1079qp(socketCreateSocket.getInputStream(), da4Var);
                C1079qp c1079qp2 = new C1079qp();
                c1079qp2.f28649b = da4Var;
                c1079qp2.f28650c = c1079qp;
                VarHandle.storeStoreFence();
                this.f20648p = new ak3(c1079qp2);
                da4 da4Var2 = new da4(socketCreateSocket);
                C1042pp c1042pp = new C1042pp(socketCreateSocket.getOutputStream(), da4Var2);
                C1042pp c1042pp2 = new C1042pp();
                c1042pp2.f27873b = da4Var2;
                c1042pp2.f27874c = c1042pp;
                VarHandle.storeStoreFence();
                this.f20649q = zp0.m13681m(c1042pp2);
            } catch (NullPointerException e) {
                if (z62.m13387o(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f20642j.f22545c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m6418X(int i, int i2, int i3) throws IOException {
        C1122rv c1122rv = new C1122rv((byte) 7);
        C1394z6 c1394z6 = this.f20642j.f22543a;
        c1122rv.f29651b = c1394z6.f35775h;
        c1122rv.m10461t("CONNECT", null);
        ((tv1) c1122rv.f29653d).m11179o("Host", zv4.m13826u(c1394z6.f35775h, true));
        ((tv1) c1122rv.f29653d).m11179o("Proxy-Connection", "Keep-Alive");
        ((tv1) c1122rv.f29653d).m11179o("User-Agent", "okhttp/4.12.0");
        bo3 bo3VarM10450i = c1122rv.m10450i();
        wo3 wo3Var = new wo3();
        wo3Var.f33549a = bo3VarM10450i;
        wo3Var.f33550b = wh3.HTTP_1_1;
        wo3Var.f33551c = 407;
        wo3Var.f33552d = "Preemptive Authenticate";
        wo3Var.f33555g = zv4.f36417c;
        wo3Var.f33559k = -1L;
        wo3Var.f33560l = -1L;
        wo3Var.f33554f.m11179o("Proxy-Authenticate", "OkHttp-Preemptive");
        wo3Var.m12344a();
        c1394z6.f35773f.getClass();
        dz1 dz1Var = bo3VarM10450i.f15462a;
        m6417W(i, i2);
        String str = "CONNECT " + zv4.m13826u(dz1Var, true) + " HTTP/1.1";
        ak3 ak3Var = this.f20648p;
        yj3 yj3Var = this.f20649q;
        fy1 fy1Var = new fy1(null, this, ak3Var, yj3Var);
        ak3Var.f14585a.mo3025c().mo7567g(i2);
        yj3Var.f35265a.mo3367c().mo7567g(i3);
        fy1Var.m5855j(bo3VarM10450i.f15464c, str);
        fy1Var.mo5848c();
        wo3 wo3VarMo5852g = fy1Var.mo5852g(false);
        wo3VarMo5852g.f33549a = bo3VarM10450i;
        xo3 xo3VarM12344a = wo3VarMo5852g.m12344a();
        int i4 = xo3VarM12344a.f34497d;
        long jM13814i = zv4.m13814i(xo3VarM12344a);
        if (jM13814i != -1) {
            cy1 cy1VarM5854i = fy1Var.m5854i(jM13814i);
            zv4.m13824s(cy1VarM5854i, Integer.MAX_VALUE);
            cy1VarM5854i.close();
        }
        if (i4 == 200) {
            if (ak3Var.f14586b.m12062e() && yj3Var.f35266b.m12062e()) {
                return;
            }
            wb1.m12191j("TLS tunnel buffered too many bytes!");
            return;
        }
        if (i4 != 407) {
            wb1.m12191j(c75.m3877i(i4, "Unexpected response code for CONNECT: "));
        } else {
            c1394z6.f35773f.getClass();
            wb1.m12191j("Failed to authenticate with proxy");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: Y */
    public final void m6419Y(pk0 pk0Var) throws Throwable {
        wh3 wh3Var = wh3.HTTP_2;
        wh3 wh3Var2 = wh3.HTTP_1_1;
        wh3 wh3Var3 = wh3.H2_PRIOR_KNOWLEDGE;
        C1394z6 c1394z6 = this.f20642j.f22543a;
        SSLSocketFactory sSLSocketFactory = c1394z6.f35770c;
        if (sSLSocketFactory == null) {
            boolean zContains = c1394z6.f35776i.contains(wh3Var3);
            Socket socket = this.f20643k;
            if (!zContains) {
                this.f20644l = socket;
                this.f20646n = wh3Var2;
                return;
            } else {
                this.f20644l = socket;
                this.f20646n = wh3Var3;
                m6424d0();
                return;
            }
        }
        SSLSocket sSLSocket = null;
        String strMo4283d = null;
        try {
            Socket socket2 = this.f20643k;
            dz1 dz1Var = c1394z6.f35775h;
            SSLSocket sSLSocket2 = (SSLSocket) sSLSocketFactory.createSocket(socket2, dz1Var.f17521d, dz1Var.f17522e, true);
            try {
                ok0 ok0VarM9538a = pk0Var.m9538a(sSLSocket2);
                if (ok0VarM9538a.f26799b) {
                    hb3 hb3Var = hb3.f20468a;
                    hb3.f20468a.mo4282c(sSLSocket2, c1394z6.f35775h.f17521d, c1394z6.f35776i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                av1 av1VarM12864m0 = y42.m12864m0(session);
                byte b = 0;
                if (!c1394z6.f35771d.verify(c1394z6.f35775h.f17521d, session)) {
                    List listM3315a = av1VarM12864m0.m3315a();
                    if (listM3315a.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + c1394z6.f35775h.f17521d + " not verified (no certificates)");
                    }
                    X509Certificate x509Certificate = (X509Certificate) listM3315a.get(0);
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(c1394z6.f35775h.f17521d);
                    sb.append(" not verified:\n              |    certificate: ");
                    n70 n70Var = n70.f25486c;
                    sb.append(zp0.m13657I(x509Certificate));
                    sb.append("\n              |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    sb.append(hb0.m6310V0(f33.m5463a(x509Certificate, 7), f33.m5463a(x509Certificate, 2)));
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(id4.m6768O(sb.toString()));
                }
                n70 n70Var2 = c1394z6.f35772e;
                this.f20645m = new av1(av1VarM12864m0.f14899a, av1VarM12864m0.f14900b, av1VarM12864m0.f14901c, new gk3(n70Var2, av1VarM12864m0, c1394z6, b));
                String str = c1394z6.f35775h.f17521d;
                Iterator it = n70Var2.f25487a.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                if (ok0VarM9538a.f26799b) {
                    hb3 hb3Var2 = hb3.f20468a;
                    strMo4283d = hb3.f20468a.mo4283d(sSLSocket2);
                }
                this.f20644l = sSLSocket2;
                da4 da4Var = new da4(sSLSocket2);
                C1079qp c1079qp = new C1079qp(sSLSocket2.getInputStream(), da4Var);
                C1079qp c1079qp2 = new C1079qp();
                c1079qp2.f28649b = da4Var;
                c1079qp2.f28650c = c1079qp;
                VarHandle.storeStoreFence();
                this.f20648p = new ak3(c1079qp2);
                da4 da4Var2 = new da4(sSLSocket2);
                C1042pp c1042pp = new C1042pp(sSLSocket2.getOutputStream(), da4Var2);
                C1042pp c1042pp2 = new C1042pp();
                c1042pp2.f27873b = da4Var2;
                c1042pp2.f27874c = c1042pp;
                VarHandle.storeStoreFence();
                this.f20649q = zp0.m13681m(c1042pp2);
                if (strMo4283d != null) {
                    wh3 wh3Var4 = wh3.HTTP_1_0;
                    if (strMo4283d.equals("http/1.0")) {
                        wh3Var2 = wh3Var4;
                    } else if (!strMo4283d.equals("http/1.1")) {
                        if (strMo4283d.equals("h2_prior_knowledge")) {
                            wh3Var2 = wh3Var3;
                        } else if (strMo4283d.equals("h2")) {
                            wh3Var2 = wh3Var;
                        } else {
                            wh3Var2 = wh3.SPDY_3;
                            if (!strMo4283d.equals("spdy/3.1")) {
                                wh3Var2 = wh3.QUIC;
                                if (!strMo4283d.equals("quic")) {
                                    throw new IOException("Unexpected protocol: ".concat(strMo4283d));
                                }
                            }
                        }
                    }
                }
                this.f20646n = wh3Var2;
                hb3 hb3Var3 = hb3.f20468a;
                hb3.f20468a.mo6327a(sSLSocket2);
                if (this.f20646n == wh3Var) {
                    m6424d0();
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    hb3 hb3Var4 = hb3.f20468a;
                    hb3.f20468a.mo6327a(sSLSocket);
                }
                if (sSLSocket != null) {
                    zv4.m13809d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m6420Z(C1394z6 c1394z6, List list) {
        av1 av1Var;
        jr3 jr3Var = this.f20642j;
        C1394z6 c1394z7 = jr3Var.f22543a;
        dz1 dz1Var = c1394z6.f35775h;
        byte[] bArr = zv4.f36415a;
        if (this.f20656x.size() < this.f20655w && !this.f20650r && c1394z7.m13341a(c1394z6)) {
            if (z62.m13387o(dz1Var.f17521d, c1394z7.f35775h.f17521d)) {
                return true;
            }
            if (this.f20647o != null && list != null) {
                List<jr3> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (jr3 jr3Var2 : list2) {
                        Proxy.Type type = jr3Var2.f22544b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && jr3Var.f22544b.type() == type2 && jr3Var.f22545c.equals(jr3Var2.f22545c)) {
                            if (c1394z6.f35771d != f33.f18714a) {
                                break;
                            }
                            byte[] bArr2 = zv4.f36415a;
                            dz1 dz1Var2 = c1394z7.f35775h;
                            int i = dz1Var.f17522e;
                            String str = dz1Var.f17521d;
                            if (i != dz1Var2.f17522e) {
                                break;
                            }
                            if (!z62.m13387o(str, dz1Var2.f17521d)) {
                                if (!this.f20651s && (av1Var = this.f20645m) != null) {
                                    List listM3315a = av1Var.m3315a();
                                    if (listM3315a.isEmpty() || !f33.m5465c(str, (X509Certificate) listM3315a.get(0))) {
                                        break;
                                        break;
                                    }
                                } else {
                                    break;
                                    break;
                                }
                            }
                            try {
                                n70 n70Var = c1394z6.f35772e;
                                this.f20645m.m3315a();
                                Iterator it = n70Var.f25487a.iterator();
                                if (!it.hasNext()) {
                                    return true;
                                }
                                it.next().getClass();
                                throw new ClassCastException();
                            } catch (SSLPeerUnverifiedException unused) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m6421a0(boolean z) {
        long j;
        byte[] bArr = zv4.f36415a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f20643k;
        Socket socket2 = this.f20644l;
        ak3 ak3Var = this.f20648p;
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        oy1 oy1Var = this.f20647o;
        if (oy1Var != null) {
            synchronized (oy1Var) {
                if (oy1Var.f27212f) {
                    return false;
                }
                return oy1Var.f27220n >= oy1Var.f27219m || jNanoTime < oy1Var.f27221o;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.f20657y;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !ak3Var.m3023a();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final mb1 m6422b0(h33 h33Var, nk3 nk3Var) throws SocketException {
        short s = nk3Var.f25912g;
        Socket socket = this.f20644l;
        ak3 ak3Var = this.f20648p;
        yj3 yj3Var = this.f20649q;
        oy1 oy1Var = this.f20647o;
        if (oy1Var == null) {
            socket.setSoTimeout(s);
            ak3Var.f14585a.mo3025c().mo7567g(s);
            yj3Var.f35265a.mo3367c().mo7567g(nk3Var.f25913h);
            return new fy1(h33Var, this, ak3Var, yj3Var);
        }
        py1 py1Var = new py1();
        py1Var.f28079a = this;
        py1Var.f28080b = nk3Var;
        py1Var.f28081c = oy1Var;
        List list = h33Var.f20329r;
        wh3 wh3Var = wh3.H2_PRIOR_KNOWLEDGE;
        if (!list.contains(wh3Var)) {
            wh3Var = wh3.HTTP_2;
        }
        py1Var.f28083e = wh3Var;
        VarHandle.storeStoreFence();
        return py1Var;
    }

    /* JADX INFO: renamed from: c0 */
    public final synchronized void m6423c0() {
        this.f20650r = true;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m6424d0() throws SocketException {
        int i;
        Socket socket = this.f20644l;
        ak3 ak3Var = this.f20648p;
        yj3 yj3Var = this.f20649q;
        socket.setSoTimeout(0);
        pi4 pi4Var = pi4.f27637h;
        gb5 gb5Var = gb5.f19720k;
        String str = zv4.f36421g + ' ' + this.f20642j.f22543a.f35775h.f17521d;
        oy1 oy1Var = new oy1();
        oy1Var.f27207a = this;
        oy1Var.f27208b = new LinkedHashMap();
        oy1Var.f27209c = str;
        oy1Var.f27211e = 3;
        oy1Var.f27213g = pi4Var;
        oy1Var.f27214h = pi4Var.m9535d();
        oy1Var.f27215i = pi4Var.m9535d();
        oy1Var.f27216j = pi4Var.m9535d();
        oy1Var.f27217k = gb5Var;
        b44 b44Var = new b44();
        int i2 = 7;
        b44Var.m3434b(7, 16777216);
        oy1Var.f27222p = b44Var;
        b44 b44Var2 = oy1.f27206z;
        oy1Var.f27223q = b44Var2;
        oy1Var.f27227u = b44Var2.m3433a();
        oy1Var.f27228v = socket;
        wy1 wy1Var = new wy1();
        wy1Var.f33850a = yj3Var;
        w30 w30Var = new w30();
        wy1Var.f33851b = w30Var;
        wy1Var.f33852c = 16384;
        ux1 ux1Var = new ux1();
        ux1Var.f32225a = w30Var;
        ux1Var.f32226b = Integer.MAX_VALUE;
        ux1Var.f32228d = 4096;
        ux1Var.f32229e = new sv1[8];
        ux1Var.f32230f = 7;
        VarHandle.storeStoreFence();
        wy1Var.f33854e = ux1Var;
        VarHandle.storeStoreFence();
        oy1Var.f27229w = wy1Var;
        ry1 ry1Var = new ry1();
        ry1Var.f29728a = ak3Var;
        qy1 qy1Var = new qy1();
        qy1Var.f28875a = ak3Var;
        VarHandle.storeStoreFence();
        ry1Var.f29729b = qy1Var;
        tx1 tx1Var = new tx1();
        tx1Var.f31506a = 4096;
        tx1Var.f31507b = new ArrayList();
        tx1Var.f31508c = new ak3(qy1Var);
        tx1Var.f31509d = new sv1[8];
        tx1Var.f31510e = 7;
        VarHandle.storeStoreFence();
        ry1Var.f29730c = tx1Var;
        VarHandle.storeStoreFence();
        byte b = 2;
        C0839kl c0839kl = new C0839kl(b);
        c0839kl.f23209c = oy1Var;
        c0839kl.f23208b = ry1Var;
        VarHandle.storeStoreFence();
        oy1Var.f27230x = c0839kl;
        oy1Var.f27231y = new LinkedHashSet();
        VarHandle.storeStoreFence();
        this.f20647o = oy1Var;
        this.f20655w = (b44Var2.f15078a & 16) != 0 ? b44Var2.f15079b[4] : Integer.MAX_VALUE;
        synchronized (wy1Var) {
            try {
                if (wy1Var.f33853d) {
                    throw new IOException("closed");
                }
                Logger logger = wy1.f33849f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(zv4.m13812g(">> CONNECTION " + gy1.f20183a.mo4262c(), new Object[0]));
                }
                s50 s50Var = gy1.f20183a;
                if (yj3Var.f35267c) {
                    throw new IllegalStateException("closed");
                }
                yj3Var.f35266b.m12052M(s50Var);
                yj3Var.m13147a();
                yj3Var.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (wy1Var) {
            try {
                if (wy1Var.f33853d) {
                    throw new IOException("closed");
                }
                wy1Var.m12442e(0, Integer.bitCount(b44Var.f15078a) * 6, 4, 0);
                int i3 = 0;
                while (i3 < 10) {
                    boolean z = true;
                    if (((1 << i3) & b44Var.f15078a) == 0) {
                        z = false;
                    }
                    if (z) {
                        if (i3 != 4) {
                            i = i3 != i2 ? i3 : 4;
                        } else {
                            i = 3;
                        }
                        yj3 yj3Var2 = wy1Var.f33850a;
                        if (yj3Var2.f35267c) {
                            throw new IllegalStateException("closed");
                        }
                        w30 w30Var2 = yj3Var2.f35266b;
                        zz3 zz3VarM12050K = w30Var2.m12050K(2);
                        byte[] bArr = zz3VarM12050K.f36504a;
                        int i4 = zz3VarM12050K.f36506c;
                        bArr[i4] = (byte) ((i >>> 8) & 255);
                        bArr[i4 + 1] = (byte) (i & 255);
                        zz3VarM12050K.f36506c = i4 + 2;
                        w30Var2.f33056b += 2;
                        yj3Var2.m13147a();
                        wy1Var.f33850a.m13149e(b44Var.f15079b[i3]);
                    }
                    i3++;
                    i2 = 7;
                }
                wy1Var.f33850a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iM3433a = oy1Var.f27222p.m3433a();
        if (iM3433a != 65535) {
            oy1Var.f27229w.m12447q(0, iM3433a - 65535);
        }
        pi4Var.m9535d().m9124c(new my1(oy1Var.f27209c, oy1Var.f27230x, b), 0L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        jr3 jr3Var = this.f20642j;
        C1394z6 c1394z6 = jr3Var.f22543a;
        sb.append(c1394z6.f35775h.f17521d);
        sb.append(':');
        sb.append(c1394z6.f35775h.f17522e);
        sb.append(", proxy=");
        sb.append(jr3Var.f22544b);
        sb.append(" hostAddress=");
        sb.append(jr3Var.f22545c);
        sb.append(" cipherSuite=");
        av1 av1Var = this.f20645m;
        sb.append(av1Var != null ? av1Var.f14900b : "none");
        sb.append(" protocol=");
        sb.append(this.f20646n);
        sb.append('}');
        return sb.toString();
    }
}
