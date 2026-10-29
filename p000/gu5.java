package p000;

import android.os.Handler;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gu5 {

    /* JADX INFO: renamed from: a */
    public wd3 f20141a;

    /* JADX INFO: renamed from: b */
    public Executor f20142b;

    /* JADX INFO: renamed from: c */
    public AtomicReference f20143c;

    /* JADX INFO: renamed from: d */
    public AtomicReference f20144d;

    /* JADX INFO: renamed from: a */
    public final void m6172a() {
        hu5 hu5Var = (hu5) this.f20143c.get();
        if (hu5Var == null) {
            Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
            return;
        }
        pq3 pq3Var = (pq3) this.f20141a.mo4146j();
        pq3Var.f27897c = hu5Var;
        ts5 ts5Var = (ts5) ((rr5) pq3Var.m9621t().f33259b).mo4146j();
        ts5Var.f31400m = true;
        Handler handler = ky5.f23626a;
        oz5 oz5Var = new oz5((byte) 10);
        oz5Var.f27249b = this;
        oz5Var.f27250c = ts5Var;
        VarHandle.storeStoreFence();
        handler.post(oz5Var);
    }
}
