package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vx2 {
    public static final ux2 Companion = new ux2();

    /* JADX INFO: renamed from: a */
    public sn0 f32907a;

    /* JADX INFO: renamed from: b */
    public sn0 f32908b;

    public vx2(sn0 sn0Var, sn0 sn0Var2) {
        this.f32907a = sn0Var;
        this.f32908b = sn0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx2)) {
            return false;
        }
        vx2 vx2Var = (vx2) obj;
        return z62.m13387o(this.f32907a, vx2Var.f32907a) && z62.m13387o(this.f32908b, vx2Var.f32908b);
    }

    public final int hashCode() {
        int iHashCode = this.f32907a.hashCode() * 31;
        sn0 sn0Var = this.f32908b;
        return iHashCode + (sn0Var == null ? 0 : sn0Var.hashCode());
    }

    public final String toString() {
        return "NavBarButton(click=" + this.f32907a + ", longClick=" + this.f32908b + ")";
    }
}
