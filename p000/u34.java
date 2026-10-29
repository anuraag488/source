package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class u34 implements a71 {

    /* JADX INFO: renamed from: a */
    public final int f31637a;

    /* JADX INFO: renamed from: b */
    public final int f31638b;

    public u34(int i, int i2) {
        this.f31637a = i;
        this.f31638b = i2;
    }

    @Override // p000.a71
    /* JADX INFO: renamed from: a */
    public final void mo117a(c71 c71Var) {
        boolean z = c71Var.f15853d != -1;
        n83 n83Var = c71Var.f15850a;
        if (z) {
            c71Var.f15853d = -1;
            c71Var.f15854e = -1;
        }
        int iM10675p = sc6.m10675p(this.f31637a, 0, n83Var.m8598b());
        int iM10675p2 = sc6.m10675p(this.f31638b, 0, n83Var.m8598b());
        if (iM10675p != iM10675p2) {
            if (iM10675p < iM10675p2) {
                c71Var.m3861e(iM10675p, iM10675p2);
            } else {
                c71Var.m3861e(iM10675p2, iM10675p);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u34)) {
            return false;
        }
        u34 u34Var = (u34) obj;
        return this.f31637a == u34Var.f31637a && this.f31638b == u34Var.f31638b;
    }

    public final int hashCode() {
        return (this.f31637a * 31) + this.f31638b;
    }

    public final String toString() {
        return d55.m4367l("SetComposingRegionCommand(start=", this.f31637a, ", end=", this.f31638b, ")");
    }
}
