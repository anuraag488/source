package p000;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ul1 extends mt2 implements hl1 {
    @Override // p000.hl1
    /* JADX INFO: renamed from: W */
    public final void mo6426W(cl1 cl1Var) {
        View viewM13789v = zt5.m13789v(this);
        cl1Var.mo4040c(this.f25195a.f25208n && zt5.m13789v(this).hasFocusable());
        View viewFindFocus = viewM13789v.findFocus();
        if (viewFindFocus != null) {
            cl1Var.mo4041d(wk1.m12314a(viewFindFocus, viewM13789v));
        }
    }
}
