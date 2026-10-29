package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s11 {

    /* JADX INFO: renamed from: a */
    public float f29818a;

    /* JADX INFO: renamed from: b */
    public float f29819b;

    /* JADX INFO: renamed from: c */
    public float f29820c;

    /* JADX INFO: renamed from: d */
    public float f29821d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s11)) {
            return false;
        }
        s11 s11Var = (s11) obj;
        return p11.m9352c(this.f29818a, s11Var.f29818a) && p11.m9352c(this.f29819b, s11Var.f29819b) && p11.m9352c(this.f29820c, s11Var.f29820c) && p11.m9352c(this.f29821d, s11Var.f29821d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f29821d) + c75.m3874f(this.f29820c, c75.m3874f(this.f29819b, Float.hashCode(this.f29818a) * 31, 31), 31);
    }

    public final String toString() {
        String strM9353d = p11.m9353d(this.f29818a);
        String strM9353d2 = p11.m9353d(this.f29819b);
        return c75.m3882n(zi4.m13625y("DpRect(left=", strM9353d, ", top=", strM9353d2, ", right="), p11.m9353d(this.f29820c), ", bottom=", p11.m9353d(this.f29821d), ")");
    }
}
