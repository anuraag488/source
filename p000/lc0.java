package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class lc0 {

    /* JADX INFO: renamed from: a */
    public final String f23929a;

    /* JADX INFO: renamed from: b */
    public final long f23930b;

    /* JADX INFO: renamed from: c */
    public final int f23931c;

    public lc0(int i, long j, String str) {
        this.f23929a = str;
        this.f23930b = j;
        this.f23931c = i;
        if (str.length() == 0) {
            C1077qn.m9987m("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i < -1 || i > 63) {
            C1077qn.m9987m("The id must be between -1 and 63");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public float mo7946a(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    /* JADX INFO: renamed from: b */
    public float mo7947b(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo7948c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public long mo7949d(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = i33.f21101g;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = i33.f21100f;
        return (((long) Float.floatToRawIntBits((fArr2[6] * f10) + ((fArr2[3] * f9) + (fArr2[0] * f8)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr2[7] * f10) + (fArr2[4] * f9) + (fArr2[1] * f8))));
    }

    /* JADX INFO: renamed from: e */
    public float mo7950e(float f, float f2, float f3) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        float f4 = f3 <= 0.5f ? f3 : 0.5f;
        float[] fArr = i33.f21101g;
        float f5 = (fArr[6] * f4) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f4) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f4) + (fArr[5] * f2) + (fArr[2] * f);
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float[] fArr2 = i33.f21100f;
        return (fArr2[8] * f10) + (fArr2[5] * f9) + (fArr2[2] * f8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lc0 lc0Var = (lc0) obj;
        if (this.f23931c == lc0Var.f23931c && this.f23929a.equals(lc0Var.f23929a)) {
            return sc6.m10630B(this.f23930b, lc0Var.f23930b);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public long mo7951f(float f, float f2, float f3, float f4, lc0 lc0Var) {
        float[] fArr = i33.f21098d;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        float fM13690v = zp0.m13690v(f5);
        float fM13690v2 = zp0.m13690v(f6);
        float fM13690v3 = zp0.m13690v(f7);
        float[] fArr2 = i33.f21099e;
        return zy5.m13867c((fArr2[6] * fM13690v3) + (fArr2[3] * fM13690v2) + (fArr2[0] * fM13690v), (fArr2[7] * fM13690v3) + (fArr2[4] * fM13690v2) + (fArr2[1] * fM13690v), (fArr2[8] * fM13690v3) + (fArr2[5] * fM13690v2) + (fArr2[2] * fM13690v), f4, lc0Var);
    }

    public int hashCode() {
        return zi4.m13612l(this.f23929a.hashCode() * 31, this.f23930b, 31) + this.f23931c;
    }

    public final String toString() {
        String str;
        long j = this.f23930b;
        if (sc6.m10630B(j, 12884901888L)) {
            str = "Rgb";
        } else if (sc6.m10630B(j, 12884901889L)) {
            str = "Xyz";
        } else if (sc6.m10630B(j, 12884901890L)) {
            str = "Lab";
        } else {
            str = sc6.m10630B(j, 17179869187L) ? "Cmyk" : "Unknown";
        }
        return this.f23929a + " (id=" + this.f23931c + ", model=" + str + ")";
    }
}
