package p000;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tv5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31474a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ yv5 f31475b;

    public /* synthetic */ tv5(byte b) {
        this.f31474a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31474a) {
            case 0:
                this.f31475b.f35554a.m4219c(true);
                break;
            case 1:
                cw5 cw5Var = this.f31475b.f35554a;
                if (cw5Var.f16551l != null) {
                    cw5Var.m4220d();
                    cw5Var.f16551l = null;
                    Log.i("ServiceConnMgrImpl", "notifyOnDisconnected in onServiceDisconnected()");
                    cw5Var.m4217a();
                }
                cw5Var.f16545f = false;
                break;
            default:
                cw5 cw5Var2 = this.f31475b.f35554a;
                cw5Var2.m4219c(true);
                if (cw5Var2.f16546g < 5) {
                    if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                        Log.i("ServiceConnMgrImpl", "Rebinding to service, attempt " + cw5Var2.f16546g);
                    }
                    cw5Var2.m4223g(null);
                } else {
                    Log.w("ServiceConnMgrImpl", "Bind attempts exceeded, not rebinding.");
                    cw5Var2.m4224h();
                }
                break;
        }
    }
}
