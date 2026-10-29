package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dl2 {

    /* JADX INFO: renamed from: d */
    public static final dl2 f17143d = new dl2(al2.f14610c, 17, 0);

    /* JADX INFO: renamed from: a */
    public final float f17144a;

    /* JADX INFO: renamed from: b */
    public final int f17145b;

    /* JADX INFO: renamed from: c */
    public final int f17146c;

    public dl2(float f, int i, int i2) {
        this.f17144a = f;
        this.f17145b = i;
        this.f17146c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl2)) {
            return false;
        }
        dl2 dl2Var = (dl2) obj;
        float f = dl2Var.f17144a;
        float f2 = al2.f14609b;
        return Float.compare(this.f17144a, f) == 0 && this.f17145b == dl2Var.f17145b && this.f17146c == dl2Var.f17146c;
    }

    public final int hashCode() {
        float f = al2.f14609b;
        return Integer.hashCode(this.f17146c) + zi4.m13609i(this.f17145b, Float.hashCode(this.f17144a) * 31, 31);
    }

    public final String toString() {
        String str;
        String strM3044b = al2.m3044b(this.f17144a);
        String str2 = "Invalid";
        int i = this.f17145b;
        if (i == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else {
            str = i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        int i2 = this.f17146c;
        if (i2 == 0) {
            str2 = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str2 = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str2 = "LineHeightStyle.Mode.Tight";
        }
        return zi4.m13623w(zi4.m13625y("LineHeightStyle(alignment=", strM3044b, ", trim=", str, ",mode="), str2, ")");
    }
}
