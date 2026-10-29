package p000;

import android.app.Activity;
import java.lang.invoke.VarHandle;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gt5 {

    /* JADX INFO: renamed from: e */
    public static final gt5 f20115e;

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap f20116a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap f20117b;

    /* JADX INFO: renamed from: c */
    public ConcurrentHashMap f20118c;

    /* JADX INFO: renamed from: d */
    public boolean f20119d;

    static {
        gt5 gt5Var = new gt5();
        gt5Var.f20116a = new ConcurrentHashMap();
        gt5Var.f20117b = new ConcurrentHashMap();
        gt5Var.f20118c = new ConcurrentHashMap();
        gt5Var.f20119d = false;
        VarHandle.storeStoreFence();
        f20115e = gt5Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m6164a(Activity activity) {
        ct5 ct5Var = (ct5) this.f20116a.remove(activity);
        if (ct5Var != null) {
            this.f20117b.remove(ct5Var.f16466a);
        }
    }
}
