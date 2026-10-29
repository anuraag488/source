package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m02 {

    /* JADX INFO: renamed from: a */
    public long f24511a;

    /* JADX INFO: renamed from: b */
    public long f24512b;

    /* JADX INFO: renamed from: c */
    public long f24513c;

    /* JADX INFO: renamed from: d */
    public long f24514d;

    /* JADX INFO: renamed from: e */
    public long f24515e;

    /* JADX INFO: renamed from: f */
    public long f24516f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m02)) {
            return false;
        }
        long j = this.f24511a;
        m02 m02Var = (m02) obj;
        long j2 = m02Var.f24511a;
        int i = pb0.f27502i;
        return ws4.m12408a(j, j2) && ws4.m12408a(this.f24512b, m02Var.f24512b) && ws4.m12408a(this.f24513c, m02Var.f24513c) && ws4.m12408a(this.f24514d, m02Var.f24514d) && ws4.m12408a(this.f24515e, m02Var.f24515e) && ws4.m12408a(this.f24516f, m02Var.f24516f);
    }

    public final int hashCode() {
        long j = this.f24511a;
        int i = pb0.f27502i;
        return Long.hashCode(this.f24516f) + zi4.m13612l(zi4.m13612l(zi4.m13612l(zi4.m13612l(Long.hashCode(j) * 31, this.f24512b, 31), this.f24513c, 31), this.f24514d, 31), this.f24515e, 31);
    }
}
