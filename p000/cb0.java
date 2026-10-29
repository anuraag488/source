package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cb0 {

    /* JADX INFO: renamed from: a */
    public final int f15910a;

    /* JADX INFO: renamed from: b */
    public final int f15911b;

    public cb0(int i, int i2) {
        this.f15910a = i;
        this.f15911b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb0)) {
            return false;
        }
        cb0 cb0Var = (cb0) obj;
        return this.f15910a == cb0Var.f15910a && this.f15911b == cb0Var.f15911b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15911b) + (Integer.hashCode(this.f15910a) * 31);
    }

    public final String toString() {
        return d55.m4367l("CollectionInfo(rowCount=", this.f15910a, ", columnCount=", this.f15911b, ")");
    }
}
