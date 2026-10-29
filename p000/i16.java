package p000;

import android.os.Trace;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.UrlRequest;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i16 extends ExperimentalUrlRequest {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f21016z = 0;

    /* JADX INFO: renamed from: a */
    public r06 f21017a;

    /* JADX INFO: renamed from: b */
    public h16 f21018b;

    /* JADX INFO: renamed from: c */
    public String f21019c;

    /* JADX INFO: renamed from: d */
    public TreeMap f21020d;

    /* JADX INFO: renamed from: e */
    public ArrayList f21021e;

    /* JADX INFO: renamed from: f */
    public AtomicInteger f21022f;

    /* JADX INFO: renamed from: g */
    public AtomicBoolean f21023g;

    /* JADX INFO: renamed from: h */
    public boolean f21024h;

    /* JADX INFO: renamed from: i */
    public String f21025i;

    /* JADX INFO: renamed from: j */
    public cr5 f21026j;

    /* JADX INFO: renamed from: k */
    public Executor f21027k;

    /* JADX INFO: renamed from: l */
    public volatile int f21028l;

    /* JADX INFO: renamed from: m */
    public String f21029m;

    /* JADX INFO: renamed from: n */
    public ReadableByteChannel f21030n;

    /* JADX INFO: renamed from: o */
    public m26 f21031o;

    /* JADX INFO: renamed from: p */
    public String f21032p;

    /* JADX INFO: renamed from: q */
    public HttpURLConnection f21033q;

    /* JADX INFO: renamed from: r */
    public u06 f21034r;

    /* JADX INFO: renamed from: s */
    public c82 f21035s;

    /* JADX INFO: renamed from: t */
    public int f21036t;

    /* JADX INFO: renamed from: u */
    public dt0 f21037u;

    /* JADX INFO: renamed from: v */
    public long f21038v;

    /* JADX INFO: renamed from: w */
    public int f21039w;

    /* JADX INFO: renamed from: x */
    public int f21040x;

    /* JADX INFO: renamed from: y */
    public boolean f21041y;

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ void m6556a(i16 i16Var, String str, Exception exc) {
        Log.e("cn_".concat("i16"), zi4.m13621u("Exception in ", str, " method"), exc);
        i16Var.f21041y = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m6557b(CronetException cronetException) {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.f21022f;
            i = atomicInteger.get();
            if (i == 0) {
                C1077qn.m9989o("Can't enter error state before start");
                return;
            } else if (i == 6 || i == 7 || i == 8) {
                return;
            }
        } while (!atomicInteger.compareAndSet(i, 6));
        gy5 gy5Var = new gy5((byte) 0);
        gy5Var.f20201b = this;
        VarHandle.storeStoreFence();
        m6558c(gy5Var, "fireDisconnect");
        m6559d();
        r06 r06Var = this.f21017a;
        m26 m26Var = this.f21031o;
        i16 i16Var = r06Var.f28940d;
        gy5 gy5Var2 = new gy5((byte) 2);
        gy5Var2.f20201b = i16Var;
        VarHandle.storeStoreFence();
        i16Var.m6558c(gy5Var2, "closeResponseChannel");
        yn3 yn3Var = new yn3((byte) 11);
        yn3Var.f35360b = r06Var;
        yn3Var.f35361c = m26Var;
        yn3Var.f35362d = cronetException;
        VarHandle.storeStoreFence();
        try {
            r06Var.m10177b(yn3Var, "onFailed");
        } catch (InlineExecutionProhibitedException unused) {
            Executor executor = r06Var.f28939c;
            if (executor != null) {
                ry5.m10503a("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor onFailed");
                try {
                    RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 22);
                    runnableC1029pc.f27515b = yn3Var;
                    VarHandle.storeStoreFence();
                    executor.execute(runnableC1029pc);
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6558c(Runnable runnable, String str) {
        ry5.m10503a("Cronet JavaUrlRequest#executeOnExecutor ".concat(str));
        try {
            h16 h16Var = this.f21018b;
            oz5 oz5Var = new oz5((byte) 18);
            oz5Var.f27249b = str;
            oz5Var.f27250c = runnable;
            VarHandle.storeStoreFence();
            h16Var.execute(oz5Var);
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        int andSet = this.f21022f.getAndSet(8);
        byte b = 1;
        if (andSet == 1 || andSet == 2 || andSet == 3 || andSet == 4 || andSet == 5) {
            gy5 gy5Var = new gy5((byte) 0);
            gy5Var.f20201b = this;
            VarHandle.storeStoreFence();
            m6558c(gy5Var, "fireDisconnect");
            m6559d();
            r06 r06Var = this.f21017a;
            m26 m26Var = this.f21031o;
            i16 i16Var = r06Var.f28940d;
            gy5 gy5Var2 = new gy5((byte) 2);
            gy5Var2.f20201b = i16Var;
            VarHandle.storeStoreFence();
            i16Var.m6558c(gy5Var2, "closeResponseChannel");
            d06 d06Var = new d06(b);
            d06Var.f16690b = r06Var;
            d06Var.f16691c = m26Var;
            VarHandle.storeStoreFence();
            r06Var.m10177b(d06Var, "onCanceled");
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6559d() {
        cr5 cr5Var = this.f21026j;
        if (cr5Var == null || !this.f21023g.compareAndSet(false, true)) {
            return;
        }
        try {
            Executor executor = this.f21027k;
            bt5 bt5Var = new bt5((byte) 3);
            bt5Var.f15596b = cr5Var;
            VarHandle.storeStoreFence();
            executor.execute(new jz5(this, bt5Var));
        } catch (RejectedExecutionException e) {
            Log.e("cn_".concat("i16"), "Exception when closing uploadDataProvider", e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6560e(int i, int i2, Runnable runnable) {
        AtomicInteger atomicInteger = this.f21022f;
        if (!atomicInteger.compareAndSet(i, i2)) {
            int i3 = atomicInteger.get();
            if (i3 == 8 || i3 == 6) {
                return;
            }
            C1077qn.m9989o(c75.m3879k("Invalid state transition - expected ", p16.m9354a(i), " but was ", p16.m9354a(i3)));
            return;
        }
        ry5.m10503a("Cronet JavaUrlRequest#transitionStates " + p16.m9354a(i) + " -> " + p16.m9354a(i2));
        try {
            runnable.run();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        gy5 gy5Var = new gy5((byte) 4);
        gy5Var.f20201b = this;
        VarHandle.storeStoreFence();
        m6560e(3, 1, gy5Var);
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        int i = this.f21022f.get();
        int i2 = this.f21028l;
        switch (i) {
            case 0:
            case 6:
            case 7:
            case 8:
                i2 = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i2 = 0;
                break;
            case 5:
                i2 = 14;
                break;
            default:
                C1077qn.m9989o(c75.m3877i(i, "Switch is exhaustive: "));
                return;
        }
        r06 r06Var = this.f21017a;
        px4 px4Var = new px4(statusListener);
        q60 q60Var = new q60((byte) 3);
        q60Var.f28237c = px4Var;
        q60Var.f28236b = i2;
        VarHandle.storeStoreFence();
        r06Var.m10177b(q60Var, "sendStatus");
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        int i = this.f21022f.get();
        return i == 7 || i == 6 || i == 8;
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer) {
        z16.m13290b(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            C1077qn.m9987m("ByteBuffer is already full.");
            return;
        }
        yg3 yg3Var = new yg3((byte) 18);
        yg3Var.f35215b = this;
        yg3Var.f35216c = byteBuffer;
        VarHandle.storeStoreFence();
        ar1 ar1Var = new ar1((byte) 16);
        ar1Var.f14798b = this;
        ar1Var.f14799c = yg3Var;
        VarHandle.storeStoreFence();
        m6560e(4, 5, ar1Var);
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.f21028l = 10;
        this.f21035s.f15870e.incrementAndGet();
        gy5 gy5Var = new gy5((byte) 1);
        gy5Var.f20201b = this;
        VarHandle.storeStoreFence();
        m6560e(0, 1, gy5Var);
    }
}
