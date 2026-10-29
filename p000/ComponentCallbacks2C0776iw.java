package p000;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: iw */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0776iw implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: e */
    public static final ComponentCallbacks2C0776iw f21830e;

    /* JADX INFO: renamed from: a */
    public AtomicBoolean f21831a;

    /* JADX INFO: renamed from: b */
    public AtomicBoolean f21832b;

    /* JADX INFO: renamed from: c */
    public ArrayList f21833c;

    /* JADX INFO: renamed from: d */
    public boolean f21834d;

    static {
        ComponentCallbacks2C0776iw componentCallbacks2C0776iw = new ComponentCallbacks2C0776iw();
        componentCallbacks2C0776iw.f21831a = new AtomicBoolean();
        componentCallbacks2C0776iw.f21832b = new AtomicBoolean();
        componentCallbacks2C0776iw.f21833c = new ArrayList();
        componentCallbacks2C0776iw.f21834d = false;
        VarHandle.storeStoreFence();
        f21830e = componentCallbacks2C0776iw;
    }

    /* JADX INFO: renamed from: b */
    public static void m6949b(Application application) {
        ComponentCallbacks2C0776iw componentCallbacks2C0776iw = f21830e;
        synchronized (componentCallbacks2C0776iw) {
            try {
                if (!componentCallbacks2C0776iw.f21834d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C0776iw);
                    application.registerComponentCallbacks(componentCallbacks2C0776iw);
                    componentCallbacks2C0776iw.f21834d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6950a(InterfaceC0740hw interfaceC0740hw) {
        synchronized (f21830e) {
            this.f21833c.add(interfaceC0740hw);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6951c(boolean z) {
        synchronized (f21830e) {
            try {
                ArrayList arrayList = this.f21833c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((InterfaceC0740hw) obj).mo5703a(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f21832b;
        boolean zCompareAndSet = this.f21831a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            m6951c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f21832b;
        boolean zCompareAndSet = this.f21831a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            m6951c(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f21831a.compareAndSet(false, true)) {
            this.f21832b.set(true);
            m6951c(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
