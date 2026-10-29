package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class nm6 {

    /* JADX INFO: renamed from: a */
    public qm6 f25950a;

    /* JADX INFO: renamed from: b */
    public int f25951b;

    /* JADX INFO: renamed from: c */
    public long f25952c;

    /* JADX INFO: renamed from: a */
    public final long m8800a() {
        qm6 qm6Var = this.f25950a;
        y42.m12854a0(qm6Var);
        long jLongValue = ((Long) e56.f17821v.m4379a(null)).longValue();
        long jLongValue2 = ((Long) e56.f17823w.m4379a(null)).longValue();
        for (int i = 1; i < this.f25951b; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        qm6Var.mo9022e().getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
