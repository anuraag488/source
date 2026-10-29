package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u74 {

    /* JADX INFO: renamed from: a */
    public final long f31699a;

    /* JADX INFO: renamed from: b */
    public final long f31700b;

    /* JADX INFO: renamed from: c */
    public final long f31701c;

    /* JADX INFO: renamed from: d */
    public final long f31702d;

    /* JADX INFO: renamed from: e */
    public final long f31703e;

    /* JADX INFO: renamed from: f */
    public final long f31704f;

    /* JADX INFO: renamed from: g */
    public final long f31705g;

    /* JADX INFO: renamed from: h */
    public final long f31706h;

    /* JADX INFO: renamed from: i */
    public final long f31707i;

    /* JADX INFO: renamed from: j */
    public final long f31708j;

    public u74(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.f31699a = j;
        this.f31700b = j2;
        this.f31701c = j3;
        this.f31702d = j4;
        this.f31703e = j5;
        this.f31704f = j6;
        this.f31705g = j7;
        this.f31706h = j8;
        this.f31707i = j9;
        this.f31708j = j10;
    }

    /* JADX INFO: renamed from: a */
    public final long m11271a(boolean z, boolean z2) {
        if (z) {
            return z2 ? this.f31700b : this.f31702d;
        }
        return z2 ? this.f31705g : this.f31707i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u74)) {
            return false;
        }
        u74 u74Var = (u74) obj;
        long j = u74Var.f31699a;
        int i = pb0.f27502i;
        return ws4.m12408a(this.f31699a, j) && ws4.m12408a(this.f31700b, u74Var.f31700b) && ws4.m12408a(this.f31701c, u74Var.f31701c) && ws4.m12408a(this.f31702d, u74Var.f31702d) && ws4.m12408a(this.f31703e, u74Var.f31703e) && ws4.m12408a(this.f31704f, u74Var.f31704f) && ws4.m12408a(this.f31705g, u74Var.f31705g) && ws4.m12408a(this.f31706h, u74Var.f31706h) && ws4.m12408a(this.f31707i, u74Var.f31707i) && ws4.m12408a(this.f31708j, u74Var.f31708j);
    }

    public final int hashCode() {
        int i = pb0.f27502i;
        return Long.hashCode(this.f31708j) + zi4.m13612l(zi4.m13612l(zi4.m13612l(zi4.m13612l(zi4.m13612l(zi4.m13612l(zi4.m13612l(zi4.m13612l(Long.hashCode(this.f31699a) * 31, this.f31700b, 31), this.f31701c, 31), this.f31702d, 31), this.f31703e, 31), this.f31704f, 31), this.f31705g, 31), this.f31706h, 31), this.f31707i, 31);
    }
}
