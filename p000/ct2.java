package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ct2 {

    /* JADX INFO: renamed from: h */
    public static ct2 f16451h;

    /* JADX INFO: renamed from: a */
    public df2 f16452a;

    /* JADX INFO: renamed from: b */
    public xl4 f16453b;

    /* JADX INFO: renamed from: c */
    public ly0 f16454c;

    /* JADX INFO: renamed from: d */
    public am1 f16455d;

    /* JADX INFO: renamed from: e */
    public xl4 f16456e;

    /* JADX INFO: renamed from: f */
    public float f16457f;

    /* JADX INFO: renamed from: g */
    public float f16458g;

    /* JADX INFO: renamed from: a */
    public final long m4167a(int i, long j) {
        int iM7540j;
        ly0 ly0Var = this.f16454c;
        xl4 xl4Var = this.f16456e;
        float f = this.f16458g;
        float f2 = this.f16457f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = dt2.f17369a;
            am1 am1Var = this.f16455d;
            v71 v71Var = v71.f32439a;
            float f3 = kx5.m7704e(zt5.m13773d(str, xl4Var, v71Var, ly0Var, am1Var, v71Var, false), ll0.m8010b(0, 0, 0, 0, 15), 1, 1).f34187e;
            f2 = kx5.m7704e(zt5.m13773d(dt2.f17370b, xl4Var, v71Var, ly0Var, this.f16455d, v71Var, true), ll0.m8010b(0, 0, 0, 0, 15), 2, 1).f34187e - f3;
            this.f16458g = f3;
            this.f16457f = f2;
            f = f3;
        }
        if (i != 1) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            iM7540j = iRound >= 0 ? iRound : 0;
            int iM7538h = kl0.m7538h(j);
            if (iM7540j > iM7538h) {
                iM7540j = iM7538h;
            }
        } else {
            iM7540j = kl0.m7540j(j);
        }
        return ll0.m8009a(kl0.m7541k(j), kl0.m7539i(j), iM7540j, kl0.m7538h(j));
    }
}
