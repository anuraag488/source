package p000;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class m05 extends l05 {

    /* JADX INFO: renamed from: n */
    public g42 f24521n;

    public m05(w05 w05Var, m05 m05Var) {
        super(w05Var, m05Var);
        this.f24521n = null;
        this.f24521n = m05Var.f24521n;
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: b */
    public w05 mo8169b() {
        return w05.m12042c(null, this.f23671c.consumeStableInsets());
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: c */
    public w05 mo8170c() {
        return w05.m12042c(null, this.f23671c.consumeSystemWindowInsets());
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: l */
    public final g42 mo8171l() {
        g42 g42Var = this.f24521n;
        if (g42Var != null) {
            return g42Var;
        }
        WindowInsets windowInsets = this.f23671c;
        g42 g42VarM5898a = g42.m5898a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.f24521n = g42VarM5898a;
        return g42VarM5898a;
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: s */
    public boolean mo8172s() {
        return this.f23671c.isConsumed();
    }

    public m05(w05 w05Var, WindowInsets windowInsets) {
        super(w05Var, windowInsets);
        this.f24521n = null;
    }
}
