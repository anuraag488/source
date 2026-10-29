package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s44 {

    /* JADX INFO: renamed from: a */
    public final fr3 f29900a;

    /* JADX INFO: renamed from: b */
    public final fr3 f29901b;

    /* JADX INFO: renamed from: c */
    public final fr3 f29902c;

    /* JADX INFO: renamed from: d */
    public final fr3 f29903d;

    /* JADX INFO: renamed from: e */
    public final fr3 f29904e;

    /* JADX INFO: renamed from: f */
    public final fr3 f29905f;

    /* JADX INFO: renamed from: g */
    public final fr3 f29906g;

    /* JADX INFO: renamed from: h */
    public final fr3 f29907h;

    public s44() {
        fr3 fr3Var = q44.f28209a;
        fr3 fr3Var2 = q44.f28210b;
        fr3 fr3Var3 = q44.f28211c;
        fr3 fr3Var4 = q44.f28212d;
        fr3 fr3Var5 = q44.f28214f;
        fr3 fr3Var6 = q44.f28213e;
        fr3 fr3Var7 = q44.f28215g;
        fr3 fr3Var8 = q44.f28216h;
        this.f29900a = fr3Var;
        this.f29901b = fr3Var2;
        this.f29902c = fr3Var3;
        this.f29903d = fr3Var4;
        this.f29904e = fr3Var5;
        this.f29905f = fr3Var6;
        this.f29906g = fr3Var7;
        this.f29907h = fr3Var8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s44)) {
            return false;
        }
        s44 s44Var = (s44) obj;
        return z62.m13387o(this.f29900a, s44Var.f29900a) && z62.m13387o(this.f29901b, s44Var.f29901b) && z62.m13387o(this.f29902c, s44Var.f29902c) && z62.m13387o(this.f29903d, s44Var.f29903d) && z62.m13387o(this.f29904e, s44Var.f29904e) && z62.m13387o(this.f29905f, s44Var.f29905f) && z62.m13387o(this.f29906g, s44Var.f29906g) && z62.m13387o(this.f29907h, s44Var.f29907h);
    }

    public final int hashCode() {
        return this.f29907h.hashCode() + ((this.f29906g.hashCode() + ((this.f29905f.hashCode() + ((this.f29904e.hashCode() + ((this.f29903d.hashCode() + ((this.f29902c.hashCode() + ((this.f29901b.hashCode() + (this.f29900a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f29900a + ", small=" + this.f29901b + ", medium=" + this.f29902c + ", large=" + this.f29903d + ", largeIncreased=" + this.f29905f + ", extraLarge=" + this.f29904e + ", extralargeIncreased=" + this.f29906g + ", extraExtraLarge=" + this.f29907h + ")";
    }
}
