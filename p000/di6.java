package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class di6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f17088a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ cp6 f17089b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f17090c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ oj6 f17091d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ AbstractC0894m2 f17092e;

    public /* synthetic */ di6(byte b) {
        this.f17088a = b;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f17088a) {
            case 0:
                oj6 oj6Var = this.f17091d;
                s56 s56Var = oj6Var.f26789h;
                if (s56Var != null) {
                    oj6Var.m9145O(s56Var, this.f17090c ? null : (xm6) this.f17092e, this.f17089b);
                    oj6Var.m9139I();
                } else {
                    d76 d76Var = ((oa6) oj6Var.f36084a).f26514f;
                    oa6.m9016l(d76Var);
                    d76Var.f16835j.m12504a("Discarding data. Failed to set user property");
                }
                break;
            case 1:
                oj6 oj6Var2 = this.f17091d;
                s56 s56Var2 = oj6Var2.f26789h;
                if (s56Var2 != null) {
                    oj6Var2.m9145O(s56Var2, this.f17090c ? null : (ys5) this.f17092e, this.f17089b);
                    oj6Var2.m9139I();
                } else {
                    d76 d76Var2 = ((oa6) oj6Var2.f36084a).f26514f;
                    oa6.m9016l(d76Var2);
                    d76Var2.f16835j.m12504a("Discarding data. Failed to send event to service");
                }
                break;
            default:
                oj6 oj6Var3 = this.f17091d;
                s56 s56Var3 = oj6Var3.f26789h;
                if (s56Var3 != null) {
                    oj6Var3.m9145O(s56Var3, this.f17090c ? null : (yo5) this.f17092e, this.f17089b);
                    oj6Var3.m9139I();
                } else {
                    d76 d76Var3 = ((oa6) oj6Var3.f36084a).f26514f;
                    oa6.m9016l(d76Var3);
                    d76Var3.f16835j.m12504a("Discarding data. Failed to send conditional user property to service");
                }
                break;
        }
    }
}
