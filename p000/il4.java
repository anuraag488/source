package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class il4 {

    /* JADX INFO: renamed from: a */
    public final C0875lk f21533a;

    /* JADX INFO: renamed from: b */
    public final xl4 f21534b;

    /* JADX INFO: renamed from: c */
    public final List f21535c;

    /* JADX INFO: renamed from: d */
    public final int f21536d;

    /* JADX INFO: renamed from: e */
    public final boolean f21537e;

    /* JADX INFO: renamed from: f */
    public final int f21538f;

    /* JADX INFO: renamed from: g */
    public final ky0 f21539g;

    /* JADX INFO: renamed from: h */
    public final df2 f21540h;

    /* JADX INFO: renamed from: i */
    public final am1 f21541i;

    /* JADX INFO: renamed from: j */
    public final long f21542j;

    public il4(C0875lk c0875lk, xl4 xl4Var, List list, int i, boolean z, int i2, ky0 ky0Var, df2 df2Var, am1 am1Var, long j) {
        this.f21533a = c0875lk;
        this.f21534b = xl4Var;
        this.f21535c = list;
        this.f21536d = i;
        this.f21537e = z;
        this.f21538f = i2;
        this.f21539g = ky0Var;
        this.f21540h = df2Var;
        this.f21541i = am1Var;
        this.f21542j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il4)) {
            return false;
        }
        il4 il4Var = (il4) obj;
        return z62.m13387o(this.f21533a, il4Var.f21533a) && z62.m13387o(this.f21534b, il4Var.f21534b) && z62.m13387o(this.f21535c, il4Var.f21535c) && this.f21536d == il4Var.f21536d && this.f21537e == il4Var.f21537e && this.f21538f == il4Var.f21538f && z62.m13387o(this.f21539g, il4Var.f21539g) && this.f21540h == il4Var.f21540h && z62.m13387o(this.f21541i, il4Var.f21541i) && kl0.m7533c(this.f21542j, il4Var.f21542j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f21542j) + ((this.f21541i.hashCode() + ((this.f21540h.hashCode() + ((this.f21539g.hashCode() + zi4.m13609i(this.f21538f, zi4.m13611k((((this.f21535c.hashCode() + zi4.m13614n(this.f21534b, this.f21533a.hashCode() * 31, 31)) * 31) + this.f21536d) * 31, 31, this.f21537e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        int i = this.f21538f;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else if (i == 5) {
            str = "MiddleEllipsis";
        } else if (i == 3) {
            str = "Visible";
        } else {
            str = i == 4 ? "StartEllipsis" : "Invalid";
        }
        return "TextLayoutInput(text=" + ((Object) this.f21533a) + ", style=" + this.f21534b + ", placeholders=" + this.f21535c + ", maxLines=" + this.f21536d + ", softWrap=" + this.f21537e + ", overflow=" + str + ", density=" + this.f21539g + ", layoutDirection=" + this.f21540h + ", fontFamilyResolver=" + this.f21541i + ", constraints=" + kl0.m7542l(this.f21542j) + ")";
    }
}
