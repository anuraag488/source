package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class j20 {

    /* JADX INFO: renamed from: a */
    public final int f21957a;

    /* JADX INFO: renamed from: b */
    public final int f21958b;

    /* JADX INFO: renamed from: c */
    public final int f21959c;

    /* JADX INFO: renamed from: d */
    public final int f21960d;

    static {
        new j20(0, 0, 0, 0);
    }

    public j20(int i, int i2, int i3, int i4) {
        this.f21957a = i;
        this.f21958b = i2;
        this.f21959c = i3;
        this.f21960d = i4;
        if (i > i3) {
            C1077qn.m9988n(zi4.m13618r(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        C1077qn.m9988n(zi4.m13618r(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!j20.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        j20 j20Var = (j20) obj;
        return this.f21957a == j20Var.f21957a && this.f21958b == j20Var.f21958b && this.f21959c == j20Var.f21959c && this.f21960d == j20Var.f21960d;
    }

    public final int hashCode() {
        return (((((this.f21957a * 31) + this.f21958b) * 31) + this.f21959c) * 31) + this.f21960d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(j20.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.f21957a);
        sb.append(',');
        sb.append(this.f21958b);
        sb.append(',');
        sb.append(this.f21959c);
        sb.append(',');
        return c75.m3880l(sb, this.f21960d, "] }");
    }
}
