package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i63 extends lb5 {

    /* JADX INFO: renamed from: o */
    public final cr3 f21139o;

    /* JADX INFO: renamed from: p */
    public final C0489bf f21140p;

    public i63(cr3 cr3Var) {
        C0489bf c0489bfM4495a;
        this.f21139o = cr3Var;
        if (C0638f5.m5522A(cr3Var)) {
            c0489bfM4495a = null;
        } else {
            c0489bfM4495a = AbstractC0573df.m4495a();
            C0489bf.m3559b(c0489bfM4495a, cr3Var);
        }
        this.f21140p = c0489bfM4495a;
    }

    @Override // p000.lb5
    /* JADX INFO: renamed from: M */
    public final jl3 mo5906M() {
        cr3 cr3Var = this.f21139o;
        return new jl3(cr3Var.f16391a, cr3Var.f16392b, cr3Var.f16393c, cr3Var.f16394d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i63) {
            return this.f21139o.equals(((i63) obj).f21139o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21139o.hashCode();
    }
}
