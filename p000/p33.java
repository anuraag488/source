package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p33 extends hz2 {

    /* JADX INFO: renamed from: a */
    public final o33 f27341a;

    /* JADX INFO: renamed from: b */
    public final lk2 f27342b;

    public p33(lk2 lk2Var, o33 o33Var) {
        this.f27341a = o33Var;
        this.f27342b = lk2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p33)) {
            return false;
        }
        p33 p33Var = (p33) obj;
        return z62.m13387o(this.f27341a, p33Var.f27341a) && z62.m13387o(this.f27342b, p33Var.f27342b);
    }

    public final int hashCode() {
        int iHashCode = this.f27341a.hashCode() * 31;
        lk2 lk2Var = this.f27342b;
        return iHashCode + (lk2Var == null ? 0 : lk2Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f27341a + ", owner=" + this.f27342b + ')';
    }
}
