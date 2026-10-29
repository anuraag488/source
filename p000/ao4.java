package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ao4 implements dd3 {

    /* JADX INFO: renamed from: a */
    public int f14749a;

    /* JADX INFO: renamed from: b */
    public long f14750b;

    @Override // p000.dd3
    /* JADX INFO: renamed from: c */
    public final long mo3100c(s52 s52Var, long j, df2 df2Var, long j2) {
        long j3 = this.f14750b;
        int i = s52Var.f29916a;
        int i2 = (int) (j2 >> 32);
        int iM10675p = sc6.m10675p((((s52Var.f29918c - i) - i2) / 2) + i, 0, Math.max(0, ((int) (j3 >> 32)) - i2));
        int i3 = (int) (j2 & 4294967295L);
        int i4 = s52Var.f29917b - i3;
        int i5 = this.f14749a;
        int i6 = i4 - i5;
        if (i6 < 0) {
            i6 = s52Var.f29919d + i5;
        }
        return (((long) iM10675p) << 32) | (((long) sc6.m10675p(i6, 0, Math.max(0, ((int) (j3 & 4294967295L)) - i3))) & 4294967295L);
    }
}
