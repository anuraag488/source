package p000;

import android.window.OnBackInvokedDispatcher;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t33 {

    /* JADX INFO: renamed from: a */
    public final Runnable f30741a;

    /* JADX INFO: renamed from: b */
    public final dg4 f30742b;

    public t33(Runnable runnable) {
        this.f30741a = runnable;
        g32 g32Var = new g32((byte) 13);
        g32Var.f19558b = this;
        VarHandle.storeStoreFence();
        this.f30742b = new dg4(g32Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m10973a(lk2 lk2Var, o33 o33Var) {
        gk2 lifecycle = lk2Var.getLifecycle();
        if (lifecycle.mo6016b() == fk2.f19054a) {
            return;
        }
        n33 n33VarCreateNavigationEventHandler$activity = o33Var.createNavigationEventHandler$activity(new p33(lk2Var, o33Var));
        n33VarCreateNavigationEventHandler$activity.m8487h(false);
        C1283w7.m12113e(m10974b().f28978c, n33VarCreateNavigationEventHandler$activity);
        lw0 lw0Var = new lw0((byte) 2);
        lw0Var.f24410b = n33VarCreateNavigationEventHandler$activity;
        lw0Var.f24411c = lifecycle;
        VarHandle.storeStoreFence();
        lifecycle.mo6015a(lw0Var);
        q33 q33Var = new q33();
        q33Var.f28195a = lifecycle;
        q33Var.f28196b = lw0Var;
        VarHandle.storeStoreFence();
        o33Var.addCloseable$activity(q33Var);
    }

    /* JADX INFO: renamed from: b */
    public final r33 m10974b() {
        return (r33) this.f30742b.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m10975c() {
        m10974b().m6971a();
    }

    /* JADX INFO: renamed from: d */
    public final void m10976d(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        m10974b().f28978c.m12138h(new l33(onBackInvokedDispatcher, 0), 1);
        m10974b().f28978c.m12138h(new l33(onBackInvokedDispatcher, 1000000), 0);
    }
}
