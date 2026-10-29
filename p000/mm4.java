package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mm4 {

    /* JADX INFO: renamed from: a */
    public lv2 f25032a;

    /* JADX INFO: renamed from: b */
    public lm4 f25033b;

    /* JADX INFO: renamed from: c */
    public long f25034c;

    /* JADX INFO: renamed from: d */
    public long f25035d;

    /* JADX INFO: renamed from: e */
    public long f25036e;

    /* JADX INFO: renamed from: f */
    public long f25037f;

    /* JADX INFO: renamed from: g */
    public float[] f25038g;

    /* JADX INFO: renamed from: a */
    public final void m8358a(lm4 lm4Var, long j, long j2, float[] fArr, long j3) {
        long j4 = lm4Var.f24179g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            lm4Var.f24179g = j3;
            lm4Var.m8037a(lm4Var.f24177e, lm4Var.f24178f, j, j2, fArr);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8359b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (o52.m8956c(j2, this.f25035d)) {
            z = false;
        } else {
            this.f25035d = j2;
            z = true;
        }
        if (!o52.m8956c(j, this.f25036e)) {
            this.f25036e = j;
            z = true;
        }
        if (fArr != null) {
            this.f25038g = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.f25037f) {
            return z;
        }
        this.f25037f = j3;
        return true;
    }
}
