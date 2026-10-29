package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class e25 {

    /* JADX INFO: renamed from: a */
    public final String f17648a;

    /* JADX INFO: renamed from: b */
    public final int f17649b;

    public e25(String str, int i) {
        this.f17648a = str;
        this.f17649b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e25)) {
            return false;
        }
        e25 e25Var = (e25) obj;
        return z62.m13387o(this.f17648a, e25Var.f17648a) && this.f17649b == e25Var.f17649b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17649b) + (this.f17648a.hashCode() * 31);
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f17648a + ", generation=" + this.f17649b + ")";
    }
}
