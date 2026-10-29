package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class up1 extends qs5 {

    /* JADX INFO: renamed from: l */
    public final tp1 f32055l;

    /* JADX INFO: renamed from: m */
    public final String f32056m;

    public up1(tp1 tp1Var, String str) {
        this.f32055l = tp1Var;
        this.f32056m = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up1)) {
            return false;
        }
        up1 up1Var = (up1) obj;
        return this.f32055l == up1Var.f32055l && this.f32056m.equals(up1Var.f32056m);
    }

    public final int hashCode() {
        return zi4.m13613m(this.f32055l.hashCode() * 31, this.f32056m, 31);
    }

    public final String toString() {
        return "FullScreenContentError(code=" + this.f32055l + ", message=" + this.f32056m + ", mediationAdError=null)";
    }
}
