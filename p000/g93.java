package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g93 extends k93 {

    /* JADX INFO: renamed from: c */
    public final float f19672c;

    /* JADX INFO: renamed from: d */
    public final float f19673d;

    /* JADX INFO: renamed from: e */
    public final float f19674e;

    /* JADX INFO: renamed from: f */
    public final float f19675f;

    public g93(float f, float f2, float f3, float f4) {
        super(2);
        this.f19672c = f;
        this.f19673d = f2;
        this.f19674e = f3;
        this.f19675f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g93)) {
            return false;
        }
        g93 g93Var = (g93) obj;
        return Float.compare(this.f19672c, g93Var.f19672c) == 0 && Float.compare(this.f19673d, g93Var.f19673d) == 0 && Float.compare(this.f19674e, g93Var.f19674e) == 0 && Float.compare(this.f19675f, g93Var.f19675f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19675f) + c75.m3874f(this.f19674e, c75.m3874f(this.f19673d, Float.hashCode(this.f19672c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM4370o = d55.m4370o("RelativeReflectiveCurveTo(dx1=", this.f19672c, ", dy1=", this.f19673d, ", dx2=");
        sbM4370o.append(this.f19674e);
        sbM4370o.append(", dy2=");
        sbM4370o.append(this.f19675f);
        sbM4370o.append(")");
        return sbM4370o.toString();
    }
}
