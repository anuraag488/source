package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class v20 implements t20 {

    /* JADX INFO: renamed from: a */
    public fe4 f32324a;

    /* JADX INFO: renamed from: b */
    public long f32325b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v20)) {
            return false;
        }
        v20 v20Var = (v20) obj;
        return z62.m13387o(this.f32324a, v20Var.f32324a) && kl0.m7533c(this.f32325b, v20Var.f32325b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f32325b) + (this.f32324a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f32324a + ", constraints=" + kl0.m7542l(this.f32325b) + ")";
    }
}
