package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ai0 {

    /* JADX INFO: renamed from: a */
    public final int f14518a;

    /* JADX INFO: renamed from: b */
    public final Integer f14519b;

    public ai0(int i, sj3 sj3Var, Integer num) {
        this.f14518a = i;
        this.f14519b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai0)) {
            return false;
        }
        ai0 ai0Var = (ai0) obj;
        return this.f14518a == ai0Var.f14518a && z62.m13387o(null, null) && z62.m13387o(this.f14519b, ai0Var.f14519b);
    }

    public final int hashCode() {
        int iHashCode = ((Integer.hashCode(this.f14518a) * 31) + 0) * 31;
        Integer num = this.f14519b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f14518a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.f14519b + ")";
    }
}
