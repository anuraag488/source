package p000;

import java.util.Objects;

/* JADX INFO: renamed from: p7 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1024p7 extends gp2 {

    /* JADX INFO: renamed from: a */
    public int f27411a;

    /* JADX INFO: renamed from: b */
    public int f27412b;

    /* JADX INFO: renamed from: c */
    public C0973o7 f27413c;

    /* JADX INFO: renamed from: b */
    public static jp0 m9372b() {
        jp0 jp0Var = new jp0((byte) 3, false);
        jp0Var.f22481b = null;
        jp0Var.f22482c = null;
        jp0Var.f22483d = C0973o7.f26380f;
        return jp0Var;
    }

    @Override // p000.t73
    /* JADX INFO: renamed from: a */
    public final boolean mo5593a() {
        return this.f27413c != C0973o7.f26380f;
    }

    /* JADX INFO: renamed from: c */
    public final int m9373c() {
        int i = this.f27412b;
        C0973o7 c0973o7 = this.f27413c;
        if (c0973o7 == C0973o7.f26380f) {
            return i;
        }
        if (c0973o7 == C0973o7.f26377c) {
            return i + 5;
        }
        if (c0973o7 == C0973o7.f26378d) {
            return i + 5;
        }
        if (c0973o7 == C0973o7.f26379e) {
            return i + 5;
        }
        C1077qn.m9989o("Unknown variant");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1024p7)) {
            return false;
        }
        C1024p7 c1024p7 = (C1024p7) obj;
        return c1024p7.f27411a == this.f27411a && c1024p7.m9373c() == m9373c() && c1024p7.f27413c == this.f27413c;
    }

    public final int hashCode() {
        return Objects.hash(C1024p7.class, Integer.valueOf(this.f27411a), Integer.valueOf(this.f27412b), this.f27413c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.f27413c);
        sb.append(", ");
        sb.append(this.f27412b);
        sb.append("-byte tags, and ");
        return c75.m3880l(sb, this.f27411a, "-byte key)");
    }
}
