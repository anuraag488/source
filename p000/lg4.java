package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class lg4 extends st2 {

    /* JADX INFO: renamed from: a */
    public yp1 f24027a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        yp1 yp1Var = this.f24027a;
        mg4 mg4Var = new mg4(ev0.f18505m);
        mg4Var.f24886r = yp1Var;
        return mg4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lg4) && this.f24027a == ((lg4) obj).f24027a;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        mg4 mg4Var = (mg4) mt2Var;
        yp1 yp1Var = this.f24027a;
        if (mg4Var.f24886r != yp1Var) {
            mg4Var.f24886r = yp1Var;
            y05 y05Var = mg4Var.f24887s;
            if (y05Var != null) {
                a05 a05Var = (a05) yp1Var.invoke(y05Var);
                if (z62.m13387o(a05Var, mg4Var.f25442q)) {
                    return;
                }
                mg4Var.f25442q = a05Var;
                mg4Var.mo6659P0();
            }
        }
    }

    public final int hashCode() {
        return this.f24027a.hashCode();
    }
}
