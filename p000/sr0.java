package p000;

import android.os.Trace;
import android.util.Log;
import internal.p002J.AbstractC0768N;
import java.lang.invoke.VarHandle;
import java.util.HashSet;
import java.util.concurrent.Executor;
import org.chromium.net.UploadDataSink;
import org.chromium.net.impl.CronetUrlRequestContext;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sr0 extends UploadDataSink {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f30517i = 0;

    /* JADX INFO: renamed from: a */
    public Executor f30518a;

    /* JADX INFO: renamed from: b */
    public cr5 f30519b;

    /* JADX INFO: renamed from: c */
    public tr0 f30520c;

    /* JADX INFO: renamed from: d */
    public long f30521d;

    /* JADX INFO: renamed from: e */
    public Object f30522e;

    /* JADX INFO: renamed from: f */
    public long f30523f;

    /* JADX INFO: renamed from: g */
    public byte f30524g;

    /* JADX INFO: renamed from: h */
    public boolean f30525h;

    /* JADX INFO: renamed from: a */
    public final void m10902a(long j) {
        ry5.m10503a("CronetUploadDataStream#attachNativeAdapterToRequest");
        try {
            synchronized (this.f30522e) {
                this.f30523f = AbstractC0768N.MA4X1aZa(this, j, this.f30521d);
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

    /* JADX INFO: renamed from: b */
    public final void m10903b(Runnable runnable, String str) {
        ry5.m10503a("CronetUploadDataStream#postTaskToExecutor ".concat(str));
        try {
            Executor executor = this.f30518a;
            dt5 dt5Var = new dt5((byte) 0);
            dt5Var.f17382b = str;
            dt5Var.f17383c = runnable;
            VarHandle.storeStoreFence();
            executor.execute(dt5Var);
        } catch (Throwable th) {
            try {
                tr0 tr0Var = this.f30520c;
                tr0Var.getClass();
                new gv5("Exception received from UploadDataProvider", th);
                HashSet hashSet = CronetUrlRequestContext.f27017v;
                Log.e("cn_CronetUrlRequestContext", "Exception in upload method", th);
                synchronized (tr0Var.f31357e) {
                    try {
                        if (!tr0Var.m11093b()) {
                            tr0Var.m11092a(1);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    Trace.endSection();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        Trace.endSection();
    }

    /* JADX INFO: renamed from: c */
    public final void m10904c(int i) {
        byte b = this.f30524g;
        if (b == i) {
            return;
        }
        C1077qn.m9989o(zi4.m13618r(i, b, "Expected ", ", but was "));
    }

    /* JADX INFO: renamed from: d */
    public final void m10905d() {
        synchronized (this.f30522e) {
            try {
                if (this.f30524g == 0) {
                    this.f30525h = true;
                    return;
                }
                long j = this.f30523f;
                if (j == 0) {
                    return;
                }
                AbstractC0768N.MMW1G0N1(j);
                this.f30523f = 0L;
                RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 14);
                runnableC1029pc.f27515b = this;
                VarHandle.storeStoreFence();
                m10903b(runnableC1029pc, "destroyAdapter");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10906e(Throwable th) {
        byte b;
        synchronized (this.f30522e) {
            b = this.f30524g;
            if (b == 3) {
                throw new IllegalStateException("There is no read or rewind or length check in progress.", th);
            }
            this.f30524g = (byte) 3;
            synchronized (this.f30522e) {
                try {
                    if (this.f30524g == 0) {
                        throw new IllegalStateException("Method should not be called when read has not completed.");
                    }
                    if (this.f30525h) {
                        m10905d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (b == 2) {
            try {
                this.f30519b.close();
            } catch (Exception e) {
                Log.e("cn_".concat("sr0"), "Failure closing data provider", e);
            }
        }
        tr0 tr0Var = this.f30520c;
        tr0Var.getClass();
        new gv5("Exception received from UploadDataProvider", th);
        HashSet hashSet = CronetUrlRequestContext.f27017v;
        Log.e("cn_CronetUrlRequestContext", "Exception in upload method", th);
        synchronized (tr0Var.f31357e) {
            try {
                if (tr0Var.m11093b()) {
                    return;
                }
                tr0Var.m11092a(1);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exc) {
        ry5.m10503a("CronetUploadDataStream#onReadError");
        try {
            synchronized (this.f30522e) {
                m10904c(0);
                m10906e(exc);
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

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(boolean z) {
        ry5.m10503a("CronetUploadDataStream#onReadSucceeded");
        try {
            synchronized (this.f30522e) {
                m10904c(0);
                throw null;
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

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(Exception exc) {
        ry5.m10503a("CronetUploadDataStream#onRewindError");
        try {
            synchronized (this.f30522e) {
                m10904c(1);
                m10906e(exc);
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

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        ry5.m10503a("CronetUploadDataStream#onRewindSucceeded");
        try {
            synchronized (this.f30522e) {
                try {
                    m10904c(1);
                    this.f30524g = (byte) 3;
                    long j = this.f30523f;
                    if (j != 0) {
                        AbstractC0768N.MFpRjSMv(j);
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
