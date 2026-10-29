package p000;

/* JADX INFO: renamed from: y2 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1353y2 {

    /* JADX INFO: renamed from: a */
    public final String f34817a;

    /* JADX INFO: renamed from: b */
    public final iq1 f34818b;

    public C1353y2(String str, iq1 iq1Var) {
        this.f34817a = str;
        this.f34818b = iq1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1353y2)) {
            return false;
        }
        C1353y2 c1353y2 = (C1353y2) obj;
        return z62.m13387o(this.f34817a, c1353y2.f34817a) && z62.m13387o(this.f34818b, c1353y2.f34818b);
    }

    public final int hashCode() {
        String str = this.f34817a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        iq1 iq1Var = this.f34818b;
        return iHashCode + (iq1Var != null ? iq1Var.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f34817a + ", action=" + this.f34818b + ")";
    }
}
