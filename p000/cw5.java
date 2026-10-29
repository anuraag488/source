package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IInterface;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cw5 {

    /* JADX INFO: renamed from: a */
    public final p56 f16540a;

    /* JADX INFO: renamed from: b */
    public final Context f16541b;

    /* JADX INFO: renamed from: c */
    public final String f16542c;

    /* JADX INFO: renamed from: f */
    public boolean f16545f;

    /* JADX INFO: renamed from: h */
    public final Intent f16547h;

    /* JADX INFO: renamed from: i */
    public final fu5 f16548i;

    /* JADX INFO: renamed from: j */
    public final vu5 f16549j;

    /* JADX INFO: renamed from: k */
    public yv5 f16550k;

    /* JADX INFO: renamed from: l */
    public IInterface f16551l;

    /* JADX INFO: renamed from: d */
    public final ArrayList f16543d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final CopyOnWriteArrayList f16544e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g */
    public int f16546g = 0;

    public cw5(Context context, String str, Intent intent, fu5 fu5Var) {
        this.f16541b = context;
        this.f16542c = str;
        this.f16547h = intent;
        this.f16548i = fu5Var;
        C0973o7 c0973o7 = new C0973o7((byte) 14);
        c0973o7.f26402b = str;
        VarHandle.storeStoreFence();
        this.f16540a = is5.m6929b(c0973o7);
        vu5 vu5Var = new vu5();
        vu5Var.f32882a = this;
        VarHandle.storeStoreFence();
        this.f16549j = vu5Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m4217a() {
        for (wp5 wp5Var : this.f16544e) {
            wp5Var.getClass();
            Log.i("HsdpClientImpl", "HSDP bound service disconnected");
            Handler handlerM4221e = wp5Var.f33584b.m4221e();
            gn5 gn5Var = new gn5((byte) 2);
            gn5Var.f19983b = wp5Var;
            VarHandle.storeStoreFence();
            handlerM4221e.post(gn5Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4218b(Runnable runnable) {
        Handler handlerM4221e = m4221e();
        au3 au3Var = new au3((byte) 3);
        au3Var.f14880b = runnable;
        VarHandle.storeStoreFence();
        handlerM4221e.post(au3Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m4219c(boolean z) {
        if (this.f16550k == null) {
            return;
        }
        Log.i("ServiceConnMgrImpl", "Unbind from service.");
        try {
            Context context = this.f16541b;
            yv5 yv5Var = this.f16550k;
            if (yv5Var == null) {
                throw null;
            }
            context.unbindService(yv5Var);
            this.f16545f = false;
            if (this.f16551l != null) {
                if (z) {
                    m4220d();
                }
                this.f16551l = null;
            }
            this.f16550k = null;
            ArrayList arrayList = this.f16543d;
            synchronized (arrayList) {
                arrayList.clear();
            }
            Log.i("ServiceConnMgrImpl", "notifyOnDisconnected in unbindInternal()");
            m4217a();
        } catch (IllegalArgumentException e) {
            Log.w("ServiceConnMgrImpl", "Failed to unbind service", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4220d() {
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "unlinkToDeath");
        }
        try {
            IInterface iInterface = this.f16551l;
            if (iInterface == null) {
                throw null;
            }
            iInterface.asBinder().unlinkToDeath(this.f16549j, 0);
        } catch (NoSuchElementException e) {
            Log.w("ServiceConnMgrImpl", "Binder already died, failed to unlinkToDeath", e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final Handler m4221e() {
        return (Handler) this.f16540a.mo4490f();
    }

    /* JADX INFO: renamed from: f */
    public final void m4222f(Runnable runnable) {
        ar1 ar1Var = new ar1((byte) 13);
        ar1Var.f14798b = this;
        ar1Var.f14799c = runnable;
        VarHandle.storeStoreFence();
        m4218b(ar1Var);
    }

    /* JADX INFO: renamed from: g */
    public final void m4223g(Runnable runnable) {
        if (this.f16551l != null || this.f16545f) {
            if (!this.f16545f) {
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                Log.i("ServiceConnMgrImpl", "Waiting to bind to the service.");
            }
            ArrayList arrayList = this.f16543d;
            synchronized (arrayList) {
                if (runnable != null) {
                    try {
                        arrayList.add(runnable);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return;
        }
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "Initiate binding to the service.");
        }
        ArrayList arrayList2 = this.f16543d;
        synchronized (arrayList2) {
            if (runnable != null) {
                try {
                    arrayList2.add(runnable);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        yv5 yv5Var = new yv5();
        yv5Var.f35554a = this;
        VarHandle.storeStoreFence();
        this.f16550k = yv5Var;
        this.f16545f = true;
        this.f16546g++;
        if (this.f16541b.bindService(this.f16547h, yv5Var, 65)) {
            return;
        }
        if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
            Log.i("ServiceConnMgrImpl", "Failed to bind to the service.");
        }
        this.f16545f = false;
        ArrayList arrayList3 = this.f16543d;
        synchronized (arrayList3) {
            arrayList3.clear();
        }
        m4217a();
        m4224h();
    }

    /* JADX INFO: renamed from: h */
    public final void m4224h() {
        for (wp5 wp5Var : this.f16544e) {
            wp5Var.getClass();
            Log.w("HsdpClientImpl", "HSDP service binding failed permanently.");
            Handler handlerM4221e = wp5Var.f33584b.m4221e();
            gn5 gn5Var = new gn5((byte) 0);
            gn5Var.f19983b = wp5Var;
            VarHandle.storeStoreFence();
            handlerM4221e.post(gn5Var);
        }
    }
}
