package p000;

import android.os.Trace;
import android.util.Log;
import internal.p002J.AbstractC0768N;
import java.lang.invoke.VarHandle;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetUrlRequestContext;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tr0 extends ExperimentalUrlRequest {

    /* JADX INFO: renamed from: a */
    public final boolean f31353a;

    /* JADX INFO: renamed from: b */
    public long f31354b;

    /* JADX INFO: renamed from: c */
    public boolean f31355c;

    /* JADX INFO: renamed from: d */
    public boolean f31356d;

    /* JADX INFO: renamed from: e */
    public final Object f31357e = new Object();

    /* JADX INFO: renamed from: f */
    public final CronetUrlRequestContext f31358f;

    /* JADX INFO: renamed from: g */
    public final Executor f31359g;

    /* JADX INFO: renamed from: h */
    public final String f31360h;

    /* JADX INFO: renamed from: i */
    public final int f31361i;

    /* JADX INFO: renamed from: j */
    public final int f31362j;

    /* JADX INFO: renamed from: k */
    public final String f31363k;

    /* JADX INFO: renamed from: l */
    public final List f31364l;

    /* JADX INFO: renamed from: m */
    public final boolean f31365m;

    /* JADX INFO: renamed from: n */
    public final boolean f31366n;

    /* JADX INFO: renamed from: o */
    public final boolean f31367o;

    /* JADX INFO: renamed from: p */
    public final int f31368p;

    /* JADX INFO: renamed from: q */
    public final boolean f31369q;

    /* JADX INFO: renamed from: r */
    public final int f31370r;

    /* JADX INFO: renamed from: s */
    public final byte[] f31371s;

    /* JADX INFO: renamed from: t */
    public final ByteBuffer f31372t;

    /* JADX INFO: renamed from: u */
    public final String f31373u;

    /* JADX INFO: renamed from: v */
    public final long f31374v;

    /* JADX INFO: renamed from: w */
    public final sr0 f31375w;

    /* JADX WARN: Code duplicated, block: B:21:0x0084  */
    public tr0(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, UrlRequest.Callback callback, Executor executor, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, RequestFinishedInfo.Listener listener, int i4, long j, String str2, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor2, byte[] bArr, ByteBuffer byteBuffer, String str3) {
        int i5;
        sr0 sr0Var;
        ArrayList arrayList2 = new ArrayList();
        Objects.requireNonNull(str, "URL is required");
        Objects.requireNonNull(callback, "Listener is required");
        Objects.requireNonNull(executor, "Executor is required");
        Objects.requireNonNull(str3, "Dictionary ID is expect to be an empty string if not specified");
        this.f31353a = z3;
        this.f31358f = cronetUrlRequestContext;
        this.f31360h = str;
        arrayList2.add(str);
        int i6 = 2;
        if (i == 0) {
            i5 = 1;
        } else if (i == 1) {
            i5 = 2;
        } else if (i != 2) {
            i5 = 4;
            if (i != 3 && i == 4) {
                i5 = 5;
            }
        } else {
            i5 = 3;
        }
        this.f31361i = i5;
        new i36(callback);
        this.f31359g = executor;
        this.f31365m = z;
        this.f31366n = z2;
        this.f31367o = z4;
        this.f31368p = i2;
        this.f31369q = z5;
        this.f31370r = i3;
        if (listener != null) {
            new f36(listener.getExecutor()).f18722a = listener;
        }
        this.f31371s = bArr;
        this.f31372t = byteBuffer;
        this.f31373u = str3;
        if (i4 == 0) {
            i6 = 0;
        } else if (i4 == 1) {
            i6 = 1;
        } else if (i4 != 2) {
            i6 = 0;
        }
        this.f31362j = i6;
        this.f31374v = j;
        this.f31363k = str2;
        this.f31364l = Collections.unmodifiableList(new ArrayList(arrayList));
        if (uploadDataProvider == null) {
            sr0Var = null;
        } else {
            sr0 sr0Var2 = new sr0();
            new AtomicInteger();
            sr0Var2.f30522e = new Object();
            sr0Var2.f30524g = (byte) 3;
            sr0Var2.f30518a = executor2;
            sr0Var2.f30519b = new cr5(uploadDataProvider, (byte) 3);
            sr0Var2.f30520c = this;
            VarHandle.storeStoreFence();
            sr0Var = sr0Var2;
        }
        this.f31375w = sr0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m11092a(int i) {
        if (this.f31354b == 0) {
            return;
        }
        this.f31358f.f27020c.decrementAndGet();
        AbstractC0768N.M4znfYdB(this.f31354b, i == 2);
        this.f31354b = 0L;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11093b() {
        return this.f31355c && this.f31354b == 0;
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        ry5.m10503a("CronetUrlRequest#cancel");
        try {
            synchronized (this.f31357e) {
                try {
                    if (!m11093b() && this.f31355c) {
                        m11092a(2);
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

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        ry5.m10503a("CronetUrlRequest#followRedirect");
        try {
            synchronized (this.f31357e) {
                throw new IllegalStateException("No redirect to follow.");
            }
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
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        px4 px4Var = new px4(statusListener);
        synchronized (this.f31357e) {
            try {
                long j = this.f31354b;
                if (j != 0) {
                    AbstractC0768N.MgIIMpT9(j, px4Var);
                    return;
                }
                au5 au5Var = new au5();
                au5Var.f14886a = px4Var;
                VarHandle.storeStoreFence();
                ry5.m10503a("CronetUrlRequest#postTaskToExecutor getStatus");
                try {
                    try {
                        Executor executor = this.f31359g;
                        oz5 oz5Var = new oz5((byte) 12);
                        oz5Var.f27249b = "getStatus";
                        oz5Var.f27250c = au5Var;
                        VarHandle.storeStoreFence();
                        executor.execute(oz5Var);
                    } catch (RejectedExecutionException e) {
                        HashSet hashSet = CronetUrlRequestContext.f27017v;
                        Log.e("cn_CronetUrlRequestContext", "Exception posting task to executor", e);
                        new nr5("Exception posting task to executor", e);
                        synchronized (this.f31357e) {
                            try {
                                if (!m11093b()) {
                                    m11092a(1);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
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
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        boolean zM11093b;
        synchronized (this.f31357e) {
            zM11093b = m11093b();
        }
        return zM11093b;
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer) {
        ry5.m10503a("CronetUrlRequest#read");
        try {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalArgumentException("ByteBuffer is already full.");
            }
            z16.m13290b(byteBuffer);
            synchronized (this.f31357e) {
                try {
                    if (!this.f31356d) {
                        throw new IllegalStateException("Unexpected read attempt.");
                    }
                    this.f31356d = false;
                    if (!m11093b()) {
                        if (!AbstractC0768N.MfCxA8r3(this.f31354b, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                            this.f31356d = true;
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

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        ry5.m10503a("CronetUrlRequest#start");
        try {
            Object obj = this.f31357e;
            synchronized (obj) {
                try {
                    synchronized (obj) {
                        if (this.f31355c || m11093b()) {
                            throw new IllegalStateException("Request is already started.");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            try {
                CronetUrlRequestContext cronetUrlRequestContext = this.f31358f;
                try {
                    synchronized (cronetUrlRequestContext.f27018a) {
                        try {
                            cronetUrlRequestContext.m9249c();
                            long j = cronetUrlRequestContext.f27022e;
                            String str = this.f31360h;
                            int i = this.f31361i;
                            boolean z = this.f31365m;
                            boolean z2 = this.f31366n;
                            boolean z3 = this.f31367o;
                            int i2 = this.f31368p;
                            boolean z4 = this.f31369q;
                            int i3 = this.f31370r;
                            int i4 = this.f31362j;
                            byte[] bArr = this.f31371s;
                            ByteBuffer byteBuffer = this.f31372t;
                            boolean z5 = false;
                            this.f31354b = AbstractC0768N.MuOIsMvf(this, j, str, i, z, z2, z3, i2, z4, i3, i4, bArr, byteBuffer, byteBuffer != null ? byteBuffer.position() : 0, byteBuffer != null ? byteBuffer.limit() : 0, this.f31373u, this.f31374v);
                            cronetUrlRequestContext.f27021d.incrementAndGet();
                            cronetUrlRequestContext.f27020c.incrementAndGet();
                            long j2 = this.f31354b;
                            String str2 = this.f31363k;
                            if (!AbstractC0768N.M51RPBJe(j2, str2)) {
                                throw new IllegalArgumentException("Invalid http method " + str2);
                            }
                            for (Map.Entry entry : this.f31364l) {
                                if (((String) entry.getKey()).equalsIgnoreCase("Content-Type") && !((String) entry.getValue()).isEmpty()) {
                                    z5 = true;
                                }
                                if (!AbstractC0768N.MvHusd1J(this.f31354b, (String) entry.getKey(), (String) entry.getValue())) {
                                    throw new IllegalArgumentException("Invalid header with headername: " + ((String) entry.getKey()));
                                }
                            }
                            sr0 sr0Var = this.f31375w;
                            if (sr0Var == null) {
                                this.f31355c = true;
                                AbstractC0768N.MabZ5m6r(this.f31354b);
                            } else {
                                if (!z5) {
                                    throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                                }
                                this.f31355c = true;
                                RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 15);
                                runnableC1029pc.f27515b = this;
                                VarHandle.storeStoreFence();
                                sr0Var.m10903b(runnableC1029pc, "CronetUrlRequest#start");
                            }
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (RuntimeException e) {
                m11092a(1);
                this.f31358f.f27021d.decrementAndGet();
                throw e;
            }
        } catch (Throwable th4) {
            try {
                Trace.endSection();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }
}
