package p000;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iu5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21810a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ cw5 f21811b;

    public /* synthetic */ iu5(byte b) {
        this.f21810a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f21810a;
        cw5 cw5Var = this.f21811b;
        switch (b) {
            case 0:
                cw5Var.m4219c(false);
                break;
            default:
                if (cw5Var.f16551l != null) {
                    cw5Var.f16551l = null;
                    Log.i("ServiceConnMgrImpl", "notifyOnDisconnected in reportBinderDeath()");
                    cw5Var.m4217a();
                }
                break;
        }
    }
}
