package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class q40 {

    /* JADX INFO: renamed from: a */
    public final long f28201a;

    /* JADX INFO: renamed from: b */
    public final long f28202b;

    /* JADX INFO: renamed from: c */
    public final long f28203c;

    /* JADX INFO: renamed from: d */
    public final long f28204d;

    public q40(long j, long j2, long j3, long j4) {
        this.f28201a = j;
        this.f28202b = j2;
        this.f28203c = j3;
        this.f28204d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof q40)) {
            return false;
        }
        q40 q40Var = (q40) obj;
        long j = q40Var.f28201a;
        int i = pb0.f27502i;
        return ws4.m12408a(this.f28201a, j) && ws4.m12408a(this.f28202b, q40Var.f28202b) && ws4.m12408a(this.f28203c, q40Var.f28203c) && ws4.m12408a(this.f28204d, q40Var.f28204d);
    }

    public final int hashCode() {
        int i = pb0.f27502i;
        return Long.hashCode(this.f28204d) + zi4.m13612l(zi4.m13612l(Long.hashCode(this.f28201a) * 31, this.f28202b, 31), this.f28203c, 31);
    }
}
