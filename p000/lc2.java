package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lc2 {

    /* JADX INFO: renamed from: a */
    public final mc2 f23933a;

    /* JADX INFO: renamed from: b */
    public final bs4 f23934b;

    static {
        new lc2(null, null);
    }

    public lc2(mc2 mc2Var, bs4 bs4Var) {
        String str;
        this.f23933a = mc2Var;
        this.f23934b = bs4Var;
        if ((mc2Var == null) == (bs4Var == null)) {
            return;
        }
        if (mc2Var == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + mc2Var + " requires type to be specified.";
        }
        C1077qn.m9988n(str);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc2)) {
            return false;
        }
        lc2 lc2Var = (lc2) obj;
        return this.f23933a == lc2Var.f23933a && z62.m13387o(this.f23934b, lc2Var.f23934b);
    }

    public final int hashCode() {
        mc2 mc2Var = this.f23933a;
        int iHashCode = (mc2Var == null ? 0 : mc2Var.hashCode()) * 31;
        bs4 bs4Var = this.f23934b;
        return iHashCode + (bs4Var != null ? bs4Var.hashCode() : 0);
    }

    public final String toString() {
        mc2 mc2Var = this.f23933a;
        int i = mc2Var == null ? -1 : kc2.f23063a[mc2Var.ordinal()];
        if (i == -1) {
            return "*";
        }
        bs4 bs4Var = this.f23934b;
        if (i == 1) {
            return String.valueOf(bs4Var);
        }
        if (i == 2) {
            return "in " + bs4Var;
        }
        if (i != 3) {
            C0670g.m5864c();
            return null;
        }
        return "out " + bs4Var;
    }
}
