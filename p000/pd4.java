package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pd4 extends qq2 {

    /* JADX INFO: renamed from: j */
    public final float f27547j;

    /* JADX INFO: renamed from: k */
    public final float f27548k;

    /* JADX INFO: renamed from: l */
    public final int f27549l;

    /* JADX INFO: renamed from: m */
    public final int f27550m;

    public pd4(float f, float f2, int i, int i2, int i3) {
        f = (i3 & 1) != 0 ? 0.0f : f;
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.f27547j = f;
        this.f27548k = f2;
        this.f27549l = i;
        this.f27550m = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd4)) {
            return false;
        }
        pd4 pd4Var = (pd4) obj;
        return this.f27547j == pd4Var.f27547j && this.f27548k == pd4Var.f27548k && this.f27549l == pd4Var.f27549l && this.f27550m == pd4Var.f27550m;
    }

    public final int hashCode() {
        return zi4.m13609i(this.f27550m, zi4.m13609i(this.f27549l, c75.m3874f(this.f27548k, Float.hashCode(this.f27547j) * 31, 31), 31), 31);
    }

    public final String toString() {
        String str;
        String str2 = "Unknown";
        int i = this.f27549l;
        if (i == 0) {
            str = "Butt";
        } else if (i == 1) {
            str = "Round";
        } else {
            str = i == 2 ? "Square" : "Unknown";
        }
        int i2 = this.f27550m;
        if (i2 == 0) {
            str2 = "Miter";
        } else if (i2 == 1) {
            str2 = "Round";
        } else if (i2 == 2) {
            str2 = "Bevel";
        }
        return c75.m3882n(d55.m4370o("Stroke(width=", this.f27547j, ", miter=", this.f27548k, ", cap="), str, ", join=", str2, ", pathEffect=null)");
    }
}
