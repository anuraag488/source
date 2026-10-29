package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zw1 extends gp2 {

    /* JADX INFO: renamed from: a */
    public int f36424a;

    /* JADX INFO: renamed from: b */
    public int f36425b;

    /* JADX INFO: renamed from: c */
    public yw1 f36426c;

    /* JADX INFO: renamed from: d */
    public xw1 f36427d;

    /* JADX INFO: renamed from: b */
    public static C1283w7 m13829b() {
        C1283w7 c1283w7 = new C1283w7((byte) 12);
        c1283w7.f33126b = null;
        c1283w7.f33127c = null;
        c1283w7.f33128d = null;
        c1283w7.f33129e = yw1.f35564e;
        return c1283w7;
    }

    @Override // p000.t73
    /* JADX INFO: renamed from: a */
    public final boolean mo5593a() {
        return this.f36426c != yw1.f35564e;
    }

    /* JADX INFO: renamed from: c */
    public final int m13830c() {
        int i = this.f36425b;
        yw1 yw1Var = this.f36426c;
        if (yw1Var == yw1.f35564e) {
            return i;
        }
        if (yw1Var == yw1.f35561b) {
            return i + 5;
        }
        if (yw1Var == yw1.f35562c) {
            return i + 5;
        }
        if (yw1Var == yw1.f35563d) {
            return i + 5;
        }
        C1077qn.m9989o("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zw1)) {
            return false;
        }
        zw1 zw1Var = (zw1) obj;
        return zw1Var.f36424a == this.f36424a && zw1Var.m13830c() == m13830c() && zw1Var.f36426c == this.f36426c && zw1Var.f36427d == this.f36427d;
    }

    public final int hashCode() {
        return Objects.hash(zw1.class, Integer.valueOf(this.f36424a), Integer.valueOf(this.f36425b), this.f36426c, this.f36427d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.f36426c);
        sb.append(", hashType: ");
        sb.append(this.f36427d);
        sb.append(", ");
        sb.append(this.f36425b);
        sb.append("-byte tags, and ");
        return c75.m3880l(sb, this.f36424a, "-byte key)");
    }
}
