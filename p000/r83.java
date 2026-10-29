package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class r83 extends k93 {

    /* JADX INFO: renamed from: c */
    public float f29089c;

    /* JADX INFO: renamed from: d */
    public float f29090d;

    /* JADX INFO: renamed from: e */
    public float f29091e;

    /* JADX INFO: renamed from: f */
    public boolean f29092f;

    /* JADX INFO: renamed from: g */
    public boolean f29093g;

    /* JADX INFO: renamed from: h */
    public float f29094h;

    /* JADX INFO: renamed from: i */
    public float f29095i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r83)) {
            return false;
        }
        r83 r83Var = (r83) obj;
        return Float.compare(this.f29089c, r83Var.f29089c) == 0 && Float.compare(this.f29090d, r83Var.f29090d) == 0 && Float.compare(this.f29091e, r83Var.f29091e) == 0 && this.f29092f == r83Var.f29092f && this.f29093g == r83Var.f29093g && Float.compare(this.f29094h, r83Var.f29094h) == 0 && Float.compare(this.f29095i, r83Var.f29095i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f29095i) + c75.m3874f(this.f29094h, zi4.m13611k(zi4.m13611k(c75.m3874f(this.f29091e, c75.m3874f(this.f29090d, Float.hashCode(this.f29089c) * 31, 31), 31), 31, this.f29092f), 31, this.f29093g), 31);
    }

    public final String toString() {
        float f = this.f29089c;
        float f2 = this.f29090d;
        float f3 = this.f29091e;
        boolean z = this.f29092f;
        boolean z2 = this.f29093g;
        float f4 = this.f29094h;
        float f5 = this.f29095i;
        StringBuilder sbM4370o = d55.m4370o("ArcTo(horizontalEllipseRadius=", f, ", verticalEllipseRadius=", f2, ", theta=");
        sbM4370o.append(f3);
        sbM4370o.append(", isMoreThanHalf=");
        sbM4370o.append(z);
        sbM4370o.append(", isPositiveArc=");
        sbM4370o.append(z2);
        sbM4370o.append(", arcStartX=");
        sbM4370o.append(f4);
        sbM4370o.append(", arcStartY=");
        sbM4370o.append(f5);
        sbM4370o.append(")");
        return sbM4370o.toString();
    }
}
