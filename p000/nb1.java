package p000;

import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nb1 {

    /* JADX INFO: renamed from: a */
    public p31 f25617a;

    /* JADX INFO: renamed from: b */
    public C1394z6 f25618b;

    /* JADX INFO: renamed from: c */
    public ek3 f25619c;

    /* JADX INFO: renamed from: d */
    public hf0 f25620d;

    /* JADX INFO: renamed from: e */
    public x72 f25621e;

    /* JADX INFO: renamed from: f */
    public int f25622f;

    /* JADX INFO: renamed from: g */
    public int f25623g;

    /* JADX INFO: renamed from: h */
    public int f25624h;

    /* JADX INFO: renamed from: i */
    public jr3 f25625i;

    /* JADX WARN: Code duplicated, block: B:129:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:132:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:135:0x02df  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:146:0x0339  */
    /* JADX WARN: Code duplicated, block: B:147:0x0347  */
    /* JADX WARN: Code duplicated, block: B:191:0x0348 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x0325 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x0283 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x03ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x03a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x010b  */
    /* JADX WARN: Code duplicated, block: B:66:0x011c  */
    /* JADX WARN: Code duplicated, block: B:68:0x012e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0190  */
    /* JADX INFO: renamed from: a */
    public final hk3 m8679a(int i, int i2, int i3, boolean z, boolean z2) throws IOException {
        jr3 jr3Var;
        hf0 hf0Var;
        x72 x72Var;
        ArrayList arrayList;
        hf0 hf0Var2;
        C1394z6 c1394z6;
        Proxy proxy;
        String hostName;
        int port;
        List listSingletonList;
        boolean zContains;
        C1394z6 c1394z7;
        URI uriM4811g;
        List<Proxy> list;
        List listM13815j;
        hk3 hk3Var;
        wd3 wd3Var;
        Socket socketM5159j;
        while (!this.f25619c.f18183m) {
            hk3 hk3Var2 = this.f25619c.f18178h;
            if (hk3Var2 != null) {
                synchronized (hk3Var2) {
                    try {
                        if (!hk3Var2.f20650r) {
                            dz1 dz1Var = hk3Var2.f20642j.f22543a.f35775h;
                            dz1 dz1Var2 = this.f25618b.f35775h;
                            socketM5159j = !(dz1Var.f17522e == dz1Var2.f17522e && z62.m13387o(dz1Var.f17521d, dz1Var2.f17521d)) ? this.f25619c.m5159j() : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f25619c.f18178h == null) {
                    if (socketM5159j != null) {
                        zv4.m13809d(socketM5159j);
                    }
                    this.f25622f = 0;
                    this.f25623g = 0;
                    this.f25624h = 0;
                    if (this.f25617a.m9359a(this.f25618b, this.f25619c, null, false)) {
                        hk3Var2 = this.f25619c.f18178h;
                    } else {
                        jr3Var = this.f25625i;
                        try {
                            if (jr3Var != null) {
                                this.f25625i = null;
                            } else {
                                hf0Var = this.f25620d;
                                if (hf0Var == null && hf0Var.m6377k()) {
                                    hf0 hf0Var3 = this.f25620d;
                                    if (!hf0Var3.m6377k()) {
                                        xy4.m12795x();
                                        return null;
                                    }
                                    ArrayList arrayList2 = (ArrayList) hf0Var3.f20529c;
                                    int i4 = hf0Var3.f20528b;
                                    hf0Var3.f20528b = i4 + 1;
                                    jr3Var = (jr3) arrayList2.get(i4);
                                } else {
                                    x72Var = this.f25621e;
                                    if (x72Var == null) {
                                        c1394z7 = this.f25618b;
                                        wd3 wd3Var2 = this.f25619c.f18171a.f20311A;
                                        x72Var = new x72();
                                        x72Var.f34037b = c1394z7;
                                        x72Var.f34038c = wd3Var2;
                                        v71 v71Var = v71.f32439a;
                                        x72Var.f34039d = v71Var;
                                        x72Var.f34040e = v71Var;
                                        x72Var.f34041f = new ArrayList();
                                        uriM4811g = c1394z7.f35775h.m4811g();
                                        if (uriM4811g.getHost() == null) {
                                            listM13815j = zv4.m13815j(Proxy.NO_PROXY);
                                        } else {
                                            List<Proxy> listSelect = c1394z7.f35774g.select(uriM4811g);
                                            list = listSelect;
                                            if (list != null || list.isEmpty()) {
                                                listM13815j = zv4.m13815j(Proxy.NO_PROXY);
                                            } else {
                                                listM13815j = zv4.m13827v(listSelect);
                                            }
                                        }
                                        x72Var.f34039d = listM13815j;
                                        x72Var.f34036a = 0;
                                        VarHandle.storeStoreFence();
                                        this.f25621e = x72Var;
                                    }
                                    if (x72Var.m12522h()) {
                                        xy4.m12795x();
                                        return null;
                                    }
                                    arrayList = new ArrayList();
                                    while (x72Var.f34036a < ((List) x72Var.f34039d).size()) {
                                        c1394z6 = (C1394z6) x72Var.f34037b;
                                        if (x72Var.f34036a < ((List) x72Var.f34039d).size()) {
                                            throw new SocketException("No route to " + c1394z6.f35775h.f17521d + "; exhausted proxy configurations: " + ((List) x72Var.f34039d));
                                        }
                                        List list2 = (List) x72Var.f34039d;
                                        int i5 = x72Var.f34036a;
                                        x72Var.f34036a = i5 + 1;
                                        proxy = (Proxy) list2.get(i5);
                                        ArrayList arrayList3 = new ArrayList();
                                        x72Var.f34040e = arrayList3;
                                        if (proxy.type() != Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                            dz1 dz1Var3 = c1394z6.f35775h;
                                            hostName = dz1Var3.f17521d;
                                            port = dz1Var3.f17522e;
                                        } else {
                                            SocketAddress socketAddressAddress = proxy.address();
                                            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                                                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                                            }
                                            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                                            InetAddress address = inetSocketAddress.getAddress();
                                            hostName = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
                                            port = inetSocketAddress.getPort();
                                        }
                                        if (1 <= port || port >= 65536) {
                                            throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                                        }
                                        if (proxy.type() == Proxy.Type.SOCKS) {
                                            arrayList3.add(InetSocketAddress.createUnresolved(hostName, port));
                                        } else {
                                            if (zv4.f36420f.m4046b(hostName)) {
                                                listSingletonList = Collections.singletonList(InetAddress.getByName(hostName));
                                            } else {
                                                c1394z6.f35768a.getClass();
                                                try {
                                                    List listM9215j0 = AbstractC0990oo.m9215j0(InetAddress.getAllByName(hostName));
                                                    if (listM9215j0.isEmpty()) {
                                                        throw new UnknownHostException(c1394z6.f35768a + " returned no addresses for " + hostName);
                                                    }
                                                    listSingletonList = listM9215j0;
                                                } catch (NullPointerException e) {
                                                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostName));
                                                    unknownHostException.initCause(e);
                                                    throw unknownHostException;
                                                }
                                            }
                                            Iterator it = listSingletonList.iterator();
                                            while (it.hasNext()) {
                                                arrayList3.add(new InetSocketAddress((InetAddress) it.next(), port));
                                            }
                                        }
                                        for (InetSocketAddress inetSocketAddress2 : (List) x72Var.f34040e) {
                                            C1394z6 c1394z8 = (C1394z6) x72Var.f34037b;
                                            jr3 jr3Var2 = new jr3();
                                            jr3Var2.f22543a = c1394z8;
                                            jr3Var2.f22544b = proxy;
                                            jr3Var2.f22545c = inetSocketAddress2;
                                            VarHandle.storeStoreFence();
                                            wd3 wd3Var3 = (wd3) x72Var.f34038c;
                                            synchronized (wd3Var3) {
                                                zContains = ((LinkedHashSet) wd3Var3.f33259b).contains(jr3Var2);
                                            }
                                            if (zContains) {
                                                ((ArrayList) x72Var.f34041f).add(jr3Var2);
                                            } else {
                                                arrayList.add(jr3Var2);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            break;
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        mb0.m8260A0(arrayList, (ArrayList) x72Var.f34041f);
                                        ((ArrayList) x72Var.f34041f).clear();
                                    }
                                    hf0Var2 = new hf0((byte) 8);
                                    hf0Var2.f20529c = arrayList;
                                    VarHandle.storeStoreFence();
                                    this.f25620d = hf0Var2;
                                    if (!this.f25619c.f18183m) {
                                        wb1.m12191j("Canceled");
                                        return null;
                                    }
                                    if (this.f25617a.m9359a(this.f25618b, this.f25619c, arrayList, false)) {
                                        hk3Var2 = this.f25619c.f18178h;
                                    } else {
                                        if (hf0Var2.m6377k()) {
                                            xy4.m12795x();
                                            return null;
                                        }
                                        int i6 = hf0Var2.f20528b;
                                        hf0Var2.f20528b = i6 + 1;
                                        jr3Var = (jr3) arrayList.get(i6);
                                        hk3Var = new hk3();
                                        hk3Var.f20642j = jr3Var;
                                        hk3Var.f20655w = 1;
                                        hk3Var.f20656x = new ArrayList();
                                        hk3Var.f20657y = Long.MAX_VALUE;
                                        VarHandle.storeStoreFence();
                                        this.f25619c.f18185o = hk3Var;
                                        hk3Var.m6416U(i, i2, i3, z, this.f25619c);
                                        this.f25619c.f18185o = null;
                                        wd3Var = this.f25619c.f18171a.f20311A;
                                        synchronized (wd3Var) {
                                            ((LinkedHashSet) wd3Var.f33259b).remove(jr3Var);
                                        }
                                        if (this.f25617a.m9359a(this.f25618b, this.f25619c, arrayList, true)) {
                                            hk3 hk3Var3 = this.f25619c.f18178h;
                                            this.f25625i = jr3Var;
                                            zv4.m13809d(hk3Var.f20644l);
                                            hk3Var2 = hk3Var3;
                                        } else {
                                            synchronized (hk3Var) {
                                                p31 p31Var = this.f25617a;
                                                p31Var.getClass();
                                                byte[] bArr = zv4.f36415a;
                                                ((ConcurrentLinkedQueue) p31Var.f27340e).add(hk3Var);
                                                ((oi4) p31Var.f27338c).m9124c((my1) p31Var.f27339d, 0L);
                                                this.f25619c.m5150a(hk3Var);
                                            }
                                            hk3Var2 = hk3Var;
                                        }
                                    }
                                }
                            }
                            hk3Var.m6416U(i, i2, i3, z, this.f25619c);
                            this.f25619c.f18185o = null;
                            wd3Var = this.f25619c.f18171a.f20311A;
                            synchronized (wd3Var) {
                                ((LinkedHashSet) wd3Var.f33259b).remove(jr3Var);
                                if (this.f25617a.m9359a(this.f25618b, this.f25619c, arrayList, true)) {
                                    hk3 hk3Var4 = this.f25619c.f18178h;
                                    this.f25625i = jr3Var;
                                    zv4.m13809d(hk3Var.f20644l);
                                    hk3Var2 = hk3Var4;
                                } else {
                                    synchronized (hk3Var) {
                                        p31 p31Var2 = this.f25617a;
                                        p31Var2.getClass();
                                        byte[] bArr2 = zv4.f36415a;
                                        ((ConcurrentLinkedQueue) p31Var2.f27340e).add(hk3Var);
                                        ((oi4) p31Var2.f27338c).m9124c((my1) p31Var2.f27339d, 0L);
                                        this.f25619c.m5150a(hk3Var);
                                        hk3Var2 = hk3Var;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            this.f25619c.f18185o = null;
                            throw th2;
                        }
                        arrayList = null;
                        hk3Var = new hk3();
                        hk3Var.f20642j = jr3Var;
                        hk3Var.f20655w = 1;
                        hk3Var.f20656x = new ArrayList();
                        hk3Var.f20657y = Long.MAX_VALUE;
                        VarHandle.storeStoreFence();
                        this.f25619c.f18185o = hk3Var;
                    }
                } else if (socketM5159j != null) {
                    C1077qn.m9989o("Check failed.");
                    return null;
                }
            } else {
                this.f25622f = 0;
                this.f25623g = 0;
                this.f25624h = 0;
                if (this.f25617a.m9359a(this.f25618b, this.f25619c, null, false)) {
                    hk3Var2 = this.f25619c.f18178h;
                } else {
                    jr3Var = this.f25625i;
                    if (jr3Var != null) {
                        this.f25625i = null;
                    } else {
                        hf0Var = this.f25620d;
                        if (hf0Var == null) {
                        }
                        x72Var = this.f25621e;
                        if (x72Var == null) {
                            c1394z7 = this.f25618b;
                            wd3 wd3Var4 = this.f25619c.f18171a.f20311A;
                            x72Var = new x72();
                            x72Var.f34037b = c1394z7;
                            x72Var.f34038c = wd3Var4;
                            v71 v71Var2 = v71.f32439a;
                            x72Var.f34039d = v71Var2;
                            x72Var.f34040e = v71Var2;
                            x72Var.f34041f = new ArrayList();
                            uriM4811g = c1394z7.f35775h.m4811g();
                            if (uriM4811g.getHost() == null) {
                                listM13815j = zv4.m13815j(Proxy.NO_PROXY);
                            } else {
                                List<Proxy> listSelect2 = c1394z7.f35774g.select(uriM4811g);
                                list = listSelect2;
                                if (list != null) {
                                    listM13815j = zv4.m13815j(Proxy.NO_PROXY);
                                } else {
                                    listM13815j = zv4.m13815j(Proxy.NO_PROXY);
                                }
                            }
                            x72Var.f34039d = listM13815j;
                            x72Var.f34036a = 0;
                            VarHandle.storeStoreFence();
                            this.f25621e = x72Var;
                        }
                        if (x72Var.m12522h()) {
                            xy4.m12795x();
                            return null;
                        }
                        arrayList = new ArrayList();
                        while (x72Var.f34036a < ((List) x72Var.f34039d).size()) {
                            c1394z6 = (C1394z6) x72Var.f34037b;
                            if (x72Var.f34036a < ((List) x72Var.f34039d).size()) {
                                throw new SocketException("No route to " + c1394z6.f35775h.f17521d + "; exhausted proxy configurations: " + ((List) x72Var.f34039d));
                            }
                            List list3 = (List) x72Var.f34039d;
                            int i7 = x72Var.f34036a;
                            x72Var.f34036a = i7 + 1;
                            proxy = (Proxy) list3.get(i7);
                            ArrayList arrayList4 = new ArrayList();
                            x72Var.f34040e = arrayList4;
                            if (proxy.type() != Proxy.Type.DIRECT) {
                                dz1 dz1Var4 = c1394z6.f35775h;
                                hostName = dz1Var4.f17521d;
                                port = dz1Var4.f17522e;
                            } else {
                                dz1 dz1Var5 = c1394z6.f35775h;
                                hostName = dz1Var5.f17521d;
                                port = dz1Var5.f17522e;
                            }
                            if (1 <= port) {
                            }
                            throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                        }
                        if (arrayList.isEmpty()) {
                            mb0.m8260A0(arrayList, (ArrayList) x72Var.f34041f);
                            ((ArrayList) x72Var.f34041f).clear();
                        }
                        hf0Var2 = new hf0((byte) 8);
                        hf0Var2.f20529c = arrayList;
                        VarHandle.storeStoreFence();
                        this.f25620d = hf0Var2;
                        if (!this.f25619c.f18183m) {
                            wb1.m12191j("Canceled");
                            return null;
                        }
                        if (this.f25617a.m9359a(this.f25618b, this.f25619c, arrayList, false)) {
                            hk3Var2 = this.f25619c.f18178h;
                        } else {
                            if (hf0Var2.m6377k()) {
                                xy4.m12795x();
                                return null;
                            }
                            int i8 = hf0Var2.f20528b;
                            hf0Var2.f20528b = i8 + 1;
                            jr3Var = (jr3) arrayList.get(i8);
                            hk3Var = new hk3();
                            hk3Var.f20642j = jr3Var;
                            hk3Var.f20655w = 1;
                            hk3Var.f20656x = new ArrayList();
                            hk3Var.f20657y = Long.MAX_VALUE;
                            VarHandle.storeStoreFence();
                            this.f25619c.f18185o = hk3Var;
                            hk3Var.m6416U(i, i2, i3, z, this.f25619c);
                            this.f25619c.f18185o = null;
                            wd3Var = this.f25619c.f18171a.f20311A;
                            synchronized (wd3Var) {
                                ((LinkedHashSet) wd3Var.f33259b).remove(jr3Var);
                                if (this.f25617a.m9359a(this.f25618b, this.f25619c, arrayList, true)) {
                                    hk3 hk3Var5 = this.f25619c.f18178h;
                                    this.f25625i = jr3Var;
                                    zv4.m13809d(hk3Var.f20644l);
                                    hk3Var2 = hk3Var5;
                                } else {
                                    synchronized (hk3Var) {
                                        p31 p31Var3 = this.f25617a;
                                        p31Var3.getClass();
                                        byte[] bArr3 = zv4.f36415a;
                                        ((ConcurrentLinkedQueue) p31Var3.f27340e).add(hk3Var);
                                        ((oi4) p31Var3.f27338c).m9124c((my1) p31Var3.f27339d, 0L);
                                        this.f25619c.m5150a(hk3Var);
                                        hk3Var2 = hk3Var;
                                    }
                                }
                            }
                        }
                    }
                    arrayList = null;
                    hk3Var = new hk3();
                    hk3Var.f20642j = jr3Var;
                    hk3Var.f20655w = 1;
                    hk3Var.f20656x = new ArrayList();
                    hk3Var.f20657y = Long.MAX_VALUE;
                    VarHandle.storeStoreFence();
                    this.f25619c.f18185o = hk3Var;
                    hk3Var.m6416U(i, i2, i3, z, this.f25619c);
                    this.f25619c.f18185o = null;
                    wd3Var = this.f25619c.f18171a.f20311A;
                    synchronized (wd3Var) {
                        ((LinkedHashSet) wd3Var.f33259b).remove(jr3Var);
                        if (this.f25617a.m9359a(this.f25618b, this.f25619c, arrayList, true)) {
                            hk3 hk3Var6 = this.f25619c.f18178h;
                            this.f25625i = jr3Var;
                            zv4.m13809d(hk3Var.f20644l);
                            hk3Var2 = hk3Var6;
                        } else {
                            synchronized (hk3Var) {
                                p31 p31Var4 = this.f25617a;
                                p31Var4.getClass();
                                byte[] bArr4 = zv4.f36415a;
                                ((ConcurrentLinkedQueue) p31Var4.f27340e).add(hk3Var);
                                ((oi4) p31Var4.f27338c).m9124c((my1) p31Var4.f27339d, 0L);
                                this.f25619c.m5150a(hk3Var);
                                hk3Var2 = hk3Var;
                            }
                        }
                    }
                }
            }
            if (hk3Var2.m6421a0(z2)) {
                return hk3Var2;
            }
            hk3Var2.m6423c0();
            if (this.f25625i == null) {
                hf0 hf0Var4 = this.f25620d;
                if (hf0Var4 != null ? hf0Var4.m6377k() : true) {
                    continue;
                } else {
                    x72 x72Var2 = this.f25621e;
                    if (!(x72Var2 != null ? x72Var2.m12522h() : true)) {
                        wb1.m12191j("exhausted all routes");
                        return null;
                    }
                }
            }
        }
        wb1.m12191j("Canceled");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m8680b(IOException iOException) {
        this.f25625i = null;
        if ((iOException instanceof vc4) && ((vc4) iOException).f32521a == 8) {
            this.f25622f++;
        } else if (iOException instanceof mk0) {
            this.f25623g++;
        } else {
            this.f25624h++;
        }
    }
}
