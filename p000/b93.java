package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b93 extends k93 {

    /* JADX INFO: renamed from: c */
    public final float f15174c;

    /* JADX INFO: renamed from: d */
    public final float f15175d;

    /* JADX INFO: renamed from: e */
    public final float f15176e;

    /* JADX INFO: renamed from: f */
    public final float f15177f;

    /* JADX INFO: renamed from: g */
    public final float f15178g;

    /* JADX INFO: renamed from: h */
    public final float f15179h;

    public b93(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.f15174c = f;
        this.f15175d = f2;
        this.f15176e = f3;
        this.f15177f = f4;
        this.f15178g = f5;
        this.f15179h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b93)) {
            return false;
        }
        b93 b93Var = (b93) obj;
        return Float.compare(this.f15174c, b93Var.f15174c) == 0 && Float.compare(this.f15175d, b93Var.f15175d) == 0 && Float.compare(this.f15176e, b93Var.f15176e) == 0 && Float.compare(this.f15177f, b93Var.f15177f) == 0 && Float.compare(this.f15178g, b93Var.f15178g) == 0 && Float.compare(this.f15179h, b93Var.f15179h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15179h) + c75.m3874f(this.f15178g, c75.m3874f(this.f15177f, c75.m3874f(this.f15176e, c75.m3874f(this.f15175d, Float.hashCode(this.f15174c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM4370o = d55.m4370o("RelativeCurveTo(dx1=", this.f15174c, ", dy1=", this.f15175d, ", dx2=");
        sbM4370o.append(this.f15176e);
        sbM4370o.append(", dy2=");
        sbM4370o.append(this.f15177f);
        sbM4370o.append(", dx3=");
        sbM4370o.append(this.f15178g);
        sbM4370o.append(", dy3=");
        sbM4370o.append(this.f15179h);
        sbM4370o.append(")");
        return sbM4370o.toString();
    }
}
