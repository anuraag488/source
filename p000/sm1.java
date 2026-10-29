package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sm1 implements qm1 {

    /* JADX INFO: renamed from: a */
    public final float[] f30393a;

    /* JADX INFO: renamed from: b */
    public final float[] f30394b;

    public sm1(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            C1077qn.m9987m("Array lengths must match and be nonzero");
            throw null;
        }
        this.f30393a = fArr;
        this.f30394b = fArr2;
    }

    @Override // p000.qm1
    /* JADX INFO: renamed from: a */
    public final float mo5729a(float f) {
        return zc6.m13507D(f, this.f30394b, this.f30393a);
    }

    @Override // p000.qm1
    /* JADX INFO: renamed from: b */
    public final float mo5730b(float f) {
        return zc6.m13507D(f, this.f30393a, this.f30394b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof sm1)) {
            return false;
        }
        sm1 sm1Var = (sm1) obj;
        return Arrays.equals(this.f30393a, sm1Var.f30393a) && Arrays.equals(this.f30394b, sm1Var.f30394b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f30394b) + (Arrays.hashCode(this.f30393a) * 31);
    }

    public final String toString() {
        return zi4.m13622v("FontScaleConverter{fromSpValues=", Arrays.toString(this.f30393a), ", toDpValues=", Arrays.toString(this.f30394b), "}");
    }
}
