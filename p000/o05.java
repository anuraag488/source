package p000;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class o05 extends n05 {

    /* JADX INFO: renamed from: o */
    public g42 f26272o;

    /* JADX INFO: renamed from: p */
    public g42 f26273p;

    /* JADX INFO: renamed from: q */
    public g42 f26274q;

    public o05(w05 w05Var, WindowInsets windowInsets) {
        super(w05Var, windowInsets);
        this.f26272o = null;
        this.f26273p = null;
        this.f26274q = null;
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: k */
    public g42 mo8914k() {
        g42 g42Var = this.f26273p;
        if (g42Var != null) {
            return g42Var;
        }
        g42 g42VarM5899b = g42.m5899b(this.f23671c.getMandatorySystemGestureInsets());
        this.f26273p = g42VarM5899b;
        return g42VarM5899b;
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: m */
    public g42 mo8915m() {
        g42 g42Var = this.f26272o;
        if (g42Var != null) {
            return g42Var;
        }
        g42 g42VarM5899b = g42.m5899b(this.f23671c.getSystemGestureInsets());
        this.f26272o = g42VarM5899b;
        return g42VarM5899b;
    }

    @Override // p000.t05
    /* JADX INFO: renamed from: o */
    public g42 mo8916o() {
        g42 g42Var = this.f26274q;
        if (g42Var != null) {
            return g42Var;
        }
        g42 g42VarM5899b = g42.m5899b(this.f23671c.getTappableElementInsets());
        this.f26274q = g42VarM5899b;
        return g42VarM5899b;
    }

    @Override // p000.l05, p000.t05
    /* JADX INFO: renamed from: r */
    public w05 mo7782r(int i, int i2, int i3, int i4) {
        return w05.m12042c(null, this.f23671c.inset(i, i2, i3, i4));
    }

    public o05(w05 w05Var, o05 o05Var) {
        super(w05Var, o05Var);
        this.f26272o = null;
        this.f26273p = null;
        this.f26274q = null;
    }
}
