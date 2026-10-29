package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: zg */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1404zg implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f36056a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0651fh f36057b;

    public /* synthetic */ C1404zg(byte b) {
        this.f36056a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f36056a;
        byte b2 = 1;
        ju4 ju4Var = ju4.f22634a;
        C0651fh c0651fh = this.f36057b;
        switch (b) {
            case 0:
                wp1 wp1Var = (wp1) obj;
                View view = c0651fh.f18971a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    wp1Var.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        RunnableC0683gc runnableC0683gc = new RunnableC0683gc((byte) 1);
                        runnableC0683gc.f19736b = wp1Var;
                        VarHandle.storeStoreFence();
                        handler2.post(runnableC0683gc);
                    }
                }
                return ju4Var;
            case 1:
                ActionMode actionMode = c0651fh.f18978h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return ju4Var;
            case 2:
                ActionMode actionMode2 = c0651fh.f18978h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return ju4Var;
            default:
                c0651fh.f18975e.m160f();
                C1032pf c1032pf = new C1032pf(b2);
                c1032pf.f27570b = c0651fh;
                VarHandle.storeStoreFence();
                return c1032pf;
        }
    }
}
