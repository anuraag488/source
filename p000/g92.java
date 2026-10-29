package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g92 {

    /* JADX INFO: renamed from: a */
    public final Object f19670a;

    /* JADX INFO: renamed from: b */
    public final Object f19671b;

    public g92(Object obj, Object obj2) {
        this.f19670a = obj;
        this.f19671b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g92)) {
            return false;
        }
        g92 g92Var = (g92) obj;
        return z62.m13387o(this.f19670a, g92Var.f19670a) && z62.m13387o(this.f19671b, g92Var.f19671b);
    }

    public final int hashCode() {
        int iHashCode;
        Object obj = this.f19670a;
        int iHashCode2 = 0;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        int i = iHashCode * 31;
        Object obj2 = this.f19671b;
        if (obj2 instanceof Enum) {
            iHashCode2 = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            iHashCode2 = obj2.hashCode();
        }
        return iHashCode2 + i;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f19670a + ", right=" + this.f19671b + ")";
    }
}
