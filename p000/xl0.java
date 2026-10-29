package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xl0 {

    /* JADX INFO: renamed from: a */
    public final int f34375a;

    /* JADX INFO: renamed from: b */
    public final long f34376b;

    /* JADX INFO: renamed from: c */
    public final yl0 f34377c;

    /* JADX INFO: renamed from: d */
    public final wd3 f34378d;

    public xl0(int i, long j, yl0 yl0Var, wd3 wd3Var) {
        this.f34375a = i;
        this.f34376b = j;
        this.f34377c = yl0Var;
        this.f34378d = wd3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl0)) {
            return false;
        }
        xl0 xl0Var = (xl0) obj;
        return this.f34375a == xl0Var.f34375a && this.f34376b == xl0Var.f34376b && this.f34377c == xl0Var.f34377c && z62.m13387o(this.f34378d, xl0Var.f34378d);
    }

    public final int hashCode() {
        int iHashCode = (this.f34377c.hashCode() + zi4.m13612l(Integer.hashCode(this.f34375a) * 31, this.f34376b, 31)) * 31;
        wd3 wd3Var = this.f34378d;
        return iHashCode + (wd3Var == null ? 0 : wd3Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.f34375a + ", timestamp=" + this.f34376b + ", type=" + this.f34377c + ", structureCompat=" + this.f34378d + ")";
    }
}
