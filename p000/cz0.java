package p000;

import android.app.KeyguardManager;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cz0 extends KeyguardManager.KeyguardDismissCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xn2 f16627a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yp1 f16628b;

    public cz0(xn2 xn2Var, yp1 yp1Var) {
        this.f16627a = xn2Var;
        this.f16628b = yp1Var;
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissCancelled() {
        xn2 xn2Var = this.f16627a;
        if (xn2Var != null) {
            String strM12721a = xn2Var.m12721a();
            k44 k44Var = k44.f22883b;
            if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                xn2Var.m12722b(k44Var, strM12721a, "on dismiss cancelled", null);
            }
        }
        this.f16628b.invoke(Boolean.FALSE);
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissError() {
        xn2 xn2Var = this.f16627a;
        if (xn2Var != null) {
            String strM12721a = xn2Var.m12721a();
            k44 k44Var = k44.f22883b;
            if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                xn2Var.m12722b(k44Var, strM12721a, "on dismiss error", null);
            }
        }
        this.f16628b.invoke(Boolean.FALSE);
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissSucceeded() {
        xn2 xn2Var = this.f16627a;
        if (xn2Var != null) {
            String strM12721a = xn2Var.m12721a();
            k44 k44Var = k44.f22883b;
            if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                xn2Var.m12722b(k44Var, strM12721a, "on dismiss succeeded", null);
            }
        }
        this.f16628b.invoke(Boolean.TRUE);
    }
}
