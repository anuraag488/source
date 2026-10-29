package p000;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.util.Log;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ps5 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Activity f27952a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ct5 f27953b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ gs5 f27954c;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) throws PackageManager.NameNotFoundException {
        view.removeOnAttachStateChangeListener(this);
        gt5 gt5Var = gt5.f20115e;
        boolean zIsLoggable = Log.isLoggable("HsdpLifecycleManager", 4);
        Activity activity = this.f27952a;
        if (zIsLoggable) {
            Log.i("HsdpLifecycleManager", "Restoring HSDP session for activity: ".concat(activity.getClass().getName()));
        }
        gs5 gs5Var = this.f27954c;
        ct5 ct5Var = this.f27953b;
        ct5Var.f16474i = false;
        ct5Var.f16475j = k26.m7361c(activity);
        int iM7360b = k26.m7360b(activity);
        ct5Var.f16476k = iM7360b;
        gs5Var.m6161e(ct5Var, ct5Var.f16475j, iM7360b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
