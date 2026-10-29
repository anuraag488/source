package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bk1 {

    /* JADX INFO: renamed from: a */
    public zj1 f15348a;

    /* JADX INFO: renamed from: b */
    public sq2 f15349b;

    /* JADX INFO: renamed from: c */
    public db3 f15350c;

    /* JADX INFO: renamed from: d */
    public sq2 f15351d;

    /* JADX INFO: renamed from: e */
    public db3 f15352e;

    /* JADX INFO: renamed from: f */
    public j52 f15353f;

    /* JADX INFO: renamed from: g */
    public j52 f15354g;

    /* JADX INFO: renamed from: a */
    public final j52 m3611a(int i, int i2, boolean z) {
        int iOrdinal = this.f15348a.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return null;
        }
        if (iOrdinal == 2) {
            if (z) {
                return this.f15353f;
            }
            return null;
        }
        if (iOrdinal != 3) {
            C0670g.m5864c();
            return null;
        }
        if (z) {
            return this.f15353f;
        }
        if (i + 1 < 0 || i2 < 0) {
            return null;
        }
        return this.f15354g;
    }

    /* JADX INFO: renamed from: b */
    public final void m3612b(sq2 sq2Var, sq2 sq2Var2, long j) {
        long jM5537h = C0638f5.m5537h(j, kg2.f23106a);
        if (sq2Var != null) {
            int iMo5823W = sq2Var.mo5823W(kl0.m7538h(jM5537h));
            this.f15353f = j52.m7021a(j52.m7022b(iMo5823W, sq2Var.mo5825b0(iMo5823W)));
            this.f15349b = sq2Var;
            this.f15350c = null;
        }
        if (sq2Var2 != null) {
            int iMo5823W2 = sq2Var2.mo5823W(kl0.m7538h(jM5537h));
            this.f15354g = j52.m7021a(j52.m7022b(iMo5823W2, sq2Var2.mo5825b0(iMo5823W2)));
            this.f15351d = sq2Var2;
            this.f15352e = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bk1) && this.f15348a == ((bk1) obj).f15348a;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + zi4.m13609i(0, this.f15348a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + this.f15348a + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
