package p000;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s00 implements InterfaceC1027pa, InterfaceC0976oa {

    /* JADX INFO: renamed from: a */
    public ar3 f29779a;

    /* JADX INFO: renamed from: b */
    public short f29780b;

    /* JADX INFO: renamed from: c */
    public TimeUnit f29781c;

    /* JADX INFO: renamed from: d */
    public Object f29782d;

    /* JADX INFO: renamed from: e */
    public CountDownLatch f29783e;

    @Override // p000.InterfaceC1027pa
    /* JADX INFO: renamed from: h */
    public final void mo3140h(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f29783e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // p000.InterfaceC0976oa
    /* JADX INFO: renamed from: k */
    public final void mo3143k(Bundle bundle) {
        synchronized (this.f29782d) {
            try {
                ig1 ig1Var = ig1.f21399w;
                ig1Var.m6801p("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f29783e = new CountDownLatch(1);
                this.f29779a.mo3143k(bundle);
                ig1Var.m6801p("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f29783e.await(this.f29780b, this.f29781c)) {
                        ig1Var.m6801p("App exception callback received from Analytics listener.");
                    } else {
                        ig1Var.m6802q("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f29783e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
