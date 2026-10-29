package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fh3 {

    /* JADX INFO: renamed from: a */
    public final float f19000a;

    /* JADX INFO: renamed from: b */
    public final fd1 f19001b;

    public fh3(float f, fd1 fd1Var) {
        this.f19000a = f;
        this.f19001b = fd1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh3)) {
            return false;
        }
        fh3 fh3Var = (fh3) obj;
        return Float.compare(this.f19000a, fh3Var.f19000a) == 0 && z62.m13387o(this.f19001b, fh3Var.f19001b);
    }

    public final int hashCode() {
        return this.f19001b.hashCode() + (Float.hashCode(this.f19000a) * 31);
    }

    public final String toString() {
        return "ProgressableFeature(progress=" + this.f19000a + ", feature=" + this.f19001b + ')';
    }
}
