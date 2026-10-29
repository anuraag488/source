package p000;

import android.os.Handler;
import android.os.SystemClock;
import java.lang.invoke.VarHandle;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fo5 extends ExperimentalBidirectionalStream {

    /* JADX INFO: renamed from: b */
    public er0 f19190b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f19191c;

    /* JADX INFO: renamed from: d */
    public er0 f19192d;

    /* JADX INFO: renamed from: e */
    public final ScheduledExecutorService f19193e;

    /* JADX INFO: renamed from: h */
    public final u26 f19196h;

    /* JADX INFO: renamed from: i */
    public final ep5 f19197i;

    /* JADX INFO: renamed from: j */
    public final dt0 f19198j;

    /* JADX INFO: renamed from: k */
    public final URI f19199k;

    /* JADX INFO: renamed from: l */
    public final C1283w7 f19200l;

    /* JADX INFO: renamed from: m */
    public final boolean f19201m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f19202n;

    /* JADX INFO: renamed from: o */
    public final IdentityHashMap f19203o;

    /* JADX INFO: renamed from: p */
    public final Set f19204p;

    /* JADX INFO: renamed from: q */
    public final AtomicBoolean f19205q;

    /* JADX INFO: renamed from: r */
    public final Set f19206r;

    /* JADX INFO: renamed from: s */
    public final sn5 f19207s;

    /* JADX INFO: renamed from: a */
    public final Object f19189a = new Object();

    /* JADX INFO: renamed from: f */
    public final AtomicReference f19194f = new AtomicReference(null);

    /* JADX INFO: renamed from: g */
    public final AtomicReference f19195g = new AtomicReference();

    public fo5(BidirectionalStream.Callback callback, ScheduledExecutorService scheduledExecutorService, ep5 ep5Var, URI uri, dt0 dt0Var, boolean z) {
        nr0 nr0Var = r16.f28959t;
        C1283w7 c1283w7 = new C1283w7((byte) 6);
        ir0 ir0Var = ir0.f21658a;
        c1283w7.f33127c = new AtomicReference(ir0Var);
        c1283w7.f33128d = new AtomicReference(ir0Var);
        c1283w7.f33129e = new AtomicReference(jr0.f22535a);
        c1283w7.f33126b = nr0Var;
        VarHandle.storeStoreFence();
        this.f19200l = c1283w7;
        this.f19202n = new ArrayList();
        this.f19203o = new IdentityHashMap();
        this.f19204p = Collections.newSetFromMap(new IdentityHashMap());
        this.f19205q = new AtomicBoolean(false);
        this.f19206r = Collections.newSetFromMap(new IdentityHashMap());
        this.f19193e = scheduledExecutorService;
        this.f19196h = new u26(callback);
        this.f19197i = ep5Var;
        this.f19198j = dt0Var;
        this.f19199k = uri;
        this.f19201m = z;
        this.f19192d = null;
        this.f19191c = new AtomicBoolean(false);
        this.f19207s = z ? new nn5(this) : new sn5(this);
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ void m5764a(fo5 fo5Var, BidirectionalStream bidirectionalStream) {
        if (bidirectionalStream == fo5Var.f19190b || bidirectionalStream == fo5Var.f19192d) {
            return;
        }
        C1077qn.m9985k("Callback stream neither primary nor fallback.");
    }

    /* JADX INFO: renamed from: b */
    public static void m5765b(fo5 fo5Var, BidirectionalStream bidirectionalStream) {
        ScheduledFuture scheduledFuture;
        er0 er0Var = fo5Var.f19192d;
        C1283w7 c1283w7 = fo5Var.f19200l;
        if (bidirectionalStream != er0Var) {
            if (((AtomicReference) c1283w7.f33129e).getAndSet(jr0.f22536b) == jr0.f22535a) {
                fo5Var.m5766c();
                return;
            } else {
                C1077qn.m9989o("Winner is already set");
                return;
            }
        }
        if (((AtomicReference) c1283w7.f33129e).getAndSet(jr0.f22537c) != jr0.f22535a) {
            C1077qn.m9989o("Winner is already set");
            return;
        }
        fo5Var.f19190b.cancel();
        ep5 ep5Var = fo5Var.f19197i;
        URI uri = fo5Var.f19199k;
        long j = fo5Var.f19192d.f18401l;
        Long lValueOf = Long.valueOf(j);
        ep5Var.getClass();
        String host = uri.getHost();
        if (ep5Var.f18367i != null) {
            String path = uri.getPath();
            StringBuilder sb = new StringBuilder("CRONET: Fallback used ");
            sb.append(host);
            sb.append(path);
            sb.append(" def: ");
            sb.append(j == -1 ? "Y" : "N");
            String string = sb.toString();
            Handler handler = ep5Var.f18367i;
            Objects.requireNonNull(handler);
            ar1 ar1Var = new ar1((byte) 8);
            ar1Var.f14798b = ep5Var;
            ar1Var.f14799c = string;
            VarHandle.storeStoreFence();
            handler.post(ar1Var);
        }
        Set<fo5> set = ep5Var.f18369k;
        synchronized (set) {
            try {
                for (fo5 fo5Var2 : set) {
                    if (!fo5Var2.isDone() && fo5Var2.f19194f.get() == null && Objects.equals(fo5Var2.f19199k.getHost(), uri.getHost()) && j == fo5Var2.f19192d.f18401l && (scheduledFuture = (ScheduledFuture) fo5Var2.f19195g.get()) != null && scheduledFuture.cancel(false)) {
                        fo5Var2.m5767d();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Map map = ep5Var.f18368j;
        if (j == -1) {
            map.remove(host);
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() + 10000;
        ap5 ap5Var = new ap5();
        ap5Var.f14771a = lValueOf;
        ap5Var.f14772b = jElapsedRealtime;
        VarHandle.storeStoreFence();
        map.put(host, ap5Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m5766c() {
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f19195g.get();
        if (scheduledFuture == null) {
            er0 er0Var = this.f19192d;
            Objects.requireNonNull(er0Var, "Cancel attempted without fallback stream set");
            er0Var.cancel();
        } else {
            if (scheduledFuture.cancel(false)) {
                return;
            }
            wr6 wr6Var = new wr6((byte) 0);
            wr6Var.f33668b = this;
            VarHandle.storeStoreFence();
            this.f19193e.execute(wr6Var);
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void cancel() {
        m5766c();
        er0 er0Var = this.f19190b;
        Objects.requireNonNull(er0Var);
        er0Var.cancel();
    }

    /* JADX INFO: renamed from: d */
    public final void m5767d() {
        if (this.f19194f.get() == null) {
            this.f19192d.start();
            ((AtomicReference) this.f19200l.f33128d).set(ir0.f21659b);
        }
        if (this.f19195g.getAndSet(null) != null) {
            return;
        }
        C1077qn.m9985k("maybeScheduleFastFailover called without active failover future.");
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void flush() {
        if (!this.f19201m) {
            BidirectionalStream bidirectionalStream = (BidirectionalStream) this.f19194f.get();
            Objects.requireNonNull(bidirectionalStream);
            bidirectionalStream.flush();
            return;
        }
        synchronized (this.f19189a) {
            try {
                Iterator it = this.f19206r.iterator();
                while (it.hasNext()) {
                    ((BidirectionalStream) it.next()).flush();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public final boolean isDone() {
        AtomicReference atomicReference = this.f19194f;
        if (atomicReference.get() != null) {
            return ((BidirectionalStream) atomicReference.get()).isDone();
        }
        return this.f19190b.isDone() && this.f19192d.isDone();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void read(ByteBuffer byteBuffer) {
        BidirectionalStream bidirectionalStream = (BidirectionalStream) this.f19194f.get();
        Objects.requireNonNull(bidirectionalStream);
        bidirectionalStream.read(byteBuffer);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void start() {
        ep5 ep5Var = this.f19197i;
        if (!ep5Var.f18369k.add(this)) {
            C1077qn.m9985k("Stream is already registered as active.");
            return;
        }
        er0 er0Var = this.f19190b;
        Objects.requireNonNull(er0Var, "Primary stream is required before starting.");
        er0Var.start();
        ((AtomicReference) this.f19200l.f33127c).set(ir0.f21659b);
        Objects.requireNonNull(this.f19192d, "Fallback stream is required before starting.");
        wr6 wr6Var = new wr6((byte) 1);
        wr6Var.f33668b = this;
        VarHandle.storeStoreFence();
        this.f19195g.set(this.f19193e.schedule(wr6Var, ep5Var.f18364f, TimeUnit.MILLISECONDS));
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void write(ByteBuffer byteBuffer, boolean z) {
        if (!this.f19201m) {
            BidirectionalStream bidirectionalStream = (BidirectionalStream) this.f19194f.get();
            Objects.requireNonNull(bidirectionalStream);
            bidirectionalStream.write(byteBuffer, z);
            return;
        }
        synchronized (this.f19189a) {
            try {
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
                byteBufferAllocateDirect.put(byteBuffer.duplicate());
                in5 in5Var = new in5();
                in5Var.f21592a = byteBuffer;
                in5Var.f21593b = byteBufferAllocateDirect;
                in5Var.f21594c = z;
                VarHandle.storeStoreFence();
                this.f19202n.add(in5Var);
                for (BidirectionalStream bidirectionalStream2 : this.f19206r) {
                    ByteBuffer byteBufferDuplicate = byteBufferAllocateDirect.duplicate();
                    this.f19203o.put(byteBufferDuplicate, in5Var);
                    bidirectionalStream2.write(byteBufferDuplicate, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
