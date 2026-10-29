package p000;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vs5 implements ComponentCallbacks {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Activity f32842a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ gs5 f32843b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ gt5 f32844c;

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws PackageManager.NameNotFoundException {
        gt5 gt5Var = this.f32844c;
        Activity activity = this.f32842a;
        gs5 gs5Var = this.f32843b;
        ct5 ct5Var = (ct5) gt5Var.f20116a.get(activity);
        if (ct5Var == null) {
            return;
        }
        int iM7359a = k26.m7359a(activity, configuration.screenWidthDp);
        int iM7359a2 = k26.m7359a(activity, configuration.screenHeightDp);
        if (iM7359a == ct5Var.f16475j && iM7359a2 == ct5Var.f16476k) {
            Log.i("HsdpLifecycleManager", "Configuration changed but window size did not change. Ignoring.");
            return;
        }
        ct5Var.f16475j = iM7359a;
        ct5Var.f16476k = iM7359a2;
        Log.i("HsdpLifecycleManager", "Configuration changed (no recreate) with size change, re-showing HSDP.");
        xq5 xq5Var = gs5Var.f20109l;
        if (xq5Var != null) {
            xq5Var.f34538c = true;
        }
        gs5Var.m6161e(ct5Var, iM7359a, iM7359a2);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
