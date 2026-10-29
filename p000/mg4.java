package p000;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mg4 extends n42 {

    /* JADX INFO: renamed from: r */
    public yp1 f24886r;

    /* JADX INFO: renamed from: s */
    public y05 f24887s;

    @Override // p000.i42, p000.mt2
    /* JADX INFO: renamed from: G0 */
    public final void mo26G0() {
        View viewM13511H = zc6.m13511H(this);
        WeakHashMap weakHashMap = y05.f34773x;
        y05 y05VarM7393r = k43.m7393r(viewM13511H);
        y05VarM7393r.m12813a(viewM13511H);
        a05 a05Var = (a05) this.f24886r.invoke(y05VarM7393r);
        if (!z62.m13387o(a05Var, this.f25442q)) {
            this.f25442q = a05Var;
            mo6659P0();
        }
        this.f24887s = y05VarM7393r;
        super.mo26G0();
    }

    @Override // p000.i42, p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
        View viewM13511H = zc6.m13511H(this);
        y05 y05Var = this.f24887s;
        if (y05Var != null) {
            int i = y05Var.f34795v - 1;
            y05Var.f34795v = i;
            if (i == 0) {
                int i2 = cy4.f16619a;
                yx4.m13270a(viewM13511H, null);
                viewM13511H.setWindowInsetsAnimationCallback(null);
                viewM13511H.removeOnAttachStateChangeListener(y05Var.f34796w);
            }
        }
        super.mo27H0();
    }
}
