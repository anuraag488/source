package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class x83 extends k93 {

    /* JADX INFO: renamed from: c */
    public float f34062c;

    /* JADX INFO: renamed from: d */
    public float f34063d;

    /* JADX INFO: renamed from: e */
    public float f34064e;

    /* JADX INFO: renamed from: f */
    public float f34065f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x83)) {
            return false;
        }
        x83 x83Var = (x83) obj;
        return Float.compare(this.f34062c, x83Var.f34062c) == 0 && Float.compare(this.f34063d, x83Var.f34063d) == 0 && Float.compare(this.f34064e, x83Var.f34064e) == 0 && Float.compare(this.f34065f, x83Var.f34065f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f34065f) + c75.m3874f(this.f34064e, c75.m3874f(this.f34063d, Float.hashCode(this.f34062c) * 31, 31), 31);
    }

    public final String toString() {
        float f = this.f34062c;
        float f2 = this.f34063d;
        float f3 = this.f34064e;
        float f4 = this.f34065f;
        StringBuilder sbM4370o = d55.m4370o("QuadTo(x1=", f, ", y1=", f2, ", x2=");
        sbM4370o.append(f3);
        sbM4370o.append(", y2=");
        sbM4370o.append(f4);
        sbM4370o.append(")");
        return sbM4370o.toString();
    }
}
