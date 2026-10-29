package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nh1 implements a05 {

    /* JADX INFO: renamed from: a */
    public float f25800a;

    /* JADX INFO: renamed from: b */
    public float f25801b;

    /* JADX INFO: renamed from: c */
    public float f25802c;

    /* JADX INFO: renamed from: d */
    public float f25803d;

    @Override // p000.a05
    /* JADX INFO: renamed from: a */
    public final int mo9a(ky0 ky0Var) {
        return ky0Var.mo3579U(this.f25803d);
    }

    @Override // p000.a05
    /* JADX INFO: renamed from: b */
    public final int mo10b(ky0 ky0Var) {
        return ky0Var.mo3579U(this.f25801b);
    }

    @Override // p000.a05
    /* JADX INFO: renamed from: c */
    public final int mo11c(ky0 ky0Var, df2 df2Var) {
        return ky0Var.mo3579U(this.f25802c);
    }

    @Override // p000.a05
    /* JADX INFO: renamed from: d */
    public final int mo12d(ky0 ky0Var, df2 df2Var) {
        return ky0Var.mo3579U(this.f25800a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh1)) {
            return false;
        }
        nh1 nh1Var = (nh1) obj;
        return p11.m9352c(this.f25800a, nh1Var.f25800a) && p11.m9352c(this.f25801b, nh1Var.f25801b) && p11.m9352c(this.f25802c, nh1Var.f25802c) && p11.m9352c(this.f25803d, nh1Var.f25803d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f25803d) + c75.m3874f(this.f25802c, c75.m3874f(this.f25801b, Float.hashCode(this.f25800a) * 31, 31), 31);
    }

    public final String toString() {
        String strM9353d = p11.m9353d(this.f25800a);
        String strM9353d2 = p11.m9353d(this.f25801b);
        return c75.m3882n(zi4.m13625y("Insets(left=", strM9353d, ", top=", strM9353d2, ", right="), p11.m9353d(this.f25802c), ", bottom=", p11.m9353d(this.f25803d), ")");
    }
}
