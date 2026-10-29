package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xw4 extends vw4 {

    /* JADX INFO: renamed from: a */
    public String f34672a;

    /* JADX INFO: renamed from: b */
    public List f34673b;

    /* JADX INFO: renamed from: c */
    public int f34674c;

    /* JADX INFO: renamed from: d */
    public t30 f34675d;

    /* JADX INFO: renamed from: e */
    public float f34676e;

    /* JADX INFO: renamed from: f */
    public t30 f34677f;

    /* JADX INFO: renamed from: g */
    public float f34678g;

    /* JADX INFO: renamed from: h */
    public float f34679h;

    /* JADX INFO: renamed from: i */
    public int f34680i;

    /* JADX INFO: renamed from: j */
    public int f34681j;

    /* JADX INFO: renamed from: k */
    public float f34682k;

    /* JADX INFO: renamed from: l */
    public float f34683l;

    /* JADX INFO: renamed from: m */
    public float f34684m;

    /* JADX INFO: renamed from: n */
    public float f34685n;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xw4.class == obj.getClass()) {
            xw4 xw4Var = (xw4) obj;
            return z62.m13387o(this.f34672a, xw4Var.f34672a) && z62.m13387o(this.f34675d, xw4Var.f34675d) && this.f34676e == xw4Var.f34676e && z62.m13387o(this.f34677f, xw4Var.f34677f) && this.f34678g == xw4Var.f34678g && this.f34679h == xw4Var.f34679h && this.f34680i == xw4Var.f34680i && this.f34681j == xw4Var.f34681j && this.f34682k == xw4Var.f34682k && this.f34683l == xw4Var.f34683l && this.f34684m == xw4Var.f34684m && this.f34685n == xw4Var.f34685n && this.f34674c == xw4Var.f34674c && z62.m13387o(this.f34673b, xw4Var.f34673b);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f34673b.hashCode() + (this.f34672a.hashCode() * 31)) * 31;
        t30 t30Var = this.f34675d;
        int iM3874f = c75.m3874f(this.f34676e, (iHashCode + (t30Var != null ? t30Var.hashCode() : 0)) * 31, 31);
        t30 t30Var2 = this.f34677f;
        return Integer.hashCode(this.f34674c) + c75.m3874f(this.f34685n, c75.m3874f(this.f34684m, c75.m3874f(this.f34683l, c75.m3874f(this.f34682k, zi4.m13609i(this.f34681j, zi4.m13609i(this.f34680i, c75.m3874f(this.f34679h, c75.m3874f(this.f34678g, (iM3874f + (t30Var2 != null ? t30Var2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
