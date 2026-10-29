package p000;

/* JADX INFO: renamed from: ik */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0764ik {

    /* JADX INFO: renamed from: a */
    public final Object f21500a;

    /* JADX INFO: renamed from: b */
    public final int f21501b;

    /* JADX INFO: renamed from: c */
    public final int f21502c;

    /* JADX INFO: renamed from: d */
    public final String f21503d;

    public C0764ik(Object obj, int i, int i2, String str) {
        this.f21500a = obj;
        this.f21501b = i;
        this.f21502c = i2;
        this.f21503d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0764ik)) {
            return false;
        }
        C0764ik c0764ik = (C0764ik) obj;
        return z62.m13387o(this.f21500a, c0764ik.f21500a) && this.f21501b == c0764ik.f21501b && this.f21502c == c0764ik.f21502c && z62.m13387o(this.f21503d, c0764ik.f21503d);
    }

    public final int hashCode() {
        Object obj = this.f21500a;
        return this.f21503d.hashCode() + zi4.m13609i(this.f21502c, zi4.m13609i(this.f21501b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "MutableRange(item=" + this.f21500a + ", start=" + this.f21501b + ", end=" + this.f21502c + ", tag=" + this.f21503d + ")";
    }
}
