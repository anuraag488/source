package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class oz3 {

    /* JADX INFO: renamed from: a */
    public final xy3 f27244a;

    /* JADX INFO: renamed from: b */
    public final p44 f27245b;

    /* JADX INFO: renamed from: c */
    public final nz3 f27246c;

    public oz3(xy3 xy3Var, p44 p44Var, nz3 nz3Var) {
        this.f27244a = xy3Var;
        this.f27245b = p44Var;
        this.f27246c = nz3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz3)) {
            return false;
        }
        oz3 oz3Var = (oz3) obj;
        return z62.m13387o(this.f27244a, oz3Var.f27244a) && z62.m13387o(this.f27245b, oz3Var.f27245b) && z62.m13387o(this.f27246c, oz3Var.f27246c);
    }

    public final int hashCode() {
        return this.f27246c.hashCode() + ((this.f27245b.hashCode() + (this.f27244a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SectionStyle(colors=" + this.f27244a + ", shape=" + this.f27245b + ", padding=" + this.f27246c + ")";
    }
}
