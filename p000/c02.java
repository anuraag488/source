package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class c02 {

    /* JADX INFO: renamed from: a */
    public final long f15732a;

    /* JADX INFO: renamed from: b */
    public final long f15733b;

    /* JADX INFO: renamed from: c */
    public final long f15734c;

    /* JADX INFO: renamed from: d */
    public final long f15735d;

    public c02(long j, long j2, long j3, long j4) {
        this.f15732a = j;
        this.f15733b = j2;
        this.f15734c = j3;
        this.f15735d = j4;
    }

    /* JADX INFO: renamed from: a */
    public final c02 m3782a(long j, long j2, long j3, long j4) {
        return new c02(j != 16 ? j : this.f15732a, j2 != 16 ? j2 : this.f15733b, j3 != 16 ? j3 : this.f15734c, j4 != 16 ? j4 : this.f15735d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c02)) {
            return false;
        }
        c02 c02Var = (c02) obj;
        long j = c02Var.f15732a;
        int i = pb0.f27502i;
        return ws4.m12408a(this.f15732a, j) && ws4.m12408a(this.f15733b, c02Var.f15733b) && ws4.m12408a(this.f15734c, c02Var.f15734c) && ws4.m12408a(this.f15735d, c02Var.f15735d);
    }

    public final int hashCode() {
        int i = pb0.f27502i;
        return Long.hashCode(this.f15735d) + zi4.m13612l(zi4.m13612l(Long.hashCode(this.f15732a) * 31, this.f15733b, 31), this.f15734c, 31);
    }
}
