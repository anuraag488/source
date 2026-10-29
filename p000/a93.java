package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a93 extends k93 {

    /* JADX INFO: renamed from: c */
    public final float f185c;

    /* JADX INFO: renamed from: d */
    public final float f186d;

    /* JADX INFO: renamed from: e */
    public final float f187e;

    /* JADX INFO: renamed from: f */
    public final boolean f188f;

    /* JADX INFO: renamed from: g */
    public final boolean f189g;

    /* JADX INFO: renamed from: h */
    public final float f190h;

    /* JADX INFO: renamed from: i */
    public final float f191i;

    public a93(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(3);
        this.f185c = f;
        this.f186d = f2;
        this.f187e = f3;
        this.f188f = z;
        this.f189g = z2;
        this.f190h = f4;
        this.f191i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a93)) {
            return false;
        }
        a93 a93Var = (a93) obj;
        return Float.compare(this.f185c, a93Var.f185c) == 0 && Float.compare(this.f186d, a93Var.f186d) == 0 && Float.compare(this.f187e, a93Var.f187e) == 0 && this.f188f == a93Var.f188f && this.f189g == a93Var.f189g && Float.compare(this.f190h, a93Var.f190h) == 0 && Float.compare(this.f191i, a93Var.f191i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f191i) + c75.m3874f(this.f190h, zi4.m13611k(zi4.m13611k(c75.m3874f(this.f187e, c75.m3874f(this.f186d, Float.hashCode(this.f185c) * 31, 31), 31), 31, this.f188f), 31, this.f189g), 31);
    }

    public final String toString() {
        StringBuilder sbM4370o = d55.m4370o("RelativeArcTo(horizontalEllipseRadius=", this.f185c, ", verticalEllipseRadius=", this.f186d, ", theta=");
        sbM4370o.append(this.f187e);
        sbM4370o.append(", isMoreThanHalf=");
        sbM4370o.append(this.f188f);
        sbM4370o.append(", isPositiveArc=");
        sbM4370o.append(this.f189g);
        sbM4370o.append(", arcStartDx=");
        sbM4370o.append(this.f190h);
        sbM4370o.append(", arcStartDy=");
        sbM4370o.append(this.f191i);
        sbM4370o.append(")");
        return sbM4370o.toString();
    }
}
