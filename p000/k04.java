package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class k04 {

    /* JADX INFO: renamed from: a */
    public final oo3 f22799a;

    /* JADX INFO: renamed from: b */
    public final int f22800b;

    /* JADX INFO: renamed from: c */
    public final long f22801c;

    public k04(oo3 oo3Var, int i, long j) {
        this.f22799a = oo3Var;
        this.f22800b = i;
        this.f22801c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k04)) {
            return false;
        }
        k04 k04Var = (k04) obj;
        return this.f22799a == k04Var.f22799a && this.f22800b == k04Var.f22800b && this.f22801c == k04Var.f22801c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22801c) + zi4.m13609i(this.f22800b, this.f22799a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
        sb.append(this.f22799a);
        sb.append(", offset=");
        sb.append(this.f22800b);
        sb.append(", selectableId=");
        return d55.m4369n(sb, this.f22801c, ")");
    }
}
