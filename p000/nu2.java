package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nu2 {

    /* JADX INFO: renamed from: a */
    public final long f26093a;

    /* JADX INFO: renamed from: b */
    public final long f26094b;

    /* JADX INFO: renamed from: c */
    public final boolean f26095c;

    public nu2(long j, long j2, boolean z) {
        this.f26093a = j;
        this.f26094b = j2;
        this.f26095c = z;
    }

    /* JADX INFO: renamed from: a */
    public final nu2 m8850a(nu2 nu2Var) {
        return new nu2(b33.m3430h(this.f26093a, nu2Var.f26093a), Math.max(this.f26094b, nu2Var.f26094b), this.f26095c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu2)) {
            return false;
        }
        nu2 nu2Var = (nu2) obj;
        return b33.m3425c(this.f26093a, nu2Var.f26093a) && this.f26094b == nu2Var.f26094b && this.f26095c == nu2Var.f26095c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f26095c) + zi4.m13612l(Long.hashCode(this.f26093a) * 31, this.f26094b, 31);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + b33.m3432j(this.f26093a) + ", timeMillis=" + this.f26094b + ", shouldApplyImmediately=" + this.f26095c + ")";
    }
}
