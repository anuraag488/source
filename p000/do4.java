package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class do4 {

    /* JADX INFO: renamed from: a */
    public final long f17241a;

    /* JADX INFO: renamed from: b */
    public final long f17242b;

    /* JADX INFO: renamed from: c */
    public final long f17243c;

    /* JADX INFO: renamed from: d */
    public final long f17244d;

    /* JADX INFO: renamed from: e */
    public final long f17245e;

    /* JADX INFO: renamed from: f */
    public final long f17246f;

    public do4(long j, long j2, long j3, long j4, long j5, long j6) {
        this.f17241a = j;
        this.f17242b = j2;
        this.f17243c = j3;
        this.f17244d = j4;
        this.f17245e = j5;
        this.f17246f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof do4)) {
            return false;
        }
        do4 do4Var = (do4) obj;
        long j = do4Var.f17241a;
        int i = pb0.f27502i;
        return ws4.m12408a(this.f17241a, j) && ws4.m12408a(this.f17242b, do4Var.f17242b) && ws4.m12408a(this.f17243c, do4Var.f17243c) && ws4.m12408a(this.f17244d, do4Var.f17244d) && ws4.m12408a(this.f17245e, do4Var.f17245e) && ws4.m12408a(this.f17246f, do4Var.f17246f);
    }

    public final int hashCode() {
        int i = pb0.f27502i;
        return Long.hashCode(this.f17246f) + zi4.m13612l(zi4.m13612l(zi4.m13612l(zi4.m13612l(Long.hashCode(this.f17241a) * 31, this.f17242b, 31), this.f17243c, 31), this.f17244d, 31), this.f17245e, 31);
    }
}
