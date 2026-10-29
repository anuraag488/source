package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fo4 implements yp1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ db3 f19182a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f19183b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ int f19184c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ db3 f19185d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ db3 f19186e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ long f19187f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ int f19188g;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        int iM7539i;
        db3 db3Var = this.f19182a;
        int i = this.f19183b;
        int i2 = this.f19184c;
        db3 db3Var2 = this.f19185d;
        db3 db3Var3 = this.f19186e;
        long j = this.f19187f;
        int i3 = this.f19188g;
        cb3 cb3Var = (cb3) obj;
        cb3.m3944n(cb3Var, db3Var, i, (i2 - db3Var.f16900b) / 2);
        int iMax = Math.max(cb3Var.mo3579U(AbstractC0913ml.f24992a), db3Var.f16899a);
        int i4 = db3Var3.f16899a;
        int i5 = db3Var2.f16899a;
        int iM7539i2 = kl0.m7539i(j);
        df2 df2Var = df2.f17011a;
        float f = (iM7539i2 - i5) / 2.0f;
        df2 df2Var2 = df2.f17011a;
        int iRound = Math.round((1.0f + 0.0f) * f);
        if (iRound >= iMax) {
            if (db3Var2.f16899a + iRound > kl0.m7539i(j) - i4) {
                iM7539i = (kl0.m7539i(j) - i4) - (db3Var2.f16899a + iRound);
            }
            cb3.m3944n(cb3Var, db3Var2, iRound, (i2 - db3Var2.f16900b) / 2);
            cb3.m3944n(cb3Var, db3Var3, (kl0.m7539i(j) - db3Var3.f16899a) - i3, (i2 - db3Var3.f16900b) / 2);
            return ju4.f22634a;
        }
        iM7539i = iMax - iRound;
        iRound += iM7539i + i;
        cb3.m3944n(cb3Var, db3Var2, iRound, (i2 - db3Var2.f16900b) / 2);
        cb3.m3944n(cb3Var, db3Var3, (kl0.m7539i(j) - db3Var3.f16899a) - i3, (i2 - db3Var3.f16900b) / 2);
        return ju4.f22634a;
    }
}
