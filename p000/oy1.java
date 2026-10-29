package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class oy1 implements Closeable {

    /* JADX INFO: renamed from: z */
    public static final b44 f27206z;

    /* JADX INFO: renamed from: a */
    public hk3 f27207a;

    /* JADX INFO: renamed from: b */
    public LinkedHashMap f27208b;

    /* JADX INFO: renamed from: c */
    public String f27209c;

    /* JADX INFO: renamed from: d */
    public int f27210d;

    /* JADX INFO: renamed from: e */
    public int f27211e;

    /* JADX INFO: renamed from: f */
    public boolean f27212f;

    /* JADX INFO: renamed from: g */
    public pi4 f27213g;

    /* JADX INFO: renamed from: h */
    public oi4 f27214h;

    /* JADX INFO: renamed from: i */
    public oi4 f27215i;

    /* JADX INFO: renamed from: j */
    public oi4 f27216j;

    /* JADX INFO: renamed from: k */
    public gb5 f27217k;

    /* JADX INFO: renamed from: l */
    public long f27218l;

    /* JADX INFO: renamed from: m */
    public long f27219m;

    /* JADX INFO: renamed from: n */
    public long f27220n;

    /* JADX INFO: renamed from: o */
    public long f27221o;

    /* JADX INFO: renamed from: p */
    public b44 f27222p;

    /* JADX INFO: renamed from: q */
    public b44 f27223q;

    /* JADX INFO: renamed from: r */
    public long f27224r;

    /* JADX INFO: renamed from: s */
    public long f27225s;

    /* JADX INFO: renamed from: t */
    public long f27226t;

    /* JADX INFO: renamed from: u */
    public long f27227u;

    /* JADX INFO: renamed from: v */
    public Socket f27228v;

    /* JADX INFO: renamed from: w */
    public wy1 f27229w;

    /* JADX INFO: renamed from: x */
    public C0839kl f27230x;

    /* JADX INFO: renamed from: y */
    public LinkedHashSet f27231y;

    static {
        b44 b44Var = new b44();
        b44Var.m3434b(7, 65535);
        b44Var.m3434b(5, 16384);
        f27206z = b44Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m9328a(int i, int i2, IOException iOException) {
        int i3;
        Object[] array;
        byte[] bArr = zv4.f36415a;
        try {
            m9331g(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f27208b.isEmpty()) {
                array = null;
            } else {
                array = this.f27208b.values().toArray(new vy1[0]);
                this.f27208b.clear();
            }
        }
        vy1[] vy1VarArr = (vy1[]) array;
        if (vy1VarArr != null) {
            for (vy1 vy1Var : vy1VarArr) {
                try {
                    vy1Var.m12021c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f27229w.close();
        } catch (IOException unused3) {
        }
        try {
            this.f27228v.close();
        } catch (IOException unused4) {
        }
        this.f27214h.m9126e();
        this.f27215i.m9126e();
        this.f27216j.m9126e();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized vy1 m9329b(int i) {
        return (vy1) this.f27208b.get(Integer.valueOf(i));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m9328a(1, 9, null);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized vy1 m9330e(int i) {
        vy1 vy1Var;
        vy1Var = (vy1) this.f27208b.remove(Integer.valueOf(i));
        notifyAll();
        return vy1Var;
    }

    public final void flush() {
        this.f27229w.flush();
    }

    /* JADX INFO: renamed from: g */
    public final void m9331g(int i) {
        synchronized (this.f27229w) {
            synchronized (this) {
                if (this.f27212f) {
                    return;
                }
                this.f27212f = true;
                this.f27229w.m12443g(zv4.f36415a, this.f27210d, i);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m9332j(long j) {
        long j2 = this.f27224r + j;
        this.f27224r = j2;
        long j3 = j2 - this.f27225s;
        if (j3 >= this.f27222p.m3433a() / 2) {
            m9335q(0, j3);
            this.f27225s += j3;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m9333k(int i, boolean z, w30 w30Var, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.f27229w.m12441b(z, i, w30Var, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.f27226t;
                            j3 = this.f27227u;
                            if (j2 >= j3) {
                                if (!this.f27208b.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.f27229w.f33852c);
                j4 = iMin;
                this.f27226t += j4;
            }
            j -= j4;
            this.f27229w.m12441b(z && j == 0, i, w30Var, iMin);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m9334l(int i, int i2) {
        this.f27214h.m9124c(new jy1(this.f27209c + '[' + i + "] writeSynReset", this, i, i2, (byte) 1), 0L);
    }

    /* JADX INFO: renamed from: q */
    public final void m9335q(int i, long j) {
        this.f27214h.m9124c(new ny1(this.f27209c + '[' + i + "] windowUpdate", this, i, j), 0L);
    }
}
