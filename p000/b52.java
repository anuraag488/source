package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b52 implements c52 {

    /* JADX INFO: renamed from: a */
    public long f15086a;

    /* JADX INFO: renamed from: b */
    public int f15087b;

    /* JADX INFO: renamed from: a */
    public synchronized boolean m3454a() {
        return this.f15087b == 0 || System.currentTimeMillis() > this.f15086a;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m3455b(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.f15087b = 0;
            }
            return;
        } else {
            this.f15087b++;
            synchronized (this) {
                this.f15086a = System.currentTimeMillis() + ((i == 429 || (i >= 500 && i < 600)) ? (long) Math.min(Math.pow(2.0d, this.f15087b) + ((long) (Math.random() * 1000.0d)), 1800000.0d) : 86400000L);
            }
            return;
        }
        throw th;
    }

    @Override // p000.c52
    public x42 toInstant() {
        long j = this.f15086a;
        x42 x42Var = x42.f33977c;
        x42 x42Var2 = x42.f33977c;
        if (j >= x42Var2.f33979a) {
            x42 x42Var3 = x42.f33978d;
            if (j <= x42Var3.f33979a) {
                long j2 = this.f15087b;
                long j3 = j2 / 1000000000;
                if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
                    j3--;
                }
                long j4 = j + j3;
                if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
                    return j > 0 ? x42Var3 : x42Var2;
                }
                if (j4 >= -31557014167219200L) {
                    if (j4 <= 31556889864403199L) {
                        long j5 = j2 % 1000000000;
                        return new x42((int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)), j4);
                    }
                }
            }
        }
        throw new z42("The parsed date is outside the range representable by Instant (Unix epoch second " + j + ')');
    }
}
