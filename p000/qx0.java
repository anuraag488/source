package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class qx0 extends mt2 {

    /* JADX INFO: renamed from: o */
    public final int f28862o = f13.m5455e(this);

    /* JADX INFO: renamed from: p */
    public mt2 f28863p;

    @Override // p000.mt2
    /* JADX INFO: renamed from: E0 */
    public final void mo8392E0() {
        super.mo8392E0();
        for (mt2 mt2Var = this.f28863p; mt2Var != null; mt2Var = mt2Var.f25200f) {
            mt2Var.mo8398N0(this.f25202h);
            if (!mt2Var.f25208n) {
                mt2Var.mo8392E0();
            }
        }
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: F0 */
    public final void mo8393F0() {
        for (mt2 mt2Var = this.f28863p; mt2Var != null; mt2Var = mt2Var.f25200f) {
            mt2Var.mo8393F0();
        }
        super.mo8393F0();
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: J0 */
    public final void mo8394J0() {
        super.mo8394J0();
        for (mt2 mt2Var = this.f28863p; mt2Var != null; mt2Var = mt2Var.f25200f) {
            mt2Var.mo8394J0();
        }
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: K0 */
    public final void mo8395K0() {
        for (mt2 mt2Var = this.f28863p; mt2Var != null; mt2Var = mt2Var.f25200f) {
            mt2Var.mo8395K0();
        }
        super.mo8395K0();
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: L0 */
    public final void mo8396L0() {
        super.mo8396L0();
        for (mt2 mt2Var = this.f28863p; mt2Var != null; mt2Var = mt2Var.f25200f) {
            mt2Var.mo8396L0();
        }
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: M0 */
    public final void mo8397M0(mt2 mt2Var) {
        this.f25195a = mt2Var;
        for (mt2 mt2Var2 = this.f28863p; mt2Var2 != null; mt2Var2 = mt2Var2.f25200f) {
            mt2Var2.mo8397M0(mt2Var);
        }
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: N0 */
    public final void mo8398N0(e13 e13Var) {
        this.f25202h = e13Var;
        for (mt2 mt2Var = this.f28863p; mt2Var != null; mt2Var = mt2Var.f25200f) {
            mt2Var.mo8398N0(e13Var);
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final px0 m10154O0(px0 px0Var) {
        mt2 mt2Var = ((mt2) px0Var).f25195a;
        if (mt2Var != px0Var) {
            mt2 mt2Var2 = px0Var instanceof mt2 ? (mt2) px0Var : null;
            mt2 mt2Var3 = mt2Var2 != null ? mt2Var2.f25199e : null;
            if (mt2Var != this.f25195a || !z62.m13387o(mt2Var3, this)) {
                C1077qn.m9989o("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (mt2Var.f25208n) {
                q32.m9721c("Cannot delegate to an already attached node");
            }
            mt2Var.mo8397M0(this.f25195a);
            int i = this.f25197c;
            int iM5456f = f13.m5456f(mt2Var);
            mt2Var.f25197c = iM5456f;
            int i2 = this.f25197c;
            int i3 = iM5456f & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof lf2)) {
                q32.m9721c("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + mt2Var);
            }
            mt2Var.f25200f = this.f28863p;
            this.f28863p = mt2Var;
            mt2Var.f25199e = this;
            m10156Q0(iM5456f | this.f25197c, false);
            if (this.f25208n) {
                if (i3 == 0 || (i & 2) != 0) {
                    mo8398N0(this.f25202h);
                } else {
                    C0940nb c0940nb = sc6.m10652X(this).f33299G;
                    this.f25195a.mo8398N0(null);
                    c0940nb.m8678p();
                }
                mt2Var.mo8392E0();
                mt2Var.mo8395K0();
                if (!mt2Var.f25208n) {
                    q32.m9721c("autoInvalidateInsertedNode called on unattached node");
                }
                f13.m5451a(mt2Var, -1, 1);
            }
        }
        return px0Var;
    }

    /* JADX INFO: renamed from: P0 */
    public final void m10155P0(px0 px0Var) {
        mt2 mt2Var = null;
        for (mt2 mt2Var2 = this.f28863p; mt2Var2 != null; mt2Var2 = mt2Var2.f25200f) {
            if (mt2Var2 == px0Var) {
                boolean z = mt2Var2.f25208n;
                if (z) {
                    yv2 yv2Var = f13.f18660a;
                    if (!z) {
                        q32.m9721c("autoInvalidateRemovedNode called on unattached node");
                    }
                    f13.m5451a(mt2Var2, -1, 2);
                    mt2Var2.mo8396L0();
                    mt2Var2.mo8393F0();
                }
                mt2Var2.mo8397M0(mt2Var2);
                mt2Var2.f25198d = 0;
                mt2 mt2Var3 = mt2Var2.f25200f;
                if (mt2Var == null) {
                    this.f28863p = mt2Var3;
                } else {
                    mt2Var.f25200f = mt2Var3;
                }
                mt2Var2.f25200f = null;
                mt2Var2.f25199e = null;
                int i = this.f25197c;
                int iM5456f = f13.m5456f(this);
                m10156Q0(iM5456f, true);
                if (this.f25208n && (i & 2) != 0 && (iM5456f & 2) == 0) {
                    C0940nb c0940nb = sc6.m10652X(this).f33299G;
                    this.f25195a.mo8398N0(null);
                    c0940nb.m8678p();
                    return;
                }
                return;
            }
            mt2Var = mt2Var2;
        }
        nm0.m8798k(px0Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [mt2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [mt2] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX INFO: renamed from: Q0 */
    public final void m10156Q0(int i, boolean z) {
        mt2 mt2Var;
        int i2 = this.f25197c;
        this.f25197c = i;
        if (i2 != i) {
            mt2 mt2Var2 = this.f25195a;
            if (mt2Var2 == this) {
                this.f25198d = i;
            }
            boolean z2 = this.f25208n;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.f25197c;
                    r2.f25197c = i;
                    if (r2 == mt2Var2) {
                        break;
                    } else {
                        r2 = r2.f25199e;
                    }
                }
                if (z && r2 == mt2Var2) {
                    i = f13.m5456f(mt2Var2);
                    mt2Var2.f25197c = i;
                }
                int i3 = i | ((r2 == 0 || (mt2Var = r2.f25200f) == null) ? 0 : mt2Var.f25198d);
                for (?? r3 = r2; r3 != 0; r3 = r3.f25199e) {
                    i3 |= r3.f25197c;
                    r3.f25198d = i3;
                }
            }
        }
    }
}
