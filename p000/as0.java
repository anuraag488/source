package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class as0 {

    /* JADX INFO: renamed from: a */
    public final float[] f14841a;

    public as0(float[] fArr) {
        this.f14841a = fArr;
        if (fArr.length == 8) {
            return;
        }
        C1077qn.m9987m("Points array size should be 8");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final float m3215a() {
        return this.f14841a[6];
    }

    /* JADX INFO: renamed from: b */
    public final float m3216b() {
        return this.f14841a[7];
    }

    /* JADX INFO: renamed from: c */
    public final long m3217c(float f) {
        float f2 = 1.0f - f;
        float[] fArr = this.f14841a;
        float f3 = f2 * f2 * f2;
        float f4 = 3.0f * f;
        float f5 = f4 * f2 * f2;
        float f6 = f4 * f * f2;
        float f7 = (fArr[4] * f6) + (fArr[2] * f5) + (fArr[0] * f3);
        float f8 = f * f * f;
        return ji1.m7130a((m3215a() * f8) + f7, (m3216b() * f8) + (fArr[5] * f6) + (fArr[3] * f5) + (fArr[1] * f3));
    }

    /* JADX INFO: renamed from: d */
    public final l73 m3218d(float f) {
        float f2 = 1.0f - f;
        long jM3217c = m3217c(f);
        float[] fArr = this.f14841a;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f7 = f2 * f2;
        float f8 = 2.0f * f2 * f;
        float f9 = f * f;
        return new l73(y62.m12969g(f3, f4, (f5 * f) + (f3 * f2), (f6 * f) + (f4 * f2), (fArr[4] * f9) + (f5 * f8) + (f3 * f7), (fArr[5] * f9) + (f6 * f8) + (f4 * f7), se0.m10691D(jM3217c), se0.m10692E(jM3217c)), y62.m12969g(se0.m10691D(jM3217c), se0.m10692E(jM3217c), (m3215a() * f9) + (fArr[4] * f8) + (fArr[2] * f7), (m3216b() * f9) + (fArr[5] * f8) + (fArr[3] * f7), (m3215a() * f) + (fArr[4] * f2), (m3216b() * f) + (fArr[5] * f2), m3215a(), m3216b()));
    }

    /* JADX INFO: renamed from: e */
    public final hv2 m3219e(hr3 hr3Var) {
        float[] fArr = new float[8];
        hv2 hv2Var = new hv2(fArr);
        AbstractC0990oo.m9203X(this.f14841a, fArr, 14);
        hv2Var.m6507g(hr3Var, 0);
        hv2Var.m6507g(hr3Var, 2);
        hv2Var.m6507g(hr3Var, 4);
        hv2Var.m6507g(hr3Var, 6);
        return hv2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as0)) {
            return false;
        }
        return Arrays.equals(this.f14841a, ((as0) obj).f14841a);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3220f() {
        float[] fArr = this.f14841a;
        return Math.abs(fArr[0] - m3215a()) < 1.0E-4f && Math.abs(fArr[1] - m3216b()) < 1.0E-4f;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14841a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("anchor0: (");
        float[] fArr = this.f14841a;
        sb.append(fArr[0]);
        sb.append(", ");
        sb.append(fArr[1]);
        sb.append(") control0: (");
        sb.append(fArr[2]);
        sb.append(", ");
        sb.append(fArr[3]);
        sb.append("), control1: (");
        sb.append(fArr[4]);
        sb.append(", ");
        sb.append(fArr[5]);
        sb.append("), anchor1: (");
        sb.append(m3215a());
        sb.append(", ");
        sb.append(m3216b());
        sb.append(')');
        return sb.toString();
    }
}
