package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m44 {

    /* JADX INFO: renamed from: d */
    public static final m44 f24642d = new m44(zy5.m13870e(4278190080L), 0, 0.0f);

    /* JADX INFO: renamed from: a */
    public final long f24643a;

    /* JADX INFO: renamed from: b */
    public final long f24644b;

    /* JADX INFO: renamed from: c */
    public final float f24645c;

    public m44(long j, long j2, float f) {
        this.f24643a = j;
        this.f24644b = j2;
        this.f24645c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m44)) {
            return false;
        }
        m44 m44Var = (m44) obj;
        long j = m44Var.f24643a;
        int i = pb0.f27502i;
        return ws4.m12408a(this.f24643a, j) && b33.m3425c(this.f24644b, m44Var.f24644b) && this.f24645c == m44Var.f24645c;
    }

    public final int hashCode() {
        int i = pb0.f27502i;
        return Float.hashCode(this.f24645c) + zi4.m13612l(Long.hashCode(this.f24643a) * 31, this.f24644b, 31);
    }

    public final String toString() {
        StringBuilder sbM13625y = zi4.m13625y("Shadow(color=", pb0.m9470i(this.f24643a), ", offset=", b33.m3432j(this.f24644b), ", blurRadius=");
        sbM13625y.append(this.f24645c);
        sbM13625y.append(")");
        return sbM13625y.toString();
    }
}
