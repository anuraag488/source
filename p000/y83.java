package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y83 extends k93 {

    /* JADX INFO: renamed from: c */
    public final float f35021c;

    /* JADX INFO: renamed from: d */
    public final float f35022d;

    /* JADX INFO: renamed from: e */
    public final float f35023e;

    /* JADX INFO: renamed from: f */
    public final float f35024f;

    public y83(float f, float f2, float f3, float f4) {
        super(2);
        this.f35021c = f;
        this.f35022d = f2;
        this.f35023e = f3;
        this.f35024f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y83)) {
            return false;
        }
        y83 y83Var = (y83) obj;
        return Float.compare(this.f35021c, y83Var.f35021c) == 0 && Float.compare(this.f35022d, y83Var.f35022d) == 0 && Float.compare(this.f35023e, y83Var.f35023e) == 0 && Float.compare(this.f35024f, y83Var.f35024f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f35024f) + c75.m3874f(this.f35023e, c75.m3874f(this.f35022d, Float.hashCode(this.f35021c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM4370o = d55.m4370o("ReflectiveCurveTo(x1=", this.f35021c, ", y1=", this.f35022d, ", x2=");
        sbM4370o.append(this.f35023e);
        sbM4370o.append(", y2=");
        sbM4370o.append(this.f35024f);
        sbM4370o.append(")");
        return sbM4370o.toString();
    }
}
