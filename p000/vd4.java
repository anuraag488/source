package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vd4 extends st2 {

    /* JADX INFO: renamed from: a */
    public C0796jf f32536a;

    /* JADX INFO: renamed from: b */
    public u11 f32537b;

    @Override // p000.st2
    /* JADX INFO: renamed from: c */
    public final mt2 mo118c() {
        wd4 wd4Var = new wd4(this.f32536a, this.f32537b);
        VarHandle.storeStoreFence();
        return wd4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd4)) {
            return false;
        }
        vd4 vd4Var = (vd4) obj;
        return z62.m13387o(this.f32536a, vd4Var.f32536a) && z62.m13387o(this.f32537b, vd4Var.f32537b);
    }

    @Override // p000.st2
    /* JADX INFO: renamed from: f */
    public final void mo119f(mt2 mt2Var) {
        wd4 wd4Var = (wd4) mt2Var;
        C0796jf c0796jf = this.f32536a;
        if (!z62.m13387o(wd4Var.f24433p, c0796jf)) {
            wd4Var.f24433p = c0796jf;
            if (wd4Var.f24434q) {
                wd4Var.m8140Q0();
            }
        }
        wd4Var.f24432o = this.f32537b;
    }

    public final int hashCode() {
        int iM13611k = zi4.m13611k(this.f32536a.f22201b * 31, 31, false);
        u11 u11Var = this.f32537b;
        return iM13611k + (u11Var != null ? u11Var.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.f32536a + ", overrideDescendants=false, touchBoundsExpansion=" + this.f32537b + ")";
    }
}
