package p000;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uf0 implements jk2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31818a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ag0 f31819b;

    public /* synthetic */ uf0(byte b) {
        this.f31818a = b;
    }

    @Override // p000.jk2
    /* JADX INFO: renamed from: b */
    public final void mo3449b(lk2 lk2Var, ek2 ek2Var) {
        Window window;
        View viewPeekDecorView;
        byte b = this.f31818a;
        ag0 ag0Var = this.f31819b;
        switch (b) {
            case 0:
                if (ek2Var == ek2.ON_STOP && (window = ag0Var.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            default:
                if (ek2Var == ek2.ON_DESTROY) {
                    ag0Var.f14448b.f36357b = null;
                    if (!ag0Var.isChangingConfigurations()) {
                        ag0Var.mo2976c().m9336a();
                    }
                    yf0 yf0Var = ag0Var.f14452f;
                    ag0 ag0Var2 = yf0Var.f35192d;
                    ag0Var2.getWindow().getDecorView().removeCallbacks(yf0Var);
                    ag0Var2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(yf0Var);
                }
                break;
        }
    }
}
