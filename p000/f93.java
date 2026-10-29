package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f93 extends k93 {

    /* JADX INFO: renamed from: c */
    public float f18862c;

    /* JADX INFO: renamed from: d */
    public float f18863d;

    /* JADX INFO: renamed from: e */
    public float f18864e;

    /* JADX INFO: renamed from: f */
    public float f18865f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f93)) {
            return false;
        }
        f93 f93Var = (f93) obj;
        return Float.compare(this.f18862c, f93Var.f18862c) == 0 && Float.compare(this.f18863d, f93Var.f18863d) == 0 && Float.compare(this.f18864e, f93Var.f18864e) == 0 && Float.compare(this.f18865f, f93Var.f18865f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f18865f) + c75.m3874f(this.f18864e, c75.m3874f(this.f18863d, Float.hashCode(this.f18862c) * 31, 31), 31);
    }

    public final String toString() {
        float f = this.f18862c;
        float f2 = this.f18863d;
        float f3 = this.f18864e;
        float f4 = this.f18865f;
        StringBuilder sbM4370o = d55.m4370o("RelativeQuadTo(dx1=", f, ", dy1=", f2, ", dx2=");
        sbM4370o.append(f3);
        sbM4370o.append(", dy2=");
        sbM4370o.append(f4);
        sbM4370o.append(")");
        return sbM4370o.toString();
    }
}
