package p000;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hi0 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ii0 f20595a;

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f20595a.m6808d(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        ii0 ii0Var = this.f20595a;
        ii0Var.f21440g.f21952a.clear();
        ro3 ro3Var = ii0Var.f21441h;
        synchronized (ro3Var) {
            ro3Var.f29477a.m8116c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        ii0 ii0Var = this.f20595a;
        ii0Var.f21440g.f21952a.clear();
        ro3 ro3Var = ii0Var.f21441h;
        synchronized (ro3Var) {
            ro3Var.f29477a.m8116c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.f20595a.f21453t.f16064c.setValue(Boolean.valueOf(z));
    }
}
