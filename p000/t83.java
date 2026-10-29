package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t83 extends k93 {

    /* JADX INFO: renamed from: c */
    public final float f30991c;

    /* JADX INFO: renamed from: d */
    public final float f30992d;

    /* JADX INFO: renamed from: e */
    public final float f30993e;

    /* JADX INFO: renamed from: f */
    public final float f30994f;

    /* JADX INFO: renamed from: g */
    public final float f30995g;

    /* JADX INFO: renamed from: h */
    public final float f30996h;

    public t83(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.f30991c = f;
        this.f30992d = f2;
        this.f30993e = f3;
        this.f30994f = f4;
        this.f30995g = f5;
        this.f30996h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t83)) {
            return false;
        }
        t83 t83Var = (t83) obj;
        return Float.compare(this.f30991c, t83Var.f30991c) == 0 && Float.compare(this.f30992d, t83Var.f30992d) == 0 && Float.compare(this.f30993e, t83Var.f30993e) == 0 && Float.compare(this.f30994f, t83Var.f30994f) == 0 && Float.compare(this.f30995g, t83Var.f30995g) == 0 && Float.compare(this.f30996h, t83Var.f30996h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f30996h) + c75.m3874f(this.f30995g, c75.m3874f(this.f30994f, c75.m3874f(this.f30993e, c75.m3874f(this.f30992d, Float.hashCode(this.f30991c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM4370o = d55.m4370o("CurveTo(x1=", this.f30991c, ", y1=", this.f30992d, ", x2=");
        sbM4370o.append(this.f30993e);
        sbM4370o.append(", y2=");
        sbM4370o.append(this.f30994f);
        sbM4370o.append(", x3=");
        sbM4370o.append(this.f30995g);
        sbM4370o.append(", y3=");
        sbM4370o.append(this.f30996h);
        sbM4370o.append(")");
        return sbM4370o.toString();
    }
}
