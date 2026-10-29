package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ty0 {

    /* JADX INFO: renamed from: c */
    public static final ty0 f31524c = new ty0(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f31525a;

    /* JADX INFO: renamed from: b */
    public final long f31526b;

    public ty0(long j, long j2) {
        this.f31525a = j;
        this.f31526b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ty0) {
            ty0 ty0Var = (ty0) obj;
            return w52.m12108c(this.f31525a, ty0Var.f31525a) && this.f31526b == ty0Var.f31526b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31526b) + (Long.hashCode(this.f31525a) * 31);
    }
}
