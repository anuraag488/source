package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pi1 {

    /* JADX INFO: renamed from: a */
    public long f27631a;

    /* JADX INFO: renamed from: b */
    public long f27632b;

    /* JADX INFO: renamed from: c */
    public long f27633c;

    /* JADX INFO: renamed from: d */
    public long f27634d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pi1)) {
            return false;
        }
        long j = this.f27631a;
        pi1 pi1Var = (pi1) obj;
        long j2 = pi1Var.f27631a;
        int i = pb0.f27502i;
        return ws4.m12408a(j, j2) && ws4.m12408a(this.f27632b, pi1Var.f27632b) && ws4.m12408a(this.f27633c, pi1Var.f27633c) && ws4.m12408a(this.f27634d, pi1Var.f27634d);
    }

    public final int hashCode() {
        long j = this.f27631a;
        int i = pb0.f27502i;
        return Long.hashCode(this.f27634d) + zi4.m13612l(zi4.m13612l(Long.hashCode(j) * 31, this.f27632b, 31), this.f27633c, 31);
    }
}
