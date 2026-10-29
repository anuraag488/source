package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class a61 extends z51 {

    /* JADX INFO: renamed from: d */
    public final long[] f129d;

    /* JADX WARN: Illegal instructions before constructor call */
    public a61(nh3 nh3Var) {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        super(jArr, jArr2, jArr4);
        this.f129d = jArr3;
        jp0 jp0Var = (jp0) nh3Var.f25810b;
        kx5.m7729q0(jArr, (long[]) jp0Var.f22482c, (long[]) jp0Var.f22481b);
        kx5.m7727p0(jArr2, (long[]) jp0Var.f22482c, (long[]) jp0Var.f22481b);
        System.arraycopy((long[]) jp0Var.f22483d, 0, jArr3, 0, 10);
        kx5.m7697a0(jArr4, (long[]) nh3Var.f25811c, c61.f15835b);
    }

    @Override // p000.z51
    /* JADX INFO: renamed from: b */
    public final void mo102b(long[] jArr, long[] jArr2) {
        kx5.m7697a0(jArr, jArr2, this.f129d);
    }
}
