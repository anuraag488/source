package p000;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.lang.invoke.VarHandle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rp0 {

    /* JADX INFO: renamed from: a */
    public Context f29495a;

    /* JADX INFO: renamed from: b */
    public bt0 f29496b;

    /* JADX INFO: renamed from: c */
    public nh3 f29497c;

    /* JADX INFO: renamed from: d */
    public long f29498d;

    /* JADX INFO: renamed from: e */
    public z32 f29499e;

    /* JADX INFO: renamed from: f */
    public z32 f29500f;

    /* JADX INFO: renamed from: g */
    public np0 f29501g;

    /* JADX INFO: renamed from: h */
    public q02 f29502h;

    /* JADX INFO: renamed from: i */
    public if1 f29503i;

    /* JADX INFO: renamed from: j */
    public C0902ma f29504j;

    /* JADX INFO: renamed from: k */
    public C0902ma f29505k;

    /* JADX INFO: renamed from: l */
    public kp0 f29506l;

    /* JADX INFO: renamed from: m */
    public sp0 f29507m;

    /* JADX INFO: renamed from: n */
    public wd3 f29508n;

    /* JADX INFO: renamed from: o */
    public jp0 f29509o;

    /* JADX INFO: renamed from: a */
    public final void m10386a(C1372yl c1372yl) {
        jp0.m7209m();
        jp0.m7209m();
        this.f29499e.m13326u();
        ig1 ig1Var = ig1.f21399w;
        ig1Var.m6801p("Initialization marker file was created.");
        try {
            try {
                C0902ma c0902ma = this.f29504j;
                op0 op0Var = new op0();
                op0Var.f26933a = this;
                VarHandle.storeStoreFence();
                c0902ma.mo3138f(op0Var);
                this.f29501g.m8814h();
                if (!c1372yl.m13167e().f15797b.f34839b) {
                    ig1Var.m6798m("Collection of crash reports disabled in Crashlytics settings.", null);
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f29501g.m8810d(c1372yl)) {
                    ig1Var.m6802q("Previous sessions could not be finalized.", null);
                }
                this.f29501g.m8815i(((li4) ((AtomicReference) c1372yl.f35311h).get()).f24059a);
                m10388c();
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                m10388c();
            }
        } catch (Throwable th) {
            m10388c();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10387b(C1372yl c1372yl) {
        ExecutorService executorService = (ExecutorService) ((yq0) this.f29509o.f22481b).f35458b;
        qp0 qp0Var = new qp0((byte) 1);
        qp0Var.f28652b = this;
        qp0Var.f28653c = c1372yl;
        VarHandle.storeStoreFence();
        Future<?> futureSubmit = executorService.submit(qp0Var);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10388c() {
        jp0.m7209m();
        try {
            z32 z32Var = this.f29499e;
            if1 if1Var = (if1) z32Var.f35739c;
            String str = (String) z32Var.f35738b;
            if1Var.getClass();
            if (new File((File) if1Var.f21326c, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }
}
