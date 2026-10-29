package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
final class vk4 extends st2 {

    /* JADX INFO: renamed from: a */
    public xl4 f32705a;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        xl4 xl4Var = this.f32705a;
        wk4 wk4Var = new wk4();
        wk4Var.f33451o = xl4Var;
        VarHandle.storeStoreFence();
        return wk4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vk4) {
            return z62.m13387o(this.f32705a, ((vk4) obj).f32705a);
        }
        return false;
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        wk4 wk4Var = (wk4) mt2Var;
        xl4 xl4Var = this.f32705a;
        wk4Var.getClass();
        xl4 xl4VarM13512I = zc6.m13512I(xl4Var, sc6.m10652X(wk4Var).f33293A);
        wk4Var.m12318O0(xl4VarM13512I, (am1) sj3.m10825u(wk4Var, ij0.f21476k));
        uk4 uk4Var = wk4Var.f33453q;
        if (uk4Var == null) {
            throw d55.m4375t("Min size state is not set.");
        }
        uk4.m11580a(uk4Var, null, null, xl4VarM13512I, 23);
        z62.m13349H(wk4Var);
    }

    public final int hashCode() {
        return this.f32705a.hashCode();
    }
}
