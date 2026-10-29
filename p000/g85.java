package p000;

import ads_mobile_sdk.C0400x9;
import ads_mobile_sdk.rh2;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g85 implements ViewTreeObserver.OnWindowFocusChangeListener {
    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        rh2.m2189a().getClass();
        C0400x9 c0400x9 = C0400x9.f13206d;
        boolean zM623a = c0400x9.m623a();
        if (c0400x9.f2214b != zM623a) {
            c0400x9.f2214b = zM623a;
            if (c0400x9.f2213a) {
                c0400x9.mo622a(zM623a);
                y55 y55Var = c0400x9.f2215c;
                if (y55Var != null) {
                    y55Var.mo2063a(zM623a);
                }
            }
        }
    }
}
