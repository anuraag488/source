package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class r05 extends q05 {

    /* JADX INFO: renamed from: s */
    public static final w05 f28936s = w05.m12042c(null, WindowInsets.CONSUMED);

    public r05(w05 w05Var, WindowInsets windowInsets) {
        super(w05Var, windowInsets);
    }

    @Override // p000.p05, p000.l05, p000.t05
    /* JADX INFO: renamed from: i */
    public g42 mo7777i(int i) {
        return g42.m5899b(this.f23671c.getInsets(v05.m11690a(i)));
    }

    @Override // p000.p05, p000.l05, p000.t05
    /* JADX INFO: renamed from: j */
    public g42 mo7778j(int i) {
        return g42.m5899b(this.f23671c.getInsetsIgnoringVisibility(v05.m11690a(i)));
    }

    @Override // p000.p05, p000.l05, p000.t05
    /* JADX INFO: renamed from: u */
    public boolean mo7784u(int i) {
        return this.f23671c.isVisible(v05.m11690a(i));
    }

    public r05(w05 w05Var, r05 r05Var) {
        super(w05Var, r05Var);
    }

    @Override // p000.l05, p000.t05
    /* JADX INFO: renamed from: p */
    public void mo7780p(View view) {
    }
}
