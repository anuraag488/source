package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class w34 implements a71 {

    /* JADX INFO: renamed from: a */
    public final int f33061a;

    /* JADX INFO: renamed from: b */
    public final int f33062b;

    public w34(int i, int i2) {
        this.f33061a = i;
        this.f33062b = i2;
    }

    @Override // p000.a71
    /* JADX INFO: renamed from: a */
    public final void mo117a(c71 c71Var) {
        int iM10675p = sc6.m10675p(this.f33061a, 0, c71Var.f15850a.m8598b());
        int iM10675p2 = sc6.m10675p(this.f33062b, 0, c71Var.f15850a.m8598b());
        if (iM10675p < iM10675p2) {
            c71Var.m3862f(iM10675p, iM10675p2);
        } else {
            c71Var.m3862f(iM10675p2, iM10675p);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w34)) {
            return false;
        }
        w34 w34Var = (w34) obj;
        return this.f33061a == w34Var.f33061a && this.f33062b == w34Var.f33062b;
    }

    public final int hashCode() {
        return (this.f33061a * 31) + this.f33062b;
    }

    public final String toString() {
        return d55.m4367l("SetSelectionCommand(start=", this.f33061a, ", end=", this.f33062b, ")");
    }
}
