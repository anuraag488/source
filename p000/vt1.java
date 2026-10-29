package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vt1 {

    /* JADX INFO: renamed from: a */
    public byte f32852a;

    /* JADX INFO: renamed from: b */
    public gb5 f32853b;

    /* JADX INFO: renamed from: c */
    public wm1 f32854c;

    /* JADX INFO: renamed from: d */
    public ut1 f32855d;

    /* JADX INFO: renamed from: e */
    public xm1 f32856e;

    /* JADX INFO: renamed from: f */
    public boolean f32857f;

    /* JADX INFO: renamed from: g */
    public wm1 f32858g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt1)) {
            return false;
        }
        vt1 vt1Var = (vt1) obj;
        return z62.m13387o(this.f32855d, vt1Var.f32855d) && z62.m13387o(this.f32856e, vt1Var.f32856e) && this.f32857f == vt1Var.f32857f && this.f32858g.equals(vt1Var.f32858g);
    }

    public final int hashCode() {
        return this.f32858g.f33488a.hashCode() + zi4.m13611k(zi4.m13609i(this.f32857f ? 1 : 0, (((this.f32855d.hashCode() - 1836301217) * 31) + this.f32856e.f34418a) * 31, 31), 31, true);
    }

    public final String toString() {
        String str;
        xm1 xm1Var = this.f32856e;
        boolean z = this.f32857f;
        if (z) {
            str = z ? "Italic" : "Invalid";
        } else {
            str = "Normal";
        }
        return "Font(GoogleFont(\"Rubik\", bestEffort=true), weight=" + xm1Var + ", style=" + str + ", fontVariationSettings=" + this.f32858g + ")";
    }
}
