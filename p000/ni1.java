package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ni1 implements di1 {

    /* JADX INFO: renamed from: a */
    public int f25842a;

    /* JADX INFO: renamed from: b */
    public g51 f25843b;

    /* JADX INFO: renamed from: c */
    public long f25844c;

    /* JADX INFO: renamed from: d */
    public long f25845d;

    @Override // p000.di1
    /* JADX INFO: renamed from: b */
    public final float mo4508b(long j, float f, float f2, float f3) {
        long j2 = j - this.f25845d;
        long j3 = this.f25844c;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        float fMo3662c = this.f25843b.mo3662c(this.f25842a == 0 ? 1.0f : j2 / j3);
        return (f2 * fMo3662c) + ((1.0f - fMo3662c) * f);
    }

    @Override // p000.di1
    /* JADX INFO: renamed from: c */
    public final float mo4509c(long j, float f, float f2, float f3) {
        long j2 = j - this.f25845d;
        long j3 = this.f25844c;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (mo4508b(j4, f, f2, f3) - mo4508b(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // p000.di1
    /* JADX INFO: renamed from: d */
    public final long mo4510d(float f, float f2, float f3) {
        return this.f25845d + this.f25844c;
    }
}
