package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mm3 {

    /* JADX INFO: renamed from: a */
    public final long f25025a;

    /* JADX INFO: renamed from: b */
    public final long f25026b;

    /* JADX INFO: renamed from: c */
    public final long f25027c;

    /* JADX INFO: renamed from: d */
    public final long f25028d;

    /* JADX INFO: renamed from: e */
    public final long f25029e;

    /* JADX INFO: renamed from: f */
    public final float[] f25030f;

    /* JADX INFO: renamed from: g */
    public final mt2 f25031g;

    public mm3(long j, long j2, long j3, long j4, long j5, float[] fArr, mt2 mt2Var) {
        this.f25025a = j;
        this.f25026b = j2;
        this.f25027c = j3;
        this.f25028d = j4;
        this.f25029e = j5;
        this.f25030f = fArr;
        this.f25031g = mt2Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && mm3.class == obj.getClass()) {
                mm3 mm3Var = (mm3) obj;
                if (this.f25025a == mm3Var.f25025a && this.f25026b == mm3Var.f25026b && this.f25029e == mm3Var.f25029e && o52.m8956c(this.f25027c, mm3Var.f25027c) && o52.m8956c(this.f25028d, mm3Var.f25028d)) {
                    float[] fArr = mm3Var.f25030f;
                    float[] fArr2 = this.f25030f;
                    if (fArr2 == null) {
                        if (fArr == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (fArr == null) {
                        zEquals = false;
                    } else {
                        zEquals = fArr2.equals(fArr);
                    }
                    if (zEquals && this.f25031g.equals(mm3Var.f25031g)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iM13612l = zi4.m13612l(zi4.m13612l(zi4.m13612l(zi4.m13612l(Long.hashCode(this.f25025a) * 31, this.f25026b, 31), this.f25029e, 31), this.f25027c, 31), this.f25028d, 31);
        float[] fArr = this.f25030f;
        return this.f25031g.hashCode() + ((iM13612l + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
