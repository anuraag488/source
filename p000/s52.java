package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s52 {

    /* JADX INFO: renamed from: e */
    public static final s52 f29915e = new s52(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f29916a;

    /* JADX INFO: renamed from: b */
    public final int f29917b;

    /* JADX INFO: renamed from: c */
    public final int f29918c;

    /* JADX INFO: renamed from: d */
    public final int f29919d;

    public s52(int i, int i2, int i3, int i4) {
        this.f29916a = i;
        this.f29917b = i2;
        this.f29918c = i3;
        this.f29919d = i4;
    }

    /* JADX INFO: renamed from: a */
    public final long m10525a() {
        return (((long) this.f29916a) << 32) | (((long) this.f29917b) & 4294967295L);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10526b() {
        return this.f29916a >= this.f29918c || this.f29917b >= this.f29919d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s52)) {
            return false;
        }
        s52 s52Var = (s52) obj;
        return this.f29916a == s52Var.f29916a && this.f29917b == s52Var.f29917b && this.f29918c == s52Var.f29918c && this.f29919d == s52Var.f29919d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29919d) + zi4.m13609i(this.f29918c, zi4.m13609i(this.f29917b, Integer.hashCode(this.f29916a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM13624x = zi4.m13624x("IntRect.fromLTRB(", this.f29916a, ", ", this.f29917b, ", ");
        sbM13624x.append(this.f29918c);
        sbM13624x.append(", ");
        sbM13624x.append(this.f29919d);
        sbM13624x.append(")");
        return sbM13624x.toString();
    }
}
