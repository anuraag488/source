package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ie1 {
    public static final he1 Companion = new he1();

    /* JADX INFO: renamed from: d */
    public static final pg2[] f21282d;

    /* JADX INFO: renamed from: a */
    public pb0 f21283a;

    /* JADX INFO: renamed from: b */
    public fe1 f21284b;

    /* JADX INFO: renamed from: c */
    public qd1 f21285c;

    static {
        aj2 aj2Var = aj2.f14536a;
        f21282d = new pg2[]{null, i25.m6630z(aj2Var, new fj0((byte) 12)), i25.m6630z(aj2Var, new fj0((byte) 13))};
    }

    public ie1(pb0 pb0Var, fe1 fe1Var, qd1 qd1Var) {
        this.f21283a = pb0Var;
        this.f21284b = fe1Var;
        this.f21285c = qd1Var;
    }

    /* JADX INFO: renamed from: a */
    public static ie1 m6771a(ie1 ie1Var, pb0 pb0Var, fe1 fe1Var, qd1 qd1Var, int i) {
        if ((i & 1) != 0) {
            pb0Var = ie1Var.f21283a;
        }
        if ((i & 2) != 0) {
            fe1Var = ie1Var.f21284b;
        }
        if ((i & 4) != 0) {
            qd1Var = ie1Var.f21285c;
        }
        ie1Var.getClass();
        return new ie1(pb0Var, fe1Var, qd1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie1)) {
            return false;
        }
        ie1 ie1Var = (ie1) obj;
        return z62.m13387o(this.f21283a, ie1Var.f21283a) && this.f21284b == ie1Var.f21284b && this.f21285c == ie1Var.f21285c;
    }

    public final int hashCode() {
        pb0 pb0Var = this.f21283a;
        int iHashCode = pb0Var == null ? 0 : Long.hashCode(pb0Var.f27503a);
        return this.f21285c.hashCode() + ((this.f21284b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "FeatureTheme(themeColor=" + this.f21283a + ", featureStyle=" + this.f21284b + ", paletteStyle=" + this.f21285c + ")";
    }
}
