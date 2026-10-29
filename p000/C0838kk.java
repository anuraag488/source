package p000;

/* JADX INFO: renamed from: kk */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0838kk {

    /* JADX INFO: renamed from: a */
    public final Object f23186a;

    /* JADX INFO: renamed from: b */
    public final int f23187b;

    /* JADX INFO: renamed from: c */
    public final int f23188c;

    /* JADX INFO: renamed from: d */
    public final String f23189d;

    public C0838kk(Object obj, int i, int i2, String str) {
        this.f23186a = obj;
        this.f23187b = i;
        this.f23188c = i2;
        this.f23189d = str;
        if (i <= i2) {
            return;
        }
        r32.m10186a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0838kk)) {
            return false;
        }
        C0838kk c0838kk = (C0838kk) obj;
        return z62.m13387o(this.f23186a, c0838kk.f23186a) && this.f23187b == c0838kk.f23187b && this.f23188c == c0838kk.f23188c && z62.m13387o(this.f23189d, c0838kk.f23189d);
    }

    public final int hashCode() {
        Object obj = this.f23186a;
        return this.f23189d.hashCode() + zi4.m13609i(this.f23188c, zi4.m13609i(this.f23187b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.f23186a + ", start=" + this.f23187b + ", end=" + this.f23188c + ", tag=" + this.f23189d + ")";
    }

    public C0838kk(int i, int i2, Object obj) {
        this(obj, i, i2, "");
    }
}
