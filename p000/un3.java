package p000;

import android.app.Activity;
import android.app.FragmentManager;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class un3 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m11587a(Activity activity, ek2 ek2Var) {
        if (activity instanceof lk2) {
            gk2 lifecycle = ((lk2) activity).getLifecycle();
            if (lifecycle instanceof ok2) {
                ((ok2) lifecycle).m9154f(ek2Var);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m11588b(ag0 ag0Var) {
        wn3.C1300a.Companion.getClass();
        ag0Var.registerActivityLifecycleCallbacks(new wn3.C1300a());
        FragmentManager fragmentManager = ag0Var.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new wn3(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
