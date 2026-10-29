package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tp3 {

    /* JADX INFO: renamed from: a */
    public final long f31307a;

    /* JADX INFO: renamed from: b */
    public final sp3 f31308b;

    public tp3(long j, sp3 sp3Var) {
        this.f31307a = j;
        this.f31308b = sp3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp3)) {
            return false;
        }
        tp3 tp3Var = (tp3) obj;
        long j = tp3Var.f31307a;
        int i = pb0.f27502i;
        return ws4.m12408a(this.f31307a, j) && z62.m13387o(this.f31308b, tp3Var.f31308b);
    }

    public final int hashCode() {
        int i = pb0.f27502i;
        int iHashCode = Long.hashCode(this.f31307a) * 961;
        sp3 sp3Var = this.f31308b;
        return iHashCode + (sp3Var != null ? sp3Var.hashCode() : 0);
    }

    public final String toString() {
        return "RippleConfiguration(color=" + pb0.m9470i(this.f31307a) + ", focus=null, rippleAlpha=" + this.f31308b + ")";
    }
}
