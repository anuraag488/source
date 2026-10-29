package p000;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class e05 extends k05 {

    /* JADX INFO: renamed from: c */
    public final WindowInsets.Builder f17575c;

    public e05(w05 w05Var) {
        super(w05Var);
        WindowInsets windowInsetsM12043b = w05Var.m12043b();
        this.f17575c = windowInsetsM12043b != null ? new WindowInsets.Builder(windowInsetsM12043b) : new WindowInsets.Builder();
    }

    @Override // p000.k05
    /* JADX INFO: renamed from: b */
    public w05 mo4837b() {
        m7354a();
        w05 w05VarM12042c = w05.m12042c(null, this.f17575c.build());
        t05 t05Var = w05VarM12042c.f33012a;
        t05Var.mo7786w(null);
        t05Var.mo7785v(null);
        t05Var.mo7769A(this.f22802a);
        t05Var.mo7770B(this.f22803b);
        return w05VarM12042c;
    }

    @Override // p000.k05
    /* JADX INFO: renamed from: d */
    public void mo4838d(g42 g42Var) {
        this.f17575c.setStableInsets(g42Var.m5900c());
    }

    @Override // p000.k05
    /* JADX INFO: renamed from: e */
    public void mo4839e(g42 g42Var) {
        this.f17575c.setSystemWindowInsets(g42Var.m5900c());
    }

    public e05() {
        this.f17575c = new WindowInsets.Builder();
    }
}
