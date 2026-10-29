package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cr3 {

    /* JADX INFO: renamed from: a */
    public final float f16391a;

    /* JADX INFO: renamed from: b */
    public final float f16392b;

    /* JADX INFO: renamed from: c */
    public final float f16393c;

    /* JADX INFO: renamed from: d */
    public final float f16394d;

    /* JADX INFO: renamed from: e */
    public final long f16395e;

    /* JADX INFO: renamed from: f */
    public final long f16396f;

    /* JADX INFO: renamed from: g */
    public final long f16397g;

    /* JADX INFO: renamed from: h */
    public final long f16398h;

    static {
        C0638f5.m5531b(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public cr3(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.f16391a = f;
        this.f16392b = f2;
        this.f16393c = f3;
        this.f16394d = f4;
        this.f16395e = j;
        this.f16396f = j2;
        this.f16397g = j3;
        this.f16398h = j4;
    }

    /* JADX INFO: renamed from: a */
    public final float m4143a() {
        return this.f16394d - this.f16392b;
    }

    /* JADX INFO: renamed from: b */
    public final float m4144b() {
        return this.f16393c - this.f16391a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr3)) {
            return false;
        }
        cr3 cr3Var = (cr3) obj;
        return Float.compare(this.f16391a, cr3Var.f16391a) == 0 && Float.compare(this.f16392b, cr3Var.f16392b) == 0 && Float.compare(this.f16393c, cr3Var.f16393c) == 0 && Float.compare(this.f16394d, cr3Var.f16394d) == 0 && gq6.m6093r(this.f16395e, cr3Var.f16395e) && gq6.m6093r(this.f16396f, cr3Var.f16396f) && gq6.m6093r(this.f16397g, cr3Var.f16397g) && gq6.m6093r(this.f16398h, cr3Var.f16398h);
    }

    public final int hashCode() {
        return Long.hashCode(this.f16398h) + zi4.m13612l(zi4.m13612l(zi4.m13612l(c75.m3874f(this.f16394d, c75.m3874f(this.f16393c, c75.m3874f(this.f16392b, Float.hashCode(this.f16391a) * 31, 31), 31), 31), this.f16395e, 31), this.f16396f, 31), this.f16397g, 31);
    }

    public final String toString() {
        String strM3803H = c20.m3803H(this.f16391a);
        String strM3803H2 = c20.m3803H(this.f16392b);
        String strM3803H3 = c20.m3803H(this.f16393c);
        String strM3803H4 = c20.m3803H(this.f16394d);
        StringBuilder sb = new StringBuilder();
        sb.append(strM3803H);
        sb.append(", ");
        sb.append(strM3803H2);
        sb.append(", ");
        sb.append(strM3803H3);
        String strM13623w = zi4.m13623w(sb, ", ", strM3803H4);
        long j = this.f16395e;
        long j2 = this.f16396f;
        boolean zM6093r = gq6.m6093r(j, j2);
        long j3 = this.f16397g;
        long j4 = this.f16398h;
        if (zM6093r && gq6.m6093r(j2, j3) && gq6.m6093r(j3, j4)) {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
                return zi4.m13622v("RoundRect(rect=", strM13623w, ", radius=", c20.m3803H(Float.intBitsToFloat(i)), ")");
            }
            String strM3803H5 = c20.m3803H(Float.intBitsToFloat(i));
            return zi4.m13623w(zi4.m13625y("RoundRect(rect=", strM13623w, ", x=", strM3803H5, ", y="), c20.m3803H(Float.intBitsToFloat(i2)), ")");
        }
        String strM6074L = gq6.m6074L(j);
        String strM6074L2 = gq6.m6074L(j2);
        String strM6074L3 = gq6.m6074L(j3);
        String strM6074L4 = gq6.m6074L(j4);
        StringBuilder sbM13625y = zi4.m13625y("RoundRect(rect=", strM13623w, ", topLeft=", strM6074L, ", topRight=");
        zi4.m13599B(sbM13625y, strM6074L2, ", bottomRight=", strM6074L3, ", bottomLeft=");
        return zi4.m13623w(sbM13625y, strM6074L4, ")");
    }
}
