package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q34 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public static final q34 f28197a = new q34();

    /* JADX INFO: renamed from: b */
    public static boolean f28198b;

    /* JADX INFO: renamed from: c */
    public static tt2 f28199c;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        tt2 tt2Var = f28199c;
        if (tt2Var != null) {
            tt2Var.m11142A(2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ju4 ju4Var;
        tt2 tt2Var = f28199c;
        if (tt2Var != null) {
            tt2Var.m11142A(1);
            ju4Var = ju4.f22634a;
        } else {
            ju4Var = null;
        }
        if (ju4Var == null) {
            f28198b = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
