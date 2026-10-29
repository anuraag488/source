package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wj4 {

    /* JADX INFO: renamed from: a */
    public final C0875lk f33431a;

    /* JADX INFO: renamed from: b */
    public final xl4 f33432b;

    /* JADX INFO: renamed from: c */
    public final boolean f33433c;

    /* JADX INFO: renamed from: d */
    public final ky0 f33434d;

    /* JADX INFO: renamed from: e */
    public final am1 f33435e;

    /* JADX INFO: renamed from: f */
    public final List f33436f;

    /* JADX INFO: renamed from: g */
    public C1122rv f33437g;

    /* JADX INFO: renamed from: h */
    public df2 f33438h;

    public wj4(C0875lk c0875lk, ky0 ky0Var, am1 am1Var, xl4 xl4Var, List list, boolean z) {
        this.f33431a = c0875lk;
        this.f33432b = xl4Var;
        this.f33433c = z;
        this.f33434d = ky0Var;
        this.f33435e = am1Var;
        this.f33436f = list;
    }

    /* JADX INFO: renamed from: a */
    public final void m12312a(df2 df2Var) {
        C1122rv c1122rv = this.f33437g;
        if (c1122rv == null || df2Var != this.f33438h || c1122rv.mo2951b()) {
            this.f33438h = df2Var;
            c1122rv = new C1122rv(this.f33431a, this.f33434d, this.f33435e, zc6.m13512I(this.f33432b, df2Var), this.f33436f, this.f33433c);
        }
        this.f33437g = c1122rv;
    }
}
