package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hv2 extends as0 {
    /* JADX INFO: renamed from: g */
    public final void m6507g(hr3 hr3Var, int i) {
        float[] fArr = this.f14841a;
        float f = fArr[i];
        int i2 = i + 1;
        float f2 = fArr[i2];
        float f3 = f + hr3Var.f20807a;
        float f4 = hr3Var.f20808b;
        long jM7130a = ji1.m7130a(f3 / f4, (f2 + hr3Var.f20809c) / f4);
        fArr[i] = Float.intBitsToFloat((int) (jM7130a >> 32));
        fArr[i2] = Float.intBitsToFloat((int) (4294967295L & jM7130a));
    }
}
