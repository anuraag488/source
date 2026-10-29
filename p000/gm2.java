package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gm2 {

    /* JADX INFO: renamed from: a */
    public final yg3 f19880a;

    public gm2(yg3 yg3Var) {
        this.f19880a = yg3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gm2) && this.f19880a == ((gm2) obj).f19880a;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f19880a) * 31) + 1237763640;
    }
}
