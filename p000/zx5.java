package p000;

import android.os.Trace;
import java.lang.invoke.VarHandle;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UploadDataSink;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class zx5 extends UploadDataSink {

    /* JADX INFO: renamed from: a */
    public AtomicInteger f36449a;

    /* JADX INFO: renamed from: b */
    public xt2 f36450b;

    /* JADX INFO: renamed from: c */
    public Executor f36451c;

    /* JADX INFO: renamed from: d */
    public cr5 f36452d;

    /* JADX INFO: renamed from: e */
    public ByteBuffer f36453e;

    /* JADX INFO: renamed from: f */
    public long f36454f;

    /* JADX INFO: renamed from: g */
    public long f36455g;

    /* JADX INFO: renamed from: h */
    public int f36456h;

    /* JADX INFO: renamed from: a */
    public abstract void mo11198a(Exception exc);

    /* JADX INFO: renamed from: b */
    public final void m13835b(oz5 oz5Var, String str) {
        ry5.m10503a("JavaUploadDataSinkBase#executeOnExecutor ".concat(str));
        try {
            Executor executor = this.f36451c;
            ar1 ar1Var = new ar1((byte) 15);
            ar1Var.f14798b = str;
            ar1Var.f14799c = oz5Var;
            VarHandle.storeStoreFence();
            executor.execute(ar1Var);
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

    /* JADX INFO: renamed from: c */
    public final void m13836c(j16 j16Var, String str) {
        try {
            ry5.m10503a("Cronet JavaUploadDataSinkBase#executeOnUploadExecutor ".concat(str));
            try {
                xt2 xt2Var = this.f36450b;
                yn3 yn3Var = new yn3((byte) 6);
                yn3Var.f35360b = this;
                yn3Var.f35361c = str;
                yn3Var.f35362d = j16Var;
                VarHandle.storeStoreFence();
                xt2Var.execute(yn3Var);
                Trace.endSection();
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (RejectedExecutionException e) {
            mo11198a(e);
        }
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exc) {
        mo11198a(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(boolean z) {
        AtomicInteger atomicInteger = this.f36449a;
        if (!atomicInteger.compareAndSet(0, 2)) {
            C1077qn.m9989o(c75.m3877i(atomicInteger.get(), "onReadSucceeded() called when not awaiting a read result; in state: "));
            return;
        }
        li0 li0Var = new li0((byte) 6);
        li0Var.f24044c = this;
        li0Var.f24043b = z;
        VarHandle.storeStoreFence();
        m13835b(new oz5(((u06) this).f31586m, li0Var), "onReadSucceeded");
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(Exception exc) {
        mo11198a(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        AtomicInteger atomicInteger = this.f36449a;
        byte b = 2;
        if (!atomicInteger.compareAndSet(1, 2)) {
            C1077qn.m9989o(c75.m3877i(atomicInteger.get(), "onRewindSucceeded() called when not awaiting a rewind; in state: "));
            return;
        }
        bt5 bt5Var = new bt5(b);
        bt5Var.f15596b = this;
        VarHandle.storeStoreFence();
        m13835b(new oz5(((u06) this).f31586m, bt5Var), "startRead");
    }
}
