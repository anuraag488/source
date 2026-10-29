package p000;

import android.os.Trace;
import java.lang.invoke.VarHandle;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class r06 {

    /* JADX INFO: renamed from: a */
    public i36 f28937a;

    /* JADX INFO: renamed from: b */
    public Executor f28938b;

    /* JADX INFO: renamed from: c */
    public Executor f28939c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ i16 f28940d;

    /* JADX INFO: renamed from: a */
    public final void m10176a(j16 j16Var, String str) {
        i16 i16Var = this.f28940d;
        try {
            jz5 jz5Var = new jz5();
            jz5Var.f22779b = i16Var;
            jz5Var.f22780c = j16Var;
            VarHandle.storeStoreFence();
            m10177b(jz5Var, str);
        } catch (RejectedExecutionException e) {
            i16Var.m6557b(new nr5("Exception posting task to executor", e));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10177b(Runnable runnable, String str) {
        ry5.m10503a("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor ".concat(str));
        try {
            Executor executor = this.f28938b;
            dt5 dt5Var = new dt5((byte) 1);
            dt5Var.f17382b = str;
            dt5Var.f17383c = runnable;
            VarHandle.storeStoreFence();
            executor.execute(dt5Var);
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
    public final void m10178c() {
        i16 i16Var = this.f28940d;
        RunnableC1029pc runnableC1029pc = new RunnableC1029pc((byte) 23);
        runnableC1029pc.f27515b = this;
        VarHandle.storeStoreFence();
        i16Var.m6558c(runnableC1029pc, "maybeReportMetrics");
    }
}
