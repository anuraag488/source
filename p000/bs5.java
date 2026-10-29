package p000;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bs5 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public Activity f15557a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ts5 f15558b;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ts5 ts5Var = this.f15558b;
        Dialog dialog = ts5Var.f31394g;
        AtomicReference atomicReference = ts5Var.f31399l;
        if (dialog == null || !ts5Var.f31400m) {
            return;
        }
        dialog.setOwnerActivity(activity);
        wu5 wu5Var = ts5Var.f31389b;
        if (wu5Var != null) {
            wu5Var.f33746a = activity;
        }
        bs5 bs5Var = (bs5) atomicReference.getAndSet(null);
        if (bs5Var != null) {
            bs5Var.f15558b.f31388a.unregisterActivityLifecycleCallbacks(bs5Var);
            bs5 bs5Var2 = new bs5();
            bs5Var2.f15558b = ts5Var;
            bs5Var2.f15557a = activity;
            VarHandle.storeStoreFence();
            ts5Var.f31388a.registerActivityLifecycleCallbacks(bs5Var2);
            atomicReference.set(bs5Var2);
        }
        Dialog dialog2 = ts5Var.f31394g;
        if (dialog2 != null) {
            dialog2.show();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Dialog dialog;
        ts5 ts5Var = this.f15558b;
        if (activity != this.f15557a) {
            return;
        }
        if (activity.isChangingConfigurations() && ts5Var.f31400m && (dialog = ts5Var.f31394g) != null) {
            dialog.dismiss();
            return;
        }
        n56 n56Var = new n56(3, "Activity is destroyed.");
        Dialog dialog2 = ts5Var.f31394g;
        if (dialog2 != null) {
            dialog2.dismiss();
            ts5Var.f31394g = null;
        }
        ts5Var.f31389b.f33746a = null;
        bs5 bs5Var = (bs5) ts5Var.f31399l.getAndSet(null);
        if (bs5Var != null) {
            bs5Var.f15558b.f31388a.unregisterActivityLifecycleCallbacks(bs5Var);
        }
        al0 al0Var = (al0) ts5Var.f31398k.getAndSet(null);
        if (al0Var == null) {
            return;
        }
        ts5Var.m11132d(n56Var);
        al0Var.mo3042a(n56Var.m8537a());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
