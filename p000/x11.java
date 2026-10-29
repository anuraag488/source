package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x11 extends mt2 implements pp4, af2 {

    /* JADX INFO: renamed from: o */
    public gb5 f33907o;

    /* JADX INFO: renamed from: p */
    public x11 f33908p;

    /* JADX INFO: renamed from: q */
    public x11 f33909q;

    /* JADX INFO: renamed from: r */
    public long f33910r;

    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
        this.f33909q = null;
        this.f33908p = null;
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m12451O0() {
        x11 x11Var = this.f33908p;
        if (x11Var != null) {
            return x11Var.m12451O0();
        }
        x11 x11Var2 = this.f33909q;
        if (x11Var2 != null) {
            return x11Var2.m12451O0();
        }
        return false;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m12452P0() {
        x11 x11Var = this.f33909q;
        if (x11Var != null) {
            x11Var.m12452P0();
            return;
        }
        x11 x11Var2 = this.f33908p;
        if (x11Var2 != null) {
            x11Var2.m12452P0();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m12453Q0() {
        x11 x11Var = this.f33909q;
        if (x11Var != null) {
            x11Var.m12453Q0();
        }
        x11 x11Var2 = this.f33908p;
        if (x11Var2 != null) {
            x11Var2.m12453Q0();
        }
        this.f33908p = null;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m12454R0(js1 js1Var) {
        pp4 pp4Var;
        x11 x11Var;
        x11 x11Var2 = this.f33908p;
        byte b = 1;
        if (x11Var2 == null || !ev0.m5343R(x11Var2, y42.m12866o0(js1Var))) {
            if (this.f25195a.f25208n) {
                ql3 ql3Var = new ql3();
                C1385yy c1385yy = new C1385yy(b);
                c1385yy.f35609b = ql3Var;
                c1385yy.f35610c = this;
                c1385yy.f35611d = js1Var;
                VarHandle.storeStoreFence();
                dt0.m4698a0(this, c1385yy);
                pp4Var = (pp4) ql3Var.f28555a;
            } else {
                pp4Var = null;
            }
            x11Var = (x11) pp4Var;
        } else {
            x11Var = x11Var2;
        }
        if (x11Var != null && x11Var2 == null) {
            x11Var.m12452P0();
            x11Var.m12454R0(js1Var);
            x11 x11Var3 = this.f33909q;
            if (x11Var3 != null) {
                x11Var3.m12453Q0();
            }
        } else if (x11Var == null && x11Var2 != null) {
            x11 x11Var4 = this.f33909q;
            if (x11Var4 != null) {
                x11Var4.m12452P0();
                x11Var4.m12454R0(js1Var);
            }
            x11Var2.m12453Q0();
        } else if (!z62.m13387o(x11Var, x11Var2)) {
            if (x11Var != null) {
                x11Var.m12452P0();
                x11Var.m12454R0(js1Var);
            }
            if (x11Var2 != null) {
                x11Var2.m12453Q0();
            }
        } else if (x11Var != null) {
            x11Var.m12454R0(js1Var);
        } else {
            x11 x11Var5 = this.f33909q;
            if (x11Var5 != null) {
                x11Var5.m12454R0(js1Var);
            }
        }
        this.f33908p = x11Var;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m12455S0() {
        x11 x11Var = this.f33909q;
        if (x11Var != null) {
            x11Var.m12455S0();
            return;
        }
        x11 x11Var2 = this.f33908p;
        if (x11Var2 != null) {
            x11Var2.m12455S0();
        }
    }

    @Override // p000.af2, p000.cr2
    /* JADX INFO: renamed from: b */
    public final void mo2964b(long j) {
        this.f33910r = j;
    }

    @Override // p000.pp4
    /* JADX INFO: renamed from: w */
    public final Object mo3663w() {
        return this.f33907o;
    }
}
