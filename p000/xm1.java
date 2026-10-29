package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xm1 implements Comparable {

    /* JADX INFO: renamed from: b */
    public static final xm1 f34409b;

    /* JADX INFO: renamed from: c */
    public static final xm1 f34410c;

    /* JADX INFO: renamed from: d */
    public static final xm1 f34411d;

    /* JADX INFO: renamed from: e */
    public static final xm1 f34412e;

    /* JADX INFO: renamed from: f */
    public static final xm1 f34413f;

    /* JADX INFO: renamed from: g */
    public static final xm1 f34414g;

    /* JADX INFO: renamed from: h */
    public static final xm1 f34415h;

    /* JADX INFO: renamed from: i */
    public static final xm1 f34416i;

    /* JADX INFO: renamed from: j */
    public static final xm1 f34417j;

    /* JADX INFO: renamed from: a */
    public final int f34418a;

    static {
        xm1 xm1Var = new xm1(100);
        xm1 xm1Var2 = new xm1(200);
        xm1 xm1Var3 = new xm1(300);
        xm1 xm1Var4 = new xm1(400);
        f34409b = xm1Var4;
        xm1 xm1Var5 = new xm1(500);
        f34410c = xm1Var5;
        xm1 xm1Var6 = new xm1(600);
        f34411d = xm1Var6;
        xm1 xm1Var7 = new xm1(700);
        xm1 xm1Var8 = new xm1(800);
        xm1 xm1Var9 = new xm1(900);
        f34412e = xm1Var3;
        f34413f = xm1Var4;
        f34414g = xm1Var5;
        f34415h = xm1Var6;
        f34416i = xm1Var7;
        f34417j = xm1Var9;
        kx5.m7694Y(xm1Var, xm1Var2, xm1Var3, xm1Var4, xm1Var5, xm1Var6, xm1Var7, xm1Var8, xm1Var9);
    }

    public xm1(int i) {
        this.f34418a = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        r32.m10186a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(xm1 xm1Var) {
        return z62.m13393u(this.f34418a, xm1Var.f34418a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xm1) {
            return this.f34418a == ((xm1) obj).f34418a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34418a;
    }

    public final String toString() {
        return c75.m3878j("FontWeight(weight=", this.f34418a, ")");
    }
}
