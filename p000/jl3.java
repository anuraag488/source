package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jl3 {

    /* JADX INFO: renamed from: e */
    public static final jl3 f22395e = new jl3(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f22396a;

    /* JADX INFO: renamed from: b */
    public final float f22397b;

    /* JADX INFO: renamed from: c */
    public final float f22398c;

    /* JADX INFO: renamed from: d */
    public final float f22399d;

    public jl3(float f, float f2, float f3, float f4) {
        this.f22396a = f;
        this.f22397b = f2;
        this.f22398c = f3;
        this.f22399d = f4;
    }

    /* JADX INFO: renamed from: b */
    public static jl3 m7165b(jl3 jl3Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = jl3Var.f22396a;
        }
        float f3 = (i & 2) != 0 ? jl3Var.f22397b : Float.NEGATIVE_INFINITY;
        if ((i & 4) != 0) {
            f2 = jl3Var.f22398c;
        }
        return new jl3(f, f3, f2, (i & 8) != 0 ? jl3Var.f22399d : Float.POSITIVE_INFINITY);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7166a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.f22396a) & (fIntBitsToFloat < this.f22398c) & (fIntBitsToFloat2 >= this.f22397b) & (fIntBitsToFloat2 < this.f22399d);
    }

    /* JADX INFO: renamed from: c */
    public final long m7167c() {
        float f = this.f22398c;
        float f2 = this.f22396a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.f22399d;
        float f5 = this.f22397b;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    /* JADX INFO: renamed from: d */
    public final long m7168d() {
        float f = this.f22398c - this.f22396a;
        return (((long) Float.floatToRawIntBits(this.f22399d - this.f22397b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: e */
    public final long m7169e() {
        return (((long) Float.floatToRawIntBits(this.f22396a)) << 32) | (((long) Float.floatToRawIntBits(this.f22397b)) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl3)) {
            return false;
        }
        jl3 jl3Var = (jl3) obj;
        return Float.compare(this.f22396a, jl3Var.f22396a) == 0 && Float.compare(this.f22397b, jl3Var.f22397b) == 0 && Float.compare(this.f22398c, jl3Var.f22398c) == 0 && Float.compare(this.f22399d, jl3Var.f22399d) == 0;
    }

    /* JADX INFO: renamed from: f */
    public final jl3 m7170f(jl3 jl3Var) {
        return new jl3(Math.max(this.f22396a, jl3Var.f22396a), Math.max(this.f22397b, jl3Var.f22397b), Math.min(this.f22398c, jl3Var.f22398c), Math.min(this.f22399d, jl3Var.f22399d));
    }

    /* JADX INFO: renamed from: g */
    public final boolean m7171g() {
        return (this.f22396a >= this.f22398c) | (this.f22397b >= this.f22399d);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m7172h(jl3 jl3Var) {
        return (this.f22396a < jl3Var.f22398c) & (jl3Var.f22396a < this.f22398c) & (this.f22397b < jl3Var.f22399d) & (jl3Var.f22397b < this.f22399d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f22399d) + c75.m3874f(this.f22398c, c75.m3874f(this.f22397b, Float.hashCode(this.f22396a) * 31, 31), 31);
    }

    /* JADX INFO: renamed from: i */
    public final jl3 m7173i(float f, float f2) {
        return new jl3(this.f22396a + f, this.f22397b + f2, this.f22398c + f, this.f22399d + f2);
    }

    /* JADX INFO: renamed from: j */
    public final jl3 m7174j(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new jl3(Float.intBitsToFloat(i) + this.f22396a, Float.intBitsToFloat(i2) + this.f22397b, Float.intBitsToFloat(i) + this.f22398c, Float.intBitsToFloat(i2) + this.f22399d);
    }

    public final String toString() {
        String strM3803H = c20.m3803H(this.f22396a);
        String strM3803H2 = c20.m3803H(this.f22397b);
        return c75.m3882n(zi4.m13625y("Rect.fromLTRB(", strM3803H, ", ", strM3803H2, ", "), c20.m3803H(this.f22398c), ", ", c20.m3803H(this.f22399d), ")");
    }
}
