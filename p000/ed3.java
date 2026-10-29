package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ed3 {

    /* JADX INFO: renamed from: a */
    public final int f18017a;

    /* JADX INFO: renamed from: b */
    public final boolean f18018b;

    /* JADX INFO: renamed from: c */
    public final boolean f18019c;

    /* JADX INFO: renamed from: d */
    public final boolean f18020d;

    /* JADX INFO: renamed from: e */
    public final boolean f18021e;

    /* JADX INFO: renamed from: f */
    public final short f18022f;

    public ed3(boolean z, pz3 pz3Var, boolean z2) {
        kj0 kj0Var = AbstractC1217uf.f31816a;
        int i = !z ? 262152 : 262144;
        i = pz3Var == pz3.f28107b ? i | 8192 : i;
        i = z2 ? i : i | 512;
        boolean z3 = pz3Var == pz3.f28106a;
        this.f18017a = i;
        this.f18018b = z3;
        this.f18019c = true;
        this.f18020d = true;
        this.f18021e = true;
        this.f18022f = (short) 1002;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed3)) {
            return false;
        }
        ed3 ed3Var = (ed3) obj;
        return this.f18017a == ed3Var.f18017a && this.f18018b == ed3Var.f18018b && this.f18019c == ed3Var.f18019c && this.f18020d == ed3Var.f18020d && this.f18021e == ed3Var.f18021e && this.f18022f == ed3Var.f18022f;
    }

    public final int hashCode() {
        return (zi4.m13611k(zi4.m13611k(zi4.m13611k(zi4.m13611k(zi4.m13611k(this.f18017a * 31, 31, this.f18018b), 31, this.f18019c), 31, this.f18020d), 31, this.f18021e), 31, false) + this.f18022f) * 31;
    }

    public ed3(int i, boolean z) {
        this((i & 1) != 0 ? false : z, pz3.f28106a, (i & 8) != 0);
    }
}
