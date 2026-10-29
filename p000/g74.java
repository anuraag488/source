package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class g74 {

    /* JADX INFO: renamed from: c */
    public static final g74 f19639c;

    /* JADX INFO: renamed from: a */
    public final qs5 f19640a;

    /* JADX INFO: renamed from: b */
    public final qs5 f19641b;

    static {
        pz0 pz0Var = pz0.f28103l;
        f19639c = new g74(pz0Var, pz0Var);
    }

    public g74(qs5 qs5Var, qs5 qs5Var2) {
        this.f19640a = qs5Var;
        this.f19641b = qs5Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g74)) {
            return false;
        }
        g74 g74Var = (g74) obj;
        return this.f19640a.equals(g74Var.f19640a) && this.f19641b.equals(g74Var.f19641b);
    }

    public final int hashCode() {
        return this.f19641b.hashCode() + (this.f19640a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f19640a + ", height=" + this.f19641b + ')';
    }
}
