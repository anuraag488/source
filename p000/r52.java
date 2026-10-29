package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class r52 extends p52 implements na0 {

    /* JADX INFO: renamed from: d */
    public static final r52 f29026d = new r52(1, 0, 1);

    @Override // p000.p52
    public final boolean equals(Object obj) {
        if (!(obj instanceof r52)) {
            return false;
        }
        if (isEmpty() && ((r52) obj).isEmpty()) {
            return true;
        }
        r52 r52Var = (r52) obj;
        return this.f27382a == r52Var.f27382a && this.f27383b == r52Var.f27383b;
    }

    @Override // p000.p52
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f27382a * 31) + this.f27383b;
    }

    @Override // p000.p52
    public final boolean isEmpty() {
        return this.f27382a > this.f27383b;
    }

    @Override // p000.p52
    public final String toString() {
        return this.f27382a + ".." + this.f27383b;
    }
}
