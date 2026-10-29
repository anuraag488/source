package p000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.invoke.VarHandle;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ek3 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final h33 f18171a;

    /* JADX INFO: renamed from: b */
    public final bo3 f18172b;

    /* JADX INFO: renamed from: c */
    public final p31 f18173c;

    /* JADX INFO: renamed from: d */
    public final dk3 f18174d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f18175e;

    /* JADX INFO: renamed from: f */
    public Throwable f18176f;

    /* JADX INFO: renamed from: g */
    public nb1 f18177g;

    /* JADX INFO: renamed from: h */
    public hk3 f18178h;

    /* JADX INFO: renamed from: i */
    public g90 f18179i;

    /* JADX INFO: renamed from: j */
    public boolean f18180j;

    /* JADX INFO: renamed from: k */
    public boolean f18181k;

    /* JADX INFO: renamed from: l */
    public boolean f18182l;

    /* JADX INFO: renamed from: m */
    public volatile boolean f18183m;

    /* JADX INFO: renamed from: n */
    public volatile g90 f18184n;

    /* JADX INFO: renamed from: o */
    public volatile hk3 f18185o;

    public ek3(h33 h33Var, bo3 bo3Var) {
        this.f18171a = h33Var;
        this.f18172b = bo3Var;
        this.f18173c = (p31) h33Var.f20313b.f14813b;
        h33Var.f20316e.getClass();
        dk3 dk3Var = new dk3(this);
        dk3Var.mo7567g(h33Var.f20333v);
        this.f18174d = dk3Var;
        this.f18175e = new AtomicBoolean();
        this.f18182l = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m5150a(hk3 hk3Var) {
        byte[] bArr = zv4.f36415a;
        if (this.f18178h != null) {
            C1077qn.m9989o("Check failed.");
            return;
        }
        this.f18178h = hk3Var;
        ArrayList arrayList = hk3Var.f20656x;
        Throwable th = this.f18176f;
        ck3 ck3Var = new ck3(this);
        ck3Var.f16086a = th;
        VarHandle.storeStoreFence();
        arrayList.add(ck3Var);
    }

    /* JADX INFO: renamed from: b */
    public final IOException m5151b(IOException iOException) {
        Socket socketM5159j;
        byte[] bArr = zv4.f36415a;
        hk3 hk3Var = this.f18178h;
        if (hk3Var != null) {
            synchronized (hk3Var) {
                socketM5159j = m5159j();
            }
            if (this.f18178h == null) {
                if (socketM5159j != null) {
                    zv4.m13809d(socketM5159j);
                }
            } else if (socketM5159j != null) {
                C1077qn.m9989o("Check failed.");
                return null;
            }
        }
        if (!this.f18174d.m10385i()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: renamed from: c */
    public final void m5152c() {
        hb3 hb3Var = hb3.f20468a;
        hb3.f20468a.getClass();
        this.f18176f = hb3.f20469b.isLoggable(Level.FINE) ? new Throwable("response.body().close()") : null;
    }

    public final Object clone() {
        return new ek3(this.f18171a, this.f18172b);
    }

    /* JADX INFO: renamed from: d */
    public final void m5153d() {
        Socket socket;
        if (this.f18183m) {
            return;
        }
        this.f18183m = true;
        g90 g90Var = this.f18184n;
        if (g90Var != null) {
            ((mb1) g90Var.f19664d).cancel();
        }
        hk3 hk3Var = this.f18185o;
        if (hk3Var == null || (socket = hk3Var.f20643k) == null) {
            return;
        }
        zv4.m13809d(socket);
    }

    /* JADX INFO: renamed from: e */
    public final void m5154e(j60 j60Var) {
        bk3 bk3Var;
        if (!this.f18175e.compareAndSet(false, true)) {
            C1077qn.m9989o("Already Executed");
            return;
        }
        m5152c();
        C1283w7 c1283w7 = this.f18171a.f20312a;
        bk3 bk3Var2 = new bk3();
        bk3Var2.f15365c = this;
        bk3Var2.f15363a = j60Var;
        bk3Var2.f15364b = new AtomicInteger(0);
        VarHandle.storeStoreFence();
        synchronized (c1283w7) {
            ((ArrayDeque) c1283w7.f33128d).add(bk3Var2);
            String str = this.f18172b.f15462a.f17521d;
            Iterator it = ((ArrayDeque) c1283w7.f33129e).iterator();
            do {
                if (!it.hasNext()) {
                    Iterator it2 = ((ArrayDeque) c1283w7.f33128d).iterator();
                    do {
                        if (!it2.hasNext()) {
                            bk3Var = null;
                            break;
                        }
                        bk3Var = (bk3) it2.next();
                    } while (!z62.m13387o(bk3Var.f15365c.f18172b.f15462a.f17521d, str));
                } else {
                    bk3Var = (bk3) it.next();
                }
            } while (!z62.m13387o(bk3Var.f15365c.f18172b.f15462a.f17521d, str));
            if (bk3Var != null) {
                bk3Var2.f15364b = bk3Var.f15364b;
            }
        }
        c1283w7.m12125L();
    }

    /* JADX INFO: renamed from: f */
    public final void m5155f(boolean z) {
        g90 g90Var;
        synchronized (this) {
            if (!this.f18182l) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (g90Var = this.f18184n) != null) {
            ((mb1) g90Var.f19664d).cancel();
            ((ek3) g90Var.f19662b).m5157h(g90Var, true, true, null);
        }
        this.f18179i = null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0088  */
    /* JADX INFO: renamed from: g */
    public final xo3 m5156g() throws Throwable {
        ArrayList arrayList = new ArrayList();
        mb0.m8260A0(arrayList, this.f18171a.f20314c);
        h33 h33Var = this.f18171a;
        byte b = 1;
        x20 x20Var = new x20(b);
        x20Var.f33941b = h33Var;
        VarHandle.storeStoreFence();
        arrayList.add(x20Var);
        ig1 ig1Var = this.f18171a.f20321j;
        x20 x20Var2 = new x20((byte) 0);
        x20Var2.f33941b = ig1Var;
        VarHandle.storeStoreFence();
        arrayList.add(x20Var2);
        arrayList.add(new kk0(b));
        arrayList.add(kk0.f23190b);
        mb0.m8260A0(arrayList, this.f18171a.f20315d);
        kk0 kk0Var = new kk0((byte) 2);
        VarHandle.storeStoreFence();
        arrayList.add(kk0Var);
        bo3 bo3Var = this.f18172b;
        h33 h33Var2 = this.f18171a;
        try {
            xo3 xo3VarM8792b = new nk3(this, arrayList, 0, null, bo3Var, h33Var2.f20334w, h33Var2.f20335x, h33Var2.f20336y).m8792b(bo3Var);
            if (this.f18183m) {
                zv4.m13808c(xo3VarM8792b);
                throw new IOException("Canceled");
            }
            m5158i(null);
            return xo3VarM8792b;
        } catch (IOException e) {
            try {
                throw m5158i(e);
            } catch (Throwable th) {
                th = th;
                if (b == 0) {
                    m5158i(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            b = 0;
            if (b == 0) {
                m5158i(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x001d A[Catch: all -> 0x0013, TryCatch #1 {all -> 0x0013, blocks: (B:8:0x000e, B:17:0x001d, B:19:0x0021, B:20:0x0023, B:22:0x0027, B:27:0x0030, B:29:0x0034, B:14:0x0017), top: B:53:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0021 A[Catch: all -> 0x0013, TryCatch #1 {all -> 0x0013, blocks: (B:8:0x000e, B:17:0x001d, B:19:0x0021, B:20:0x0023, B:22:0x0027, B:27:0x0030, B:29:0x0034, B:14:0x0017), top: B:53:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:25:0x002d  */
    /* JADX INFO: renamed from: h */
    public final IOException m5157h(g90 g90Var, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (g90Var.equals(this.f18184n)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (this.f18180j) {
                            if (z) {
                                this.f18180j = false;
                            }
                            if (z2) {
                                this.f18181k = false;
                            }
                            z5 = this.f18180j;
                            if (z5) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (!z5) {
                                z3 = true;
                            }
                            z4 = z3;
                            z3 = z6;
                        } else if (z2 || !this.f18181k) {
                            z4 = false;
                        } else {
                            if (z) {
                                this.f18180j = false;
                            }
                            if (z2) {
                                this.f18181k = false;
                            }
                            z5 = this.f18180j;
                            if (z5 || this.f18181k) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            if (!z5 && !this.f18181k && !this.f18182l) {
                                z3 = true;
                            }
                            z4 = z3;
                            z3 = z6;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z2) {
                    }
                    z4 = false;
                }
            }
            if (z3) {
                this.f18184n = null;
                hk3 hk3Var = this.f18178h;
                if (hk3Var != null) {
                    synchronized (hk3Var) {
                        hk3Var.f20653u++;
                    }
                }
            }
            if (z4) {
                return m5151b(iOException);
            }
        }
        return iOException;
    }

    /* JADX INFO: renamed from: i */
    public final IOException m5158i(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.f18182l) {
                this.f18182l = false;
                if (!this.f18180j && !this.f18181k) {
                    z = true;
                }
            }
        }
        return z ? m5151b(iOException) : iOException;
    }

    /* JADX INFO: renamed from: j */
    public final Socket m5159j() {
        hk3 hk3Var = this.f18178h;
        byte[] bArr = zv4.f36415a;
        ArrayList arrayList = hk3Var.f20656x;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (z62.m13387o(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            C1077qn.m9989o("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.f18178h = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        hk3Var.f20657y = System.nanoTime();
        p31 p31Var = this.f18173c;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) p31Var.f27340e;
        oi4 oi4Var = (oi4) p31Var.f27338c;
        byte[] bArr2 = zv4.f36415a;
        if (!hk3Var.f20650r && p31Var.f27336a != 0) {
            oi4Var.m9124c((my1) p31Var.f27339d, 0L);
            return null;
        }
        hk3Var.f20650r = true;
        concurrentLinkedQueue.remove(hk3Var);
        if (concurrentLinkedQueue.isEmpty()) {
            oi4Var.m9122a();
        }
        return hk3Var.f20644l;
    }
}
