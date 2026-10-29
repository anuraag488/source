package p000;

import android.os.Trace;
import internal.p002J.AbstractC0768N;
import java.lang.invoke.VarHandle;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.impl.CronetUrlRequestContext;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class er0 extends ExperimentalBidirectionalStream {

    /* JADX INFO: renamed from: a */
    public final CronetUrlRequestContext f18390a;

    /* JADX INFO: renamed from: b */
    public final u26 f18391b;

    /* JADX INFO: renamed from: c */
    public final String f18392c;

    /* JADX INFO: renamed from: d */
    public final int f18393d;

    /* JADX INFO: renamed from: e */
    public final String f18394e;

    /* JADX INFO: renamed from: f */
    public final String[] f18395f;

    /* JADX INFO: renamed from: g */
    public final boolean f18396g;

    /* JADX INFO: renamed from: h */
    public final boolean f18397h;

    /* JADX INFO: renamed from: i */
    public final int f18398i;

    /* JADX INFO: renamed from: j */
    public final boolean f18399j;

    /* JADX INFO: renamed from: k */
    public final int f18400k;

    /* JADX INFO: renamed from: l */
    public final long f18401l;

    /* JADX INFO: renamed from: n */
    public final ArrayList f18403n;

    /* JADX INFO: renamed from: o */
    public final ArrayDeque f18404o;

    /* JADX INFO: renamed from: p */
    public boolean f18405p;

    /* JADX INFO: renamed from: q */
    public boolean f18406q;

    /* JADX INFO: renamed from: r */
    public long f18407r;

    /* JADX INFO: renamed from: u */
    public RunnableC1029pc f18410u;

    /* JADX INFO: renamed from: m */
    public final Object f18402m = new Object();

    /* JADX INFO: renamed from: s */
    public byte f18408s = 0;

    /* JADX INFO: renamed from: t */
    public byte f18409t = 0;

    public er0(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, BidirectionalStream.Callback callback, Executor executor, String str2, List list, boolean z, boolean z2, int i2, boolean z3, int i3, long j, boolean z4) {
        int i4 = 0;
        this.f18390a = cronetUrlRequestContext;
        this.f18392c = str;
        int i5 = 1;
        if (i != 0) {
            if (i != 1) {
                i5 = 3;
                if (i != 2) {
                    if (i == 3) {
                        i5 = 4;
                    } else {
                        if (i != 4) {
                            C1077qn.m9987m("Invalid stream priority.");
                            throw null;
                        }
                        i5 = 5;
                    }
                }
            } else {
                i5 = 2;
            }
        }
        this.f18393d = i5;
        this.f18391b = new u26(callback);
        this.f18394e = str2;
        int size = list.size();
        String[] strArr = new String[size + size];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int i6 = i4 + 1;
            strArr[i4] = (String) entry.getKey();
            i4 += 2;
            strArr[i6] = (String) entry.getValue();
        }
        this.f18395f = strArr;
        this.f18396g = z;
        this.f18403n = new ArrayList();
        this.f18404o = new ArrayDeque();
        this.f18397h = z2;
        this.f18398i = i2;
        this.f18399j = z3;
        this.f18400k = i3;
        this.f18401l = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m5289a() {
        ArrayDeque arrayDeque = this.f18404o;
        int size = arrayDeque.size();
        ByteBuffer[] byteBufferArr = new ByteBuffer[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (int i = 0; i < size; i++) {
            ByteBuffer byteBuffer = (ByteBuffer) arrayDeque.poll();
            byteBufferArr[i] = byteBuffer;
            iArr[i] = byteBuffer.position();
            iArr2[i] = byteBuffer.limit();
        }
        this.f18409t = (byte) 9;
        this.f18406q = true;
        if (AbstractC0768N.MwJCBTMQ(this.f18407r, byteBufferArr, iArr, iArr2, this.f18405p && this.f18403n.isEmpty())) {
            return;
        }
        this.f18409t = (byte) 8;
        C1077qn.m9987m("Unable to call native writev.");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5290b() {
        return this.f18408s != 0 && this.f18407r == 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m5291c() {
        ry5.m10503a("CronetBidirectionalStream#destroyNativeStreamLocked");
        try {
            long j = this.f18407r;
            if (j != 0) {
                AbstractC0768N.MS2l1kNx(j);
                if (this.f18408s != 0) {
                    this.f18390a.f27020c.decrementAndGet();
                }
                this.f18407r = 0L;
            }
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

    @Override // org.chromium.net.BidirectionalStream
    public final void cancel() {
        ry5.m10503a("CronetBidirectionalStream#cancel");
        try {
            synchronized (this.f18402m) {
                try {
                    if (!m5290b() && this.f18408s != 0) {
                        this.f18409t = (byte) 5;
                        this.f18408s = (byte) 5;
                        m5291c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void flush() {
        byte b;
        ry5.m10503a("CronetBidirectionalStream#flush");
        try {
            synchronized (this.f18402m) {
                try {
                    if (!m5290b() && ((b = this.f18409t) == 8 || b == 9)) {
                        ArrayList arrayList = this.f18403n;
                        if (!arrayList.isEmpty() || !this.f18404o.isEmpty()) {
                            if (!arrayList.isEmpty()) {
                                this.f18404o.addAll(arrayList);
                                arrayList.clear();
                            }
                            if (this.f18409t != 9) {
                                m5289a();
                            }
                        } else if (!this.f18406q) {
                            boolean z = true;
                            this.f18406q = true;
                            AbstractC0768N.MGLIR7Sc(this.f18407r);
                            String str = this.f18394e;
                            if (str.equals("GET") || str.equals("HEAD")) {
                                z = false;
                            }
                            if (!z) {
                                this.f18409t = (byte) 10;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public final boolean isDone() {
        boolean zM5290b;
        synchronized (this.f18402m) {
            zM5290b = m5290b();
        }
        return zM5290b;
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void read(ByteBuffer byteBuffer) {
        ry5.m10503a("CronetBidirectionalStream#read");
        try {
            synchronized (this.f18402m) {
                try {
                    if (!byteBuffer.hasRemaining()) {
                        throw new IllegalArgumentException("ByteBuffer is already full.");
                    }
                    z16.m13290b(byteBuffer);
                    if (this.f18408s != 2) {
                        throw new IllegalStateException("Unexpected read attempt.");
                    }
                    if (!m5290b()) {
                        if (this.f18410u == null) {
                            RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 11);
                            runnableC1029pc.f27515b = this;
                            VarHandle.storeStoreFence();
                            this.f18410u = runnableC1029pc;
                        }
                        this.f18408s = (byte) 3;
                        if (!AbstractC0768N.Md_rPmgC(this.f18407r, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                            this.f18408s = (byte) 2;
                            throw new IllegalArgumentException("Unable to call native read");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void start() {
        ry5.m10503a("CronetBidirectionalStream#start");
        try {
            synchronized (this.f18402m) {
                if (this.f18408s != 0) {
                    throw new IllegalStateException("Stream is already started.");
                }
                try {
                    CronetUrlRequestContext cronetUrlRequestContext = this.f18390a;
                    try {
                        synchronized (cronetUrlRequestContext.f27018a) {
                            try {
                                cronetUrlRequestContext.m9249c();
                                long jMqTDYvZd = AbstractC0768N.MqTDYvZd(this, cronetUrlRequestContext.f27022e, !this.f18396g, this.f18397h, this.f18398i, this.f18399j, this.f18400k, this.f18401l);
                                this.f18407r = jMqTDYvZd;
                                String str = this.f18392c;
                                int i = this.f18393d;
                                String str2 = this.f18394e;
                                String[] strArr = this.f18395f;
                                int iMcDUim_I = AbstractC0768N.McDUim_I(jMqTDYvZd, str, i, str2, strArr, !((str2.equals("GET") || str2.equals("HEAD")) ? false : true));
                                if (iMcDUim_I == -1) {
                                    throw new IllegalArgumentException("Invalid http method ".concat(str2));
                                }
                                if (iMcDUim_I > 0) {
                                    throw new IllegalArgumentException("Invalid header with headername: " + strArr[iMcDUim_I - 1]);
                                }
                                cronetUrlRequestContext.f27021d.incrementAndGet();
                                cronetUrlRequestContext.f27020c.incrementAndGet();
                                new AtomicInteger(1).incrementAndGet();
                                this.f18409t = (byte) 1;
                                this.f18408s = (byte) 1;
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (RuntimeException e) {
                    m5291c();
                    throw e;
                }
            }
            Trace.endSection();
        } catch (Throwable th3) {
            try {
                Trace.endSection();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void write(ByteBuffer byteBuffer, boolean z) {
        ry5.m10503a("CronetBidirectionalStream#write");
        try {
            synchronized (this.f18402m) {
                try {
                    z16.m13290b(byteBuffer);
                    if (!byteBuffer.hasRemaining() && !z) {
                        throw new IllegalArgumentException("Empty buffer before end of stream.");
                    }
                    if (this.f18405p) {
                        throw new IllegalArgumentException("Write after writing end of stream.");
                    }
                    if (!m5290b()) {
                        this.f18403n.add(byteBuffer);
                        if (z) {
                            this.f18405p = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
