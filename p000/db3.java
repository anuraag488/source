package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class db3 {

    /* JADX INFO: renamed from: a */
    public int f16899a;

    /* JADX INFO: renamed from: b */
    public int f16900b;

    /* JADX INFO: renamed from: c */
    public long f16901c = 0;

    /* JADX INFO: renamed from: d */
    public long f16902d = eb3.f17952b;

    /* JADX INFO: renamed from: e */
    public long f16903e = 0;

    /* JADX INFO: renamed from: e0 */
    public abstract int mo4419e0(AbstractC0568da abstractC0568da);

    /* JADX INFO: renamed from: i0 */
    public int mo4420i0() {
        return (int) (this.f16901c & 4294967295L);
    }

    /* JADX INFO: renamed from: j0 */
    public int mo4421j0() {
        return (int) (this.f16901c >> 32);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m4422k0() {
        this.f16899a = sc6.m10675p((int) (this.f16901c >> 32), kl0.m7541k(this.f16902d), kl0.m7539i(this.f16902d));
        int iM10675p = sc6.m10675p((int) (this.f16901c & 4294967295L), kl0.m7540j(this.f16902d), kl0.m7538h(this.f16902d));
        this.f16900b = iM10675p;
        int i = this.f16899a;
        long j = this.f16901c;
        this.f16903e = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iM10675p - ((int) (j & 4294967295L))) / 2)));
    }

    /* JADX INFO: renamed from: m */
    public Object mo4423m() {
        return null;
    }

    /* JADX INFO: renamed from: n0 */
    public abstract void mo4424n0(long j, float f, yp1 yp1Var);

    /* JADX INFO: renamed from: p0 */
    public void mo4425p0(long j, float f, bu1 bu1Var) {
        mo4424n0(j, f, null);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m4426q0(long j) {
        if (w52.m12108c(this.f16901c, j)) {
            return;
        }
        this.f16901c = j;
        m4422k0();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m4427r0(long j) {
        if (kl0.m7533c(this.f16902d, j)) {
            return;
        }
        this.f16902d = j;
        m4422k0();
    }
}
