package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vl4 {

    /* JADX INFO: renamed from: a */
    public String f32724a;

    /* JADX INFO: renamed from: b */
    public String f32725b;

    /* JADX INFO: renamed from: c */
    public boolean f32726c;

    /* JADX INFO: renamed from: d */
    public q73 f32727d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl4)) {
            return false;
        }
        vl4 vl4Var = (vl4) obj;
        return z62.m13387o(this.f32724a, vl4Var.f32724a) && z62.m13387o(this.f32725b, vl4Var.f32725b) && this.f32726c == vl4Var.f32726c && z62.m13387o(this.f32727d, vl4Var.f32727d);
    }

    public final int hashCode() {
        int iM13611k = zi4.m13611k(zi4.m13613m(this.f32724a.hashCode() * 31, this.f32725b, 31), 31, this.f32726c);
        q73 q73Var = this.f32727d;
        return iM13611k + (q73Var == null ? 0 : q73Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f32727d + ", isShowingSubstitution=" + this.f32726c + ")";
    }
}
