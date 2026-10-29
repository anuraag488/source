package p000;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o41 {

    /* JADX INFO: renamed from: a */
    public String f26320a;

    /* JADX INFO: renamed from: b */
    public yp1 f26321b;

    /* JADX INFO: renamed from: c */
    public yp1 f26322c;

    /* JADX INFO: renamed from: d */
    public boolean f26323d;

    /* JADX INFO: renamed from: e */
    public yp1 f26324e;

    /* JADX INFO: renamed from: f */
    public yp1 f26325f;

    /* JADX INFO: renamed from: g */
    public yp1 f26326g;

    /* JADX INFO: renamed from: h */
    public yp1 f26327h;

    /* JADX INFO: renamed from: i */
    public yp1 f26328i;

    /* JADX INFO: renamed from: j */
    public n41 f26329j;

    /* JADX INFO: renamed from: k */
    public HashMap f26330k;

    /* JADX INFO: renamed from: a */
    public final double m8941a(y41 y41Var) {
        return (y41Var.f34857l == pc0.f27519d ? d24.f16744b : d24.f16743a).mo4465k(this, y41Var);
    }

    /* JADX INFO: renamed from: b */
    public final mq4 m8942b() {
        mq4 mq4Var = new mq4();
        mq4Var.f25141b = this.f26320a;
        mq4Var.f25142c = this.f26321b;
        mq4Var.f25143d = this.f26322c;
        mq4Var.f25140a = this.f26323d;
        mq4Var.f25144e = this.f26324e;
        mq4Var.f25145f = this.f26325f;
        mq4Var.f25146g = this.f26326g;
        mq4Var.f25147h = this.f26327h;
        mq4Var.f25148i = this.f26328i;
        mq4Var.f25149j = this.f26329j;
        return mq4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o41)) {
            return false;
        }
        o41 o41Var = (o41) obj;
        return z62.m13387o(this.f26320a, o41Var.f26320a) && z62.m13387o(this.f26321b, o41Var.f26321b) && this.f26322c.equals(o41Var.f26322c) && this.f26323d == o41Var.f26323d && z62.m13387o(this.f26324e, o41Var.f26324e) && z62.m13387o(this.f26325f, o41Var.f26325f) && z62.m13387o(this.f26326g, o41Var.f26326g) && z62.m13387o(this.f26327h, o41Var.f26327h) && z62.m13387o(this.f26328i, o41Var.f26328i) && z62.m13387o(this.f26329j, o41Var.f26329j);
    }

    public final int hashCode() {
        int iM13611k = zi4.m13611k((this.f26322c.hashCode() + ((this.f26321b.hashCode() + (this.f26320a.hashCode() * 31)) * 31)) * 31, 31, this.f26323d);
        yp1 yp1Var = this.f26324e;
        int iHashCode = (iM13611k + (yp1Var == null ? 0 : yp1Var.hashCode())) * 31;
        yp1 yp1Var2 = this.f26325f;
        int iHashCode2 = (iHashCode + (yp1Var2 == null ? 0 : yp1Var2.hashCode())) * 31;
        yp1 yp1Var3 = this.f26326g;
        int iHashCode3 = (iHashCode2 + (yp1Var3 == null ? 0 : yp1Var3.hashCode())) * 31;
        yp1 yp1Var4 = this.f26327h;
        int iHashCode4 = (iHashCode3 + (yp1Var4 == null ? 0 : yp1Var4.hashCode())) * 31;
        yp1 yp1Var5 = this.f26328i;
        int iHashCode5 = (iHashCode4 + (yp1Var5 == null ? 0 : yp1Var5.hashCode())) * 31;
        n41 n41Var = this.f26329j;
        return iHashCode5 + (n41Var != null ? n41Var.hashCode() : 0);
    }

    public final String toString() {
        return "DynamicColor(name=" + this.f26320a + ", palette=" + this.f26321b + ", tone=" + this.f26322c + ", isBackground=" + this.f26323d + ", chromaMultiplier=" + this.f26324e + ", background=" + this.f26325f + ", secondBackground=" + this.f26326g + ", contrastCurve=" + this.f26327h + ", toneDeltaPair=" + this.f26328i + ", opacity=" + this.f26329j + ")";
    }
}
