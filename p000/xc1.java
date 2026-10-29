package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xc1 {

    /* JADX INFO: renamed from: a */
    public final float f34148a;

    /* JADX INFO: renamed from: b */
    public final ag1 f34149b;

    public xc1(float f, ag1 ag1Var) {
        this.f34148a = f;
        this.f34149b = ag1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc1)) {
            return false;
        }
        xc1 xc1Var = (xc1) obj;
        return Float.compare(this.f34148a, xc1Var.f34148a) == 0 && z62.m13387o(this.f34149b, xc1Var.f34149b);
    }

    public final int hashCode() {
        return this.f34149b.hashCode() + (Float.hashCode(this.f34148a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f34148a + ", animationSpec=" + this.f34149b + ")";
    }
}
