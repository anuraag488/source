package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y04 {

    /* JADX INFO: renamed from: a */
    public final uu1 f34769a;

    /* JADX INFO: renamed from: b */
    public final long f34770b;

    /* JADX INFO: renamed from: c */
    public final x04 f34771c;

    /* JADX INFO: renamed from: d */
    public final boolean f34772d;

    public y04(uu1 uu1Var, long j, x04 x04Var, boolean z) {
        this.f34769a = uu1Var;
        this.f34770b = j;
        this.f34771c = x04Var;
        this.f34772d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y04)) {
            return false;
        }
        y04 y04Var = (y04) obj;
        return this.f34769a == y04Var.f34769a && b33.m3425c(this.f34770b, y04Var.f34770b) && this.f34771c == y04Var.f34771c && this.f34772d == y04Var.f34772d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34772d) + ((this.f34771c.hashCode() + zi4.m13612l(this.f34769a.hashCode() * 31, this.f34770b, 31)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.f34769a + ", position=" + b33.m3432j(this.f34770b) + ", anchor=" + this.f34771c + ", visible=" + this.f34772d + ")";
    }
}
