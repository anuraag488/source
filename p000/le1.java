package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class le1 {

    /* JADX INFO: renamed from: a */
    public fe1 f23975a;

    /* JADX INFO: renamed from: b */
    public qd1 f23976b;

    /* JADX INFO: renamed from: c */
    public long f23977c;

    /* JADX INFO: renamed from: d */
    public long f23978d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le1)) {
            return false;
        }
        le1 le1Var = (le1) obj;
        if (this.f23975a != le1Var.f23975a || this.f23976b != le1Var.f23976b) {
            return false;
        }
        long j = this.f23977c;
        long j2 = le1Var.f23977c;
        int i = pb0.f27502i;
        return ws4.m12408a(j, j2) && ws4.m12408a(this.f23978d, le1Var.f23978d);
    }

    public final int hashCode() {
        int iHashCode = (this.f23976b.hashCode() + (this.f23975a.hashCode() * 31)) * 31;
        long j = this.f23977c;
        int i = pb0.f27502i;
        return Long.hashCode(this.f23978d) + zi4.m13612l(iHashCode, j, 31);
    }

    public final String toString() {
        fe1 fe1Var = this.f23975a;
        qd1 qd1Var = this.f23976b;
        String strM9470i = pb0.m9470i(this.f23977c);
        String strM9470i2 = pb0.m9470i(this.f23978d);
        StringBuilder sb = new StringBuilder("Swatch(featureStyle=");
        sb.append(fe1Var);
        sb.append(", paletteStyle=");
        sb.append(qd1Var);
        sb.append(", container=");
        return c75.m3882n(sb, strM9470i, ", content=", strM9470i2, ")");
    }
}
