package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class r23 {

    /* JADX INFO: renamed from: a */
    public final int f28968a;

    /* JADX INFO: renamed from: b */
    public final Integer f28969b;

    public r23(int i, Integer num) {
        this.f28968a = i;
        this.f28969b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r23)) {
            return false;
        }
        r23 r23Var = (r23) obj;
        return this.f28968a == r23Var.f28968a && z62.m13387o(this.f28969b, r23Var.f28969b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f28968a) * 31;
        Integer num = this.f28969b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.f28968a + ", dataOffset=" + this.f28969b + ")";
    }
}
