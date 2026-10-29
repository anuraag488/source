package p000;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fg4 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: a */
    public WeakReference f18964a;

    /* JADX INFO: renamed from: b */
    public Context f18965b;

    /* JADX INFO: renamed from: c */
    public o03 f18966c;

    /* JADX INFO: renamed from: d */
    public boolean f18967d;

    /* JADX INFO: renamed from: e */
    public boolean f18968e;

    /* JADX INFO: renamed from: a */
    public final synchronized void m5706a() {
        try {
            lk3 lk3Var = (lk3) this.f18964a.get();
            if (lk3Var == null) {
                m5707b();
            } else if (this.f18966c == null) {
                lk3Var.f24106d.getClass();
                o03 o03VarM13523h = zc6.m13523h(lk3Var.f24103a, this);
                this.f18966c = o03VarM13523h;
                this.f18968e = o03VarM13523h.mo6232h();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5707b() {
        try {
            if (this.f18967d) {
                return;
            }
            this.f18967d = true;
            Context context = this.f18965b;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            o03 o03Var = this.f18966c;
            if (o03Var != null) {
                o03Var.shutdown();
            }
            this.f18964a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((lk3) this.f18964a.get()) == null) {
            m5707b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i) {
        lk3 lk3Var = (lk3) this.f18964a.get();
        if (lk3Var != null) {
            pk3 pk3Var = (pk3) lk3Var.f24105c.getValue();
            if (pk3Var != null) {
                pk3Var.f27690a.mo7276j(i);
                hf0 hf0Var = pk3Var.f27691b;
                synchronized (hf0Var) {
                    if (i >= 10 && i != 20) {
                        hf0Var.m6374f();
                    }
                }
            }
        } else {
            m5707b();
        }
    }
}
