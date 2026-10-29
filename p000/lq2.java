package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class lq2 {

    /* JADX INFO: renamed from: a */
    public final dc0 f24277a;

    /* JADX INFO: renamed from: b */
    public final js4 f24278b;

    /* JADX INFO: renamed from: c */
    public final s44 f24279c;

    /* JADX INFO: renamed from: d */
    public final lu2 f24280d;

    public lq2(dc0 dc0Var, js4 js4Var, s44 s44Var, lu2 lu2Var) {
        this.f24277a = dc0Var;
        this.f24278b = js4Var;
        this.f24279c = s44Var;
        this.f24280d = lu2Var;
        int i = hg0.f20542a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lq2.class != obj.getClass()) {
            return false;
        }
        lq2 lq2Var = (lq2) obj;
        return z62.m13387o(this.f24277a, lq2Var.f24277a) && z62.m13387o(this.f24278b, lq2Var.f24278b) && z62.m13387o(this.f24279c, lq2Var.f24279c) && z62.m13387o(this.f24280d, lq2Var.f24280d);
    }

    public final int hashCode() {
        return this.f24280d.hashCode() + ((this.f24279c.hashCode() + ((this.f24278b.hashCode() + (this.f24277a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Values(colorScheme=" + this.f24277a + ", typography=" + this.f24278b + ", shapes=" + this.f24279c + ", motionScheme=" + this.f24280d + ")";
    }
}
